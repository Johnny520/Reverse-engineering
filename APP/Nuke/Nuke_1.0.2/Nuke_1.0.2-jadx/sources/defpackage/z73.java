package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class z73 implements vd3 {
    public final vd3 a;
    public final vd3 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z73(vd3 vd3Var, vd3 vd3Var2) {
        this.a = vd3Var;
        this.b = vd3Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vd3
    public final int a(pf1 pf1Var, d61 d61Var) {
        return Math.max(this.a.a(pf1Var, d61Var), this.b.a(pf1Var, d61Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vd3
    public final int b(pf1 pf1Var) {
        return Math.max(this.a.b(pf1Var), this.b.b(pf1Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vd3
    public final int c(pf1 pf1Var, d61 d61Var) {
        return Math.max(this.a.c(pf1Var, d61Var), this.b.c(pf1Var, d61Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vd3
    public final int d(pf1 pf1Var) {
        return Math.max(this.a.d(pf1Var), this.b.d(pf1Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z73)) {
            return false;
        }
        z73 z73Var = (z73) obj;
        return t11.l(z73Var.a, this.a) && t11.l(z73Var.b, this.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ')';
    }
}
