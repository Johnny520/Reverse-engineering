package p000;

/* JADX INFO: renamed from: d8 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0121d8 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1903h = 0;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ float f1904i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f1905j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1906k;

    public /* synthetic */ C0121d8(float f, C0122d9 c0122d9, C0095cl c0095cl) {
        this.f1904i = f;
        this.f1905j = c0122d9;
        this.f1906k = c0095cl;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f1903h;
        a83 a83Var = a83.f116a;
        Object obj2 = this.f1906k;
        float f = this.f1904i;
        Object obj3 = this.f1905j;
        switch (i) {
            case 0:
                C0122d9 c0122d9 = (C0122d9) obj3;
                C0095cl c0095cl = (C0095cl) obj2;
                t61 t61Var = (t61) obj;
                t61Var.m5125a();
                C0702sp c0702sp = t61Var.f10581h;
                C0043b5 c0043b5 = c0702sp.f10257i;
                long jM434u = c0043b5.m434u();
                c0043b5.m430q().mo1522l();
                try {
                    C0485n4 c0485n4 = (C0485n4) c0043b5.f562i;
                    c0485n4.m3235C(f, 0.0f);
                    c0485n4.m3247z(45.0f, 0L);
                    c0702sp.m4903e(c0122d9, c0095cl);
                    return a83Var;
                } finally {
                    vi0.m5699r(c0043b5, jM434u);
                }
            default:
                p83 p83Var = (p83) obj3;
                in0 in0Var = (in0) obj2;
                long jLongValue = ((Long) obj).longValue();
                if (p83Var.f8038b == Long.MIN_VALUE) {
                    p83Var.f8038b = jLongValue;
                }
                float f2 = p83Var.f8041e;
                C0346jd c0346jd = new C0346jd(f2);
                C0346jd c0346jd2 = p83.f8036f;
                long jMo1171b = f == 0.0f ? p83Var.f8037a.mo1171b(new C0346jd(f2), c0346jd2, p83Var.f8039c) : gf1.m1870R((jLongValue - p83Var.f8038b) / f);
                float f3 = ((C0346jd) p83Var.f8037a.mo739s(jMo1171b, c0346jd, c0346jd2, p83Var.f8039c)).f4968a;
                p83Var.f8039c = (C0346jd) p83Var.f8037a.mo737q(jMo1171b, c0346jd, c0346jd2, p83Var.f8039c);
                p83Var.f8038b = jLongValue;
                float f4 = p83Var.f8041e - f3;
                p83Var.f8041e = f3;
                in0Var.mo5j(Float.valueOf(f4));
                return a83Var;
        }
    }

    public /* synthetic */ C0121d8(p83 p83Var, float f, in0 in0Var) {
        this.f1905j = p83Var;
        this.f1904i = f;
        this.f1906k = in0Var;
    }
}
