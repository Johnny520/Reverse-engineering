package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHBlock extends bsh.SimpleNode {
    private static final long serialVersionUID = 1;
    final int blockId;
    private boolean hasClassDeclaration;
    private boolean isFirst;
    public boolean isStatic;
    public boolean isSynchronized;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface NodeFilter {
        boolean isVisible(bsh.Node r1);
    }

    public BSHBlock(int r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.isSynchronized = r1
            r0.isStatic = r1
            r0.hasClassDeclaration = r1
            r1 = 1
            r0.isFirst = r1
            java.util.concurrent.atomic.AtomicInteger r1 = bsh.BlockNameSpace.blockCount
            int r1 = r1.incrementAndGet()
            r0.blockId = r1
            return
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r2, bsh.Interpreter r3) {
            r1 = this;
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Object r2 = r1.eval(r2, r3, r0)
            return r2
    }

    public java.lang.Object eval(bsh.CallStack r3, bsh.Interpreter r4, java.lang.Boolean r5) {
            r2 = this;
            boolean r0 = r2.isSynchronized
            r1 = 0
            if (r0 == 0) goto L18
            r0 = 0
            bsh.Node r0 = r2.jjtGetChild(r0)
            java.lang.Object r0 = r0.eval(r3, r4)
            monitor-enter(r0)
            java.lang.Object r3 = r2.evalBlock(r3, r4, r5, r1)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return r3
        L15:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r3
        L18:
            java.lang.Object r3 = r2.evalBlock(r3, r4, r5, r1)
            return r3
    }

    public java.lang.Object evalBlock(bsh.CallStack r9, bsh.Interpreter r10, java.lang.Boolean r11, bsh.BSHBlock.NodeFilter r12) {
            r8 = this;
            bsh.Primitive r0 = bsh.Primitive.VOID
            r1 = 0
            if (r11 != 0) goto L14
            bsh.NameSpace r11 = r9.top()
            int r2 = r8.blockId
            bsh.NameSpace r11 = bsh.BlockNameSpace.getInstance(r11, r2)
            bsh.NameSpace r11 = r9.swap(r11)
            goto L2b
        L14:
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L2a
            bsh.BlockNameSpace r11 = new bsh.BlockNameSpace
            bsh.NameSpace r2 = r9.top()
            int r3 = r8.blockId
            r11.<init>(r2, r3)
            bsh.NameSpace r11 = r9.swap(r11)
            goto L2b
        L2a:
            r11 = r1
        L2b:
            boolean r2 = r8.isSynchronized
            int r3 = r8.jjtGetNumChildren()
            r4 = 0
            boolean r5 = r8.isFirst     // Catch: java.lang.Throwable -> L3b
            if (r5 != 0) goto L3e
            boolean r5 = r8.hasClassDeclaration     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L5b
            goto L3e
        L3b:
            r10 = move-exception
            goto La4
        L3e:
            r5 = r2
        L3f:
            if (r5 >= r3) goto L5b
            bsh.Node r6 = r8.jjtGetChild(r5)     // Catch: java.lang.Throwable -> L3b
            if (r12 == 0) goto L4e
            boolean r7 = r12.isVisible(r6)     // Catch: java.lang.Throwable -> L3b
            if (r7 != 0) goto L4e
            goto L58
        L4e:
            boolean r7 = r6 instanceof bsh.BSHClassDeclaration     // Catch: java.lang.Throwable -> L3b
            if (r7 == 0) goto L58
            r7 = 1
            r8.hasClassDeclaration = r7     // Catch: java.lang.Throwable -> L3b
            r6.eval(r9, r10)     // Catch: java.lang.Throwable -> L3b
        L58:
            int r5 = r5 + 1
            goto L3f
        L5b:
            if (r2 >= r3) goto L8a
            bsh.Node r5 = r8.jjtGetChild(r2)     // Catch: java.lang.Throwable -> L3b
            boolean r6 = r5 instanceof bsh.BSHClassDeclaration     // Catch: java.lang.Throwable -> L3b
            if (r6 == 0) goto L66
            goto L87
        L66:
            if (r12 == 0) goto L6f
            boolean r6 = r12.isVisible(r5)     // Catch: java.lang.Throwable -> L3b
            if (r6 != 0) goto L6f
            goto L87
        L6f:
            boolean r6 = r5 instanceof bsh.BSHEnumConstant     // Catch: java.lang.Throwable -> L3b
            if (r6 == 0) goto L7e
            if (r1 != 0) goto L7a
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3b
            r1.<init>()     // Catch: java.lang.Throwable -> L3b
        L7a:
            r1.add(r5)     // Catch: java.lang.Throwable -> L3b
            goto L87
        L7e:
            java.lang.Object r0 = r5.eval(r9, r10)     // Catch: java.lang.Throwable -> L3b
            boolean r5 = r0 instanceof bsh.ReturnControl     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L87
            goto L8a
        L87:
            int r2 = r2 + 1
            goto L5b
        L8a:
            if (r1 == 0) goto L9c
        L8c:
            boolean r12 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3b
            if (r12 != 0) goto L9c
            java.lang.Object r12 = r1.remove(r4)     // Catch: java.lang.Throwable -> L3b
            bsh.Node r12 = (bsh.Node) r12     // Catch: java.lang.Throwable -> L3b
            r12.eval(r9, r10)     // Catch: java.lang.Throwable -> L3b
            goto L8c
        L9c:
            r8.isFirst = r4
            if (r11 == 0) goto La3
            r9.swap(r11)
        La3:
            return r0
        La4:
            r8.isFirst = r4
            if (r11 == 0) goto Lab
            r9.swap(r11)
        Lab:
            throw r10
    }

    @Override // bsh.SimpleNode
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ": static="
            r0.append(r1)
            boolean r1 = r2.isStatic
            r0.append(r1)
            java.lang.String r1 = ", synchronized="
            r0.append(r1)
            boolean r1 = r2.isSynchronized
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
