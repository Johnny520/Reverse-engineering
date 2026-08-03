package net.bytebuddy.implementation.bytecode.constant;

/* JADX INFO: loaded from: classes2.dex */
public enum ClassConstant extends java.lang.Enum<net.bytebuddy.implementation.bytecode.constant.ClassConstant> implements net.bytebuddy.implementation.bytecode.StackManipulation {
    private static final /* synthetic */ net.bytebuddy.implementation.bytecode.constant.ClassConstant[] $VALUES = null;
    public static final net.bytebuddy.implementation.bytecode.constant.ClassConstant BOOLEAN = null;
    public static final net.bytebuddy.implementation.bytecode.constant.ClassConstant BYTE = null;
    public static final net.bytebuddy.implementation.bytecode.constant.ClassConstant CHARACTER = null;
    private static final java.lang.String CLASS_TYPE_INTERNAL_NAME = "Ljava/lang/Class;";
    public static final net.bytebuddy.implementation.bytecode.constant.ClassConstant DOUBLE = null;
    public static final net.bytebuddy.implementation.bytecode.constant.ClassConstant FLOAT = null;
    public static final net.bytebuddy.implementation.bytecode.constant.ClassConstant INTEGER = null;
    public static final net.bytebuddy.implementation.bytecode.constant.ClassConstant LONG = null;
    private static final java.lang.String PRIMITIVE_TYPE_FIELD = "TYPE";
    public static final net.bytebuddy.implementation.bytecode.constant.ClassConstant SHORT = null;
    private static final net.bytebuddy.implementation.bytecode.StackManipulation.Size SIZE = null;
    public static final net.bytebuddy.implementation.bytecode.constant.ClassConstant VOID = null;
    private final java.lang.String fieldOwnerInternalName;

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForReferenceType implements net.bytebuddy.implementation.bytecode.StackManipulation {
        private final net.bytebuddy.description.type.TypeDescription typeDescription;

        public ForReferenceType(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                r0.<init>()
                r0.typeDescription = r1
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r7, net.bytebuddy.implementation.Implementation.Context r8) {
                r6 = this;
                net.bytebuddy.ClassFileVersion r0 = r8.getClassFileVersion()
                net.bytebuddy.ClassFileVersion r1 = net.bytebuddy.ClassFileVersion.JAVA_V5
                boolean r0 = r0.isAtLeast(r1)
                if (r0 == 0) goto L26
                net.bytebuddy.description.type.TypeDescription r0 = r6.typeDescription
                net.bytebuddy.description.type.TypeDescription r8 = r8.getInstrumentedType()
                boolean r8 = r0.isVisibleTo(r8)
                if (r8 == 0) goto L26
                net.bytebuddy.description.type.TypeDescription r8 = r6.typeDescription
                java.lang.String r8 = r8.getDescriptor()
                net.bytebuddy.jar.asm.Type r8 = net.bytebuddy.jar.asm.Type.getType(r8)
                r7.visitLdcInsn(r8)
                goto L3c
            L26:
                net.bytebuddy.description.type.TypeDescription r8 = r6.typeDescription
                java.lang.String r8 = r8.getName()
                r7.visitLdcInsn(r8)
                java.lang.String r4 = "(Ljava/lang/String;)Ljava/lang/Class;"
                r5 = 0
                r1 = 184(0xb8, float:2.58E-43)
                java.lang.String r2 = "java/lang/Class"
                java.lang.String r3 = "forName"
                r0 = r7
                r0.visitMethodInsn(r1, r2, r3, r4, r5)
            L3c:
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r7 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.access$000()
                return r7
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
                net.bytebuddy.description.type.TypeDescription r2 = r4.typeDescription
                net.bytebuddy.implementation.bytecode.constant.ClassConstant$ForReferenceType r5 = (net.bytebuddy.implementation.bytecode.constant.ClassConstant.ForReferenceType) r5
                net.bytebuddy.description.type.TypeDescription r5 = r5.typeDescription
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L20
                return r1
            L20:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    static {
            net.bytebuddy.implementation.bytecode.constant.ClassConstant r0 = new net.bytebuddy.implementation.bytecode.constant.ClassConstant
            r1 = 0
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            java.lang.String r3 = "VOID"
            r0.<init>(r3, r1, r2)
            net.bytebuddy.implementation.bytecode.constant.ClassConstant.VOID = r0
            net.bytebuddy.implementation.bytecode.constant.ClassConstant r1 = new net.bytebuddy.implementation.bytecode.constant.ClassConstant
            r2 = 1
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            java.lang.String r4 = "BOOLEAN"
            r1.<init>(r4, r2, r3)
            net.bytebuddy.implementation.bytecode.constant.ClassConstant.BOOLEAN = r1
            net.bytebuddy.implementation.bytecode.constant.ClassConstant r2 = new net.bytebuddy.implementation.bytecode.constant.ClassConstant
            r3 = 2
            java.lang.Class<java.lang.Byte> r4 = java.lang.Byte.class
            java.lang.String r5 = "BYTE"
            r2.<init>(r5, r3, r4)
            net.bytebuddy.implementation.bytecode.constant.ClassConstant.BYTE = r2
            net.bytebuddy.implementation.bytecode.constant.ClassConstant r3 = new net.bytebuddy.implementation.bytecode.constant.ClassConstant
            r4 = 3
            java.lang.Class<java.lang.Short> r5 = java.lang.Short.class
            java.lang.String r6 = "SHORT"
            r3.<init>(r6, r4, r5)
            net.bytebuddy.implementation.bytecode.constant.ClassConstant.SHORT = r3
            net.bytebuddy.implementation.bytecode.constant.ClassConstant r4 = new net.bytebuddy.implementation.bytecode.constant.ClassConstant
            r5 = 4
            java.lang.Class<java.lang.Character> r6 = java.lang.Character.class
            java.lang.String r7 = "CHARACTER"
            r4.<init>(r7, r5, r6)
            net.bytebuddy.implementation.bytecode.constant.ClassConstant.CHARACTER = r4
            net.bytebuddy.implementation.bytecode.constant.ClassConstant r5 = new net.bytebuddy.implementation.bytecode.constant.ClassConstant
            r6 = 5
            java.lang.Class<java.lang.Integer> r7 = java.lang.Integer.class
            java.lang.String r8 = "INTEGER"
            r5.<init>(r8, r6, r7)
            net.bytebuddy.implementation.bytecode.constant.ClassConstant.INTEGER = r5
            net.bytebuddy.implementation.bytecode.constant.ClassConstant r6 = new net.bytebuddy.implementation.bytecode.constant.ClassConstant
            r7 = 6
            java.lang.Class<java.lang.Long> r8 = java.lang.Long.class
            java.lang.String r9 = "LONG"
            r6.<init>(r9, r7, r8)
            net.bytebuddy.implementation.bytecode.constant.ClassConstant.LONG = r6
            net.bytebuddy.implementation.bytecode.constant.ClassConstant r7 = new net.bytebuddy.implementation.bytecode.constant.ClassConstant
            r8 = 7
            java.lang.Class<java.lang.Float> r9 = java.lang.Float.class
            java.lang.String r10 = "FLOAT"
            r7.<init>(r10, r8, r9)
            net.bytebuddy.implementation.bytecode.constant.ClassConstant.FLOAT = r7
            net.bytebuddy.implementation.bytecode.constant.ClassConstant r8 = new net.bytebuddy.implementation.bytecode.constant.ClassConstant
            r9 = 8
            java.lang.Class<java.lang.Double> r10 = java.lang.Double.class
            java.lang.String r11 = "DOUBLE"
            r8.<init>(r11, r9, r10)
            net.bytebuddy.implementation.bytecode.constant.ClassConstant.DOUBLE = r8
            net.bytebuddy.implementation.bytecode.constant.ClassConstant[] r0 = new net.bytebuddy.implementation.bytecode.constant.ClassConstant[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            net.bytebuddy.implementation.bytecode.constant.ClassConstant.$VALUES = r0
            net.bytebuddy.implementation.bytecode.StackSize r0 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = r0.toIncreasingSize()
            net.bytebuddy.implementation.bytecode.constant.ClassConstant.SIZE = r0
            return
    }

    ClassConstant(java.lang.String r1, int r2, java.lang.Class r3) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.String r1 = net.bytebuddy.jar.asm.Type.getInternalName(r3)
            r0.fieldOwnerInternalName = r1
            return
    }

    public static /* synthetic */ net.bytebuddy.implementation.bytecode.StackManipulation.Size access$000() {
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.SIZE
            return r0
    }

    public static net.bytebuddy.implementation.bytecode.StackManipulation of(net.bytebuddy.description.type.TypeDescription r1) {
            boolean r0 = r1.isPrimitive()
            if (r0 != 0) goto Lc
            net.bytebuddy.implementation.bytecode.constant.ClassConstant$ForReferenceType r0 = new net.bytebuddy.implementation.bytecode.constant.ClassConstant$ForReferenceType
            r0.<init>(r1)
            return r0
        Lc:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = r1.represents(r0)
            if (r0 == 0) goto L17
            net.bytebuddy.implementation.bytecode.constant.ClassConstant r1 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.BOOLEAN
            return r1
        L17:
            java.lang.Class r0 = java.lang.Byte.TYPE
            boolean r0 = r1.represents(r0)
            if (r0 == 0) goto L22
            net.bytebuddy.implementation.bytecode.constant.ClassConstant r1 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.BYTE
            return r1
        L22:
            java.lang.Class r0 = java.lang.Short.TYPE
            boolean r0 = r1.represents(r0)
            if (r0 == 0) goto L2d
            net.bytebuddy.implementation.bytecode.constant.ClassConstant r1 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.SHORT
            return r1
        L2d:
            java.lang.Class r0 = java.lang.Character.TYPE
            boolean r0 = r1.represents(r0)
            if (r0 == 0) goto L38
            net.bytebuddy.implementation.bytecode.constant.ClassConstant r1 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.CHARACTER
            return r1
        L38:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r1.represents(r0)
            if (r0 == 0) goto L43
            net.bytebuddy.implementation.bytecode.constant.ClassConstant r1 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.INTEGER
            return r1
        L43:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = r1.represents(r0)
            if (r0 == 0) goto L4e
            net.bytebuddy.implementation.bytecode.constant.ClassConstant r1 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.LONG
            return r1
        L4e:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = r1.represents(r0)
            if (r0 == 0) goto L59
            net.bytebuddy.implementation.bytecode.constant.ClassConstant r1 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.FLOAT
            return r1
        L59:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r1 = r1.represents(r0)
            if (r1 == 0) goto L64
            net.bytebuddy.implementation.bytecode.constant.ClassConstant r1 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.DOUBLE
            return r1
        L64:
            net.bytebuddy.implementation.bytecode.constant.ClassConstant r1 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.VOID
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.constant.ClassConstant valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bytecode.constant.ClassConstant> r0 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bytecode.constant.ClassConstant r1 = (net.bytebuddy.implementation.bytecode.constant.ClassConstant) r1
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.constant.ClassConstant[] values() {
            net.bytebuddy.implementation.bytecode.constant.ClassConstant[] r0 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bytecode.constant.ClassConstant[] r0 = (net.bytebuddy.implementation.bytecode.constant.ClassConstant[]) r0
            return r0
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r4, net.bytebuddy.implementation.Implementation.Context r5) {
            r3 = this;
            java.lang.String r5 = r3.fieldOwnerInternalName
            java.lang.String r0 = "TYPE"
            java.lang.String r1 = "Ljava/lang/Class;"
            r2 = 178(0xb2, float:2.5E-43)
            r4.visitFieldInsn(r2, r5, r0, r1)
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r4 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.SIZE
            return r4
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
            r1 = this;
            r0 = 1
            return r0
    }
}
