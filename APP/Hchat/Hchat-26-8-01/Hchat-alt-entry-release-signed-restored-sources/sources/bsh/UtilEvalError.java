package bsh;

import okhttp3.HttpUrl;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class UtilEvalError extends Exception {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public UtilEvalError() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EvalError toEvalError(String str, Node node, CallStack callStack) {
        if (Interpreter.DEBUG.get().booleanValue()) {
            printStackTrace();
        }
        return new EvalError((str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str.concat(": ")) + getMessage(), node, callStack, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EvalException toEvalException(String str, Node node, CallStack callStack) {
        if (Interpreter.DEBUG.get().booleanValue()) {
            printStackTrace();
        }
        return new EvalException((str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str.concat(": ")) + getMessage(), node, callStack, this);
    }

    public UtilEvalError(String str) {
        super(str);
    }

    public UtilEvalError(String str, Throwable th2) {
        super(str, th2);
    }

    public EvalError toEvalError(Node node, CallStack callStack) {
        return toEvalError(null, node, callStack);
    }

    public EvalException toEvalException(Node node, CallStack callStack) {
        return toEvalException(null, node, callStack);
    }
}
