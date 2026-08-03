package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHReturnType extends bsh.SimpleNode {
    private static final long serialVersionUID = 1;
    public boolean isVoid;

    public BSHReturnType(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public java.lang.Class<?> evalReturnType(bsh.CallStack r2, bsh.Interpreter r3) {
            r1 = this;
            boolean r0 = r1.isVoid
            if (r0 == 0) goto L7
            java.lang.Class r2 = java.lang.Void.TYPE
            return r2
        L7:
            bsh.BSHType r0 = r1.getTypeNode()
            java.lang.Class r2 = r0.getType(r2, r3)
            return r2
    }

    public java.lang.String getTypeDescriptor(bsh.CallStack r2, bsh.Interpreter r3, java.lang.String r4) {
            r1 = this;
            boolean r0 = r1.isVoid
            if (r0 == 0) goto L7
            java.lang.String r2 = "V"
            return r2
        L7:
            bsh.BSHType r0 = r1.getTypeNode()
            java.lang.String r2 = r0.getTypeDescriptor(r2, r3, r4)
            return r2
    }

    public bsh.BSHType getTypeNode() {
            r1 = this;
            r0 = 0
            bsh.Node r0 = r1.jjtGetChild(r0)
            bsh.BSHType r0 = (bsh.BSHType) r0
            return r0
    }

    @Override // bsh.SimpleNode
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ": void="
            r0.append(r1)
            boolean r1 = r2.isVoid
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
