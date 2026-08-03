package bsh;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHEnhancedForStatement extends SimpleNode implements ParserConstants {
    private static final long serialVersionUID = 1;
    final int blockId;
    boolean isFinal;
    String label;
    String varName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHEnhancedForStatement(int i9) {
        super(i9);
        this.isFinal = false;
        this.blockId = BlockNameSpace.blockCount.incrementAndGet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalError {
        Node nodeJjtGetChild;
        Class<?> cls;
        String str;
        Modifiers modifiers = new Modifiers(4);
        if (this.isFinal) {
            modifiers.addModifier("final");
        }
        NameSpace pVar = callStack.top();
        Node nodeJjtGetChild2 = jjtGetChild(0);
        int iJjtGetNumChildren = jjtGetNumChildren();
        if (nodeJjtGetChild2 instanceof BSHType) {
            Class<?> type = ((BSHType) nodeJjtGetChild2).getType(callStack, interpreter);
            Node nodeJjtGetChild3 = jjtGetChild(1);
            Node nodeJjtGetChild4 = iJjtGetNumChildren > 2 ? jjtGetChild(2) : null;
            cls = type;
            nodeJjtGetChild2 = nodeJjtGetChild3;
            nodeJjtGetChild = nodeJjtGetChild4;
        } else {
            nodeJjtGetChild = iJjtGetNumChildren > 1 ? jjtGetChild(1) : null;
            cls = null;
        }
        Iterator<?> bshIterator = CollectionManager.getCollectionManager().getBshIterator(nodeJjtGetChild2.eval(callStack, interpreter));
        try {
            NameSpace blockNameSpace = BlockNameSpace.getInstance(pVar, this.blockId);
            callStack.swap(blockNameSpace);
            while (!Thread.interrupted() && bshIterator.hasNext()) {
                try {
                    Object next = bshIterator.next();
                    if (next == null) {
                        next = Primitive.NULL;
                    }
                    blockNameSpace.clear();
                    blockNameSpace.setTypedVariable(this.varName, cls, next, modifiers);
                    if (nodeJjtGetChild != null) {
                        Object objEval = nodeJjtGetChild instanceof BSHBlock ? ((BSHBlock) nodeJjtGetChild).eval(callStack, interpreter, null) : nodeJjtGetChild.eval(callStack, interpreter);
                        if (objEval instanceof ReturnControl) {
                            ReturnControl returnControl = (ReturnControl) objEval;
                            String str2 = returnControl.label;
                            if (str2 != null && ((str = this.label) == null || !str.equals(str2))) {
                                callStack.swap(pVar);
                                return objEval;
                            }
                            int i9 = returnControl.kind;
                            if (i9 == 47) {
                                callStack.swap(pVar);
                                return objEval;
                            }
                            if (i9 == 13) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                } catch (UtilEvalError e6) {
                    throw e6.toEvalError("for loop iterator variable:" + this.varName, this, callStack);
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
        return super.toString() + ": " + this.label + ": " + this.varName + ", final=" + this.isFinal;
    }
}
