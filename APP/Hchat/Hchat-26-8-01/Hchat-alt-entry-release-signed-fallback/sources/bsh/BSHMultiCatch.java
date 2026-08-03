package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class BSHMultiCatch extends bsh.SimpleNode {
    public static final java.lang.Class<?> UNTYPED = null;
    private static final long serialVersionUID = 1;
    public boolean isFinal;
    public java.lang.String name;
    public java.lang.Class<?>[] types;

    public BSHMultiCatch(int r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.isFinal = r1
            return
    }

    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ void add(bsh.Node r1) {
            r0 = this;
            super.add(r1)
            return
    }

    public int countTypes() {
            r1 = this;
            int r0 = r1.jjtGetNumChildren()
            if (r0 <= 0) goto Lb
            int r0 = r1.jjtGetNumChildren()
            return r0
        Lb:
            r0 = 1
            return r0
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
            java.lang.Class<?>[] r0 = r3.types
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = r3.countTypes()
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r3.types = r0
            boolean r0 = r3.isUntyped()
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.Class<?>[] r4 = r3.types
            java.lang.Class<?> r5 = bsh.BSHMultiCatch.UNTYPED
            r4[r1] = r5
            goto L32
        L1b:
            int r0 = r3.countTypes()
            if (r1 >= r0) goto L32
            java.lang.Class<?>[] r0 = r3.types
            bsh.Node r2 = r3.jjtGetChild(r1)
            bsh.BSHType r2 = (bsh.BSHType) r2
            java.lang.Class r2 = r2.getType(r4, r5)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L1b
        L32:
            java.lang.Class<?>[] r4 = r3.types
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

    public java.lang.Class<?>[] getTypes() {
            r1 = this;
            java.lang.Class<?>[] r0 = r1.types
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

    public boolean isFinal() {
            r2 = this;
            boolean r0 = r2.isFinal
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            int r0 = r2.countTypes()
            if (r0 <= r1) goto Ld
            return r1
        Ld:
            r0 = 0
            return r0
    }

    public boolean isUntyped() {
            r1 = this;
            int r0 = r1.jjtGetNumChildren()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
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
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r1 = ", final="
            r0.append(r1)
            boolean r1 = r2.isFinal
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ java.lang.String toString(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = super.toString(r1)
            return r1
    }
}
