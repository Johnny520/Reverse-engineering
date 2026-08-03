package net.bytebuddy.implementation.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public enum ShiftLeft extends java.lang.Enum<net.bytebuddy.implementation.bytecode.ShiftLeft> implements net.bytebuddy.implementation.bytecode.StackManipulation {
    private static final /* synthetic */ net.bytebuddy.implementation.bytecode.ShiftLeft[] $VALUES = null;
    public static final net.bytebuddy.implementation.bytecode.ShiftLeft INTEGER = null;
    public static final net.bytebuddy.implementation.bytecode.ShiftLeft LONG = null;
    private final int opcode;
    private final net.bytebuddy.implementation.bytecode.StackSize stackSize;

    static {
            net.bytebuddy.implementation.bytecode.ShiftLeft r0 = new net.bytebuddy.implementation.bytecode.ShiftLeft
            r1 = 120(0x78, float:1.68E-43)
            net.bytebuddy.implementation.bytecode.StackSize r2 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
            java.lang.String r3 = "INTEGER"
            r4 = 0
            r0.<init>(r3, r4, r1, r2)
            net.bytebuddy.implementation.bytecode.ShiftLeft.INTEGER = r0
            net.bytebuddy.implementation.bytecode.ShiftLeft r1 = new net.bytebuddy.implementation.bytecode.ShiftLeft
            r2 = 121(0x79, float:1.7E-43)
            net.bytebuddy.implementation.bytecode.StackSize r3 = net.bytebuddy.implementation.bytecode.StackSize.DOUBLE
            java.lang.String r4 = "LONG"
            r5 = 1
            r1.<init>(r4, r5, r2, r3)
            net.bytebuddy.implementation.bytecode.ShiftLeft.LONG = r1
            net.bytebuddy.implementation.bytecode.ShiftLeft[] r0 = new net.bytebuddy.implementation.bytecode.ShiftLeft[]{r0, r1}
            net.bytebuddy.implementation.bytecode.ShiftLeft.$VALUES = r0
            return
    }

    ShiftLeft(java.lang.String r1, int r2, int r3, net.bytebuddy.implementation.bytecode.StackSize r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.opcode = r3
            r0.stackSize = r4
            return
    }

    public static net.bytebuddy.implementation.bytecode.ShiftLeft valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bytecode.ShiftLeft> r0 = net.bytebuddy.implementation.bytecode.ShiftLeft.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bytecode.ShiftLeft r1 = (net.bytebuddy.implementation.bytecode.ShiftLeft) r1
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.ShiftLeft[] values() {
            net.bytebuddy.implementation.bytecode.ShiftLeft[] r0 = net.bytebuddy.implementation.bytecode.ShiftLeft.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bytecode.ShiftLeft[] r0 = (net.bytebuddy.implementation.bytecode.ShiftLeft[]) r0
            return r0
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2) {
            r0 = this;
            int r2 = r0.opcode
            r1.visitInsn(r2)
            net.bytebuddy.implementation.bytecode.StackSize r1 = r0.stackSize
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
