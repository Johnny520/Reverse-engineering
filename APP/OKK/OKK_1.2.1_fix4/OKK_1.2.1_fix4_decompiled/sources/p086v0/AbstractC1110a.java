package p086v0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;

/* JADX INFO: renamed from: v0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1110a {

    /* JADX INFO: renamed from: a */
    public static final int[] f4270a = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: a */
    public static ColorStateList m2618a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(f4270a, 0));
        }
        return colorStateList;
    }
}
