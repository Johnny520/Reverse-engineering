package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ms2 extends tw2 implements mn0 {
    public final /* synthetic */ int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ mn0 o;
    public final /* synthetic */ xk1 p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ms2(mn0 mn0Var, xk1 xk1Var, t00 t00Var, int i) {
        super(2, t00Var);
        this.l = i;
        this.o = mn0Var;
        this.p = xk1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.l;
        a83 a83Var = a83.a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((ms2) p(t00Var, j20Var)).r(a83Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        switch (this.l) {
            case 0:
                ms2 ms2Var = new ms2(this.o, this.p, t00Var, 0);
                ms2Var.n = obj;
                return ms2Var;
            default:
                ms2 ms2Var2 = new ms2(this.o, this.p, t00Var, 1);
                ms2Var2.n = obj;
                return ms2Var2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        int i = this.l;
        a83 a83Var = a83.a;
        xk1 xk1Var = this.p;
        mn0 mn0Var = this.o;
        k20 k20Var = k20.h;
        switch (i) {
            case 0:
                int i2 = this.m;
                if (i2 == 0) {
                    fg1.T(obj);
                    n32 n32Var = new n32(xk1Var, ((j20) this.n).g());
                    this.m = 1;
                    if (mn0Var.g(n32Var, this) == k20Var) {
                    }
                } else if (i2 != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.T(obj);
                }
                break;
            default:
                int i3 = this.m;
                if (i3 == 0) {
                    fg1.T(obj);
                    n32 n32Var2 = new n32(xk1Var, ((j20) this.n).g());
                    this.m = 1;
                    if (mn0Var.g(n32Var2, this) == k20Var) {
                    }
                } else if (i3 != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.T(obj);
                }
                break;
        }
        return k20Var;
    }
}
