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
    public static float m1954b(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    /* JADX INFO: renamed from: c */
    public static void m1955c(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    /* JADX INFO: renamed from: d */
    public static CharSequence m1956d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    /* JADX INFO: renamed from: e */
    public static int m1957e(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
    }

    /* JADX INFO: renamed from: f */
    public static int m1958f(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m1959g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    /* JADX INFO: renamed from: h */
    public static float m1960h(BackEvent backEvent) {
        return backEvent.getProgress();
    }

    /* JADX INFO: renamed from: i */
    public static void m1961i(TextView textView, int i, float f) {
        textView.setLineHeight(i, f);
    }

    /* JADX INFO: renamed from: j */
    public static int m1962j(BackEvent backEvent) {
        return backEvent.getSwipeEdge();
    }

    /* JADX INFO: renamed from: k */
    public static float m1963k(BackEvent backEvent) {
        return backEvent.getTouchX();
    }

    /* JADX INFO: renamed from: l */
    public static float m1964l(BackEvent backEvent) {
        return backEvent.getTouchY();
    }
}
