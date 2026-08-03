package p293u2;

/* JADX INFO: renamed from: u2.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4247q {

    /* JADX INFO: renamed from: a */
    public final long f13927a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static long m8543a(float f3, float f10, int i9, long j3) {
        if ((i9 & 1) != 0) {
            f3 = Float.intBitsToFloat((int) (j3 >> 32));
        }
        if ((i9 & 2) != 0) {
            f10 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final float m8544b(long j3) {
        return Float.intBitsToFloat((int) (j3 >> 32));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final float m8545c(long j3) {
        return Float.intBitsToFloat((int) (j3 & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final long m8546d(long j3, long j4) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) - Float.intBitsToFloat((int) (j4 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) - Float.intBitsToFloat((int) (j4 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final long m8547e(long j3, long j4) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32)) + Float.intBitsToFloat((int) (j3 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j4 & 4294967295L)) + Float.intBitsToFloat((int) (j3 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final long m8548f(long j3, float f3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) * f3;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) * f3;
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static String m8549g(long j3) {
        return "(" + m8544b(j3) + ", " + m8545c(j3) + ") px/sec";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C4247q) {
            return this.f13927a == ((C4247q) obj).f13927a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f13927a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m8549g(this.f13927a);
    }
}
