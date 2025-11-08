package com.example.questnavigasitugas.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

private val NeonBlue = Color(0xFF4F46E5)
private val NeonPurple = Color(0xFF8B5CF6)
private val DarkBg = Color(0xFF0F172A)

@Composable
fun Formulir(navController: NavController) {
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }

    val JK_Option = listOf("Laki-laki", "Perempuan")
    var selectedJK by remember { mutableStateOf(JK_Option[0]) }

    val SP_Option = listOf("Menikah", "Belum Menikah", "Duda/Janda")
    var selectedSP by remember { mutableStateOf(SP_Option[0]) }

    var showDialog by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    listOf(Color(0xFF0A0B1E), Color(0xFF1E1B4B))
                )
            )
            .padding(16.dp)
    ) {
