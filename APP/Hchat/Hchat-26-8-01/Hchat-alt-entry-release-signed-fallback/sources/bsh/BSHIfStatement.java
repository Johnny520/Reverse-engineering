package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHIfStatement extends bsh.SimpleNode {
    private static final long serialVersionUID = 1;
    boolean isClosed;

    public BSHIfStatement(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static boolean evaluateCondition(bsh.Node r1, bsh.CallStack r2, bsh.Interpreter r3) {
            java.lang.Object r3 = r1.eval(r2, r3)
            bsh.Primitive r0 = bsh.Primitive.VOID
            if (r3 == r0) goto L15
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Object r1 = bsh.Primitive.castWrapper(r1, r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
        L15:
            bsh.EvalException r3 = new bsh.EvalException
            java.lang.String r0 = "Condition evaluates to void type"
            r3.<init>(r0, r1, r2)
            throw r3
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r4, bsh.Interpreter r5) {
            r3 = this;
            r0 = 0
            bsh.Node r0 = r3.jjtGetChild(r0)
            boolean r0 = evaluateCondition(r0, r4, r5)
            r1 = 1
            if (r0 == 0) goto L19
            boolean r0 = r3.isClosed
            if (r0 != 0) goto L36
            bsh.Node r0 = r3.jjtGetChild(r1)
            java.lang.Object r4 = r0.eval(r4, r5)
            goto L37
        L19:
            int r0 = r3.jjtGetNumChildren()
            r2 = 2
            if (r0 <= r2) goto L29
            bsh.Node r0 = r3.jjtGetChild(r2)
            java.lang.Object r4 = r0.eval(r4, r5)
            goto L37
        L29:
            boolean r0 = r3.isClosed
            if (r0 == 0) goto L36
            bsh.Node r0 = r3.jjtGetChild(r1)
            java.lang.Object r4 = r0.eval(r4, r5)
            goto L37
        L36:
            r4 = 0
        L37:
            boolean r5 = r4 instanceof bsh.ReturnControl
            if (r5 == 0) goto L3c
            return r4
        L3c:
            bsh.Primitive r4 = bsh.Primitive.VOID
            return r4
    }
}
