package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class yc2 implements p000.xc2 {

    /* JADX INFO: renamed from: ε */
    public static final p000.yc2 f12578 = null;

    static {
            yc2 r0 = new yc2
            r0.<init>()
            p000.yc2.f12578 = r0
            return
    }

    @Override // p000.xc2
    /* JADX INFO: renamed from: γ */
    public final p000.tc2 mo6611(android.content.ContextWrapper r1, p000.C0966x r2) {
            r0 = this;
            r2.getClass()
            boolean r0 = r1.isUiContext()
            java.lang.Class<android.view.WindowManager> r2 = android.view.WindowManager.class
            if (r0 == 0) goto L12
            java.lang.Object r0 = r1.getSystemService(r2)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            goto L1c
        L12:
            android.content.Context r0 = r1.getApplicationContext()
            java.lang.Object r0 = r0.getSystemService(r2)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
        L1c:
            tc2 r1 = new tc2
            android.view.WindowMetrics r2 = r0.getCurrentWindowMetrics()
            android.graphics.Rect r2 = r2.getBounds()
            r2.getClass()
            android.view.WindowMetrics r0 = r0.getCurrentWindowMetrics()
            float r0 = r0.getDensity()
            r1.<init>(r2, r0)
            return r1
    }
}
