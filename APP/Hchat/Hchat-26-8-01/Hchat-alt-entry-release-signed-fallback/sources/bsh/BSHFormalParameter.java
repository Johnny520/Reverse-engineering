package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHFormalParameter extends bsh.SimpleNode {
    public static final java.lang.Class UNTYPED = null;
    private static final long serialVersionUID = 1;
    int dimensions;
    boolean isFinal;
    boolean isVarArgs;
    public java.lang.String name;
    public java.lang.Class type;

    public BSHFormalParameter(int r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.isFinal = r1
            r0.isVarArgs = r1
            r0.dimensions = r1
            return
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r3, bsh.Interpreter r4) {
            r2 = this;
            int r0 = r2.jjtGetNumChildren()
            r1 = 0
            if (r0 <= 0) goto L45
            bsh.Node r0 = r2.jjtGetChild(r1)
            bsh.BSHType r0 = (bsh.BSHType) r0
            java.lang.Class r3 = r0.getType(r3, r4)
            r2.type = r3
            int r4 = r2.dimensions
            if (r4 <= 0) goto L49
            boolean r3 = r3.isArray()
            if (r3 != 0) goto L2e
            java.lang.Class r3 = r2.type
            int r4 = r2.dimensions
            int[] r4 = new int[r4]
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r4)
            java.lang.Class r3 = r3.getClass()
            r2.type = r3
            goto L49
        L2e:
            bsh.EvalError r3 = new bsh.EvalError
            java.lang.String r4 = r2.name
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Array dimensions not allowed on both type and name: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r0 = 0
            r3.<init>(r4, r2, r0)
            throw r3
        L45:
            java.lang.Class r3 = bsh.BSHFormalParameter.UNTYPED
            r2.type = r3
        L49:
            boolean r3 = r2.isVarArgs
            if (r3 == 0) goto L59
            java.lang.Class r3 = r2.type
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r1)
            java.lang.Class r3 = r3.getClass()
            r2.type = r3
        L59:
            java.lang.Class r3 = r2.type
            return r3
    }

    public java.lang.String getTypeDescriptor(bsh.CallStack r5, bsh.Interpreter r6, java.lang.String r7) {
            r4 = this;
            int r0 = r4.jjtGetNumChildren()
            boolean r1 = r4.isVarArgs
            java.lang.String r2 = ""
            java.lang.String r3 = "["
            if (r0 <= 0) goto L2a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r1 == 0) goto L14
            r2 = r3
        L14:
            r0.append(r2)
            r1 = 0
            bsh.Node r1 = r4.jjtGetChild(r1)
            bsh.BSHType r1 = (bsh.BSHType) r1
            java.lang.String r5 = r1.getTypeDescriptor(r5, r6, r7)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
        L2a:
            if (r1 == 0) goto L2d
            r2 = r3
        L2d:
            java.lang.String r5 = "Ljava/lang/Object;"
            java.lang.String r5 = r2.concat(r5)
            return r5
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
            java.lang.String r1 = ", final="
            r0.append(r1)
            boolean r1 = r2.isFinal
            r0.append(r1)
            java.lang.String r1 = ", varargs="
            r0.append(r1)
            boolean r1 = r2.isVarArgs
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
