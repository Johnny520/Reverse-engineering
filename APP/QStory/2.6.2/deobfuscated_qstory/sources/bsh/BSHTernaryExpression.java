package bsh;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class BSHTernaryExpression extends SimpleNode {
    public BSHTernaryExpression(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public Object eval(CallStack callStack, Interpreter interpreter) {
        return BSHIfStatement.evaluateCondition(jjtGetChild(0), callStack, interpreter) ? jjtGetChild(1).eval(callStack, interpreter) : jjtGetChild(2).eval(callStack, interpreter);
    }
}
