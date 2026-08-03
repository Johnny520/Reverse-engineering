package p000;

import android.view.View;

/* JADX INFO: renamed from: hE */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1492hE {
    /* JADX INFO: renamed from: a */
    public static CharSequence m2850a(View r0) {
        return r0.getAccessibilityPaneTitle();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2851b(View r0) {
        return r0.isAccessibilityHeading();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2852c(View r0) {
        return r0.isScreenReaderFocusable();
    }

    /* JADX INFO: renamed from: d */
    public static void m2853d(View r0, boolean r1) {
        r0.setAccessibilityHeading(r1);
    }

    /* JADX INFO: renamed from: e */
    public static void m2854e(View r0, CharSequence r1) {
        r0.setAccessibilityPaneTitle(r1);
    }

    /* JADX INFO: renamed from: f */
    public static void m2855f(View r0, boolean r1) {
        r0.setScreenReaderFocusable(r1);
    }
}
