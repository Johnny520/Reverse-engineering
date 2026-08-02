package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lg1 implements fa1 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ lg1(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fa1
    public final void g(ia1 ia1Var, z91 z91Var) {
        int i = this.h;
        Object obj = this.i;
        switch (i) {
            case 0:
                ng1 ng1Var = (ng1) obj;
                ng1Var.getClass();
                if (z91Var == z91.ON_DESTROY) {
                    ng1Var.a();
                }
                break;
            case 1:
                sc2 sc2Var = (sc2) obj;
                if (z91Var == z91.ON_START) {
                    sc2Var.h = true;
                } else if (z91Var == z91.ON_STOP) {
                    sc2Var.h = false;
                }
                break;
            default:
                o2 o2Var = (o2) obj;
                if (z91Var == z91.ON_DESTROY) {
                    o2Var.f();
                }
                break;
        }
    }
}
