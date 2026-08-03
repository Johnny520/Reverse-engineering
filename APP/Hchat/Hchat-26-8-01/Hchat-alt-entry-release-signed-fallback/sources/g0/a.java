package g0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f3963a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3964b = 0;

    static {
            r0 = 2143289344(0x7fc00000, float:NaN)
            long r0 = a(r0, r0)
            g0.a.f3963a = r0
            return
    }

    public static long a(float r4, float r5) {
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

    public static java.lang.String b(long r3) {
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
