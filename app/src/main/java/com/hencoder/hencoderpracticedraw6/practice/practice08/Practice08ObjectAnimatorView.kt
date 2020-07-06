package com.hencoder.hencoderpracticedraw6.practice.practice08

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View
import com.hencoder.hencoderpracticedraw6.Utils.dpToPixel

class Practice08ObjectAnimatorView : View {
    val paintArc = Paint(Paint.ANTI_ALIAS_FLAG)
    val paintText = Paint(Paint.ANTI_ALIAS_FLAG)
    val arcRectF = RectF()
    val radius = dpToPixel(80f)


    // TODO 为 progress 添加 getter 和 setter 方法（setter 方法记得加 invalidate()）
    var progress = 0
    set(value) {
        field = value
        invalidate()
    }

    constructor(context: Context?) : super(context) {}
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {}
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    public override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val centerX = width / 2
        val centerY = height / 2
        arcRectF.left = centerX.toFloat() - radius
        arcRectF.top = centerY.toFloat() - radius
        arcRectF.right = centerX.toFloat() + radius
        arcRectF.bottom = centerY.toFloat() + radius

        canvas.drawArc(arcRectF, 135f, progress * 2.7f, false, paintArc)
        canvas.drawText("$progress%", centerX.toFloat(), centerY - (paintText.ascent() + paintText.descent()) / 2, paintText)
    }

    init {
        paintArc.style = Paint.Style.STROKE
        paintArc.strokeWidth = dpToPixel(15f)
        paintArc.strokeCap = Paint.Cap.ROUND
        paintArc.color = Color.parseColor("#E91E63")

        paintText.textSize = dpToPixel(40f)
        paintText.style = Paint.Style.FILL
        paintText.color = Color.WHITE
        paintText.textAlign = Paint.Align.CENTER
    }
}