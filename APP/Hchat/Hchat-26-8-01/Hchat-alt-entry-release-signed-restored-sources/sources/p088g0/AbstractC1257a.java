package p088g0;

/* JADX INFO: renamed from: g0.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1257a {

    /* JADX INFO: renamed from: a */
    public static final long f4116a = m3381a(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f4117b = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static long m3381a(float f3, float f10) {
        return (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m3382b(long j3) {
        return "InlineDensity(density=" + Float.intBitsToFloat((int) (j3 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j3 & 4294967295L)) + ')';
    }
}
