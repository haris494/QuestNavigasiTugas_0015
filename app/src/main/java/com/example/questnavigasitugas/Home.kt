package com.example.questnavigasitugas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

private val NeonBlue = Color(0xFF4F46E5)
private val NeonPurple = Color(0xFF8B5CF6)
private val GradientBg = Brush.verticalGradient(
    listOf(Color(0xFF0A0B1E), Color(0xFF1E1B4B))
)

@Composable
fun Home(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(GradientBg)
            .padding(20.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Judul
            Text(
                text = "Selamat Datang 👋",
                style = MaterialTheme.typography.headlineMedium.copy(
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            )
            Spacer(Modifier.height(6.dp))

            Text(
                text = "Sistem Pendaftaran Peserta",
                style = MaterialTheme.typography.bodyMedium.copy(
                    color = Color(0xFF9CA3AF)
                )
            )

            Spacer(Modifier.height(26.dp))

            // Kartu tengah
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF0F172A)
                ),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {