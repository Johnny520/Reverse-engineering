package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHWhenExpression extends bsh.SimpleNode implements bsh.ParserConstants {
    private static final long serialVersionUID = 1;

    public BSHWhenExpression(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private boolean primitiveEquals(java.lang.Object r4, java.lang.Object r5, bsh.CallStack r6, bsh.Node r7) {
            r3 = this;
            bsh.Primitive r0 = bsh.Primitive.VOID
            r1 = 0
            if (r4 == r0) goto L56
            if (r5 != r0) goto L8
            goto L56
        L8:
            bsh.Primitive r0 = bsh.Primitive.NULL
            r2 = 0
            if (r4 != r0) goto Le
            r4 = r2
        Le:
            if (r5 != r0) goto L11
            r5 = r2
        L11:
            if (r4 == 0) goto L52
            if (r5 != 0) goto L16
            goto L52
        L16:
            boolean r0 = r4 instanceof bsh.Primitive
            if (r0 != 0) goto L24
            boolean r0 = r5 instanceof bsh.Primitive
            if (r0 == 0) goto L1f
            goto L24
        L1f:
            boolean r4 = r4.equals(r5)
            return r4
        L24:
            r0 = 92
            java.lang.Object r4 = bsh.Operators.binaryOperation(r4, r5, r0)     // Catch: bsh.UtilEvalError -> L35
            java.lang.Object r4 = bsh.Primitive.unwrap(r4)     // Catch: bsh.UtilEvalError -> L35
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: bsh.UtilEvalError -> L35
            boolean r4 = r4.equals(r5)     // Catch: bsh.UtilEvalError -> L35
            return r4
        L35:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "When value: "
            r5.<init>(r0)
            java.lang.String r7 = r7.getText()
            r5.append(r7)
            java.lang.String r7 = ": "
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            bsh.EvalError r4 = r4.toEvalError(r5, r3, r6)
            throw r4
        L52:
            if (r4 != r5) goto L56
            r4 = 1
            return r4
        L56:
            return r1
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r9, bsh.Interpreter r10) {
            r8 = this;
            int r0 = r8.jjtGetNumChildren()
            r1 = 2
            if (r0 < r1) goto L65
            r1 = 1
            r2 = r1
        L9:
            if (r2 >= r0) goto L25
            bsh.Node r3 = r8.jjtGetChild(r2)
            bsh.BSHWhenEntry r3 = (bsh.BSHWhenEntry) r3
            boolean r3 = r3.isElse
            if (r3 != 0) goto L16
            goto L1a
        L16:
            int r3 = r0 + (-1)
            if (r2 != r3) goto L1d
        L1a:
            int r2 = r2 + 1
            goto L9
        L1d:
            bsh.EvalException r10 = new bsh.EvalException
            java.lang.String r0 = "Else branch must be the last one in when expression."
            r10.<init>(r0, r8, r9)
            throw r10
        L25:
            r2 = 0
            bsh.Node r3 = r8.jjtGetChild(r2)
            java.lang.Object r4 = r3.eval(r9, r10)
        L2e:
            if (r1 >= r0) goto L5d
            bsh.Node r5 = r8.jjtGetChild(r1)
            bsh.BSHWhenEntry r5 = (bsh.BSHWhenEntry) r5
            boolean r6 = r5.isElse
            if (r6 == 0) goto L3f
            java.lang.Object r9 = r5.evalResult(r9, r10)
            return r9
        L3f:
            r6 = r2
        L40:
            int r7 = r5.numConditions
            if (r6 >= r7) goto L5a
            bsh.Node r7 = r5.jjtGetChild(r6)
            java.lang.Object r7 = r7.eval(r9, r10)
            boolean r7 = r8.primitiveEquals(r4, r7, r9, r3)
            if (r7 == 0) goto L57
            java.lang.Object r9 = r5.evalResult(r9, r10)
            return r9
        L57:
            int r6 = r6 + 1
            goto L40
        L5a:
            int r1 = r1 + 1
            goto L2e
        L5d:
            bsh.EvalException r10 = new bsh.EvalException
            java.lang.String r0 = "No matching when branch."
            r10.<init>(r0, r8, r9)
            throw r10
        L65:
            bsh.EvalException r10 = new bsh.EvalException
            java.lang.String r0 = "Empty when expression."
            r10.<init>(r0, r8, r9)
            throw r10
    }

    @Override // bsh.SimpleNode
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            java.lang.String r2 = ": when"
            java.lang.String r0 = eh.a.r(r0, r1, r2)
            return r0
    }
}
