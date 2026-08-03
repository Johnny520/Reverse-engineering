package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHStatementExpressionList extends bsh.SimpleNode {
    private static final long serialVersionUID = 1;

    public BSHStatementExpressionList(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r4, bsh.Interpreter r5) {
            r3 = this;
            int r0 = r3.jjtGetNumChildren()
            r1 = 0
        L5:
            if (r1 >= r0) goto L11
            bsh.Node r2 = r3.jjtGetChild(r1)
            r2.eval(r4, r5)
            int r1 = r1 + 1
            goto L5
        L11:
            bsh.Primitive r4 = bsh.Primitive.VOID
            return r4
    }
}
