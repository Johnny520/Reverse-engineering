package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lg1 implements fa1 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f6110h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f6111i;

    public /* synthetic */ lg1(int i, Object obj) {
        this.f6110h = i;
        this.f6111i = obj;
    }

    @Override // p000.fa1
    /* JADX INFO: renamed from: g */
    public final void mo533g(ia1 ia1Var, z91 z91Var) {
        int i = this.f6110h;
        Object obj = this.f6111i;
        switch (i) {
            case 0:
                ng1 ng1Var = (ng1) obj;
                ng1Var.getClass();
                if (z91Var == z91.ON_DESTROY) {
                    ng1Var.m3307a();
                }
                break;
            case 1:
                sc2 sc2Var = (sc2) obj;
                if (z91Var == z91.ON_START) {
                    sc2Var.f10045h = true;
                } else if (z91Var == z91.ON_STOP) {
                    sc2Var.f10045h = false;
                }
                break;
            default:
                AbstractC0526o2 abstractC0526o2 = (AbstractC0526o2) obj;
                if (z91Var == z91.ON_DESTROY) {
                    abstractC0526o2.m3468f();
                }
                break;
        }
    }
}
