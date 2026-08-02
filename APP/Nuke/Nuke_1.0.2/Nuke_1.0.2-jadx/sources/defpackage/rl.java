package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rl extends yh1 {
    public final float a;
    public final ft2 b;
    public final eq2 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public rl(float f, ft2 ft2Var, eq2 eq2Var) {
        this.a = f;
        this.b = ft2Var;
        this.c = eq2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl)) {
            return false;
        }
        rl rlVar = (rl) obj;
        return za0.b(this.a, rlVar.a) && this.b.equals(rlVar.b) && t11.l(this.c, rlVar.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final th1 f() {
        return new ql(this.a, this.b, this.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final void g(th1 th1Var) {
        ql qlVar = (ql) th1Var;
        float f = qlVar.y;
        po poVar = qlVar.B;
        float f2 = this.a;
        if (!za0.b(f, f2)) {
            qlVar.y = f2;
            poVar.M0();
        }
        ft2 ft2Var = qlVar.z;
        ft2 ft2Var2 = this.b;
        if (!t11.l(ft2Var, ft2Var2)) {
            qlVar.z = ft2Var2;
            poVar.M0();
        }
        eq2 eq2Var = qlVar.A;
        eq2 eq2Var2 = this.c;
        if (t11.l(eq2Var, eq2Var2)) {
            return;
        }
        qlVar.A = eq2Var2;
        poVar.M0();
        qp0.E(qlVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) za0.c(this.a)) + ", brush=" + this.b + ", shape=" + this.c + ')';
    }
}
