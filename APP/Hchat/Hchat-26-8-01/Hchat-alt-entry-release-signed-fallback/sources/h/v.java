package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements v1.n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h.c0 f4763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4764b;

    public v(h.c0 r1) {
            r0 = this;
            r0.<init>()
            r0.f4763a = r1
            return
    }

    @Override // v1.n0
    public final int a(v1.o r4, java.util.List r5, int r6) {
            r3 = this;
            boolean r4 = r5.isEmpty()
            r0 = 0
            if (r4 == 0) goto L8
            return r0
        L8:
            java.lang.Object r4 = r5.get(r0)
            v1.m0 r4 = (v1.m0) r4
            int r4 = r4.M(r6)
            int r0 = r5.size()
            r1 = 1
            int r0 = r0 - r1
            if (r1 > r0) goto L2c
        L1a:
            java.lang.Object r2 = r5.get(r1)
            v1.m0 r2 = (v1.m0) r2
            int r2 = r2.M(r6)
            if (r2 <= r4) goto L27
            r4 = r2
        L27:
            if (r1 == r0) goto L2c
            int r1 = r1 + 1
            goto L1a
        L2c:
            return r4
    }

    @Override // v1.n0
    public final int c(v1.o r4, java.util.List r5, int r6) {
            r3 = this;
            boolean r4 = r5.isEmpty()
            r0 = 0
            if (r4 == 0) goto L8
            return r0
        L8:
            java.lang.Object r4 = r5.get(r0)
            v1.m0 r4 = (v1.m0) r4
            int r4 = r4.G(r6)
            int r0 = r5.size()
            r1 = 1
            int r0 = r0 - r1
            if (r1 > r0) goto L2c
        L1a:
            java.lang.Object r2 = r5.get(r1)
            v1.m0 r2 = (v1.m0) r2
            int r2 = r2.G(r6)
            if (r2 <= r4) goto L27
            r4 = r2
        L27:
            if (r1 == r0) goto L2c
            int r1 = r1 + 1
            goto L1a
        L2c:
            return r4
    }

    @Override // v1.n0
    public final int g(v1.o r4, java.util.List r5, int r6) {
            r3 = this;
            boolean r4 = r5.isEmpty()
            r0 = 0
            if (r4 == 0) goto L8
            return r0
        L8:
            java.lang.Object r4 = r5.get(r0)
            v1.m0 r4 = (v1.m0) r4
            int r4 = r4.j(r6)
            int r0 = r5.size()
            r1 = 1
            int r0 = r0 - r1
            if (r1 > r0) goto L2c
        L1a:
            java.lang.Object r2 = r5.get(r1)
            v1.m0 r2 = (v1.m0) r2
            int r2 = r2.j(r6)
            if (r2 <= r4) goto L27
            r4 = r2
        L27:
            if (r1 == r0) goto L2c
            int r1 = r1 + 1
            goto L1a
        L2c:
            return r4
    }

    @Override // v1.n0
    public final v1.o0 h(v1.p0 r8, java.util.List r9, long r10) {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r9.size()
            r0.<init>(r1)
            int r1 = r9.size()
            r2 = 0
            r3 = r2
            r4 = r3
        L10:
            if (r2 >= r1) goto L2e
            java.lang.Object r5 = r9.get(r2)
            v1.m0 r5 = (v1.m0) r5
            v1.b1 r5 = r5.Q(r10)
            int r6 = r5.f13900g
            int r3 = java.lang.Math.max(r3, r6)
            int r6 = r5.f13901h
            int r4 = java.lang.Math.max(r4, r6)
            r0.add(r5)
            int r2 = r2 + 1
            goto L10
        L2e:
            boolean r9 = r8.u0()
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r1 = 32
            h.c0 r2 = r7.f4763a
            if (r9 == 0) goto L51
            r9 = 1
            r7.f4764b = r9
            i0.j1 r9 = r2.f4628a
            long r5 = (long) r3
            long r1 = r5 << r1
            long r5 = (long) r4
            long r10 = r10 & r5
            long r10 = r10 | r1
            u2.l r1 = new u2.l
            r1.<init>(r10)
            r9.setValue(r1)
            goto L65
        L51:
            boolean r9 = r7.f4764b
            if (r9 != 0) goto L65
            i0.j1 r9 = r2.f4628a
            long r5 = (long) r3
            long r1 = r5 << r1
            long r5 = (long) r4
            long r10 = r10 & r5
            long r10 = r10 | r1
            u2.l r1 = new u2.l
            r1.<init>(r10)
            r9.setValue(r1)
        L65:
            h.u r9 = new h.u
            r10 = 0
            r9.<init>(r10, r0)
            tf.u r10 = tf.u.f13168g
            v1.o0 r8 = r8.z(r3, r4, r10, r9)
            return r8
    }

    @Override // v1.n0
    public final int i(v1.o r4, java.util.List r5, int r6) {
            r3 = this;
            boolean r4 = r5.isEmpty()
            r0 = 0
            if (r4 == 0) goto L8
            return r0
        L8:
            java.lang.Object r4 = r5.get(r0)
            v1.m0 r4 = (v1.m0) r4
            int r4 = r4.p0(r6)
            int r0 = r5.size()
            r1 = 1
            int r0 = r0 - r1
            if (r1 > r0) goto L2c
        L1a:
            java.lang.Object r2 = r5.get(r1)
            v1.m0 r2 = (v1.m0) r2
            int r2 = r2.p0(r6)
            if (r2 <= r4) goto L27
            r4 = r2
        L27:
            if (r1 == r0) goto L2c
            int r1 = r1 + 1
            goto L1a
        L2c:
            return r4
    }
}
