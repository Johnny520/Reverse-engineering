package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kt1 extends t11 {
    public final fj k;
    public final ia1 l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kt1(fj fjVar, ia1 ia1Var) {
        fjVar.getClass();
        this.k = fjVar;
        this.l = ia1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt1)) {
            return false;
        }
        kt1 kt1Var = (kt1) obj;
        return t11.l(this.k, kt1Var.k) && t11.l(this.l, kt1Var.l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.k.hashCode() * 31;
        ia1 ia1Var = this.l;
        return iHashCode + (ia1Var == null ? 0 : ia1Var.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.k + ", owner=" + this.l + ')';
    }
}
