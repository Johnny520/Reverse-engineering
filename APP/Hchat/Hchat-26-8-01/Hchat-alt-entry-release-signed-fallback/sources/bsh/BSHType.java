package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHType extends bsh.SimpleNode implements bsh.BshClassManager.Listener {
    private static final long serialVersionUID = 1;
    private int arrayDims;
    private java.lang.Class<?> baseType;
    java.lang.String descriptor;
    private boolean isListener;
    private java.lang.Class<?> type;

    public BSHType(int r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.isListener = r1
            return
    }

    public static java.lang.String getTypeDescriptor(java.lang.Class<?> r5) {
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r5 != r0) goto L7
            java.lang.String r5 = "Z"
            return r5
        L7:
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r5 != r0) goto Le
            java.lang.String r5 = "C"
            return r5
        Le:
            java.lang.Class r0 = java.lang.Byte.TYPE
            if (r5 != r0) goto L15
            java.lang.String r5 = "B"
            return r5
        L15:
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r5 != r0) goto L1c
            java.lang.String r5 = "S"
            return r5
        L1c:
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r5 != r0) goto L23
            java.lang.String r5 = "I"
            return r5
        L23:
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r5 != r0) goto L2a
            java.lang.String r5 = "J"
            return r5
        L2a:
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r5 != r0) goto L31
            java.lang.String r5 = "F"
            return r5
        L31:
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r5 != r0) goto L38
            java.lang.String r5 = "D"
            return r5
        L38:
            java.lang.Class r0 = java.lang.Void.TYPE
            if (r5 != r0) goto L3f
            java.lang.String r5 = "V"
            return r5
        L3f:
            java.lang.String r5 = r5.getName()
            r0 = 46
            r1 = 47
            java.lang.String r5 = r5.replace(r0, r1)
            java.lang.String r2 = "["
            boolean r2 = r5.startsWith(r2)
            if (r2 != 0) goto L71
            java.lang.String r2 = ";"
            boolean r3 = r5.endsWith(r2)
            if (r3 == 0) goto L5c
            goto L71
        L5c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "L"
            r3.<init>(r4)
            java.lang.String r5 = r5.replace(r0, r1)
            r3.append(r5)
            r3.append(r2)
            java.lang.String r5 = r3.toString()
        L71:
            return r5
    }

    public void addArrayDimension() {
            r1 = this;
            int r0 = r1.arrayDims
            int r0 = r0 + 1
            r1.arrayDims = r0
            return
    }

    @Override // bsh.BshClassManager.Listener
    public void classLoaderChanged() {
            r1 = this;
            r0 = 0
            r1.type = r0
            r1.baseType = r0
            return
    }

    public int getArrayDims() {
            r1 = this;
            int r0 = r1.arrayDims
            return r0
    }

    public java.lang.Class<?> getBaseType() {
            r1 = this;
            java.lang.Class<?> r0 = r1.baseType
            return r0
    }

    public java.lang.Class<?> getType(bsh.CallStack r5, bsh.Interpreter r6) {
            r4 = this;
            java.lang.Class<?> r0 = r4.type
            if (r0 == 0) goto L5
            return r0
        L5:
            bsh.Node r0 = r4.getTypeNode()
            boolean r1 = r0 instanceof bsh.BSHPrimitiveType
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r3 = 1
            if (r1 == 0) goto L19
            bsh.BSHPrimitiveType r0 = (bsh.BSHPrimitiveType) r0
            java.lang.Class r0 = r0.getType()
            r4.baseType = r0
            goto L3c
        L19:
            r1 = r0
            bsh.BSHAmbiguousName r1 = (bsh.BSHAmbiguousName) r1     // Catch: bsh.EvalError -> L23
            java.lang.Class r1 = r1.toClass(r5, r6)     // Catch: bsh.EvalError -> L23
            r4.baseType = r1     // Catch: bsh.EvalError -> L23
            goto L3c
        L23:
            r1 = move-exception
            java.lang.String r0 = r0.getText()
            java.lang.String r0 = r0.trim()
            int r0 = r0.length()
            if (r0 != r3) goto L70
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof java.lang.ClassNotFoundException
            if (r0 == 0) goto L70
            r4.baseType = r2
        L3c:
            int r0 = r4.arrayDims
            if (r0 <= 0) goto L5c
            int[] r0 = new int[r0]     // Catch: java.lang.Exception -> L53
            java.lang.Class<?> r1 = r4.baseType     // Catch: java.lang.Exception -> L53
            if (r1 != 0) goto L47
            goto L48
        L47:
            r2 = r1
        L48:
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r2, r0)     // Catch: java.lang.Exception -> L53
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> L53
            r4.type = r0     // Catch: java.lang.Exception -> L53
            goto L60
        L53:
            r6 = move-exception
            bsh.EvalException r0 = new bsh.EvalException
            java.lang.String r1 = "Couldn't construct array type"
            r0.<init>(r1, r4, r5, r6)
            throw r0
        L5c:
            java.lang.Class<?> r5 = r4.baseType
            r4.type = r5
        L60:
            boolean r5 = r4.isListener
            if (r5 != 0) goto L6d
            bsh.BshClassManager r5 = r6.getClassManager()
            r5.addListener(r4)
            r4.isListener = r3
        L6d:
            java.lang.Class<?> r5 = r4.type
            return r5
        L70:
            throw r1
    }

    public java.lang.String getTypeDescriptor(bsh.CallStack r6, bsh.Interpreter r7, java.lang.String r8) {
            r5 = this;
            java.lang.String r0 = r5.descriptor
            if (r0 == 0) goto L5
            return r0
        L5:
            bsh.Node r0 = r5.getTypeNode()
            boolean r1 = r0 instanceof bsh.BSHPrimitiveType
            if (r1 == 0) goto L16
            bsh.BSHPrimitiveType r0 = (bsh.BSHPrimitiveType) r0
            java.lang.Class<?> r6 = r0.type
            java.lang.String r6 = getTypeDescriptor(r6)
            goto L82
        L16:
            r1 = r0
            bsh.BSHAmbiguousName r1 = (bsh.BSHAmbiguousName) r1
            java.lang.String r1 = r1.text
            bsh.NameSpace r2 = r6.top()
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.importedClasses
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r3 = 46
            r4 = 0
            if (r2 != 0) goto L3d
            bsh.BSHAmbiguousName r0 = (bsh.BSHAmbiguousName) r0     // Catch: bsh.EvalError -> L33
            java.lang.Class r4 = r0.toClass(r6, r7)     // Catch: bsh.EvalError -> L33
            goto L43
        L33:
            int r6 = r1.length()
            r7 = 1
            if (r6 != r7) goto L43
            java.lang.String r1 = "java.lang.Object"
            goto L43
        L3d:
            r6 = 36
            java.lang.String r1 = r2.replace(r3, r6)
        L43:
            if (r4 == 0) goto L4a
            java.lang.String r6 = getTypeDescriptor(r4)
            goto L82
        L4a:
            java.lang.String r6 = ";"
            r7 = 47
            java.lang.String r0 = "L"
            if (r8 == 0) goto L6f
            boolean r2 = bsh.Name.isCompound(r1)
            if (r2 == 0) goto L59
            goto L6f
        L59:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r7 = r8.replace(r3, r7)
            r2.append(r7)
            java.lang.String r7 = "/"
            r2.append(r7)
            java.lang.String r6 = eh.a.r(r2, r1, r6)
            goto L82
        L6f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r0)
            java.lang.String r7 = r1.replace(r3, r7)
            r8.append(r7)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
        L82:
            r7 = 0
        L83:
            int r8 = r5.arrayDims
            if (r7 >= r8) goto L90
            java.lang.String r8 = "["
            java.lang.String r6 = wb.en.g(r8, r6)
            int r7 = r7 + 1
            goto L83
        L90:
            r5.descriptor = r6
            return r6
    }

    public bsh.Node getTypeNode() {
            r1 = this;
            r0 = 0
            bsh.Node r0 = r1.jjtGetChild(r0)
            return r0
    }
}
