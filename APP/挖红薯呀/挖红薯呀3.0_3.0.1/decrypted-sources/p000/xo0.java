package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class xo0 {

    /* JADX INFO: renamed from: a */
    public final C0080c6 f7387a;

    /* JADX INFO: renamed from: b */
    public final int f7388b;

    /* JADX INFO: renamed from: c */
    public final int f7389c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public xo0(C0080c6 c0080c6, int i, int i2) {
        this.f7387a = c0080c6;
        this.f7388b = i;
        this.f7389c = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xo0) {
            xo0 xo0Var = (xo0) obj;
            if (this.f7387a == xo0Var.f7387a && this.f7388b == xo0Var.f7388b && this.f7389c == xo0Var.f7389c) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f7389c) + AbstractC0748t1.m4144b(this.f7388b, this.f7387a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.f7387a + ", startIndex=" + this.f7388b + ", endIndex=" + this.f7389c + ')';
    }
}
