package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class em0 {

    /* JADX INFO: renamed from: α */
    public static final long f3592 = 0;

    /* JADX INFO: renamed from: β */
    public static final /* synthetic */ int f3593 = 0;

    static {
            r0 = 2143289344(0x7fc00000, float:NaN)
            long r0 = m1935(r0, r0)
            p000.em0.f3592 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static long m1935(float r4, float r5) {
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r0 = (long) r4
            int r4 = java.lang.Float.floatToRawIntBits(r5)
            long r4 = (long) r4
            r2 = 32
            long r0 = r0 << r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            long r4 = r4 | r0
            return r4
    }

    /* JADX INFO: renamed from: β */
    public static java.lang.String m1936(long r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "InlineDensity(density="
            r0.<init>(r1)
            r1 = 32
            long r1 = r3 >> r1
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r0.append(r1)
            java.lang.String r1 = ", fontScale="
            r0.append(r1)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r1
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
