package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class t90 {
    public static int a() {
            int r0 = android.view.View.generateViewId()
            return r0
    }

    public static android.view.Display b(android.view.View r0) {
            android.view.Display r0 = r0.getDisplay()
            return r0
    }

    public static int c(android.view.View r0) {
            int r0 = r0.getLabelFor()
            return r0
    }

    public static int d(android.view.View r0) {
            int r0 = r0.getLayoutDirection()
            return r0
    }

    public static int e(android.view.View r0) {
            int r0 = r0.getPaddingEnd()
            return r0
    }

    public static int f(android.view.View r0) {
            int r0 = r0.getPaddingStart()
            return r0
    }

    public static boolean g(android.view.View r0) {
            boolean r0 = r0.isPaddingRelative()
            return r0
    }

    public static void h(android.view.View r0, int r1) {
            r0.setLabelFor(r1)
            return
    }

    public static void i(android.view.View r0, android.graphics.Paint r1) {
            r0.setLayerPaint(r1)
            return
    }

    public static void j(android.view.View r0, int r1) {
            r0.setLayoutDirection(r1)
            return
    }

    public static void k(android.view.View r0, int r1, int r2, int r3, int r4) {
            r0.setPaddingRelative(r1, r2, r3, r4)
            return
    }
}
