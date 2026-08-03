package th;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends y0.n implements x1.v, x1.m, x1.n, x1.m1, x1.h {
    public boolean A;
    public final vh.f B;
    public final th.g C;
    public final th.e D;
    public final th.e E;
    public i1.b F;
    public final i0.j1 G;
    public final i0.f1 H;
    public final nb.a I;
    public final i0.j1 J;
    public final f1.h K;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public th.a f13312u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public fg.l f13313v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public fg.l f13314w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public fg.l f13315x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public fg.p f13316y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public fg.l f13317z;

    public i(th.a r1, fg.a r2, fg.l r3, fg.l r4, fg.l r5, fg.p r6, fg.l r7, boolean r8) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.f13312u = r1
            r0.f13313v = r3
            r0.f13314w = r4
            r0.f13315x = r5
            r0.f13316y = r6
            r0.f13317z = r7
            r0.A = r8
            vh.f r1 = new vh.f
            r1.<init>(r2)
            r0.B = r1
            th.g r1 = new th.g
            r1.<init>(r0)
            r0.C = r1
            th.e r1 = new th.e
            r1.<init>(r0)
            r0.D = r1
            th.e r1 = new th.e
            r1.<init>(r0)
            r0.E = r1
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            i0.j1 r1 = i0.r.u(r1)
            r0.G = r1
            i0.f1 r1 = new i0.f1
            r2 = 0
            r1.<init>(r2)
            r0.H = r1
            nb.a r1 = new nb.a
            r2 = 14
            r1.<init>(r0, r2)
            r0.I = r1
            i0.e r1 = i0.e.f5867j
            i0.j1 r2 = new i0.j1
            r3 = 0
            r2.<init>(r3, r1)
            r0.J = r2
            f1.c0.f()
            f1.h r1 = f1.c0.f()
            r0.K = r1
            return
    }

    public static final void k1(th.i r4, h1.d r5, th.e r6) {
            i0.f1 r0 = r6.f13278e
            float r0 = r0.g()
            int r6 = r6.f13279f
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto Lf
            r0 = r1
            goto L16
        Lf:
            r1 = 1
            if (r6 <= r1) goto L16
            float r1 = (float) r6
            float r0 = r0 / r1
            int r0 = (int) r0
            float r0 = (float) r0
        L16:
            b5.c r1 = r5.z0()
            java.lang.Object r1 = r1.f469a
            androidx.lifecycle.x r1 = (androidx.lifecycle.x) r1
            r1.c0(r0, r0)
            fg.p r1 = r4.f13316y     // Catch: java.lang.Throwable -> L39
            th.d r2 = new th.d     // Catch: java.lang.Throwable -> L39
            r3 = 0
            r2.<init>(r6, r3, r4)     // Catch: java.lang.Throwable -> L39
            r1.invoke(r5, r2)     // Catch: java.lang.Throwable -> L39
            b5.c r4 = r5.z0()
            java.lang.Object r4 = r4.f469a
            androidx.lifecycle.x r4 = (androidx.lifecycle.x) r4
            float r5 = -r0
            r4.c0(r5, r5)
            return
        L39:
            r4 = move-exception
            b5.c r5 = r5.z0()
            java.lang.Object r5 = r5.f469a
            androidx.lifecycle.x r5 = (androidx.lifecycle.x) r5
            float r6 = -r0
            r5.c0(r6, r6)
            throw r4
    }

    @Override // x1.m
    public final void B(x1.h0 r26) {
            r25 = this;
            r0 = r25
            r1 = r26
            h1.b r2 = r1.f20932g
            boolean r3 = r0.A
            if (r3 != 0) goto Le
            r1.e()
            return
        Le:
            th.g r3 = r0.C
            r3.getClass()
            float r4 = r2.d()
            float r5 = r2.q0()
            long r6 = r2.a()
            u2.m r8 = r1.getLayoutDirection()
            float r9 = r3.f13288g
            int r9 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            r11 = 1
            if (r9 != 0) goto L3f
            float r9 = r3.f13289h
            int r9 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r9 != 0) goto L3f
            long r12 = r3.f13290i
            boolean r9 = e1.e.a(r6, r12)
            if (r9 == 0) goto L3f
            u2.m r9 = r3.f13291j
            if (r8 == r9) goto L3d
            goto L3f
        L3d:
            r9 = 0
            goto L40
        L3f:
            r9 = r11
        L40:
            if (r9 == 0) goto L4d
            r3.f13288g = r4
            r3.f13289h = r5
            r3.f13290i = r6
            r8.getClass()
            r3.f13291j = r8
        L4d:
            if (r9 == 0) goto L52
            r0.q1()
        L52:
            th.e r4 = r0.D
            r0.p1(r1, r4)
            i0.j1 r4 = r0.G
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r7 = 32
            if (r4 == 0) goto Lb6
            i1.b r4 = r0.F
            if (r4 != 0) goto L7a
            f1.z r4 = x1.k.u(r0)
            i1.b r4 = r4.c()
            r0.F = r4
        L7a:
            long r8 = r2.a()
            long r8 = r8 >> r7
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            int r8 = (int) r8
            if (r8 >= r11) goto L88
            r8 = r11
        L88:
            long r12 = r2.a()
            long r12 = r12 & r5
            int r9 = (int) r12
            float r9 = java.lang.Float.intBitsToFloat(r9)
            int r9 = (int) r9
            if (r9 >= r11) goto L96
            r9 = r11
        L96:
            long r12 = (long) r8
            long r12 = r12 << r7
            long r8 = (long) r9
            long r8 = r8 & r5
            long r8 = r8 | r12
            x1.f0 r12 = x1.k.w(r0)
            u2.c r12 = r12.E
            i0.q0 r13 = new i0.q0
            r14 = 1
            r13.<init>(r12, r14, r0)
            r1.y(r8, r13, r4)
            i0.f1 r8 = r0.H
            float r8 = r8.g()
            r4.f(r8)
            oh.h.u(r1, r4)
        Lb6:
            fg.l r4 = r0.f13317z
            if (r4 == 0) goto Lbd
            r4.invoke(r1)
        Lbd:
            r1.e()
            fg.l r4 = r0.f13314w
            if (r4 == 0) goto L28e
            java.lang.Object r4 = r4.invoke(r3)
            uh.b r4 = (uh.b) r4
            if (r4 == 0) goto L28e
            th.i r8 = r3.H
            vh.f r8 = r8.B
            java.lang.Object r8 = r8.f14388c
            fg.a r8 = (fg.a) r8
            java.lang.Object r8 = r8.invoke()
            f1.r0 r8 = (f1.r0) r8
            th.m r3 = r3.f13295n
            uh.a r9 = r4.f13851c
            float r12 = r4.f13850b
            r8.getClass()
            r3.getClass()
            f1.h r13 = r0.K
            r13.getClass()
            float r4 = r4.f13849a
            r14 = 0
            int r15 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r15 <= 0) goto L28e
            int r15 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r15 > 0) goto Lf8
            goto L28e
        Lf8:
            long r15 = r2.a()
            r17 = r5
            long r5 = r15 >> r7
            int r5 = (int) r5
            float r6 = java.lang.Float.intBitsToFloat(r5)
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 <= 0) goto L28e
            r19 = r11
            long r10 = r15 & r17
            int r10 = (int) r10
            float r11 = java.lang.Float.intBitsToFloat(r10)
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 > 0) goto L118
            goto L28e
        L118:
            float r4 = r1.x0(r4)
            float r11 = e1.e.b(r15)
            r14 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 / r14
            int r15 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r15 <= 0) goto L128
            r4 = r11
        L128:
            boolean r11 = r9.f13848f
            r15 = r7
            long r6 = r9.f13843a
            boolean r20 = th.c.c()
            r21 = r14
            if (r20 != 0) goto L13e
            r21 = r2
            r17 = r5
            r20 = r10
            r0 = 0
            goto L265
        L13e:
            long r22 = r2.a()
            if (r11 == 0) goto L149
            java.lang.String r20 = "BloomStrokeDual"
        L146:
            r14 = r20
            goto L14c
        L149:
            java.lang.String r20 = "BloomStrokeSingle"
            goto L146
        L14c:
            if (r11 == 0) goto L155
            java.lang.String r20 = vh.d.f14383c
        L150:
            r24 = r15
            r15 = r20
            goto L158
        L155:
            java.lang.String r20 = vh.d.f14382b
            goto L150
        L158:
            ai.b r3 = r3.e(r14, r15)
            long r14 = r22 >> r24
            int r14 = (int) r14
            float r14 = java.lang.Float.intBitsToFloat(r14)
            r15 = 1056964608(0x3f000000, float:0.5)
            float r14 = r14 * r15
            r20 = r10
            r24 = r11
            long r10 = r22 & r17
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            float r10 = r10 * r15
            r3.getClass()
            android.graphics.RuntimeShader r11 = r3.f255a
            java.lang.String r15 = "halfView"
            ai.a.t(r11, r15, r14, r10)
            double r14 = (double) r14
            double r14 = java.lang.Math.floor(r14)
            float r11 = (float) r14
            double r14 = (double) r10
            double r14 = java.lang.Math.floor(r14)
            float r10 = (float) r14
            android.graphics.RuntimeShader r14 = r3.f255a
            java.lang.String r15 = "halfViewFloor"
            ai.a.t(r14, r15, r11, r10)
            long r10 = r2.a()
            float r14 = e1.e.b(r10)
            float r14 = r14 / r21
            boolean r15 = r8 instanceof v.d
            if (r15 == 0) goto L1a0
            v.d r8 = (v.d) r8
            goto L1a1
        L1a0:
            r8 = 0
        L1a1:
            if (r8 != 0) goto L1ae
            android.graphics.RuntimeShader r8 = r3.f255a
            ai.a.r(r8, r14, r14, r14, r14)
            r21 = r2
            r17 = r5
            goto L214
        L1ae:
            v.a r15 = r8.f13863d
            v.a r0 = r8.f13862c
            r17 = r5
            v.a r5 = r8.f13861b
            v.a r8 = r8.f13860a
            r18 = r14
            u2.m r14 = r1.getLayoutDirection()
            r21 = r2
            u2.m r2 = u2.m.f13354g
            if (r14 != r2) goto L1c7
            r16 = r19
            goto L1c9
        L1c7:
            r16 = 0
        L1c9:
            if (r16 == 0) goto L1d0
            float r2 = r8.a(r10, r1)
            goto L1d4
        L1d0:
            float r2 = r5.a(r10, r1)
        L1d4:
            if (r16 == 0) goto L1db
            float r5 = r5.a(r10, r1)
            goto L1df
        L1db:
            float r5 = r8.a(r10, r1)
        L1df:
            if (r16 == 0) goto L1e6
            float r8 = r0.a(r10, r1)
            goto L1ea
        L1e6:
            float r8 = r15.a(r10, r1)
        L1ea:
            if (r16 == 0) goto L1f1
            float r0 = r15.a(r10, r1)
            goto L1f5
        L1f1:
            float r0 = r0.a(r10, r1)
        L1f5:
            int r10 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r10 <= 0) goto L1fb
            r2 = r18
        L1fb:
            int r10 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r10 <= 0) goto L201
            r5 = r18
        L201:
            int r10 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r10 <= 0) goto L207
            r0 = r18
        L207:
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 <= 0) goto L20e
            r14 = r18
            goto L20f
        L20e:
            r14 = r8
        L20f:
            android.graphics.RuntimeShader r8 = r3.f255a
            ai.a.r(r8, r2, r5, r0, r14)
        L214:
            java.lang.String r0 = "strokeWidth"
            android.graphics.RuntimeShader r2 = r3.f255a
            ai.a.s(r2, r0, r4)
            float r0 = r9.f13845c
            float r0 = r1.x0(r0)
            java.lang.String r1 = "innerBlurRadius"
            android.graphics.RuntimeShader r2 = r3.f255a
            ai.a.s(r2, r1, r0)
            float r0 = r0 * r0
            android.graphics.RuntimeShader r1 = r3.f255a
            java.lang.String r2 = "innerBlurRadiusSq"
            ai.a.s(r1, r2, r0)
            java.lang.String r0 = "highlightAlpha"
            android.graphics.RuntimeShader r1 = r3.f255a
            ai.a.s(r1, r0, r12)
            r0 = 1065353216(0x3f800000, float:1.0)
            long r0 = f1.w.b(r6, r0)
            android.graphics.RuntimeShader r2 = r3.f255a
            int r0 = f1.c0.w(r0)
            java.lang.String r1 = "strokeColor"
            ai.a.v(r2, r1, r0)
            float r0 = f1.w.d(r6)
            android.graphics.RuntimeShader r1 = r3.f255a
            java.lang.String r2 = "strokeAlphaMul"
            ai.a.s(r1, r2, r0)
            uh.d r0 = r9.f13846d
            r1 = r24 ^ 1
            java.lang.String r2 = "1"
            x6.d.m(r3, r2, r0, r1)
            java.lang.String r0 = "2"
            uh.d r2 = r9.f13847e
            x6.d.m(r3, r0, r2, r1)
            android.graphics.RuntimeShader r0 = r3.f255a
        L265:
            if (r0 != 0) goto L268
            goto L28e
        L268:
            r13.z(r0)
            int r0 = r9.f13844b
            r13.v(r0)
            r0 = r21
            b5.c r0 = r0.f5038h
            f1.u r0 = r0.p()
            float r16 = java.lang.Float.intBitsToFloat(r17)
            float r17 = java.lang.Float.intBitsToFloat(r20)
            r14 = 0
            r15 = 0
            r18 = r13
            r13 = r0
            r0 = 0
            r13.t(r14, r15, r16, r17, r18)
            r1 = r18
            r1.z(r0)
        L28e:
            return
    }

    @Override // x1.m1
    public final void C0() {
            r2 = this;
            i.e0 r0 = new i.e0
            r1 = 26
            r0.<init>(r2, r1)
            x1.k.r(r2, r0)
            return
    }

    @Override // y0.n
    public final void c1() {
            r2 = this;
            i0.m2 r0 = th.o.f13328a
            java.lang.Object r0 = x1.k.h(r2, r0)
            th.m r0 = (th.m) r0
            th.g r1 = r2.C
            r1.getClass()
            r0.getClass()
            r1.f13295n = r0
            boolean r0 = r2.A
            if (r0 == 0) goto L32
            th.e r0 = r2.D
            i1.b r1 = r0.f13274a
            if (r1 != 0) goto L28
            th.i r1 = r0.f13284k
            f1.z r1 = x1.k.u(r1)
            i1.b r1 = r1.c()
            r0.f13274a = r1
        L28:
            i.e0 r0 = new i.e0
            r1 = 26
            r0.<init>(r2, r1)
            x1.k.r(r2, r0)
        L32:
            return
    }

    @Override // y0.n
    public final void d1() {
            r2 = this;
            r2.o1()
            r0 = 0
            i0.j1 r1 = r2.J
            r1.setValue(r0)
            return
    }

    @Override // x1.v
    public final v1.o0 j(v1.p0 r3, v1.m0 r4, long r5) {
            r2 = this;
            r4.getClass()
            v1.b1 r4 = r4.Q(r5)
            int r5 = r4.f13900g
            int r6 = r4.f13901h
            m.b r0 = new m.b
            r1 = 19
            r0.<init>(r2, r1, r4)
            tf.u r4 = tf.u.f13168g
            v1.o0 r3 = r3.z(r5, r6, r4, r0)
            return r3
    }

    public final void l1(h1.d r14, th.e r15, int r16, i1.b r17, int r18, int r19, i1.b r20, int r21, int r22, float r23, java.lang.String r24, java.lang.String r25) {
            r13 = this;
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r24
            f1.n0[] r5 = r15.f13283j
            int[] r6 = r15.f13282i
            int[] r7 = r15.f13281h
            java.lang.String[] r8 = r15.f13280g
            r5 = r5[r16]
            if (r5 == 0) goto L25
            r9 = r8[r16]
            boolean r9 = gg.l.a(r9, r4)
            if (r9 == 0) goto L25
            r9 = r7[r16]
            if (r9 != r2) goto L25
            r9 = r6[r16]
            if (r9 != r3) goto L25
            goto L4d
        L25:
            th.g r5 = r13.C
            r9 = r25
            ai.b r5 = r5.e(r4, r9)
            float r9 = (float) r2
            r10 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 - r10
            float r11 = (float) r3
            float r11 = r11 - r10
            r5.getClass()
            android.graphics.RuntimeShader r10 = r5.f255a
            java.lang.String r12 = "maxCoord"
            ai.a.t(r10, r12, r9, r11)
            java.lang.String r9 = "child"
            f1.m r5 = ac.p.L(r5, r9)
            f1.n0[] r0 = r15.f13283j
            r0[r16] = r5
            r8[r16] = r4
            r7[r16] = r2
            r6[r16] = r3
        L4d:
            r1.g(r5)
            r0 = r21
            long r2 = (long) r0
            r0 = 32
            long r2 = r2 << r0
            r0 = r22
            long r4 = (long) r0
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            long r2 = r2 | r4
            x1.f0 r0 = x1.k.w(r13)
            u2.c r0 = r0.E
            th.f r4 = new th.f
            r5 = r23
            r4.<init>(r0, r5, r1)
            r0 = r20
            r14.y(r2, r4, r0)
            r14 = 0
            r1.g(r14)
            return
    }

    public final void m1() {
            r1 = this;
            th.g r0 = r1.C
            r0.getClass()
            return
    }

    public final void n1(h1.d r5, th.e r6, i1.b r7, float r8, float r9, int r10, float r11, float r12, int r13, int r14) {
            r4 = this;
            th.g r6 = r4.C
            r6.getClass()
            r6 = 0
            int r6 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            r13 = 0
            if (r6 != 0) goto Le
            r9 = r13
            goto L1e
        Le:
            float r6 = (float) r10
            float r9 = r9 / r6
            int r6 = (int) r9
            int r6 = -r6
            long r9 = (long) r6
            r6 = 32
            long r0 = r9 << r6
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r2
            long r9 = r9 | r0
        L1e:
            r7.i(r9)
            float r6 = -r11
            float r9 = -r12
            b5.c r10 = r5.z0()
            java.lang.Object r10 = r10.f469a
            androidx.lifecycle.x r10 = (androidx.lifecycle.x) r10
            r10.c0(r6, r9)
            b5.c r10 = r5.z0()     // Catch: java.lang.Throwable -> L5f
            long r11 = r10.v()     // Catch: java.lang.Throwable -> L5f
            f1.u r0 = r10.p()     // Catch: java.lang.Throwable -> L5f
            r0.e()     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r0 = r10.f469a     // Catch: java.lang.Throwable -> L61
            androidx.lifecycle.x r0 = (androidx.lifecycle.x) r0     // Catch: java.lang.Throwable -> L61
            r0.S(r8, r8, r13)     // Catch: java.lang.Throwable -> L61
            oh.h.u(r5, r7)     // Catch: java.lang.Throwable -> L61
            f1.u r7 = r10.p()     // Catch: java.lang.Throwable -> L5f
            r7.p()     // Catch: java.lang.Throwable -> L5f
            r10.U(r11)     // Catch: java.lang.Throwable -> L5f
            b5.c r5 = r5.z0()
            java.lang.Object r5 = r5.f469a
            androidx.lifecycle.x r5 = (androidx.lifecycle.x) r5
            float r6 = -r6
            float r7 = -r9
            r5.c0(r6, r7)
            return
        L5f:
            r7 = move-exception
            goto L6d
        L61:
            r7 = move-exception
            f1.u r8 = r10.p()     // Catch: java.lang.Throwable -> L5f
            r8.p()     // Catch: java.lang.Throwable -> L5f
            r10.U(r11)     // Catch: java.lang.Throwable -> L5f
            throw r7     // Catch: java.lang.Throwable -> L5f
        L6d:
            b5.c r5 = r5.z0()
            java.lang.Object r5 = r5.f469a
            androidx.lifecycle.x r5 = (androidx.lifecycle.x) r5
            float r6 = -r6
            float r8 = -r9
            r5.c0(r6, r8)
            throw r7
    }

    public final void o1() {
            r5 = this;
            th.e r0 = r5.D
            r0.b()
            th.e r0 = r5.E
            r0.b()
            i1.b r0 = r5.F
            if (r0 == 0) goto L15
            f1.z r1 = x1.k.u(r5)
            r1.a(r0)
        L15:
            r0 = 0
            r5.F = r0
            i0.j1 r1 = r5.G
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.setValue(r2)
            th.g r1 = r5.C
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.f13288g = r2
            r1.f13289h = r2
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r1.f13290i = r2
            u2.m r2 = u2.m.f13354g
            r1.f13291j = r2
            r2 = 0
            r1.f13292k = r2
            r1.f13293l = r0
            r3 = 1
            r1.f13294m = r3
            r3 = 2143289344(0x7fc00000, float:NaN)
            r1.f13301t = r3
            r1.f13302u = r3
            r1.f13303v = r3
            r1.f13304w = r3
            r4 = -1
            r1.f13305x = r4
            r1.f13306y = r0
            r1.f13307z = r3
            r1.A = r3
            r1.B = r3
            r1.C = r0
            r1.D = r4
            r0 = 0
            r1.E = r0
            r1.F = r0
            r1.G = r2
            return
    }

    public final void p1(h1.d r21, th.e r22) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            i1.b r7 = r2.f13274a
            if (r7 != 0) goto Lb
            return
        Lb:
            i0.f1 r3 = r2.f13278e
            float r5 = r3.g()
            int r6 = r2.f13277d
            long r3 = r1.a()
            r8 = 32
            long r3 = r3 >> r8
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r4 = 2
            float r9 = (float) r4
            float r9 = r9 * r5
            float r3 = r3 + r9
            int r3 = (int) r3
            long r10 = r1.a()
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r12
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            float r10 = r10 + r9
            int r10 = (int) r10
            r14 = 1
            if (r6 > r14) goto L64
            r2.f13279f = r14
            long r3 = (long) r3
            long r3 = r3 << r8
            long r9 = (long) r10
            long r9 = r9 & r12
            long r3 = r3 | r9
            x1.f0 r6 = x1.k.w(r0)
            u2.c r6 = r6.E
            th.h r9 = new th.h
            r10 = 0
            r9.<init>(r6, r0, r2, r10)
            r1.y(r3, r9, r7)
            r2 = 0
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 != 0) goto L56
            r2 = 0
            goto L5d
        L56:
            int r2 = (int) r5
            int r2 = -r2
            long r2 = (long) r2
            long r4 = r2 << r8
            long r2 = r2 & r12
            long r2 = r2 | r4
        L5d:
            r7.i(r2)
            oh.h.u(r1, r7)
            return
        L64:
            if (r6 > r4) goto La2
            r2.f13279f = r4
            int r4 = r3 / 2
            if (r4 >= r14) goto L6d
            r4 = r14
        L6d:
            int r9 = r10 / 2
            if (r9 >= r14) goto L73
        L71:
            r11 = r8
            goto L75
        L73:
            r14 = r9
            goto L71
        L75:
            long r8 = (long) r4
            long r8 = r8 << r11
            long r14 = (long) r14
            long r11 = r14 & r12
            long r8 = r8 | r11
            x1.f0 r4 = x1.k.w(r0)
            u2.c r4 = r4.E
            th.h r11 = new th.h
            r12 = 1
            r11.<init>(r4, r0, r2, r12)
            r1.y(r8, r11, r7)
            float r4 = (float) r6
            th.a r8 = r0.f13312u
            float r8 = r8.c()
            th.a r9 = r0.f13312u
            float r9 = r9.d()
            r19 = r9
            r9 = r3
            r3 = r7
            r7 = r8
            r8 = r19
            r0.n1(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        La2:
            r17 = r3
            r16 = r5
            r3 = r6
            r15 = r7
            r11 = r8
            r18 = r10
            r2.f13279f = r4
            int r4 = r17 / 2
            if (r4 >= r14) goto Lb3
            r5 = r14
            goto Lb4
        Lb3:
            r5 = r4
        Lb4:
            int r10 = r18 / 2
            if (r10 >= r14) goto Lba
            r6 = r14
            goto Lbb
        Lba:
            r6 = r10
        Lbb:
            r4 = 0
            i1.b r4 = r2.a(r4)
            long r7 = (long) r5
            long r7 = r7 << r11
            long r9 = (long) r6
            long r9 = r9 & r12
            long r7 = r7 | r9
            x1.f0 r9 = x1.k.w(r0)
            u2.c r9 = r9.E
            th.h r10 = new th.h
            r11 = 2
            r10.<init>(r9, r0, r2, r11)
            r1.y(r7, r10, r4)
            r7 = 4
            if (r3 == r7) goto L15c
            r7 = 8
            if (r3 == r7) goto L13b
            r7 = 16
            if (r3 != r7) goto L11d
            int r7 = r5 / 4
            if (r7 >= r14) goto Le5
            r8 = r14
            goto Le6
        Le5:
            r8 = r7
        Le6:
            int r7 = r6 / 4
            if (r7 >= r14) goto Lec
            r9 = r14
            goto Led
        Lec:
            r9 = r7
        Led:
            i1.b r7 = r2.a(r14)
            java.lang.String r11 = "Downsample4x"
            java.lang.String r12 = "\n    uniform shader child;\n    uniform float2 maxCoord;\n    half4 main(float2 xy) {\n        float2 minCoord = float2(0.5);\n        half4 color = half4(0);\n        color += child.eval(clamp(xy + float2(-0.75, -0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.75, -0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2(-0.75,  0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.75,  0.75), minCoord, maxCoord));\n        return color * 0.25;\n    }\n"
            r10 = r3
            r3 = 0
            r13 = r10
            r10 = 1048576000(0x3e800000, float:0.25)
            r0.l1(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r4 = r7
            r5 = r8
            r6 = r9
            int r8 = r5 / 2
            if (r8 >= r14) goto L105
            r8 = r14
        L105:
            int r9 = r6 / 2
            if (r9 >= r14) goto L10a
            r9 = r14
        L10a:
            java.lang.String r11 = "Downsample2x"
            java.lang.String r12 = "\n    uniform shader child;\n    uniform float2 maxCoord;\n    half4 main(float2 xy) {\n        float2 minCoord = float2(0.5);\n        half4 color = half4(0);\n        color += child.eval(clamp(xy + float2(-0.25, -0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.25, -0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2(-0.25,  0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.25,  0.25), minCoord, maxCoord));\n        return color * 0.25;\n    }\n"
            r3 = 1
            r10 = 1056964608(0x3f000000, float:0.5)
            r0 = r20
            r1 = r21
            r2 = r22
            r7 = r15
            r0.l1(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L17c
        L11d:
            r13 = r3
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported scaleFactor: "
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r2 = " (must be 1/2/4/8/16)"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L13b:
            r13 = r3
            r7 = r15
            int r0 = r5 / 4
            if (r0 >= r14) goto L143
            r8 = r14
            goto L144
        L143:
            r8 = r0
        L144:
            int r0 = r6 / 4
            if (r0 >= r14) goto L14a
            r9 = r14
            goto L14b
        L14a:
            r9 = r0
        L14b:
            java.lang.String r11 = "Downsample4x"
            java.lang.String r12 = "\n    uniform shader child;\n    uniform float2 maxCoord;\n    half4 main(float2 xy) {\n        float2 minCoord = float2(0.5);\n        half4 color = half4(0);\n        color += child.eval(clamp(xy + float2(-0.75, -0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.75, -0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2(-0.75,  0.75), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.75,  0.75), minCoord, maxCoord));\n        return color * 0.25;\n    }\n"
            r3 = 0
            r10 = 1048576000(0x3e800000, float:0.25)
            r0 = r20
            r1 = r21
            r2 = r22
            r0.l1(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L17c
        L15c:
            r13 = r3
            r7 = r15
            int r0 = r5 / 2
            if (r0 >= r14) goto L164
            r8 = r14
            goto L165
        L164:
            r8 = r0
        L165:
            int r0 = r6 / 2
            if (r0 >= r14) goto L16b
            r9 = r14
            goto L16c
        L16b:
            r9 = r0
        L16c:
            java.lang.String r11 = "Downsample2x"
            java.lang.String r12 = "\n    uniform shader child;\n    uniform float2 maxCoord;\n    half4 main(float2 xy) {\n        float2 minCoord = float2(0.5);\n        half4 color = half4(0);\n        color += child.eval(clamp(xy + float2(-0.25, -0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.25, -0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2(-0.25,  0.25), minCoord, maxCoord));\n        color += child.eval(clamp(xy + float2( 0.25,  0.25), minCoord, maxCoord));\n        return color * 0.25;\n    }\n"
            r3 = 0
            r10 = 1056964608(0x3f000000, float:0.5)
            r0 = r20
            r1 = r21
            r2 = r22
            r0.l1(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L17c:
            float r4 = (float) r13
            th.a r1 = r0.f13312u
            float r1 = r1.c()
            th.a r2 = r0.f13312u
            float r8 = r2.d()
            r2 = r22
            r3 = r7
            r6 = r13
            r5 = r16
            r9 = r17
            r10 = r18
            r7 = r1
            r1 = r21
            r0.n1(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public final void q1() {
            r10 = this;
            boolean r0 = r10.A
            if (r0 != 0) goto L5
            return
        L5:
            th.e r0 = r10.D
            i1.b r1 = r0.f13274a
            if (r1 != 0) goto L17
            th.i r1 = r0.f13284k
            f1.z r1 = x1.k.u(r1)
            i1.b r1 = r1.c()
            r0.f13274a = r1
        L17:
            th.g r1 = r10.C
            r2 = -1
            r1.D = r2
            fg.l r3 = r10.f13313v
            r3.getClass()
            r4 = 0
            r1.f13292k = r4
            r5 = 0
            r1.f13293l = r5
            r6 = 1
            r1.f13294m = r6
            r3.invoke(r1)
            r10.m1()
            i1.b r3 = r0.f13274a
            if (r3 == 0) goto L39
            f1.n0 r7 = r1.f13293l
            r3.g(r7)
        L39:
            float r3 = r1.f13292k
            i0.f1 r7 = r0.f13278e
            r7.h(r3)
            int r3 = r1.f13294m
            if (r3 >= r6) goto L45
            r3 = r6
        L45:
            r0.f13277d = r3
            int r0 = r1.E
            int r3 = r1.F
            float r7 = r1.G
            i0.j1 r8 = r10.G
            if (r0 == r3) goto La3
            r0 = 981668463(0x3a83126f, float:0.001)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto L59
            goto La3
        L59:
            th.e r0 = r10.E
            i1.b r9 = r0.f13274a
            if (r9 != 0) goto L6b
            th.i r9 = r0.f13284k
            f1.z r9 = x1.k.u(r9)
            i1.b r9 = r9.c()
            r0.f13274a = r9
        L6b:
            r1.D = r3
            fg.l r3 = r10.f13313v
            r3.getClass()
            r1.f13292k = r4
            r1.f13293l = r5
            r1.f13294m = r6
            r3.invoke(r1)
            r10.m1()
            i1.b r3 = r0.f13274a
            if (r3 == 0) goto L87
            f1.n0 r4 = r1.f13293l
            r3.g(r4)
        L87:
            float r3 = r1.f13292k
            i0.f1 r4 = r0.f13278e
            r4.h(r3)
            int r3 = r1.f13294m
            if (r3 >= r6) goto L93
            goto L94
        L93:
            r6 = r3
        L94:
            r0.f13277d = r6
            r1.D = r2
            i0.f1 r0 = r10.H
            r0.h(r7)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r8.setValue(r0)
            return
        La3:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r8.setValue(r0)
            return
    }

    @Override // x1.n
    public final void w(x1.i1 r3) {
            r2 = this;
            y0.n r0 = r3.r1()
            boolean r0 = r0.f21832t
            if (r0 == 0) goto L22
            th.a r0 = r2.f13312u
            boolean r0 = r0.b()
            i0.j1 r1 = r2.J
            if (r0 == 0) goto L16
            r1.setValue(r3)
            return
        L16:
            java.lang.Object r3 = r1.getValue()
            v1.t r3 = (v1.t) r3
            if (r3 == 0) goto L22
            r3 = 0
            r1.setValue(r3)
        L22:
            return
    }
}
