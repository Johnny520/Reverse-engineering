package bsh;

import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class TargetError extends EvalError {
    private final boolean inNativeCode;

    public TargetError(Throwable th, InterfaceC2618 interfaceC2618, CallStack callStack) {
        this("TargetError", th, interfaceC2618, callStack, false);
    }

    private synchronized String printTargetError(Throwable th) {
        if (th == null) {
            return "Cause is null";
        }
        StringBuilder sb = new StringBuilder(th.toString());
        while (true) {
            th = th.getCause();
            if (th == null) {
                return sb.toString();
            }
            sb.append("\n");
            sb.append(th.toString());
        }
    }

    @Override // bsh.EvalError, java.lang.Throwable
    public synchronized String getMessage() {
        return super.getMessage() + "\nCaused by: " + printTargetError(getCause());
    }

    public synchronized Throwable getTarget() {
        Throwable cause = getCause();
        if (!(cause instanceof InvocationTargetException)) {
            return cause;
        }
        return cause.getCause();
    }

    public boolean inNativeCode() {
        return this.inNativeCode;
    }

    public void printStackTrace(boolean z, PrintStream printStream) {
        if (z) {
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

    public TargetError(String str, Throwable th, InterfaceC2618 interfaceC2618, CallStack callStack, boolean z) {
        super(str, interfaceC2618, callStack, th);
        this.inNativeCode = z;
    }
}
