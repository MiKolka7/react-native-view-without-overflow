package com.viewWithoutOverflow;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;

/**
 * Created by boris on 13.02.18.
 */

public class ViewWithoutOverflowManager extends ViewGroupManager<ViewWithoutOverflowLayout> {

    @Override
    protected ViewWithoutOverflowLayout createViewInstance(ThemedReactContext reactContext) {
        return new ViewWithoutOverflowLayout(reactContext);
    }

    @Override
    public String getName() {
        return "ViewWithoutOverflow";
    }

}
