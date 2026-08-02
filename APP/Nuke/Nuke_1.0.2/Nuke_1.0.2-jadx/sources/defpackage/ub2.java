package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ub2 extends u00 implements ak0 {
    public final ak0 k;
    public final a20 l;
    public final int m;
    public a20 n;
    public t00 o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ub2(ak0 ak0Var, a20 a20Var) {
        super(nv.j, zd0.h);
        this.k = ak0Var;
        this.l = a20Var;
        this.m = ((Number) a20Var.r(new eg1((byte) 0, 15), 0)).intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj, defpackage.l20
    public final l20 d() {
        t00 t00Var = this.o;
        if (t00Var instanceof l20) {
            return (l20) t00Var;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.u00, defpackage.t00
    public final a20 f() {
        a20 a20Var = this.n;
        return a20Var == null ? zd0.h : a20Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ak0
    public final Object m(Object obj, t00 t00Var) {
        try {
            Object objT = t(t00Var, obj);
            return objT == k20.h ? objT : a83.a;
        } catch (Throwable th) {
            this.n = new ya0(t00Var.f(), th);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final StackTraceElement q() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        Throwable thA = y92.a(obj);
        if (thA != null) {
            this.n = new ya0(f(), thA);
        }
        t00 t00Var = this.o;
        if (t00Var != null) {
            t00Var.h(obj);
        }
        return k20.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object t(t00 t00Var, Object obj) {
        a20 a20VarF = t00Var.f();
        xe1.n(a20VarF);
        a20 a20Var = this.n;
        if (a20Var != a20VarF) {
            if (a20Var instanceof ya0) {
                throw new IllegalStateException(qv2.S("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((ya0) a20Var).i + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) a20VarF.r(new s9(15, this), 0)).intValue() != this.m) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.l + ",\n\t\tbut emission happened in " + a20VarF + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.n = a20VarF;
        }
        this.o = t00Var;
        nn0 nn0Var = wb2.a;
        ak0 ak0Var = this.k;
        ak0Var.getClass();
        Object objE = nn0Var.e(ak0Var, obj, this);
        if (!t11.l(objE, k20.h)) {
            this.o = null;
        }
        return objE;
    }
}
