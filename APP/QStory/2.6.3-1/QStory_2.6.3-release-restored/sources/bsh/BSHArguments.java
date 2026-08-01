package bsh;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
