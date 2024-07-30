import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.juansanz.screenshottest.Greeting
import com.juansanz.screenshottest.ui.theme.ScreenShotTestTheme

class MainActivityScreenShotTest {

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        ScreenShotTestTheme {
            Greeting("Android Now")
        }
    }

}