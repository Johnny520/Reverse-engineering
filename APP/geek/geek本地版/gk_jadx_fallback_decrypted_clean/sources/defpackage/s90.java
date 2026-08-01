package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class s90 {
    public static android.view.accessibility.AccessibilityNodeProvider a(android.view.View r0) {
            android.view.accessibility.AccessibilityNodeProvider r0 = r0.getAccessibilityNodeProvider()
            return r0
    }

    public static boolean b(android.view.View r0) {
            boolean r0 = r0.getFitsSystemWindows()
            return r0
    }

    public static int c(android.view.View r0) {
            int r0 = r0.getImportantForAccessibility()
            return r0
    }

    public static int d(android.view.View r0) {
            int r0 = r0.getMinimumHeight()
            return r0
    }

    public static int e(android.view.View r0) {
            int r0 = r0.getMinimumWidth()
            return r0
    }

    public static android.view.ViewParent f(android.view.View r0) {
            android.view.ViewParent r0 = r0.getParentForAccessibility()
            return r0
    }

    public static int g(android.view.View r0) {
            int r0 = r0.getWindowSystemUiVisibility()
            return r0
    }

    public static boolean h(android.view.View r0) {
            boolean r0 = r0.hasOverlappingRendering()
            return r0
    }

    public static boolean i(android.view.View r0) {
            boolean r0 = r0.hasTransientState()
            return r0
    }

    public static boolean j(android.view.View r0, int r1, android.os.Bundle r2) {
            boolean r0 = r0.performAccessibilityAction(r1, r2)
            return r0
    }

    public static void k(android.view.View r0) {
            r0.postInvalidateOnAnimation()
            return
    }

    public static void l(android.view.View r0, int r1, int r2, int r3, int r4) {
            r0.postInvalidateOnAnimation(r1, r2, r3, r4)
            return
    }

    public static void m(android.view.View r0, java.lang.Runnable r1) {
            r0.postOnAnimation(r1)
            return
    }

    public static void n(android.view.View r0, java.lang.Runnable r1, long r2) {
            r0.postOnAnimationDelayed(r1, r2)
            return
    }

    public static void o(android.view.ViewTreeObserver r0, android.view.ViewTreeObserver.OnGlobalLayoutListener r1) {
            r0.removeOnGlobalLayoutListener(r1)
            return
    }

    public static void p(android.view.View r0) {
            r0.requestFitSystemWindows()
            return
    }

    public static void q(android.view.View r0, android.graphics.drawable.Drawable r1) {
            r0.setBackground(r1)
            return
    }

    public static void r(android.view.View r0, boolean r1) {
            r0.setHasTransientState(r1)
            return
    }

    public static void s(android.view.View r0, int r1) {
            r0.setImportantForAccessibility(r1)
            return
    }
}
