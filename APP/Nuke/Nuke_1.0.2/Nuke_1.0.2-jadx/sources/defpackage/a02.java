package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a02 implements xm0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ xk1 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ a02(xk1 xk1Var, int i) {
        this.h = i;
        this.i = xk1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        int i = this.h;
        a83 a83Var = a83.a;
        xk1 xk1Var = this.i;
        switch (i) {
            case 0:
                c61 c61Var = (c61) xk1Var.getValue();
                if (c61Var == null) {
                    nz0.d("Required value was null.");
                    s.b();
                }
                break;
            case 1:
                xk1Var.setValue(null);
                break;
            case 2:
                xk1Var.setValue(null);
                break;
            default:
                xk1Var.setValue(fe0.h);
                break;
        }
        return a83Var;
    }
}
