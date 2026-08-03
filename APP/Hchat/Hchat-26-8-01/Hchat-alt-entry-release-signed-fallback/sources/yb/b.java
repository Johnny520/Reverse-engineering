package yb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f22398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f22401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22402e;

    static {
            yb.b r0 = new yb.b
            r2 = 0
            r3 = 31
            r1 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public b(float r7, float r8, int r9, long r10) {
            r6 = this;
            r0 = r9 & 1
            if (r0 == 0) goto L7
            r7 = 24
            float r7 = (float) r7
        L7:
            r0 = 0
            float r0 = (float) r0
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r0
            int r2 = java.lang.Float.floatToRawIntBits(r7)
            long r2 = (long) r2
            r4 = 32
            long r0 = r0 << r4
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r0 = r0 | r2
            r2 = r9 & 4
            if (r2 == 0) goto L2a
            long r10 = f1.w.f3126b
            r2 = 1041865114(0x3e19999a, float:0.15)
            long r10 = f1.w.b(r10, r2)
        L2a:
            r9 = r9 & 8
            if (r9 == 0) goto L30
            r8 = 1065353216(0x3f800000, float:1.0)
        L30:
            r6.<init>()
            r6.f22398a = r7
            r6.f22399b = r0
            r6.f22400c = r10
            r6.f22401d = r8
            r7 = 3
            r6.f22402e = r7
            return
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            if (r6 != r7) goto L3
            goto L3a
        L3:
            boolean r0 = r7 instanceof yb.b
            r1 = 0
            if (r0 != 0) goto L9
            goto L3c
        L9:
            yb.b r7 = (yb.b) r7
            float r0 = r6.f22398a
            float r2 = r7.f22398a
            boolean r0 = u2.f.b(r0, r2)
            if (r0 != 0) goto L16
            goto L3c
        L16:
            long r2 = r6.f22399b
            long r4 = r7.f22399b
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L3c
            long r2 = r6.f22400c
            long r4 = r7.f22400c
            boolean r0 = f1.w.c(r2, r4)
            if (r0 != 0) goto L29
            goto L3c
        L29:
            float r0 = r6.f22401d
            float r2 = r7.f22401d
            int r0 = java.lang.Float.compare(r0, r2)
            if (r0 == 0) goto L34
            goto L3c
        L34:
            int r0 = r6.f22402e
            int r7 = r7.f22402e
            if (r0 != r7) goto L3c
        L3a:
            r7 = 1
            return r7
        L3c:
            return r1
    }

    public final int hashCode() {
            r4 = this;
            float r0 = r4.f22398a
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f22399b
            int r0 = eh.a.f(r0, r1, r2)
            int r2 = f1.w.f3132h
            long r2 = r4.f22400c
            int r0 = eh.a.f(r0, r1, r2)
            float r2 = r4.f22401d
            int r0 = eh.a.d(r2, r0, r1)
            int r1 = r4.f22402e
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r7 = this;
            float r0 = r7.f22398a
            java.lang.String r0 = u2.f.c(r0)
            long r1 = r7.f22399b
            java.lang.String r1 = u2.g.a(r1)
            long r2 = r7.f22400c
            java.lang.String r2 = f1.w.i(r2)
            int r3 = r7.f22402e
            java.lang.String r3 = f1.c0.A(r3)
            java.lang.String r4 = ", offset="
            java.lang.String r5 = ", color="
            java.lang.String r6 = "InnerShadow(radius="
            java.lang.StringBuilder r0 = bc.e.p(r6, r0, r4, r1, r5)
            r0.append(r2)
            java.lang.String r1 = ", alpha="
            r0.append(r1)
            float r1 = r7.f22401d
            r0.append(r1)
            java.lang.String r1 = ", blendMode="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r0 = eh.a.r(r0, r3, r1)
            return r0
    }
}
