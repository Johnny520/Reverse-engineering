package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHArguments extends SimpleNode {
    private static final long serialVersionUID = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHArguments(int i9) {
        super(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object[] getArguments(CallStack callStack, Interpreter interpreter) {
        int iJjtGetNumChildren = jjtGetNumChildren();
        Object[] objArr = new Object[iJjtGetNumChildren];
        for (int i9 = 0; i9 < iJjtGetNumChildren; i9++) {
            Object objEval = jjtGetChild(i9).eval(callStack, interpreter);
            objArr[i9] = objEval;
            if (objEval == Primitive.VOID) {
                throw new EvalException("Undefined argument: " + jjtGetChild(i9).getText(), this, callStack);
            }
        }
        return objArr;
    }
}
