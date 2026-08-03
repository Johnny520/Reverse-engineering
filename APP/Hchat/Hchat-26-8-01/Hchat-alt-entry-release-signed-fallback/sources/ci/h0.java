package ci;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements m.q1, u2.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u2.c f1723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1724h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1725i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final yg.b f1726j;

    public h0(u2.c r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f1723g = r1
            yg.b r1 = new yg.b
            r1.<init>()
            r0.f1726j = r1
            return
    }

    @Override // u2.c
    public final int G0(float r2) {
            r1 = this;
            u2.c r0 = r1.f1723g
            int r2 = r0.G0(r2)
            return r2
    }

    @Override // u2.c
    public final long J(float r3) {
            r2 = this;
            u2.c r0 = r2.f1723g
            long r0 = r0.J(r3)
            return r0
    }

    @Override // u2.c
    public final long K(long r2) {
            r1 = this;
            u2.c r0 = r1.f1723g
            long r2 = r0.K(r2)
            return r2
    }

    @Override // u2.c
    public final long L0(long r2) {
            r1 = this;
            u2.c r0 = r1.f1723g
            long r2 = r0.L0(r2)
            return r2
    }

    @Override // u2.c
    public final float O0(long r2) {
            r1 = this;
            u2.c r0 = r1.f1723g
            float r2 = r0.O0(r2)
            return r2
    }

    @Override // u2.c
    public final float S(long r2) {
            r1 = this;
            u2.c r0 = r1.f1723g
            float r2 = r0.S(r2)
            return r2
    }

    @Override // m.q1
    public final java.lang.Object T(yf.c r5) {
            r4 = this;
            boolean r0 = r5 instanceof ci.g0
            if (r0 == 0) goto L13
            r0 = r5
            ci.g0 r0 = (ci.g0) r0
            int r1 = r0.f1717i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1717i = r1
            goto L18
        L13:
            ci.g0 r0 = new ci.g0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f1715g
            int r1 = r0.f1717i
            yg.b r2 = r4.f1726j
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L27
            f8.i.I0(r5)
            goto L44
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r5)
            r5 = 0
            return r5
        L2e:
            f8.i.I0(r5)
            boolean r5 = r4.f1724h
            if (r5 != 0) goto L48
            boolean r5 = r4.f1725i
            if (r5 != 0) goto L48
            r0.f1717i = r3
            java.lang.Object r5 = r2.d(r0)
            xf.a r0 = xf.a.f21579g
            if (r5 != r0) goto L44
            return r0
        L44:
            r5 = 0
            r2.f(r5)
        L48:
            boolean r5 = r4.f1724h
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
    }

    @Override // u2.c
    public final float d() {
            r1 = this;
            u2.c r0 = r1.f1723g
            float r0 = r0.d()
            return r0
    }

    public final java.lang.Object e(yf.c r5) {
            r4 = this;
            boolean r0 = r5 instanceof ci.f0
            if (r0 == 0) goto L13
            r0 = r5
            ci.f0 r0 = (ci.f0) r0
            int r1 = r0.f1705i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1705i = r1
            goto L18
        L13:
            ci.f0 r0 = new ci.f0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f1703g
            int r1 = r0.f1705i
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            f8.i.I0(r5)
            goto L3c
        L25:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r5)
            r5 = 0
            return r5
        L2c:
            f8.i.I0(r5)
            r0.f1705i = r2
            yg.b r5 = r4.f1726j
            java.lang.Object r5 = r5.d(r0)
            xf.a r0 = xf.a.f21579g
            if (r5 != r0) goto L3c
            return r0
        L3c:
            r5 = 0
            r4.f1724h = r5
            r4.f1725i = r5
            sf.n r5 = sf.n.f12433a
            return r5
    }

    @Override // u2.c
    public final long e0(float r3) {
            r2 = this;
            u2.c r0 = r2.f1723g
            long r0 = r0.e0(r3)
            return r0
    }

    @Override // u2.c
    public final float i0(int r2) {
            r1 = this;
            u2.c r0 = r1.f1723g
            float r2 = r0.i0(r2)
            return r2
    }

    @Override // u2.c
    public final float l0(float r2) {
            r1 = this;
            u2.c r0 = r1.f1723g
            float r2 = r0.l0(r2)
            return r2
    }

    @Override // u2.c
    public final float q0() {
            r1 = this;
            u2.c r0 = r1.f1723g
            float r0 = r0.q0()
            return r0
    }

    @Override // u2.c
    public final float x0(float r2) {
            r1 = this;
            u2.c r0 = r1.f1723g
            float r2 = r0.x0(r2)
            return r2
    }
}
