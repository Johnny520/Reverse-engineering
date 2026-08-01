package bsh;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class EvalException extends EvalError {
    public EvalException(String str, InterfaceC2619 interfaceC2619, CallStack callStack, Throwable th) {
        super(str, interfaceC2619, callStack, th);
    }

    public EvalException(String str, InterfaceC2619 interfaceC2619, CallStack callStack) {
        super(str, interfaceC2619, callStack);
    }

    @Override // bsh.EvalError
    public EvalException reThrow(String str) {
        prependMessage(str);
        return this;
    }
}
