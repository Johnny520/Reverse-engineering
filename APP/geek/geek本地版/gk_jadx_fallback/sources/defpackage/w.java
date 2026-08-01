package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static android.view.accessibility.AccessibilityNodeProvider a(android.view.View.AccessibilityDelegate r0, android.view.View r1) {
            android.view.accessibility.AccessibilityNodeProvider r0 = r0.getAccessibilityNodeProvider(r1)
            return r0
    }

    public static boolean b(android.view.View.AccessibilityDelegate r0, android.view.View r1, int r2, android.os.Bundle r3) {
            boolean r0 = r0.performAccessibilityAction(r1, r2, r3)
            return r0
    }
}
