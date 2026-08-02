package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vw0 extends ww0 {

    /* JADX INFO: renamed from: d */
    public final InterfaceC0930yo f12196d;

    /* JADX INFO: renamed from: e */
    public final boolean f12197e;

    public vw0(v82 v82Var, et1 et1Var, x00 x00Var, InterfaceC0930yo interfaceC0930yo, boolean z) {
        super(v82Var, et1Var, x00Var);
        this.f12196d = interfaceC0930yo;
        this.f12197e = z;
    }

    @Override // p000.ww0
    /* JADX INFO: renamed from: a */
    public final Object mo5587a(ct1 ct1Var, Object[] objArr) {
        InterfaceC0854wo interfaceC0854wo = (InterfaceC0854wo) this.f12196d.mo2578i(ct1Var);
        t00 t00Var = (t00) objArr[objArr.length - 1];
        try {
            try {
                if (!this.f12197e) {
                    return tp0.m5363h(interfaceC0854wo, t00Var);
                }
                try {
                    interfaceC0854wo.getClass();
                    return tp0.m5364i(interfaceC0854wo, t00Var);
                } catch (LinkageError e) {
                    throw e;
                } catch (ThreadDeath e2) {
                    throw e2;
                }
            } catch (LinkageError | ThreadDeath | VirtualMachineError e3) {
                throw e3;
            }
        } catch (Throwable th) {
            tp0.m5352P(th, t00Var);
            return k20.f5323h;
        }
    }
}
