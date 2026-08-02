package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class ql2 extends yh1 {
    public final bm2 a;
    public final qv1 b;
    public final boolean c;
    public final boolean d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ql2(bm2 bm2Var, qv1 qv1Var, boolean z, boolean z2) {
        this.a = bm2Var;
        this.b = qv1Var;
        this.c = z;
        this.d = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql2)) {
            return false;
        }
        ql2 ql2Var = (ql2) obj;
        return t11.l(this.a, ql2Var.a) && this.b == ql2Var.b && this.c == ql2Var.c && this.d == ql2Var.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final th1 f() {
        return new am2(null, null, null, this.b, this.a, this.c, this.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final void g(th1 th1Var) {
        ((am2) th1Var).d1(null, null, null, this.b, this.a, this.c, this.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return hk1.d(hk1.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 961, 31, this.c), 29791, this.d);
    }
}
