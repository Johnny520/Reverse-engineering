package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHIfStatement extends SimpleNode {
    private static final long serialVersionUID = 1;
    boolean isClosed;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHIfStatement(int i9) {
        super(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean evaluateCondition(Node node, CallStack callStack, Interpreter interpreter) throws EvalException {
        Object objEval = node.eval(callStack, interpreter);
        if (objEval != Primitive.VOID) {
            return ((Boolean) Primitive.castWrapper(Boolean.TYPE, objEval)).booleanValue();
        }
        throw new EvalException("Condition evaluates to void type", node, callStack);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    @Override // bsh.SimpleNode, bsh.Node
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object eval(CallStack callStack, Interpreter interpreter) {
        Object objEval;
        if (evaluateCondition(jjtGetChild(0), callStack, interpreter)) {
            objEval = !this.isClosed ? jjtGetChild(1).eval(callStack, interpreter) : null;
        } else if (jjtGetNumChildren() > 2) {
            objEval = jjtGetChild(2).eval(callStack, interpreter);
        } else if (this.isClosed) {
            objEval = jjtGetChild(1).eval(callStack, interpreter);
        }
        return objEval instanceof ReturnControl ? objEval : Primitive.VOID;
    }
}
