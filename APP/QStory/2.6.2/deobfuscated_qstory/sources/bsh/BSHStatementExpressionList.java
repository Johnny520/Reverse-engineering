package bsh;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class BSHStatementExpressionList extends SimpleNode {
    public BSHStatementExpressionList(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public Object eval(CallStack callStack, Interpreter interpreter) {
        int iJjtGetNumChildren = jjtGetNumChildren();
        for (int i = 0; i < iJjtGetNumChildren; i++) {
            jjtGetChild(i).eval(callStack, interpreter);
        }
        return Primitive.VOID;
    }
}
