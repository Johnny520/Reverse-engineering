package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xh extends tw2 implements mn0 {
    public final /* synthetic */ int l;
    public xk1 m;
    public int n;
    public final /* synthetic */ xk1 o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xh(xk1 xk1Var, t00 t00Var, int i) {
        super(2, t00Var);
        this.l = i;
        this.o = xk1Var;
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
        return ((xh) p(t00Var, j20Var)).r(a83Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        switch (this.l) {
            case 0:
                return new xh(this.o, t00Var, 0);
            default:
                return new xh(this.o, t00Var, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) throws Throwable {
        int i = this.l;
        a83 a83Var = a83.a;
        k20 k20Var = k20.h;
        xk1 xk1Var = this.o;
        int i2 = 2;
        t00 t00Var = null;
        switch (i) {
            case 0:
                int i3 = this.n;
                if (i3 == 0) {
                    fg1.T(obj);
                    xk1Var.setValue(v62.a);
                    c60 c60Var = o90.a;
                    t50 t50Var = t50.j;
                    sb sbVar = new sb(i2, t00Var, i2);
                    this.m = xk1Var;
                    this.n = 1;
                    obj = p7.R(t50Var, sbVar, this);
                    if (obj == k20Var) {
                    }
                } else if (i3 != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    xk1Var = this.m;
                    fg1.T(obj);
                }
                xk1Var.setValue((w62) obj);
                break;
            default:
                int i4 = this.n;
                if (i4 == 0) {
                    fg1.T(obj);
                    xk1Var.setValue(j33.a);
                    c60 c60Var2 = o90.a;
                    t50 t50Var2 = t50.j;
                    sb sbVar2 = new sb(i2, t00Var, 3);
                    this.m = xk1Var;
                    this.n = 1;
                    obj = p7.R(t50Var2, sbVar2, this);
                    if (obj == k20Var) {
                    }
                } else if (i4 != 1) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    xk1Var = this.m;
                    fg1.T(obj);
                }
                xk1Var.setValue((k33) obj);
                break;
        }
        return a83Var;
    }
}
