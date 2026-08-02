package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class d01 extends yh1 {
    public final vd3 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d01(vd3 vd3Var) {
        this.a = vd3Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d01) {
            return t11.l(((d01) obj).a, this.a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final th1 f() {
        f01 f01Var = new f01();
        hj0 hj0Var = tl.h;
        f01Var.v = hj0Var;
        f01Var.w = hj0Var;
        f01Var.x = this.a;
        return f01Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final void g(th1 th1Var) {
        f01 f01Var = (f01) th1Var;
        vd3 vd3Var = f01Var.x;
        vd3 vd3Var2 = this.a;
        if (t11.l(vd3Var2, vd3Var)) {
            return;
        }
        f01Var.x = vd3Var2;
        f01Var.M0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.a.hashCode();
    }
}
