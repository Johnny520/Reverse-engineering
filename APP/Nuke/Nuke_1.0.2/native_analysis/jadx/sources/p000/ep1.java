package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ep1 {

    /* JADX INFO: renamed from: a */
    public final j20 f2548a;

    /* JADX INFO: renamed from: b */
    public final C0689sc f2549b;

    /* JADX INFO: renamed from: c */
    public long f2550c;

    /* JADX INFO: renamed from: d */
    public zt2 f2551d;

    /* JADX INFO: renamed from: e */
    public long f2552e;

    /* JADX INFO: renamed from: f */
    public fp1 f2553f;

    /* JADX INFO: renamed from: g */
    public float f2554g;

    /* JADX INFO: renamed from: h */
    public final nx1 f2555h;

    /* JADX INFO: renamed from: i */
    public final nx1 f2556i;

    /* JADX INFO: renamed from: j */
    public final nx1 f2557j;

    /* JADX INFO: renamed from: k */
    public final nx1 f2558k;

    public ep1(j20 j20Var, boolean z) {
        j20Var.getClass();
        this.f2548a = j20Var;
        this.f2549b = new C0689sc(Float.valueOf(z ? 1.0f : 0.0f), rg3.f9572n, Float.valueOf(0.01f), 8);
        this.f2550c = 0L;
        this.f2554g = 1.0f;
        this.f2555h = op0.m3598u(new rs1(0L));
        this.f2556i = op0.m3598u(Boolean.valueOf(z));
        Boolean bool = Boolean.FALSE;
        this.f2557j = op0.m3598u(bool);
        this.f2558k = op0.m3598u(bool);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r13.m4789e(r5, r0) == r9) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1403a(ep1 ep1Var, long j, u00 u00Var) {
        cp1 cp1Var;
        ep1Var.getClass();
        if (u00Var instanceof cp1) {
            cp1Var = (cp1) u00Var;
            int i = cp1Var.f1663n;
            if ((i & Integer.MIN_VALUE) != 0) {
                cp1Var.f1663n = i - Integer.MIN_VALUE;
            } else {
                cp1Var = new cp1(ep1Var, u00Var);
            }
        }
        cp1 cp1Var2 = cp1Var;
        Object obj = cp1Var2.f1661l;
        int i2 = cp1Var2.f1663n;
        k20 k20Var = k20.f5323h;
        if (i2 == 0) {
            fg1.m1627T(obj);
            C0689sc c0689sc = ep1Var.f2549b;
            Float f = new Float(1.0f);
            qt2 qt2VarM5528G = up0.m5528G(0.68f, 170.0f, null, 4);
            bp1 bp1Var = new bp1(ep1Var, j);
            cp1Var2.f1660k = j;
            cp1Var2.f1663n = 1;
            if (C0689sc.m4787c(c0689sc, f, qt2VarM5528G, bp1Var, cp1Var2, 4) != k20Var) {
            }
            return k20Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.m1627T(obj);
            ep1Var.m1408f(false);
            return a83.f116a;
        }
        j = cp1Var2.f1660k;
        fg1.m1627T(obj);
        C0689sc c0689sc2 = ep1Var.f2549b;
        Float f2 = new Float(1.0f);
        cp1Var2.f1660k = j;
        cp1Var2.f1663n = 2;
    }

    /* JADX INFO: renamed from: b */
    public final void m1404b(rs1 rs1Var, xm0 xm0Var) {
        xm0Var.getClass();
        if (m1405c()) {
            fp1 fp1Var = this.f2553f;
            fp1 fp1Var2 = fp1.f3104i;
            if (fp1Var == fp1Var2) {
                return;
            }
            this.f2555h.setValue(new rs1(rs1Var != null ? rs1Var.f9744a : this.f2550c));
            m1406d(fp1Var2, new dp1(this, xm0Var, (t00) null, 0));
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1405c() {
        return ((Boolean) this.f2556i.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public final void m1406d(fp1 fp1Var, mn0 mn0Var) {
        long j = this.f2552e + 1;
        this.f2552e = j;
        zt2 zt2Var = this.f2551d;
        if (zt2Var != null) {
            zt2Var.mo1704c(null);
        }
        this.f2553f = fp1Var;
        m1409g(true);
        m1408f(true);
        this.f2551d = AbstractC0570p7.m3745A(this.f2548a, null, new dp1(mn0Var, j, this, (t00) null), 3);
    }

    /* JADX INFO: renamed from: e */
    public final void m1407e(long j, xm0 xm0Var) {
        if (m1405c()) {
            return;
        }
        fp1 fp1Var = this.f2553f;
        fp1 fp1Var2 = fp1.f3103h;
        if (fp1Var == fp1Var2) {
            return;
        }
        this.f2550c = j;
        this.f2555h.setValue(new rs1(j));
        m1406d(fp1Var2, new dp1(this, xm0Var, (t00) null, 1));
    }

    /* JADX INFO: renamed from: f */
    public final void m1408f(boolean z) {
        this.f2558k.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: g */
    public final void m1409g(boolean z) {
        this.f2557j.setValue(Boolean.valueOf(z));
    }
}
