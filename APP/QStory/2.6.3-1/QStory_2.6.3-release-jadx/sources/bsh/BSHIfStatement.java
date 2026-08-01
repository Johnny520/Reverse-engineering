package bsh;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHIfStatement extends SimpleNode {
    boolean isClosed;

    public BSHIfStatement(int i) {
        super(i);
    }

    public static boolean evaluateCondition(InterfaceC3452 interfaceC3452, CallStack callStack, Interpreter interpreter) throws EvalException {
        Object objEval = interfaceC3452.eval(callStack, interpreter);
        if (objEval != Primitive.VOID) {
            return ((Boolean) Primitive.castWrapper(Boolean.TYPE, objEval)).booleanValue();
        }
        throw new EvalException("Condition evaluates to void type", interfaceC3452, callStack);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    @Override // bsh.SimpleNode, bsh.InterfaceC3452
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
        return objEval instanceof C3501 ? objEval : Primitive.VOID;
    }
}
