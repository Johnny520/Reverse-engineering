package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class e00 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f2275l = 1;

    /* JADX INFO: renamed from: m */
    public int f2276m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ long f2277n;

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f2278o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f2279p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f2280q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f2281r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f2282s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e00(p02 p02Var, String str, long j, f13 f13Var, b03 b03Var, us1 us1Var, t00 t00Var) {
        super(2, t00Var);
        this.f2278o = p02Var;
        this.f2279p = str;
        this.f2277n = j;
        this.f2280q = f13Var;
        this.f2281r = b03Var;
        this.f2282s = us1Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f2275l;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                return ((e00) mo13p((t00) obj2, (gm2) obj)).mo7r(a83Var);
            default:
                return ((e00) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = this.f2275l;
        Object obj2 = this.f2282s;
        Object obj3 = this.f2281r;
        Object obj4 = this.f2280q;
        Object obj5 = this.f2279p;
        switch (i) {
            case 0:
                e00 e00Var = new e00((p83) obj5, (g00) obj4, (InterfaceC0815vm) obj3, this.f2277n, (k21) obj2, t00Var);
                e00Var.f2278o = obj;
                return e00Var;
            default:
                return new e00((p02) this.f2278o, (String) obj5, this.f2277n, (f13) obj4, (b03) obj3, (us1) obj2, t00Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7r(Object obj) throws Throwable {
        Object objM3762R;
        String str;
        int i = this.f2275l;
        Object obj2 = this.f2280q;
        int i2 = 7;
        k20 k20Var = k20.f5323h;
        Object obj3 = this.f2281r;
        Object obj4 = this.f2279p;
        Object obj5 = this.f2282s;
        a83 a83Var = a83.f116a;
        t00 t00Var = null;
        switch (i) {
            case 0:
                InterfaceC0815vm interfaceC0815vm = (InterfaceC0815vm) obj3;
                g00 g00Var = (g00) obj2;
                p83 p83Var = (p83) obj4;
                int i3 = this.f2276m;
                if (i3 != 0) {
                    if (i3 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        fg1.m1627T(obj);
                    }
                    break;
                } else {
                    fg1.m1627T(obj);
                    gm2 gm2Var = (gm2) this.f2278o;
                    p83Var.f8041e = g00.m1770M0(g00Var, interfaceC0815vm, this.f2277n);
                    C0444m0 c0444m0 = new C0444m0(g00Var, p83Var, (k21) obj5, gm2Var);
                    C0678s1 c0678s1 = new C0678s1(g00Var, p83Var, interfaceC0815vm, i2);
                    this.f2276m = 1;
                    if (p83Var.m3798a(c0444m0, c0678s1, this) == k20Var) {
                    }
                }
                break;
            default:
                us1 us1Var = (us1) obj5;
                String str2 = (String) obj4;
                b03 b03Var = (b03) obj3;
                int i4 = this.f2276m;
                if (i4 != 0) {
                    if (i4 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        fg1.m1627T(obj);
                        objM3762R = obj;
                        str = str2;
                    }
                    break;
                } else {
                    fg1.m1627T(obj);
                    p02 p02Var = (p02) this.f2278o;
                    this.f2276m = 1;
                    p02Var.getClass();
                    if (str2.length() == 0) {
                        objM3762R = null;
                        str = str2;
                        if (objM3762R == k20Var) {
                        }
                    } else {
                        long j = this.f2277n;
                        if (!f13.m1494c(j)) {
                            str = str2;
                            objM3762R = AbstractC0570p7.m3762R(p02Var.f7907a, new C0379k9(p02Var, new o02(j, null, p02Var, str2), t00Var, i2), this);
                        }
                        if (objM3762R == k20Var) {
                        }
                    }
                }
                f13 f13Var = (f13) objM3762R;
                if (f13Var != null) {
                    long j2 = f13Var.f2739a;
                    long jM1636i = fg1.m1636i(us1Var.mo2449n((int) (j2 >> 32)), us1Var.mo2449n((int) (j2 & 4294967295L)));
                    if (!f13.m1492a(jM1636i, (f13) obj2) && t11.m5086l(b03Var.m350n().f5296a.f10051i, str) && us1Var == b03Var.f481b) {
                        b03Var.f482c.mo5j(b03.m340e(b03Var.m350n().f5296a, jM1636i));
                        b03Var.f502w = new f13(jM1636i);
                    }
                }
                break;
        }
        return a83Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e00(p83 p83Var, g00 g00Var, InterfaceC0815vm interfaceC0815vm, long j, k21 k21Var, t00 t00Var) {
        super(2, t00Var);
        this.f2279p = p83Var;
        this.f2280q = g00Var;
        this.f2281r = interfaceC0815vm;
        this.f2277n = j;
        this.f2282s = k21Var;
    }
}
