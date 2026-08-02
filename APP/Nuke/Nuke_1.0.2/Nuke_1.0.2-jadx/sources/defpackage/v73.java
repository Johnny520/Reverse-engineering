package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class v73 extends hd2 {
    public final ThreadLocal l;
    private volatile boolean threadLocalIsSet;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public v73(t00 t00Var, a20 a20Var) {
        pp ppVar = pp.j;
        super(t00Var, a20Var.o(ppVar) == null ? a20Var.k(ppVar) : a20Var);
        this.l = new ThreadLocal();
        if (t00Var.f().o(gd3.p) instanceof c20) {
            return;
        }
        Object objV = fg1.V(a20Var, null);
        fg1.M(a20Var, objV);
        m0(a20Var, objV);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.hd2
    public final void j0() {
        l0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean k0() {
        boolean z = this.threadLocalIsSet && this.l.get() == null;
        this.l.remove();
        return !z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l0() {
        if (this.threadLocalIsSet) {
            ow1 ow1Var = (ow1) this.l.get();
            if (ow1Var != null) {
                fg1.M((a20) ow1Var.h, ow1Var.i);
            }
            this.l.remove();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m0(a20 a20Var, Object obj) {
        this.threadLocalIsSet = true;
        this.l.set(new ow1(a20Var, obj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.hd2, defpackage.r21
    public final void y(Object obj) {
        l0();
        Object objL = fg1.L(obj);
        t00 t00Var = this.k;
        a20 a20VarF = t00Var.f();
        Object objV = fg1.V(a20VarF, null);
        v73 v73VarR = objV != fg1.i ? rg3.R(t00Var, a20VarF, objV) : null;
        try {
            t00Var.h(objL);
            if (v73VarR == null || v73VarR.k0()) {
                fg1.M(a20VarF, objV);
            }
        } catch (Throwable th) {
            if (v73VarR == null || v73VarR.k0()) {
                fg1.M(a20VarF, objV);
            }
            throw th;
        }
    }
}
