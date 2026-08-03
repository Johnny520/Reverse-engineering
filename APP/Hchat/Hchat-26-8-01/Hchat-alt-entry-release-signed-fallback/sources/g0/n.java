package g0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends y0.n implements x1.v, x1.m, x1.z1 {
    public int A;
    public java.util.HashMap B;
    public g0.e C;
    public i2.n0 D;
    public g0.l E;
    public g0.m F;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public java.lang.String f4049u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i2.n0 f4050v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public m2.d f4051w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f4052x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f4053y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f4054z;

    @Override // x1.m
    public final void B(x1.h0 r12) {
            r11 = this;
            boolean r0 = r11.f21832t
            if (r0 != 0) goto L6
            goto L9b
        L6:
            g0.m r0 = r11.F
            if (r0 == 0) goto L16
            boolean r1 = r0.f4047c
            if (r1 == 0) goto Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L16
            g0.e r0 = r0.f4048d
            if (r0 != 0) goto L1a
        L16:
            g0.e r0 = r11.k1()
        L1a:
            i2.a r1 = r0.f4001j
            if (r1 == 0) goto La2
            h1.b r12 = r12.f20932g
            b5.c r12 = r12.f5038h
            f1.u r2 = r12.p()
            boolean r12 = r0.f4002k
            if (r12 == 0) goto L43
            long r3 = r0.f4003l
            r0 = 32
            long r5 = r3 >> r0
            int r0 = (int) r5
            float r5 = (float) r0
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            int r0 = (int) r3
            float r6 = (float) r0
            r2.e()
            r4 = 0
            r7 = 1
            r3 = 0
            r2.l(r3, r4, r5, r6, r7)
        L43:
            r0 = 2
            r11.m1(r0)     // Catch: java.lang.Throwable -> L4e
            i2.n0 r0 = r11.D     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L50
            i2.n0 r0 = r11.f4050v     // Catch: java.lang.Throwable -> L4e
            goto L50
        L4e:
            r0 = move-exception
            goto L9c
        L50:
            i2.f0 r3 = r0.f6365a     // Catch: java.lang.Throwable -> L4e
            t2.l r4 = r3.f6310m     // Catch: java.lang.Throwable -> L4e
            if (r4 != 0) goto L58
            t2.l r4 = t2.l.f13015b     // Catch: java.lang.Throwable -> L4e
        L58:
            r6 = r4
            f1.q0 r4 = r3.f6311n     // Catch: java.lang.Throwable -> L4e
            if (r4 != 0) goto L5f
            f1.q0 r4 = f1.q0.f3108d     // Catch: java.lang.Throwable -> L4e
        L5f:
            r5 = r4
            h1.c r4 = r3.f6312o     // Catch: java.lang.Throwable -> L4e
            if (r4 != 0) goto L66
            h1.f r4 = h1.f.f5043b     // Catch: java.lang.Throwable -> L4e
        L66:
            r7 = r4
            t2.o r3 = r3.f6298a     // Catch: java.lang.Throwable -> L4e
            f1.s r3 = r3.c()     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L7b
            i2.f0 r0 = r0.f6365a     // Catch: java.lang.Throwable -> L4e
            t2.o r0 = r0.f6298a     // Catch: java.lang.Throwable -> L4e
            float r4 = r0.a()     // Catch: java.lang.Throwable -> L4e
            r1.g(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4e
            goto L96
        L7b:
            long r3 = f1.w.f3131g     // Catch: java.lang.Throwable -> L4e
            r8 = 16
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 == 0) goto L84
            goto L93
        L84:
            long r3 = r0.a()     // Catch: java.lang.Throwable -> L4e
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 == 0) goto L91
            long r3 = r0.a()     // Catch: java.lang.Throwable -> L4e
            goto L93
        L91:
            long r3 = f1.w.f3126b     // Catch: java.lang.Throwable -> L4e
        L93:
            r1.f(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L4e
        L96:
            if (r12 == 0) goto L9b
            r2.p()
        L9b:
            return
        L9c:
            if (r12 == 0) goto La1
            r2.p()
        La1:
            throw r0
        La2:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache="
            r12.<init>(r0)
            g0.e r0 = r11.C
            r12.append(r0)
            java.lang.String r0 = ", textSubstitution="
            r12.append(r0)
            g0.m r0 = r11.F
            r12.append(r0)
            r0 = 41
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            o.b.b(r12)
            okio.a.c()
            return
    }

    @Override // x1.v
    public final int G(x1.n0 r1, v1.m0 r2, int r3) {
            r0 = this;
            g0.e r2 = r0.l1(r1)
            u2.m r1 = r1.getLayoutDirection()
            i2.t r1 = r2.e(r1)
            float r1 = r1.b()
            int r1 = w.s.n(r1)
            return r1
    }

    @Override // x1.v
    public final int K0(x1.n0 r1, v1.m0 r2, int r3) {
            r0 = this;
            g0.e r2 = r0.l1(r1)
            u2.m r1 = r1.getLayoutDirection()
            int r1 = r2.a(r3, r1)
            return r1
    }

    @Override // x1.v
    public final int Q(x1.n0 r1, v1.m0 r2, int r3) {
            r0 = this;
            g0.e r2 = r0.l1(r1)
            u2.m r1 = r1.getLayoutDirection()
            i2.t r1 = r2.e(r1)
            float r1 = r1.c()
            int r1 = w.s.n(r1)
            return r1
    }

    @Override // x1.v
    public final int R0(x1.n0 r1, v1.m0 r2, int r3) {
            r0 = this;
            g0.e r2 = r0.l1(r1)
            u2.m r1 = r1.getLayoutDirection()
            int r1 = r2.a(r3, r1)
            return r1
    }

    @Override // x1.z1
    public final void X0(f2.y r7) {
            r6 = this;
            g0.l r0 = r6.E
            if (r0 != 0) goto Lc
            g0.l r0 = new g0.l
            r1 = 0
            r0.<init>(r6, r1)
            r6.E = r0
        Lc:
            i2.g r1 = new i2.g
            java.lang.String r2 = r6.f4049u
            r1.<init>(r2)
            mg.d[] r2 = f2.w.f3251a
            f2.x r2 = f2.u.B
            java.util.List r1 = a.a.x0(r1)
            r7.a(r2, r1)
            g0.m r1 = r6.F
            if (r1 == 0) goto L43
            boolean r2 = r1.f4047c
            f2.x r3 = f2.u.D
            mg.d[] r4 = f2.w.f3251a
            r5 = 17
            r5 = r4[r5]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r7.a(r3, r2)
            i2.g r2 = new i2.g
            java.lang.String r1 = r1.f4046b
            r2.<init>(r1)
            f2.x r1 = f2.u.C
            r3 = 16
            r3 = r4[r3]
            r7.a(r1, r2)
        L43:
            g0.l r1 = new g0.l
            r2 = 1
            r1.<init>(r6, r2)
            f2.x r2 = f2.l.f3189l
            f2.a r3 = new f2.a
            r4 = 0
            r3.<init>(r4, r1)
            r7.a(r2, r3)
            g0.l r1 = new g0.l
            r2 = 2
            r1.<init>(r6, r2)
            f2.x r2 = f2.l.f3190m
            f2.a r3 = new f2.a
            r3.<init>(r4, r1)
            r7.a(r2, r3)
            ab.a r1 = new ab.a
            r2 = 22
            r1.<init>(r6, r2)
            f2.x r2 = f2.l.f3191n
            f2.a r3 = new f2.a
            r3.<init>(r4, r1)
            r7.a(r2, r3)
            f2.w.a(r7, r0)
            return
    }

    @Override // y0.n
    public final boolean Z0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // x1.v
    public final v1.o0 j(v1.p0 r5, v1.m0 r6, long r7) {
            r4 = this;
            java.lang.String r0 = "TextStringSimpleNode::measure"
            android.os.Trace.beginSection(r0)
            g0.e r0 = r4.l1(r5)     // Catch: java.lang.Throwable -> L37
            u2.m r1 = r5.getLayoutDirection()     // Catch: java.lang.Throwable -> L37
            boolean r7 = r0.b(r7, r1)     // Catch: java.lang.Throwable -> L37
            i2.t r8 = r0.f4005n     // Catch: java.lang.Throwable -> L37
            if (r8 == 0) goto L18
            r8.a()     // Catch: java.lang.Throwable -> L37
        L18:
            i2.a r8 = r0.f4001j     // Catch: java.lang.Throwable -> L37
            r8.getClass()     // Catch: java.lang.Throwable -> L37
            j2.k r8 = r8.f6248d     // Catch: java.lang.Throwable -> L37
            long r0 = r0.f4003l     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L60
            r7 = 2
            x1.i1 r2 = x1.k.t(r4, r7)     // Catch: java.lang.Throwable -> L37
            r2.y1()     // Catch: java.lang.Throwable -> L37
            java.util.HashMap r2 = r4.B     // Catch: java.lang.Throwable -> L37
            if (r2 != 0) goto L39
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L37
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L37
            r4.B = r2     // Catch: java.lang.Throwable -> L37
            goto L39
        L37:
            r5 = move-exception
            goto L87
        L39:
            v1.j r7 = v1.c.f13905a     // Catch: java.lang.Throwable -> L37
            r3 = 0
            float r3 = r8.d(r3)     // Catch: java.lang.Throwable -> L37
            int r3 = java.lang.Math.round(r3)     // Catch: java.lang.Throwable -> L37
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L37
            r2.put(r7, r3)     // Catch: java.lang.Throwable -> L37
            v1.j r7 = v1.c.f13906b     // Catch: java.lang.Throwable -> L37
            int r3 = r8.f6701g     // Catch: java.lang.Throwable -> L37
            int r3 = r3 + (-1)
            float r8 = r8.d(r3)     // Catch: java.lang.Throwable -> L37
            int r8 = java.lang.Math.round(r8)     // Catch: java.lang.Throwable -> L37
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L37
            r2.put(r7, r8)     // Catch: java.lang.Throwable -> L37
        L60:
            r7 = 32
            long r7 = r0 >> r7
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L37
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r8 = (int) r0     // Catch: java.lang.Throwable -> L37
            long r0 = f8.i.u(r7, r7, r8, r8)     // Catch: java.lang.Throwable -> L37
            v1.b1 r6 = r6.Q(r0)     // Catch: java.lang.Throwable -> L37
            java.util.HashMap r0 = r4.B     // Catch: java.lang.Throwable -> L37
            r0.getClass()     // Catch: java.lang.Throwable -> L37
            g0.g r1 = new g0.g     // Catch: java.lang.Throwable -> L37
            r2 = 1
            r1.<init>(r6, r2)     // Catch: java.lang.Throwable -> L37
            v1.o0 r5 = r5.z(r7, r8, r0, r1)     // Catch: java.lang.Throwable -> L37
            android.os.Trace.endSection()
            return r5
        L87:
            android.os.Trace.endSection()
            throw r5
    }

    public final g0.e k1() {
            r9 = this;
            i2.n0 r0 = r9.D
            if (r0 != 0) goto L6
            i2.n0 r0 = r9.f4050v
        L6:
            r3 = r0
            g0.e r0 = r9.C
            if (r0 != 0) goto L1e
            g0.e r1 = new g0.e
            java.lang.String r2 = r9.f4049u
            m2.d r4 = r9.f4051w
            int r5 = r9.f4052x
            boolean r6 = r9.f4053y
            int r7 = r9.f4054z
            int r8 = r9.A
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r9.C = r1
        L1e:
            g0.e r0 = r9.C
            r0.getClass()
            return r0
    }

    public final g0.e l1(v1.p0 r10) {
            r9 = this;
            r0 = 1
            boolean r0 = r9.m1(r0)
            if (r0 == 0) goto L21
            i2.n0 r0 = r9.D
            if (r0 != 0) goto Ld
            i2.n0 r0 = r9.f4050v
        Ld:
            r3 = r0
            g0.e r1 = r9.k1()
            java.lang.String r2 = r9.f4049u
            m2.d r4 = r9.f4051w
            int r5 = r9.f4052x
            boolean r6 = r9.f4053y
            int r7 = r9.f4054z
            int r8 = r9.A
            r1.f(r2, r3, r4, r5, r6, r7, r8)
        L21:
            g0.m r0 = r9.F
            if (r0 == 0) goto L31
            boolean r1 = r0.f4047c
            if (r1 == 0) goto L2a
            goto L2b
        L2a:
            r0 = 0
        L2b:
            if (r0 == 0) goto L31
            g0.e r0 = r0.f4048d
            if (r0 != 0) goto L35
        L31:
            g0.e r0 = r9.k1()
        L35:
            r0.d(r10)
            return r0
    }

    public final boolean m1(int r4) {
            r3 = this;
            i2.n0 r4 = r3.D
            i2.n0 r0 = r3.f4050v
            g0.o r1 = new g0.o
            r2 = 0
            r1.<init>(r2)
            java.lang.String r2 = "StyleOuterNode"
            x1.k.z(r3, r2, r1)
            r3.D = r0
            if (r4 != 0) goto L15
            r4 = 0
            return r4
        L15:
            boolean r4 = r4.equals(r0)
            r4 = r4 ^ 1
            return r4
    }
}
