package net.bytebuddy.implementation.bytecode.constant;

/* JADX INFO: loaded from: classes2.dex */
public enum IntegerConstant extends java.lang.Enum<net.bytebuddy.implementation.bytecode.constant.IntegerConstant> implements net.bytebuddy.implementation.bytecode.StackManipulation {
    private static final /* synthetic */ net.bytebuddy.implementation.bytecode.constant.IntegerConstant[] $VALUES = null;
    public static final net.bytebuddy.implementation.bytecode.constant.IntegerConstant FIVE = null;
    public static final net.bytebuddy.implementation.bytecode.constant.IntegerConstant FOUR = null;
    public static final net.bytebuddy.implementation.bytecode.constant.IntegerConstant MINUS_ONE = null;
    public static final net.bytebuddy.implementation.bytecode.constant.IntegerConstant ONE = null;
    private static final net.bytebuddy.implementation.bytecode.StackManipulation.Size SIZE = null;
    public static final net.bytebuddy.implementation.bytecode.constant.IntegerConstant THREE = null;
    public static final net.bytebuddy.implementation.bytecode.constant.IntegerConstant TWO = null;
    public static final net.bytebuddy.implementation.bytecode.constant.IntegerConstant ZERO = null;
    private final int opcode;

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ConstantPool extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
        private final int value;

        public ConstantPool(int r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2) {
                r0 = this;
                int r2 = r0.value
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.visitLdcInsn(r2)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r1 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.access$000()
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
                int r2 = r4.value
                net.bytebuddy.implementation.bytecode.constant.IntegerConstant$ConstantPool r5 = (net.bytebuddy.implementation.bytecode.constant.IntegerConstant.ConstantPool) r5
                int r5 = r5.value
                if (r2 == r5) goto L1c
                return r1
            L1c:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                int r1 = r2.value
                int r0 = r0 + r1
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class SingleBytePush extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
        private final byte value;

        public SingleBytePush(byte r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.Implementation.Context r3) {
                r1 = this;
                r3 = 16
                byte r0 = r1.value
                r2.visitIntInsn(r3, r0)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.access$000()
                return r2
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
                byte r2 = r4.value
                net.bytebuddy.implementation.bytecode.constant.IntegerConstant$SingleBytePush r5 = (net.bytebuddy.implementation.bytecode.constant.IntegerConstant.SingleBytePush) r5
                byte r5 = r5.value
                if (r2 == r5) goto L1c
                return r1
            L1c:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                byte r1 = r2.value
                int r0 = r0 + r1
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class TwoBytePush extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
        private final short value;

        public TwoBytePush(short r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.Implementation.Context r3) {
                r1 = this;
                r3 = 17
                short r0 = r1.value
                r2.visitIntInsn(r3, r0)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.access$000()
                return r2
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
                short r2 = r4.value
                net.bytebuddy.implementation.bytecode.constant.IntegerConstant$TwoBytePush r5 = (net.bytebuddy.implementation.bytecode.constant.IntegerConstant.TwoBytePush) r5
                short r5 = r5.value
                if (r2 == r5) goto L1c
                return r1
            L1c:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                short r1 = r2.value
                int r0 = r0 + r1
                return r0
        }
    }

    static {
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant r0 = new net.bytebuddy.implementation.bytecode.constant.IntegerConstant
            java.lang.String r1 = "MINUS_ONE"
            r2 = 0
            r3 = 2
            r0.<init>(r1, r2, r3)
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant.MINUS_ONE = r0
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant r1 = new net.bytebuddy.implementation.bytecode.constant.IntegerConstant
            java.lang.String r2 = "ZERO"
            r4 = 1
            r5 = 3
            r1.<init>(r2, r4, r5)
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant.ZERO = r1
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant r2 = new net.bytebuddy.implementation.bytecode.constant.IntegerConstant
            java.lang.String r4 = "ONE"
            r6 = 4
            r2.<init>(r4, r3, r6)
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant.ONE = r2
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant r3 = new net.bytebuddy.implementation.bytecode.constant.IntegerConstant
            java.lang.String r4 = "TWO"
            r7 = 5
            r3.<init>(r4, r5, r7)
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant.TWO = r3
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant r4 = new net.bytebuddy.implementation.bytecode.constant.IntegerConstant
            java.lang.String r5 = "THREE"
            r8 = 6
            r4.<init>(r5, r6, r8)
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant.THREE = r4
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant r5 = new net.bytebuddy.implementation.bytecode.constant.IntegerConstant
            java.lang.String r6 = "FOUR"
            r9 = 7
            r5.<init>(r6, r7, r9)
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant.FOUR = r5
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant r6 = new net.bytebuddy.implementation.bytecode.constant.IntegerConstant
            java.lang.String r7 = "FIVE"
            r9 = 8
            r6.<init>(r7, r8, r9)
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant.FIVE = r6
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant[] r0 = new net.bytebuddy.implementation.bytecode.constant.IntegerConstant[]{r0, r1, r2, r3, r4, r5, r6}
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant.$VALUES = r0
            net.bytebuddy.implementation.bytecode.StackSize r0 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = r0.toIncreasingSize()
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant.SIZE = r0
            return
    }

    IntegerConstant(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.opcode = r3
            return
    }

    public static /* synthetic */ net.bytebuddy.implementation.bytecode.StackManipulation.Size access$000() {
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.SIZE
            return r0
    }

    public static net.bytebuddy.implementation.bytecode.StackManipulation forValue(int r1) {
            switch(r1) {
                case -1: goto L39;
                case 0: goto L36;
                case 1: goto L33;
                case 2: goto L30;
                case 3: goto L2d;
                case 4: goto L2a;
                case 5: goto L27;
                default: goto L3;
            }
        L3:
            r0 = -128(0xffffffffffffff80, float:NaN)
            if (r1 < r0) goto L12
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 > r0) goto L12
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant$SingleBytePush r0 = new net.bytebuddy.implementation.bytecode.constant.IntegerConstant$SingleBytePush
            byte r1 = (byte) r1
            r0.<init>(r1)
            return r0
        L12:
            r0 = -32768(0xffffffffffff8000, float:NaN)
            if (r1 < r0) goto L21
            r0 = 32767(0x7fff, float:4.5916E-41)
            if (r1 > r0) goto L21
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant$TwoBytePush r0 = new net.bytebuddy.implementation.bytecode.constant.IntegerConstant$TwoBytePush
            short r1 = (short) r1
            r0.<init>(r1)
            return r0
        L21:
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant$ConstantPool r0 = new net.bytebuddy.implementation.bytecode.constant.IntegerConstant$ConstantPool
            r0.<init>(r1)
            return r0
        L27:
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant r1 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.FIVE
            return r1
        L2a:
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant r1 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.FOUR
            return r1
        L2d:
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant r1 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.THREE
            return r1
        L30:
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant r1 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.TWO
            return r1
        L33:
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant r1 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.ONE
            return r1
        L36:
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant r1 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.ZERO
            return r1
        L39:
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant r1 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.MINUS_ONE
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.StackManipulation forValue(boolean r0) {
            if (r0 == 0) goto L5
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant r0 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.ONE
            goto L7
        L5:
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant r0 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.ZERO
        L7:
            return r0
    }

    public static net.bytebuddy.implementation.bytecode.constant.IntegerConstant valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bytecode.constant.IntegerConstant> r0 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant r1 = (net.bytebuddy.implementation.bytecode.constant.IntegerConstant) r1
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.constant.IntegerConstant[] values() {
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant[] r0 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant[] r0 = (net.bytebuddy.implementation.bytecode.constant.IntegerConstant[]) r0
            return r0
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2) {
            r0 = this;
            int r2 = r0.opcode
            r1.visitInsn(r2)
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r1 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.SIZE
            return r1
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
            r1 = this;
            r0 = 1
            return r0
    }
}
