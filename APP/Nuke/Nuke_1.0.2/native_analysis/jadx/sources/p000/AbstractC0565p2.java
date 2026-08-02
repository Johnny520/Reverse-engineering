package p000;

/* JADX INFO: renamed from: p2 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0565p2 extends r21 implements t00, j20 {

    /* JADX INFO: renamed from: j */
    public final a20 f7930j;

    public AbstractC0565p2(a20 a20Var, boolean z) {
        super(z);
        m4315Q((k21) a20Var.mo15o(C0700sn.f10207K));
        this.f7930j = a20Var.mo14k(this);
    }

    @Override // p000.r21
    /* JADX INFO: renamed from: F */
    public final String mo3677F() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // p000.r21
    /* JADX INFO: renamed from: P */
    public final void mo3678P(C0594pv c0594pv) {
        AbstractC0691se.m4824M(this.f7930j, c0594pv);
    }

    @Override // p000.r21
    /* JADX INFO: renamed from: Y */
    public final void mo3679Y(Object obj) {
        if (!(obj instanceof C0557ov)) {
            mo3479h0(obj);
        } else {
            C0557ov c0557ov = (C0557ov) obj;
            mo3478g0(c0557ov.f7856a, C0557ov.f7855b.get(c0557ov) == 1);
        }
    }

    @Override // p000.t00
    /* JADX INFO: renamed from: f */
    public final a20 mo2508f() {
        return this.f7930j;
    }

    @Override // p000.j20
    /* JADX INFO: renamed from: g */
    public final a20 mo705g() {
        return this.f7930j;
    }

    @Override // p000.t00
    /* JADX INFO: renamed from: h */
    public final void mo2509h(Object obj) {
        Throwable thM6237a = y92.m6237a(obj);
        if (thM6237a != null) {
            obj = new C0557ov(thM6237a, false);
        }
        Object objM4318U = m4318U(obj);
        if (objM4318U == AbstractC0179eu.f2632f) {
            return;
        }
        mo2146y(objM4318U);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m3680i0(m20 m20Var, AbstractC0565p2 abstractC0565p2, mn0 mn0Var) {
        Object objMo12g;
        int iOrdinal = m20Var.ordinal();
        a83 a83Var = a83.f116a;
        if (iOrdinal == 0) {
            try {
                p40.m3706Q(gf1.m1908z(gf1.m1898p(abstractC0565p2, this, mn0Var)), a83Var);
                return;
            } finally {
                th = th;
                if (th instanceof j90) {
                    th = ((j90) th).f4923h;
                }
                mo2509h(fg1.m1644s(th));
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                mn0Var.getClass();
                gf1.m1908z(gf1.m1898p(abstractC0565p2, this, mn0Var)).mo2509h(a83Var);
                return;
            }
            if (iOrdinal != 3) {
                c80.m675s();
                return;
            }
            try {
                a20 a20Var = this.f7930j;
                Object objM1629V = fg1.m1629V(a20Var, null);
                try {
                    if (mn0Var instanceof AbstractC0658rj) {
                        xe1.m6119f(2, mn0Var);
                        objMo12g = mn0Var.mo12g(abstractC0565p2, this);
                    } else {
                        objMo12g = gf1.m1886d0(mn0Var, abstractC0565p2, this);
                    }
                    fg1.m1620M(a20Var, objM1629V);
                    if (objMo12g != k20.f5323h) {
                        mo2509h(objMo12g);
                    }
                } catch (Throwable th) {
                    fg1.m1620M(a20Var, objM1629V);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void mo3479h0(Object obj) {
    }

    /* JADX INFO: renamed from: g0 */
    public void mo3478g0(Throwable th, boolean z) {
    }
}
