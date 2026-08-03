package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends x1.i1 {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final f1.h f21024a0 = null;
    public final x1.b2 Y;
    public x1.q Z;

    static {
            f1.h r0 = f1.c0.f()
            int r1 = f1.w.f3132h
            long r1 = f1.w.f3128d
            r0.w(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.C(r1)
            r1 = 1
            r0.D(r1)
            x1.r.f21024a0 = r0
            return
    }

    public r(x1.f0 r3) {
            r2 = this;
            r2.<init>(r3)
            x1.b2 r0 = new x1.b2
            r0.<init>()
            r1 = 0
            r0.f21822j = r1
            r2.Y = r0
            r0.f21826n = r2
            x1.f0 r3 = r3.f20896n
            if (r3 == 0) goto L19
            x1.q r3 = new x1.q
            r3.<init>(r2)
            goto L1a
        L19:
            r3 = 0
        L1a:
            r2.Z = r3
            return
    }

    @Override // v1.b1
    public final void A0(long r7, float r9, fg.l r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            r4 = r10
            r0.H1(r1, r3, r4, r5)
            boolean r7 = r0.f20998p
            if (r7 == 0) goto Ld
            return
        Ld:
            x1.f0 r7 = r0.f20943u
            x1.j0 r7 = r7.M
            x1.v0 r7 = r7.f20966p
            r7.R0()
            return
    }

    @Override // x1.i1, v1.b1
    public final void B0(long r7, float r9, i1.b r10) {
            r6 = this;
            r4 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            r5 = r10
            r0.H1(r1, r3, r4, r5)
            boolean r7 = r0.f20998p
            if (r7 == 0) goto Ld
            return
        Ld:
            x1.f0 r7 = r0.f20943u
            x1.j0 r7 = r7.M
            x1.v0 r7 = r7.f20966p
            r7.R0()
            return
    }

    @Override // v1.m0
    public final int G(int r4) {
            r3 = this;
            x1.f0 r0 = r3.f20943u
            p4.t r0 = r0.t()
            v1.n0 r1 = r0.x()
            java.lang.Object r0 = r0.f10224h
            x1.f0 r0 = (x1.f0) r0
            x1.b1 r2 = r0.L
            x1.i1 r2 = r2.f20842d
            java.util.List r0 = r0.m()
            int r4 = r1.c(r2, r0, r4)
            return r4
    }

    @Override // x1.i1
    public final void G1(f1.u r10, i1.b r11) {
            r9 = this;
            x1.f0 r0 = r9.f20943u
            x1.r1 r1 = x1.i0.a(r0)
            j0.b r0 = r0.x()
            java.lang.Object[] r2 = r0.f6671g
            int r0 = r0.f6673i
            r3 = 0
        Lf:
            if (r3 >= r0) goto L21
            r4 = r2[r3]
            x1.f0 r4 = (x1.f0) r4
            boolean r5 = r4.H()
            if (r5 == 0) goto L1e
            r4.i(r10, r11)
        L1e:
            int r3 = r3 + 1
            goto Lf
        L21:
            y1.t r1 = (y1.t) r1
            boolean r11 = r1.getShowLayoutBounds()
            if (r11 == 0) goto L49
            long r0 = r9.f13902i
            r11 = 32
            long r2 = r0 >> r11
            int r11 = (int) r2
            float r11 = (float) r11
            r2 = 1056964608(0x3f000000, float:0.5)
            float r6 = r11 - r2
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r3
            int r11 = (int) r0
            float r11 = (float) r11
            float r7 = r11 - r2
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1056964608(0x3f000000, float:0.5)
            f1.h r8 = x1.r.f21024a0
            r3 = r10
            r3.t(r4, r5, r6, r7, r8)
        L49:
            return
    }

    @Override // x1.n0
    public final int K0(v1.j r6) {
            r5 = this;
            x1.q r0 = r5.Z
            if (r0 == 0) goto L9
            int r6 = r0.K0(r6)
            return r6
        L9:
            x1.f0 r0 = r5.f20943u
            x1.j0 r0 = r0.M
            x1.v0 r0 = r0.f20966p
            x1.j0 r1 = r0.f21076l
            x1.b0 r1 = r1.f20954d
            x1.g0 r2 = r0.D
            r3 = 1
            x1.b0 r4 = x1.b0.f20833g
            if (r1 != r4) goto L25
            r2.f20918d = r3
            boolean r1 = r2.f20916b
            if (r1 == 0) goto L27
            r0.B = r3
            r0.C = r3
            goto L27
        L25:
            r2.f20919e = r3
        L27:
            x1.r r1 = r0.A()
            boolean r4 = r1.f20999q
            r1.f20999q = r3
            r0.h0()
            r1.f20999q = r4
            java.util.HashMap r0 = r2.f20921g
            java.lang.Object r6 = r0.get(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L43
            int r6 = r6.intValue()
            return r6
        L43:
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            return r6
    }

    @Override // v1.m0
    public final int M(int r4) {
            r3 = this;
            x1.f0 r0 = r3.f20943u
            p4.t r0 = r0.t()
            v1.n0 r1 = r0.x()
            java.lang.Object r0 = r0.f10224h
            x1.f0 r0 = (x1.f0) r0
            x1.b1 r2 = r0.L
            x1.i1 r2 = r2.f20842d
            java.util.List r0 = r0.m()
            int r4 = r1.a(r2, r0, r4)
            return r4
    }

    @Override // v1.m0
    public final v1.b1 Q(long r7) {
            r6 = this;
            r6.E0(r7)
            x1.f0 r0 = r6.f20943u
            j0.b r1 = r0.y()
            java.lang.Object[] r2 = r1.f6671g
            int r1 = r1.f6673i
            r3 = 0
        Le:
            if (r3 >= r1) goto L1f
            r4 = r2[r3]
            x1.f0 r4 = (x1.f0) r4
            x1.j0 r4 = r4.M
            x1.v0 r4 = r4.f20966p
            x1.d0 r5 = x1.d0.f20870i
            r4.f21082r = r5
            int r3 = r3 + 1
            goto Le
        L1f:
            v1.n0 r1 = r0.C
            java.util.List r0 = r0.m()
            v1.o0 r7 = r1.h(r6, r0, r7)
            r6.K1(r7)
            r6.B1()
            return r6
    }

    @Override // v1.m0
    public final int j(int r4) {
            r3 = this;
            x1.f0 r0 = r3.f20943u
            p4.t r0 = r0.t()
            v1.n0 r1 = r0.x()
            java.lang.Object r0 = r0.f10224h
            x1.f0 r0 = (x1.f0) r0
            x1.b1 r2 = r0.L
            x1.i1 r2 = r2.f20842d
            java.util.List r0 = r0.m()
            int r4 = r1.g(r2, r0, r4)
            return r4
    }

    @Override // x1.i1
    public final void m1() {
            r1 = this;
            x1.q r0 = r1.Z
            if (r0 != 0) goto Lb
            x1.q r0 = new x1.q
            r0.<init>(r1)
            r1.Z = r0
        Lb:
            return
    }

    @Override // v1.m0
    public final int p0(int r4) {
            r3 = this;
            x1.f0 r0 = r3.f20943u
            p4.t r0 = r0.t()
            v1.n0 r1 = r0.x()
            java.lang.Object r0 = r0.f10224h
            x1.f0 r0 = (x1.f0) r0
            x1.b1 r2 = r0.L
            x1.i1 r2 = r2.f20842d
            java.util.List r0 = r0.m()
            int r4 = r1.i(r2, r0, r4)
            return r4
    }

    @Override // x1.i1
    public final x1.o0 p1() {
            r1 = this;
            x1.q r0 = r1.Z
            return r0
    }

    @Override // x1.i1
    public final y0.n r1() {
            r1 = this;
            x1.b2 r0 = r1.Y
            return r0
    }

    @Override // x1.i1
    public final void x1(x1.e1 r12, long r13, x1.p r15, int r16, boolean r17) {
            r11 = this;
            x1.f0 r0 = r11.f20943u
            boolean r1 = r12.c(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            boolean r1 = r11.S1(r13)
            if (r1 == 0) goto L16
            r9 = r16
            r10 = r17
        L14:
            r3 = r2
            goto L34
        L16:
            r9 = r16
            if (r9 != r2) goto L32
            long r4 = r11.q1()
            float r1 = r11.j1(r13, r4)
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            r4 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r4
            r4 = 2139095040(0x7f800000, float:Infinity)
            if (r1 >= r4) goto L32
            r10 = r3
            goto L14
        L30:
            r9 = r16
        L32:
            r10 = r17
        L34:
            if (r3 == 0) goto L7a
            int r1 = r15.f21017i
            j0.b r0 = r0.x()
            java.lang.Object[] r3 = r0.f6671g
            int r0 = r0.f6673i
            int r0 = r0 - r2
        L41:
            if (r0 < 0) goto L78
            r2 = r3[r0]
            r5 = r2
            x1.f0 r5 = (x1.f0) r5
            boolean r2 = r5.H()
            if (r2 == 0) goto L73
            r4 = r12
            r6 = r13
            r8 = r15
            r4.e(r5, r6, r8, r9, r10)
            long r6 = r15.a()
            float r2 = x1.k.k(r6)
            r9 = 0
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 >= 0) goto L73
            boolean r2 = x1.k.p(r6)
            if (r2 == 0) goto L73
            boolean r2 = x1.k.o(r6)
            if (r2 != 0) goto L73
            boolean r2 = r12.d(r15, r5)
            if (r2 == 0) goto L78
        L73:
            int r0 = r0 + (-1)
            r9 = r16
            goto L41
        L78:
            r15.f21017i = r1
        L7a:
            return
    }
}
