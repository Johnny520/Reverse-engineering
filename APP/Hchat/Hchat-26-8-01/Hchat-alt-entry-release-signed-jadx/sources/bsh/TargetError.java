package bsh;

import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class TargetError extends EvalError {
    private final boolean inNativeCode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TargetError(Throwable th2, Node node, CallStack callStack) {
        this("TargetError", th2, node, callStack, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private synchronized String printTargetError(Throwable th2) {
        if (th2 == null) {
            return "Cause is null";
        }
        StringBuilder sb2 = new StringBuilder(th2.toString());
        while (true) {
            th2 = th2.getCause();
            if (th2 == null) {
                return sb2.toString();
            }
            sb2.append("\n");
            sb2.append(th2.toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.EvalError, java.lang.Throwable
    public synchronized String getMessage() {
        return super.getMessage() + "\nCaused by: " + printTargetError(getCause());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized Throwable getTarget() {
        Throwable cause = getCause();
        if (!(cause instanceof InvocationTargetException)) {
            return cause;
        }
        return cause.getCause();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean inNativeCode() {
        return this.inNativeCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void printStackTrace(boolean z9, PrintStream printStream) {
        if (z9) {
            printStackTrace(printStream);
            printStream.println("--- Target Stack Trace ---");
        }
        for (StackTraceElement stackTraceElement : getCause().getStackTrace()) {
            if (stackTraceElement.getClassName().contains("reflect")) {
                return;
            }
            printStream.println("        at " + stackTraceElement);
        }
    }

    public TargetError(String str, Throwable th2, Node node, CallStack callStack, boolean z9) {
        super(str, node, callStack, th2);
        this.inNativeCode = z9;
    }
}
