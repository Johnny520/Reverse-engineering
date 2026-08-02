package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ag1 extends gx0 {
    public final m30 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ag1(m30 m30Var) {
        super(m30Var.h);
        this.j = m30Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final int c() {
        return 8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final void d(z70 z70Var, yn ynVar) {
        b42 b42Var = (b42) z70Var.i;
        b42 b42Var2 = (b42) z70Var.h;
        m30 m30Var = this.j;
        o30 o30Var = m30Var.i;
        int iM = b42Var.m(this.i);
        int iL = b42Var2.l(o30Var.h);
        int iH = h(z70Var);
        if (ynVar.d()) {
            ynVar.c(f() + ' ' + m30Var.b(), 0);
            ynVar.c("  class_idx: ".concat(pp0.J(iM)), 2);
            ynVar.c(String.format("  %-10s %s", i().concat(":"), pp0.J(iH)), 2);
            ynVar.c("  name_idx:  ".concat(pp0.K(iL)), 4);
        }
        ynVar.k(iM);
        ynVar.k(iH);
        ynVar.j(iL);
    }

    public abstract int h(z70 z70Var);

    public abstract String i();
}
