package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHFormalParameters extends bsh.SimpleNode implements bsh.BshClassManager.Listener {
    private static final long serialVersionUID = 1;
    boolean isVarArgs;
    private boolean listener;
    int numArgs;
    private bsh.Modifiers[] paramModifiers;
    private java.lang.String[] paramNames;
    java.lang.Class<?>[] paramTypes;
    java.lang.String[] typeDescriptors;

    public BSHFormalParameters(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // bsh.BshClassManager.Listener
    public void classLoaderChanged() {
            r1 = this;
            r0 = 0
            r1.paramTypes = r0
            return
    }

    @Override // bsh.SimpleNode, bsh.Node
    public /* bridge */ /* synthetic */ java.lang.Object eval(bsh.CallStack r1, bsh.Interpreter r2) {
            r0 = this;
            java.lang.Class[] r1 = r0.eval(r1, r2)
            return r1
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Class<?>[] eval(bsh.CallStack r4, bsh.Interpreter r5) {
            r3 = this;
            java.lang.Class<?>[] r0 = r3.paramTypes
            if (r0 == 0) goto L5
            return r0
        L5:
            r3.insureParsed()
            int r0 = r3.numArgs
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
        Ld:
            int r2 = r3.numArgs
            if (r1 >= r2) goto L22
            bsh.Node r2 = r3.jjtGetChild(r1)
            bsh.BSHFormalParameter r2 = (bsh.BSHFormalParameter) r2
            java.lang.Object r2 = r2.eval(r4, r5)
            java.lang.Class r2 = (java.lang.Class) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto Ld
        L22:
            r3.paramTypes = r0
            return r0
    }

    public bsh.Modifiers[] getParamModifiers() {
            r1 = this;
            r1.insureParsed()
            bsh.Modifiers[] r0 = r1.paramModifiers
            return r0
    }

    public java.lang.String[] getParamNames() {
            r1 = this;
            r1.insureParsed()
            java.lang.String[] r0 = r1.paramNames
            return r0
    }

    public java.lang.String[] getTypeDescriptors(bsh.CallStack r4, bsh.Interpreter r5, java.lang.String r6) {
            r3 = this;
            java.lang.String[] r0 = r3.typeDescriptors
            if (r0 == 0) goto L5
            return r0
        L5:
            r3.insureParsed()
            int r0 = r3.numArgs
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
        Ld:
            int r2 = r3.numArgs
            if (r1 >= r2) goto L20
            bsh.Node r2 = r3.jjtGetChild(r1)
            bsh.BSHFormalParameter r2 = (bsh.BSHFormalParameter) r2
            java.lang.String r2 = r2.getTypeDescriptor(r4, r5, r6)
            r0[r1] = r2
            int r1 = r1 + 1
            goto Ld
        L20:
            r3.typeDescriptors = r0
            return r0
    }

    public void insureParsed() {
            r6 = this;
            java.lang.String[] r0 = r6.paramNames
            if (r0 == 0) goto L5
            return
        L5:
            int r0 = r6.jjtGetNumChildren()
            r6.numArgs = r0
            java.lang.String[] r1 = new java.lang.String[r0]
            bsh.Modifiers[] r0 = new bsh.Modifiers[r0]
            r2 = 0
        L10:
            int r3 = r6.numArgs
            if (r2 >= r3) goto L36
            bsh.Node r3 = r6.jjtGetChild(r2)
            bsh.BSHFormalParameter r3 = (bsh.BSHFormalParameter) r3
            boolean r4 = r3.isVarArgs
            r6.isVarArgs = r4
            java.lang.String r4 = r3.name
            r1[r2] = r4
            bsh.Modifiers r4 = new bsh.Modifiers
            r5 = 4
            r4.<init>(r5)
            r0[r2] = r4
            boolean r3 = r3.isFinal
            if (r3 == 0) goto L33
            java.lang.String r3 = "final"
            r4.addModifier(r3)
        L33:
            int r2 = r2 + 1
            goto L10
        L36:
            r6.paramNames = r1
            r6.paramModifiers = r0
            return
    }

    public boolean isListener() {
            r1 = this;
            boolean r0 = r1.listener
            return r0
    }

    public void setListener(boolean r1) {
            r0 = this;
            r0.listener = r1
            return
    }
}
