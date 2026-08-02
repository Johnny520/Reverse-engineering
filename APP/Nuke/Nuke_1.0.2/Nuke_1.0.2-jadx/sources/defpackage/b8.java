package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b8 implements mn0 {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ b8(t81 t81Var, int i) {
        this.j = t81Var;
        this.i = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.h;
        a83 a83Var = a83.a;
        int i2 = this.i;
        Object obj3 = this.j;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                e8.b((uh1) obj3, (px) obj, pp0.N(1), i2);
                break;
            default:
                t81 t81Var = (t81) obj3;
                px pxVar = (px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.R();
                } else {
                    l11 l11VarE = t81Var.b.a.e(i2);
                    ((kw) l11VarE.c.k).o(t81Var.c, Integer.valueOf(i2 - l11VarE.a), go0Var, 0);
                }
                break;
        }
        return a83Var;
    }

    public /* synthetic */ b8(uh1 uh1Var, int i, int i2) {
        this.j = uh1Var;
        this.i = i2;
    }
}
