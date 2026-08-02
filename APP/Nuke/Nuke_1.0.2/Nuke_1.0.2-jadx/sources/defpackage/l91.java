package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class l91 extends yh1 {
    public final l9 a;
    public final t91 b;
    public final b03 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l91(l9 l9Var, t91 t91Var, b03 b03Var) {
        this.a = l9Var;
        this.b = t91Var;
        this.c = b03Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l91) {
            l91 l91Var = (l91) obj;
            return t11.l(this.a, l91Var.a) && this.b == l91Var.b && this.c == l91Var.c;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final th1 f() {
        return new m91(this.a, this.b, this.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final void g(th1 th1Var) {
        m91 m91Var = (m91) th1Var;
        if (m91Var.u) {
            m91Var.v.g();
            m91Var.v.k(m91Var);
        }
        l9 l9Var = this.a;
        m91Var.v = l9Var;
        if (m91Var.u) {
            if (l9Var.a != null) {
                nz0.c("Expected textInputModifierNode to be null");
            }
            l9Var.a = m91Var;
        }
        m91Var.w = this.b;
        m91Var.x = this.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.a + ", legacyTextFieldState=" + this.b + ", textFieldSelectionManager=" + this.c + ')';
    }
}
