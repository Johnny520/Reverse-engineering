package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zc implements ak0 {
    public final /* synthetic */ int h;
    public final Object i;
    public final Object j;
    public final Object k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zc(ak0 ak0Var, a20 a20Var) {
        this.h = 2;
        this.i = a20Var;
        this.j = fg1.R(a20Var);
        this.k = new a2(ak0Var, null, 28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(Object obj, t00 t00Var) throws Throwable {
        gk0 gk0Var;
        int i = this.h;
        k20 k20Var = k20.h;
        a83 a83Var = a83.a;
        Object obj2 = this.k;
        Object obj3 = this.j;
        Object obj4 = this.i;
        switch (i) {
            case 0:
                y33 y33Var = (y33) obj3;
                ((n32) obj4).setValue(Boolean.valueOf(((Boolean) obj).booleanValue() ? ((Boolean) ((mn0) ((xk1) obj2).getValue()).g(y33Var.c(), y33Var.d.getValue())).booleanValue() : false));
                return a83Var;
            case 1:
                ak0 ak0Var = (ak0) obj3;
                y62 y62Var = (y62) obj4;
                if (t00Var instanceof gk0) {
                    gk0Var = (gk0) t00Var;
                    int i2 = gk0Var.n;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        gk0Var.n = i2 - Integer.MIN_VALUE;
                    } else {
                        gk0Var = new gk0(this, t00Var);
                    }
                }
                Object objG = gk0Var.l;
                int i3 = gk0Var.n;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            obj = gk0Var.k;
                            fg1.T(objG);
                            if (!((Boolean) objG).booleanValue()) {
                                y62Var.h = true;
                                gk0Var.k = null;
                                gk0Var.n = 3;
                                if (ak0Var.m(obj, gk0Var) == k20Var) {
                                    return k20Var;
                                }
                            }
                        } else if (i3 != 3) {
                            s.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    fg1.T(objG);
                } else {
                    fg1.T(objG);
                    if (y62Var.h) {
                        gk0Var.k = null;
                        gk0Var.n = 1;
                        if (ak0Var.m(obj, gk0Var) == k20Var) {
                            return k20Var;
                        }
                    } else {
                        gk0Var.k = obj;
                        gk0Var.n = 2;
                        objG = ((g62) obj2).g(obj, gk0Var);
                        if (objG == k20Var) {
                            return k20Var;
                        }
                        if (!((Boolean) objG).booleanValue()) {
                        }
                    }
                }
                return a83Var;
            default:
                Object objC0 = gf1.c0((a20) obj4, obj, obj3, (a2) obj2, t00Var);
                return objC0 == k20Var ? objC0 : a83Var;
        }
    }

    public /* synthetic */ zc(Object obj, Object obj2, Object obj3, int i) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
    }
}
