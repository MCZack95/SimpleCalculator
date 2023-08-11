import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }

    MaterialTheme {
        Column(modifier = Modifier.fillMaxSize().padding(0.dp, 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = {
                text = "Hello, Desktop!"
            }) {
                Text(text)
            }
            Button(onClick = {
                text = "Hello, World!"
            }) {
                Text("Reset")
            }
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "Simple Calculator") {
        App()
    }
}
