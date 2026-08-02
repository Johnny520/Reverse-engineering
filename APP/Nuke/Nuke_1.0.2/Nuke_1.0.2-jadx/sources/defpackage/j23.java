package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class j23 extends e30 {
    public final d63 m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j23(za2 za2Var, kt2 kt2Var, s72 s72Var, d63 d63Var, dz dzVar) {
        super(za2Var, kt2Var, null, s72Var, dzVar);
        int i = za2Var.e;
        if (i != 6) {
            s.j(vi0.g("opcode with invalid branchingness: ", i));
            throw null;
        }
        if (d63Var != null) {
            this.m = d63Var;
        } else {
            um2.f("catches == null");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.i01
    public final void d(h01 h01Var) {
        h01Var.c(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.i01
    public final d63 e() {
        return this.m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e30, defpackage.i01
    public final String f() {
        dz dzVar = this.l;
        String strB = dzVar.b();
        if (dzVar instanceof q30) {
            strB = ((q30) dzVar).g();
        }
        return strB + " " + k23.g(this.m);
    }
}
