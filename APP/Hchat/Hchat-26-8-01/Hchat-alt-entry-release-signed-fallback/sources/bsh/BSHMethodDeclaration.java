package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHMethodDeclaration extends bsh.SimpleNode {
    private static final long serialVersionUID = 1;
    bsh.BSHBlock blockNode;
    int firstThrowsClause;
    boolean isExtension;
    private boolean isScriptedObject;
    boolean isVarArgs;
    public bsh.Modifiers modifiers;
    public java.lang.String name;
    int numThrows;
    bsh.BSHFormalParameters paramsNode;
    java.lang.String receiverText;
    java.lang.Class<?> receiverType;
    java.lang.Class<?> returnType;
    bsh.BSHReturnType returnTypeNode;

    public BSHMethodDeclaration(int r2) {
            r1 = this;
            r1.<init>(r2)
            bsh.Modifiers r2 = new bsh.Modifiers
            r0 = 2
            r2.<init>(r0)
            r1.modifiers = r2
            r2 = 0
            r1.numThrows = r2
            return
    }

    private void evalNodes(bsh.CallStack r5, bsh.Interpreter r6) {
            r4 = this;
            r4.insureNodesParsed()
            int r0 = r4.firstThrowsClause
        L5:
            int r1 = r4.numThrows
            int r2 = r4.firstThrowsClause
            int r1 = r1 + r2
            if (r0 >= r1) goto L18
            bsh.Node r1 = r4.jjtGetChild(r0)
            bsh.BSHAmbiguousName r1 = (bsh.BSHAmbiguousName) r1
            r1.toClass(r5, r6)
            int r0 = r0 + 1
            goto L5
        L18:
            bsh.BSHFormalParameters r0 = r4.paramsNode
            r0.eval(r5, r6)
            boolean r5 = r6.getStrictJava()
            if (r5 == 0) goto L74
            r5 = 0
        L24:
            bsh.BSHFormalParameters r6 = r4.paramsNode
            java.lang.Class<?>[] r6 = r6.paramTypes
            int r0 = r6.length
            r1 = 0
            if (r5 >= r0) goto L59
            r6 = r6[r5]
            if (r6 == 0) goto L33
            int r5 = r5 + 1
            goto L24
        L33:
            bsh.EvalException r6 = new bsh.EvalException
            bsh.BSHFormalParameters r0 = r4.paramsNode
            java.lang.String[] r0 = r0.getParamNames()
            r5 = r0[r5]
            java.lang.String r0 = r4.name
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "(Strict Java Mode) Undeclared argument type, parameter: "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = " in method: "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = r2.toString()
            r6.<init>(r5, r4, r1)
            throw r6
        L59:
            java.lang.Class<?> r5 = r4.returnType
            if (r5 == 0) goto L5e
            goto L74
        L5e:
            bsh.EvalException r5 = new bsh.EvalException
            java.lang.String r6 = r4.name
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "(Strict Java Mode) Undeclared return type for method: "
            r0.<init>(r2)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6, r4, r1)
            throw r5
        L74:
            return
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r4, bsh.Interpreter r5) {
            r3 = this;
            java.lang.Class r0 = r3.evalReturnType(r4, r5)
            r3.returnType = r0
            java.lang.Class r0 = r3.evalReceiverType(r4, r5)
            r3.receiverType = r0
            r3.evalNodes(r4, r5)
            bsh.NameSpace r4 = r4.top()
            bsh.BshMethod r0 = new bsh.BshMethod
            bsh.Modifiers r1 = r3.modifiers
            boolean r2 = r3.isScriptedObject
            r0.<init>(r3, r4, r1, r2)
            boolean r1 = r4.isMethod
            if (r1 != 0) goto L2c
            boolean r2 = r4.isClass
            if (r2 != 0) goto L2c
            bsh.BshClassManager r5 = r5.getClassManager()
            r5.addListener(r0)
            goto L45
        L2c:
            if (r1 == 0) goto L45
            bsh.BSHFormalParameters r1 = r3.paramsNode
            boolean r1 = r1.isListener()
            if (r1 != 0) goto L45
            bsh.BshClassManager r5 = r5.getClassManager()
            bsh.BSHFormalParameters r1 = r3.paramsNode
            r5.addListener(r1)
            bsh.BSHFormalParameters r5 = r3.paramsNode
            r1 = 1
            r5.setListener(r1)
        L45:
            r4.setMethod(r0)
            bsh.Primitive r4 = bsh.Primitive.VOID
            return r4
    }

    public java.lang.Class<?> evalReceiverType(bsh.CallStack r4, bsh.Interpreter r5) {
            r3 = this;
            r3.insureNodesParsed()
            boolean r5 = r3.isExtension
            if (r5 == 0) goto Lba
            java.lang.String r5 = r3.receiverText
            if (r5 == 0) goto Lba
            r0 = 0
            r1 = r0
        Ld:
            java.lang.String r2 = "[]"
            boolean r2 = r5.endsWith(r2)     // Catch: bsh.UtilEvalError -> L22
            if (r2 == 0) goto L25
            int r1 = r1 + 1
            int r2 = r5.length()     // Catch: bsh.UtilEvalError -> L22
            int r2 = r2 + (-2)
            java.lang.String r5 = r5.substring(r0, r2)     // Catch: bsh.UtilEvalError -> L22
            goto Ld
        L22:
            r5 = move-exception
            goto Lb5
        L25:
            int r0 = r5.hashCode()     // Catch: bsh.UtilEvalError -> L22
            switch(r0) {
                case -1325958191: goto L7a;
                case 104431: goto L6f;
                case 3039496: goto L64;
                case 3052374: goto L59;
                case 3327612: goto L4e;
                case 64711720: goto L43;
                case 97526364: goto L38;
                case 109413500: goto L2d;
                default: goto L2c;
            }     // Catch: bsh.UtilEvalError -> L22
        L2c:
            goto L85
        L2d:
            java.lang.String r0 = "short"
            boolean r0 = r5.equals(r0)     // Catch: bsh.UtilEvalError -> L22
            if (r0 == 0) goto L85
            java.lang.Class r5 = java.lang.Short.TYPE     // Catch: bsh.UtilEvalError -> L22
            goto L90
        L38:
            java.lang.String r0 = "float"
            boolean r0 = r5.equals(r0)     // Catch: bsh.UtilEvalError -> L22
            if (r0 == 0) goto L85
            java.lang.Class r5 = java.lang.Float.TYPE     // Catch: bsh.UtilEvalError -> L22
            goto L90
        L43:
            java.lang.String r0 = "boolean"
            boolean r0 = r5.equals(r0)     // Catch: bsh.UtilEvalError -> L22
            if (r0 == 0) goto L85
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: bsh.UtilEvalError -> L22
            goto L90
        L4e:
            java.lang.String r0 = "long"
            boolean r0 = r5.equals(r0)     // Catch: bsh.UtilEvalError -> L22
            if (r0 == 0) goto L85
            java.lang.Class r5 = java.lang.Long.TYPE     // Catch: bsh.UtilEvalError -> L22
            goto L90
        L59:
            java.lang.String r0 = "char"
            boolean r0 = r5.equals(r0)     // Catch: bsh.UtilEvalError -> L22
            if (r0 == 0) goto L85
            java.lang.Class r5 = java.lang.Character.TYPE     // Catch: bsh.UtilEvalError -> L22
            goto L90
        L64:
            java.lang.String r0 = "byte"
            boolean r0 = r5.equals(r0)     // Catch: bsh.UtilEvalError -> L22
            if (r0 == 0) goto L85
            java.lang.Class r5 = java.lang.Byte.TYPE     // Catch: bsh.UtilEvalError -> L22
            goto L90
        L6f:
            java.lang.String r0 = "int"
            boolean r0 = r5.equals(r0)     // Catch: bsh.UtilEvalError -> L22
            if (r0 == 0) goto L85
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: bsh.UtilEvalError -> L22
            goto L90
        L7a:
            java.lang.String r0 = "double"
            boolean r0 = r5.equals(r0)     // Catch: bsh.UtilEvalError -> L22
            if (r0 == 0) goto L85
            java.lang.Class r5 = java.lang.Double.TYPE     // Catch: bsh.UtilEvalError -> L22
            goto L90
        L85:
            bsh.NameSpace r0 = r4.top()     // Catch: bsh.UtilEvalError -> L22
            java.lang.Class r0 = r0.getClass(r5)     // Catch: bsh.UtilEvalError -> L22
            if (r0 == 0) goto L9e
            r5 = r0
        L90:
            if (r1 != 0) goto L93
            return r5
        L93:
            int[] r0 = new int[r1]     // Catch: bsh.UtilEvalError -> L22
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r5, r0)     // Catch: bsh.UtilEvalError -> L22
            java.lang.Class r4 = r5.getClass()     // Catch: bsh.UtilEvalError -> L22
            return r4
        L9e:
            bsh.UtilEvalError r0 = new bsh.UtilEvalError     // Catch: bsh.UtilEvalError -> L22
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: bsh.UtilEvalError -> L22
            r1.<init>()     // Catch: bsh.UtilEvalError -> L22
            java.lang.String r2 = "Extension receiver type not found: "
            r1.append(r2)     // Catch: bsh.UtilEvalError -> L22
            r1.append(r5)     // Catch: bsh.UtilEvalError -> L22
            java.lang.String r5 = r1.toString()     // Catch: bsh.UtilEvalError -> L22
            r0.<init>(r5)     // Catch: bsh.UtilEvalError -> L22
            throw r0     // Catch: bsh.UtilEvalError -> L22
        Lb5:
            bsh.EvalError r4 = r5.toEvalError(r3, r4)
            throw r4
        Lba:
            r4 = 0
            return r4
    }

    public java.lang.Class<?> evalReturnType(bsh.CallStack r2, bsh.Interpreter r3) {
            r1 = this;
            r1.insureNodesParsed()
            bsh.BSHReturnType r0 = r1.returnTypeNode
            if (r0 == 0) goto Lc
            java.lang.Class r2 = r0.evalReturnType(r2, r3)
            return r2
        Lc:
            r2 = 0
            return r2
    }

    public java.lang.String getReturnTypeDescriptor(bsh.CallStack r2, bsh.Interpreter r3, java.lang.String r4) {
            r1 = this;
            r1.insureNodesParsed()
            bsh.BSHReturnType r0 = r1.returnTypeNode
            if (r0 != 0) goto L9
            r2 = 0
            return r2
        L9:
            java.lang.String r2 = r0.getTypeDescriptor(r2, r3, r4)
            return r2
    }

    public bsh.BSHReturnType getReturnTypeNode() {
            r1 = this;
            r1.insureNodesParsed()
            bsh.BSHReturnType r0 = r1.returnTypeNode
            return r0
    }

    public synchronized void insureNodesParsed() {
            r5 = this;
            monitor-enter(r5)
            bsh.BSHFormalParameters r0 = r5.paramsNode     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L7
            monitor-exit(r5)
            return
        L7:
            r0 = 0
            bsh.Node r1 = r5.jjtGetChild(r0)     // Catch: java.lang.Throwable -> L1b
            boolean r2 = r1 instanceof bsh.BSHReturnType     // Catch: java.lang.Throwable -> L1b
            r3 = 1
            if (r2 == 0) goto L1e
            bsh.BSHReturnType r1 = (bsh.BSHReturnType) r1     // Catch: java.lang.Throwable -> L1b
            r5.returnTypeNode = r1     // Catch: java.lang.Throwable -> L1b
            bsh.Node r1 = r5.jjtGetChild(r3)     // Catch: java.lang.Throwable -> L1b
            r2 = r3
            goto L1f
        L1b:
            r0 = move-exception
            goto Laa
        L1e:
            r2 = r0
        L1f:
            boolean r4 = r1 instanceof bsh.BSHAmbiguousName     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L48
            bsh.BSHAmbiguousName r1 = (bsh.BSHAmbiguousName) r1     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = r1.text     // Catch: java.lang.Throwable -> L1b
            r4 = 46
            int r4 = r1.lastIndexOf(r4)     // Catch: java.lang.Throwable -> L1b
            if (r4 < 0) goto L3f
            r5.isExtension = r3     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r1.substring(r0, r4)     // Catch: java.lang.Throwable -> L1b
            r5.receiverText = r0     // Catch: java.lang.Throwable -> L1b
            int r4 = r4 + r3
            java.lang.String r0 = r1.substring(r4)     // Catch: java.lang.Throwable -> L1b
            r5.name = r0     // Catch: java.lang.Throwable -> L1b
            goto L46
        L3f:
            r5.isExtension = r0     // Catch: java.lang.Throwable -> L1b
            r0 = 0
            r5.receiverText = r0     // Catch: java.lang.Throwable -> L1b
            r5.name = r1     // Catch: java.lang.Throwable -> L1b
        L46:
            int r2 = r2 + 1
        L48:
            bsh.Node r0 = r5.jjtGetChild(r2)     // Catch: java.lang.Throwable -> L1b
            bsh.BSHFormalParameters r0 = (bsh.BSHFormalParameters) r0     // Catch: java.lang.Throwable -> L1b
            r5.paramsNode = r0     // Catch: java.lang.Throwable -> L1b
            int r2 = r2 + r3
            r5.firstThrowsClause = r2     // Catch: java.lang.Throwable -> L1b
            int r0 = r5.jjtGetNumChildren()     // Catch: java.lang.Throwable -> L1b
            int r1 = r5.numThrows     // Catch: java.lang.Throwable -> L1b
            int r4 = r2 + r1
            if (r0 <= r4) goto L66
            int r2 = r2 + r1
            bsh.Node r0 = r5.jjtGetChild(r2)     // Catch: java.lang.Throwable -> L1b
            bsh.BSHBlock r0 = (bsh.BSHBlock) r0     // Catch: java.lang.Throwable -> L1b
            r5.blockNode = r0     // Catch: java.lang.Throwable -> L1b
        L66:
            bsh.BSHBlock r0 = r5.blockNode     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L9d
            int r0 = r0.jjtGetNumChildren()     // Catch: java.lang.Throwable -> L1b
            if (r0 <= 0) goto L9d
            bsh.BSHBlock r0 = r5.blockNode     // Catch: java.lang.Throwable -> L1b
            int r1 = r0.jjtGetNumChildren()     // Catch: java.lang.Throwable -> L1b
            int r1 = r1 - r3
            bsh.Node r0 = r0.jjtGetChild(r1)     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r0 instanceof bsh.BSHReturnStatement     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L9d
        L7f:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L9d
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L1b
            bsh.Node r0 = (bsh.Node) r0     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r0 instanceof bsh.BSHAmbiguousName     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L7f
            r1 = r0
            bsh.BSHAmbiguousName r1 = (bsh.BSHAmbiguousName) r1     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = r1.text     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = "this"
            boolean r1 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> L1b
            r5.isScriptedObject = r1     // Catch: java.lang.Throwable -> L1b
            goto L7f
        L9d:
            bsh.BSHFormalParameters r0 = r5.paramsNode     // Catch: java.lang.Throwable -> L1b
            r0.insureParsed()     // Catch: java.lang.Throwable -> L1b
            bsh.BSHFormalParameters r0 = r5.paramsNode     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.isVarArgs     // Catch: java.lang.Throwable -> L1b
            r5.isVarArgs = r0     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r5)
            return
        Laa:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1b
            throw r0
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
            java.lang.String r0 = r0.toString()
            return r0
    }
}
