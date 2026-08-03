package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHSwitchLabel extends bsh.SimpleNode {
    private static final long serialVersionUID = 1;
    boolean isDefault;

    public BSHSwitchLabel(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r2, bsh.Interpreter r3) {
            r1 = this;
            r0 = 0
            bsh.Node r0 = r1.jjtGetChild(r0)
            java.lang.Object r2 = r0.eval(r2, r3)
            return r2
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
            boolean r1 = r2.isDefault
            if (r1 == 0) goto L18
            java.lang.String r1 = "default"
            goto L1a
        L18:
            java.lang.String r1 = "case"
        L1a:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
