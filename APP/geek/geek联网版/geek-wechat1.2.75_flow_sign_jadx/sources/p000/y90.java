package p000;

import android.graphics.Paint;
import android.view.Display;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class y90 {
    /* JADX INFO: renamed from: a */
    public static int m2729a() {
        return View.generateViewId();
    }

    /* JADX INFO: renamed from: b */
    public static Display m2730b(View view) {
        return view.getDisplay();
    }

    /* JADX INFO: renamed from: c */
    public static int m2731c(View view) {
        return view.getLabelFor();
    }

    /* JADX INFO: renamed from: d */
    public static int m2732d(View view) {
        return view.getLayoutDirection();
    }

    /* JADX INFO: renamed from: e */
    public static int m2733e(View view) {
        return view.getPaddingEnd();
    }

    /* JADX INFO: renamed from: f */
    public static int m2734f(View view) {
        return view.getPaddingStart();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m2735g(View view) {
        return view.isPaddingRelative();
    }

    /* JADX INFO: renamed from: h */
    public static void m2736h(View view, int i) {
        view.setLabelFor(i);
    }

    /* JADX INFO: renamed from: i */
    public static void m2737i(View view, Paint paint) {
        view.setLayerPaint(paint);
    }

    /* JADX INFO: renamed from: j */
    public static void m2738j(View view, int i) {
        view.setLayoutDirection(i);
    }

    /* JADX INFO: renamed from: k */
    public static void m2739k(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }
}
