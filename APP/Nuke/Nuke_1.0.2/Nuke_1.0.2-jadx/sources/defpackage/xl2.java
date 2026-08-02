package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xl2 extends tw2 implements mn0 {
    public final /* synthetic */ int l = 0;
    public final /* synthetic */ long m;
    public /* synthetic */ Object n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl2(xk1 xk1Var, long j, t00 t00Var) {
        super(2, t00Var);
        this.n = xk1Var;
        this.m = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.l;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                ((xl2) p((t00) obj2, (gm2) obj)).r(a83Var);
                break;
            default:
                ((xl2) p((t00) obj2, (j20) obj)).r(a83Var);
                break;
        }
        return a83Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        switch (this.l) {
            case 0:
                xl2 xl2Var = new xl2(this.m, t00Var);
                xl2Var.n = obj;
                return xl2Var;
            default:
                return new xl2((xk1) this.n, this.m, t00Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        int i = this.l;
        a83 a83Var = a83.a;
        long j = this.m;
        switch (i) {
            case 0:
                fg1.T(obj);
                im2 im2Var = ((gm2) this.n).a;
                im2Var.c(im2Var.k, j, 1);
                break;
            default:
                xk1 xk1Var = (xk1) this.n;
                fg1.T(obj);
                if (((z22) xk1Var.getValue()) != null) {
                    xk1Var.setValue(null);
                }
                xk1Var.setValue(new z22(j));
                break;
        }
        return a83Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl2(long j, t00 t00Var) {
        super(2, t00Var);
        this.m = j;
    }
}
