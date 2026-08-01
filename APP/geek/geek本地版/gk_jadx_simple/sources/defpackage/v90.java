package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class v90 {
    public static int a(View r0) {
        return r0.getAccessibilityLiveRegion();
    }

    public static boolean b(View r0) {
        return r0.isAttachedToWindow();
    }

    public static boolean c(View r0) {
        return r0.isLaidOut();
    }

    public static boolean d(View r0) {
        return r0.isLayoutDirectionResolved();
    }

    public static void e(ViewParent r0, View r1, View r2, int r3) {
        r0.notifySubtreeAccessibilityStateChanged(r1, r2, r3);
    }

    public static void f(View r0, int r1) {
        r0.setAccessibilityLiveRegion(r1);
    }

    public static void g(AccessibilityEvent r0, int r1) {
        r0.setContentChangeTypes(r1);
    }
}
