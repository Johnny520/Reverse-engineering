package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends y0.n implements x1.v, x1.m, x1.z1, x1.w1, w1.c, x1.u1, x1.u, x1.n, d1.g, d1.u, d1.x, x1.s1, c1.a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public y0.m f20832u;

    @Override // x1.m
    public final void B(x1.h0 r2) {
            r1 = this;
            y0.m r0 = r1.f20832u
            r0.getClass()
            c1.g r0 = (c1.g) r0
            r2.e()
            return
    }

    @Override // d1.g
    public final void E(d1.z r2) {
            r1 = this;
            y0.m r2 = r1.f20832u
            java.lang.String r0 = "onFocusEvent called on wrong node"
            u1.a.b(r0)
            r2.getClass()
            java.lang.ClassCastException r2 = new java.lang.ClassCastException
            r2.<init>()
            throw r2
    }

    @Override // x1.v
    public final int G(x1.n0 r6, v1.m0 r7, int r8) {
            r5 = this;
            y0.m r0 = r5.f20832u
            r0.getClass()
            v1.y r0 = (v1.y) r0
            v1.h r1 = new v1.h
            v1.r0 r2 = v1.r0.f14027g
            r3 = 1
            v1.q0 r4 = v1.q0.f14018g
            r1.<init>(r7, r4, r2, r3)
            r7 = 0
            r2 = 7
            long r7 = u2.b.b(r7, r7, r7, r8, r2)
            v1.s r2 = new v1.s
            u2.m r3 = r6.getLayoutDirection()
            r2.<init>(r6, r3)
            v1.o0 r6 = r0.j(r2, r1, r7)
            int r6 = r6.h()
            return r6
    }

    @Override // x1.w1
    public final boolean J0() {
            r1 = this;
            y0.m r0 = r1.f20832u
            r0.getClass()
            s1.a0 r0 = (s1.a0) r0
            hb.c r0 = r0.f12206d
            r0.getClass()
            r0 = 1
            return r0
    }

    @Override // x1.v
    public final int K0(x1.n0 r6, v1.m0 r7, int r8) {
            r5 = this;
            y0.m r0 = r5.f20832u
            r0.getClass()
            v1.y r0 = (v1.y) r0
            v1.h r1 = new v1.h
            v1.r0 r2 = v1.r0.f14028h
            r3 = 1
            v1.q0 r4 = v1.q0.f14018g
            r1.<init>(r7, r4, r2, r3)
            r7 = 0
            r2 = 13
            long r7 = u2.b.b(r7, r8, r7, r7, r2)
            v1.s r2 = new v1.s
            u2.m r3 = r6.getLayoutDirection()
            r2.<init>(r6, r3)
            v1.o0 r6 = r0.j(r2, r1, r7)
            int r6 = r6.g()
            return r6
    }

    @Override // x1.s1
    public final boolean L() {
            r1 = this;
            boolean r0 = r1.f21832t
            return r0
    }

    @Override // x1.w1
    public final void P(s1.k r10, s1.l r11, long r12) {
            r9 = this;
            y0.m r12 = r9.f20832u
            r12.getClass()
            s1.a0 r12 = (s1.a0) r12
            hb.c r12 = r12.f12206d
            java.lang.Object r13 = r12.f5341j
            s1.a0 r13 = (s1.a0) r13
            java.lang.Object r0 = r10.f12262a
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L15:
            r4 = 1
            if (r3 >= r1) goto L2f
            java.lang.Object r5 = r0.get(r3)
            s1.t r5 = (s1.t) r5
            boolean r6 = s1.s.b(r5)
            if (r6 != 0) goto L2d
            boolean r5 = s1.s.d(r5)
            if (r5 != 0) goto L2d
            int r3 = r3 + 1
            goto L15
        L2d:
            r1 = r2
            goto L30
        L2f:
            r1 = r4
        L30:
            if (r1 == 0) goto L4b
            int r3 = r0.size()
            r5 = r2
        L37:
            if (r5 >= r3) goto L49
            java.lang.Object r6 = r0.get(r5)
            s1.t r6 = (s1.t) r6
            boolean r6 = r6.b()
            if (r6 == 0) goto L46
            goto L4b
        L46:
            int r5 = r5 + 1
            goto L37
        L49:
            r3 = r4
            goto L4c
        L4b:
            r3 = r2
        L4c:
            boolean r5 = r13.f12205c
            if (r5 != 0) goto L72
            int r5 = r0.size()
            r6 = r2
        L55:
            if (r6 >= r5) goto L6d
            java.lang.Object r7 = r0.get(r6)
            s1.t r7 = (s1.t) r7
            boolean r8 = s1.s.b(r7)
            if (r8 != 0) goto L72
            boolean r7 = s1.s.d(r7)
            if (r7 == 0) goto L6a
            goto L72
        L6a:
            int r6 = r6 + 1
            goto L55
        L6d:
            if (r3 == 0) goto L70
            goto L72
        L70:
            r3 = r2
            goto L73
        L72:
            r3 = r4
        L73:
            java.lang.Object r5 = r12.f5339h
            s1.y r5 = (s1.y) r5
            s1.y r6 = s1.y.f12326i
            s1.l r7 = s1.l.f12276i
            if (r5 == r6) goto Lca
            s1.l r5 = s1.l.f12274g
            if (r11 != r5) goto L92
            if (r3 == 0) goto L92
            r12.f5340i = r10
            if (r1 == 0) goto L8e
            boolean r5 = r13.f12205c
            if (r5 == 0) goto L8c
            goto L8e
        L8c:
            r5 = r2
            goto L8f
        L8e:
            r5 = r4
        L8f:
            r12.f(r10, r5)
        L92:
            s1.l r5 = s1.l.f12275h
            if (r11 != r5) goto Lb9
            if (r1 == 0) goto Lb9
            java.lang.Object r5 = r12.f5340i
            s1.k r5 = (s1.k) r5
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto Lb9
            boolean r5 = r13.f12205c
            if (r5 == 0) goto Lb9
            int r5 = r0.size()
            r6 = r2
        Lab:
            if (r6 >= r5) goto Lb9
            java.lang.Object r8 = r0.get(r6)
            s1.t r8 = (s1.t) r8
            r8.a()
            int r6 = r6 + 1
            goto Lab
        Lb9:
            if (r11 != r7) goto Lca
            if (r3 != 0) goto Lca
            java.lang.Object r3 = r12.f5340i
            s1.k r3 = (s1.k) r3
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto Lca
            r12.f(r10, r4)
        Lca:
            if (r11 != r7) goto L12c
            int r11 = r0.size()
            r3 = r2
        Ld1:
            if (r3 >= r11) goto Le3
            java.lang.Object r4 = r0.get(r3)
            s1.t r4 = (s1.t) r4
            boolean r4 = s1.s.d(r4)
            if (r4 != 0) goto Le0
            goto Lf0
        Le0:
            int r3 = r3 + 1
            goto Ld1
        Le3:
            s1.y r11 = s1.y.f12324g
            r12.f5339h = r11
            java.lang.Object r11 = r12.f5341j
            s1.a0 r11 = (s1.a0) r11
            r11.f12205c = r2
            r11 = 0
            r12.f5340i = r11
        Lf0:
            java.lang.Object r11 = r12.f5340i
            s1.k r11 = (s1.k) r11
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L12c
            if (r1 == 0) goto L12c
            int r11 = r0.size()
            r1 = r2
        L101:
            if (r1 >= r11) goto L11a
            java.lang.Object r3 = r0.get(r1)
            s1.t r3 = (s1.t) r3
            boolean r3 = r3.b()
            if (r3 == 0) goto L117
            boolean r11 = r13.f12205c
            if (r11 != 0) goto L11a
            r12.z(r10)
            return
        L117:
            int r1 = r1 + 1
            goto L101
        L11a:
            int r10 = r0.size()
        L11e:
            if (r2 >= r10) goto L12c
            java.lang.Object r11 = r0.get(r2)
            s1.t r11 = (s1.t) r11
            r11.a()
            int r2 = r2 + 1
            goto L11e
        L12c:
            return
    }

    @Override // x1.v
    public final int Q(x1.n0 r6, v1.m0 r7, int r8) {
            r5 = this;
            y0.m r0 = r5.f20832u
            r0.getClass()
            v1.y r0 = (v1.y) r0
            v1.h r1 = new v1.h
            v1.r0 r2 = v1.r0.f14027g
            r3 = 1
            v1.q0 r4 = v1.q0.f14019h
            r1.<init>(r7, r4, r2, r3)
            r7 = 0
            r2 = 7
            long r7 = u2.b.b(r7, r7, r7, r8, r2)
            v1.s r2 = new v1.s
            u2.m r3 = r6.getLayoutDirection()
            r2.<init>(r6, r3)
            v1.o0 r6 = r0.j(r2, r1, r7)
            int r6 = r6.h()
            return r6
    }

    @Override // x1.u1
    public final java.lang.Object R(u2.c r1, java.lang.Object r2) {
            r0 = this;
            y0.m r1 = r0.f20832u
            r1.getClass()
            v1.x0 r1 = (v1.x0) r1
            java.lang.Object r1 = r1.c()
            return r1
    }

    @Override // x1.v
    public final int R0(x1.n0 r6, v1.m0 r7, int r8) {
            r5 = this;
            y0.m r0 = r5.f20832u
            r0.getClass()
            v1.y r0 = (v1.y) r0
            v1.h r1 = new v1.h
            v1.r0 r2 = v1.r0.f14028h
            r3 = 1
            v1.q0 r4 = v1.q0.f14019h
            r1.<init>(r7, r4, r2, r3)
            r7 = 0
            r2 = 13
            long r7 = u2.b.b(r7, r8, r7, r7, r2)
            v1.s r2 = new v1.s
            u2.m r3 = r6.getLayoutDirection()
            r2.<init>(r6, r3)
            v1.o0 r6 = r0.j(r2, r1, r7)
            int r6 = r6.g()
            return r6
    }

    @Override // x1.z1
    public final void X0(f2.y r18) {
            r17 = this;
            r0 = r17
            y0.m r1 = r0.f20832u
            r1.getClass()
            f2.n r1 = (f2.n) r1
            f2.m r1 = r1.e()
            r18.getClass()
            r2 = r18
            f2.m r2 = (f2.m) r2
            f.k0 r3 = r2.f3204g
            boolean r4 = r1.f3206i
            r5 = 1
            if (r4 == 0) goto L1d
            r2.f3206i = r5
        L1d:
            boolean r4 = r1.f3207j
            if (r4 == 0) goto L23
            r2.f3207j = r5
        L23:
            f.k0 r1 = r1.f3204g
            java.lang.Object[] r2 = r1.f2849b
            java.lang.Object[] r4 = r1.f2850c
            long[] r1 = r1.f2848a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto La3
            r7 = 0
        L31:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L9e
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L4b:
            if (r12 >= r10) goto L9b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L92
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            r13 = r4[r13]
            f2.x r14 = (f2.x) r14
            boolean r15 = r3.b(r14)
            if (r15 != 0) goto L69
            r3.m(r14, r13)
            goto L92
        L69:
            boolean r15 = r13 instanceof f2.a
            if (r15 == 0) goto L92
            java.lang.Object r15 = r3.g(r14)
            r15.getClass()
            f2.a r15 = (f2.a) r15
            f2.a r6 = new f2.a
            r16 = r11
            java.lang.String r11 = r15.f3137a
            if (r11 != 0) goto L83
            r11 = r13
            f2.a r11 = (f2.a) r11
            java.lang.String r11 = r11.f3137a
        L83:
            sf.b r15 = r15.f3138b
            if (r15 != 0) goto L8b
            f2.a r13 = (f2.a) r13
            sf.b r15 = r13.f3138b
        L8b:
            r6.<init>(r11, r15)
            r3.m(r14, r6)
            goto L94
        L92:
            r16 = r11
        L94:
            long r8 = r8 >> r16
            int r12 = r12 + 1
            r11 = r16
            goto L4b
        L9b:
            r6 = r11
            if (r10 != r6) goto La3
        L9e:
            if (r7 == r5) goto La3
            int r7 = r7 + 1
            goto L31
        La3:
            return
    }

    @Override // c1.a
    public final long a() {
            r2 = this;
            r0 = 128(0x80, float:1.8E-43)
            x1.i1 r0 = x1.k.t(r2, r0)
            long r0 = r0.f13902i
            long r0 = r9.e0.q0(r0)
            return r0
    }

    @Override // x1.w1
    public final void b0() {
            r12 = this;
            y0.m r0 = r12.f20832u
            r0.getClass()
            s1.a0 r0 = (s1.a0) r0
            hb.c r0 = r0.f12206d
            java.lang.Object r1 = r0.f5339h
            s1.y r1 = (s1.y) r1
            java.lang.Object r2 = r0.f5341j
            s1.a0 r2 = (s1.a0) r2
            s1.y r3 = s1.y.f12325h
            if (r1 != r3) goto L3b
            long r4 = android.os.SystemClock.uptimeMillis()
            s1.z r1 = new s1.z
            r3 = 0
            r1.<init>(r2, r3)
            r10 = 0
            r11 = 0
            r8 = 3
            r9 = 0
            r6 = r4
            android.view.MotionEvent r3 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
            r4 = 0
            r3.setSource(r4)
            r1.invoke(r3)
            r3.recycle()
            s1.y r1 = s1.y.f12324g
            r0.f5339h = r1
            r2.f12205c = r4
            r1 = 0
            r0.f5340i = r1
        L3b:
            return
    }

    @Override // y0.n
    public final void c1() {
            r1 = this;
            r0 = 1
            r1.k1(r0)
            return
    }

    @Override // c1.a
    public final u2.c d() {
            r1 = this;
            x1.f0 r0 = x1.k.w(r1)
            u2.c r0 = r0.E
            return r0
    }

    @Override // y0.n
    public final void d1() {
            r1 = this;
            boolean r0 = r1.f21832t
            if (r0 != 0) goto L9
            java.lang.String r0 = "unInitializeModifier called on unattached node"
            u1.a.b(r0)
        L9:
            int r0 = r1.f21821i
            r0 = r0 & 8
            if (r0 == 0) goto L18
            x1.r1 r0 = x1.k.x(r1)
            y1.t r0 = (y1.t) r0
            r0.E()
        L18:
            return
    }

    @Override // x1.u, x1.w0
    public final void e(long r1) {
            r0 = this;
            return
    }

    @Override // x1.m
    public final void g0() {
            r0 = this;
            x1.k.l(r0)
            return
    }

    @Override // c1.a
    public final u2.m getLayoutDirection() {
            r1 = this;
            x1.f0 r0 = x1.k.w(r1)
            u2.m r0 = r0.F
            return r0
    }

    @Override // x1.w1
    public final void h0() {
            r1 = this;
            y0.m r0 = r1.f20832u
            r0.getClass()
            s1.a0 r0 = (s1.a0) r0
            hb.c r0 = r0.f12206d
            r0.getClass()
            return
    }

    @Override // x1.v
    public final v1.o0 j(v1.p0 r2, v1.m0 r3, long r4) {
            r1 = this;
            y0.m r0 = r1.f20832u
            r0.getClass()
            v1.y r0 = (v1.y) r0
            v1.o0 r2 = r0.j(r2, r3, r4)
            return r2
    }

    public final void k1(boolean r5) {
            r4 = this;
            boolean r0 = r4.f21832t
            if (r0 != 0) goto L9
            java.lang.String r0 = "initializeModifier called on unattached node"
            u1.a.b(r0)
        L9:
            y0.m r0 = r4.f20832u
            int r1 = r4.f21821i
            r1 = r1 & 4
            r2 = 2
            if (r1 == 0) goto L1b
            if (r5 != 0) goto L1b
            x1.i1 r1 = x1.k.t(r4, r2)
            r1.y1()
        L1b:
            int r1 = r4.f21821i
            r1 = r1 & r2
            if (r1 == 0) goto L53
            x1.f0 r1 = x1.k.w(r4)
            x1.b1 r1 = r1.L
            x1.b2 r1 = r1.f20843e
            r1.getClass()
            boolean r1 = r1.f20849u
            if (r1 == 0) goto L43
            x1.i1 r1 = r4.f21826n
            r1.getClass()
            r3 = r1
            x1.x r3 = (x1.x) r3
            r3.U1(r4)
            x1.q1 r1 = r1.R
            if (r1 == 0) goto L43
            y1.o1 r1 = (y1.o1) r1
            r1.c()
        L43:
            if (r5 != 0) goto L53
            x1.i1 r5 = x1.k.t(r4, r2)
            r5.y1()
            x1.f0 r5 = x1.k.w(r4)
            r5.D()
        L53:
            boolean r5 = r0 instanceof r.v
            if (r5 == 0) goto L62
            r5 = r0
            r.v r5 = (r.v) r5
            x1.f0 r1 = x1.k.w(r4)
            r.z r5 = r5.f11269a
            r5.f11291l = r1
        L62:
            int r5 = r4.f21821i
            r1 = r5 & 16
            if (r1 == 0) goto L74
            boolean r1 = r0 instanceof s1.a0
            if (r1 == 0) goto L74
            s1.a0 r0 = (s1.a0) r0
            hb.c r0 = r0.f12206d
            x1.i1 r1 = r4.f21826n
            r0.f5338g = r1
        L74:
            r5 = r5 & 8
            if (r5 == 0) goto L81
            x1.r1 r5 = x1.k.x(r4)
            y1.t r5 = (y1.t) r5
            r5.E()
        L81:
            return
    }

    @Override // x1.i
    public final void m() {
            r1 = this;
            y0.m r0 = r1.f20832u
            boolean r0 = r0 instanceof s1.a0
            if (r0 == 0) goto L9
            r1.b0()
        L9:
            return
    }

    @Override // w1.c
    public final w1.a o0() {
            r1 = this;
            w1.a r0 = w1.a.f14841a
            return r0
    }

    @Override // x1.u
    public final void p0(v1.t r1) {
            r0 = this;
            return
    }

    @Override // d1.u
    public final void r0(d1.r r2) {
            r1 = this;
            y0.m r2 = r1.f20832u
            java.lang.String r0 = "applyFocusProperties called on wrong node"
            u1.a.b(r0)
            r2.getClass()
            java.lang.ClassCastException r2 = new java.lang.ClassCastException
            r2.<init>()
            throw r2
    }

    public final java.lang.String toString() {
            r1 = this;
            y0.m r0 = r1.f20832u
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // x1.n
    public final void w(x1.i1 r1) {
            r0 = this;
            y0.m r1 = r0.f20832u
            r1.getClass()
            java.lang.ClassCastException r1 = new java.lang.ClassCastException
            r1.<init>()
            throw r1
    }
}
