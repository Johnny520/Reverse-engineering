package p000;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class v90 {
    /* JADX INFO: renamed from: a */
    public static int m2494a(View view) {
        return view.getAccessibilityLiveRegion();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2495b(View view) {
        return view.isAttachedToWindow();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2496c(View view) {
        return view.isLaidOut();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2497d(View view) {
        return view.isLayoutDirectionResolved();
    }

    /* JADX INFO: renamed from: e */
    public static void m2498e(ViewParent viewParent, View view, View view2, int i) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
    }

    /* JADX INFO: renamed from: f */
    public static void m2499f(View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }

    /* JADX INFO: renamed from: g */
    public static void m2500g(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }
}
