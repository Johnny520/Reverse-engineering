package bsh;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class RuntimeEvalError extends RuntimeException {
    private EvalError error;

    public RuntimeEvalError(String str, InterfaceC3452 interfaceC3452, CallStack callStack, Throwable th) {
        this.error = new EvalError(str, interfaceC3452, callStack);
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

    public InterfaceC3452 getNode() {
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

    public void setNode(InterfaceC3452 interfaceC3452) {
        this.error.setNode(interfaceC3452);
    }

    public RuntimeEvalError(String str, InterfaceC3452 interfaceC3452, CallStack callStack) {
        this.error = new EvalError(str, interfaceC3452, callStack);
    }

    public RuntimeEvalError(EvalError evalError) {
        this.error = evalError;
    }
}
