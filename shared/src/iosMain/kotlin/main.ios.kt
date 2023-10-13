import androidx.compose.ui.window.ComposeUIViewController

actual fun getPlatformName(): String = "iOS"

actual fun getName():String{
    return "Nikhil iphone"
}


fun MainViewController() = ComposeUIViewController { App() }