package bsh;

import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHWhenExpression extends SimpleNode implements ParserConstants {
    private static final long serialVersionUID = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHWhenExpression(int i9) {
        super(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean primitiveEquals(Object obj, Object obj2, CallStack callStack, Node node) throws EvalError {
        Primitive primitive = Primitive.VOID;
        if (obj != primitive && obj2 != primitive) {
            Primitive primitive2 = Primitive.NULL;
            if (obj == primitive2) {
                obj = null;
            }
            if (obj2 == primitive2) {
                obj2 = null;
            }
            if (obj != null && obj2 != null) {
                if (!(obj instanceof Primitive) && !(obj2 instanceof Primitive)) {
                    return obj.equals(obj2);
                }
                try {
                    return Primitive.unwrap(Operators.binaryOperation(obj, obj2, 92)).equals(Boolean.TRUE);
                } catch (UtilEvalError e6) {
                    throw e6.toEvalError("When value: " + node.getText() + ": ", this, callStack);
                }
            }
            if (obj == obj2) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalException {
        int iJjtGetNumChildren = jjtGetNumChildren();
        if (iJjtGetNumChildren < 2) {
            throw new EvalException("Empty when expression.", this, callStack);
        }
        for (int i9 = 1; i9 < iJjtGetNumChildren; i9++) {
            if (((BSHWhenEntry) jjtGetChild(i9)).isElse && i9 != iJjtGetNumChildren - 1) {
                throw new EvalException("Else branch must be the last one in when expression.", this, callStack);
            }
        }
        Node nodeJjtGetChild = jjtGetChild(0);
        Object objEval = nodeJjtGetChild.eval(callStack, interpreter);
        for (int i10 = 1; i10 < iJjtGetNumChildren; i10++) {
            BSHWhenEntry bSHWhenEntry = (BSHWhenEntry) jjtGetChild(i10);
            if (bSHWhenEntry.isElse) {
                return bSHWhenEntry.evalResult(callStack, interpreter);
            }
            for (int i11 = 0; i11 < bSHWhenEntry.numConditions; i11++) {
                if (primitiveEquals(objEval, bSHWhenEntry.jjtGetChild(i11).eval(callStack, interpreter), callStack, nodeJjtGetChild)) {
                    return bSHWhenEntry.evalResult(callStack, interpreter);
                }
            }
        }
        throw new EvalException("No matching when branch.", this, callStack);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode
    public String toString() {
        return AbstractC0921a.m2255r(new StringBuilder(), super.toString(), ": when");
    }
}
