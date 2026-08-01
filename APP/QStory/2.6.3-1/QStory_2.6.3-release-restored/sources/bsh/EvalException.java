package bsh;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class EvalException extends EvalError {
    public EvalException(String str, InterfaceC3452 interfaceC3452, CallStack callStack, Throwable th) {
        super(str, interfaceC3452, callStack, th);
    }

    public EvalException(String str, InterfaceC3452 interfaceC3452, CallStack callStack) {
        super(str, interfaceC3452, callStack);
    }

    @Override // bsh.EvalError
    public EvalException reThrow(String str) {
        prependMessage(str);
        return this;
    }
}
