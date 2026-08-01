package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class q20 {

    /* JADX INFO: renamed from: a */
    public final int f5024a;

    /* JADX INFO: renamed from: b */
    public final int f5025b;

    /* JADX INFO: renamed from: c */
    public final int f5026c;

    /* JADX INFO: renamed from: d */
    public final int f5027d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q20(int i, int i2, int i3, int i4) {
        this.f5024a = i;
        this.f5025b = i2;
        this.f5026c = i3;
        this.f5027d = i4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q20)) {
            return false;
        }
        q20 q20Var = (q20) obj;
        return this.f5024a == q20Var.f5024a && this.f5025b == q20Var.f5025b && this.f5026c == q20Var.f5026c && this.f5027d == q20Var.f5027d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (((((this.f5024a * 31) + this.f5025b) * 31) + this.f5026c) * 31) + this.f5027d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "InsetsValues(left=" + this.f5024a + ", top=" + this.f5025b + ", right=" + this.f5026c + ", bottom=" + this.f5027d + ')';
    }
}
