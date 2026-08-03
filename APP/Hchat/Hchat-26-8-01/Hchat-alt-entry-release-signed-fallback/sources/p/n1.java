package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends y0.n implements x1.v {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f9958u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f9959v;

    @Override // x1.v
    public final int G(x1.n0 r1, v1.m0 r2, int r3) {
            r0 = this;
            int r2 = r2.G(r3)
            float r3 = r0.f9958u
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L13
            float r3 = r0.f9958u
            int r1 = r1.G0(r3)
            goto L14
        L13:
            r1 = 0
        L14:
            if (r2 >= r1) goto L17
            return r1
        L17:
            return r2
    }

    @Override // x1.v
    public final int K0(x1.n0 r1, v1.m0 r2, int r3) {
            r0 = this;
            int r2 = r2.p0(r3)
            float r3 = r0.f9959v
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L13
            float r3 = r0.f9959v
            int r1 = r1.G0(r3)
            goto L14
        L13:
            r1 = 0
        L14:
            if (r2 >= r1) goto L17
            return r1
        L17:
            return r2
    }

    @Override // x1.v
    public final int Q(x1.n0 r1, v1.m0 r2, int r3) {
            r0 = this;
            int r2 = r2.M(r3)
            float r3 = r0.f9958u
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L13
            float r3 = r0.f9958u
            int r1 = r1.G0(r3)
            goto L14
        L13:
            r1 = 0
        L14:
            if (r2 >= r1) goto L17
            return r1
        L17:
            return r2
    }

    @Override // x1.v
    public final int R0(x1.n0 r1, v1.m0 r2, int r3) {
            r0 = this;
            int r2 = r2.j(r3)
            float r3 = r0.f9959v
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L13
            float r3 = r0.f9959v
            int r1 = r1.G0(r3)
            goto L14
        L13:
            r1 = 0
        L14:
            if (r2 >= r1) goto L17
            return r1
        L17:
            return r2
    }

    @Override // x1.v
    public final v1.o0 j(v1.p0 r6, v1.m0 r7, long r8) {
            r5 = this;
            float r0 = r5.f9958u
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 0
            if (r0 != 0) goto L21
            int r0 = u2.a.j(r8)
            if (r0 != 0) goto L21
            float r0 = r5.f9958u
            int r0 = r6.G0(r0)
            int r2 = u2.a.h(r8)
            if (r0 >= 0) goto L1c
            r0 = r1
        L1c:
            if (r0 <= r2) goto L1f
            goto L25
        L1f:
            r2 = r0
            goto L25
        L21:
            int r2 = u2.a.j(r8)
        L25:
            int r0 = u2.a.h(r8)
            float r3 = r5.f9959v
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L4a
            int r3 = u2.a.i(r8)
            if (r3 != 0) goto L4a
            float r3 = r5.f9959v
            int r3 = r6.G0(r3)
            int r4 = u2.a.g(r8)
            if (r3 >= 0) goto L44
            goto L45
        L44:
            r1 = r3
        L45:
            if (r1 <= r4) goto L48
            goto L4e
        L48:
            r4 = r1
            goto L4e
        L4a:
            int r4 = u2.a.i(r8)
        L4e:
            int r8 = u2.a.g(r8)
            long r8 = u2.b.a(r2, r0, r4, r8)
            v1.b1 r7 = r7.Q(r8)
            int r8 = r7.f13900g
            int r9 = r7.f13901h
            g0.g r0 = new g0.g
            r1 = 5
            r0.<init>(r7, r1)
            tf.u r7 = tf.u.f13168g
            v1.o0 r6 = r6.z(r8, r9, r7, r0)
            return r6
    }
}
