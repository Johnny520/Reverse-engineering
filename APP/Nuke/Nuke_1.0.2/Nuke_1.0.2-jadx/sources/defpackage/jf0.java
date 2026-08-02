package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class jf0 extends yh1 {
    public final y33 a;
    public final u33 b;
    public final u33 c;
    public final sf0 d;
    public final ph0 e;
    public final xm0 f;
    public final kf0 g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public jf0(y33 y33Var, u33 u33Var, u33 u33Var2, sf0 sf0Var, ph0 ph0Var, xm0 xm0Var, kf0 kf0Var) {
        this.a = y33Var;
        this.b = u33Var;
        this.c = u33Var2;
        this.d = sf0Var;
        this.e = ph0Var;
        this.f = xm0Var;
        this.g = kf0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof jf0)) {
            return false;
        }
        jf0 jf0Var = (jf0) obj;
        return jf0Var.a == this.a && t11.l(jf0Var.b, this.b) && t11.l(jf0Var.c, this.c) && jf0Var.d.equals(this.d) && t11.l(jf0Var.e, this.e) && jf0Var.f == this.f && t11.l(jf0Var.g, this.g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final th1 f() {
        return new rf0(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final void g(th1 th1Var) {
        rf0 rf0Var = (rf0) th1Var;
        rf0Var.v = this.a;
        rf0Var.w = this.b;
        rf0Var.x = this.c;
        rf0Var.y = this.d;
        rf0Var.z = this.e;
        rf0Var.A = this.f;
        rf0Var.B = this.g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        u33 u33Var = this.b;
        int iHashCode2 = (iHashCode + (u33Var != null ? u33Var.hashCode() : 0)) * 31;
        u33 u33Var2 = this.c;
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.a.hashCode() + ((this.d.a.hashCode() + ((iHashCode2 + (u33Var2 != null ? u33Var2.hashCode() : 0)) * 961)) * 31)) * 31)) * 31);
    }
}
