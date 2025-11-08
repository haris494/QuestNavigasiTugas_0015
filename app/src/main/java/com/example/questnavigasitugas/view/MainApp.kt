import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

private val GradientBg = Brush.verticalGradient(
    listOf(Color(0xFF0A0B1E), Color(0xFF1E1B4B))
)

@Composable
fun MainApp() {
    val navController = rememberNavController()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(GradientBg)
    ) {
        NavHost(
            navController = navController,
            startDestination = "home",
            enterTransition = { fadeIn() },
            exitTransition = { fadeOut() }
        ) {
    }
