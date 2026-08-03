package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class k0 extends g3.j0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b3.a f4217o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b3.a f4218p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b3.a f4219q;

    public k0(g3.r0 r1, android.view.WindowInsets r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.f4217o = r1
            r0.f4218p = r1
            r0.f4219q = r1
            return
    }

    public k0(g3.r0 r1, g3.k0 r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.f4217o = r1
            r0.f4218p = r1
            r0.f4219q = r1
            return
    }

    @Override // g3.n0
    public b3.a i() {
            r1 = this;
            b3.a r0 = r1.f4218p
            if (r0 != 0) goto L10
            android.view.WindowInsets r0 = r1.f4208c
            android.graphics.Insets r0 = f1.a.r(r0)
            b3.a r0 = b3.a.c(r0)
            r1.f4218p = r0
        L10:
            b3.a r0 = r1.f4218p
            return r0
    }

    @Override // g3.n0
    public b3.a k() {
            r1 = this;
            b3.a r0 = r1.f4217o
            if (r0 != 0) goto L10
            android.view.WindowInsets r0 = r1.f4208c
            android.graphics.Insets r0 = f1.a.w(r0)
            b3.a r0 = b3.a.c(r0)
            r1.f4217o = r0
        L10:
            b3.a r0 = r1.f4217o
            return r0
    }

    @Override // g3.n0
    public b3.a m() {
            r1 = this;
            b3.a r0 = r1.f4219q
            if (r0 != 0) goto L10
            android.view.WindowInsets r0 = r1.f4208c
            android.graphics.Insets r0 = f1.a.d(r0)
            b3.a r0 = b3.a.c(r0)
            r1.f4219q = r0
        L10:
            b3.a r0 = r1.f4219q
            return r0
    }

    @Override // g3.h0, g3.n0
    public g3.r0 n(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.view.WindowInsets r0 = r1.f4208c
            android.view.WindowInsets r2 = f1.a.h(r0, r2, r3, r4, r5)
            r3 = 0
            g3.r0 r2 = g3.r0.c(r2, r3)
            return r2
    }

    @Override // g3.i0, g3.n0
    public void u(b3.a r1) {
            r0 = this;
            return
    }
}
