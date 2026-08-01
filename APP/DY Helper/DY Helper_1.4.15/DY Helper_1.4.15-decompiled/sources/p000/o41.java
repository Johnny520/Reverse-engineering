package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class o41 {

    /* JADX INFO: renamed from: α */
    public final long f7950;

    public /* synthetic */ o41(long r1) {
            r0 = this;
            r0.<init>()
            r0.f7950 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public static final boolean m4203(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static final long m4204(long r6, long r8) {
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

    /* JADX INFO: renamed from: γ */
    public static final long m4205(long r5, long r7) {
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

    /* JADX INFO: renamed from: δ */
    public static java.lang.String m4206(long r4) {
            r0 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r4
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L47
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Offset("
            r0.<init>(r1)
            r1 = 32
            long r1 = r4 >> r1
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            java.lang.String r1 = p000.kn0.m3356(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r1
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            java.lang.String r4 = p000.kn0.m3356(r4)
            r0.append(r4)
            r4 = 41
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
        L47:
            java.lang.String r4 = "Offset.Unspecified"
            return r4
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.o41
            if (r0 != 0) goto L5
            goto Lf
        L5:
            o41 r3 = (p000.o41) r3
            long r0 = r3.f7950
            long r2 = r2.f7950
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L11
        Lf:
            r2 = 0
            return r2
        L11:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.f7950
            int r2 = java.lang.Long.hashCode(r0)
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            long r0 = r2.f7950
            java.lang.String r2 = m4206(r0)
            return r2
    }
}
