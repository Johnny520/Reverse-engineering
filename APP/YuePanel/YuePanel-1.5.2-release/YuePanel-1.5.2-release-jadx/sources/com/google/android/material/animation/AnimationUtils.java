package com.google.android.material.animation;

import Yue.C4789;
import Yue.C4790;
import Yue.C5713;
import Yue.InterfaceC7144;
import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class AnimationUtils {
    public static final TimeInterpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    public static final TimeInterpolator FAST_OUT_SLOW_IN_INTERPOLATOR = new C4790();
    public static final TimeInterpolator FAST_OUT_LINEAR_IN_INTERPOLATOR = new C4789();
    public static final TimeInterpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR = new C5713();
    public static final TimeInterpolator DECELERATE_INTERPOLATOR = new DecelerateInterpolator();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float lerp(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static int lerp(int i, int i2, float f) {
        return i + Math.round(f * (i2 - i));
    }

    public static float lerp(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : lerp(f, f2, (f5 - f3) / (f4 - f3));
    }
}
