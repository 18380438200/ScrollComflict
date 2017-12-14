package com.example.smothviewpager.iner;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by libo on 2017/12/14.
 */

public class OuterViewPager extends ViewPager{

    public OuterViewPager(Context context) {
        super(context);
    }

    public OuterViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if(ev.getAction() == MotionEvent.ACTION_DOWN){
            return false;
        }else{
            return true;
        }
    }
}
