package com.hencoder.hencoderpracticedraw6.practice

import android.content.Context
import android.util.AttributeSet
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
import com.hencoder.hencoderpracticedraw6.R

class Practice03Scale : RelativeLayout {
    var animateBt: Button? = null
    var imageView: ImageView? = null
    var scaleClick = 0
    var scaleCount = 4

    constructor(context: Context?) : super(context) {}
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {}
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        animateBt = findViewById(R.id.animateBt) as Button
        imageView = findViewById(R.id.imageView) as ImageView
        animateBt!!.setOnClickListener {
            // TODO 在这里处理点击事件，通过 View.animate().scaleX/Y() 来让 View 放缩
            when(scaleClick){
                0 -> imageView!!.animate().scaleX(1.5f)
                1 -> imageView!!.animate().scaleX(1f)
                2 -> imageView!!.animate().scaleY(0.5f)
                3 -> imageView!!.animate().scaleY(1f)
            }
            scaleClick++
            if (scaleClick == scaleCount){
                scaleClick = 0
            }
        }
    }
}