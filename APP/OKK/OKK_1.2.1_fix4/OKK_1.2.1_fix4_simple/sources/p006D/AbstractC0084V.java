package p006D;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: D.V */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0084V {
    /* JADX INFO: renamed from: a */
    public static boolean m299a(ViewParent r02, View r1, float r2, float r3, boolean r4) {
        return r02.onNestedFling(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m300b(ViewParent r02, View r1, float r2, float r3) {
        return r02.onNestedPreFling(r1, r2, r3);
    }

    /* JADX INFO: renamed from: c */
    public static void m301c(ViewParent r02, View r1, int r2, int r3, int[] r4) {
        r02.onNestedPreScroll(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: d */
    public static void m302d(ViewParent r02, View r1, int r2, int r3, int r4, int r5) {
        r02.onNestedScroll(r1, r2, r3, r4, r5);
    }

    /* JADX INFO: renamed from: e */
    public static void m303e(ViewParent r02, View r1, View r2, int r3) {
        r02.onNestedScrollAccepted(r1, r2, r3);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m304f(ViewParent r02, View r1, View r2, int r3) {
        return r02.onStartNestedScroll(r1, r2, r3);
    }

    /* JADX INFO: renamed from: g */
    public static void m305g(ViewParent r02, View r1) {
        r02.onStopNestedScroll(r1);
    }
}
