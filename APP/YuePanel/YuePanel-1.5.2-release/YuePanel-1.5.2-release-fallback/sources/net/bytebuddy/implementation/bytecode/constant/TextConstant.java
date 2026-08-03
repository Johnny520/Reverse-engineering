package net.bytebuddy.implementation.bytecode.constant;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class TextConstant extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
    private final java.lang.String text;

    public TextConstant(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.text = r1
            return
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2) {
            r0 = this;
            java.lang.String r2 = r0.text
            r1.visitLdcInsn(r2)
            net.bytebuddy.implementation.bytecode.StackSize r1 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r1 = r1.toIncreasingSize()
            return r1
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
            java.lang.String r2 = r4.text
            net.bytebuddy.implementation.bytecode.constant.TextConstant r5 = (net.bytebuddy.implementation.bytecode.constant.TextConstant) r5
            java.lang.String r5 = r5.text
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
            java.lang.String r1 = r2.text
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }
}
