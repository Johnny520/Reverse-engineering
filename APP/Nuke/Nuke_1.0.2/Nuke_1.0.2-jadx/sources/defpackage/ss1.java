package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class ss1 extends yh1 {
    public final float a;
    public final float b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ss1(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ss1 ss1Var = obj instanceof ss1 ? (ss1) obj : null;
        return ss1Var != null && za0.b(this.a, ss1Var.a) && za0.b(this.b, ss1Var.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final th1 f() {
        vs1 vs1Var = new vs1();
        vs1Var.v = this.a;
        vs1Var.w = this.b;
        vs1Var.x = true;
        return vs1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final void g(th1 th1Var) {
        vs1 vs1Var = (vs1) th1Var;
        float f = vs1Var.v;
        float f2 = this.a;
        boolean zB = za0.b(f, f2);
        float f3 = this.b;
        if (!zB || !za0.b(vs1Var.w, f3) || !vs1Var.x) {
            sp0.c0(vs1Var).U(false);
        }
        vs1Var.v = f2;
        vs1Var.w = f3;
        vs1Var.x = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(true) + vi0.c(this.b, Float.hashCode(this.a) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) za0.c(this.a)) + ", y=" + ((Object) za0.c(this.b)) + ", rtlAware=true)";
    }
}
