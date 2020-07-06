package com.hencoder.hencoderpracticedraw6.practice

import android.content.Context
import android.util.AttributeSet
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
import com.hencoder.hencoderpracticedraw6.R

class Practice02Rotation : RelativeLayout {
    var animateBt: Button? = null
    var imageView: ImageView? = null
    var rotateClick = 0
    var rotateCount = 6

    constructor(context: Context?) : super(context) {}
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {}
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        animateBt = findViewById(R.id.animateBt) as Button
        imageView = findViewById(R.id.imageView) as ImageView
        animateBt!!.setOnClickListener {
            // // TODO 在这里处理点击事件，通过 View.animate().rotation/X/Y() 来让 View 旋转
            when(rotateClick){
                0 -> imageView!!.animate().rotation(180f)
                1 -> imageView!!.animate().rotation(0f)
                2 -> imageView!!.animate().rotationX(180f)
                3 -> imageView!!.animate().rotationX(0f)
                4 -> imageView!!.animate().rotationY(180f)
                5 -> imageView!!.animate().rotationY(0f)
            }
            rotateClick ++
            if (rotateClick == rotateCount){
                rotateClick = 0
            }
        }
    }
}