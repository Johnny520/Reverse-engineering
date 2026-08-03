package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHCastExpression extends bsh.SimpleNode {
    private static final long serialVersionUID = 1;

    public BSHCastExpression(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r4, bsh.Interpreter r5) {
            r3 = this;
            r0 = 0
            bsh.Node r1 = r3.jjtGetChild(r0)
            bsh.BSHType r1 = (bsh.BSHType) r1
            java.lang.Class r1 = r1.getType(r4, r5)
            r2 = 1
            bsh.Node r2 = r3.jjtGetChild(r2)
            java.lang.Object r5 = r2.eval(r4, r5)
            java.lang.Object r4 = bsh.Types.castObject(r5, r1, r0)     // Catch: bsh.UtilEvalError -> L19
            return r4
        L19:
            r5 = move-exception
            bsh.EvalError r4 = r5.toEvalError(r3, r4)
            throw r4
    }
}
