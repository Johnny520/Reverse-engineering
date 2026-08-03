package y2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y2.p f22246a = null;

    static {
            y2.p r0 = new y2.p
            r0.<init>()
            y2.p.f22246a = r0
            return
    }

    public final int a(android.view.Window r3) {
            r2 = this;
            android.view.WindowManager r3 = r3.getWindowManager()
            android.view.WindowMetrics r3 = r3.getCurrentWindowMetrics()
            android.view.WindowInsets r0 = r3.getWindowInsets()
            int r1 = android.view.WindowInsets.Type.systemBars()
            android.graphics.Insets r0 = r0.getInsets(r1)
            int r1 = r0.top
            int r0 = r0.bottom
            int r1 = r1 + r0
            android.graphics.Rect r3 = r3.getBounds()
            int r3 = r3.height()
            int r3 = r3 - r1
            return r3
    }

    public final void b(android.view.WindowManager.LayoutParams r1, int r2) {
            r0 = this;
            r1.setFitInsetsSides(r2)
            return
    }

    public final void c(android.view.WindowManager.LayoutParams r1, int r2) {
            r0 = this;
            r1.setFitInsetsTypes(r2)
            return
    }
}
