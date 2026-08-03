package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements v1.t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x1.o0 f13982g;

    public l0(x1.o0 r1) {
            r0 = this;
            r0.<init>()
            r0.f13982g = r1
            return
    }

    @Override // v1.t
    public final boolean C() {
            r1 = this;
            x1.o0 r0 = r1.f13982g
            x1.i1 r0 = r0.f21007u
            y0.n r0 = r0.r1()
            boolean r0 = r0.f21832t
            return r0
    }

    @Override // v1.t
    public final void E(float[] r2) {
            r1 = this;
            x1.o0 r0 = r1.f13982g
            x1.i1 r0 = r0.f21007u
            r0.E(r2)
            return
    }

    @Override // v1.t
    public final long F() {
            r7 = this;
            x1.o0 r0 = r7.f13982g
            int r1 = r0.f13900g
            int r0 = r0.f13901h
            long r1 = (long) r1
            r3 = 32
            long r1 = r1 << r3
            long r3 = (long) r0
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            long r0 = r1 | r3
            return r0
    }

    @Override // v1.t
    public final long P(long r5) {
            r4 = this;
            x1.o0 r5 = r4.f13982g
            x1.i1 r5 = r5.f21007u
            long r0 = r4.a()
            r2 = 0
            long r0 = e1.b.e(r2, r0)
            long r5 = r5.P(r0)
            return r5
    }

    @Override // v1.t
    public final long R(long r3) {
            r2 = this;
            x1.o0 r0 = r2.f13982g
            x1.i1 r0 = r0.f21007u
            long r3 = r0.R(r3)
            long r0 = r2.a()
            long r3 = e1.b.e(r3, r0)
            return r3
    }

    @Override // v1.t
    public final long W(v1.t r11, long r12) {
            r10 = this;
            boolean r0 = r11 instanceof v1.l0
            x1.o0 r1 = r10.f13982g
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r4 = 32
            if (r0 == 0) goto L9d
            v1.l0 r11 = (v1.l0) r11
            x1.o0 r11 = r11.f13982g
            x1.i1 r0 = r11.f21007u
            r0.A1()
            x1.i1 r5 = r1.f21007u
            x1.i1 r0 = r5.n1(r0)
            x1.o0 r0 = r0.p1()
            r5 = 0
            if (r0 == 0) goto L4d
            long r6 = r11.j1(r0, r5)
            long r11 = ig.a.W(r12)
            long r11 = u2.j.d(r6, r11)
            long r0 = r1.j1(r0, r5)
            long r11 = u2.j.c(r11, r0)
            long r0 = r11 >> r4
            int r13 = (int) r0
            float r13 = (float) r13
            long r11 = r11 & r2
            int r11 = (int) r11
            float r11 = (float) r11
            int r12 = java.lang.Float.floatToRawIntBits(r13)
            long r12 = (long) r12
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            long r0 = (long) r11
            long r11 = r12 << r4
            long r0 = r0 & r2
            long r11 = r11 | r0
            return r11
        L4d:
            x1.o0 r0 = v1.w.j(r11)
            long r6 = r11.j1(r0, r5)
            long r8 = r0.f21008v
            long r6 = u2.j.d(r6, r8)
            long r11 = ig.a.W(r12)
            long r11 = u2.j.d(r6, r11)
            x1.o0 r13 = v1.w.j(r1)
            long r5 = r1.j1(r13, r5)
            long r7 = r13.f21008v
            long r5 = u2.j.d(r5, r7)
            long r11 = u2.j.c(r11, r5)
            long r5 = r11 >> r4
            int r1 = (int) r5
            float r1 = (float) r1
            long r11 = r11 & r2
            int r11 = (int) r11
            float r11 = (float) r11
            int r12 = java.lang.Float.floatToRawIntBits(r1)
            long r5 = (long) r12
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            long r11 = (long) r11
            long r4 = r5 << r4
            long r11 = r11 & r2
            long r11 = r11 | r4
            x1.i1 r13 = r13.f21007u
            x1.i1 r13 = r13.f20945w
            r13.getClass()
            x1.i1 r0 = r0.f21007u
            x1.i1 r0 = r0.f20945w
            r0.getClass()
            long r11 = r13.W(r0, r11)
            return r11
        L9d:
            x1.o0 r0 = v1.w.j(r1)
            x1.i1 r1 = r0.f21007u
            v1.l0 r5 = r0.f21010x
            long r12 = r10.W(r5, r12)
            long r5 = r0.f21008v
            long r7 = r5 >> r4
            int r0 = (int) r7
            float r0 = (float) r0
            long r5 = r5 & r2
            int r5 = (int) r5
            float r5 = (float) r5
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r6 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r5)
            long r8 = (long) r0
            long r4 = r6 << r4
            long r2 = r2 & r8
            long r2 = r2 | r4
            long r12 = e1.b.d(r12, r2)
            y0.n r0 = r1.r1()
            boolean r0 = r0.f21832t
            if (r0 != 0) goto Ld1
            java.lang.String r0 = "LayoutCoordinate operations are only valid when isAttached is true"
            u1.a.b(r0)
        Ld1:
            r1.A1()
            x1.i1 r0 = r1.f20945w
            if (r0 != 0) goto Ld9
            goto Lda
        Ld9:
            r1 = r0
        Lda:
            r2 = 0
            long r0 = r1.W(r11, r2)
            long r11 = e1.b.e(r12, r0)
            return r11
    }

    public final long a() {
            r7 = this;
            x1.o0 r0 = r7.f13982g
            x1.o0 r1 = v1.w.j(r0)
            v1.l0 r2 = r1.f21010x
            r3 = 0
            long r5 = r7.W(r2, r3)
            x1.i1 r0 = r0.f21007u
            x1.i1 r1 = r1.f21007u
            long r0 = r0.W(r1, r3)
            long r0 = e1.b.d(r5, r0)
            return r0
    }

    @Override // v1.t
    public final v1.t b0() {
            r1 = this;
            boolean r0 = r1.C()
            if (r0 != 0) goto Lb
            java.lang.String r0 = "LayoutCoordinate operations are only valid when isAttached is true"
            u1.a.b(r0)
        Lb:
            x1.o0 r0 = r1.f13982g
            x1.i1 r0 = r0.f21007u
            x1.f0 r0 = r0.f20943u
            x1.b1 r0 = r0.L
            x1.i1 r0 = r0.f20842d
            x1.i1 r0 = r0.f20945w
            if (r0 == 0) goto L22
            x1.o0 r0 = r0.p1()
            if (r0 == 0) goto L22
            v1.l0 r0 = r0.f21010x
            return r0
        L22:
            r0 = 0
            return r0
    }

    @Override // v1.t
    public final void g0(v1.t r2, float[] r3) {
            r1 = this;
            x1.o0 r0 = r1.f13982g
            x1.i1 r0 = r0.f21007u
            r0.g0(r2, r3)
            return
    }

    @Override // v1.t
    public final long j0(long r3) {
            r2 = this;
            x1.o0 r0 = r2.f13982g
            x1.i1 r0 = r0.f21007u
            long r3 = r0.j0(r3)
            long r0 = r2.a()
            long r3 = e1.b.e(r3, r0)
            return r3
    }

    @Override // v1.t
    public final e1.c k0(v1.t r2, boolean r3) {
            r1 = this;
            x1.o0 r0 = r1.f13982g
            x1.i1 r0 = r0.f21007u
            e1.c r2 = r0.k0(r2, r3)
            return r2
    }

    @Override // v1.t
    public final long m(long r4) {
            r3 = this;
            x1.o0 r0 = r3.f13982g
            x1.i1 r0 = r0.f21007u
            long r1 = r3.a()
            long r4 = e1.b.e(r4, r1)
            long r4 = r0.m(r4)
            return r4
    }

    @Override // v1.t
    public final long m0(long r4) {
            r3 = this;
            x1.o0 r0 = r3.f13982g
            x1.i1 r0 = r0.f21007u
            long r1 = r3.a()
            long r4 = e1.b.e(r4, r1)
            long r4 = r0.m0(r4)
            return r4
    }

    @Override // v1.t
    public final long w(v1.t r1, long r2) {
            r0 = this;
            long r1 = r0.W(r1, r2)
            return r1
    }
}
