package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ml0 extends yn0 implements mn0 {
    public final /* synthetic */ int o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ml0(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.o = i4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        boolean zA;
        boolean zA2;
        int i = this.o;
        a83 a83Var = a83.a;
        e81 e81Var = null;
        Object[] objArr = 0;
        char c = 1;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                kl0 kl0Var = (kl0) obj;
                kl0 kl0Var2 = (kl0) obj2;
                nl0 nl0Var = (nl0) obj3;
                if (nl0Var.u && (zA = kl0Var2.a()) != kl0Var.a()) {
                    if (zA) {
                        o72 o72Var = new o72();
                        s11.S(nl0Var, new t6(4, o72Var, nl0Var));
                        e81 e81Var2 = (e81) o72Var.i;
                        if (e81Var2 != null) {
                            e81Var2.a();
                            e81Var = e81Var2;
                        }
                        nl0Var.y = e81Var;
                    } else {
                        e81 e81Var3 = nl0Var.y;
                        if (e81Var3 != null) {
                            e81Var3.b();
                        }
                        nl0Var.y = null;
                    }
                }
                return a83Var;
            case 1:
                kl0 kl0Var3 = (kl0) obj;
                kl0 kl0Var4 = (kl0) obj2;
                ul0 ul0Var = (ul0) obj3;
                if (ul0Var.u && (zA2 = kl0Var4.a()) != kl0Var3.a()) {
                    in0 in0Var = ul0Var.y;
                    if (in0Var != null) {
                        in0Var.j(Boolean.valueOf(zA2));
                    }
                    z8 z8Var = vl0.v;
                    if (zA2) {
                        p7.A(ul0Var.A0(), null, new h50((Object) ul0Var, (t00) (objArr == true ? 1 : 0), (int) (c == true ? 1 : 0)), 3);
                        o72 o72Var2 = new o72();
                        s11.S(ul0Var, new r1(16, o72Var2, ul0Var));
                        e81 e81Var4 = (e81) o72Var2.i;
                        if (e81Var4 != null) {
                            e81Var4.a();
                        } else {
                            e81Var4 = null;
                        }
                        ul0Var.A = e81Var4;
                        zn1 zn1Var = ul0Var.B;
                        if (zn1Var != null && zn1Var.S0().u && ul0Var.u) {
                            tb3.a(ul0Var, z8Var);
                        }
                    } else {
                        e81 e81Var5 = ul0Var.A;
                        if (e81Var5 != null) {
                            e81Var5.b();
                        }
                        ul0Var.A = null;
                        if (ul0Var.u) {
                            tb3.a(ul0Var, z8Var);
                        }
                    }
                    qp0.E(ul0Var);
                    bk1 bk1Var = ul0Var.x;
                    if (bk1Var != null) {
                        tk0 tk0Var = ul0Var.z;
                        if (zA2) {
                            if (tk0Var != null) {
                                ul0Var.P0(bk1Var, new uk0(tk0Var));
                                ul0Var.z = null;
                            }
                            tk0 tk0Var2 = new tk0();
                            ul0Var.P0(bk1Var, tk0Var2);
                            ul0Var.z = tk0Var2;
                        } else if (tk0Var != null) {
                            ul0Var.P0(bk1Var, new uk0(tk0Var));
                            ul0Var.z = null;
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
                boolean z = !yo2Var.k(iIntValue) && yo2Var.j(iIntValue).h();
                m31Var.b = z;
                return Boolean.valueOf(z);
        }
    }
}
