package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends h.x0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p.n0 f9948v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f9949w;

    @Override // h.x0, x1.v
    public final int K0(x1.n0 r2, v1.m0 r3, int r4) {
            r1 = this;
            p.n0 r2 = r1.f9948v
            p.n0 r0 = p.n0.f9955g
            if (r2 != r0) goto Lb
            int r2 = r3.p0(r4)
            return r2
        Lb:
            int r2 = r3.j(r4)
            return r2
    }

    @Override // h.x0, x1.v
    public final int R0(x1.n0 r2, v1.m0 r3, int r4) {
            r1 = this;
            p.n0 r2 = r1.f9948v
            p.n0 r0 = p.n0.f9955g
            if (r2 != r0) goto Lb
            int r2 = r3.p0(r4)
            return r2
        Lb:
            int r2 = r3.j(r4)
            return r2
    }

    @Override // h.x0
    public final long k1(v1.m0 r3, long r4) {
            r2 = this;
            p.n0 r0 = r2.f9948v
            p.n0 r1 = p.n0.f9955g
            if (r0 != r1) goto Lf
            int r4 = u2.a.h(r4)
            int r3 = r3.p0(r4)
            goto L17
        Lf:
            int r4 = u2.a.h(r4)
            int r3 = r3.j(r4)
        L17:
            r4 = 0
            if (r3 >= 0) goto L1b
            r3 = r4
        L1b:
            if (r3 < 0) goto L1e
            goto L23
        L1e:
            java.lang.String r5 = "height must be >= 0"
            u2.i.a(r5)
        L23:
            r5 = 2147483647(0x7fffffff, float:NaN)
            long r3 = u2.b.h(r4, r5, r3, r3)
            return r3
    }

    @Override // h.x0
    public final boolean l1() {
            r1 = this;
            boolean r0 = r1.f9949w
            return r0
    }
}
