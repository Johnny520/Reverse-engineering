package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class o21 extends mp {
    public final hv p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o21(t00 t00Var, hv hvVar) {
        super(1, t00Var);
        this.p = hvVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mp
    public final String B() {
        return "AwaitContinuation";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mp
    public final Throwable s(r21 r21Var) {
        Throwable thC;
        hv hvVar = this.p;
        hvVar.getClass();
        Object obj = r21.h.get(hvVar);
        return (!(obj instanceof q21) || (thC = ((q21) obj).c()) == null) ? obj instanceof ov ? ((ov) obj).a : r21Var.q() : thC;
    }
}
