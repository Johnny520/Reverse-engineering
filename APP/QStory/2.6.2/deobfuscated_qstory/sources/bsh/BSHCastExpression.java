package bsh;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class BSHCastExpression extends SimpleNode {
    public BSHCastExpression(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalError {
        try {
            return AbstractC2661.m5328(jjtGetChild(1).eval(callStack, interpreter), ((BSHType) jjtGetChild(0)).getType(callStack, interpreter), 0);
        } catch (UtilEvalError e) {
            throw e.toEvalError(this, callStack);
        }
    }
}
