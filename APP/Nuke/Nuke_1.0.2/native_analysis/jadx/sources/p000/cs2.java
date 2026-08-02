package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cs2 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1711h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ in0 f1712i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ in0 f1713j;

    public /* synthetic */ cs2(in0 in0Var, in0 in0Var2, int i) {
        this.f1711h = i;
        this.f1712i = in0Var;
        this.f1713j = in0Var2;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f1711h;
        a83 a83Var = a83.f116a;
        in0 in0Var = this.f1713j;
        in0 in0Var2 = this.f1712i;
        switch (i) {
            case 0:
                in0Var2.mo5j(obj);
                in0Var.mo5j(obj);
                break;
            default:
                in0Var2.mo5j(obj);
                in0Var.mo5j(obj);
                break;
        }
        return a83Var;
    }
}
