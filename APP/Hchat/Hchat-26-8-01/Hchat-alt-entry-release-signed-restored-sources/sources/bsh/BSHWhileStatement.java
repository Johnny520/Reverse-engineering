package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHWhileStatement extends SimpleNode implements ParserConstants {
    private static final long serialVersionUID = 1;
    boolean isDoStatement;
    String label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHWhileStatement(int i9) {
        super(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(CallStack callStack, Interpreter interpreter) {
        Node nodeJjtGetChild;
        Node nodeJjtGetChild2;
        int i9;
        String str;
        int iJjtGetNumChildren = jjtGetNumChildren();
        if (this.isDoStatement) {
            nodeJjtGetChild2 = jjtGetChild(1);
            nodeJjtGetChild = jjtGetChild(0);
        } else {
            Node nodeJjtGetChild3 = jjtGetChild(0);
            nodeJjtGetChild = iJjtGetNumChildren > 1 ? jjtGetChild(1) : null;
            nodeJjtGetChild2 = nodeJjtGetChild3;
        }
        for (boolean z9 = this.isDoStatement; !Thread.interrupted() && (z9 || BSHIfStatement.evaluateCondition(nodeJjtGetChild2, callStack, interpreter)); z9 = false) {
            if (nodeJjtGetChild != null) {
                Object objEval = nodeJjtGetChild instanceof BSHBlock ? ((BSHBlock) nodeJjtGetChild).eval(callStack, interpreter, null) : nodeJjtGetChild.eval(callStack, interpreter);
                if (objEval instanceof ReturnControl) {
                    ReturnControl returnControl = (ReturnControl) objEval;
                    String str2 = returnControl.label;
                    if ((str2 != null && ((str = this.label) == null || !str.equals(str2))) || (i9 = returnControl.kind) == 47) {
                        return objEval;
                    }
                    if (i9 == 13) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return Primitive.VOID;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.label + ": do=" + this.isDoStatement;
    }
}
