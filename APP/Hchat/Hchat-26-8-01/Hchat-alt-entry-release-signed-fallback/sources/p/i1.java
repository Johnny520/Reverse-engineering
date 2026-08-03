package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends y0.n implements x1.v {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f9919u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f9920v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f9921w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f9922x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f9923y;

    @Override // x1.v
    public final int G(x1.n0 r3, v1.m0 r4, int r5) {
            r2 = this;
            long r0 = r2.k1(r3)
            boolean r3 = u2.a.f(r0)
            if (r3 == 0) goto Lf
            int r3 = u2.a.h(r0)
            return r3
        Lf:
            boolean r3 = r2.f9923y
            if (r3 == 0) goto L14
            goto L18
        L14:
            int r5 = u2.b.f(r5, r0)
        L18:
            int r3 = r4.G(r5)
            int r3 = u2.b.g(r3, r0)
            return r3
    }

    @Override // x1.v
    public final int K0(x1.n0 r3, v1.m0 r4, int r5) {
            r2 = this;
            long r0 = r2.k1(r3)
            boolean r3 = u2.a.e(r0)
            if (r3 == 0) goto Lf
            int r3 = u2.a.g(r0)
            return r3
        Lf:
            boolean r3 = r2.f9923y
            if (r3 == 0) goto L14
            goto L18
        L14:
            int r5 = u2.b.g(r5, r0)
        L18:
            int r3 = r4.p0(r5)
            int r3 = u2.b.f(r3, r0)
            return r3
    }

    @Override // x1.v
    public final int Q(x1.n0 r3, v1.m0 r4, int r5) {
            r2 = this;
            long r0 = r2.k1(r3)
            boolean r3 = u2.a.f(r0)
            if (r3 == 0) goto Lf
            int r3 = u2.a.h(r0)
            return r3
        Lf:
            boolean r3 = r2.f9923y
            if (r3 == 0) goto L14
            goto L18
        L14:
            int r5 = u2.b.f(r5, r0)
        L18:
            int r3 = r4.M(r5)
            int r3 = u2.b.g(r3, r0)
            return r3
    }

    @Override // x1.v
    public final int R0(x1.n0 r3, v1.m0 r4, int r5) {
            r2 = this;
            long r0 = r2.k1(r3)
            boolean r3 = u2.a.e(r0)
            if (r3 == 0) goto Lf
            int r3 = u2.a.g(r0)
            return r3
        Lf:
            boolean r3 = r2.f9923y
            if (r3 == 0) goto L14
            goto L18
        L14:
            int r5 = u2.b.g(r5, r0)
        L18:
            int r3 = r4.j(r5)
            int r3 = u2.b.f(r3, r0)
            return r3
    }

    @Override // x1.v
    public final v1.o0 j(v1.p0 r7, v1.m0 r8, long r9) {
            r6 = this;
            long r0 = r6.k1(r7)
            boolean r2 = r6.f9923y
            if (r2 == 0) goto Ld
            long r9 = u2.b.e(r9, r0)
            goto L71
        Ld:
            float r2 = r6.f9919u
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto L1a
            int r2 = u2.a.j(r0)
            goto L25
        L1a:
            int r2 = u2.a.j(r9)
            int r3 = u2.a.h(r0)
            if (r2 <= r3) goto L25
            r2 = r3
        L25:
            float r3 = r6.f9921w
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L32
            int r3 = u2.a.h(r0)
            goto L3d
        L32:
            int r3 = u2.a.h(r9)
            int r4 = u2.a.j(r0)
            if (r3 >= r4) goto L3d
            r3 = r4
        L3d:
            float r4 = r6.f9920v
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L4a
            int r4 = u2.a.i(r0)
            goto L55
        L4a:
            int r4 = u2.a.i(r9)
            int r5 = u2.a.g(r0)
            if (r4 <= r5) goto L55
            r4 = r5
        L55:
            float r5 = r6.f9922x
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L62
            int r9 = u2.a.g(r0)
            goto L6d
        L62:
            int r9 = u2.a.g(r9)
            int r10 = u2.a.i(r0)
            if (r9 >= r10) goto L6d
            r9 = r10
        L6d:
            long r9 = u2.b.a(r2, r3, r4, r9)
        L71:
            v1.b1 r8 = r8.Q(r9)
            int r9 = r8.f13900g
            int r10 = r8.f13901h
            g0.g r0 = new g0.g
            r1 = 4
            r0.<init>(r8, r1)
            tf.u r8 = tf.u.f13168g
            v1.o0 r7 = r7.z(r9, r10, r8, r0)
            return r7
    }

    public final long k1(v1.p0 r7) {
            r6 = this;
            float r0 = r6.f9921w
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.f9921w
            int r0 = r7.G0(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.f9922x
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.f9922x
            int r3 = r7.G0(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.f9919u
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.f9919u
            int r4 = r7.G0(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 == r1) goto L41
            goto L42
        L41:
            r4 = r2
        L42:
            float r5 = r6.f9920v
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r5 = r6.f9920v
            int r7 = r7.G0(r5)
            if (r7 >= 0) goto L53
            r7 = r2
        L53:
            if (r7 <= r3) goto L56
            r7 = r3
        L56:
            if (r7 == r1) goto L59
            r2 = r7
        L59:
            long r0 = u2.b.a(r4, r0, r2, r3)
            return r0
    }
}
