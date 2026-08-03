package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class EvalException extends EvalError {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EvalException(String str, Node node, CallStack callStack, Throwable th2) {
        super(str, node, callStack, th2);
    }

    public EvalException(String str, Node node, CallStack callStack) {
        super(str, node, callStack);
    }

    /* JADX DEBUG: Method merged with bridge method: reThrow(Ljava/lang/String;)Lbsh/EvalError; */
    @Override // bsh.EvalError
    public EvalException reThrow(String str) {
        prependMessage(str);
        return this;
    }
}
