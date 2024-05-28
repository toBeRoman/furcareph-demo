package com.tobyrodinroman.furcareph.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val Orange200 = Color(0xFFDB7222)
private val Orange500 = Color(0xFFDD6D18)
private val Orange700 = Color(0xFFDC5F00)
private val Teal200 = Color(0xFF03DAC5)

private val DarkColorPalette = darkColors(
    primary = Orange200,
    primaryVariant = Orange700,
    secondary = Teal200
)

private val LightColorPalette = lightColors(
    primary = Orange500,
    primaryVariant = Orange700,
    secondary = Teal200
)

@Composable
fun FurCarePHTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
