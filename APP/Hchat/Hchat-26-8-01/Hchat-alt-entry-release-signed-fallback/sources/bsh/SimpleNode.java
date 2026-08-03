package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class SimpleNode implements bsh.Node, java.io.Serializable {
    private static final long serialVersionUID = 1;
    protected bsh.Node[] children;
    private int cursor;
    transient bsh.Token firstToken;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    protected int f924id;
    private int lastRet;
    transient bsh.Token lastToken;
    protected bsh.Node parent;
    protected transient bsh.Parser parser;
    private java.lang.String sourceFile;

    public SimpleNode(int r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.cursor = r0
            r0 = -1
            r1.lastRet = r0
            r1.f924id = r2
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    public void add(bsh.Node r6) {
            r5 = this;
            int r0 = r5.jjtGetNumChildren()
            int r0 = r0 + 1
            bsh.Node[] r1 = new bsh.Node[r0]
            bsh.Node[] r2 = r5.children
            r3 = 0
            int r4 = r5.cursor
            java.lang.System.arraycopy(r2, r3, r1, r3, r4)
            bsh.Node[] r2 = r5.children
            int r3 = r5.cursor
            int r4 = r3 + 1
            int r0 = r0 - r3
            int r0 = r0 + (-1)
            java.lang.System.arraycopy(r2, r3, r1, r4, r0)
            r5.children = r1
            int r0 = r5.cursor
            int r2 = r0 + 1
            r5.cursor = r2
            r1[r0] = r6
            r0 = -1
            r5.lastRet = r0
            r6.jjtSetParent(r5)
            return
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void add(bsh.Node r1) {
            r0 = this;
            bsh.Node r1 = (bsh.Node) r1
            r0.add(r1)
            return
    }

    @Override // bsh.Node
    public void dump(java.lang.String r5) {
            r4 = this;
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = r4.toString(r5)
            r0.println(r1)
            bsh.Node[] r0 = r4.children
            if (r0 == 0) goto L2e
            r0 = 0
        Le:
            bsh.Node[] r1 = r4.children
            int r2 = r1.length
            if (r0 >= r2) goto L2e
            r1 = r1[r0]
            if (r1 == 0) goto L2b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r3 = " "
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.dump(r2)
        L2b:
            int r0 = r0 + 1
            goto Le
        L2e:
            return
    }

    @Override // bsh.Node
    public java.lang.Object eval(bsh.CallStack r2, bsh.Interpreter r3) {
            r1 = this;
            bsh.InterpreterError r2 = new bsh.InterpreterError
            java.lang.Class r3 = r1.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.String r0 = "Unimplemented or inappropriate for "
            java.lang.String r3 = r0.concat(r3)
            r2.<init>(r3)
            throw r2
    }

    @Override // bsh.Node
    public int getId() {
            r1 = this;
            int r0 = r1.f924id
            return r0
    }

    @Override // bsh.Node
    public int getLineNumber() {
            r1 = this;
            bsh.Token r0 = r1.firstToken
            if (r0 == 0) goto L7
            int r0 = r0.beginLine
            return r0
        L7:
            r0 = -1
            return r0
    }

    @Override // bsh.Node
    public java.lang.String getSourceFile() {
            r1 = this;
            java.lang.String r0 = r1.sourceFile
            if (r0 != 0) goto Lf
            bsh.Node r0 = r1.parent
            if (r0 == 0) goto Ld
            java.lang.String r0 = r0.getSourceFile()
            return r0
        Ld:
            java.lang.String r0 = "<unknown file>"
        Lf:
            return r0
    }

    @Override // bsh.Node
    public java.lang.String getText() {
            r5 = this;
            bsh.Token r0 = r5.firstToken
            if (r0 == 0) goto L46
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L9:
            java.lang.String r2 = r0.image
            r1.append(r2)
            bsh.Token r2 = r5.lastToken
            if (r0 == r2) goto L41
            java.lang.String r2 = r0.image
            java.lang.String r3 = "{"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L41
            java.lang.String r2 = r0.image
            java.lang.String r3 = ";"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L27
            goto L41
        L27:
            bsh.Token r2 = r0.next
            if (r2 != 0) goto L2c
            goto L41
        L2c:
            int r3 = r2.beginLine
            int r4 = r0.endLine
            if (r3 > r4) goto L3a
            int r3 = r2.beginColumn
            int r0 = r0.endColumn
            int r0 = r0 + 1
            if (r3 <= r0) goto L3f
        L3a:
            java.lang.String r0 = " "
            r1.append(r0)
        L3f:
            r0 = r2
            goto L9
        L41:
            java.lang.String r0 = r1.toString()
            return r0
        L46:
            java.lang.String r0 = r5.toString()
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
            r2 = this;
            int r0 = r2.cursor
            int r1 = r2.jjtGetNumChildren()
            if (r0 >= r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
            r1 = this;
            int r0 = r1.cursor
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // bsh.Node
    public void jjtAddChild(bsh.Node r5, int r6) {
            r4 = this;
            bsh.Node[] r0 = r4.children
            if (r0 != 0) goto Lb
            int r0 = r6 + 1
            bsh.Node[] r0 = new bsh.Node[r0]
            r4.children = r0
            goto L19
        Lb:
            int r1 = r0.length
            if (r6 < r1) goto L19
            int r1 = r6 + 1
            bsh.Node[] r1 = new bsh.Node[r1]
            int r2 = r0.length
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            r4.children = r1
        L19:
            bsh.Node[] r0 = r4.children
            r0[r6] = r5
            return
    }

    @Override // bsh.Node
    public void jjtClose() {
            r0 = this;
            return
    }

    @Override // bsh.Node
    public bsh.Node jjtGetChild(int r2) {
            r1 = this;
            bsh.Node[] r0 = r1.children
            r2 = r0[r2]
            return r2
    }

    @Override // bsh.Node
    public bsh.Node[] jjtGetChildren() {
            r1 = this;
            bsh.Node[] r0 = r1.children
            if (r0 != 0) goto L9
            r0 = 0
            bsh.Node[] r0 = new bsh.Node[r0]
            r1.children = r0
        L9:
            bsh.Node[] r0 = r1.children
            return r0
    }

    @Override // bsh.Node
    public int jjtGetNumChildren() {
            r1 = this;
            bsh.Node[] r0 = r1.jjtGetChildren()
            int r0 = r0.length
            return r0
    }

    @Override // bsh.Node
    public bsh.Node jjtGetParent() {
            r1 = this;
            bsh.Node r0 = r1.parent
            return r0
    }

    @Override // bsh.Node
    public void jjtOpen() {
            r0 = this;
            return
    }

    @Override // bsh.Node
    public void jjtSetParent(bsh.Node r1) {
            r0 = this;
            r0.parent = r1
            return
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public bsh.Node next() {
            r3 = this;
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L13
            bsh.Node[] r0 = r3.children
            int r1 = r3.cursor
            int r2 = r1 + 1
            r3.cursor = r2
            r3.lastRet = r1
            r0 = r0[r1]
            return r0
        L13:
            bsh.j.e()
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ java.lang.Object next() {
            r1 = this;
            bsh.Node r0 = r1.next()
            return r0
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
            r1 = this;
            int r0 = r1.cursor
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.ListIterator
    public bsh.Node previous() {
            r2 = this;
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L13
            bsh.Node[] r0 = r2.children
            int r1 = r2.cursor
            int r1 = r1 + (-1)
            r2.cursor = r1
            r2.lastRet = r1
            r0 = r0[r1]
            return r0
        L13:
            bsh.j.e()
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ bsh.Node previous() {
            r1 = this;
            bsh.Node r0 = r1.previous()
            return r0
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
            r1 = this;
            int r0 = r1.cursor
            int r0 = r0 + (-1)
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
            r5 = this;
            int r0 = r5.lastRet
            if (r0 < 0) goto L21
            r5.cursor = r0
            bsh.Node[] r1 = r5.children
            int r2 = r1.length
            int r2 = r2 + (-1)
            bsh.Node[] r3 = new bsh.Node[r2]
            r4 = 0
            java.lang.System.arraycopy(r1, r4, r3, r4, r0)
            bsh.Node[] r0 = r5.children
            int r1 = r5.cursor
            int r4 = r1 + 1
            int r2 = r2 - r1
            java.lang.System.arraycopy(r0, r4, r3, r1, r2)
            r5.children = r3
            r0 = -1
            r5.lastRet = r0
            return
        L21:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    public void set(bsh.Node r3) {
            r2 = this;
            int r0 = r2.lastRet
            if (r0 < 0) goto L9
            bsh.Node[] r1 = r2.children
            r1[r0] = r3
            return
        L9:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void set(bsh.Node r1) {
            r0 = this;
            bsh.Node r1 = (bsh.Node) r1
            r0.set(r1)
            return
    }

    @Override // bsh.Node
    public void setSourceFile(java.lang.String r1) {
            r0 = this;
            r0.sourceFile = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String[] r0 = bsh.ParserTreeConstants.jjtNodeName
            int r1 = r2.f924id
            r0 = r0[r1]
            return r0
    }

    @Override // bsh.Node
    public java.lang.String toString(java.lang.String r2) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = r1.toString()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
