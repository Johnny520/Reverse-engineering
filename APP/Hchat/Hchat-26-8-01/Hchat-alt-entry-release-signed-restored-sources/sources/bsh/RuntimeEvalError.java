package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class RuntimeEvalError extends RuntimeException {
    private EvalError error;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RuntimeEvalError(String str, Node node, CallStack callStack, Throwable th2) {
        this.error = new EvalError(str, node, callStack);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getErrorLineNumber() {
        return this.error.getErrorLineNumber();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getErrorSourceFile() {
        return this.error.getErrorSourceFile();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getErrorText() {
        return this.error.getErrorText();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.error.getMessage();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Node getNode() {
        return this.error.getNode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getRawMessage() {
        return this.error.getRawMessage();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getScriptStackTrace() {
        return this.error.getScriptStackTrace();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EvalError reThrow(String str) {
        return this.error.reThrow(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setNode(Node node) {
        this.error.setNode(node);
    }

    public RuntimeEvalError(String str, Node node, CallStack callStack) {
        this.error = new EvalError(str, node, callStack);
    }

    public RuntimeEvalError(EvalError evalError) {
        this.error = evalError;
    }
}
