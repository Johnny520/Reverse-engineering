package p000;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class aa0 {
    /* JADX INFO: renamed from: a */
    public static int m38a(View view) {
        return view.getAccessibilityLiveRegion();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m39b(View view) {
        return view.isAttachedToWindow();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m40c(View view) {
        return view.isLaidOut();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m41d(View view) {
        return view.isLayoutDirectionResolved();
    }

    /* JADX INFO: renamed from: e */
    public static void m42e(ViewParent viewParent, View view, View view2, int i) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
    }

    /* JADX INFO: renamed from: f */
    public static void m43f(View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }

    /* JADX INFO: renamed from: g */
    public static void m44g(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }
}
