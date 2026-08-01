package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class z90 {
    public static defpackage.wc0 a(android.view.View r2) {
            android.view.WindowInsets r0 = r2.getRootWindowInsets()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            wc0 r0 = defpackage.wc0.g(r1, r0)
            tc0 r1 = r0.a
            r1.p(r0)
            android.view.View r2 = r2.getRootView()
            r1.d(r2)
            return r0
    }

    public static int b(android.view.View r0) {
            int r0 = r0.getScrollIndicators()
            return r0
    }

    public static void c(android.view.View r0, int r1) {
            r0.setScrollIndicators(r1)
            return
    }

    public static void d(android.view.View r0, int r1, int r2) {
            r0.setScrollIndicators(r1, r2)
            return
    }
}
