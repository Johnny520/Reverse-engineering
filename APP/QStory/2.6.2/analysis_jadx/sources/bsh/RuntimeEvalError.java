package bsh;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class RuntimeEvalError extends RuntimeException {
    private EvalError error;

    public RuntimeEvalError(String str, InterfaceC2618 interfaceC2618, CallStack callStack, Throwable th) {
        this.error = new EvalError(str, interfaceC2618, callStack);
    }

    public int getErrorLineNumber() {
        return this.error.getErrorLineNumber();
    }

    public String getErrorSourceFile() {
        return this.error.getErrorSourceFile();
    }

    public String getErrorText() {
        return this.error.getErrorText();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.error.getMessage();
    }

    public InterfaceC2618 getNode() {
        return this.error.getNode();
    }

    public String getRawMessage() {
        return this.error.getRawMessage();
    }

    public String getScriptStackTrace() {
        return this.error.getScriptStackTrace();
    }

    public EvalError reThrow(String str) {
        return this.error.reThrow(str);
    }

    public void setNode(InterfaceC2618 interfaceC2618) {
        this.error.setNode(interfaceC2618);
    }

    public RuntimeEvalError(String str, InterfaceC2618 interfaceC2618, CallStack callStack) {
        this.error = new EvalError(str, interfaceC2618, callStack);
    }

    public RuntimeEvalError(EvalError evalError) {
        this.error = evalError;
    }
}
