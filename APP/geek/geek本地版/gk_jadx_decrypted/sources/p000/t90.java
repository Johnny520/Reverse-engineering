package p000;

import android.graphics.Paint;
import android.view.Display;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class t90 {
    /* JADX INFO: renamed from: a */
    public static int m2364a() {
        return View.generateViewId();
    }

    /* JADX INFO: renamed from: b */
    public static Display m2365b(View view) {
        return view.getDisplay();
    }

    /* JADX INFO: renamed from: c */
    public static int m2366c(View view) {
        return view.getLabelFor();
    }

    /* JADX INFO: renamed from: d */
    public static int m2367d(View view) {
        return view.getLayoutDirection();
    }

    /* JADX INFO: renamed from: e */
    public static int m2368e(View view) {
        return view.getPaddingEnd();
    }

    /* JADX INFO: renamed from: f */
    public static int m2369f(View view) {
        return view.getPaddingStart();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m2370g(View view) {
        return view.isPaddingRelative();
    }

    /* JADX INFO: renamed from: h */
    public static void m2371h(View view, int i) {
        view.setLabelFor(i);
    }

    /* JADX INFO: renamed from: i */
    public static void m2372i(View view, Paint paint) {
        view.setLayerPaint(paint);
    }

    /* JADX INFO: renamed from: j */
    public static void m2373j(View view, int i) {
        view.setLayoutDirection(i);
    }

    /* JADX INFO: renamed from: k */
    public static void m2374k(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }
}
