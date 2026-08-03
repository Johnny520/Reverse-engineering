package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class UtilTargetError extends bsh.UtilEvalError {
    public UtilTargetError(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r1)
            r0.initCause(r2)
            return
    }

    public UtilTargetError(java.lang.Throwable r2) {
            r1 = this;
            java.lang.String r0 = r2.getMessage()
            r1.<init>(r0, r2)
            return
    }

    @Override // bsh.UtilEvalError
    public bsh.EvalError toEvalError(java.lang.String r7, bsh.Node r8, bsh.CallStack r9) {
            r6 = this;
            if (r7 != 0) goto L8
            java.lang.String r7 = r6.getMessage()
        L6:
            r1 = r7
            goto L1a
        L8:
            java.lang.String r0 = ": "
            java.lang.StringBuilder r7 = bc.e.n(r7, r0)
            java.lang.String r0 = r6.getMessage()
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            goto L6
        L1a:
            bsh.TargetError r0 = new bsh.TargetError
            java.lang.Throwable r2 = r6.getCause()
            r5 = 0
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }
}
