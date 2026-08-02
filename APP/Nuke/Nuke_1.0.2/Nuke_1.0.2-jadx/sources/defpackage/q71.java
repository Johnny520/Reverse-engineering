package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class q71 extends yh1 {
    public final r81 a;
    public final lm b;
    public final qv1 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q71(r81 r81Var, lm lmVar, qv1 qv1Var) {
        this.a = r81Var;
        this.b = lmVar;
        this.c = qv1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q71)) {
            return false;
        }
        q71 q71Var = (q71) obj;
        return t11.l(this.a, q71Var.a) && t11.l(this.b, q71Var.b) && this.c == q71Var.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final th1 f() {
        t71 t71Var = new t71();
        t71Var.v = this.a;
        t71Var.w = this.b;
        t71Var.x = this.c;
        return t71Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final void g(th1 th1Var) {
        t71 t71Var = (t71) th1Var;
        t71Var.v = this.a;
        t71Var.w = this.b;
        t71Var.x = this.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.c.hashCode() + hk1.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, false);
    }
}
