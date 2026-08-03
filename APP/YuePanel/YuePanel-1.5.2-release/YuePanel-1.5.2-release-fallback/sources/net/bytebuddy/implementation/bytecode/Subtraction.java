package net.bytebuddy.implementation.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public enum Subtraction extends java.lang.Enum<net.bytebuddy.implementation.bytecode.Subtraction> implements net.bytebuddy.implementation.bytecode.StackManipulation {
    private static final /* synthetic */ net.bytebuddy.implementation.bytecode.Subtraction[] $VALUES = null;
    public static final net.bytebuddy.implementation.bytecode.Subtraction DOUBLE = null;
    public static final net.bytebuddy.implementation.bytecode.Subtraction FLOAT = null;
    public static final net.bytebuddy.implementation.bytecode.Subtraction INTEGER = null;
    public static final net.bytebuddy.implementation.bytecode.Subtraction LONG = null;
    private final int opcode;
    private final net.bytebuddy.implementation.bytecode.StackSize stackSize;

    static {
            net.bytebuddy.implementation.bytecode.Subtraction r0 = new net.bytebuddy.implementation.bytecode.Subtraction
            net.bytebuddy.implementation.bytecode.StackSize r1 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
            java.lang.String r2 = "INTEGER"
            r3 = 0
            r4 = 100
            r0.<init>(r2, r3, r4, r1)
            net.bytebuddy.implementation.bytecode.Subtraction.INTEGER = r0
            net.bytebuddy.implementation.bytecode.Subtraction r2 = new net.bytebuddy.implementation.bytecode.Subtraction
            net.bytebuddy.implementation.bytecode.StackSize r3 = net.bytebuddy.implementation.bytecode.StackSize.DOUBLE
            java.lang.String r4 = "LONG"
            r5 = 1
            r6 = 101(0x65, float:1.42E-43)
            r2.<init>(r4, r5, r6, r3)
            net.bytebuddy.implementation.bytecode.Subtraction.LONG = r2
            net.bytebuddy.implementation.bytecode.Subtraction r4 = new net.bytebuddy.implementation.bytecode.Subtraction
            r5 = 2
            r6 = 102(0x66, float:1.43E-43)
            java.lang.String r7 = "FLOAT"
            r4.<init>(r7, r5, r6, r1)
            net.bytebuddy.implementation.bytecode.Subtraction.FLOAT = r4
            net.bytebuddy.implementation.bytecode.Subtraction r1 = new net.bytebuddy.implementation.bytecode.Subtraction
            r5 = 3
            r6 = 103(0x67, float:1.44E-43)
            java.lang.String r7 = "DOUBLE"
            r1.<init>(r7, r5, r6, r3)
            net.bytebuddy.implementation.bytecode.Subtraction.DOUBLE = r1
            net.bytebuddy.implementation.bytecode.Subtraction[] r0 = new net.bytebuddy.implementation.bytecode.Subtraction[]{r0, r2, r4, r1}
            net.bytebuddy.implementation.bytecode.Subtraction.$VALUES = r0
            return
    }

    Subtraction(java.lang.String r1, int r2, int r3, net.bytebuddy.implementation.bytecode.StackSize r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.opcode = r3
            r0.stackSize = r4
            return
    }

    public static net.bytebuddy.implementation.bytecode.Subtraction valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bytecode.Subtraction> r0 = net.bytebuddy.implementation.bytecode.Subtraction.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bytecode.Subtraction r1 = (net.bytebuddy.implementation.bytecode.Subtraction) r1
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.Subtraction[] values() {
            net.bytebuddy.implementation.bytecode.Subtraction[] r0 = net.bytebuddy.implementation.bytecode.Subtraction.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bytecode.Subtraction[] r0 = (net.bytebuddy.implementation.bytecode.Subtraction[]) r0
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
