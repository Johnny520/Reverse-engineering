package wf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements wf.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wf.f f20782g;

    public a(wf.f r1) {
            r0 = this;
            r0.<init>()
            r0.f20782g = r1
            return
    }

    @Override // wf.g
    public final /* bridge */ wf.g e(wf.g r1) {
            r0 = this;
            wf.g r1 = f8.i.q0(r0, r1)
            return r1
    }

    @Override // wf.e
    public final wf.f getKey() {
            r1 = this;
            wf.f r0 = r1.f20782g
            return r0
    }

    @Override // wf.g
    public final java.lang.Object k(fg.p r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object r1 = r1.invoke(r2, r0)
            return r1
    }

    @Override // wf.g
    public /* bridge */ wf.e s(wf.f r1) {
            r0 = this;
            wf.e r1 = f8.i.w(r0, r1)
            return r1
    }

    @Override // wf.g
    public /* bridge */ wf.g t(wf.f r1) {
            r0 = this;
            wf.g r1 = f8.i.l0(r0, r1)
            return r1
    }
}
