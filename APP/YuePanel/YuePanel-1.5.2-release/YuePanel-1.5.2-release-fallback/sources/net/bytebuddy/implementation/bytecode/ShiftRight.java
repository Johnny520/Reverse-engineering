package net.bytebuddy.implementation.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public enum ShiftRight extends java.lang.Enum<net.bytebuddy.implementation.bytecode.ShiftRight> implements net.bytebuddy.implementation.bytecode.StackManipulation {
    private static final /* synthetic */ net.bytebuddy.implementation.bytecode.ShiftRight[] $VALUES = null;
    public static final net.bytebuddy.implementation.bytecode.ShiftRight INTEGER = null;
    public static final net.bytebuddy.implementation.bytecode.ShiftRight LONG = null;
    private final int opcode;
    private final net.bytebuddy.implementation.bytecode.StackSize stackSize;
    private final net.bytebuddy.implementation.bytecode.StackManipulation unsigned;

    public enum Unsigned extends java.lang.Enum<net.bytebuddy.implementation.bytecode.ShiftRight.Unsigned> implements net.bytebuddy.implementation.bytecode.StackManipulation {
        private static final /* synthetic */ net.bytebuddy.implementation.bytecode.ShiftRight.Unsigned[] $VALUES = null;
        public static final net.bytebuddy.implementation.bytecode.ShiftRight.Unsigned INTEGER = null;
        public static final net.bytebuddy.implementation.bytecode.ShiftRight.Unsigned LONG = null;
        private final int opcode;
        private final net.bytebuddy.implementation.bytecode.StackSize stackSize;

        static {
                net.bytebuddy.implementation.bytecode.ShiftRight$Unsigned r0 = new net.bytebuddy.implementation.bytecode.ShiftRight$Unsigned
                r1 = 124(0x7c, float:1.74E-43)
                net.bytebuddy.implementation.bytecode.StackSize r2 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
                java.lang.String r3 = "INTEGER"
                r4 = 0
                r0.<init>(r3, r4, r1, r2)
                net.bytebuddy.implementation.bytecode.ShiftRight.Unsigned.INTEGER = r0
                net.bytebuddy.implementation.bytecode.ShiftRight$Unsigned r1 = new net.bytebuddy.implementation.bytecode.ShiftRight$Unsigned
                r2 = 125(0x7d, float:1.75E-43)
                net.bytebuddy.implementation.bytecode.StackSize r3 = net.bytebuddy.implementation.bytecode.StackSize.DOUBLE
                java.lang.String r4 = "LONG"
                r5 = 1
                r1.<init>(r4, r5, r2, r3)
                net.bytebuddy.implementation.bytecode.ShiftRight.Unsigned.LONG = r1
                net.bytebuddy.implementation.bytecode.ShiftRight$Unsigned[] r0 = new net.bytebuddy.implementation.bytecode.ShiftRight.Unsigned[]{r0, r1}
                net.bytebuddy.implementation.bytecode.ShiftRight.Unsigned.$VALUES = r0
                return
        }

        Unsigned(java.lang.String r1, int r2, int r3, net.bytebuddy.implementation.bytecode.StackSize r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.opcode = r3
                r0.stackSize = r4
                return
        }

        public static net.bytebuddy.implementation.bytecode.ShiftRight.Unsigned valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bytecode.ShiftRight$Unsigned> r0 = net.bytebuddy.implementation.bytecode.ShiftRight.Unsigned.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bytecode.ShiftRight$Unsigned r1 = (net.bytebuddy.implementation.bytecode.ShiftRight.Unsigned) r1
                return r1
        }

        public static net.bytebuddy.implementation.bytecode.ShiftRight.Unsigned[] values() {
                net.bytebuddy.implementation.bytecode.ShiftRight$Unsigned[] r0 = net.bytebuddy.implementation.bytecode.ShiftRight.Unsigned.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bytecode.ShiftRight$Unsigned[] r0 = (net.bytebuddy.implementation.bytecode.ShiftRight.Unsigned[]) r0
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

    static {
            net.bytebuddy.implementation.bytecode.ShiftRight r6 = new net.bytebuddy.implementation.bytecode.ShiftRight
            net.bytebuddy.implementation.bytecode.StackSize r4 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
            net.bytebuddy.implementation.bytecode.ShiftRight$Unsigned r5 = net.bytebuddy.implementation.bytecode.ShiftRight.Unsigned.INTEGER
            java.lang.String r1 = "INTEGER"
            r2 = 0
            r3 = 122(0x7a, float:1.71E-43)
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            net.bytebuddy.implementation.bytecode.ShiftRight.INTEGER = r6
            net.bytebuddy.implementation.bytecode.ShiftRight r0 = new net.bytebuddy.implementation.bytecode.ShiftRight
            net.bytebuddy.implementation.bytecode.StackSize r11 = net.bytebuddy.implementation.bytecode.StackSize.DOUBLE
            net.bytebuddy.implementation.bytecode.ShiftRight$Unsigned r12 = net.bytebuddy.implementation.bytecode.ShiftRight.Unsigned.LONG
            java.lang.String r8 = "LONG"
            r9 = 1
            r10 = 123(0x7b, float:1.72E-43)
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12)
            net.bytebuddy.implementation.bytecode.ShiftRight.LONG = r0
            net.bytebuddy.implementation.bytecode.ShiftRight[] r0 = new net.bytebuddy.implementation.bytecode.ShiftRight[]{r6, r0}
            net.bytebuddy.implementation.bytecode.ShiftRight.$VALUES = r0
            return
    }

    ShiftRight(java.lang.String r1, int r2, int r3, net.bytebuddy.implementation.bytecode.StackSize r4, net.bytebuddy.implementation.bytecode.StackManipulation r5) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.opcode = r3
            r0.stackSize = r4
            r0.unsigned = r5
            return
    }

    public static net.bytebuddy.implementation.bytecode.ShiftRight valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bytecode.ShiftRight> r0 = net.bytebuddy.implementation.bytecode.ShiftRight.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bytecode.ShiftRight r1 = (net.bytebuddy.implementation.bytecode.ShiftRight) r1
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.ShiftRight[] values() {
            net.bytebuddy.implementation.bytecode.ShiftRight[] r0 = net.bytebuddy.implementation.bytecode.ShiftRight.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bytecode.ShiftRight[] r0 = (net.bytebuddy.implementation.bytecode.ShiftRight[]) r0
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

    public net.bytebuddy.implementation.bytecode.StackManipulation toUnsigned() {
            r1 = this;
            net.bytebuddy.implementation.bytecode.StackManipulation r0 = r1.unsigned
            return r0
    }
}
