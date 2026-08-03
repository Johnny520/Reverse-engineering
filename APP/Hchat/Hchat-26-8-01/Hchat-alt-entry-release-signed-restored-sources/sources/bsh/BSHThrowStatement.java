package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHThrowStatement extends SimpleNode {
    private static final long serialVersionUID = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHThrowStatement(int i9) {
        super(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(CallStack callStack, Interpreter interpreter) throws TargetError, EvalException {
        Object objEval = jjtGetChild(0).eval(callStack, interpreter);
        if (objEval instanceof Throwable) {
            throw new TargetError((Throwable) objEval, this, callStack);
        }
        throw new EvalException("Expression in 'throw' must be Throwable type", this, callStack);
    }
}
