package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class fg0 {

    /* JADX INFO: renamed from: a */
    public final long f1722a;

    /* JADX INFO: renamed from: b */
    public final long f1723b;

    /* JADX INFO: renamed from: c */
    public final boolean f1724c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public fg0(long j, long j2, boolean z) {
        this.f1722a = j;
        this.f1723b = j2;
        this.f1724c = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final fg0 m1103a(fg0 fg0Var) {
        return new fg0(ok0.m2934e(this.f1722a, fg0Var.f1722a), Math.max(this.f1723b, fg0Var.f1723b), this.f1724c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg0)) {
            return false;
        }
        fg0 fg0Var = (fg0) obj;
        return ok0.m2931b(this.f1722a, fg0Var.f1722a) && this.f1723b == fg0Var.f1723b && this.f1724c == fg0Var.f1724c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f1724c) + AbstractC0748t1.m4146d(this.f1723b, Long.hashCode(this.f1722a) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) ok0.m2936g(this.f1722a)) + ", timeMillis=" + this.f1723b + ", shouldApplyImmediately=" + this.f1724c + ')';
    }
}
