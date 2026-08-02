package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yb2 implements zj0 {

    /* JADX INFO: renamed from: h */
    public final mn0 f13394h;

    public yb2(mn0 mn0Var) {
        this.f13394h = mn0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.zj0
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1660a(ak0 ak0Var, t00 t00Var) throws Throwable {
        C0641r2 c0641r2;
        ub2 ub2Var;
        if (t00Var instanceof C0641r2) {
            c0641r2 = (C0641r2) t00Var;
            int i = c0641r2.f9328n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0641r2.f9328n = i - Integer.MIN_VALUE;
            } else {
                c0641r2 = new C0641r2(this, t00Var);
            }
        }
        Object obj = c0641r2.f9326l;
        int i2 = c0641r2.f9328n;
        a83 a83Var = a83.f116a;
        if (i2 != 0) {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ub2Var = c0641r2.f9325k;
            try {
                fg1.m1627T(obj);
                ub2Var.mo4496s();
                return a83Var;
            } catch (Throwable th) {
                th = th;
                ub2Var.mo4496s();
                throw th;
            }
        }
        fg1.m1627T(obj);
        a20 a20Var = c0641r2.f11029i;
        a20Var.getClass();
        ub2 ub2Var2 = new ub2(ak0Var, a20Var);
        try {
            c0641r2.f9325k = ub2Var2;
            c0641r2.f9328n = 1;
            try {
                Object objMo12g = this.f13394h.mo12g(ub2Var2, c0641r2);
                k20 k20Var = k20.f5323h;
                if (objMo12g != k20Var) {
                    objMo12g = a83Var;
                }
                if (objMo12g == k20Var) {
                    return k20Var;
                }
                ub2Var = ub2Var2;
                ub2Var.mo4496s();
                return a83Var;
            } catch (Throwable th2) {
                th = th2;
                ub2Var = ub2Var2;
                ub2Var.mo4496s();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
