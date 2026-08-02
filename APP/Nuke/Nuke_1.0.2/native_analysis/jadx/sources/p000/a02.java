package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a02 implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f10h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ xk1 f11i;

    public /* synthetic */ a02(xk1 xk1Var, int i) {
        this.f10h = i;
        this.f11i = xk1Var;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int i = this.f10h;
        a83 a83Var = a83.f116a;
        xk1 xk1Var = this.f11i;
        switch (i) {
            case 0:
                c61 c61Var = (c61) xk1Var.getValue();
                if (c61Var == null) {
                    nz0.m3459d("Required value was null.");
                    C0676s.m4644b();
                }
                break;
            case 1:
                xk1Var.setValue(null);
                break;
            case 2:
                xk1Var.setValue(null);
                break;
            default:
                xk1Var.setValue(fe0.f2918h);
                break;
        }
        return a83Var;
    }
}
