package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mq extends hq {
    public final zj0 k;
    public final nn0 l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public mq(nn0 nn0Var, zj0 zj0Var, a20 a20Var, int i, hn hnVar) {
        super(a20Var, i, hnVar);
        this.k = zj0Var;
        this.l = nn0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    @Override // defpackage.hq, defpackage.zj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ak0 ak0Var, t00 t00Var) throws Throwable {
        int i = this.i;
        k20 k20Var = k20.h;
        if (i == -3) {
            a20 a20VarF = t00Var.f();
            Boolean bool = Boolean.FALSE;
            ye yeVar = new ye(27);
            a20 a20Var = this.h;
            a20 a20VarK = !((Boolean) a20Var.r(yeVar, bool)).booleanValue() ? a20VarF.k(a20Var) : rg3.w(a20VarF, a20Var, false);
            if (t11.l(a20VarK, a20VarF)) {
                Object objG = g(ak0Var, t00Var);
                if (objG == k20Var) {
                    return objG;
                }
            } else {
                gd3 gd3Var = gd3.p;
                if (t11.l(a20VarK.o(gd3Var), a20VarF.o(gd3Var))) {
                    a20 a20VarF2 = t00Var.f();
                    if (!(ak0Var instanceof to2) && !(ak0Var instanceof jo1)) {
                        ak0Var = new zc(ak0Var, a20VarF2);
                    }
                    Object objC0 = gf1.c0(a20VarK, ak0Var, fg1.R(a20VarK), new a2(this, null, 9), t00Var);
                    if (objC0 == k20Var) {
                        return objC0;
                    }
                } else {
                    Object objA = super.a(ak0Var, t00Var);
                    if (objA == k20Var) {
                        return objA;
                    }
                }
            }
        }
        return a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.hq
    public final Object c(o32 o32Var, t00 t00Var) {
        Object objG = g(new to2(o32Var), t00Var);
        return objG == k20.h ? objG : a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.hq
    public final hq d(a20 a20Var, int i, hn hnVar) {
        return new mq(this.l, this.k, a20Var, i, hnVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object g(ak0 ak0Var, t00 t00Var) {
        Object objU = te.u(new jq(this, ak0Var, null), t00Var);
        return objU == k20.h ? objU : a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.hq
    public final String toString() {
        return this.k + " -> " + super.toString();
    }
}
