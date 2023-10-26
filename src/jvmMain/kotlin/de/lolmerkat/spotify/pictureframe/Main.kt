package de.lolmerkat.spotify.pictureframe

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Composable
@Preview
fun App() {
    MaterialTheme {
        Surface (
            modifier = Modifier.fillMaxSize()
        ) {}
    }
}

fun main() = application {
    var windowSideLength = mutableStateOf(SizeManager.windowSideLength)
    val windowState = rememberWindowState(
        width = windowSideLength.value.dp,
        height = windowSideLength.value.dp)

    Window (
        onCloseRequest = ::exitApplication,
        state = windowState,

    ) {

    }
}
