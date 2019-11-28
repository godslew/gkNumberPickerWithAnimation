package com.godslew.gknumberpickerwithanimation

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.NumberPicker


class NumberPicker(
    context: Context?,
    attrs: AttributeSet?
) :
    NumberPicker(context, attrs) {
    override fun addView(child: View) {
        super.addView(child)
        updateView(child)
    }

    override fun addView(
        child: View,
        index: Int,
        params: ViewGroup.LayoutParams
    ) {
        super.addView(child, index, params)
        updateView(child)
    }

    override fun addView(
        child: View,
        params: ViewGroup.LayoutParams
    ) {
        super.addView(child, params)
        updateView(child)
    }

    private fun updateView(view: View) {
        if (view is EditText) {
            view.textSize = 14f
        }
    }
}
