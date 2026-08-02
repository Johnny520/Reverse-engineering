package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t10 extends yh1 {
    public final q33 a;
    public final k03 b;
    public final t91 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final us1 g;
    public final b03 h;
    public final xx0 i;
    public final gl0 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t10(q33 q33Var, k03 k03Var, t91 t91Var, boolean z, boolean z2, boolean z3, us1 us1Var, b03 b03Var, xx0 xx0Var, gl0 gl0Var) {
        this.a = q33Var;
        this.b = k03Var;
        this.c = t91Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = us1Var;
        this.h = b03Var;
        this.i = xx0Var;
        this.j = gl0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t10) {
            t10 t10Var = (t10) obj;
            if (this.a.equals(t10Var.a) && this.b.equals(t10Var.b) && this.c == t10Var.c && this.d == t10Var.d && this.e == t10Var.e && this.f == t10Var.f && this.g.equals(t10Var.g) && this.h == t10Var.h && t11.l(this.i, t10Var.i) && t11.l(this.j, t10Var.j)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final th1 f() {
        w10 w10Var = new w10();
        w10Var.x = this.a;
        w10Var.y = this.b;
        w10Var.z = this.c;
        w10Var.A = this.d;
        w10Var.B = this.e;
        w10Var.C = this.f;
        w10Var.D = this.g;
        b03 b03Var = this.h;
        w10Var.E = b03Var;
        w10Var.F = this.i;
        w10Var.G = this.j;
        b03Var.g = new u10(w10Var, 4);
        return w10Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final void g(th1 th1Var) {
        w10 w10Var = (w10) th1Var;
        boolean z = w10Var.B;
        int i = 0;
        boolean z2 = z && !w10Var.A;
        boolean z3 = w10Var.C;
        xx0 xx0Var = w10Var.F;
        b03 b03Var = w10Var.E;
        boolean z4 = this.d;
        boolean z5 = this.e;
        boolean z6 = z5 && !z4;
        w10Var.x = this.a;
        k03 k03Var = this.b;
        w10Var.y = k03Var;
        w10Var.z = this.c;
        w10Var.A = z4;
        w10Var.B = z5;
        w10Var.D = this.g;
        b03 b03Var2 = this.h;
        w10Var.E = b03Var2;
        xx0 xx0Var2 = this.i;
        w10Var.F = xx0Var2;
        w10Var.G = this.j;
        if (z5 != z || z6 != z2 || !t11.l(xx0Var2, xx0Var) || this.f != z3 || !f13.c(k03Var.b)) {
            qp0.E(w10Var);
        }
        if (b03Var2 != b03Var) {
            b03Var2.g = new u10(w10Var, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + hk1.d(hk1.d(hk1.d((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.a + ", value=" + this.b + ", state=" + this.c + ", readOnly=" + this.d + ", enabled=" + this.e + ", isPassword=" + this.f + ", offsetMapping=" + this.g + ", manager=" + this.h + ", imeOptions=" + this.i + ", focusRequester=" + this.j + ')';
    }
}
