package p000;

/* JADX INFO: renamed from: pp */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0623pp {

    /* JADX INFO: renamed from: a */
    public final long f4938a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C0623pp) {
            return this.f4938a == ((C0623pp) obj).f4938a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f4938a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        long j = this.f4938a;
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) C0520np.m2733c(Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((Object) C0520np.m2733c(Float.intBitsToFloat((int) (4294967295L & j)))) + ')';
    }
}
