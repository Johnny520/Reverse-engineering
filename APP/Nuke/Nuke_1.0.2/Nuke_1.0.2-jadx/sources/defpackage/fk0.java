package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fk0 implements zj0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ hq i;
    public final /* synthetic */ tw2 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ fk0(hq hqVar, tw2 tw2Var, int i) {
        this.h = i;
        this.i = hqVar;
        this.j = tw2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.zj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ak0 ak0Var, t00 t00Var) throws Throwable {
        ek0 ek0Var;
        int i;
        i23 i23Var;
        ub2 ub2Var;
        ub2 ub2Var2;
        int i2 = this.h;
        a83 a83Var = a83.a;
        k20 k20Var = k20.h;
        tw2 tw2Var = this.j;
        hq hqVar = this.i;
        switch (i2) {
            case 0:
                xw xwVar = (xw) tw2Var;
                if (t00Var instanceof ek0) {
                    ek0Var = (ek0) t00Var;
                    int i3 = ek0Var.l;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ek0Var.l = i3 - Integer.MIN_VALUE;
                    } else {
                        ek0Var = new ek0(this, t00Var);
                    }
                }
                Object obj = ek0Var.k;
                int i4 = ek0Var.l;
                if (i4 == 0) {
                    fg1.T(obj);
                    i = 0;
                    try {
                        ek0Var.n = ak0Var;
                        ek0Var.p = 0;
                        ek0Var.l = 1;
                        if (((gq) hqVar).a(ak0Var, ek0Var) != k20Var) {
                            a20 a20Var = ek0Var.i;
                            a20Var.getClass();
                            ub2Var = new ub2(ak0Var, a20Var);
                            ek0Var.n = null;
                            ek0Var.o = ub2Var;
                            ek0Var.p = i;
                            ek0Var.l = 3;
                            xwVar.e(ub2Var, null, ek0Var);
                            if (a83Var != k20Var) {
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        i23Var = new i23(th);
                        ek0Var.n = null;
                        ek0Var.o = th;
                        ek0Var.p = i;
                        ek0Var.l = 2;
                        if (op0.e(i23Var, xwVar, th, ek0Var) != k20Var) {
                        }
                    }
                    return k20Var;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        Throwable th2 = (Throwable) ek0Var.o;
                        fg1.T(obj);
                        throw th2;
                    }
                    if (i4 != 3) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ub2Var2 = (ub2) ek0Var.o;
                    try {
                        fg1.T(obj);
                        ub2Var2.s();
                        return a83Var;
                    } catch (Throwable th3) {
                        th = th3;
                        ub2Var2.s();
                        throw th;
                    }
                }
                int i5 = ek0Var.p;
                ak0 ak0Var2 = ek0Var.n;
                try {
                    fg1.T(obj);
                    i = i5;
                    ak0Var = ak0Var2;
                    a20 a20Var2 = ek0Var.i;
                    a20Var2.getClass();
                    ub2Var = new ub2(ak0Var, a20Var2);
                } catch (Throwable th4) {
                    th = th4;
                    i = i5;
                    i23Var = new i23(th);
                    ek0Var.n = null;
                    ek0Var.o = th;
                    ek0Var.p = i;
                    ek0Var.l = 2;
                    if (op0.e(i23Var, xwVar, th, ek0Var) != k20Var) {
                        throw th;
                    }
                }
                try {
                    ek0Var.n = null;
                    ek0Var.o = ub2Var;
                    ek0Var.p = i;
                    ek0Var.l = 3;
                    xwVar.e(ub2Var, null, ek0Var);
                    if (a83Var != k20Var) {
                        ub2Var2 = ub2Var;
                        ub2Var2.s();
                        return a83Var;
                    }
                    return k20Var;
                } catch (Throwable th5) {
                    th = th5;
                    ub2Var2 = ub2Var;
                    ub2Var2.s();
                    throw th;
                }
            default:
                Object objA = ((mq) hqVar).a(new zc(new y62(), ak0Var, (g62) tw2Var, 1), t00Var);
                return objA == k20Var ? objA : a83Var;
        }
    }
}
