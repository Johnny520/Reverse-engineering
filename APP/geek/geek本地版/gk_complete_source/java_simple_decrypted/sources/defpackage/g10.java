package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class g10 {
    public static final int[] a = null;
    public static final String b = null;

    static {
        a = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        b = g10.class.getSimpleName();
    }

    public static ColorStateList a(ColorStateList r3) {
        if (r3 == null) goto L13;
        if (Build.VERSION.SDK_INT <= 27) goto L7;
    L11:
        return r3;
    L7:
        if (Color.alpha(r3.getDefaultColor()) != 0) goto L11;
        if (Color.alpha(r3.getColorForState(a, 0)) == 0) goto L11;
        Log.w(b, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        goto L11
    L13:
        return ColorStateList.valueOf(0);
    }

    public static boolean b(int[] r8) {
        int r0 = r8.length;
        int r2 = 0;
        boolean r3 = false;
        boolean r4 = false;
    L4:
        if (r2 >= r0) goto L18;
        int r6 = r8[r2];
        if (r6 != 16842910) goto L9;
        r3 = true;
    L17:
        r2 = r2 + 1;
        goto L4
    L9:
        if (r6 != 16842908) goto L12;
    L10:
        r4 = true;
        goto L17
    L12:
        if (r6 == 16842919) goto L10;
        if (r6 != 16843623) goto L17;
    L18:
        if (r3 == false) goto L21;
        if (r4 == false) goto L21;
        return true;
    L21:
        return false;
    }
}
