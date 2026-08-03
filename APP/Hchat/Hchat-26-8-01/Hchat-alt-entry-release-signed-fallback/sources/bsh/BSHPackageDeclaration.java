package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class BSHPackageDeclaration extends bsh.SimpleNode {
    private static final long serialVersionUID = 1;

    public BSHPackageDeclaration(int r1) {
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
    public java.lang.Object eval(bsh.CallStack r2, bsh.Interpreter r3) {
            r1 = this;
            r3 = 0
            bsh.Node r3 = r1.jjtGetChild(r3)
            bsh.BSHAmbiguousName r3 = (bsh.BSHAmbiguousName) r3
            bsh.NameSpace r2 = r2.top()
            java.lang.String r0 = r3.text
            r2.setPackage(r0)
            java.lang.String r3 = r3.text
            r2.importPackage(r3)
            bsh.Primitive r2 = bsh.Primitive.VOID
            return r2
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
