package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v1.s0 f14050a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f14051b = null;

    static {
            v1.s0 r0 = new v1.s0
            r1 = 4
            r0.<init>(r1)
            v1.w.f14050a = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            v1.w.f14051b = r0
            return
    }

    public static final void a(v1.j1 r7, y0.o r8, fg.p r9, i0.h0 r10, int r11) {
            r0 = -511989831(0xffffffffe17ba7b9, float:-2.9013865E20)
            r10.b0(r0)
            r0 = r11 & 6
            if (r0 != 0) goto L15
            boolean r0 = r10.h(r7)
            if (r0 == 0) goto L12
            r0 = 4
            goto L13
        L12:
            r0 = 2
        L13:
            r0 = r0 | r11
            goto L16
        L15:
            r0 = r11
        L16:
            r1 = r11 & 48
            if (r1 != 0) goto L26
            boolean r1 = r10.f(r8)
            if (r1 == 0) goto L23
            r1 = 32
            goto L25
        L23:
            r1 = 16
        L25:
            r0 = r0 | r1
        L26:
            r1 = r11 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L36
            boolean r1 = r10.h(r9)
            if (r1 == 0) goto L33
            r1 = 256(0x100, float:3.59E-43)
            goto L35
        L33:
            r1 = 128(0x80, float:1.8E-43)
        L35:
            r0 = r0 | r1
        L36:
            r1 = r0 & 147(0x93, float:2.06E-43)
            r2 = 146(0x92, float:2.05E-43)
            r3 = 1
            r4 = 0
            if (r1 == r2) goto L40
            r1 = r3
            goto L41
        L40:
            r1 = r4
        L41:
            r0 = r0 & r3
            boolean r0 = r10.S(r0, r1)
            if (r0 == 0) goto Ld0
            long r0 = r10.T
            int r0 = java.lang.Long.hashCode(r0)
            i0.f0 r1 = i0.r.x(r10)
            y0.o r2 = y0.a.c(r10, r8)
            s0.h r5 = r10.l()
            r10.d0()
            boolean r6 = r10.S
            if (r6 == 0) goto L67
            x1.y r6 = x1.y.f21094g
            r10.k(r6)
            goto L6a
        L67:
            r10.n0()
        L6a:
            v1.i1 r6 = r7.f13973c
            i0.r.A(r6, r10, r7)
            v1.i1 r6 = r7.f13974d
            i0.r.A(r6, r10, r1)
            v1.i1 r1 = r7.f13975e
            i0.r.A(r1, r10, r9)
            x1.f r1 = x1.g.f20914f
            r1.getClass()
            x1.e r1 = x1.f.f20885d
            i0.r.A(r1, r10, r5)
            x1.d r1 = x1.f.f20888g
            i0.r.w(r1, r10)
            x1.e r1 = x1.f.f20884c
            i0.r.A(r1, r10, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            x1.e r1 = x1.f.f20887f
            i0.r.A(r1, r10, r0)
            r10.p(r3)
            boolean r0 = r10.E()
            if (r0 != 0) goto Lc6
            r0 = -1259245908(0xffffffffb4f16eac, float:-4.4970272E-7)
            r10.a0(r0)
            boolean r0 = r10.h(r7)
            java.lang.Object r1 = r10.P()
            if (r0 != 0) goto Lb3
            i0.e r0 = i0.l.f5952a
            if (r1 != r0) goto Lbd
        Lb3:
            d1.c0 r1 = new d1.c0
            r0 = 15
            r1.<init>(r7, r0)
            r10.k0(r1)
        Lbd:
            fg.a r1 = (fg.a) r1
            i0.r.j(r1, r10)
            r10.p(r4)
            goto Ld3
        Lc6:
            r0 = -1259187287(0xffffffffb4f253a9, float:-4.5136883E-7)
            r10.a0(r0)
            r10.p(r4)
            goto Ld3
        Ld0:
            r10.V()
        Ld3:
            i0.r1 r10 = r10.t()
            if (r10 == 0) goto Le5
            v1.g1 r0 = new v1.g1
            r5 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r10.f6035d = r0
        Le5:
            return
    }

    public static final void b(y0.o r3, fg.p r4, i0.h0 r5, int r6) {
            r0 = -1298353104(0xffffffffb29cb430, float:-1.824273E-8)
            r5.b0(r0)
            r0 = r6 | 6
            boolean r1 = r5.h(r4)
            if (r1 == 0) goto L11
            r1 = 32
            goto L13
        L11:
            r1 = 16
        L13:
            r0 = r0 | r1
            r1 = r0 & 19
            r2 = 18
            if (r1 == r2) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            r2 = r0 & 1
            boolean r1 = r5.S(r2, r1)
            if (r1 == 0) goto L44
            java.lang.Object r3 = r5.P()
            i0.e r1 = i0.l.f5952a
            if (r3 != r1) goto L37
            v1.j1 r3 = new v1.j1
            v1.s0 r1 = v1.s0.f14043h
            r3.<init>(r1)
            r5.k0(r3)
        L37:
            v1.j1 r3 = (v1.j1) r3
            int r0 = r0 << 3
            r0 = r0 & 1008(0x3f0, float:1.413E-42)
            y0.l r1 = y0.l.f21818a
            a(r3, r1, r4, r5, r0)
            r3 = r1
            goto L47
        L44:
            r5.V()
        L47:
            i0.r1 r5 = r5.t()
            if (r5 == 0) goto L54
            a1.g r0 = new a1.g
            r0.<init>(r3, r4, r6)
            r5.f6035d = r0
        L54:
            return
    }

    public static final float c(long r4, long r6) {
            r0 = 32
            long r1 = r6 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r2 = r4 >> r0
            int r0 = (int) r2
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r1 = r1 / r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r2
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r4 = r4 & r2
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r6 = r6 / r4
            float r4 = java.lang.Math.min(r1, r6)
            return r4
    }

    public static final float d(v1.a1 r6, boolean r7, v1.l[] r8, float r9) {
            int r0 = r8.length
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2 = 0
            r3 = r2
        L5:
            if (r3 >= r0) goto L20
            r4 = r8[r3]
            float r4 = r6.j(r4)
            boolean r5 = java.lang.Float.isNaN(r1)
            if (r5 != 0) goto L1c
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 <= 0) goto L19
            r5 = 1
            goto L1a
        L19:
            r5 = r2
        L1a:
            if (r7 != r5) goto L1d
        L1c:
            r1 = r4
        L1d:
            int r3 = r3 + 1
            goto L5
        L20:
            boolean r6 = java.lang.Float.isNaN(r1)
            if (r6 == 0) goto L27
            return r9
        L27:
            return r1
    }

    public static final e1.c e(v1.t r6) {
            v1.t r0 = r6.b0()
            if (r0 == 0) goto Lc
            r1 = 1
            e1.c r6 = r0.k0(r6, r1)
            return r6
        Lc:
            e1.c r0 = new e1.c
            long r1 = r6.F()
            r3 = 32
            long r1 = r1 >> r3
            int r1 = (int) r1
            float r1 = (float) r1
            long r2 = r6.F()
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r6 = (int) r2
            float r6 = (float) r6
            r2 = 0
            r0.<init>(r2, r2, r1, r6)
            return r0
    }

    public static final e1.c f(v1.t r14, boolean r15) {
            v1.t r0 = h(r14)
            long r1 = r0.F()
            r3 = 32
            long r1 = r1 >> r3
            int r1 = (int) r1
            float r1 = (float) r1
            long r4 = r0.F()
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            int r2 = (int) r4
            float r2 = (float) r2
            e1.c r14 = r0.k0(r14, r15)
            float r4 = r14.f2296a
            r5 = 0
            if (r15 == 0) goto L2c
            int r8 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r8 >= 0) goto L27
            r4 = r5
        L27:
            int r8 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r8 <= 0) goto L2c
            r4 = r1
        L2c:
            float r8 = r14.f2297b
            if (r15 == 0) goto L3a
            int r9 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r9 >= 0) goto L35
            r8 = r5
        L35:
            int r9 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r9 <= 0) goto L3a
            r8 = r2
        L3a:
            float r9 = r14.f2298c
            if (r15 == 0) goto L4a
            int r10 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r10 >= 0) goto L43
            r9 = r5
        L43:
            int r10 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r10 <= 0) goto L48
            goto L49
        L48:
            r1 = r9
        L49:
            r9 = r1
        L4a:
            float r14 = r14.f2299d
            if (r15 == 0) goto L5b
            int r15 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r15 >= 0) goto L53
            goto L54
        L53:
            r5 = r14
        L54:
            int r14 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r14 <= 0) goto L59
            goto L5a
        L59:
            r2 = r5
        L5a:
            r14 = r2
        L5b:
            int r15 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r15 != 0) goto L60
            goto L64
        L60:
            int r15 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r15 != 0) goto L67
        L64:
            e1.c r14 = e1.c.f2295e
            return r14
        L67:
            int r15 = java.lang.Float.floatToRawIntBits(r4)
            long r1 = (long) r15
            int r15 = java.lang.Float.floatToRawIntBits(r8)
            long r10 = (long) r15
            long r1 = r1 << r3
            long r10 = r10 & r6
            long r1 = r1 | r10
            long r1 = r0.m(r1)
            int r15 = java.lang.Float.floatToRawIntBits(r9)
            long r10 = (long) r15
            int r15 = java.lang.Float.floatToRawIntBits(r8)
            long r12 = (long) r15
            long r10 = r10 << r3
            long r12 = r12 & r6
            long r10 = r10 | r12
            long r10 = r0.m(r10)
            int r15 = java.lang.Float.floatToRawIntBits(r9)
            long r8 = (long) r15
            int r15 = java.lang.Float.floatToRawIntBits(r14)
            long r12 = (long) r15
            long r8 = r8 << r3
            long r12 = r12 & r6
            long r8 = r8 | r12
            long r8 = r0.m(r8)
            int r15 = java.lang.Float.floatToRawIntBits(r4)
            long r4 = (long) r15
            int r14 = java.lang.Float.floatToRawIntBits(r14)
            long r14 = (long) r14
            long r4 = r4 << r3
            long r14 = r14 & r6
            long r14 = r14 | r4
            long r14 = r0.m(r14)
            long r4 = r1 >> r3
            int r0 = (int) r4
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r4 = r10 >> r3
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            long r12 = r14 >> r3
            int r5 = (int) r12
            float r5 = java.lang.Float.intBitsToFloat(r5)
            long r12 = r8 >> r3
            int r3 = (int) r12
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r12 = java.lang.Math.min(r5, r3)
            float r12 = java.lang.Math.min(r4, r12)
            float r12 = java.lang.Math.min(r0, r12)
            float r3 = java.lang.Math.max(r5, r3)
            float r3 = java.lang.Math.max(r4, r3)
            float r0 = java.lang.Math.max(r0, r3)
            long r1 = r1 & r6
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r2 = r10 & r6
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r14 = r14 & r6
            int r14 = (int) r14
            float r14 = java.lang.Float.intBitsToFloat(r14)
            long r3 = r8 & r6
            int r15 = (int) r3
            float r15 = java.lang.Float.intBitsToFloat(r15)
            float r3 = java.lang.Math.min(r14, r15)
            float r3 = java.lang.Math.min(r2, r3)
            float r3 = java.lang.Math.min(r1, r3)
            float r14 = java.lang.Math.max(r14, r15)
            float r14 = java.lang.Math.max(r2, r14)
            float r14 = java.lang.Math.max(r1, r14)
            e1.c r15 = new e1.c
            r15.<init>(r12, r3, r0, r14)
            return r15
    }

    public static final boolean g(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public static final v1.t h(v1.t r2) {
            v1.t r0 = r2.b0()
        L4:
            r1 = r0
            r0 = r2
            r2 = r1
            if (r2 == 0) goto Le
            v1.t r0 = r2.b0()
            goto L4
        Le:
            boolean r2 = r0 instanceof x1.i1
            if (r2 == 0) goto L16
            r2 = r0
            x1.i1 r2 = (x1.i1) r2
            goto L17
        L16:
            r2 = 0
        L17:
            if (r2 != 0) goto L1a
            return r0
        L1a:
            x1.i1 r0 = r2.f20945w
        L1c:
            r1 = r0
            r0 = r2
            r2 = r1
            if (r2 == 0) goto L24
            x1.i1 r0 = r2.f20945w
            goto L1c
        L24:
            return r0
    }

    public static final java.lang.Object i(v1.m0 r2) {
            java.lang.Object r2 = r2.X()
            boolean r0 = r2 instanceof v1.x
            r1 = 0
            if (r0 == 0) goto Lc
            v1.x r2 = (v1.x) r2
            goto Ld
        Lc:
            r2 = r1
        Ld:
            if (r2 == 0) goto L12
            java.lang.String r2 = r2.f14054u
            return r2
        L12:
            return r1
    }

    public static final x1.o0 j(x1.o0 r2) {
            x1.i1 r2 = r2.f21007u
            x1.f0 r2 = r2.f20943u
        L4:
            x1.f0 r0 = r2.u()
            r1 = 0
            if (r0 == 0) goto Le
            x1.f0 r0 = r0.f20896n
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 == 0) goto L29
            x1.f0 r0 = r2.u()
            if (r0 == 0) goto L19
            x1.f0 r1 = r0.f20896n
        L19:
            r1.getClass()
            x1.f0 r2 = r2.u()
            r2.getClass()
            x1.f0 r2 = r2.f20896n
            r2.getClass()
            goto L4
        L29:
            x1.b1 r2 = r2.L
            x1.i1 r2 = r2.f20842d
            x1.o0 r2 = r2.p1()
            r2.getClass()
            return r2
    }

    public static final y0.o k(y0.o r1, fg.q r2) {
            v1.u r0 = new v1.u
            r0.<init>(r2)
            y0.o r1 = r1.d(r0)
            return r1
    }

    public static final y0.o l(java.lang.String r1) {
            v1.v r0 = new v1.v
            r0.<init>(r1)
            return r0
    }

    public static final y0.o m(y0.o r1, fg.l r2) {
            v1.t0 r0 = new v1.t0
            r0.<init>(r2)
            y0.o r1 = r1.d(r0)
            return r1
    }

    public static final y0.o n(y0.o r1, fg.l r2) {
            v1.v0 r0 = new v1.v0
            r0.<init>(r2)
            y0.o r1 = r1.d(r0)
            return r1
    }

    public static final long o(long r5, long r7) {
            r0 = 32
            long r1 = r5 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r2 = r7 >> r0
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r2 = r2 * r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r3
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            long r6 = r7 & r3
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r6 = r6 * r5
            int r5 = java.lang.Float.floatToRawIntBits(r2)
            long r7 = (long) r5
            int r5 = java.lang.Float.floatToRawIntBits(r6)
            long r5 = (long) r5
            long r7 = r7 << r0
            long r5 = r5 & r3
            long r5 = r5 | r7
            return r5
    }
}
