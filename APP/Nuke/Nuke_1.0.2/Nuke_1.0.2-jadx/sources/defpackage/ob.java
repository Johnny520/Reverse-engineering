package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ob implements mn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ uh1 i;
    public final /* synthetic */ kw j;
    public final /* synthetic */ int k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ob(uh1 uh1Var, kw kwVar, int i, int i2) {
        this.h = i2;
        this.i = uh1Var;
        this.j = kwVar;
        this.k = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        a83 a83Var = a83.a;
        int i2 = this.k;
        kw kwVar = this.j;
        uh1 uh1Var = this.i;
        px pxVar = (px) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                eu.o(uh1Var, kwVar, pxVar, pp0.N(i2 | 1));
                break;
            case 1:
                eu.p(uh1Var, kwVar, pxVar, pp0.N(i2 | 1));
                break;
            case 2:
                k60.d(uh1Var, kwVar, pxVar, pp0.N(i2 | 1));
                break;
            case 3:
                rp0.K(uh1Var, kwVar, pxVar, pp0.N(i2 | 1));
                break;
            default:
                rp0.J(uh1Var, kwVar, pxVar, pp0.N(i2 | 1));
                break;
        }
        return a83Var;
    }
}
