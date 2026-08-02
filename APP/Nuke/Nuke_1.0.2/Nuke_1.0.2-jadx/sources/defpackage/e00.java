package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class e00 extends tw2 implements mn0 {
    public final /* synthetic */ int l = 1;
    public int m;
    public final /* synthetic */ long n;
    public /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e00(p02 p02Var, String str, long j, f13 f13Var, b03 b03Var, us1 us1Var, t00 t00Var) {
        super(2, t00Var);
        this.o = p02Var;
        this.p = str;
        this.n = j;
        this.q = f13Var;
        this.r = b03Var;
        this.s = us1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.l;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                return ((e00) p((t00) obj2, (gm2) obj)).r(a83Var);
            default:
                return ((e00) p((t00) obj2, (j20) obj)).r(a83Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        int i = this.l;
        Object obj2 = this.s;
        Object obj3 = this.r;
        Object obj4 = this.q;
        Object obj5 = this.p;
        switch (i) {
            case 0:
                e00 e00Var = new e00((p83) obj5, (g00) obj4, (vm) obj3, this.n, (k21) obj2, t00Var);
                e00Var.o = obj;
                return e00Var;
            default:
                return new e00((p02) this.o, (String) obj5, this.n, (f13) obj4, (b03) obj3, (us1) obj2, t00Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    @Override // defpackage.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Object obj) throws Throwable {
        Object objR;
        String str;
        int i = this.l;
        Object obj2 = this.q;
        int i2 = 7;
        k20 k20Var = k20.h;
        Object obj3 = this.r;
        Object obj4 = this.p;
        Object obj5 = this.s;
        a83 a83Var = a83.a;
        t00 t00Var = null;
        switch (i) {
            case 0:
                vm vmVar = (vm) obj3;
                g00 g00Var = (g00) obj2;
                p83 p83Var = (p83) obj4;
                int i3 = this.m;
                if (i3 != 0) {
                    if (i3 != 1) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        fg1.T(obj);
                    }
                    break;
                } else {
                    fg1.T(obj);
                    gm2 gm2Var = (gm2) this.o;
                    p83Var.e = g00.M0(g00Var, vmVar, this.n);
                    m0 m0Var = new m0(g00Var, p83Var, (k21) obj5, gm2Var);
                    s1 s1Var = new s1(g00Var, p83Var, vmVar, i2);
                    this.m = 1;
                    if (p83Var.a(m0Var, s1Var, this) == k20Var) {
                    }
                }
                break;
            default:
                us1 us1Var = (us1) obj5;
                String str2 = (String) obj4;
                b03 b03Var = (b03) obj3;
                int i4 = this.m;
                if (i4 != 0) {
                    if (i4 != 1) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        fg1.T(obj);
                        objR = obj;
                        str = str2;
                    }
                    break;
                } else {
                    fg1.T(obj);
                    p02 p02Var = (p02) this.o;
                    this.m = 1;
                    p02Var.getClass();
                    if (str2.length() == 0) {
                        objR = null;
                        str = str2;
                        if (objR == k20Var) {
                        }
                    } else {
                        long j = this.n;
                        if (!f13.c(j)) {
                            str = str2;
                            objR = p7.R(p02Var.a, new k9(p02Var, new o02(j, null, p02Var, str2), t00Var, i2), this);
                        }
                        if (objR == k20Var) {
                        }
                    }
                }
                f13 f13Var = (f13) objR;
                if (f13Var != null) {
                    long j2 = f13Var.a;
                    long jI = fg1.i(us1Var.n((int) (j2 >> 32)), us1Var.n((int) (j2 & 4294967295L)));
                    if (!f13.a(jI, (f13) obj2) && t11.l(b03Var.n().a.i, str) && us1Var == b03Var.b) {
                        b03Var.c.j(b03.e(b03Var.n().a, jI));
                        b03Var.w = new f13(jI);
                    }
                }
                break;
        }
        return a83Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e00(p83 p83Var, g00 g00Var, vm vmVar, long j, k21 k21Var, t00 t00Var) {
        super(2, t00Var);
        this.p = p83Var;
        this.q = g00Var;
        this.r = vmVar;
        this.n = j;
        this.s = k21Var;
    }
}
