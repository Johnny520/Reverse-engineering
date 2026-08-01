package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class st0 {

    /* JADX INFO: renamed from: e */
    public static final st0 f5831e = new st0(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a */
    public final float f5832a;

    /* JADX INFO: renamed from: b */
    public final float f5833b;

    /* JADX INFO: renamed from: c */
    public final float f5834c;

    /* JADX INFO: renamed from: d */
    public final float f5835d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public st0(float f, float f2, float f3, float f4) {
        this.f5832a = f;
        this.f5833b = f2;
        this.f5834c = f3;
        this.f5835d = f4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final long m4101a() {
        float f = this.f5834c;
        float f2 = this.f5832a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.f5835d;
        float f5 = this.f5833b;
        return (((long) Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final long m4102b() {
        float f = this.f5834c - this.f5832a;
        return (((long) Float.floatToRawIntBits(this.f5835d - this.f5833b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final st0 m4103c(st0 st0Var) {
        return new st0(Math.max(this.f5832a, st0Var.f5832a), Math.max(this.f5833b, st0Var.f5833b), Math.min(this.f5834c, st0Var.f5834c), Math.min(this.f5835d, st0Var.f5835d));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final st0 m4104d(float f, float f2) {
        return new st0(this.f5832a + f, this.f5833b + f2, this.f5834c + f, this.f5835d + f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final st0 m4105e(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new st0(Float.intBitsToFloat(i) + this.f5832a, Float.intBitsToFloat(i2) + this.f5833b, Float.intBitsToFloat(i) + this.f5834c, Float.intBitsToFloat(i2) + this.f5835d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st0)) {
            return false;
        }
        st0 st0Var = (st0) obj;
        return Float.compare(this.f5832a, st0Var.f5832a) == 0 && Float.compare(this.f5833b, st0Var.f5833b) == 0 && Float.compare(this.f5834c, st0Var.f5834c) == 0 && Float.compare(this.f5835d, st0Var.f5835d) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f5835d) + AbstractC0748t1.m4143a(this.f5834c, AbstractC0748t1.m4143a(this.f5833b, Float.hashCode(this.f5832a) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Rect.fromLTRB(" + rd0.m3462U(this.f5832a) + ", " + rd0.m3462U(this.f5833b) + ", " + rd0.m3462U(this.f5834c) + ", " + rd0.m3462U(this.f5835d) + ')';
    }
}
