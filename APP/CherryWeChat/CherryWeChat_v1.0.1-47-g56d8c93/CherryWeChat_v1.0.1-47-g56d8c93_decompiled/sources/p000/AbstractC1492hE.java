package p000;

import android.view.View;

/* JADX INFO: renamed from: hE */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1492hE {
    /* JADX INFO: renamed from: a */
    public static CharSequence m2850a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2851b(View view) {
        return view.isAccessibilityHeading();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2852c(View view) {
        return view.isScreenReaderFocusable();
    }

    /* JADX INFO: renamed from: d */
    public static void m2853d(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    /* JADX INFO: renamed from: e */
    public static void m2854e(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    /* JADX INFO: renamed from: f */
    public static void m2855f(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }
}
