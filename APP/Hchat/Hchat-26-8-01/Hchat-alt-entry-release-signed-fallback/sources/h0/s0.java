package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2.g f4983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i2.k0 f4985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b5.k f4986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h0.j1 f4987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f4988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i2.g f4989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n2.s f4990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w.m1 f4991i;

    public s0(n2.s r5, b5.k r6, w.m1 r7, h0.j1 r8) {
            r4 = this;
            i2.g r0 = r5.f8976a
            long r1 = r5.f8977b
            if (r7 == 0) goto L9
            i2.k0 r3 = r7.f14569a
            goto La
        L9:
            r3 = 0
        La:
            r4.<init>()
            r4.f4983a = r0
            r4.f4984b = r1
            r4.f4985c = r3
            r4.f4986d = r6
            r4.f4987e = r8
            r4.f4988f = r1
            r4.f4989g = r0
            r4.f4990h = r5
            r4.f4991i = r7
            return
    }

    public final java.util.List a(fg.l r6) {
            r5 = this;
            long r0 = r5.f4988f
            boolean r0 = i2.m0.c(r0)
            if (r0 == 0) goto L17
            java.lang.Object r6 = r6.invoke(r5)
            n2.g r6 = (n2.g) r6
            if (r6 == 0) goto L15
            java.util.List r6 = a.a.x0(r6)
            return r6
        L15:
            r6 = 0
            return r6
        L17:
            n2.a r6 = new n2.a
            java.lang.String r0 = ""
            r1 = 0
            r6.<init>(r0, r1)
            n2.r r0 = new n2.r
            long r2 = r5.f4988f
            int r2 = i2.m0.f(r2)
            long r3 = r5.f4988f
            int r3 = i2.m0.f(r3)
            r0.<init>(r2, r3)
            r2 = 2
            n2.g[] r2 = new n2.g[r2]
            r2[r1] = r6
            r6 = 1
            r2[r6] = r0
            java.util.List r6 = a.a.y0(r2)
            return r6
    }

    public final java.lang.Integer b() {
            r4 = this;
            i2.k0 r0 = r4.f4985c
            if (r0 == 0) goto L22
            i2.o r0 = r0.f6347b
            long r1 = r4.f4988f
            int r1 = i2.m0.e(r1)
            b5.k r2 = r4.f4986d
            r2.l(r1)
            int r1 = r0.d(r1)
            r3 = 1
            int r0 = r0.c(r1, r3)
            r2.n(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L22:
            r0 = 0
            return r0
    }

    public final java.lang.Integer c() {
            r4 = this;
            i2.k0 r0 = r4.f4985c
            if (r0 == 0) goto L21
            long r1 = r4.f4988f
            int r1 = i2.m0.f(r1)
            b5.k r2 = r4.f4986d
            r2.l(r1)
            i2.o r3 = r0.f6347b
            int r1 = r3.d(r1)
            int r0 = r0.g(r1)
            r2.n(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L21:
            r0 = 0
            return r0
    }

    public final java.lang.Integer d() {
            r6 = this;
            i2.k0 r0 = r6.f4985c
            if (r0 == 0) goto L44
            int r1 = r6.r()
        L8:
            i2.g r2 = r6.f4983a
            java.lang.String r3 = r2.f6314h
            int r3 = r3.length()
            if (r1 < r3) goto L19
            java.lang.String r0 = r2.f6314h
            int r0 = r0.length()
            goto L3f
        L19:
            i2.g r2 = r6.f4989g
            java.lang.String r2 = r2.f6314h
            int r2 = r2.length()
            int r2 = r2 + (-1)
            if (r1 <= r2) goto L26
            goto L27
        L26:
            r2 = r1
        L27:
            long r2 = r0.j(r2)
            int r4 = i2.m0.f6359c
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r2 = (int) r2
            if (r2 > r1) goto L39
            int r1 = r1 + 1
            goto L8
        L39:
            b5.k r0 = r6.f4986d
            r0.n(r2)
            r0 = r2
        L3f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L44:
            r0 = 0
            return r0
    }

    public final java.lang.Integer e() {
            r5 = this;
            i2.k0 r0 = r5.f4985c
            if (r0 == 0) goto L34
            int r1 = r5.r()
        L8:
            if (r1 > 0) goto Lc
            r0 = 0
            goto L2f
        Lc:
            i2.g r2 = r5.f4989g
            java.lang.String r2 = r2.f6314h
            int r2 = r2.length()
            int r2 = r2 + (-1)
            if (r1 <= r2) goto L19
            goto L1a
        L19:
            r2 = r1
        L1a:
            long r2 = r0.j(r2)
            int r4 = i2.m0.f6359c
            r4 = 32
            long r2 = r2 >> r4
            int r2 = (int) r2
            if (r2 < r1) goto L29
            int r1 = r1 + (-1)
            goto L8
        L29:
            b5.k r0 = r5.f4986d
            r0.n(r2)
            r0 = r2
        L2f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L34:
            r0 = 0
            return r0
    }

    public final boolean f() {
            r2 = this;
            i2.k0 r0 = r2.f4985c
            if (r0 == 0) goto Ld
            int r1 = r2.r()
            t2.j r0 = r0.h(r1)
            goto Le
        Ld:
            r0 = 0
        Le:
            t2.j r1 = t2.j.f13012h
            if (r0 == r1) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    public final int g(i2.k0 r7, int r8) {
            r6 = this;
            int r0 = r6.r()
            h0.j1 r1 = r6.f4987e
            java.lang.Float r2 = r1.f4921a
            if (r2 != 0) goto L16
            e1.c r2 = r7.c(r0)
            float r2 = r2.f2296a
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r1.f4921a = r2
        L16:
            i2.o r2 = r7.f6347b
            int r0 = r2.d(r0)
            int r0 = r0 + r8
            if (r0 >= 0) goto L21
            r7 = 0
            return r7
        L21:
            int r8 = r2.f6373f
            if (r0 < r8) goto L2e
            i2.g r7 = r6.f4989g
            java.lang.String r7 = r7.f6314h
            int r7 = r7.length()
            return r7
        L2e:
            float r8 = r2.b(r0)
            r3 = 1
            float r4 = (float) r3
            float r8 = r8 - r4
            java.lang.Float r1 = r1.f4921a
            r1.getClass()
            float r4 = r1.floatValue()
            boolean r5 = r6.f()
            if (r5 == 0) goto L4c
            float r5 = r7.f(r0)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 >= 0) goto L5a
        L4c:
            boolean r5 = r6.f()
            if (r5 != 0) goto L5f
            float r7 = r7.e(r0)
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 > 0) goto L5f
        L5a:
            int r7 = r2.c(r0, r3)
            return r7
        L5f:
            float r7 = r1.floatValue()
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            long r0 = (long) r7
            int r7 = java.lang.Float.floatToRawIntBits(r8)
            long r7 = (long) r7
            r3 = 32
            long r0 = r0 << r3
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r3
            long r7 = r7 | r0
            int r7 = r2.g(r7)
            b5.k r8 = r6.f4986d
            r8.n(r7)
            return r7
    }

    public final int h(w.m1 r9, int r10) {
            r8 = this;
            v1.t r0 = r9.f14570b
            i2.k0 r1 = r9.f14569a
            if (r0 == 0) goto L13
            v1.t r9 = r9.f14571c
            if (r9 == 0) goto L10
            r2 = 1
            e1.c r9 = r9.k0(r0, r2)
            goto L11
        L10:
            r9 = 0
        L11:
            if (r9 != 0) goto L15
        L13:
            e1.c r9 = e1.c.f2295e
        L15:
            n2.s r0 = r8.f4990h
            long r2 = r0.f8977b
            int r0 = i2.m0.f6359c
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r0 = (int) r2
            b5.k r2 = r8.f4986d
            r2.l(r0)
            e1.c r0 = r1.c(r0)
            float r3 = r0.f2296a
            float r0 = r0.f2297b
            long r6 = r9.c()
            long r6 = r6 & r4
            int r9 = (int) r6
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r10 = (float) r10
            float r9 = r9 * r10
            float r9 = r9 + r0
            int r10 = java.lang.Float.floatToRawIntBits(r3)
            long r6 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            r0 = 32
            long r6 = r6 << r0
            long r9 = r9 & r4
            long r9 = r9 | r6
            i2.o r0 = r1.f6347b
            int r9 = r0.g(r9)
            r2.n(r9)
            return r9
    }

    public final void i() {
            r5 = this;
            h0.j1 r0 = r5.f4987e
            r1 = 0
            r0.f4921a = r1
            i2.g r2 = r5.f4989g
            java.lang.String r3 = r2.f6314h
            int r3 = r3.length()
            if (r3 <= 0) goto L3a
            boolean r3 = r5.f()
            if (r3 == 0) goto L19
            r5.k()
            return
        L19:
            r0.f4921a = r1
            java.lang.String r0 = r2.f6314h
            int r0 = r0.length()
            if (r0 <= 0) goto L3a
            java.lang.String r0 = r2.f6314h
            long r1 = r5.f4988f
            int r3 = i2.m0.f6359c
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            int r1 = (int) r1
            int r0 = w.s.q(r1, r0)
            r1 = -1
            if (r0 == r1) goto L3a
            r5.q(r0, r0)
        L3a:
            return
    }

    public final void j() {
            r4 = this;
            h0.j1 r0 = r4.f4987e
            r1 = 0
            r0.f4921a = r1
            i2.g r0 = r4.f4989g
            java.lang.String r1 = r0.f6314h
            java.lang.String r0 = r0.f6314h
            int r1 = r1.length()
            if (r1 <= 0) goto L32
            long r1 = r4.f4988f
            int r1 = i2.m0.e(r1)
            int r1 = w.s.r(r0, r1)
            long r2 = r4.f4988f
            int r2 = i2.m0.e(r2)
            if (r1 != r2) goto L2f
            int r2 = r0.length()
            if (r1 == r2) goto L2f
            int r1 = r1 + 1
            int r1 = w.s.r(r0, r1)
        L2f:
            r4.q(r1, r1)
        L32:
            return
    }

    public final void k() {
            r5 = this;
            h0.j1 r0 = r5.f4987e
            r1 = 0
            r0.f4921a = r1
            i2.g r0 = r5.f4989g
            java.lang.String r1 = r0.f6314h
            int r1 = r1.length()
            if (r1 <= 0) goto L26
            java.lang.String r0 = r0.f6314h
            long r1 = r5.f4988f
            int r3 = i2.m0.f6359c
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            int r1 = (int) r1
            int r0 = w.s.t(r1, r0)
            r1 = -1
            if (r0 == r1) goto L26
            r5.q(r0, r0)
        L26:
            return
    }

    public final void l() {
            r4 = this;
            h0.j1 r0 = r4.f4987e
            r1 = 0
            r0.f4921a = r1
            i2.g r0 = r4.f4989g
            java.lang.String r1 = r0.f6314h
            java.lang.String r0 = r0.f6314h
            int r1 = r1.length()
            if (r1 <= 0) goto L2e
            long r1 = r4.f4988f
            int r1 = i2.m0.f(r1)
            int r1 = w.s.s(r0, r1)
            long r2 = r4.f4988f
            int r2 = i2.m0.f(r2)
            if (r1 != r2) goto L2b
            if (r1 == 0) goto L2b
            int r1 = r1 + (-1)
            int r1 = w.s.s(r0, r1)
        L2b:
            r4.q(r1, r1)
        L2e:
            return
    }

    public final void m() {
            r5 = this;
            h0.j1 r0 = r5.f4987e
            r1 = 0
            r0.f4921a = r1
            i2.g r2 = r5.f4989g
            java.lang.String r3 = r2.f6314h
            int r3 = r3.length()
            if (r3 <= 0) goto L3a
            boolean r3 = r5.f()
            if (r3 == 0) goto L37
            r0.f4921a = r1
            java.lang.String r0 = r2.f6314h
            int r0 = r0.length()
            if (r0 <= 0) goto L3a
            java.lang.String r0 = r2.f6314h
            long r1 = r5.f4988f
            int r3 = i2.m0.f6359c
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            int r1 = (int) r1
            int r0 = w.s.q(r1, r0)
            r1 = -1
            if (r0 == r1) goto L3a
            r5.q(r0, r0)
            return
        L37:
            r5.k()
        L3a:
            return
    }

    public final void n() {
            r2 = this;
            h0.j1 r0 = r2.f4987e
            r1 = 0
            r0.f4921a = r1
            i2.g r0 = r2.f4989g
            java.lang.String r0 = r0.f6314h
            int r0 = r0.length()
            if (r0 <= 0) goto L1c
            java.lang.Integer r0 = r2.b()
            if (r0 == 0) goto L1c
            int r0 = r0.intValue()
            r2.q(r0, r0)
        L1c:
            return
    }

    public final void o() {
            r2 = this;
            h0.j1 r0 = r2.f4987e
            r1 = 0
            r0.f4921a = r1
            i2.g r0 = r2.f4989g
            java.lang.String r0 = r0.f6314h
            int r0 = r0.length()
            if (r0 <= 0) goto L1c
            java.lang.Integer r0 = r2.c()
            if (r0 == 0) goto L1c
            int r0 = r0.intValue()
            r2.q(r0, r0)
        L1c:
            return
    }

    public final void p() {
            r5 = this;
            i2.g r0 = r5.f4989g
            java.lang.String r0 = r0.f6314h
            int r0 = r0.length()
            if (r0 <= 0) goto L22
            int r0 = i2.m0.f6359c
            r0 = 32
            long r1 = r5.f4984b
            long r0 = r1 >> r0
            int r0 = (int) r0
            long r1 = r5.f4988f
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            int r1 = (int) r1
            long r0 = i2.e0.b(r0, r1)
            r5.f4988f = r0
        L22:
            return
    }

    public final void q(int r1, int r2) {
            r0 = this;
            long r1 = i2.e0.b(r1, r2)
            r0.f4988f = r1
            return
    }

    public final int r() {
            r4 = this;
            long r0 = r4.f4988f
            int r2 = i2.m0.f6359c
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r0 = (int) r0
            b5.k r1 = r4.f4986d
            r1.l(r0)
            return r0
    }
}
