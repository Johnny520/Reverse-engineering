package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t33 implements gu2 {
    public final w33 h;
    public in0 i;
    public in0 j;
    public final /* synthetic */ u33 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t33(u33 u33Var, w33 w33Var, in0 in0Var, in0 in0Var2) {
        this.k = u33Var;
        this.h = w33Var;
        this.i = in0Var;
        this.j = in0Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(v33 v33Var) {
        w33 w33Var = this.h;
        nx1 nx1Var = w33Var.l;
        nx1 nx1Var2 = w33Var.i;
        jx1 jx1Var = w33Var.m;
        nx1 nx1Var3 = w33Var.o;
        Object objJ = this.j.j(v33Var.b);
        if (this.k.c.g()) {
            w33Var.f(this.j.j(v33Var.a), objJ, (fj0) this.i.j(v33Var));
            return;
        }
        fj0 fj0Var = (fj0) this.i.j(v33Var);
        if (w33Var.n && t11.l(objJ, null)) {
            return;
        }
        if (t11.l(nx1Var2.getValue(), objJ) && jx1Var.g() == -1.0f) {
            return;
        }
        nx1Var2.setValue(objJ);
        w33Var.j.setValue(fj0Var);
        w33Var.e(jx1Var.g() == -3.0f ? objJ : nx1Var3.getValue(), !((Boolean) nx1Var.getValue()).booleanValue());
        nx1Var.setValue(Boolean.valueOf(jx1Var.g() == -3.0f));
        if (jx1Var.g() >= 0.0f) {
            nx1Var3.setValue(w33Var.a().b((long) (jx1Var.g() * w33Var.a().c())));
        } else if (jx1Var.g() == -3.0f) {
            nx1Var3.setValue(objJ);
        }
        w33Var.n = false;
        jx1Var.h(-1.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gu2
    public final Object getValue() {
        a(this.k.c.f());
        return this.h.o.getValue();
    }
}
