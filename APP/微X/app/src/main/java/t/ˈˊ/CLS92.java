// Decompiled by JEB v5.42.0.202606242140

package t.ˈˊ;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

public final class CLS92 {
    public static int MTH1727(Context context0, float f) {
        return Math.round(f * context0.getResources().getDisplayMetrics().density);
    }

    public static Animation MTH1728(String s) {
        TranslateAnimation translateAnimation0;
        AlphaAnimation alphaAnimation0;
        Animation animation0;
        OvershootInterpolator overshootInterpolator0;
        switch(s) {
            case "fab_scale_down": {
                animation0 = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                overshootInterpolator0 = new AccelerateInterpolator();
                animation0.setInterpolator(overshootInterpolator0);
                animation0.setDuration(200L);
                return animation0;
            }
            case "fab_scale_up": {
                animation0 = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
                overshootInterpolator0 = new OvershootInterpolator();
                animation0.setInterpolator(overshootInterpolator0);
                animation0.setDuration(200L);
                return animation0;
            }
            case "fab_slide_in_from_left": {
                animation0 = new AnimationSet(true);
                animation0.setInterpolator(new OvershootInterpolator());
                alphaAnimation0 = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation0.setDuration(300L);
                translateAnimation0 = new TranslateAnimation(2, -0.15f, 2, 0.0f, 1, 0.0f, 1, 0.0f);
                break;
            }
            case "fab_slide_in_from_right": {
                animation0 = new AnimationSet(true);
                animation0.setInterpolator(new OvershootInterpolator());
                alphaAnimation0 = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation0.setDuration(300L);
                translateAnimation0 = new TranslateAnimation(2, 0.15f, 2, 0.0f, 1, 0.0f, 1, 0.0f);
                break;
            }
            case "fab_slide_out_to_left": {
                animation0 = new AnimationSet(true);
                animation0.setInterpolator(new AccelerateInterpolator());
                alphaAnimation0 = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation0.setDuration(150L);
                translateAnimation0 = new TranslateAnimation(2, 0.0f, 2, -0.3f, 1, 0.0f, 1, 0.0f);
                break;
            }
            case "fab_slide_out_to_right": {
                animation0 = new AnimationSet(true);
                animation0.setInterpolator(new AccelerateInterpolator());
                alphaAnimation0 = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation0.setDuration(150L);
                translateAnimation0 = new TranslateAnimation(2, 0.0f, 2, 0.3f, 1, 0.0f, 1, 0.0f);
                break;
            }
            default: {
                return null;
            }
        }
        translateAnimation0.setDuration(200L);
        ((AnimationSet)animation0).addAnimation(alphaAnimation0);
        ((AnimationSet)animation0).addAnimation(translateAnimation0);
        return animation0;
    }

    public static boolean MTH1729() {
        return Build.VERSION.SDK_INT >= 21;
    }
}

