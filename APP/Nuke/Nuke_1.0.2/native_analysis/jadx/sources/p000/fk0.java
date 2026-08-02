package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fk0 implements zj0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3024h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AbstractC0286hq f3025i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ tw2 f3026j;

    public /* synthetic */ fk0(AbstractC0286hq abstractC0286hq, tw2 tw2Var, int i) {
        this.f3024h = i;
        this.f3025i = abstractC0286hq;
        this.f3026j = tw2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // p000.zj0
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1660a(ak0 ak0Var, t00 t00Var) throws Throwable {
        ek0 ek0Var;
        int i;
        i23 i23Var;
        ub2 ub2Var;
        ub2 ub2Var2;
        int i2 = this.f3024h;
        a83 a83Var = a83.f116a;
        k20 k20Var = k20.f5323h;
        tw2 tw2Var = this.f3026j;
        AbstractC0286hq abstractC0286hq = this.f3025i;
        switch (i2) {
            case 0:
                C0901xw c0901xw = (C0901xw) tw2Var;
                if (t00Var instanceof ek0) {
                    ek0Var = (ek0) t00Var;
                    int i3 = ek0Var.f2465l;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ek0Var.f2465l = i3 - Integer.MIN_VALUE;
                    } else {
                        ek0Var = new ek0(this, t00Var);
                    }
                }
                Object obj = ek0Var.f2464k;
                int i4 = ek0Var.f2465l;
                if (i4 == 0) {
                    fg1.m1627T(obj);
                    i = 0;
                    try {
                        ek0Var.f2467n = ak0Var;
                        ek0Var.f2469p = 0;
                        ek0Var.f2465l = 1;
                        if (((C0249gq) abstractC0286hq).mo1660a(ak0Var, ek0Var) != k20Var) {
                            a20 a20Var = ek0Var.f11029i;
                            a20Var.getClass();
                            ub2Var = new ub2(ak0Var, a20Var);
                            ek0Var.f2467n = null;
                            ek0Var.f2468o = ub2Var;
                            ek0Var.f2469p = i;
                            ek0Var.f2465l = 3;
                            c0901xw.mo489e(ub2Var, null, ek0Var);
                            if (a83Var != k20Var) {
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        i23Var = new i23(th);
                        ek0Var.f2467n = null;
                        ek0Var.f2468o = th;
                        ek0Var.f2469p = i;
                        ek0Var.f2465l = 2;
                        if (op0.m3583e(i23Var, c0901xw, th, ek0Var) != k20Var) {
                        }
                    }
                    return k20Var;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        Throwable th2 = (Throwable) ek0Var.f2468o;
                        fg1.m1627T(obj);
                        throw th2;
                    }
                    if (i4 != 3) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ub2Var2 = (ub2) ek0Var.f2468o;
                    try {
                        fg1.m1627T(obj);
                        ub2Var2.mo4496s();
                        return a83Var;
                    } catch (Throwable th3) {
                        th = th3;
                        ub2Var2.mo4496s();
                        throw th;
                    }
                }
                int i5 = ek0Var.f2469p;
                ak0 ak0Var2 = ek0Var.f2467n;
                try {
                    fg1.m1627T(obj);
                    i = i5;
                    ak0Var = ak0Var2;
                    a20 a20Var2 = ek0Var.f11029i;
                    a20Var2.getClass();
                    ub2Var = new ub2(ak0Var, a20Var2);
                } catch (Throwable th4) {
                    th = th4;
                    i = i5;
                    i23Var = new i23(th);
                    ek0Var.f2467n = null;
                    ek0Var.f2468o = th;
                    ek0Var.f2469p = i;
                    ek0Var.f2465l = 2;
                    if (op0.m3583e(i23Var, c0901xw, th, ek0Var) != k20Var) {
                        throw th;
                    }
                }
                try {
                    ek0Var.f2467n = null;
                    ek0Var.f2468o = ub2Var;
                    ek0Var.f2469p = i;
                    ek0Var.f2465l = 3;
                    c0901xw.mo489e(ub2Var, null, ek0Var);
                    if (a83Var != k20Var) {
                        ub2Var2 = ub2Var;
                        ub2Var2.mo4496s();
                        return a83Var;
                    }
                    return k20Var;
                } catch (Throwable th5) {
                    th = th5;
                    ub2Var2 = ub2Var;
                    ub2Var2.mo4496s();
                    throw th;
                }
            default:
                Object objMo1660a = ((C0470mq) abstractC0286hq).mo1660a(new C0957zc(new y62(), ak0Var, (g62) tw2Var, 1), t00Var);
                return objMo1660a == k20Var ? objMo1660a : a83Var;
        }
    }
}
