package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHForStatement extends bsh.SimpleNode implements bsh.ParserConstants {
    private static final long serialVersionUID = 1;
    final int blockId;
    public boolean hasExpression;
    public boolean hasForInit;
    public boolean hasForUpdate;
    java.lang.String label;

    public BSHForStatement(int r1) {
            r0 = this;
            r0.<init>(r1)
            java.util.concurrent.atomic.AtomicInteger r1 = bsh.BlockNameSpace.blockCount
            int r1 = r1.incrementAndGet()
            r0.blockId = r1
            return
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r10, bsh.Interpreter r11) {
            r9 = this;
            boolean r0 = r9.hasForInit
            r1 = 0
            r2 = 0
            if (r0 == 0) goto Lc
            bsh.Node r0 = r9.jjtGetChild(r2)
            r2 = 1
            goto Ld
        Lc:
            r0 = r1
        Ld:
            boolean r3 = r9.hasExpression
            if (r3 == 0) goto L18
            int r3 = r2 + 1
            bsh.Node r2 = r9.jjtGetChild(r2)
            goto L1a
        L18:
            r3 = r2
            r2 = r1
        L1a:
            boolean r4 = r9.hasForUpdate
            if (r4 == 0) goto L25
            int r4 = r3 + 1
            bsh.Node r3 = r9.jjtGetChild(r3)
            goto L27
        L25:
            r4 = r3
            r3 = r1
        L27:
            int r5 = r9.jjtGetNumChildren()
            if (r4 >= r5) goto L32
            bsh.Node r4 = r9.jjtGetChild(r4)
            goto L33
        L32:
            r4 = r1
        L33:
            bsh.NameSpace r5 = r10.top()
            bsh.BlockNameSpace r6 = new bsh.BlockNameSpace
            int r7 = r9.blockId
            r6.<init>(r5, r7)
            r10.swap(r6)
            boolean r6 = r9.hasForInit     // Catch: java.lang.Throwable -> L49
            if (r6 == 0) goto L4b
            r0.eval(r10, r11)     // Catch: java.lang.Throwable -> L49
            goto L4b
        L49:
            r11 = move-exception
            goto La4
        L4b:
            boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L9e
            boolean r0 = r9.hasExpression     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L5c
            boolean r0 = bsh.BSHIfStatement.evaluateCondition(r2, r10, r11)     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L5c
            goto L9e
        L5c:
            if (r4 == 0) goto L96
            boolean r0 = r4 instanceof bsh.BSHBlock     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L6a
            r0 = r4
            bsh.BSHBlock r0 = (bsh.BSHBlock) r0     // Catch: java.lang.Throwable -> L49
            java.lang.Object r0 = r0.eval(r10, r11, r1)     // Catch: java.lang.Throwable -> L49
            goto L6e
        L6a:
            java.lang.Object r0 = r4.eval(r10, r11)     // Catch: java.lang.Throwable -> L49
        L6e:
            boolean r6 = r0 instanceof bsh.ReturnControl     // Catch: java.lang.Throwable -> L49
            if (r6 == 0) goto L96
            r6 = r0
            bsh.ReturnControl r6 = (bsh.ReturnControl) r6     // Catch: java.lang.Throwable -> L49
            java.lang.String r7 = r6.label     // Catch: java.lang.Throwable -> L49
            if (r7 == 0) goto L87
            java.lang.String r8 = r9.label     // Catch: java.lang.Throwable -> L49
            if (r8 == 0) goto L83
            boolean r7 = r8.equals(r7)     // Catch: java.lang.Throwable -> L49
            if (r7 != 0) goto L87
        L83:
            r10.swap(r5)
            return r0
        L87:
            int r6 = r6.kind     // Catch: java.lang.Throwable -> L49
            r7 = 47
            if (r6 != r7) goto L91
            r10.swap(r5)
            return r0
        L91:
            r0 = 13
            if (r6 != r0) goto L96
            goto L9e
        L96:
            boolean r0 = r9.hasForUpdate     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L4b
            r3.eval(r10, r11)     // Catch: java.lang.Throwable -> L49
            goto L4b
        L9e:
            bsh.Primitive r11 = bsh.Primitive.VOID     // Catch: java.lang.Throwable -> L49
            r10.swap(r5)
            return r11
        La4:
            r10.swap(r5)
            throw r11
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
            java.lang.String r2 = r3.label
            r0.append(r2)
            r0.append(r1)
            boolean r1 = r3.hasForInit
            r0.append(r1)
            java.lang.String r1 = " ; "
            r0.append(r1)
            boolean r2 = r3.hasExpression
            r0.append(r2)
            r0.append(r1)
            boolean r1 = r3.hasForUpdate
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
