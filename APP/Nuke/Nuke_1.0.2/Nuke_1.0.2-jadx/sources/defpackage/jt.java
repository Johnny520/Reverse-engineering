package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class jt extends yh1 {
    public final bk1 a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final xm0 e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public jt(bk1 bk1Var, boolean z, boolean z2, String str, xm0 xm0Var) {
        this.a = bk1Var;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = xm0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jt.class != obj.getClass()) {
            return false;
        }
        jt jtVar = (jt) obj;
        return t11.l(this.a, jtVar.a) && this.b == jtVar.b && this.c == jtVar.c && t11.l(this.d, jtVar.d) && this.e == jtVar.e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final th1 f() {
        return new kt(this.a, this.b, this.c, this.d, this.e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    @Override // defpackage.yh1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(th1 th1Var) {
        boolean z;
        t60 t60Var;
        kt ktVar = (kt) th1Var;
        ul0 ul0Var = ktVar.C;
        bk1 bk1Var = ktVar.L;
        bk1 bk1Var2 = this.a;
        boolean z2 = true;
        if (t11.l(bk1Var, bk1Var2)) {
            z = false;
        } else {
            ktVar.Q0();
            ktVar.L = bk1Var2;
            ktVar.x = bk1Var2;
            z = true;
        }
        boolean z3 = ktVar.y;
        boolean z4 = this.b;
        if (z3 != z4) {
            ktVar.y = z4;
            if (z4) {
                ktVar.L();
            }
            z = true;
        }
        boolean z5 = ktVar.A;
        boolean z6 = this.c;
        if (z5 != z6) {
            if (z6) {
                ktVar.M0(ul0Var);
            } else {
                ktVar.N0(ul0Var);
                ktVar.Q0();
            }
            qp0.E(ktVar);
            ktVar.A = z6;
        }
        String str = ktVar.z;
        String str2 = this.d;
        if (!t11.l(str, str2)) {
            ktVar.z = str2;
            qp0.E(ktVar);
        }
        ktVar.B = this.e;
        boolean z7 = ktVar.M;
        bk1 bk1Var3 = ktVar.L;
        if (z7 == (bk1Var3 == null)) {
            z2 = z;
        } else {
            boolean z8 = bk1Var3 == null;
            ktVar.M = z8;
            if (z8 || ktVar.F != null) {
            }
        }
        if (z2 && ((t60Var = ktVar.F) != null || !ktVar.M)) {
            if (t60Var != null) {
                ktVar.N0(t60Var);
            }
            ktVar.F = null;
            ktVar.S0();
        }
        ul0Var.Q0(ktVar.x);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        bk1 bk1Var = this.a;
        int iD = hk1.d(hk1.d((bk1Var != null ? bk1Var.hashCode() : 0) * 961, 31, this.b), 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((iD + (str != null ? str.hashCode() : 0)) * 961);
    }
}
