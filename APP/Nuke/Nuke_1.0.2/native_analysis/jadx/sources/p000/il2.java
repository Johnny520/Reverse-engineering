package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class il2 extends th1 implements j61, on2 {

    /* JADX INFO: renamed from: v */
    public nl2 f4676v;

    /* JADX INFO: renamed from: w */
    public boolean f4677w;

    @Override // p000.j61
    /* JADX INFO: renamed from: D */
    public final int mo2360D(kd1 kd1Var, if1 if1Var, int i) {
        if (!this.f4677w) {
            i = Integer.MAX_VALUE;
        }
        return if1Var.mo2339X(i);
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: U */
    public final int mo2361U(kd1 kd1Var, if1 if1Var, int i) {
        if (this.f4677w) {
            i = Integer.MAX_VALUE;
        }
        return if1Var.mo2337N(i);
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: e */
    public final of1 mo1363e(pf1 pf1Var, if1 if1Var, long j) {
        AbstractC0731te.m5228p(j, this.f4677w ? qv1.f9205h : qv1.f9206i);
        sz1 sz1VarMo2340e = if1Var.mo2340e(C0221fz.m1756a(j, 0, this.f4677w ? C0221fz.m1763h(j) : Integer.MAX_VALUE, 0, this.f4677w ? Integer.MAX_VALUE : C0221fz.m1762g(j), 5));
        int i = sz1VarMo2340e.f10438h;
        int iM1763h = C0221fz.m1763h(j);
        if (i > iM1763h) {
            i = iM1763h;
        }
        int i2 = sz1VarMo2340e.f10439i;
        int iM1762g = C0221fz.m1762g(j);
        if (i2 > iM1762g) {
            i2 = iM1762g;
        }
        int i3 = sz1VarMo2340e.f10439i - i2;
        int i4 = sz1VarMo2340e.f10438h - i;
        if (!this.f4677w) {
            i3 = i4;
        }
        nl2 nl2Var = this.f4676v;
        kx1 kx1Var = nl2Var.f7220e;
        kx1 kx1Var2 = nl2Var.f7216a;
        kx1Var.m2760h(i3);
        vr2 vr2VarM5275B = AbstractC0738tl.m5275B();
        in0 in0VarMo77e = vr2VarM5275B != null ? vr2VarM5275B.mo77e() : null;
        vr2 vr2VarM5283K = AbstractC0738tl.m5283K(vr2VarM5275B);
        try {
            if (kx1Var2.m2759g() > i3) {
                kx1Var2.m2760h(i3);
            }
            AbstractC0738tl.m5292U(vr2VarM5275B, vr2VarM5283K, in0VarMo77e);
            this.f4676v.f7217b.m2760h(this.f4677w ? i2 : i);
            this.f4676v.f7218c.m2760h(this.f4677w ? sz1VarMo2340e.f10439i : sz1VarMo2340e.f10438h);
            return pf1Var.mo696j0(i, i2, ce0.f1492h, new a62(i3, 1, this, sz1VarMo2340e));
        } catch (Throwable th) {
            AbstractC0738tl.m5292U(vr2VarM5275B, vr2VarM5283K, in0VarMo77e);
            throw th;
        }
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: g */
    public final int mo2362g(kd1 kd1Var, if1 if1Var, int i) {
        if (this.f4677w) {
            i = Integer.MAX_VALUE;
        }
        return if1Var.mo2338W(i);
    }

    @Override // p000.on2
    /* JADX INFO: renamed from: l0 */
    public final void mo232l0(zn2 zn2Var) {
        v41[] v41VarArr = xn2.f13086a;
        yn2 yn2Var = vn2.f12071n;
        v41[] v41VarArr2 = xn2.f13086a;
        v41 v41Var = v41VarArr2[6];
        zn2Var.mo1533a(yn2Var, Boolean.TRUE);
        final int i = 0;
        final int i2 = 1;
        el2 el2Var = new el2(new xm0(this) { // from class: hl2

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ il2 f4074i;

            {
                this.f4074i = this;
            }

            @Override // p000.xm0
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                int iM2759g;
                int i3 = i;
                il2 il2Var = this.f4074i;
                switch (i3) {
                    case 0:
                        iM2759g = il2Var.f4676v.f7216a.m2759g();
                        break;
                    default:
                        iM2759g = il2Var.f4676v.f7220e.m2759g();
                        break;
                }
                return Float.valueOf(iM2759g);
            }
        }, new xm0(this) { // from class: hl2

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ il2 f4074i;

            {
                this.f4074i = this;
            }

            @Override // p000.xm0
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                int iM2759g;
                int i3 = i2;
                il2 il2Var = this.f4074i;
                switch (i3) {
                    case 0:
                        iM2759g = il2Var.f4676v.f7216a.m2759g();
                        break;
                    default:
                        iM2759g = il2Var.f4676v.f7220e.m2759g();
                        break;
                }
                return Float.valueOf(iM2759g);
            }
        });
        if (this.f4677w) {
            yn2 yn2Var2 = vn2.f12080w;
            v41 v41Var2 = v41VarArr2[13];
            zn2Var.mo1533a(yn2Var2, el2Var);
        } else {
            yn2 yn2Var3 = vn2.f12079v;
            v41 v41Var3 = v41VarArr2[12];
            zn2Var.mo1533a(yn2Var3, el2Var);
        }
    }

    @Override // p000.j61
    /* JADX INFO: renamed from: p */
    public final int mo2363p(kd1 kd1Var, if1 if1Var, int i) {
        if (!this.f4677w) {
            i = Integer.MAX_VALUE;
        }
        return if1Var.mo2341f(i);
    }
}
