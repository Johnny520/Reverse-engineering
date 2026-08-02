package p000;

/* JADX INFO: renamed from: mq */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0470mq extends AbstractC0286hq {

    /* JADX INFO: renamed from: k */
    public final zj0 f6763k;

    /* JADX INFO: renamed from: l */
    public final nn0 f6764l;

    public C0470mq(nn0 nn0Var, zj0 zj0Var, a20 a20Var, int i, EnumC0283hn enumC0283hn) {
        super(a20Var, i, enumC0283hn);
        this.f6763k = zj0Var;
        this.f6764l = nn0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    @Override // p000.AbstractC0286hq, p000.zj0
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1660a(ak0 ak0Var, t00 t00Var) throws Throwable {
        int i = this.f4107i;
        k20 k20Var = k20.f5323h;
        if (i == -3) {
            a20 a20VarMo2508f = t00Var.mo2508f();
            Boolean bool = Boolean.FALSE;
            C0920ye c0920ye = new C0920ye(27);
            a20 a20Var = this.f4106h;
            a20 a20VarMo14k = !((Boolean) a20Var.mo16r(c0920ye, bool)).booleanValue() ? a20VarMo2508f.mo14k(a20Var) : rg3.m4487w(a20VarMo2508f, a20Var, false);
            if (t11.m5086l(a20VarMo14k, a20VarMo2508f)) {
                Object objM3187g = m3187g(ak0Var, t00Var);
                if (objM3187g == k20Var) {
                    return objM3187g;
                }
            } else {
                gd3 gd3Var = gd3.f3438p;
                if (t11.m5086l(a20VarMo14k.mo15o(gd3Var), a20VarMo2508f.mo15o(gd3Var))) {
                    a20 a20VarMo2508f2 = t00Var.mo2508f();
                    if (!(ak0Var instanceof to2) && !(ak0Var instanceof jo1)) {
                        ak0Var = new C0957zc(ak0Var, a20VarMo2508f2);
                    }
                    Object objM1884c0 = gf1.m1884c0(a20VarMo14k, ak0Var, fg1.m1625R(a20VarMo14k), new C0003a2(this, null, 9), t00Var);
                    if (objM1884c0 == k20Var) {
                        return objM1884c0;
                    }
                } else {
                    Object objMo1660a = super.mo1660a(ak0Var, t00Var);
                    if (objMo1660a == k20Var) {
                        return objMo1660a;
                    }
                }
            }
        }
        return a83.f116a;
    }

    @Override // p000.AbstractC0286hq
    /* JADX INFO: renamed from: c */
    public final Object mo2015c(o32 o32Var, t00 t00Var) {
        Object objM3187g = m3187g(new to2(o32Var), t00Var);
        return objM3187g == k20.f5323h ? objM3187g : a83.f116a;
    }

    @Override // p000.AbstractC0286hq
    /* JADX INFO: renamed from: d */
    public final AbstractC0286hq mo2016d(a20 a20Var, int i, EnumC0283hn enumC0283hn) {
        return new C0470mq(this.f6764l, this.f6763k, a20Var, i, enumC0283hn);
    }

    /* JADX INFO: renamed from: g */
    public final Object m3187g(ak0 ak0Var, t00 t00Var) {
        Object objM5238u = AbstractC0731te.m5238u(new C0359jq(this, ak0Var, null), t00Var);
        return objM5238u == k20.f5323h ? objM5238u : a83.f116a;
    }

    @Override // p000.AbstractC0286hq
    public final String toString() {
        return this.f6763k + " -> " + super.toString();
    }
}
