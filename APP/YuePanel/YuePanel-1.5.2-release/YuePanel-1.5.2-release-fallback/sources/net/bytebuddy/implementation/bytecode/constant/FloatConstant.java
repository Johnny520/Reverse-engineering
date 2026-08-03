package net.bytebuddy.implementation.bytecode.constant;

/* JADX INFO: loaded from: classes2.dex */
public enum FloatConstant extends java.lang.Enum<net.bytebuddy.implementation.bytecode.constant.FloatConstant> implements net.bytebuddy.implementation.bytecode.StackManipulation {
    private static final /* synthetic */ net.bytebuddy.implementation.bytecode.constant.FloatConstant[] $VALUES = null;
    public static final net.bytebuddy.implementation.bytecode.constant.FloatConstant ONE = null;
    private static final net.bytebuddy.implementation.bytecode.StackManipulation.Size SIZE = null;
    public static final net.bytebuddy.implementation.bytecode.constant.FloatConstant TWO = null;
    public static final net.bytebuddy.implementation.bytecode.constant.FloatConstant ZERO = null;
    private final int opcode;

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ConstantPool extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
        private final float value;

        public ConstantPool(float r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2) {
                r0 = this;
                float r2 = r0.value
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                r1.visitLdcInsn(r2)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r1 = net.bytebuddy.implementation.bytecode.constant.FloatConstant.access$000()
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
                float r2 = r4.value
                net.bytebuddy.implementation.bytecode.constant.FloatConstant$ConstantPool r5 = (net.bytebuddy.implementation.bytecode.constant.FloatConstant.ConstantPool) r5
                float r5 = r5.value
                int r5 = java.lang.Float.compare(r2, r5)
                if (r5 == 0) goto L20
                return r1
            L20:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                float r1 = r2.value
                int r1 = java.lang.Float.floatToIntBits(r1)
                int r0 = r0 + r1
                return r0
        }
    }

    static {
            net.bytebuddy.implementation.bytecode.constant.FloatConstant r0 = new net.bytebuddy.implementation.bytecode.constant.FloatConstant
            r1 = 0
            r2 = 11
            java.lang.String r3 = "ZERO"
            r0.<init>(r3, r1, r2)
            net.bytebuddy.implementation.bytecode.constant.FloatConstant.ZERO = r0
            net.bytebuddy.implementation.bytecode.constant.FloatConstant r1 = new net.bytebuddy.implementation.bytecode.constant.FloatConstant
            r2 = 1
            r3 = 12
            java.lang.String r4 = "ONE"
            r1.<init>(r4, r2, r3)
            net.bytebuddy.implementation.bytecode.constant.FloatConstant.ONE = r1
            net.bytebuddy.implementation.bytecode.constant.FloatConstant r2 = new net.bytebuddy.implementation.bytecode.constant.FloatConstant
            r3 = 2
            r4 = 13
            java.lang.String r5 = "TWO"
            r2.<init>(r5, r3, r4)
            net.bytebuddy.implementation.bytecode.constant.FloatConstant.TWO = r2
            net.bytebuddy.implementation.bytecode.constant.FloatConstant[] r0 = new net.bytebuddy.implementation.bytecode.constant.FloatConstant[]{r0, r1, r2}
            net.bytebuddy.implementation.bytecode.constant.FloatConstant.$VALUES = r0
            net.bytebuddy.implementation.bytecode.StackSize r0 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = r0.toIncreasingSize()
            net.bytebuddy.implementation.bytecode.constant.FloatConstant.SIZE = r0
            return
    }

    FloatConstant(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.opcode = r3
            return
    }

    public static /* synthetic */ net.bytebuddy.implementation.bytecode.StackManipulation.Size access$000() {
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = net.bytebuddy.implementation.bytecode.constant.FloatConstant.SIZE
            return r0
    }

    public static net.bytebuddy.implementation.bytecode.StackManipulation forValue(float r1) {
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L8
            net.bytebuddy.implementation.bytecode.constant.FloatConstant r1 = net.bytebuddy.implementation.bytecode.constant.FloatConstant.ZERO
            return r1
        L8:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L11
            net.bytebuddy.implementation.bytecode.constant.FloatConstant r1 = net.bytebuddy.implementation.bytecode.constant.FloatConstant.ONE
            return r1
        L11:
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L1a
            net.bytebuddy.implementation.bytecode.constant.FloatConstant r1 = net.bytebuddy.implementation.bytecode.constant.FloatConstant.TWO
            return r1
        L1a:
            net.bytebuddy.implementation.bytecode.constant.FloatConstant$ConstantPool r0 = new net.bytebuddy.implementation.bytecode.constant.FloatConstant$ConstantPool
            r0.<init>(r1)
            return r0
    }

    public static net.bytebuddy.implementation.bytecode.constant.FloatConstant valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bytecode.constant.FloatConstant> r0 = net.bytebuddy.implementation.bytecode.constant.FloatConstant.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bytecode.constant.FloatConstant r1 = (net.bytebuddy.implementation.bytecode.constant.FloatConstant) r1
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.constant.FloatConstant[] values() {
            net.bytebuddy.implementation.bytecode.constant.FloatConstant[] r0 = net.bytebuddy.implementation.bytecode.constant.FloatConstant.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bytecode.constant.FloatConstant[] r0 = (net.bytebuddy.implementation.bytecode.constant.FloatConstant[]) r0
            return r0
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2) {
            r0 = this;
            int r2 = r0.opcode
            r1.visitInsn(r2)
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r1 = net.bytebuddy.implementation.bytecode.constant.FloatConstant.SIZE
            return r1
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
            r1 = this;
            r0 = 1
            return r0
    }
}
