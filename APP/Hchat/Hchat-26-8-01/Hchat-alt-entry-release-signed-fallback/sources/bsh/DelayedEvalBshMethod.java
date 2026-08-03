package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class DelayedEvalBshMethod extends bsh.BshMethod {
    private static final long serialVersionUID = 1;
    private bsh.BSHArguments argsNode;
    transient bsh.CallStack callstack;
    private bsh.Invocable constructor;
    private java.lang.Object[] constructorArgs;
    transient bsh.Interpreter interpreter;
    java.lang.String[] paramTypeDescriptors;
    bsh.BSHFormalParameters paramTypesNode;
    java.lang.String returnTypeDescriptor;
    bsh.BSHReturnType returnTypeNode;

    public DelayedEvalBshMethod(java.lang.String r14, bsh.Invocable r15, bsh.NameSpace r16) {
            r13 = this;
            java.lang.String r2 = r15.getReturnTypeDescriptor()
            int r0 = r15.getParameterCount()
            java.lang.String[] r4 = new java.lang.String[r0]
            java.lang.String[] r5 = r15.getParamTypeDescriptors()
            bsh.BSHBlock r7 = new bsh.BSHBlock
            r0 = 0
            r7.<init>(r0)
            boolean r10 = r15.isVarArgs()
            r11 = 0
            r12 = 0
            r3 = 0
            r6 = 0
            r9 = 0
            r0 = r13
            r1 = r14
            r8 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.constructor = r15
            bsh.Modifiers r15 = new bsh.Modifiers
            r2 = 5
            r15.<init>(r2)
            r13.modifiers = r15
            bsh.Modifiers r15 = r13.getModifiers()
            java.lang.String r2 = "public"
            r15.addModifier(r2)
            r13.getParameterModifiers()
            r8.setMethod(r13)
            java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.Object[]>> r15 = bsh.This.CONTEXT_ARGS
            java.lang.Object r15 = r15.get()
            java.util.Map r15 = (java.util.Map) r15
            java.lang.Object r14 = r15.remove(r14)
            java.lang.Object[] r14 = (java.lang.Object[]) r14
            r13.constructorArgs = r14
            return
    }

    public DelayedEvalBshMethod(java.lang.String r11, java.lang.String r12, bsh.BSHReturnType r13, java.lang.String[] r14, java.lang.String[] r15, bsh.BSHFormalParameters r16, bsh.BSHBlock r17, bsh.NameSpace r18, bsh.Modifiers r19, boolean r20, bsh.CallStack r21, bsh.Interpreter r22) {
            r10 = this;
            r4 = 0
            r5 = 0
            r2 = 0
            r0 = r10
            r1 = r11
            r3 = r14
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11 = 0
            r10.argsNode = r11
            r10.constructor = r11
            r10.constructorArgs = r11
            r10.returnTypeDescriptor = r12
            r10.returnTypeNode = r13
            r10.paramTypeDescriptors = r15
            r11 = r16
            r10.paramTypesNode = r11
            r11 = r21
            r10.callstack = r11
            r11 = r22
            r10.interpreter = r11
            return
    }

    @Override // bsh.BshMethod
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
            bsh.DelayedEvalBshMethod r6 = (bsh.DelayedEvalBshMethod) r6
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = r6.getName()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L68
            int r2 = r5.getParameterCount()
            int r3 = r6.getParameterCount()
            if (r2 == r3) goto L2e
            goto L68
        L2e:
            boolean r2 = r5.isExtension
            boolean r3 = r6.isExtension
            if (r2 == r3) goto L35
            return r0
        L35:
            if (r2 == 0) goto L42
            java.lang.Class<?> r2 = r5.receiverType
            java.lang.Class<?> r3 = r6.receiverType
            boolean r2 = bsh.BshMethod.equal(r2, r3)
            if (r2 != 0) goto L42
            return r0
        L42:
            boolean r2 = r5.isVarArgs
            boolean r3 = r6.isVarArgs
            if (r2 == r3) goto L49
            return r0
        L49:
            r2 = r0
        L4a:
            java.lang.String[] r3 = r5.getParamTypeDescriptors()
            int r3 = r3.length
            if (r2 >= r3) goto L67
            java.lang.String[] r3 = r5.getParamTypeDescriptors()
            r3 = r3[r2]
            java.lang.String[] r4 = r6.getParamTypeDescriptors()
            r4 = r4[r2]
            boolean r3 = bsh.BshMethod.equal(r3, r4)
            if (r3 != 0) goto L64
            return r0
        L64:
            int r2 = r2 + 1
            goto L4a
        L67:
            return r1
        L68:
            return r0
    }

    public java.lang.String getAltConstructor() {
            r6 = this;
            bsh.Invocable r0 = r6.constructor
            java.lang.String r1 = "super"
            if (r0 == 0) goto L7
            return r1
        L7:
            bsh.BSHBlock r0 = r6.methodBody
            int r0 = r0.jjtGetNumChildren()
            r2 = 0
            if (r0 != 0) goto L11
            return r2
        L11:
            bsh.BSHBlock r0 = r6.methodBody
            r3 = 0
            bsh.Node r0 = r0.jjtGetChild(r3)
        L18:
            boolean r4 = r0 instanceof bsh.BSHMethodInvocation
            if (r4 != 0) goto L27
            int r5 = r0.jjtGetNumChildren()
            if (r5 <= 0) goto L27
            bsh.Node r0 = r0.jjtGetChild(r3)
            goto L18
        L27:
            if (r4 == 0) goto L46
            bsh.BSHMethodInvocation r0 = (bsh.BSHMethodInvocation) r0
            bsh.BSHAmbiguousName r3 = r0.getNameNode()
            java.lang.String r3 = r3.text
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L3f
            java.lang.String r1 = "this"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L46
        L3f:
            bsh.BSHArguments r0 = r0.getArgsNode()
            r6.argsNode = r0
            return r3
        L46:
            return r2
    }

    public bsh.BSHArguments getArgsNode() {
            r1 = this;
            bsh.BSHArguments r0 = r1.argsNode
            return r0
    }

    public java.lang.Object[] getConstructorArgs() {
            r1 = this;
            java.lang.Object[] r0 = r1.constructorArgs
            return r0
    }

    public java.lang.String[] getParamTypeDescriptors() {
            r1 = this;
            java.lang.String[] r0 = r1.paramTypeDescriptors
            return r0
    }

    @Override // bsh.BshMethod
    public java.lang.Class<?>[] getParameterTypes() {
            r3 = this;
            bsh.Invocable r0 = r3.constructor
            if (r0 == 0) goto L9
            java.lang.Class[] r0 = r0.getParameterTypes()
            return r0
        L9:
            bsh.BSHFormalParameters r0 = r3.paramTypesNode     // Catch: bsh.EvalError -> L14
            bsh.CallStack r1 = r3.callstack     // Catch: bsh.EvalError -> L14
            bsh.Interpreter r2 = r3.interpreter     // Catch: bsh.EvalError -> L14
            java.lang.Class[] r0 = r0.eval(r1, r2)     // Catch: bsh.EvalError -> L14
            return r0
        L14:
            r0 = move-exception
            java.lang.String r1 = "can't eval param types: "
            bsh.j.d(r1, r0)
            r0 = 0
            return r0
    }

    @Override // bsh.BshMethod
    public java.lang.Class<?> getReturnType() {
            r3 = this;
            bsh.BSHReturnType r0 = r3.returnTypeNode
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            bsh.CallStack r1 = r3.callstack     // Catch: bsh.EvalError -> Lf
            bsh.Interpreter r2 = r3.interpreter     // Catch: bsh.EvalError -> Lf
            java.lang.Class r0 = r0.evalReturnType(r1, r2)     // Catch: bsh.EvalError -> Lf
            return r0
        Lf:
            r0 = move-exception
            java.lang.String r1 = "can't eval return type: "
            bsh.j.d(r1, r0)
            r0 = 0
            return r0
    }

    public java.lang.String getReturnTypeDescriptor() {
            r1 = this;
            java.lang.String r0 = r1.returnTypeDescriptor
            return r0
    }

    @Override // bsh.BshMethod
    public int hashCode() {
            r6 = this;
            java.lang.String r0 = r6.getName()
            int r0 = r0.hashCode()
            java.lang.Class r1 = r6.getClass()
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            r0 = 31
            int r1 = r1 * r0
            boolean r2 = r6.isExtension
            int r1 = eh.a.h(r1, r0, r2)
            java.lang.Class<?> r2 = r6.receiverType
            r3 = 0
            if (r2 != 0) goto L21
            r2 = r3
            goto L25
        L21:
            int r2 = r2.hashCode()
        L25:
            int r1 = r1 + r2
            int r1 = r1 * r0
            boolean r0 = r6.isVarArgs
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r1
            java.lang.String[] r1 = r6.getParamTypeDescriptors()
            int r2 = r1.length
            r4 = r3
        L34:
            if (r4 >= r2) goto L46
            r5 = r1[r4]
            if (r5 != 0) goto L3c
            r5 = r3
            goto L40
        L3c:
            int r5 = r5.hashCode()
        L40:
            int r5 = r5 + 3
            int r0 = r0 + r5
            int r4 = r4 + 1
            goto L34
        L46:
            int r1 = r6.getParameterCount()
            int r1 = r1 + r0
            return r1
    }
}
