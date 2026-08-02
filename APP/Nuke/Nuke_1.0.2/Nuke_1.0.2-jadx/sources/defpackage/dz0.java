package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dz0 implements xm0 {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ gu2 k;
    public final /* synthetic */ Object l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ dz0(cq1 cq1Var, xk1 xk1Var, xk1 xk1Var2, xk1 xk1Var3) {
        this.i = cq1Var;
        this.j = xk1Var;
        this.k = xk1Var2;
        this.l = xk1Var3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        int i = this.h;
        a83 a83Var = a83.a;
        Object obj = this.l;
        gu2 gu2Var = this.k;
        Object obj2 = this.j;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                Float f = (Float) obj3;
                az0 az0Var = (az0) gu2Var;
                Float f2 = (Float) obj2;
                zy0 zy0Var = (zy0) obj;
                if (!f.equals(az0Var.h) || !f2.equals(az0Var.i)) {
                    az0Var.h = f;
                    az0Var.i = f2;
                    az0Var.k = new cy2(zy0Var, rg3.n, f, f2, null);
                    az0Var.o.b.setValue(Boolean.TRUE);
                    az0Var.l = false;
                    az0Var.m = true;
                }
                break;
            default:
                cq1 cq1Var = (cq1) obj3;
                xk1 xk1Var = (xk1) obj2;
                xk1 xk1Var2 = (xk1) gu2Var;
                xk1 xk1Var3 = (xk1) obj;
                if (cq1Var.k) {
                    xk1Var.setValue(cq1Var);
                } else {
                    xk1Var2.setValue(new vy1(cq1Var.a, cq1Var.b, cq1Var.j, false));
                }
                xk1Var3.setValue(null);
                break;
        }
        return a83Var;
    }

    public /* synthetic */ dz0(Float f, az0 az0Var, Float f2, zy0 zy0Var) {
        this.i = f;
        this.k = az0Var;
        this.j = f2;
        this.l = zy0Var;
    }
}
