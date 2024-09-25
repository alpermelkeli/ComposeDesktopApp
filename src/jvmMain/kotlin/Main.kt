
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import navigation.MainNavContainer

@Composable
fun App() {
    MainNavContainer("home")
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
