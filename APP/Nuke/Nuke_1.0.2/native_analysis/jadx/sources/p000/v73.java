package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class v73 extends hd2 {

    /* JADX INFO: renamed from: l */
    public final ThreadLocal f11815l;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public v73(t00 t00Var, a20 a20Var) {
        C0588pp c0588pp = C0588pp.f8430j;
        super(t00Var, a20Var.mo15o(c0588pp) == null ? a20Var.mo14k(c0588pp) : a20Var);
        this.f11815l = new ThreadLocal();
        if (t00Var.mo2508f().mo15o(gd3.f3438p) instanceof c20) {
            return;
        }
        Object objM1629V = fg1.m1629V(a20Var, null);
        fg1.m1620M(a20Var, objM1629V);
        m5653m0(a20Var, objM1629V);
    }

    @Override // p000.hd2
    /* JADX INFO: renamed from: j0 */
    public final void mo2145j0() {
        m5652l0();
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m5651k0() {
        boolean z = this.threadLocalIsSet && this.f11815l.get() == null;
        this.f11815l.remove();
        return !z;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m5652l0() {
        if (this.threadLocalIsSet) {
            ow1 ow1Var = (ow1) this.f11815l.get();
            if (ow1Var != null) {
                fg1.m1620M((a20) ow1Var.f7862h, ow1Var.f7863i);
            }
            this.f11815l.remove();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m5653m0(a20 a20Var, Object obj) {
        this.threadLocalIsSet = true;
        this.f11815l.set(new ow1(a20Var, obj));
    }

    @Override // p000.hd2, p000.r21
    /* JADX INFO: renamed from: y */
    public final void mo2146y(Object obj) {
        m5652l0();
        Object objM1619L = fg1.m1619L(obj);
        t00 t00Var = this.f3961k;
        a20 a20VarMo2508f = t00Var.mo2508f();
        Object objM1629V = fg1.m1629V(a20VarMo2508f, null);
        v73 v73VarM4464R = objM1629V != fg1.f2981i ? rg3.m4464R(t00Var, a20VarMo2508f, objM1629V) : null;
        try {
            t00Var.mo2509h(objM1619L);
            if (v73VarM4464R == null || v73VarM4464R.m5651k0()) {
                fg1.m1620M(a20VarMo2508f, objM1629V);
            }
        } catch (Throwable th) {
            if (v73VarM4464R == null || v73VarM4464R.m5651k0()) {
                fg1.m1620M(a20VarMo2508f, objM1629V);
            }
            throw th;
        }
    }
}
