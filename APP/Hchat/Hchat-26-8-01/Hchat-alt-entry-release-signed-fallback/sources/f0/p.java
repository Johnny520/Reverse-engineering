package f0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends y0.n implements x1.h, x1.n {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public f0.c f2976u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public w.q0 f2977v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public h0.d1 f2978w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i0.j1 f2979x;

    public p(f0.c r1, w.q0 r2, h0.d1 r3) {
            r0 = this;
            r0.<init>()
            r0.f2976u = r1
            r0.f2977v = r2
            r0.f2978w = r3
            r1 = 0
            i0.j1 r1 = i0.r.u(r1)
            r0.f2979x = r1
            return
    }

    @Override // y0.n
    public final void c1() {
            r2 = this;
            f0.c r0 = r2.f2976u
            f0.p r1 = r0.f2939a
            if (r1 != 0) goto L7
            goto Lc
        L7:
            java.lang.String r1 = "Expected textInputModifierNode to be null"
            o.b.c(r1)
        Lc:
            r0.f2939a = r2
            return
    }

    @Override // y0.n
    public final void d1() {
            r1 = this;
            f0.c r0 = r1.f2976u
            r0.k(r1)
            return
    }

    @Override // x1.n
    public final void w(x1.i1 r2) {
            r1 = this;
            i0.j1 r0 = r1.f2979x
            r0.setValue(r2)
            return
    }
}
