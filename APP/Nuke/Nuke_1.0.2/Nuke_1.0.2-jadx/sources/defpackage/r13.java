package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r13 implements mn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ x13 i;
    public final /* synthetic */ in0 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ r13(x13 x13Var, in0 in0Var, int i, int i2) {
        this.h = i2;
        this.i = x13Var;
        this.j = in0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        a83 a83Var = a83.a;
        in0 in0Var = this.j;
        x13 x13Var = this.i;
        px pxVar = (px) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                gf1.j(x13Var, in0Var, pxVar, pp0.N(1));
                break;
            case 1:
                gf1.k(x13Var, in0Var, pxVar, pp0.N(1));
                break;
            default:
                gf1.f(x13Var, in0Var, pxVar, pp0.N(1));
                break;
        }
        return a83Var;
    }
}
