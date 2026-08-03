package b2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static java.lang.CharSequence a(android.view.accessibility.AccessibilityNodeInfo r0) {
            java.lang.CharSequence r0 = r0.getStateDescription()
            return r0
    }

    public static android.graphics.Insets b(android.view.DisplayCutout r0) {
            android.graphics.Insets r0 = r0.getWaterfallInsets()
            return r0
    }

    public static void c(android.view.Window r2, boolean r3) {
            android.view.View r0 = r2.getDecorView()
            int r1 = r0.getSystemUiVisibility()
            if (r3 == 0) goto Ld
            r1 = r1 & (-257(0xfffffffffffffeff, float:NaN))
            goto Lf
        Ld:
            r1 = r1 | 256(0x100, float:3.59E-43)
        Lf:
            r0.setSystemUiVisibility(r1)
            r2.setDecorFitsSystemWindows(r3)
            return
    }

    public static void d(android.view.Window r0, boolean r1) {
            r0.setDecorFitsSystemWindows(r1)
            return
    }

    public static void e(android.view.View r1) {
            r0 = 1
            r1.setImportantForContentCapture(r0)
            return
    }

    public static void f(android.view.inputmethod.EditorInfo r1, java.lang.CharSequence r2) {
            r0 = 0
            r1.setInitialSurroundingSubText(r2, r0)
            return
    }

    public static void g(android.view.accessibility.AccessibilityNodeInfo r0, java.lang.CharSequence r1) {
            r0.setStateDescription(r1)
            return
    }
}
