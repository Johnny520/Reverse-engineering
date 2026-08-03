package net.bytebuddy.implementation.bytecode.constant;

/* JADX INFO: loaded from: classes2.dex */
public enum DoubleConstant extends java.lang.Enum<net.bytebuddy.implementation.bytecode.constant.DoubleConstant> implements net.bytebuddy.implementation.bytecode.StackManipulation {
    private static final /* synthetic */ net.bytebuddy.implementation.bytecode.constant.DoubleConstant[] $VALUES = null;
    public static final net.bytebuddy.implementation.bytecode.constant.DoubleConstant ONE = null;
    private static final net.bytebuddy.implementation.bytecode.StackManipulation.Size SIZE = null;
    public static final net.bytebuddy.implementation.bytecode.constant.DoubleConstant ZERO = null;
    private final int opcode;

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ConstantPool extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
        private final double value;

        public ConstantPool(double r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r3, net.bytebuddy.implementation.Implementation.Context r4) {
                r2 = this;
                double r0 = r2.value
                java.lang.Double r4 = java.lang.Double.valueOf(r0)
                r3.visitLdcInsn(r4)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r3 = net.bytebuddy.implementation.bytecode.constant.DoubleConstant.access$000()
                return r3
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r7) {
                r6 = this;
                r0 = 1
                if (r6 != r7) goto L4
                return r0
            L4:
                r1 = 0
                if (r7 != 0) goto L8
                return r1
            L8:
                java.lang.Class r2 = r6.getClass()
                java.lang.Class r3 = r7.getClass()
                if (r2 == r3) goto L13
                return r1
            L13:
                double r2 = r6.value
                net.bytebuddy.implementation.bytecode.constant.DoubleConstant$ConstantPool r7 = (net.bytebuddy.implementation.bytecode.constant.DoubleConstant.ConstantPool) r7
                double r4 = r7.value
                int r7 = java.lang.Double.compare(r2, r4)
                if (r7 == 0) goto L20
                return r1
            L20:
                return r0
        }

        public int hashCode() {
                r5 = this;
                java.lang.Class r0 = r5.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                double r1 = r5.value
                long r1 = java.lang.Double.doubleToLongBits(r1)
                r3 = 32
                long r3 = r1 >>> r3
                long r1 = r1 ^ r3
                int r1 = (int) r1
                int r0 = r0 + r1
                return r0
        }
    }

    static {
            net.bytebuddy.implementation.bytecode.constant.DoubleConstant r0 = new net.bytebuddy.implementation.bytecode.constant.DoubleConstant
            r1 = 0
            r2 = 14
            java.lang.String r3 = "ZERO"
            r0.<init>(r3, r1, r2)
            net.bytebuddy.implementation.bytecode.constant.DoubleConstant.ZERO = r0
            net.bytebuddy.implementation.bytecode.constant.DoubleConstant r1 = new net.bytebuddy.implementation.bytecode.constant.DoubleConstant
            r2 = 1
            r3 = 15
            java.lang.String r4 = "ONE"
            r1.<init>(r4, r2, r3)
            net.bytebuddy.implementation.bytecode.constant.DoubleConstant.ONE = r1
            net.bytebuddy.implementation.bytecode.constant.DoubleConstant[] r0 = new net.bytebuddy.implementation.bytecode.constant.DoubleConstant[]{r0, r1}
            net.bytebuddy.implementation.bytecode.constant.DoubleConstant.$VALUES = r0
            net.bytebuddy.implementation.bytecode.StackSize r0 = net.bytebuddy.implementation.bytecode.StackSize.DOUBLE
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = r0.toIncreasingSize()
            net.bytebuddy.implementation.bytecode.constant.DoubleConstant.SIZE = r0
            return
    }

    DoubleConstant(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.opcode = r3
            return
    }

    public static /* synthetic */ net.bytebuddy.implementation.bytecode.StackManipulation.Size access$000() {
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = net.bytebuddy.implementation.bytecode.constant.DoubleConstant.SIZE
            return r0
    }

    public static net.bytebuddy.implementation.bytecode.StackManipulation forValue(double r2) {
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L9
            net.bytebuddy.implementation.bytecode.constant.DoubleConstant r2 = net.bytebuddy.implementation.bytecode.constant.DoubleConstant.ZERO
            return r2
        L9:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L12
            net.bytebuddy.implementation.bytecode.constant.DoubleConstant r2 = net.bytebuddy.implementation.bytecode.constant.DoubleConstant.ONE
            return r2
        L12:
            net.bytebuddy.implementation.bytecode.constant.DoubleConstant$ConstantPool r0 = new net.bytebuddy.implementation.bytecode.constant.DoubleConstant$ConstantPool
            r0.<init>(r2)
            return r0
    }

    public static net.bytebuddy.implementation.bytecode.constant.DoubleConstant valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bytecode.constant.DoubleConstant> r0 = net.bytebuddy.implementation.bytecode.constant.DoubleConstant.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bytecode.constant.DoubleConstant r1 = (net.bytebuddy.implementation.bytecode.constant.DoubleConstant) r1
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.constant.DoubleConstant[] values() {
            net.bytebuddy.implementation.bytecode.constant.DoubleConstant[] r0 = net.bytebuddy.implementation.bytecode.constant.DoubleConstant.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bytecode.constant.DoubleConstant[] r0 = (net.bytebuddy.implementation.bytecode.constant.DoubleConstant[]) r0
            return r0
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2) {
            r0 = this;
            int r2 = r0.opcode
            r1.visitInsn(r2)
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r1 = net.bytebuddy.implementation.bytecode.constant.DoubleConstant.SIZE
            return r1
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
            r1 = this;
            r0 = 1
            return r0
    }
}
