package com.godslew.gknumberpickerwithanimation

import android.util.Log
import android.widget.NumberPicker

fun NumberPicker.animateChange(isIncrement: Boolean) {
        try {
            javaClass.getDeclaredMethod("changeValueByOne", Boolean::class.javaPrimitiveType).also { function ->
                function.isAccessible = true
                function.invoke(this, isIncrement)
            }
        }
        catch (e: Exception) {
            Log.e(javaClass.simpleName, e.message ?: "")
        }
}
