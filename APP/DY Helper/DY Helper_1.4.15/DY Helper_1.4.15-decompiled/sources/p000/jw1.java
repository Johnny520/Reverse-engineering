package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class jw1 {

    /* JADX INFO: renamed from: α */
    public final long f5615;

    public /* synthetic */ jw1(long r1) {
            r0 = this;
            r0.<init>()
            r0.f5615 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public static final boolean m2997(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static final float m2998(long r4) {
            r0 = 32
            long r0 = r4 >> r0
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = r0 & r2
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r4 = r4 & r2
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r4 = java.lang.Math.min(r0, r4)
            return r4
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.String m2999(long r3) {
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L41
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Size("
            r0.<init>(r1)
            r1 = 32
            long r1 = r3 >> r1
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            java.lang.String r1 = p000.kn0.m3356(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r1
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            java.lang.String r3 = p000.kn0.m3356(r3)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
        L41:
            java.lang.String r3 = "Size.Unspecified"
            return r3
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.jw1
            if (r0 != 0) goto L5
            goto Lf
        L5:
            jw1 r3 = (p000.jw1) r3
            long r0 = r3.f5615
            long r2 = r2.f5615
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
            long r0 = r2.f5615
            int r2 = java.lang.Long.hashCode(r0)
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            long r0 = r2.f5615
            java.lang.String r2 = m2999(r0)
            return r2
    }
}
