package com.hencoder.hencoderpracticedraw6.sample

import android.content.Context
import android.util.AttributeSet
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
import com.hencoder.hencoderpracticedraw6.R

class Sample04Alpha : RelativeLayout {
    var animateBt: Button? = null
    var imageView: ImageView? = null
    var state = 0

    constructor(context: Context?) : super(context) {}
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {}
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        animateBt = findViewById(R.id.animateBt) as Button
        imageView = findViewById(R.id.imageView) as ImageView
        animateBt!!.setOnClickListener {
            when (state) {
                0 -> imageView!!.animate().alpha(0f)
                1 -> imageView!!.animate().alpha(1f)
            }
            state++
            if (state == 2) {
                state = 0
            }
        }
    }
}