package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w60 implements xm0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ x60 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ w60(x60 x60Var, int i) {
        this.h = i;
        this.i = x60Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        int i = this.h;
        x60 x60Var = this.i;
        switch (i) {
            case 0:
                pa2 pa2Var = (pa2) p40.p(x60Var, sa2.a);
                ua uaVar = x60Var.B;
                if (pa2Var == null) {
                    if (uaVar != null) {
                        x60Var.N0(uaVar);
                    }
                    x60Var.B = null;
                } else if (uaVar == null) {
                    n4 n4Var = new n4(10, x60Var);
                    w60 w60Var = new w60(x60Var, 1);
                    bk1 bk1Var = x60Var.x;
                    boolean z = x60Var.y;
                    float f = x60Var.z;
                    m43 m43Var = ta2.a;
                    ua uaVar2 = new ua(bk1Var, z, f, n4Var, w60Var);
                    x60Var.M0(uaVar2);
                    x60Var.B = uaVar2;
                }
                return a83.a;
            default:
                return tp0.l;
        }
    }
}
