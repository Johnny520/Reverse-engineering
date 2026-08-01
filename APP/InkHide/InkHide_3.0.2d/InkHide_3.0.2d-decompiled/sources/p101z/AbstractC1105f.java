package p101z;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.time.Duration;

/* JADX INFO: renamed from: z.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1105f {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static AccessibilityNodeInfo.AccessibilityAction m2384a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m2385b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static CharSequence m2386c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static long m2387d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static boolean m2388e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static boolean m2389f(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m2390g(AccessibilityNodeInfo accessibilityNodeInfo, boolean z2) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m2391h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.setBoundsInWindow(rect);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m2392i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setContainerTitle(charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m2393j(AccessibilityNodeInfo accessibilityNodeInfo, long j2) {
        accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static void m2394k(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z2) {
        accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static void m2395l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z2) {
        accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z2);
    }
}
