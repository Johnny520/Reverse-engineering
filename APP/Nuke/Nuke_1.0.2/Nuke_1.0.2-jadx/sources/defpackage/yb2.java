package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yb2 implements zj0 {
    public final mn0 h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yb2(mn0 mn0Var) {
        this.h = mn0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.zj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ak0 ak0Var, t00 t00Var) throws Throwable {
        r2 r2Var;
        ub2 ub2Var;
        if (t00Var instanceof r2) {
            r2Var = (r2) t00Var;
            int i = r2Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                r2Var.n = i - Integer.MIN_VALUE;
            } else {
                r2Var = new r2(this, t00Var);
            }
        }
        Object obj = r2Var.l;
        int i2 = r2Var.n;
        a83 a83Var = a83.a;
        if (i2 != 0) {
            if (i2 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ub2Var = r2Var.k;
            try {
                fg1.T(obj);
                ub2Var.s();
                return a83Var;
            } catch (Throwable th) {
                th = th;
                ub2Var.s();
                throw th;
            }
        }
        fg1.T(obj);
        a20 a20Var = r2Var.i;
        a20Var.getClass();
        ub2 ub2Var2 = new ub2(ak0Var, a20Var);
        try {
            r2Var.k = ub2Var2;
            r2Var.n = 1;
            try {
                Object objG = this.h.g(ub2Var2, r2Var);
                k20 k20Var = k20.h;
                if (objG != k20Var) {
                    objG = a83Var;
                }
                if (objG == k20Var) {
                    return k20Var;
                }
                ub2Var = ub2Var2;
                ub2Var.s();
                return a83Var;
            } catch (Throwable th2) {
                th = th2;
                ub2Var = ub2Var2;
                ub2Var.s();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
