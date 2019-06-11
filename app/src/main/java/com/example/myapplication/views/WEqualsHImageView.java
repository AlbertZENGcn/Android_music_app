package com.example.myapplication.views;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;
//AppCompatImageView
public class WEqualsHImageView extends android.support.v7.widget.AppCompatImageView {

    public WEqualsHImageView(Context context) {
        super(context);
    }

    public WEqualsHImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public WEqualsHImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    protected void onMeasure(int widthMeasureSpec,int heightMeasureSpec)
    {
        //super.onMeasure(widthMeasureSpec,heightMeasureSpec);
        super.onMeasure(widthMeasureSpec,widthMeasureSpec);//都是宽度

        //get view width
        //int width= MeasureSpec.getSize(widthMeasureSpec);
        //get view mode
        //MeasureSpec.getMode(widthMeasureSpec);
        //match_parent,wrap_Content,具体dp
        //int mode =MeasureSpec.getMode(widthMeasureSpec);
    }
}
