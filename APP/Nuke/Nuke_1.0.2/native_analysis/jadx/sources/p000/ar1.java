package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ar1 implements bl2 {

    /* JADX INFO: renamed from: h */
    public static final ar1 f359h = new ar1();

    /* JADX INFO: renamed from: i */
    public static final kl1 f360i = new kl1();

    @Override // p000.bl2
    /* JADX INFO: renamed from: e */
    public final Object mo266e(yk2 yk2Var, xk2 xk2Var, C0455mb c0455mb) throws Throwable {
        c60 c60Var = o90.f7590a;
        Object objM3762R = AbstractC0570p7.m3762R(ie1.f4583a.f12144m, new u30(xk2Var, yk2Var, null, 2), c0455mb);
        return objM3762R == k20.f5323h ? objM3762R : a83.f116a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.bl2
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo267f(yk2 yk2Var, xf2 xf2Var, t00 t00Var) throws Throwable {
        yq1 yq1Var;
        il1 il1Var;
        il1 il1Var2;
        Throwable th;
        if (t00Var instanceof yq1) {
            yq1Var = (yq1) t00Var;
            int i = yq1Var.f13565p;
            if ((i & Integer.MIN_VALUE) != 0) {
                yq1Var.f13565p = i - Integer.MIN_VALUE;
            } else {
                yq1Var = new yq1(this, (u00) t00Var);
            }
        }
        Object obj = yq1Var.f13563n;
        int i2 = yq1Var.f13565p;
        t00 t00Var2 = null;
        k20 k20Var = k20.f5323h;
        try {
            if (i2 == 0) {
                fg1.m1627T(obj);
                yq1Var.f13560k = yk2Var;
                yq1Var.f13561l = xf2Var;
                kl1 kl1Var = f360i;
                yq1Var.f13562m = kl1Var;
                yq1Var.f13565p = 1;
                Object objM2720d = kl1Var.m2720d(yq1Var);
                il1Var = kl1Var;
                if (objM2720d != k20Var) {
                }
                return k20Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                il1Var2 = yq1Var.f13562m;
                try {
                    fg1.m1627T(obj);
                    il1Var2 = il1Var2;
                    Boolean bool = (Boolean) obj;
                    bool.getClass();
                    ((kl1) il1Var2).m2722f(null);
                    return bool;
                } catch (Throwable th2) {
                    th = th2;
                    ((kl1) il1Var2).m2722f(null);
                    throw th;
                }
            }
            il1 il1Var3 = yq1Var.f13562m;
            xf2Var = yq1Var.f13561l;
            yk2 yk2Var2 = yq1Var.f13560k;
            fg1.m1627T(obj);
            il1Var = il1Var3;
            yk2Var = yk2Var2;
            C0016af c0016af = new C0016af(16, xf2Var, yk2Var);
            yq1Var.f13560k = null;
            yq1Var.f13561l = null;
            yq1Var.f13562m = il1Var;
            yq1Var.f13565p = 2;
            c60 c60Var = o90.f7590a;
            Object objM3762R = AbstractC0570p7.m3762R(ie1.f4583a.f12144m, new C0003a2(c0016af, yk2Var, t00Var2, 19), yq1Var);
            if (objM3762R != k20Var) {
                il1Var2 = il1Var;
                obj = objM3762R;
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                ((kl1) il1Var2).m2722f(null);
                return bool2;
            }
            return k20Var;
        } catch (Throwable th3) {
            il1Var2 = il1Var;
            th = th3;
            ((kl1) il1Var2).m2722f(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.bl2
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo268m(yk2 yk2Var, jd2 jd2Var, t00 t00Var) throws Throwable {
        xq1 xq1Var;
        il1 il1Var;
        il1 il1Var2;
        Throwable th;
        il1 il1Var3;
        if (t00Var instanceof xq1) {
            xq1Var = (xq1) t00Var;
            int i = xq1Var.f13138p;
            if ((i & Integer.MIN_VALUE) != 0) {
                xq1Var.f13138p = i - Integer.MIN_VALUE;
            } else {
                xq1Var = new xq1(this, (u00) t00Var);
            }
        }
        Object obj = xq1Var.f13136n;
        int i2 = xq1Var.f13138p;
        t00 t00Var2 = null;
        k20 k20Var = k20.f5323h;
        try {
            if (i2 == 0) {
                fg1.m1627T(obj);
                xq1Var.f13133k = yk2Var;
                xq1Var.f13134l = jd2Var;
                kl1 kl1Var = f360i;
                xq1Var.f13135m = kl1Var;
                xq1Var.f13138p = 1;
                Object objM2720d = kl1Var.m2720d(xq1Var);
                il1Var = kl1Var;
                if (objM2720d != k20Var) {
                }
                return k20Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                il1Var2 = xq1Var.f13135m;
                try {
                    fg1.m1627T(obj);
                    il1Var3 = il1Var2;
                    ((kl1) il1Var3).m2722f(null);
                    return a83.f116a;
                } catch (Throwable th2) {
                    th = th2;
                    ((kl1) il1Var2).m2722f(null);
                    throw th;
                }
            }
            il1 il1Var4 = xq1Var.f13135m;
            jd2Var = xq1Var.f13134l;
            yk2 yk2Var2 = xq1Var.f13133k;
            fg1.m1627T(obj);
            il1Var = il1Var4;
            yk2Var = yk2Var2;
            C0016af c0016af = new C0016af(17, jd2Var, yk2Var);
            xq1Var.f13133k = null;
            xq1Var.f13134l = null;
            xq1Var.f13135m = il1Var;
            xq1Var.f13138p = 2;
            c60 c60Var = o90.f7590a;
            if (AbstractC0570p7.m3762R(ie1.f4583a.f12144m, new C0003a2(c0016af, yk2Var, t00Var2, 19), xq1Var) != k20Var) {
                il1Var3 = il1Var;
                ((kl1) il1Var3).m2722f(null);
                return a83.f116a;
            }
            return k20Var;
        } catch (Throwable th3) {
            il1Var2 = il1Var;
            th = th3;
            ((kl1) il1Var2).m2722f(null);
            throw th;
        }
    }
}
