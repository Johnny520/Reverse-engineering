package net.bytebuddy.implementation.bytecode.assign.primitive;

/* JADX INFO: loaded from: classes2.dex */
public enum PrimitiveBoxingDelegate extends java.lang.Enum<net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate> {
    private static final /* synthetic */ net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate[] $VALUES = null;
    public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate BOOLEAN = null;
    public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate BYTE = null;
    public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate CHARACTER = null;
    public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate DOUBLE = null;
    public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate FLOAT = null;
    public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate INTEGER = null;
    public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate LONG = null;
    public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate SHORT = null;
    private final java.lang.String boxingMethodDescriptor;
    private final java.lang.String boxingMethodName;
    private final net.bytebuddy.implementation.bytecode.StackManipulation.Size size;
    private final net.bytebuddy.description.type.TypeDescription wrapperType;

    public class BoxingStackManipulation implements net.bytebuddy.implementation.bytecode.StackManipulation {
        private final net.bytebuddy.implementation.bytecode.StackManipulation stackManipulation;
        final /* synthetic */ net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate this$0;

        public BoxingStackManipulation(net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate r1, net.bytebuddy.implementation.bytecode.StackManipulation r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.stackManipulation = r2
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r8, net.bytebuddy.implementation.Implementation.Context r9) {
                r7 = this;
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate r0 = r7.this$0
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate.access$000(r0)
                java.lang.String r3 = r0.getInternalName()
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate r0 = r7.this$0
                java.lang.String r4 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate.access$100(r0)
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate r0 = r7.this$0
                java.lang.String r5 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate.access$200(r0)
                r6 = 0
                r2 = 184(0xb8, float:2.58E-43)
                r1 = r8
                r1.visitMethodInsn(r2, r3, r4, r5, r6)
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate r0 = r7.this$0
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate.access$300(r0)
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = r7.stackManipulation
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r8 = r1.apply(r8, r9)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r8 = r0.aggregate(r8)
                return r8
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
                r1 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = r1.stackManipulation
                boolean r0 = r0.isValid()
                return r0
        }
    }

    static {
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate r7 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate
            net.bytebuddy.implementation.bytecode.StackSize r8 = net.bytebuddy.implementation.bytecode.StackSize.ZERO
            java.lang.String r5 = "valueOf"
            java.lang.String r6 = "(Z)Ljava/lang/Boolean;"
            java.lang.String r1 = "BOOLEAN"
            r2 = 0
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            r0 = r7
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate.BOOLEAN = r7
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate r9 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate
            java.lang.String r5 = "valueOf"
            java.lang.String r6 = "(B)Ljava/lang/Byte;"
            java.lang.String r1 = "BYTE"
            r2 = 1
            java.lang.Class<java.lang.Byte> r3 = java.lang.Byte.class
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate.BYTE = r9
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate r10 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate
            java.lang.String r5 = "valueOf"
            java.lang.String r6 = "(S)Ljava/lang/Short;"
            java.lang.String r1 = "SHORT"
            r2 = 2
            java.lang.Class<java.lang.Short> r3 = java.lang.Short.class
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate.SHORT = r10
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate r11 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate
            java.lang.String r5 = "valueOf"
            java.lang.String r6 = "(C)Ljava/lang/Character;"
            java.lang.String r1 = "CHARACTER"
            r2 = 3
            java.lang.Class<java.lang.Character> r3 = java.lang.Character.class
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate.CHARACTER = r11
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate r12 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate
            java.lang.String r5 = "valueOf"
            java.lang.String r6 = "(I)Ljava/lang/Integer;"
            java.lang.String r1 = "INTEGER"
            r2 = 4
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate.INTEGER = r12
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate r20 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate
            net.bytebuddy.implementation.bytecode.StackSize r21 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
            java.lang.String r18 = "valueOf"
            java.lang.String r19 = "(J)Ljava/lang/Long;"
            java.lang.String r14 = "LONG"
            r15 = 5
            java.lang.Class<java.lang.Long> r16 = java.lang.Long.class
            r13 = r20
            r17 = r21
            r13.<init>(r14, r15, r16, r17, r18, r19)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate.LONG = r20
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate r13 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate
            java.lang.String r5 = "valueOf"
            java.lang.String r6 = "(F)Ljava/lang/Float;"
            java.lang.String r1 = "FLOAT"
            r2 = 6
            java.lang.Class<java.lang.Float> r3 = java.lang.Float.class
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate.FLOAT = r13
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate r8 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate
            java.lang.String r5 = "valueOf"
            java.lang.String r6 = "(D)Ljava/lang/Double;"
            java.lang.String r1 = "DOUBLE"
            r2 = 7
            java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
            r0 = r8
            r4 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate.DOUBLE = r8
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r20
            r6 = r13
            r7 = r8
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate[] r0 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate[]{r0, r1, r2, r3, r4, r5, r6, r7}
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate.$VALUES = r0
            return
    }

    PrimitiveBoxingDelegate(java.lang.String r1, int r2, java.lang.Class r3, net.bytebuddy.implementation.bytecode.StackSize r4, java.lang.String r5, java.lang.String r6) {
            r0 = this;
            r0.<init>(r1, r2)
            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r3)
            r0.wrapperType = r1
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r1 = r4.toDecreasingSize()
            r0.size = r1
            r0.boxingMethodName = r5
            r0.boxingMethodDescriptor = r6
            return
    }

    public static /* synthetic */ net.bytebuddy.description.type.TypeDescription access$000(net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate r0) {
            net.bytebuddy.description.type.TypeDescription r0 = r0.wrapperType
            return r0
    }

    public static /* synthetic */ java.lang.String access$100(net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate r0) {
            java.lang.String r0 = r0.boxingMethodName
            return r0
    }

    public static /* synthetic */ java.lang.String access$200(net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate r0) {
            java.lang.String r0 = r0.boxingMethodDescriptor
            return r0
    }

    public static /* synthetic */ net.bytebuddy.implementation.bytecode.StackManipulation.Size access$300(net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate r0) {
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = r0.size
            return r0
    }

    public static net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate forPrimitive(net.bytebuddy.description.type.TypeDefinition r3) {
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto Lb
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate.BOOLEAN
            return r3
        Lb:
            java.lang.Class r0 = java.lang.Byte.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L16
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate.BYTE
            return r3
        L16:
            java.lang.Class r0 = java.lang.Short.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L21
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate.SHORT
            return r3
        L21:
            java.lang.Class r0 = java.lang.Character.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L2c
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate.CHARACTER
            return r3
        L2c:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L37
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate.INTEGER
            return r3
        L37:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L42
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate.LONG
            return r3
        L42:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L4d
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate.FLOAT
            return r3
        L4d:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L58
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate.DOUBLE
            return r3
        L58:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Not a non-void, primitive type: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate> r0 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate r1 = (net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate) r1
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate[] values() {
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate[] r0 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate[] r0 = (net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate[]) r0
            return r0
    }

    public net.bytebuddy.implementation.bytecode.StackManipulation assignBoxedTo(net.bytebuddy.description.type.TypeDescription.Generic r3, net.bytebuddy.implementation.bytecode.assign.Assigner r4, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r5) {
            r2 = this;
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate$BoxingStackManipulation r0 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveBoxingDelegate$BoxingStackManipulation
            net.bytebuddy.description.type.TypeDescription r1 = r2.wrapperType
            net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.asGenericType()
            net.bytebuddy.implementation.bytecode.StackManipulation r3 = r4.assign(r1, r3, r5)
            r0.<init>(r2, r3)
            return r0
    }
}
