import android.view.animation.RotateAnimation;
import android.view.View;
import android.view.animation.Animation;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;

public class RotateAnimationModule extends SimpleViewManager<View> {
    public static final String REACT_CLASS = "RotateAnimation";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "rotationDuration")
    public void setRotationDuration(View view, int duration) {
        RotateAnimation rotate = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(duration);
        view.startAnimation(rotate);
    }
}
