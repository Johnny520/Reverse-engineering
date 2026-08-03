package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends y0.n implements x1.h, x1.v {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final i2.n0 f14532u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public m2.r f14533v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public vh.f f14534w;

    public l1(i2.n0 r1) {
            r0 = this;
            r0.<init>()
            r0.f14532u = r1
            return
    }

    @Override // y0.n
    public final boolean Z0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // y0.n
    public final void c1() {
            r8 = this;
            x1.f0 r0 = x1.k.w(r8)
            u2.m r0 = r0.F
            i2.n0 r1 = r8.f14532u
            i2.n0 r6 = i2.e0.h(r1, r0)
            i0.m2 r0 = y1.h1.f21949k
            java.lang.Object r0 = x1.k.h(r8, r0)
            r5 = r0
            m2.d r5 = (m2.d) r5
            r8.k1(r6, r5)
            vh.f r2 = new vh.f
            x1.f0 r0 = x1.k.w(r8)
            u2.m r3 = r0.F
            x1.f0 r0 = x1.k.w(r8)
            u2.c r4 = r0.E
            m2.r r0 = r8.f14533v
            if (r0 == 0) goto L32
            java.lang.Object r7 = r0.f8711g
            r2.<init>(r3, r4, r5, r6, r7)
            r8.f14534w = r2
            return
        L32:
            java.lang.String r0 = "Font resolution state is not set."
            o.b.b(r0)
            okio.a.c()
            return
    }

    @Override // y0.n
    public final void d1() {
            r1 = this;
            r0 = 0
            r1.f14533v = r0
            r1.f14534w = r0
            return
    }

    @Override // x1.v
    public final v1.o0 j(v1.p0 r6, v1.m0 r7, long r8) {
            r5 = this;
            vh.f r0 = r5.f14534w
            if (r0 == 0) goto L79
            java.lang.Object r1 = r0.f14392g
            i0.j1 r1 = (i0.j1) r1
            m2.r r2 = r5.f14533v
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r2.f8711g
            java.lang.Object r3 = r0.f14391f
            boolean r3 = gg.l.a(r2, r3)
            if (r3 != 0) goto L1d
            r0.f14391f = r2
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.setValue(r2)
        L1d:
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r0.f14389d
            m2.d r2 = (m2.d) r2
            java.lang.Object r3 = r0.f14390e
            i2.n0 r3 = (i2.n0) r3
            java.lang.Object r4 = r0.f14388c
            u2.c r4 = (u2.c) r4
            long r2 = w.a1.b(r3, r4, r2)
            r0.f14387b = r2
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.setValue(r2)
        L40:
            long r0 = r0.f14387b
            r2 = 32
            long r2 = r0 >> r2
            int r2 = (int) r2
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r3
            int r0 = (int) r0
            r1 = 10
            r3 = 0
            long r0 = u2.b.b(r2, r3, r0, r3, r1)
            long r8 = u2.b.e(r8, r0)
            v1.b1 r7 = r7.Q(r8)
            int r8 = r7.f13900g
            int r9 = r7.f13901h
            g0.g r0 = new g0.g
            r1 = 8
            r0.<init>(r7, r1)
            tf.u r7 = tf.u.f13168g
            v1.o0 r6 = r6.z(r8, r9, r7, r0)
            return r6
        L6f:
            java.lang.String r6 = "Font resolution state is not set."
            o.b.b(r6)
            okio.a.c()
            r6 = 0
            return r6
        L79:
            java.lang.String r6 = "Min size state is not set."
            o.b.b(r6)
            okio.a.c()
            r6 = 0
            return r6
    }

    @Override // x1.i
    public final void k0() {
            r4 = this;
            vh.f r0 = r4.f14534w
            if (r0 == 0) goto L10
            x1.f0 r1 = x1.k.w(r4)
            u2.m r1 = r1.F
            r2 = 30
            r3 = 0
            vh.f.a(r0, r1, r3, r3, r2)
        L10:
            x1.k.m(r4)
            return
    }

    public final void k1(i2.n0 r4, m2.d r5) {
            r3 = this;
            i2.f0 r4 = r4.f6365a
            m2.p r0 = r4.f6303f
            m2.k r1 = r4.f6300c
            if (r1 != 0) goto La
            m2.k r1 = m2.k.f8697i
        La:
            m2.i r2 = r4.f6301d
            if (r2 == 0) goto L11
            int r2 = r2.f8694a
            goto L12
        L11:
            r2 = 0
        L12:
            m2.j r4 = r4.f6302e
            if (r4 == 0) goto L19
            int r4 = r4.f8695a
            goto L1c
        L19:
            r4 = 65535(0xffff, float:9.1834E-41)
        L1c:
            m2.e r5 = (m2.e) r5
            m2.r r4 = r5.b(r0, r1, r2, r4)
            r3.f14533v = r4
            x1.k.m(r3)
            return
    }

    @Override // x1.i
    public final void m() {
            r4 = this;
            vh.f r0 = r4.f14534w
            if (r0 == 0) goto L10
            x1.f0 r1 = x1.k.w(r4)
            u2.c r1 = r1.E
            r2 = 29
            r3 = 0
            vh.f.a(r0, r3, r1, r3, r2)
        L10:
            x1.k.m(r4)
            return
    }
}
