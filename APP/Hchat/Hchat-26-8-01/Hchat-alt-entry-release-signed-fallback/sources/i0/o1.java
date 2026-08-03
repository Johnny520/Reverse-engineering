package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements i0.a1, qg.t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f5990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wf.g f5991h;

    public o1(i0.a1 r1, wf.g r2) {
            r0 = this;
            r0.<init>()
            r0.f5990g = r1
            r0.f5991h = r2
            return
    }

    @Override // i0.l2
    public final java.lang.Object getValue() {
            r1 = this;
            i0.a1 r0 = r1.f5990g
            java.lang.Object r0 = r0.getValue()
            return r0
    }

    @Override // qg.t
    public final wf.g n() {
            r1 = this;
            wf.g r0 = r1.f5991h
            return r0
    }

    @Override // i0.a1
    public final void setValue(java.lang.Object r2) {
            r1 = this;
            i0.a1 r0 = r1.f5990g
            r0.setValue(r2)
            return
    }
}
