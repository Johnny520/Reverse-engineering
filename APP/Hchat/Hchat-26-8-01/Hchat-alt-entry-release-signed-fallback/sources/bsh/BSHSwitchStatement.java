package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHSwitchStatement extends bsh.SimpleNode implements bsh.ParserConstants {
    private static final long serialVersionUID = 1;

    public BSHSwitchStatement(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private boolean primitiveEquals(java.lang.Object r2, java.lang.Object r3, bsh.CallStack r4, bsh.Node r5) {
            r1 = this;
            bsh.Primitive r0 = bsh.Primitive.VOID
            if (r3 != r0) goto L6
            r2 = 0
            return r2
        L6:
            boolean r0 = r2 instanceof bsh.Primitive
            if (r0 != 0) goto L14
            boolean r0 = r3 instanceof bsh.Primitive
            if (r0 == 0) goto Lf
            goto L14
        Lf:
            boolean r2 = r2.equals(r3)
            return r2
        L14:
            r0 = 92
            java.lang.Object r2 = bsh.Operators.binaryOperation(r2, r3, r0)     // Catch: bsh.UtilEvalError -> L25
            java.lang.Object r2 = bsh.Primitive.unwrap(r2)     // Catch: bsh.UtilEvalError -> L25
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: bsh.UtilEvalError -> L25
            boolean r2 = r2.equals(r3)     // Catch: bsh.UtilEvalError -> L25
            return r2
        L25:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Switch value: "
            r3.<init>(r0)
            java.lang.String r5 = r5.getText()
            r3.append(r5)
            java.lang.String r5 = ": "
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            bsh.EvalError r2 = r2.toEvalError(r3, r1, r4)
            throw r2
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r9, bsh.Interpreter r10) {
            r8 = this;
            int r0 = r8.jjtGetNumChildren()
            r1 = 0
            bsh.Node r1 = r8.jjtGetChild(r1)
            java.lang.Object r2 = r1.eval(r9, r10)
            java.lang.Object r3 = bsh.Primitive.unwrap(r2)
            if (r3 == 0) goto L28
            java.lang.Class r3 = r2.getClass()
            boolean r3 = r3.isEnum()
            if (r3 == 0) goto L28
            bsh.NameSpace r3 = r9.top()
            java.lang.Class r4 = r2.getClass()
            r3.importStatic(r4)
        L28:
            r3 = 1
            if (r3 >= r0) goto L80
            bsh.Node r3 = r8.jjtGetChild(r3)
            bsh.BSHSwitchLabel r3 = (bsh.BSHSwitchLabel) r3
            r4 = 0
            r5 = 2
        L33:
            if (r5 >= r0) goto L74
            if (r4 != 0) goto L74
            boolean r6 = r3.isDefault
            if (r6 != 0) goto L59
            java.lang.Object r6 = r3.eval(r9, r10)
            boolean r6 = r8.primitiveEquals(r2, r6, r9, r1)
            if (r6 == 0) goto L46
            goto L59
        L46:
            if (r5 >= r0) goto L33
            int r6 = r5 + 1
            bsh.Node r5 = r8.jjtGetChild(r5)
            boolean r7 = r5 instanceof bsh.BSHSwitchLabel
            if (r7 == 0) goto L57
            r3 = r5
            bsh.BSHSwitchLabel r3 = (bsh.BSHSwitchLabel) r3
        L55:
            r5 = r6
            goto L33
        L57:
            r5 = r6
            goto L46
        L59:
            if (r5 >= r0) goto L33
            int r6 = r5 + 1
            bsh.Node r5 = r8.jjtGetChild(r5)
            boolean r7 = r5 instanceof bsh.BSHSwitchLabel
            if (r7 == 0) goto L66
            goto L72
        L66:
            java.lang.Object r5 = r5.eval(r9, r10)
            boolean r7 = r5 instanceof bsh.ReturnControl
            if (r7 == 0) goto L72
            r4 = r5
            bsh.ReturnControl r4 = (bsh.ReturnControl) r4
            goto L55
        L72:
            r5 = r6
            goto L59
        L74:
            if (r4 == 0) goto L7d
            int r9 = r4.kind
            r10 = 47
            if (r9 != r10) goto L7d
            return r4
        L7d:
            bsh.Primitive r9 = bsh.Primitive.VOID
            return r9
        L80:
            bsh.EvalException r10 = new bsh.EvalException
            java.lang.String r0 = "Empty switch statement."
            r10.<init>(r0, r8, r9)
            throw r10
    }

    @Override // bsh.SimpleNode
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            java.lang.String r2 = ": switch"
            java.lang.String r0 = eh.a.r(r0, r1, r2)
            return r0
    }
}
