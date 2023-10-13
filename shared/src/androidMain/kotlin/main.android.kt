import androidx.compose.runtime.Composable

actual fun getPlatformName(): String = "Android"

actual fun getName():String{
    return "Nikhil Samsung phone"
}


@Composable fun MainView() = App()
