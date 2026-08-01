package p153e1;

/* JADX INFO: renamed from: e1.q */
/* JADX INFO: loaded from: classes.dex */
public final class C2021q {

    /* JADX INFO: renamed from: a */
    public final long f6750a;

    /* JADX INFO: renamed from: a */
    public static long m3713a(long j5, float f2, float f5, int i5) {
        if ((i5 & 1) != 0) {
            f2 = Float.intBitsToFloat((int) (j5 >> 32));
        }
        if ((i5 & 2) != 0) {
            f5 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
    }

    /* JADX INFO: renamed from: b */
    public static final float m3714b(long j5) {
        return Float.intBitsToFloat((int) (j5 >> 32));
    }

    /* JADX INFO: renamed from: c */
    public static final float m3715c(long j5) {
        return Float.intBitsToFloat((int) (j5 & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public static final long m3716d(long j5, long j6) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) - Float.intBitsToFloat((int) (j6 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L)) - Float.intBitsToFloat((int) (j6 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: e */
    public static final long m3717e(long j5, long j6) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) + Float.intBitsToFloat((int) (j5 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j6 & 4294967295L)) + Float.intBitsToFloat((int) (j5 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: f */
    public static String m3718f(long j5) {
        return "(" + m3714b(j5) + ", " + m3715c(j5) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2021q) {
            return this.f6750a == ((C2021q) obj).f6750a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6750a);
    }

    public final String toString() {
        return m3718f(this.f6750a);
    }
}
