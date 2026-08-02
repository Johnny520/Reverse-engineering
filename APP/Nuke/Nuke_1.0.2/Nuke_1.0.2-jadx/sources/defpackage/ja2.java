package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ja2 extends w51 implements in0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ ka2 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja2(ka2 ka2Var, int i) {
        super(1);
        this.i = i;
        this.j = ka2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.i;
        ka2 ka2Var = this.j;
        switch (i) {
            case 0:
                return Double.valueOf(ka2Var.n.e(ci0.B(((Number) obj).doubleValue(), ka2Var.e, ka2Var.f)));
            default:
                return Double.valueOf(ci0.B(ka2Var.k.e(((Number) obj).doubleValue()), ka2Var.e, ka2Var.f));
        }
    }
}
