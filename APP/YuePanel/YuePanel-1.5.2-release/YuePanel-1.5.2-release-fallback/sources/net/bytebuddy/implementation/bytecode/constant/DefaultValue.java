package net.bytebuddy.implementation.bytecode.constant;

/* JADX INFO: loaded from: classes2.dex */
public enum DefaultValue extends java.lang.Enum<net.bytebuddy.implementation.bytecode.constant.DefaultValue> implements net.bytebuddy.implementation.bytecode.StackManipulation {
    private static final /* synthetic */ net.bytebuddy.implementation.bytecode.constant.DefaultValue[] $VALUES = null;
    public static final net.bytebuddy.implementation.bytecode.constant.DefaultValue DOUBLE = null;
    public static final net.bytebuddy.implementation.bytecode.constant.DefaultValue FLOAT = null;
    public static final net.bytebuddy.implementation.bytecode.constant.DefaultValue INTEGER = null;
    public static final net.bytebuddy.implementation.bytecode.constant.DefaultValue LONG = null;
    public static final net.bytebuddy.implementation.bytecode.constant.DefaultValue REFERENCE = null;
    public static final net.bytebuddy.implementation.bytecode.constant.DefaultValue VOID = null;
    private final net.bytebuddy.implementation.bytecode.StackManipulation stackManipulation;

    static {
            net.bytebuddy.implementation.bytecode.constant.DefaultValue r0 = new net.bytebuddy.implementation.bytecode.constant.DefaultValue
            r1 = 0
            net.bytebuddy.implementation.bytecode.constant.IntegerConstant r2 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.ZERO
            java.lang.String r3 = "INTEGER"
            r0.<init>(r3, r1, r2)
            net.bytebuddy.implementation.bytecode.constant.DefaultValue.INTEGER = r0
            net.bytebuddy.implementation.bytecode.constant.DefaultValue r1 = new net.bytebuddy.implementation.bytecode.constant.DefaultValue
            r2 = 1
            net.bytebuddy.implementation.bytecode.constant.LongConstant r3 = net.bytebuddy.implementation.bytecode.constant.LongConstant.ZERO
            java.lang.String r4 = "LONG"
            r1.<init>(r4, r2, r3)
            net.bytebuddy.implementation.bytecode.constant.DefaultValue.LONG = r1
            net.bytebuddy.implementation.bytecode.constant.DefaultValue r2 = new net.bytebuddy.implementation.bytecode.constant.DefaultValue
            r3 = 2
            net.bytebuddy.implementation.bytecode.constant.FloatConstant r4 = net.bytebuddy.implementation.bytecode.constant.FloatConstant.ZERO
            java.lang.String r5 = "FLOAT"
            r2.<init>(r5, r3, r4)
            net.bytebuddy.implementation.bytecode.constant.DefaultValue.FLOAT = r2
            net.bytebuddy.implementation.bytecode.constant.DefaultValue r3 = new net.bytebuddy.implementation.bytecode.constant.DefaultValue
            r4 = 3
            net.bytebuddy.implementation.bytecode.constant.DoubleConstant r5 = net.bytebuddy.implementation.bytecode.constant.DoubleConstant.ZERO
            java.lang.String r6 = "DOUBLE"
            r3.<init>(r6, r4, r5)
            net.bytebuddy.implementation.bytecode.constant.DefaultValue.DOUBLE = r3
            net.bytebuddy.implementation.bytecode.constant.DefaultValue r4 = new net.bytebuddy.implementation.bytecode.constant.DefaultValue
            r5 = 4
            net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r6 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
            java.lang.String r7 = "VOID"
            r4.<init>(r7, r5, r6)
            net.bytebuddy.implementation.bytecode.constant.DefaultValue.VOID = r4
            net.bytebuddy.implementation.bytecode.constant.DefaultValue r5 = new net.bytebuddy.implementation.bytecode.constant.DefaultValue
            r6 = 5
            net.bytebuddy.implementation.bytecode.constant.NullConstant r7 = net.bytebuddy.implementation.bytecode.constant.NullConstant.INSTANCE
            java.lang.String r8 = "REFERENCE"
            r5.<init>(r8, r6, r7)
            net.bytebuddy.implementation.bytecode.constant.DefaultValue.REFERENCE = r5
            net.bytebuddy.implementation.bytecode.constant.DefaultValue[] r0 = new net.bytebuddy.implementation.bytecode.constant.DefaultValue[]{r0, r1, r2, r3, r4, r5}
            net.bytebuddy.implementation.bytecode.constant.DefaultValue.$VALUES = r0
            return
    }

    DefaultValue(java.lang.String r1, int r2, net.bytebuddy.implementation.bytecode.StackManipulation r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.stackManipulation = r3
            return
    }

    public static net.bytebuddy.implementation.bytecode.StackManipulation of(net.bytebuddy.description.type.TypeDefinition r1) {
            boolean r0 = r1.isPrimitive()
            if (r0 == 0) goto L35
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = r1.represents(r0)
            if (r0 == 0) goto L11
            net.bytebuddy.implementation.bytecode.constant.DefaultValue r1 = net.bytebuddy.implementation.bytecode.constant.DefaultValue.LONG
            return r1
        L11:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r0 = r1.represents(r0)
            if (r0 == 0) goto L1c
            net.bytebuddy.implementation.bytecode.constant.DefaultValue r1 = net.bytebuddy.implementation.bytecode.constant.DefaultValue.DOUBLE
            return r1
        L1c:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = r1.represents(r0)
            if (r0 == 0) goto L27
            net.bytebuddy.implementation.bytecode.constant.DefaultValue r1 = net.bytebuddy.implementation.bytecode.constant.DefaultValue.FLOAT
            return r1
        L27:
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r1 = r1.represents(r0)
            if (r1 == 0) goto L32
            net.bytebuddy.implementation.bytecode.constant.DefaultValue r1 = net.bytebuddy.implementation.bytecode.constant.DefaultValue.VOID
            return r1
        L32:
            net.bytebuddy.implementation.bytecode.constant.DefaultValue r1 = net.bytebuddy.implementation.bytecode.constant.DefaultValue.INTEGER
            return r1
        L35:
            net.bytebuddy.implementation.bytecode.constant.DefaultValue r1 = net.bytebuddy.implementation.bytecode.constant.DefaultValue.REFERENCE
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.constant.DefaultValue valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bytecode.constant.DefaultValue> r0 = net.bytebuddy.implementation.bytecode.constant.DefaultValue.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bytecode.constant.DefaultValue r1 = (net.bytebuddy.implementation.bytecode.constant.DefaultValue) r1
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.constant.DefaultValue[] values() {
            net.bytebuddy.implementation.bytecode.constant.DefaultValue[] r0 = net.bytebuddy.implementation.bytecode.constant.DefaultValue.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bytecode.constant.DefaultValue[] r0 = (net.bytebuddy.implementation.bytecode.constant.DefaultValue[]) r0
            return r0
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.Implementation.Context r3) {
            r1 = this;
            net.bytebuddy.implementation.bytecode.StackManipulation r0 = r1.stackManipulation
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = r0.apply(r2, r3)
            return r2
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
            r1 = this;
            net.bytebuddy.implementation.bytecode.StackManipulation r0 = r1.stackManipulation
            boolean r0 = r0.isValid()
            return r0
    }
}
