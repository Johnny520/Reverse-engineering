package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ir1 extends tw2 implements mn0 {
    public final /* synthetic */ int l;
    public final /* synthetic */ xk1 m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ir1(xk1 xk1Var, t00 t00Var, int i) {
        super(2, t00Var);
        this.l = i;
        this.m = xk1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.l;
        a83 a83Var = a83.a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
            case 0:
                ((ir1) p(t00Var, j20Var)).r(a83Var);
                break;
            case 1:
                ((ir1) p(t00Var, j20Var)).r(a83Var);
                break;
            default:
                ((ir1) p(t00Var, j20Var)).r(a83Var);
                break;
        }
        return a83Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        switch (this.l) {
            case 0:
                return new ir1(this.m, t00Var, 0);
            case 1:
                return new ir1(this.m, t00Var, 1);
            default:
                return new ir1(this.m, t00Var, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        int i = this.l;
        a83 a83Var = a83.a;
        xk1 xk1Var = this.m;
        switch (i) {
            case 0:
                fg1.T(obj);
                xk1Var.setValue(Boolean.TRUE);
                break;
            case 1:
                fg1.T(obj);
                xk1Var.setValue(Boolean.TRUE);
                break;
            default:
                fg1.T(obj);
                xk1Var.setValue(Boolean.TRUE);
                break;
        }
        return a83Var;
    }
}
