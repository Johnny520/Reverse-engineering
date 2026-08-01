package defpackage;

import android.graphics.Paint;
import android.view.Display;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class t90 {
    public static int a() {
        return View.generateViewId();
    }

    public static Display b(View r0) {
        return r0.getDisplay();
    }

    public static int c(View r0) {
        return r0.getLabelFor();
    }

    public static int d(View r0) {
        return r0.getLayoutDirection();
    }

    public static int e(View r0) {
        return r0.getPaddingEnd();
    }

    public static int f(View r0) {
        return r0.getPaddingStart();
    }

    public static boolean g(View r0) {
        return r0.isPaddingRelative();
    }

    public static void h(View r0, int r1) {
        r0.setLabelFor(r1);
    }

    public static void i(View r0, Paint r1) {
        r0.setLayerPaint(r1);
    }

    public static void j(View r0, int r1) {
        r0.setLayoutDirection(r1);
    }

    public static void k(View r0, int r1, int r2, int r3, int r4) {
        r0.setPaddingRelative(r1, r2, r3, r4);
    }
}
