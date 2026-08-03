package h3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction a() {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION
            return r0
    }

    public static void b(android.view.accessibility.AccessibilityNodeInfo r0, android.graphics.Rect r1) {
            r0.getBoundsInWindow(r1)
            return
    }

    public static java.lang.CharSequence c(android.view.accessibility.AccessibilityNodeInfo r0) {
            java.lang.CharSequence r0 = r0.getContainerTitle()
            return r0
    }

    public static boolean d(android.view.accessibility.AccessibilityNodeInfo r0) {
            boolean r0 = r0.isAccessibilityDataSensitive()
            return r0
    }

    public static boolean e(android.view.accessibility.AccessibilityManager r0) {
            boolean r0 = r0.isRequestFromAccessibilityTool()
            return r0
    }

    public static void f(android.view.accessibility.AccessibilityEvent r0, boolean r1) {
            r0.setAccessibilityDataSensitive(r1)
            return
    }

    public static void g(android.view.accessibility.AccessibilityNodeInfo r0, boolean r1) {
            r0.setAccessibilityDataSensitive(r1)
            return
    }
}
