package p000;

import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import android.window.BackEvent;

/* JADX INFO: renamed from: Y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1031Y {
    /* JADX INFO: renamed from: a */
    public static AccessibilityNodeInfo.AccessibilityAction m1953a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    /* JADX INFO: renamed from: b */
    public static float m1954b(VelocityTracker r0, int r1) {
        return r0.getAxisVelocity(r1);
    }

    /* JADX INFO: renamed from: c */
    public static void m1955c(AccessibilityNodeInfo r0, Rect r1) {
        r0.getBoundsInWindow(r1);
    }

    /* JADX INFO: renamed from: d */
    public static CharSequence m1956d(AccessibilityNodeInfo r0) {
        return r0.getContainerTitle();
    }

    /* JADX INFO: renamed from: e */
    public static int m1957e(ViewConfiguration r0, int r1, int r2, int r3) {
        return r0.getScaledMaximumFlingVelocity(r1, r2, r3);
    }

    /* JADX INFO: renamed from: f */
    public static int m1958f(ViewConfiguration r0, int r1, int r2, int r3) {
        return r0.getScaledMinimumFlingVelocity(r1, r2, r3);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m1959g(AccessibilityNodeInfo r0) {
        return r0.isAccessibilityDataSensitive();
    }

    /* JADX INFO: renamed from: h */
    public static float m1960h(BackEvent r0) {
        return r0.getProgress();
    }

    /* JADX INFO: renamed from: i */
    public static void m1961i(TextView r0, int r1, float r2) {
        r0.setLineHeight(r1, r2);
    }

    /* JADX INFO: renamed from: j */
    public static int m1962j(BackEvent r0) {
        return r0.getSwipeEdge();
    }

    /* JADX INFO: renamed from: k */
    public static float m1963k(BackEvent r0) {
        return r0.getTouchX();
    }

    /* JADX INFO: renamed from: l */
    public static float m1964l(BackEvent r0) {
        return r0.getTouchY();
    }
}
