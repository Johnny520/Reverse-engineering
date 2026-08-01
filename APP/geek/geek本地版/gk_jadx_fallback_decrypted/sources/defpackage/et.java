package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class et {
    public static int a(android.view.ViewGroup.MarginLayoutParams r0) {
            int r0 = r0.getLayoutDirection()
            return r0
    }

    public static int b(android.view.ViewGroup.MarginLayoutParams r0) {
            int r0 = r0.getMarginEnd()
            return r0
    }

    public static int c(android.view.ViewGroup.MarginLayoutParams r0) {
            int r0 = r0.getMarginStart()
            return r0
    }

    public static boolean d(android.view.ViewGroup.MarginLayoutParams r0) {
            boolean r0 = r0.isMarginRelative()
            return r0
    }

    public static void e(android.view.ViewGroup.MarginLayoutParams r0, int r1) {
            r0.resolveLayoutDirection(r1)
            return
    }

    public static void f(android.view.ViewGroup.MarginLayoutParams r0, int r1) {
            r0.setLayoutDirection(r1)
            return
    }

    public static void g(android.view.ViewGroup.MarginLayoutParams r0, int r1) {
            r0.setMarginEnd(r1)
            return
    }

    public static void h(android.view.ViewGroup.MarginLayoutParams r0, int r1) {
            r0.setMarginStart(r1)
            return
    }
}
