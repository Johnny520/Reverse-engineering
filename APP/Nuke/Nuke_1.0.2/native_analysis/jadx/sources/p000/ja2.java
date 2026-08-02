package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ja2 extends w51 implements in0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f4935i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ka2 f4936j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja2(ka2 ka2Var, int i) {
        super(1);
        this.f4935i = i;
        this.f4936j = ka2Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f4935i;
        ka2 ka2Var = this.f4936j;
        switch (i) {
            case 0:
                return Double.valueOf(ka2Var.f5429n.mo687e(ci0.m777B(((Number) obj).doubleValue(), ka2Var.f5420e, ka2Var.f5421f)));
            default:
                return Double.valueOf(ci0.m777B(ka2Var.f5426k.mo687e(((Number) obj).doubleValue()), ka2Var.f5420e, ka2Var.f5421f));
        }
    }
}
