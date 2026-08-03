package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends k.g {
    public final f.z R;
    public final f.z S;
    public s1.t T;
    public qg.e1 U;
    public qg.e1 V;
    public boolean W;
    public boolean X;
    public long Y;
    public boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public p1.b f6907a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public qg.e1 f6908b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public qg.e1 f6909c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f6910d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f6911e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public long f6912f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f6913g0;

    public b0(fg.a r9, n.k r10) {
            r8 = this;
            r5 = 0
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 1
            r0 = r8
            r7 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            int r9 = f.n.f2873a
            f.z r9 = new f.z
            r10 = 6
            r9.<init>(r10)
            r0.R = r9
            f.z r9 = new f.z
            r9.<init>(r10)
            r0.S = r9
            r9 = -1
            r0.Y = r9
            r0.f6912f0 = r9
            return
    }

    public final void A1(boolean r6) {
            r5 = this;
            r0 = -1
            r2 = 0
            r3 = 0
            if (r6 == 0) goto L23
            r5.f6907a0 = r3
            qg.e1 r4 = r5.f6908b0
            if (r4 == 0) goto Lf
            r4.a(r3)
        Lf:
            r5.f6908b0 = r3
            qg.e1 r4 = r5.f6909c0
            if (r4 == 0) goto L18
            r4.a(r3)
        L18:
            r5.f6909c0 = r3
            r5.f6910d0 = r2
            r5.f6911e0 = r2
            r5.f6912f0 = r0
            r5.f6913g0 = r2
            goto L3f
        L23:
            r5.T = r3
            qg.e1 r4 = r5.U
            if (r4 == 0) goto L2c
            r4.a(r3)
        L2c:
            r5.U = r3
            qg.e1 r4 = r5.V
            if (r4 == 0) goto L35
            r4.a(r3)
        L35:
            r5.V = r3
            r5.W = r2
            r5.X = r2
            r5.Y = r0
            r5.Z = r2
        L3f:
            r5.r1(r6)
            return
    }

    public final void B1(long r3, p1.b r5) {
            r2 = this;
            boolean r0 = r2.B
            if (r0 == 0) goto L1e
            boolean r0 = r2.f6913g0
            if (r0 != 0) goto L1e
            long r0 = r5.f10078c
            r5 = 1
            r2.s1(r0, r5)
            r2.f6912f0 = r3
            boolean r3 = r2.f6911e0
            if (r3 != 0) goto L1e
            boolean r3 = r2.f6910d0
            if (r3 == 0) goto L19
            goto L1e
        L19:
            fg.a r3 = r2.C
            r3.invoke()
        L1e:
            r3 = 0
            r2.f6907a0 = r3
            r4 = 0
            r2.f6913g0 = r4
            r2.f6910d0 = r4
            qg.e1 r5 = r2.f6908b0
            if (r5 == 0) goto L2d
            r5.a(r3)
        L2d:
            r2.f6908b0 = r3
            r2.f6911e0 = r4
            return
    }

    public final void C1(long r5, s1.t r7) {
            r4 = this;
            boolean r0 = r4.B
            r1 = 0
            if (r0 == 0) goto L1e
            boolean r0 = r4.Z
            if (r0 != 0) goto L1e
            long r2 = r7.f12293c
            r4.s1(r2, r1)
            r4.Y = r5
            boolean r5 = r4.X
            if (r5 != 0) goto L1e
            boolean r5 = r4.W
            if (r5 == 0) goto L19
            goto L1e
        L19:
            fg.a r5 = r4.C
            r5.invoke()
        L1e:
            r5 = 0
            r4.T = r5
            r4.Z = r1
            r4.W = r1
            qg.e1 r6 = r4.U
            if (r6 == 0) goto L2c
            r6.a(r5)
        L2c:
            r4.U = r5
            r4.X = r1
            return
    }

    public final void D1() {
            r23 = this;
            r0 = r23
            f.z r1 = r0.R
            java.lang.Object[] r2 = r1.f2927c
            long[] r3 = r1.f2925a
            int r4 = r3.length
            int r4 = r4 + (-2)
            r9 = 7
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r12 = 8
            r13 = 0
            if (r4 < 0) goto L68
            r14 = r13
            r15 = 128(0x80, double:6.3E-322)
        L19:
            r5 = r3[r14]
            r17 = 255(0xff, double:1.26E-321)
            long r7 = ~r5
            long r7 = r7 << r9
            long r7 = r7 & r5
            long r7 = r7 & r10
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 == 0) goto L5b
            int r7 = r14 - r4
            int r7 = ~r7
            int r7 = r7 >>> 31
            int r7 = 8 - r7
            r8 = r13
        L2d:
            if (r8 >= r7) goto L54
            long r19 = r5 & r17
            int r19 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r19 >= 0) goto L48
            int r19 = r14 << 3
            int r19 = r19 + r8
            r19 = r2[r19]
            r20 = r9
            r9 = r19
            qg.r0 r9 = (qg.r0) r9
            r21 = r10
            r10 = 0
            r9.a(r10)
            goto L4c
        L48:
            r20 = r9
            r21 = r10
        L4c:
            long r5 = r5 >> r12
            int r8 = r8 + 1
            r9 = r20
            r10 = r21
            goto L2d
        L54:
            r20 = r9
            r21 = r10
            if (r7 != r12) goto L70
            goto L5f
        L5b:
            r20 = r9
            r21 = r10
        L5f:
            if (r14 == r4) goto L70
            int r14 = r14 + 1
            r9 = r20
            r10 = r21
            goto L19
        L68:
            r20 = r9
            r21 = r10
            r15 = 128(0x80, double:6.3E-322)
            r17 = 255(0xff, double:1.26E-321)
        L70:
            r1.a()
            f.z r1 = r0.S
            java.lang.Object[] r2 = r1.f2927c
            long[] r3 = r1.f2925a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto Lb2
            r5 = r13
        L7f:
            r6 = r3[r5]
            long r8 = ~r6
            long r8 = r8 << r20
            long r8 = r8 & r6
            long r8 = r8 & r21
            int r8 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r8 == 0) goto Lad
            int r8 = r5 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r9 = r13
        L93:
            if (r9 >= r8) goto Lab
            long r10 = r6 & r17
            int r10 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r10 < 0) goto L9f
            long r6 = r6 >> r12
            int r9 = r9 + 1
            goto L93
        L9f:
            int r1 = r5 << 3
            int r1 = r1 + r9
            r1 = r2[r1]
            k.a0 r1 = (k.a0) r1
            r1.getClass()
            r1 = 0
            throw r1
        Lab:
            if (r8 != r12) goto Lb2
        Lad:
            if (r5 == r4) goto Lb2
            int r5 = r5 + 1
            goto L7f
        Lb2:
            r1.a()
            return
    }

    @Override // k.g, x1.w1
    public final void P(s1.k r7, s1.l r8, long r9) {
            r6 = this;
            super.P(r7, r8, r9)
            s1.l r0 = s1.l.f12275h
            r1 = 0
            if (r8 != r0) goto Lec
            s1.t r8 = r6.T
            if (r8 != 0) goto L59
            r8 = 1
            boolean r9 = m.y2.e(r7, r8)
            if (r9 == 0) goto L11c
            java.lang.Object r7 = r7.f12262a
            java.lang.Object r7 = r7.get(r1)
            s1.t r7 = (s1.t) r7
            r7.a()
            r6.T = r7
            boolean r9 = r6.B
            if (r9 == 0) goto L11c
            qg.e1 r9 = r6.V
            if (r9 == 0) goto L53
            boolean r9 = r9.b()
            if (r9 != r8) goto L53
            i0.m2 r9 = y1.h1.f21958t
            java.lang.Object r9 = x1.k.h(r6, r9)
            y1.l2 r9 = (y1.l2) r9
            r9.getClass()
            long r9 = r7.f12292b
            long r2 = r6.Y
            long r9 = r9 - r2
            r2 = 40
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 >= 0) goto L47
            r6.Z = r8
            return
        L47:
            r6.W = r8
            qg.e1 r8 = r6.V
            r9 = 0
            if (r8 == 0) goto L51
            r8.a(r9)
        L51:
            r6.V = r9
        L53:
            r6.X = r1
            r6.u1(r7)
            return
        L59:
            int r8 = r7.f12264c
            java.lang.Object r7 = r7.f12262a
            boolean r8 = r6.X
            if (r8 == 0) goto L9d
            int r8 = r7.size()
            r9 = r1
        L66:
            if (r9 >= r8) goto L89
            java.lang.Object r10 = r7.get(r9)
            s1.t r10 = (s1.t) r10
            boolean r10 = s1.s.d(r10)
            if (r10 != 0) goto L86
            int r8 = r7.size()
        L78:
            if (r1 >= r8) goto L11c
            java.lang.Object r9 = r7.get(r1)
            s1.t r9 = (s1.t) r9
            r9.a()
            int r1 = r1 + 1
            goto L78
        L86:
            int r9 = r9 + 1
            goto L66
        L89:
            java.lang.Object r7 = r7.get(r1)
            s1.t r7 = (s1.t) r7
            r7.a()
            long r7 = r7.f12292b
            s1.t r9 = r6.T
            r9.getClass()
            r6.C1(r7, r9)
            return
        L9d:
            int r8 = r7.size()
            r0 = r1
        La2:
            if (r0 >= r8) goto Ld8
            java.lang.Object r2 = r7.get(r0)
            s1.t r2 = (s1.t) r2
            boolean r2 = s1.s.c(r2)
            if (r2 != 0) goto Ld5
            long r2 = r6.q1(r9)
            int r8 = r7.size()
            r0 = r1
        Lb9:
            if (r0 >= r8) goto L11c
            java.lang.Object r4 = r7.get(r0)
            s1.t r4 = (s1.t) r4
            boolean r5 = r4.b()
            if (r5 != 0) goto Ld1
            boolean r4 = s1.s.f(r4, r9, r2)
            if (r4 == 0) goto Lce
            goto Ld1
        Lce:
            int r0 = r0 + 1
            goto Lb9
        Ld1:
            r6.A1(r1)
            return
        Ld5:
            int r0 = r0 + 1
            goto La2
        Ld8:
            java.lang.Object r7 = r7.get(r1)
            s1.t r7 = (s1.t) r7
            r7.a()
            long r7 = r7.f12292b
            s1.t r9 = r6.T
            r9.getClass()
            r6.C1(r7, r9)
            return
        Lec:
            s1.l r9 = s1.l.f12276i
            if (r8 != r9) goto L11c
            s1.t r8 = r6.T
            if (r8 == 0) goto L11c
            boolean r8 = r6.X
            if (r8 != 0) goto L11c
            java.lang.Object r7 = r7.f12262a
            int r8 = r7.size()
            r9 = r1
        Lff:
            if (r9 >= r8) goto L11c
            java.lang.Object r10 = r7.get(r9)
            s1.t r10 = (s1.t) r10
            boolean r0 = r10.b()
            if (r0 == 0) goto L119
            s1.t r0 = r6.T
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L119
            r6.A1(r1)
            return
        L119:
            int r9 = r9 + 1
            goto Lff
        L11c:
            return
    }

    @Override // p1.c
    public final void T0(ac.k r10, s1.l r11) {
            r9 = this;
            java.lang.Object r10 = r10.f178i
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            r9.v1()
            boolean r0 = r9.B
            if (r0 == 0) goto L19
            k.l0 r0 = r9.G
            if (r0 != 0) goto L19
            k.l0 r0 = new k.l0
            r0.<init>(r9)
            r9.k1(r0)
            r9.G = r0
        L19:
            s1.l r0 = s1.l.f12275h
            r1 = 1
            r2 = 0
            if (r11 != r0) goto L12e
            p1.b r11 = r9.f6907a0
            if (r11 != 0) goto L7c
            int r11 = r10.size()
            r0 = r2
        L28:
            if (r0 >= r11) goto L159
            java.lang.Object r3 = r10.get(r0)
            p1.b r3 = (p1.b) r3
            boolean r3 = ac.p.j(r3)
            if (r3 == 0) goto L79
            java.lang.Object r10 = r10.get(r2)
            p1.b r10 = (p1.b) r10
            r10.f10084i = r1
            r9.f6907a0 = r10
            boolean r11 = r9.B
            if (r11 == 0) goto L159
            qg.e1 r11 = r9.f6909c0
            if (r11 == 0) goto L73
            boolean r11 = r11.b()
            if (r11 != r1) goto L73
            i0.m2 r11 = y1.h1.f21958t
            java.lang.Object r11 = x1.k.h(r9, r11)
            y1.l2 r11 = (y1.l2) r11
            r11.getClass()
            long r3 = r10.f10077b
            long r5 = r9.f6912f0
            long r3 = r3 - r5
            r5 = 40
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 >= 0) goto L67
            r9.f6913g0 = r1
            return
        L67:
            r9.f6910d0 = r1
            qg.e1 r11 = r9.f6909c0
            r0 = 0
            if (r11 == 0) goto L71
            r11.a(r0)
        L71:
            r9.f6909c0 = r0
        L73:
            r9.f6911e0 = r2
            r9.t1(r10)
            return
        L79:
            int r0 = r0 + 1
            goto L28
        L7c:
            boolean r11 = r9.f6911e0
            if (r11 == 0) goto Lbc
            int r11 = r10.size()
            r0 = r2
        L85:
            if (r0 >= r11) goto La9
            java.lang.Object r3 = r10.get(r0)
            p1.b r3 = (p1.b) r3
            boolean r4 = r3.f10083h
            if (r4 == 0) goto L98
            boolean r3 = r3.f10079d
            if (r3 != 0) goto L98
            int r0 = r0 + 1
            goto L85
        L98:
            int r11 = r10.size()
        L9c:
            if (r2 >= r11) goto L159
            java.lang.Object r0 = r10.get(r2)
            p1.b r0 = (p1.b) r0
            r0.f10084i = r1
            int r2 = r2 + 1
            goto L9c
        La9:
            java.lang.Object r10 = r10.get(r2)
            p1.b r10 = (p1.b) r10
            r10.f10084i = r1
            long r10 = r10.f10077b
            p1.b r0 = r9.f6907a0
            r0.getClass()
            r9.B1(r10, r0)
            return
        Lbc:
            int r11 = r10.size()
            r0 = r2
        Lc1:
            if (r0 >= r11) goto L11b
            java.lang.Object r3 = r10.get(r0)
            p1.b r3 = (p1.b) r3
            boolean r4 = r3.f10084i
            if (r4 != 0) goto Ld8
            boolean r4 = r3.f10083h
            if (r4 == 0) goto Ld8
            boolean r3 = r3.f10079d
            if (r3 != 0) goto Ld8
            int r0 = r0 + 1
            goto Lc1
        Ld8:
            i0.m2 r11 = y1.h1.f21958t
            java.lang.Object r11 = x1.k.h(r9, r11)
            y1.l2 r11 = (y1.l2) r11
            float r11 = r11.f()
            int r0 = r10.size()
            r3 = r2
        Le9:
            if (r3 >= r0) goto L159
            java.lang.Object r4 = r10.get(r3)
            p1.b r4 = (p1.b) r4
            long r5 = r4.f10078c
            p1.b r7 = r9.f6907a0
            r7.getClass()
            long r7 = r7.f10078c
            long r5 = e1.b.d(r5, r7)
            float r5 = e1.b.c(r5)
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 <= 0) goto L10c
            r5 = r1
            goto L10d
        L10c:
            r5 = r2
        L10d:
            boolean r4 = r4.f10084i
            if (r4 != 0) goto L117
            if (r5 == 0) goto L114
            goto L117
        L114:
            int r3 = r3 + 1
            goto Le9
        L117:
            r9.A1(r1)
            return
        L11b:
            java.lang.Object r10 = r10.get(r2)
            p1.b r10 = (p1.b) r10
            r10.f10084i = r1
            long r10 = r10.f10077b
            p1.b r0 = r9.f6907a0
            r0.getClass()
            r9.B1(r10, r0)
            return
        L12e:
            s1.l r0 = s1.l.f12276i
            if (r11 != r0) goto L159
            p1.b r11 = r9.f6907a0
            if (r11 == 0) goto L159
            boolean r11 = r9.f6911e0
            if (r11 != 0) goto L159
            int r11 = r10.size()
        L13e:
            if (r2 >= r11) goto L159
            java.lang.Object r0 = r10.get(r2)
            p1.b r0 = (p1.b) r0
            boolean r3 = r0.f10084i
            if (r3 == 0) goto L156
            p1.b r3 = r9.f6907a0
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L156
            r9.A1(r1)
            return
        L156:
            int r2 = r2 + 1
            goto L13e
        L159:
            return
    }

    @Override // k.g, x1.w1
    public final void b0() {
            r1 = this;
            super.b0()
            r0 = 0
            r1.A1(r0)
            return
    }

    @Override // y0.n
    public final void e1() {
            r0 = this;
            r0.D1()
            return
    }

    @Override // k.g
    public final void n1(f2.y r1) {
            r0 = this;
            return
    }

    @Override // k.g
    public final s1.l0 o1() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // k.g
    public final void w1() {
            r0 = this;
            r0.D1()
            return
    }

    @Override // k.g
    public final boolean x1(android.view.KeyEvent r3) {
            r2 = this;
            long r0 = q1.d.b(r3)
            f.z r3 = r2.S
            java.lang.Object r3 = r3.d(r0)
            k.a0 r3 = (k.a0) r3
            r3 = 0
            return r3
    }

    @Override // p1.c
    public final void y0() {
            r1 = this;
            r0 = 1
            r1.A1(r0)
            return
    }

    @Override // k.g
    public final void y1(android.view.KeyEvent r6) {
            r5 = this;
            long r0 = q1.d.b(r6)
            f.z r6 = r5.R
            java.lang.Object r2 = r6.d(r0)
            r3 = 0
            if (r2 == 0) goto L24
            java.lang.Object r2 = r6.d(r0)
            qg.r0 r2 = (qg.r0) r2
            if (r2 == 0) goto L21
            boolean r4 = r2.b()
            if (r4 == 0) goto L20
            r4 = 0
            r2.a(r4)
            goto L21
        L20:
            r3 = 1
        L21:
            r6.f(r0)
        L24:
            if (r3 != 0) goto L2b
            fg.a r6 = r5.C
            r6.invoke()
        L2b:
            return
    }
}
