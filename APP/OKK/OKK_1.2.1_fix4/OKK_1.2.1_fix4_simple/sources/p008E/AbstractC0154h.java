package p008E;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.time.Duration;

/* JADX INFO: renamed from: E.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0154h {
    /* JADX INFO: renamed from: a */
    public static AccessibilityNodeInfo.AccessibilityAction m491a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    /* JADX INFO: renamed from: b */
    public static void m492b(AccessibilityNodeInfo r02, Rect r1) {
        r02.getBoundsInWindow(r1);
    }

    /* JADX INFO: renamed from: c */
    public static CharSequence m493c(AccessibilityNodeInfo r02) {
        return r02.getContainerTitle();
    }

    /* JADX INFO: renamed from: d */
    public static long m494d(AccessibilityNodeInfo r2) {
        return r2.getMinDurationBetweenContentChanges().toMillis();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m495e(AccessibilityNodeInfo r02) {
        return r02.hasRequestInitialAccessibilityFocus();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m496f(AccessibilityNodeInfo r02) {
        return r02.isAccessibilityDataSensitive();
    }

    /* JADX INFO: renamed from: g */
    public static void m497g(AccessibilityNodeInfo r02, boolean r1) {
        r02.setAccessibilityDataSensitive(r1);
    }

    /* JADX INFO: renamed from: h */
    public static void m498h(AccessibilityNodeInfo r02, Rect r1) {
        r02.setBoundsInWindow(r1);
    }

    /* JADX INFO: renamed from: i */
    public static void m499i(AccessibilityNodeInfo r02, CharSequence r1) {
        r02.setContainerTitle(r1);
    }

    /* JADX INFO: renamed from: j */
    public static void m500j(AccessibilityNodeInfo r02, long r1) {
        r02.setMinDurationBetweenContentChanges(Duration.ofMillis(r1));
    }

    /* JADX INFO: renamed from: k */
    public static void m501k(AccessibilityNodeInfo r02, View r1, boolean r2) {
        r02.setQueryFromAppProcessEnabled(r1, r2);
    }

    /* JADX INFO: renamed from: l */
    public static void m502l(AccessibilityNodeInfo r02, boolean r1) {
        r02.setRequestInitialAccessibilityFocus(r1);
    }
}
