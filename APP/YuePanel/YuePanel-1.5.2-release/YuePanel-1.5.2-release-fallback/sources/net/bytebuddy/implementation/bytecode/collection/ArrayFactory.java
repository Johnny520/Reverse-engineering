package net.bytebuddy.implementation.bytecode.collection;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class ArrayFactory implements net.bytebuddy.implementation.bytecode.collection.CollectionFactory {
    private final net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator arrayCreator;
    private final net.bytebuddy.description.type.TypeDescription.Generic componentType;

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE)
    private final net.bytebuddy.implementation.bytecode.StackManipulation.Size sizeDecrease;

    public interface ArrayCreator extends net.bytebuddy.implementation.bytecode.StackManipulation {
        public static final net.bytebuddy.implementation.bytecode.StackManipulation.Size ARRAY_CREATION_SIZE_CHANGE = null;

        public enum ForPrimitiveType extends java.lang.Enum<net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType> implements net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator {
            private static final /* synthetic */ net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType[] $VALUES = null;
            public static final net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType BOOLEAN = null;
            public static final net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType BYTE = null;
            public static final net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType CHARACTER = null;
            public static final net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType DOUBLE = null;
            public static final net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType FLOAT = null;
            public static final net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType INTEGER = null;
            public static final net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType LONG = null;
            public static final net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType SHORT = null;
            private final int creationOpcode;
            private final int storageOpcode;

            static {
                    net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForPrimitiveType r0 = new net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForPrimitiveType
                    java.lang.String r1 = "BOOLEAN"
                    r2 = 0
                    r3 = 4
                    r4 = 84
                    r0.<init>(r1, r2, r3, r4)
                    net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType.BOOLEAN = r0
                    net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForPrimitiveType r1 = new net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForPrimitiveType
                    r2 = 1
                    r5 = 8
                    java.lang.String r6 = "BYTE"
                    r1.<init>(r6, r2, r5, r4)
                    net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType.BYTE = r1
                    net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForPrimitiveType r2 = new net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForPrimitiveType
                    r4 = 9
                    r5 = 86
                    java.lang.String r6 = "SHORT"
                    r7 = 2
                    r2.<init>(r6, r7, r4, r5)
                    net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType.SHORT = r2
                    net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForPrimitiveType r4 = new net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForPrimitiveType
                    r5 = 85
                    java.lang.String r6 = "CHARACTER"
                    r7 = 3
                    r8 = 5
                    r4.<init>(r6, r7, r8, r5)
                    net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType.CHARACTER = r4
                    net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForPrimitiveType r5 = new net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForPrimitiveType
                    r6 = 10
                    r7 = 79
                    java.lang.String r9 = "INTEGER"
                    r5.<init>(r9, r3, r6, r7)
                    net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType.INTEGER = r5
                    net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForPrimitiveType r6 = new net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForPrimitiveType
                    r3 = 11
                    r7 = 80
                    java.lang.String r9 = "LONG"
                    r6.<init>(r9, r8, r3, r7)
                    net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType.LONG = r6
                    net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForPrimitiveType r7 = new net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForPrimitiveType
                    r3 = 6
                    r8 = 81
                    java.lang.String r9 = "FLOAT"
                    r7.<init>(r9, r3, r3, r8)
                    net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType.FLOAT = r7
                    net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForPrimitiveType r8 = new net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForPrimitiveType
                    r3 = 7
                    r9 = 82
                    java.lang.String r10 = "DOUBLE"
                    r8.<init>(r10, r3, r3, r9)
                    net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType.DOUBLE = r8
                    r3 = r4
                    r4 = r5
                    r5 = r6
                    r6 = r7
                    r7 = r8
                    net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForPrimitiveType[] r0 = new net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType[]{r0, r1, r2, r3, r4, r5, r6, r7}
                    net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType.$VALUES = r0
                    return
            }

            ForPrimitiveType(java.lang.String r1, int r2, int r3, int r4) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    r0.creationOpcode = r3
                    r0.storageOpcode = r4
                    return
            }

            public static net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForPrimitiveType> r0 = net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForPrimitiveType r1 = (net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType) r1
                    return r1
            }

            public static net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType[] values() {
                    net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForPrimitiveType[] r0 = net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForPrimitiveType[] r0 = (net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType[]) r0
                    return r0
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.Implementation.Context r3) {
                    r1 = this;
                    r3 = 188(0xbc, float:2.63E-43)
                    int r0 = r1.creationOpcode
                    r2.visitIntInsn(r3, r0)
                    net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ARRAY_CREATION_SIZE_CHANGE
                    return r2
            }

            @Override // net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator
            public int getStorageOpcode() {
                    r1 = this;
                    int r0 = r1.storageOpcode
                    return r0
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public boolean isValid() {
                    r1 = this;
                    r0 = 1
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForReferenceType extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase implements net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator {
            private final java.lang.String internalTypeName;

            public ForReferenceType(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    r0.<init>()
                    java.lang.String r1 = r1.getInternalName()
                    r0.internalTypeName = r1
                    return
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.Implementation.Context r3) {
                    r1 = this;
                    r3 = 189(0xbd, float:2.65E-43)
                    java.lang.String r0 = r1.internalTypeName
                    r2.visitTypeInsn(r3, r0)
                    net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ARRAY_CREATION_SIZE_CHANGE
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
                    java.lang.String r2 = r4.internalTypeName
                    net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForReferenceType r5 = (net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForReferenceType) r5
                    java.lang.String r5 = r5.internalTypeName
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L20
                    return r1
                L20:
                    return r0
            }

            @Override // net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator
            public int getStorageOpcode() {
                    r1 = this;
                    r0 = 83
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    java.lang.String r1 = r2.internalTypeName
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        static {
                net.bytebuddy.implementation.bytecode.StackSize r0 = net.bytebuddy.implementation.bytecode.StackSize.ZERO
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = r0.toDecreasingSize()
                net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ARRAY_CREATION_SIZE_CHANGE = r0
                return
        }

        int getStorageOpcode();
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
    public class ArrayStackManipulation implements net.bytebuddy.implementation.bytecode.StackManipulation {
        private final java.util.List<? extends net.bytebuddy.implementation.bytecode.StackManipulation> stackManipulations;
        final /* synthetic */ net.bytebuddy.implementation.bytecode.collection.ArrayFactory this$0;

        public ArrayStackManipulation(net.bytebuddy.implementation.bytecode.collection.ArrayFactory r1, java.util.List<? extends net.bytebuddy.implementation.bytecode.StackManipulation> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.stackManipulations = r2
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r6, net.bytebuddy.implementation.Implementation.Context r7) {
                r5 = this;
                java.util.List<? extends net.bytebuddy.implementation.bytecode.StackManipulation> r0 = r5.stackManipulations
                int r0 = r0.size()
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.forValue(r0)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = r0.apply(r6, r7)
                net.bytebuddy.implementation.bytecode.collection.ArrayFactory r1 = r5.this$0
                net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator r1 = net.bytebuddy.implementation.bytecode.collection.ArrayFactory.access$000(r1)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r1 = r1.apply(r6, r7)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = r0.aggregate(r1)
                java.util.List<? extends net.bytebuddy.implementation.bytecode.StackManipulation> r1 = r5.stackManipulations
                java.util.Iterator r1 = r1.iterator()
                r2 = 0
            L23:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L6d
                java.lang.Object r3 = r1.next()
                net.bytebuddy.implementation.bytecode.StackManipulation r3 = (net.bytebuddy.implementation.bytecode.StackManipulation) r3
                r4 = 89
                r6.visitInsn(r4)
                net.bytebuddy.implementation.bytecode.StackSize r4 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r4 = r4.toIncreasingSize()
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = r0.aggregate(r4)
                int r4 = r2 + 1
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.forValue(r2)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = r2.apply(r6, r7)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = r0.aggregate(r2)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = r3.apply(r6, r7)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = r0.aggregate(r2)
                net.bytebuddy.implementation.bytecode.collection.ArrayFactory r2 = r5.this$0
                net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator r2 = net.bytebuddy.implementation.bytecode.collection.ArrayFactory.access$000(r2)
                int r2 = r2.getStorageOpcode()
                r6.visitInsn(r2)
                net.bytebuddy.implementation.bytecode.collection.ArrayFactory r2 = r5.this$0
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = net.bytebuddy.implementation.bytecode.collection.ArrayFactory.access$100(r2)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = r0.aggregate(r2)
                r2 = r4
                goto L23
            L6d:
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
                java.util.List<? extends net.bytebuddy.implementation.bytecode.StackManipulation> r2 = r4.stackManipulations
                net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayStackManipulation r5 = (net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayStackManipulation) r5
                java.util.List<? extends net.bytebuddy.implementation.bytecode.StackManipulation> r3 = r5.stackManipulations
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                net.bytebuddy.implementation.bytecode.collection.ArrayFactory r2 = r4.this$0
                net.bytebuddy.implementation.bytecode.collection.ArrayFactory r5 = r5.this$0
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L2b
                return r1
            L2b:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.util.List<? extends net.bytebuddy.implementation.bytecode.StackManipulation> r1 = r2.stackManipulations
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.bytecode.collection.ArrayFactory r1 = r2.this$0
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
                r2 = this;
                java.util.List<? extends net.bytebuddy.implementation.bytecode.StackManipulation> r0 = r2.stackManipulations
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L1a
                java.lang.Object r1 = r0.next()
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = (net.bytebuddy.implementation.bytecode.StackManipulation) r1
                boolean r1 = r1.isValid()
                if (r1 != 0) goto L6
                r0 = 0
                return r0
            L1a:
                net.bytebuddy.implementation.bytecode.collection.ArrayFactory r0 = r2.this$0
                net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator r0 = net.bytebuddy.implementation.bytecode.collection.ArrayFactory.access$000(r0)
                boolean r0 = r0.isValid()
                return r0
        }
    }

    public ArrayFactory(net.bytebuddy.description.type.TypeDescription.Generic r1, net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator r2) {
            r0 = this;
            r0.<init>()
            r0.componentType = r1
            r0.arrayCreator = r2
            net.bytebuddy.implementation.bytecode.StackSize r2 = net.bytebuddy.implementation.bytecode.StackSize.DOUBLE
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = r2.toDecreasingSize()
            net.bytebuddy.implementation.bytecode.StackSize r1 = r1.getStackSize()
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r1 = r1.toDecreasingSize()
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r1 = r2.aggregate(r1)
            r0.sizeDecrease = r1
            return
    }

    public static /* synthetic */ net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator access$000(net.bytebuddy.implementation.bytecode.collection.ArrayFactory r0) {
            net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator r0 = r0.arrayCreator
            return r0
    }

    public static /* synthetic */ net.bytebuddy.implementation.bytecode.StackManipulation.Size access$100(net.bytebuddy.implementation.bytecode.collection.ArrayFactory r0) {
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = r0.sizeDecrease
            return r0
    }

    public static net.bytebuddy.implementation.bytecode.collection.ArrayFactory forType(net.bytebuddy.description.type.TypeDescription.Generic r2) {
            net.bytebuddy.implementation.bytecode.collection.ArrayFactory r0 = new net.bytebuddy.implementation.bytecode.collection.ArrayFactory
            net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator r1 = makeArrayCreatorFor(r2)
            r0.<init>(r2, r1)
            return r0
    }

    private static net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator makeArrayCreatorFor(net.bytebuddy.description.type.TypeDefinition r3) {
            boolean r0 = r3.isPrimitive()
            if (r0 != 0) goto L10
            net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForReferenceType r0 = new net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForReferenceType
            net.bytebuddy.description.type.TypeDescription r3 = r3.asErasure()
            r0.<init>(r3)
            return r0
        L10:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L1b
            net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForPrimitiveType r3 = net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType.BOOLEAN
            return r3
        L1b:
            java.lang.Class r0 = java.lang.Byte.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L26
            net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForPrimitiveType r3 = net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType.BYTE
            return r3
        L26:
            java.lang.Class r0 = java.lang.Short.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L31
            net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForPrimitiveType r3 = net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType.SHORT
            return r3
        L31:
            java.lang.Class r0 = java.lang.Character.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L3c
            net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForPrimitiveType r3 = net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType.CHARACTER
            return r3
        L3c:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L47
            net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForPrimitiveType r3 = net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType.INTEGER
            return r3
        L47:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L52
            net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForPrimitiveType r3 = net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType.LONG
            return r3
        L52:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L5d
            net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForPrimitiveType r3 = net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType.FLOAT
            return r3
        L5d:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r0 = r3.represents(r0)
            if (r0 == 0) goto L68
            net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator$ForPrimitiveType r3 = net.bytebuddy.implementation.bytecode.collection.ArrayFactory.ArrayCreator.ForPrimitiveType.DOUBLE
            return r3
        L68:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot create array of type "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
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
            net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.componentType
            net.bytebuddy.implementation.bytecode.collection.ArrayFactory r5 = (net.bytebuddy.implementation.bytecode.collection.ArrayFactory) r5
            net.bytebuddy.description.type.TypeDescription$Generic r3 = r5.componentType
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L20
            return r1
        L20:
            net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator r2 = r4.arrayCreator
            net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator r5 = r5.arrayCreator
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L2b
            return r1
        L2b:
            return r0
    }

    @Override // net.bytebuddy.implementation.bytecode.collection.CollectionFactory
    public net.bytebuddy.description.type.TypeDescription.Generic getComponentType() {
            r1 = this;
            net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.componentType
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.componentType
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayCreator r1 = r2.arrayCreator
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // net.bytebuddy.implementation.bytecode.collection.CollectionFactory
    public net.bytebuddy.implementation.bytecode.StackManipulation withValues(java.util.List<? extends net.bytebuddy.implementation.bytecode.StackManipulation> r2) {
            r1 = this;
            net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayStackManipulation r0 = new net.bytebuddy.implementation.bytecode.collection.ArrayFactory$ArrayStackManipulation
            r0.<init>(r1, r2)
            return r0
    }
}
