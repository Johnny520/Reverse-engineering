package y0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements y0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f21811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f21812b;

    public g(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.f21811a = r1
            r0.f21812b = r2
            return
    }

    @Override // y0.c
    public final long a(long r6, long r8, u2.m r10) {
            r5 = this;
            r0 = 32
            long r1 = r8 >> r0
            int r1 = (int) r1
            long r2 = r6 >> r0
            int r2 = (int) r2
            int r1 = r1 - r2
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r3
            int r8 = (int) r8
            long r6 = r6 & r3
            int r6 = (int) r6
            int r8 = r8 - r6
            float r6 = (float) r8
            float r6 = r6 / r2
            u2.m r7 = u2.m.f13354g
            float r8 = r5.f21811a
            if (r10 != r7) goto L20
            goto L23
        L20:
            r7 = -1
            float r7 = (float) r7
            float r8 = r8 * r7
        L23:
            r7 = 1
            float r7 = (float) r7
            float r8 = r8 + r7
            float r8 = r8 * r1
            float r9 = r5.f21812b
            float r7 = r7 + r9
            float r7 = r7 * r6
            int r6 = java.lang.Math.round(r8)
            int r7 = java.lang.Math.round(r7)
            long r8 = (long) r6
            long r8 = r8 << r0
            long r6 = (long) r7
            long r6 = r6 & r3
            long r6 = r6 | r8
            return r6
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof y0.g
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            y0.g r5 = (y0.g) r5
            float r1 = r4.f21811a
            float r3 = r5.f21811a
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L17
            return r2
        L17:
            float r1 = r4.f21812b
            float r5 = r5.f21812b
            int r5 = java.lang.Float.compare(r1, r5)
            if (r5 == 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            float r0 = r2.f21811a
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            float r1 = r2.f21812b
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BiasAlignment(horizontalBias="
            r0.<init>(r1)
            float r1 = r3.f21811a
            r0.append(r1)
            java.lang.String r1 = ", verticalBias="
            r0.append(r1)
            float r1 = r3.f21812b
            r2 = 41
            java.lang.String r0 = eh.a.o(r0, r1, r2)
            return r0
    }
}
