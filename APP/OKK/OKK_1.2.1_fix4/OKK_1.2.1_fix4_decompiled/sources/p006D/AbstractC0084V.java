package p006D;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: D.V */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0084V {
    /* JADX INFO: renamed from: a */
    public static boolean m299a(ViewParent viewParent, View view, float f2, float f3, boolean z2) {
        return viewParent.onNestedFling(view, f2, f3, z2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m300b(ViewParent viewParent, View view, float f2, float f3) {
        return viewParent.onNestedPreFling(view, f2, f3);
    }

    /* JADX INFO: renamed from: c */
    public static void m301c(ViewParent viewParent, View view, int i2, int i3, int[] iArr) {
        viewParent.onNestedPreScroll(view, i2, i3, iArr);
    }

    /* JADX INFO: renamed from: d */
    public static void m302d(ViewParent viewParent, View view, int i2, int i3, int i4, int i5) {
        viewParent.onNestedScroll(view, i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: e */
    public static void m303e(ViewParent viewParent, View view, View view2, int i2) {
        viewParent.onNestedScrollAccepted(view, view2, i2);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m304f(ViewParent viewParent, View view, View view2, int i2) {
        return viewParent.onStartNestedScroll(view, view2, i2);
    }

    /* JADX INFO: renamed from: g */
    public static void m305g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
