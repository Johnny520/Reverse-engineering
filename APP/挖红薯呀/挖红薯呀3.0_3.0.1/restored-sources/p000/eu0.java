package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class eu0 extends j50 {

    /* JADX INFO: renamed from: f */
    public final j50 f1527f;

    /* JADX INFO: renamed from: g */
    public final int f1528g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public eu0(j50 j50Var, int i) {
        this.f1527f = j50Var;
        this.f1528g = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof eu0)) {
            return false;
        }
        eu0 eu0Var = (eu0) obj;
        return eu0Var.f1527f.equals(this.f1527f) && eu0Var.f1528g == this.f1528g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1527f.hashCode() + (this.f1528g * 31);
    }
}
