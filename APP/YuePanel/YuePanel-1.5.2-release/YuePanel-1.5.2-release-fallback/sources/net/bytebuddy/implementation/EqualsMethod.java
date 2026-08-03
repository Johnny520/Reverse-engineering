package net.bytebuddy.implementation;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class EqualsMethod implements net.bytebuddy.implementation.Implementation {
    private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape EQUALS = null;
    private final java.util.Comparator<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> comparator;
    private final net.bytebuddy.matcher.ElementMatcher.Junction<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> ignored;
    private final net.bytebuddy.matcher.ElementMatcher.Junction<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> nonNullable;
    private final net.bytebuddy.implementation.EqualsMethod.SuperClassCheck superClassCheck;
    private final net.bytebuddy.implementation.EqualsMethod.TypeCompatibilityCheck typeCompatibilityCheck;

    /* JADX INFO: renamed from: net.bytebuddy.implementation.EqualsMethod$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Appender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
        private final net.bytebuddy.implementation.bytecode.StackManipulation baseline;
        private final java.util.List<net.bytebuddy.description.field.FieldDescription.InDefinedShape> fieldDescriptions;
        private final net.bytebuddy.description.type.TypeDescription instrumentedType;
        private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> nonNullable;

        public Appender(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.implementation.bytecode.StackManipulation r2, java.util.List<net.bytebuddy.description.field.FieldDescription.InDefinedShape> r3, net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> r4) {
                r0 = this;
                r0.<init>()
                r0.instrumentedType = r1
                r0.baseline = r2
                r0.fieldDescriptions = r3
                r0.nonNullable = r4
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r8, net.bytebuddy.implementation.Implementation.Context r9, net.bytebuddy.description.method.MethodDescription r10) {
                r7 = this;
                boolean r0 = r10.isStatic()
                if (r0 != 0) goto L110
                net.bytebuddy.description.method.ParameterList r0 = r10.getParameters()
                int r0 = r0.size()
                r1 = 1
                if (r0 != r1) goto L10a
                net.bytebuddy.description.method.ParameterList r0 = r10.getParameters()
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.method.ParameterDescription r0 = (net.bytebuddy.description.method.ParameterDescription) r0
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getType()
                boolean r0 = r0.isPrimitive()
                if (r0 != 0) goto L10a
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r10.getReturnType()
                java.lang.Class r2 = java.lang.Boolean.TYPE
                boolean r0 = r0.represents(r2)
                if (r0 == 0) goto Lf3
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.List<net.bytebuddy.description.field.FieldDescription$InDefinedShape> r2 = r7.fieldDescriptions
                int r2 = r2.size()
                int r2 = r2 * 8
                int r2 = r2 + 3
                r0.<init>(r2)
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = r7.baseline
                r0.add(r2)
                java.util.List<net.bytebuddy.description.field.FieldDescription$InDefinedShape> r2 = r7.fieldDescriptions
                java.util.Iterator r2 = r2.iterator()
                r3 = 0
            L4c:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto Lcf
                java.lang.Object r4 = r2.next()
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r4 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r4
                net.bytebuddy.implementation.bytecode.StackManipulation r5 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                r0.add(r5)
                net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r5 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r4)
                net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.read()
                r0.add(r5)
                net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r5 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.REFERENCE
                net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.loadFrom(r1)
                r0.add(r5)
                net.bytebuddy.description.type.TypeDescription r5 = r7.instrumentedType
                net.bytebuddy.implementation.bytecode.StackManipulation r5 = net.bytebuddy.implementation.bytecode.assign.TypeCasting.to(r5)
                r0.add(r5)
                net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r5 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r4)
                net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.read()
                r0.add(r5)
                net.bytebuddy.description.type.TypeDescription$Generic r5 = r4.getType()
                boolean r5 = r5.isPrimitive()
                if (r5 != 0) goto Laa
                net.bytebuddy.description.type.TypeDescription$Generic r5 = r4.getType()
                boolean r5 = r5.isArray()
                if (r5 != 0) goto Laa
                net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r5 = r7.nonNullable
                boolean r5 = r5.matches(r4)
                if (r5 == 0) goto La4
                goto Laa
            La4:
                net.bytebuddy.implementation.EqualsMethod$NullValueGuard$UsingJump r5 = new net.bytebuddy.implementation.EqualsMethod$NullValueGuard$UsingJump
                r5.<init>(r10)
                goto Lac
            Laa:
                net.bytebuddy.implementation.EqualsMethod$NullValueGuard$NoOp r5 = net.bytebuddy.implementation.EqualsMethod.NullValueGuard.NoOp.INSTANCE
            Lac:
                net.bytebuddy.implementation.bytecode.StackManipulation r6 = r5.before()
                r0.add(r6)
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.getType()
                net.bytebuddy.implementation.bytecode.StackManipulation r4 = net.bytebuddy.implementation.EqualsMethod.ValueComparator.of(r4)
                r0.add(r4)
                net.bytebuddy.implementation.bytecode.StackManipulation r4 = r5.after()
                r0.add(r4)
                int r4 = r5.getRequiredVariablePadding()
                int r3 = java.lang.Math.max(r3, r4)
                goto L4c
            Lcf:
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.forValue(r1)
                r0.add(r1)
                net.bytebuddy.implementation.bytecode.member.MethodReturn r1 = net.bytebuddy.implementation.bytecode.member.MethodReturn.INTEGER
                r0.add(r1)
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r1 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r2 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                r2.<init>(r0)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r8 = r2.apply(r8, r9)
                int r8 = r8.getMaximalSize()
                int r9 = r10.getStackSize()
                int r9 = r9 + r3
                r1.<init>(r8, r9)
                return r1
            Lf3:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r0 = "Hash code method does not return primitive boolean: "
                r9.append(r0)
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                r8.<init>(r9)
                throw r8
            L10a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                r8.<init>()
                throw r8
            L110:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r0 = "Hash code method must not be static: "
                r9.append(r0)
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                r8.<init>(r9)
                throw r8
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
                net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                net.bytebuddy.implementation.EqualsMethod$Appender r5 = (net.bytebuddy.implementation.EqualsMethod.Appender) r5
                net.bytebuddy.description.type.TypeDescription r3 = r5.instrumentedType
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = r4.baseline
                net.bytebuddy.implementation.bytecode.StackManipulation r3 = r5.baseline
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L2b
                return r1
            L2b:
                java.util.List<net.bytebuddy.description.field.FieldDescription$InDefinedShape> r2 = r4.fieldDescriptions
                java.util.List<net.bytebuddy.description.field.FieldDescription$InDefinedShape> r3 = r5.fieldDescriptions
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L36
                return r1
            L36:
                net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r2 = r4.nonNullable
                net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r5 = r5.nonNullable
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L41
                return r1
            L41:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = r2.baseline
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<net.bytebuddy.description.field.FieldDescription$InDefinedShape> r1 = r2.fieldDescriptions
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r1 = r2.nonNullable
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Not used within a serializable instance", value = {"SE_COMPARATOR_SHOULD_BE_SERIALIZABLE"})
    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class CompoundComparator implements java.util.Comparator<net.bytebuddy.description.field.FieldDescription.InDefinedShape> {
        private final java.util.List<java.util.Comparator<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape>> comparators;

        public CompoundComparator(java.util.List<? extends java.util.Comparator<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape>> r3) {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.comparators = r0
                java.util.Iterator r3 = r3.iterator()
            Le:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L32
                java.lang.Object r0 = r3.next()
                java.util.Comparator r0 = (java.util.Comparator) r0
                boolean r1 = r0 instanceof net.bytebuddy.implementation.EqualsMethod.CompoundComparator
                if (r1 == 0) goto L28
                java.util.List<java.util.Comparator<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape>> r1 = r2.comparators
                net.bytebuddy.implementation.EqualsMethod$CompoundComparator r0 = (net.bytebuddy.implementation.EqualsMethod.CompoundComparator) r0
                java.util.List<java.util.Comparator<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape>> r0 = r0.comparators
                r1.addAll(r0)
                goto Le
            L28:
                boolean r1 = r0 instanceof net.bytebuddy.implementation.EqualsMethod.NaturalOrderComparator
                if (r1 != 0) goto Le
                java.util.List<java.util.Comparator<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape>> r1 = r2.comparators
                r1.add(r0)
                goto Le
            L32:
                return
        }

        public CompoundComparator(java.util.Comparator<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape>... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.<init>(r1)
                return
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(net.bytebuddy.description.field.FieldDescription.InDefinedShape r1, net.bytebuddy.description.field.FieldDescription.InDefinedShape r2) {
                r0 = this;
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r1 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r1
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r2 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(net.bytebuddy.description.field.FieldDescription.InDefinedShape r3, net.bytebuddy.description.field.FieldDescription.InDefinedShape r4) {
                r2 = this;
                java.util.List<java.util.Comparator<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape>> r0 = r2.comparators
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L19
                java.lang.Object r1 = r0.next()
                java.util.Comparator r1 = (java.util.Comparator) r1
                int r1 = r1.compare(r3, r4)
                if (r1 == 0) goto L6
                return r1
            L19:
                r3 = 0
                return r3
        }

        @Override // java.util.Comparator
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
                java.util.List<java.util.Comparator<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape>> r2 = r4.comparators
                net.bytebuddy.implementation.EqualsMethod$CompoundComparator r5 = (net.bytebuddy.implementation.EqualsMethod.CompoundComparator) r5
                java.util.List<java.util.Comparator<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape>> r5 = r5.comparators
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
                java.util.List<java.util.Comparator<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape>> r1 = r2.comparators
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ConditionalReturn extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
        private static final java.lang.Object[] EMPTY = null;
        private final int jumpCondition;
        private final int value;

        static {
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                net.bytebuddy.implementation.EqualsMethod.ConditionalReturn.EMPTY = r0
                return
        }

        public ConditionalReturn(int r2) {
                r1 = this;
                r0 = 3
                r1.<init>(r2, r0)
                return
        }

        private ConditionalReturn(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.jumpCondition = r1
                r0.value = r2
                return
        }

        public static net.bytebuddy.implementation.EqualsMethod.ConditionalReturn onIdentity() {
                net.bytebuddy.implementation.EqualsMethod$ConditionalReturn r0 = new net.bytebuddy.implementation.EqualsMethod$ConditionalReturn
                r1 = 166(0xa6, float:2.33E-43)
                r0.<init>(r1)
                return r0
        }

        public static net.bytebuddy.implementation.EqualsMethod.ConditionalReturn onNonEqualInteger() {
                net.bytebuddy.implementation.EqualsMethod$ConditionalReturn r0 = new net.bytebuddy.implementation.EqualsMethod$ConditionalReturn
                r1 = 159(0x9f, float:2.23E-43)
                r0.<init>(r1)
                return r0
        }

        public static net.bytebuddy.implementation.EqualsMethod.ConditionalReturn onNonIdentity() {
                net.bytebuddy.implementation.EqualsMethod$ConditionalReturn r0 = new net.bytebuddy.implementation.EqualsMethod$ConditionalReturn
                r1 = 165(0xa5, float:2.31E-43)
                r0.<init>(r1)
                return r0
        }

        public static net.bytebuddy.implementation.EqualsMethod.ConditionalReturn onNonZeroInteger() {
                net.bytebuddy.implementation.EqualsMethod$ConditionalReturn r0 = new net.bytebuddy.implementation.EqualsMethod$ConditionalReturn
                r1 = 153(0x99, float:2.14E-43)
                r0.<init>(r1)
                return r0
        }

        public static net.bytebuddy.implementation.EqualsMethod.ConditionalReturn onNullValue() {
                net.bytebuddy.implementation.EqualsMethod$ConditionalReturn r0 = new net.bytebuddy.implementation.EqualsMethod$ConditionalReturn
                r1 = 199(0xc7, float:2.79E-43)
                r0.<init>(r1)
                return r0
        }

        public static net.bytebuddy.implementation.EqualsMethod.ConditionalReturn onZeroInteger() {
                net.bytebuddy.implementation.EqualsMethod$ConditionalReturn r0 = new net.bytebuddy.implementation.EqualsMethod$ConditionalReturn
                r1 = 154(0x9a, float:2.16E-43)
                r0.<init>(r1)
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r5, net.bytebuddy.implementation.Implementation.Context r6) {
                r4 = this;
                net.bytebuddy.jar.asm.Label r0 = new net.bytebuddy.jar.asm.Label
                r0.<init>()
                int r1 = r4.jumpCondition
                r5.visitJumpInsn(r1, r0)
                int r1 = r4.value
                r5.visitInsn(r1)
                r1 = 172(0xac, float:2.41E-43)
                r5.visitInsn(r1)
                r5.visitLabel(r0)
                net.bytebuddy.implementation.Implementation$Context$FrameGeneration r0 = r6.getFrameGeneration()
                net.bytebuddy.description.type.TypeDescription r6 = r6.getInstrumentedType()
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                r2 = 2
                net.bytebuddy.description.type.TypeDescription[] r2 = new net.bytebuddy.description.type.TypeDescription[r2]
                r3 = 0
                r2[r3] = r6
                r6 = 1
                r2[r6] = r1
                java.util.List r1 = java.util.Arrays.asList(r2)
                r0.same(r5, r1)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r5 = new net.bytebuddy.implementation.bytecode.StackManipulation$Size
                r0 = -1
                r5.<init>(r0, r6)
                return r5
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
                int r2 = r4.jumpCondition
                net.bytebuddy.implementation.EqualsMethod$ConditionalReturn r5 = (net.bytebuddy.implementation.EqualsMethod.ConditionalReturn) r5
                int r3 = r5.jumpCondition
                if (r2 == r3) goto L1c
                return r1
            L1c:
                int r2 = r4.value
                int r5 = r5.value
                if (r2 == r5) goto L23
                return r1
            L23:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                int r1 = r2.jumpCondition
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.value
                int r0 = r0 + r1
                return r0
        }

        public net.bytebuddy.implementation.bytecode.StackManipulation returningTrue() {
                r3 = this;
                net.bytebuddy.implementation.EqualsMethod$ConditionalReturn r0 = new net.bytebuddy.implementation.EqualsMethod$ConditionalReturn
                int r1 = r3.jumpCondition
                r2 = 4
                r0.<init>(r1, r2)
                return r0
        }
    }

    public enum NaturalOrderComparator extends java.lang.Enum<net.bytebuddy.implementation.EqualsMethod.NaturalOrderComparator> implements java.util.Comparator<net.bytebuddy.description.field.FieldDescription.InDefinedShape> {
        private static final /* synthetic */ net.bytebuddy.implementation.EqualsMethod.NaturalOrderComparator[] $VALUES = null;
        public static final net.bytebuddy.implementation.EqualsMethod.NaturalOrderComparator INSTANCE = null;

        static {
                net.bytebuddy.implementation.EqualsMethod$NaturalOrderComparator r0 = new net.bytebuddy.implementation.EqualsMethod$NaturalOrderComparator
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.EqualsMethod.NaturalOrderComparator.INSTANCE = r0
                net.bytebuddy.implementation.EqualsMethod$NaturalOrderComparator[] r0 = new net.bytebuddy.implementation.EqualsMethod.NaturalOrderComparator[]{r0}
                net.bytebuddy.implementation.EqualsMethod.NaturalOrderComparator.$VALUES = r0
                return
        }

        NaturalOrderComparator(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.EqualsMethod.NaturalOrderComparator valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.EqualsMethod$NaturalOrderComparator> r0 = net.bytebuddy.implementation.EqualsMethod.NaturalOrderComparator.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.EqualsMethod$NaturalOrderComparator r1 = (net.bytebuddy.implementation.EqualsMethod.NaturalOrderComparator) r1
                return r1
        }

        public static net.bytebuddy.implementation.EqualsMethod.NaturalOrderComparator[] values() {
                net.bytebuddy.implementation.EqualsMethod$NaturalOrderComparator[] r0 = net.bytebuddy.implementation.EqualsMethod.NaturalOrderComparator.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.EqualsMethod$NaturalOrderComparator[] r0 = (net.bytebuddy.implementation.EqualsMethod.NaturalOrderComparator[]) r0
                return r0
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(net.bytebuddy.description.field.FieldDescription.InDefinedShape r1, net.bytebuddy.description.field.FieldDescription.InDefinedShape r2) {
                r0 = this;
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r1 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r1
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r2 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(net.bytebuddy.description.field.FieldDescription.InDefinedShape r1, net.bytebuddy.description.field.FieldDescription.InDefinedShape r2) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    public interface NullValueGuard {

        public enum NoOp extends java.lang.Enum<net.bytebuddy.implementation.EqualsMethod.NullValueGuard.NoOp> implements net.bytebuddy.implementation.EqualsMethod.NullValueGuard {
            private static final /* synthetic */ net.bytebuddy.implementation.EqualsMethod.NullValueGuard.NoOp[] $VALUES = null;
            public static final net.bytebuddy.implementation.EqualsMethod.NullValueGuard.NoOp INSTANCE = null;

            static {
                    net.bytebuddy.implementation.EqualsMethod$NullValueGuard$NoOp r0 = new net.bytebuddy.implementation.EqualsMethod$NullValueGuard$NoOp
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.implementation.EqualsMethod.NullValueGuard.NoOp.INSTANCE = r0
                    net.bytebuddy.implementation.EqualsMethod$NullValueGuard$NoOp[] r0 = new net.bytebuddy.implementation.EqualsMethod.NullValueGuard.NoOp[]{r0}
                    net.bytebuddy.implementation.EqualsMethod.NullValueGuard.NoOp.$VALUES = r0
                    return
            }

            NoOp(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.implementation.EqualsMethod.NullValueGuard.NoOp valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.implementation.EqualsMethod$NullValueGuard$NoOp> r0 = net.bytebuddy.implementation.EqualsMethod.NullValueGuard.NoOp.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.implementation.EqualsMethod$NullValueGuard$NoOp r1 = (net.bytebuddy.implementation.EqualsMethod.NullValueGuard.NoOp) r1
                    return r1
            }

            public static net.bytebuddy.implementation.EqualsMethod.NullValueGuard.NoOp[] values() {
                    net.bytebuddy.implementation.EqualsMethod$NullValueGuard$NoOp[] r0 = net.bytebuddy.implementation.EqualsMethod.NullValueGuard.NoOp.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.implementation.EqualsMethod$NullValueGuard$NoOp[] r0 = (net.bytebuddy.implementation.EqualsMethod.NullValueGuard.NoOp[]) r0
                    return r0
            }

            @Override // net.bytebuddy.implementation.EqualsMethod.NullValueGuard
            public net.bytebuddy.implementation.bytecode.StackManipulation after() {
                    r1 = this;
                    net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r0 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                    return r0
            }

            @Override // net.bytebuddy.implementation.EqualsMethod.NullValueGuard
            public net.bytebuddy.implementation.bytecode.StackManipulation before() {
                    r1 = this;
                    net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r0 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                    return r0
            }

            @Override // net.bytebuddy.implementation.EqualsMethod.NullValueGuard
            public int getRequiredVariablePadding() {
                    r1 = this;
                    net.bytebuddy.implementation.bytecode.StackSize r0 = net.bytebuddy.implementation.bytecode.StackSize.ZERO
                    int r0 = r0.getSize()
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class UsingJump implements net.bytebuddy.implementation.EqualsMethod.NullValueGuard {
            private final net.bytebuddy.jar.asm.Label endOfBlock;
            private final net.bytebuddy.jar.asm.Label firstValueNull;
            private final net.bytebuddy.description.method.MethodDescription instrumentedMethod;
            private final net.bytebuddy.jar.asm.Label secondValueNull;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
            public class AfterInstruction extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
                final /* synthetic */ net.bytebuddy.implementation.EqualsMethod.NullValueGuard.UsingJump this$0;

                public AfterInstruction(net.bytebuddy.implementation.EqualsMethod.NullValueGuard.UsingJump r1) {
                        r0 = this;
                        r0.this$0 = r1
                        r0.<init>()
                        return
                }

                @Override // net.bytebuddy.implementation.bytecode.StackManipulation
                public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r9, net.bytebuddy.implementation.Implementation.Context r10) {
                        r8 = this;
                        net.bytebuddy.implementation.EqualsMethod$NullValueGuard$UsingJump r0 = r8.this$0
                        net.bytebuddy.jar.asm.Label r0 = net.bytebuddy.implementation.EqualsMethod.NullValueGuard.UsingJump.access$600(r0)
                        r1 = 167(0xa7, float:2.34E-43)
                        r9.visitJumpInsn(r1, r0)
                        net.bytebuddy.implementation.EqualsMethod$NullValueGuard$UsingJump r0 = r8.this$0
                        net.bytebuddy.jar.asm.Label r0 = net.bytebuddy.implementation.EqualsMethod.NullValueGuard.UsingJump.access$400(r0)
                        r9.visitLabel(r0)
                        net.bytebuddy.implementation.Implementation$Context$FrameGeneration r0 = r10.getFrameGeneration()
                        java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                        net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                        net.bytebuddy.description.type.TypeDescription r3 = r10.getInstrumentedType()
                        net.bytebuddy.description.type.TypeDescription r4 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                        r5 = 2
                        net.bytebuddy.description.type.TypeDescription[] r6 = new net.bytebuddy.description.type.TypeDescription[r5]
                        r7 = 0
                        r6[r7] = r3
                        r3 = 1
                        r6[r3] = r4
                        java.util.List r4 = java.util.Arrays.asList(r6)
                        r0.same1(r9, r2, r4)
                        net.bytebuddy.implementation.EqualsMethod$NullValueGuard$UsingJump r0 = r8.this$0
                        net.bytebuddy.jar.asm.Label r0 = net.bytebuddy.implementation.EqualsMethod.NullValueGuard.UsingJump.access$600(r0)
                        r2 = 198(0xc6, float:2.77E-43)
                        r9.visitJumpInsn(r2, r0)
                        net.bytebuddy.implementation.EqualsMethod$NullValueGuard$UsingJump r0 = r8.this$0
                        net.bytebuddy.jar.asm.Label r0 = net.bytebuddy.implementation.EqualsMethod.NullValueGuard.UsingJump.access$500(r0)
                        r9.visitLabel(r0)
                        net.bytebuddy.implementation.Implementation$Context$FrameGeneration r0 = r10.getFrameGeneration()
                        net.bytebuddy.description.type.TypeDescription r2 = r10.getInstrumentedType()
                        net.bytebuddy.description.type.TypeDescription r4 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                        net.bytebuddy.description.type.TypeDescription[] r6 = new net.bytebuddy.description.type.TypeDescription[r5]
                        r6[r7] = r2
                        r6[r3] = r4
                        java.util.List r2 = java.util.Arrays.asList(r6)
                        r0.same(r9, r2)
                        r0 = 3
                        r9.visitInsn(r0)
                        r0 = 172(0xac, float:2.41E-43)
                        r9.visitInsn(r0)
                        net.bytebuddy.implementation.EqualsMethod$NullValueGuard$UsingJump r0 = r8.this$0
                        net.bytebuddy.jar.asm.Label r0 = net.bytebuddy.implementation.EqualsMethod.NullValueGuard.UsingJump.access$600(r0)
                        r9.visitLabel(r0)
                        net.bytebuddy.implementation.Implementation$Context$FrameGeneration r0 = r10.getFrameGeneration()
                        net.bytebuddy.description.type.TypeDescription r10 = r10.getInstrumentedType()
                        net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                        net.bytebuddy.description.type.TypeDescription[] r2 = new net.bytebuddy.description.type.TypeDescription[r5]
                        r2[r7] = r10
                        r2[r3] = r1
                        java.util.List r10 = java.util.Arrays.asList(r2)
                        r0.same(r9, r10)
                        net.bytebuddy.implementation.bytecode.StackManipulation$Size r9 = net.bytebuddy.implementation.bytecode.StackManipulation.Size.ZERO
                        return r9
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
                        net.bytebuddy.implementation.EqualsMethod$NullValueGuard$UsingJump r2 = r4.this$0
                        net.bytebuddy.implementation.EqualsMethod$NullValueGuard$UsingJump$AfterInstruction r5 = (net.bytebuddy.implementation.EqualsMethod.NullValueGuard.UsingJump.AfterInstruction) r5
                        net.bytebuddy.implementation.EqualsMethod$NullValueGuard$UsingJump r5 = r5.this$0
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
                        net.bytebuddy.implementation.EqualsMethod$NullValueGuard$UsingJump r1 = r2.this$0
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
            public class BeforeInstruction extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
                final /* synthetic */ net.bytebuddy.implementation.EqualsMethod.NullValueGuard.UsingJump this$0;

                public BeforeInstruction(net.bytebuddy.implementation.EqualsMethod.NullValueGuard.UsingJump r1) {
                        r0 = this;
                        r0.this$0 = r1
                        r0.<init>()
                        return
                }

                @Override // net.bytebuddy.implementation.bytecode.StackManipulation
                public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r3, net.bytebuddy.implementation.Implementation.Context r4) {
                        r2 = this;
                        net.bytebuddy.implementation.EqualsMethod$NullValueGuard$UsingJump r4 = r2.this$0
                        net.bytebuddy.description.method.MethodDescription r4 = net.bytebuddy.implementation.EqualsMethod.NullValueGuard.UsingJump.access$300(r4)
                        int r4 = r4.getStackSize()
                        r0 = 58
                        r3.visitVarInsn(r0, r4)
                        net.bytebuddy.implementation.EqualsMethod$NullValueGuard$UsingJump r4 = r2.this$0
                        net.bytebuddy.description.method.MethodDescription r4 = net.bytebuddy.implementation.EqualsMethod.NullValueGuard.UsingJump.access$300(r4)
                        int r4 = r4.getStackSize()
                        int r4 = r4 + 1
                        r3.visitVarInsn(r0, r4)
                        net.bytebuddy.implementation.EqualsMethod$NullValueGuard$UsingJump r4 = r2.this$0
                        net.bytebuddy.description.method.MethodDescription r4 = net.bytebuddy.implementation.EqualsMethod.NullValueGuard.UsingJump.access$300(r4)
                        int r4 = r4.getStackSize()
                        int r4 = r4 + 1
                        r0 = 25
                        r3.visitVarInsn(r0, r4)
                        net.bytebuddy.implementation.EqualsMethod$NullValueGuard$UsingJump r4 = r2.this$0
                        net.bytebuddy.description.method.MethodDescription r4 = net.bytebuddy.implementation.EqualsMethod.NullValueGuard.UsingJump.access$300(r4)
                        int r4 = r4.getStackSize()
                        r3.visitVarInsn(r0, r4)
                        net.bytebuddy.implementation.EqualsMethod$NullValueGuard$UsingJump r4 = r2.this$0
                        net.bytebuddy.jar.asm.Label r4 = net.bytebuddy.implementation.EqualsMethod.NullValueGuard.UsingJump.access$400(r4)
                        r1 = 198(0xc6, float:2.77E-43)
                        r3.visitJumpInsn(r1, r4)
                        net.bytebuddy.implementation.EqualsMethod$NullValueGuard$UsingJump r4 = r2.this$0
                        net.bytebuddy.jar.asm.Label r4 = net.bytebuddy.implementation.EqualsMethod.NullValueGuard.UsingJump.access$500(r4)
                        r3.visitJumpInsn(r1, r4)
                        net.bytebuddy.implementation.EqualsMethod$NullValueGuard$UsingJump r4 = r2.this$0
                        net.bytebuddy.description.method.MethodDescription r4 = net.bytebuddy.implementation.EqualsMethod.NullValueGuard.UsingJump.access$300(r4)
                        int r4 = r4.getStackSize()
                        int r4 = r4 + 1
                        r3.visitVarInsn(r0, r4)
                        net.bytebuddy.implementation.EqualsMethod$NullValueGuard$UsingJump r4 = r2.this$0
                        net.bytebuddy.description.method.MethodDescription r4 = net.bytebuddy.implementation.EqualsMethod.NullValueGuard.UsingJump.access$300(r4)
                        int r4 = r4.getStackSize()
                        r3.visitVarInsn(r0, r4)
                        net.bytebuddy.implementation.bytecode.StackManipulation$Size r3 = net.bytebuddy.implementation.bytecode.StackManipulation.Size.ZERO
                        return r3
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
                        net.bytebuddy.implementation.EqualsMethod$NullValueGuard$UsingJump r2 = r4.this$0
                        net.bytebuddy.implementation.EqualsMethod$NullValueGuard$UsingJump$BeforeInstruction r5 = (net.bytebuddy.implementation.EqualsMethod.NullValueGuard.UsingJump.BeforeInstruction) r5
                        net.bytebuddy.implementation.EqualsMethod$NullValueGuard$UsingJump r5 = r5.this$0
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
                        net.bytebuddy.implementation.EqualsMethod$NullValueGuard$UsingJump r1 = r2.this$0
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }
            }

            public UsingJump(net.bytebuddy.description.method.MethodDescription r1) {
                    r0 = this;
                    r0.<init>()
                    r0.instrumentedMethod = r1
                    net.bytebuddy.jar.asm.Label r1 = new net.bytebuddy.jar.asm.Label
                    r1.<init>()
                    r0.firstValueNull = r1
                    net.bytebuddy.jar.asm.Label r1 = new net.bytebuddy.jar.asm.Label
                    r1.<init>()
                    r0.secondValueNull = r1
                    net.bytebuddy.jar.asm.Label r1 = new net.bytebuddy.jar.asm.Label
                    r1.<init>()
                    r0.endOfBlock = r1
                    return
            }

            public static /* synthetic */ net.bytebuddy.description.method.MethodDescription access$300(net.bytebuddy.implementation.EqualsMethod.NullValueGuard.UsingJump r0) {
                    net.bytebuddy.description.method.MethodDescription r0 = r0.instrumentedMethod
                    return r0
            }

            public static /* synthetic */ net.bytebuddy.jar.asm.Label access$400(net.bytebuddy.implementation.EqualsMethod.NullValueGuard.UsingJump r0) {
                    net.bytebuddy.jar.asm.Label r0 = r0.secondValueNull
                    return r0
            }

            public static /* synthetic */ net.bytebuddy.jar.asm.Label access$500(net.bytebuddy.implementation.EqualsMethod.NullValueGuard.UsingJump r0) {
                    net.bytebuddy.jar.asm.Label r0 = r0.firstValueNull
                    return r0
            }

            public static /* synthetic */ net.bytebuddy.jar.asm.Label access$600(net.bytebuddy.implementation.EqualsMethod.NullValueGuard.UsingJump r0) {
                    net.bytebuddy.jar.asm.Label r0 = r0.endOfBlock
                    return r0
            }

            @Override // net.bytebuddy.implementation.EqualsMethod.NullValueGuard
            public net.bytebuddy.implementation.bytecode.StackManipulation after() {
                    r1 = this;
                    net.bytebuddy.implementation.EqualsMethod$NullValueGuard$UsingJump$AfterInstruction r0 = new net.bytebuddy.implementation.EqualsMethod$NullValueGuard$UsingJump$AfterInstruction
                    r0.<init>(r1)
                    return r0
            }

            @Override // net.bytebuddy.implementation.EqualsMethod.NullValueGuard
            public net.bytebuddy.implementation.bytecode.StackManipulation before() {
                    r1 = this;
                    net.bytebuddy.implementation.EqualsMethod$NullValueGuard$UsingJump$BeforeInstruction r0 = new net.bytebuddy.implementation.EqualsMethod$NullValueGuard$UsingJump$BeforeInstruction
                    r0.<init>(r1)
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
                    net.bytebuddy.description.method.MethodDescription r2 = r4.instrumentedMethod
                    net.bytebuddy.implementation.EqualsMethod$NullValueGuard$UsingJump r5 = (net.bytebuddy.implementation.EqualsMethod.NullValueGuard.UsingJump) r5
                    net.bytebuddy.description.method.MethodDescription r3 = r5.instrumentedMethod
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.jar.asm.Label r2 = r4.firstValueNull
                    net.bytebuddy.jar.asm.Label r3 = r5.firstValueNull
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L2b
                    return r1
                L2b:
                    net.bytebuddy.jar.asm.Label r2 = r4.secondValueNull
                    net.bytebuddy.jar.asm.Label r3 = r5.secondValueNull
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L36
                    return r1
                L36:
                    net.bytebuddy.jar.asm.Label r2 = r4.endOfBlock
                    net.bytebuddy.jar.asm.Label r5 = r5.endOfBlock
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L41
                    return r1
                L41:
                    return r0
            }

            @Override // net.bytebuddy.implementation.EqualsMethod.NullValueGuard
            public int getRequiredVariablePadding() {
                    r1 = this;
                    r0 = 2
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.description.method.MethodDescription r1 = r2.instrumentedMethod
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.jar.asm.Label r1 = r2.firstValueNull
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.jar.asm.Label r1 = r2.secondValueNull
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.jar.asm.Label r1 = r2.endOfBlock
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        net.bytebuddy.implementation.bytecode.StackManipulation after();

        net.bytebuddy.implementation.bytecode.StackManipulation before();

        int getRequiredVariablePadding();
    }

    public enum SuperClassCheck extends java.lang.Enum<net.bytebuddy.implementation.EqualsMethod.SuperClassCheck> {
        private static final /* synthetic */ net.bytebuddy.implementation.EqualsMethod.SuperClassCheck[] $VALUES = null;
        public static final net.bytebuddy.implementation.EqualsMethod.SuperClassCheck DISABLED = null;
        public static final net.bytebuddy.implementation.EqualsMethod.SuperClassCheck ENABLED = null;



        static {
                net.bytebuddy.implementation.EqualsMethod$SuperClassCheck$1 r0 = new net.bytebuddy.implementation.EqualsMethod$SuperClassCheck$1
                java.lang.String r1 = "DISABLED"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.EqualsMethod.SuperClassCheck.DISABLED = r0
                net.bytebuddy.implementation.EqualsMethod$SuperClassCheck$2 r1 = new net.bytebuddy.implementation.EqualsMethod$SuperClassCheck$2
                java.lang.String r3 = "ENABLED"
                r4 = 1
                r1.<init>(r3, r4)
                net.bytebuddy.implementation.EqualsMethod.SuperClassCheck.ENABLED = r1
                r3 = 2
                net.bytebuddy.implementation.EqualsMethod$SuperClassCheck[] r3 = new net.bytebuddy.implementation.EqualsMethod.SuperClassCheck[r3]
                r3[r2] = r0
                r3[r4] = r1
                net.bytebuddy.implementation.EqualsMethod.SuperClassCheck.$VALUES = r3
                return
        }

        SuperClassCheck(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ SuperClassCheck(java.lang.String r1, int r2, net.bytebuddy.implementation.EqualsMethod.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.EqualsMethod.SuperClassCheck valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.EqualsMethod$SuperClassCheck> r0 = net.bytebuddy.implementation.EqualsMethod.SuperClassCheck.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.EqualsMethod$SuperClassCheck r1 = (net.bytebuddy.implementation.EqualsMethod.SuperClassCheck) r1
                return r1
        }

        public static net.bytebuddy.implementation.EqualsMethod.SuperClassCheck[] values() {
                net.bytebuddy.implementation.EqualsMethod$SuperClassCheck[] r0 = net.bytebuddy.implementation.EqualsMethod.SuperClassCheck.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.EqualsMethod$SuperClassCheck[] r0 = (net.bytebuddy.implementation.EqualsMethod.SuperClassCheck[]) r0
                return r0
        }

        public abstract net.bytebuddy.implementation.bytecode.StackManipulation resolve(net.bytebuddy.description.type.TypeDescription r1);
    }

    public enum TypeCompatibilityCheck extends java.lang.Enum<net.bytebuddy.implementation.EqualsMethod.TypeCompatibilityCheck> {
        private static final /* synthetic */ net.bytebuddy.implementation.EqualsMethod.TypeCompatibilityCheck[] $VALUES = null;
        public static final net.bytebuddy.implementation.EqualsMethod.TypeCompatibilityCheck EXACT = null;
        protected static final net.bytebuddy.description.method.MethodDescription.InDefinedShape GET_CLASS = null;
        public static final net.bytebuddy.implementation.EqualsMethod.TypeCompatibilityCheck SUBCLASS = null;



        static {
                net.bytebuddy.implementation.EqualsMethod$TypeCompatibilityCheck$1 r0 = new net.bytebuddy.implementation.EqualsMethod$TypeCompatibilityCheck$1
                java.lang.String r1 = "EXACT"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.EqualsMethod.TypeCompatibilityCheck.EXACT = r0
                net.bytebuddy.implementation.EqualsMethod$TypeCompatibilityCheck$2 r1 = new net.bytebuddy.implementation.EqualsMethod$TypeCompatibilityCheck$2
                java.lang.String r3 = "SUBCLASS"
                r4 = 1
                r1.<init>(r3, r4)
                net.bytebuddy.implementation.EqualsMethod.TypeCompatibilityCheck.SUBCLASS = r1
                r3 = 2
                net.bytebuddy.implementation.EqualsMethod$TypeCompatibilityCheck[] r3 = new net.bytebuddy.implementation.EqualsMethod.TypeCompatibilityCheck[r3]
                r3[r2] = r0
                r3[r4] = r1
                net.bytebuddy.implementation.EqualsMethod.TypeCompatibilityCheck.$VALUES = r3
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                java.lang.String r1 = "getClass"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                net.bytebuddy.implementation.EqualsMethod.TypeCompatibilityCheck.GET_CLASS = r0
                return
        }

        TypeCompatibilityCheck(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ TypeCompatibilityCheck(java.lang.String r1, int r2, net.bytebuddy.implementation.EqualsMethod.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.EqualsMethod.TypeCompatibilityCheck valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.EqualsMethod$TypeCompatibilityCheck> r0 = net.bytebuddy.implementation.EqualsMethod.TypeCompatibilityCheck.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.EqualsMethod$TypeCompatibilityCheck r1 = (net.bytebuddy.implementation.EqualsMethod.TypeCompatibilityCheck) r1
                return r1
        }

        public static net.bytebuddy.implementation.EqualsMethod.TypeCompatibilityCheck[] values() {
                net.bytebuddy.implementation.EqualsMethod$TypeCompatibilityCheck[] r0 = net.bytebuddy.implementation.EqualsMethod.TypeCompatibilityCheck.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.EqualsMethod$TypeCompatibilityCheck[] r0 = (net.bytebuddy.implementation.EqualsMethod.TypeCompatibilityCheck[]) r0
                return r0
        }

        public abstract net.bytebuddy.implementation.bytecode.StackManipulation resolve(net.bytebuddy.description.type.TypeDescription r1);
    }

    public enum TypePropertyComparator extends java.lang.Enum<net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator> implements java.util.Comparator<net.bytebuddy.description.field.FieldDescription.InDefinedShape> {
        private static final /* synthetic */ net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator[] $VALUES = null;
        public static final net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator FOR_ENUMERATION_TYPES = null;
        public static final net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator FOR_PRIMITIVE_TYPES = null;
        public static final net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator FOR_PRIMITIVE_WRAPPER_TYPES = null;
        public static final net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator FOR_STRING_TYPES = null;





        static {
                net.bytebuddy.implementation.EqualsMethod$TypePropertyComparator$1 r0 = new net.bytebuddy.implementation.EqualsMethod$TypePropertyComparator$1
                java.lang.String r1 = "FOR_PRIMITIVE_TYPES"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator.FOR_PRIMITIVE_TYPES = r0
                net.bytebuddy.implementation.EqualsMethod$TypePropertyComparator$2 r1 = new net.bytebuddy.implementation.EqualsMethod$TypePropertyComparator$2
                java.lang.String r3 = "FOR_ENUMERATION_TYPES"
                r4 = 1
                r1.<init>(r3, r4)
                net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator.FOR_ENUMERATION_TYPES = r1
                net.bytebuddy.implementation.EqualsMethod$TypePropertyComparator$3 r3 = new net.bytebuddy.implementation.EqualsMethod$TypePropertyComparator$3
                java.lang.String r5 = "FOR_STRING_TYPES"
                r6 = 2
                r3.<init>(r5, r6)
                net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator.FOR_STRING_TYPES = r3
                net.bytebuddy.implementation.EqualsMethod$TypePropertyComparator$4 r5 = new net.bytebuddy.implementation.EqualsMethod$TypePropertyComparator$4
                java.lang.String r7 = "FOR_PRIMITIVE_WRAPPER_TYPES"
                r8 = 3
                r5.<init>(r7, r8)
                net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator.FOR_PRIMITIVE_WRAPPER_TYPES = r5
                r7 = 4
                net.bytebuddy.implementation.EqualsMethod$TypePropertyComparator[] r7 = new net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator.$VALUES = r7
                return
        }

        TypePropertyComparator(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ TypePropertyComparator(java.lang.String r1, int r2, net.bytebuddy.implementation.EqualsMethod.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.EqualsMethod$TypePropertyComparator> r0 = net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.EqualsMethod$TypePropertyComparator r1 = (net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator) r1
                return r1
        }

        public static net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator[] values() {
                net.bytebuddy.implementation.EqualsMethod$TypePropertyComparator[] r0 = net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.EqualsMethod$TypePropertyComparator[] r0 = (net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator[]) r0
                return r0
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(net.bytebuddy.description.field.FieldDescription.InDefinedShape r1, net.bytebuddy.description.field.FieldDescription.InDefinedShape r2) {
                r0 = this;
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r1 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r1
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r2 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(net.bytebuddy.description.field.FieldDescription.InDefinedShape r2, net.bytebuddy.description.field.FieldDescription.InDefinedShape r3) {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.getType()
                boolean r0 = r1.resolve(r0)
                if (r0 == 0) goto L16
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.getType()
                boolean r0 = r1.resolve(r0)
                if (r0 != 0) goto L16
                r2 = -1
                return r2
            L16:
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.getType()
                boolean r2 = r1.resolve(r2)
                if (r2 != 0) goto L2c
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r3.getType()
                boolean r2 = r1.resolve(r2)
                if (r2 == 0) goto L2c
                r2 = 1
                return r2
            L2c:
                r2 = 0
                return r2
        }

        public abstract boolean resolve(net.bytebuddy.description.type.TypeDefinition r1);
    }

    public enum ValueComparator extends java.lang.Enum<net.bytebuddy.implementation.EqualsMethod.ValueComparator> implements net.bytebuddy.implementation.bytecode.StackManipulation {
        private static final /* synthetic */ net.bytebuddy.implementation.EqualsMethod.ValueComparator[] $VALUES = null;
        public static final net.bytebuddy.implementation.EqualsMethod.ValueComparator BOOLEAN_ARRAY = null;
        public static final net.bytebuddy.implementation.EqualsMethod.ValueComparator BYTE_ARRAY = null;
        public static final net.bytebuddy.implementation.EqualsMethod.ValueComparator CHARACTER_ARRAY = null;
        public static final net.bytebuddy.implementation.EqualsMethod.ValueComparator DOUBLE = null;
        public static final net.bytebuddy.implementation.EqualsMethod.ValueComparator DOUBLE_ARRAY = null;
        public static final net.bytebuddy.implementation.EqualsMethod.ValueComparator FLOAT = null;
        public static final net.bytebuddy.implementation.EqualsMethod.ValueComparator FLOAT_ARRAY = null;
        public static final net.bytebuddy.implementation.EqualsMethod.ValueComparator INTEGER_ARRAY = null;
        public static final net.bytebuddy.implementation.EqualsMethod.ValueComparator LONG = null;
        public static final net.bytebuddy.implementation.EqualsMethod.ValueComparator LONG_ARRAY = null;
        public static final net.bytebuddy.implementation.EqualsMethod.ValueComparator NESTED_ARRAY = null;
        public static final net.bytebuddy.implementation.EqualsMethod.ValueComparator REFERENCE_ARRAY = null;
        public static final net.bytebuddy.implementation.EqualsMethod.ValueComparator SHORT_ARRAY = null;














        static {
                net.bytebuddy.implementation.EqualsMethod$ValueComparator$1 r0 = new net.bytebuddy.implementation.EqualsMethod$ValueComparator$1
                java.lang.String r1 = "LONG"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.EqualsMethod.ValueComparator.LONG = r0
                net.bytebuddy.implementation.EqualsMethod$ValueComparator$2 r1 = new net.bytebuddy.implementation.EqualsMethod$ValueComparator$2
                java.lang.String r3 = "FLOAT"
                r4 = 1
                r1.<init>(r3, r4)
                net.bytebuddy.implementation.EqualsMethod.ValueComparator.FLOAT = r1
                net.bytebuddy.implementation.EqualsMethod$ValueComparator$3 r3 = new net.bytebuddy.implementation.EqualsMethod$ValueComparator$3
                java.lang.String r5 = "DOUBLE"
                r6 = 2
                r3.<init>(r5, r6)
                net.bytebuddy.implementation.EqualsMethod.ValueComparator.DOUBLE = r3
                net.bytebuddy.implementation.EqualsMethod$ValueComparator$4 r5 = new net.bytebuddy.implementation.EqualsMethod$ValueComparator$4
                java.lang.String r7 = "BOOLEAN_ARRAY"
                r8 = 3
                r5.<init>(r7, r8)
                net.bytebuddy.implementation.EqualsMethod.ValueComparator.BOOLEAN_ARRAY = r5
                net.bytebuddy.implementation.EqualsMethod$ValueComparator$5 r7 = new net.bytebuddy.implementation.EqualsMethod$ValueComparator$5
                java.lang.String r9 = "BYTE_ARRAY"
                r10 = 4
                r7.<init>(r9, r10)
                net.bytebuddy.implementation.EqualsMethod.ValueComparator.BYTE_ARRAY = r7
                net.bytebuddy.implementation.EqualsMethod$ValueComparator$6 r9 = new net.bytebuddy.implementation.EqualsMethod$ValueComparator$6
                java.lang.String r11 = "SHORT_ARRAY"
                r12 = 5
                r9.<init>(r11, r12)
                net.bytebuddy.implementation.EqualsMethod.ValueComparator.SHORT_ARRAY = r9
                net.bytebuddy.implementation.EqualsMethod$ValueComparator$7 r11 = new net.bytebuddy.implementation.EqualsMethod$ValueComparator$7
                java.lang.String r13 = "CHARACTER_ARRAY"
                r14 = 6
                r11.<init>(r13, r14)
                net.bytebuddy.implementation.EqualsMethod.ValueComparator.CHARACTER_ARRAY = r11
                net.bytebuddy.implementation.EqualsMethod$ValueComparator$8 r13 = new net.bytebuddy.implementation.EqualsMethod$ValueComparator$8
                java.lang.String r15 = "INTEGER_ARRAY"
                r14 = 7
                r13.<init>(r15, r14)
                net.bytebuddy.implementation.EqualsMethod.ValueComparator.INTEGER_ARRAY = r13
                net.bytebuddy.implementation.EqualsMethod$ValueComparator$9 r15 = new net.bytebuddy.implementation.EqualsMethod$ValueComparator$9
                java.lang.String r14 = "LONG_ARRAY"
                r12 = 8
                r15.<init>(r14, r12)
                net.bytebuddy.implementation.EqualsMethod.ValueComparator.LONG_ARRAY = r15
                net.bytebuddy.implementation.EqualsMethod$ValueComparator$10 r14 = new net.bytebuddy.implementation.EqualsMethod$ValueComparator$10
                java.lang.String r12 = "FLOAT_ARRAY"
                r10 = 9
                r14.<init>(r12, r10)
                net.bytebuddy.implementation.EqualsMethod.ValueComparator.FLOAT_ARRAY = r14
                net.bytebuddy.implementation.EqualsMethod$ValueComparator$11 r12 = new net.bytebuddy.implementation.EqualsMethod$ValueComparator$11
                java.lang.String r10 = "DOUBLE_ARRAY"
                r8 = 10
                r12.<init>(r10, r8)
                net.bytebuddy.implementation.EqualsMethod.ValueComparator.DOUBLE_ARRAY = r12
                net.bytebuddy.implementation.EqualsMethod$ValueComparator$12 r10 = new net.bytebuddy.implementation.EqualsMethod$ValueComparator$12
                java.lang.String r8 = "REFERENCE_ARRAY"
                r6 = 11
                r10.<init>(r8, r6)
                net.bytebuddy.implementation.EqualsMethod.ValueComparator.REFERENCE_ARRAY = r10
                net.bytebuddy.implementation.EqualsMethod$ValueComparator$13 r8 = new net.bytebuddy.implementation.EqualsMethod$ValueComparator$13
                java.lang.String r6 = "NESTED_ARRAY"
                r4 = 12
                r8.<init>(r6, r4)
                net.bytebuddy.implementation.EqualsMethod.ValueComparator.NESTED_ARRAY = r8
                r6 = 13
                net.bytebuddy.implementation.EqualsMethod$ValueComparator[] r6 = new net.bytebuddy.implementation.EqualsMethod.ValueComparator[r6]
                r6[r2] = r0
                r0 = 1
                r6[r0] = r1
                r0 = 2
                r6[r0] = r3
                r0 = 3
                r6[r0] = r5
                r0 = 4
                r6[r0] = r7
                r0 = 5
                r6[r0] = r9
                r0 = 6
                r6[r0] = r11
                r0 = 7
                r6[r0] = r13
                r0 = 8
                r6[r0] = r15
                r0 = 9
                r6[r0] = r14
                r0 = 10
                r6[r0] = r12
                r0 = 11
                r6[r0] = r10
                r6[r4] = r8
                net.bytebuddy.implementation.EqualsMethod.ValueComparator.$VALUES = r6
                return
        }

        ValueComparator(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ ValueComparator(java.lang.String r1, int r2, net.bytebuddy.implementation.EqualsMethod.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public static net.bytebuddy.implementation.bytecode.StackManipulation of(net.bytebuddy.description.type.TypeDefinition r5) {
                r0 = 1
                r1 = 0
                r2 = 2
                java.lang.Class r3 = java.lang.Boolean.TYPE
                boolean r3 = r5.represents(r3)
                if (r3 != 0) goto L190
                java.lang.Class r3 = java.lang.Byte.TYPE
                boolean r3 = r5.represents(r3)
                if (r3 != 0) goto L190
                java.lang.Class r3 = java.lang.Short.TYPE
                boolean r3 = r5.represents(r3)
                if (r3 != 0) goto L190
                java.lang.Class r3 = java.lang.Character.TYPE
                boolean r3 = r5.represents(r3)
                if (r3 != 0) goto L190
                java.lang.Class r3 = java.lang.Integer.TYPE
                boolean r3 = r5.represents(r3)
                if (r3 == 0) goto L2d
                goto L190
            L2d:
                java.lang.Class r3 = java.lang.Long.TYPE
                boolean r3 = r5.represents(r3)
                if (r3 == 0) goto L47
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r5 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.EqualsMethod$ConditionalReturn r3 = net.bytebuddy.implementation.EqualsMethod.ConditionalReturn.onNonZeroInteger()
                net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                net.bytebuddy.implementation.EqualsMethod$ValueComparator r4 = net.bytebuddy.implementation.EqualsMethod.ValueComparator.LONG
                r2[r1] = r4
                r2[r0] = r3
                r5.<init>(r2)
                return r5
            L47:
                java.lang.Class r3 = java.lang.Float.TYPE
                boolean r3 = r5.represents(r3)
                if (r3 == 0) goto L61
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r5 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.EqualsMethod$ConditionalReturn r3 = net.bytebuddy.implementation.EqualsMethod.ConditionalReturn.onNonZeroInteger()
                net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                net.bytebuddy.implementation.EqualsMethod$ValueComparator r4 = net.bytebuddy.implementation.EqualsMethod.ValueComparator.FLOAT
                r2[r1] = r4
                r2[r0] = r3
                r5.<init>(r2)
                return r5
            L61:
                java.lang.Class r3 = java.lang.Double.TYPE
                boolean r3 = r5.represents(r3)
                if (r3 == 0) goto L7b
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r5 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.EqualsMethod$ConditionalReturn r3 = net.bytebuddy.implementation.EqualsMethod.ConditionalReturn.onNonZeroInteger()
                net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                net.bytebuddy.implementation.EqualsMethod$ValueComparator r4 = net.bytebuddy.implementation.EqualsMethod.ValueComparator.DOUBLE
                r2[r1] = r4
                r2[r0] = r3
                r5.<init>(r2)
                return r5
            L7b:
                java.lang.Class<boolean[]> r3 = boolean[].class
                boolean r3 = r5.represents(r3)
                if (r3 == 0) goto L95
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r5 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.EqualsMethod$ConditionalReturn r3 = net.bytebuddy.implementation.EqualsMethod.ConditionalReturn.onZeroInteger()
                net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                net.bytebuddy.implementation.EqualsMethod$ValueComparator r4 = net.bytebuddy.implementation.EqualsMethod.ValueComparator.BOOLEAN_ARRAY
                r2[r1] = r4
                r2[r0] = r3
                r5.<init>(r2)
                return r5
            L95:
                java.lang.Class<byte[]> r3 = byte[].class
                boolean r3 = r5.represents(r3)
                if (r3 == 0) goto Laf
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r5 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.EqualsMethod$ConditionalReturn r3 = net.bytebuddy.implementation.EqualsMethod.ConditionalReturn.onZeroInteger()
                net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                net.bytebuddy.implementation.EqualsMethod$ValueComparator r4 = net.bytebuddy.implementation.EqualsMethod.ValueComparator.BYTE_ARRAY
                r2[r1] = r4
                r2[r0] = r3
                r5.<init>(r2)
                return r5
            Laf:
                java.lang.Class<short[]> r3 = short[].class
                boolean r3 = r5.represents(r3)
                if (r3 == 0) goto Lc9
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r5 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.EqualsMethod$ConditionalReturn r3 = net.bytebuddy.implementation.EqualsMethod.ConditionalReturn.onZeroInteger()
                net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                net.bytebuddy.implementation.EqualsMethod$ValueComparator r4 = net.bytebuddy.implementation.EqualsMethod.ValueComparator.SHORT_ARRAY
                r2[r1] = r4
                r2[r0] = r3
                r5.<init>(r2)
                return r5
            Lc9:
                java.lang.Class<char[]> r3 = char[].class
                boolean r3 = r5.represents(r3)
                if (r3 == 0) goto Le3
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r5 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.EqualsMethod$ConditionalReturn r3 = net.bytebuddy.implementation.EqualsMethod.ConditionalReturn.onZeroInteger()
                net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                net.bytebuddy.implementation.EqualsMethod$ValueComparator r4 = net.bytebuddy.implementation.EqualsMethod.ValueComparator.CHARACTER_ARRAY
                r2[r1] = r4
                r2[r0] = r3
                r5.<init>(r2)
                return r5
            Le3:
                java.lang.Class<int[]> r3 = int[].class
                boolean r3 = r5.represents(r3)
                if (r3 == 0) goto Lfd
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r5 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.EqualsMethod$ConditionalReturn r3 = net.bytebuddy.implementation.EqualsMethod.ConditionalReturn.onZeroInteger()
                net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                net.bytebuddy.implementation.EqualsMethod$ValueComparator r4 = net.bytebuddy.implementation.EqualsMethod.ValueComparator.INTEGER_ARRAY
                r2[r1] = r4
                r2[r0] = r3
                r5.<init>(r2)
                return r5
            Lfd:
                java.lang.Class<long[]> r3 = long[].class
                boolean r3 = r5.represents(r3)
                if (r3 == 0) goto L117
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r5 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.EqualsMethod$ConditionalReturn r3 = net.bytebuddy.implementation.EqualsMethod.ConditionalReturn.onZeroInteger()
                net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                net.bytebuddy.implementation.EqualsMethod$ValueComparator r4 = net.bytebuddy.implementation.EqualsMethod.ValueComparator.LONG_ARRAY
                r2[r1] = r4
                r2[r0] = r3
                r5.<init>(r2)
                return r5
            L117:
                java.lang.Class<float[]> r3 = float[].class
                boolean r3 = r5.represents(r3)
                if (r3 == 0) goto L131
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r5 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.EqualsMethod$ConditionalReturn r3 = net.bytebuddy.implementation.EqualsMethod.ConditionalReturn.onZeroInteger()
                net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                net.bytebuddy.implementation.EqualsMethod$ValueComparator r4 = net.bytebuddy.implementation.EqualsMethod.ValueComparator.FLOAT_ARRAY
                r2[r1] = r4
                r2[r0] = r3
                r5.<init>(r2)
                return r5
            L131:
                java.lang.Class<double[]> r3 = double[].class
                boolean r3 = r5.represents(r3)
                if (r3 == 0) goto L14b
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r5 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.EqualsMethod$ConditionalReturn r3 = net.bytebuddy.implementation.EqualsMethod.ConditionalReturn.onZeroInteger()
                net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                net.bytebuddy.implementation.EqualsMethod$ValueComparator r4 = net.bytebuddy.implementation.EqualsMethod.ValueComparator.DOUBLE_ARRAY
                r2[r1] = r4
                r2[r0] = r3
                r5.<init>(r2)
                return r5
            L14b:
                boolean r3 = r5.isArray()
                if (r3 == 0) goto L170
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r3 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.description.type.TypeDefinition r5 = r5.getComponentType()
                boolean r5 = r5.isArray()
                if (r5 == 0) goto L160
                net.bytebuddy.implementation.EqualsMethod$ValueComparator r5 = net.bytebuddy.implementation.EqualsMethod.ValueComparator.NESTED_ARRAY
                goto L162
            L160:
                net.bytebuddy.implementation.EqualsMethod$ValueComparator r5 = net.bytebuddy.implementation.EqualsMethod.ValueComparator.REFERENCE_ARRAY
            L162:
                net.bytebuddy.implementation.EqualsMethod$ConditionalReturn r4 = net.bytebuddy.implementation.EqualsMethod.ConditionalReturn.onZeroInteger()
                net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                r2[r1] = r5
                r2[r0] = r4
                r3.<init>(r2)
                return r3
            L170:
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r3 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = net.bytebuddy.implementation.EqualsMethod.access$100()
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r4 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r4)
                net.bytebuddy.description.type.TypeDescription r5 = r5.asErasure()
                net.bytebuddy.implementation.bytecode.StackManipulation r5 = r4.virtual(r5)
                net.bytebuddy.implementation.EqualsMethod$ConditionalReturn r4 = net.bytebuddy.implementation.EqualsMethod.ConditionalReturn.onZeroInteger()
                net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                r2[r1] = r5
                r2[r0] = r4
                r3.<init>(r2)
                return r3
            L190:
                net.bytebuddy.implementation.EqualsMethod$ConditionalReturn r5 = net.bytebuddy.implementation.EqualsMethod.ConditionalReturn.onNonEqualInteger()
                return r5
        }

        public static net.bytebuddy.implementation.EqualsMethod.ValueComparator valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.EqualsMethod$ValueComparator> r0 = net.bytebuddy.implementation.EqualsMethod.ValueComparator.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.EqualsMethod$ValueComparator r1 = (net.bytebuddy.implementation.EqualsMethod.ValueComparator) r1
                return r1
        }

        public static net.bytebuddy.implementation.EqualsMethod.ValueComparator[] values() {
                net.bytebuddy.implementation.EqualsMethod$ValueComparator[] r0 = net.bytebuddy.implementation.EqualsMethod.ValueComparator.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.EqualsMethod$ValueComparator[] r0 = (net.bytebuddy.implementation.EqualsMethod.ValueComparator[]) r0
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
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.isEquals()
            net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
            net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
            java.lang.Object r0 = r0.getOnly()
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
            net.bytebuddy.implementation.EqualsMethod.EQUALS = r0
            return
    }

    public EqualsMethod(net.bytebuddy.implementation.EqualsMethod.SuperClassCheck r7) {
            r6 = this;
            net.bytebuddy.implementation.EqualsMethod$TypeCompatibilityCheck r2 = net.bytebuddy.implementation.EqualsMethod.TypeCompatibilityCheck.EXACT
            net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.none()
            net.bytebuddy.matcher.ElementMatcher$Junction r4 = net.bytebuddy.matcher.ElementMatchers.none()
            net.bytebuddy.implementation.EqualsMethod$NaturalOrderComparator r5 = net.bytebuddy.implementation.EqualsMethod.NaturalOrderComparator.INSTANCE
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private EqualsMethod(net.bytebuddy.implementation.EqualsMethod.SuperClassCheck r1, net.bytebuddy.implementation.EqualsMethod.TypeCompatibilityCheck r2, net.bytebuddy.matcher.ElementMatcher.Junction<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> r3, net.bytebuddy.matcher.ElementMatcher.Junction<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> r4, java.util.Comparator<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> r5) {
            r0 = this;
            r0.<init>()
            r0.superClassCheck = r1
            r0.typeCompatibilityCheck = r2
            r0.ignored = r3
            r0.nonNullable = r4
            r0.comparator = r5
            return
    }

    public static /* synthetic */ net.bytebuddy.description.method.MethodDescription.InDefinedShape access$100() {
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.EqualsMethod.EQUALS
            return r0
    }

    public static net.bytebuddy.implementation.EqualsMethod isolated() {
            net.bytebuddy.implementation.EqualsMethod r0 = new net.bytebuddy.implementation.EqualsMethod
            net.bytebuddy.implementation.EqualsMethod$SuperClassCheck r1 = net.bytebuddy.implementation.EqualsMethod.SuperClassCheck.DISABLED
            r0.<init>(r1)
            return r0
    }

    public static net.bytebuddy.implementation.EqualsMethod requiringSuperClassEquality() {
            net.bytebuddy.implementation.EqualsMethod r0 = new net.bytebuddy.implementation.EqualsMethod
            net.bytebuddy.implementation.EqualsMethod$SuperClassCheck r1 = net.bytebuddy.implementation.EqualsMethod.SuperClassCheck.ENABLED
            r0.<init>(r1)
            return r0
    }

    @Override // net.bytebuddy.implementation.Implementation
    public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r12) {
            r11 = this;
            r0 = 1
            net.bytebuddy.description.type.TypeDescription r1 = r12.getInstrumentedType()
            boolean r1 = r1.isInterface()
            if (r1 != 0) goto L77
            java.util.ArrayList r1 = new java.util.ArrayList
            net.bytebuddy.description.type.TypeDescription r2 = r12.getInstrumentedType()
            net.bytebuddy.description.field.FieldList r2 = r2.getDeclaredFields()
            net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.isStatic()
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r4 = r11.ignored
            net.bytebuddy.matcher.ElementMatcher$Junction r3 = r3.or(r4)
            net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.not(r3)
            net.bytebuddy.matcher.FilterableList r2 = r2.filter(r3)
            r1.<init>(r2)
            java.util.Comparator<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r2 = r11.comparator
            java.util.Collections.sort(r1, r2)
            net.bytebuddy.implementation.EqualsMethod$Appender r2 = new net.bytebuddy.implementation.EqualsMethod$Appender
            net.bytebuddy.description.type.TypeDescription r3 = r12.getInstrumentedType()
            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r4 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
            net.bytebuddy.implementation.EqualsMethod$SuperClassCheck r5 = r11.superClassCheck
            net.bytebuddy.description.type.TypeDescription r6 = r12.getInstrumentedType()
            net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.resolve(r6)
            net.bytebuddy.implementation.bytecode.StackManipulation r6 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r7 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.REFERENCE
            net.bytebuddy.implementation.bytecode.StackManipulation r7 = r7.loadFrom(r0)
            net.bytebuddy.implementation.EqualsMethod$ConditionalReturn r8 = net.bytebuddy.implementation.EqualsMethod.ConditionalReturn.onIdentity()
            net.bytebuddy.implementation.bytecode.StackManipulation r8 = r8.returningTrue()
            net.bytebuddy.implementation.EqualsMethod$TypeCompatibilityCheck r9 = r11.typeCompatibilityCheck
            net.bytebuddy.description.type.TypeDescription r12 = r12.getInstrumentedType()
            net.bytebuddy.implementation.bytecode.StackManipulation r12 = r9.resolve(r12)
            r9 = 5
            net.bytebuddy.implementation.bytecode.StackManipulation[] r9 = new net.bytebuddy.implementation.bytecode.StackManipulation[r9]
            r10 = 0
            r9[r10] = r5
            r9[r0] = r6
            r0 = 2
            r9[r0] = r7
            r0 = 3
            r9[r0] = r8
            r0 = 4
            r9[r0] = r12
            r4.<init>(r9)
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r12 = r11.nonNullable
            r2.<init>(r3, r4, r1, r12)
            return r2
        L77:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot implement meaningful equals method for "
            r1.append(r2)
            net.bytebuddy.description.type.TypeDescription r12 = r12.getInstrumentedType()
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r0.<init>(r12)
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
            net.bytebuddy.implementation.EqualsMethod$SuperClassCheck r2 = r4.superClassCheck
            net.bytebuddy.implementation.EqualsMethod r5 = (net.bytebuddy.implementation.EqualsMethod) r5
            net.bytebuddy.implementation.EqualsMethod$SuperClassCheck r3 = r5.superClassCheck
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L20
            return r1
        L20:
            net.bytebuddy.implementation.EqualsMethod$TypeCompatibilityCheck r2 = r4.typeCompatibilityCheck
            net.bytebuddy.implementation.EqualsMethod$TypeCompatibilityCheck r3 = r5.typeCompatibilityCheck
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2b
            return r1
        L2b:
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r2 = r4.ignored
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r3 = r5.ignored
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L36
            return r1
        L36:
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r2 = r4.nonNullable
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r3 = r5.nonNullable
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L41
            return r1
        L41:
            java.util.Comparator<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r2 = r4.comparator
            java.util.Comparator<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r5 = r5.comparator
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L4c
            return r1
        L4c:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            net.bytebuddy.implementation.EqualsMethod$SuperClassCheck r1 = r2.superClassCheck
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.implementation.EqualsMethod$TypeCompatibilityCheck r1 = r2.typeCompatibilityCheck
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r1 = r2.ignored
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r1 = r2.nonNullable
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.Comparator<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r1 = r2.comparator
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
            r0 = this;
            return r1
    }

    public net.bytebuddy.implementation.EqualsMethod withEnumerationTypedFieldsFirst() {
            r1 = this;
            net.bytebuddy.implementation.EqualsMethod$TypePropertyComparator r0 = net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator.FOR_ENUMERATION_TYPES
            net.bytebuddy.implementation.EqualsMethod r0 = r1.withFieldOrder(r0)
            return r0
    }

    public net.bytebuddy.implementation.EqualsMethod withFieldOrder(java.util.Comparator<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> r10) {
            r9 = this;
            net.bytebuddy.implementation.EqualsMethod r6 = new net.bytebuddy.implementation.EqualsMethod
            net.bytebuddy.implementation.EqualsMethod$SuperClassCheck r1 = r9.superClassCheck
            net.bytebuddy.implementation.EqualsMethod$TypeCompatibilityCheck r2 = r9.typeCompatibilityCheck
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r3 = r9.ignored
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r4 = r9.nonNullable
            net.bytebuddy.implementation.EqualsMethod$CompoundComparator r5 = new net.bytebuddy.implementation.EqualsMethod$CompoundComparator
            java.util.Comparator<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r0 = r9.comparator
            r7 = 2
            java.util.Comparator[] r7 = new java.util.Comparator[r7]
            r8 = 0
            r7[r8] = r0
            r0 = 1
            r7[r0] = r10
            r5.<init>(r7)
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public net.bytebuddy.implementation.EqualsMethod withIgnoredFields(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> r8) {
            r7 = this;
            net.bytebuddy.implementation.EqualsMethod r6 = new net.bytebuddy.implementation.EqualsMethod
            net.bytebuddy.implementation.EqualsMethod$SuperClassCheck r1 = r7.superClassCheck
            net.bytebuddy.implementation.EqualsMethod$TypeCompatibilityCheck r2 = r7.typeCompatibilityCheck
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r0 = r7.ignored
            net.bytebuddy.matcher.ElementMatcher$Junction r3 = r0.or(r8)
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r4 = r7.nonNullable
            java.util.Comparator<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r5 = r7.comparator
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public net.bytebuddy.implementation.EqualsMethod withNonNullableFields(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> r8) {
            r7 = this;
            net.bytebuddy.implementation.EqualsMethod r6 = new net.bytebuddy.implementation.EqualsMethod
            net.bytebuddy.implementation.EqualsMethod$SuperClassCheck r1 = r7.superClassCheck
            net.bytebuddy.implementation.EqualsMethod$TypeCompatibilityCheck r2 = r7.typeCompatibilityCheck
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r3 = r7.ignored
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r0 = r7.nonNullable
            net.bytebuddy.matcher.ElementMatcher$Junction r4 = r0.or(r8)
            java.util.Comparator<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r5 = r7.comparator
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public net.bytebuddy.implementation.EqualsMethod withPrimitiveTypedFieldsFirst() {
            r1 = this;
            net.bytebuddy.implementation.EqualsMethod$TypePropertyComparator r0 = net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator.FOR_PRIMITIVE_TYPES
            net.bytebuddy.implementation.EqualsMethod r0 = r1.withFieldOrder(r0)
            return r0
    }

    public net.bytebuddy.implementation.EqualsMethod withPrimitiveWrapperTypedFieldsFirst() {
            r1 = this;
            net.bytebuddy.implementation.EqualsMethod$TypePropertyComparator r0 = net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator.FOR_PRIMITIVE_WRAPPER_TYPES
            net.bytebuddy.implementation.EqualsMethod r0 = r1.withFieldOrder(r0)
            return r0
    }

    public net.bytebuddy.implementation.EqualsMethod withStringTypedFieldsFirst() {
            r1 = this;
            net.bytebuddy.implementation.EqualsMethod$TypePropertyComparator r0 = net.bytebuddy.implementation.EqualsMethod.TypePropertyComparator.FOR_STRING_TYPES
            net.bytebuddy.implementation.EqualsMethod r0 = r1.withFieldOrder(r0)
            return r0
    }

    public net.bytebuddy.implementation.Implementation withSubclassEquality() {
            r7 = this;
            net.bytebuddy.implementation.EqualsMethod r6 = new net.bytebuddy.implementation.EqualsMethod
            net.bytebuddy.implementation.EqualsMethod$SuperClassCheck r1 = r7.superClassCheck
            net.bytebuddy.implementation.EqualsMethod$TypeCompatibilityCheck r2 = net.bytebuddy.implementation.EqualsMethod.TypeCompatibilityCheck.SUBCLASS
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r3 = r7.ignored
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r4 = r7.nonNullable
            java.util.Comparator<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r5 = r7.comparator
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }
}
