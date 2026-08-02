package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qc3 extends tw2 implements mn0 {
    public xk1 l;
    public int m;
    public final /* synthetic */ xk1 n;
    public final /* synthetic */ boolean o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc3(xk1 xk1Var, boolean z, t00 t00Var) {
        super(2, t00Var);
        this.n = xk1Var;
        this.o = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        return ((qc3) p((t00) obj2, (j20) obj)).r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        return new qc3(this.n, this.o, t00Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) throws Throwable {
        xk1 xk1Var;
        int i = this.m;
        if (i == 0) {
            fg1.T(obj);
            mc3 mc3Var = mc3.a;
            xk1 xk1Var2 = this.n;
            xk1Var2.setValue(mc3Var);
            c60 c60Var = o90.a;
            t50 t50Var = t50.j;
            pc3 pc3Var = new pc3(this.o, null);
            this.l = xk1Var2;
            this.m = 1;
            obj = p7.R(t50Var, pc3Var, this);
            k20 k20Var = k20.h;
            if (obj == k20Var) {
                return k20Var;
            }
            xk1Var = xk1Var2;
        } else {
            if (i != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xk1Var = this.l;
            fg1.T(obj);
        }
        xk1Var.setValue((nc3) obj);
        return a83.a;
    }
}
