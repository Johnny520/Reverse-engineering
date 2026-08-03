package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHAllocationExpression extends bsh.SimpleNode {
    private static int innerClassCount = 0;
    private static final long serialVersionUID = 1;

    public BSHAllocationExpression(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private java.lang.Object arrayAllocation(bsh.BSHArrayDimensions r3, java.lang.Class<?> r4, bsh.CallStack r5, bsh.Interpreter r6) {
            r2 = this;
            java.lang.Object r0 = r3.eval(r4, r5, r6)
            bsh.Primitive r1 = bsh.Primitive.VOID
            if (r0 == r1) goto L9
            return r0
        L9:
            java.lang.Object r3 = r2.arrayNewInstance(r4, r3, r5, r6)
            return r3
    }

    private java.lang.Object arrayNewInstance(java.lang.Class<?> r3, bsh.BSHArrayDimensions r4, bsh.CallStack r5, bsh.Interpreter r6) {
            r2 = this;
            int r6 = r4.numUndefinedDims
            if (r6 <= 0) goto Le
            int[] r6 = new int[r6]
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r6)
            java.lang.Class r3 = r3.getClass()
        Le:
            int[] r4 = r4.definedDimensions     // Catch: java.lang.Exception -> L15 java.lang.NegativeArraySizeException -> L17
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r4)     // Catch: java.lang.Exception -> L15 java.lang.NegativeArraySizeException -> L17
            return r3
        L15:
            r3 = move-exception
            goto L19
        L17:
            r3 = move-exception
            goto L31
        L19:
            bsh.EvalException r4 = new bsh.EvalException
            java.lang.String r6 = r3.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can't construct primitive array: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r4.<init>(r6, r2, r5, r3)
            throw r4
        L31:
            bsh.TargetError r4 = new bsh.TargetError
            r4.<init>(r3, r2, r5)
            throw r4
    }

    private java.lang.Object constructObject(java.lang.Class<?> r11, java.lang.Object[] r12, bsh.CallStack r13, bsh.Interpreter r14) {
            r10 = this;
            java.lang.String r1 = "Constructor error: "
            java.lang.String r2 = "The constructor threw an exception:\n\t"
            boolean r3 = bsh.Reflect.isGeneratedClass(r11)
            if (r3 == 0) goto Ld
            bsh.This.registerConstructorContext(r13, r14)
        Ld:
            r14 = 0
            java.lang.Object r12 = bsh.Reflect.constructObject(r11, r12)     // Catch: java.lang.Throwable -> L71 java.util.concurrent.CompletionException -> L75 java.lang.reflect.InvocationTargetException -> L78 bsh.ReflectError -> La6
            if (r3 == 0) goto L17
            bsh.This.registerConstructorContext(r14, r14)
        L17:
            java.lang.String r11 = r11.getName()
            java.lang.String r0 = "$"
            int r11 = r11.indexOf(r0)
            r0 = -1
            if (r11 != r0) goto L25
            goto L70
        L25:
            bsh.NameSpace r11 = r13.top()
            bsh.This r11 = r11.getThis(r14)
            bsh.NameSpace r11 = r11.getNameSpace()
            bsh.NameSpace r13 = bsh.Name.getClassNameSpace(r11)
            java.lang.String r14 = "static"
            if (r13 == 0) goto L4f
            java.lang.Class r13 = r12.getClass()
            bsh.Modifiers r13 = bsh.Reflect.getClassModifiers(r13)
            boolean r13 = r13.hasModifier(r14)
            if (r13 != 0) goto L4f
            bsh.NameSpace r13 = bsh.Reflect.getThisNS(r12)
            r13.setParent(r11)
            return r12
        L4f:
            java.lang.Class r11 = r12.getClass()
            bsh.Modifiers r11 = bsh.Reflect.getClassModifiers(r11)
            boolean r11 = r11.hasModifier(r14)
            if (r11 == 0) goto L70
            bsh.NameSpace r11 = bsh.Reflect.getThisNS(r12)
            java.lang.Class r13 = r12.getClass()
            bsh.NameSpace r13 = bsh.Reflect.getThisNS(r13)
            bsh.NameSpace r13 = r13.getParent()
            r11.setParent(r13)
        L70:
            return r12
        L71:
            r0 = move-exception
            r11 = r0
            r7 = r10
            goto Lc0
        L75:
            r0 = move-exception
        L76:
            r11 = r0
            goto L7a
        L78:
            r0 = move-exception
            goto L76
        L7a:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La3
            r12.<init>(r2)     // Catch: java.lang.Throwable -> La3
            java.lang.Throwable r0 = r11.getCause()     // Catch: java.lang.Throwable -> La3
            r12.append(r0)     // Catch: java.lang.Throwable -> La3
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> La3
            java.lang.Object[] r12 = new java.lang.Object[]{r12}     // Catch: java.lang.Throwable -> La3
            bsh.Interpreter.debug(r12)     // Catch: java.lang.Throwable -> La3
            bsh.TargetError r4 = new bsh.TargetError     // Catch: java.lang.Throwable -> La3
            java.lang.String r5 = "Object constructor"
            java.lang.Throwable r6 = r11.getCause()     // Catch: java.lang.Throwable -> La3
            r9 = 1
            r7 = r10
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> La0
            throw r4     // Catch: java.lang.Throwable -> La0
        La0:
            r0 = move-exception
        La1:
            r11 = r0
            goto Lc0
        La3:
            r0 = move-exception
            r7 = r10
            goto La1
        La6:
            r0 = move-exception
            r7 = r10
            r8 = r13
            r11 = r0
            bsh.EvalException r12 = new bsh.EvalException     // Catch: java.lang.Throwable -> La0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0
            r13.<init>(r1)     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = r11.getMessage()     // Catch: java.lang.Throwable -> La0
            r13.append(r0)     // Catch: java.lang.Throwable -> La0
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> La0
            r12.<init>(r13, r10, r8, r11)     // Catch: java.lang.Throwable -> La0
            throw r12     // Catch: java.lang.Throwable -> La0
        Lc0:
            if (r3 == 0) goto Lc5
            bsh.This.registerConstructorContext(r14, r14)
        Lc5:
            throw r11
    }

    private java.lang.Object constructWithClassBody(java.lang.Class<?> r13, java.lang.Object[] r14, bsh.BSHBlock r15, bsh.CallStack r16, bsh.Interpreter r17) {
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "anon"
            r0.<init>(r1)
            int r1 = bsh.BSHAllocationExpression.innerClassCount
            int r1 = r1 + 1
            bsh.BSHAllocationExpression.innerClassCount = r1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            bsh.NameSpace r2 = r16.top()
            java.lang.String r2 = r2.getName()
            r3 = 47
            r4 = 95
            java.lang.String r2 = r2.replace(r3, r4)
            r1.append(r2)
            java.lang.String r2 = "$"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.Object[]>> r1 = bsh.This.CONTEXT_ARGS
            java.lang.Object r1 = r1.get()
            java.util.Map r1 = (java.util.Map) r1
            r1.put(r0, r14)
            bsh.Modifiers r5 = new bsh.Modifiers
            r0 = 0
            r5.<init>(r0)
            bsh.ClassGenerator r3 = bsh.ClassGenerator.getClassGenerator()
            r6 = 0
            bsh.ClassGenerator$Type r9 = bsh.ClassGenerator.Type.CLASS
            r7 = r13
            r8 = r15
            r10 = r16
            r11 = r17
            java.lang.Class r13 = r3.generateClass(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r13 = bsh.Reflect.constructObject(r13, r14)     // Catch: java.lang.Exception -> L5f
            return r13
        L5f:
            r0 = move-exception
            r13 = r0
            boolean r14 = r13 instanceof java.lang.reflect.InvocationTargetException
            if (r14 == 0) goto L6a
            java.lang.Throwable r14 = r13.getCause()
            goto L6b
        L6a:
            r14 = r13
        L6b:
            bsh.EvalException r0 = new bsh.EvalException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Error constructing inner class instance: "
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r10 = r16
            r0.<init>(r13, r12, r10, r14)
            throw r0
    }

    private java.lang.Object constructWithInterfaceBody(java.lang.Class<?> r3, java.lang.Object[] r4, bsh.BSHBlock r5, bsh.CallStack r6, bsh.Interpreter r7) {
            r2 = this;
            bsh.NameSpace r4 = r6.top()
            bsh.NameSpace r0 = new bsh.NameSpace
            java.lang.String r1 = "AnonymousBlock"
            r0.<init>(r4, r1)
            r6.push(r0)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L22
            r5.eval(r6, r7, r4)     // Catch: java.lang.Throwable -> L22
            r6.pop()
            r0.importStatic(r3)
            bsh.This r4 = r0.getThis(r7)
            java.lang.Object r3 = r4.getInterface(r3)
            return r3
        L22:
            r3 = move-exception
            r6.pop()
            throw r3
    }

    private java.lang.Object objectAllocation(bsh.BSHAmbiguousName r8, bsh.BSHArguments r9, bsh.CallStack r10, bsh.Interpreter r11) {
            r7 = this;
            java.lang.Object[] r3 = r9.getArguments(r10, r11)
            if (r3 == 0) goto L6b
            r9 = 1
            java.lang.Object r0 = r8.toObject(r10, r11, r9)
            boolean r1 = r0 instanceof bsh.ClassIdentifier
            if (r1 == 0) goto L53
            bsh.ClassIdentifier r0 = (bsh.ClassIdentifier) r0
            java.lang.Class r2 = r0.getTargetClass()
            int r8 = r7.jjtGetNumChildren()
            r0 = 2
            if (r8 <= r0) goto L1d
            goto L1e
        L1d:
            r9 = 0
        L1e:
            bsh.security.MainSecurityGuard r8 = bsh.Interpreter.mainSecurityGuard     // Catch: bsh.security.SecurityError -> L4a
            r8.canConstruct(r2, r3)     // Catch: bsh.security.SecurityError -> L4a
            if (r9 == 0) goto L42
            bsh.Node r8 = r7.jjtGetChild(r0)
            r4 = r8
            bsh.BSHBlock r4 = (bsh.BSHBlock) r4
            boolean r8 = r2.isInterface()
            if (r8 == 0) goto L3a
            r1 = r7
            r5 = r10
            r6 = r11
            java.lang.Object r8 = r1.constructWithInterfaceBody(r2, r3, r4, r5, r6)
            return r8
        L3a:
            r1 = r7
            r5 = r10
            r6 = r11
            java.lang.Object r8 = r1.constructWithClassBody(r2, r3, r4, r5, r6)
            return r8
        L42:
            r1 = r7
            r5 = r10
            r6 = r11
            java.lang.Object r8 = r7.constructObject(r2, r3, r5, r6)
            return r8
        L4a:
            r0 = move-exception
            r1 = r7
            r5 = r10
            r8 = r0
            bsh.EvalError r8 = r8.toEvalError(r7, r5)
            throw r8
        L53:
            r1 = r7
            r5 = r10
            bsh.EvalException r9 = new bsh.EvalException
            java.lang.String r8 = r8.text
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Unknown class: "
            r10.<init>(r11)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8, r7, r5)
            throw r9
        L6b:
            r1 = r7
            r5 = r10
            bsh.EvalError r8 = new bsh.EvalError
            java.lang.String r9 = "Null args in new."
            r8.<init>(r9, r7, r5)
            throw r8
    }

    private java.lang.Object objectArrayAllocation(bsh.BSHAmbiguousName r1, bsh.BSHArrayDimensions r2, bsh.CallStack r3, bsh.Interpreter r4) {
            r0 = this;
            java.lang.Class r1 = r1.toClass(r3, r4)
            java.lang.Object r1 = r0.arrayAllocation(r2, r1, r3, r4)
            return r1
    }

    private java.lang.Object primitiveArrayAllocation(bsh.BSHPrimitiveType r1, bsh.BSHArrayDimensions r2, bsh.CallStack r3, bsh.Interpreter r4) {
            r0 = this;
            java.lang.Class r1 = r1.getType()
            java.lang.Object r1 = r0.arrayAllocation(r2, r1, r3, r4)
            return r1
    }

    public java.lang.Object constructFromEnclosingInstance(java.lang.Object r8, bsh.CallStack r9, bsh.Interpreter r10) {
            r7 = this;
            r0 = 0
            bsh.Node r1 = r7.jjtGetChild(r0)
            boolean r1 = r1 instanceof bsh.BSHAmbiguousName
            if (r1 == 0) goto L12
            bsh.Node r1 = r7.jjtGetChild(r0)
            bsh.BSHAmbiguousName r1 = (bsh.BSHAmbiguousName) r1
            java.lang.String r1 = r1.text
            goto L14
        L12:
            java.lang.String r1 = ""
        L14:
            r2 = 1
            bsh.Node r3 = r7.jjtGetChild(r2)
            boolean r3 = r3 instanceof bsh.BSHArguments
            r4 = 0
            if (r3 == 0) goto L29
            bsh.Node r2 = r7.jjtGetChild(r2)
            bsh.BSHArguments r2 = (bsh.BSHArguments) r2
            java.lang.Object[] r10 = r2.getArguments(r9, r10)
            goto L2a
        L29:
            r10 = r4
        L2a:
            java.lang.Class r2 = r8.getClass()
            java.lang.Class[] r2 = r2.getDeclaredClasses()
            int r3 = r2.length
        L33:
            if (r0 >= r3) goto L4a
            r5 = r2[r0]
            java.lang.String r6 = r5.getName()
            java.lang.String r6 = bsh.Types.getBaseName(r6)
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L47
            r4 = r5
            goto L4a
        L47:
            int r0 = r0 + 1
            goto L33
        L4a:
            java.lang.Object r8 = bsh.Reflect.constructObject(r4, r8, r10)     // Catch: java.lang.reflect.InvocationTargetException -> L4f
            return r8
        L4f:
            r0 = move-exception
            r8 = r0
            bsh.TargetError r0 = new bsh.TargetError
            java.lang.Throwable r2 = r8.getCause()
            r5 = 1
            java.lang.String r1 = "Object constructor"
            r3 = r7
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            throw r0
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r4, bsh.Interpreter r5) {
            r3 = this;
            int r0 = r3.jjtGetNumChildren()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L1d
            bsh.Node r0 = r3.jjtGetChild(r1)
            boolean r0 = r0 instanceof bsh.BSHArrayDimensions
            if (r0 == 0) goto L1d
            bsh.Node r0 = r3.jjtGetChild(r1)
            bsh.BSHArrayDimensions r0 = (bsh.BSHArrayDimensions) r0
            java.lang.Class r1 = java.lang.Void.TYPE
            java.lang.Object r4 = r3.arrayAllocation(r0, r1, r4, r5)
            return r4
        L1d:
            bsh.Node r0 = r3.jjtGetChild(r1)
            bsh.Node r1 = r3.jjtGetChild(r2)
            boolean r2 = r0 instanceof bsh.BSHAmbiguousName
            if (r2 == 0) goto L3d
            bsh.BSHAmbiguousName r0 = (bsh.BSHAmbiguousName) r0
            boolean r2 = r1 instanceof bsh.BSHArguments
            if (r2 == 0) goto L36
            bsh.BSHArguments r1 = (bsh.BSHArguments) r1
            java.lang.Object r4 = r3.objectAllocation(r0, r1, r4, r5)
            return r4
        L36:
            bsh.BSHArrayDimensions r1 = (bsh.BSHArrayDimensions) r1
            java.lang.Object r4 = r3.objectArrayAllocation(r0, r1, r4, r5)
            return r4
        L3d:
            bsh.BSHPrimitiveType r0 = (bsh.BSHPrimitiveType) r0
            bsh.BSHArrayDimensions r1 = (bsh.BSHArrayDimensions) r1
            java.lang.Object r4 = r3.primitiveArrayAllocation(r0, r1, r4, r5)
            return r4
    }
}
