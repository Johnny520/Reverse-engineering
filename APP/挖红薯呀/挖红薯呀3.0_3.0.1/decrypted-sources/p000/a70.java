package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class a70 {

    /* JADX INFO: renamed from: a */
    public final int f63a;

    /* JADX INFO: renamed from: b */
    public final int f64b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a70(int i, int i2) {
        this.f63a = i;
        this.f64b = i2;
        if (!(i >= 0)) {
            z10.m5361a("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        z10.m5361a("end index greater than start");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a70)) {
            return false;
        }
        a70 a70Var = (a70) obj;
        return this.f63a == a70Var.f63a && this.f64b == a70Var.f64b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f64b) + (Integer.hashCode(this.f63a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Interval(start=" + this.f63a + ", end=" + this.f64b + ')';
    }
}
