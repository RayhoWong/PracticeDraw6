package com.hencoder.hencoderpracticedraw6.practice

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.widget.Button
import android.widget.ImageView
import com.hencoder.hencoderpracticedraw6.R

class Practice05MultiProperties : ConstraintLayout {
    var animateBt: Button? = null
    var imageView: ImageView? = null
    var animated = false

    constructor(context: Context?) : super(context) {}
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {}
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        animateBt = findViewById(R.id.animateBt) as Button
        imageView = findViewById(R.id.imageView) as ImageView
        imageView!!.scaleX = 0f
        imageView!!.scaleY = 0f
        imageView!!.alpha = 0f
        animateBt!!.setOnClickListener {
            // TODO 在这里处理点击事件，同时对多个属性做动画
            if (!animated){
                imageView?.let {
                    it.animate().translationX(500f)
                    it.animate().rotation(360f)
                    it.animate().scaleX(1f)
                    it.animate().scaleY(1f)
                    it.animate().alpha(1f)
                }
            }else{
                imageView?.let {
                    it.animate().translationX(0f)
                    it.animate().rotation(0f)
                    it.animate().scaleX(0f)
                    it.animate().scaleY(0f)
                    it.animate().alpha(0f)
                }
            }
            animated = !animated
        }
    }
}