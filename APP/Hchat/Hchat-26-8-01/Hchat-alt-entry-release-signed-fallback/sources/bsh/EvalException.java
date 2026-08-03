package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class EvalException extends bsh.EvalError {
    public EvalException(java.lang.String r1, bsh.Node r2, bsh.CallStack r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public EvalException(java.lang.String r1, bsh.Node r2, bsh.CallStack r3, java.lang.Throwable r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // bsh.EvalError
    public /* bridge */ /* synthetic */ bsh.EvalError reThrow(java.lang.String r1) {
            r0 = this;
            bsh.EvalException r1 = r0.reThrow(r1)
            return r1
    }

    @Override // bsh.EvalError
    public bsh.EvalException reThrow(java.lang.String r1) {
            r0 = this;
            r0.prependMessage(r1)
            return r0
    }
}
