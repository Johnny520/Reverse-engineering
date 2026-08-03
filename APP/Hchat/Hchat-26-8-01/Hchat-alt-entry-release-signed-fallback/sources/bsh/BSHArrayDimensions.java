package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHArrayDimensions extends bsh.SimpleNode {
    private static final long serialVersionUID = 1;
    public java.lang.Class<?> baseType;
    public int[] definedDimensions;
    public int numDefinedDims;
    public int numUndefinedDims;

    public BSHArrayDimensions(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public void addDefinedDimension() {
            r1 = this;
            int r0 = r1.numDefinedDims
            int r0 = r0 + 1
            r1.numDefinedDims = r0
            return
    }

    public void addUndefinedDimension() {
            r1 = this;
            int r0 = r1.numUndefinedDims
            int r0 = r0 + 1
            r1.numUndefinedDims = r0
            return
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r5, bsh.Interpreter r6) {
            r4 = this;
            r0 = 0
            bsh.Node r1 = r4.jjtGetChild(r0)
            boolean r2 = r1 instanceof bsh.BSHArrayInitializer
            if (r2 == 0) goto L52
            bsh.BSHArrayInitializer r1 = (bsh.BSHArrayInitializer) r1
            java.lang.Class<?> r0 = r4.baseType
            int r2 = r4.numUndefinedDims
            java.lang.Object r6 = r1.eval(r0, r2, r5, r6)
            java.lang.Class r0 = r6.getClass()
            boolean r0 = r0.isArray()
            if (r0 != 0) goto L1e
            goto L31
        L1e:
            int[] r0 = bsh.BshArray.dimensions(r6)
            r4.definedDimensions = r0
            r1 = -1
            int r2 = r4.numUndefinedDims
            if (r1 != r2) goto L2c
            int r1 = r0.length
            r4.numUndefinedDims = r1
        L2c:
            int r0 = r0.length
            int r1 = r4.numUndefinedDims
            if (r0 != r1) goto L32
        L31:
            return r6
        L32:
            bsh.EvalException r6 = new bsh.EvalException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Incompatible initializer. Allocation calls for a "
            r0.<init>(r1)
            int r1 = r4.numUndefinedDims
            r0.append(r1)
            java.lang.String r1 = " dimensional array, but initializer is a "
            r0.append(r1)
            int[] r1 = r4.definedDimensions
            int r1 = r1.length
            java.lang.String r2 = " dimensional array"
            java.lang.String r0 = j8.b.j(r0, r1, r2)
            r6.<init>(r0, r4, r5)
            throw r6
        L52:
            int r1 = r4.numDefinedDims
            int[] r1 = new int[r1]
            r4.definedDimensions = r1
        L58:
            int r1 = r4.numDefinedDims
            if (r0 >= r1) goto L86
            bsh.Node r1 = r4.jjtGetChild(r0)     // Catch: java.lang.Exception -> L77
            java.lang.Object r1 = r1.eval(r5, r6)     // Catch: java.lang.Exception -> L77
            int[] r2 = r4.definedDimensions     // Catch: java.lang.Exception -> L77
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L77
            java.lang.Object r1 = bsh.Primitive.castWrapper(r3, r1)     // Catch: java.lang.Exception -> L77
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L77
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L77
            r2[r0] = r1     // Catch: java.lang.Exception -> L77
            int r0 = r0 + 1
            goto L58
        L77:
            r6 = move-exception
            bsh.EvalException r1 = new bsh.EvalException
            java.lang.String r2 = "Array index: "
            java.lang.String r3 = " length does not evaluate to an integer"
            java.lang.String r0 = eh.a.m(r0, r2, r3)
            r1.<init>(r0, r4, r5, r6)
            throw r1
        L86:
            bsh.Primitive r5 = bsh.Primitive.VOID
            return r5
    }

    public java.lang.Object eval(java.lang.Class<?> r2, bsh.CallStack r3, bsh.Interpreter r4) {
            r1 = this;
            java.lang.String r0 = "array base type = "
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            bsh.Interpreter.debug(r0)
            r1.baseType = r2
            java.lang.Object r2 = r1.eval(r3, r4)
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
            int r1 = r2.numDefinedDims
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            int r1 = r2.numUndefinedDims
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
