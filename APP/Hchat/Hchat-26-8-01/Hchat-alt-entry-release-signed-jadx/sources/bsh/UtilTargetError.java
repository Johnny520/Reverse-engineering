package bsh;

import p025bc.AbstractC0255e;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class UtilTargetError extends UtilEvalError {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public UtilTargetError(Throwable th2) {
        this(th2.getMessage(), th2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.UtilEvalError
    public EvalError toEvalError(String str, Node node, CallStack callStack) {
        String string;
        if (str == null) {
            string = getMessage();
        } else {
            StringBuilder sbM1025n = AbstractC0255e.m1025n(str, ": ");
            sbM1025n.append(getMessage());
            string = sbM1025n.toString();
        }
        return new TargetError(string, getCause(), node, callStack, false);
    }

    public UtilTargetError(String str, Throwable th2) {
        super(str);
        initCause(th2);
    }
}
