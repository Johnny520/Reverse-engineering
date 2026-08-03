package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHVariableDeclarator extends bsh.SimpleNode {
    private static final long serialVersionUID = 1;
    public int dimensions;
    public java.lang.String name;

    public BSHVariableDeclarator(int r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.dimensions = r1
            return
    }

    private int getArrayDims(bsh.BSHType r2) {
            r1 = this;
            int r0 = r1.dimensions
            if (r0 <= 0) goto L5
            return r0
        L5:
            int r0 = r2.getArrayDims()
            if (r0 <= 0) goto L10
            int r2 = r2.getArrayDims()
            return r2
        L10:
            r2 = -1
            return r2
    }

    public java.lang.Object eval(bsh.BSHType r2, bsh.Modifiers r3, bsh.CallStack r4, bsh.Interpreter r5) {
            r1 = this;
            java.lang.String r0 = "final"
            boolean r3 = r3.hasModifier(r0)
            r0 = 0
            if (r3 == 0) goto La
            goto L1d
        La:
            java.lang.Class r3 = r2.getBaseType()
            boolean r3 = bsh.Primitive.isWrapperType(r3)
            if (r3 == 0) goto L15
            goto L1d
        L15:
            java.lang.Class r3 = r2.getBaseType()
            bsh.Primitive r0 = bsh.Primitive.getDefaultValue(r3)
        L1d:
            int r3 = r1.jjtGetNumChildren()
            if (r3 <= 0) goto L3f
            r3 = 0
            bsh.Node r3 = r1.jjtGetChild(r3)
            boolean r0 = r3 instanceof bsh.BSHArrayInitializer
            if (r0 == 0) goto L3b
            bsh.BSHArrayInitializer r3 = (bsh.BSHArrayInitializer) r3
            java.lang.Class r0 = r2.getBaseType()
            int r2 = r1.getArrayDims(r2)
            java.lang.Object r0 = r3.eval(r0, r2, r4, r5)
            goto L3f
        L3b:
            java.lang.Object r0 = r3.eval(r4, r5)
        L3f:
            bsh.Primitive r2 = bsh.Primitive.VOID
            if (r0 == r2) goto L44
            return r0
        L44:
            bsh.EvalException r2 = new bsh.EvalException
            java.lang.String r3 = "Void initializer."
            r2.<init>(r3, r1, r4)
            throw r2
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
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
