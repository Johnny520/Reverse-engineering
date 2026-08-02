package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a01 implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ f01 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ a01(f01 f01Var, int i) {
        this.h = i;
        this.i = f01Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        f01 f01Var = this.i;
        d43 d43Var = (d43) obj;
        switch (i) {
            case 0:
                d43Var.getClass();
                f01 f01Var2 = (f01) d43Var;
                vd3 vd3Var = f01Var.w;
                if (!t11.l(f01Var2.v, vd3Var)) {
                    f01Var2.v = vd3Var;
                    f01Var2.M0();
                }
                return c43.i;
            default:
                d43Var.getClass();
                f01Var.v = ((f01) d43Var).w;
                return Boolean.FALSE;
        }
    }
}
