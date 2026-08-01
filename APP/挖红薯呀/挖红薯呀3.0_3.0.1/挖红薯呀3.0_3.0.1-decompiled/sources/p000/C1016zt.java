package p000;

/* JADX INFO: renamed from: zt */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1016zt {

    /* JADX INFO: renamed from: a */
    public final float f7992a;

    /* JADX INFO: renamed from: b */
    public final float f7993b;

    /* JADX INFO: renamed from: c */
    public final long f7994c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1016zt(float f, float f2, long j) {
        this.f7992a = f;
        this.f7993b = f2;
        this.f7994c = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1016zt)) {
            return false;
        }
        C1016zt c1016zt = (C1016zt) obj;
        return Float.compare(this.f7992a, c1016zt.f7992a) == 0 && Float.compare(this.f7993b, c1016zt.f7993b) == 0 && this.f7994c == c1016zt.f7994c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f7994c) + AbstractC0748t1.m4143a(this.f7993b, Float.hashCode(this.f7992a) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f7992a + ", distance=" + this.f7993b + ", duration=" + this.f7994c + ')';
    }
}
