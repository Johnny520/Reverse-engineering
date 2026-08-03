package net.bytebuddy.implementation.bytecode.member;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class HandleInvocation extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
    private static final java.lang.String INVOKE_EXACT = "invokeExact";
    private static final java.lang.String METHOD_HANDLE_NAME = "java/lang/invoke/MethodHandle";
    private final net.bytebuddy.utility.JavaConstant.MethodType methodType;

    public HandleInvocation(net.bytebuddy.utility.JavaConstant.MethodType r1) {
            r0 = this;
            r0.<init>()
            r0.methodType = r1
            return
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r7, net.bytebuddy.implementation.Implementation.Context r8) {
            r6 = this;
            net.bytebuddy.utility.JavaConstant$MethodType r8 = r6.methodType
            java.lang.String r4 = r8.getDescriptor()
            r5 = 0
            r1 = 182(0xb6, float:2.55E-43)
            java.lang.String r2 = "java/lang/invoke/MethodHandle"
            java.lang.String r3 = "invokeExact"
            r0 = r7
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            net.bytebuddy.utility.JavaConstant$MethodType r7 = r6.methodType
            net.bytebuddy.description.type.TypeDescription r7 = r7.getReturnType()
            net.bytebuddy.implementation.bytecode.StackSize r7 = r7.getStackSize()
            int r7 = r7.getSize()
            net.bytebuddy.utility.JavaConstant$MethodType r8 = r6.methodType
            net.bytebuddy.description.type.TypeList r8 = r8.getParameterTypes()
            int r8 = r8.getStackSize()
            int r7 = r7 - r8
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r8 = new net.bytebuddy.implementation.bytecode.StackManipulation$Size
            r0 = 0
            int r0 = java.lang.Math.max(r7, r0)
            r8.<init>(r7, r0)
            return r8
    }

    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L13
            return r1
        L13:
            net.bytebuddy.utility.JavaConstant$MethodType r2 = r4.methodType
            net.bytebuddy.implementation.bytecode.member.HandleInvocation r5 = (net.bytebuddy.implementation.bytecode.member.HandleInvocation) r5
            net.bytebuddy.utility.JavaConstant$MethodType r5 = r5.methodType
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L20
            return r1
        L20:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            net.bytebuddy.utility.JavaConstant$MethodType r1 = r2.methodType
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }
}
