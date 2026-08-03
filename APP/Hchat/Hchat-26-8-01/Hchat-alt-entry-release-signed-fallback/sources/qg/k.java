package qg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends qg.u0 implements qg.j {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final qg.y0 f11066k;

    public k(qg.y0 r1) {
            r0 = this;
            r0.<init>()
            r0.f11066k = r1
            return
    }

    @Override // qg.j
    public final boolean c(java.lang.Throwable r2) {
            r1 = this;
            qg.y0 r0 = r1.j()
            boolean r2 = r0.B(r2)
            return r2
    }

    @Override // qg.u0
    public final boolean k() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // qg.u0
    public final void l(java.lang.Throwable r2) {
            r1 = this;
            qg.y0 r2 = r1.f11066k
            qg.y0 r0 = r1.j()
            r2.v(r0)
            return
    }
}
