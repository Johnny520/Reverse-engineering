package bsh;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class BSHThrowStatement extends SimpleNode {
    public BSHThrowStatement(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public Object eval(CallStack callStack, Interpreter interpreter) throws TargetError, EvalException {
        Object objEval = jjtGetChild(0).eval(callStack, interpreter);
        if (objEval instanceof Throwable) {
            throw new TargetError((Throwable) objEval, this, callStack);
        }
        throw new EvalException("Expression in 'throw' must be Throwable type", this, callStack);
    }
}
