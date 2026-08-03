package c4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements c4.e, c4.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c4.f f1022b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c4.f f1023c = null;

    static {
            c4.f r0 = new c4.f
            r0.<init>()
            c4.f.f1022b = r0
            c4.f r0 = new c4.f
            r0.<init>()
            c4.f.f1023c = r0
            return
    }

    @Override // c4.e
    public float b(android.content.ContextWrapper r2) {
            r1 = this;
            java.lang.Class<android.view.WindowManager> r0 = android.view.WindowManager.class
            java.lang.Object r2 = r2.getSystemService(r0)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            android.view.WindowMetrics r2 = r2.getCurrentWindowMetrics()
            float r2 = r2.getDensity()
            return r2
    }

    @Override // c4.g
    public b4.a c(android.content.ContextWrapper r2, c4.e r3) {
            r1 = this;
            r3.getClass()
            boolean r3 = r2.isUiContext()
            java.lang.Class<android.view.WindowManager> r0 = android.view.WindowManager.class
            if (r3 == 0) goto L12
            java.lang.Object r2 = r2.getSystemService(r0)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            goto L1c
        L12:
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.Object r2 = r2.getSystemService(r0)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
        L1c:
            b4.a r3 = new b4.a
            android.view.WindowMetrics r0 = r2.getCurrentWindowMetrics()
            android.graphics.Rect r0 = r0.getBounds()
            r0.getClass()
            android.view.WindowMetrics r2 = r2.getCurrentWindowMetrics()
            float r2 = r2.getDensity()
            r3.<init>(r0, r2)
            return r3
    }
}
