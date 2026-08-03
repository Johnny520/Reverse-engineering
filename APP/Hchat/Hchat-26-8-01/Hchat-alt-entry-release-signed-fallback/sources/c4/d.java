package c4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements c4.b, c4.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c4.d f1020b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c4.d f1021c = null;

    static {
            c4.d r0 = new c4.d
            r0.<init>()
            c4.d.f1020b = r0
            c4.d r0 = new c4.d
            r0.<init>()
            c4.d.f1021c = r0
            return
    }

    @Override // c4.b
    public android.graphics.Rect a(android.app.Activity r2) {
            r1 = this;
            java.lang.Class<android.view.WindowManager> r0 = android.view.WindowManager.class
            java.lang.Object r2 = r2.getSystemService(r0)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            android.view.WindowMetrics r2 = r2.getCurrentWindowMetrics()
            android.graphics.Rect r2 = r2.getBounds()
            r2.getClass()
            return r2
    }

    @Override // c4.g
    public b4.a c(android.content.ContextWrapper r2, c4.e r3) {
            r1 = this;
            r3.getClass()
            java.lang.Class<android.view.WindowManager> r3 = android.view.WindowManager.class
            java.lang.Object r3 = r2.getSystemService(r3)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            b4.a r0 = new b4.a
            android.view.WindowMetrics r3 = r3.getCurrentWindowMetrics()
            android.graphics.Rect r3 = r3.getBounds()
            r3.getClass()
            r0.<init>(r3, r2)
            return r0
    }
}
