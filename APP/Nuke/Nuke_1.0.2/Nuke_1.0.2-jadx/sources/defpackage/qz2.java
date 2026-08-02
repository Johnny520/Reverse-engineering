package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qz2 extends tw2 implements nn0 {
    public int l;
    public /* synthetic */ x22 m;
    public /* synthetic */ long n;
    public final /* synthetic */ j20 o;
    public final /* synthetic */ xk1 p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz2(j20 j20Var, xk1 xk1Var, t00 t00Var) {
        super(3, t00Var);
        this.o = j20Var;
        this.p = xk1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn0
    public final Object e(Object obj, Object obj2, Object obj3) {
        long j = ((rs1) obj2).a;
        qz2 qz2Var = new qz2(this.o, this.p, (t00) obj3);
        qz2Var.m = (x22) obj;
        qz2Var.n = j;
        return qz2Var.r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        int i = this.l;
        xk1 xk1Var = this.p;
        j20 j20Var = this.o;
        if (i == 0) {
            fg1.T(obj);
            x22 x22Var = this.m;
            p7.A(j20Var, null, new xl2(xk1Var, this.n, null), 3);
            this.l = 1;
            obj = x22Var.f(this);
            k20 k20Var = k20.h;
            if (obj == k20Var) {
                return k20Var;
            }
        } else {
            if (i != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(obj);
        }
        p7.A(j20Var, null, new up1(xk1Var, ((Boolean) obj).booleanValue(), (t00) null), 3);
        return a83.a;
    }
}
