package com.anvo.myapplication.behavior;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/11/7.
 */

public class BottomViewBehavior extends CoordinatorLayout.Behavior<View> {
    public BottomViewBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, View child, View dependency) {
        return super.layoutDependsOn(parent, child, dependency);
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, View child, View dependency) {
        float translationY = Math.abs(dependency.getTop());
        child.setTranslationY(translationY);

        return  true;
    }
}
