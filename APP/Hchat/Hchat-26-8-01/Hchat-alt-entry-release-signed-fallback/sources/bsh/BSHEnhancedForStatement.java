package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHEnhancedForStatement extends bsh.SimpleNode implements bsh.ParserConstants {
    private static final long serialVersionUID = 1;
    final int blockId;
    boolean isFinal;
    java.lang.String label;
    java.lang.String varName;

    public BSHEnhancedForStatement(int r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.isFinal = r1
            java.util.concurrent.atomic.AtomicInteger r1 = bsh.BlockNameSpace.blockCount
            int r1 = r1.incrementAndGet()
            r0.blockId = r1
            return
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r13, bsh.Interpreter r14) {
            r12 = this;
            bsh.Modifiers r0 = new bsh.Modifiers
            r1 = 4
            r0.<init>(r1)
            boolean r1 = r12.isFinal
            if (r1 == 0) goto Lf
            java.lang.String r1 = "final"
            r0.addModifier(r1)
        Lf:
            bsh.NameSpace r1 = r13.top()
            r2 = 0
            bsh.Node r2 = r12.jjtGetChild(r2)
            int r3 = r12.jjtGetNumChildren()
            boolean r4 = r2 instanceof bsh.BSHType
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L3a
            bsh.BSHType r2 = (bsh.BSHType) r2
            java.lang.Class r2 = r2.getType(r13, r14)
            bsh.Node r4 = r12.jjtGetChild(r5)
            r5 = 2
            if (r3 <= r5) goto L34
            bsh.Node r3 = r12.jjtGetChild(r5)
            goto L35
        L34:
            r3 = r6
        L35:
            r11 = r3
            r3 = r2
            r2 = r4
            r4 = r11
            goto L44
        L3a:
            if (r3 <= r5) goto L41
            bsh.Node r3 = r12.jjtGetChild(r5)
            goto L42
        L41:
            r3 = r6
        L42:
            r4 = r3
            r3 = r6
        L44:
            java.lang.Object r2 = r2.eval(r13, r14)
            bsh.CollectionManager r5 = bsh.CollectionManager.getCollectionManager()
            java.util.Iterator r2 = r5.getBshIterator(r2)
            int r5 = r12.blockId     // Catch: java.lang.Throwable -> L6e
            bsh.NameSpace r5 = bsh.BlockNameSpace.getInstance(r1, r5)     // Catch: java.lang.Throwable -> L6e
            r13.swap(r5)     // Catch: java.lang.Throwable -> L6e
        L59:
            boolean r7 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L6e
            if (r7 != 0) goto Lcd
            boolean r7 = r2.hasNext()     // Catch: java.lang.Throwable -> L6e
            if (r7 == 0) goto Lcd
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L6e bsh.UtilEvalError -> L70
            if (r7 != 0) goto L72
            bsh.Primitive r7 = bsh.Primitive.NULL     // Catch: java.lang.Throwable -> L6e bsh.UtilEvalError -> L70
            goto L72
        L6e:
            r14 = move-exception
            goto Ld3
        L70:
            r14 = move-exception
            goto Lb5
        L72:
            r5.clear()     // Catch: java.lang.Throwable -> L6e bsh.UtilEvalError -> L70
            java.lang.String r8 = r12.varName     // Catch: java.lang.Throwable -> L6e bsh.UtilEvalError -> L70
            r5.setTypedVariable(r8, r3, r7, r0)     // Catch: java.lang.Throwable -> L6e bsh.UtilEvalError -> L70
            if (r4 != 0) goto L7d
            goto L59
        L7d:
            boolean r7 = r4 instanceof bsh.BSHBlock     // Catch: java.lang.Throwable -> L6e
            if (r7 == 0) goto L89
            r7 = r4
            bsh.BSHBlock r7 = (bsh.BSHBlock) r7     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r7 = r7.eval(r13, r14, r6)     // Catch: java.lang.Throwable -> L6e
            goto L8d
        L89:
            java.lang.Object r7 = r4.eval(r13, r14)     // Catch: java.lang.Throwable -> L6e
        L8d:
            boolean r8 = r7 instanceof bsh.ReturnControl     // Catch: java.lang.Throwable -> L6e
            if (r8 == 0) goto L59
            r8 = r7
            bsh.ReturnControl r8 = (bsh.ReturnControl) r8     // Catch: java.lang.Throwable -> L6e
            java.lang.String r9 = r8.label     // Catch: java.lang.Throwable -> L6e
            if (r9 == 0) goto La6
            java.lang.String r10 = r12.label     // Catch: java.lang.Throwable -> L6e
            if (r10 == 0) goto La2
            boolean r9 = r10.equals(r9)     // Catch: java.lang.Throwable -> L6e
            if (r9 != 0) goto La6
        La2:
            r13.swap(r1)
            return r7
        La6:
            int r8 = r8.kind     // Catch: java.lang.Throwable -> L6e
            r9 = 47
            if (r8 != r9) goto Lb0
            r13.swap(r1)
            return r7
        Lb0:
            r7 = 13
            if (r8 != r7) goto L59
            goto Lcd
        Lb5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6e
            r0.<init>()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r2 = "for loop iterator variable:"
            r0.append(r2)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r2 = r12.varName     // Catch: java.lang.Throwable -> L6e
            r0.append(r2)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6e
            bsh.EvalError r14 = r14.toEvalError(r0, r12, r13)     // Catch: java.lang.Throwable -> L6e
            throw r14     // Catch: java.lang.Throwable -> L6e
        Lcd:
            bsh.Primitive r14 = bsh.Primitive.VOID     // Catch: java.lang.Throwable -> L6e
            r13.swap(r1)
            return r14
        Ld3:
            r13.swap(r1)
            throw r14
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
            java.lang.String r1 = r3.varName
            r0.append(r1)
            java.lang.String r1 = ", final="
            r0.append(r1)
            boolean r1 = r3.isFinal
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
