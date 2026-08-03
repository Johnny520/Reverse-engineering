package p057e1;

import p007a7.AbstractC0018a;

/* JADX INFO: renamed from: e1.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0807b {

    /* JADX INFO: renamed from: a */
    public final long f2414a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static long m2038a(long j3, float f3, int i9) {
        float fIntBitsToFloat = (i9 & 1) != 0 ? Float.intBitsToFloat((int) (j3 >> 32)) : 0.0f;
        if ((i9 & 2) != 0) {
            f3 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final boolean m2039b(long j3, long j4) {
        return j3 == j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final float m2040c(long j3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        return (float) Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final long m2041d(long j3, long j4) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) - Float.intBitsToFloat((int) (j4 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) - Float.intBitsToFloat((int) (j4 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final long m2042e(long j3, long j4) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32)) + Float.intBitsToFloat((int) (j3 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j4 & 4294967295L)) + Float.intBitsToFloat((int) (j3 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final long m2043f(long j3, float f3) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) * f3;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) * f3;
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static String m2044g(long j3) {
        if ((9223372034707292159L & j3) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + AbstractC0018a.m234V(Float.intBitsToFloat((int) (j3 >> 32))) + ", " + AbstractC0018a.m234V(Float.intBitsToFloat((int) (j3 & 4294967295L))) + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C0807b) {
            return this.f2414a == ((C0807b) obj).f2414a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f2414a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return m2044g(this.f2414a);
    }
}
