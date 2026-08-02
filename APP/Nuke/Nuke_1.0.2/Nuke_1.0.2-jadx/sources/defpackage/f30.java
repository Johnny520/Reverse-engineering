package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f30 extends ij0 {
    public final dz e;
    public int f;
    public int g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f30(oa0 oa0Var, kt2 kt2Var, s72 s72Var, dz dzVar) {
        super(oa0Var, kt2Var, s72Var);
        if (dzVar == null) {
            um2.f("constant == null");
            throw null;
        }
        this.e = dzVar;
        this.f = -1;
        this.g = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a40
    public final String a() {
        return this.e.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a40
    public final String c() {
        if (this.f < 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append(this.e.f());
        sb.append('@');
        int i = this.f;
        if (i < 65536) {
            sb.append(pp0.J(i));
        } else {
            sb.append(pp0.K(i));
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a40
    public final String d() {
        dz dzVar = this.e;
        return dzVar instanceof q30 ? ((q30) dzVar).g() : dzVar.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a40
    public final a40 i(oa0 oa0Var) {
        f30 f30Var = new f30(oa0Var, this.c, this.d, this.e);
        int i = this.f;
        if (i >= 0) {
            f30Var.o(i);
        }
        int i2 = this.g;
        if (i2 >= 0) {
            f30Var.n(i2);
        }
        return f30Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a40
    public final a40 k(s72 s72Var) {
        f30 f30Var = new f30(this.b, this.c, s72Var, this.e);
        int i = this.f;
        if (i >= 0) {
            f30Var.o(i);
        }
        int i2 = this.g;
        if (i2 >= 0) {
            f30Var.n(i2);
        }
        return f30Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int m() {
        int i = this.f;
        if (i >= 0) {
            return i;
        }
        s.n("index not yet set for ", this.e);
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n(int i) {
        if (i < 0) {
            s.j("index < 0");
        } else if (this.g < 0) {
            this.g = i;
        } else {
            s.l("class index already set");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o(int i) {
        if (i < 0) {
            s.j("index < 0");
        } else if (this.f < 0) {
            this.f = i;
        } else {
            s.l("index already set");
        }
    }
}
