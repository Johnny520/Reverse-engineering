package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class f60 {

    /* JADX INFO: renamed from: a */
    public final b60 f1592a;

    /* JADX INFO: renamed from: b */
    public boolean f1593b;

    /* JADX INFO: renamed from: c */
    public boolean f1594c;

    /* JADX INFO: renamed from: e */
    public boolean f1596e;

    /* JADX INFO: renamed from: f */
    public boolean f1597f;

    /* JADX INFO: renamed from: g */
    public boolean f1598g;

    /* JADX INFO: renamed from: h */
    public int f1599h;

    /* JADX INFO: renamed from: i */
    public int f1600i;

    /* JADX INFO: renamed from: j */
    public boolean f1601j;

    /* JADX INFO: renamed from: k */
    public boolean f1602k;

    /* JADX INFO: renamed from: l */
    public int f1603l;

    /* JADX INFO: renamed from: m */
    public boolean f1604m;

    /* JADX INFO: renamed from: n */
    public boolean f1605n;

    /* JADX INFO: renamed from: o */
    public int f1606o;

    /* JADX INFO: renamed from: q */
    public ec0 f1608q;

    /* JADX INFO: renamed from: d */
    public x50 f1595d = x50.f7268h;

    /* JADX INFO: renamed from: p */
    public final wd0 f1607p = new wd0(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f60(b60 b60Var) {
        this.f1592a = b60Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final qj0 m1032a() {
        return this.f1592a.f395I.f3996d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m1033b() {
        x50 x50Var = this.f1592a.f396J.f1595d;
        x50 x50Var2 = x50.f7266f;
        x50 x50Var3 = x50.f7267g;
        if (x50Var == x50Var2 || x50Var == x50Var3) {
            if (this.f1607p.f7084C) {
                m1038g(true);
            } else {
                m1037f(true);
            }
        }
        if (x50Var == x50Var3) {
            ec0 ec0Var = this.f1608q;
            if (ec0Var == null || !ec0Var.f1391w) {
                m1039h(true);
            } else {
                m1040i(true);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m1034c(long j) {
        ec0 ec0Var = this.f1608q;
        if (ec0Var != null) {
            f60 f60Var = ec0Var.f1377i;
            f60Var.f1595d = x50.f7265e;
            b60 b60Var = f60Var.f1592a;
            f60Var.f1596e = false;
            ec0Var.f1373A = j;
            fn0 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) e60.m789a(b60Var)).getSnapshotObserver();
            dc0 dc0Var = ec0Var.f1374B;
            snapshotObserver.f1778a.m777b(b60Var, snapshotObserver.f1779b, dc0Var);
            f60Var.f1597f = true;
            f60Var.f1598g = true;
            boolean zM1217p = g60.m1217p(b60Var);
            wd0 wd0Var = f60Var.f1607p;
            if (zM1217p) {
                wd0Var.f7110x = true;
                wd0Var.f7111y = true;
            } else {
                wd0Var.f7109w = true;
            }
            f60Var.f1595d = x50.f7268h;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m1035d(int i) {
        int i2 = this.f1603l;
        this.f1603l = i;
        if ((i2 == 0) != (i == 0)) {
            b60 b60VarM315v = this.f1592a.m315v();
            f60 f60Var = b60VarM315v != null ? b60VarM315v.f396J : null;
            if (f60Var != null) {
                int i3 = f60Var.f1603l;
                if (i == 0) {
                    f60Var.m1035d(i3 - 1);
                } else {
                    f60Var.m1035d(i3 + 1);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m1036e(int i) {
        int i2 = this.f1606o;
        this.f1606o = i;
        if ((i2 == 0) != (i == 0)) {
            b60 b60VarM315v = this.f1592a.m315v();
            f60 f60Var = b60VarM315v != null ? b60VarM315v.f396J : null;
            if (f60Var != null) {
                int i3 = f60Var.f1606o;
                if (i == 0) {
                    f60Var.m1036e(i3 - 1);
                } else {
                    f60Var.m1036e(i3 + 1);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m1037f(boolean z) {
        if (this.f1602k != z) {
            this.f1602k = z;
            if (z && !this.f1601j) {
                m1035d(this.f1603l + 1);
            } else {
                if (z || this.f1601j) {
                    return;
                }
                m1035d(this.f1603l - 1);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m1038g(boolean z) {
        if (this.f1601j != z) {
            this.f1601j = z;
            if (z && !this.f1602k) {
                m1035d(this.f1603l + 1);
            } else {
                if (z || this.f1602k) {
                    return;
                }
                m1035d(this.f1603l - 1);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m1039h(boolean z) {
        if (this.f1605n != z) {
            this.f1605n = z;
            if (z && !this.f1604m) {
                m1036e(this.f1606o + 1);
            } else {
                if (z || this.f1604m) {
                    return;
                }
                m1036e(this.f1606o - 1);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m1040i(boolean z) {
        if (this.f1604m != z) {
            this.f1604m = z;
            if (z && !this.f1605n) {
                m1036e(this.f1606o + 1);
            } else {
                if (z || this.f1605n) {
                    return;
                }
                m1036e(this.f1606o - 1);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m1041j() {
        wd0 wd0Var = this.f1607p;
        f60 f60Var = wd0Var.f7095i;
        Object obj = wd0Var.f7106t;
        b60 b60Var = this.f1592a;
        if ((obj != null || f60Var.m1032a().mo50j() != null) && wd0Var.f7105s) {
            wd0Var.f7105s = false;
            wd0Var.f7106t = f60Var.m1032a().mo50j();
            b60 b60VarM315v = b60Var.m315v();
            if (b60VarM315v != null) {
                b60.m262X(b60VarM315v, false, 7);
            }
        }
        ec0 ec0Var = this.f1608q;
        if (ec0Var != null) {
            f60 f60Var2 = ec0Var.f1377i;
            if (ec0Var.f1394z == null) {
                ac0 ac0VarMo435E0 = f60Var2.m1032a().mo435E0();
                ac0VarMo435E0.getClass();
                if (ac0VarMo435E0.f101r.mo50j() == null) {
                    return;
                }
            }
            if (ec0Var.f1393y) {
                ec0Var.f1393y = false;
                ac0 ac0VarMo435E02 = f60Var2.m1032a().mo435E0();
                ac0VarMo435E02.getClass();
                ec0Var.f1394z = ac0VarMo435E02.f101r.mo50j();
                if (g60.m1217p(b60Var)) {
                    b60 b60VarM315v2 = b60Var.m315v();
                    if (b60VarM315v2 != null) {
                        b60.m262X(b60VarM315v2, false, 7);
                        return;
                    }
                    return;
                }
                b60 b60VarM315v3 = b60Var.m315v();
                if (b60VarM315v3 != null) {
                    b60.m261V(b60VarM315v3, false, 7);
                }
            }
        }
    }
}
