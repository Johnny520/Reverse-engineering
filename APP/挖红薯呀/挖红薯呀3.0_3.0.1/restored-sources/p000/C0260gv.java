package p000;

/* JADX INFO: renamed from: gv */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0260gv extends AbstractC0731sm implements vz0, InterfaceC0529nx, InterfaceC1005zi, mk0, h91 {

    /* JADX INFO: renamed from: z */
    public static final C0675r3 f2056z = new C0675r3(18);

    /* JADX INFO: renamed from: t */
    public xg0 f2057t;

    /* JADX INFO: renamed from: u */
    public final C0191f f2058u;

    /* JADX INFO: renamed from: v */
    public C0702ru f2059v;

    /* JADX INFO: renamed from: w */
    public y70 f2060w;

    /* JADX INFO: renamed from: x */
    public qj0 f2061x;

    /* JADX INFO: renamed from: y */
    public final C0149dv f2062y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0260gv(xg0 xg0Var, C0191f c0191f) {
        this.f2057t = xg0Var;
        this.f2058u = c0191f;
        C0149dv c0149dv = new C0149dv(0, new C0223fv(2, 0, C0260gv.class, this, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V"), 10);
        m4086w0(c0149dv);
        this.f2062y = c0149dv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:35:0x0067 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:63:0x0076 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:65:0x002e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:67:0x002e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:70:0x0070 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [oe0] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [oe0] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [sh0] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [sh0] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX INFO: renamed from: A0 */
    public final void m1255A0() {
        mj0 mj0Var;
        if (this.f4542q) {
            if (!this.f4529d.f4542q) {
                w10.m4824b("visitAncestors called on an unattached node");
            }
            oe0 oe0Var = this.f4529d.f4533h;
            b60 b60VarM3039Q = pf1.m3039Q(this);
            while (b60VarM3039Q != null) {
                if ((b60VarM3039Q.f395I.f3998f.f4532g & 262144) != 0) {
                    while (oe0Var != null) {
                        if ((oe0Var.f4531f & 262144) != 0) {
                            ?? M3050f = oe0Var;
                            ?? sh0Var = 0;
                            while (M3050f != 0) {
                                if (M3050f instanceof h91) {
                                    if (AbstractC0297hv.f2369r == ((h91) M3050f).mo1247k()) {
                                        return;
                                    }
                                } else if ((M3050f.f4531f & 262144) != 0 && (M3050f instanceof AbstractC0731sm)) {
                                    oe0 oe0Var2 = ((AbstractC0731sm) M3050f).f5782s;
                                    int i = 0;
                                    M3050f = M3050f;
                                    sh0Var = sh0Var;
                                    while (oe0Var2 != null) {
                                        if ((oe0Var2.f4531f & 262144) != 0) {
                                            i++;
                                            sh0Var = sh0Var;
                                            if (i == 1) {
                                                M3050f = oe0Var2;
                                            } else {
                                                if (sh0Var == 0) {
                                                    sh0Var = new sh0(new oe0[16]);
                                                }
                                                if (M3050f != 0) {
                                                    sh0Var.m4072b(M3050f);
                                                    M3050f = 0;
                                                }
                                                sh0Var.m4072b(oe0Var2);
                                            }
                                        }
                                        oe0Var2 = oe0Var2.f4534i;
                                        M3050f = M3050f;
                                        sh0Var = sh0Var;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                M3050f = pf1.m3050f(sh0Var);
                            }
                        }
                        oe0Var = oe0Var.f4533h;
                    }
                }
                b60VarM3039Q = b60VarM3039Q.m315v();
                oe0Var = (b60VarM3039Q == null || (mj0Var = b60VarM3039Q.f395I) == null) ? null : mj0Var.f3997e;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B0 */
    public final void m1256B0(xg0 xg0Var) {
        C0702ru c0702ru;
        if (p30.m3002l(this.f2057t, xg0Var)) {
            return;
        }
        xg0 xg0Var2 = this.f2057t;
        if (xg0Var2 != null && (c0702ru = this.f2059v) != null) {
            xg0Var2.m5136c(new C0739su(c0702ru));
        }
        this.f2059v = null;
        this.f2057t = xg0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.vz0
    /* JADX INFO: renamed from: S */
    public final void mo757S(f01 f01Var) {
        boolean zM603a = this.f2062y.m727B0().m603a();
        u40[] u40VarArr = d01.f923a;
        e01 e01Var = b01.f332k;
        u40 u40Var = d01.f923a[4];
        f01Var.mo17a(e01Var, Boolean.valueOf(zM603a));
        f01Var.mo17a(rz0.f5609v, new C0533o0(null, new C0417l3(0, this, C0260gv.class, "requestFocus", "requestFocus()Z", 0, 2)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.h91
    /* JADX INFO: renamed from: k */
    public final Object mo1247k() {
        return f2056z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: l0 */
    public final boolean mo548l0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0529nx
    /* JADX INFO: renamed from: n */
    public final void mo1257n(qj0 qj0Var) {
        this.f2061x = qj0Var;
        if (this.f2062y.m727B0().m603a()) {
            if (!qj0Var.mo436G0().f4542q) {
                m1255A0();
                return;
            }
            qj0 qj0Var2 = this.f2061x;
            if (qj0Var2 == null || !qj0Var2.mo436G0().f4542q) {
                return;
            }
            m1255A0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: q0 */
    public final void mo694q0() {
        y70 y70Var = this.f2060w;
        if (y70Var != null) {
            y70Var.m5215b();
        }
        this.f2060w = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.mk0
    /* JADX INFO: renamed from: z */
    public final void mo734z() {
        zt0 zt0Var = new zt0();
        r60.m3420v(this, new C0081c7(3, zt0Var, this));
        y70 y70Var = (y70) zt0Var.f7995d;
        if (this.f2062y.m727B0().m603a()) {
            y70 y70Var2 = this.f2060w;
            if (y70Var2 != null) {
                y70Var2.m5215b();
            }
            if (y70Var != null) {
                y70Var.m5214a();
            } else {
                y70Var = null;
            }
            this.f2060w = y70Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z0 */
    public final void m1258z0(xg0 xg0Var, f30 f30Var) {
        if (!this.f4542q) {
            xg0Var.m5136c(f30Var);
            return;
        }
        c40 c40Var = (c40) ((C0286hk) m2879k0()).f2274d.mo64l(C0496n2.f4129I);
        AbstractC0307i4.m1547w(m2879k0(), null, new C0302i(xg0Var, f30Var, c40Var != null ? c40Var.mo482r(new C0073c(5, xg0Var, f30Var)) : null, null, 6), 3);
    }
}
