package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tp1 extends tw2 implements mn0 {
    public final /* synthetic */ int l = 1;
    public int m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Object o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp1(b03 b03Var, boolean z, t00 t00Var) {
        super(2, t00Var);
        this.o = b03Var;
        this.n = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.l;
        a83 a83Var = a83.a;
        j20 j20Var = (j20) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((tp1) p(t00Var, j20Var)).r(a83Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        int i = this.l;
        boolean z = this.n;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                return new tp1(z, (xk1) obj2, t00Var);
            default:
                return new tp1((b03) obj2, z, t00Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        rt rtVar;
        int i = this.l;
        boolean z = this.n;
        k20 k20Var = k20.h;
        a83 a83Var = a83.a;
        Object obj2 = this.o;
        sd sdVarA = null;
        switch (i) {
            case 0:
                xk1 xk1Var = (xk1) obj2;
                int i2 = this.m;
                if (i2 == 0) {
                    fg1.T(obj);
                    if (z) {
                        xk1Var.setValue(Boolean.TRUE);
                    } else if (((Boolean) xk1Var.getValue()).booleanValue()) {
                        z8 z8Var = ad0.i;
                        ed0 ed0Var = ed0.MILLISECONDS;
                        long jG = pp0.G(150L, ed0Var);
                        this.m = 1;
                        long jF = 0;
                        boolean z2 = jG > 0;
                        if (z2) {
                            long jE = ad0.e(jG, pp0.G(999999L, ed0.NANOSECONDS));
                            jF = ((((int) jE) & 1) != 1 || ad0.d(jE)) ? ad0.f(jE, ed0Var) : jE >> 1;
                        } else if (z2) {
                            c80.s();
                            return null;
                        }
                        Object objF = eu.F(jF, this);
                        if (objF != k20Var) {
                            objF = a83Var;
                        }
                        if (objF == k20Var) {
                            return k20Var;
                        }
                        xk1Var.setValue(Boolean.FALSE);
                    }
                } else {
                    if (i2 != 1) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.T(obj);
                    xk1Var.setValue(Boolean.FALSE);
                }
                return a83Var;
            default:
                b03 b03Var = (b03) obj2;
                int i3 = this.m;
                if (i3 == 0) {
                    fg1.T(obj);
                    if (!f13.c(b03Var.n().b) && !(b03Var.f instanceof tx1)) {
                        sdVarA = t11.A(b03Var.n());
                        if (z) {
                            int iE = f13.e(b03Var.n().b);
                            b03Var.c.j(b03.e(b03Var.n().a, fg1.i(iE, iE)));
                            b03Var.q(tr0.h);
                        }
                    }
                    if (sdVarA != null && (rtVar = b03Var.h) != null) {
                        qt qtVarA = op0.A(sdVarA);
                        this.m = 1;
                        ((i6) rtVar).a(qtVarA);
                        if (a83Var == k20Var) {
                            return k20Var;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fg1.T(obj);
                }
                return a83Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp1(boolean z, xk1 xk1Var, t00 t00Var) {
        super(2, t00Var);
        this.n = z;
        this.o = xk1Var;
    }
}
