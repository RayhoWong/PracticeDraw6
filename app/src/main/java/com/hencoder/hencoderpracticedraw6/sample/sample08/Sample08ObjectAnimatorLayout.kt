package com.hencoder.hencoderpracticedraw6.sample.sample08

import android.animation.ObjectAnimator
import android.content.Context
import android.support.v4.view.animation.FastOutSlowInInterpolator
import android.util.AttributeSet
import android.widget.Button
import android.widget.RelativeLayout
import com.hencoder.hencoderpracticedraw6.R

class Sample08ObjectAnimatorLayout : RelativeLayout {
    var view: Sample08ObjectAnimatorView? = null
    var animateBt: Button? = null

    constructor(context: Context?) : super(context) {}
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {}
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        view = findViewById(R.id.objectAnimatorView) as Sample08ObjectAnimatorView
        animateBt = findViewById(R.id.animateBt) as Button
        animateBt!!.setOnClickListener {
            val animator: ObjectAnimator = ObjectAnimator.ofInt(view, "progress", 0, 65)
            animator.duration = 1000
            animator.interpolator = FastOutSlowInInterpolator()
            animator.start()
        }
    }
}