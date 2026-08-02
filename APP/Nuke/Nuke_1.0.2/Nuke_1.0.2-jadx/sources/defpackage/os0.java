package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class os0 extends yh1 {
    public final m13 a;
    public final int b;
    public final int c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public os0(m13 m13Var, int i, int i2) {
        this.a = m13Var;
        this.b = i;
        this.c = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof os0)) {
            return false;
        }
        os0 os0Var = (os0) obj;
        return t11.l(this.a, os0Var.a) && this.b == os0Var.b && this.c == os0Var.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final th1 f() {
        qs0 qs0Var = new qs0();
        qs0Var.v = this.a;
        qs0Var.w = this.b;
        qs0Var.x = this.c;
        qs0Var.z = -1;
        qs0Var.A = -1;
        return qs0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final void g(th1 th1Var) {
        qs0 qs0Var = (qs0) th1Var;
        m13 m13Var = qs0Var.v;
        m13 m13Var2 = this.a;
        boolean zL = t11.l(m13Var, m13Var2);
        int i = this.b;
        int i2 = this.c;
        if (zL && qs0Var.w == i && qs0Var.x == i2) {
            return;
        }
        qs0Var.v = m13Var2;
        qs0Var.w = i;
        qs0Var.x = i2;
        qs0Var.B = xe1.k0(m13Var2, sp0.c0(qs0Var).G);
        qs0Var.y = true;
        gf1.A(qs0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }
}
