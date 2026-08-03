package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 extends m.p0 implements q1.e, x1.z1 {
    public k.k1 P;
    public m.p Q;
    public final r1.d R;
    public final m.p S;
    public final m.o2 T;
    public final fd.h U;
    public final d1.b0 V;
    public final m.k W;
    public b0.t X;
    public m.f2 Y;
    public m.l1 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public m.d3 f8185a0;

    public h2(k.k1 r11, m.p r12, m.p1 r13, m.i2 r14, n.k r15, boolean r16, boolean r17) {
            r10 = this;
            r9 = r16
            i2.z r0 = m.a2.f8073a
            r10.<init>(r0, r9, r15, r13)
            r10.P = r11
            r10.Q = r12
            r1.d r6 = new r1.d
            r6.<init>()
            r10.R = r6
            m.p r0 = new m.p
            m.y1 r1 = m.a2.f8076d
            androidx.lifecycle.x r2 = new androidx.lifecycle.x
            r2.<init>(r1)
            i.u r1 = new i.u
            r1.<init>(r2)
            r0.<init>(r1)
            r10.S = r0
            k.k1 r2 = r10.P
            m.p r1 = r10.Q
            if (r1 != 0) goto L2d
            r3 = r0
            goto L2e
        L2d:
            r3 = r1
        L2e:
            m.o2 r0 = new m.o2
            m.c2 r8 = new m.c2
            r1 = 0
            r8.<init>(r10, r1)
            r7 = r10
            r4 = r13
            r1 = r14
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.T = r0
            fd.h r1 = new fd.h
            r1.<init>(r0, r9)
            r10.U = r1
            d1.b0 r2 = new d1.b0
            r3 = 10
            r5 = 2
            r8 = 0
            r2.<init>(r5, r8, r3)
            r10.k1(r2)
            r10.V = r2
            m.k r2 = new m.k
            m.c2 r3 = new m.c2
            r5 = 1
            r3.<init>(r10, r5)
            r5 = r17
            r2.<init>(r13, r0, r5, r3)
            r10.k1(r2)
            r10.W = r2
            r1.i r0 = new r1.i
            r0.<init>(r1, r6)
            r10.k1(r0)
            t.h r0 = new t.h
            r0.<init>()
            r0.f12970u = r2
            r10.k1(r0)
            return
    }

    @Override // q1.e
    public final boolean C(android.view.KeyEvent r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // m.p0
    public final boolean C1() {
            r2 = this;
            m.o2 r0 = r2.T
            m.i2 r1 = r0.f8305a
            boolean r1 = r1.a()
            if (r1 != 0) goto L19
            k.k1 r0 = r0.f8306b
            r1 = 0
            if (r0 == 0) goto L14
            boolean r0 = r0.d()
            goto L15
        L14:
            r0 = r1
        L15:
            if (r0 == 0) goto L18
            goto L19
        L18:
            return r1
        L19:
            r0 = 1
            return r0
    }

    public final void F1(k.k1 r11, m.p r12, m.p1 r13, m.i2 r14, n.k r15, boolean r16, boolean r17) {
            r10 = this;
            r2 = r16
            r3 = r17
            boolean r4 = r10.f8322y
            r5 = 1
            r6 = 0
            if (r4 == r2) goto L10
            fd.h r4 = r10.U
            r4.f3918g = r2
            r7 = r5
            goto L11
        L10:
            r7 = r6
        L11:
            if (r12 != 0) goto L16
            m.p r4 = r10.S
            goto L17
        L16:
            r4 = r12
        L17:
            m.o2 r8 = r10.T
            m.i2 r9 = r8.f8305a
            boolean r9 = gg.l.a(r9, r14)
            if (r9 != 0) goto L24
            r8.f8305a = r14
            r6 = r5
        L24:
            r8.f8306b = r11
            m.p1 r1 = r8.f8308d
            if (r1 == r13) goto L2d
            r8.f8308d = r13
            r6 = r5
        L2d:
            boolean r1 = r8.f8309e
            if (r1 == r3) goto L34
            r8.f8309e = r3
            goto L35
        L34:
            r5 = r6
        L35:
            r8.f8307c = r4
            r1.d r1 = r10.R
            r8.f8310f = r1
            m.k r1 = r10.W
            r1.f8233u = r13
            r1.f8235w = r3
            r10.P = r11
            r10.Q = r12
            i2.z r1 = m.a2.f8073a
            m.p1 r11 = r8.f8308d
            m.p1 r12 = m.p1.f8324g
            if (r11 != r12) goto L51
        L4d:
            r0 = r10
            r4 = r12
            r3 = r15
            goto L54
        L51:
            m.p1 r12 = m.p1.f8325h
            goto L4d
        L54:
            r0.E1(r1, r2, r3, r4, r5)
            if (r7 == 0) goto L61
            r11 = 0
            r10.X = r11
            r10.Y = r11
            x1.k.n(r10)
        L61:
            return
    }

    @Override // m.p0, x1.w1
    public final void P(s1.k r20, s1.l r21, long r22) {
            r19 = this;
            r2 = r19
            r8 = r20
            r9 = r21
            java.lang.Object r10 = r8.f12262a
            int r0 = r10.size()
            r1 = 0
        Ld:
            if (r1 >= r0) goto L31
            java.lang.Object r3 = r10.get(r1)
            s1.t r3 = (s1.t) r3
            fg.l r4 = r2.f8321x
            int r3 = r3.f12299i
            s1.d0 r5 = new s1.d0
            r5.<init>(r3)
            java.lang.Object r3 = r4.invoke(r5)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L2e
            super.P(r20, r21, r22)
            goto L31
        L2e:
            int r1 = r1 + 1
            goto Ld
        L31:
            k.l0 r0 = r2.A
            if (r0 != 0) goto L3f
            k.l0 r0 = new k.l0
            r0.<init>(r2)
            r2.k1(r0)
            r2.A = r0
        L3f:
            boolean r0 = r2.f8322y
            if (r0 == 0) goto L17c
            s1.l r13 = s1.l.f12274g
            r14 = 0
            m.o2 r15 = r2.T
            r0 = 6
            if (r9 != r13) goto La6
            int r1 = r8.f12267f
            if (r1 != r0) goto La6
            m.l1 r1 = r2.Z
            if (r1 != 0) goto L8c
            m.l1 r1 = new m.l1
            m.a r3 = new m.a
            android.view.View r4 = x1.k.y(r2)
            android.content.Context r4 = r4.getContext()
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            r5 = 0
            r3.<init>(r4, r5)
            r4 = r0
            m.d2 r0 = new m.d2
            r6 = 4
            r7 = 0
            r5 = r1
            r1 = 2
            r16 = r3
            java.lang.Class<m.h2> r3 = m.h2.class
            r17 = r4
            java.lang.String r4 = "onWheelScrollStopped"
            r18 = r5
            java.lang.String r5 = "onWheelScrollStopped-TH1AsA0(J)V"
            r12 = r16
            r11 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            x1.f0 r1 = x1.k.w(r2)
            u2.c r1 = r1.E
            r11.<init>(r15, r12, r0, r1)
            r2.Z = r11
        L8c:
            m.l1 r0 = r2.Z
            if (r0 == 0) goto La6
            qg.t r1 = r2.Y0()
            qg.e1 r3 = r0.f8256h
            if (r3 != 0) goto La6
            ci.j r3 = new ci.j
            r4 = 9
            r3.<init>(r0, r14, r4)
            r4 = 3
            qg.e1 r1 = qg.v.q(r1, r14, r3, r4)
            r0.f8256h = r1
        La6:
            m.l1 r0 = r2.Z
            s1.l r11 = s1.l.f12275h
            if (r0 == 0) goto Le3
            int r1 = r8.f12267f
            r4 = 6
            if (r1 != r4) goto Le3
            int r1 = r10.size()
            r3 = 0
        Lb6:
            if (r3 >= r1) goto Lc8
            java.lang.Object r4 = r10.get(r3)
            s1.t r4 = (s1.t) r4
            boolean r4 = r4.b()
            if (r4 == 0) goto Lc5
            goto Le3
        Lc5:
            int r3 = r3 + 1
            goto Lb6
        Lc8:
            if (r9 != r13) goto Ld4
            boolean r1 = r0.f8303d
            if (r1 == 0) goto Ld4
            r0.f(r8)
            m.o1.a(r8)
        Ld4:
            if (r9 != r11) goto Le3
            boolean r1 = r0.f8303d
            if (r1 != 0) goto Le3
            boolean r0 = r0.f(r8)
            if (r0 == 0) goto Le3
            m.o1.a(r8)
        Le3:
            r12 = 12
            r0 = 11
            r1 = 10
            if (r9 != r13) goto L136
            int r3 = r8.f12267f
            if (r3 != r1) goto Lf0
            goto Lf5
        Lf0:
            if (r3 != r0) goto Lf3
            goto Lf5
        Lf3:
            if (r3 != r12) goto L136
        Lf5:
            m.d3 r3 = r2.f8185a0
            if (r3 != 0) goto L11e
            m.d3 r3 = new m.d3
            r4 = r0
            m.d2 r0 = new m.d2
            r6 = 4
            r7 = 1
            r5 = r1
            r1 = 2
            r16 = r3
            java.lang.Class<m.h2> r3 = m.h2.class
            r17 = r4
            java.lang.String r4 = "onTrackpadScrollStopped"
            r18 = r5
            java.lang.String r5 = "onTrackpadScrollStopped-TH1AsA0(J)V"
            r12 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            x1.f0 r1 = x1.k.w(r2)
            u2.c r1 = r1.E
            r12.<init>(r15, r0, r1)
            r2.f8185a0 = r12
        L11e:
            m.d3 r0 = r2.f8185a0
            if (r0 == 0) goto L136
            qg.t r1 = r2.Y0()
            qg.e1 r3 = r0.f8120g
            if (r3 != 0) goto L136
            ci.e r3 = new ci.e
            r3.<init>(r0, r14)
            r4 = 3
            qg.e1 r1 = qg.v.q(r1, r14, r3, r4)
            r0.f8120g = r1
        L136:
            m.d3 r0 = r2.f8185a0
            if (r0 == 0) goto L17c
            int r1 = r8.f12267f
            r5 = 10
            if (r1 != r5) goto L141
            goto L14a
        L141:
            r4 = 11
            if (r1 != r4) goto L146
            goto L14a
        L146:
            r3 = 12
            if (r1 != r3) goto L17c
        L14a:
            int r1 = r10.size()
            r3 = 0
        L14f:
            if (r3 >= r1) goto L161
            java.lang.Object r4 = r10.get(r3)
            s1.t r4 = (s1.t) r4
            boolean r4 = r4.b()
            if (r4 == 0) goto L15e
            goto L17c
        L15e:
            int r3 = r3 + 1
            goto L14f
        L161:
            if (r9 != r13) goto L16d
            boolean r1 = r0.f8303d
            if (r1 == 0) goto L16d
            r0.d(r8)
            m.o1.a(r8)
        L16d:
            if (r9 != r11) goto L17c
            boolean r1 = r0.f8303d
            if (r1 != 0) goto L17c
            boolean r0 = r0.d(r8)
            if (r0 == 0) goto L17c
            m.o1.a(r8)
        L17c:
            return
    }

    @Override // q1.e
    public final boolean W(android.view.KeyEvent r11) {
            r10 = this;
            boolean r0 = r10.f8322y
            r1 = 0
            if (r0 == 0) goto La6
            long r2 = q1.d.b(r11)
            long r4 = q1.a.D
            boolean r0 = q1.a.a(r2, r4)
            if (r0 != 0) goto L21
            int r0 = r11.getKeyCode()
            long r2 = q1.d.a(r0)
            long r4 = q1.a.C
            boolean r0 = q1.a.a(r2, r4)
            if (r0 == 0) goto La6
        L21:
            int r0 = q1.d.c(r11)
            r2 = 2
            if (r0 != r2) goto La6
            boolean r0 = r11.isCtrlPressed()
            if (r0 != 0) goto La6
            m.o2 r0 = r10.T
            m.p1 r0 = r0.f8308d
            m.p1 r2 = m.p1.f8324g
            r3 = 1
            if (r0 != r2) goto L38
            r1 = r3
        L38:
            r0 = 0
            r2 = 32
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            m.k r6 = r10.W
            if (r1 == 0) goto L6d
            long r6 = r6.l1()
            long r6 = r6 & r4
            int r1 = (int) r6
            int r11 = r11.getKeyCode()
            long r6 = q1.d.a(r11)
            long r8 = q1.a.C
            boolean r11 = q1.a.a(r6, r8)
            if (r11 == 0) goto L5c
            float r11 = (float) r1
            goto L5e
        L5c:
            float r11 = (float) r1
            float r11 = -r11
        L5e:
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r0
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            long r6 = (long) r11
            long r0 = r0 << r2
            long r4 = r4 & r6
            long r0 = r0 | r4
        L6b:
            r6 = r0
            goto L95
        L6d:
            long r6 = r6.l1()
            long r6 = r6 >> r2
            int r1 = (int) r6
            int r11 = r11.getKeyCode()
            long r6 = q1.d.a(r11)
            long r8 = q1.a.C
            boolean r11 = q1.a.a(r6, r8)
            if (r11 == 0) goto L85
            float r11 = (float) r1
            goto L87
        L85:
            float r11 = (float) r1
            float r11 = -r11
        L87:
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            long r6 = (long) r11
            int r11 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r11
            long r6 = r6 << r2
            long r0 = r0 & r4
            long r0 = r0 | r6
            goto L6b
        L95:
            qg.t r11 = r10.Y0()
            m.f2 r4 = new m.f2
            r9 = 0
            r8 = 0
            r5 = r10
            r4.<init>(r5, r6, r8, r9)
            r0 = 3
            qg.v.q(r11, r8, r4, r0)
            return r3
        La6:
            return r1
    }

    @Override // x1.z1
    public final void X0(f2.y r5) {
            r4 = this;
            boolean r0 = r4.f8322y
            r1 = 0
            if (r0 == 0) goto L1d
            b0.t r0 = r4.X
            if (r0 == 0) goto Ld
            m.f2 r0 = r4.Y
            if (r0 != 0) goto L1d
        Ld:
            b0.t r0 = new b0.t
            r2 = 15
            r0.<init>(r4, r2)
            r4.X = r0
            m.f2 r0 = new m.f2
            r0.<init>(r4, r1)
            r4.Y = r0
        L1d:
            b0.t r0 = r4.X
            if (r0 == 0) goto L2d
            mg.d[] r2 = f2.w.f3251a
            f2.x r2 = f2.l.f3181d
            f2.a r3 = new f2.a
            r3.<init>(r1, r0)
            r5.a(r2, r3)
        L2d:
            m.f2 r0 = r4.Y
            if (r0 == 0) goto L38
            mg.d[] r1 = f2.w.f3251a
            f2.x r1 = f2.l.f3182e
            r5.a(r1, r0)
        L38:
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
            r3 = this;
            boolean r0 = r3.f21832t
            if (r0 != 0) goto L5
            goto L1c
        L5:
            x1.f0 r0 = x1.k.w(r3)
            u2.c r0 = r0.E
            m.p r1 = r3.S
            r1.getClass()
            androidx.lifecycle.x r2 = new androidx.lifecycle.x
            r2.<init>(r0)
            i.u r0 = new i.u
            r0.<init>(r2)
            r1.f8318a = r0
        L1c:
            m.l1 r0 = r3.Z
            if (r0 == 0) goto L28
            x1.f0 r1 = x1.k.w(r3)
            u2.c r1 = r1.E
            r0.f8302c = r1
        L28:
            m.d3 r0 = r3.f8185a0
            if (r0 == 0) goto L34
            x1.f0 r1 = x1.k.w(r3)
            u2.c r1 = r1.E
            r0.f8302c = r1
        L34:
            return
    }

    @Override // x1.i
    public final void m() {
            r3 = this;
            r3.b0()
            boolean r0 = r3.f21832t
            if (r0 != 0) goto L8
            goto L1f
        L8:
            x1.f0 r0 = x1.k.w(r3)
            u2.c r0 = r0.E
            m.p r1 = r3.S
            r1.getClass()
            androidx.lifecycle.x r2 = new androidx.lifecycle.x
            r2.<init>(r0)
            i.u r0 = new i.u
            r0.<init>(r2)
            r1.f8318a = r0
        L1f:
            m.l1 r0 = r3.Z
            if (r0 == 0) goto L2b
            x1.f0 r1 = x1.k.w(r3)
            u2.c r1 = r1.E
            r0.f8302c = r1
        L2b:
            m.d3 r0 = r3.f8185a0
            if (r0 == 0) goto L37
            x1.f0 r1 = x1.k.w(r3)
            u2.c r1 = r1.E
            r0.f8302c = r1
        L37:
            return
    }

    @Override // m.p0
    public final java.lang.Object r1(m.o0 r5, m.o0 r6) {
            r4 = this;
            c0.m r0 = new c0.m
            r1 = 0
            r2 = 13
            m.o2 r3 = r4.T
            r0.<init>(r5, r3, r1, r2)
            k.d1 r5 = k.d1.f6940h
            java.lang.Object r5 = r3.f(r5, r0, r6)
            xf.a r6 = xf.a.f21579g
            if (r5 != r6) goto L15
            return r5
        L15:
            sf.n r5 = sf.n.f12433a
            return r5
    }

    @Override // m.p0
    public final void w1(long r1) {
            r0 = this;
            return
    }

    @Override // m.p0
    public final void x1(m.a0 r5) {
            r4 = this;
            r1.d r0 = r4.R
            qg.t r0 = r0.e()
            ci.j r1 = new ci.j
            r2 = 12
            r3 = 0
            r1.<init>(r5, r4, r3, r2)
            r5 = 3
            qg.v.q(r0, r3, r1, r5)
            return
    }
}
