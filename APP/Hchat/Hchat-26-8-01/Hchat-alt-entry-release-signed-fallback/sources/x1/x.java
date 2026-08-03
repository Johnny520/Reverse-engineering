package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends x1.i1 {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final f1.h f21093a0 = null;
    public x1.v Y;
    public x1.w Z;

    static {
            f1.h r0 = f1.c0.f()
            int r1 = f1.w.f3132h
            long r1 = f1.w.f3129e
            r0.w(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.C(r1)
            r1 = 1
            r0.D(r1)
            x1.x.f21093a0 = r0
            return
    }

    public x(x1.f0 r1, x1.v r2) {
            r0 = this;
            r0.<init>(r1)
            r0.Y = r2
            x1.f0 r1 = r1.f20896n
            if (r1 == 0) goto Lf
            x1.w r1 = new x1.w
            r1.<init>(r0)
            goto L10
        Lf:
            r1 = 0
        L10:
            r0.Z = r1
            y0.n r2 = (y0.n) r2
            y0.n r1 = r2.f21819g
            int r1 = r1.f21821i
            r1 = r1 & 512(0x200, float:7.17E-43)
            if (r1 != 0) goto L1d
            return
        L1d:
            ah.a.d()
            r1 = 0
            throw r1
    }

    @Override // v1.b1
    public final void A0(long r7, float r9, fg.l r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            r4 = r10
            r0.H1(r1, r3, r4, r5)
            r6.T1()
            return
    }

    @Override // x1.i1, v1.b1
    public final void B0(long r7, float r9, i1.b r10) {
            r6 = this;
            r4 = 0
            r0 = r6
            r1 = r7
            r3 = r9
            r5 = r10
            r0.H1(r1, r3, r4, r5)
            r6.T1()
            return
    }

    @Override // v1.m0
    public final int G(int r3) {
            r2 = this;
            x1.v r0 = r2.Y
            x1.i1 r1 = r2.f20944v
            r1.getClass()
            int r3 = r0.G(r2, r1, r3)
            return r3
    }

    @Override // x1.i1
    public final void G1(f1.u r10, i1.b r11) {
            r9 = this;
            x1.i1 r0 = r9.f20944v
            r0.getClass()
            r0.k1(r10, r11)
            x1.f0 r11 = r9.f20943u
            x1.r1 r11 = x1.i0.a(r11)
            y1.t r11 = (y1.t) r11
            boolean r11 = r11.getShowLayoutBounds()
            if (r11 == 0) goto L4e
            x1.i1 r11 = r9.f20944v
            if (r11 == 0) goto L4e
            long r0 = r9.f13902i
            long r2 = r11.f13902i
            boolean r0 = u2.l.a(r0, r2)
            if (r0 == 0) goto L2e
            long r0 = r11.F
            r2 = 0
            boolean r11 = u2.j.b(r0, r2)
            if (r11 != 0) goto L4e
        L2e:
            long r0 = r9.f13902i
            r11 = 32
            long r2 = r0 >> r11
            int r11 = (int) r2
            float r11 = (float) r11
            r2 = 1056964608(0x3f000000, float:0.5)
            float r6 = r11 - r2
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r3
            int r11 = (int) r0
            float r11 = (float) r11
            float r7 = r11 - r2
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 1056964608(0x3f000000, float:0.5)
            f1.h r8 = x1.x.f21093a0
            r3 = r10
            r3.t(r4, r5, r6, r7, r8)
        L4e:
            return
    }

    @Override // x1.n0
    public final int K0(v1.j r2) {
            r1 = this;
            x1.w r0 = r1.Z
            if (r0 == 0) goto L14
            f.b0 r0 = r0.f21012z
            int r2 = r0.d(r2)
            if (r2 < 0) goto L11
            int[] r0 = r0.f2776c
            r2 = r0[r2]
            return r2
        L11:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            return r2
        L14:
            int r2 = x1.k.c(r1, r2)
            return r2
    }

    @Override // v1.m0
    public final int M(int r3) {
            r2 = this;
            x1.v r0 = r2.Y
            x1.i1 r1 = r2.f20944v
            r1.getClass()
            int r3 = r0.Q(r2, r1, r3)
            return r3
    }

    @Override // v1.m0
    public final v1.b1 Q(long r3) {
            r2 = this;
            r2.E0(r3)
            x1.v r0 = r2.Y
            x1.i1 r1 = r2.f20944v
            r1.getClass()
            v1.o0 r3 = r0.j(r2, r1, r3)
            r2.K1(r3)
            r2.B1()
            return r2
    }

    public final void T1() {
            r2 = this;
            boolean r0 = r2.f20998p
            if (r0 == 0) goto L5
            return
        L5:
            r2.C1()
            x1.i1 r0 = r2.f20944v
            r0.getClass()
            boolean r1 = r2.f20999q
            r0.f20999q = r1
            v1.o0 r1 = r2.Z0()
            r1.f()
            r1 = 0
            r0.f20999q = r1
            return
    }

    public final void U1(x1.v r2) {
            r1 = this;
            x1.v r0 = r1.Y
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L18
            r0 = r2
            y0.n r0 = (y0.n) r0
            y0.n r0 = r0.f21819g
            int r0 = r0.f21821i
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 != 0) goto L14
            goto L18
        L14:
            ah.a.d()
            return
        L18:
            r1.Y = r2
            return
    }

    @Override // v1.m0
    public final int j(int r3) {
            r2 = this;
            x1.v r0 = r2.Y
            x1.i1 r1 = r2.f20944v
            r1.getClass()
            int r3 = r0.R0(r2, r1, r3)
            return r3
    }

    @Override // x1.i1
    public final void m1() {
            r1 = this;
            x1.w r0 = r1.Z
            if (r0 != 0) goto Lb
            x1.w r0 = new x1.w
            r0.<init>(r1)
            r1.Z = r0
        Lb:
            return
    }

    @Override // v1.m0
    public final int p0(int r3) {
            r2 = this;
            x1.v r0 = r2.Y
            x1.i1 r1 = r2.f20944v
            r1.getClass()
            int r3 = r0.K0(r2, r1, r3)
            return r3
    }

    @Override // x1.i1
    public final x1.o0 p1() {
            r1 = this;
            x1.w r0 = r1.Z
            return r0
    }

    @Override // x1.i1
    public final y0.n r1() {
            r1 = this;
            x1.v r0 = r1.Y
            y0.n r0 = (y0.n) r0
            y0.n r0 = r0.f21819g
            return r0
    }
}
