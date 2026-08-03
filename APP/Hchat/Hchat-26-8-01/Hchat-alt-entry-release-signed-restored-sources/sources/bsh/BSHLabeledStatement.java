package bsh;

import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class BSHLabeledStatement extends SimpleNode implements ParserConstants {
    private static final long serialVersionUID = 1;
    String label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHLabeledStatement(int i9) {
        super(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ void add(Node node) {
        super.add(node);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ void dump(String str) {
        super.dump(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r3.label.equals(r0.label) == false) goto L27;
     */
    @Override // bsh.SimpleNode, bsh.Node
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalError {
        if (jjtGetNumChildren() > 0) {
            if (jjtGetChild(0) instanceof BSHForStatement) {
                ((BSHForStatement) jjtGetChild(0)).label = this.label;
            } else if (jjtGetChild(0) instanceof BSHEnhancedForStatement) {
                ((BSHEnhancedForStatement) jjtGetChild(0)).label = this.label;
            } else if (jjtGetChild(0) instanceof BSHWhileStatement) {
                ((BSHWhileStatement) jjtGetChild(0)).label = this.label;
            }
            Object objEval = jjtGetChild(0).eval(callStack, interpreter);
            if (objEval instanceof ReturnControl) {
                ReturnControl returnControl = (ReturnControl) objEval;
                int i9 = returnControl.kind;
                if (i9 != 13) {
                    if (i9 == 20 && this.label.equals(returnControl.label)) {
                        throw new EvalError("Continue cannot be used outside of a loop", this, callStack);
                    }
                }
                return objEval;
            }
        }
        return Primitive.VOID;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ int getId() {
        return super.getId();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ int getLineNumber() {
        return super.getLineNumber();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ String getSourceFile() {
        return super.getSourceFile();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ String getText() {
        return super.getText();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ boolean hasNext() {
        return super.hasNext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, java.util.ListIterator
    public /* bridge */ /* synthetic */ boolean hasPrevious() {
        return super.hasPrevious();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ void jjtAddChild(Node node, int i9) {
        super.jjtAddChild(node, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ void jjtClose() {
        super.jjtClose();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ Node jjtGetChild(int i9) {
        return super.jjtGetChild(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ Node[] jjtGetChildren() {
        return super.jjtGetChildren();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ int jjtGetNumChildren() {
        return super.jjtGetNumChildren();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ Node jjtGetParent() {
        return super.jjtGetParent();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ void jjtOpen() {
        super.jjtOpen();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ void jjtSetParent(Node node) {
        super.jjtSetParent(node);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ Node next() {
        return super.next();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, java.util.ListIterator
    public /* bridge */ /* synthetic */ int nextIndex() {
        return super.nextIndex();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, java.util.ListIterator
    public /* bridge */ /* synthetic */ Node previous() {
        return super.previous();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, java.util.ListIterator
    public /* bridge */ /* synthetic */ int previousIndex() {
        return super.previousIndex();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ void remove() {
        super.remove();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ void set(Node node) {
        super.set(node);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ void setSourceFile(String str) {
        super.setSourceFile(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(": ");
        return AbstractC0921a.m2255r(sb2, this.label, ":");
    }

    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ String toString(String str) {
        return super.toString(str);
    }
}
