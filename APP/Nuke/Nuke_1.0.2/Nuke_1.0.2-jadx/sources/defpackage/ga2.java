package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ga2 implements sa0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ ka2 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ga2(ka2 ka2Var, int i) {
        this.h = i;
        this.i = ka2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sa0
    public final double e(double d) {
        int i = this.h;
        ka2 ka2Var = this.i;
        switch (i) {
            case 0:
                return ci0.B(ka2Var.k.e(d), ka2Var.e, ka2Var.f);
            default:
                return ka2Var.n.e(ci0.B(d, ka2Var.e, ka2Var.f));
        }
    }
}
