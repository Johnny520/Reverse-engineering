package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class BshMethod implements java.io.Serializable, java.lang.Cloneable, bsh.BshClassManager.Listener {
    private static final long serialVersionUID = 1;
    private java.lang.Class<?>[] cparamTypes;
    private java.lang.Class<?> creturnType;
    bsh.NameSpace declaringNameSpace;
    protected boolean isExtension;
    protected boolean isScriptedObject;
    protected boolean isVarArgs;
    private bsh.Invocable javaMethod;
    private java.lang.Object javaObject;
    protected bsh.BSHBlock methodBody;
    private transient bsh.BshMethod.MethodCallback methodCallback;
    bsh.Modifiers modifiers;
    private java.lang.String name;
    private int paramCount;
    private bsh.Modifiers[] paramModifiers;
    private java.lang.String[] paramNames;
    protected java.lang.Class<?> receiverType;
    private boolean reload;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    @java.lang.FunctionalInterface
    public interface MethodCallback {
        java.lang.Object invoke(java.lang.Object[] r1);
    }

    public BshMethod(bsh.BSHMethodDeclaration r11, bsh.NameSpace r12, bsh.Modifiers r13, boolean r14) {
            r10 = this;
            java.lang.String r1 = r11.name
            java.lang.Class<?> r2 = r11.returnType
            bsh.BSHFormalParameters r0 = r11.paramsNode
            java.lang.String[] r3 = r0.getParamNames()
            bsh.BSHFormalParameters r0 = r11.paramsNode
            java.lang.Class<?>[] r4 = r0.paramTypes
            bsh.Modifiers[] r5 = r0.getParamModifiers()
            bsh.BSHBlock r6 = r11.blockNode
            boolean r9 = r11.isVarArgs
            r0 = r10
            r7 = r12
            r8 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0.isScriptedObject = r14
            boolean r12 = r11.isExtension
            r0.isExtension = r12
            java.lang.Class<?> r11 = r11.receiverType
            r0.receiverType = r11
            return
    }

    public BshMethod(bsh.Invocable r11, java.lang.Object r12) {
            r10 = this;
            java.lang.String r1 = r11.getName()
            java.lang.Class r2 = r11.getReturnType()
            java.lang.Class[] r4 = r11.getParameterTypes()
            r8 = 0
            boolean r9 = r11.isVarArgs()
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0.javaMethod = r11
            r0.javaObject = r12
            return
    }

    public BshMethod(java.lang.String r3, java.lang.Class<?> r4, java.lang.String[] r5, java.lang.Class<?>[] r6, bsh.Modifiers[] r7, bsh.BSHBlock r8, bsh.NameSpace r9, bsh.Modifiers r10, boolean r11) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.isScriptedObject = r0
            r2.isExtension = r0
            r1 = 0
            r2.receiverType = r1
            r2.reload = r0
            r2.name = r3
            r2.creturnType = r4
            r2.paramNames = r5
            r2.paramModifiers = r7
            if (r5 == 0) goto L1b
            int r3 = r5.length
            r2.paramCount = r3
            goto L20
        L1b:
            if (r6 == 0) goto L20
            int r3 = r6.length
            r2.paramCount = r3
        L20:
            r2.cparamTypes = r6
            r2.methodBody = r8
            r2.declaringNameSpace = r9
            r2.modifiers = r10
            r2.isVarArgs = r11
            return
    }

    public BshMethod(java.lang.String r11, java.lang.Class<?>[] r12, bsh.BshMethod.MethodCallback r13) {
            r10 = this;
            r8 = 0
            r9 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r10
            r1 = r11
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0.methodCallback = r13
            return
    }

    public BshMethod(java.lang.reflect.Method r1, java.lang.Object r2) {
            r0 = this;
            bsh.Invocable r1 = bsh.Invocable.get(r1)
            r0.<init>(r1, r2)
            return
    }

    public static /* synthetic */ java.lang.String[] a(int r0) {
            java.lang.String[] r0 = lambda$getParameterNames$1(r0)
            return r0
    }

    public static /* synthetic */ java.lang.String b(java.lang.Integer r0) {
            java.lang.String r0 = lambda$getParameterNames$0(r0)
            return r0
    }

    public static boolean equal(java.lang.Object r0, java.lang.Object r1) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
        L8:
            boolean r0 = r0.equals(r1)
            return r0
    }

    private java.lang.Object invokeImpl(java.lang.Object[] r8, bsh.Interpreter r9, bsh.CallStack r10, bsh.Node r11, boolean r12) {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            java.lang.Object r8 = r0.invokeImpl(r1, r2, r3, r4, r5, r6)
            return r8
    }

    private java.lang.Object invokeImpl(java.lang.Object[] r17, bsh.Interpreter r18, bsh.CallStack r19, bsh.Node r20, boolean r21, java.lang.Object r22) {
            r16 = this;
            r1 = r16
            r0 = r19
            r2 = r20
            r3 = r22
            java.lang.String r4 = ""
            java.lang.String r5 = "abstract"
            boolean r5 = r1.hasModifier(r5)
            if (r5 != 0) goto L248
            bsh.BSHBlock r5 = r1.methodBody
            if (r5 != 0) goto L35
            java.lang.String r3 = "native"
            boolean r3 = r1.hasModifier(r3)
            java.lang.String r4 = r1.name
            if (r3 == 0) goto L29
            java.lang.String r3 = "Cannot invoke top-level native method "
            java.lang.String r5 = ". Declare the JNI method in a class and load the SO with that class loader."
            java.lang.String r3 = eh.a.n(r3, r4, r5)
            goto L2f
        L29:
            java.lang.String r3 = "Cannot invoke method without a body: "
            java.lang.String r3 = wb.en.g(r3, r4)
        L2f:
            bsh.EvalError r4 = new bsh.EvalError
            r4.<init>(r3, r2, r0)
            throw r4
        L35:
            java.lang.Class r5 = r1.getReturnType()
            java.lang.Class[] r6 = r1.getParameterTypes()
            if (r0 != 0) goto L46
            bsh.CallStack r0 = new bsh.CallStack
            bsh.NameSpace r7 = r1.declaringNameSpace
            r0.<init>(r7)
        L46:
            r7 = r0
            if (r17 != 0) goto L4c
            java.lang.Object[] r0 = bsh.Reflect.ZERO_ARGS
            goto L4e
        L4c:
            r0 = r17
        L4e:
            boolean r8 = r1.isVarArgs()
            if (r8 != 0) goto L72
            int r8 = r0.length
            int r9 = r1.getParameterCount()
            if (r8 != r9) goto L5c
            goto L72
        L5c:
            bsh.EvalError r0 = new bsh.EvalError
            java.lang.String r3 = r1.name
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Wrong number of arguments for local method: "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.<init>(r3, r2, r7)
            throw r0
        L72:
            r8 = 1
            if (r21 == 0) goto L7a
            bsh.NameSpace r9 = r7.top()
            goto L85
        L7a:
            bsh.NameSpace r9 = new bsh.NameSpace
            bsh.NameSpace r10 = r1.declaringNameSpace
            java.lang.String r11 = r1.name
            r9.<init>(r10, r11)
            r9.isMethod = r8
        L85:
            boolean r10 = r1.isExtension
            r11 = 0
            if (r10 == 0) goto La4
            if (r3 == 0) goto La4
            java.lang.Object r10 = bsh.Primitive.unwrap(r3)
            r9.importObject(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: bsh.UtilEvalError -> La4
            r10.<init>(r4)     // Catch: bsh.UtilEvalError -> La4
            bsh.This$Keys r4 = bsh.This.Keys.BSHEXTENSIONMETHODRECEIVER     // Catch: bsh.UtilEvalError -> La4
            r10.append(r4)     // Catch: bsh.UtilEvalError -> La4
            java.lang.String r4 = r10.toString()     // Catch: bsh.UtilEvalError -> La4
            r9.setLocalVariable(r4, r3, r11)     // Catch: bsh.UtilEvalError -> La4
        La4:
            r9.setNode(r2)
            int r3 = r1.getParameterCount()
            int r3 = r3 - r8
            boolean r4 = r1.isVarArgs()
            if (r4 == 0) goto Ldd
            r4 = r6[r3]
            int r12 = r1.getParameterCount()
            int r13 = r0.length
            if (r12 != r13) goto Ldf
            r12 = r0[r3]
            if (r12 == 0) goto Ldd
            java.lang.Class r12 = r12.getClass()
            boolean r12 = r12.isArray()
            if (r12 == 0) goto Ldf
            java.lang.Class r4 = r4.getComponentType()
            r12 = r0[r3]
            java.lang.Class r12 = r12.getClass()
            java.lang.Class r12 = r12.getComponentType()
            boolean r4 = r4.isAssignableFrom(r12)
            if (r4 == 0) goto Ldf
        Ldd:
            r4 = 0
            goto Lf3
        Ldf:
            int r4 = r0.length
            int r12 = r1.getParameterCount()
            int r12 = r12 - r8
            if (r4 < r12) goto Ldd
            r4 = r6[r3]
            java.lang.Class r4 = r4.getComponentType()
            int r12 = r0.length
            int r12 = r12 - r3
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r12)
        Lf3:
            int r12 = r0.length
            java.lang.String r13 = "Typed method parameter assignment"
            if (r11 >= r12) goto L1a2
            if (r11 < r3) goto Lfc
            r12 = r3
            goto Lfd
        Lfc:
            r12 = r11
        Lfd:
            if (r4 == 0) goto L108
            if (r12 != r3) goto L108
            r14 = r6[r12]
            java.lang.Class r14 = r14.getComponentType()
            goto L10a
        L108:
            r14 = r6[r12]
        L10a:
            if (r14 == 0) goto L164
            r15 = r0[r11]     // Catch: bsh.UtilEvalError -> L135
            java.lang.Object r15 = bsh.Types.castObject(r15, r14, r8)     // Catch: bsh.UtilEvalError -> L135
            r0[r11] = r15     // Catch: bsh.UtilEvalError -> L135
            if (r4 == 0) goto L124
            if (r11 < r3) goto L124
            int r12 = r11 - r12
            java.lang.Object r14 = bsh.Primitive.unwrap(r15)     // Catch: bsh.UtilEvalError -> L122
            java.lang.reflect.Array.set(r4, r12, r14)     // Catch: bsh.UtilEvalError -> L122
            goto L175
        L122:
            r0 = move-exception
            goto L130
        L124:
            java.lang.String[] r10 = r1.paramNames     // Catch: bsh.UtilEvalError -> L122
            r10 = r10[r12]     // Catch: bsh.UtilEvalError -> L122
            bsh.Modifiers[] r8 = r1.paramModifiers     // Catch: bsh.UtilEvalError -> L122
            r8 = r8[r12]     // Catch: bsh.UtilEvalError -> L122
            r9.setTypedVariable(r10, r14, r15, r8)     // Catch: bsh.UtilEvalError -> L122
            goto L175
        L130:
            bsh.EvalError r0 = r0.toEvalError(r13, r2, r7)
            throw r0
        L135:
            r0 = move-exception
            bsh.EvalError r3 = new bsh.EvalError
            java.lang.String[] r4 = r1.paramNames
            r4 = r4[r12]
            java.lang.String r5 = r1.name
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "Invalid argument: `"
            r6.<init>(r8)
            r6.append(r4)
            java.lang.String r4 = "' for method: "
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = " : "
            r6.append(r4)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r3.<init>(r0, r2, r7)
            throw r3
        L164:
            r8 = r0[r11]
            bsh.Primitive r10 = bsh.Primitive.VOID
            if (r8 == r10) goto L180
            java.lang.String[] r10 = r1.paramNames     // Catch: bsh.UtilEvalError -> L17a
            r10 = r10[r12]     // Catch: bsh.UtilEvalError -> L17a
            boolean r12 = r18.getStrictJava()     // Catch: bsh.UtilEvalError -> L17a
            r9.setLocalVariable(r10, r8, r12)     // Catch: bsh.UtilEvalError -> L17a
        L175:
            int r11 = r11 + 1
            r8 = 1
            goto Lf3
        L17a:
            r0 = move-exception
            bsh.EvalError r0 = r0.toEvalError(r13, r2, r7)
            throw r0
        L180:
            bsh.EvalError r0 = new bsh.EvalError
            java.lang.String[] r3 = r1.paramNames
            r3 = r3[r12]
            java.lang.String r4 = r1.name
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Undefined variable or class name, parameter: "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = " to method: "
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            r0.<init>(r3, r2, r7)
            throw r0
        L1a2:
            if (r4 == 0) goto L1b8
            java.lang.String[] r0 = r1.paramNames     // Catch: bsh.UtilEvalError -> L1b2
            r0 = r0[r3]     // Catch: bsh.UtilEvalError -> L1b2
            r6 = r6[r3]     // Catch: bsh.UtilEvalError -> L1b2
            bsh.Modifiers[] r8 = r1.paramModifiers     // Catch: bsh.UtilEvalError -> L1b2
            r3 = r8[r3]     // Catch: bsh.UtilEvalError -> L1b2
            r9.setTypedVariable(r0, r6, r4, r3)     // Catch: bsh.UtilEvalError -> L1b2
            goto L1b8
        L1b2:
            r0 = move-exception
            bsh.EvalError r0 = r0.toEvalError(r13, r2, r7)
            throw r0
        L1b8:
            if (r21 != 0) goto L1bd
            r7.push(r9)
        L1bd:
            bsh.BSHBlock r0 = r1.methodBody     // Catch: java.lang.Throwable -> L241
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L241
            r4 = r18
            java.lang.Object r0 = r0.eval(r7, r4, r3)     // Catch: java.lang.Throwable -> L241
            bsh.CallStack r3 = r7.copy()     // Catch: java.lang.Throwable -> L241
            if (r21 != 0) goto L1d0
            r7.pop()
        L1d0:
            boolean r4 = r0 instanceof bsh.ReturnControl
            java.lang.Class r6 = java.lang.Void.TYPE
            if (r4 == 0) goto L1f3
            r10 = r0
            bsh.ReturnControl r10 = (bsh.ReturnControl) r10
            int r0 = r10.kind
            r4 = 47
            if (r0 != r4) goto L1e9
            java.lang.Object r0 = r10.value
            if (r5 != r6) goto L1f4
            bsh.Primitive r3 = bsh.Primitive.VOID
            if (r0 == r3) goto L1f4
            r0 = r3
            goto L1f4
        L1e9:
            bsh.EvalException r0 = new bsh.EvalException
            java.lang.String r2 = "'continue' or 'break' in method body"
            bsh.Node r4 = r10.returnPoint
            r0.<init>(r2, r4, r3)
            throw r0
        L1f3:
            r10 = 0
        L1f4:
            if (r5 == 0) goto L222
            if (r5 != r6) goto L1fb
            bsh.Primitive r0 = bsh.Primitive.VOID
            return r0
        L1fb:
            r3 = 1
            java.lang.Object r0 = bsh.Types.castObject(r0, r5, r3)     // Catch: bsh.UtilEvalError -> L201
            goto L222
        L201:
            r0 = move-exception
            if (r10 == 0) goto L206
            bsh.Node r2 = r10.returnPoint
        L206:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Incorrect type returned from method: "
            r3.<init>(r4)
            java.lang.String r4 = r1.name
            r3.append(r4)
            java.lang.String r4 = r0.getMessage()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            bsh.EvalError r0 = r0.toEvalError(r3, r2, r7)
            throw r0
        L222:
            java.lang.String r3 = "clone"
            java.lang.String r4 = r1.getName()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L240
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            bsh.This r3 = bsh.Reflect.getClassInstanceThis(r0, r3)
            if (r3 == 0) goto L240
            java.lang.Object r0 = r3.cloneMethodImpl(r2, r7, r0)
        L240:
            return r0
        L241:
            r0 = move-exception
            if (r21 != 0) goto L247
            r7.pop()
        L247:
            throw r0
        L248:
            bsh.EvalError r3 = new bsh.EvalError
            java.lang.String r4 = r1.name
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Cannot invoke abstract method "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4, r2, r0)
            throw r3
    }

    private java.lang.Object invokeMethodCallback(java.lang.Object[] r7, bsh.Node r8, bsh.CallStack r9) {
            r6 = this;
            if (r7 != 0) goto L4
            java.lang.Object[] r7 = bsh.Reflect.ZERO_ARGS
        L4:
            java.lang.Class[] r0 = r6.getParameterTypes()
            if (r0 == 0) goto L5f
            int r1 = r0.length
            if (r1 != 0) goto Le
            goto L5f
        Le:
            java.lang.String[] r1 = r6.getParameterNames()
            r2 = 0
        L13:
            int r3 = r7.length
            if (r2 >= r3) goto L58
            r3 = r0[r2]
            if (r3 != 0) goto L1b
            goto L28
        L1b:
            r4 = r7[r2]     // Catch: bsh.UtilEvalError -> L2b
            r5 = 1
            java.lang.Object r3 = bsh.Types.castObject(r4, r3, r5)     // Catch: bsh.UtilEvalError -> L2b
            java.lang.Object r3 = bsh.Primitive.unwrap(r3)     // Catch: bsh.UtilEvalError -> L2b
            r7[r2] = r3     // Catch: bsh.UtilEvalError -> L2b
        L28:
            int r2 = r2 + 1
            goto L13
        L2b:
            r7 = move-exception
            bsh.EvalError r0 = new bsh.EvalError
            r1 = r1[r2]
            java.lang.String r2 = r6.name
            java.lang.String r7 = r7.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Invalid argument: `"
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = "' for method: "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = " : "
            r3.append(r1)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r0.<init>(r7, r8, r9)
            throw r0
        L58:
            bsh.BshMethod$MethodCallback r8 = r6.methodCallback
            java.lang.Object r7 = r8.invoke(r7)
            return r7
        L5f:
            bsh.BshMethod$MethodCallback r8 = r6.methodCallback
            java.lang.Object r7 = r8.invoke(r7)
            return r7
    }

    private static /* synthetic */ java.lang.String lambda$getParameterNames$0(java.lang.Integer r0) {
            int r0 = r0.intValue()
            char r0 = (char) r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }

    private static /* synthetic */ java.lang.String[] lambda$getParameterNames$1(int r0) {
            java.lang.String[] r0 = new java.lang.String[r0]
            return r0
    }

    private void reloadTypes() {
            r4 = this;
            boolean r0 = r4.reload
            if (r0 == 0) goto L3d
            r0 = 0
            r4.reload = r0     // Catch: bsh.UtilEvalError -> L3d
            java.lang.Class<?> r1 = r4.creturnType     // Catch: bsh.UtilEvalError -> L3d
            boolean r1 = bsh.Reflect.isGeneratedClass(r1)     // Catch: bsh.UtilEvalError -> L3d
            if (r1 == 0) goto L1d
            bsh.NameSpace r1 = r4.declaringNameSpace     // Catch: bsh.UtilEvalError -> L3d
            java.lang.Class<?> r2 = r4.creturnType     // Catch: bsh.UtilEvalError -> L3d
            java.lang.String r2 = r2.getName()     // Catch: bsh.UtilEvalError -> L3d
            java.lang.Class r1 = r1.getClass(r2)     // Catch: bsh.UtilEvalError -> L3d
            r4.creturnType = r1     // Catch: bsh.UtilEvalError -> L3d
        L1d:
            java.lang.Class<?>[] r1 = r4.cparamTypes     // Catch: bsh.UtilEvalError -> L3d
            int r2 = r1.length     // Catch: bsh.UtilEvalError -> L3d
            if (r0 >= r2) goto L3d
            r1 = r1[r0]     // Catch: bsh.UtilEvalError -> L3d
            boolean r1 = bsh.Reflect.isGeneratedClass(r1)     // Catch: bsh.UtilEvalError -> L3d
            if (r1 == 0) goto L3a
            java.lang.Class<?>[] r1 = r4.cparamTypes     // Catch: bsh.UtilEvalError -> L3d
            bsh.NameSpace r2 = r4.declaringNameSpace     // Catch: bsh.UtilEvalError -> L3d
            r3 = r1[r0]     // Catch: bsh.UtilEvalError -> L3d
            java.lang.String r3 = r3.getName()     // Catch: bsh.UtilEvalError -> L3d
            java.lang.Class r2 = r2.getClass(r3)     // Catch: bsh.UtilEvalError -> L3d
            r1[r0] = r2     // Catch: bsh.UtilEvalError -> L3d
        L3a:
            int r0 = r0 + 1
            goto L1d
        L3d:
            return
    }

    @Override // bsh.BshClassManager.Listener
    public void classLoaderChanged() {
            r3 = this;
            java.lang.Class<?> r0 = r3.creturnType
            boolean r0 = bsh.Reflect.isGeneratedClass(r0)
            if (r0 != 0) goto L21
            java.lang.Class<?>[] r0 = r3.cparamTypes
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.stream.Stream r0 = r0.stream()
            bsh.a r1 = new bsh.a
            r2 = 2
            r1.<init>(r2)
            boolean r0 = r0.anyMatch(r1)
            if (r0 == 0) goto L1f
            goto L21
        L1f:
            r0 = 0
            goto L22
        L21:
            r0 = 1
        L22:
            r3.reload = r0
            return
    }

    public bsh.BshMethod clone() {
            r1 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L7
            bsh.BshMethod r0 = (bsh.BshMethod) r0     // Catch: java.lang.CloneNotSupportedException -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m0clone() {
            r1 = this;
            bsh.BshMethod r0 = r1.clone()
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r6 != r5) goto L8
            return r1
        L8:
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L13
            return r0
        L13:
            bsh.BshMethod r6 = (bsh.BshMethod) r6
            java.lang.String r2 = r5.name
            java.lang.String r3 = r6.name
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L5c
            int r2 = r5.getParameterCount()
            int r3 = r6.getParameterCount()
            if (r2 == r3) goto L2a
            goto L5c
        L2a:
            boolean r2 = r5.isExtension
            boolean r3 = r6.isExtension
            if (r2 == r3) goto L31
            return r0
        L31:
            if (r2 == 0) goto L3e
            java.lang.Class<?> r2 = r5.receiverType
            java.lang.Class<?> r3 = r6.receiverType
            boolean r2 = equal(r2, r3)
            if (r2 != 0) goto L3e
            return r0
        L3e:
            r2 = r0
        L3f:
            int r3 = r5.getParameterCount()
            if (r2 >= r3) goto L5b
            java.lang.Class[] r3 = r5.getParameterTypes()
            r3 = r3[r2]
            java.lang.Class[] r4 = r6.getParameterTypes()
            r4 = r4[r2]
            boolean r3 = equal(r3, r4)
            if (r3 != 0) goto L58
            return r0
        L58:
            int r2 = r2 + 1
            goto L3f
        L5b:
            return r1
        L5c:
            return r0
    }

    public bsh.Modifiers getModifiers() {
            r2 = this;
            bsh.Modifiers r0 = r2.modifiers
            if (r0 != 0) goto Lc
            bsh.Modifiers r0 = new bsh.Modifiers
            r1 = 2
            r0.<init>(r1)
            r2.modifiers = r0
        Lc:
            bsh.Modifiers r0 = r2.modifiers
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            bsh.Invocable r0 = r1.javaMethod
            if (r0 != 0) goto L7
            java.lang.String r0 = r1.name
            return r0
        L7:
            java.lang.String r0 = r0.getName()
            return r0
    }

    public int getParameterCount() {
            r1 = this;
            bsh.Invocable r0 = r1.javaMethod
            if (r0 != 0) goto L7
            int r0 = r1.paramCount
            return r0
        L7:
            int r0 = r0.getParameterCount()
            return r0
    }

    public bsh.Modifiers[] getParameterModifiers() {
            r1 = this;
            bsh.Modifiers[] r0 = r1.paramModifiers
            if (r0 != 0) goto Lc
            int r0 = r1.getParameterCount()
            bsh.Modifiers[] r0 = new bsh.Modifiers[r0]
            r1.paramModifiers = r0
        Lc:
            bsh.Modifiers[] r0 = r1.paramModifiers
            return r0
    }

    public java.lang.String[] getParameterNames() {
            r3 = this;
            java.lang.String[] r0 = r3.paramNames
            if (r0 != 0) goto L2b
            int r0 = r3.getParameterCount()
            r1 = 97
            int r0 = r0 + r1
            java.util.stream.IntStream r0 = java.util.stream.IntStream.range(r1, r0)
            java.util.stream.Stream r0 = r0.boxed()
            bsh.b r1 = new bsh.b
            r2 = 3
            r1.<init>(r2)
            java.util.stream.Stream r0 = r0.map(r1)
            bsh.e r1 = new bsh.e
            r2 = 0
            r1.<init>(r2)
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r3.paramNames = r0
        L2b:
            java.lang.String[] r0 = r3.paramNames
            return r0
    }

    public java.lang.Class<?>[] getParameterTypes() {
            r1 = this;
            bsh.Invocable r0 = r1.javaMethod
            if (r0 != 0) goto La
            r1.reloadTypes()
            java.lang.Class<?>[] r0 = r1.cparamTypes
            return r0
        La:
            java.lang.Class[] r0 = r0.getParameterTypes()
            return r0
    }

    public java.lang.Class<?> getReturnType() {
            r1 = this;
            bsh.Invocable r0 = r1.javaMethod
            if (r0 != 0) goto La
            r1.reloadTypes()
            java.lang.Class<?> r0 = r1.creturnType
            return r0
        La:
            java.lang.Class r0 = r0.getReturnType()
            return r0
    }

    public boolean hasModifier(java.lang.String r2) {
            r1 = this;
            bsh.Invocable r0 = r1.javaMethod
            if (r0 == 0) goto Ld
            int r0 = r0.getModifiers()
            boolean r2 = bsh.Reflect.hasModifier(r2, r0)
            return r2
        Ld:
            bsh.Modifiers r0 = r1.modifiers
            if (r0 == 0) goto L19
            boolean r2 = r0.hasModifier(r2)
            if (r2 == 0) goto L19
            r2 = 1
            return r2
        L19:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r6 = this;
            java.lang.String r0 = r6.name
            int r0 = r0.hashCode()
            java.lang.Class r1 = r6.getClass()
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            r0 = 31
            int r1 = r1 * r0
            boolean r2 = r6.isExtension
            int r0 = eh.a.h(r1, r0, r2)
            java.lang.Class<?> r1 = r6.receiverType
            r2 = 0
            if (r1 != 0) goto L1f
            r1 = r2
            goto L23
        L1f:
            int r1 = r1.hashCode()
        L23:
            int r0 = r0 + r1
            java.lang.Class[] r1 = r6.getParameterTypes()
            int r3 = r1.length
            r4 = r2
        L2a:
            if (r4 >= r3) goto L3c
            r5 = r1[r4]
            if (r5 != 0) goto L32
            r5 = r2
            goto L36
        L32:
            int r5 = r5.hashCode()
        L36:
            int r5 = r5 + 3
            int r0 = r0 + r5
            int r4 = r4 + 1
            goto L2a
        L3c:
            int r1 = r6.getParameterCount()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.Object invoke(java.lang.Object[] r7, bsh.Interpreter r8) {
            r6 = this;
            r4 = 0
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            java.lang.Object r7 = r0.invoke(r1, r2, r3, r4, r5)
            return r7
    }

    public java.lang.Object invoke(java.lang.Object[] r7, bsh.Interpreter r8, bsh.CallStack r9, bsh.Node r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            java.lang.Object r7 = r0.invoke(r1, r2, r3, r4, r5)
            return r7
    }

    public java.lang.Object invoke(java.lang.Object[] r8, bsh.Interpreter r9, bsh.CallStack r10, bsh.Node r11, boolean r12) {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            java.lang.Object r8 = r0.invoke(r1, r2, r3, r4, r5, r6)
            return r8
    }

    public java.lang.Object invoke(java.lang.Object[] r7, bsh.Interpreter r8, bsh.CallStack r9, bsh.Node r10, boolean r11, java.lang.Object r12) {
            r6 = this;
            java.lang.String r0 = "Bsh method invoke: "
            java.lang.String r1 = r6.name
            java.lang.String r2 = " overrideNameSpace: "
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r11)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3}
            bsh.Interpreter.debug(r0)
            if (r7 == 0) goto L26
            r0 = 0
        L14:
            int r1 = r7.length
            if (r0 >= r1) goto L26
            r1 = r7[r0]
            if (r1 == 0) goto L1e
            int r0 = r0 + 1
            goto L14
        L1e:
            java.lang.Error r7 = new java.lang.Error
            java.lang.String r8 = "HERE!"
            r7.<init>(r8)
            throw r7
        L26:
            bsh.BshMethod$MethodCallback r0 = r6.methodCallback
            if (r0 == 0) goto L2f
            java.lang.Object r7 = r6.invokeMethodCallback(r7, r10, r9)
            return r7
        L2f:
            bsh.Invocable r0 = r6.javaMethod
            if (r0 == 0) goto L8f
            boolean r8 = bsh.Reflect.isStatic(r0)     // Catch: bsh.UtilEvalError -> L4b java.lang.reflect.InvocationTargetException -> L4e bsh.ReflectError -> L52
            if (r8 == 0) goto L55
            bsh.security.MainSecurityGuard r8 = bsh.Interpreter.mainSecurityGuard     // Catch: bsh.UtilEvalError -> L4b java.lang.reflect.InvocationTargetException -> L4e bsh.ReflectError -> L52
            bsh.Invocable r11 = r6.javaMethod     // Catch: bsh.UtilEvalError -> L4b java.lang.reflect.InvocationTargetException -> L4e bsh.ReflectError -> L52
            java.lang.Class r11 = r11.getDeclaringClass()     // Catch: bsh.UtilEvalError -> L4b java.lang.reflect.InvocationTargetException -> L4e bsh.ReflectError -> L52
            bsh.Invocable r12 = r6.javaMethod     // Catch: bsh.UtilEvalError -> L4b java.lang.reflect.InvocationTargetException -> L4e bsh.ReflectError -> L52
            java.lang.String r12 = r12.getName()     // Catch: bsh.UtilEvalError -> L4b java.lang.reflect.InvocationTargetException -> L4e bsh.ReflectError -> L52
            r8.canInvokeStaticMethod(r11, r12, r7)     // Catch: bsh.UtilEvalError -> L4b java.lang.reflect.InvocationTargetException -> L4e bsh.ReflectError -> L52
            goto L62
        L4b:
            r0 = move-exception
            r7 = r0
            goto L6b
        L4e:
            r0 = move-exception
            r7 = r0
            r2 = r7
            goto L70
        L52:
            r0 = move-exception
            r7 = r0
            goto L7b
        L55:
            bsh.security.MainSecurityGuard r8 = bsh.Interpreter.mainSecurityGuard     // Catch: bsh.UtilEvalError -> L4b java.lang.reflect.InvocationTargetException -> L4e bsh.ReflectError -> L52
            java.lang.Object r11 = r6.javaObject     // Catch: bsh.UtilEvalError -> L4b java.lang.reflect.InvocationTargetException -> L4e bsh.ReflectError -> L52
            bsh.Invocable r12 = r6.javaMethod     // Catch: bsh.UtilEvalError -> L4b java.lang.reflect.InvocationTargetException -> L4e bsh.ReflectError -> L52
            java.lang.String r12 = r12.getName()     // Catch: bsh.UtilEvalError -> L4b java.lang.reflect.InvocationTargetException -> L4e bsh.ReflectError -> L52
            r8.canInvokeMethod(r11, r12, r7)     // Catch: bsh.UtilEvalError -> L4b java.lang.reflect.InvocationTargetException -> L4e bsh.ReflectError -> L52
        L62:
            bsh.Invocable r8 = r6.javaMethod     // Catch: bsh.UtilEvalError -> L4b java.lang.reflect.InvocationTargetException -> L4e bsh.ReflectError -> L52
            java.lang.Object r11 = r6.javaObject     // Catch: bsh.UtilEvalError -> L4b java.lang.reflect.InvocationTargetException -> L4e bsh.ReflectError -> L52
            java.lang.Object r7 = r8.invoke(r11, r7)     // Catch: bsh.UtilEvalError -> L4b java.lang.reflect.InvocationTargetException -> L4e bsh.ReflectError -> L52
            return r7
        L6b:
            bsh.EvalError r7 = r7.toEvalError(r10, r9)
            throw r7
        L70:
            bsh.TargetError r0 = new bsh.TargetError
            java.lang.String r1 = "Exception invoking imported object method."
            r5 = 1
            r4 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            throw r0
        L7b:
            bsh.EvalError r8 = new bsh.EvalError
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Error invoking Java method: "
            r11.<init>(r12)
            r11.append(r7)
            java.lang.String r7 = r11.toString()
            r8.<init>(r7, r10, r9)
            throw r8
        L8f:
            bsh.Modifiers r0 = r6.modifiers
            if (r0 == 0) goto Lbe
            java.lang.String r1 = "synchronized"
            boolean r0 = r0.hasModifier(r1)
            if (r0 == 0) goto Lbe
            bsh.NameSpace r0 = r6.declaringNameSpace
            boolean r1 = r0.isClass
            if (r1 == 0) goto Lae
            java.lang.Object r0 = r0.getClassInstance()     // Catch: bsh.UtilEvalError -> La7
        La5:
            r1 = r0
            goto Lb3
        La7:
            java.lang.String r7 = "Can't get class instance for synchronized method."
            bsh.j.f(r7)
            r7 = 0
            return r7
        Lae:
            bsh.This r0 = r0.getThis(r8)
            goto La5
        Lb3:
            monitor-enter(r1)
            java.lang.Object r7 = r6.invokeImpl(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lba
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lba
            return r7
        Lba:
            r0 = move-exception
            r7 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lba
            throw r7
        Lbe:
            java.lang.Object r7 = r6.invokeImpl(r7, r8, r9, r10, r11, r12)
            return r7
    }

    public boolean isVarArgs() {
            r1 = this;
            bsh.Invocable r0 = r1.javaMethod
            if (r0 != 0) goto L7
            boolean r0 = r1.isVarArgs
            return r0
        L7:
            boolean r0 = r0.isVarArgs()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Method: "
            r0.<init>(r1)
            java.lang.String r1 = bsh.StringUtil.methodString(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
