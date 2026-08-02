package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rt0 implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f9749h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ xk1 f9750i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ xk1 f9751j;

    public /* synthetic */ rt0(xk1 xk1Var, xk1 xk1Var2, int i) {
        this.f9749h = i;
        this.f9750i = xk1Var;
        this.f9751j = xk1Var2;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int i = this.f9749h;
        a83 a83Var = a83.f116a;
        xk1 xk1Var = this.f9751j;
        xk1 xk1Var2 = this.f9750i;
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
