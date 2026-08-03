package c0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends x1.j implements x1.h, x1.n {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public h0.u0 f954w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i0.j1 f955x;

    public j(h0.u0 r3) {
            r2 = this;
            r2.<init>()
            r2.f954w = r3
            i0.e r3 = i0.e.f5867j
            i0.j1 r0 = new i0.j1
            r1 = 0
            r0.<init>(r1, r3)
            r2.f955x = r0
            c0.g r3 = new c0.g
            r0 = 0
            r3.<init>(r2, r0)
            s1.k r0 = s1.h0.f12244a
            s1.l0 r0 = new s1.l0
            r0.<init>(r1, r1, r1, r3)
            r2.k1(r0)
            return
    }

    @Override // x1.n
    public final void w(x1.i1 r2) {
            r1 = this;
            i0.j1 r0 = r1.f955x
            r0.setValue(r2)
            return
    }
}
