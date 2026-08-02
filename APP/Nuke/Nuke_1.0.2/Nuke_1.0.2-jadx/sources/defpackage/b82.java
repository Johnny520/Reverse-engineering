package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b82 extends q2 implements d20 {
    public final /* synthetic */ cy i;
    public final /* synthetic */ c82 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public b82(cy cyVar, c82 c82Var) {
        gd3 gd3Var = gd3.q;
        this.i = cyVar;
        this.j = c82Var;
        super(gd3Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.d20
    public final void p(a20 a20Var, Throwable th) throws Throwable {
        cy cyVar = this.i;
        c82 c82Var = this.j;
        se.R(th, new r1(12, cyVar, c82Var));
        d20 d20Var = (d20) c82Var.h.o(gd3.q);
        if (d20Var == null) {
            throw th;
        }
        d20Var.p(a20Var, th);
    }
}
