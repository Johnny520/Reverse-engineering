package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hw implements mn0 {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ Object i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ hw(kw kwVar, fk fkVar, Object obj, Object obj2, int i) {
        this.k = kwVar;
        this.l = fkVar;
        this.i = obj;
        this.m = obj2;
        this.j = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        int i2 = this.j;
        Object obj3 = this.m;
        a83 a83Var = a83.a;
        Object obj4 = this.l;
        Object obj5 = this.k;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iN = pp0.N(i2) | 1;
                ((kw) obj5).f((fk) obj4, this.i, this.m, (px) obj, iN);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iN2 = pp0.N(i2 | 1);
                eu.h((Boolean) obj5, this.i, (ia1) obj4, (in0) obj3, (px) obj, iN2);
                break;
            default:
                ((Integer) obj2).getClass();
                tp0.c((String) obj5, (uh1) obj4, (nn0) this.i, (in0) obj3, (px) obj, pp0.N(1), this.j);
                break;
        }
        return a83Var;
    }

    public /* synthetic */ hw(Boolean bool, Object obj, ia1 ia1Var, in0 in0Var, int i) {
        this.k = bool;
        this.i = obj;
        this.l = ia1Var;
        this.m = in0Var;
        this.j = i;
    }

    public /* synthetic */ hw(String str, uh1 uh1Var, nn0 nn0Var, in0 in0Var, int i, int i2) {
        this.k = str;
        this.l = uh1Var;
        this.i = nn0Var;
        this.m = in0Var;
        this.j = i2;
    }
}
