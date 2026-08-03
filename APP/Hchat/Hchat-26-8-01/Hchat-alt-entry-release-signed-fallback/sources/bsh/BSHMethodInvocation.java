package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHMethodInvocation extends bsh.SimpleNode {
    private static final long serialVersionUID = 1;

    public BSHMethodInvocation(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r5, bsh.Interpreter r6) {
            r4 = this;
            bsh.NameSpace r0 = r5.top()
            bsh.BSHAmbiguousName r1 = r4.getNameNode()
            java.lang.String r2 = "fail"
            java.lang.String r3 = r1.text
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L19
            bsh.NameSpace r2 = r6.getNameSpace()
            r2.setNode(r4)
        L19:
            bsh.NameSpace r2 = r0.getParent()
            if (r2 == 0) goto L3e
            bsh.NameSpace r2 = r0.getParent()
            boolean r2 = r2.isClass
            if (r2 == 0) goto L3e
            java.lang.String r2 = r1.text
            java.lang.String r3 = "super"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3b
            java.lang.String r2 = r1.text
            java.lang.String r3 = "this"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L3e
        L3b:
            bsh.Primitive r5 = bsh.Primitive.VOID
            return r5
        L3e:
            bsh.Name r0 = r1.getName(r0)
            bsh.BSHArguments r1 = r4.getArgsNode()
            java.lang.Object[] r1 = r1.getArguments(r5, r6)
            java.lang.Object r5 = r0.invokeMethod(r6, r1, r5, r4)     // Catch: bsh.UtilEvalError -> L4f java.lang.reflect.InvocationTargetException -> L55 bsh.ReflectError -> L5f
            return r5
        L4f:
            r6 = move-exception
            bsh.EvalError r5 = r6.toEvalError(r4, r5)
            throw r5
        L55:
            r6 = move-exception
            java.lang.String r0 = r0.toString()
            bsh.TargetError r5 = bsh.Reflect.targetErrorFromTargetException(r6, r0, r5, r4)
            throw r5
        L5f:
            r6 = move-exception
            bsh.EvalException r0 = new bsh.EvalException
            java.lang.String r1 = r6.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Error in method invocation: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1, r4, r5, r6)
            throw r0
    }

    public bsh.BSHArguments getArgsNode() {
            r1 = this;
            r0 = 1
            bsh.Node r0 = r1.jjtGetChild(r0)
            bsh.BSHArguments r0 = (bsh.BSHArguments) r0
            return r0
    }

    public bsh.BSHAmbiguousName getNameNode() {
            r1 = this;
            r0 = 0
            bsh.Node r0 = r1.jjtGetChild(r0)
            bsh.BSHAmbiguousName r0 = (bsh.BSHAmbiguousName) r0
            return r0
    }
}
