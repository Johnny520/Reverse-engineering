package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements h1.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h1.b f20932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x1.m f20933h;

    public h0() {
            r1 = this;
            h1.b r0 = new h1.b
            r0.<init>()
            r1.<init>()
            r1.f20932g = r0
            return
    }

    @Override // h1.d
    public final void F0(f1.j r7, long r8, float r10, h1.c r11) {
            r6 = this;
            h1.b r0 = r6.f20932g
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            r0.F0(r1, r2, r4, r5)
            return
    }

    @Override // u2.c
    public final int G0(float r2) {
            r1 = this;
            h1.b r0 = r1.f20932g
            int r2 = r0.G0(r2)
            return r2
    }

    @Override // h1.d
    public final long I0() {
            r2 = this;
            h1.b r0 = r2.f20932g
            long r0 = r0.I0()
            return r0
    }

    @Override // u2.c
    public final long J(float r3) {
            r2 = this;
            h1.b r0 = r2.f20932g
            long r0 = r0.J(r3)
            return r0
    }

    @Override // u2.c
    public final long K(long r2) {
            r1 = this;
            h1.b r0 = r1.f20932g
            long r2 = r0.K(r2)
            return r2
    }

    @Override // u2.c
    public final long L0(long r2) {
            r1 = this;
            h1.b r0 = r1.f20932g
            long r2 = r0.L0(r2)
            return r2
    }

    @Override // u2.c
    public final float O0(long r2) {
            r1 = this;
            h1.b r0 = r1.f20932g
            float r2 = r0.O0(r2)
            return r2
    }

    @Override // h1.d
    public final void P0(long r11, long r13, long r15, float r17, h1.c r18, int r19) {
            r10 = this;
            h1.b r0 = r10.f20932g
            r1 = r11
            r3 = r13
            r5 = r15
            r7 = r17
            r8 = r18
            r9 = r19
            r0.P0(r1, r3, r5, r7, r8, r9)
            return
    }

    @Override // u2.c
    public final float S(long r2) {
            r1 = this;
            h1.b r0 = r1.f20932g
            float r2 = r0.S(r2)
            return r2
    }

    @Override // h1.d
    public final void V(f1.j r7, f1.s r8, float r9, h1.c r10, int r11) {
            r6 = this;
            h1.b r0 = r6.f20932g
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.V(r1, r2, r3, r4, r5)
            return
    }

    @Override // h1.d
    public final void W0(f1.g r8, long r9, float r11, f1.n r12, int r13) {
            r7 = this;
            h1.b r0 = r7.f20932g
            r1 = r8
            r2 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r0.W0(r1, r2, r4, r5, r6)
            return
    }

    @Override // h1.d
    public final long a() {
            r2 = this;
            h1.b r0 = r2.f20932g
            long r0 = r0.a()
            return r0
    }

    @Override // h1.d
    public final void a0(long r9, long r11, long r13, float r15) {
            r8 = this;
            h1.b r0 = r8.f20932g
            r1 = r9
            r3 = r11
            r5 = r13
            r7 = r15
            r0.a0(r1, r3, r5, r7)
            return
    }

    @Override // u2.c
    public final float d() {
            r1 = this;
            h1.b r0 = r1.f20932g
            float r0 = r0.d()
            return r0
    }

    @Override // h1.d
    public final void d0(f1.s r10, long r11, long r13, float r15, h1.c r16, int r17) {
            r9 = this;
            h1.b r0 = r9.f20932g
            r1 = r10
            r2 = r11
            r4 = r13
            r6 = r15
            r7 = r16
            r8 = r17
            r0.d0(r1, r2, r4, r6, r7, r8)
            return
    }

    public final void e() {
            r11 = this;
            h1.b r0 = r11.f20932g
            b5.c r1 = r0.f5038h
            f1.u r3 = r1.p()
            x1.m r1 = r11.f20933h
            if (r1 == 0) goto Lb8
            r2 = r1
            y0.n r2 = (y0.n) r2
            y0.n r4 = r2.f21819g
            y0.n r4 = r4.f21824l
            r9 = 0
            r10 = 4
            if (r4 != 0) goto L18
            goto L2f
        L18:
            int r5 = r4.f21822j
            r5 = r5 & r10
            if (r5 != 0) goto L1e
            goto L2f
        L1e:
            if (r4 == 0) goto L2f
            int r5 = r4.f21821i
            r6 = r5 & 2
            if (r6 == 0) goto L27
            goto L2f
        L27:
            r5 = r5 & 4
            if (r5 == 0) goto L2c
            goto L30
        L2c:
            y0.n r4 = r4.f21824l
            goto L1e
        L2f:
            r4 = r9
        L30:
            if (r4 == 0) goto L9d
            r1 = r9
        L33:
            if (r4 == 0) goto L9c
            boolean r2 = r4 instanceof x1.m
            if (r2 == 0) goto L60
            r7 = r4
            x1.m r7 = (x1.m) r7
            b5.c r2 = r0.f5038h
            java.lang.Object r2 = r2.f470b
            r8 = r2
            i1.b r8 = (i1.b) r8
            x1.i1 r6 = x1.k.t(r7, r10)
            long r4 = r6.f13902i
            long r4 = r9.e0.q0(r4)
            x1.f0 r2 = r6.f20943u
            r2.getClass()
            x1.r1 r2 = x1.i0.a(r2)
            y1.t r2 = (y1.t) r2
            x1.h0 r2 = r2.getSharedDrawScope()
            r2.j(r3, r4, r6, r7, r8)
            goto L97
        L60:
            int r2 = r4.f21821i
            r2 = r2 & r10
            if (r2 == 0) goto L97
            boolean r2 = r4 instanceof x1.j
            if (r2 == 0) goto L97
            r2 = r4
            x1.j r2 = (x1.j) r2
            y0.n r2 = r2.f20950v
            r5 = 0
        L6f:
            r6 = 1
            if (r2 == 0) goto L94
            int r7 = r2.f21821i
            r7 = r7 & r10
            if (r7 == 0) goto L91
            int r5 = r5 + 1
            if (r5 != r6) goto L7d
            r4 = r2
            goto L91
        L7d:
            if (r1 != 0) goto L88
            j0.b r1 = new j0.b
            r6 = 16
            y0.n[] r6 = new y0.n[r6]
            r1.<init>(r6)
        L88:
            if (r4 == 0) goto L8e
            r1.b(r4)
            r4 = r9
        L8e:
            r1.b(r2)
        L91:
            y0.n r2 = r2.f21824l
            goto L6f
        L94:
            if (r5 != r6) goto L97
            goto L33
        L97:
            y0.n r4 = x1.k.e(r1)
            goto L33
        L9c:
            return
        L9d:
            x1.i1 r1 = x1.k.t(r1, r10)
            y0.n r4 = r1.r1()
            y0.n r2 = r2.f21819g
            if (r4 != r2) goto Lae
            x1.i1 r1 = r1.f20944v
            r1.getClass()
        Lae:
            b5.c r0 = r0.f5038h
            java.lang.Object r0 = r0.f470b
            i1.b r0 = (i1.b) r0
            r1.G1(r3, r0)
            return
        Lb8:
            java.lang.String r0 = "Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer."
            af.d r0 = wb.en.a(r0)
            throw r0
    }

    @Override // u2.c
    public final long e0(float r3) {
            r2 = this;
            h1.b r0 = r2.f20932g
            long r0 = r0.e0(r3)
            return r0
    }

    @Override // h1.d
    public final u2.m getLayoutDirection() {
            r1 = this;
            h1.b r0 = r1.f20932g
            h1.a r0 = r0.f5037g
            u2.m r0 = r0.f5034b
            return r0
    }

    @Override // u2.c
    public final float i0(int r2) {
            r1 = this;
            h1.b r0 = r1.f20932g
            float r2 = r0.i0(r2)
            return r2
    }

    public final void j(f1.u r10, long r11, x1.i1 r13, x1.m r14, i1.b r15) {
            r9 = this;
            x1.m r0 = r9.f20933h
            r9.f20933h = r14
            x1.f0 r1 = r13.f20943u
            u2.m r1 = r1.F
            h1.b r2 = r9.f20932g
            b5.c r3 = r2.f5038h
            u2.c r3 = r3.s()
            b5.c r2 = r2.f5038h
            u2.m r4 = r2.u()
            f1.u r5 = r2.p()
            long r6 = r2.v()
            java.lang.Object r8 = r2.f470b
            i1.b r8 = (i1.b) r8
            r2.R(r13)
            r2.S(r1)
            r2.P(r10)
            r2.U(r11)
            r2.f470b = r15
            r10.e()
            r14.B(r9)     // Catch: java.lang.Throwable -> L4a
            r10.p()
            r2.R(r3)
            r2.S(r4)
            r2.P(r5)
            r2.U(r6)
            r2.f470b = r8
            r9.f20933h = r0
            return
        L4a:
            r11 = move-exception
            r10.p()
            r2.R(r3)
            r2.S(r4)
            r2.P(r5)
            r2.U(r6)
            r2.f470b = r8
            throw r11
    }

    @Override // u2.c
    public final float l0(float r2) {
            r1 = this;
            h1.b r0 = r1.f20932g
            float r0 = r0.d()
            float r2 = r2 / r0
            return r2
    }

    public final void m(f1.s r15, long r16, long r18, long r20, float r22, h1.c r23) {
            r14 = this;
            h1.b r0 = r14.f20932g
            h1.a r1 = r0.f5037g
            f1.u r7 = r1.f5035c
            r1 = 32
            long r2 = r16 >> r1
            int r2 = (int) r2
            float r8 = java.lang.Float.intBitsToFloat(r2)
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r16 & r3
            int r5 = (int) r5
            float r9 = java.lang.Float.intBitsToFloat(r5)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r10 = r18 >> r1
            int r6 = (int) r10
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r10 = r6 + r2
            float r2 = java.lang.Float.intBitsToFloat(r5)
            long r5 = r18 & r3
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r11 = r5 + r2
            long r1 = r20 >> r1
            int r1 = (int) r1
            float r12 = java.lang.Float.intBitsToFloat(r1)
            long r1 = r20 & r3
            int r1 = (int) r1
            float r13 = java.lang.Float.intBitsToFloat(r1)
            r6 = 1
            r4 = 0
            r5 = 3
            r1 = r15
            r3 = r22
            r2 = r23
            f1.h r15 = r0.j(r1, r2, r3, r4, r5, r6)
            r22 = r15
            r15 = r7
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r20 = r12
            r21 = r13
            r15.q(r16, r17, r18, r19, r20, r21, r22)
            return
    }

    @Override // u2.c
    public final float q0() {
            r1 = this;
            h1.b r0 = r1.f20932g
            float r0 = r0.q0()
            return r0
    }

    @Override // h1.d
    public final void t0(float r7, long r8, long r10) {
            r6 = this;
            h1.b r0 = r6.f20932g
            r1 = r7
            r2 = r8
            r4 = r10
            r0.t0(r1, r2, r4)
            return
    }

    @Override // h1.d
    public final void v0(f1.g r12, long r13, long r15, long r17, float r19, f1.n r20, int r21) {
            r11 = this;
            h1.b r0 = r11.f20932g
            r1 = r12
            r2 = r13
            r4 = r15
            r6 = r17
            r8 = r19
            r9 = r20
            r10 = r21
            r0.v0(r1, r2, r4, r6, r8, r9, r10)
            return
    }

    @Override // h1.d
    public final void x(long r7, long r9, h1.c r11) {
            r6 = this;
            h1.b r0 = r6.f20932g
            r1 = r7
            r3 = r9
            r5 = r11
            r0.x(r1, r3, r5)
            return
    }

    @Override // u2.c
    public final float x0(float r2) {
            r1 = this;
            h1.b r0 = r1.f20932g
            float r0 = r0.d()
            float r0 = r0 * r2
            return r0
    }

    @Override // h1.d
    public final void y(long r8, fg.l r10, i1.b r11) {
            r7 = this;
            x1.m r0 = r7.f20933h
            u2.m r3 = r7.getLayoutDirection()
            b1.g r6 = new b1.g
            r1 = 5
            r6.<init>(r7, r0, r10, r1)
            r2 = r7
            r4 = r8
            r1 = r11
            r1.e(r2, r3, r4, r6)
            return
    }

    @Override // h1.d
    public final b5.c z0() {
            r1 = this;
            h1.b r0 = r1.f20932g
            b5.c r0 = r0.f5038h
            return r0
    }
}
