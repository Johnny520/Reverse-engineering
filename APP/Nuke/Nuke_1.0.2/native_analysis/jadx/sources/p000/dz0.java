package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dz0 implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2264h = 1;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f2265i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f2266j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ gu2 f2267k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f2268l;

    public /* synthetic */ dz0(cq1 cq1Var, xk1 xk1Var, xk1 xk1Var2, xk1 xk1Var3) {
        this.f2265i = cq1Var;
        this.f2266j = xk1Var;
        this.f2267k = xk1Var2;
        this.f2268l = xk1Var3;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        int i = this.f2264h;
        a83 a83Var = a83.f116a;
        Object obj = this.f2268l;
        gu2 gu2Var = this.f2267k;
        Object obj2 = this.f2266j;
        Object obj3 = this.f2265i;
        switch (i) {
            case 0:
                Float f = (Float) obj3;
                az0 az0Var = (az0) gu2Var;
                Float f2 = (Float) obj2;
                zy0 zy0Var = (zy0) obj;
                if (!f.equals(az0Var.f445h) || !f2.equals(az0Var.f446i)) {
                    az0Var.f445h = f;
                    az0Var.f446i = f2;
                    az0Var.f448k = new cy2(zy0Var, rg3.f9572n, f, f2, null);
                    az0Var.f452o.f1789b.setValue(Boolean.TRUE);
                    az0Var.f449l = false;
                    az0Var.f450m = true;
                }
                break;
            default:
                cq1 cq1Var = (cq1) obj3;
                xk1 xk1Var = (xk1) obj2;
                xk1 xk1Var2 = (xk1) gu2Var;
                xk1 xk1Var3 = (xk1) obj;
                if (cq1Var.f1685k) {
                    xk1Var.setValue(cq1Var);
                } else {
                    xk1Var2.setValue(new vy1(cq1Var.f1675a, cq1Var.f1676b, cq1Var.f1684j, false));
                }
                xk1Var3.setValue(null);
                break;
        }
        return a83Var;
    }

    public /* synthetic */ dz0(Float f, az0 az0Var, Float f2, zy0 zy0Var) {
        this.f2265i = f;
        this.f2267k = az0Var;
        this.f2266j = f2;
        this.f2268l = zy0Var;
    }
}
