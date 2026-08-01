package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class v90 {
    public static int a(android.view.View r0) {
            int r0 = r0.getAccessibilityLiveRegion()
            return r0
    }

    public static boolean b(android.view.View r0) {
            boolean r0 = r0.isAttachedToWindow()
            return r0
    }

    public static boolean c(android.view.View r0) {
            boolean r0 = r0.isLaidOut()
            return r0
    }

    public static boolean d(android.view.View r0) {
            boolean r0 = r0.isLayoutDirectionResolved()
            return r0
    }

    public static void e(android.view.ViewParent r0, android.view.View r1, android.view.View r2, int r3) {
            r0.notifySubtreeAccessibilityStateChanged(r1, r2, r3)
            return
    }

    public static void f(android.view.View r0, int r1) {
            r0.setAccessibilityLiveRegion(r1)
            return
    }

    public static void g(android.view.accessibility.AccessibilityEvent r0, int r1) {
            r0.setContentChangeTypes(r1)
            return
    }
}
