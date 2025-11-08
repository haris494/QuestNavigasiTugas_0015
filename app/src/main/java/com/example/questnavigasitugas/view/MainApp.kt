package com.example.questnavigasitugas.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

private val NeonBlue   = Color(0xFF4F46E5)
private val NeonPurple = Color(0xFF7C3AED)

data class Peserta(
    val nama: String,
    val jk: String,
    val status: String,
    val alamat: String
)

@Composable
fun TampilData(navController: NavController) {
    val pesertaList = listOf(
        Peserta("Aditia Rahman", "Laki-laki", "Belum Menikah", "Sleman"),
        Peserta("Bagus Saputra", "Laki-laki", "Belum Menikah", "Yogyakarta"),
        Peserta("Nadya Amalia", "Perempuan", "Belum Menikah", "Bantul")
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    listOf(Color(0xFF030712), Color(0xFF1E1B4B))
                )
            )
            .padding(16.dp)
    ) {
        Text(
            "📋 Data Peserta",
            style = MaterialTheme.typography.headlineSmall.copy(
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        )
    }