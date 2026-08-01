package p000;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class za0 {
    /* JADX INFO: renamed from: a */
    public static boolean m2825a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return viewParent.onNestedFling(view, f, f2, z);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2826b(ViewParent viewParent, View view, float f, float f2) {
        return viewParent.onNestedPreFling(view, f, f2);
    }

    /* JADX INFO: renamed from: c */
    public static void m2827c(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        viewParent.onNestedPreScroll(view, i, i2, iArr);
    }

    /* JADX INFO: renamed from: d */
    public static void m2828d(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        viewParent.onNestedScroll(view, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: e */
    public static void m2829e(ViewParent viewParent, View view, View view2, int i) {
        viewParent.onNestedScrollAccepted(view, view2, i);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m2830f(ViewParent viewParent, View view, View view2, int i) {
        return viewParent.onStartNestedScroll(view, view2, i);
    }

    /* JADX INFO: renamed from: g */
    public static void m2831g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
