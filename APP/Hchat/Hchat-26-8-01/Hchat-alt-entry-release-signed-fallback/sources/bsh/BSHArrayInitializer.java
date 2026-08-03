package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHArrayInitializer extends bsh.SimpleNode {
    private static final long serialVersionUID = 1;
    java.util.Deque<bsh.BSHPrimaryExpression> expressionQueue;
    boolean isMapInArray;

    public BSHArrayInitializer(int r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.isMapInArray = r1
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            r0.expressionQueue = r1
            return
    }

    private java.lang.Object buildArray(int r7, java.lang.Class<?> r8, bsh.CallStack r9, bsh.Interpreter r10) {
            r6 = this;
            int[] r0 = new int[r7]
            int r1 = r6.jjtGetNumChildren()
            r2 = 0
            r0[r2] = r1
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r8, r0)
            java.lang.Class r1 = r0.getClass()
            java.lang.Class r1 = r1.getComponentType()
        L15:
            int r3 = r6.jjtGetNumChildren()
            if (r2 >= r3) goto L87
            bsh.Node r3 = r6.jjtGetChild(r2)
            boolean r4 = r3 instanceof bsh.BSHArrayInitializer
            if (r4 == 0) goto L5b
            r4 = 2
            if (r7 >= r4) goto L52
            bsh.BSHArrayInitializer r3 = (bsh.BSHArrayInitializer) r3
            boolean r4 = r6.isMapInArray(r3)
            if (r4 == 0) goto L36
            java.lang.Class<bsh.Types$MapEntry> r4 = bsh.Types.MapEntry.class
            r5 = 1
            java.lang.Object r3 = r3.eval(r4, r5, r9, r10)
            goto L5f
        L36:
            bsh.EvalException r7 = new bsh.EvalException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid Intializer for "
            r10.<init>(r0)
            r10.append(r8)
            java.lang.String r8 = ", at position: "
            r10.append(r8)
            r10.append(r2)
            java.lang.String r8 = r10.toString()
            r7.<init>(r8, r6, r9)
            throw r7
        L52:
            bsh.BSHArrayInitializer r3 = (bsh.BSHArrayInitializer) r3
            int r4 = r7 + (-1)
            java.lang.Object r3 = r3.eval(r8, r4, r9, r10)
            goto L5f
        L5b:
            java.lang.Object r3 = r3.eval(r9, r10)
        L5f:
            bsh.Primitive r4 = bsh.Primitive.VOID
            if (r3 == r4) goto L7b
            java.lang.Object r4 = r6.normalizeEntry(r3, r1, r7, r9)     // Catch: java.lang.IllegalArgumentException -> L6b
            java.lang.reflect.Array.set(r0, r2, r4)     // Catch: java.lang.IllegalArgumentException -> L6b
            goto L78
        L6b:
            r4 = move-exception
            java.lang.String r5 = "illegal arg"
            java.lang.Object[] r4 = new java.lang.Object[]{r5, r4}
            bsh.Interpreter.debug(r4)
            r6.throwTypeError(r8, r3, r2, r9)
        L78:
            int r2 = r2 + 1
            goto L15
        L7b:
            bsh.EvalException r7 = new bsh.EvalException
            java.lang.String r8 = "Void in array initializer, position "
            java.lang.String r8 = eh.a.l(r2, r8)
            r7.<init>(r8, r6, r9)
            throw r7
        L87:
            return r0
    }

    private java.lang.Object buildBean(java.lang.Class<?> r5, bsh.CallStack r6, bsh.Interpreter r7) {
            r4 = this;
            bsh.NameSpace r0 = new bsh.NameSpace
            bsh.NameSpace r1 = r6.top()
            java.lang.String r2 = r5.getName()
            r0.<init>(r1, r2)
            r6.push(r0)
            bsh.NameSpace r0 = r6.top()
            r0.setClassStatic(r5)
            bsh.NameSpace r0 = r6.top()
            r0.getThis(r7)
            r0 = 0
            java.lang.reflect.Constructor r5 = r5.getConstructor(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r5 = r5.newInstance(r0)     // Catch: java.lang.Throwable -> L4c
            bsh.NameSpace r0 = r6.top()     // Catch: java.lang.Throwable -> L4c
            r0.setClassInstance(r5)     // Catch: java.lang.Throwable -> L4c
            r0 = 0
            r1 = r0
        L30:
            int r2 = r4.jjtGetNumChildren()     // Catch: java.lang.Throwable -> L4c
            if (r1 >= r2) goto L4e
            bsh.Node r2 = r4.jjtGetChild(r1)     // Catch: java.lang.Throwable -> L4c
            bsh.BSHAssignment r2 = (bsh.BSHAssignment) r2     // Catch: java.lang.Throwable -> L4c
            bsh.Node r3 = r2.jjtGetChild(r0)     // Catch: java.lang.Throwable -> L4c
            bsh.BSHPrimaryExpression r3 = (bsh.BSHPrimaryExpression) r3     // Catch: java.lang.Throwable -> L4c
            r3.isMapExpression = r0     // Catch: java.lang.Throwable -> L4c
            r3.isArrayExpression = r0     // Catch: java.lang.Throwable -> L4c
            r2.eval(r6, r7)     // Catch: java.lang.Throwable -> L4c
            int r1 = r1 + 1
            goto L30
        L4c:
            r5 = move-exception
            goto L52
        L4e:
            r6.pop()
            return r5
        L52:
            bsh.EvalException r7 = new bsh.EvalException     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = r5.getMessage()     // Catch: java.lang.Throwable -> L5c
            r7.<init>(r0, r4, r6, r5)     // Catch: java.lang.Throwable -> L5c
            throw r7     // Catch: java.lang.Throwable -> L5c
        L5c:
            r5 = move-exception
            r6.pop()
            throw r5
    }

    private void clearEvalCache() {
            r2 = this;
            java.util.Deque<bsh.BSHPrimaryExpression> r0 = r2.expressionQueue
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            bsh.BSHPrimaryExpression r1 = (bsh.BSHPrimaryExpression) r1
            r1.clearCache()
            goto L6
        L16:
            return
    }

    private java.lang.Class<?> inferCommonType(java.lang.Class<?> r4, bsh.Node r5, bsh.CallStack r6, bsh.Interpreter r7) {
            r3 = this;
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r0 == r4) goto L47
            java.lang.Class<bsh.Types$MapEntry> r0 = bsh.Types.MapEntry.class
            if (r0 != r4) goto L9
            goto L47
        L9:
            boolean r0 = r5 instanceof bsh.BSHAssignment
            if (r0 == 0) goto L22
            java.lang.Object r5 = r5.eval(r6, r7)
            boolean r6 = bsh.Primitive.isWrapperType(r4)
            java.lang.Class r5 = bsh.Types.getType(r5, r6)
            java.lang.Class r5 = bsh.Types.arrayElementType(r5)
            java.lang.Class r4 = bsh.Types.getCommonType(r4, r5)
            return r4
        L22:
            boolean r0 = r5 instanceof bsh.BSHArrayInitializer
            if (r0 == 0) goto L36
            r0 = r5
            bsh.BSHArrayInitializer r0 = (bsh.BSHArrayInitializer) r0
            boolean r0 = r3.isMapInArray(r0)
            if (r0 == 0) goto L36
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            java.lang.Class r4 = bsh.Types.getCommonType(r4, r5)
            return r4
        L36:
            bsh.Node[] r5 = r5.jjtGetChildren()
            int r0 = r5.length
            r1 = 0
        L3c:
            if (r1 >= r0) goto L47
            r2 = r5[r1]
            java.lang.Class r4 = r3.inferCommonType(r4, r2, r6, r7)
            int r1 = r1 + 1
            goto L3c
        L47:
            return r4
    }

    private int inferDimensions(int r7, int r8, bsh.Node r9, bsh.CallStack r10, bsh.Interpreter r11) {
            r6 = this;
            r1 = r7
        L1:
            int r7 = r9.jjtGetNumChildren()
            if (r7 <= r8) goto L22
            bsh.Node r9 = r9.jjtGetChild(r8)
            boolean r7 = r9 instanceof bsh.BSHArrayInitializer
            if (r7 == 0) goto L22
            r7 = r9
            bsh.BSHArrayInitializer r7 = (bsh.BSHArrayInitializer) r7
            boolean r7 = r6.isMapInArray(r7)
            if (r7 != 0) goto L22
            int r7 = r9.jjtGetNumChildren()
            if (r7 <= 0) goto L22
            int r1 = r1 + 1
            r8 = 0
            goto L1
        L22:
            boolean r7 = r9 instanceof bsh.BSHArrayInitializer
            if (r7 != 0) goto L46
            java.lang.Object r7 = r9.eval(r10, r11)
            bsh.Primitive r0 = bsh.Primitive.NULL
            if (r7 != r0) goto L3c
            int r2 = r8 + 1
            bsh.Node r3 = r9.jjtGetParent()
            r0 = r6
            r4 = r10
            r5 = r11
            int r7 = r0.inferDimensions(r1, r2, r3, r4, r5)
            return r7
        L3c:
            java.lang.Class r7 = bsh.Types.getType(r7)
            int r7 = bsh.Types.arrayDimensions(r7)
            int r1 = r1 + r7
            return r1
        L46:
            r4 = r10
            r5 = r11
            int r7 = r9.jjtGetNumChildren()
            if (r7 != 0) goto L5a
            int r2 = r8 + 1
            bsh.Node r3 = r9.jjtGetParent()
            r0 = r6
            int r7 = r0.inferDimensions(r1, r2, r3, r4, r5)
            return r7
        L5a:
            return r1
    }

    private boolean isBeanType(java.lang.Class<?> r3) {
            r2 = this;
            java.lang.Class r0 = java.lang.Void.TYPE
            r1 = 0
            if (r0 == r3) goto L3f
            boolean r3 = bsh.Types.isCollectionType(r3)
            if (r3 != 0) goto L3f
            bsh.Node r3 = r2.jjtGetChild(r1)
            boolean r3 = r3 instanceof bsh.BSHAssignment
            if (r3 == 0) goto L3f
            bsh.Node r3 = r2.jjtGetChild(r1)
            bsh.Node r3 = r3.jjtGetChild(r1)
            boolean r3 = r3 instanceof bsh.BSHPrimaryExpression
            if (r3 == 0) goto L3f
            bsh.Node r3 = r2.jjtGetChild(r1)
            bsh.Node r3 = r3.jjtGetChild(r1)
            bsh.BSHPrimaryExpression r3 = (bsh.BSHPrimaryExpression) r3
            boolean r3 = r3.isMapExpression
            if (r3 == 0) goto L3f
            bsh.Node r3 = r2.jjtGetChild(r1)
            bsh.Node r3 = r3.jjtGetChild(r1)
            bsh.Node r3 = r3.jjtGetChild(r1)
            boolean r3 = r3 instanceof bsh.BSHAmbiguousName
            if (r3 == 0) goto L3f
            r3 = 1
            return r3
        L3f:
            return r1
    }

    private boolean isMapInArray(bsh.BSHArrayInitializer r1) {
            r0 = this;
            boolean r1 = r1.isMapInArray
            return r1
    }

    private java.lang.Object normalizeEntry(java.lang.Object r2, java.lang.Class<?> r3, int r4, bsh.CallStack r5) {
            r1 = this;
            r0 = 1
            if (r4 == r0) goto Ld
            bsh.Primitive r4 = bsh.Primitive.NULL
            if (r2 == r4) goto L8
            goto Ld
        L8:
            java.lang.Object r2 = bsh.Primitive.unwrap(r2)
            return r2
        Ld:
            r4 = 0
            java.lang.Object r2 = bsh.Types.castObject(r2, r3, r4)     // Catch: bsh.UtilEvalError -> L17
            java.lang.Object r2 = bsh.Primitive.unwrap(r2)     // Catch: bsh.UtilEvalError -> L17
            return r2
        L17:
            r2 = move-exception
            java.lang.String r3 = "Error in array initializer"
            bsh.EvalException r2 = r2.toEvalException(r3, r1, r5)
            throw r2
    }

    private void throwTypeError(java.lang.Class<?> r4, java.lang.Object r5, int r6, bsh.CallStack r7) {
            r3 = this;
            java.lang.String r5 = bsh.StringUtil.typeString(r5)
            bsh.EvalException r0 = new bsh.EvalException
            java.lang.String r1 = "Incompatible type: "
            java.lang.String r2 = " in initializer of array type: "
            java.lang.StringBuilder r5 = bc.e.o(r1, r5, r2)
            java.lang.String r4 = r4.getSimpleName()
            r5.append(r4)
            java.lang.String r4 = " at position: "
            r5.append(r4)
            r5.append(r6)
            java.lang.String r4 = r5.toString()
            r0.<init>(r4, r3, r7)
            throw r0
    }

    private java.lang.Object toCollection(java.lang.Object r4, java.lang.Class<?> r5, bsh.CallStack r6) {
            r3 = this;
            java.lang.Class r0 = r4.getClass()
            java.lang.Class r1 = bsh.Types.arrayElementType(r0)
            boolean r2 = bsh.Types.isCollectionType(r5)
            if (r2 == 0) goto L2e
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L24
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L2e
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L2e
        L24:
            r0 = 0
            java.lang.Object r4 = bsh.Types.castObject(r4, r5, r0)     // Catch: bsh.UtilEvalError -> L2a
            return r4
        L2a:
            r5 = move-exception
            r5.toEvalError(r3, r6)
        L2e:
            return r4
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r2, bsh.Interpreter r3) {
            r1 = this;
            bsh.EvalError r3 = new bsh.EvalError
            java.lang.String r0 = "Array initializer has no base type."
            r3.<init>(r0, r1, r2)
            throw r3
    }

    public java.lang.Object eval(java.lang.Class<?> r10, int r11, bsh.CallStack r12, bsh.Interpreter r13) {
            r9 = this;
            int r0 = r9.jjtGetNumChildren()
            r1 = 0
            if (r0 != 0) goto L8
            r11 = r1
        L8:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r11 != 0) goto L21
            if (r10 == r2) goto L18
            boolean r11 = bsh.Types.isCollectionType(r10)
            if (r11 == 0) goto L17
            goto L18
        L17:
            r0 = r10
        L18:
            java.lang.Object r11 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object r10 = r9.toCollection(r11, r10, r12)
            return r10
        L21:
            r1 = -1
            if (r1 != r11) goto L53
            boolean r11 = r13.getStrictJava()
            if (r11 != 0) goto L49
            boolean r11 = r9.isBeanType(r10)
            if (r11 == 0) goto L35
            java.lang.Object r10 = r9.buildBean(r10, r12, r13)
            return r10
        L35:
            r4 = 1
            r5 = 0
            r6 = r9
            r3 = r9
            r7 = r12
            r8 = r13
            int r11 = r3.inferDimensions(r4, r5, r6, r7, r8)
            boolean r12 = bsh.Types.isCollectionType(r10)
            if (r12 == 0) goto L47
            r12 = r2
            goto L57
        L47:
            r12 = r10
            goto L57
        L49:
            r3 = r9
            r7 = r12
            bsh.EvalException r10 = new bsh.EvalException
            java.lang.String r11 = "No declared array type or dimensions."
            r10.<init>(r11, r9, r7)
            throw r10
        L53:
            r3 = r9
            r7 = r12
            r8 = r13
            goto L47
        L57:
            if (r12 != r2) goto L5e
            r12 = 0
            java.lang.Class r12 = r9.inferCommonType(r12, r9, r7, r8)
        L5e:
            r13 = 2
            if (r11 >= r13) goto L6b
            java.lang.Class<bsh.Types$MapEntry> r13 = bsh.Types.MapEntry.class
            if (r13 != r12) goto L67
            if (r2 == r10) goto L69
        L67:
            if (r13 != r10) goto L6b
        L69:
            java.lang.Class<java.util.Map> r10 = java.util.Map.class
        L6b:
            if (r12 != 0) goto L70
            int r11 = r11 + 1
            goto L71
        L70:
            r0 = r12
        L71:
            java.lang.Object r11 = r9.buildArray(r11, r0, r7, r8)
            r9.clearEvalCache()
            java.lang.Object r10 = r9.toCollection(r11, r10, r7)
            return r10
    }

    @Override // bsh.SimpleNode, bsh.Node
    public void jjtSetParent(bsh.Node r6) {
            r5 = this;
            r5.parent = r6
            bsh.Node[] r6 = r5.children
            if (r6 == 0) goto L34
            int r0 = r6.length
            r1 = 0
            r2 = r1
        L9:
            if (r2 >= r0) goto L34
            r3 = r6[r2]
            int r4 = r3.jjtGetNumChildren()
            if (r4 <= 0) goto L31
            bsh.Node r4 = r3.jjtGetChild(r1)
            boolean r4 = r4 instanceof bsh.BSHPrimaryExpression
            if (r4 == 0) goto L31
            java.util.Deque<bsh.BSHPrimaryExpression> r4 = r5.expressionQueue
            bsh.Node r3 = r3.jjtGetChild(r1)
            bsh.BSHPrimaryExpression r3 = (bsh.BSHPrimaryExpression) r3
            r4.push(r3)
            java.util.Deque<bsh.BSHPrimaryExpression> r3 = r5.expressionQueue
            java.lang.Object r3 = r3.peek()
            bsh.BSHPrimaryExpression r3 = (bsh.BSHPrimaryExpression) r3
            r3.setArrayExpression(r5)
        L31:
            int r2 = r2 + 1
            goto L9
        L34:
            return
    }

    public void setMapInArray(boolean r1) {
            r0 = this;
            r0.isMapInArray = r1
            return
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
            boolean r1 = r2.isMapInArray
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
