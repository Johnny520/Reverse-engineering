package bsh;

import p025.AbstractC7012;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class UtilTargetError extends UtilEvalError {
    public UtilTargetError(Throwable th) {
        this(th.getMessage(), th);
    }

    @Override // bsh.UtilEvalError
    public EvalError toEvalError(String str, InterfaceC3452 interfaceC3452, CallStack callStack) {
        String string;
        if (str == null) {
            string = getMessage();
        } else {
            StringBuilder sbM12143 = AbstractC7012.m12143(str, ": ");
            sbM12143.append(getMessage());
            string = sbM12143.toString();
        }
        return new TargetError(string, getCause(), interfaceC3452, callStack, false);
    }

    public UtilTargetError(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
