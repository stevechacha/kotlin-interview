package tz.co.asoft.interview

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "interview",
    ) {
        App()
    }
}