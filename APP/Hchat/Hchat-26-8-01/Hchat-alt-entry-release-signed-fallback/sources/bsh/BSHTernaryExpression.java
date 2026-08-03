package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHTernaryExpression extends bsh.SimpleNode {
    private static final long serialVersionUID = 1;

    public BSHTernaryExpression(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r4, bsh.Interpreter r5) {
            r3 = this;
            r0 = 0
            bsh.Node r0 = r3.jjtGetChild(r0)
            r1 = 1
            bsh.Node r1 = r3.jjtGetChild(r1)
            r2 = 2
            bsh.Node r2 = r3.jjtGetChild(r2)
            boolean r0 = bsh.BSHIfStatement.evaluateCondition(r0, r4, r5)
            if (r0 == 0) goto L1a
            java.lang.Object r4 = r1.eval(r4, r5)
            return r4
        L1a:
            java.lang.Object r4 = r2.eval(r4, r5)
            return r4
    }
}
