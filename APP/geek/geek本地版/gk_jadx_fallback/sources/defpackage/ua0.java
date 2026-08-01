package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ua0 {
    public static boolean a(android.view.ViewParent r0, android.view.View r1, float r2, float r3, boolean r4) {
            boolean r0 = r0.onNestedFling(r1, r2, r3, r4)
            return r0
    }

    public static boolean b(android.view.ViewParent r0, android.view.View r1, float r2, float r3) {
            boolean r0 = r0.onNestedPreFling(r1, r2, r3)
            return r0
    }

    public static void c(android.view.ViewParent r0, android.view.View r1, int r2, int r3, int[] r4) {
            r0.onNestedPreScroll(r1, r2, r3, r4)
            return
    }

    public static void d(android.view.ViewParent r0, android.view.View r1, int r2, int r3, int r4, int r5) {
            r0.onNestedScroll(r1, r2, r3, r4, r5)
            return
    }

    public static void e(android.view.ViewParent r0, android.view.View r1, android.view.View r2, int r3) {
            r0.onNestedScrollAccepted(r1, r2, r3)
            return
    }

    public static boolean f(android.view.ViewParent r0, android.view.View r1, android.view.View r2, int r3) {
            boolean r0 = r0.onStartNestedScroll(r1, r2, r3)
            return r0
    }

    public static void g(android.view.ViewParent r0, android.view.View r1) {
            r0.onStopNestedScroll(r1)
            return
    }
}
