package de.lolmerkat.spotify.pictureframe

import java.awt.GraphicsEnvironment
import java.awt.Rectangle
import kotlin.math.roundToInt

object SizeManager {
    private val screenBounds: Rectangle = GraphicsEnvironment.getLocalGraphicsEnvironment().maximumWindowBounds
    val screenWidth: Int = screenBounds.width
    val screenHeight: Int = screenBounds.height

    private val shortScreenSide: Int = if (screenHeight >= screenWidth) screenWidth else screenHeight
    //TODO: LOAD VALUE FROM CONFIG
    private var resizeFactor: Double = 1.0
        set(value) {
            field = if (value > 0) value else 1.0
            windowSideLength = (shortScreenSide * value).roundToInt()
        }

    var windowSideLength: Int = (shortScreenSide * resizeFactor).roundToInt()
}