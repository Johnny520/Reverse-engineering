package bsh;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHStatementExpressionList extends SimpleNode {
    public BSHStatementExpressionList(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public Object eval(CallStack callStack, Interpreter interpreter) {
        int iJjtGetNumChildren = jjtGetNumChildren();
        for (int i = 0; i < iJjtGetNumChildren; i++) {
            jjtGetChild(i).eval(callStack, interpreter);
        }
        return Primitive.VOID;
    }
}
