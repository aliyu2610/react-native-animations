package com.yourproject;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ThemedReactContext;

public class FadeAnimationModule extends SimpleViewManager<View> {

    public static final String REACT_CLASS = "FadeAnimation";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "fadeDuration")
    public void setFadeDuration(View view, int duration) {
        AlphaAnimation fadeIn = new AlphaAnimation(0.0f, 1.0f);
        fadeIn.setDuration(duration);
        view.startAnimation(fadeIn);
    }
}
