package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class InterpreterError extends RuntimeException {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterpreterError(String str) {
        super(str);
    }

    public InterpreterError(String str, Throwable th2) {
        super(str, th2);
    }
}
