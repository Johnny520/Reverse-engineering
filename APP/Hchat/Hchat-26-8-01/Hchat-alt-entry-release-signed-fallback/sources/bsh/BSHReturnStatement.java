package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHReturnStatement extends bsh.SimpleNode implements bsh.ParserConstants {
    private static final long serialVersionUID = 1;
    public int kind;
    public java.lang.String label;

    public BSHReturnStatement(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r2, bsh.Interpreter r3) {
            r1 = this;
            java.lang.String r0 = r1.label
            if (r0 == 0) goto Lc
            bsh.ReturnControl r2 = new bsh.ReturnControl
            int r3 = r1.kind
            r2.<init>(r3, r0, r1)
            return r2
        Lc:
            int r0 = r1.jjtGetNumChildren()
            if (r0 <= 0) goto L1c
            r0 = 0
            bsh.Node r0 = r1.jjtGetChild(r0)
            java.lang.Object r2 = r0.eval(r2, r3)
            goto L1e
        L1c:
            bsh.Primitive r2 = bsh.Primitive.VOID
        L1e:
            bsh.ReturnControl r3 = new bsh.ReturnControl
            int r0 = r1.kind
            r3.<init>(r0, r2, r1)
            return r3
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
            java.lang.String[] r1 = bsh.ParserConstants.tokenImage
            int r2 = r3.kind
            r1 = r1[r2]
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = r3.label
            java.lang.String r2 = ":"
            java.lang.String r0 = eh.a.r(r0, r1, r2)
            return r0
    }
}
