package ci;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends y0.n implements x1.m {
    public final i.c A;
    public qg.e1 B;
    public qg.e1 C;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final n.k f1738u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f1739v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1740w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f1741x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f1742y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f1743z;

    public k(n.k r1, long r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f1738u = r1
            r0.f1739v = r2
            r1 = 0
            r2 = 1008981770(0x3c23d70a, float:0.01)
            i.c r1 = i.d.a(r1, r2)
            r0.A = r1
            return
    }

    @Override // x1.m
    public final void B(x1.h0 r10) {
            r9 = this;
            r10.e()
            i.c r0 = r9.A
            java.lang.Object r0 = r0.d()
            java.lang.Number r0 = (java.lang.Number) r0
            float r6 = r0.floatValue()
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L23
            h1.b r0 = r10.f20932g
            long r4 = r0.a()
            r7 = 0
            r8 = 114(0x72, float:1.6E-43)
            long r2 = r9.f1739v
            r1 = r10
            h1.d.Z(r1, r2, r4, r6, r7, r8)
        L23:
            return
    }

    @Override // y0.n
    public final void c1() {
            r4 = this;
            qg.t r0 = r4.Y0()
            ci.c r1 = new ci.c
            r2 = 1
            r3 = 0
            r1.<init>(r4, r3, r2)
            r2 = 3
            qg.v.q(r0, r3, r1, r2)
            return
    }
}
