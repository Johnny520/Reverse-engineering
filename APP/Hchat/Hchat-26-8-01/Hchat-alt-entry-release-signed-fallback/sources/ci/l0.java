package ci;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends x1.j implements x1.w1, x1.z1, x1.e2 {
    public static final ci.a F = null;
    public x1.i A;
    public n.m B;
    public n.k C;
    public boolean D;
    public final ci.a E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public n.k f1745w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public k.y0 f1746x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f1747y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public s1.l0 f1748z;

    static {
            ci.a r0 = new ci.a
            r0.<init>()
            ci.l0.F = r0
            return
    }

    public l0(n.k r1, k.y0 r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f1745w = r1
            r0.f1746x = r2
            r0.f1747y = r3
            r0.C = r1
            if (r1 != 0) goto L11
            if (r2 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            r0.D = r1
            ci.a r1 = ci.l0.F
            r0.E = r1
            return
    }

    public static final void n1(ci.l0 r2, qg.t r3, qg.r0 r4, fg.p r5) {
            ci.h r2 = new ci.h
            r0 = 0
            r1 = 0
            r2.<init>(r4, r5, r1, r0)
            r4 = 3
            qg.v.q(r3, r1, r2, r4)
            return
    }

    @Override // x1.e2
    public final java.lang.Object F() {
            r1 = this;
            ci.a r0 = r1.E
            return r0
    }

    @Override // x1.w1
    public final void P(s1.k r9, s1.l r10, long r11) {
            r8 = this;
            r9.getClass()
            r0 = 33
            long r1 = r11 >> r0
            r3 = 32
            long r1 = r1 << r3
            long r4 = r11 << r3
            long r4 = r4 >> r0
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            long r0 = r1 | r4
            long r2 = r0 >> r3
            int r2 = (int) r2
            float r2 = (float) r2
            long r0 = r0 & r6
            int r0 = (int) r0
            float r0 = (float) r0
            java.lang.Float.floatToRawIntBits(r2)
            java.lang.Float.floatToRawIntBits(r0)
            r8.p1()
            s1.l0 r0 = r8.f1748z
            if (r0 != 0) goto L3c
            c0.g r0 = new c0.g
            r1 = 1
            r0.<init>(r8, r1)
            s1.k r1 = s1.h0.f12244a
            s1.l0 r1 = new s1.l0
            r2 = 0
            r1.<init>(r2, r2, r2, r0)
            r8.k1(r1)
            r8.f1748z = r1
        L3c:
            s1.l0 r0 = r8.f1748z
            if (r0 == 0) goto L43
            r0.P(r9, r10, r11)
        L43:
            x1.i r0 = r8.A
            boolean r1 = r0 instanceof x1.w1
            if (r1 == 0) goto L4e
            x1.w1 r0 = (x1.w1) r0
            r0.P(r9, r10, r11)
        L4e:
            return
    }

    @Override // x1.z1
    public final boolean S0() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // x1.z1
    public final void X0(f2.y r3) {
            r2 = this;
            r3.getClass()
            boolean r0 = r2.f1747y
            if (r0 != 0) goto L10
            mg.d[] r0 = f2.w.f3251a
            f2.x r0 = f2.u.f3232j
            sf.n r1 = sf.n.f12433a
            r3.a(r0, r1)
        L10:
            return
    }

    @Override // y0.n
    public final boolean Z0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // x1.w1
    public final void b0() {
            r2 = this;
            s1.l0 r0 = r2.f1748z
            if (r0 == 0) goto L7
            r0.b0()
        L7:
            x1.i r0 = r2.A
            boolean r1 = r0 instanceof x1.w1
            if (r1 == 0) goto L1a
            boolean r1 = r0 instanceof x1.w1
            if (r1 == 0) goto L14
            x1.w1 r0 = (x1.w1) r0
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L1a
            r0.b0()
        L1a:
            return
    }

    @Override // y0.n
    public final void c1() {
            r1 = this;
            boolean r0 = r1.D
            if (r0 != 0) goto L7
            r1.p1()
        L7:
            return
    }

    @Override // y0.n
    public final void d1() {
            r2 = this;
            r2.o1()
            n.k r0 = r2.C
            r1 = 0
            if (r0 != 0) goto La
            r2.f1745w = r1
        La:
            x1.i r0 = r2.A
            if (r0 == 0) goto L11
            r2.l1(r0)
        L11:
            r2.A = r1
            return
    }

    public final void o1() {
            r3 = this;
            n.k r0 = r3.f1745w
            if (r0 == 0) goto L10
            n.m r1 = r3.B
            if (r1 == 0) goto L10
            n.l r2 = new n.l
            r2.<init>(r1)
            r0.b(r2)
        L10:
            r0 = 0
            r3.B = r0
            return
    }

    public final void p1() {
            r2 = this;
            x1.i r0 = r2.A
            if (r0 == 0) goto L5
            goto L22
        L5:
            k.y0 r0 = r2.f1746x
            if (r0 == 0) goto L22
            n.k r1 = r2.f1745w
            if (r1 != 0) goto L14
            n.k r1 = new n.k
            r1.<init>()
            r2.f1745w = r1
        L14:
            n.k r1 = r2.f1745w
            r1.getClass()
            x1.i r0 = r0.a(r1)
            r2.k1(r0)
            r2.A = r0
        L22:
            return
    }
}
