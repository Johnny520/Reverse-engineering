package bsh;

import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHSwitchStatement extends SimpleNode implements ParserConstants {
    private static final long serialVersionUID = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHSwitchStatement(int i9) {
        super(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean primitiveEquals(Object obj, Object obj2, CallStack callStack, Node node) throws EvalError {
        if (obj2 == Primitive.VOID) {
            return false;
        }
        if (!(obj instanceof Primitive) && !(obj2 instanceof Primitive)) {
            return obj.equals(obj2);
        }
        try {
            return Primitive.unwrap(Operators.binaryOperation(obj, obj2, 92)).equals(Boolean.TRUE);
        } catch (UtilEvalError e6) {
            throw e6.toEvalError("Switch value: " + node.getText() + ": ", this, callStack);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalException {
        int i9;
        int iJjtGetNumChildren = jjtGetNumChildren();
        Node nodeJjtGetChild = jjtGetChild(0);
        Object objEval = nodeJjtGetChild.eval(callStack, interpreter);
        if (Primitive.unwrap(objEval) != null && objEval.getClass().isEnum()) {
            callStack.top().importStatic(objEval.getClass());
        }
        if (1 >= iJjtGetNumChildren) {
            throw new EvalException("Empty switch statement.", this, callStack);
        }
        BSHSwitchLabel bSHSwitchLabel = (BSHSwitchLabel) jjtGetChild(1);
        ReturnControl returnControl = null;
        int i10 = 2;
        while (i10 < iJjtGetNumChildren && returnControl == null) {
            if (bSHSwitchLabel.isDefault || primitiveEquals(objEval, bSHSwitchLabel.eval(callStack, interpreter), callStack, nodeJjtGetChild)) {
                while (i10 < iJjtGetNumChildren) {
                    i9 = i10 + 1;
                    Node nodeJjtGetChild2 = jjtGetChild(i10);
                    if (!(nodeJjtGetChild2 instanceof BSHSwitchLabel)) {
                        Object objEval2 = nodeJjtGetChild2.eval(callStack, interpreter);
                        if (objEval2 instanceof ReturnControl) {
                            returnControl = (ReturnControl) objEval2;
                            i10 = i9;
                            break;
                        }
                    }
                    i10 = i9;
                }
            } else {
                while (i10 < iJjtGetNumChildren) {
                    i9 = i10 + 1;
                    Node nodeJjtGetChild3 = jjtGetChild(i10);
                    if (nodeJjtGetChild3 instanceof BSHSwitchLabel) {
                        bSHSwitchLabel = (BSHSwitchLabel) nodeJjtGetChild3;
                        i10 = i9;
                        break;
                        break;
                    }
                    i10 = i9;
                }
            }
        }
        return (returnControl == null || returnControl.kind != 47) ? Primitive.VOID : returnControl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode
    public String toString() {
        return AbstractC0921a.m2255r(new StringBuilder(), super.toString(), ": switch");
    }
}
