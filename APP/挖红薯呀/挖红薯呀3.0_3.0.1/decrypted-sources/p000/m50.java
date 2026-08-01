package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class m50 {

    /* JADX INFO: renamed from: a */
    public final int f3806a;

    /* JADX INFO: renamed from: b */
    public final int f3807b;

    /* JADX INFO: renamed from: c */
    public final boolean f3808c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m50(int i, int i2, boolean z) {
        this.f3806a = i;
        this.f3807b = i2;
        this.f3808c = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m50)) {
            return false;
        }
        m50 m50Var = (m50) obj;
        return this.f3806a == m50Var.f3806a && this.f3807b == m50Var.f3807b && this.f3808c == m50Var.f3808c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f3808c) + AbstractC0748t1.m4144b(this.f3807b, Integer.hashCode(this.f3806a) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BidiRun(start=" + this.f3806a + ", end=" + this.f3807b + ", isRtl=" + this.f3808c + ')';
    }
}
