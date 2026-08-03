package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHArguments extends bsh.SimpleNode {
    private static final long serialVersionUID = 1;

    public BSHArguments(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public java.lang.Object[] getArguments(bsh.CallStack r6, bsh.Interpreter r7) {
            r5 = this;
            int r0 = r5.jjtGetNumChildren()
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
        L7:
            if (r2 >= r0) goto L36
            bsh.Node r3 = r5.jjtGetChild(r2)
            java.lang.Object r3 = r3.eval(r6, r7)
            r1[r2] = r3
            bsh.Primitive r4 = bsh.Primitive.VOID
            if (r3 == r4) goto L1a
            int r2 = r2 + 1
            goto L7
        L1a:
            bsh.EvalException r7 = new bsh.EvalException
            bsh.Node r0 = r5.jjtGetChild(r2)
            java.lang.String r0 = r0.getText()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Undefined argument: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.<init>(r0, r5, r6)
            throw r7
        L36:
            return r1
    }
}
