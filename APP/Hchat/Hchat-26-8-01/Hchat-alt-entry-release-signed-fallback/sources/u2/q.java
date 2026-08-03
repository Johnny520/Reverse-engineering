package u2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13362a;

    public /* synthetic */ q(long r1) {
            r0 = this;
            r0.<init>()
            r0.f13362a = r1
            return
    }

    public static long a(float r4, float r5, int r6, long r7) {
            r0 = r6 & 1
            r1 = 32
            if (r0 == 0) goto Ld
            long r2 = r7 >> r1
            int r4 = (int) r2
            float r4 = java.lang.Float.intBitsToFloat(r4)
        Ld:
            r6 = r6 & 2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r6 == 0) goto L1d
            long r5 = r7 & r2
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
        L1d:
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r6 = (long) r4
            int r4 = java.lang.Float.floatToRawIntBits(r5)
            long r4 = (long) r4
            long r6 = r6 << r1
            long r4 = r4 & r2
            long r4 = r4 | r6
            return r4
    }

    public static final float b(long r1) {
            r0 = 32
            long r1 = r1 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            return r1
    }

    public static final float c(long r2) {
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            return r2
    }

    public static final long d(long r6, long r8) {
            r0 = 32
            long r1 = r6 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r2 = r8 >> r0
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r1 = r1 - r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r2
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r7 = r8 & r2
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            float r6 = r6 - r7
            int r7 = java.lang.Float.floatToRawIntBits(r1)
            long r7 = (long) r7
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r4 = (long) r6
            long r6 = r7 << r0
            long r8 = r4 & r2
            long r6 = r6 | r8
            return r6
    }

    public static final long e(long r5, long r7) {
            r0 = 32
            long r1 = r5 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r2 = r7 >> r0
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r2 = r2 + r1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r3
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            long r6 = r7 & r3
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r6 = r6 + r5
            int r5 = java.lang.Float.floatToRawIntBits(r2)
            long r7 = (long) r5
            int r5 = java.lang.Float.floatToRawIntBits(r6)
            long r5 = (long) r5
            long r7 = r7 << r0
            long r5 = r5 & r3
            long r5 = r5 | r7
            return r5
    }

    public static final long f(long r6, float r8) {
            r0 = 32
            long r1 = r6 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r1 = r1 * r8
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r2
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r6 = r6 * r8
            int r7 = java.lang.Float.floatToRawIntBits(r1)
            long r7 = (long) r7
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r4 = (long) r6
            long r6 = r7 << r0
            long r0 = r4 & r2
            long r6 = r6 | r0
            return r6
    }

    public static java.lang.String g(long r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            float r1 = b(r2)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            float r2 = c(r2)
            r0.append(r2)
            java.lang.String r2 = ") px/sec"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof u2.q
            if (r0 != 0) goto L5
            goto Lf
        L5:
            u2.q r5 = (u2.q) r5
            long r0 = r5.f13362a
            long r2 = r4.f13362a
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L11
        Lf:
            r5 = 0
            return r5
        L11:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.f13362a
            int r0 = java.lang.Long.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            long r0 = r2.f13362a
            java.lang.String r0 = g(r0)
            return r0
    }
}
