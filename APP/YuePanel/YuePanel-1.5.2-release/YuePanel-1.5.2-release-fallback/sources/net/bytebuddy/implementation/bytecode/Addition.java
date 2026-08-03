package net.bytebuddy.implementation.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public enum Addition extends java.lang.Enum<net.bytebuddy.implementation.bytecode.Addition> implements net.bytebuddy.implementation.bytecode.StackManipulation {
    private static final /* synthetic */ net.bytebuddy.implementation.bytecode.Addition[] $VALUES = null;
    public static final net.bytebuddy.implementation.bytecode.Addition DOUBLE = null;
    public static final net.bytebuddy.implementation.bytecode.Addition FLOAT = null;
    public static final net.bytebuddy.implementation.bytecode.Addition INTEGER = null;
    public static final net.bytebuddy.implementation.bytecode.Addition LONG = null;
    private final int opcode;
    private final net.bytebuddy.implementation.bytecode.StackSize stackSize;

    static {
            net.bytebuddy.implementation.bytecode.Addition r0 = new net.bytebuddy.implementation.bytecode.Addition
            net.bytebuddy.implementation.bytecode.StackSize r1 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
            java.lang.String r2 = "INTEGER"
            r3 = 0
            r4 = 96
            r0.<init>(r2, r3, r4, r1)
            net.bytebuddy.implementation.bytecode.Addition.INTEGER = r0
            net.bytebuddy.implementation.bytecode.Addition r2 = new net.bytebuddy.implementation.bytecode.Addition
            net.bytebuddy.implementation.bytecode.StackSize r3 = net.bytebuddy.implementation.bytecode.StackSize.DOUBLE
            java.lang.String r4 = "LONG"
            r5 = 1
            r6 = 97
            r2.<init>(r4, r5, r6, r3)
            net.bytebuddy.implementation.bytecode.Addition.LONG = r2
            net.bytebuddy.implementation.bytecode.Addition r4 = new net.bytebuddy.implementation.bytecode.Addition
            r5 = 2
            r6 = 98
            java.lang.String r7 = "FLOAT"
            r4.<init>(r7, r5, r6, r1)
            net.bytebuddy.implementation.bytecode.Addition.FLOAT = r4
            net.bytebuddy.implementation.bytecode.Addition r1 = new net.bytebuddy.implementation.bytecode.Addition
            r5 = 3
            r6 = 99
            java.lang.String r7 = "DOUBLE"
            r1.<init>(r7, r5, r6, r3)
            net.bytebuddy.implementation.bytecode.Addition.DOUBLE = r1
            net.bytebuddy.implementation.bytecode.Addition[] r0 = new net.bytebuddy.implementation.bytecode.Addition[]{r0, r2, r4, r1}
            net.bytebuddy.implementation.bytecode.Addition.$VALUES = r0
            return
    }

    Addition(java.lang.String r1, int r2, int r3, net.bytebuddy.implementation.bytecode.StackSize r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.opcode = r3
            r0.stackSize = r4
            return
    }

    public static net.bytebuddy.implementation.bytecode.Addition valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bytecode.Addition> r0 = net.bytebuddy.implementation.bytecode.Addition.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bytecode.Addition r1 = (net.bytebuddy.implementation.bytecode.Addition) r1
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.Addition[] values() {
            net.bytebuddy.implementation.bytecode.Addition[] r0 = net.bytebuddy.implementation.bytecode.Addition.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bytecode.Addition[] r0 = (net.bytebuddy.implementation.bytecode.Addition[]) r0
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
