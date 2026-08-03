package net.bytebuddy.implementation.bytecode.constant;

/* JADX INFO: loaded from: classes2.dex */
public enum NullConstant extends java.lang.Enum<net.bytebuddy.implementation.bytecode.constant.NullConstant> implements net.bytebuddy.implementation.bytecode.StackManipulation {
    private static final /* synthetic */ net.bytebuddy.implementation.bytecode.constant.NullConstant[] $VALUES = null;
    public static final net.bytebuddy.implementation.bytecode.constant.NullConstant INSTANCE = null;

    static {
            net.bytebuddy.implementation.bytecode.constant.NullConstant r0 = new net.bytebuddy.implementation.bytecode.constant.NullConstant
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            net.bytebuddy.implementation.bytecode.constant.NullConstant.INSTANCE = r0
            net.bytebuddy.implementation.bytecode.constant.NullConstant[] r0 = new net.bytebuddy.implementation.bytecode.constant.NullConstant[]{r0}
            net.bytebuddy.implementation.bytecode.constant.NullConstant.$VALUES = r0
            return
    }

    NullConstant(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static net.bytebuddy.implementation.bytecode.constant.NullConstant valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bytecode.constant.NullConstant> r0 = net.bytebuddy.implementation.bytecode.constant.NullConstant.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bytecode.constant.NullConstant r1 = (net.bytebuddy.implementation.bytecode.constant.NullConstant) r1
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.constant.NullConstant[] values() {
            net.bytebuddy.implementation.bytecode.constant.NullConstant[] r0 = net.bytebuddy.implementation.bytecode.constant.NullConstant.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bytecode.constant.NullConstant[] r0 = (net.bytebuddy.implementation.bytecode.constant.NullConstant[]) r0
            return r0
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2) {
            r0 = this;
            r2 = 1
            r1.visitInsn(r2)
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r1 = new net.bytebuddy.implementation.bytecode.StackManipulation$Size
            r1.<init>(r2, r2)
            return r1
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
            r1 = this;
            r0 = 1
            return r0
    }
}
