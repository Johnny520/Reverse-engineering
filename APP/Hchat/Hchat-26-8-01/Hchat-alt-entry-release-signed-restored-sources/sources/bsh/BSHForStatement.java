package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHForStatement extends SimpleNode implements ParserConstants {
    private static final long serialVersionUID = 1;
    final int blockId;
    public boolean hasExpression;
    public boolean hasForInit;
    public boolean hasForUpdate;
    String label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHForStatement(int i9) {
        super(i9);
        this.blockId = BlockNameSpace.blockCount.incrementAndGet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(CallStack callStack, Interpreter interpreter) {
        Node nodeJjtGetChild;
        int i9;
        Node nodeJjtGetChild2;
        int i10;
        Node nodeJjtGetChild3;
        String str;
        int i11 = 0;
        if (this.hasForInit) {
            nodeJjtGetChild = jjtGetChild(0);
            i11 = 1;
        } else {
            nodeJjtGetChild = null;
        }
        if (this.hasExpression) {
            i9 = i11 + 1;
            nodeJjtGetChild2 = jjtGetChild(i11);
        } else {
            i9 = i11;
            nodeJjtGetChild2 = null;
        }
        if (this.hasForUpdate) {
            i10 = i9 + 1;
            nodeJjtGetChild3 = jjtGetChild(i9);
        } else {
            i10 = i9;
            nodeJjtGetChild3 = null;
        }
        Node nodeJjtGetChild4 = i10 < jjtGetNumChildren() ? jjtGetChild(i10) : null;
        NameSpace pVar = callStack.top();
        callStack.swap(new BlockNameSpace(pVar, this.blockId));
        try {
            if (this.hasForInit) {
                nodeJjtGetChild.eval(callStack, interpreter);
            }
            while (!Thread.interrupted() && (!this.hasExpression || BSHIfStatement.evaluateCondition(nodeJjtGetChild2, callStack, interpreter))) {
                if (nodeJjtGetChild4 != null) {
                    Object objEval = nodeJjtGetChild4 instanceof BSHBlock ? ((BSHBlock) nodeJjtGetChild4).eval(callStack, interpreter, null) : nodeJjtGetChild4.eval(callStack, interpreter);
                    if (objEval instanceof ReturnControl) {
                        ReturnControl returnControl = (ReturnControl) objEval;
                        String str2 = returnControl.label;
                        if (str2 != null && ((str = this.label) == null || !str.equals(str2))) {
                            callStack.swap(pVar);
                            return objEval;
                        }
                        int i12 = returnControl.kind;
                        if (i12 != 47) {
                            if (i12 == 13) {
                                break;
                            }
                        } else {
                            callStack.swap(pVar);
                            return objEval;
                        }
                    }
                }
                if (this.hasForUpdate) {
                    nodeJjtGetChild3.eval(callStack, interpreter);
                }
            }
            Primitive primitive = Primitive.VOID;
            callStack.swap(pVar);
            return primitive;
        } catch (Throwable th2) {
            callStack.swap(pVar);
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.label + ": " + this.hasForInit + " ; " + this.hasExpression + " ; " + this.hasForUpdate;
    }
}
