package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHPrimaryExpression extends bsh.SimpleNode {
    private static final long serialVersionUID = 1;
    private java.lang.Object cached;
    boolean isArrayExpression;
    boolean isMapExpression;

    public BSHPrimaryExpression(int r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.cached = r1
            r1 = 0
            r0.isArrayExpression = r1
            r0.isMapExpression = r1
            return
    }

    private java.lang.Object eval(boolean r8, bsh.CallStack r9, bsh.Interpreter r10) {
            r7 = this;
            boolean r0 = r7.isArrayExpression
            if (r0 == 0) goto L9
            java.lang.Object r0 = r7.cached
            if (r0 == 0) goto L9
            return r0
        L9:
            bsh.Node[] r0 = r7.jjtGetChildren()
            r1 = 0
            r1 = r0[r1]
            r2 = 1
            r3 = r2
        L12:
            int r4 = r0.length
            if (r3 >= r4) goto L34
            bsh.Node r4 = r7.jjtGetChild(r3)
            bsh.BSHPrimarySuffix r4 = (bsh.BSHPrimarySuffix) r4
            int r5 = r4.operation
            r6 = 5
            if (r5 != r6) goto L2d
            int r5 = r0.length
            int r5 = r5 - r2
            if (r3 != r5) goto L25
            goto L2d
        L25:
            bsh.EvalError r8 = new bsh.EvalError
            java.lang.String r10 = "Method Reference must be the last suffix!"
            r8.<init>(r10, r4, r9)
            throw r8
        L2d:
            java.lang.Object r1 = r4.doSuffix(r1, r8, r9, r10)
            int r3 = r3 + 1
            goto L12
        L34:
            boolean r0 = r1 instanceof bsh.Node
            if (r0 == 0) goto L5d
            boolean r0 = r1 instanceof bsh.BSHAmbiguousName
            if (r0 == 0) goto L4c
            if (r8 == 0) goto L45
            bsh.BSHAmbiguousName r1 = (bsh.BSHAmbiguousName) r1
            bsh.LHS r1 = r1.toLHS(r9, r10)
            goto L5d
        L45:
            bsh.BSHAmbiguousName r1 = (bsh.BSHAmbiguousName) r1
            java.lang.Object r1 = r1.toObject(r9, r10)
            goto L5d
        L4c:
            if (r8 != 0) goto L55
            bsh.Node r1 = (bsh.Node) r1
            java.lang.Object r1 = r1.eval(r9, r10)
            goto L5d
        L55:
            bsh.EvalException r8 = new bsh.EvalException
            java.lang.String r10 = "Can't assign to prefix."
            r8.<init>(r10, r7, r9)
            throw r8
        L5d:
            boolean r8 = r7.isMapExpression
            if (r8 == 0) goto L74
            bsh.Primitive r8 = bsh.Primitive.VOID
            if (r1 == r8) goto L6c
            bsh.LHS r8 = new bsh.LHS
            r8.<init>(r1)
            r1 = r8
            goto L74
        L6c:
            bsh.EvalException r8 = new bsh.EvalException
            java.lang.String r10 = "illegal use of undefined variable or 'void' literal"
            r8.<init>(r10, r7, r9)
            throw r8
        L74:
            boolean r8 = r7.isArrayExpression
            if (r8 == 0) goto L7a
            r7.cached = r1
        L7a:
            return r1
    }

    public void clearCache() {
            r1 = this;
            r0 = 0
            r1.cached = r0
            return
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r2, bsh.Interpreter r3) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.eval(r0, r2, r3)
            return r2
    }

    public void setArrayExpression(bsh.BSHArrayInitializer r4) {
            r3 = this;
            r0 = 1
            r3.isArrayExpression = r0
            bsh.Node r1 = r3.parent
            boolean r2 = r1 instanceof bsh.BSHAssignment
            if (r2 == 0) goto L2e
            r2 = r1
            bsh.BSHAssignment r2 = (bsh.BSHAssignment) r2
            java.lang.Integer r2 = r2.operator
            if (r2 == 0) goto L2e
            bsh.BSHAssignment r1 = (bsh.BSHAssignment) r1
            java.lang.Integer r1 = r1.operator
            int r1 = r1.intValue()
            r2 = 85
            if (r1 != r2) goto L1e
            r1 = r0
            goto L1f
        L1e:
            r1 = 0
        L1f:
            r3.isMapExpression = r1
            if (r1 == 0) goto L2e
            bsh.Node r1 = r4.jjtGetParent()
            boolean r1 = r1 instanceof bsh.BSHArrayInitializer
            if (r1 == 0) goto L2e
            r4.setMapInArray(r0)
        L2e:
            return
    }

    public bsh.LHS toLHS(bsh.CallStack r2, bsh.Interpreter r3) {
            r1 = this;
            boolean r0 = r3.getStrictJava()
            if (r0 != 0) goto Ld
            boolean r0 = r1.isMapExpression
            if (r0 != 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            java.lang.Object r2 = r1.eval(r0, r2, r3)
            bsh.LHS r2 = (bsh.LHS) r2
            return r2
    }
}
