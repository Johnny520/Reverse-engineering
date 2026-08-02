package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f81 implements mn0 {
    public final /* synthetic */ int h = 0;
    public final /* synthetic */ kw i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ f81(uh1 uh1Var, String str, kw kwVar, int i, int i2) {
        this.l = uh1Var;
        this.m = str;
        this.i = kwVar;
        this.j = i;
        this.k = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        a83 a83Var = a83.a;
        Object obj3 = this.m;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iN = pp0.N(this.k | 1);
                p40.a(this.l, this.j, (g81) obj3, this.i, (px) obj, iN);
                break;
            default:
                ((Integer) obj2).getClass();
                int iN2 = pp0.N(this.j | 1);
                eu.n((uh1) this.l, (String) obj3, this.i, (px) obj, iN2, this.k);
                break;
        }
        return a83Var;
    }

    public /* synthetic */ f81(Object obj, int i, g81 g81Var, kw kwVar, int i2) {
        this.l = obj;
        this.j = i;
        this.m = g81Var;
        this.i = kwVar;
        this.k = i2;
    }
}
