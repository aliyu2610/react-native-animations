import android.view.animation.TranslateAnimation;
import android.view.View;
import android.view.animation.Animation;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;

public class SlideAnimationModule extends SimpleViewManager<View> {
    public static final String REACT_CLASS = "SlideAnimation";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "slideDuration")
    public void setSlideDuration(View view, int duration) {
        TranslateAnimation slide = new TranslateAnimation(-500, 0, 0, 0);
        slide.setDuration(duration);
        view.startAnimation(slide);
    }
}
