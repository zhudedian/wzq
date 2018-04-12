package com.zdd.wzq.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by yd on 2018/4/12.
 */

public class CheckerboardView extends View {
    private Paint mPaint;
    private int strokeWidth = 5;
    private int width,height;
    private int padding,paddingLeft,paddingRight,paddingTop,paddingBottom;


    public CheckerboardView(Context context) {
        this(context, null);
    }

    public CheckerboardView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CheckerboardView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private CheckerboardView init() {
        mPaint = new Paint();
        mPaint.setColor(Color.BLACK);
        mPaint.setAlpha(255);

        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        mPaint.setStrokeWidth(strokeWidth);
        mPaint.setStrokeCap(Paint.Cap.BUTT);//没有
        mPaint.setStrokeJoin(Paint.Join.BEVEL);//直线



        width = getWidth();
        height = getHeight();
        paddingLeft = getPaddingLeft();
        paddingRight = getPaddingRight();
        paddingTop = getPaddingTop();
        paddingBottom = getPaddingBottom();

        return this;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        init();
        canvas.translate((width-paddingLeft-paddingRight) / 2+paddingLeft, (height-paddingTop-paddingBottom) / 2+paddingTop);
        mPaint.setStyle(Paint.Style.STROKE);//设置画笔的样式
        mPaint.setStrokeCap(Paint.Cap.BUTT);//圆形
        mPaint.setStrokeJoin(Paint.Join.ROUND);//圆弧
        Path path1 = new Path();
        path1.moveTo(-(width-paddingLeft-paddingRight)/ 2+strokeWidth/2, -(height-paddingTop-paddingBottom)  / 2+strokeWidth/2);
        path1.lineTo((width-paddingLeft-paddingRight)/ 2-strokeWidth/2, -(height-paddingTop-paddingBottom)  / 2+strokeWidth/2);
        path1.lineTo((width-paddingLeft-paddingRight)/ 2-strokeWidth/2, (height-paddingTop-paddingBottom)  / 2-strokeWidth/2);
        path1.lineTo(-(width-paddingLeft-paddingRight)/ 2+strokeWidth/2, (height-paddingTop-paddingBottom)  / 2-strokeWidth/2);
        path1.close();
        canvas.drawPath(path1, mPaint);

        init();

        // x轴
        canvas.drawLine(-(width-paddingLeft-paddingRight)/ 2, 0, (width-paddingLeft-paddingRight) / 2, 0, mPaint);
        // y轴
        canvas.drawLine(0, -(height-paddingTop-paddingBottom)  / 2, 0, (height-paddingTop-paddingBottom)  / 2, mPaint);
    }
}