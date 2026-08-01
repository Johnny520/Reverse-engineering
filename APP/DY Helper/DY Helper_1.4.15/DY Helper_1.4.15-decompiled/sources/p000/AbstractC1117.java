package p000;

/* JADX INFO: renamed from: п */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1117 {
    /* JADX INFO: renamed from: α */
    public static android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction m7290() {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static float m7291(android.view.VelocityTracker r0, int r1) {
            float r0 = r0.getAxisVelocity(r1)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static void m7292(android.view.accessibility.AccessibilityNodeInfo r0, android.graphics.Rect r1) {
            r0.getBoundsInWindow(r1)
            return
    }

    /* JADX INFO: renamed from: δ */
    public static java.lang.CharSequence m7293(android.view.accessibility.AccessibilityNodeInfo r0) {
            java.lang.CharSequence r0 = r0.getContainerTitle()
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static int m7294(android.view.ViewConfiguration r0, int r1, int r2, int r3) {
            int r0 = r0.getScaledMaximumFlingVelocity(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static int m7295(android.view.ViewConfiguration r0, int r1, int r2, int r3) {
            int r0 = r0.getScaledMinimumFlingVelocity(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: η */
    public static boolean m7296(android.view.accessibility.AccessibilityNodeInfo r0) {
            boolean r0 = r0.isAccessibilityDataSensitive()
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public static boolean m7297(android.view.accessibility.AccessibilityManager r0) {
            boolean r0 = r0.isRequestFromAccessibilityTool()
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public static void m7298(android.view.accessibility.AccessibilityEvent r0, boolean r1) {
            r0.setAccessibilityDataSensitive(r1)
            return
    }

    /* JADX INFO: renamed from: κ */
    public static void m7299(android.view.accessibility.AccessibilityNodeInfo r0, boolean r1) {
            r0.setAccessibilityDataSensitive(r1)
            return
    }

    /* JADX INFO: renamed from: λ */
    public static void m7300(android.widget.TextView r0, int r1, float r2) {
            r0.setLineHeight(r1, r2)
            return
    }
}
