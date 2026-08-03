package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class BSHLabeledStatement extends bsh.SimpleNode implements bsh.ParserConstants {
    private static final long serialVersionUID = 1;
    java.lang.String label;

    public BSHLabeledStatement(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ void add(bsh.Node r1) {
            r0 = this;
            super.add(r1)
            return
    }

    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ void dump(java.lang.String r1) {
            r0 = this;
            super.dump(r1)
            return
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r4, bsh.Interpreter r5) {
            r3 = this;
            int r0 = r3.jjtGetNumChildren()
            if (r0 <= 0) goto L77
            r0 = 0
            bsh.Node r1 = r3.jjtGetChild(r0)
            boolean r1 = r1 instanceof bsh.BSHForStatement
            if (r1 == 0) goto L1a
            bsh.Node r1 = r3.jjtGetChild(r0)
            bsh.BSHForStatement r1 = (bsh.BSHForStatement) r1
            java.lang.String r2 = r3.label
            r1.label = r2
            goto L3f
        L1a:
            bsh.Node r1 = r3.jjtGetChild(r0)
            boolean r1 = r1 instanceof bsh.BSHEnhancedForStatement
            if (r1 == 0) goto L2d
            bsh.Node r1 = r3.jjtGetChild(r0)
            bsh.BSHEnhancedForStatement r1 = (bsh.BSHEnhancedForStatement) r1
            java.lang.String r2 = r3.label
            r1.label = r2
            goto L3f
        L2d:
            bsh.Node r1 = r3.jjtGetChild(r0)
            boolean r1 = r1 instanceof bsh.BSHWhileStatement
            if (r1 == 0) goto L3f
            bsh.Node r1 = r3.jjtGetChild(r0)
            bsh.BSHWhileStatement r1 = (bsh.BSHWhileStatement) r1
            java.lang.String r2 = r3.label
            r1.label = r2
        L3f:
            bsh.Node r0 = r3.jjtGetChild(r0)
            java.lang.Object r5 = r0.eval(r4, r5)
            boolean r0 = r5 instanceof bsh.ReturnControl
            if (r0 == 0) goto L77
            r0 = r5
            bsh.ReturnControl r0 = (bsh.ReturnControl) r0
            int r1 = r0.kind
            r2 = 13
            if (r1 == r2) goto L6c
            r2 = 20
            if (r1 == r2) goto L59
            goto L76
        L59:
            java.lang.String r1 = r3.label
            java.lang.String r0 = r0.label
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L64
            goto L76
        L64:
            bsh.EvalError r5 = new bsh.EvalError
            java.lang.String r0 = "Continue cannot be used outside of a loop"
            r5.<init>(r0, r3, r4)
            throw r5
        L6c:
            java.lang.String r4 = r3.label
            java.lang.String r0 = r0.label
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L77
        L76:
            return r5
        L77:
            bsh.Primitive r4 = bsh.Primitive.VOID
            return r4
    }

    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ int getId() {
            r1 = this;
            int r0 = super.getId()
            return r0
    }

    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ int getLineNumber() {
            r1 = this;
            int r0 = super.getLineNumber()
            return r0
    }

    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ java.lang.String getSourceFile() {
            r1 = this;
            java.lang.String r0 = super.getSourceFile()
            return r0
    }

    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ java.lang.String getText() {
            r1 = this;
            java.lang.String r0 = super.getText()
            return r0
    }

    @Override // bsh.SimpleNode, java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ boolean hasNext() {
            r1 = this;
            boolean r0 = super.hasNext()
            return r0
    }

    @Override // bsh.SimpleNode, java.util.ListIterator
    public /* bridge */ /* synthetic */ boolean hasPrevious() {
            r1 = this;
            boolean r0 = super.hasPrevious()
            return r0
    }

    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ void jjtAddChild(bsh.Node r1, int r2) {
            r0 = this;
            super.jjtAddChild(r1, r2)
            return
    }

    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ void jjtClose() {
            r0 = this;
            super.jjtClose()
            return
    }

    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ bsh.Node jjtGetChild(int r1) {
            r0 = this;
            bsh.Node r1 = super.jjtGetChild(r1)
            return r1
    }

    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ bsh.Node[] jjtGetChildren() {
            r1 = this;
            bsh.Node[] r0 = super.jjtGetChildren()
            return r0
    }

    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ int jjtGetNumChildren() {
            r1 = this;
            int r0 = super.jjtGetNumChildren()
            return r0
    }

    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ bsh.Node jjtGetParent() {
            r1 = this;
            bsh.Node r0 = super.jjtGetParent()
            return r0
    }

    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ void jjtOpen() {
            r0 = this;
            super.jjtOpen()
            return
    }

    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ void jjtSetParent(bsh.Node r1) {
            r0 = this;
            super.jjtSetParent(r1)
            return
    }

    @Override // bsh.SimpleNode, java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ bsh.Node next() {
            r1 = this;
            bsh.Node r0 = super.next()
            return r0
    }

    @Override // bsh.SimpleNode, java.util.ListIterator
    public /* bridge */ /* synthetic */ int nextIndex() {
            r1 = this;
            int r0 = super.nextIndex()
            return r0
    }

    @Override // bsh.SimpleNode, java.util.ListIterator
    public /* bridge */ /* synthetic */ bsh.Node previous() {
            r1 = this;
            bsh.Node r0 = super.previous()
            return r0
    }

    @Override // bsh.SimpleNode, java.util.ListIterator
    public /* bridge */ /* synthetic */ int previousIndex() {
            r1 = this;
            int r0 = super.previousIndex()
            return r0
    }

    @Override // bsh.SimpleNode, java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ void remove() {
            r0 = this;
            super.remove()
            return
    }

    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ void set(bsh.Node r1) {
            r0 = this;
            super.set(r1)
            return
    }

    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ void setSourceFile(java.lang.String r1) {
            r0 = this;
            super.setSourceFile(r1)
            return
    }

    @Override // bsh.SimpleNode
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.String r1 = r3.label
            java.lang.String r2 = ":"
            java.lang.String r0 = eh.a.r(r0, r1, r2)
            return r0
    }

    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ java.lang.String toString(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = super.toString(r1)
            return r1
    }
}
