package net.bytebuddy.implementation.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public enum Throw extends java.lang.Enum<net.bytebuddy.implementation.bytecode.Throw> implements net.bytebuddy.implementation.bytecode.StackManipulation {
    private static final /* synthetic */ net.bytebuddy.implementation.bytecode.Throw[] $VALUES = null;
    public static final net.bytebuddy.implementation.bytecode.Throw INSTANCE = null;

    static {
            net.bytebuddy.implementation.bytecode.Throw r0 = new net.bytebuddy.implementation.bytecode.Throw
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            net.bytebuddy.implementation.bytecode.Throw.INSTANCE = r0
            net.bytebuddy.implementation.bytecode.Throw[] r0 = new net.bytebuddy.implementation.bytecode.Throw[]{r0}
            net.bytebuddy.implementation.bytecode.Throw.$VALUES = r0
            return
    }

    Throw(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static net.bytebuddy.implementation.bytecode.Throw valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bytecode.Throw> r0 = net.bytebuddy.implementation.bytecode.Throw.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bytecode.Throw r1 = (net.bytebuddy.implementation.bytecode.Throw) r1
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.Throw[] values() {
            net.bytebuddy.implementation.bytecode.Throw[] r0 = net.bytebuddy.implementation.bytecode.Throw.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bytecode.Throw[] r0 = (net.bytebuddy.implementation.bytecode.Throw[]) r0
            return r0
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2) {
            r0 = this;
            r2 = 191(0xbf, float:2.68E-43)
            r1.visitInsn(r2)
            net.bytebuddy.implementation.bytecode.StackSize r1 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r1 = r1.toDecreasingSize()
            return r1
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
            r1 = this;
            r0 = 1
            return r0
    }
}
