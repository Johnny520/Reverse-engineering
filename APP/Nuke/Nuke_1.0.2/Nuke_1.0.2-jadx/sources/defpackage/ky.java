package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ky extends w51 implements mn0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ mn0 j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky(bg3 bg3Var, lx lxVar, mn0 mn0Var) {
        super(2);
        this.i = 2;
        this.k = bg3Var;
        this.l = lxVar;
        this.j = mn0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        a83 a83Var = a83.a;
        mn0 mn0Var = this.j;
        Object obj3 = this.l;
        Object obj4 = this.k;
        int i2 = 1;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                ly.a((zv1) obj4, (z8) obj3, mn0Var, (px) obj, pp0.N(1));
                break;
            case 1:
                ((Number) obj2).intValue();
                rp0.P((hw2) obj4, (uh1) obj3, mn0Var, (px) obj, pp0.N(9));
                break;
            default:
                px pxVar = (px) obj;
                int iIntValue = ((Number) obj2).intValue();
                bg3 bg3Var = (bg3) obj4;
                int i3 = 0;
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.R();
                } else {
                    b7 b7Var = bg3Var.h;
                    boolean zH = go0Var.h(bg3Var);
                    Object objL = go0Var.L();
                    t00 t00Var = null;
                    eb ebVar = nx.a;
                    if (zH || objL == ebVar) {
                        objL = new ag3(bg3Var, t00Var, i3);
                        go0Var.f0(objL);
                    }
                    eu.f(go0Var, (mn0) objL, b7Var);
                    boolean zH2 = go0Var.h(bg3Var);
                    Object objL2 = go0Var.L();
                    if (zH2 || objL2 == ebVar) {
                        objL2 = new ag3(bg3Var, t00Var, i2);
                        go0Var.f0(objL2);
                    }
                    eu.f(go0Var, (mn0) objL2, b7Var);
                    ((lx) obj3).a(b7Var, mn0Var, go0Var, 0);
                }
                break;
        }
        return a83Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ky(Object obj, Object obj2, mn0 mn0Var, int i, int i2) {
        super(2);
        this.i = i2;
        this.k = obj;
        this.l = obj2;
        this.j = mn0Var;
    }
}
