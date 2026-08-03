package ci;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends y0.n implements x1.h, x1.v {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ci.p f1797u;

    public s(ci.p r1) {
            r0 = this;
            r0.<init>()
            r0.f1797u = r1
            return
    }

    @Override // y0.n
    public final void c1() {
            r3 = this;
            r3.k1()
            ci.q r0 = new ci.q
            r1 = 0
            r0.<init>(r3, r1)
            ci.p r1 = r3.f1797u
            r1.f1781l = r0
            ci.r r0 = new ci.r
            r2 = 0
            r0.<init>(r3, r2)
            r1.f1782m = r0
            ci.r r0 = new ci.r
            r2 = 1
            r0.<init>(r3, r2)
            r1.f1783n = r0
            ci.r r0 = new ci.r
            r2 = 2
            r0.<init>(r3, r2)
            r1.f1772c = r0
            return
    }

    @Override // y0.n
    public final void d1() {
            r2 = this;
            ci.p r0 = r2.f1797u
            r1 = 0
            r0.f1781l = r1
            r0.f1782m = r1
            r0.f1783n = r1
            r0.f1772c = r1
            r1 = 0
            r0.g(r1)
            r0.h(r1)
            r0.f1773d = r1
            r0.f1774e = r1
            ci.r r0 = r0.f1783n
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r0.invoke()
            ci.z r0 = (ci.z) r0
            if (r0 == 0) goto L2c
            boolean r1 = r0.a()
            if (r1 == 0) goto L2c
            r1 = 0
            r0.b(r1)
        L2c:
            return
    }

    @Override // x1.v
    public final v1.o0 j(v1.p0 r3, v1.m0 r4, long r5) {
            r2 = this;
            r4.getClass()
            r2.k1()
            v1.b1 r4 = r4.Q(r5)
            int r5 = r4.f13900g
            int r6 = r4.f13901h
            c9.i r0 = new c9.i
            r1 = 6
            r0.<init>(r4, r1, r2)
            tf.u r4 = tf.u.f13168g
            v1.o0 r3 = r3.z(r5, r6, r4, r0)
            return r3
    }

    public final void k1() {
            r4 = this;
            i0.m2 r0 = y1.h1.f21946h
            java.lang.Object r0 = x1.k.h(r4, r0)
            u2.c r0 = (u2.c) r0
            i0.m2 r1 = y1.h1.f21959u
            java.lang.Object r1 = x1.k.h(r4, r1)
            y1.o2 r1 = (y1.o2) r1
            y1.v1 r1 = (y1.v1) r1
            long r2 = r1.a()
            float r2 = u2.h.a(r2)
            float r2 = r0.x0(r2)
            ci.p r3 = r4.f1797u
            r3.f1775f = r2
            long r1 = r1.a()
            float r1 = u2.h.b(r1)
            float r0 = r0.x0(r1)
            r3.f1776g = r0
            return
    }
}
