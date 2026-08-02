package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tp1 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f10891l = 1;

    /* JADX INFO: renamed from: m */
    public int f10892m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean f10893n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f10894o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp1(b03 b03Var, boolean z, t00 t00Var) {
        super(2, t00Var);
        this.f10894o = b03Var;
        this.f10893n = z;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f10891l;
        a83 a83Var = a83.f116a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((tp1) mo13p(t00Var, j20Var)).mo7r(a83Var);
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = this.f10891l;
        boolean z = this.f10893n;
        Object obj2 = this.f10894o;
        switch (i) {
            case 0:
                return new tp1(z, (xk1) obj2, t00Var);
            default:
                return new tp1((b03) obj2, z, t00Var);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        InterfaceC0668rt interfaceC0668rt;
        int i = this.f10891l;
        boolean z = this.f10893n;
        k20 k20Var = k20.f5323h;
        a83 a83Var = a83.f116a;
        Object obj2 = this.f10894o;
        C0690sd c0690sdM5049A = null;
        switch (i) {
            case 0:
                xk1 xk1Var = (xk1) obj2;
                int i2 = this.f10892m;
                if (i2 == 0) {
                    fg1.m1627T(obj);
                    if (z) {
                        xk1Var.setValue(Boolean.TRUE);
                    } else if (((Boolean) xk1Var.getValue()).booleanValue()) {
                        C0953z8 c0953z8 = ad0.f155i;
                        ed0 ed0Var = ed0.MILLISECONDS;
                        long jM3895G = pp0.m3895G(150L, ed0Var);
                        this.f10892m = 1;
                        long jM135f = 0;
                        boolean z2 = jM3895G > 0;
                        if (z2) {
                            long jM134e = ad0.m134e(jM3895G, pp0.m3895G(999999L, ed0.NANOSECONDS));
                            jM135f = ((((int) jM134e) & 1) != 1 || ad0.m133d(jM134e)) ? ad0.m135f(jM134e, ed0Var) : jM134e >> 1;
                        } else if (z2) {
                            c80.m675s();
                            return null;
                        }
                        Object objM1425F = AbstractC0179eu.m1425F(jM135f, this);
                        if (objM1425F != k20Var) {
                            objM1425F = a83Var;
                        }
                        if (objM1425F == k20Var) {
                            return k20Var;
                        }
                        xk1Var.setValue(Boolean.FALSE);
                    }
                } else {
                    if (i2 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.m1627T(obj);
                    xk1Var.setValue(Boolean.FALSE);
                }
                return a83Var;
            default:
                b03 b03Var = (b03) obj2;
                int i3 = this.f10892m;
                if (i3 == 0) {
                    fg1.m1627T(obj);
                    if (!f13.m1494c(b03Var.m350n().f5297b) && !(b03Var.f485f instanceof tx1)) {
                        c0690sdM5049A = t11.m5049A(b03Var.m350n());
                        if (z) {
                            int iM1496e = f13.m1496e(b03Var.m350n().f5297b);
                            b03Var.f482c.mo5j(b03.m340e(b03Var.m350n().f5296a, fg1.m1636i(iM1496e, iM1496e)));
                            b03Var.m353q(tr0.f10906h);
                        }
                    }
                    if (c0690sdM5049A != null && (interfaceC0668rt = b03Var.f487h) != null) {
                        C0631qt c0631qtM3575A = op0.m3575A(c0690sdM5049A);
                        this.f10892m = 1;
                        ((C0303i6) interfaceC0668rt).m2279a(c0631qtM3575A);
                        if (a83Var == k20Var) {
                            return k20Var;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.m1627T(obj);
                }
                return a83Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp1(boolean z, xk1 xk1Var, t00 t00Var) {
        super(2, t00Var);
        this.f10893n = z;
        this.f10894o = xk1Var;
    }
}
