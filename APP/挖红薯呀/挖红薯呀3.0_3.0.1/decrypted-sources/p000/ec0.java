package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ec0 extends xq0 implements sd0, InterfaceC0749t2, cg0 {

    /* JADX INFO: renamed from: D */
    public boolean f1376D;

    /* JADX INFO: renamed from: i */
    public final f60 f1377i;

    /* JADX INFO: renamed from: j */
    public boolean f1378j;

    /* JADX INFO: renamed from: n */
    public boolean f1382n;

    /* JADX INFO: renamed from: o */
    public boolean f1383o;

    /* JADX INFO: renamed from: p */
    public C0617pj f1384p;

    /* JADX INFO: renamed from: r */
    public InterfaceC0742sw f1386r;

    /* JADX INFO: renamed from: w */
    public boolean f1391w;

    /* JADX INFO: renamed from: z */
    public Object f1394z;

    /* JADX INFO: renamed from: k */
    public int f1379k = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: l */
    public int f1380l = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: m */
    public z50 f1381m = z50.f7802f;

    /* JADX INFO: renamed from: q */
    public long f1385q = 0;

    /* JADX INFO: renamed from: s */
    public cc0 f1387s = cc0.f784f;

    /* JADX INFO: renamed from: t */
    public final c60 f1388t = new c60(this, 1);

    /* JADX INFO: renamed from: u */
    public final sh0 f1389u = new sh0(new ec0[16]);

    /* JADX INFO: renamed from: v */
    public boolean f1390v = true;

    /* JADX INFO: renamed from: x */
    public final dc0 f1392x = new dc0(this, 0);

    /* JADX INFO: renamed from: y */
    public boolean f1393y = true;

    /* JADX INFO: renamed from: A */
    public long f1373A = AbstractC0654qj.m3255b(0, 0, 15);

    /* JADX INFO: renamed from: B */
    public final dc0 f1374B = new dc0(this, 2);

    /* JADX INFO: renamed from: C */
    public final dc0 f1375C = new dc0(this, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ec0(f60 f60Var) {
        this.f1377i = f60Var;
        this.f1394z = f60Var.f1607p.f7106t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: I */
    public final int mo181I(int i) {
        m835g0();
        ac0 ac0VarMo435E0 = this.f1377i.m1032a().mo435E0();
        ac0VarMo435E0.getClass();
        return ac0VarMo435E0.mo181I(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0749t2
    /* JADX INFO: renamed from: L */
    public final int mo828L() {
        return this.f1380l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0749t2
    /* JADX INFO: renamed from: N */
    public final void mo829N() {
        b60.m261V(this.f1377i.f1592a, false, 7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: O */
    public final int mo182O(int i) {
        m835g0();
        ac0 ac0VarMo435E0 = this.f1377i.m1032a().mo435E0();
        ac0VarMo435E0.getClass();
        return ac0VarMo435E0.mo182O(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: R */
    public final int mo183R(int i) {
        m835g0();
        ac0 ac0VarMo435E0 = this.f1377i.m1032a().mo435E0();
        ac0VarMo435E0.getClass();
        return ac0VarMo435E0.mo183R(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xq0
    /* JADX INFO: renamed from: X */
    public final void mo47X(long j, float f, InterfaceC0742sw interfaceC0742sw) {
        m838l0(j, interfaceC0742sw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0749t2
    /* JADX INFO: renamed from: a */
    public final c60 mo830a() {
        return this.f1388t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public final boolean m831b0() {
        f60 f60Var = this.f1377i;
        return g60.m1217p(f60Var.f1592a) || f60Var.f1594c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public final void m832c0(boolean z) {
        if (z && m831b0()) {
            return;
        }
        if (z || m831b0()) {
            this.f1387s = cc0.f784f;
            sh0 sh0VarM319z = this.f1377i.f1592a.m319z();
            Object[] objArr = sh0VarM319z.f5768d;
            int i = sh0VarM319z.f5770f;
            for (int i2 = 0; i2 < i; i2++) {
                ec0 ec0Var = ((b60) objArr[i2]).f396J.f1608q;
                ec0Var.getClass();
                ec0Var.m832c0(true);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public final void m833d0() {
        cc0 cc0Var = this.f1387s;
        f60 f60Var = this.f1377i;
        boolean z = f60Var.f1594c;
        b60 b60Var = f60Var.f1592a;
        cc0 cc0Var2 = cc0.f782d;
        if (z) {
            this.f1387s = cc0.f783e;
        } else {
            this.f1387s = cc0Var2;
        }
        if (cc0Var != cc0Var2 && f60Var.f1596e) {
            b60.m261V(b60Var, true, 6);
        }
        sh0 sh0VarM319z = b60Var.m319z();
        Object[] objArr = sh0VarM319z.f5768d;
        int i = sh0VarM319z.f5770f;
        for (int i2 = 0; i2 < i; i2++) {
            b60 b60Var2 = (b60) objArr[i2];
            ec0 ec0Var = b60Var2.f396J.f1608q;
            if (ec0Var == null) {
                C0921xc.m5131l("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (ec0Var.f1380l != Integer.MAX_VALUE) {
                ec0Var.m833d0();
                b60.m263Y(b60Var2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    @Override // p000.sd0
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xq0 mo184e(long j) {
        z50 z50Var;
        f60 f60Var = this.f1377i;
        b60 b60Var = f60Var.f1592a;
        b60 b60Var2 = f60Var.f1592a;
        b60 b60VarM315v = b60Var.m315v();
        if ((b60VarM315v != null ? b60VarM315v.f396J.f1595d : null) == x50.f7265e) {
            f60Var.f1593b = false;
        } else {
            b60 b60VarM315v2 = b60Var2.m315v();
            if ((b60VarM315v2 != null ? b60VarM315v2.f396J.f1595d : null) == x50.f7267g) {
            }
        }
        b60 b60VarM315v3 = b60Var2.m315v();
        z50 z50Var2 = z50.f7802f;
        if (b60VarM315v3 != null) {
            f60 f60Var2 = b60VarM315v3.f396J;
            if (this.f1381m != z50Var2 && !b60Var2.f394H) {
                w10.m4824b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = f60Var2.f1595d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                z50Var = z50.f7800d;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    C0921xc.m5133n(f60Var2.f1595d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                z50Var = z50.f7801e;
            }
            this.f1381m = z50Var;
        } else {
            this.f1381m = z50Var2;
        }
        if (b60Var2.f392F == z50Var2) {
            b60Var2.m295e();
        }
        m839m0(j);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public final void m834e0() {
        f60 f60Var = this.f1377i;
        if (f60Var.f1606o > 0) {
            sh0 sh0VarM319z = f60Var.f1592a.m319z();
            Object[] objArr = sh0VarM319z.f5768d;
            int i = sh0VarM319z.f5770f;
            for (int i2 = 0; i2 < i; i2++) {
                b60 b60Var = (b60) objArr[i2];
                f60 f60Var2 = b60Var.f396J;
                if ((f60Var2.f1604m || f60Var2.f1605n) && !f60Var2.f1597f) {
                    b60Var.m284U(false);
                }
                ec0 ec0Var = f60Var2.f1608q;
                if (ec0Var != null) {
                    ec0Var.m834e0();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd0
    /* JADX INFO: renamed from: f */
    public final int mo185f(int i) {
        m835g0();
        ac0 ac0VarMo435E0 = this.f1377i.m1032a().mo435E0();
        ac0VarMo435E0.getClass();
        return ac0VarMo435E0.mo185f(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    public final void m835g0() {
        f60 f60Var = this.f1377i;
        b60.m261V(f60Var.f1592a, false, 7);
        b60 b60Var = f60Var.f1592a;
        b60 b60VarM315v = b60Var.m315v();
        if (b60VarM315v == null || b60Var.f392F != z50.f7802f) {
            return;
        }
        int iOrdinal = b60VarM315v.f396J.f1595d.ordinal();
        b60Var.f392F = iOrdinal != 0 ? iOrdinal != 2 ? b60VarM315v.f392F : z50.f7801e : z50.f7800d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xq0, p000.sd0
    /* JADX INFO: renamed from: j */
    public final Object mo50j() {
        return this.f1394z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public final void m836k0() {
        x50 x50Var;
        this.f1376D = true;
        f60 f60Var = this.f1377i;
        b60 b60VarM315v = f60Var.f1592a.m315v();
        cc0 cc0Var = this.f1387s;
        if ((cc0Var != cc0.f782d && !f60Var.f1594c) || (cc0Var != cc0.f783e && f60Var.f1594c)) {
            m833d0();
            if (this.f1378j && b60VarM315v != null) {
                b60VarM315v.m284U(false);
            }
        }
        if (b60VarM315v != null) {
            f60 f60Var2 = b60VarM315v.f396J;
            if (!this.f1378j && ((x50Var = f60Var2.f1595d) == x50.f7266f || x50Var == x50.f7267g)) {
                if (this.f1380l != Integer.MAX_VALUE) {
                    w10.m4824b("Place was called on a node which was placed already");
                }
                int i = f60Var2.f1599h;
                this.f1380l = i;
                f60Var2.f1599h = i + 1;
            }
        } else {
            this.f1380l = 0;
        }
        mo842u();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0749t2
    /* JADX INFO: renamed from: l */
    public final void mo837l(C0711s2 c0711s2) {
        sh0 sh0VarM319z = this.f1377i.f1592a.m319z();
        Object[] objArr = sh0VarM319z.f5768d;
        int i = sh0VarM319z.f5770f;
        for (int i2 = 0; i2 < i; i2++) {
            ec0 ec0Var = ((b60) objArr[i2]).f396J.f1608q;
            ec0Var.getClass();
            c0711s2.invoke(ec0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0018, B:12:0x001d, B:14:0x0021, B:15:0x0026, B:17:0x0035, B:19:0x0039, B:22:0x003f, B:21:0x003d, B:23:0x0042, B:25:0x004c, B:30:0x0056, B:32:0x0084, B:31:0x006e), top: B:36:0x0007 }] */
    /* JADX INFO: renamed from: l0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m838l0(long j, InterfaceC0742sw interfaceC0742sw) {
        f60 f60Var = this.f1377i;
        b60 b60Var = f60Var.f1592a;
        b60 b60Var2 = f60Var.f1592a;
        try {
            b60 b60VarM315v = b60Var.m315v();
            x50 x50Var = b60VarM315v != null ? b60VarM315v.f396J.f1595d : null;
            x50 x50Var2 = x50.f7267g;
            if (x50Var == x50Var2) {
                f60Var.f1594c = false;
            }
            if (b60Var2.f404R) {
                w10.m4823a("place is called on a deactivated node");
            }
            f60Var.f1595d = x50Var2;
            boolean z = true;
            this.f1382n = true;
            this.f1376D = false;
            if (!w20.m4833a(j, this.f1385q)) {
                if (f60Var.f1605n || f60Var.f1604m) {
                    f60Var.f1597f = true;
                }
                m834e0();
            }
            dn0 dn0VarM789a = e60.m789a(b60Var2);
            this.f1385q = j;
            if (f60Var.f1597f) {
                f60Var.m1039h(false);
                this.f1388t.f711e = false;
                fn0 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) dn0VarM789a).getSnapshotObserver();
                snapshotObserver.f1778a.m777b(b60Var2, snapshotObserver.f1784g, this.f1375C);
            } else {
                if (this.f1387s == cc0.f784f) {
                    z = false;
                }
                if (z) {
                    ac0 ac0VarMo435E0 = f60Var.m1032a().mo435E0();
                    ac0VarMo435E0.getClass();
                    ac0VarMo435E0.m61x0(w20.m4835c(j, ac0VarMo435E0.f7404h));
                    m836k0();
                }
            }
            this.f1386r = interfaceC0742sw;
            f60Var.f1595d = x50.f7268h;
        } catch (Throwable th) {
            b60Var.m288a0(th);
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m0 */
    public final boolean m839m0(long j) {
        f60 f60Var = this.f1377i;
        b60 b60Var = f60Var.f1592a;
        b60 b60Var2 = f60Var.f1592a;
        try {
            if (b60Var.f404R) {
                w10.m4823a("measure is called on a deactivated node");
            }
            b60 b60VarM315v = b60Var2.m315v();
            b60Var2.f394H = b60Var2.f394H || (b60VarM315v != null && b60VarM315v.f394H);
            if (!b60Var2.f396J.f1596e) {
                C0617pj c0617pj = this.f1384p;
                if (c0617pj == null ? false : C0617pj.m3131b(c0617pj.f4912a, j)) {
                    dn0 dn0Var = b60Var2.f419r;
                    if (dn0Var != null) {
                        ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) dn0Var).m4853k(b60Var2, true);
                    }
                    b60Var2.m286Z();
                    return false;
                }
            }
            this.f1384p = new C0617pj(j);
            m5146a0(j);
            this.f1388t.f710d = false;
            sh0 sh0VarM319z = b60Var2.m319z();
            Object[] objArr = sh0VarM319z.f5768d;
            int i = sh0VarM319z.f5770f;
            for (int i2 = 0; i2 < i; i2++) {
                ec0 ec0Var = ((b60) objArr[i2]).f396J.f1608q;
                ec0Var.getClass();
                ec0Var.f1388t.getClass();
            }
            long j2 = this.f1383o ? this.f7402f : -9223372034707292160L;
            this.f1383o = true;
            ac0 ac0VarMo435E0 = f60Var.m1032a().mo435E0();
            if (ac0VarMo435E0 == null) {
                w10.m4824b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            f60Var.m1034c(j);
            m5145Y((((long) ac0VarMo435E0.f7400d) << 32) | (((long) ac0VarMo435E0.f7401e) & 4294967295L));
            return (((int) (j2 >> 32)) == ac0VarMo435E0.f7400d && ((int) (j2 & 4294967295L)) == ac0VarMo435E0.f7401e) ? false : true;
        } catch (Throwable th) {
            b60Var.m288a0(th);
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.cg0
    /* JADX INFO: renamed from: n */
    public final void mo530n(boolean z) {
        ac0 ac0VarMo435E0;
        f60 f60Var = this.f1377i;
        ac0 ac0VarMo435E02 = f60Var.m1032a().mo435E0();
        if (Boolean.valueOf(z).equals(ac0VarMo435E02 != null ? Boolean.valueOf(ac0VarMo435E02.f7595l) : null) || (ac0VarMo435E0 = f60Var.m1032a().mo435E0()) == null) {
            return;
        }
        ac0VarMo435E0.f7595l = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0749t2
    /* JADX INFO: renamed from: r */
    public final c20 mo840r() {
        return this.f1377i.f1592a.f395I.f3995c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0749t2
    public final void requestLayout() {
        this.f1377i.f1592a.m284U(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0749t2
    /* JADX INFO: renamed from: s */
    public final InterfaceC0749t2 mo841s() {
        f60 f60Var;
        b60 b60VarM315v = this.f1377i.f1592a.m315v();
        if (b60VarM315v == null || (f60Var = b60VarM315v.f396J) == null) {
            return null;
        }
        return f60Var.f1608q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0749t2
    /* JADX INFO: renamed from: u */
    public final void mo842u() {
        this.f1391w = true;
        c60 c60Var = this.f1388t;
        c60Var.m498h();
        f60 f60Var = this.f1377i;
        boolean z = f60Var.f1597f;
        b60 b60Var = f60Var.f1592a;
        if (z) {
            sh0 sh0VarM319z = b60Var.m319z();
            Object[] objArr = sh0VarM319z.f5768d;
            int i = sh0VarM319z.f5770f;
            for (int i2 = 0; i2 < i; i2++) {
                b60 b60Var2 = (b60) objArr[i2];
                f60 f60Var2 = b60Var2.f396J;
                if (f60Var2.f1596e && b60Var2.m313t() == z50.f7800d) {
                    ec0 ec0Var = f60Var2.f1608q;
                    ec0Var.getClass();
                    ec0 ec0Var2 = f60Var2.f1608q;
                    C0617pj c0617pj = ec0Var2 != null ? ec0Var2.f1384p : null;
                    c0617pj.getClass();
                    if (ec0Var.m839m0(c0617pj.f4912a)) {
                        b60.m261V(b60Var, false, 7);
                    }
                }
            }
        }
        b20 b20Var = mo840r().f644U;
        b20Var.getClass();
        if (f60Var.f1598g || (!b20Var.f7597n && f60Var.f1597f)) {
            f60Var.f1597f = false;
            x50 x50Var = f60Var.f1595d;
            f60Var.f1595d = x50.f7267g;
            f60Var.m1040i(false);
            fn0 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) e60.m789a(b60Var)).getSnapshotObserver();
            snapshotObserver.f1778a.m777b(b60Var, snapshotObserver.f1785h, this.f1392x);
            f60Var.f1595d = x50Var;
            if (f60Var.f1604m && b20Var.f7597n) {
                requestLayout();
            }
            f60Var.f1598g = false;
        }
        if (c60Var.f708b && c60Var.m495e()) {
            c60Var.m497g();
        }
        this.f1391w = false;
    }
}
