package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHWhileStatement extends bsh.SimpleNode implements bsh.ParserConstants {
    private static final long serialVersionUID = 1;
    boolean isDoStatement;
    java.lang.String label;

    public BSHWhileStatement(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r10, bsh.Interpreter r11) {
            r9 = this;
            int r0 = r9.jjtGetNumChildren()
            boolean r1 = r9.isDoStatement
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L14
            bsh.Node r0 = r9.jjtGetChild(r4)
            bsh.Node r1 = r9.jjtGetChild(r3)
            goto L23
        L14:
            bsh.Node r1 = r9.jjtGetChild(r3)
            if (r0 <= r4) goto L1f
            bsh.Node r0 = r9.jjtGetChild(r4)
            goto L20
        L1f:
            r0 = r2
        L20:
            r8 = r1
            r1 = r0
            r0 = r8
        L23:
            boolean r4 = r9.isDoStatement
        L25:
            boolean r5 = java.lang.Thread.interrupted()
            if (r5 != 0) goto L6a
            if (r4 != 0) goto L33
            boolean r4 = bsh.BSHIfStatement.evaluateCondition(r0, r10, r11)
            if (r4 == 0) goto L6a
        L33:
            if (r1 != 0) goto L36
            goto L68
        L36:
            boolean r4 = r1 instanceof bsh.BSHBlock
            if (r4 == 0) goto L42
            r4 = r1
            bsh.BSHBlock r4 = (bsh.BSHBlock) r4
            java.lang.Object r4 = r4.eval(r10, r11, r2)
            goto L46
        L42:
            java.lang.Object r4 = r1.eval(r10, r11)
        L46:
            boolean r5 = r4 instanceof bsh.ReturnControl
            if (r5 == 0) goto L68
            r5 = r4
            bsh.ReturnControl r5 = (bsh.ReturnControl) r5
            java.lang.String r6 = r5.label
            if (r6 == 0) goto L5c
            java.lang.String r7 = r9.label
            if (r7 == 0) goto L62
            boolean r6 = r7.equals(r6)
            if (r6 != 0) goto L5c
            goto L62
        L5c:
            int r5 = r5.kind
            r6 = 47
            if (r5 != r6) goto L63
        L62:
            return r4
        L63:
            r4 = 13
            if (r5 != r4) goto L68
            goto L6a
        L68:
            r4 = r3
            goto L25
        L6a:
            bsh.Primitive r10 = bsh.Primitive.VOID
            return r10
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
            java.lang.String r1 = r2.label
            r0.append(r1)
            java.lang.String r1 = ": do="
            r0.append(r1)
            boolean r1 = r2.isDoStatement
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
