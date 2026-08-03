package net.bytebuddy.implementation.bytecode.constant;

/* JADX INFO: loaded from: classes2.dex */
public enum LongConstant extends java.lang.Enum<net.bytebuddy.implementation.bytecode.constant.LongConstant> implements net.bytebuddy.implementation.bytecode.StackManipulation {
    private static final /* synthetic */ net.bytebuddy.implementation.bytecode.constant.LongConstant[] $VALUES = null;
    public static final net.bytebuddy.implementation.bytecode.constant.LongConstant ONE = null;
    private static final net.bytebuddy.implementation.bytecode.StackManipulation.Size SIZE = null;
    public static final net.bytebuddy.implementation.bytecode.constant.LongConstant ZERO = null;
    private final int opcode;

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ConstantPool extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
        private final long value;

        public ConstantPool(long r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r3, net.bytebuddy.implementation.Implementation.Context r4) {
                r2 = this;
                long r0 = r2.value
                java.lang.Long r4 = java.lang.Long.valueOf(r0)
                r3.visitLdcInsn(r4)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r3 = net.bytebuddy.implementation.bytecode.constant.LongConstant.access$000()
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
                long r2 = r6.value
                net.bytebuddy.implementation.bytecode.constant.LongConstant$ConstantPool r7 = (net.bytebuddy.implementation.bytecode.constant.LongConstant.ConstantPool) r7
                long r4 = r7.value
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 == 0) goto L1e
                return r1
            L1e:
                return r0
        }

        public int hashCode() {
                r5 = this;
                java.lang.Class r0 = r5.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                long r1 = r5.value
                r3 = 32
                long r3 = r1 >>> r3
                long r1 = r1 ^ r3
                int r1 = (int) r1
                int r0 = r0 + r1
                return r0
        }
    }

    static {
            net.bytebuddy.implementation.bytecode.constant.LongConstant r0 = new net.bytebuddy.implementation.bytecode.constant.LongConstant
            r1 = 0
            r2 = 9
            java.lang.String r3 = "ZERO"
            r0.<init>(r3, r1, r2)
            net.bytebuddy.implementation.bytecode.constant.LongConstant.ZERO = r0
            net.bytebuddy.implementation.bytecode.constant.LongConstant r1 = new net.bytebuddy.implementation.bytecode.constant.LongConstant
            r2 = 1
            r3 = 10
            java.lang.String r4 = "ONE"
            r1.<init>(r4, r2, r3)
            net.bytebuddy.implementation.bytecode.constant.LongConstant.ONE = r1
            net.bytebuddy.implementation.bytecode.constant.LongConstant[] r0 = new net.bytebuddy.implementation.bytecode.constant.LongConstant[]{r0, r1}
            net.bytebuddy.implementation.bytecode.constant.LongConstant.$VALUES = r0
            net.bytebuddy.implementation.bytecode.StackSize r0 = net.bytebuddy.implementation.bytecode.StackSize.DOUBLE
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = r0.toIncreasingSize()
            net.bytebuddy.implementation.bytecode.constant.LongConstant.SIZE = r0
            return
    }

    LongConstant(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.opcode = r3
            return
    }

    public static /* synthetic */ net.bytebuddy.implementation.bytecode.StackManipulation.Size access$000() {
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = net.bytebuddy.implementation.bytecode.constant.LongConstant.SIZE
            return r0
    }

    public static net.bytebuddy.implementation.bytecode.StackManipulation forValue(long r2) {
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L9
            net.bytebuddy.implementation.bytecode.constant.LongConstant r2 = net.bytebuddy.implementation.bytecode.constant.LongConstant.ZERO
            return r2
        L9:
            r0 = 1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L12
            net.bytebuddy.implementation.bytecode.constant.LongConstant r2 = net.bytebuddy.implementation.bytecode.constant.LongConstant.ONE
            return r2
        L12:
            net.bytebuddy.implementation.bytecode.constant.LongConstant$ConstantPool r0 = new net.bytebuddy.implementation.bytecode.constant.LongConstant$ConstantPool
            r0.<init>(r2)
            return r0
    }

    public static net.bytebuddy.implementation.bytecode.constant.LongConstant valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bytecode.constant.LongConstant> r0 = net.bytebuddy.implementation.bytecode.constant.LongConstant.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bytecode.constant.LongConstant r1 = (net.bytebuddy.implementation.bytecode.constant.LongConstant) r1
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.constant.LongConstant[] values() {
            net.bytebuddy.implementation.bytecode.constant.LongConstant[] r0 = net.bytebuddy.implementation.bytecode.constant.LongConstant.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bytecode.constant.LongConstant[] r0 = (net.bytebuddy.implementation.bytecode.constant.LongConstant[]) r0
            return r0
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2) {
            r0 = this;
            int r2 = r0.opcode
            r1.visitInsn(r2)
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r1 = net.bytebuddy.implementation.bytecode.constant.LongConstant.SIZE
            return r1
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
            r1 = this;
            r0 = 1
            return r0
    }
}
