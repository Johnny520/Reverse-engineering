package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ar1 implements bl2 {
    public static final ar1 h = new ar1();
    public static final kl1 i = new kl1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.bl2
    public final Object e(yk2 yk2Var, xk2 xk2Var, mb mbVar) throws Throwable {
        c60 c60Var = o90.a;
        Object objR = p7.R(ie1.a.m, new u30(xk2Var, yk2Var, null, 2), mbVar);
        return objR == k20.h ? objR : a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:15:0x002f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:? */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.bl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(yk2 yk2Var, xf2 xf2Var, t00 t00Var) throws Throwable {
        yq1 yq1Var;
        il1 il1Var;
        il1 il1Var2;
        Throwable th;
        if (t00Var instanceof yq1) {
            yq1Var = (yq1) t00Var;
            int i2 = yq1Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yq1Var.p = i2 - Integer.MIN_VALUE;
            } else {
                yq1Var = new yq1(this, (u00) t00Var);
            }
        }
        Object obj = yq1Var.n;
        int i3 = yq1Var.p;
        t00 t00Var2 = null;
        k20 k20Var = k20.h;
        try {
            if (i3 == 0) {
                fg1.T(obj);
                yq1Var.k = yk2Var;
                yq1Var.l = xf2Var;
                kl1 kl1Var = i;
                yq1Var.m = kl1Var;
                yq1Var.p = 1;
                Object objD = kl1Var.d(yq1Var);
                il1Var = kl1Var;
                if (objD != k20Var) {
                }
                return k20Var;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                il1Var2 = yq1Var.m;
                try {
                    fg1.T(obj);
                    il1Var2 = il1Var2;
                    Boolean bool = (Boolean) obj;
                    bool.getClass();
                    ((kl1) il1Var2).f(null);
                    return bool;
                } catch (Throwable th2) {
                    th = th2;
                    ((kl1) il1Var2).f(null);
                    throw th;
                }
            }
            il1 il1Var3 = yq1Var.m;
            xf2Var = yq1Var.l;
            yk2 yk2Var2 = yq1Var.k;
            fg1.T(obj);
            il1Var = il1Var3;
            yk2Var = yk2Var2;
            af afVar = new af(16, xf2Var, yk2Var);
            yq1Var.k = null;
            yq1Var.l = null;
            yq1Var.m = il1Var;
            yq1Var.p = 2;
            c60 c60Var = o90.a;
            Object objR = p7.R(ie1.a.m, new a2(afVar, yk2Var, t00Var2, 19), yq1Var);
            if (objR != k20Var) {
                il1Var2 = il1Var;
                obj = objR;
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                ((kl1) il1Var2).f(null);
                return bool2;
            }
            return k20Var;
        } catch (Throwable th3) {
            il1Var2 = il1Var;
            th = th3;
            ((kl1) il1Var2).f(null);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:15:0x002f */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.bl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(yk2 yk2Var, jd2 jd2Var, t00 t00Var) throws Throwable {
        xq1 xq1Var;
        il1 il1Var;
        il1 il1Var2;
        Throwable th;
        il1 il1Var3;
        if (t00Var instanceof xq1) {
            xq1Var = (xq1) t00Var;
            int i2 = xq1Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xq1Var.p = i2 - Integer.MIN_VALUE;
            } else {
                xq1Var = new xq1(this, (u00) t00Var);
            }
        }
        Object obj = xq1Var.n;
        int i3 = xq1Var.p;
        t00 t00Var2 = null;
        k20 k20Var = k20.h;
        try {
            if (i3 == 0) {
                fg1.T(obj);
                xq1Var.k = yk2Var;
                xq1Var.l = jd2Var;
                kl1 kl1Var = i;
                xq1Var.m = kl1Var;
                xq1Var.p = 1;
                Object objD = kl1Var.d(xq1Var);
                il1Var = kl1Var;
                if (objD != k20Var) {
                }
                return k20Var;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                il1Var2 = xq1Var.m;
                try {
                    fg1.T(obj);
                    il1Var3 = il1Var2;
                    ((kl1) il1Var3).f(null);
                    return a83.a;
                } catch (Throwable th2) {
                    th = th2;
                    ((kl1) il1Var2).f(null);
                    throw th;
                }
            }
            il1 il1Var4 = xq1Var.m;
            jd2Var = xq1Var.l;
            yk2 yk2Var2 = xq1Var.k;
            fg1.T(obj);
            il1Var = il1Var4;
            yk2Var = yk2Var2;
            af afVar = new af(17, jd2Var, yk2Var);
            xq1Var.k = null;
            xq1Var.l = null;
            xq1Var.m = il1Var;
            xq1Var.p = 2;
            c60 c60Var = o90.a;
            if (p7.R(ie1.a.m, new a2(afVar, yk2Var, t00Var2, 19), xq1Var) != k20Var) {
                il1Var3 = il1Var;
                ((kl1) il1Var3).f(null);
                return a83.a;
            }
            return k20Var;
        } catch (Throwable th3) {
            il1Var2 = il1Var;
            th = th3;
            ((kl1) il1Var2).f(null);
            throw th;
        }
    }
}
