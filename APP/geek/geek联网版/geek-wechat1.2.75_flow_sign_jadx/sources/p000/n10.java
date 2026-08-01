package p000;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class n10 {

    /* JADX INFO: renamed from: a */
    public static final int[] f3204a = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: b */
    public static final String f3205b = n10.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    public static ColorStateList m1909a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f3204a, 0)) != 0) {
            Log.w(f3205b, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1910b(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
