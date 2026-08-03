package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHThrowStatement extends bsh.SimpleNode {
    private static final long serialVersionUID = 1;

    public BSHThrowStatement(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r2, bsh.Interpreter r3) {
            r1 = this;
            r0 = 0
            bsh.Node r0 = r1.jjtGetChild(r0)
            java.lang.Object r3 = r0.eval(r2, r3)
            boolean r0 = r3 instanceof java.lang.Throwable
            if (r0 != 0) goto L15
            bsh.EvalException r3 = new bsh.EvalException
            java.lang.String r0 = "Expression in 'throw' must be Throwable type"
            r3.<init>(r0, r1, r2)
            throw r3
        L15:
            bsh.TargetError r0 = new bsh.TargetError
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r0.<init>(r3, r1, r2)
            throw r0
    }
}
