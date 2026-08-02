package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uw0 extends ww0 {
    public final /* synthetic */ int d;
    public final yo e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uw0(v82 v82Var, et1 et1Var, x00 x00Var, yo yoVar, int i) {
        super(v82Var, et1Var, x00Var);
        this.d = i;
        this.e = yoVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ww0
    public final Object a(ct1 ct1Var, Object[] objArr) {
        int i = this.d;
        yo yoVar = this.e;
        switch (i) {
            case 0:
                return yoVar.i(ct1Var);
            default:
                wo woVar = (wo) yoVar.i(ct1Var);
                t00 t00Var = (t00) objArr[objArr.length - 1];
                try {
                    mp mpVar = new mp(1, gf1.z(t00Var));
                    mpVar.u();
                    mpVar.w(new r51(woVar, 2));
                    woVar.b(new lw0(mpVar, 3));
                    return mpVar.t();
                } catch (Exception e) {
                    tp0.P(e, t00Var);
                    return k20.h;
                }
        }
    }
}
