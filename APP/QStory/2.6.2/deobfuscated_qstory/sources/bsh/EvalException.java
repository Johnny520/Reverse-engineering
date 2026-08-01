package bsh;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class EvalException extends EvalError {
    public EvalException(String str, InterfaceC2618 interfaceC2618, CallStack callStack, Throwable th) {
        super(str, interfaceC2618, callStack, th);
    }

    public EvalException(String str, InterfaceC2618 interfaceC2618, CallStack callStack) {
        super(str, interfaceC2618, callStack);
    }

    @Override // bsh.EvalError
    public EvalException reThrow(String str) {
        prependMessage(str);
        return this;
    }
}
