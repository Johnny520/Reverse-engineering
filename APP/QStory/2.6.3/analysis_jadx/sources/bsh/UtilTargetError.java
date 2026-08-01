package bsh;

import p009.AbstractC6183;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class UtilTargetError extends UtilEvalError {
    public UtilTargetError(Throwable th) {
        this(th.getMessage(), th);
    }

    @Override // bsh.UtilEvalError
    public EvalError toEvalError(String str, InterfaceC2619 interfaceC2619, CallStack callStack) {
        String string;
        if (str == null) {
            string = getMessage();
        } else {
            StringBuilder sbM11584 = AbstractC6183.m11584(str, ": ");
            sbM11584.append(getMessage());
            string = sbM11584.toString();
        }
        return new TargetError(string, getCause(), interfaceC2619, callStack, false);
    }

    public UtilTargetError(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
