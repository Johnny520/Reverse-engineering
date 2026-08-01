package bsh;

import androidx.activity.AbstractC0053;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class UtilEvalError extends Exception {
    public UtilEvalError() {
    }

    public EvalError toEvalError(String str, InterfaceC2618 interfaceC2618, CallStack callStack) {
        if (Interpreter.DEBUG.get().booleanValue()) {
            printStackTrace();
        }
        StringBuilder sbM149 = AbstractC0053.m149(str == null ? "" : str.concat(": "));
        sbM149.append(getMessage());
        return new EvalError(sbM149.toString(), interfaceC2618, callStack, this);
    }

    public EvalException toEvalException(String str, InterfaceC2618 interfaceC2618, CallStack callStack) {
        if (Interpreter.DEBUG.get().booleanValue()) {
            printStackTrace();
        }
        StringBuilder sbM149 = AbstractC0053.m149(str == null ? "" : str.concat(": "));
        sbM149.append(getMessage());
        return new EvalException(sbM149.toString(), interfaceC2618, callStack, this);
    }

    public UtilEvalError(String str) {
        super(str);
    }

    public UtilEvalError(String str, Throwable th) {
        super(str, th);
    }

    public EvalError toEvalError(InterfaceC2618 interfaceC2618, CallStack callStack) {
        return toEvalError(null, interfaceC2618, callStack);
    }

    public EvalException toEvalException(InterfaceC2618 interfaceC2618, CallStack callStack) {
        return toEvalException(null, interfaceC2618, callStack);
    }
}
