package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class BSHLiteral extends bsh.SimpleNode {
    public static volatile boolean internStrings = true;
    private static final long serialVersionUID = 1;
    public java.lang.Object value;

    public BSHLiteral(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private char getEscapeChar(char r2) {
            r1 = this;
            r0 = 98
            if (r2 == r0) goto L21
            r0 = 102(0x66, float:1.43E-43)
            if (r2 == r0) goto L1e
            r0 = 110(0x6e, float:1.54E-43)
            if (r2 == r0) goto L1b
            r0 = 114(0x72, float:1.6E-43)
            if (r2 == r0) goto L18
            r0 = 116(0x74, float:1.63E-43)
            if (r2 == r0) goto L15
            return r2
        L15:
            r2 = 9
            return r2
        L18:
            r2 = 13
            return r2
        L1b:
            r2 = 10
            return r2
        L1e:
            r2 = 12
            return r2
        L21:
            r2 = 8
            return r2
    }

    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ void add(bsh.Node r1) {
            r0 = this;
            super.add(r1)
            return
    }

    public void charSetup(java.lang.String r5) {
            r4 = this;
            char[] r0 = r5.toCharArray()
            int r0 = r0.length
            if (r0 == 0) goto L4a
            r1 = 4
            if (r0 > r1) goto L4a
            r1 = 92
            r2 = 0
            r3 = 1
            if (r0 <= r3) goto L17
            char r0 = r5.charAt(r2)
            if (r0 == r1) goto L17
            goto L4a
        L17:
            char r0 = r5.charAt(r2)     // Catch: java.lang.Exception -> L46
            if (r0 != r1) goto L3e
            char r0 = r5.charAt(r3)     // Catch: java.lang.Exception -> L46
            boolean r1 = java.lang.Character.isDigit(r0)     // Catch: java.lang.Exception -> L46
            if (r1 == 0) goto L3a
            java.lang.String r0 = r5.substring(r3)     // Catch: java.lang.Exception -> L46
            r1 = 8
            int r0 = java.lang.Integer.parseInt(r0, r1)     // Catch: java.lang.Exception -> L46
            char r0 = (char) r0     // Catch: java.lang.Exception -> L46
            r1 = 255(0xff, float:3.57E-43)
            if (r1 >= r0) goto L3e
            r4.stringSetup(r5)     // Catch: java.lang.Exception -> L46
            return
        L3a:
            char r0 = r4.getEscapeChar(r0)     // Catch: java.lang.Exception -> L46
        L3e:
            bsh.Primitive r1 = new bsh.Primitive     // Catch: java.lang.Exception -> L46
            r1.<init>(r0)     // Catch: java.lang.Exception -> L46
            r4.value = r1     // Catch: java.lang.Exception -> L46
            return
        L46:
            r4.stringSetup(r5)
            return
        L4a:
            r4.stringSetup(r5)
            return
    }

    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ void dump(java.lang.String r1) {
            r0 = this;
            super.dump(r1)
            return
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r1, bsh.Interpreter r2) {
            r0 = this;
            java.lang.Object r1 = r0.value
            return r1
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

    public void stringSetup(java.lang.String r12) {
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r12.length()
            r2 = 0
        La:
            if (r2 >= r1) goto L87
            char r3 = r12.charAt(r2)
            r4 = 92
            if (r3 != r4) goto L81
            int r3 = r2 + 1
            char r4 = r12.charAt(r3)
            boolean r5 = java.lang.Character.isDigit(r4)
            if (r5 == 0) goto L7a
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = java.lang.Integer.parseInt(r5)
            r6 = 8
            if (r5 >= r6) goto L7a
            int r2 = r2 + 3
            int r5 = r1 + (-1)
            int r2 = java.lang.Math.min(r2, r5)
            r5 = r3
        L35:
            if (r5 >= r2) goto L4f
            int r7 = r5 + 1
            char r8 = r12.charAt(r7)
            boolean r9 = java.lang.Character.isDigit(r8)
            if (r9 == 0) goto L4f
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r8 = java.lang.Integer.parseInt(r8)
            if (r8 >= r6) goto L4f
            r5 = r7
            goto L35
        L4f:
            int r2 = r5 + 1
            java.lang.String r2 = r12.substring(r3, r2)
            int r7 = r2.length()
            r8 = 3
            if (r7 != r8) goto L72
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r4 = java.lang.Integer.parseInt(r4)
            if (r4 <= r8) goto L72
            int r2 = r5 + (-1)
            java.lang.String r3 = r12.substring(r3, r5)
            int r3 = java.lang.Integer.parseInt(r3, r6)
            char r3 = (char) r3
            goto L81
        L72:
            int r2 = java.lang.Integer.parseInt(r2, r6)
            char r2 = (char) r2
            r3 = r2
            r2 = r5
            goto L81
        L7a:
            char r2 = r11.getEscapeChar(r4)
            r10 = r3
            r3 = r2
            r2 = r10
        L81:
            r0.append(r3)
            int r2 = r2 + 1
            goto La
        L87:
            java.lang.String r12 = r0.toString()
            boolean r0 = bsh.BSHLiteral.internStrings
            if (r0 == 0) goto L93
            java.lang.String r12 = r12.intern()
        L93:
            r11.value = r12
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
            java.lang.Object r1 = r2.value
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
