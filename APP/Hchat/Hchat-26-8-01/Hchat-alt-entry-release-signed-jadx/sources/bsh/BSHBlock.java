package bsh;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHBlock extends SimpleNode {
    private static final long serialVersionUID = 1;
    final int blockId;
    private boolean hasClassDeclaration;
    private boolean isFirst;
    public boolean isStatic;
    public boolean isSynchronized;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface NodeFilter {
        boolean isVisible(Node node);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHBlock(int i9) {
        super(i9);
        this.isSynchronized = false;
        this.isStatic = false;
        this.hasClassDeclaration = false;
        this.isFirst = true;
        this.blockId = BlockNameSpace.blockCount.incrementAndGet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object eval(CallStack callStack, Interpreter interpreter, Boolean bool) {
        Object objEvalBlock;
        if (!this.isSynchronized) {
            return evalBlock(callStack, interpreter, bool, null);
        }
        synchronized (jjtGetChild(0).eval(callStack, interpreter)) {
            objEvalBlock = evalBlock(callStack, interpreter, bool, null);
        }
        return objEvalBlock;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:66:? */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [bsh.BSHBlock, bsh.SimpleNode] */
    public Object evalBlock(CallStack callStack, Interpreter interpreter, Boolean bool, NodeFilter nodeFilter) {
        Object objEval = Primitive.VOID;
        ArrayList arrayList = null;
        NameSpace nameSpaceSwap = bool == null ? callStack.swap(BlockNameSpace.getInstance(callStack.top(), this.blockId)) : !bool.booleanValue() ? callStack.swap(new BlockNameSpace(callStack.top(), this.blockId)) : null;
        ?? r2 = this.isSynchronized;
        int iJjtGetNumChildren = jjtGetNumChildren();
        try {
            if (this.isFirst || this.hasClassDeclaration) {
                for (?? r5 = r2; r5 < iJjtGetNumChildren; r5++) {
                    Node nodeJjtGetChild = jjtGetChild(r5);
                    if ((nodeFilter == null || nodeFilter.isVisible(nodeJjtGetChild)) && (nodeJjtGetChild instanceof BSHClassDeclaration)) {
                        this.hasClassDeclaration = true;
                        nodeJjtGetChild.eval(callStack, interpreter);
                    }
                }
            }
            while (r2 < iJjtGetNumChildren) {
                Node nodeJjtGetChild2 = jjtGetChild(r2);
                if (!(nodeJjtGetChild2 instanceof BSHClassDeclaration) && (nodeFilter == null || nodeFilter.isVisible(nodeJjtGetChild2))) {
                    if (!(nodeJjtGetChild2 instanceof BSHEnumConstant)) {
                        objEval = nodeJjtGetChild2.eval(callStack, interpreter);
                        if (objEval instanceof ReturnControl) {
                            break;
                        }
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(nodeJjtGetChild2);
                    }
                }
                r2++;
            }
            if (arrayList != null) {
                while (!arrayList.isEmpty()) {
                    ((Node) arrayList.remove(0)).eval(callStack, interpreter);
                }
            }
            this.isFirst = false;
            if (nameSpaceSwap != null) {
                callStack.swap(nameSpaceSwap);
            }
            return objEval;
        } catch (Throwable th2) {
            this.isFirst = false;
            if (nameSpaceSwap != null) {
                callStack.swap(nameSpaceSwap);
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": static=" + this.isStatic + ", synchronized=" + this.isSynchronized;
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(CallStack callStack, Interpreter interpreter) {
        return eval(callStack, interpreter, Boolean.FALSE);
    }
}
