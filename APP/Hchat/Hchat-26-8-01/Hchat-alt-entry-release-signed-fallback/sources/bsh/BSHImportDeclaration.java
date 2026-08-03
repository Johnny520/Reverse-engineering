package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHImportDeclaration extends bsh.SimpleNode {
    private static final long serialVersionUID = 1;
    public boolean importPackage;
    public boolean staticImport;
    public boolean superImport;

    public BSHImportDeclaration(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r6, bsh.Interpreter r7) {
            r5 = this;
            bsh.NameSpace r0 = r6.top()
            boolean r1 = r5.superImport
            if (r1 == 0) goto L13
            r0.doSuperImport()     // Catch: bsh.UtilEvalError -> Ld
            goto L9b
        Ld:
            r7 = move-exception
            bsh.EvalError r6 = r7.toEvalError(r5, r6)
            throw r6
        L13:
            r1 = 0
            bsh.Node r1 = r5.jjtGetChild(r1)
            bsh.BSHAmbiguousName r1 = (bsh.BSHAmbiguousName) r1
            boolean r2 = r5.staticImport
            if (r2 == 0) goto L8e
            boolean r2 = r5.importPackage
            if (r2 == 0) goto L2b
            java.lang.Class r6 = r1.toClass(r6, r7)
            r0.importStatic(r6)
            goto L9b
        L2b:
            java.lang.String r2 = r1.text
            r3 = 1
            java.lang.String r2 = bsh.Name.suffix(r2, r3)
            r3 = 0
            java.lang.String r4 = r1.text     // Catch: java.lang.Exception -> L42
            java.lang.String r4 = bsh.Name.prefix(r4)     // Catch: java.lang.Exception -> L42
            java.lang.Class r4 = r0.getClass(r4)     // Catch: java.lang.Exception -> L42
            bsh.BshMethod r3 = bsh.Reflect.staticMethodImport(r4, r2)     // Catch: java.lang.Exception -> L43
            goto L43
        L42:
            r4 = r3
        L43:
            if (r4 == 0) goto L4b
            if (r3 != 0) goto L4b
            bsh.LHS r3 = bsh.Reflect.getLHSStaticField(r4, r2)     // Catch: java.lang.Exception -> L4b
        L4b:
            if (r3 != 0) goto L51
            java.lang.Object r3 = r1.toObject(r6, r7)     // Catch: java.lang.Exception -> L51
        L51:
            boolean r2 = r3 instanceof bsh.BshMethod
            if (r2 == 0) goto L5d
            bsh.BshMethod r3 = (bsh.BshMethod) r3
            r0.setMethod(r3)
            bsh.Primitive r6 = bsh.Primitive.VOID
            return r6
        L5d:
            boolean r2 = r3 instanceof bsh.LHS
            if (r2 != 0) goto L65
            bsh.LHS r3 = r1.toLHS(r6, r7)
        L65:
            boolean r7 = r3 instanceof bsh.LHS
            if (r7 == 0) goto L7b
            bsh.LHS r3 = (bsh.LHS) r3
            boolean r7 = r3.isStatic()
            if (r7 == 0) goto L7b
            bsh.Variable r6 = r3.getVariable()
            r0.setVariableImpl(r6)
            bsh.Primitive r6 = bsh.Primitive.VOID
            return r6
        L7b:
            bsh.EvalException r7 = new bsh.EvalException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.text
            java.lang.String r2 = " is not a static member of a class"
            java.lang.String r0 = eh.a.r(r0, r1, r2)
            r7.<init>(r0, r5, r6)
            throw r7
        L8e:
            java.lang.String r6 = r1.text
            boolean r7 = r5.importPackage
            if (r7 == 0) goto L98
            r0.importPackage(r6)
            goto L9b
        L98:
            r0.importClass(r6)
        L9b:
            bsh.Primitive r6 = bsh.Primitive.VOID
            return r6
    }

    @Override // bsh.SimpleNode
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ": static="
            r0.append(r1)
            boolean r1 = r2.staticImport
            r0.append(r1)
            java.lang.String r1 = ", *="
            r0.append(r1)
            boolean r1 = r2.importPackage
            r0.append(r1)
            java.lang.String r1 = ", super import="
            r0.append(r1)
            boolean r1 = r2.superImport
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
