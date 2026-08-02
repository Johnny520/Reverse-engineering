package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cd1 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1487h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ kz2 f1488i;

    public /* synthetic */ cd1(kz2 kz2Var, int i) {
        this.f1487h = i;
        this.f1488i = kz2Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f1487h;
        a83 a83Var = a83.f116a;
        kz2 kz2Var = this.f1488i;
        switch (i) {
            case 0:
                kz2Var.mo2777b(((rs1) obj).f9744a, gd3.f3421H);
                break;
            case 1:
                o12 o12Var = (o12) obj;
                kz2Var.mo2780e(tp0.m5343E(o12Var, false));
                o12Var.m3463a();
                break;
            default:
                o12 o12Var2 = (o12) obj;
                kz2Var.mo2780e(tp0.m5343E(o12Var2, false));
                o12Var2.m3463a();
                break;
        }
        return a83Var;
    }
}
