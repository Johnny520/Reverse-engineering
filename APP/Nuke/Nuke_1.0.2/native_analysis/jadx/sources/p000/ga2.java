package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ga2 implements sa0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3378h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ka2 f3379i;

    public /* synthetic */ ga2(ka2 ka2Var, int i) {
        this.f3378h = i;
        this.f3379i = ka2Var;
    }

    @Override // p000.sa0
    /* JADX INFO: renamed from: e */
    public final double mo687e(double d) {
        int i = this.f3378h;
        ka2 ka2Var = this.f3379i;
        switch (i) {
            case 0:
                return ci0.m777B(ka2Var.f5426k.mo687e(d), ka2Var.f5420e, ka2Var.f5421f);
            default:
                return ka2Var.f5429n.mo687e(ci0.m777B(d, ka2Var.f5420e, ka2Var.f5421f));
        }
    }
}
