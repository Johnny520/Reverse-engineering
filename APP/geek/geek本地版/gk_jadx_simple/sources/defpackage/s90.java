package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeProvider;

/* JADX INFO: loaded from: classes.dex */
public abstract class s90 {
    public static AccessibilityNodeProvider a(View r0) {
        return r0.getAccessibilityNodeProvider();
    }

    public static boolean b(View r0) {
        return r0.getFitsSystemWindows();
    }

    public static int c(View r0) {
        return r0.getImportantForAccessibility();
    }

    public static int d(View r0) {
        return r0.getMinimumHeight();
    }

    public static int e(View r0) {
        return r0.getMinimumWidth();
    }

    public static ViewParent f(View r0) {
        return r0.getParentForAccessibility();
    }

    public static int g(View r0) {
        return r0.getWindowSystemUiVisibility();
    }

    public static boolean h(View r0) {
        return r0.hasOverlappingRendering();
    }

    public static boolean i(View r0) {
        return r0.hasTransientState();
    }

    public static boolean j(View r0, int r1, Bundle r2) {
        return r0.performAccessibilityAction(r1, r2);
    }

    public static void k(View r0) {
        r0.postInvalidateOnAnimation();
    }

    public static void l(View r0, int r1, int r2, int r3, int r4) {
        r0.postInvalidateOnAnimation(r1, r2, r3, r4);
    }

    public static void m(View r0, Runnable r1) {
        r0.postOnAnimation(r1);
    }

    public static void n(View r0, Runnable r1, long r2) {
        r0.postOnAnimationDelayed(r1, r2);
    }

    public static void o(ViewTreeObserver r0, ViewTreeObserver.OnGlobalLayoutListener r1) {
        r0.removeOnGlobalLayoutListener(r1);
    }

    public static void p(View r0) {
        r0.requestFitSystemWindows();
    }

    public static void q(View r0, Drawable r1) {
        r0.setBackground(r1);
    }

    public static void r(View r0, boolean r1) {
        r0.setHasTransientState(r1);
    }

    public static void s(View r0, int r1) {
        r0.setImportantForAccessibility(r1);
    }
}
