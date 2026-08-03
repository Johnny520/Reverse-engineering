package vh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements f1.d0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f14374g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f14375h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f14376i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f14377j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f14378k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f14379l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float[] f14380m;

    @Override // f1.d0
    public final void H0(long r1) {
            r0 = this;
            return
    }

    @Override // f1.d0
    public final void I() {
            r0 = this;
            return
    }

    @Override // f1.d0
    public final void Q0(f1.r0 r1) {
            r0 = this;
            r1.getClass()
            return
    }

    @Override // f1.d0
    public final void Y(int r1) {
            r0 = this;
            return
    }

    @Override // f1.d0
    public final long a() {
            r2 = this;
            long r0 = r2.f14374g
            return r0
    }

    @Override // f1.d0
    public final float b() {
            r1 = this;
            float r0 = r1.f14377j
            return r0
    }

    @Override // f1.d0
    public final void c(float r1) {
            r0 = this;
            return
    }

    @Override // u2.c
    public final float d() {
            r1 = this;
            float r0 = r1.f14375h
            return r0
    }

    public final void e(androidx.lifecycle.x r8, u2.c r9, long r10, fg.l r12) {
            r7 = this;
            java.lang.Object r0 = r8.f310h
            b5.c r0 = (b5.c) r0
            r9.getClass()
            r12.getClass()
            r1 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 == 0) goto L14
            goto L18
        L14:
            long r10 = r0.v()
        L18:
            r7.f14374g = r10
            float r10 = r9.d()
            r7.f14375h = r10
            float r9 = r9.q0()
            r7.f14376i = r9
            r12.invoke(r7)
            float r9 = r7.f14379l
            float r10 = r7.f14377j
            float r11 = r7.f14378k
            r12 = 0
            int r1 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 != 0) goto L49
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 != 0) goto L3b
            goto L7a
        L3b:
            int r9 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r9 != 0) goto L40
            goto L7a
        L40:
            float r9 = r2 / r10
            float r2 = r2 / r11
            r10 = 0
            r8.S(r9, r2, r10)
            return
        L49:
            float[] r8 = r7.f14380m
            if (r8 != 0) goto L53
            float[] r8 = f1.i0.a()
            r7.f14380m = r8
        L53:
            int r1 = r8.length
            r3 = 16
            if (r1 >= r3) goto L59
            goto L7a
        L59:
            double r3 = (double) r9
            r5 = 4580687790476533049(0x3f91df46a2529d39, double:0.017453292519943295)
            double r3 = r3 * r5
            double r5 = java.lang.Math.sin(r3)
            float r9 = (float) r5
            double r3 = java.lang.Math.cos(r3)
            float r1 = (float) r3
            float r3 = r1 * r10
            float r4 = r9 * r11
            float r9 = -r9
            float r9 = r9 * r10
            float r1 = r1 * r11
            float r10 = r3 * r1
            float r11 = r4 * r9
            float r10 = r10 - r11
            int r11 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r11 != 0) goto L7b
        L7a:
            return
        L7b:
            float r2 = r2 / r10
            float r1 = r1 * r2
            r10 = 0
            r8[r10] = r1
            float r10 = -r4
            float r10 = r10 * r2
            r11 = 1
            r8[r11] = r10
            float r9 = -r9
            float r9 = r9 * r2
            r10 = 4
            r8[r10] = r9
            float r3 = r3 * r2
            r9 = 5
            r8[r9] = r3
            f1.u r9 = r0.p()
            r9.h(r8)
            return
    }

    @Override // f1.d0
    public final void f(float r1) {
            r0 = this;
            r0.f14379l = r1
            return
    }

    @Override // f1.d0
    public final void g(float r1) {
            r0 = this;
            return
    }

    @Override // f1.d0
    public final void h(int r1) {
            r0 = this;
            return
    }

    @Override // f1.d0
    public final void i(float r1) {
            r0 = this;
            r0.f14378k = r1
            return
    }

    @Override // f1.d0
    public final void k(f1.n r1) {
            r0 = this;
            return
    }

    @Override // f1.d0
    public final void l() {
            r0 = this;
            return
    }

    @Override // f1.d0
    public final void n(float r1) {
            r0 = this;
            return
    }

    @Override // f1.d0
    public final void o() {
            r0 = this;
            return
    }

    @Override // f1.d0
    public final void p(long r1) {
            r0 = this;
            return
    }

    @Override // f1.d0
    public final void q(float r1) {
            r0 = this;
            r0.f14377j = r1
            return
    }

    @Override // u2.c
    public final float q0() {
            r1 = this;
            float r0 = r1.f14376i
            return r0
    }

    @Override // f1.d0
    public final void r(boolean r1) {
            r0 = this;
            return
    }

    @Override // f1.d0
    public final void s(float r1) {
            r0 = this;
            return
    }

    @Override // f1.d0
    public final void t(long r1) {
            r0 = this;
            return
    }

    @Override // f1.d0
    public final void u(float r1) {
            r0 = this;
            return
    }

    @Override // f1.d0
    public final float v() {
            r1 = this;
            float r0 = r1.f14378k
            return r0
    }
}
