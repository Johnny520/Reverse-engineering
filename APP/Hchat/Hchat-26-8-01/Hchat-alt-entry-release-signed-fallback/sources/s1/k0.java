package s1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements u2.c, wf.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s1.l0 f12268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qg.g f12269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public qg.g f12270i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s1.l f12271j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final wf.h f12272k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s1.l0 f12273l;

    public k0(s1.l0 r1, qg.g r2) {
            r0 = this;
            r0.<init>()
            r0.f12273l = r1
            r0.f12268g = r1
            r0.f12269h = r2
            s1.l r1 = s1.l.f12275h
            r0.f12271j = r1
            wf.h r1 = wf.h.f20786g
            r0.f12272k = r1
            return
    }

    public final y1.l2 B() {
            r1 = this;
            s1.l0 r0 = r1.f12273l
            x1.f0 r0 = x1.k.w(r0)
            y1.l2 r0 = r0.G
            return r0
    }

    public final java.lang.Object C(long r10, fg.p r12, yf.c r13) {
            r9 = this;
            boolean r0 = r13 instanceof s1.i0
            if (r0 == 0) goto L13
            r0 = r13
            s1.i0 r0 = (s1.i0) r0
            int r1 = r0.f12256j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12256j = r1
            goto L18
        L13:
            s1.i0 r0 = new s1.i0
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.f12254h
            int r1 = r0.f12256j
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            qg.e1 r10 = r0.f12253g
            f8.i.I0(r13)     // Catch: java.lang.Throwable -> L28
            r6 = r9
            goto L6e
        L28:
            r0 = move-exception
            r11 = r0
            r6 = r9
            goto L76
        L2c:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r10)
            r10 = 0
            return r10
        L33:
            f8.i.I0(r13)
            r3 = 0
            int r13 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r13 > 0) goto L4d
            qg.g r13 = r9.f12270i
            if (r13 == 0) goto L4d
            s1.m r1 = new s1.m
            r1.<init>(r10)
            sf.f r3 = new sf.f
            r3.<init>(r1)
            r13.resumeWith(r3)
        L4d:
            s1.l0 r13 = r9.f12273l
            qg.t r13 = r13.Y0()
            h0.k0 r3 = new h0.k0
            r8 = 1
            r7 = 0
            r6 = r9
            r4 = r10
            r3.<init>(r4, r6, r7, r8)
            r10 = 3
            qg.e1 r10 = qg.v.q(r13, r7, r3, r10)
            r0.f12253g = r10     // Catch: java.lang.Throwable -> L74
            r0.f12256j = r2     // Catch: java.lang.Throwable -> L74
            java.lang.Object r13 = r12.invoke(r9, r0)     // Catch: java.lang.Throwable -> L74
            xf.a r11 = xf.a.f21579g
            if (r13 != r11) goto L6e
            return r11
        L6e:
            s1.b r11 = s1.b.f12207h
            r10.a(r11)
            return r13
        L74:
            r0 = move-exception
            r11 = r0
        L76:
            s1.b r12 = s1.b.f12207h
            r10.a(r12)
            throw r11
    }

    public final java.lang.Object E(long r5, fg.p r7, yf.a r8) {
            r4 = this;
            boolean r0 = r8 instanceof s1.j0
            if (r0 == 0) goto L13
            r0 = r8
            s1.j0 r0 = (s1.j0) r0
            int r1 = r0.f12261i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12261i = r1
            goto L18
        L13:
            s1.j0 r0 = new s1.j0
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f12259g
            int r1 = r0.f12261i
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            f8.i.I0(r8)     // Catch: s1.m -> L3b
            return r8
        L25:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r5)
            r5 = 0
            return r5
        L2c:
            f8.i.I0(r8)
            r0.f12261i = r2     // Catch: s1.m -> L3b
            java.lang.Object r5 = r4.C(r5, r7, r0)     // Catch: s1.m -> L3b
            xf.a r6 = xf.a.f21579g
            if (r5 != r6) goto L3a
            return r6
        L3a:
            return r5
        L3b:
            r5 = 0
            return r5
    }

    @Override // u2.c
    public final int G0(float r2) {
            r1 = this;
            s1.l0 r0 = r1.f12268g
            int r2 = r0.G0(r2)
            return r2
    }

    @Override // u2.c
    public final long J(float r3) {
            r2 = this;
            s1.l0 r0 = r2.f12268g
            long r0 = r0.J(r3)
            return r0
    }

    @Override // u2.c
    public final long K(long r2) {
            r1 = this;
            s1.l0 r0 = r1.f12268g
            long r2 = r0.K(r2)
            return r2
    }

    @Override // u2.c
    public final long L0(long r2) {
            r1 = this;
            s1.l0 r0 = r1.f12268g
            long r2 = r0.L0(r2)
            return r2
    }

    @Override // u2.c
    public final float O0(long r2) {
            r1 = this;
            s1.l0 r0 = r1.f12268g
            float r2 = r0.O0(r2)
            return r2
    }

    @Override // u2.c
    public final float S(long r2) {
            r1 = this;
            s1.l0 r0 = r1.f12268g
            float r2 = r0.S(r2)
            return r2
    }

    @Override // u2.c
    public final float d() {
            r1 = this;
            s1.l0 r0 = r1.f12268g
            float r0 = r0.d()
            return r0
    }

    public final java.lang.Object e(s1.l r3, wf.c r4) {
            r2 = this;
            qg.g r0 = new qg.g
            wf.c r4 = fb.v0.x(r4)
            r1 = 1
            r0.<init>(r1, r4)
            r0.p()
            r2.f12271j = r3
            r2.f12270i = r0
            java.lang.Object r3 = r0.o()
            return r3
    }

    @Override // u2.c
    public final long e0(float r3) {
            r2 = this;
            s1.l0 r0 = r2.f12268g
            long r0 = r0.e0(r3)
            return r0
    }

    @Override // wf.c
    public final wf.g getContext() {
            r1 = this;
            wf.h r0 = r1.f12272k
            return r0
    }

    @Override // u2.c
    public final float i0(int r2) {
            r1 = this;
            s1.l0 r0 = r1.f12268g
            float r2 = r0.i0(r2)
            return r2
    }

    @Override // u2.c
    public final float l0(float r2) {
            r1 = this;
            s1.l0 r0 = r1.f12268g
            float r0 = r0.d()
            float r2 = r2 / r0
            return r2
    }

    public final long m() {
            r10 = this;
            s1.l0 r0 = r10.f12273l
            x1.f0 r1 = x1.k.w(r0)
            y1.l2 r1 = r1.G
            long r1 = r1.d()
            long r1 = r0.L0(r1)
            long r3 = r0.E
            r0 = 32
            long r5 = r1 >> r0
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            long r6 = r3 >> r0
            int r6 = (int) r6
            float r6 = (float) r6
            float r5 = r5 - r6
            r6 = 0
            float r5 = java.lang.Math.max(r6, r5)
            r7 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r7
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r8
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r2 = r3 & r8
            int r2 = (int) r2
            float r2 = (float) r2
            float r1 = r1 - r2
            float r1 = java.lang.Math.max(r6, r1)
            float r1 = r1 / r7
            int r2 = java.lang.Float.floatToRawIntBits(r5)
            long r2 = (long) r2
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r4 = (long) r1
            long r0 = r2 << r0
            long r2 = r4 & r8
            long r0 = r0 | r2
            return r0
    }

    @Override // u2.c
    public final float q0() {
            r1 = this;
            s1.l0 r0 = r1.f12268g
            float r0 = r0.q0()
            return r0
    }

    @Override // wf.c
    public final void resumeWith(java.lang.Object r3) {
            r2 = this;
            s1.l0 r0 = r2.f12273l
            j0.b r1 = r0.B
            monitor-enter(r1)
            j0.b r0 = r0.A     // Catch: java.lang.Throwable -> L11
            r0.j(r2)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            qg.g r0 = r2.f12269h
            r0.resumeWith(r3)
            return
        L11:
            r3 = move-exception
            monitor-exit(r1)
            throw r3
    }

    @Override // u2.c
    public final float x0(float r2) {
            r1 = this;
            s1.l0 r0 = r1.f12268g
            float r0 = r0.d()
            float r0 = r0 * r2
            return r0
    }
}
