package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class RuntimeEvalError extends java.lang.RuntimeException {
    private bsh.EvalError error;

    public RuntimeEvalError(bsh.EvalError r1) {
            r0 = this;
            r0.<init>()
            r0.error = r1
            return
    }

    public RuntimeEvalError(java.lang.String r2, bsh.Node r3, bsh.CallStack r4) {
            r1 = this;
            r1.<init>()
            bsh.EvalError r0 = new bsh.EvalError
            r0.<init>(r2, r3, r4)
            r1.error = r0
            return
    }

    public RuntimeEvalError(java.lang.String r1, bsh.Node r2, bsh.CallStack r3, java.lang.Throwable r4) {
            r0 = this;
            r0.<init>()
            bsh.EvalError r4 = new bsh.EvalError
            r4.<init>(r1, r2, r3)
            r0.error = r4
            return
    }

    public int getErrorLineNumber() {
            r1 = this;
            bsh.EvalError r0 = r1.error
            int r0 = r0.getErrorLineNumber()
            return r0
    }

    public java.lang.String getErrorSourceFile() {
            r1 = this;
            bsh.EvalError r0 = r1.error
            java.lang.String r0 = r0.getErrorSourceFile()
            return r0
    }

    public java.lang.String getErrorText() {
            r1 = this;
            bsh.EvalError r0 = r1.error
            java.lang.String r0 = r0.getErrorText()
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
            r1 = this;
            bsh.EvalError r0 = r1.error
            java.lang.String r0 = r0.getMessage()
            return r0
    }

    public bsh.Node getNode() {
            r1 = this;
            bsh.EvalError r0 = r1.error
            bsh.Node r0 = r0.getNode()
            return r0
    }

    public java.lang.String getRawMessage() {
            r1 = this;
            bsh.EvalError r0 = r1.error
            java.lang.String r0 = r0.getRawMessage()
            return r0
    }

    public java.lang.String getScriptStackTrace() {
            r1 = this;
            bsh.EvalError r0 = r1.error
            java.lang.String r0 = r0.getScriptStackTrace()
            return r0
    }

    public bsh.EvalError reThrow(java.lang.String r2) {
            r1 = this;
            bsh.EvalError r0 = r1.error
            bsh.EvalError r2 = r0.reThrow(r2)
            return r2
    }

    public void setNode(bsh.Node r2) {
            r1 = this;
            bsh.EvalError r0 = r1.error
            r0.setNode(r2)
            return
    }
}
