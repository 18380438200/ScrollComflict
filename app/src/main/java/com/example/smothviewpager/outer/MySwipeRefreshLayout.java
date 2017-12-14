package com.example.smothviewpager.outer;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/**
 * Created by libo on 2017/12/14.
 */

public class MySwipeRefreshLayout extends SwipeRefreshLayout{
    private float startX;
    private float startY;
    private float mTouchSlop;

    public MySwipeRefreshLayout(Context context) {
        super(context);

        mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public MySwipeRefreshLayout(Context context, AttributeSet attrs) {
        super(context, attrs);

        mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    //外部拦截法

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {

        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                startX = ev.getX();
                startY = ev.getY();
                break;
            case MotionEvent.ACTION_MOVE:
                float distanceX = Math.abs(ev.getX() - startX);
                float distanceY = Math.abs(ev.getY() - startY);
                if(distanceX > mTouchSlop && distanceX > distanceY){  //判断为横向滑动
                    return false;
                }

                break;
        }

        return super.onInterceptTouchEvent(ev);
    }
}
