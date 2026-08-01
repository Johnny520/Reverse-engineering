package bsh;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHTernaryExpression extends SimpleNode {
    public BSHTernaryExpression(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public Object eval(CallStack callStack, Interpreter interpreter) {
        return BSHIfStatement.evaluateCondition(jjtGetChild(0), callStack, interpreter) ? jjtGetChild(1).eval(callStack, interpreter) : jjtGetChild(2).eval(callStack, interpreter);
    }
}
