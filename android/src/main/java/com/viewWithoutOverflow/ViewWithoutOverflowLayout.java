package com.viewWithoutOverflow;

import android.content.Context;
import android.view.ViewGroup;

import com.facebook.react.views.view.ReactViewGroup;

/**
 * Created by boris on 13.02.18.
 */

public class ViewWithoutOverflowLayout extends ReactViewGroup {

    public ViewWithoutOverflowLayout(Context context) {
        super(context);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);

        try {
            ((ViewGroup) getParent()).setClipChildren(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}