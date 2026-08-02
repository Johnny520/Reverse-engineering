package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ml0 extends yn0 implements mn0 {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f6715o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ml0(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f6715o = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        boolean zM2718a;
        boolean zM2718a2;
        int i = this.f6715o;
        a83 a83Var = a83.f116a;
        e81 e81Var = null;
        Object[] objArr = 0;
        char c = 1;
        Object obj3 = this.f963i;
        switch (i) {
            case 0:
                kl0 kl0Var = (kl0) obj;
                kl0 kl0Var2 = (kl0) obj2;
                nl0 nl0Var = (nl0) obj3;
                if (nl0Var.f10770u && (zM2718a = kl0Var2.m2718a()) != kl0Var.m2718a()) {
                    if (zM2718a) {
                        o72 o72Var = new o72();
                        s11.m4674S(nl0Var, new C0723t6(4, o72Var, nl0Var));
                        e81 e81Var2 = (e81) o72Var.f7574i;
                        if (e81Var2 != null) {
                            e81Var2.m1291a();
                            e81Var = e81Var2;
                        }
                        nl0Var.f7213y = e81Var;
                    } else {
                        e81 e81Var3 = nl0Var.f7213y;
                        if (e81Var3 != null) {
                            e81Var3.m1292b();
                        }
                        nl0Var.f7213y = null;
                    }
                }
                return a83Var;
            case 1:
                kl0 kl0Var3 = (kl0) obj;
                kl0 kl0Var4 = (kl0) obj2;
                ul0 ul0Var = (ul0) obj3;
                if (ul0Var.f10770u && (zM2718a2 = kl0Var4.m2718a()) != kl0Var3.m2718a()) {
                    in0 in0Var = ul0Var.f11349y;
                    if (in0Var != null) {
                        in0Var.mo5j(Boolean.valueOf(zM2718a2));
                    }
                    C0953z8 c0953z8 = vl0.f12006v;
                    if (zM2718a2) {
                        AbstractC0570p7.m3745A(ul0Var.m5255A0(), null, new h50((Object) ul0Var, (t00) (objArr == true ? 1 : 0), (int) (c == true ? 1 : 0)), 3);
                        o72 o72Var2 = new o72();
                        s11.m4674S(ul0Var, new C0640r1(16, o72Var2, ul0Var));
                        e81 e81Var4 = (e81) o72Var2.f7574i;
                        if (e81Var4 != null) {
                            e81Var4.m1291a();
                        } else {
                            e81Var4 = null;
                        }
                        ul0Var.f11345A = e81Var4;
                        zn1 zn1Var = ul0Var.f11346B;
                        if (zn1Var != null && zn1Var.mo2843S0().f10770u && ul0Var.f10770u) {
                            tb3.m5155a(ul0Var, c0953z8);
                        }
                    } else {
                        e81 e81Var5 = ul0Var.f11345A;
                        if (e81Var5 != null) {
                            e81Var5.m1292b();
                        }
                        ul0Var.f11345A = null;
                        if (ul0Var.f10770u) {
                            tb3.m5155a(ul0Var, c0953z8);
                        }
                    }
                    qp0.m4223E(ul0Var);
                    bk1 bk1Var = ul0Var.f11348x;
                    if (bk1Var != null) {
                        tk0 tk0Var = ul0Var.f11350z;
                        if (zM2718a2) {
                            if (tk0Var != null) {
                                ul0Var.m5509P0(bk1Var, new uk0(tk0Var));
                                ul0Var.f11350z = null;
                            }
                            tk0 tk0Var2 = new tk0();
                            ul0Var.m5509P0(bk1Var, tk0Var2);
                            ul0Var.f11350z = tk0Var2;
                        } else if (tk0Var != null) {
                            ul0Var.m5509P0(bk1Var, new uk0(tk0Var));
                            ul0Var.f11350z = null;
                        }
                    }
                }
                return a83Var;
            default:
                yo2 yo2Var = (yo2) obj;
                int iIntValue = ((Number) obj2).intValue();
                yo2Var.getClass();
                m31 m31Var = (m31) obj3;
                m31Var.getClass();
                boolean z = !yo2Var.mo257k(iIntValue) && yo2Var.mo256j(iIntValue).mo363h();
                m31Var.f6458b = z;
                return Boolean.valueOf(z);
        }
    }
}
