package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class p81 extends tw2 implements mn0 {
    public int l;
    public final /* synthetic */ q81 m;
    public final /* synthetic */ int n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p81(q81 q81Var, int i, t00 t00Var) {
        super(2, t00Var);
        this.m = q81Var;
        this.n = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        return ((p81) p((t00) obj2, (j20) obj)).r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        return new p81(this.m, this.n, t00Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) throws Throwable {
        int i = this.l;
        a83 a83Var = a83.a;
        if (i != 0) {
            if (i == 1) {
                fg1.T(obj);
                return a83Var;
            }
            s.l("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fg1.T(obj);
        l81 l81Var = this.m.w;
        this.l = 1;
        d91 d91Var = l81Var.b;
        dq1 dq1Var = d91.x;
        d91Var.getClass();
        Object objD = d91Var.d(bl1.h, new h50(d91Var, this.n, (t00) null), this);
        k20 k20Var = k20.h;
        if (objD != k20Var) {
            objD = a83Var;
        }
        if (objD != k20Var) {
            objD = a83Var;
        }
        return objD == k20Var ? k20Var : a83Var;
    }
}
