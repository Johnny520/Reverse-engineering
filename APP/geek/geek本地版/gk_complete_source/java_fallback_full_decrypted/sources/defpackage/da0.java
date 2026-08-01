package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class da0 {
    public static android.view.View.AccessibilityDelegate a(android.view.View r0) {
            android.view.View$AccessibilityDelegate r0 = r0.getAccessibilityDelegate()
            return r0
    }

    public static java.util.List<android.graphics.Rect> b(android.view.View r0) {
            java.util.List r0 = r0.getSystemGestureExclusionRects()
            return r0
    }

    public static void c(android.view.View r0, android.content.Context r1, int[] r2, android.util.AttributeSet r3, android.content.res.TypedArray r4, int r5, int r6) {
            r0.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void d(android.view.View r0, java.util.List<android.graphics.Rect> r1) {
            r0.setSystemGestureExclusionRects(r1)
            return
    }
}
