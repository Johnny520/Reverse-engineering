package p086v0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;

/* JADX INFO: renamed from: v0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1110a {

    /* JADX INFO: renamed from: a */
    public static final int[] f4270a = null;

    static {
        f4270a = new int[]{R.attr.state_enabled, R.attr.state_pressed};
    }

    /* JADX INFO: renamed from: a */
    public static ColorStateList m2618a(ColorStateList r3) {
        if (r3 == null) goto L11;
        if (Build.VERSION.SDK_INT <= 27) goto L7;
    L9:
        return r3;
    L7:
        if (Color.alpha(r3.getDefaultColor()) != 0) goto L9;
        Color.alpha(r3.getColorForState(f4270a, 0));
        goto L9
    L11:
        return ColorStateList.valueOf(0);
    }
}
