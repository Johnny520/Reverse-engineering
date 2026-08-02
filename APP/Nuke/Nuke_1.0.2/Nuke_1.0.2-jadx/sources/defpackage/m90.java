package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m90 extends fy2 {
    public int j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m90(int i) {
        super(0L, false);
        this.j = i;
    }

    public abstract t00 c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Throwable e(Object obj) {
        ov ovVar = obj instanceof ov ? (ov) obj : null;
        if (ovVar != null) {
            return ovVar.a;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(Throwable th) {
        se.M(c().f(), new n20("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object k();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            t00 t00VarC = c();
            t00VarC.getClass();
            k90 k90Var = (k90) t00VarC;
            u00 u00Var = k90Var.l;
            Object obj = k90Var.n;
            a20 a20VarF = u00Var.f();
            Object objV = fg1.V(a20VarF, obj);
            k21 k21Var = null;
            v73 v73VarR = objV != fg1.i ? rg3.R(u00Var, a20VarF, objV) : null;
            try {
                a20 a20VarF2 = u00Var.f();
                Object objK = k();
                Throwable thE = e(objK);
                if (thE == null) {
                    int i = this.j;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        k21Var = (k21) a20VarF2.o(sn.K);
                    }
                }
                if (k21Var != null && !k21Var.b()) {
                    CancellationException cancellationExceptionQ = k21Var.q();
                    b(cancellationExceptionQ);
                    u00Var.h(fg1.s(cancellationExceptionQ));
                } else if (thE != null) {
                    u00Var.h(new x92(thE));
                } else {
                    u00Var.h(g(objK));
                }
                if (v73VarR == null || v73VarR.k0()) {
                    fg1.M(a20VarF, objV);
                }
            } catch (Throwable th) {
                if (v73VarR == null || v73VarR.k0()) {
                    fg1.M(a20VarF, objV);
                }
                throw th;
            }
        } catch (j90 e) {
            se.M(c().f(), e.h);
        } catch (Throwable th2) {
            j(th2);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object g(Object obj) {
        return obj;
    }
}
