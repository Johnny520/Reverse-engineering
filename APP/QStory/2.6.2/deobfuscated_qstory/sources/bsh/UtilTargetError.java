package bsh;

import p007.AbstractC6136;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class UtilTargetError extends UtilEvalError {
    public UtilTargetError(Throwable th) {
        this(th.getMessage(), th);
    }

    @Override // bsh.UtilEvalError
    public EvalError toEvalError(String str, InterfaceC2618 interfaceC2618, CallStack callStack) {
        String string;
        if (str == null) {
            string = getMessage();
        } else {
            StringBuilder sbM11553 = AbstractC6136.m11553(str, ": ");
            sbM11553.append(getMessage());
            string = sbM11553.toString();
        }
        return new TargetError(string, getCause(), interfaceC2618, callStack, false);
    }

    public UtilTargetError(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
