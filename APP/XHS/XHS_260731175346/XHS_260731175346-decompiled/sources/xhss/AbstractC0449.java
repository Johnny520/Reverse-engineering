package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛲᲁᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0449 {
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static float m820(android.view.VelocityTracker r0, int r1) {
            float r0 = r0.getAxisVelocity(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static void m821(android.view.accessibility.AccessibilityNodeInfo r0, android.graphics.Rect r1) {
            r0.getBoundsInWindow(r1)
            return
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static int m822(android.view.ViewConfiguration r0, int r1, int r2, int r3) {
            int r0 = r0.getScaledMaximumFlingVelocity(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction m823() {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static void m824(android.widget.TextView r0, int r1, float r2) {
            r0.setLineHeight(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static boolean m825(android.view.accessibility.AccessibilityNodeInfo r0) {
            boolean r0 = r0.isAccessibilityDataSensitive()
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static java.lang.CharSequence m826(android.view.accessibility.AccessibilityNodeInfo r0) {
            java.lang.CharSequence r0 = r0.getContainerTitle()
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static int m827(android.view.ViewConfiguration r0, int r1, int r2, int r3) {
            int r0 = r0.getScaledMinimumFlingVelocity(r1, r2, r3)
            return r0
    }
}
