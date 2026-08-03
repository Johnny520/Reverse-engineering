package ai;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final ai.b a(java.lang.String r2) {
            r2.getClass()
            ai.b r0 = new ai.b
            android.graphics.RuntimeShader r1 = new android.graphics.RuntimeShader
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static java.lang.String b(android.view.accessibility.AccessibilityNodeInfo r0) {
            java.lang.String r0 = r0.getUniqueId()
            return r0
    }

    public static boolean c(android.view.accessibility.AccessibilityNodeInfo r0) {
            boolean r0 = r0.isTextSelectable()
            return r0
    }

    public static final void d(y2.x r1, b.b r2) {
            if (r2 == 0) goto Le
            android.window.OnBackInvokedDispatcher r1 = r1.findOnBackInvokedDispatcher()
            if (r1 == 0) goto Le
            r0 = 1000000(0xf4240, float:1.401298E-39)
            r1.registerOnBackInvokedCallback(r0, r2)
        Le:
            return
    }

    public static final void e(y2.x r0, b.b r1) {
            if (r1 == 0) goto Lb
            android.window.OnBackInvokedDispatcher r0 = r0.findOnBackInvokedDispatcher()
            if (r0 == 0) goto Lb
            r0.unregisterOnBackInvokedCallback(r1)
        Lb:
            return
    }
}
