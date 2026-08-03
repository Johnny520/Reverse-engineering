package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static g3.r0 a(android.view.View r2) {
            android.view.WindowInsets r0 = r2.getRootWindowInsets()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            g3.r0 r0 = g3.r0.c(r0, r1)
            g3.n0 r1 = r0.f4230a
            r1.t(r0)
            android.view.View r2 = r2.getRootView()
            r1.d(r2)
            return r0
    }
}
