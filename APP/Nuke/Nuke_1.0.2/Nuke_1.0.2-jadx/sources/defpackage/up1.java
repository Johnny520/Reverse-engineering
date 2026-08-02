package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class up1 extends tw2 implements mn0 {
    public final /* synthetic */ int l = 1;
    public final /* synthetic */ xk1 m;
    public final /* synthetic */ boolean n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up1(xk1 xk1Var, boolean z, t00 t00Var) {
        super(2, t00Var);
        this.m = xk1Var;
        this.n = z;
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
                ((up1) p(t00Var, j20Var)).r(a83Var);
                break;
            default:
                ((up1) p(t00Var, j20Var)).r(a83Var);
                break;
        }
        return a83Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        switch (this.l) {
            case 0:
                return new up1(this.n, this.m, t00Var);
            default:
                return new up1(this.m, this.n, t00Var);
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
                xk1Var.setValue(Boolean.valueOf(this.n));
                break;
            default:
                fg1.T(obj);
                if (((z22) xk1Var.getValue()) != null) {
                    xk1Var.setValue(null);
                }
                break;
        }
        return a83Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up1(boolean z, xk1 xk1Var, t00 t00Var) {
        super(2, t00Var);
        this.n = z;
        this.m = xk1Var;
    }
}
