package p054K;

/* JADX INFO: renamed from: K.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0866a {

    /* JADX INFO: renamed from: a */
    public static final long f2701a = m1892a(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f2702b = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static long m1892a(float f2, float f5) {
        return (((long) Float.floatToRawIntBits(f5)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m1893b(long j5) {
        return "InlineDensity(density=" + Float.intBitsToFloat((int) (j5 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j5 & 4294967295L)) + ')';
    }
}
