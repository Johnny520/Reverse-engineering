package bsh;

import androidx.activity.AbstractC0900;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class UtilEvalError extends Exception {
    public UtilEvalError() {
    }

    public EvalError toEvalError(String str, InterfaceC3452 interfaceC3452, CallStack callStack) {
        if (Interpreter.DEBUG.get().booleanValue()) {
            printStackTrace();
        }
        StringBuilder sbM700 = AbstractC0900.m700(str == null ? "" : str.concat(": "));
        sbM700.append(getMessage());
        return new EvalError(sbM700.toString(), interfaceC3452, callStack, this);
    }

    public EvalException toEvalException(String str, InterfaceC3452 interfaceC3452, CallStack callStack) {
        if (Interpreter.DEBUG.get().booleanValue()) {
            printStackTrace();
        }
        StringBuilder sbM700 = AbstractC0900.m700(str == null ? "" : str.concat(": "));
        sbM700.append(getMessage());
        return new EvalException(sbM700.toString(), interfaceC3452, callStack, this);
    }

    public UtilEvalError(String str) {
        super(str);
    }

    public UtilEvalError(String str, Throwable th) {
        super(str, th);
    }

    public EvalError toEvalError(InterfaceC3452 interfaceC3452, CallStack callStack) {
        return toEvalError(null, interfaceC3452, callStack);
    }

    public EvalException toEvalException(InterfaceC3452 interfaceC3452, CallStack callStack) {
        return toEvalException(null, interfaceC3452, callStack);
    }
}
