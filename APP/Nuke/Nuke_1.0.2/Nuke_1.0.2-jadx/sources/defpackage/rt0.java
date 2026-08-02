package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rt0 implements xm0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ xk1 i;
    public final /* synthetic */ xk1 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ rt0(xk1 xk1Var, xk1 xk1Var2, int i) {
        this.h = i;
        this.i = xk1Var;
        this.j = xk1Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        int i = this.h;
        a83 a83Var = a83.a;
        xk1 xk1Var = this.j;
        xk1 xk1Var2 = this.i;
        switch (i) {
            case 0:
                xk1Var2.setValue(null);
                xk1Var.setValue(null);
                break;
            case 1:
                if (!((Boolean) xk1Var2.getValue()).booleanValue()) {
                    xk1Var.setValue(null);
                }
                break;
            case 2:
                xk1Var2.setValue(null);
                xk1Var.setValue(null);
                break;
            default:
                if (!((Boolean) xk1Var2.getValue()).booleanValue()) {
                    xk1Var.setValue(null);
                }
                break;
        }
        return a83Var;
    }
}
