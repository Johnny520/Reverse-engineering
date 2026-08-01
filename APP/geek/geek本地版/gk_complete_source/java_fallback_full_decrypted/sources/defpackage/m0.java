package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {
    public static int a(android.view.accessibility.AccessibilityRecord r0) {
            int r0 = r0.getMaxScrollX()
            return r0
    }

    public static int b(android.view.accessibility.AccessibilityRecord r0) {
            int r0 = r0.getMaxScrollY()
            return r0
    }

    public static void c(android.view.accessibility.AccessibilityRecord r0, int r1) {
            r0.setMaxScrollX(r1)
            return
    }

    public static void d(android.view.accessibility.AccessibilityRecord r0, int r1) {
            r0.setMaxScrollY(r1)
            return
    }
}
