package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class r60 {
    public static final ThreadLocal a = null;
    public static final int[] b = null;
    public static final int[] c = null;
    public static final int[] d = null;
    public static final int[] e = null;
    public static final int[] f = null;
    public static final int[] g = null;

    static {
        a = new ThreadLocal();
        b = new int[]{-16842910};
        c = new int[]{R.attr.state_focused};
        d = new int[]{R.attr.state_pressed};
        e = new int[]{R.attr.state_checked};
        f = new int[0];
        g = new int[1];
    }

    public static void a(View r3, Context r4) {
        TypedArray r42 = r4.obtainStyledAttributes(xy.j);
    L7:
        th = move-exception;
        r42.recycle();
        throw th;
    L4:
        if (r42.hasValue(117) == true) goto L9;
        Log.e("ThemeUtils", "View " + r3.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");     // Catch: Throwable -> L7
    L9:
        r42.recycle();
    }

    public static int b(Context r4, int r5) {
        ColorStateList r0 = d(r4, r5);
        if (r0 != null) goto L5;
    L8:
        ThreadLocal r02 = a;
        TypedValue r1 = (TypedValue) r02.get();
        if (r1 != null) goto L11;
        r1 = new TypedValue();
        r02.set(r1);
    L11:
        r4.getTheme().resolveAttribute(R.attr.disabledAlpha, r1, true);
        float r03 = r1.getFloat();
        return ib.d(c(r4, r5), Math.round(Color.alpha(r4) * r03));
    L5:
        if (r0.isStateful() == false) goto L8;
        return r0.getColorForState(b, r0.getDefaultColor());
    }

    public static int c(Context r2, int r3) {
        int[] r0 = g;
        r0[0] = r3;
        TypedArray r22 = r2.obtainStyledAttributes(null, r0);
        int r32 = r22.getColor(0, 0);     // Catch: Throwable -> L6
        r22.recycle();
        return r32;
    L6:
        th = move-exception;
        r22.recycle();
        throw th;
    }

    public static ColorStateList d(Context r2, int r3) {
        int[] r0 = g;
        r0[0] = r3;
        TypedArray r32 = r2.obtainStyledAttributes(null, r0);
    L13:
        th = move-exception;
        r32.recycle();
        throw th;
    L4:
        if (r32.hasValue(0) == false) goto L10;
        int r02 = r32.getResourceId(0, 0);     // Catch: Throwable -> L13
        if (r02 == 0) goto L10;
        ColorStateList r22 = ip.v(r2, r02);     // Catch: Throwable -> L13
        if (r22 == null) goto L10;
    L11:
        r32.recycle();
        return r22;
    L10:
        r22 = r32.getColorStateList(0);     // Catch: Throwable -> L13
        goto L11
    }
}
