package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m90 extends fy2 {

    /* JADX INFO: renamed from: j */
    public int f6520j;

    public m90(int i) {
        super(0L, false);
        this.f6520j = i;
    }

    /* JADX INFO: renamed from: c */
    public abstract t00 mo2616c();

    /* JADX INFO: renamed from: e */
    public Throwable mo3048e(Object obj) {
        C0557ov c0557ov = obj instanceof C0557ov ? (C0557ov) obj : null;
        if (c0557ov != null) {
            return c0557ov.f7856a;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m3050j(Throwable th) {
        AbstractC0691se.m4824M(mo2616c().mo2508f(), new n20("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* JADX INFO: renamed from: k */
    public abstract Object mo2617k();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            t00 t00VarMo2616c = mo2616c();
            t00VarMo2616c.getClass();
            k90 k90Var = (k90) t00VarMo2616c;
            u00 u00Var = k90Var.f5405l;
            Object obj = k90Var.f5407n;
            a20 a20VarMo2508f = u00Var.mo2508f();
            Object objM1629V = fg1.m1629V(a20VarMo2508f, obj);
            k21 k21Var = null;
            v73 v73VarM4464R = objM1629V != fg1.f2981i ? rg3.m4464R(u00Var, a20VarMo2508f, objM1629V) : null;
            try {
                a20 a20VarMo2508f2 = u00Var.mo2508f();
                Object objMo2617k = mo2617k();
                Throwable thMo3048e = mo3048e(objMo2617k);
                if (thMo3048e == null) {
                    int i = this.f6520j;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        k21Var = (k21) a20VarMo2508f2.mo15o(C0700sn.f10207K);
                    }
                }
                if (k21Var != null && !k21Var.mo1703b()) {
                    CancellationException cancellationExceptionMo1706q = k21Var.mo1706q();
                    mo3047b(cancellationExceptionMo1706q);
                    u00Var.mo2509h(fg1.m1644s(cancellationExceptionMo1706q));
                } else if (thMo3048e != null) {
                    u00Var.mo2509h(new x92(thMo3048e));
                } else {
                    u00Var.mo2509h(mo3049g(objMo2617k));
                }
                if (v73VarM4464R == null || v73VarM4464R.m5651k0()) {
                    fg1.m1620M(a20VarMo2508f, objM1629V);
                }
            } catch (Throwable th) {
                if (v73VarM4464R == null || v73VarM4464R.m5651k0()) {
                    fg1.m1620M(a20VarMo2508f, objM1629V);
                }
                throw th;
            }
        } catch (j90 e) {
            AbstractC0691se.m4824M(mo2616c().mo2508f(), e.f4923h);
        } catch (Throwable th2) {
            m3050j(th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo3047b(CancellationException cancellationException) {
    }

    /* JADX INFO: renamed from: g */
    public Object mo3049g(Object obj) {
        return obj;
    }
}
