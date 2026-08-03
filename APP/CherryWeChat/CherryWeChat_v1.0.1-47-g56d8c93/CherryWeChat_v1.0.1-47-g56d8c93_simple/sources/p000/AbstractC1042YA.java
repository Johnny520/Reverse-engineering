package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: renamed from: YA */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1042YA {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f3324a = null;

    /* JADX INFO: renamed from: b */
    public static final int[] f3325b = null;

    /* JADX INFO: renamed from: c */
    public static final int[] f3326c = null;

    /* JADX INFO: renamed from: d */
    public static final int[] f3327d = null;

    /* JADX INFO: renamed from: e */
    public static final int[] f3328e = null;

    /* JADX INFO: renamed from: f */
    public static final int[] f3329f = null;

    /* JADX INFO: renamed from: g */
    public static final int[] f3330g = null;

    static {
        f3324a = new ThreadLocal();
        f3325b = new int[]{-16842910};
        f3326c = new int[]{R.attr.state_focused};
        f3327d = new int[]{R.attr.state_pressed};
        f3328e = new int[]{R.attr.state_checked};
        f3329f = new int[0];
        f3330g = new int[1];
    }

    /* JADX INFO: renamed from: a */
    public static void m1987a(Context r1, View r2) {
        TypedArray r12 = r1.obtainStyledAttributes(AbstractC0982Wu.f3075j);
    L7:
        th = move-exception;
        r12.recycle();
        throw th;
    L4:
        if (r12.hasValue(117) == true) goto L9;
        r2.getClass().toString();     // Catch: Throwable -> L7
    L9:
        r12.recycle();
    }

    /* JADX INFO: renamed from: b */
    public static int m1988b(Context r4, int r5) {
        ColorStateList r0 = m1990d(r4, r5);
        if (r0 != null) goto L5;
    L8:
        ThreadLocal r02 = f3324a;
        TypedValue r1 = (TypedValue) r02.get();
        if (r1 != null) goto L11;
        r1 = new TypedValue();
        r02.set(r1);
    L11:
        r4.getTheme().resolveAttribute(R.attr.disabledAlpha, r1, true);
        float r03 = r1.getFloat();
        return AbstractC2797za.m5367e(m1989c(r4, r5), Math.round(Color.alpha(r4) * r03));
    L5:
        if (r0.isStateful() == false) goto L8;
        return r0.getColorForState(f3325b, r0.getDefaultColor());
    }

    /* JADX INFO: renamed from: c */
    public static int m1989c(Context r2, int r3) {
        int[] r0 = f3330g;
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

    /* JADX INFO: renamed from: d */
    public static ColorStateList m1990d(Context r2, int r3) {
        int[] r0 = f3330g;
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
        ColorStateList r22 = AbstractC0295Gu.m622o(r2, r02);     // Catch: Throwable -> L13
        if (r22 == null) goto L10;
    L11:
        r32.recycle();
        return r22;
    L10:
        r22 = r32.getColorStateList(0);     // Catch: Throwable -> L13
        goto L11
    }
}
