package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements v1.p0, v1.o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v1.o f14041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u2.m f14042h;

    public s(v1.o r1, u2.m r2) {
            r0 = this;
            r0.<init>()
            r0.f14041g = r1
            r0.f14042h = r2
            return
    }

    @Override // v1.p0
    public final v1.o0 D0(int r2, int r3, java.util.Map r4, fg.l r5, fg.l r6) {
            r1 = this;
            r6 = 0
            if (r2 >= 0) goto L4
            r2 = r6
        L4:
            if (r3 >= 0) goto L7
            r3 = r6
        L7:
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r2 & r6
            if (r0 != 0) goto L11
            r6 = r6 & r3
            if (r6 != 0) goto L11
            goto L2f
        L11:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Size("
            r6.<init>(r0)
            r6.append(r2)
            java.lang.String r0 = " x "
            r6.append(r0)
            r6.append(r3)
            java.lang.String r0 = ") is out of range. Each dimension must be between 0 and 16777215."
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            u1.a.b(r6)
        L2f:
            v1.r r6 = new v1.r
            r6.<init>(r2, r3, r4, r5)
            return r6
    }

    @Override // u2.c
    public final int G0(float r2) {
            r1 = this;
            v1.o r0 = r1.f14041g
            int r2 = r0.G0(r2)
            return r2
    }

    @Override // u2.c
    public final long J(float r3) {
            r2 = this;
            v1.o r0 = r2.f14041g
            long r0 = r0.J(r3)
            return r0
    }

    @Override // u2.c
    public final long K(long r2) {
            r1 = this;
            v1.o r0 = r1.f14041g
            long r2 = r0.K(r2)
            return r2
    }

    @Override // u2.c
    public final long L0(long r2) {
            r1 = this;
            v1.o r0 = r1.f14041g
            long r2 = r0.L0(r2)
            return r2
    }

    @Override // u2.c
    public final float O0(long r2) {
            r1 = this;
            v1.o r0 = r1.f14041g
            float r2 = r0.O0(r2)
            return r2
    }

    @Override // u2.c
    public final float S(long r2) {
            r1 = this;
            v1.o r0 = r1.f14041g
            float r2 = r0.S(r2)
            return r2
    }

    @Override // u2.c
    public final float d() {
            r1 = this;
            v1.o r0 = r1.f14041g
            float r0 = r0.d()
            return r0
    }

    @Override // u2.c
    public final long e0(float r3) {
            r2 = this;
            v1.o r0 = r2.f14041g
            long r0 = r0.e0(r3)
            return r0
    }

    @Override // v1.o
    public final u2.m getLayoutDirection() {
            r1 = this;
            u2.m r0 = r1.f14042h
            return r0
    }

    @Override // u2.c
    public final float i0(int r2) {
            r1 = this;
            v1.o r0 = r1.f14041g
            float r2 = r0.i0(r2)
            return r2
    }

    @Override // u2.c
    public final float l0(float r2) {
            r1 = this;
            v1.o r0 = r1.f14041g
            float r2 = r0.l0(r2)
            return r2
    }

    @Override // u2.c
    public final float q0() {
            r1 = this;
            v1.o r0 = r1.f14041g
            float r0 = r0.q0()
            return r0
    }

    @Override // v1.o
    public final boolean u0() {
            r1 = this;
            v1.o r0 = r1.f14041g
            boolean r0 = r0.u0()
            return r0
    }

    @Override // u2.c
    public final float x0(float r2) {
            r1 = this;
            v1.o r0 = r1.f14041g
            float r2 = r0.x0(r2)
            return r2
    }
}
