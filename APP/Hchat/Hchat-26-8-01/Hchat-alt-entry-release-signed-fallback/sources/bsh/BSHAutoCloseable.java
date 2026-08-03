package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class BSHAutoCloseable extends bsh.BSHTypedVariableDeclaration {
    private static final long serialVersionUID = 1;
    public java.lang.String name;
    public java.lang.AutoCloseable ths;
    public java.lang.Class<?> type;
    public java.lang.String typeName;
    public bsh.Variable varThis;

    public BSHAutoCloseable(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void renderTypeNode() {
            r6 = this;
            int r0 = r6.jjtGetNumChildren()
            r1 = 1
            if (r0 != r1) goto L44
            bsh.BSHType r0 = new bsh.BSHType
            r2 = 11
            r0.<init>(r2)
            r2 = 0
            bsh.Node r3 = r6.jjtGetChild(r2)
        L13:
            int r4 = r3.jjtGetNumChildren()
            if (r4 <= 0) goto L21
            bsh.Node r3 = r3.jjtGetChild(r2)
            boolean r4 = r3 instanceof bsh.BSHAmbiguousName
            if (r4 == 0) goto L13
        L21:
            bsh.BSHAmbiguousName r4 = new bsh.BSHAmbiguousName
            r5 = 14
            r4.<init>(r5)
            r4.jjtSetParent(r0)
            bsh.BSHAmbiguousName r3 = (bsh.BSHAmbiguousName) r3
            java.lang.String r3 = r3.text
            r4.text = r3
            r0.jjtAddChild(r4, r2)
            r0.jjtSetParent(r6)
            bsh.Node[] r3 = r6.children
            r3 = r3[r2]
            r4 = 2
            bsh.Node[] r4 = new bsh.Node[r4]
            r4[r2] = r0
            r4[r1] = r3
            r6.children = r4
        L44:
            return
    }

    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ void add(bsh.Node r1) {
            r0 = this;
            super.add(r1)
            return
    }

    public void close() {
            r6 = this;
            bsh.Variable r0 = r6.varThis
            if (r0 == 0) goto Lc
            java.lang.Object r0 = r0.getValue()
            java.lang.AutoCloseable r0 = (java.lang.AutoCloseable) r0
            r6.ths = r0
        Lc:
            java.lang.AutoCloseable r0 = r6.ths
            if (r0 == 0) goto L6c
            boolean r1 = r0 instanceof java.lang.AutoCloseable
            if (r1 == 0) goto L18
            r0.close()
            goto L6c
        L18:
            boolean r1 = r0 instanceof java.util.concurrent.ExecutorService
            if (r1 == 0) goto L4b
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            java.util.concurrent.ForkJoinPool r1 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r0 != r1) goto L25
            goto L6c
        L25:
            boolean r1 = r0.isTerminated()
            if (r1 != 0) goto L6c
            r0.shutdown()
            r2 = 0
        L2f:
            if (r1 != 0) goto L41
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.InterruptedException -> L3a
            r4 = 1
            boolean r1 = r0.awaitTermination(r4, r3)     // Catch: java.lang.InterruptedException -> L3a
            goto L2f
        L3a:
            if (r2 != 0) goto L2f
            r0.shutdownNow()
            r2 = 1
            goto L2f
        L41:
            if (r2 == 0) goto L6c
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L6c
        L4b:
            boolean r1 = r0 instanceof android.content.res.TypedArray
            if (r1 == 0) goto L55
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            r0.recycle()
            goto L6c
        L55:
            boolean r1 = r0 instanceof android.media.MediaMetadataRetriever
            if (r1 == 0) goto L5f
            android.media.MediaMetadataRetriever r0 = (android.media.MediaMetadataRetriever) r0
            r0.release()
            goto L6c
        L5f:
            boolean r1 = r0 instanceof android.media.MediaDrm
            if (r1 == 0) goto L69
            android.media.MediaDrm r0 = (android.media.MediaDrm) r0
            r0.release()
            goto L6c
        L69:
            j8.o.o()
        L6c:
            return
    }

    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ void dump(java.lang.String r1) {
            r0 = this;
            super.dump(r1)
            return
    }

    @Override // bsh.BSHTypedVariableDeclaration, bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r4, bsh.Interpreter r5) {
            r3 = this;
            r3.renderTypeNode()
            java.lang.Class r0 = r3.evalType(r4, r5)
            r3.type = r0
            java.lang.Class<java.lang.AutoCloseable> r0 = java.lang.AutoCloseable.class
            java.lang.Class r1 = r3.getType()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L59
            bsh.BSHVariableDeclarator[] r0 = r3.getDeclarators()
            r1 = 0
            r0 = r0[r1]
            java.lang.String r0 = r0.name
            r3.name = r0
            super.eval(r4, r5)
            bsh.NameSpace r5 = r4.top()     // Catch: bsh.UtilEvalError -> L35
            java.lang.String r0 = r3.getName()     // Catch: bsh.UtilEvalError -> L35
            r1 = 1
            bsh.Variable r5 = r5.getVariableImpl(r0, r1)     // Catch: bsh.UtilEvalError -> L35
            r3.varThis = r5     // Catch: bsh.UtilEvalError -> L35
            bsh.Primitive r4 = bsh.Primitive.VOID
            return r4
        L35:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to evaluate the try-with-resource "
            r0.<init>(r1)
            java.lang.String r1 = r3.getName()
            r0.append(r1)
            java.lang.String r1 = ". With message:"
            r0.append(r1)
            java.lang.String r1 = r5.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            bsh.EvalError r4 = r5.toEvalError(r0, r3, r4)
            throw r4
        L59:
            bsh.EvalException r5 = new bsh.EvalException
            java.lang.Class<?> r0 = r3.type
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "The resource type "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " does not implement java.lang.AutoCloseable."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0, r3, r4)
            throw r5
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

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
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

    public java.lang.Class<?> getType() {
            r1 = this;
            java.lang.Class<?> r0 = r1.type
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

    @Override // bsh.BSHTypedVariableDeclaration, bsh.SimpleNode
    public /* bridge */ /* synthetic */ java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = super.toString()
            return r0
    }

    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ java.lang.String toString(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = super.toString(r1)
            return r1
    }
}
