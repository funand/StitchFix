package com.example.minicheckout.core

import android.content.Context
import androidx.constraintlayout.widget.ConstraintLayout
import android.util.AttributeSet

open class BaseView : ConstraintLayout {
    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )
}