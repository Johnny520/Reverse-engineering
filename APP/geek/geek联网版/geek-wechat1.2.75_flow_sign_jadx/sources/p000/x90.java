package p000;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeProvider;

/* JADX INFO: loaded from: classes.dex */
public abstract class x90 {
    /* JADX INFO: renamed from: a */
    public static AccessibilityNodeProvider m2653a(View view) {
        return view.getAccessibilityNodeProvider();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2654b(View view) {
        return view.getFitsSystemWindows();
    }

    /* JADX INFO: renamed from: c */
    public static int m2655c(View view) {
        return view.getImportantForAccessibility();
    }

    /* JADX INFO: renamed from: d */
    public static int m2656d(View view) {
        return view.getMinimumHeight();
    }

    /* JADX INFO: renamed from: e */
    public static int m2657e(View view) {
        return view.getMinimumWidth();
    }

    /* JADX INFO: renamed from: f */
    public static ViewParent m2658f(View view) {
        return view.getParentForAccessibility();
    }

    /* JADX INFO: renamed from: g */
    public static int m2659g(View view) {
        return view.getWindowSystemUiVisibility();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m2660h(View view) {
        return view.hasOverlappingRendering();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m2661i(View view) {
        return view.hasTransientState();
    }

    /* JADX INFO: renamed from: j */
    public static boolean m2662j(View view, int i, Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    /* JADX INFO: renamed from: k */
    public static void m2663k(View view) {
        view.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: l */
    public static void m2664l(View view, int i, int i2, int i3, int i4) {
        view.postInvalidateOnAnimation(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: m */
    public static void m2665m(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* JADX INFO: renamed from: n */
    public static void m2666n(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    /* JADX INFO: renamed from: o */
    public static void m2667o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    /* JADX INFO: renamed from: p */
    public static void m2668p(View view) {
        view.requestFitSystemWindows();
    }

    /* JADX INFO: renamed from: q */
    public static void m2669q(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* JADX INFO: renamed from: r */
    public static void m2670r(View view, boolean z) {
        view.setHasTransientState(z);
    }

    /* JADX INFO: renamed from: s */
    public static void m2671s(View view, int i) {
        view.setImportantForAccessibility(i);
    }
}
