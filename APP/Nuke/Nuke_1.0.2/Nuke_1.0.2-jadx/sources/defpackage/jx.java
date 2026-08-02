package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jx extends w51 implements mn0 {
    public final /* synthetic */ int i = 0;
    public final /* synthetic */ lx j;
    public final /* synthetic */ b7 k;
    public final /* synthetic */ mn0 l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx(b7 b7Var, lx lxVar, mn0 mn0Var) {
        super(2);
        this.k = b7Var;
        this.j = lxVar;
        this.l = mn0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        a83 a83Var = a83.a;
        mn0 mn0Var = this.l;
        b7 b7Var = this.k;
        lx lxVar = this.j;
        switch (i) {
            case 0:
                px pxVar = (px) obj;
                int iIntValue = ((Number) obj2).intValue();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.R();
                } else {
                    go0Var.W(866651995);
                    ly.a(b7Var, lxVar.k, mn0Var, go0Var, 0);
                    go0Var.p(false);
                }
                break;
            default:
                ((Number) obj2).intValue();
                lxVar.a(b7Var, mn0Var, (px) obj, pp0.N(1));
                break;
        }
        return a83Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx(lx lxVar, b7 b7Var, mn0 mn0Var, int i) {
        super(2);
        this.j = lxVar;
        this.k = b7Var;
        this.l = mn0Var;
    }
}
