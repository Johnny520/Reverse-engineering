package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements v1.k1, v1.p0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v1.d0 f13888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v1.j0 f13889h;

    public a0(v1.j0 r1) {
            r0 = this;
            r0.<init>()
            r0.f13889h = r1
            v1.d0 r1 = r1.f13962n
            r0.f13888g = r1
            return
    }

    @Override // v1.p0
    public final v1.o0 D0(int r7, int r8, java.util.Map r9, fg.l r10, fg.l r11) {
            r6 = this;
            v1.d0 r0 = r6.f13888g
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            v1.o0 r7 = r0.D0(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // u2.c
    public final int G0(float r2) {
            r1 = this;
            v1.d0 r0 = r1.f13888g
            int r2 = r0.G0(r2)
            return r2
    }

    @Override // u2.c
    public final long J(float r3) {
            r2 = this;
            v1.d0 r0 = r2.f13888g
            long r0 = r0.J(r3)
            return r0
    }

    @Override // u2.c
    public final long K(long r2) {
            r1 = this;
            v1.d0 r0 = r1.f13888g
            long r2 = r0.K(r2)
            return r2
    }

    @Override // u2.c
    public final long L0(long r2) {
            r1 = this;
            v1.d0 r0 = r1.f13888g
            long r2 = r0.L0(r2)
            return r2
    }

    @Override // v1.k1
    public final java.util.List N(fg.p r11, java.lang.Object r12) {
            r10 = this;
            v1.j0 r0 = r10.f13889h
            x1.f0 r1 = r0.f13955g
            f.k0 r2 = r0.f13961m
            java.lang.Object r3 = r2.g(r12)
            x1.f0 r3 = (x1.f0) r3
            if (r3 == 0) goto L25
            java.util.List r4 = r1.o()
            f.d0 r4 = (f.d0) r4
            java.lang.Object r4 = r4.f2789h
            j0.b r4 = (j0.b) r4
            int r4 = r4.i(r3)
            int r5 = r0.f13958j
            if (r4 >= r5) goto L25
            java.util.List r11 = r3.m()
            return r11
        L25:
            f.k0 r3 = r0.f13966r
            f.k0 r4 = r0.f13964p
            j0.b r5 = r0.f13967s
            int r6 = r5.f6673i
            int r7 = r0.f13959k
            if (r6 < r7) goto L32
            goto L37
        L32:
            java.lang.String r6 = "Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list."
            u1.a.a(r6)
        L37:
            java.lang.Object r6 = r2.g(r12)
            x1.f0 r6 = (x1.f0) r6
            int r7 = r5.f6673i
            int r8 = r0.f13959k
            if (r7 != r8) goto L47
            r5.b(r12)
            goto L4d
        L47:
            java.lang.Object[] r5 = r5.f6671g
            r7 = r5[r8]
            r5[r8] = r12
        L4d:
            int r5 = r0.f13959k
            r7 = 1
            int r5 = r5 + r7
            r0.f13959k = r5
            boolean r5 = r4.b(r12)
            r8 = 0
            if (r5 != 0) goto L67
            if (r6 != 0) goto L67
            r0.k(r12, r11, r8)
            v1.h1 r11 = r0.f(r12)
            r3.m(r12, r11)
            goto Lc8
        L67:
            if (r5 != 0) goto La3
            if (r6 == 0) goto La3
            java.util.List r5 = r1.o()
            f.d0 r5 = (f.d0) r5
            java.lang.Object r5 = r5.f2789h
            j0.b r5 = (j0.b) r5
            int r5 = r5.i(r6)
            java.util.List r9 = r1.o()
            f.d0 r9 = (f.d0) r9
            java.lang.Object r9 = r9.f2789h
            j0.b r9 = (j0.b) r9
            int r9 = r9.f6673i
            r0.j(r5, r9)
            int r5 = r0.f13969u
            int r5 = r5 + r7
            r0.f13969u = r5
            r2.k(r12)
            r4.m(r12, r6)
            v1.h1 r2 = r0.f(r12)
            r3.m(r12, r2)
            boolean r1 = r1.G()
            if (r1 == 0) goto La3
            r0.h()
        La3:
            java.lang.Object r1 = r4.g(r12)
            x1.f0 r1 = (x1.f0) r1
            r2 = 0
            if (r1 == 0) goto Lb5
            f.k0 r3 = r0.f13960l
            java.lang.Object r3 = r3.g(r1)
            v1.b0 r3 = (v1.b0) r3
            goto Lb6
        Lb5:
            r3 = r2
        Lb6:
            if (r3 == 0) goto Lbf
            boolean r5 = r3.f13895d
            if (r5 != r7) goto Lbf
            r0.m(r1, r12, r8, r11)
        Lbf:
            if (r3 == 0) goto Lc3
            i0.l1 r2 = r3.f13897f
        Lc3:
            if (r2 == 0) goto Lc8
            r0.d(r3, r7)
        Lc8:
            java.lang.Object r11 = r4.g(r12)
            x1.f0 r11 = (x1.f0) r11
            if (r11 == 0) goto Lf1
            x1.j0 r11 = r11.M
            x1.v0 r11 = r11.f20966p
            java.util.List r11 = r11.J0()
            r12 = r11
            f.d0 r12 = (f.d0) r12
            java.lang.Object r0 = r12.f2789h
            j0.b r0 = (j0.b) r0
            int r0 = r0.f6673i
        Le1:
            if (r8 >= r0) goto Lf0
            java.lang.Object r1 = r12.get(r8)
            x1.v0 r1 = (x1.v0) r1
            x1.j0 r1 = r1.f21076l
            r1.f20952b = r7
            int r8 = r8 + 1
            goto Le1
        Lf0:
            return r11
        Lf1:
            tf.t r11 = tf.t.f13167g
            return r11
    }

    @Override // u2.c
    public final float O0(long r2) {
            r1 = this;
            v1.d0 r0 = r1.f13888g
            float r2 = r0.O0(r2)
            return r2
    }

    @Override // u2.c
    public final float S(long r2) {
            r1 = this;
            v1.d0 r0 = r1.f13888g
            float r2 = r0.S(r2)
            return r2
    }

    @Override // u2.c
    public final float d() {
            r1 = this;
            v1.d0 r0 = r1.f13888g
            float r0 = r0.f13918h
            return r0
    }

    @Override // u2.c
    public final long e0(float r3) {
            r2 = this;
            v1.d0 r0 = r2.f13888g
            long r0 = r0.e0(r3)
            return r0
    }

    @Override // v1.o
    public final u2.m getLayoutDirection() {
            r1 = this;
            v1.d0 r0 = r1.f13888g
            u2.m r0 = r0.f13917g
            return r0
    }

    @Override // u2.c
    public final float i0(int r2) {
            r1 = this;
            v1.d0 r0 = r1.f13888g
            float r2 = r0.i0(r2)
            return r2
    }

    @Override // u2.c
    public final float l0(float r2) {
            r1 = this;
            v1.d0 r0 = r1.f13888g
            float r0 = r0.d()
            float r2 = r2 / r0
            return r2
    }

    @Override // u2.c
    public final float q0() {
            r1 = this;
            v1.d0 r0 = r1.f13888g
            float r0 = r0.f13919i
            return r0
    }

    @Override // v1.o
    public final boolean u0() {
            r1 = this;
            v1.d0 r0 = r1.f13888g
            boolean r0 = r0.u0()
            return r0
    }

    @Override // u2.c
    public final float x0(float r2) {
            r1 = this;
            v1.d0 r0 = r1.f13888g
            float r0 = r0.d()
            float r0 = r0 * r2
            return r0
    }

    @Override // v1.p0
    public final v1.o0 z(int r7, int r8, java.util.Map r9, fg.l r10) {
            r6 = this;
            v1.d0 r0 = r6.f13888g
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            v1.o0 r7 = r0.D0(r1, r2, r3, r4, r5)
            return r7
    }
}
