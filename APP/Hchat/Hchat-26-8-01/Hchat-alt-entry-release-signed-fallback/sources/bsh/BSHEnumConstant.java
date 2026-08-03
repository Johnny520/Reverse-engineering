package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class BSHEnumConstant extends bsh.SimpleNode {
    private static final long serialVersionUID = 1;
    java.lang.Object[] args;
    bsh.Modifiers mods;
    java.lang.String name;

    public BSHEnumConstant(int r2) {
            r1 = this;
            r1.<init>(r2)
            bsh.Modifiers r2 = new bsh.Modifiers
            r0 = 3
            r2.<init>(r0)
            r1.mods = r2
            r2.setConstant()
            bsh.Modifiers r2 = r1.mods
            java.lang.String r0 = "enum"
            r2.addModifier(r0)
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
    public java.lang.Object eval(bsh.CallStack r5, bsh.Interpreter r6) {
            r4 = this;
            bsh.NameSpace r0 = r5.top()
            java.lang.String r1 = r4.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ""
            r2.<init>(r3)
            java.lang.Object r3 = r0.classInstance
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L21
            bsh.Primitive r5 = bsh.Primitive.VOID
            return r5
        L21:
            boolean r1 = r4.hasArguments(r5, r6)
            if (r1 == 0) goto L3c
            java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.Object[]>> r1 = bsh.This.CONTEXT_ARGS
            java.lang.Object r1 = r1.get()
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r0 = r0.classInstance
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r2 = r4.getArguments(r5, r6)
            r1.put(r0, r2)
        L3c:
            r0 = 0
        L3d:
            int r1 = r4.jjtGetNumChildren()
            if (r0 >= r1) goto L59
            bsh.Node r1 = r4.jjtGetChild(r0)
            boolean r1 = r1 instanceof bsh.BSHBlock
            if (r1 == 0) goto L56
            bsh.Node r1 = r4.jjtGetChild(r0)
            bsh.BSHBlock r1 = (bsh.BSHBlock) r1
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.eval(r5, r6, r2)
        L56:
            int r0 = r0 + 1
            goto L3d
        L59:
            bsh.Primitive r5 = bsh.Primitive.VOID
            return r5
    }

    public java.lang.Object[] getArguments(bsh.CallStack r3, bsh.Interpreter r4) {
            r2 = this;
            java.lang.Object[] r0 = r2.args
            if (r0 != 0) goto L1f
            int r0 = r2.jjtGetNumChildren()
            if (r0 <= 0) goto L1f
            r0 = 0
            bsh.Node r1 = r2.jjtGetChild(r0)
            boolean r1 = r1 instanceof bsh.BSHArguments
            if (r1 == 0) goto L1f
            bsh.Node r0 = r2.jjtGetChild(r0)
            bsh.BSHArguments r0 = (bsh.BSHArguments) r0
            java.lang.Object[] r3 = r0.getArguments(r3, r4)
            r2.args = r3
        L1f:
            java.lang.Object[] r3 = r2.args
            return r3
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
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            return r0
    }

    public boolean hasArguments(bsh.CallStack r1, bsh.Interpreter r2) {
            r0 = this;
            java.lang.Object[] r1 = r0.getArguments(r1, r2)
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
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
            bsh.Modifiers r1 = r3.mods
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.Class r2 = r3.getType()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = r3.name
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
