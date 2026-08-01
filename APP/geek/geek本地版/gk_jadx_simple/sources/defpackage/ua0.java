package defpackage;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class ua0 {
    public static boolean a(ViewParent r0, View r1, float r2, float r3, boolean r4) {
        return r0.onNestedFling(r1, r2, r3, r4);
    }

    public static boolean b(ViewParent r0, View r1, float r2, float r3) {
        return r0.onNestedPreFling(r1, r2, r3);
    }

    public static void c(ViewParent r0, View r1, int r2, int r3, int[] r4) {
        r0.onNestedPreScroll(r1, r2, r3, r4);
    }

    public static void d(ViewParent r0, View r1, int r2, int r3, int r4, int r5) {
        r0.onNestedScroll(r1, r2, r3, r4, r5);
    }

    public static void e(ViewParent r0, View r1, View r2, int r3) {
        r0.onNestedScrollAccepted(r1, r2, r3);
    }

    public static boolean f(ViewParent r0, View r1, View r2, int r3) {
        return r0.onStartNestedScroll(r1, r2, r3);
    }

    public static void g(ViewParent r0, View r1) {
        r0.onStopNestedScroll(r1);
    }
}
