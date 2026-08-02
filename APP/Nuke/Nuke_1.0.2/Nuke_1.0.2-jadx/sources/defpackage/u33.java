package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u33 {
    public final n43 a;
    public final nx1 b = op0.u(null);
    public final /* synthetic */ y33 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u33(y33 y33Var, n43 n43Var, String str) {
        this.c = y33Var;
        this.a = n43Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final t33 a(in0 in0Var, in0 in0Var2) {
        nx1 nx1Var = this.b;
        t33 t33Var = (t33) nx1Var.getValue();
        y33 y33Var = this.c;
        if (t33Var == null) {
            Object objJ = in0Var2.j(y33Var.c());
            Object objJ2 = in0Var2.j(y33Var.c());
            n43 n43Var = this.a;
            nd ndVar = (nd) n43Var.a.j(objJ2);
            ndVar.d();
            w33 w33Var = new w33(y33Var, objJ, ndVar, n43Var);
            t33Var = new t33(this, w33Var, in0Var, in0Var2);
            nx1Var.setValue(t33Var);
            y33Var.i.add(w33Var);
        }
        t33Var.j = in0Var2;
        t33Var.i = in0Var;
        t33Var.a(y33Var.f());
        return t33Var;
    }
}
