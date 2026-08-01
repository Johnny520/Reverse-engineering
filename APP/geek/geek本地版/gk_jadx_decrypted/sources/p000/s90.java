package p000;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeProvider;

/* JADX INFO: loaded from: classes.dex */
public abstract class s90 {
    /* JADX INFO: renamed from: a */
    public static AccessibilityNodeProvider m2309a(View view) {
        return view.getAccessibilityNodeProvider();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2310b(View view) {
        return view.getFitsSystemWindows();
    }

    /* JADX INFO: renamed from: c */
    public static int m2311c(View view) {
        return view.getImportantForAccessibility();
    }

    /* JADX INFO: renamed from: d */
    public static int m2312d(View view) {
        return view.getMinimumHeight();
    }

    /* JADX INFO: renamed from: e */
    public static int m2313e(View view) {
        return view.getMinimumWidth();
    }

    /* JADX INFO: renamed from: f */
    public static ViewParent m2314f(View view) {
        return view.getParentForAccessibility();
    }

    /* JADX INFO: renamed from: g */
    public static int m2315g(View view) {
        return view.getWindowSystemUiVisibility();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2316h(View view) {
        return view.hasOverlappingRendering();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m2317i(View view) {
        return view.hasTransientState();
    }

    /* JADX INFO: renamed from: j */
    public static boolean m2318j(View view, int i, Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    /* JADX INFO: renamed from: k */
    public static void m2319k(View view) {
        view.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: l */
    public static void m2320l(View view, int i, int i2, int i3, int i4) {
        view.postInvalidateOnAnimation(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: m */
    public static void m2321m(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* JADX INFO: renamed from: n */
    public static void m2322n(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    /* JADX INFO: renamed from: o */
    public static void m2323o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    /* JADX INFO: renamed from: p */
    public static void m2324p(View view) {
        view.requestFitSystemWindows();
    }

    /* JADX INFO: renamed from: q */
    public static void m2325q(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* JADX INFO: renamed from: r */
    public static void m2326r(View view, boolean z) {
        view.setHasTransientState(z);
    }

    /* JADX INFO: renamed from: s */
    public static void m2327s(View view, int i) {
        view.setImportantForAccessibility(i);
    }
}
