package bsh;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHCastExpression extends SimpleNode {
    public BSHCastExpression(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalError {
        try {
            return AbstractC3495.m5933(jjtGetChild(1).eval(callStack, interpreter), ((BSHType) jjtGetChild(0)).getType(callStack, interpreter), 0);
        } catch (UtilEvalError e) {
            throw e.toEvalError(this, callStack);
        }
    }
}
