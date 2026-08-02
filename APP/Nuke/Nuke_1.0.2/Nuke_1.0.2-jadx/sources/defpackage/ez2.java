package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class ez2 extends yh1 {
    public final dq1 a;
    public final vz2 b;
    public final wz2 c;
    public final j10 d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ez2(dq1 dq1Var, vz2 vz2Var, wz2 wz2Var, j10 j10Var) {
        this.a = dq1Var;
        this.b = vz2Var;
        this.c = wz2Var;
        this.d = j10Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez2)) {
            return false;
        }
        ez2 ez2Var = (ez2) obj;
        return this.a == ez2Var.a && this.b == ez2Var.b && this.c == ez2Var.c && this.d == ez2Var.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final th1 f() {
        return new fz2(this.a, this.b, this.c, this.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final void g(th1 th1Var) {
        fz2 fz2Var = (fz2) th1Var;
        fz2Var.x.i = null;
        dq1 dq1Var = this.a;
        fz2Var.x = dq1Var;
        dq1Var.i = fz2Var;
        dq1Var.j = fz2Var.u ? w23.j : w23.i;
        fz2Var.y = this.b;
        fz2Var.z = this.c;
        fz2Var.A = this.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
