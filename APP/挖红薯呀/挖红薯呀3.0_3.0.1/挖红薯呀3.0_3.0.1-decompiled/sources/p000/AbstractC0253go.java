package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: go */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0253go extends o61 {

    /* JADX INFO: renamed from: f */
    public int f2025f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0253go(int i) {
        super(0L, false);
        this.f2025f = i;
    }

    /* JADX INFO: renamed from: c */
    public abstract InterfaceC0322ik mo941c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public Throwable mo1251f(Object obj) {
        C0688rg c0688rg = obj instanceof C0688rg ? (C0688rg) obj : null;
        if (c0688rg != null) {
            return c0688rg.f5416a;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m1253h(Throwable th) {
        o30.m2780t(mo941c().mo540e(), new C0096cl("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* JADX INFO: renamed from: l */
    public abstract Object mo942l();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC0322ik interfaceC0322ikMo941c = mo941c();
            interfaceC0322ikMo941c.getClass();
            C0179eo c0179eo = (C0179eo) interfaceC0322ikMo941c;
            AbstractC0358jk abstractC0358jk = c0179eo.f1490h;
            Object obj = c0179eo.f1492j;
            InterfaceC0618pk interfaceC0618pkMo540e = abstractC0358jk.mo540e();
            Object objM4035V = s91.m4035V(interfaceC0618pkMo540e, obj);
            c40 c40Var = null;
            la1 la1VarM1521G = objM4035V != s91.f5695C ? AbstractC0307i4.m1521G(abstractC0358jk, interfaceC0618pkMo540e, objM4035V) : null;
            try {
                InterfaceC0618pk interfaceC0618pkMo540e2 = abstractC0358jk.mo540e();
                Object objMo942l = mo942l();
                Throwable thMo1251f = mo1251f(objMo942l);
                if (thMo1251f == null) {
                    int i = this.f2025f;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        c40Var = (c40) interfaceC0618pkMo540e2.mo64l(C0496n2.f4129I);
                    }
                }
                if (c40Var != null && !c40Var.mo479b()) {
                    CancellationException cancellationExceptionMo481o = c40Var.mo481o();
                    mo1250b(cancellationExceptionMo481o);
                    abstractC0358jk.mo541i(w60.m4909p(cancellationExceptionMo481o));
                } else if (thMo1251f != null) {
                    abstractC0358jk.mo541i(new bv0(thMo1251f));
                } else {
                    abstractC0358jk.mo541i(mo1252g(objMo942l));
                }
                if (la1VarM1521G != null && !la1VarM1521G.m2009m0()) {
                    return;
                }
                s91.m4026M(interfaceC0618pkMo540e, objM4035V);
            } catch (Throwable th) {
                if (la1VarM1521G == null || la1VarM1521G.m2009m0()) {
                    s91.m4026M(interfaceC0618pkMo540e, objM4035V);
                }
                throw th;
            }
        } catch (Throwable th2) {
            m1253h(th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo1250b(CancellationException cancellationException) {
    }

    /* JADX INFO: renamed from: g */
    public Object mo1252g(Object obj) {
        return obj;
    }
}
