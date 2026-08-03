package net.bytebuddy;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class ByteBuddy {
    private static final boolean ACCESS_CONTROLLER = false;
    private static final java.lang.String BYTE_BUDDY_DEFAULT_CONTEXT_NAME = "synthetic";
    private static final java.lang.String BYTE_BUDDY_DEFAULT_PREFIX = "ByteBuddy";
    private static final java.lang.String BYTE_BUDDY_DEFAULT_SUFFIX = "auxiliary";

    @net.bytebuddy.utility.nullability.MaybeNull
    private static final net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy DEFAULT_AUXILIARY_NAMING_STRATEGY = null;

    @net.bytebuddy.utility.nullability.MaybeNull
    private static final net.bytebuddy.implementation.Implementation.Context.Factory DEFAULT_IMPLEMENTATION_CONTEXT_FACTORY = null;
    public static final java.lang.String DEFAULT_NAMING_PROPERTY = "net.bytebuddy.naming";

    @net.bytebuddy.utility.nullability.MaybeNull
    private static final net.bytebuddy.NamingStrategy DEFAULT_NAMING_STRATEGY = null;
    protected final net.bytebuddy.implementation.attribute.AnnotationRetention annotationRetention;
    protected final net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory annotationValueFilterFactory;
    protected final net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy auxiliaryTypeNamingStrategy;
    protected final net.bytebuddy.ClassFileVersion classFileVersion;
    protected final net.bytebuddy.dynamic.scaffold.ClassWriterStrategy classWriterStrategy;
    protected final net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> ignoredMethods;
    protected final net.bytebuddy.implementation.Implementation.Context.Factory implementationContextFactory;
    protected final net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory instrumentedTypeFactory;
    protected final net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler methodGraphCompiler;
    protected final net.bytebuddy.NamingStrategy namingStrategy;
    protected final net.bytebuddy.dynamic.scaffold.TypeValidation typeValidation;
    protected final net.bytebuddy.dynamic.VisibilityBridgeStrategy visibilityBridgeStrategy;

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class EnumerationImplementation implements net.bytebuddy.implementation.Implementation {
        protected static final java.lang.String CLONE_METHOD_NAME = "clone";
        private static final int ENUM_FIELD_MODIFIERS = 25;
        private static final java.lang.String ENUM_VALUES = "$VALUES";
        protected static final java.lang.String ENUM_VALUES_METHOD_NAME = "values";
        protected static final java.lang.String ENUM_VALUE_OF_METHOD_NAME = "valueOf";
        private final java.util.List<java.lang.String> values;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class InitializationAppender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
            private final java.util.List<java.lang.String> values;

            public InitializationAppender(java.util.List<java.lang.String> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.values = r1
                    return
            }

            @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
            public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r19, net.bytebuddy.implementation.Implementation.Context r20, net.bytebuddy.description.method.MethodDescription r21) {
                    r18 = this;
                    r0 = r18
                    r2 = 2
                    r3 = 1
                    net.bytebuddy.description.type.TypeDefinition r4 = r21.getDeclaringType()
                    net.bytebuddy.description.type.TypeDescription r4 = r4.asErasure()
                    net.bytebuddy.description.method.MethodList r5 = r4.getDeclaredMethods()
                    net.bytebuddy.matcher.ElementMatcher$Junction r6 = net.bytebuddy.matcher.ElementMatchers.isConstructor()
                    java.lang.Class<java.lang.String> r7 = java.lang.String.class
                    java.lang.Class r8 = java.lang.Integer.TYPE
                    java.lang.Class[] r7 = new java.lang.Class[]{r7, r8}
                    net.bytebuddy.matcher.ElementMatcher$Junction r7 = net.bytebuddy.matcher.ElementMatchers.takesArguments(r7)
                    net.bytebuddy.matcher.ElementMatcher$Junction r6 = r6.and(r7)
                    net.bytebuddy.matcher.FilterableList r5 = r5.filter(r6)
                    net.bytebuddy.description.method.MethodList r5 = (net.bytebuddy.description.method.MethodList) r5
                    java.lang.Object r5 = r5.getOnly()
                    net.bytebuddy.description.method.MethodDescription r5 = (net.bytebuddy.description.method.MethodDescription) r5
                    net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r6 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                    java.util.ArrayList r7 = new java.util.ArrayList
                    java.util.List<java.lang.String> r8 = r0.values
                    int r8 = r8.size()
                    r7.<init>(r8)
                    java.util.List<java.lang.String> r8 = r0.values
                    java.util.Iterator r8 = r8.iterator()
                    r9 = 0
                    r10 = r9
                L45:
                    boolean r11 = r8.hasNext()
                    if (r11 == 0) goto La2
                    java.lang.Object r11 = r8.next()
                    java.lang.String r11 = (java.lang.String) r11
                    net.bytebuddy.description.field.FieldList r12 = r4.getDeclaredFields()
                    net.bytebuddy.matcher.ElementMatcher$Junction r13 = net.bytebuddy.matcher.ElementMatchers.named(r11)
                    net.bytebuddy.matcher.FilterableList r12 = r12.filter(r13)
                    net.bytebuddy.description.field.FieldList r12 = (net.bytebuddy.description.field.FieldList) r12
                    java.lang.Object r12 = r12.getOnly()
                    net.bytebuddy.description.field.FieldDescription r12 = (net.bytebuddy.description.field.FieldDescription) r12
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r13 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.implementation.bytecode.StackManipulation r14 = net.bytebuddy.implementation.bytecode.TypeCreation.of(r4)
                    net.bytebuddy.implementation.bytecode.constant.TextConstant r15 = new net.bytebuddy.implementation.bytecode.constant.TextConstant
                    r15.<init>(r11)
                    int r11 = r10 + 1
                    net.bytebuddy.implementation.bytecode.StackManipulation r10 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.forValue(r10)
                    net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r16 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r5)
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r17 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r12)
                    net.bytebuddy.implementation.bytecode.StackManipulation r17 = r17.write()
                    r1 = 7
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r1 = new net.bytebuddy.implementation.bytecode.StackManipulation[r1]
                    r1[r9] = r6
                    r1[r3] = r14
                    net.bytebuddy.implementation.bytecode.Duplication r6 = net.bytebuddy.implementation.bytecode.Duplication.SINGLE
                    r1[r2] = r6
                    r6 = 3
                    r1[r6] = r15
                    r6 = 4
                    r1[r6] = r10
                    r6 = 5
                    r1[r6] = r16
                    r6 = 6
                    r1[r6] = r17
                    r13.<init>(r1)
                    r7.add(r12)
                    r10 = r11
                    r6 = r13
                    goto L45
                La2:
                    java.util.ArrayList r1 = new java.util.ArrayList
                    java.util.List<java.lang.String> r5 = r0.values
                    int r5 = r5.size()
                    r1.<init>(r5)
                    java.util.Iterator r5 = r7.iterator()
                Lb1:
                    boolean r7 = r5.hasNext()
                    if (r7 == 0) goto Lc9
                    java.lang.Object r7 = r5.next()
                    net.bytebuddy.description.field.FieldDescription r7 = (net.bytebuddy.description.field.FieldDescription) r7
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r7 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r7)
                    net.bytebuddy.implementation.bytecode.StackManipulation r7 = r7.read()
                    r1.add(r7)
                    goto Lb1
                Lc9:
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r5 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.description.type.TypeDescription$Generic r7 = r4.asGenericType()
                    net.bytebuddy.implementation.bytecode.collection.ArrayFactory r7 = net.bytebuddy.implementation.bytecode.collection.ArrayFactory.forType(r7)
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = r7.withValues(r1)
                    net.bytebuddy.description.field.FieldList r4 = r4.getDeclaredFields()
                    java.lang.String r7 = "$VALUES"
                    net.bytebuddy.matcher.ElementMatcher$Junction r7 = net.bytebuddy.matcher.ElementMatchers.named(r7)
                    net.bytebuddy.matcher.FilterableList r4 = r4.filter(r7)
                    net.bytebuddy.description.field.FieldList r4 = (net.bytebuddy.description.field.FieldList) r4
                    java.lang.Object r4 = r4.getOnly()
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r4 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r4
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r4 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r4)
                    net.bytebuddy.implementation.bytecode.StackManipulation r4 = r4.write()
                    r7 = 3
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r7 = new net.bytebuddy.implementation.bytecode.StackManipulation[r7]
                    r7[r9] = r6
                    r7[r3] = r1
                    r7[r2] = r4
                    r5.<init>(r7)
                    net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r1 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                    r2 = r19
                    r3 = r20
                    net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = r5.apply(r2, r3)
                    int r2 = r2.getMaximalSize()
                    int r3 = r21.getStackSize()
                    r1.<init>(r2, r3)
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
                    java.util.List<java.lang.String> r2 = r4.values
                    net.bytebuddy.ByteBuddy$EnumerationImplementation$InitializationAppender r5 = (net.bytebuddy.ByteBuddy.EnumerationImplementation.InitializationAppender) r5
                    java.util.List<java.lang.String> r5 = r5.values
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
                    java.util.List<java.lang.String> r1 = r2.values
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ValuesMethodAppender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;

            public ValuesMethodAppender(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    r0.<init>()
                    r0.instrumentedType = r1
                    return
            }

            @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
            public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r8, net.bytebuddy.implementation.Implementation.Context r9, net.bytebuddy.description.method.MethodDescription r10) {
                    r7 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r7.instrumentedType
                    net.bytebuddy.description.field.FieldList r0 = r0.getDeclaredFields()
                    java.lang.String r1 = "$VALUES"
                    net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                    net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                    net.bytebuddy.description.field.FieldList r0 = (net.bytebuddy.description.field.FieldList) r0
                    java.lang.Object r0 = r0.getOnly()
                    net.bytebuddy.description.field.FieldDescription r0 = (net.bytebuddy.description.field.FieldDescription) r0
                    java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r1)
                    net.bytebuddy.description.method.MethodList r1 = r1.getDeclaredMethods()
                    java.lang.String r2 = "clone"
                    net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.named(r2)
                    net.bytebuddy.matcher.FilterableList r1 = r1.filter(r2)
                    net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                    java.lang.Object r1 = r1.getOnly()
                    net.bytebuddy.description.method.MethodDescription r1 = (net.bytebuddy.description.method.MethodDescription) r1
                    net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r2 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r3 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r4 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r0)
                    net.bytebuddy.implementation.bytecode.StackManipulation r4 = r4.read()
                    net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r1 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r1)
                    net.bytebuddy.description.type.TypeDescription$Generic r5 = r0.getType()
                    net.bytebuddy.description.type.TypeDescription r5 = r5.asErasure()
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.virtual(r5)
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getType()
                    net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                    net.bytebuddy.implementation.bytecode.StackManipulation r0 = net.bytebuddy.implementation.bytecode.assign.TypeCasting.to(r0)
                    r5 = 4
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r5 = new net.bytebuddy.implementation.bytecode.StackManipulation[r5]
                    r6 = 0
                    r5[r6] = r4
                    r4 = 1
                    r5[r4] = r1
                    r1 = 2
                    r5[r1] = r0
                    net.bytebuddy.implementation.bytecode.member.MethodReturn r0 = net.bytebuddy.implementation.bytecode.member.MethodReturn.REFERENCE
                    r1 = 3
                    r5[r1] = r0
                    r3.<init>(r5)
                    net.bytebuddy.implementation.bytecode.StackManipulation$Size r8 = r3.apply(r8, r9)
                    int r8 = r8.getMaximalSize()
                    int r9 = r10.getStackSize()
                    r2.<init>(r8, r9)
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
                    net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                    net.bytebuddy.ByteBuddy$EnumerationImplementation$ValuesMethodAppender r5 = (net.bytebuddy.ByteBuddy.EnumerationImplementation.ValuesMethodAppender) r5
                    net.bytebuddy.description.type.TypeDescription r5 = r5.instrumentedType
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
                    net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        public EnumerationImplementation(java.util.List<java.lang.String> r1) {
                r0 = this;
                r0.<init>()
                r0.values = r1
                return
        }

        @Override // net.bytebuddy.implementation.Implementation
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r2) {
                r1 = this;
                net.bytebuddy.ByteBuddy$EnumerationImplementation$ValuesMethodAppender r0 = new net.bytebuddy.ByteBuddy$EnumerationImplementation$ValuesMethodAppender
                net.bytebuddy.description.type.TypeDescription r2 = r2.getInstrumentedType()
                r0.<init>(r2)
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
                java.util.List<java.lang.String> r2 = r4.values
                net.bytebuddy.ByteBuddy$EnumerationImplementation r5 = (net.bytebuddy.ByteBuddy.EnumerationImplementation) r5
                java.util.List<java.lang.String> r5 = r5.values
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
                java.util.List<java.lang.String> r1 = r2.values
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r6) {
                r5 = this;
                java.util.List<java.lang.String> r0 = r5.values
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L24
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                net.bytebuddy.description.field.FieldDescription$Token r2 = new net.bytebuddy.description.field.FieldDescription$Token
                net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.dynamic.TargetType.DESCRIPTION
                net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.asGenericType()
                r4 = 16409(0x4019, float:2.2994E-41)
                r2.<init>(r1, r4, r3)
                net.bytebuddy.dynamic.scaffold.InstrumentedType r6 = r6.withField(r2)
                goto L6
            L24:
                net.bytebuddy.description.field.FieldDescription$Token r0 = new net.bytebuddy.description.field.FieldDescription$Token
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.dynamic.TargetType.DESCRIPTION
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ArrayProjection.of(r1)
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.asGenericType()
                java.lang.String r2 = "$VALUES"
                r3 = 4121(0x1019, float:5.775E-42)
                r0.<init>(r2, r3, r1)
                net.bytebuddy.dynamic.scaffold.InstrumentedType r6 = r6.withField(r0)
                net.bytebuddy.ByteBuddy$EnumerationImplementation$InitializationAppender r0 = new net.bytebuddy.ByteBuddy$EnumerationImplementation$InitializationAppender
                java.util.List<java.lang.String> r1 = r5.values
                r0.<init>(r1)
                net.bytebuddy.dynamic.scaffold.InstrumentedType r6 = r6.withInitializer(r0)
                return r6
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public enum RecordConstructorStrategy extends java.lang.Enum<net.bytebuddy.ByteBuddy.RecordConstructorStrategy> implements net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy, net.bytebuddy.implementation.Implementation {
        private static final /* synthetic */ net.bytebuddy.ByteBuddy.RecordConstructorStrategy[] $VALUES = null;
        public static final net.bytebuddy.ByteBuddy.RecordConstructorStrategy INSTANCE = null;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Appender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;

            public Appender(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    r0.<init>()
                    r0.instrumentedType = r1
                    return
            }

            @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
            public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r9, net.bytebuddy.implementation.Implementation.Context r10, net.bytebuddy.description.method.MethodDescription r11) {
                    r8 = this;
                    r0 = 2
                    r1 = 1
                    r2 = 3
                    boolean r3 = r11.isMethod()
                    if (r3 == 0) goto L4a
                    net.bytebuddy.implementation.bytecode.ByteCodeAppender$Simple r3 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Simple
                    net.bytebuddy.implementation.bytecode.StackManipulation r4 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                    net.bytebuddy.description.type.TypeDescription r5 = r8.instrumentedType
                    net.bytebuddy.description.field.FieldList r5 = r5.getDeclaredFields()
                    java.lang.String r6 = r11.getName()
                    net.bytebuddy.matcher.ElementMatcher$Junction r6 = net.bytebuddy.matcher.ElementMatchers.named(r6)
                    net.bytebuddy.matcher.FilterableList r5 = r5.filter(r6)
                    net.bytebuddy.description.field.FieldList r5 = (net.bytebuddy.description.field.FieldList) r5
                    java.lang.Object r5 = r5.getOnly()
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r5 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r5
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r5 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r5)
                    net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.read()
                    net.bytebuddy.description.type.TypeDescription$Generic r6 = r11.getReturnType()
                    net.bytebuddy.implementation.bytecode.StackManipulation r6 = net.bytebuddy.implementation.bytecode.member.MethodReturn.of(r6)
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                    r7 = 0
                    r2[r7] = r4
                    r2[r1] = r5
                    r2[r0] = r6
                    r3.<init>(r2)
                    net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r9 = r3.apply(r9, r10, r11)
                    return r9
                L4a:
                    java.util.ArrayList r3 = new java.util.ArrayList
                    net.bytebuddy.description.type.TypeDescription r4 = r8.instrumentedType
                    net.bytebuddy.description.type.RecordComponentList r4 = r4.getRecordComponents()
                    int r4 = r4.size()
                    int r4 = r4 * r2
                    int r4 = r4 + r0
                    r3.<init>(r4)
                    net.bytebuddy.implementation.bytecode.StackManipulation r0 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                    r3.add(r0)
                    net.bytebuddy.description.method.MethodDescription$Latent r0 = new net.bytebuddy.description.method.MethodDescription$Latent
                    net.bytebuddy.utility.JavaType r2 = net.bytebuddy.utility.JavaType.RECORD
                    net.bytebuddy.description.type.TypeDescription r2 = r2.getTypeStub()
                    net.bytebuddy.description.method.MethodDescription$Token r4 = new net.bytebuddy.description.method.MethodDescription$Token
                    r4.<init>(r1)
                    r0.<init>(r2, r4)
                    net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r0 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r0)
                    r3.add(r0)
                    net.bytebuddy.description.type.TypeDescription r0 = r8.instrumentedType
                    net.bytebuddy.description.type.RecordComponentList r0 = r0.getRecordComponents()
                    java.util.Iterator r0 = r0.iterator()
                L83:
                    boolean r2 = r0.hasNext()
                    if (r2 == 0) goto Ld8
                    java.lang.Object r2 = r0.next()
                    net.bytebuddy.description.type.RecordComponentDescription$InDefinedShape r2 = (net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape) r2
                    net.bytebuddy.implementation.bytecode.StackManipulation r4 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                    r3.add(r4)
                    net.bytebuddy.description.type.TypeDescription$Generic r4 = r2.getType()
                    net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r4 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.of(r4)
                    net.bytebuddy.implementation.bytecode.StackManipulation r4 = r4.loadFrom(r1)
                    r3.add(r4)
                    net.bytebuddy.description.type.TypeDescription r4 = r8.instrumentedType
                    net.bytebuddy.description.field.FieldList r4 = r4.getDeclaredFields()
                    java.lang.String r5 = r2.getActualName()
                    net.bytebuddy.matcher.ElementMatcher$Junction r5 = net.bytebuddy.matcher.ElementMatchers.named(r5)
                    net.bytebuddy.matcher.FilterableList r4 = r4.filter(r5)
                    net.bytebuddy.description.field.FieldList r4 = (net.bytebuddy.description.field.FieldList) r4
                    java.lang.Object r4 = r4.getOnly()
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r4 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r4
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r4 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r4)
                    net.bytebuddy.implementation.bytecode.StackManipulation r4 = r4.write()
                    r3.add(r4)
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.getType()
                    net.bytebuddy.implementation.bytecode.StackSize r2 = r2.getStackSize()
                    int r2 = r2.getSize()
                    int r1 = r1 + r2
                    goto L83
                Ld8:
                    net.bytebuddy.implementation.bytecode.member.MethodReturn r0 = net.bytebuddy.implementation.bytecode.member.MethodReturn.VOID
                    r3.add(r0)
                    net.bytebuddy.implementation.bytecode.ByteCodeAppender$Simple r0 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Simple
                    r0.<init>(r3)
                    net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r9 = r0.apply(r9, r10, r11)
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
                    net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                    net.bytebuddy.ByteBuddy$RecordConstructorStrategy$Appender r5 = (net.bytebuddy.ByteBuddy.RecordConstructorStrategy.Appender) r5
                    net.bytebuddy.description.type.TypeDescription r5 = r5.instrumentedType
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
                    net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        static {
                net.bytebuddy.ByteBuddy$RecordConstructorStrategy r0 = new net.bytebuddy.ByteBuddy$RecordConstructorStrategy
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.ByteBuddy.RecordConstructorStrategy.INSTANCE = r0
                net.bytebuddy.ByteBuddy$RecordConstructorStrategy[] r0 = new net.bytebuddy.ByteBuddy.RecordConstructorStrategy[]{r0}
                net.bytebuddy.ByteBuddy.RecordConstructorStrategy.$VALUES = r0
                return
        }

        RecordConstructorStrategy(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.ByteBuddy.RecordConstructorStrategy valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.ByteBuddy$RecordConstructorStrategy> r0 = net.bytebuddy.ByteBuddy.RecordConstructorStrategy.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.ByteBuddy$RecordConstructorStrategy r1 = (net.bytebuddy.ByteBuddy.RecordConstructorStrategy) r1
                return r1
        }

        public static net.bytebuddy.ByteBuddy.RecordConstructorStrategy[] values() {
                net.bytebuddy.ByteBuddy$RecordConstructorStrategy[] r0 = net.bytebuddy.ByteBuddy.RecordConstructorStrategy.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.ByteBuddy$RecordConstructorStrategy[] r0 = (net.bytebuddy.ByteBuddy.RecordConstructorStrategy[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.Implementation
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r2) {
                r1 = this;
                net.bytebuddy.ByteBuddy$RecordConstructorStrategy$Appender r0 = new net.bytebuddy.ByteBuddy$RecordConstructorStrategy$Appender
                net.bytebuddy.description.type.TypeDescription r2 = r2.getInstrumentedType()
                r0.<init>(r2)
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy
        public java.util.List<net.bytebuddy.description.method.MethodDescription.Token> extractConstructors(net.bytebuddy.description.type.TypeDescription r11) {
                r10 = this;
                java.util.ArrayList r5 = new java.util.ArrayList
                net.bytebuddy.description.type.RecordComponentList r0 = r11.getRecordComponents()
                int r0 = r0.size()
                r5.<init>(r0)
                net.bytebuddy.description.type.RecordComponentList r11 = r11.getRecordComponents()
                java.util.Iterator r11 = r11.iterator()
            L15:
                boolean r0 = r11.hasNext()
                if (r0 == 0) goto L45
                java.lang.Object r0 = r11.next()
                net.bytebuddy.description.type.RecordComponentDescription$InDefinedShape r0 = (net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape) r0
                net.bytebuddy.description.method.ParameterDescription$Token r1 = new net.bytebuddy.description.method.ParameterDescription$Token
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r0.getType()
                net.bytebuddy.description.annotation.AnnotationList r3 = r0.getDeclaredAnnotations()
                java.lang.annotation.ElementType r4 = java.lang.annotation.ElementType.CONSTRUCTOR
                net.bytebuddy.matcher.ElementMatcher$Junction r4 = net.bytebuddy.matcher.ElementMatchers.targetsElement(r4)
                net.bytebuddy.matcher.FilterableList r3 = r3.filter(r4)
                java.lang.String r0 = r0.getActualName()
                r4 = 0
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r1.<init>(r2, r3, r0, r4)
                r5.add(r1)
                goto L15
            L45:
                net.bytebuddy.description.method.MethodDescription$Token r11 = new net.bytebuddy.description.method.MethodDescription$Token
                java.util.List r3 = java.util.Collections.emptyList()
                java.lang.Class r0 = java.lang.Void.TYPE
                net.bytebuddy.description.type.TypeDescription$Generic r4 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r0)
                java.util.List r6 = java.util.Collections.emptyList()
                java.util.List r7 = java.util.Collections.emptyList()
                net.bytebuddy.description.annotation.AnnotationValue<?, ?> r8 = net.bytebuddy.description.annotation.AnnotationValue.UNDEFINED
                net.bytebuddy.description.type.TypeDescription$Generic r9 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                java.lang.String r1 = "<init>"
                r2 = 1
                r0 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                java.util.List r11 = java.util.Collections.singletonList(r11)
                return r11
        }

        @Override // net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy
        public net.bytebuddy.dynamic.scaffold.MethodRegistry inject(net.bytebuddy.description.type.TypeDescription r4, net.bytebuddy.dynamic.scaffold.MethodRegistry r5) {
                r3 = this;
                net.bytebuddy.matcher.LatentMatcher$Resolved r0 = new net.bytebuddy.matcher.LatentMatcher$Resolved
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.isConstructor()
                net.bytebuddy.description.type.RecordComponentList r4 = r4.getRecordComponents()
                net.bytebuddy.description.type.TypeList$Generic r4 = r4.asTypeList()
                net.bytebuddy.matcher.ElementMatcher$Junction r4 = net.bytebuddy.matcher.ElementMatchers.takesGenericArguments(r4)
                net.bytebuddy.matcher.ElementMatcher$Junction r4 = r1.and(r4)
                r0.<init>(r4)
                net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForImplementation r4 = new net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForImplementation
                r4.<init>(r3)
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$ForInstrumentedMethod r1 = net.bytebuddy.implementation.attribute.MethodAttributeAppender.ForInstrumentedMethod.EXCLUDING_RECEIVER
                net.bytebuddy.dynamic.Transformer r2 = net.bytebuddy.dynamic.Transformer.NoOp.make()
                net.bytebuddy.dynamic.scaffold.MethodRegistry r4 = r5.prepend(r0, r4, r1, r2)
                return r4
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r14) {
                r13 = this;
                net.bytebuddy.description.type.RecordComponentList r0 = r14.getRecordComponents()
                java.util.Iterator r0 = r0.iterator()
            L8:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L67
                java.lang.Object r1 = r0.next()
                net.bytebuddy.description.type.RecordComponentDescription$InDefinedShape r1 = (net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape) r1
                net.bytebuddy.description.field.FieldDescription$Token r2 = new net.bytebuddy.description.field.FieldDescription$Token
                java.lang.String r3 = r1.getActualName()
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r1.getType()
                net.bytebuddy.description.annotation.AnnotationList r5 = r1.getDeclaredAnnotations()
                java.lang.annotation.ElementType r6 = java.lang.annotation.ElementType.FIELD
                net.bytebuddy.matcher.ElementMatcher$Junction r6 = net.bytebuddy.matcher.ElementMatchers.targetsElement(r6)
                net.bytebuddy.matcher.FilterableList r5 = r5.filter(r6)
                r6 = 18
                r2.<init>(r3, r6, r4, r5)
                net.bytebuddy.dynamic.scaffold.InstrumentedType r14 = r14.withField(r2)
                net.bytebuddy.description.method.MethodDescription$Token r12 = new net.bytebuddy.description.method.MethodDescription$Token
                java.lang.String r3 = r1.getActualName()
                java.util.List r5 = java.util.Collections.emptyList()
                net.bytebuddy.description.type.TypeDescription$Generic r6 = r1.getType()
                java.util.List r7 = java.util.Collections.emptyList()
                java.util.List r8 = java.util.Collections.emptyList()
                net.bytebuddy.description.annotation.AnnotationList r1 = r1.getDeclaredAnnotations()
                java.lang.annotation.ElementType r2 = java.lang.annotation.ElementType.METHOD
                net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.targetsElement(r2)
                net.bytebuddy.matcher.FilterableList r9 = r1.filter(r2)
                net.bytebuddy.description.annotation.AnnotationValue<?, ?> r10 = net.bytebuddy.description.annotation.AnnotationValue.UNDEFINED
                net.bytebuddy.description.type.TypeDescription$Generic r11 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                r4 = 1
                r2 = r12
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                net.bytebuddy.dynamic.scaffold.InstrumentedType r14 = r14.withMethod(r12)
                goto L8
            L67:
                return r14
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public enum RecordObjectMethod extends java.lang.Enum<net.bytebuddy.ByteBuddy.RecordObjectMethod> implements net.bytebuddy.implementation.Implementation {
        private static final /* synthetic */ net.bytebuddy.ByteBuddy.RecordObjectMethod[] $VALUES = null;
        public static final net.bytebuddy.ByteBuddy.RecordObjectMethod EQUALS = null;
        public static final net.bytebuddy.ByteBuddy.RecordObjectMethod HASH_CODE = null;
        public static final net.bytebuddy.ByteBuddy.RecordObjectMethod TO_STRING = null;
        private final java.util.List<? extends net.bytebuddy.description.type.TypeDescription> arguments;
        private final java.lang.String name;
        private final net.bytebuddy.description.type.TypeDescription returnType;
        private final net.bytebuddy.implementation.bytecode.StackManipulation stackManipulation;

        static {
                net.bytebuddy.ByteBuddy$RecordObjectMethod r7 = new net.bytebuddy.ByteBuddy$RecordObjectMethod
                net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r8 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                java.lang.Class r5 = java.lang.Integer.TYPE
                r9 = 0
                java.lang.Class[] r6 = new java.lang.Class[r9]
                java.lang.String r1 = "HASH_CODE"
                r2 = 0
                java.lang.String r3 = "hashCode"
                r0 = r7
                r4 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6)
                net.bytebuddy.ByteBuddy.RecordObjectMethod.HASH_CODE = r7
                net.bytebuddy.ByteBuddy$RecordObjectMethod r6 = new net.bytebuddy.ByteBuddy$RecordObjectMethod
                net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r0 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.REFERENCE
                r1 = 1
                net.bytebuddy.implementation.bytecode.StackManipulation r14 = r0.loadFrom(r1)
                java.lang.Class r15 = java.lang.Boolean.TYPE
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                java.lang.Class[] r16 = new java.lang.Class[]{r0}
                java.lang.String r11 = "EQUALS"
                r12 = 1
                java.lang.String r13 = "equals"
                r10 = r6
                r10.<init>(r11, r12, r13, r14, r15, r16)
                net.bytebuddy.ByteBuddy.RecordObjectMethod.EQUALS = r6
                net.bytebuddy.ByteBuddy$RecordObjectMethod r10 = new net.bytebuddy.ByteBuddy$RecordObjectMethod
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                java.lang.Class[] r9 = new java.lang.Class[r9]
                java.lang.String r1 = "TO_STRING"
                r2 = 2
                java.lang.String r3 = "toString"
                r0 = r10
                r8 = r6
                r6 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6)
                net.bytebuddy.ByteBuddy.RecordObjectMethod.TO_STRING = r10
                net.bytebuddy.ByteBuddy$RecordObjectMethod[] r0 = new net.bytebuddy.ByteBuddy.RecordObjectMethod[]{r7, r8, r10}
                net.bytebuddy.ByteBuddy.RecordObjectMethod.$VALUES = r0
                return
        }

        RecordObjectMethod(java.lang.String r1, int r2, java.lang.String r3, net.bytebuddy.implementation.bytecode.StackManipulation r4, java.lang.Class r5, java.lang.Class... r6) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.name = r3
                r0.stackManipulation = r4
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r5)
                r0.returnType = r1
                net.bytebuddy.description.type.TypeList$ForLoadedTypes r1 = new net.bytebuddy.description.type.TypeList$ForLoadedTypes
                r1.<init>(r6)
                r0.arguments = r1
                return
        }

        public static net.bytebuddy.ByteBuddy.RecordObjectMethod valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.ByteBuddy$RecordObjectMethod> r0 = net.bytebuddy.ByteBuddy.RecordObjectMethod.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.ByteBuddy$RecordObjectMethod r1 = (net.bytebuddy.ByteBuddy.RecordObjectMethod) r1
                return r1
        }

        public static net.bytebuddy.ByteBuddy.RecordObjectMethod[] values() {
                net.bytebuddy.ByteBuddy$RecordObjectMethod[] r0 = net.bytebuddy.ByteBuddy.RecordObjectMethod.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.ByteBuddy$RecordObjectMethod[] r0 = (net.bytebuddy.ByteBuddy.RecordObjectMethod[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.Implementation
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r22) {
                r21 = this;
                r0 = r21
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.util.ArrayList r7 = new java.util.ArrayList
                net.bytebuddy.description.type.TypeDescription r8 = r22.getInstrumentedType()
                net.bytebuddy.description.type.RecordComponentList r8 = r8.getRecordComponents()
                int r8 = r8.size()
                r7.<init>(r8)
                net.bytebuddy.description.type.TypeDescription r8 = r22.getInstrumentedType()
                net.bytebuddy.description.type.RecordComponentList r8 = r8.getRecordComponents()
                java.util.Iterator r8 = r8.iterator()
            L28:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L6a
                java.lang.Object r9 = r8.next()
                net.bytebuddy.description.type.RecordComponentDescription$InDefinedShape r9 = (net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape) r9
                int r10 = r6.length()
                if (r10 <= 0) goto L3f
                java.lang.String r10 = ";"
                r6.append(r10)
            L3f:
                java.lang.String r10 = r9.getActualName()
                r6.append(r10)
                net.bytebuddy.description.type.TypeDescription r10 = r22.getInstrumentedType()
                net.bytebuddy.description.field.FieldList r10 = r10.getDeclaredFields()
                java.lang.String r9 = r9.getActualName()
                net.bytebuddy.matcher.ElementMatcher$Junction r9 = net.bytebuddy.matcher.ElementMatchers.named(r9)
                net.bytebuddy.matcher.FilterableList r9 = r10.filter(r9)
                net.bytebuddy.description.field.FieldList r9 = (net.bytebuddy.description.field.FieldList) r9
                java.lang.Object r9 = r9.getOnly()
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r9 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r9
                net.bytebuddy.utility.JavaConstant$MethodHandle r9 = net.bytebuddy.utility.JavaConstant.MethodHandle.ofGetter(r9)
                r7.add(r9)
                goto L28
            L6a:
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Simple r8 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Simple
                net.bytebuddy.implementation.bytecode.StackManipulation r9 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                net.bytebuddy.implementation.bytecode.StackManipulation r10 = r0.stackManipulation
                net.bytebuddy.description.method.MethodDescription$Latent r11 = new net.bytebuddy.description.method.MethodDescription$Latent
                net.bytebuddy.utility.JavaType r12 = net.bytebuddy.utility.JavaType.OBJECT_METHODS
                net.bytebuddy.description.type.TypeDescription r12 = r12.getTypeStub()
                net.bytebuddy.description.method.MethodDescription$Token r13 = new net.bytebuddy.description.method.MethodDescription$Token
                java.lang.Class<java.lang.Object> r14 = java.lang.Object.class
                net.bytebuddy.description.type.TypeDescription$Generic r14 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r14)
                net.bytebuddy.utility.JavaType r15 = net.bytebuddy.utility.JavaType.METHOD_HANDLES_LOOKUP
                net.bytebuddy.description.type.TypeDescription r15 = r15.getTypeStub()
                net.bytebuddy.description.type.TypeDescription$Generic r15 = r15.asGenericType()
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                net.bytebuddy.description.type.TypeDescription r17 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r16)
                net.bytebuddy.description.type.TypeDescription$Generic r17 = r17.asGenericType()
                net.bytebuddy.utility.JavaType r18 = net.bytebuddy.utility.JavaType.TYPE_DESCRIPTOR
                net.bytebuddy.description.type.TypeDescription r18 = r18.getTypeStub()
                net.bytebuddy.description.type.TypeDescription$Generic r18 = r18.asGenericType()
                java.lang.Class<java.lang.Class> r19 = java.lang.Class.class
                net.bytebuddy.description.type.TypeDescription r19 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r19)
                net.bytebuddy.description.type.TypeDescription$Generic r19 = r19.asGenericType()
                net.bytebuddy.description.type.TypeDescription r16 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r16)
                net.bytebuddy.description.type.TypeDescription$Generic r16 = r16.asGenericType()
                net.bytebuddy.utility.JavaType r20 = net.bytebuddy.utility.JavaType.METHOD_HANDLE
                net.bytebuddy.description.type.TypeDescription r20 = r20.getTypeStub()
                net.bytebuddy.description.type.TypeDescription r20 = net.bytebuddy.description.type.TypeDescription.ArrayProjection.of(r20)
                net.bytebuddy.description.type.TypeDescription$Generic r20 = r20.asGenericType()
                r1 = 6
                net.bytebuddy.description.type.TypeDescription$Generic[] r1 = new net.bytebuddy.description.type.TypeDescription.Generic[r1]
                r1[r5] = r15
                r1[r4] = r17
                r1[r3] = r18
                r1[r2] = r19
                r15 = 4
                r1[r15] = r16
                r15 = 5
                r1[r15] = r20
                java.util.List r1 = java.util.Arrays.asList(r1)
                java.lang.String r15 = "bootstrap"
                r2 = 9
                r13.<init>(r15, r2, r14, r1)
                r11.<init>(r12, r13)
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r1 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r11)
                java.lang.String r2 = r0.name
                net.bytebuddy.description.type.TypeDescription r11 = r0.returnType
                net.bytebuddy.description.type.TypeDescription r12 = r22.getInstrumentedType()
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r13 = r0.arguments
                java.util.List r12 = net.bytebuddy.utility.CompoundList.of(r12, r13)
                net.bytebuddy.description.type.TypeDescription r13 = r22.getInstrumentedType()
                net.bytebuddy.utility.JavaConstant r13 = net.bytebuddy.utility.JavaConstant.Simple.of(r13)
                java.lang.String r6 = r6.toString()
                net.bytebuddy.utility.JavaConstant r6 = net.bytebuddy.utility.JavaConstant.Simple.ofLoaded(r6)
                net.bytebuddy.utility.JavaConstant[] r14 = new net.bytebuddy.utility.JavaConstant[r3]
                r14[r5] = r13
                r14[r4] = r6
                java.util.List r6 = java.util.Arrays.asList(r14)
                java.util.List r6 = net.bytebuddy.utility.CompoundList.of(r6, r7)
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.dynamic(r2, r11, r12, r6)
                net.bytebuddy.description.type.TypeDescription r2 = r0.returnType
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.member.MethodReturn.of(r2)
                r6 = 4
                net.bytebuddy.implementation.bytecode.StackManipulation[] r6 = new net.bytebuddy.implementation.bytecode.StackManipulation[r6]
                r6[r5] = r9
                r6[r4] = r10
                r6[r3] = r1
                r1 = 3
                r6[r1] = r2
                r8.<init>(r6)
                return r8
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                r0 = this;
                return r1
        }
    }

    static {
            r0 = 0
            r1 = 0
            java.lang.String r2 = "java.security.AccessController"
            java.lang.Class.forName(r2, r0, r1)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            java.lang.String r2 = "net.bytebuddy.securitymanager"
            java.lang.String r3 = "true"
            java.lang.String r2 = java.lang.System.getProperty(r2, r3)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            boolean r2 = java.lang.Boolean.parseBoolean(r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            net.bytebuddy.ByteBuddy.ACCESS_CONTROLLER = r2     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            goto L19
        L16:
            r0 = 1
        L17:
            net.bytebuddy.ByteBuddy.ACCESS_CONTROLLER = r0
        L19:
            net.bytebuddy.utility.privilege.GetSystemPropertyAction r0 = new net.bytebuddy.utility.privilege.GetSystemPropertyAction
            java.lang.String r2 = "net.bytebuddy.naming"
            r0.<init>(r2)
            java.lang.Object r0 = doPrivileged(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "synthetic"
            java.lang.String r3 = "auxiliary"
            java.lang.String r4 = "net.bytebuddy.renamed"
            java.lang.String r5 = "ByteBuddy"
            if (r0 != 0) goto L54
            net.bytebuddy.utility.GraalImageCode r0 = net.bytebuddy.utility.GraalImageCode.getCurrent()
            boolean r0 = r0.isDefined()
            if (r0 == 0) goto L51
            net.bytebuddy.NamingStrategy$Suffixing r1 = new net.bytebuddy.NamingStrategy$Suffixing
            net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver$WithCallerSuffix r0 = new net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver$WithCallerSuffix
            net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver$ForUnnamedType r6 = net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForUnnamedType.INSTANCE
            r0.<init>(r6)
            r1.<init>(r5, r0, r4)
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy$Suffixing r0 = new net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy$Suffixing
            r0.<init>(r3)
            net.bytebuddy.implementation.Implementation$Context$Default$Factory$WithFixedSuffix r3 = new net.bytebuddy.implementation.Implementation$Context$Default$Factory$WithFixedSuffix
            r3.<init>(r2)
            goto Lb1
        L51:
            r0 = r1
            r3 = r0
            goto Lb1
        L54:
            java.lang.String r1 = "fixed"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L6e
            net.bytebuddy.NamingStrategy$Suffixing r1 = new net.bytebuddy.NamingStrategy$Suffixing
            net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver$ForUnnamedType r0 = net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForUnnamedType.INSTANCE
            r1.<init>(r5, r0, r4)
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy$Suffixing r0 = new net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy$Suffixing
            r0.<init>(r3)
            net.bytebuddy.implementation.Implementation$Context$Default$Factory$WithFixedSuffix r3 = new net.bytebuddy.implementation.Implementation$Context$Default$Factory$WithFixedSuffix
            r3.<init>(r2)
            goto Lb1
        L6e:
            java.lang.String r1 = "caller"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L8d
            net.bytebuddy.NamingStrategy$Suffixing r1 = new net.bytebuddy.NamingStrategy$Suffixing
            net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver$WithCallerSuffix r0 = new net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver$WithCallerSuffix
            net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver$ForUnnamedType r6 = net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForUnnamedType.INSTANCE
            r0.<init>(r6)
            r1.<init>(r5, r0, r4)
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy$Suffixing r0 = new net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy$Suffixing
            r0.<init>(r3)
            net.bytebuddy.implementation.Implementation$Context$Default$Factory$WithFixedSuffix r3 = new net.bytebuddy.implementation.Implementation$Context$Default$Factory$WithFixedSuffix
            r3.<init>(r2)
            goto Lb1
        L8d:
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Exception -> Lb8
            net.bytebuddy.NamingStrategy$SuffixingRandom r6 = new net.bytebuddy.NamingStrategy$SuffixingRandom
            net.bytebuddy.NamingStrategy$Suffixing$BaseNameResolver$ForUnnamedType r7 = net.bytebuddy.NamingStrategy.Suffixing.BaseNameResolver.ForUnnamedType.INSTANCE
            net.bytebuddy.utility.RandomString r8 = new net.bytebuddy.utility.RandomString
            java.util.Random r9 = new java.util.Random
            r9.<init>(r0)
            r0 = 8
            r8.<init>(r0, r9)
            r6.<init>(r5, r7, r4, r8)
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy$Suffixing r1 = new net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy$Suffixing
            r1.<init>(r3)
            net.bytebuddy.implementation.Implementation$Context$Default$Factory$WithFixedSuffix r0 = new net.bytebuddy.implementation.Implementation$Context$Default$Factory$WithFixedSuffix
            r0.<init>(r2)
            r3 = r0
            r0 = r1
            r1 = r6
        Lb1:
            net.bytebuddy.ByteBuddy.DEFAULT_NAMING_STRATEGY = r1
            net.bytebuddy.ByteBuddy.DEFAULT_AUXILIARY_NAMING_STRATEGY = r0
            net.bytebuddy.ByteBuddy.DEFAULT_IMPLEMENTATION_CONTEXT_FACTORY = r3
            return
        Lb8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "'net.bytebuddy.naming' is set to an unknown, non-numeric value: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    public ByteBuddy() {
            r1 = this;
            net.bytebuddy.ClassFileVersion r0 = net.bytebuddy.ClassFileVersion.JAVA_V5
            net.bytebuddy.ClassFileVersion r0 = net.bytebuddy.ClassFileVersion.ofThisVm(r0)
            r1.<init>(r0)
            return
    }

    public ByteBuddy(net.bytebuddy.ClassFileVersion r16) {
            r15 = this;
            net.bytebuddy.NamingStrategy r0 = net.bytebuddy.ByteBuddy.DEFAULT_NAMING_STRATEGY
            if (r0 != 0) goto Lb
            net.bytebuddy.NamingStrategy$SuffixingRandom r0 = new net.bytebuddy.NamingStrategy$SuffixingRandom
            java.lang.String r1 = "ByteBuddy"
            r0.<init>(r1)
        Lb:
            r4 = r0
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r0 = net.bytebuddy.ByteBuddy.DEFAULT_AUXILIARY_NAMING_STRATEGY
            if (r0 != 0) goto L17
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy$SuffixingRandom r0 = new net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy$SuffixingRandom
            java.lang.String r1 = "auxiliary"
            r0.<init>(r1)
        L17:
            r5 = r0
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Default r6 = net.bytebuddy.implementation.attribute.AnnotationValueFilter.Default.APPEND_DEFAULTS
            net.bytebuddy.implementation.attribute.AnnotationRetention r7 = net.bytebuddy.implementation.attribute.AnnotationRetention.ENABLED
            net.bytebuddy.implementation.Implementation$Context$Factory r0 = net.bytebuddy.ByteBuddy.DEFAULT_IMPLEMENTATION_CONTEXT_FACTORY
            if (r0 != 0) goto L22
            net.bytebuddy.implementation.Implementation$Context$Default$Factory r0 = net.bytebuddy.implementation.Implementation.Context.Default.Factory.INSTANCE
        L22:
            r8 = r0
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r9 = net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.DEFAULT
            net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory$Default r10 = net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory.Default.MODIFIABLE
            net.bytebuddy.dynamic.scaffold.TypeValidation r11 = net.bytebuddy.dynamic.scaffold.TypeValidation.ENABLED
            net.bytebuddy.dynamic.VisibilityBridgeStrategy$Default r12 = net.bytebuddy.dynamic.VisibilityBridgeStrategy.Default.ALWAYS
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy$Default r13 = net.bytebuddy.dynamic.scaffold.ClassWriterStrategy.Default.CONSTANT_POOL_RETAINING
            net.bytebuddy.matcher.LatentMatcher$Resolved r14 = new net.bytebuddy.matcher.LatentMatcher$Resolved
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isSynthetic()
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.isDefaultFinalizer()
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.or(r1)
            r14.<init>(r0)
            r2 = r15
            r3 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
    }

    public ByteBuddy(net.bytebuddy.ClassFileVersion r1, net.bytebuddy.NamingStrategy r2, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r3, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r4, net.bytebuddy.implementation.attribute.AnnotationRetention r5, net.bytebuddy.implementation.Implementation.Context.Factory r6, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r7, net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory r8, net.bytebuddy.dynamic.scaffold.TypeValidation r9, net.bytebuddy.dynamic.VisibilityBridgeStrategy r10, net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r11, net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r12) {
            r0 = this;
            r0.<init>()
            r0.classFileVersion = r1
            r0.namingStrategy = r2
            r0.auxiliaryTypeNamingStrategy = r3
            r0.annotationValueFilterFactory = r4
            r0.annotationRetention = r5
            r0.implementationContextFactory = r6
            r0.methodGraphCompiler = r7
            r0.instrumentedTypeFactory = r8
            r0.typeValidation = r9
            r0.visibilityBridgeStrategy = r10
            r0.classWriterStrategy = r11
            r0.ignoredMethods = r12
            return
    }

    @net.bytebuddy.utility.nullability.MaybeNull
    @net.bytebuddy.build.AccessControllerPlugin.Enhance
    private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
            boolean r0 = net.bytebuddy.ByteBuddy.ACCESS_CONTROLLER
            if (r0 == 0) goto L9
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
            return r1
        L9:
            java.lang.Object r1 = r1.run()
            return r1
    }

    public <T> net.bytebuddy.dynamic.DynamicType.Builder<T> decorate(java.lang.Class<T> r2) {
            r1 = this;
            java.lang.ClassLoader r0 = r2.getClassLoader()
            net.bytebuddy.dynamic.ClassFileLocator r0 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.of(r0)
            net.bytebuddy.dynamic.DynamicType$Builder r2 = r1.decorate(r2, r0)
            return r2
    }

    public <T> net.bytebuddy.dynamic.DynamicType.Builder<T> decorate(java.lang.Class<T> r1, net.bytebuddy.dynamic.ClassFileLocator r2) {
            r0 = this;
            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
            net.bytebuddy.dynamic.DynamicType$Builder r1 = r0.decorate(r1, r2)
            return r1
    }

    public <T> net.bytebuddy.dynamic.DynamicType.Builder<T> decorate(net.bytebuddy.description.type.TypeDescription r14, net.bytebuddy.dynamic.ClassFileLocator r15) {
            r13 = this;
            boolean r0 = r14.isArray()
            if (r0 != 0) goto L27
            boolean r0 = r14.isPrimitive()
            if (r0 != 0) goto L27
            net.bytebuddy.dynamic.scaffold.inline.DecoratingDynamicTypeBuilder r0 = new net.bytebuddy.dynamic.scaffold.inline.DecoratingDynamicTypeBuilder
            net.bytebuddy.ClassFileVersion r3 = r13.classFileVersion
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r4 = r13.auxiliaryTypeNamingStrategy
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r5 = r13.annotationValueFilterFactory
            net.bytebuddy.implementation.attribute.AnnotationRetention r6 = r13.annotationRetention
            net.bytebuddy.implementation.Implementation$Context$Factory r7 = r13.implementationContextFactory
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r8 = r13.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.TypeValidation r9 = r13.typeValidation
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r10 = r13.classWriterStrategy
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r11 = r13.ignoredMethods
            r1 = r0
            r2 = r14
            r12 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L27:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot decorate array or primitive type: "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r15.<init>(r14)
            throw r15
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
            net.bytebuddy.implementation.attribute.AnnotationRetention r2 = r4.annotationRetention
            net.bytebuddy.ByteBuddy r5 = (net.bytebuddy.ByteBuddy) r5
            net.bytebuddy.implementation.attribute.AnnotationRetention r3 = r5.annotationRetention
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L20
            return r1
        L20:
            net.bytebuddy.dynamic.scaffold.TypeValidation r2 = r4.typeValidation
            net.bytebuddy.dynamic.scaffold.TypeValidation r3 = r5.typeValidation
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2b
            return r1
        L2b:
            net.bytebuddy.ClassFileVersion r2 = r4.classFileVersion
            net.bytebuddy.ClassFileVersion r3 = r5.classFileVersion
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L36
            return r1
        L36:
            net.bytebuddy.NamingStrategy r2 = r4.namingStrategy
            net.bytebuddy.NamingStrategy r3 = r5.namingStrategy
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L41
            return r1
        L41:
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r2 = r4.auxiliaryTypeNamingStrategy
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r3 = r5.auxiliaryTypeNamingStrategy
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4c
            return r1
        L4c:
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r2 = r4.annotationValueFilterFactory
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r3 = r5.annotationValueFilterFactory
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L57
            return r1
        L57:
            net.bytebuddy.implementation.Implementation$Context$Factory r2 = r4.implementationContextFactory
            net.bytebuddy.implementation.Implementation$Context$Factory r3 = r5.implementationContextFactory
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L62
            return r1
        L62:
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r2 = r4.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r3 = r5.methodGraphCompiler
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L6d
            return r1
        L6d:
            net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory r2 = r4.instrumentedTypeFactory
            net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory r3 = r5.instrumentedTypeFactory
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L78
            return r1
        L78:
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r2 = r4.ignoredMethods
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r3 = r5.ignoredMethods
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L83
            return r1
        L83:
            net.bytebuddy.dynamic.VisibilityBridgeStrategy r2 = r4.visibilityBridgeStrategy
            net.bytebuddy.dynamic.VisibilityBridgeStrategy r3 = r5.visibilityBridgeStrategy
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L8e
            return r1
        L8e:
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r2 = r4.classWriterStrategy
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r5 = r5.classWriterStrategy
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L99
            return r1
        L99:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            net.bytebuddy.ClassFileVersion r1 = r2.classFileVersion
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.NamingStrategy r1 = r2.namingStrategy
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r1 = r2.auxiliaryTypeNamingStrategy
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r1 = r2.annotationValueFilterFactory
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.implementation.attribute.AnnotationRetention r1 = r2.annotationRetention
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.implementation.Implementation$Context$Factory r1 = r2.implementationContextFactory
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r1 = r2.methodGraphCompiler
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory r1 = r2.instrumentedTypeFactory
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r2.ignoredMethods
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.dynamic.scaffold.TypeValidation r1 = r2.typeValidation
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.dynamic.VisibilityBridgeStrategy r1 = r2.visibilityBridgeStrategy
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r1 = r2.classWriterStrategy
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public net.bytebuddy.ByteBuddy ignore(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2) {
            r1 = this;
            net.bytebuddy.matcher.LatentMatcher$Resolved r0 = new net.bytebuddy.matcher.LatentMatcher$Resolved
            r0.<init>(r2)
            net.bytebuddy.ByteBuddy r2 = r1.ignore(r0)
            return r2
    }

    public net.bytebuddy.ByteBuddy ignore(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r15) {
            r14 = this;
            net.bytebuddy.ByteBuddy r13 = new net.bytebuddy.ByteBuddy
            net.bytebuddy.ClassFileVersion r1 = r14.classFileVersion
            net.bytebuddy.NamingStrategy r2 = r14.namingStrategy
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r3 = r14.auxiliaryTypeNamingStrategy
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r4 = r14.annotationValueFilterFactory
            net.bytebuddy.implementation.attribute.AnnotationRetention r5 = r14.annotationRetention
            net.bytebuddy.implementation.Implementation$Context$Factory r6 = r14.implementationContextFactory
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r7 = r14.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory r8 = r14.instrumentedTypeFactory
            net.bytebuddy.dynamic.scaffold.TypeValidation r9 = r14.typeValidation
            net.bytebuddy.dynamic.VisibilityBridgeStrategy r10 = r14.visibilityBridgeStrategy
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r11 = r14.classWriterStrategy
            r0 = r13
            r12 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
    }

    public net.bytebuddy.dynamic.DynamicType.Builder<? extends java.lang.annotation.Annotation> makeAnnotation() {
            r14 = this;
            net.bytebuddy.dynamic.scaffold.subclass.SubclassDynamicTypeBuilder r13 = new net.bytebuddy.dynamic.scaffold.subclass.SubclassDynamicTypeBuilder
            net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory r0 = r14.instrumentedTypeFactory
            net.bytebuddy.NamingStrategy r1 = r14.namingStrategy
            java.lang.Class<java.lang.annotation.Annotation> r2 = java.lang.annotation.Annotation.class
            net.bytebuddy.description.type.TypeDescription$Generic r3 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r2)
            java.lang.String r1 = r1.subclass(r3)
            r3 = 2
            net.bytebuddy.description.modifier.ModifierContributor$ForType[] r3 = new net.bytebuddy.description.modifier.ModifierContributor.ForType[r3]
            net.bytebuddy.description.modifier.Visibility r4 = net.bytebuddy.description.modifier.Visibility.PUBLIC
            r5 = 0
            r3[r5] = r4
            net.bytebuddy.description.modifier.TypeManifestation r4 = net.bytebuddy.description.modifier.TypeManifestation.ANNOTATION
            r6 = 1
            r3[r6] = r4
            net.bytebuddy.description.modifier.ModifierContributor$Resolver r3 = net.bytebuddy.description.modifier.ModifierContributor.Resolver.of(r3)
            int r3 = r3.resolve()
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            net.bytebuddy.description.type.TypeDescription$Generic r4 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r4)
            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r0 = r0.subclass(r1, r3, r4)
            net.bytebuddy.description.type.TypeList$Generic$Explicit r1 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
            net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r2)
            net.bytebuddy.description.type.TypeDefinition[] r3 = new net.bytebuddy.description.type.TypeDefinition[r6]
            r3[r5] = r2
            r1.<init>(r3)
            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withInterfaces(r1)
            net.bytebuddy.ClassFileVersion r2 = r14.classFileVersion
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r3 = r14.auxiliaryTypeNamingStrategy
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r4 = r14.annotationValueFilterFactory
            net.bytebuddy.implementation.attribute.AnnotationRetention r5 = r14.annotationRetention
            net.bytebuddy.implementation.Implementation$Context$Factory r6 = r14.implementationContextFactory
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r7 = r14.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.TypeValidation r8 = r14.typeValidation
            net.bytebuddy.dynamic.VisibilityBridgeStrategy r9 = r14.visibilityBridgeStrategy
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r10 = r14.classWriterStrategy
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r11 = r14.ignoredMethods
            net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default r12 = net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.NO_CONSTRUCTORS
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
    }

    public net.bytebuddy.dynamic.DynamicType.Builder<? extends java.lang.Enum<?>> makeEnumeration(java.util.Collection<? extends java.lang.String> r22) {
            r21 = this;
            r0 = r21
            r1 = 2
            r2 = 1
            r3 = 0
            boolean r4 = r22.isEmpty()
            if (r4 != 0) goto Lfb
            java.lang.Class<java.lang.Enum> r4 = java.lang.Enum.class
            java.lang.Class<net.bytebuddy.dynamic.TargetType> r5 = net.bytebuddy.dynamic.TargetType.class
            java.lang.reflect.Type[] r6 = new java.lang.reflect.Type[r2]
            r6[r3] = r5
            net.bytebuddy.description.type.TypeDescription$Generic$Builder r4 = net.bytebuddy.description.type.TypeDescription.Generic.Builder.parameterizedType(r4, r6)
            net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.build()
            net.bytebuddy.dynamic.scaffold.subclass.SubclassDynamicTypeBuilder r15 = new net.bytebuddy.dynamic.scaffold.subclass.SubclassDynamicTypeBuilder
            net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory r6 = r0.instrumentedTypeFactory
            net.bytebuddy.NamingStrategy r7 = r0.namingStrategy
            java.lang.String r7 = r7.subclass(r4)
            net.bytebuddy.description.modifier.Visibility r19 = net.bytebuddy.description.modifier.Visibility.PUBLIC
            r8 = 3
            net.bytebuddy.description.modifier.ModifierContributor$ForType[] r8 = new net.bytebuddy.description.modifier.ModifierContributor.ForType[r8]
            r8[r3] = r19
            net.bytebuddy.description.modifier.TypeManifestation r9 = net.bytebuddy.description.modifier.TypeManifestation.FINAL
            r8[r2] = r9
            net.bytebuddy.description.modifier.EnumerationState r9 = net.bytebuddy.description.modifier.EnumerationState.ENUMERATION
            r8[r1] = r9
            net.bytebuddy.description.modifier.ModifierContributor$Resolver r8 = net.bytebuddy.description.modifier.ModifierContributor.Resolver.of(r8)
            int r8 = r8.resolve()
            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r7 = r6.subclass(r7, r8, r4)
            net.bytebuddy.ClassFileVersion r8 = r0.classFileVersion
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r9 = r0.auxiliaryTypeNamingStrategy
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r10 = r0.annotationValueFilterFactory
            net.bytebuddy.implementation.attribute.AnnotationRetention r11 = r0.annotationRetention
            net.bytebuddy.implementation.Implementation$Context$Factory r12 = r0.implementationContextFactory
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r13 = r0.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.TypeValidation r14 = r0.typeValidation
            net.bytebuddy.dynamic.VisibilityBridgeStrategy r6 = r0.visibilityBridgeStrategy
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r1 = r0.classWriterStrategy
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r3 = r0.ignoredMethods
            net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default r18 = net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.NO_CONSTRUCTORS
            r16 = r6
            r6 = r15
            r20 = r15
            r15 = r16
            r16 = r1
            r17 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r1 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r2]
            net.bytebuddy.description.modifier.Visibility r3 = net.bytebuddy.description.modifier.Visibility.PRIVATE
            r6 = 0
            r1[r6] = r3
            r3 = r20
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r1 = r3.defineConstructor(r1)
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7 = 2
            java.lang.reflect.Type[] r8 = new java.lang.reflect.Type[r7]
            r8[r6] = r3
            java.lang.Class r9 = java.lang.Integer.TYPE
            r8[r2] = r9
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r1 = r1.withParameters(r8)
            net.bytebuddy.implementation.SuperMethodCall r8 = net.bytebuddy.implementation.SuperMethodCall.INSTANCE
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r1 = r1.intercept(r8)
            net.bytebuddy.description.modifier.Ownership r8 = net.bytebuddy.description.modifier.Ownership.STATIC
            net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r9 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r7]
            r9[r6] = r19
            r9[r2] = r8
            java.lang.String r7 = "valueOf"
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r1 = r1.defineMethod(r7, r5, r9)
            java.lang.reflect.Type[] r5 = new java.lang.reflect.Type[r2]
            r5[r6] = r3
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r1 = r1.withParameters(r5)
            net.bytebuddy.description.method.MethodList r4 = r4.getDeclaredMethods()
            net.bytebuddy.matcher.ElementMatcher$Junction r5 = net.bytebuddy.matcher.ElementMatchers.named(r7)
            java.lang.Class<java.lang.Class> r6 = java.lang.Class.class
            java.lang.Class[] r3 = new java.lang.Class[]{r6, r3}
            net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.takesArguments(r3)
            net.bytebuddy.matcher.ElementMatcher$Junction r3 = r5.and(r3)
            net.bytebuddy.matcher.FilterableList r3 = r4.filter(r3)
            net.bytebuddy.description.method.MethodList r3 = (net.bytebuddy.description.method.MethodList) r3
            java.lang.Object r3 = r3.getOnly()
            net.bytebuddy.description.method.MethodDescription r3 = (net.bytebuddy.description.method.MethodDescription) r3
            net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r3 = net.bytebuddy.implementation.MethodCall.invoke(r3)
            net.bytebuddy.implementation.MethodCall r3 = r3.withOwnType()
            r4 = 0
            int[] r5 = new int[]{r4}
            net.bytebuddy.implementation.MethodCall r3 = r3.withArgument(r5)
            net.bytebuddy.implementation.bytecode.assign.Assigner r5 = net.bytebuddy.implementation.bytecode.assign.Assigner.DEFAULT
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r6 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.DYNAMIC
            net.bytebuddy.implementation.Implementation$Composable r3 = r3.withAssigner(r5, r6)
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r1 = r1.intercept(r3)
            java.lang.Class<net.bytebuddy.dynamic.TargetType[]> r3 = net.bytebuddy.dynamic.TargetType[].class
            r5 = 2
            net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r5 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r5]
            r5[r4] = r19
            r5[r2] = r8
            java.lang.String r2 = "values"
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r1 = r1.defineMethod(r2, r3, r5)
            net.bytebuddy.ByteBuddy$EnumerationImplementation r2 = new net.bytebuddy.ByteBuddy$EnumerationImplementation
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = r22
            r3.<init>(r4)
            r2.<init>(r3)
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r1 = r1.intercept(r2)
            return r1
        Lfb:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Require at least one enumeration constant"
            r1.<init>(r2)
            throw r1
    }

    public net.bytebuddy.dynamic.DynamicType.Builder<? extends java.lang.Enum<?>> makeEnumeration(java.lang.String... r1) {
            r0 = this;
            java.util.List r1 = java.util.Arrays.asList(r1)
            net.bytebuddy.dynamic.DynamicType$Builder r1 = r0.makeEnumeration(r1)
            return r1
    }

    public net.bytebuddy.dynamic.DynamicType.Builder<?> makeInterface() {
            r1 = this;
            java.util.List r0 = java.util.Collections.emptyList()
            net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.makeInterface(r0)
            return r0
    }

    public <T> net.bytebuddy.dynamic.DynamicType.Builder<T> makeInterface(java.lang.Class<T> r1) {
            r0 = this;
            java.util.List r1 = java.util.Collections.singletonList(r1)
            net.bytebuddy.dynamic.DynamicType$Builder r1 = r0.makeInterface(r1)
            return r1
    }

    public net.bytebuddy.dynamic.DynamicType.Builder<?> makeInterface(java.util.Collection<? extends net.bytebuddy.description.type.TypeDefinition> r4) {
            r3 = this;
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default r1 = net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.NO_CONSTRUCTORS
            net.bytebuddy.dynamic.DynamicType$Builder r0 = r3.subclass(r0, r1)
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition$Optional r4 = r0.implement(r4)
            r0 = 2
            net.bytebuddy.description.modifier.ModifierContributor$ForType[] r0 = new net.bytebuddy.description.modifier.ModifierContributor.ForType[r0]
            net.bytebuddy.description.modifier.TypeManifestation r1 = net.bytebuddy.description.modifier.TypeManifestation.INTERFACE
            r2 = 0
            r0[r2] = r1
            net.bytebuddy.description.modifier.Visibility r1 = net.bytebuddy.description.modifier.Visibility.PUBLIC
            r2 = 1
            r0[r2] = r1
            net.bytebuddy.dynamic.DynamicType$Builder r4 = r4.modifiers(r0)
            return r4
    }

    public net.bytebuddy.dynamic.DynamicType.Builder<?> makeInterface(java.util.List<? extends java.lang.reflect.Type> r2) {
            r1 = this;
            net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes r0 = new net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes
            r0.<init>(r2)
            net.bytebuddy.dynamic.DynamicType$Builder r2 = r1.makeInterface(r0)
            return r2
    }

    public net.bytebuddy.dynamic.DynamicType.Builder<?> makeInterface(java.lang.reflect.Type... r1) {
            r0 = this;
            java.util.List r1 = java.util.Arrays.asList(r1)
            net.bytebuddy.dynamic.DynamicType$Builder r1 = r0.makeInterface(r1)
            return r1
    }

    public net.bytebuddy.dynamic.DynamicType.Builder<?> makeInterface(net.bytebuddy.description.type.TypeDefinition... r1) {
            r0 = this;
            java.util.List r1 = java.util.Arrays.asList(r1)
            net.bytebuddy.dynamic.DynamicType$Builder r1 = r0.makeInterface(r1)
            return r1
    }

    public net.bytebuddy.dynamic.DynamicType.Builder<?> makePackage(java.lang.String r15) {
            r14 = this;
            net.bytebuddy.dynamic.scaffold.subclass.SubclassDynamicTypeBuilder r13 = new net.bytebuddy.dynamic.scaffold.subclass.SubclassDynamicTypeBuilder
            net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory r0 = r14.instrumentedTypeFactory
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            java.lang.String r15 = "."
            r1.append(r15)
            java.lang.String r15 = "package-info"
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r1)
            r2 = 5632(0x1600, float:7.892E-42)
            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.subclass(r15, r2, r1)
            net.bytebuddy.ClassFileVersion r2 = r14.classFileVersion
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r3 = r14.auxiliaryTypeNamingStrategy
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r4 = r14.annotationValueFilterFactory
            net.bytebuddy.implementation.attribute.AnnotationRetention r5 = r14.annotationRetention
            net.bytebuddy.implementation.Implementation$Context$Factory r6 = r14.implementationContextFactory
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r7 = r14.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.TypeValidation r8 = r14.typeValidation
            net.bytebuddy.dynamic.VisibilityBridgeStrategy r9 = r14.visibilityBridgeStrategy
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r10 = r14.classWriterStrategy
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r11 = r14.ignoredMethods
            net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default r12 = net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.NO_CONSTRUCTORS
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
    }

    public net.bytebuddy.dynamic.DynamicType.Builder<?> makeRecord() {
            r18 = this;
            r0 = r18
            net.bytebuddy.utility.JavaType r1 = net.bytebuddy.utility.JavaType.RECORD
            net.bytebuddy.description.type.TypeDescription r1 = r1.getTypeStub()
            java.lang.String r1 = r1.getName()
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            net.bytebuddy.description.type.TypeDescription$Generic r3 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r2)
            r4 = 1
            net.bytebuddy.description.modifier.ModifierContributor$ForType[] r5 = new net.bytebuddy.description.modifier.ModifierContributor.ForType[r4]
            net.bytebuddy.description.modifier.Visibility r6 = net.bytebuddy.description.modifier.Visibility.PUBLIC
            r7 = 0
            r5[r7] = r6
            net.bytebuddy.dynamic.scaffold.InstrumentedType r1 = net.bytebuddy.dynamic.scaffold.InstrumentedType.Default.of(r1, r3, r5)
            net.bytebuddy.description.method.MethodDescription$Token r3 = new net.bytebuddy.description.method.MethodDescription$Token
            r5 = 4
            r3.<init>(r5)
            net.bytebuddy.dynamic.scaffold.InstrumentedType r1 = r1.withMethod(r3)
            net.bytebuddy.description.method.MethodDescription$Token r3 = new net.bytebuddy.description.method.MethodDescription$Token
            java.lang.Class r5 = java.lang.Integer.TYPE
            net.bytebuddy.description.type.TypeDescription r5 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r5)
            net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.asGenericType()
            java.lang.String r6 = "hashCode"
            r7 = 1025(0x401, float:1.436E-42)
            r3.<init>(r6, r7, r5)
            net.bytebuddy.dynamic.scaffold.InstrumentedType r1 = r1.withMethod(r3)
            net.bytebuddy.description.method.MethodDescription$Token r3 = new net.bytebuddy.description.method.MethodDescription$Token
            java.lang.Class r5 = java.lang.Boolean.TYPE
            net.bytebuddy.description.type.TypeDescription r5 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r5)
            net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.asGenericType()
            net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r2)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            java.lang.String r6 = "equals"
            r3.<init>(r6, r7, r5, r2)
            net.bytebuddy.dynamic.scaffold.InstrumentedType r1 = r1.withMethod(r3)
            net.bytebuddy.description.method.MethodDescription$Token r2 = new net.bytebuddy.description.method.MethodDescription$Token
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r3)
            net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.asGenericType()
            java.lang.String r5 = "toString"
            r2.<init>(r5, r7, r3)
            net.bytebuddy.dynamic.scaffold.InstrumentedType r1 = r1.withMethod(r2)
            net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.asGenericType()
            net.bytebuddy.dynamic.scaffold.subclass.SubclassDynamicTypeBuilder r2 = new net.bytebuddy.dynamic.scaffold.subclass.SubclassDynamicTypeBuilder
            net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory r3 = r0.instrumentedTypeFactory
            net.bytebuddy.NamingStrategy r5 = r0.namingStrategy
            java.lang.String r5 = r5.subclass(r1)
            r6 = 17
            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r3.subclass(r5, r6, r1)
            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r6 = r1.withRecord(r4)
            net.bytebuddy.ClassFileVersion r7 = r0.classFileVersion
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r8 = r0.auxiliaryTypeNamingStrategy
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r9 = r0.annotationValueFilterFactory
            net.bytebuddy.implementation.attribute.AnnotationRetention r10 = r0.annotationRetention
            net.bytebuddy.implementation.Implementation$Context$Factory r11 = r0.implementationContextFactory
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r12 = r0.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.TypeValidation r13 = r0.typeValidation
            net.bytebuddy.dynamic.VisibilityBridgeStrategy r14 = r0.visibilityBridgeStrategy
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r15 = r0.classWriterStrategy
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r0.ignoredMethods
            net.bytebuddy.ByteBuddy$RecordConstructorStrategy r17 = net.bytebuddy.ByteBuddy.RecordConstructorStrategy.INSTANCE
            r5 = r2
            r16 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.isHashCode()
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r1 = r2.method(r1)
            net.bytebuddy.ByteBuddy$RecordObjectMethod r2 = net.bytebuddy.ByteBuddy.RecordObjectMethod.HASH_CODE
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r1 = r1.intercept(r2)
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isEquals()
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r1 = r1.method(r2)
            net.bytebuddy.ByteBuddy$RecordObjectMethod r2 = net.bytebuddy.ByteBuddy.RecordObjectMethod.EQUALS
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r1 = r1.intercept(r2)
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isToString()
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r1 = r1.method(r2)
            net.bytebuddy.ByteBuddy$RecordObjectMethod r2 = net.bytebuddy.ByteBuddy.RecordObjectMethod.TO_STRING
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r1 = r1.intercept(r2)
            return r1
    }

    public <T> net.bytebuddy.dynamic.DynamicType.Builder<T> rebase(java.lang.Class<T> r2) {
            r1 = this;
            java.lang.ClassLoader r0 = r2.getClassLoader()
            net.bytebuddy.dynamic.ClassFileLocator r0 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.of(r0)
            net.bytebuddy.dynamic.DynamicType$Builder r2 = r1.rebase(r2, r0)
            return r2
    }

    public <T> net.bytebuddy.dynamic.DynamicType.Builder<T> rebase(java.lang.Class<T> r1, net.bytebuddy.dynamic.ClassFileLocator r2) {
            r0 = this;
            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
            net.bytebuddy.dynamic.DynamicType$Builder r1 = r0.rebase(r1, r2)
            return r1
    }

    public <T> net.bytebuddy.dynamic.DynamicType.Builder<T> rebase(java.lang.Class<T> r1, net.bytebuddy.dynamic.ClassFileLocator r2, net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer r3) {
            r0 = this;
            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
            net.bytebuddy.dynamic.DynamicType$Builder r1 = r0.rebase(r1, r2, r3)
            return r1
    }

    public net.bytebuddy.dynamic.DynamicType.Builder<?> rebase(java.lang.Package r2, net.bytebuddy.dynamic.ClassFileLocator r3) {
            r1 = this;
            net.bytebuddy.description.type.PackageDescription$ForLoadedPackage r0 = new net.bytebuddy.description.type.PackageDescription$ForLoadedPackage
            r0.<init>(r2)
            net.bytebuddy.dynamic.DynamicType$Builder r2 = r1.rebase(r0, r3)
            return r2
    }

    public net.bytebuddy.dynamic.DynamicType.Builder<?> rebase(net.bytebuddy.description.type.PackageDescription r2, net.bytebuddy.dynamic.ClassFileLocator r3) {
            r1 = this;
            net.bytebuddy.description.type.TypeDescription$ForPackageDescription r0 = new net.bytebuddy.description.type.TypeDescription$ForPackageDescription
            r0.<init>(r2)
            net.bytebuddy.dynamic.DynamicType$Builder r2 = r1.rebase(r0, r3)
            return r2
    }

    public <T> net.bytebuddy.dynamic.DynamicType.Builder<T> rebase(net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.dynamic.ClassFileLocator r3) {
            r1 = this;
            net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer r0 = net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer.Suffixing.withRandomSuffix()
            net.bytebuddy.dynamic.DynamicType$Builder r2 = r1.rebase(r2, r3, r0)
            return r2
    }

    public <T> net.bytebuddy.dynamic.DynamicType.Builder<T> rebase(net.bytebuddy.description.type.TypeDescription r18, net.bytebuddy.dynamic.ClassFileLocator r19, net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer r20) {
            r17 = this;
            r0 = r17
            r13 = r18
            boolean r1 = r18.isArray()
            if (r1 != 0) goto L38
            boolean r1 = r18.isPrimitive()
            if (r1 != 0) goto L38
            net.bytebuddy.dynamic.scaffold.inline.RebaseDynamicTypeBuilder r16 = new net.bytebuddy.dynamic.scaffold.inline.RebaseDynamicTypeBuilder
            net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory r1 = r0.instrumentedTypeFactory
            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r1.represent(r13)
            net.bytebuddy.ClassFileVersion r3 = r0.classFileVersion
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r4 = r0.auxiliaryTypeNamingStrategy
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r5 = r0.annotationValueFilterFactory
            net.bytebuddy.implementation.attribute.AnnotationRetention r6 = r0.annotationRetention
            net.bytebuddy.implementation.Implementation$Context$Factory r7 = r0.implementationContextFactory
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r8 = r0.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.TypeValidation r9 = r0.typeValidation
            net.bytebuddy.dynamic.VisibilityBridgeStrategy r10 = r0.visibilityBridgeStrategy
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r11 = r0.classWriterStrategy
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r12 = r0.ignoredMethods
            r1 = r16
            r13 = r18
            r14 = r19
            r15 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r16
        L38:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot rebase array or primitive type: "
            r2.append(r3)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public <T> net.bytebuddy.dynamic.DynamicType.Builder<T> redefine(java.lang.Class<T> r2) {
            r1 = this;
            java.lang.ClassLoader r0 = r2.getClassLoader()
            net.bytebuddy.dynamic.ClassFileLocator r0 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.of(r0)
            net.bytebuddy.dynamic.DynamicType$Builder r2 = r1.redefine(r2, r0)
            return r2
    }

    public <T> net.bytebuddy.dynamic.DynamicType.Builder<T> redefine(java.lang.Class<T> r1, net.bytebuddy.dynamic.ClassFileLocator r2) {
            r0 = this;
            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
            net.bytebuddy.dynamic.DynamicType$Builder r1 = r0.redefine(r1, r2)
            return r1
    }

    public <T> net.bytebuddy.dynamic.DynamicType.Builder<T> redefine(net.bytebuddy.description.type.TypeDescription r17, net.bytebuddy.dynamic.ClassFileLocator r18) {
            r16 = this;
            r0 = r16
            r13 = r17
            boolean r1 = r17.isArray()
            if (r1 != 0) goto L35
            boolean r1 = r17.isPrimitive()
            if (r1 != 0) goto L35
            net.bytebuddy.dynamic.scaffold.inline.RedefinitionDynamicTypeBuilder r15 = new net.bytebuddy.dynamic.scaffold.inline.RedefinitionDynamicTypeBuilder
            net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory r1 = r0.instrumentedTypeFactory
            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r1.represent(r13)
            net.bytebuddy.ClassFileVersion r3 = r0.classFileVersion
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r4 = r0.auxiliaryTypeNamingStrategy
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r5 = r0.annotationValueFilterFactory
            net.bytebuddy.implementation.attribute.AnnotationRetention r6 = r0.annotationRetention
            net.bytebuddy.implementation.Implementation$Context$Factory r7 = r0.implementationContextFactory
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r8 = r0.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.TypeValidation r9 = r0.typeValidation
            net.bytebuddy.dynamic.VisibilityBridgeStrategy r10 = r0.visibilityBridgeStrategy
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r11 = r0.classWriterStrategy
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r12 = r0.ignoredMethods
            r1 = r15
            r13 = r17
            r14 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r15
        L35:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot redefine array or primitive type: "
            r2.append(r3)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public <T> net.bytebuddy.dynamic.DynamicType.Builder<T> subclass(java.lang.Class<T> r1) {
            r0 = this;
            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
            net.bytebuddy.dynamic.DynamicType$Builder r1 = r0.subclass(r1)
            return r1
    }

    public <T> net.bytebuddy.dynamic.DynamicType.Builder<T> subclass(java.lang.Class<T> r1, net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy r2) {
            r0 = this;
            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
            net.bytebuddy.dynamic.DynamicType$Builder r1 = r0.subclass(r1, r2)
            return r1
    }

    public net.bytebuddy.dynamic.DynamicType.Builder<?> subclass(java.lang.reflect.Type r1) {
            r0 = this;
            net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r1)
            net.bytebuddy.dynamic.DynamicType$Builder r1 = r0.subclass(r1)
            return r1
    }

    public net.bytebuddy.dynamic.DynamicType.Builder<?> subclass(java.lang.reflect.Type r1, net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy r2) {
            r0 = this;
            net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r1)
            net.bytebuddy.dynamic.DynamicType$Builder r1 = r0.subclass(r1, r2)
            return r1
    }

    public net.bytebuddy.dynamic.DynamicType.Builder<?> subclass(net.bytebuddy.description.type.TypeDefinition r2) {
            r1 = this;
            net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default r0 = net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.IMITATE_SUPER_CLASS_OPENING
            net.bytebuddy.dynamic.DynamicType$Builder r2 = r1.subclass(r2, r0)
            return r2
    }

    public net.bytebuddy.dynamic.DynamicType.Builder<?> subclass(net.bytebuddy.description.type.TypeDefinition r21, net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy r22) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 0
            r3 = 1
            boolean r4 = r21.isPrimitive()
            if (r4 != 0) goto L84
            boolean r4 = r21.isArray()
            if (r4 != 0) goto L84
            boolean r4 = r21.isFinal()
            if (r4 != 0) goto L84
            boolean r4 = r21.isInterface()
            if (r4 == 0) goto L2e
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            net.bytebuddy.description.type.TypeDescription$Generic r4 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r4)
            net.bytebuddy.description.type.TypeList$Generic$Explicit r5 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
            net.bytebuddy.description.type.TypeDefinition[] r6 = new net.bytebuddy.description.type.TypeDefinition[r3]
            r6[r2] = r1
            r5.<init>(r6)
            goto L37
        L2e:
            net.bytebuddy.description.type.TypeDescription$Generic r4 = r21.asGenericType()
            net.bytebuddy.description.type.TypeList$Generic$Empty r5 = new net.bytebuddy.description.type.TypeList$Generic$Empty
            r5.<init>()
        L37:
            net.bytebuddy.dynamic.scaffold.subclass.SubclassDynamicTypeBuilder r19 = new net.bytebuddy.dynamic.scaffold.subclass.SubclassDynamicTypeBuilder
            net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory r6 = r0.instrumentedTypeFactory
            net.bytebuddy.NamingStrategy r7 = r0.namingStrategy
            net.bytebuddy.description.type.TypeDescription$Generic r8 = r21.asGenericType()
            java.lang.String r7 = r7.subclass(r8)
            r8 = 2
            net.bytebuddy.description.modifier.ModifierContributor$ForType[] r8 = new net.bytebuddy.description.modifier.ModifierContributor.ForType[r8]
            net.bytebuddy.description.modifier.Visibility r9 = net.bytebuddy.description.modifier.Visibility.PUBLIC
            r8[r2] = r9
            net.bytebuddy.description.modifier.TypeManifestation r2 = net.bytebuddy.description.modifier.TypeManifestation.PLAIN
            r8[r3] = r2
            net.bytebuddy.description.modifier.ModifierContributor$Resolver r2 = net.bytebuddy.description.modifier.ModifierContributor.Resolver.of(r8)
            int r1 = r21.getModifiers()
            int r1 = r2.resolve(r1)
            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r6.subclass(r7, r1, r4)
            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r7 = r1.withInterfaces(r5)
            net.bytebuddy.ClassFileVersion r8 = r0.classFileVersion
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r9 = r0.auxiliaryTypeNamingStrategy
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r10 = r0.annotationValueFilterFactory
            net.bytebuddy.implementation.attribute.AnnotationRetention r11 = r0.annotationRetention
            net.bytebuddy.implementation.Implementation$Context$Factory r12 = r0.implementationContextFactory
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r13 = r0.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.TypeValidation r14 = r0.typeValidation
            net.bytebuddy.dynamic.VisibilityBridgeStrategy r15 = r0.visibilityBridgeStrategy
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r1 = r0.classWriterStrategy
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r2 = r0.ignoredMethods
            r6 = r19
            r16 = r1
            r17 = r2
            r18 = r22
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r19
        L84:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot subclass primitive, array or final types: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
    }

    public net.bytebuddy.ByteBuddy with(net.bytebuddy.ClassFileVersion r15) {
            r14 = this;
            net.bytebuddy.ByteBuddy r13 = new net.bytebuddy.ByteBuddy
            net.bytebuddy.NamingStrategy r2 = r14.namingStrategy
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r3 = r14.auxiliaryTypeNamingStrategy
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r4 = r14.annotationValueFilterFactory
            net.bytebuddy.implementation.attribute.AnnotationRetention r5 = r14.annotationRetention
            net.bytebuddy.implementation.Implementation$Context$Factory r6 = r14.implementationContextFactory
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r7 = r14.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory r8 = r14.instrumentedTypeFactory
            net.bytebuddy.dynamic.scaffold.TypeValidation r9 = r14.typeValidation
            net.bytebuddy.dynamic.VisibilityBridgeStrategy r10 = r14.visibilityBridgeStrategy
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r11 = r14.classWriterStrategy
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r12 = r14.ignoredMethods
            r0 = r13
            r1 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
    }

    public net.bytebuddy.ByteBuddy with(net.bytebuddy.NamingStrategy r15) {
            r14 = this;
            net.bytebuddy.ByteBuddy r13 = new net.bytebuddy.ByteBuddy
            net.bytebuddy.ClassFileVersion r1 = r14.classFileVersion
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r3 = r14.auxiliaryTypeNamingStrategy
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r4 = r14.annotationValueFilterFactory
            net.bytebuddy.implementation.attribute.AnnotationRetention r5 = r14.annotationRetention
            net.bytebuddy.implementation.Implementation$Context$Factory r6 = r14.implementationContextFactory
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r7 = r14.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory r8 = r14.instrumentedTypeFactory
            net.bytebuddy.dynamic.scaffold.TypeValidation r9 = r14.typeValidation
            net.bytebuddy.dynamic.VisibilityBridgeStrategy r10 = r14.visibilityBridgeStrategy
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r11 = r14.classWriterStrategy
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r12 = r14.ignoredMethods
            r0 = r13
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
    }

    public net.bytebuddy.ByteBuddy with(net.bytebuddy.dynamic.VisibilityBridgeStrategy r15) {
            r14 = this;
            net.bytebuddy.ByteBuddy r13 = new net.bytebuddy.ByteBuddy
            net.bytebuddy.ClassFileVersion r1 = r14.classFileVersion
            net.bytebuddy.NamingStrategy r2 = r14.namingStrategy
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r3 = r14.auxiliaryTypeNamingStrategy
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r4 = r14.annotationValueFilterFactory
            net.bytebuddy.implementation.attribute.AnnotationRetention r5 = r14.annotationRetention
            net.bytebuddy.implementation.Implementation$Context$Factory r6 = r14.implementationContextFactory
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r7 = r14.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory r8 = r14.instrumentedTypeFactory
            net.bytebuddy.dynamic.scaffold.TypeValidation r9 = r14.typeValidation
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r11 = r14.classWriterStrategy
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r12 = r14.ignoredMethods
            r0 = r13
            r10 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
    }

    public net.bytebuddy.ByteBuddy with(net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r15) {
            r14 = this;
            net.bytebuddy.ByteBuddy r13 = new net.bytebuddy.ByteBuddy
            net.bytebuddy.ClassFileVersion r1 = r14.classFileVersion
            net.bytebuddy.NamingStrategy r2 = r14.namingStrategy
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r3 = r14.auxiliaryTypeNamingStrategy
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r4 = r14.annotationValueFilterFactory
            net.bytebuddy.implementation.attribute.AnnotationRetention r5 = r14.annotationRetention
            net.bytebuddy.implementation.Implementation$Context$Factory r6 = r14.implementationContextFactory
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r7 = r14.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory r8 = r14.instrumentedTypeFactory
            net.bytebuddy.dynamic.scaffold.TypeValidation r9 = r14.typeValidation
            net.bytebuddy.dynamic.VisibilityBridgeStrategy r10 = r14.visibilityBridgeStrategy
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r12 = r14.ignoredMethods
            r0 = r13
            r11 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
    }

    public net.bytebuddy.ByteBuddy with(net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory r15) {
            r14 = this;
            net.bytebuddy.ByteBuddy r13 = new net.bytebuddy.ByteBuddy
            net.bytebuddy.ClassFileVersion r1 = r14.classFileVersion
            net.bytebuddy.NamingStrategy r2 = r14.namingStrategy
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r3 = r14.auxiliaryTypeNamingStrategy
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r4 = r14.annotationValueFilterFactory
            net.bytebuddy.implementation.attribute.AnnotationRetention r5 = r14.annotationRetention
            net.bytebuddy.implementation.Implementation$Context$Factory r6 = r14.implementationContextFactory
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r7 = r14.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.TypeValidation r9 = r14.typeValidation
            net.bytebuddy.dynamic.VisibilityBridgeStrategy r10 = r14.visibilityBridgeStrategy
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r11 = r14.classWriterStrategy
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r12 = r14.ignoredMethods
            r0 = r13
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
    }

    public net.bytebuddy.ByteBuddy with(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r15) {
            r14 = this;
            net.bytebuddy.ByteBuddy r13 = new net.bytebuddy.ByteBuddy
            net.bytebuddy.ClassFileVersion r1 = r14.classFileVersion
            net.bytebuddy.NamingStrategy r2 = r14.namingStrategy
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r3 = r14.auxiliaryTypeNamingStrategy
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r4 = r14.annotationValueFilterFactory
            net.bytebuddy.implementation.attribute.AnnotationRetention r5 = r14.annotationRetention
            net.bytebuddy.implementation.Implementation$Context$Factory r6 = r14.implementationContextFactory
            net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory r8 = r14.instrumentedTypeFactory
            net.bytebuddy.dynamic.scaffold.TypeValidation r9 = r14.typeValidation
            net.bytebuddy.dynamic.VisibilityBridgeStrategy r10 = r14.visibilityBridgeStrategy
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r11 = r14.classWriterStrategy
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r12 = r14.ignoredMethods
            r0 = r13
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
    }

    public net.bytebuddy.ByteBuddy with(net.bytebuddy.dynamic.scaffold.TypeValidation r15) {
            r14 = this;
            net.bytebuddy.ByteBuddy r13 = new net.bytebuddy.ByteBuddy
            net.bytebuddy.ClassFileVersion r1 = r14.classFileVersion
            net.bytebuddy.NamingStrategy r2 = r14.namingStrategy
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r3 = r14.auxiliaryTypeNamingStrategy
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r4 = r14.annotationValueFilterFactory
            net.bytebuddy.implementation.attribute.AnnotationRetention r5 = r14.annotationRetention
            net.bytebuddy.implementation.Implementation$Context$Factory r6 = r14.implementationContextFactory
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r7 = r14.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory r8 = r14.instrumentedTypeFactory
            net.bytebuddy.dynamic.VisibilityBridgeStrategy r10 = r14.visibilityBridgeStrategy
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r11 = r14.classWriterStrategy
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r12 = r14.ignoredMethods
            r0 = r13
            r9 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
    }

    public net.bytebuddy.ByteBuddy with(net.bytebuddy.implementation.Implementation.Context.Factory r15) {
            r14 = this;
            net.bytebuddy.ByteBuddy r13 = new net.bytebuddy.ByteBuddy
            net.bytebuddy.ClassFileVersion r1 = r14.classFileVersion
            net.bytebuddy.NamingStrategy r2 = r14.namingStrategy
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r3 = r14.auxiliaryTypeNamingStrategy
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r4 = r14.annotationValueFilterFactory
            net.bytebuddy.implementation.attribute.AnnotationRetention r5 = r14.annotationRetention
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r7 = r14.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory r8 = r14.instrumentedTypeFactory
            net.bytebuddy.dynamic.scaffold.TypeValidation r9 = r14.typeValidation
            net.bytebuddy.dynamic.VisibilityBridgeStrategy r10 = r14.visibilityBridgeStrategy
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r11 = r14.classWriterStrategy
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r12 = r14.ignoredMethods
            r0 = r13
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
    }

    public net.bytebuddy.ByteBuddy with(net.bytebuddy.implementation.attribute.AnnotationRetention r15) {
            r14 = this;
            net.bytebuddy.ByteBuddy r13 = new net.bytebuddy.ByteBuddy
            net.bytebuddy.ClassFileVersion r1 = r14.classFileVersion
            net.bytebuddy.NamingStrategy r2 = r14.namingStrategy
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r3 = r14.auxiliaryTypeNamingStrategy
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r4 = r14.annotationValueFilterFactory
            net.bytebuddy.implementation.Implementation$Context$Factory r6 = r14.implementationContextFactory
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r7 = r14.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory r8 = r14.instrumentedTypeFactory
            net.bytebuddy.dynamic.scaffold.TypeValidation r9 = r14.typeValidation
            net.bytebuddy.dynamic.VisibilityBridgeStrategy r10 = r14.visibilityBridgeStrategy
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r11 = r14.classWriterStrategy
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r12 = r14.ignoredMethods
            r0 = r13
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
    }

    public net.bytebuddy.ByteBuddy with(net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r15) {
            r14 = this;
            net.bytebuddy.ByteBuddy r13 = new net.bytebuddy.ByteBuddy
            net.bytebuddy.ClassFileVersion r1 = r14.classFileVersion
            net.bytebuddy.NamingStrategy r2 = r14.namingStrategy
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r3 = r14.auxiliaryTypeNamingStrategy
            net.bytebuddy.implementation.attribute.AnnotationRetention r5 = r14.annotationRetention
            net.bytebuddy.implementation.Implementation$Context$Factory r6 = r14.implementationContextFactory
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r7 = r14.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory r8 = r14.instrumentedTypeFactory
            net.bytebuddy.dynamic.scaffold.TypeValidation r9 = r14.typeValidation
            net.bytebuddy.dynamic.VisibilityBridgeStrategy r10 = r14.visibilityBridgeStrategy
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r11 = r14.classWriterStrategy
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r12 = r14.ignoredMethods
            r0 = r13
            r4 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
    }

    public net.bytebuddy.ByteBuddy with(net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r15) {
            r14 = this;
            net.bytebuddy.ByteBuddy r13 = new net.bytebuddy.ByteBuddy
            net.bytebuddy.ClassFileVersion r1 = r14.classFileVersion
            net.bytebuddy.NamingStrategy r2 = r14.namingStrategy
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r4 = r14.annotationValueFilterFactory
            net.bytebuddy.implementation.attribute.AnnotationRetention r5 = r14.annotationRetention
            net.bytebuddy.implementation.Implementation$Context$Factory r6 = r14.implementationContextFactory
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r7 = r14.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory r8 = r14.instrumentedTypeFactory
            net.bytebuddy.dynamic.scaffold.TypeValidation r9 = r14.typeValidation
            net.bytebuddy.dynamic.VisibilityBridgeStrategy r10 = r14.visibilityBridgeStrategy
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r11 = r14.classWriterStrategy
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r12 = r14.ignoredMethods
            r0 = r13
            r3 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
    }
}
