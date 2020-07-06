package com.hencoder.hencoderpracticedraw6.practice

import android.content.Context
import android.util.AttributeSet
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
import com.hencoder.hencoderpracticedraw6.R

class Practice04Alpha : RelativeLayout {
    var animateBt: Button? = null
    var imageView: ImageView? = null
    var alphaClick = 0
    var alphaCount = 2

    constructor(context: Context?) : super(context) {}
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {}
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        animateBt = findViewById(R.id.animateBt) as Button
        imageView = findViewById(R.id.imageView) as ImageView
        animateBt!!.setOnClickListener {
            // TODO 在这里处理点击事件，通过 View.animate().alpha() 来改变 View 的透明度
            when(alphaClick){
                0 -> imageView!!.animate().alpha(0f)
                1 -> imageView!!.animate().alpha(1f)
            }
            alphaClick++
            if (alphaClick == alphaCount){
                alphaClick = 0
            }
        }
    }
}