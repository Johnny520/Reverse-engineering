package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class er1 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2571h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ gu2 f2572i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ gu2 f2573j;

    public /* synthetic */ er1(gu2 gu2Var, gu2 gu2Var2, int i) {
        this.f2571h = i;
        this.f2572i = gu2Var;
        this.f2573j = gu2Var2;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f2571h;
        a83 a83Var = a83.f116a;
        gu2 gu2Var = this.f2573j;
        gu2 gu2Var2 = this.f2572i;
        ca2 ca2Var = (ca2) obj;
        ca2Var.getClass();
        switch (i) {
            case 0:
                ca2Var.m725j(((Number) gu2Var2.getValue()).floatValue());
                ca2Var.m726k(((Number) gu2Var.getValue()).floatValue());
                ca2Var.m727l(((Number) gu2Var.getValue()).floatValue());
                break;
            case 1:
                ca2Var.m726k(((Number) gu2Var2.getValue()).floatValue());
                ca2Var.m727l(((Number) gu2Var.getValue()).floatValue());
                break;
            default:
                ca2Var.m732s(ca2Var.f1277x.mo693b() * ((za0) gu2Var2.getValue()).f13798h);
                ca2Var.m726k(((Number) gu2Var.getValue()).floatValue());
                ca2Var.m727l(((Number) gu2Var.getValue()).floatValue());
                break;
        }
        return a83Var;
    }
}
