package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class et0 implements mn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ uh1 j;
    public final /* synthetic */ long k;
    public final /* synthetic */ int l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ et0(sx0 sx0Var, uh1 uh1Var, long j, int i, int i2) {
        this.h = 0;
        this.i = sx0Var;
        this.j = uh1Var;
        this.k = j;
        this.l = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        int i2 = this.l;
        a83 a83Var = a83.a;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iN = pp0.N(1);
                ci0.l((sx0) obj3, this.j, this.k, (px) obj, iN, this.l);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iN2 = pp0.N(i2 | 1);
                fx0.a((sx0) obj3, this.j, this.k, (px) obj, iN2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iN3 = pp0.N(i2 | 1);
                fx0.b((lw1) obj3, this.j, this.k, (px) obj, iN3);
                break;
        }
        return a83Var;
    }

    public /* synthetic */ et0(Object obj, uh1 uh1Var, long j, int i, int i2) {
        this.h = i2;
        this.i = obj;
        this.j = uh1Var;
        this.k = j;
        this.l = i;
    }
}
