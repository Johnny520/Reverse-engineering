package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends g3.l0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final g3.r0 f4224s = null;

    static {
            android.view.WindowInsets r0 = g3.h.g()
            r1 = 0
            g3.r0 r0 = g3.r0.c(r0, r1)
            g3.m0.f4224s = r0
            return
    }

    public m0(g3.r0 r1, android.view.WindowInsets r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public m0(g3.r0 r1, g3.m0 r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // g3.l0, g3.h0, g3.n0
    public b3.a g(int r2) {
            r1 = this;
            android.view.WindowInsets r0 = r1.f4208c
            int r2 = g3.q0.a(r2)
            android.graphics.Insets r2 = g3.h.u(r0, r2)
            b3.a r2 = b3.a.c(r2)
            return r2
    }

    @Override // g3.l0, g3.h0, g3.n0
    public b3.a h(int r2) {
            r1 = this;
            android.view.WindowInsets r0 = r1.f4208c
            int r2 = g3.q0.a(r2)
            android.graphics.Insets r2 = g3.h.e(r0, r2)
            b3.a r2 = b3.a.c(r2)
            return r2
    }

    @Override // g3.l0, g3.h0, g3.n0
    public boolean q(int r2) {
            r1 = this;
            android.view.WindowInsets r0 = r1.f4208c
            int r2 = g3.q0.a(r2)
            boolean r2 = g3.h.r(r0, r2)
            return r2
    }
}
