package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHPrimarySuffix extends bsh.SimpleNode {
    public static final int CLASS = 6;
    public static final int INDEX = 1;
    public static final int METHODREF = 5;
    public static final int NAME = 2;
    public static final int NEW = 4;
    public static final int PROPERTY = 3;
    private static final long serialVersionUID = 1;
    public java.lang.String field;
    public boolean hasLeftIndex;
    public boolean hasRightIndex;
    java.lang.Object index;
    public int operation;
    public boolean safeNavigate;
    public boolean slice;
    public boolean step;

    public BSHPrimarySuffix(int r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.slice = r1
            r0.step = r1
            r0.hasLeftIndex = r1
            r0.hasRightIndex = r1
            r0.safeNavigate = r1
            return
    }

    private java.lang.Object doIndex(java.lang.Object r7, boolean r8, bsh.CallStack r9, bsh.Interpreter r10) {
            r6 = this;
            boolean r0 = r10.getStrictJava()
            r1 = 0
            if (r0 != 0) goto L5e
            boolean r0 = bsh.Types.isPropertyTypeMap(r7)
            if (r0 == 0) goto L22
            bsh.Node r0 = r6.jjtGetChild(r1)
            java.lang.Object r9 = r0.eval(r9, r10)
            if (r8 == 0) goto L1d
            bsh.LHS r8 = new bsh.LHS
            r8.<init>(r7, r9)
            return r8
        L1d:
            java.lang.Object r7 = bsh.Reflect.getObjectProperty(r7, r9)
            return r7
        L22:
            boolean r0 = bsh.Types.isPropertyTypeEntry(r7)
            if (r0 == 0) goto L5e
            bsh.Node r0 = r6.jjtGetChild(r1)
            java.lang.Object r10 = r0.eval(r9, r10)
            if (r8 == 0) goto L59
            r8 = r7
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r8 = r8.getKey()
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto L45
            bsh.LHS r8 = new bsh.LHS
            r8.<init>(r7)
            return r8
        L45:
            bsh.EvalError r7 = new bsh.EvalError
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "No such property: "
            r8.<init>(r0)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8, r6, r9)
            throw r7
        L59:
            java.lang.Object r7 = bsh.Reflect.getObjectProperty(r7, r10)
            return r7
        L5e:
            java.lang.Class r0 = r7.getClass()
            boolean r2 = r10.getStrictJava()
            if (r2 != 0) goto L6c
            boolean r2 = r7 instanceof java.util.List
            if (r2 != 0) goto L72
        L6c:
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L19e
        L72:
            boolean r2 = r7 instanceof java.util.List
            if (r2 == 0) goto L7e
            r2 = r7
            java.util.List r2 = (java.util.List) r2
            int r2 = r2.size()
            goto L82
        L7e:
            int r2 = java.lang.reflect.Array.getLength(r7)
        L82:
            int r3 = r2 + 1
            boolean r4 = r10.getStrictJava()
            if (r4 != 0) goto Ld4
            boolean r0 = bsh.Types.isPropertyTypeEntryList(r0)
            if (r0 == 0) goto Ld4
            bsh.Node r0 = r6.jjtGetChild(r1)
            java.lang.Object r0 = r0.eval(r9, r10)
            boolean r3 = r0 instanceof bsh.Primitive
            if (r3 == 0) goto La5
            r3 = r0
            bsh.Primitive r3 = (bsh.Primitive) r3
            boolean r3 = r3.isNumber()
            if (r3 != 0) goto Laf
        La5:
            java.lang.Class r3 = r0.getClass()
            boolean r3 = bsh.Primitive.isWrapperType(r3)
            if (r3 == 0) goto Lc1
        Laf:
            java.lang.Class r3 = java.lang.Integer.TYPE
            java.lang.Object r3 = bsh.Primitive.castWrapper(r3, r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r2 <= r3) goto Lc1
            int r4 = -r2
            if (r4 >= r3) goto Lc1
            goto Lda
        Lc1:
            if (r8 == 0) goto Lcf
            bsh.LHS r8 = new bsh.LHS
            java.util.Map$Entry[] r7 = (java.util.Map.Entry[]) r7
            java.util.Map$Entry r7 = bsh.Reflect.getEntryForKey(r0, r7)
            r8.<init>(r7)
            return r8
        Lcf:
            java.lang.Object r7 = bsh.Reflect.getObjectProperty(r7, r0)
            return r7
        Ld4:
            if (r3 <= r2) goto Lda
            int r3 = getIndexAux(r7, r1, r9, r10, r6)
        Lda:
            boolean r0 = r10.getStrictJava()
            if (r0 != 0) goto L17d
            if (r3 >= 0) goto Le3
            int r3 = r3 + r2
        Le3:
            boolean r0 = r6.slice
            if (r0 == 0) goto L181
            if (r8 != 0) goto L175
            boolean r8 = r6.step
            r0 = 1
            if (r8 == 0) goto L146
            boolean r8 = r6.hasLeftIndex
            r4 = 2
            if (r8 == 0) goto L107
            boolean r8 = r6.hasRightIndex
            if (r8 == 0) goto L107
            int r8 = r6.jjtGetNumChildren()
            r5 = 3
            if (r8 != r5) goto L107
            int r8 = getIndexAux(r7, r4, r9, r10, r6)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L131
        L107:
            boolean r8 = r6.hasLeftIndex
            if (r8 == 0) goto L10f
            boolean r8 = r6.hasRightIndex
            if (r8 != 0) goto L11e
        L10f:
            int r8 = r6.jjtGetNumChildren()
            if (r8 != r4) goto L11e
            int r8 = getIndexAux(r7, r0, r9, r10, r6)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L131
        L11e:
            boolean r8 = r6.hasLeftIndex
            if (r8 != 0) goto L130
            boolean r8 = r6.hasRightIndex
            if (r8 != 0) goto L130
            int r8 = getIndexAux(r7, r1, r9, r10, r6)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r3 = r1
            goto L131
        L130:
            r8 = 0
        L131:
            if (r8 == 0) goto L146
            int r4 = r8.intValue()
            if (r4 == 0) goto L13e
            int r8 = r8.intValue()
            goto L147
        L13e:
            bsh.EvalError r7 = new bsh.EvalError
            java.lang.String r8 = "array slice step cannot be zero"
            r7.<init>(r8, r6, r9)
            throw r7
        L146:
            r8 = r1
        L147:
            boolean r4 = r6.hasLeftIndex
            if (r4 == 0) goto L156
            boolean r4 = r6.hasRightIndex
            if (r4 == 0) goto L156
            int r9 = getIndexAux(r7, r0, r9, r10, r6)
            r1 = r3
            r3 = r9
            goto L15c
        L156:
            boolean r9 = r6.hasRightIndex
            if (r9 != 0) goto L15c
            r1 = r3
            r3 = r2
        L15c:
            if (r3 >= 0) goto L15f
            int r3 = r3 + r2
        L15f:
            java.lang.Class r9 = r7.getClass()
            boolean r9 = r9.isArray()
            if (r9 == 0) goto L16e
            java.lang.Object r7 = bsh.BshArray.slice(r7, r1, r3, r8)
            return r7
        L16e:
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = bsh.BshArray.slice(r7, r1, r3, r8)
            return r7
        L175:
            bsh.EvalError r7 = new bsh.EvalError
            java.lang.String r8 = "cannot assign to array slice"
            r7.<init>(r8, r6, r9)
            throw r7
        L17d:
            boolean r10 = r6.slice
            if (r10 != 0) goto L196
        L181:
            if (r8 == 0) goto L189
            bsh.LHS r8 = new bsh.LHS
            r8.<init>(r7, r3)
            return r8
        L189:
            java.lang.Object r7 = bsh.BshArray.getIndex(r7, r3)     // Catch: bsh.UtilEvalError -> L18e
            return r7
        L18e:
            r7 = move-exception
            java.lang.String r8 = "Error array get index"
            bsh.EvalError r7 = r7.toEvalError(r8, r6, r9)
            throw r7
        L196:
            bsh.EvalError r7 = new bsh.EvalError
            java.lang.String r8 = "expected ']' but found ':'"
            r7.<init>(r8, r6, r9)
            throw r7
        L19e:
            bsh.EvalError r7 = new bsh.EvalError
            java.lang.String r8 = "Not an array or List type"
            r7.<init>(r8, r6, r9)
            throw r7
    }

    private bsh.BshLambda doMethodRef(java.lang.Object r2) {
            r1 = this;
            java.lang.String r0 = r1.field
            bsh.BshLambda r2 = bsh.BshLambda.fromMethodReference(r1, r2, r0)
            return r2
    }

    private java.lang.Object doName(java.lang.Object r7, boolean r8, bsh.CallStack r9, bsh.Interpreter r10) {
            r6 = this;
            boolean r0 = r6.safeNavigate     // Catch: bsh.UtilEvalError -> L90
            if (r0 == 0) goto L14
            bsh.Primitive r0 = bsh.Primitive.NULL     // Catch: bsh.UtilEvalError -> Le
            if (r0 == r7) goto L9
            goto L14
        L9:
            bsh.SafeNavigate r7 = bsh.SafeNavigate.doAbort()     // Catch: bsh.UtilEvalError -> Le
            throw r7     // Catch: bsh.UtilEvalError -> Le
        Le:
            r0 = move-exception
            r7 = r0
            r5 = r6
            r4 = r9
            goto L94
        L14:
            java.lang.String r0 = r6.field     // Catch: bsh.UtilEvalError -> L90
            java.lang.String r1 = "length"
            boolean r0 = r0.equals(r1)     // Catch: bsh.UtilEvalError -> L90
            if (r0 == 0) goto L43
            java.lang.Class r0 = r7.getClass()     // Catch: bsh.UtilEvalError -> Le
            boolean r0 = r0.isArray()     // Catch: bsh.UtilEvalError -> Le
            if (r0 == 0) goto L43
            bsh.security.MainSecurityGuard r10 = bsh.Interpreter.mainSecurityGuard     // Catch: bsh.UtilEvalError -> Le
            java.lang.String r0 = r6.field     // Catch: bsh.UtilEvalError -> Le
            r10.canGetField(r7, r0)     // Catch: bsh.UtilEvalError -> Le
            if (r8 != 0) goto L3b
            bsh.Primitive r8 = new bsh.Primitive     // Catch: bsh.UtilEvalError -> Le
            int r7 = java.lang.reflect.Array.getLength(r7)     // Catch: bsh.UtilEvalError -> Le
            r8.<init>(r7)     // Catch: bsh.UtilEvalError -> Le
            return r8
        L3b:
            bsh.EvalError r7 = new bsh.EvalError     // Catch: bsh.UtilEvalError -> Le
            java.lang.String r8 = "Can't assign array length"
            r7.<init>(r8, r6, r9)     // Catch: bsh.UtilEvalError -> Le
            throw r7     // Catch: bsh.UtilEvalError -> Le
        L43:
            int r0 = r6.jjtGetNumChildren()     // Catch: bsh.UtilEvalError -> L90
            if (r0 != 0) goto L70
            bsh.security.MainSecurityGuard r10 = bsh.Interpreter.mainSecurityGuard     // Catch: bsh.UtilEvalError -> Le
            java.lang.String r0 = r6.field     // Catch: bsh.UtilEvalError -> Le
            r10.canGetField(r7, r0)     // Catch: bsh.UtilEvalError -> Le
            java.lang.String r10 = r6.field
            if (r8 == 0) goto L61
            bsh.LHS r7 = bsh.Reflect.getLHSObjectField(r7, r10)     // Catch: java.lang.Throwable -> L59
            return r7
        L59:
            bsh.LHS r8 = new bsh.LHS     // Catch: bsh.UtilEvalError -> Le
            java.lang.String r10 = r6.field     // Catch: bsh.UtilEvalError -> Le
            r8.<init>(r7, r10)     // Catch: bsh.UtilEvalError -> Le
            return r8
        L61:
            java.lang.Object r7 = bsh.Reflect.getObjectFieldValue(r7, r10)     // Catch: java.lang.Throwable -> L66
            return r7
        L66:
            java.lang.String r8 = r6.field     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r7 = bsh.Reflect.getObjectProperty(r7, r8)     // Catch: java.lang.Throwable -> L6d
            return r7
        L6d:
            bsh.Primitive r7 = bsh.Primitive.VOID     // Catch: bsh.UtilEvalError -> Le
            return r7
        L70:
            r8 = 0
            bsh.Node r8 = r6.jjtGetChild(r8)     // Catch: bsh.UtilEvalError -> L90
            bsh.BSHArguments r8 = (bsh.BSHArguments) r8     // Catch: bsh.UtilEvalError -> L90
            java.lang.Object[] r2 = r8.getArguments(r9, r10)     // Catch: bsh.UtilEvalError -> L90
            bsh.security.MainSecurityGuard r8 = bsh.Interpreter.mainSecurityGuard     // Catch: bsh.UtilEvalError -> L90
            java.lang.String r0 = r6.field     // Catch: bsh.UtilEvalError -> L90
            r8.canInvokeMethod(r7, r0, r2)     // Catch: bsh.UtilEvalError -> L90
            java.lang.String r1 = r6.field     // Catch: bsh.UtilEvalError -> L90
            r5 = r6
            r0 = r7
            r4 = r9
            r3 = r10
            java.lang.Object r7 = bsh.Reflect.invokeObjectMethod(r0, r1, r2, r3, r4, r5)     // Catch: bsh.UtilEvalError -> L8d
            return r7
        L8d:
            r0 = move-exception
        L8e:
            r7 = r0
            goto L94
        L90:
            r0 = move-exception
            r5 = r6
            r4 = r9
            goto L8e
        L94:
            bsh.EvalError r7 = r7.toEvalError(r6, r4)
            throw r7
    }

    private java.lang.Object doNewInner(java.lang.Object r2, boolean r3, bsh.CallStack r4, bsh.Interpreter r5) {
            r1 = this;
            r3 = 0
            bsh.Node r3 = r1.jjtGetChild(r3)
            bsh.BSHAllocationExpression r3 = (bsh.BSHAllocationExpression) r3
            java.lang.Class r0 = r2.getClass()
            boolean r0 = bsh.Reflect.isGeneratedClass(r0)
            if (r0 == 0) goto L20
            r4.pop()
            bsh.NameSpace r2 = bsh.Reflect.getThisNS(r2)
            r4.push(r2)
            java.lang.Object r2 = r3.eval(r4, r5)
            return r2
        L20:
            java.lang.Object r2 = r3.constructFromEnclosingInstance(r2, r4, r5)
            return r2
    }

    private java.lang.Object doProperty(boolean r3, java.lang.Object r4, bsh.CallStack r5, bsh.Interpreter r6) {
            r2 = this;
            bsh.Primitive r0 = bsh.Primitive.VOID
            if (r4 == r0) goto L56
            boolean r0 = r4 instanceof bsh.Primitive
            if (r0 != 0) goto L4e
            r0 = 0
            bsh.Node r0 = r2.jjtGetChild(r0)
            java.lang.Object r6 = r0.eval(r5, r6)
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L46
            if (r3 == 0) goto L1f
            bsh.LHS r3 = new bsh.LHS
            java.lang.String r6 = (java.lang.String) r6
            r3.<init>(r4, r6)
            return r3
        L1f:
            r3 = r6
            java.lang.String r3 = (java.lang.String) r3     // Catch: bsh.ReflectError -> L2b
            java.lang.Object r3 = bsh.Reflect.getObjectProperty(r4, r3)     // Catch: bsh.ReflectError -> L2b
            if (r3 != 0) goto L2d
            bsh.Primitive r3 = bsh.Primitive.NULL     // Catch: bsh.ReflectError -> L2b
            return r3
        L2b:
            r3 = move-exception
            goto L32
        L2d:
            java.lang.Object r3 = bsh.Primitive.unwrap(r3)     // Catch: bsh.ReflectError -> L2b
            return r3
        L32:
            bsh.EvalError r4 = new bsh.EvalError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No such property: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r4.<init>(r6, r2, r5, r3)
            throw r4
        L46:
            bsh.EvalError r3 = new bsh.EvalError
            java.lang.String r4 = "Property expression must be a String or identifier."
            r3.<init>(r4, r2, r5)
            throw r3
        L4e:
            bsh.EvalError r3 = new bsh.EvalError
            java.lang.String r4 = "Attempt to access property on a primitive"
            r3.<init>(r4, r2, r5)
            throw r3
        L56:
            bsh.EvalError r3 = new bsh.EvalError
            java.lang.String r4 = "Attempt to access property on undefined variable or class name"
            r3.<init>(r4, r2, r5)
            throw r3
    }

    public static int getIndexAux(java.lang.Object r0, int r1, bsh.CallStack r2, bsh.Interpreter r3, bsh.Node r4) {
            bsh.Node r0 = r4.jjtGetChild(r1)     // Catch: java.lang.Exception -> L14
            java.lang.Object r0 = r0.eval(r2, r3)     // Catch: java.lang.Exception -> L14
            boolean r1 = r0 instanceof bsh.Primitive     // Catch: java.lang.Exception -> L14
            java.lang.Class r3 = java.lang.Integer.TYPE
            if (r1 != 0) goto L16
            r1 = 1
            java.lang.Object r0 = bsh.Types.castObject(r0, r3, r1)     // Catch: java.lang.Exception -> L14
            goto L16
        L14:
            r0 = move-exception
            goto L21
        L16:
            java.lang.Object r0 = bsh.Primitive.castWrapper(r3, r0)     // Catch: java.lang.Exception -> L14
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L14
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L14
            return r0
        L21:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "doIndex: "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            bsh.Interpreter.debug(r1)
            bsh.EvalError r1 = new bsh.EvalError
            java.lang.String r3 = "Array index does not evaluate to an integer."
            r1.<init>(r3, r4, r2, r0)
            throw r1
    }

    public java.lang.Object doSuffix(java.lang.Object r3, boolean r4, bsh.CallStack r5, bsh.Interpreter r6) {
            r2 = this;
            int r0 = r2.operation
            r1 = 6
            if (r0 != r1) goto L22
            boolean r0 = r3 instanceof bsh.BSHType
            if (r0 == 0) goto L1a
            if (r4 != 0) goto L12
            bsh.BSHType r3 = (bsh.BSHType) r3
            java.lang.Class r3 = r3.getType(r5, r6)
            return r3
        L12:
            bsh.EvalException r3 = new bsh.EvalException
            java.lang.String r4 = "Can't assign .class"
            r3.<init>(r4, r2, r5)
            throw r3
        L1a:
            bsh.EvalException r3 = new bsh.EvalException
            java.lang.String r4 = "Attempt to use .class suffix on non class."
            r3.<init>(r4, r2, r5)
            throw r3
        L22:
            boolean r0 = r3 instanceof bsh.Node
            if (r0 == 0) goto L38
            boolean r0 = r3 instanceof bsh.BSHAmbiguousName
            if (r0 == 0) goto L31
            bsh.BSHAmbiguousName r3 = (bsh.BSHAmbiguousName) r3
            java.lang.Object r3 = r3.toObject(r5, r6)
            goto L49
        L31:
            bsh.Node r3 = (bsh.Node) r3
            java.lang.Object r3 = r3.eval(r5, r6)
            goto L49
        L38:
            boolean r0 = r3 instanceof bsh.LHS
            if (r0 == 0) goto L49
            bsh.LHS r3 = (bsh.LHS) r3     // Catch: bsh.UtilEvalError -> L43
            java.lang.Object r3 = r3.getValue()     // Catch: bsh.UtilEvalError -> L43
            goto L49
        L43:
            r3 = move-exception
            bsh.EvalError r3 = r3.toEvalError(r2, r5)
            throw r3
        L49:
            int r0 = r2.operation     // Catch: bsh.ReflectError -> L5f
            r1 = 1
            if (r0 == r1) goto L78
            r1 = 2
            if (r0 == r1) goto L73
            r1 = 3
            if (r0 == r1) goto L6e
            r1 = 4
            if (r0 == r1) goto L69
            r4 = 5
            if (r0 != r4) goto L61
            bsh.BshLambda r3 = r2.doMethodRef(r3)     // Catch: bsh.ReflectError -> L5f
            return r3
        L5f:
            r3 = move-exception
            goto L7d
        L61:
            bsh.InterpreterError r3 = new bsh.InterpreterError     // Catch: bsh.ReflectError -> L5f
            java.lang.String r4 = "Unknown suffix type"
            r3.<init>(r4)     // Catch: bsh.ReflectError -> L5f
            throw r3     // Catch: bsh.ReflectError -> L5f
        L69:
            java.lang.Object r3 = r2.doNewInner(r3, r4, r5, r6)     // Catch: bsh.ReflectError -> L5f
            return r3
        L6e:
            java.lang.Object r3 = r2.doProperty(r4, r3, r5, r6)     // Catch: bsh.ReflectError -> L5f
            return r3
        L73:
            java.lang.Object r3 = r2.doName(r3, r4, r5, r6)     // Catch: bsh.ReflectError -> L5f
            return r3
        L78:
            java.lang.Object r3 = r2.doIndex(r3, r4, r5, r6)     // Catch: bsh.ReflectError -> L5f
            return r3
        L7d:
            bsh.EvalError r4 = new bsh.EvalError
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "reflection error: "
            r6.<init>(r0)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            r4.<init>(r6, r2, r5, r3)
            throw r4
    }

    @Override // bsh.SimpleNode
    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.operation
            r1 = 1
            if (r0 != r1) goto L3b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ":INDEX ["
            r0.append(r1)
            boolean r1 = r3.hasLeftIndex
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            boolean r2 = r3.slice
            r0.append(r2)
            java.lang.String r2 = " "
            r0.append(r2)
            boolean r2 = r3.hasRightIndex
            r0.append(r2)
            r0.append(r1)
            boolean r1 = r3.step
            java.lang.String r2 = "]"
            java.lang.String r0 = p.a.m(r2, r0, r1)
            return r0
        L3b:
            r1 = 2
            if (r0 != r1) goto L59
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ":NAME "
            r0.append(r1)
            java.lang.String r1 = r3.field
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L59:
            r1 = 3
            if (r0 != r1) goto L6c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            java.lang.String r2 = ":PROPERTY {}"
            java.lang.String r0 = eh.a.r(r0, r1, r2)
            return r0
        L6c:
            r1 = 4
            if (r0 != r1) goto L7f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            java.lang.String r2 = ":NEW new"
            java.lang.String r0 = eh.a.r(r0, r1, r2)
            return r0
        L7f:
            r1 = 6
            if (r0 != r1) goto L92
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            java.lang.String r2 = ":CLASS class"
            java.lang.String r0 = eh.a.r(r0, r1, r2)
            return r0
        L92:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            java.lang.String r2 = ":NO OPERATION"
            java.lang.String r0 = eh.a.r(r0, r1, r2)
            return r0
    }
}
