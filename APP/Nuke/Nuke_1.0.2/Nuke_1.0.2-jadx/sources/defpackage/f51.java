package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class f51 extends yh1 {
    public final in0 a;
    public final in0 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f51(in0 in0Var, in0 in0Var2) {
        this.a = in0Var;
        this.b = in0Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f51)) {
            return false;
        }
        f51 f51Var = (f51) obj;
        return this.a == f51Var.a && this.b == f51Var.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final th1 f() {
        h51 h51Var = new h51();
        h51Var.v = this.a;
        h51Var.w = this.b;
        return h51Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final void g(th1 th1Var) {
        h51 h51Var = (h51) th1Var;
        h51Var.v = this.a;
        h51Var.w = this.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        in0 in0Var = this.a;
        int iHashCode = (in0Var != null ? in0Var.hashCode() : 0) * 31;
        in0 in0Var2 = this.b;
        return iHashCode + (in0Var2 != null ? in0Var2.hashCode() : 0);
    }
}
