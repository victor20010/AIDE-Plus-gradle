package com.richpath.util

import android.content.Context
import android.graphics.Color

object Utils {
    internal fun dpToPixel(context: Context, dp: Float): Float {
        return dp * context.resources.displayMetrics.density
    }

    internal fun getDimenFromString(value: String): Float {
        val end = if (value[value.length - 3] == 'd') 3 else 2
        return value.substring(0, value.length - end).toFloat()
    }

    internal fun getColorFromString(value: String): Int {
        var color = Color.TRANSPARENT
        when (value.length) {
            7, 9 -> {
                color = Color.parseColor(value)
            }
            4 -> {
                color = Color.parseColor("#"
                        + value[1]
                        + value[1]
                        + value[2]
                        + value[2]
                        + value[3]
                        + value[3])
            }
            2 -> {
                color = Color.parseColor("#"
                        + value[1]
                        + value[1]
                        + value[1]
                        + value[1]
                        + value[1]
                        + value[1]
                        + value[1]
                        + value[1])
            }
        }
        return color
    }
}