package bsh;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHThrowStatement extends SimpleNode {
    public BSHThrowStatement(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public Object eval(CallStack callStack, Interpreter interpreter) throws TargetError, EvalException {
        Object objEval = jjtGetChild(0).eval(callStack, interpreter);
        if (objEval instanceof Throwable) {
            throw new TargetError((Throwable) objEval, this, callStack);
        }
        throw new EvalException("Expression in 'throw' must be Throwable type", this, callStack);
    }
}
