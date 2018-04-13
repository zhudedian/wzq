package com.zdd.wzq.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.zdd.wzq.R;

/**
 * Created by yd on 2018/4/13.
 */

public class CheckerPieceView extends View {
    private String TAG = "CheckerPieceView";
    private Paint mPaint;
    private int color = 0;
    private boolean isHasPiece = false;
    private int x,y;
    private float radiu = 50;
    private int width,height;
    private int paddingLeft,paddingRight,paddingTop,paddingBottom;

    public CheckerPieceView(Context context,int x,int y){
        this(context, null);
        this.x = x;
        this.y = y;

    }
    public CheckerPieceView(Context context) {
        this(context, null);
    }

    public CheckerPieceView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CheckerPieceView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.Checkerboard);

        typedArray.recycle();
        mPaint = new Paint();
        mPaint.setColor(Color.BLACK);
        mPaint.setAlpha(255);

        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        mPaint.setStrokeWidth(1);
        mPaint.setStrokeCap(Paint.Cap.BUTT);//没有
        mPaint.setStrokeJoin(Paint.Join.BEVEL);//直线

    }
    private void init() {





        paddingLeft = getPaddingLeft();
        paddingRight = getPaddingRight();
        paddingTop = getPaddingTop();
        paddingBottom = getPaddingBottom();

        width = getWidth()-paddingLeft-paddingRight;
        height = getHeight()-paddingTop-paddingBottom;

        if (width<=height){
            radiu = width/2;
        }else {
            radiu = height/2;
        }

    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        init();
//        canvas.translate(paddingLeft+width/2, paddingTop+height/2);
        if (color!=0) {
            mPaint.setColor(color);
            canvas.drawCircle(paddingLeft + width / 2, paddingTop + height / 2, radiu, mPaint);
        }
    }

    public void setColor(int color){
        this.color = color;
        postInvalidate();
    }

    public int getCoX(){
        return x;
    }
    public int getCoY(){
        return y;
    }


}
