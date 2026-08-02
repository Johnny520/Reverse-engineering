package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
final class ol2 extends yh1 {
    public final bm2 a;
    public final qv1 b;
    public final boolean c;
    public final n50 d;
    public final bk1 e;
    public final boolean f;
    public final s8 g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ol2(s8 s8Var, n50 n50Var, bk1 bk1Var, qv1 qv1Var, bm2 bm2Var, boolean z, boolean z2) {
        this.a = bm2Var;
        this.b = qv1Var;
        this.c = z;
        this.d = n50Var;
        this.e = bk1Var;
        this.f = z2;
        this.g = s8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ol2.class != obj.getClass()) {
            return false;
        }
        ol2 ol2Var = (ol2) obj;
        return t11.l(this.a, ol2Var.a) && this.b == ol2Var.b && this.c == ol2Var.c && t11.l(this.d, ol2Var.d) && t11.l(this.e, ol2Var.e) && this.f == ol2Var.f && t11.l(this.g, ol2Var.g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final th1 f() {
        pl2 pl2Var = new pl2();
        pl2Var.x = this.a;
        pl2Var.y = this.b;
        pl2Var.z = this.c;
        pl2Var.A = this.d;
        pl2Var.B = this.e;
        pl2Var.C = this.f;
        pl2Var.D = this.g;
        return pl2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yh1
    public final void g(th1 th1Var) {
        ((pl2) th1Var).R0(this.g, this.d, this.e, this.b, this.a, this.f, this.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iD = hk1.d(hk1.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, false);
        n50 n50Var = this.d;
        int iHashCode = (iD + (n50Var != null ? n50Var.hashCode() : 0)) * 31;
        bk1 bk1Var = this.e;
        int iD2 = hk1.d((iHashCode + (bk1Var != null ? bk1Var.hashCode() : 0)) * 961, 31, this.f);
        s8 s8Var = this.g;
        return iD2 + (s8Var != null ? s8Var.hashCode() : 0);
    }
}
