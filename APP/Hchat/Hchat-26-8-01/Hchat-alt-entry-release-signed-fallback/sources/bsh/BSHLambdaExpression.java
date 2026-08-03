package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHLambdaExpression extends bsh.SimpleNode {
    private static final long serialVersionUID = 1;
    private bsh.Node body;
    private boolean initializedValues;
    private bsh.Modifiers[] paramsModifiers;
    private java.lang.String[] paramsNames;
    private java.lang.Class<?>[] paramsTypes;
    java.lang.String singleParamName;

    public BSHLambdaExpression(int r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.initializedValues = r1
            return
    }

    private void initValues(bsh.CallStack r5, bsh.Interpreter r6) {
            r4 = this;
            boolean r0 = r4.initializedValues
            if (r0 == 0) goto L5
            return
        L5:
            int r0 = r4.jjtGetNumChildren()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L2d
            bsh.Node r0 = r4.jjtGetChild(r3)
            bsh.BSHFormalParameters r0 = (bsh.BSHFormalParameters) r0
            java.lang.Class[] r5 = r0.eval(r5, r6)
            r4.paramsTypes = r5
            bsh.Modifiers[] r5 = r0.getParamModifiers()
            r4.paramsModifiers = r5
            java.lang.String[] r5 = r0.getParamNames()
            r4.paramsNames = r5
            bsh.Node r5 = r4.jjtGetChild(r2)
            r4.body = r5
            goto L48
        L2d:
            r5 = 0
            java.lang.Class[] r6 = new java.lang.Class[]{r5}
            r4.paramsTypes = r6
            bsh.Modifiers[] r5 = new bsh.Modifiers[]{r5}
            r4.paramsModifiers = r5
            java.lang.String r5 = r4.singleParamName
            java.lang.String[] r5 = new java.lang.String[]{r5}
            r4.paramsNames = r5
            bsh.Node r5 = r4.jjtGetChild(r3)
            r4.body = r5
        L48:
            r4.initializedValues = r2
            return
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r7, bsh.Interpreter r8) {
            r6 = this;
            r6.initValues(r7, r8)
            bsh.NameSpace r1 = r7.top()
            bsh.Modifiers[] r2 = r6.paramsModifiers
            java.lang.Class<?>[] r3 = r6.paramsTypes
            java.lang.String[] r4 = r6.paramsNames
            bsh.Node r5 = r6.body
            r0 = r6
            bsh.BshLambda r7 = bsh.BshLambda.fromLambdaExpression(r0, r1, r2, r3, r4, r5)
            return r7
    }
}
