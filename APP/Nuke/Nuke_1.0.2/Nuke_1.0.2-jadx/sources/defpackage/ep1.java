package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ep1 {
    public final j20 a;
    public final sc b;
    public long c;
    public zt2 d;
    public long e;
    public fp1 f;
    public float g;
    public final nx1 h;
    public final nx1 i;
    public final nx1 j;
    public final nx1 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ep1(j20 j20Var, boolean z) {
        j20Var.getClass();
        this.a = j20Var;
        this.b = new sc(Float.valueOf(z ? 1.0f : 0.0f), rg3.n, Float.valueOf(0.01f), 8);
        this.c = 0L;
        this.g = 1.0f;
        this.h = op0.u(new rs1(0L));
        this.i = op0.u(Boolean.valueOf(z));
        Boolean bool = Boolean.FALSE;
        this.j = op0.u(bool);
        this.k = op0.u(bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r13.e(r5, r0) == r9) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ep1 ep1Var, long j, u00 u00Var) {
        cp1 cp1Var;
        ep1Var.getClass();
        if (u00Var instanceof cp1) {
            cp1Var = (cp1) u00Var;
            int i = cp1Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                cp1Var.n = i - Integer.MIN_VALUE;
            } else {
                cp1Var = new cp1(ep1Var, u00Var);
            }
        }
        cp1 cp1Var2 = cp1Var;
        Object obj = cp1Var2.l;
        int i2 = cp1Var2.n;
        k20 k20Var = k20.h;
        if (i2 == 0) {
            fg1.T(obj);
            sc scVar = ep1Var.b;
            Float f = new Float(1.0f);
            qt2 qt2VarG = up0.G(0.68f, 170.0f, null, 4);
            bp1 bp1Var = new bp1(ep1Var, j);
            cp1Var2.k = j;
            cp1Var2.n = 1;
            if (sc.c(scVar, f, qt2VarG, bp1Var, cp1Var2, 4) != k20Var) {
            }
            return k20Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(obj);
            ep1Var.f(false);
            return a83.a;
        }
        j = cp1Var2.k;
        fg1.T(obj);
        sc scVar2 = ep1Var.b;
        Float f2 = new Float(1.0f);
        cp1Var2.k = j;
        cp1Var2.n = 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(rs1 rs1Var, xm0 xm0Var) {
        xm0Var.getClass();
        if (c()) {
            fp1 fp1Var = this.f;
            fp1 fp1Var2 = fp1.i;
            if (fp1Var == fp1Var2) {
                return;
            }
            this.h.setValue(new rs1(rs1Var != null ? rs1Var.a : this.c));
            d(fp1Var2, new dp1(this, xm0Var, (t00) null, 0));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(fp1 fp1Var, mn0 mn0Var) {
        long j = this.e + 1;
        this.e = j;
        zt2 zt2Var = this.d;
        if (zt2Var != null) {
            zt2Var.c(null);
        }
        this.f = fp1Var;
        g(true);
        f(true);
        this.d = p7.A(this.a, null, new dp1(mn0Var, j, this, (t00) null), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(long j, xm0 xm0Var) {
        if (c()) {
            return;
        }
        fp1 fp1Var = this.f;
        fp1 fp1Var2 = fp1.h;
        if (fp1Var == fp1Var2) {
            return;
        }
        this.c = j;
        this.h.setValue(new rs1(j));
        d(fp1Var2, new dp1(this, xm0Var, (t00) null, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(boolean z) {
        this.k.setValue(Boolean.valueOf(z));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(boolean z) {
        this.j.setValue(Boolean.valueOf(z));
    }
}
