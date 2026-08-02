package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class es implements mn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ String i;
    public final /* synthetic */ xm0 j;
    public final /* synthetic */ in0 k;
    public final /* synthetic */ int l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ es(String str, xm0 xm0Var, in0 in0Var, int i, int i2) {
        this.h = i2;
        this.i = str;
        this.j = xm0Var;
        this.k = in0Var;
        this.l = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        a83 a83Var = a83.a;
        int i2 = this.l;
        in0 in0Var = this.k;
        xm0 xm0Var = this.j;
        String str = this.i;
        px pxVar = (px) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.intValue();
                rg3.c(str, xm0Var, in0Var, pxVar, pp0.N(i2 | 1));
                break;
            default:
                num.getClass();
                ci0.c(str, xm0Var, in0Var, pxVar, pp0.N(i2 | 1));
                break;
        }
        return a83Var;
    }
}
