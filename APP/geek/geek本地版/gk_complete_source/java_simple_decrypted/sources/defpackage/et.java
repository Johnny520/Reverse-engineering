package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class et {
    public static int a(ViewGroup.MarginLayoutParams r0) {
        return r0.getLayoutDirection();
    }

    public static int b(ViewGroup.MarginLayoutParams r0) {
        return r0.getMarginEnd();
    }

    public static int c(ViewGroup.MarginLayoutParams r0) {
        return r0.getMarginStart();
    }

    public static boolean d(ViewGroup.MarginLayoutParams r0) {
        return r0.isMarginRelative();
    }

    public static void e(ViewGroup.MarginLayoutParams r0, int r1) {
        r0.resolveLayoutDirection(r1);
    }

    public static void f(ViewGroup.MarginLayoutParams r0, int r1) {
        r0.setLayoutDirection(r1);
    }

    public static void g(ViewGroup.MarginLayoutParams r0, int r1) {
        r0.setMarginEnd(r1);
    }

    public static void h(ViewGroup.MarginLayoutParams r0, int r1) {
        r0.setMarginStart(r1);
    }
}
