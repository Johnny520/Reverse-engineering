package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class m81 extends yh1 {
    public final xm0 a;
    public final l81 b;
    public final qv1 c;
    public final boolean d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m81(xm0 xm0Var, l81 l81Var, qv1 qv1Var, boolean z) {
        this.a = xm0Var;
        this.b = l81Var;
        this.c = qv1Var;
        this.d = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m81)) {
            return false;
        }
        m81 m81Var = (m81) obj;
        return this.a == m81Var.a && t11.l(this.b, m81Var.b) && this.c == m81Var.c && this.d == m81Var.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final th1 f() {
        return new q81(this.a, this.b, this.c, this.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final void g(th1 th1Var) {
        q81 q81Var = (q81) th1Var;
        q81Var.v = this.a;
        q81Var.w = this.b;
        qv1 qv1Var = q81Var.x;
        qv1 qv1Var2 = this.c;
        if (qv1Var != qv1Var2) {
            q81Var.x = qv1Var2;
            qp0.E(q81Var);
        }
        boolean z = q81Var.y;
        boolean z2 = this.d;
        if (z == z2) {
            return;
        }
        q81Var.y = z2;
        q81Var.M0();
        qp0.E(q81Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(false) + hk1.d((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }
}
