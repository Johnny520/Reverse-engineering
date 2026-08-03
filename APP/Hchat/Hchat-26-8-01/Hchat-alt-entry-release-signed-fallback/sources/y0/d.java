package y0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements y0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f21808a;

    public d(float r1) {
            r0 = this;
            r0.<init>()
            r0.f21808a = r1
            return
    }

    @Override // y0.c
    public final long a(long r4, long r6, u2.m r8) {
            r3 = this;
            r8 = 32
            long r0 = r6 >> r8
            int r0 = (int) r0
            long r1 = r4 >> r8
            int r1 = (int) r1
            int r0 = r0 - r1
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r1
            int r6 = (int) r6
            long r4 = r4 & r1
            int r4 = (int) r4
            int r6 = r6 - r4
            long r4 = (long) r0
            long r4 = r4 << r8
            long r6 = (long) r6
            long r6 = r6 & r1
            long r4 = r4 | r6
            long r6 = r4 >> r8
            int r6 = (int) r6
            float r6 = (float) r6
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r7
            long r4 = r4 & r1
            int r4 = (int) r4
            float r4 = (float) r4
            float r4 = r4 / r7
            r5 = 1
            float r5 = (float) r5
            float r7 = r3.f21808a
            float r7 = r7 + r5
            float r7 = r7 * r6
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r5 = r5 + r6
            float r5 = r5 * r4
            int r4 = java.lang.Math.round(r7)
            int r5 = java.lang.Math.round(r5)
            long r6 = (long) r4
            long r6 = r6 << r8
            long r4 = (long) r5
            long r4 = r4 & r1
            long r4 = r4 | r6
            return r4
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L1f
        L3:
            boolean r0 = r2 instanceof y0.d
            if (r0 != 0) goto L8
            goto L1d
        L8:
            y0.d r2 = (y0.d) r2
            float r0 = r1.f21808a
            float r2 = r2.f21808a
            int r2 = java.lang.Float.compare(r0, r2)
            if (r2 == 0) goto L15
            goto L1d
        L15:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = java.lang.Float.compare(r2, r2)
            if (r2 == 0) goto L1f
        L1d:
            r2 = 0
            return r2
        L1f:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            float r0 = r2.f21808a
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BiasAbsoluteAlignment(horizontalBias="
            r0.<init>(r1)
            float r1 = r2.f21808a
            r0.append(r1)
            java.lang.String r1 = ", verticalBias=-1.0)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
