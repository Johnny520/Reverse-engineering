package net.bytebuddy.implementation.bytecode.assign.primitive;

/* JADX INFO: loaded from: classes2.dex */
public enum PrimitiveUnboxingDelegate extends java.lang.Enum<net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate> implements net.bytebuddy.implementation.bytecode.StackManipulation {
    private static final /* synthetic */ net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate[] $VALUES = null;
    public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate BOOLEAN = null;
    public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate BYTE = null;
    public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate CHARACTER = null;
    public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate DOUBLE = null;
    public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate FLOAT = null;
    public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate INTEGER = null;
    public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate LONG = null;
    public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate SHORT = null;
    private final net.bytebuddy.description.type.TypeDescription primitiveType;
    private final net.bytebuddy.implementation.bytecode.StackManipulation.Size size;
    private final java.lang.String unboxingMethodDescriptor;
    private final java.lang.String unboxingMethodName;
    private final net.bytebuddy.description.type.TypeDescription wrapperType;

    public enum ExplicitlyTypedUnboxingResponsible extends java.lang.Enum<net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible> implements net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.UnboxingResponsible {
        private static final /* synthetic */ net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible[] $VALUES = null;
        public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible BOOLEAN = null;
        public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible BYTE = null;
        public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible CHARACTER = null;
        public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible DOUBLE = null;
        public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible FLOAT = null;
        public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible INTEGER = null;
        public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible LONG = null;
        public static final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible SHORT = null;
        private final net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate primitiveUnboxingDelegate;

        static {
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ExplicitlyTypedUnboxingResponsible r0 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ExplicitlyTypedUnboxingResponsible
                r1 = 0
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate r2 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.BOOLEAN
                java.lang.String r3 = "BOOLEAN"
                r0.<init>(r3, r1, r2)
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible.BOOLEAN = r0
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ExplicitlyTypedUnboxingResponsible r1 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ExplicitlyTypedUnboxingResponsible
                r2 = 1
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.BYTE
                java.lang.String r4 = "BYTE"
                r1.<init>(r4, r2, r3)
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible.BYTE = r1
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ExplicitlyTypedUnboxingResponsible r2 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ExplicitlyTypedUnboxingResponsible
                r3 = 2
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate r4 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.SHORT
                java.lang.String r5 = "SHORT"
                r2.<init>(r5, r3, r4)
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible.SHORT = r2
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ExplicitlyTypedUnboxingResponsible r3 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ExplicitlyTypedUnboxingResponsible
                r4 = 3
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate r5 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.CHARACTER
                java.lang.String r6 = "CHARACTER"
                r3.<init>(r6, r4, r5)
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible.CHARACTER = r3
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ExplicitlyTypedUnboxingResponsible r4 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ExplicitlyTypedUnboxingResponsible
                r5 = 4
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate r6 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.INTEGER
                java.lang.String r7 = "INTEGER"
                r4.<init>(r7, r5, r6)
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible.INTEGER = r4
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ExplicitlyTypedUnboxingResponsible r5 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ExplicitlyTypedUnboxingResponsible
                r6 = 5
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate r7 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.LONG
                java.lang.String r8 = "LONG"
                r5.<init>(r8, r6, r7)
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible.LONG = r5
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ExplicitlyTypedUnboxingResponsible r6 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ExplicitlyTypedUnboxingResponsible
                r7 = 6
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate r8 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.FLOAT
                java.lang.String r9 = "FLOAT"
                r6.<init>(r9, r7, r8)
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible.FLOAT = r6
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ExplicitlyTypedUnboxingResponsible r7 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ExplicitlyTypedUnboxingResponsible
                r8 = 7
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate r9 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.DOUBLE
                java.lang.String r10 = "DOUBLE"
                r7.<init>(r10, r8, r9)
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible.DOUBLE = r7
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ExplicitlyTypedUnboxingResponsible[] r0 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible[]{r0, r1, r2, r3, r4, r5, r6, r7}
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible.$VALUES = r0
                return
        }

        ExplicitlyTypedUnboxingResponsible(java.lang.String r1, int r2, net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.primitiveUnboxingDelegate = r3
                return
        }

        public static net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ExplicitlyTypedUnboxingResponsible> r0 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ExplicitlyTypedUnboxingResponsible r1 = (net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible) r1
                return r1
        }

        public static net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible[] values() {
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ExplicitlyTypedUnboxingResponsible[] r0 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ExplicitlyTypedUnboxingResponsible[] r0 = (net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.UnboxingResponsible
        public net.bytebuddy.implementation.bytecode.StackManipulation assignUnboxedTo(net.bytebuddy.description.type.TypeDescription.Generic r3, net.bytebuddy.implementation.bytecode.assign.Assigner r4, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r5) {
                r2 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r4 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate r5 = r2.primitiveUnboxingDelegate
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.access$000(r5)
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate r0 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveWideningDelegate.forPrimitive(r0)
                net.bytebuddy.implementation.bytecode.StackManipulation r3 = r0.widenTo(r3)
                r0 = 2
                net.bytebuddy.implementation.bytecode.StackManipulation[] r0 = new net.bytebuddy.implementation.bytecode.StackManipulation[r0]
                r1 = 0
                r0[r1] = r5
                r5 = 1
                r0[r5] = r3
                r4.<init>(r0)
                return r4
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ImplicitlyTypedUnboxingResponsible implements net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.UnboxingResponsible {
        private final net.bytebuddy.description.type.TypeDescription.Generic originalType;

        public ImplicitlyTypedUnboxingResponsible(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                r0 = this;
                r0.<init>()
                r0.originalType = r1
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.UnboxingResponsible
        public net.bytebuddy.implementation.bytecode.StackManipulation assignUnboxedTo(net.bytebuddy.description.type.TypeDescription.Generic r4, net.bytebuddy.implementation.bytecode.assign.Assigner r5, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r6) {
                r3 = this;
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate r4 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.forPrimitive(r4)
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r3.originalType
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.getWrapperType()
                net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.assign(r1, r2, r6)
                r6 = 2
                net.bytebuddy.implementation.bytecode.StackManipulation[] r6 = new net.bytebuddy.implementation.bytecode.StackManipulation[r6]
                r1 = 0
                r6[r1] = r5
                r5 = 1
                r6[r5] = r4
                r0.<init>(r6)
                return r0
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
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.originalType
                net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ImplicitlyTypedUnboxingResponsible r5 = (net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ImplicitlyTypedUnboxingResponsible) r5
                net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.originalType
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
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.originalType
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    public interface UnboxingResponsible {
        net.bytebuddy.implementation.bytecode.StackManipulation assignUnboxedTo(net.bytebuddy.description.type.TypeDescription.Generic r1, net.bytebuddy.implementation.bytecode.assign.Assigner r2, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3);
    }

    static {
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate r8 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate
            java.lang.Class r4 = java.lang.Boolean.TYPE
            net.bytebuddy.implementation.bytecode.StackSize r17 = net.bytebuddy.implementation.bytecode.StackSize.ZERO
            java.lang.String r6 = "booleanValue"
            java.lang.String r7 = "()Z"
            java.lang.String r1 = "BOOLEAN"
            r2 = 0
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            r0 = r8
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.BOOLEAN = r8
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate r1 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate
            java.lang.Class r13 = java.lang.Byte.TYPE
            java.lang.String r15 = "byteValue"
            java.lang.String r16 = "()B"
            java.lang.String r10 = "BYTE"
            r11 = 1
            java.lang.Class<java.lang.Byte> r12 = java.lang.Byte.class
            r9 = r1
            r14 = r17
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.BYTE = r1
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate r2 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate
            java.lang.Class r13 = java.lang.Short.TYPE
            java.lang.String r15 = "shortValue"
            java.lang.String r16 = "()S"
            java.lang.String r10 = "SHORT"
            r11 = 2
            java.lang.Class<java.lang.Short> r12 = java.lang.Short.class
            r9 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.SHORT = r2
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate r3 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate
            java.lang.Class r13 = java.lang.Character.TYPE
            java.lang.String r15 = "charValue"
            java.lang.String r16 = "()C"
            java.lang.String r10 = "CHARACTER"
            r11 = 3
            java.lang.Class<java.lang.Character> r12 = java.lang.Character.class
            r9 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.CHARACTER = r3
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate r4 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate
            java.lang.Class r13 = java.lang.Integer.TYPE
            java.lang.String r15 = "intValue"
            java.lang.String r16 = "()I"
            java.lang.String r10 = "INTEGER"
            r11 = 4
            java.lang.Class<java.lang.Integer> r12 = java.lang.Integer.class
            r9 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.INTEGER = r4
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate r5 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate
            java.lang.Class r22 = java.lang.Long.TYPE
            net.bytebuddy.implementation.bytecode.StackSize r0 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
            java.lang.String r24 = "longValue"
            java.lang.String r25 = "()J"
            java.lang.String r19 = "LONG"
            r20 = 5
            java.lang.Class<java.lang.Long> r21 = java.lang.Long.class
            r18 = r5
            r23 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.LONG = r5
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate r6 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate
            java.lang.Class r13 = java.lang.Float.TYPE
            java.lang.String r15 = "floatValue"
            java.lang.String r16 = "()F"
            java.lang.String r10 = "FLOAT"
            r11 = 6
            java.lang.Class<java.lang.Float> r12 = java.lang.Float.class
            r9 = r6
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.FLOAT = r6
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate r7 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate
            java.lang.Class r13 = java.lang.Double.TYPE
            java.lang.String r15 = "doubleValue"
            java.lang.String r16 = "()D"
            java.lang.String r10 = "DOUBLE"
            r11 = 7
            java.lang.Class<java.lang.Double> r12 = java.lang.Double.class
            r9 = r7
            r14 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.DOUBLE = r7
            r0 = r8
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate[] r0 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate[]{r0, r1, r2, r3, r4, r5, r6, r7}
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.$VALUES = r0
            return
    }

    PrimitiveUnboxingDelegate(java.lang.String r1, int r2, java.lang.Class r3, java.lang.Class r4, net.bytebuddy.implementation.bytecode.StackSize r5, java.lang.String r6, java.lang.String r7) {
            r0 = this;
            r0.<init>(r1, r2)
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r1 = r5.toIncreasingSize()
            r0.size = r1
            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r3)
            r0.wrapperType = r1
            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r4)
            r0.primitiveType = r1
            r0.unboxingMethodName = r6
            r0.unboxingMethodDescriptor = r7
            return
    }

    public static /* synthetic */ net.bytebuddy.description.type.TypeDescription access$000(net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate r0) {
            net.bytebuddy.description.type.TypeDescription r0 = r0.primitiveType
            return r0
    }

    public static net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate forPrimitive(net.bytebuddy.description.type.TypeDefinition r3) {
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto Lb
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.BOOLEAN
            return r3
        Lb:
            java.lang.Class r0 = java.lang.Byte.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L16
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.BYTE
            return r3
        L16:
            java.lang.Class r0 = java.lang.Short.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L21
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.SHORT
            return r3
        L21:
            java.lang.Class r0 = java.lang.Character.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L2c
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.CHARACTER
            return r3
        L2c:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L37
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.INTEGER
            return r3
        L37:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L42
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.LONG
            return r3
        L42:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L4d
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.FLOAT
            return r3
        L4d:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L58
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.DOUBLE
            return r3
        L58:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected non-void primitive type instead of "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.UnboxingResponsible forReferenceType(net.bytebuddy.description.type.TypeDefinition r3) {
            boolean r0 = r3.isPrimitive()
            if (r0 != 0) goto L68
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L11
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ExplicitlyTypedUnboxingResponsible r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible.BOOLEAN
            return r3
        L11:
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L1c
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ExplicitlyTypedUnboxingResponsible r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible.BYTE
            return r3
        L1c:
            java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L27
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ExplicitlyTypedUnboxingResponsible r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible.SHORT
            return r3
        L27:
            java.lang.Class<java.lang.Character> r0 = java.lang.Character.class
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L32
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ExplicitlyTypedUnboxingResponsible r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible.CHARACTER
            return r3
        L32:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L3d
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ExplicitlyTypedUnboxingResponsible r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible.INTEGER
            return r3
        L3d:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L48
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ExplicitlyTypedUnboxingResponsible r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible.LONG
            return r3
        L48:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L53
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ExplicitlyTypedUnboxingResponsible r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible.FLOAT
            return r3
        L53:
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L5e
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ExplicitlyTypedUnboxingResponsible r3 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.ExplicitlyTypedUnboxingResponsible.DOUBLE
            return r3
        L5e:
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ImplicitlyTypedUnboxingResponsible r0 = new net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate$ImplicitlyTypedUnboxingResponsible
            net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.asGenericType()
            r0.<init>(r3)
            return r0
        L68:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected reference type instead of "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate> r0 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate r1 = (net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate) r1
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate[] values() {
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate[] r0 = net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate[] r0 = (net.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate[]) r0
            return r0
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r7, net.bytebuddy.implementation.Implementation.Context r8) {
            r6 = this;
            net.bytebuddy.description.type.TypeDescription r8 = r6.wrapperType
            net.bytebuddy.description.type.TypeDescription r8 = r8.asErasure()
            java.lang.String r2 = r8.getInternalName()
            java.lang.String r3 = r6.unboxingMethodName
            java.lang.String r4 = r6.unboxingMethodDescriptor
            r5 = 0
            r1 = 182(0xb6, float:2.55E-43)
            r0 = r7
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r7 = r6.size
            return r7
    }

    public net.bytebuddy.description.type.TypeDescription.Generic getWrapperType() {
            r1 = this;
            net.bytebuddy.description.type.TypeDescription r0 = r1.wrapperType
            net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.asGenericType()
            return r0
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
            r1 = this;
            r0 = 1
            return r0
    }
}
