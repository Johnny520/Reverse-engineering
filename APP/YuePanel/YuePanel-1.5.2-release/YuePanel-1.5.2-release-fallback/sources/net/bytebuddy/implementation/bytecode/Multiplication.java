package net.bytebuddy.implementation.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public enum Multiplication extends java.lang.Enum<net.bytebuddy.implementation.bytecode.Multiplication> implements net.bytebuddy.implementation.bytecode.StackManipulation {
    private static final /* synthetic */ net.bytebuddy.implementation.bytecode.Multiplication[] $VALUES = null;
    public static final net.bytebuddy.implementation.bytecode.Multiplication DOUBLE = null;
    public static final net.bytebuddy.implementation.bytecode.Multiplication FLOAT = null;
    public static final net.bytebuddy.implementation.bytecode.Multiplication INTEGER = null;
    public static final net.bytebuddy.implementation.bytecode.Multiplication LONG = null;
    private final int opcode;
    private final net.bytebuddy.implementation.bytecode.StackSize stackSize;

    static {
            net.bytebuddy.implementation.bytecode.Multiplication r0 = new net.bytebuddy.implementation.bytecode.Multiplication
            net.bytebuddy.implementation.bytecode.StackSize r1 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
            java.lang.String r2 = "INTEGER"
            r3 = 0
            r4 = 104(0x68, float:1.46E-43)
            r0.<init>(r2, r3, r4, r1)
            net.bytebuddy.implementation.bytecode.Multiplication.INTEGER = r0
            net.bytebuddy.implementation.bytecode.Multiplication r2 = new net.bytebuddy.implementation.bytecode.Multiplication
            net.bytebuddy.implementation.bytecode.StackSize r3 = net.bytebuddy.implementation.bytecode.StackSize.DOUBLE
            java.lang.String r4 = "LONG"
            r5 = 1
            r6 = 105(0x69, float:1.47E-43)
            r2.<init>(r4, r5, r6, r3)
            net.bytebuddy.implementation.bytecode.Multiplication.LONG = r2
            net.bytebuddy.implementation.bytecode.Multiplication r4 = new net.bytebuddy.implementation.bytecode.Multiplication
            r5 = 2
            r6 = 106(0x6a, float:1.49E-43)
            java.lang.String r7 = "FLOAT"
            r4.<init>(r7, r5, r6, r1)
            net.bytebuddy.implementation.bytecode.Multiplication.FLOAT = r4
            net.bytebuddy.implementation.bytecode.Multiplication r1 = new net.bytebuddy.implementation.bytecode.Multiplication
            r5 = 3
            r6 = 107(0x6b, float:1.5E-43)
            java.lang.String r7 = "DOUBLE"
            r1.<init>(r7, r5, r6, r3)
            net.bytebuddy.implementation.bytecode.Multiplication.DOUBLE = r1
            net.bytebuddy.implementation.bytecode.Multiplication[] r0 = new net.bytebuddy.implementation.bytecode.Multiplication[]{r0, r2, r4, r1}
            net.bytebuddy.implementation.bytecode.Multiplication.$VALUES = r0
            return
    }

    Multiplication(java.lang.String r1, int r2, int r3, net.bytebuddy.implementation.bytecode.StackSize r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.opcode = r3
            r0.stackSize = r4
            return
    }

    public static net.bytebuddy.implementation.bytecode.Multiplication valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bytecode.Multiplication> r0 = net.bytebuddy.implementation.bytecode.Multiplication.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bytecode.Multiplication r1 = (net.bytebuddy.implementation.bytecode.Multiplication) r1
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.Multiplication[] values() {
            net.bytebuddy.implementation.bytecode.Multiplication[] r0 = net.bytebuddy.implementation.bytecode.Multiplication.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bytecode.Multiplication[] r0 = (net.bytebuddy.implementation.bytecode.Multiplication[]) r0
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
