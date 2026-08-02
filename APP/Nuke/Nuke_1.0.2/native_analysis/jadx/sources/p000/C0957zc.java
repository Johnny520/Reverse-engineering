package p000;

/* JADX INFO: renamed from: zc */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0957zc implements ak0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f13824h;

    /* JADX INFO: renamed from: i */
    public final Object f13825i;

    /* JADX INFO: renamed from: j */
    public final Object f13826j;

    /* JADX INFO: renamed from: k */
    public final Object f13827k;

    public C0957zc(ak0 ak0Var, a20 a20Var) {
        this.f13824h = 2;
        this.f13825i = a20Var;
        this.f13826j = fg1.m1625R(a20Var);
        this.f13827k = new C0003a2(ak0Var, null, 28);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    @Override // p000.ak0
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo181m(Object obj, t00 t00Var) throws Throwable {
        gk0 gk0Var;
        int i = this.f13824h;
        k20 k20Var = k20.f5323h;
        a83 a83Var = a83.f116a;
        Object obj2 = this.f13827k;
        Object obj3 = this.f13826j;
        Object obj4 = this.f13825i;
        switch (i) {
            case 0:
                y33 y33Var = (y33) obj3;
                ((n32) obj4).setValue(Boolean.valueOf(((Boolean) obj).booleanValue() ? ((Boolean) ((mn0) ((xk1) obj2).getValue()).mo12g(y33Var.m6213c(), y33Var.f13292d.getValue())).booleanValue() : false));
                return a83Var;
            case 1:
                ak0 ak0Var = (ak0) obj3;
                y62 y62Var = (y62) obj4;
                if (t00Var instanceof gk0) {
                    gk0Var = (gk0) t00Var;
                    int i2 = gk0Var.f3551n;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        gk0Var.f3551n = i2 - Integer.MIN_VALUE;
                    } else {
                        gk0Var = new gk0(this, t00Var);
                    }
                }
                Object objMo12g = gk0Var.f3549l;
                int i3 = gk0Var.f3551n;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            obj = gk0Var.f3548k;
                            fg1.m1627T(objMo12g);
                            if (!((Boolean) objMo12g).booleanValue()) {
                                y62Var.f13324h = true;
                                gk0Var.f3548k = null;
                                gk0Var.f3551n = 3;
                                if (ak0Var.mo181m(obj, gk0Var) == k20Var) {
                                    return k20Var;
                                }
                            }
                        } else if (i3 != 3) {
                            C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    fg1.m1627T(objMo12g);
                } else {
                    fg1.m1627T(objMo12g);
                    if (y62Var.f13324h) {
                        gk0Var.f3548k = null;
                        gk0Var.f3551n = 1;
                        if (ak0Var.mo181m(obj, gk0Var) == k20Var) {
                            return k20Var;
                        }
                    } else {
                        gk0Var.f3548k = obj;
                        gk0Var.f3551n = 2;
                        objMo12g = ((g62) obj2).mo12g(obj, gk0Var);
                        if (objMo12g == k20Var) {
                            return k20Var;
                        }
                        if (!((Boolean) objMo12g).booleanValue()) {
                        }
                    }
                }
                return a83Var;
            default:
                Object objM1884c0 = gf1.m1884c0((a20) obj4, obj, obj3, (C0003a2) obj2, t00Var);
                return objM1884c0 == k20Var ? objM1884c0 : a83Var;
        }
    }

    public /* synthetic */ C0957zc(Object obj, Object obj2, Object obj3, int i) {
        this.f13824h = i;
        this.f13825i = obj;
        this.f13826j = obj2;
        this.f13827k = obj3;
    }
}
