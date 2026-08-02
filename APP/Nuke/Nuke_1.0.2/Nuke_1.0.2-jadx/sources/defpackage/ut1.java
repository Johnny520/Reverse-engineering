package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class ut1 extends yh1 {
    public final in0 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ut1(in0 in0Var) {
        this.a = in0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ut1) {
            return this.a == ((ut1) obj).a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final th1 f() {
        vt1 vt1Var = new vt1();
        vt1Var.v = this.a;
        vt1Var.w = -9223372034707292160L;
        return vt1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final void g(th1 th1Var) {
        vt1 vt1Var = (vt1) th1Var;
        vt1Var.v = this.a;
        vt1Var.w = -9223372034707292160L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.a.hashCode();
    }
}
