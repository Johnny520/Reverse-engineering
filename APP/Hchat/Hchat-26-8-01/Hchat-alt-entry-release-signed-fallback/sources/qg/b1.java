package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends wf.a implements qg.r0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final qg.b1 f11035h = null;

    static {
            qg.b1 r0 = new qg.b1
            qg.q r1 = qg.q.f11090h
            r0.<init>(r1)
            qg.b1.f11035h = r0
            return
    }

    @Override // qg.r0
    public final void a(java.util.concurrent.CancellationException r1) {
            r0 = this;
            return
    }

    @Override // qg.r0
    public final boolean b() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // qg.r0
    public final qg.d0 c(boolean r1, boolean r2, p8.p r3) {
            r0 = this;
            qg.c1 r1 = qg.c1.f11039g
            return r1
    }

    @Override // qg.r0
    public final java.lang.Object g(yf.c r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This job is always active"
            r2.<init>(r0)
            throw r2
    }

    @Override // qg.r0
    public final java.util.concurrent.CancellationException h() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This job is always active"
            r0.<init>(r1)
            throw r0
    }

    @Override // qg.r0
    public final qg.j l(qg.y0 r1) {
            r0 = this;
            qg.c1 r1 = qg.c1.f11039g
            return r1
    }

    @Override // qg.r0
    public final qg.d0 o(fg.l r1) {
            r0 = this;
            qg.c1 r1 = qg.c1.f11039g
            return r1
    }

    @Override // qg.r0
    public final boolean start() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "NonCancellable"
            return r0
    }
}
