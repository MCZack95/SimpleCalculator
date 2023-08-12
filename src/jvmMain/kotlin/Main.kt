import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application


val specialOps: Set<String> = setOf("+", "-", "x", "/")

@Composable
@Preview
fun App() {
    var text by remember { mutableStateOf("Press any key to begin...") }

    MaterialTheme {
        Column(modifier = Modifier.fillMaxSize().padding(10.dp, 10.dp, 10.dp, 10.dp),
            horizontalAlignment = Alignment.Start) {
            Row(modifier = Modifier.fillMaxWidth().padding(5.dp, 5.dp),
                verticalAlignment = Alignment.Top) {
                TextField(
                    value = text,
                    onValueChange = { text = it },
                    label = { Text("Output") },
                    modifier = Modifier.padding(10.dp, 10.dp, 10.dp, 0.dp),
                    readOnly = true
                )
                Button(
                    modifier = Modifier.padding(0.dp, 10.dp, 0.dp, 0.dp).height(55.dp),
                    onClick = {
                    text = "Press any key to begin..."
                }) {
                    Text("CLEAR")
                }
            }
            Row(modifier = Modifier.fillMaxWidth().padding(5.dp, 5.dp),
                verticalAlignment = Alignment.CenterVertically) {
                Column(modifier = Modifier.padding(10.dp, 10.dp, 10.dp, 10.dp)) {
                    Button(onClick = {
                        if (text == "Press any key to begin..." || text.contains("Error")) {
                            text = "1"
                        }
                        else {
                            text += "1"
                        }
                    }) {
                        Text("1")
                    }
                }
                Column(modifier = Modifier.padding(10.dp, 10.dp, 10.dp, 10.dp)) {
                    Button(onClick = {
                        if (text == "Press any key to begin..." || text.contains("Error")) {
                            text = "2"
                        }
                        else {
                            text += "2"
                        }
                    }) {
                        Text("2")
                    }
                }
                Column(modifier = Modifier.padding(10.dp, 10.dp, 10.dp, 10.dp)) {
                    Button(onClick = {
                        if (text == "Press any key to begin..." || text.contains("Error")) {
                            text = "3"
                        }
                        else {
                            text += "3"
                        }
                    }) {
                        Text("3")
                    }
                }
                Column(modifier = Modifier.padding(10.dp, 10.dp, 10.dp, 10.dp)) {
                    Button(onClick = {
                        if (text != "Press any key to begin..." || !text.contains("Error")) {
                            if (!specialOps.contains(text.last().toString())) {
                                if ("^[~.0-9]+[+-x/][.0-9]+".toRegex().matches(text)) {
                                    text = calculate(text) + "+"
                                }
                                else {
                                    text += "+"
                                }
                            }
                        }
                    }) {
                        Text("+", fontWeight = FontWeight.Bold)
                    }
                }
            }
            Row(modifier = Modifier.fillMaxWidth().padding(5.dp, 5.dp),
                verticalAlignment = Alignment.CenterVertically) {
                Column(modifier = Modifier.padding(10.dp, 10.dp, 10.dp, 10.dp)) {
                    Button(onClick = {
                        if (text == "Press any key to begin..." || text.contains("Error")) {
                            text = "4"
                        }
                        else {
                            text += "4"
                        }
                    }) {
                        Text("4")
                    }
                }
                Column(modifier = Modifier.padding(10.dp, 10.dp, 10.dp, 10.dp)) {
                    Button(onClick = {
                        if (text == "Press any key to begin..." || text.contains("Error")) {
                            text = "5"
                        }
                        else {
                            text += "5"
                        }
                    }) {
                        Text("5")
                    }
                }
                Column(modifier = Modifier.padding(10.dp, 10.dp, 10.dp, 10.dp)) {
                    Button(onClick = {
                        if (text == "Press any key to begin..." || text.contains("Error")) {
                            text = "6"
                        }
                        else {
                            text += "6"
                        }
                    }) {
                        Text("6")
                    }
                }
                Column(modifier = Modifier.padding(10.dp, 10.dp, 10.dp, 10.dp)) {
                    Button(onClick = {
                        if (text != "Press any key to begin..." || !text.contains("Error")) {
                            if (!specialOps.contains(text.last().toString())) {
                                if ("^[~.0-9]+[+-x/][.0-9]+".toRegex().matches(text)) {
                                    text = calculate(text) + "-"
                                }
                                else {
                                    text += "-"
                                }
                            }
                        }
                    }) {
                        Text("-", fontWeight = FontWeight.Bold)
                    }
                }
            }
            Row(modifier = Modifier.fillMaxWidth().padding(5.dp, 5.dp),
                verticalAlignment = Alignment.CenterVertically) {
                Column(modifier = Modifier.padding(10.dp, 10.dp, 10.dp, 10.dp)) {
                    Button(onClick = {
                        if (text == "Press any key to begin..." || text.contains("Error")) {
                            text = "7"
                        }
                        else {
                            text += "7"
                        }
                    }) {
                        Text("7")
                    }
                }
                Column(modifier = Modifier.padding(10.dp, 10.dp, 10.dp, 10.dp)) {
                    Button(onClick = {
                        if (text == "Press any key to begin..." || text.contains("Error")) {
                            text = "8"
                        }
                        else {
                            text += "8"
                        }
                    }) {
                        Text("8")
                    }
                }
                Column(modifier = Modifier.padding(10.dp, 10.dp, 10.dp, 10.dp)) {
                    Button(onClick = {
                        if (text == "Press any key to begin..." || text.contains("Error")) {
                            text = "9"
                        }
                        else {
                            text += "9"
                        }
                    }) {
                        Text("9")
                    }
                }
                Column(modifier = Modifier.padding(10.dp, 10.dp, 10.dp, 10.dp)) {
                    Button(onClick = {
                        if (text != "Press any key to begin..." || !text.contains("Error")) {
                            if (!specialOps.contains(text.last().toString())) {
                                if ("^[~.0-9]+[+-x/][.0-9]+".toRegex().matches(text)) {
                                    text = calculate(text) + "x"
                                }
                                else {
                                    text += "x"
                                }
                            }
                        }
                    }) {
                        Text("x", fontWeight = FontWeight.Bold)
                    }
                }
            }
            Row(modifier = Modifier.fillMaxWidth().padding(5.dp, 5.dp),
                verticalAlignment = Alignment.CenterVertically) {
                Column(modifier = Modifier.padding(10.dp, 10.dp, 10.dp, 10.dp)) {
                    Button(onClick = {
                        if (!specialOps.contains(text.last().toString()) || !text.contains("Error"))
                            text = performNegation(text)
                    }) {
                        Text("+/-")
                    }
                }
                Column(modifier = Modifier.padding(10.dp, 10.dp, 10.dp, 10.dp)) {
                    Button(onClick = {
                        if (text == "Press any key to begin..." || text.contains("Error")) {
                            text = "0"
                        }
                        else {
                            text += "0"
                        }
                    }) {
                        Text("0")
                    }
                }
                Column(modifier = Modifier.padding(10.dp, 10.dp, 10.dp, 10.dp)) {
                    Button(onClick = {
                        text = addDot(text)
                    }) {
                        Text(".")
                    }
                }
                Column(modifier = Modifier.padding(10.dp, 10.dp, 10.dp, 10.dp)) {
                    Button(onClick = {
                        if (text != "Press any key to begin..." || !text.contains("Error")) {
                            if (!specialOps.contains(text.last().toString())) {
                                if ("^[~.0-9]+[+-x/][.0-9]+".toRegex().matches(text)) {
                                    text = calculate(text) + "/"
                                }
                                else {
                                    text += "/"
                                }
                            }
                        }
                    }) {
                        Text("/", fontWeight = FontWeight.Bold)
                    }
                }

                Button(modifier = Modifier.padding(10.dp, 0.dp, 10.dp, 10.dp).height(51.dp).width(80.dp).align(Alignment.Top),
                    onClick = {
                        if (text != "Press any key to begin..." || !text.contains("Error")) {
                            if (!specialOps.contains(text.last().toString())) {
                                if (text.last().toString() == ".") {
                                    text += "0"
                                }
                                text = calculate(text)
                            }
                        }
                    }) {
                    Text("=", fontWeight = FontWeight.ExtraBold)
                }
            }
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "Simple Calculator") {
        App()
    }
}

fun addDot(mainEqn: String): String
{
    return if (specialOps.contains(mainEqn.last().toString())) {
        mainEqn + "0."
    } else {
        val myList = mainEqn.split("+", "-", "x", "/")
        if (myList.size == 2 && !(myList[1].contains("."))) {
            "$mainEqn."
        } else if (myList.size == 1 && !(myList[0].contains("."))) {
            "$mainEqn."
        } else {
            mainEqn
        }
    }
}

fun calculate(mainEqn: String): String
{
    val isDouble = (mainEqn.contains('.') || mainEqn.contains('/'))

    val numArr = mainEqn.split("+", "-", "x", "/")
    val num = if (mainEqn.contains('+')) {
        parseNegation(numArr[0]).toDouble() + parseNegation(numArr[1]).toDouble()
    } else if (mainEqn.contains('-')) {
        parseNegation(numArr[0]).toDouble() - parseNegation(numArr[1]).toDouble()
    } else if (mainEqn.contains('x')) {
        parseNegation(numArr[0]).toDouble() * parseNegation(numArr[1]).toDouble()
    } else if (mainEqn.contains('/')) {
        if (parseNegation(numArr[1]).toDouble() == 0.0) {
            return "Divide by Zero Error"
        } else {
            parseNegation(numArr[0]).toDouble() / parseNegation(numArr[1]).toDouble()
        }
    } else {
        parseNegation(mainEqn).toDouble()
    }

    return if (isDouble) {
        num.toString().replace("-", "~")
    } else {
        num.toInt().toString().replace("-", "~")
    }
}

fun parseNegation(numStr: String): String
{
    return if (numStr.contains("~")) {
        "-${numStr.substring(1, numStr.length)}"
    }
    else {
        numStr
    }
}

fun performNegation(numStr: String): String
{
    val myList = numStr.split("+", "-", "x", "/")
    if (myList.size == 2) {
        if (myList.last().contains("~")) {
            for (i in numStr.indices) {
                if (specialOps.contains(numStr[i].toString())) {
                    return numStr.substring(0, i + 1) + numStr.substring(i + 2, numStr.length)
                }
            }
        } else {
            for (i in numStr.indices) {
                if (specialOps.contains(numStr[i].toString())) {
                    return numStr.substring(0, i + 1) + "~" + numStr.substring(i + 1, numStr.length)
                }
            }
        }
    } else if (myList.size == 1) {
        return if (myList[0].contains("~")) {
            numStr.substring(1, numStr.length)
        } else {
            "~$numStr"
        }
    }
    return numStr
}
