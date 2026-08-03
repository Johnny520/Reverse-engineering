package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHUnaryExpression extends bsh.SimpleNode implements bsh.ParserConstants {
    private static final long serialVersionUID = 1;
    public int kind;
    public boolean postfix;

    public BSHUnaryExpression(int r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.postfix = r1
            return
    }

    private java.lang.Object lhsUnaryOperation(bsh.LHS r4, boolean r5) {
            r3 = this;
            java.lang.String r0 = "lhsUnaryOperation"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            bsh.Interpreter.debug(r0)
            java.lang.Object r0 = r4.getValue()
            int r1 = r3.kind
            java.lang.Object r1 = r3.unaryOperation(r0, r1)
            boolean r2 = r3.postfix
            if (r2 == 0) goto L18
            goto L19
        L18:
            r0 = r1
        L19:
            r4.assign(r1, r5)
            return r0
    }

    private java.lang.Object unaryOperation(java.lang.Object r3, int r4) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L11
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Lf
            bsh.Primitive r3 = bsh.Primitive.TRUE
            goto L11
        Lf:
            bsh.Primitive r3 = bsh.Primitive.FALSE
        L11:
            boolean r0 = r3 instanceof bsh.Primitive
            if (r0 == 0) goto L1c
            bsh.Primitive r3 = (bsh.Primitive) r3
            bsh.Primitive r3 = bsh.Operators.unaryOperation(r3, r4)
            return r3
        L1c:
            bsh.UtilEvalError r3 = new bsh.UtilEvalError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unary operation "
            r0.<init>(r1)
            java.lang.String[] r1 = bsh.ParserConstants.tokenImage
            r4 = r1[r4]
            java.lang.String r1 = " inappropriate for object"
            java.lang.String r4 = eh.a.r(r0, r4, r1)
            r3.<init>(r4)
            throw r3
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r4, bsh.Interpreter r5) {
            r3 = this;
            r0 = 0
            bsh.Node r0 = r3.jjtGetChild(r0)
            int r1 = r3.kind     // Catch: bsh.UtilEvalError -> L1b
            r2 = 102(0x66, float:1.43E-43)
            if (r1 == r2) goto L1d
            r2 = 103(0x67, float:1.44E-43)
            if (r1 != r2) goto L10
            goto L1d
        L10:
            java.lang.Object r5 = r0.eval(r4, r5)     // Catch: bsh.UtilEvalError -> L1b
            int r0 = r3.kind     // Catch: bsh.UtilEvalError -> L1b
            java.lang.Object r4 = r3.unaryOperation(r5, r0)     // Catch: bsh.UtilEvalError -> L1b
            return r4
        L1b:
            r5 = move-exception
            goto L2c
        L1d:
            bsh.BSHPrimaryExpression r0 = (bsh.BSHPrimaryExpression) r0     // Catch: bsh.UtilEvalError -> L1b
            bsh.LHS r0 = r0.toLHS(r4, r5)     // Catch: bsh.UtilEvalError -> L1b
            boolean r5 = r5.getStrictJava()     // Catch: bsh.UtilEvalError -> L1b
            java.lang.Object r4 = r3.lhsUnaryOperation(r0, r5)     // Catch: bsh.UtilEvalError -> L1b
            return r4
        L2c:
            bsh.EvalError r4 = r5.toEvalError(r3, r4)
            throw r4
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
            java.lang.String r0 = r0.toString()
            return r0
    }
}
