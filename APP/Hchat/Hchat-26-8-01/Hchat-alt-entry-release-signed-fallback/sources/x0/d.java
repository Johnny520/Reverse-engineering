package x0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements m0.k0, wf.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final uf.d f20825h = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0.h0 f20826g;

    static {
            uf.d r0 = new uf.d
            r1 = 5
            r0.<init>(r1)
            x0.d.f20825h = r0
            return
    }

    public d(i0.h0 r1) {
            r0 = this;
            r0.<init>()
            r0.f20826g = r1
            return
    }

    @Override // wf.g
    public final /* bridge */ wf.g e(wf.g r1) {
            r0 = this;
            wf.g r1 = f8.i.q0(r0, r1)
            return r1
    }

    @Override // m0.k0
    public final java.util.List f(java.lang.Integer r1) {
            r0 = this;
            i0.h0 r1 = r0.f20826g
            java.util.List r1 = r1.I()
            return r1
    }

    @Override // wf.e
    public final wf.f getKey() {
            r1 = this;
            uf.d r0 = x0.d.f20825h
            return r0
    }

    @Override // m0.k0
    public final boolean j() {
            r1 = this;
            i0.h0 r0 = r1.f20826g
            boolean r0 = r0.C
            return r0
    }

    @Override // wf.g
    public final java.lang.Object k(fg.p r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object r1 = r1.invoke(r2, r0)
            return r1
    }

    @Override // wf.g
    public final /* bridge */ wf.e s(wf.f r1) {
            r0 = this;
            wf.e r1 = f8.i.w(r0, r1)
            return r1
    }

    @Override // wf.g
    public final /* bridge */ wf.g t(wf.f r1) {
            r0 = this;
            wf.g r1 = f8.i.l0(r0, r1)
            return r1
    }
}
