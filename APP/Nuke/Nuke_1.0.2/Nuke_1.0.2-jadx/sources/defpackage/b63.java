package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b63 extends gx0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final void a(z70 z70Var) {
        ((b42) z70Var.h).o(this.i.g());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final g21 b() {
        return g21.TYPE_TYPE_ID_ITEM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final int c() {
        return 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f21
    public final void d(z70 z70Var, yn ynVar) {
        q30 q30VarG = this.i.g();
        int iL = ((b42) z70Var.h).l(q30VarG);
        if (ynVar.d()) {
            ynVar.c(f() + ' ' + q30VarG.b(), 0);
            ynVar.c("  descriptor_idx: ".concat(pp0.K(iL)), 4);
        }
        ynVar.j(iL);
    }
}
