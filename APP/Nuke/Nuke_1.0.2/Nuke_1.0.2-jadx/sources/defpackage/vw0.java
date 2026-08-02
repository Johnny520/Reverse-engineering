package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vw0 extends ww0 {
    public final yo d;
    public final boolean e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vw0(v82 v82Var, et1 et1Var, x00 x00Var, yo yoVar, boolean z) {
        super(v82Var, et1Var, x00Var);
        this.d = yoVar;
        this.e = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ww0
    public final Object a(ct1 ct1Var, Object[] objArr) {
        wo woVar = (wo) this.d.i(ct1Var);
        t00 t00Var = (t00) objArr[objArr.length - 1];
        try {
            try {
                if (!this.e) {
                    return tp0.h(woVar, t00Var);
                }
                try {
                    woVar.getClass();
                    return tp0.i(woVar, t00Var);
                } catch (LinkageError e) {
                    throw e;
                } catch (ThreadDeath e2) {
                    throw e2;
                }
            } catch (LinkageError | ThreadDeath | VirtualMachineError e3) {
                throw e3;
            }
        } catch (Throwable th) {
            tp0.P(th, t00Var);
            return k20.h;
        }
    }
}
