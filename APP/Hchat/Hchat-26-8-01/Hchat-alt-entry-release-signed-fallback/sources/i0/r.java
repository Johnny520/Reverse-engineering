package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f6025a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i0.a0 f6026b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b8.c f6027c = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            i0.r.f6025a = r0
            i0.a0 r0 = new i0.a0
            r0.<init>()
            i0.r.f6026b = r0
            b8.c r0 = new b8.c
            r1 = 3
            r0.<init>(r1)
            i0.r.f6027c = r0
            return
    }

    public static final void A(fg.p r1, i0.h0 r2, java.lang.Object r3) {
            boolean r0 = r2.S
            if (r0 != 0) goto L10
            java.lang.Object r0 = r2.P()
            boolean r0 = gg.l.a(r0, r3)
            if (r0 != 0) goto Lf
            goto L10
        Lf:
            return
        L10:
            r2.k0(r3)
            r2.b(r1, r3)
            return
    }

    public static final m.a B(fg.a r2) {
            f0.b r0 = new f0.b
            r1 = 0
            r0.<init>(r2, r1)
            m.a r2 = new m.a
            r2.<init>(r0)
            return r2
    }

    public static final int C(int r3) {
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            r0 = r0 & r3
            r1 = 613566756(0x24924924, float:6.344131E-17)
            r1 = r1 & r3
            r2 = -920350135(0xffffffffc9249249, float:-674084.56)
            r3 = r3 & r2
            int r2 = r1 >> 1
            r2 = r2 | r0
            r3 = r3 | r2
            int r0 = r0 << 1
            r0 = r0 & r1
            r3 = r3 | r0
            return r3
    }

    public static final s0.h D(i0.q1[] r6, s0.h r7, s0.h r8) {
            s0.h r0 = s0.h.f12195j
            s0.g r1 = new s0.g
            r1.<init>(r0)
            int r0 = r6.length
            r2 = 0
        L9:
            if (r2 >= r0) goto L29
            r3 = r6[r2]
            i0.p1 r4 = r3.f6019a
            boolean r5 = r3.f6024f
            if (r5 != 0) goto L19
            boolean r5 = r7.containsKey(r4)
            if (r5 != 0) goto L26
        L19:
            java.lang.Object r5 = r8.get(r4)
            i0.p2 r5 = (i0.p2) r5
            i0.p2 r3 = r4.c(r3, r5)
            r1.put(r4, r3)
        L26:
            int r2 = r2 + 1
            goto L9
        L29:
            s0.h r6 = r1.a()
            return r6
    }

    public static final void a(i0.q1 r11, s0.d r12, i0.h0 r13, int r14) {
            r0 = -149765515(0xfffffffff712c275, float:-2.9766383E33)
            r13.b0(r0)
            i0.m0 r0 = r13.f5917x
            s0.h r1 = r13.l()
            r2 = 201(0xc9, float:2.82E-43)
            i0.d1 r3 = i0.m.f5967b
            r13.Y(r2, r3)
            java.lang.Object r2 = r13.P()
            i0.e r3 = i0.l.f5952a
            boolean r3 = gg.l.a(r2, r3)
            r4 = 0
            if (r3 == 0) goto L22
            r2 = r4
            goto L27
        L22:
            r2.getClass()
            i0.p2 r2 = (i0.p2) r2
        L27:
            i0.p1 r3 = r11.f6019a
            i0.p2 r5 = r3.c(r11, r2)
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L36
            r13.k0(r5)
        L36:
            boolean r6 = r13.S
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L4e
            boolean r2 = r11.f6024f
            if (r2 != 0) goto L46
            boolean r2 = r1.containsKey(r3)
            if (r2 != 0) goto L4a
        L46:
            s0.h r1 = r1.c(r3, r5)
        L4a:
            r13.J = r7
        L4c:
            r2 = r8
            goto L89
        L4e:
            l0.g r6 = r13.G
            int r9 = r6.f7672g
            int[] r10 = r6.f7667b
            java.lang.Object r6 = r6.b(r10, r9)
            r6.getClass()
            s0.h r6 = (s0.h) r6
            boolean r9 = r13.E()
            if (r9 == 0) goto L65
            if (r2 != 0) goto L70
        L65:
            boolean r9 = r11.f6024f
            if (r9 != 0) goto L7e
            boolean r9 = r1.containsKey(r3)
            if (r9 != 0) goto L70
            goto L7e
        L70:
            if (r2 == 0) goto L77
            boolean r2 = r13.f5916w
            if (r2 != 0) goto L77
            goto L7c
        L77:
            boolean r2 = r13.f5916w
            if (r2 == 0) goto L7c
            goto L82
        L7c:
            r1 = r6
            goto L82
        L7e:
            s0.h r1 = r1.c(r3, r5)
        L82:
            boolean r2 = r13.f5918y
            if (r2 != 0) goto L88
            if (r6 == r1) goto L4c
        L88:
            r2 = r7
        L89:
            if (r2 == 0) goto L92
            boolean r3 = r13.S
            if (r3 != 0) goto L92
            r13.N(r1)
        L92:
            boolean r3 = r13.f5916w
            r0.c(r3)
            r13.f5916w = r2
            r13.K = r1
            r2 = 202(0xca, float:2.83E-43)
            i0.d1 r3 = i0.m.f5968c
            r13.W(r2, r3, r1, r8)
            int r1 = r14 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12.invoke(r13, r1)
            r13.p(r8)
            r13.p(r8)
            int r0 = r0.b()
            if (r0 == 0) goto Lba
            goto Lbb
        Lba:
            r7 = r8
        Lbb:
            r13.f5916w = r7
            r13.K = r4
            i0.r1 r13 = r13.t()
            if (r13 == 0) goto Lcd
            i.b1 r0 = new i.b1
            r1 = 1
            r0.<init>(r11, r12, r14, r1)
            r13.f6035d = r0
        Lcd:
            return
    }

    public static final void b(i0.q1[] r8, fg.p r9, i0.h0 r10, int r11) {
            r0 = 415205898(0x18bf8a0a, float:4.9511727E-24)
            r10.b0(r0)
            i0.m0 r0 = r10.f5917x
            s0.h r1 = r10.l()
            r2 = 201(0xc9, float:2.82E-43)
            i0.d1 r3 = i0.m.f5967b
            r10.Y(r2, r3)
            boolean r2 = r10.S
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L27
            s0.h r2 = s0.h.f12195j
            s0.h r2 = D(r8, r1, r2)
            s0.h r1 = r10.j0(r1, r2)
            r10.J = r3
        L25:
            r2 = r4
            goto L72
        L27:
            l0.g r2 = r10.G
            int r5 = r2.f7672g
            java.lang.Object r2 = r2.h(r5, r4)
            r2.getClass()
            s0.h r2 = (s0.h) r2
            l0.g r5 = r10.G
            int r6 = r5.f7672g
            java.lang.Object r5 = r5.h(r6, r3)
            r5.getClass()
            s0.h r5 = (s0.h) r5
            s0.h r6 = D(r8, r1, r5)
            boolean r7 = r10.E()
            if (r7 == 0) goto L63
            boolean r7 = r10.f5918y
            if (r7 != 0) goto L63
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L56
            goto L63
        L56:
            int r1 = r10.f5905l
            l0.g r5 = r10.G
            int r5 = r5.s()
            int r5 = r5 + r1
            r10.f5905l = r5
            r1 = r2
            goto L25
        L63:
            s0.h r1 = r10.j0(r1, r6)
            boolean r5 = r10.f5918y
            if (r5 != 0) goto L71
            boolean r2 = gg.l.a(r1, r2)
            if (r2 != 0) goto L25
        L71:
            r2 = r3
        L72:
            if (r2 == 0) goto L7b
            boolean r5 = r10.S
            if (r5 != 0) goto L7b
            r10.N(r1)
        L7b:
            boolean r5 = r10.f5916w
            r0.c(r5)
            r10.f5916w = r2
            r10.K = r1
            r2 = 202(0xca, float:2.83E-43)
            i0.d1 r5 = i0.m.f5968c
            r10.W(r2, r5, r1, r4)
            int r1 = r11 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9.invoke(r10, r1)
            r10.p(r4)
            r10.p(r4)
            int r0 = r0.b()
            if (r0 == 0) goto La3
            goto La4
        La3:
            r3 = r4
        La4:
            r10.f5916w = r3
            r0 = 0
            r10.K = r0
            i0.r1 r10 = r10.t()
            if (r10 == 0) goto Lb7
            i.b1 r0 = new i.b1
            r1 = 2
            r0.<init>(r8, r9, r11, r1)
            r10.f6035d = r0
        Lb7:
            return
    }

    public static final void c(java.lang.Object r1, fg.l r2, i0.h0 r3) {
            boolean r1 = r3.f(r1)
            java.lang.Object r0 = r3.P()
            if (r1 != 0) goto Le
            i0.e r1 = i0.l.f5952a
            if (r0 != r1) goto L16
        Le:
            i0.y r0 = new i0.y
            r0.<init>(r2)
            r3.k0(r0)
        L16:
            i0.y r0 = (i0.y) r0
            return
    }

    public static final void d(java.lang.Object r0, java.lang.Object r1, fg.l r2, i0.h0 r3) {
            boolean r0 = r3.f(r0)
            boolean r1 = r3.f(r1)
            r0 = r0 | r1
            java.lang.Object r1 = r3.P()
            if (r0 != 0) goto L13
            i0.e r0 = i0.l.f5952a
            if (r1 != r0) goto L1b
        L13:
            i0.y r1 = new i0.y
            r1.<init>(r2)
            r3.k0(r1)
        L1b:
            i0.y r1 = (i0.y) r1
            return
    }

    public static final void e(java.lang.Object[] r4, fg.l r5, i0.h0 r6) {
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            int r0 = r4.length
            r1 = 0
            r2 = r1
        L8:
            if (r1 >= r0) goto L14
            r3 = r4[r1]
            boolean r3 = r6.f(r3)
            r2 = r2 | r3
            int r1 = r1 + 1
            goto L8
        L14:
            java.lang.Object r4 = r6.P()
            if (r2 != 0) goto L20
            i0.e r0 = i0.l.f5952a
            if (r4 != r0) goto L1f
            goto L20
        L1f:
            return
        L20:
            i0.y r4 = new i0.y
            r4.<init>(r5)
            r6.k0(r4)
            return
    }

    public static final void f(fg.p r2, i0.h0 r3, java.lang.Object r4) {
            wf.g r0 = r3.R
            boolean r4 = r3.f(r4)
            java.lang.Object r1 = r3.P()
            if (r4 != 0) goto L10
            i0.e r4 = i0.l.f5952a
            if (r1 != r4) goto L18
        L10:
            i0.r0 r1 = new i0.r0
            r1.<init>(r0, r2)
            r3.k0(r1)
        L18:
            i0.r0 r1 = (i0.r0) r1
            return
    }

    public static final void g(java.lang.Object r1, java.lang.Object r2, fg.p r3, i0.h0 r4) {
            wf.g r0 = r4.R
            boolean r1 = r4.f(r1)
            boolean r2 = r4.f(r2)
            r1 = r1 | r2
            java.lang.Object r2 = r4.P()
            if (r1 != 0) goto L15
            i0.e r1 = i0.l.f5952a
            if (r2 != r1) goto L1d
        L15:
            i0.r0 r2 = new i0.r0
            r2.<init>(r0, r3)
            r4.k0(r2)
        L1d:
            i0.r0 r2 = (i0.r0) r2
            return
    }

    public static final void h(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, fg.p r4, i0.h0 r5) {
            wf.g r0 = r5.R
            boolean r1 = r5.f(r1)
            boolean r2 = r5.f(r2)
            r1 = r1 | r2
            boolean r2 = r5.f(r3)
            r1 = r1 | r2
            java.lang.Object r2 = r5.P()
            if (r1 != 0) goto L1a
            i0.e r1 = i0.l.f5952a
            if (r2 != r1) goto L22
        L1a:
            i0.r0 r2 = new i0.r0
            r2.<init>(r0, r4)
            r5.k0(r2)
        L22:
            i0.r0 r2 = (i0.r0) r2
            return
    }

    public static final void i(java.lang.Object[] r5, fg.p r6, i0.h0 r7) {
            wf.g r0 = r7.R
            int r1 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)
            int r1 = r5.length
            r2 = 0
            r3 = r2
        La:
            if (r2 >= r1) goto L16
            r4 = r5[r2]
            boolean r4 = r7.f(r4)
            r3 = r3 | r4
            int r2 = r2 + 1
            goto La
        L16:
            java.lang.Object r5 = r7.P()
            if (r3 != 0) goto L22
            i0.e r1 = i0.l.f5952a
            if (r5 != r1) goto L21
            goto L22
        L21:
            return
        L22:
            i0.r0 r5 = new i0.r0
            r5.<init>(r0, r6)
            r7.k0(r5)
            return
    }

    public static final void j(fg.a r1, i0.h0 r2) {
            m0.b r2 = r2.M
            m0.a r2 = r2.f8440b
            m0.l0 r2 = r2.f8437j
            m0.b0 r0 = m0.b0.f8451c
            r2.U(r0)
            r0 = 0
            f8.i.F0(r2, r0, r1)
            return
    }

    public static final void k(java.util.List r1, int r2, int r3) {
            int r2 = q(r2, r1)
            if (r2 >= 0) goto L9
            int r2 = r2 + 1
            int r2 = -r2
        L9:
            int r0 = r1.size()
            if (r2 >= r0) goto L20
            java.lang.Object r0 = r1.get(r2)
            i0.n0 r0 = (i0.n0) r0
            int r0 = r0.f5982b
            if (r0 >= r3) goto L20
            java.lang.Object r0 = r1.remove(r2)
            i0.n0 r0 = (i0.n0) r0
            goto L9
        L20:
            return
    }

    public static void l(l0.k r5, java.util.List r6, i0.q r7) {
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L49
            int r0 = r6.size()
            r1 = 0
        Lb:
            if (r1 >= r0) goto L49
            java.lang.Object r2 = r6.get(r1)
            l0.b r2 = (l0.b) r2
            int r2 = r5.c(r2)
            int r3 = r5.r(r2)
            int[] r4 = r5.f7695b
            int r3 = r5.N(r4, r3)
            int[] r4 = r5.f7695b
            int r2 = r2 + 1
            int r2 = r5.r(r2)
            int r2 = r5.g(r4, r2)
            if (r3 >= r2) goto L38
            int r2 = r5.h(r3)
            java.lang.Object[] r3 = r5.f7696c
            r2 = r3[r2]
            goto L3a
        L38:
            i0.e r2 = i0.l.f5952a
        L3a:
            boolean r3 = r2 instanceof i0.r1
            if (r3 == 0) goto L41
            i0.r1 r2 = (i0.r1) r2
            goto L42
        L41:
            r2 = 0
        L42:
            if (r2 == 0) goto L46
            r2.f6032a = r7
        L46:
            int r1 = r1 + 1
            goto Lb
        L49:
            return
    }

    public static final void m(l0.g r3, java.util.ArrayList r4, int r5) {
            boolean r0 = r3.l(r5)
            int[] r1 = r3.f7667b
            if (r0 == 0) goto L10
            java.lang.Object r3 = r3.n(r5)
            r4.add(r3)
            return
        L10:
            int r0 = r5 + 1
            int r2 = r5 * 5
            int r2 = r2 + 3
            r2 = r1[r2]
            int r2 = r2 + r5
        L19:
            if (r0 >= r2) goto L26
            m(r3, r4, r0)
            int r5 = r0 * 5
            int r5 = r5 + 3
            r5 = r1[r5]
            int r0 = r0 + r5
            goto L19
        L26:
            return
    }

    public static final qg.t n(i0.h0 r1) {
            wf.g r1 = r1.R
            i0.c2 r0 = new i0.c2
            r0.<init>(r1)
            return r0
    }

    public static final j0.b o() {
            b5.c r0 = i0.k2.f5951b
            java.lang.Object r1 = r0.o()
            j0.b r1 = (j0.b) r1
            if (r1 != 0) goto L15
            j0.b r1 = new j0.b
            r2 = 0
            i0.g0[] r2 = new i0.g0[r2]
            r1.<init>(r2)
            r0.O(r1)
        L15:
            return r1
    }

    public static final i0.x p(fg.a r2) {
            b5.c r0 = i0.k2.f5950a
            i0.x r0 = new i0.x
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static final int q(int r4, java.util.List r5) {
            int r0 = r5.size()
            int r0 = r0 + (-1)
            r1 = 0
        L7:
            if (r1 > r0) goto L24
            int r2 = r1 + r0
            int r2 = r2 >>> 1
            java.lang.Object r3 = r5.get(r2)
            i0.n0 r3 = (i0.n0) r3
            int r3 = r3.f5982b
            int r3 = gg.l.c(r3, r4)
            if (r3 >= 0) goto L1e
            int r1 = r2 + 1
            goto L7
        L1e:
            if (r3 <= 0) goto L23
            int r0 = r2 + (-1)
            goto L7
        L23:
            return r2
        L24:
            int r1 = r1 + 1
            int r4 = -r1
            return r4
    }

    public static final long r(i0.h0 r2) {
            long r0 = r2.T
            return r0
    }

    public static final i0.d s(wf.g r1) {
            i0.e r0 = i0.e.f5866i
            wf.e r1 = r1.s(r0)
            i0.d r1 = (i0.d) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            java.lang.String r1 = "A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext."
            j8.o.A(r1)
            r1 = 0
            return r1
    }

    public static final void t(i0.h0 r1, java.lang.Integer r2, fg.p r3) {
            boolean r0 = r1.S
            if (r0 == 0) goto L7
            r1.b(r3, r2)
        L7:
            return
    }

    public static i0.j1 u(java.lang.Object r2) {
            i0.e r0 = i0.e.f5870m
            i0.j1 r1 = new i0.j1
            r1.<init>(r2, r0)
            return r1
    }

    public static final java.lang.Object v(s0.h r1, i0.p1 r2) {
            r2.getClass()
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto Ld
            i0.p2 r0 = r2.b()
        Ld:
            i0.p2 r0 = (i0.p2) r0
            java.lang.Object r1 = r0.a(r1)
            return r1
    }

    public static final void w(fg.l r2, i0.h0 r3) {
            b0.t r0 = new b0.t
            r1 = 13
            r0.<init>(r2, r1)
            sf.n r2 = sf.n.f12433a
            r3.b(r0, r2)
            return
    }

    public static final i0.f0 x(i0.h0 r9) {
            r0 = 206(0xce, float:2.89E-43)
            i0.d1 r1 = i0.m.f5970e
            r9.Y(r0, r1)
            boolean r0 = r9.S
            if (r0 == 0) goto L10
            l0.k r0 = r9.I
            l0.k.z(r0)
        L10:
            java.lang.Object r0 = r9.H()
            boolean r1 = r0 instanceof i0.k0
            if (r1 == 0) goto L1b
            i0.k0 r0 = (i0.k0) r0
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 != 0) goto L3d
            i0.d2 r0 = new i0.d2
            i0.e0 r1 = new i0.e0
            i0.f0 r2 = new i0.f0
            long r4 = r9.T
            boolean r6 = r9.f5910q
            boolean r7 = r9.C
            i0.q r3 = r9.f5901h
            androidx.lifecycle.x r8 = r3.f6015z
            r3 = r9
            r2.<init>(r3, r4, r6, r7, r8)
            r1.<init>(r2)
            r9 = -1
            r0.<init>(r1, r9)
            r3.l0(r0)
            goto L3e
        L3d:
            r3 = r9
        L3e:
            i0.a2 r9 = r0.f5944a
            r9.getClass()
            i0.e0 r9 = (i0.e0) r9
            i0.f0 r9 = r9.f5872g
            s0.h r0 = r3.l()
            i0.j1 r1 = r9.f5879f
            r1.setValue(r0)
            r0 = 0
            r3.p(r0)
            return r9
    }

    public static final i0.a1 y(java.lang.Object r2, i0.h0 r3) {
            java.lang.Object r0 = r3.P()
            i0.e r1 = i0.l.f5952a
            if (r0 != r1) goto Lf
            i0.j1 r0 = u(r2)
            r3.k0(r0)
        Lf:
            i0.a1 r0 = (i0.a1) r0
            r0.setValue(r2)
            return r0
    }

    public static final void z(l0.k r2, int r3, java.lang.Object r4) {
            int r3 = r2.h(r3)
            java.lang.Object[] r2 = r2.f7696c
            r0 = r2[r3]
            i0.e r1 = i0.l.f5952a
            r2[r3] = r1
            if (r4 != r0) goto Lf
            return
        Lf:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Slot table is out of sync (expected "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r3 = ", got "
            r2.append(r3)
            r2.append(r0)
            r3 = 41
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            i0.m.a(r2)
            return
    }
}
