package com.example.questnavigasitugas.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

private val NeonBlue   = Color(0xFF4F46E5)
private val NeonPurple = Color(0xFF7C3AED)
private val DarkBg     = Color(0xFF0F172A)

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

        Spacer(Modifier.height(6.dp))

        Text(
            "Total peserta: ${pesertaList.size}",
            style = MaterialTheme.typography.bodyMedium.copy(
                color = Color(0xFF9CA3AF)
            )
        )

        Spacer(Modifier.height(6.dp))

        Text(
            "Total peserta: ${pesertaList.size}",
            style = MaterialTheme.typography.bodyMedium.copy(
                color = Color(0xFF9CA3AF)
            )
        )

        Spacer(Modifier.height(16.dp))

        // Daftar peserta
        LazyColumn(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            items(pesertaList) { peserta ->
                GlowCard(peserta)
            }
        }

        Spacer(Modifier.height(20.dp))


        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            OutlinedButton(
                onClick = { navController.navigate("Home") },
                shape = RoundedCornerShape(10.dp),
                border = BorderStroke(2.dp, NeonBlue),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = NeonBlue
                )
            ) {
                Text("🏠 Beranda")
            }
            Button(
                onClick = { navController.navigate("Formulir") },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = NeonPurple
                )
            ) {
                Text("📝 Formulir")
            }
        }
    }
}

@Composable
fun GlowCard(peserta: Peserta) {
    OutlinedCard(
        modifier = Modifier
            .fillMaxWidth()
            .shadow(6.dp, RoundedCornerShape(16.dp)),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(
            1.dp,
            Brush.horizontalGradient(listOf(NeonBlue, NeonPurple))
        ),
        colors = CardDefaults.cardColors(containerColor = DarkBg)
    ) {
        Column(
            modifier = Modifier
                .padding(18.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = peserta.nama,
                style = MaterialTheme.typography.titleMedium.copy(
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold
                )
            )
            Spacer(Modifier.height(6.dp))
            InfoRow("Jenis Kelamin", peserta.jk)
            InfoRow("Status", peserta.status)
            InfoRow("Alamat", peserta.alamat)
        }
    }
}

@Composable
private fun InfoRow(label: String, value: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            label,
            style = MaterialTheme.typography.bodySmall.copy(
                color = Color(0xFF9CA3AF),
                fontWeight = FontWeight.SemiBold
            )
        )
        Text(
            value,
            style = MaterialTheme.typography.bodySmall.copy(
                color = Color(0xFFE0E7FF)
            )
        )
    }
}







