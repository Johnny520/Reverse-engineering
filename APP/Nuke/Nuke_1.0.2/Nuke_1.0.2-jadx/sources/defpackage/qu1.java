package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qu1 extends iv1 {
    public static final qu1 d;
    public static final qu1 e;
    public static final qu1 f;
    public static final qu1 g;
    public final /* synthetic */ int c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 1;
        d = new qu1(i, 2, 0);
        int i2 = 1;
        e = new qu1(i2, i2, 1);
        f = new qu1(i, 2, 2);
        int i3 = 1;
        g = new qu1(i3, i3, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qu1(int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.iv1
    public final void a(bo0 bo0Var, rf rfVar, tr2 tr2Var, z72 z72Var, jv1 jv1Var) {
        switch (this.c) {
            case 0:
                Object objA = ((xm0) bo0Var.d(0)).a();
                ao0 ao0Var = (ao0) bo0Var.d(1);
                int iC = bo0Var.c(0);
                ao0Var.getClass();
                tr2Var.U(tr2Var.c(ao0Var), objA);
                rfVar.g(iC, objA);
                rfVar.b(objA);
                break;
            case 1:
                ao0 ao0Var2 = (ao0) bo0Var.d(0);
                int iC2 = bo0Var.c(0);
                rfVar.o();
                ao0Var2.getClass();
                rfVar.a(iC2, tr2Var.D(tr2Var.c(ao0Var2)));
                break;
            case 2:
                Object objD = bo0Var.d(0);
                ao0 ao0Var3 = (ao0) bo0Var.d(1);
                int iC3 = bo0Var.c(0);
                if (objD instanceof lo0) {
                    lo0 lo0Var = (lo0) objD;
                    z72Var.e.b(lo0Var);
                    z72Var.d.a(lo0Var);
                }
                Object objK = tr2Var.K(tr2Var.c(ao0Var3), iC3, objD);
                if (objK instanceof lo0) {
                    z72Var.e((lo0) objK);
                } else if (objK instanceof b62) {
                    ((b62) objK).c();
                }
                break;
            default:
                Object objD2 = bo0Var.d(0);
                int iC4 = bo0Var.c(0);
                if (objD2 instanceof lo0) {
                    lo0 lo0Var2 = (lo0) objD2;
                    z72Var.e.b(lo0Var2);
                    z72Var.d.a(lo0Var2);
                }
                Object objK2 = tr2Var.K(tr2Var.t, iC4, objD2);
                if (objK2 instanceof lo0) {
                    z72Var.e((lo0) objK2);
                } else if (objK2 instanceof b62) {
                    ((b62) objK2).c();
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.iv1
    public ao0 b(bo0 bo0Var) {
        switch (this.c) {
            case 0:
                return (ao0) bo0Var.d(1);
            case 1:
                return (ao0) bo0Var.d(0);
            default:
                return super.b(bo0Var);
        }
    }
}
