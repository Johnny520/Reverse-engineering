package bsh;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class BSHArguments extends SimpleNode {
    public BSHArguments(int i) {
        super(i);
    }

    public Object[] getArguments(CallStack callStack, Interpreter interpreter) {
        int iJjtGetNumChildren = jjtGetNumChildren();
        Object[] objArr = new Object[iJjtGetNumChildren];
        for (int i = 0; i < iJjtGetNumChildren; i++) {
            Object objEval = jjtGetChild(i).eval(callStack, interpreter);
            objArr[i] = objEval;
            if (objEval == Primitive.VOID) {
                throw new EvalException("Undefined argument: " + jjtGetChild(i).getText(), this, callStack);
            }
        }
        return objArr;
    }
}
