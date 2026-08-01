package bsh;

import androidx.activity.AbstractC0053;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class UtilEvalError extends Exception {
    public UtilEvalError() {
    }

    public EvalError toEvalError(String str, InterfaceC2619 interfaceC2619, CallStack callStack) {
        if (Interpreter.DEBUG.get().booleanValue()) {
            printStackTrace();
        }
        StringBuilder sbM140 = AbstractC0053.m140(str == null ? "" : str.concat(": "));
        sbM140.append(getMessage());
        return new EvalError(sbM140.toString(), interfaceC2619, callStack, this);
    }

    public EvalException toEvalException(String str, InterfaceC2619 interfaceC2619, CallStack callStack) {
        if (Interpreter.DEBUG.get().booleanValue()) {
            printStackTrace();
        }
        StringBuilder sbM140 = AbstractC0053.m140(str == null ? "" : str.concat(": "));
        sbM140.append(getMessage());
        return new EvalException(sbM140.toString(), interfaceC2619, callStack, this);
    }

    public UtilEvalError(String str) {
        super(str);
    }

    public UtilEvalError(String str, Throwable th) {
        super(str, th);
    }

    public EvalError toEvalError(InterfaceC2619 interfaceC2619, CallStack callStack) {
        return toEvalError(null, interfaceC2619, callStack);
    }

    public EvalException toEvalException(InterfaceC2619 interfaceC2619, CallStack callStack) {
        return toEvalException(null, interfaceC2619, callStack);
    }
}
