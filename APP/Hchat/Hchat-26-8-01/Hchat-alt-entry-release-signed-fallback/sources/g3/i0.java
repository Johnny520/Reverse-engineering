package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class i0 extends g3.h0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b3.a f4215n;

    public i0(g3.r0 r1, android.view.WindowInsets r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.f4215n = r1
            return
    }

    public i0(g3.r0 r1, g3.i0 r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.f4215n = r1
            b3.a r1 = r2.f4215n
            r0.f4215n = r1
            return
    }

    @Override // g3.n0
    public g3.r0 b() {
            r2 = this;
            android.view.WindowInsets r0 = r2.f4208c
            android.view.WindowInsets r0 = r0.consumeStableInsets()
            r1 = 0
            g3.r0 r0 = g3.r0.c(r0, r1)
            return r0
    }

    @Override // g3.n0
    public g3.r0 c() {
            r2 = this;
            android.view.WindowInsets r0 = r2.f4208c
            android.view.WindowInsets r0 = r0.consumeSystemWindowInsets()
            r1 = 0
            g3.r0 r0 = g3.r0.c(r0, r1)
            return r0
    }

    @Override // g3.n0
    public final b3.a j() {
            r4 = this;
            b3.a r0 = r4.f4215n
            if (r0 != 0) goto L1c
            android.view.WindowInsets r0 = r4.f4208c
            int r1 = r0.getStableInsetLeft()
            int r2 = r0.getStableInsetTop()
            int r3 = r0.getStableInsetRight()
            int r0 = r0.getStableInsetBottom()
            b3.a r0 = b3.a.b(r1, r2, r3, r0)
            r4.f4215n = r0
        L1c:
            b3.a r0 = r4.f4215n
            return r0
    }

    @Override // g3.n0
    public boolean o() {
            r1 = this;
            android.view.WindowInsets r0 = r1.f4208c
            boolean r0 = r0.isConsumed()
            return r0
    }

    @Override // g3.n0
    public void u(b3.a r1) {
            r0 = this;
            r0.f4215n = r1
            return
    }
}
