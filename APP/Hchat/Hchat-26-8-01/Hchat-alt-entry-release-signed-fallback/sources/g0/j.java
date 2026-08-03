package g0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends y0.n implements x1.v, x1.m, x1.z1 {
    public int A;
    public int B;
    public java.util.List C;
    public fg.l D;
    public fg.l E;
    public java.util.Map F;
    public g0.d G;
    public g0.h H;
    public g0.i I;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i2.g f4030u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i2.n0 f4031v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public m2.d f4032w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public fg.l f4033x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f4034y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f4035z;

    @Override // x1.m
    public final void B(x1.h0 r14) {
            r13 = this;
            boolean r0 = r13.f21832t
            if (r0 != 0) goto L6
            goto Ld0
        L6:
            h1.b r0 = r14.f20932g
            b5.c r0 = r0.f5038h
            f1.u r2 = r0.p()
            g0.d r0 = r13.l1(r14)
            i2.k0 r1 = r0.f3988n
            if (r1 == 0) goto Ldb
            r3 = r1
            i2.o r1 = r3.f6347b
            boolean r0 = r3.d()
            r8 = 1
            r9 = 0
            if (r0 == 0) goto L29
            int r0 = r13.f4034y
            r4 = 3
            if (r0 != r4) goto L27
            goto L29
        L27:
            r10 = r8
            goto L2a
        L29:
            r10 = r9
        L2a:
            if (r10 == 0) goto L57
            long r3 = r3.f6348c
            r0 = 32
            long r5 = r3 >> r0
            int r5 = (int) r5
            float r5 = (float) r5
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            int r3 = (int) r3
            float r3 = (float) r3
            int r4 = java.lang.Float.floatToRawIntBits(r5)
            long r4 = (long) r4
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r11 = (long) r3
            long r3 = r4 << r0
            long r5 = r11 & r6
            long r3 = r3 | r5
            r5 = 0
            e1.c r0 = ac.p.a(r5, r3)
            r2.e()
            f1.u.k(r2, r0)
        L57:
            i2.n0 r0 = r13.f4031v     // Catch: java.lang.Throwable -> L63
            i2.f0 r0 = r0.f6365a     // Catch: java.lang.Throwable -> L63
            t2.l r3 = r0.f6310m     // Catch: java.lang.Throwable -> L63
            if (r3 != 0) goto L61
            t2.l r3 = t2.l.f13015b     // Catch: java.lang.Throwable -> L63
        L61:
            r6 = r3
            goto L67
        L63:
            r0 = move-exception
            r14 = r0
            goto Ld5
        L67:
            f1.q0 r3 = r0.f6311n     // Catch: java.lang.Throwable -> L63
            if (r3 != 0) goto L6d
            f1.q0 r3 = f1.q0.f3108d     // Catch: java.lang.Throwable -> L63
        L6d:
            r5 = r3
            h1.c r3 = r0.f6312o     // Catch: java.lang.Throwable -> L63
            if (r3 != 0) goto L74
            h1.f r3 = h1.f.f5043b     // Catch: java.lang.Throwable -> L63
        L74:
            r7 = r3
            t2.o r0 = r0.f6298a     // Catch: java.lang.Throwable -> L63
            f1.s r3 = r0.c()     // Catch: java.lang.Throwable -> L63
            if (r3 == 0) goto L8b
            i2.n0 r0 = r13.f4031v     // Catch: java.lang.Throwable -> L63
            i2.f0 r0 = r0.f6365a     // Catch: java.lang.Throwable -> L63
            t2.o r0 = r0.f6298a     // Catch: java.lang.Throwable -> L63
            float r4 = r0.a()     // Catch: java.lang.Throwable -> L63
            i2.o.j(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L63
            goto Laa
        L8b:
            long r3 = f1.w.f3131g     // Catch: java.lang.Throwable -> L63
            r11 = 16
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 == 0) goto L94
            goto La7
        L94:
            i2.n0 r0 = r13.f4031v     // Catch: java.lang.Throwable -> L63
            long r3 = r0.a()     // Catch: java.lang.Throwable -> L63
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 == 0) goto La5
            i2.n0 r0 = r13.f4031v     // Catch: java.lang.Throwable -> L63
            long r3 = r0.a()     // Catch: java.lang.Throwable -> L63
            goto La7
        La5:
            long r3 = f1.w.f3126b     // Catch: java.lang.Throwable -> L63
        La7:
            i2.o.i(r1, r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L63
        Laa:
            if (r10 == 0) goto Laf
            r2.p()
        Laf:
            g0.i r0 = r13.I
            if (r0 == 0) goto Lb9
            boolean r0 = r0.f4028c
            if (r0 != r8) goto Lb9
            r0 = r9
            goto Lbf
        Lb9:
            i2.g r0 = r13.f4030u
            boolean r0 = f8.i.N(r0)
        Lbf:
            if (r0 != 0) goto Ld1
            java.util.List r0 = r13.C
            if (r0 == 0) goto Lcd
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lcc
            goto Lcd
        Lcc:
            r8 = r9
        Lcd:
            if (r8 != 0) goto Ld0
            goto Ld1
        Ld0:
            return
        Ld1:
            r14.e()
            return
        Ld5:
            if (r10 == 0) goto Lda
            r2.p()
        Lda:
            throw r14
        Ldb:
            java.lang.String r14 = "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: "
            g1.d.g(r0, r14)
            return
    }

    @Override // x1.v
    public final int G(x1.n0 r1, v1.m0 r2, int r3) {
            r0 = this;
            g0.d r2 = r0.l1(r1)
            u2.m r1 = r1.getLayoutDirection()
            be.k r1 = r2.e(r1)
            float r1 = r1.b()
            int r1 = w.s.n(r1)
            return r1
    }

    @Override // x1.v
    public final int K0(x1.n0 r1, v1.m0 r2, int r3) {
            r0 = this;
            g0.d r2 = r0.l1(r1)
            u2.m r1 = r1.getLayoutDirection()
            int r1 = r2.a(r3, r1)
            return r1
    }

    @Override // x1.v
    public final int Q(x1.n0 r1, v1.m0 r2, int r3) {
            r0 = this;
            g0.d r2 = r0.l1(r1)
            u2.m r1 = r1.getLayoutDirection()
            be.k r1 = r2.e(r1)
            float r1 = r1.c()
            int r1 = w.s.n(r1)
            return r1
    }

    @Override // x1.v
    public final int R0(x1.n0 r1, v1.m0 r2, int r3) {
            r0 = this;
            g0.d r2 = r0.l1(r1)
            u2.m r1 = r1.getLayoutDirection()
            int r1 = r2.a(r3, r1)
            return r1
    }

    @Override // x1.z1
    public final void X0(f2.y r7) {
            r6 = this;
            g0.h r0 = r6.H
            if (r0 != 0) goto Lc
            g0.h r0 = new g0.h
            r1 = 0
            r0.<init>(r6, r1)
            r6.H = r0
        Lc:
            i2.g r1 = r6.f4030u
            mg.d[] r2 = f2.w.f3251a
            f2.x r2 = f2.u.B
            java.util.List r1 = a.a.x0(r1)
            r7.a(r2, r1)
            g0.i r1 = r6.I
            if (r1 == 0) goto L39
            i2.g r2 = r1.f4027b
            f2.x r3 = f2.u.C
            mg.d[] r4 = f2.w.f3251a
            r5 = 16
            r5 = r4[r5]
            r7.a(r3, r2)
            boolean r1 = r1.f4028c
            f2.x r2 = f2.u.D
            r3 = 17
            r3 = r4[r3]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r7.a(r2, r1)
        L39:
            g0.h r1 = new g0.h
            r2 = 1
            r1.<init>(r6, r2)
            f2.x r2 = f2.l.f3189l
            f2.a r3 = new f2.a
            r4 = 0
            r3.<init>(r4, r1)
            r7.a(r2, r3)
            g0.h r1 = new g0.h
            r2 = 2
            r1.<init>(r6, r2)
            f2.x r2 = f2.l.f3190m
            f2.a r3 = new f2.a
            r3.<init>(r4, r1)
            r7.a(r2, r3)
            ab.a r1 = new ab.a
            r2 = 21
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
            java.lang.String r0 = "TextAnnotatedStringNode:measure"
            android.os.Trace.beginSection(r0)
            g0.d r0 = r4.l1(r5)     // Catch: java.lang.Throwable -> L30
            u2.m r1 = r5.getLayoutDirection()     // Catch: java.lang.Throwable -> L30
            boolean r7 = r0.c(r7, r1)     // Catch: java.lang.Throwable -> L30
            i2.k0 r8 = r0.f3988n     // Catch: java.lang.Throwable -> L30
            if (r8 == 0) goto L8b
            long r0 = r8.f6348c     // Catch: java.lang.Throwable -> L30
            i2.o r2 = r8.f6347b     // Catch: java.lang.Throwable -> L30
            be.k r2 = r2.f6368a     // Catch: java.lang.Throwable -> L30
            r2.a()     // Catch: java.lang.Throwable -> L30
            if (r7 == 0) goto L5b
            r7 = 2
            x1.i1 r2 = x1.k.t(r4, r7)     // Catch: java.lang.Throwable -> L30
            r2.y1()     // Catch: java.lang.Throwable -> L30
            fg.l r2 = r4.f4033x     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L32
            r2.invoke(r8)     // Catch: java.lang.Throwable -> L30
            goto L32
        L30:
            r5 = move-exception
            goto L9f
        L32:
            java.util.Map r2 = r4.F     // Catch: java.lang.Throwable -> L30
            if (r2 != 0) goto L3b
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L30
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L30
        L3b:
            v1.j r7 = v1.c.f13905a     // Catch: java.lang.Throwable -> L30
            float r3 = r8.f6349d     // Catch: java.lang.Throwable -> L30
            int r3 = java.lang.Math.round(r3)     // Catch: java.lang.Throwable -> L30
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L30
            r2.put(r7, r3)     // Catch: java.lang.Throwable -> L30
            v1.j r7 = v1.c.f13906b     // Catch: java.lang.Throwable -> L30
            float r3 = r8.f6350e     // Catch: java.lang.Throwable -> L30
            int r3 = java.lang.Math.round(r3)     // Catch: java.lang.Throwable -> L30
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L30
            r2.put(r7, r3)     // Catch: java.lang.Throwable -> L30
            r4.F = r2     // Catch: java.lang.Throwable -> L30
        L5b:
            fg.l r7 = r4.D     // Catch: java.lang.Throwable -> L30
            if (r7 == 0) goto L64
            java.util.ArrayList r8 = r8.f6351f     // Catch: java.lang.Throwable -> L30
            r7.invoke(r8)     // Catch: java.lang.Throwable -> L30
        L64:
            r7 = 32
            long r7 = r0 >> r7
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L30
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r8 = (int) r0     // Catch: java.lang.Throwable -> L30
            long r0 = f8.i.u(r7, r7, r8, r8)     // Catch: java.lang.Throwable -> L30
            v1.b1 r6 = r6.Q(r0)     // Catch: java.lang.Throwable -> L30
            java.util.Map r0 = r4.F     // Catch: java.lang.Throwable -> L30
            r0.getClass()     // Catch: java.lang.Throwable -> L30
            g0.g r1 = new g0.g     // Catch: java.lang.Throwable -> L30
            r2 = 0
            r1.<init>(r6, r2)     // Catch: java.lang.Throwable -> L30
            v1.o0 r5 = r5.z(r7, r8, r0, r1)     // Catch: java.lang.Throwable -> L30
            android.os.Trace.endSection()
            return r5
        L8b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            java.lang.String r7 = "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: "
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L30
            r6.append(r0)     // Catch: java.lang.Throwable -> L30
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L30
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L30
            throw r5     // Catch: java.lang.Throwable -> L30
        L9f:
            android.os.Trace.endSection()
            throw r5
    }

    public final g0.d k1() {
            r10 = this;
            g0.d r0 = r10.G
            if (r0 != 0) goto L1b
            g0.d r1 = new g0.d
            i2.g r2 = r10.f4030u
            i2.n0 r3 = r10.f4031v
            m2.d r4 = r10.f4032w
            int r5 = r10.f4034y
            boolean r6 = r10.f4035z
            int r7 = r10.A
            int r8 = r10.B
            java.util.List r9 = r10.C
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.G = r1
        L1b:
            g0.d r0 = r10.G
            r0.getClass()
            return r0
    }

    public final g0.d l1(u2.c r3) {
            r2 = this;
            g0.i r0 = r2.I
            if (r0 == 0) goto L10
            boolean r1 = r0.f4028c
            if (r1 == 0) goto L10
            g0.d r0 = r0.f4029d
            if (r0 == 0) goto L10
            r0.d(r3)
            return r0
        L10:
            g0.d r0 = r2.k1()
            r0.d(r3)
            return r0
    }
}
