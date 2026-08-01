package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class wk0 {

    /* JADX INFO: renamed from: a */
    public final cl0 f7144a;

    /* JADX INFO: renamed from: b */
    public final x90 f7145b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wk0(cl0 cl0Var, x90 x90Var) {
        this.f7144a = cl0Var;
        this.f7145b = x90Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wk0) {
            wk0 wk0Var = (wk0) obj;
            if (this.f7144a == wk0Var.f7144a && p30.m3002l(this.f7145b, wk0Var.f7145b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f7144a.hashCode() * 31;
        x90 x90Var = this.f7145b;
        return iHashCode + (x90Var == null ? 0 : x90Var.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f7144a + ", owner=" + this.f7145b + ')';
    }
}
