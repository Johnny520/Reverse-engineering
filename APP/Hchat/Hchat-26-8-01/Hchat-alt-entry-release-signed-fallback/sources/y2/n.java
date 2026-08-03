package y2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y2.n f22244a = null;

    static {
            y2.n r0 = new y2.n
            r0.<init>()
            y2.n.f22244a = r0
            return
    }

    public final int a(android.view.Window r3) {
            r2 = this;
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            android.view.WindowManager r1 = r3.getWindowManager()
            android.view.Display r1 = r1.getDefaultDisplay()
            r1.getMetrics(r0)
            int r0 = r0.heightPixels
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.view.View r3 = r3.getDecorView()
            r3.getWindowVisibleDisplayFrame(r1)
            int r3 = r1.top
            int r1 = r1.bottom
            if (r1 <= r0) goto L26
            int r1 = r1 - r0
            goto L27
        L26:
            r1 = 0
        L27:
            int r3 = r3 + r1
            int r0 = r0 - r3
            return r0
    }
}
