package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class k1 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2.n0 f14525a;

    public k1(i2.n0 r1) {
            r0 = this;
            r0.<init>()
            r0.f14525a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof w.k1
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            w.k1 r2 = (w.k1) r2
            i2.n0 r2 = r2.f14525a
            i2.n0 r0 = r1.f14525a
            boolean r2 = gg.l.a(r0, r2)
            return r2
    }

    @Override // x1.x0
    public final y0.n f() {
            r2 = this;
            w.l1 r0 = new w.l1
            i2.n0 r1 = r2.f14525a
            r0.<init>(r1)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r5) {
            r4 = this;
            w.l1 r5 = (w.l1) r5
            r5.getClass()
            x1.f0 r0 = x1.k.w(r5)
            u2.m r0 = r0.F
            i2.n0 r1 = r4.f14525a
            i2.n0 r0 = i2.e0.h(r1, r0)
            i0.m2 r1 = y1.h1.f21949k
            java.lang.Object r1 = x1.k.h(r5, r1)
            m2.d r1 = (m2.d) r1
            r5.k1(r0, r1)
            vh.f r1 = r5.f14534w
            if (r1 == 0) goto L2a
            r2 = 23
            r3 = 0
            vh.f.a(r1, r3, r3, r0, r2)
            x1.k.m(r5)
            return
        L2a:
            java.lang.String r5 = "Min size state is not set."
            o.b.b(r5)
            okio.a.c()
            return
    }

    public final int hashCode() {
            r1 = this;
            i2.n0 r0 = r1.f14525a
            int r0 = r0.hashCode()
            return r0
    }
}
