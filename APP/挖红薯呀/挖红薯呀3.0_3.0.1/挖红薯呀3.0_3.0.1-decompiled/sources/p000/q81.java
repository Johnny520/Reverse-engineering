package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class q81 {

    /* JADX INFO: renamed from: a */
    public um0 f5087a;

    /* JADX INFO: renamed from: b */
    public long f5088b = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q81(um0 um0Var) {
        this.f5087a = um0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final long m3208a(long j, long j2, float f) {
        long jM2934e = ok0.m2934e(this.f5088b, ok0.m2933d(j, j2));
        this.f5088b = jM2934e;
        if ((this.f5087a == null ? ok0.m2932c(jM2934e) : Math.abs(m3209b(jM2934e))) < f) {
            return 9205357640488583168L;
        }
        um0 um0Var = this.f5087a;
        long j3 = this.f5088b;
        if (um0Var == null) {
            float fM2932c = ok0.m2932c(j3);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) / fM2932c;
            return ok0.m2933d(this.f5088b, ok0.m2935f(f, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) / fM2932c)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32)));
        }
        float fM3209b = m3209b(j3) - (Math.signum(m3209b(this.f5088b)) * f);
        long j4 = this.f5088b;
        um0 um0Var2 = this.f5087a;
        um0 um0Var3 = um0.f6265e;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (um0Var2 == um0Var3 ? j4 & 4294967295L : j4 >> 32));
        if (this.f5087a == um0Var3) {
            return (((long) Float.floatToRawIntBits(fM3209b)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fM3209b)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final float m3209b(long j) {
        return Float.intBitsToFloat((int) (this.f5087a == um0.f6265e ? j >> 32 : j & 4294967295L));
    }
}
