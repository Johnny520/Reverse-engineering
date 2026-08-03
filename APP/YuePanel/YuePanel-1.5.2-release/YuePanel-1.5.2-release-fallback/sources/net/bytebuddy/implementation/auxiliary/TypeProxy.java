package net.bytebuddy.implementation.auxiliary;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class TypeProxy implements net.bytebuddy.implementation.auxiliary.AuxiliaryType {
    public static final java.lang.String INSTANCE_FIELD = "target";
    public static final java.lang.String REFLECTION_METHOD = "make";
    private final boolean ignoreFinalizer;
    private final net.bytebuddy.implementation.Implementation.Target implementationTarget;
    private final net.bytebuddy.implementation.auxiliary.TypeProxy.InvocationFactory invocationFactory;
    private final net.bytebuddy.description.type.TypeDescription proxiedType;
    private final boolean serializableProxy;

    /* JADX INFO: renamed from: net.bytebuddy.implementation.auxiliary.TypeProxy$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public enum AbstractMethodErrorThrow extends java.lang.Enum<net.bytebuddy.implementation.auxiliary.TypeProxy.AbstractMethodErrorThrow> implements net.bytebuddy.implementation.bytecode.StackManipulation {
        private static final /* synthetic */ net.bytebuddy.implementation.auxiliary.TypeProxy.AbstractMethodErrorThrow[] $VALUES = null;
        public static final net.bytebuddy.implementation.auxiliary.TypeProxy.AbstractMethodErrorThrow INSTANCE = null;
        private final transient net.bytebuddy.implementation.bytecode.StackManipulation implementation;

        static {
                net.bytebuddy.implementation.auxiliary.TypeProxy$AbstractMethodErrorThrow r0 = new net.bytebuddy.implementation.auxiliary.TypeProxy$AbstractMethodErrorThrow
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.auxiliary.TypeProxy.AbstractMethodErrorThrow.INSTANCE = r0
                net.bytebuddy.implementation.auxiliary.TypeProxy$AbstractMethodErrorThrow[] r0 = new net.bytebuddy.implementation.auxiliary.TypeProxy.AbstractMethodErrorThrow[]{r0}
                net.bytebuddy.implementation.auxiliary.TypeProxy.AbstractMethodErrorThrow.$VALUES = r0
                return
        }

        AbstractMethodErrorThrow(java.lang.String r4, int r5) {
                r3 = this;
                r3.<init>(r4, r5)
                java.lang.Class<java.lang.AbstractMethodError> r4 = java.lang.AbstractMethodError.class
                net.bytebuddy.description.type.TypeDescription r4 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r4)
                net.bytebuddy.description.method.MethodList r5 = r4.getDeclaredMethods()
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isConstructor()
                r1 = 0
                net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.takesArguments(r1)
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.and(r2)
                net.bytebuddy.matcher.FilterableList r5 = r5.filter(r0)
                net.bytebuddy.description.method.MethodList r5 = (net.bytebuddy.description.method.MethodList) r5
                java.lang.Object r5 = r5.getOnly()
                net.bytebuddy.description.method.MethodDescription r5 = (net.bytebuddy.description.method.MethodDescription) r5
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.bytecode.StackManipulation r4 = net.bytebuddy.implementation.bytecode.TypeCreation.of(r4)
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r5 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r5)
                r2 = 4
                net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                r2[r1] = r4
                net.bytebuddy.implementation.bytecode.Duplication r4 = net.bytebuddy.implementation.bytecode.Duplication.SINGLE
                r1 = 1
                r2[r1] = r4
                r4 = 2
                r2[r4] = r5
                net.bytebuddy.implementation.bytecode.Throw r4 = net.bytebuddy.implementation.bytecode.Throw.INSTANCE
                r5 = 3
                r2[r5] = r4
                r0.<init>(r2)
                r3.implementation = r0
                return
        }

        public static net.bytebuddy.implementation.auxiliary.TypeProxy.AbstractMethodErrorThrow valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.auxiliary.TypeProxy$AbstractMethodErrorThrow> r0 = net.bytebuddy.implementation.auxiliary.TypeProxy.AbstractMethodErrorThrow.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.auxiliary.TypeProxy$AbstractMethodErrorThrow r1 = (net.bytebuddy.implementation.auxiliary.TypeProxy.AbstractMethodErrorThrow) r1
                return r1
        }

        public static net.bytebuddy.implementation.auxiliary.TypeProxy.AbstractMethodErrorThrow[] values() {
                net.bytebuddy.implementation.auxiliary.TypeProxy$AbstractMethodErrorThrow[] r0 = net.bytebuddy.implementation.auxiliary.TypeProxy.AbstractMethodErrorThrow.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.auxiliary.TypeProxy$AbstractMethodErrorThrow[] r0 = (net.bytebuddy.implementation.auxiliary.TypeProxy.AbstractMethodErrorThrow[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.Implementation.Context r3) {
                r1 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = r1.implementation
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = r0.apply(r2, r3)
                return r2
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
                r1 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = r1.implementation
                boolean r0 = r0.isValid()
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForDefaultMethod extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
        private final net.bytebuddy.implementation.Implementation.Target implementationTarget;
        private final net.bytebuddy.description.type.TypeDescription proxiedType;
        private final boolean serializableProxy;

        public ForDefaultMethod(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.implementation.Implementation.Target r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.proxiedType = r1
                r0.implementationTarget = r2
                r0.serializableProxy = r3
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r8, net.bytebuddy.implementation.Implementation.Context r9) {
                r7 = this;
                net.bytebuddy.implementation.auxiliary.TypeProxy r6 = new net.bytebuddy.implementation.auxiliary.TypeProxy
                net.bytebuddy.description.type.TypeDescription r1 = r7.proxiedType
                net.bytebuddy.implementation.Implementation$Target r2 = r7.implementationTarget
                net.bytebuddy.implementation.auxiliary.TypeProxy$InvocationFactory$Default r3 = net.bytebuddy.implementation.auxiliary.TypeProxy.InvocationFactory.Default.DEFAULT_METHOD
                r4 = 1
                boolean r5 = r7.serializableProxy
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                net.bytebuddy.description.type.TypeDescription r0 = r9.register(r6)
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r1 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.TypeCreation.of(r0)
                net.bytebuddy.description.method.MethodList r3 = r0.getDeclaredMethods()
                net.bytebuddy.matcher.ElementMatcher$Junction r4 = net.bytebuddy.matcher.ElementMatchers.isConstructor()
                net.bytebuddy.matcher.FilterableList r3 = r3.filter(r4)
                net.bytebuddy.description.method.MethodList r3 = (net.bytebuddy.description.method.MethodList) r3
                java.lang.Object r3 = r3.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r3
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r3 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r3)
                net.bytebuddy.implementation.bytecode.StackManipulation r4 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                net.bytebuddy.description.field.FieldList r0 = r0.getDeclaredFields()
                java.lang.String r5 = "target"
                net.bytebuddy.matcher.ElementMatcher$Junction r5 = net.bytebuddy.matcher.ElementMatchers.named(r5)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r5)
                net.bytebuddy.description.field.FieldList r0 = (net.bytebuddy.description.field.FieldList) r0
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r0 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r0
                net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r0 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r0)
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = r0.write()
                r5 = 6
                net.bytebuddy.implementation.bytecode.StackManipulation[] r5 = new net.bytebuddy.implementation.bytecode.StackManipulation[r5]
                r6 = 0
                r5[r6] = r2
                net.bytebuddy.implementation.bytecode.Duplication r2 = net.bytebuddy.implementation.bytecode.Duplication.SINGLE
                r6 = 1
                r5[r6] = r2
                r6 = 2
                r5[r6] = r3
                r3 = 3
                r5[r3] = r2
                r2 = 4
                r5[r2] = r4
                r2 = 5
                r5[r2] = r0
                r1.<init>(r5)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r8 = r1.apply(r8, r9)
                return r8
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
                boolean r2 = r4.serializableProxy
                net.bytebuddy.implementation.auxiliary.TypeProxy$ForDefaultMethod r5 = (net.bytebuddy.implementation.auxiliary.TypeProxy.ForDefaultMethod) r5
                boolean r3 = r5.serializableProxy
                if (r2 == r3) goto L1c
                return r1
            L1c:
                net.bytebuddy.description.type.TypeDescription r2 = r4.proxiedType
                net.bytebuddy.description.type.TypeDescription r3 = r5.proxiedType
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L27
                return r1
            L27:
                net.bytebuddy.implementation.Implementation$Target r2 = r4.implementationTarget
                net.bytebuddy.implementation.Implementation$Target r5 = r5.implementationTarget
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L32
                return r1
            L32:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.description.type.TypeDescription r1 = r2.proxiedType
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.Implementation$Target r1 = r2.implementationTarget
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                boolean r1 = r2.serializableProxy
                int r0 = r0 + r1
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForSuperMethodByConstructor extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
        private final java.util.List<net.bytebuddy.description.type.TypeDescription> constructorParameters;
        private final boolean ignoreFinalizer;
        private final net.bytebuddy.implementation.Implementation.Target implementationTarget;
        private final net.bytebuddy.description.type.TypeDescription proxiedType;
        private final boolean serializableProxy;

        public ForSuperMethodByConstructor(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.implementation.Implementation.Target r2, java.util.List<net.bytebuddy.description.type.TypeDescription> r3, boolean r4, boolean r5) {
                r0 = this;
                r0.<init>()
                r0.proxiedType = r1
                r0.implementationTarget = r2
                r0.constructorParameters = r3
                r0.ignoreFinalizer = r4
                r0.serializableProxy = r5
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r10, net.bytebuddy.implementation.Implementation.Context r11) {
                r9 = this;
                r0 = 1
                net.bytebuddy.implementation.auxiliary.TypeProxy r7 = new net.bytebuddy.implementation.auxiliary.TypeProxy
                net.bytebuddy.description.type.TypeDescription r2 = r9.proxiedType
                net.bytebuddy.implementation.Implementation$Target r3 = r9.implementationTarget
                net.bytebuddy.implementation.auxiliary.TypeProxy$InvocationFactory$Default r4 = net.bytebuddy.implementation.auxiliary.TypeProxy.InvocationFactory.Default.SUPER_METHOD
                boolean r5 = r9.ignoreFinalizer
                boolean r6 = r9.serializableProxy
                r1 = r7
                r1.<init>(r2, r3, r4, r5, r6)
                net.bytebuddy.description.type.TypeDescription r1 = r11.register(r7)
                java.util.List<net.bytebuddy.description.type.TypeDescription> r2 = r9.constructorParameters
                int r2 = r2.size()
                net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                java.util.List<net.bytebuddy.description.type.TypeDescription> r3 = r9.constructorParameters
                java.util.Iterator r3 = r3.iterator()
                r4 = 0
                r5 = r4
            L25:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L3b
                java.lang.Object r6 = r3.next()
                net.bytebuddy.description.type.TypeDescription r6 = (net.bytebuddy.description.type.TypeDescription) r6
                int r7 = r5 + 1
                net.bytebuddy.implementation.bytecode.StackManipulation r6 = net.bytebuddy.implementation.bytecode.constant.DefaultValue.of(r6)
                r2[r5] = r6
                r5 = r7
                goto L25
            L3b:
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r3 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.bytecode.StackManipulation r5 = net.bytebuddy.implementation.bytecode.TypeCreation.of(r1)
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r6 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                r6.<init>(r2)
                net.bytebuddy.description.method.MethodList r2 = r1.getDeclaredMethods()
                net.bytebuddy.matcher.ElementMatcher$Junction r7 = net.bytebuddy.matcher.ElementMatchers.isConstructor()
                java.util.List<net.bytebuddy.description.type.TypeDescription> r8 = r9.constructorParameters
                net.bytebuddy.matcher.ElementMatcher$Junction r8 = net.bytebuddy.matcher.ElementMatchers.takesArguments(r8)
                net.bytebuddy.matcher.ElementMatcher$Junction r7 = r7.and(r8)
                net.bytebuddy.matcher.FilterableList r2 = r2.filter(r7)
                net.bytebuddy.description.method.MethodList r2 = (net.bytebuddy.description.method.MethodList) r2
                java.lang.Object r2 = r2.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r2
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r2 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r2)
                net.bytebuddy.implementation.bytecode.StackManipulation r7 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                net.bytebuddy.description.field.FieldList r1 = r1.getDeclaredFields()
                java.lang.String r8 = "target"
                net.bytebuddy.matcher.ElementMatcher$Junction r8 = net.bytebuddy.matcher.ElementMatchers.named(r8)
                net.bytebuddy.matcher.FilterableList r1 = r1.filter(r8)
                net.bytebuddy.description.field.FieldList r1 = (net.bytebuddy.description.field.FieldList) r1
                java.lang.Object r1 = r1.getOnly()
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r1 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r1
                net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r1 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r1)
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.write()
                r8 = 7
                net.bytebuddy.implementation.bytecode.StackManipulation[] r8 = new net.bytebuddy.implementation.bytecode.StackManipulation[r8]
                r8[r4] = r5
                net.bytebuddy.implementation.bytecode.Duplication r4 = net.bytebuddy.implementation.bytecode.Duplication.SINGLE
                r8[r0] = r4
                r0 = 2
                r8[r0] = r6
                r0 = 3
                r8[r0] = r2
                r0 = 4
                r8[r0] = r4
                r0 = 5
                r8[r0] = r7
                r0 = 6
                r8[r0] = r1
                r3.<init>(r8)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r10 = r3.apply(r10, r11)
                return r10
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
                boolean r2 = r4.ignoreFinalizer
                net.bytebuddy.implementation.auxiliary.TypeProxy$ForSuperMethodByConstructor r5 = (net.bytebuddy.implementation.auxiliary.TypeProxy.ForSuperMethodByConstructor) r5
                boolean r3 = r5.ignoreFinalizer
                if (r2 == r3) goto L1c
                return r1
            L1c:
                boolean r2 = r4.serializableProxy
                boolean r3 = r5.serializableProxy
                if (r2 == r3) goto L23
                return r1
            L23:
                net.bytebuddy.description.type.TypeDescription r2 = r4.proxiedType
                net.bytebuddy.description.type.TypeDescription r3 = r5.proxiedType
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L2e
                return r1
            L2e:
                net.bytebuddy.implementation.Implementation$Target r2 = r4.implementationTarget
                net.bytebuddy.implementation.Implementation$Target r3 = r5.implementationTarget
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L39
                return r1
            L39:
                java.util.List<net.bytebuddy.description.type.TypeDescription> r2 = r4.constructorParameters
                java.util.List<net.bytebuddy.description.type.TypeDescription> r5 = r5.constructorParameters
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L44
                return r1
            L44:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.description.type.TypeDescription r1 = r2.proxiedType
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.Implementation$Target r1 = r2.implementationTarget
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<net.bytebuddy.description.type.TypeDescription> r1 = r2.constructorParameters
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                boolean r1 = r2.ignoreFinalizer
                int r0 = r0 + r1
                int r0 = r0 * 31
                boolean r1 = r2.serializableProxy
                int r0 = r0 + r1
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForSuperMethodByReflectionFactory extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
        private final boolean ignoreFinalizer;
        private final net.bytebuddy.implementation.Implementation.Target implementationTarget;
        private final net.bytebuddy.description.type.TypeDescription proxiedType;
        private final boolean serializableProxy;

        public ForSuperMethodByReflectionFactory(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.implementation.Implementation.Target r2, boolean r3, boolean r4) {
                r0 = this;
                r0.<init>()
                r0.proxiedType = r1
                r0.implementationTarget = r2
                r0.ignoreFinalizer = r3
                r0.serializableProxy = r4
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r8, net.bytebuddy.implementation.Implementation.Context r9) {
                r7 = this;
                net.bytebuddy.implementation.auxiliary.TypeProxy r6 = new net.bytebuddy.implementation.auxiliary.TypeProxy
                net.bytebuddy.description.type.TypeDescription r1 = r7.proxiedType
                net.bytebuddy.implementation.Implementation$Target r2 = r7.implementationTarget
                net.bytebuddy.implementation.auxiliary.TypeProxy$InvocationFactory$Default r3 = net.bytebuddy.implementation.auxiliary.TypeProxy.InvocationFactory.Default.SUPER_METHOD
                boolean r4 = r7.ignoreFinalizer
                boolean r5 = r7.serializableProxy
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                net.bytebuddy.description.type.TypeDescription r0 = r9.register(r6)
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r1 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.description.method.MethodList r2 = r0.getDeclaredMethods()
                java.lang.String r3 = "make"
                net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.named(r3)
                r4 = 0
                net.bytebuddy.matcher.ElementMatcher$Junction r5 = net.bytebuddy.matcher.ElementMatchers.takesArguments(r4)
                net.bytebuddy.matcher.ElementMatcher$Junction r3 = r3.and(r5)
                net.bytebuddy.matcher.FilterableList r2 = r2.filter(r3)
                net.bytebuddy.description.method.MethodList r2 = (net.bytebuddy.description.method.MethodList) r2
                java.lang.Object r2 = r2.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r2
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r2 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r2)
                net.bytebuddy.implementation.bytecode.StackManipulation r3 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                net.bytebuddy.description.field.FieldList r0 = r0.getDeclaredFields()
                java.lang.String r5 = "target"
                net.bytebuddy.matcher.ElementMatcher$Junction r5 = net.bytebuddy.matcher.ElementMatchers.named(r5)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r5)
                net.bytebuddy.description.field.FieldList r0 = (net.bytebuddy.description.field.FieldList) r0
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r0 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r0
                net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r0 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r0)
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = r0.write()
                r5 = 4
                net.bytebuddy.implementation.bytecode.StackManipulation[] r5 = new net.bytebuddy.implementation.bytecode.StackManipulation[r5]
                r5[r4] = r2
                net.bytebuddy.implementation.bytecode.Duplication r2 = net.bytebuddy.implementation.bytecode.Duplication.SINGLE
                r4 = 1
                r5[r4] = r2
                r2 = 2
                r5[r2] = r3
                r2 = 3
                r5[r2] = r0
                r1.<init>(r5)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r8 = r1.apply(r8, r9)
                return r8
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
                boolean r2 = r4.ignoreFinalizer
                net.bytebuddy.implementation.auxiliary.TypeProxy$ForSuperMethodByReflectionFactory r5 = (net.bytebuddy.implementation.auxiliary.TypeProxy.ForSuperMethodByReflectionFactory) r5
                boolean r3 = r5.ignoreFinalizer
                if (r2 == r3) goto L1c
                return r1
            L1c:
                boolean r2 = r4.serializableProxy
                boolean r3 = r5.serializableProxy
                if (r2 == r3) goto L23
                return r1
            L23:
                net.bytebuddy.description.type.TypeDescription r2 = r4.proxiedType
                net.bytebuddy.description.type.TypeDescription r3 = r5.proxiedType
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L2e
                return r1
            L2e:
                net.bytebuddy.implementation.Implementation$Target r2 = r4.implementationTarget
                net.bytebuddy.implementation.Implementation$Target r5 = r5.implementationTarget
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L39
                return r1
            L39:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.description.type.TypeDescription r1 = r2.proxiedType
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.Implementation$Target r1 = r2.implementationTarget
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                boolean r1 = r2.ignoreFinalizer
                int r0 = r0 + r1
                int r0 = r0 * 31
                boolean r1 = r2.serializableProxy
                int r0 = r0 + r1
                return r0
        }
    }

    public interface InvocationFactory {

        public enum Default extends java.lang.Enum<net.bytebuddy.implementation.auxiliary.TypeProxy.InvocationFactory.Default> implements net.bytebuddy.implementation.auxiliary.TypeProxy.InvocationFactory {
            private static final /* synthetic */ net.bytebuddy.implementation.auxiliary.TypeProxy.InvocationFactory.Default[] $VALUES = null;
            public static final net.bytebuddy.implementation.auxiliary.TypeProxy.InvocationFactory.Default DEFAULT_METHOD = null;
            public static final net.bytebuddy.implementation.auxiliary.TypeProxy.InvocationFactory.Default SUPER_METHOD = null;



            static {
                    net.bytebuddy.implementation.auxiliary.TypeProxy$InvocationFactory$Default$1 r0 = new net.bytebuddy.implementation.auxiliary.TypeProxy$InvocationFactory$Default$1
                    java.lang.String r1 = "SUPER_METHOD"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.implementation.auxiliary.TypeProxy.InvocationFactory.Default.SUPER_METHOD = r0
                    net.bytebuddy.implementation.auxiliary.TypeProxy$InvocationFactory$Default$2 r1 = new net.bytebuddy.implementation.auxiliary.TypeProxy$InvocationFactory$Default$2
                    java.lang.String r3 = "DEFAULT_METHOD"
                    r4 = 1
                    r1.<init>(r3, r4)
                    net.bytebuddy.implementation.auxiliary.TypeProxy.InvocationFactory.Default.DEFAULT_METHOD = r1
                    r3 = 2
                    net.bytebuddy.implementation.auxiliary.TypeProxy$InvocationFactory$Default[] r3 = new net.bytebuddy.implementation.auxiliary.TypeProxy.InvocationFactory.Default[r3]
                    r3[r2] = r0
                    r3[r4] = r1
                    net.bytebuddy.implementation.auxiliary.TypeProxy.InvocationFactory.Default.$VALUES = r3
                    return
            }

            Default(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            /* synthetic */ Default(java.lang.String r1, int r2, net.bytebuddy.implementation.auxiliary.TypeProxy.AnonymousClass1 r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.implementation.auxiliary.TypeProxy.InvocationFactory.Default valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.implementation.auxiliary.TypeProxy$InvocationFactory$Default> r0 = net.bytebuddy.implementation.auxiliary.TypeProxy.InvocationFactory.Default.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.implementation.auxiliary.TypeProxy$InvocationFactory$Default r1 = (net.bytebuddy.implementation.auxiliary.TypeProxy.InvocationFactory.Default) r1
                    return r1
            }

            public static net.bytebuddy.implementation.auxiliary.TypeProxy.InvocationFactory.Default[] values() {
                    net.bytebuddy.implementation.auxiliary.TypeProxy$InvocationFactory$Default[] r0 = net.bytebuddy.implementation.auxiliary.TypeProxy.InvocationFactory.Default.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.implementation.auxiliary.TypeProxy$InvocationFactory$Default[] r0 = (net.bytebuddy.implementation.auxiliary.TypeProxy.InvocationFactory.Default[]) r0
                    return r0
            }
        }

        net.bytebuddy.implementation.Implementation.SpecialMethodInvocation invoke(net.bytebuddy.implementation.Implementation.Target r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.description.method.MethodDescription r3);
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
    public class MethodCall implements net.bytebuddy.implementation.Implementation {
        private final net.bytebuddy.implementation.MethodAccessorFactory methodAccessorFactory;
        final /* synthetic */ net.bytebuddy.implementation.auxiliary.TypeProxy this$0;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
        public class Appender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
            private final net.bytebuddy.implementation.bytecode.StackManipulation fieldLoadingInstruction;
            final /* synthetic */ net.bytebuddy.implementation.auxiliary.TypeProxy.MethodCall this$1;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
            public class AccessorMethodInvocation implements net.bytebuddy.implementation.bytecode.StackManipulation {
                private final net.bytebuddy.description.method.MethodDescription instrumentedMethod;
                private final net.bytebuddy.implementation.Implementation.SpecialMethodInvocation specialMethodInvocation;
                final /* synthetic */ net.bytebuddy.implementation.auxiliary.TypeProxy.MethodCall.Appender this$2;

                public AccessorMethodInvocation(net.bytebuddy.implementation.auxiliary.TypeProxy.MethodCall.Appender r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.Implementation.SpecialMethodInvocation r3) {
                        r0 = this;
                        r0.this$2 = r1
                        r0.<init>()
                        r0.instrumentedMethod = r2
                        r0.specialMethodInvocation = r3
                        return
                }

                @Override // net.bytebuddy.implementation.bytecode.StackManipulation
                public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r9, net.bytebuddy.implementation.Implementation.Context r10) {
                        r8 = this;
                        net.bytebuddy.implementation.auxiliary.TypeProxy$MethodCall$Appender r0 = r8.this$2
                        net.bytebuddy.implementation.auxiliary.TypeProxy$MethodCall r0 = r0.this$1
                        net.bytebuddy.implementation.MethodAccessorFactory r0 = net.bytebuddy.implementation.auxiliary.TypeProxy.MethodCall.access$500(r0)
                        net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r1 = r8.specialMethodInvocation
                        net.bytebuddy.implementation.MethodAccessorFactory$AccessType r2 = net.bytebuddy.implementation.MethodAccessorFactory.AccessType.DEFAULT
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r0.registerAccessorFor(r1, r2)
                        net.bytebuddy.implementation.bytecode.StackManipulation$Compound r1 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                        net.bytebuddy.implementation.auxiliary.TypeProxy$MethodCall$Appender r3 = r8.this$2
                        net.bytebuddy.implementation.bytecode.StackManipulation r3 = net.bytebuddy.implementation.auxiliary.TypeProxy.MethodCall.Appender.access$600(r3)
                        net.bytebuddy.description.method.MethodDescription r4 = r8.instrumentedMethod
                        net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading r4 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.allArgumentsOf(r4)
                        net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading r4 = r4.asBridgeOf(r0)
                        net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r0 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r0)
                        net.bytebuddy.description.method.MethodDescription r5 = r8.instrumentedMethod
                        net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.getReturnType()
                        net.bytebuddy.implementation.bytecode.StackManipulation r5 = net.bytebuddy.implementation.bytecode.member.MethodReturn.of(r5)
                        r6 = 5
                        net.bytebuddy.implementation.bytecode.StackManipulation[] r6 = new net.bytebuddy.implementation.bytecode.StackManipulation[r6]
                        r7 = 0
                        r6[r7] = r2
                        r2 = 1
                        r6[r2] = r3
                        r2 = 2
                        r6[r2] = r4
                        r2 = 3
                        r6[r2] = r0
                        r0 = 4
                        r6[r0] = r5
                        r1.<init>(r6)
                        net.bytebuddy.implementation.bytecode.StackManipulation$Size r9 = r1.apply(r9, r10)
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
                        net.bytebuddy.description.method.MethodDescription r2 = r4.instrumentedMethod
                        net.bytebuddy.implementation.auxiliary.TypeProxy$MethodCall$Appender$AccessorMethodInvocation r5 = (net.bytebuddy.implementation.auxiliary.TypeProxy.MethodCall.Appender.AccessorMethodInvocation) r5
                        net.bytebuddy.description.method.MethodDescription r3 = r5.instrumentedMethod
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r2 = r4.specialMethodInvocation
                        net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r3 = r5.specialMethodInvocation
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L2b
                        return r1
                    L2b:
                        net.bytebuddy.implementation.auxiliary.TypeProxy$MethodCall$Appender r2 = r4.this$2
                        net.bytebuddy.implementation.auxiliary.TypeProxy$MethodCall$Appender r5 = r5.this$2
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L36
                        return r1
                    L36:
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
                        net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r1 = r2.specialMethodInvocation
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.implementation.auxiliary.TypeProxy$MethodCall$Appender r1 = r2.this$2
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.bytecode.StackManipulation
                public boolean isValid() {
                        r1 = this;
                        net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r0 = r1.specialMethodInvocation
                        boolean r0 = r0.isValid()
                        return r0
                }
            }

            public Appender(net.bytebuddy.implementation.auxiliary.TypeProxy.MethodCall r1, net.bytebuddy.description.type.TypeDescription r2) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>()
                    net.bytebuddy.description.field.FieldList r1 = r2.getDeclaredFields()
                    java.lang.String r2 = "target"
                    net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.named(r2)
                    net.bytebuddy.matcher.FilterableList r1 = r1.filter(r2)
                    net.bytebuddy.description.field.FieldList r1 = (net.bytebuddy.description.field.FieldList) r1
                    java.lang.Object r1 = r1.getOnly()
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r1 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r1
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r1 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r1)
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.read()
                    r0.fieldLoadingInstruction = r1
                    return
            }

            public static /* synthetic */ net.bytebuddy.implementation.bytecode.StackManipulation access$600(net.bytebuddy.implementation.auxiliary.TypeProxy.MethodCall.Appender r0) {
                    net.bytebuddy.implementation.bytecode.StackManipulation r0 = r0.fieldLoadingInstruction
                    return r0
            }

            @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
            public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r4, net.bytebuddy.implementation.Implementation.Context r5, net.bytebuddy.description.method.MethodDescription r6) {
                    r3 = this;
                    net.bytebuddy.implementation.auxiliary.TypeProxy$MethodCall r0 = r3.this$1
                    net.bytebuddy.implementation.auxiliary.TypeProxy r0 = r0.this$0
                    net.bytebuddy.implementation.auxiliary.TypeProxy$InvocationFactory r0 = net.bytebuddy.implementation.auxiliary.TypeProxy.access$400(r0)
                    net.bytebuddy.implementation.auxiliary.TypeProxy$MethodCall r1 = r3.this$1
                    net.bytebuddy.implementation.auxiliary.TypeProxy r1 = r1.this$0
                    net.bytebuddy.implementation.Implementation$Target r1 = net.bytebuddy.implementation.auxiliary.TypeProxy.access$200(r1)
                    net.bytebuddy.implementation.auxiliary.TypeProxy$MethodCall r2 = r3.this$1
                    net.bytebuddy.implementation.auxiliary.TypeProxy r2 = r2.this$0
                    net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.implementation.auxiliary.TypeProxy.access$300(r2)
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r0 = r0.invoke(r1, r2, r6)
                    boolean r1 = r0.isValid()
                    if (r1 == 0) goto L28
                    net.bytebuddy.implementation.auxiliary.TypeProxy$MethodCall$Appender$AccessorMethodInvocation r1 = new net.bytebuddy.implementation.auxiliary.TypeProxy$MethodCall$Appender$AccessorMethodInvocation
                    r1.<init>(r3, r6, r0)
                    goto L2a
                L28:
                    net.bytebuddy.implementation.auxiliary.TypeProxy$AbstractMethodErrorThrow r1 = net.bytebuddy.implementation.auxiliary.TypeProxy.AbstractMethodErrorThrow.INSTANCE
                L2a:
                    net.bytebuddy.implementation.bytecode.StackManipulation$Size r4 = r1.apply(r4, r5)
                    net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r5 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                    int r4 = r4.getMaximalSize()
                    int r6 = r6.getStackSize()
                    r5.<init>(r4, r6)
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
                    net.bytebuddy.implementation.bytecode.StackManipulation r2 = r4.fieldLoadingInstruction
                    net.bytebuddy.implementation.auxiliary.TypeProxy$MethodCall$Appender r5 = (net.bytebuddy.implementation.auxiliary.TypeProxy.MethodCall.Appender) r5
                    net.bytebuddy.implementation.bytecode.StackManipulation r3 = r5.fieldLoadingInstruction
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.implementation.auxiliary.TypeProxy$MethodCall r2 = r4.this$1
                    net.bytebuddy.implementation.auxiliary.TypeProxy$MethodCall r5 = r5.this$1
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
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = r2.fieldLoadingInstruction
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.auxiliary.TypeProxy$MethodCall r1 = r2.this$1
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        public MethodCall(net.bytebuddy.implementation.auxiliary.TypeProxy r1, net.bytebuddy.implementation.MethodAccessorFactory r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.methodAccessorFactory = r2
                return
        }

        public static /* synthetic */ net.bytebuddy.implementation.MethodAccessorFactory access$500(net.bytebuddy.implementation.auxiliary.TypeProxy.MethodCall r0) {
                net.bytebuddy.implementation.MethodAccessorFactory r0 = r0.methodAccessorFactory
                return r0
        }

        @Override // net.bytebuddy.implementation.Implementation
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r2) {
                r1 = this;
                net.bytebuddy.implementation.auxiliary.TypeProxy$MethodCall$Appender r0 = new net.bytebuddy.implementation.auxiliary.TypeProxy$MethodCall$Appender
                net.bytebuddy.description.type.TypeDescription r2 = r2.getInstrumentedType()
                r0.<init>(r1, r2)
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
                net.bytebuddy.implementation.MethodAccessorFactory r2 = r4.methodAccessorFactory
                net.bytebuddy.implementation.auxiliary.TypeProxy$MethodCall r5 = (net.bytebuddy.implementation.auxiliary.TypeProxy.MethodCall) r5
                net.bytebuddy.implementation.MethodAccessorFactory r3 = r5.methodAccessorFactory
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                net.bytebuddy.implementation.auxiliary.TypeProxy r2 = r4.this$0
                net.bytebuddy.implementation.auxiliary.TypeProxy r5 = r5.this$0
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
                net.bytebuddy.implementation.MethodAccessorFactory r1 = r2.methodAccessorFactory
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.auxiliary.TypeProxy r1 = r2.this$0
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r5) {
                r4 = this;
                net.bytebuddy.description.field.FieldDescription$Token r0 = new net.bytebuddy.description.field.FieldDescription$Token
                net.bytebuddy.implementation.auxiliary.TypeProxy r1 = r4.this$0
                net.bytebuddy.implementation.Implementation$Target r1 = net.bytebuddy.implementation.auxiliary.TypeProxy.access$200(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r1.getInstrumentedType()
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.asGenericType()
                java.lang.String r2 = "target"
                r3 = 65
                r0.<init>(r2, r3, r1)
                net.bytebuddy.dynamic.scaffold.InstrumentedType r5 = r5.withField(r0)
                return r5
        }
    }

    public enum SilentConstruction extends java.lang.Enum<net.bytebuddy.implementation.auxiliary.TypeProxy.SilentConstruction> implements net.bytebuddy.implementation.Implementation {
        private static final /* synthetic */ net.bytebuddy.implementation.auxiliary.TypeProxy.SilentConstruction[] $VALUES = null;
        public static final net.bytebuddy.implementation.auxiliary.TypeProxy.SilentConstruction INSTANCE = null;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Appender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
            public static final java.lang.String GET_DECLARED_CONSTRUCTOR_METHOD_DESCRIPTOR = "([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;";
            public static final java.lang.String GET_DECLARED_CONSTRUCTOR_METHOD_NAME = "getDeclaredConstructor";
            public static final java.lang.String GET_REFLECTION_FACTORY_METHOD_DESCRIPTOR = "()Lsun/reflect/ReflectionFactory;";
            public static final java.lang.String GET_REFLECTION_FACTORY_METHOD_NAME = "getReflectionFactory";
            public static final java.lang.String JAVA_LANG_CLASS_INTERNAL_NAME = "java/lang/Class";
            public static final java.lang.String JAVA_LANG_CONSTRUCTOR_INTERNAL_NAME = "java/lang/reflect/Constructor";
            public static final java.lang.String JAVA_LANG_OBJECT_DESCRIPTOR = "Ljava/lang/Object;";
            public static final java.lang.String JAVA_LANG_OBJECT_INTERNAL_NAME = "java/lang/Object";
            public static final java.lang.String NEW_CONSTRUCTOR_FOR_SERIALIZATION_METHOD_DESCRIPTOR = "(Ljava/lang/Class;Ljava/lang/reflect/Constructor;)Ljava/lang/reflect/Constructor;";
            public static final java.lang.String NEW_CONSTRUCTOR_FOR_SERIALIZATION_METHOD_NAME = "newConstructorForSerialization";
            public static final java.lang.String NEW_INSTANCE_METHOD_DESCRIPTOR = "([Ljava/lang/Object;)Ljava/lang/Object;";
            public static final java.lang.String NEW_INSTANCE_METHOD_NAME = "newInstance";
            public static final java.lang.String REFLECTION_FACTORY_INTERNAL_NAME = "sun/reflect/ReflectionFactory";
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;

            private Appender(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    r0.<init>()
                    r0.instrumentedType = r1
                    return
            }

            public /* synthetic */ Appender(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.implementation.auxiliary.TypeProxy.AnonymousClass1 r2) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
            public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r9, net.bytebuddy.implementation.Implementation.Context r10, net.bytebuddy.description.method.MethodDescription r11) {
                    r8 = this;
                    java.lang.String r4 = "()Lsun/reflect/ReflectionFactory;"
                    r5 = 0
                    r1 = 184(0xb8, float:2.58E-43)
                    java.lang.String r2 = "sun/reflect/ReflectionFactory"
                    java.lang.String r3 = "getReflectionFactory"
                    r0 = r9
                    r0.visitMethodInsn(r1, r2, r3, r4, r5)
                    net.bytebuddy.description.type.TypeDescription r0 = r8.instrumentedType
                    java.lang.String r0 = r0.getDescriptor()
                    net.bytebuddy.jar.asm.Type r0 = net.bytebuddy.jar.asm.Type.getType(r0)
                    r9.visitLdcInsn(r0)
                    java.lang.String r0 = "Ljava/lang/Object;"
                    net.bytebuddy.jar.asm.Type r0 = net.bytebuddy.jar.asm.Type.getType(r0)
                    r9.visitLdcInsn(r0)
                    r6 = 3
                    r9.visitInsn(r6)
                    java.lang.String r0 = "java/lang/Class"
                    r7 = 189(0xbd, float:2.65E-43)
                    r9.visitTypeInsn(r7, r0)
                    java.lang.String r4 = "([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;"
                    r1 = 182(0xb6, float:2.55E-43)
                    java.lang.String r2 = "java/lang/Class"
                    java.lang.String r3 = "getDeclaredConstructor"
                    r0 = r9
                    r0.visitMethodInsn(r1, r2, r3, r4, r5)
                    java.lang.String r4 = "(Ljava/lang/Class;Ljava/lang/reflect/Constructor;)Ljava/lang/reflect/Constructor;"
                    java.lang.String r2 = "sun/reflect/ReflectionFactory"
                    java.lang.String r3 = "newConstructorForSerialization"
                    r0.visitMethodInsn(r1, r2, r3, r4, r5)
                    r9.visitInsn(r6)
                    java.lang.String r0 = "java/lang/Object"
                    r9.visitTypeInsn(r7, r0)
                    java.lang.String r4 = "([Ljava/lang/Object;)Ljava/lang/Object;"
                    java.lang.String r2 = "java/lang/reflect/Constructor"
                    java.lang.String r3 = "newInstance"
                    r0 = r9
                    r0.visitMethodInsn(r1, r2, r3, r4, r5)
                    net.bytebuddy.description.type.TypeDescription r0 = r8.instrumentedType
                    java.lang.String r0 = r0.getInternalName()
                    r1 = 192(0xc0, float:2.69E-43)
                    r9.visitTypeInsn(r1, r0)
                    r0 = 176(0xb0, float:2.47E-43)
                    r9.visitInsn(r0)
                    net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r0 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                    r1 = 4
                    r2 = 0
                    r0.<init>(r1, r2)
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
                    net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                    net.bytebuddy.implementation.auxiliary.TypeProxy$SilentConstruction$Appender r5 = (net.bytebuddy.implementation.auxiliary.TypeProxy.SilentConstruction.Appender) r5
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
                net.bytebuddy.implementation.auxiliary.TypeProxy$SilentConstruction r0 = new net.bytebuddy.implementation.auxiliary.TypeProxy$SilentConstruction
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.auxiliary.TypeProxy.SilentConstruction.INSTANCE = r0
                net.bytebuddy.implementation.auxiliary.TypeProxy$SilentConstruction[] r0 = new net.bytebuddy.implementation.auxiliary.TypeProxy.SilentConstruction[]{r0}
                net.bytebuddy.implementation.auxiliary.TypeProxy.SilentConstruction.$VALUES = r0
                return
        }

        SilentConstruction(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.auxiliary.TypeProxy.SilentConstruction valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.auxiliary.TypeProxy$SilentConstruction> r0 = net.bytebuddy.implementation.auxiliary.TypeProxy.SilentConstruction.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.auxiliary.TypeProxy$SilentConstruction r1 = (net.bytebuddy.implementation.auxiliary.TypeProxy.SilentConstruction) r1
                return r1
        }

        public static net.bytebuddy.implementation.auxiliary.TypeProxy.SilentConstruction[] values() {
                net.bytebuddy.implementation.auxiliary.TypeProxy$SilentConstruction[] r0 = net.bytebuddy.implementation.auxiliary.TypeProxy.SilentConstruction.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.auxiliary.TypeProxy$SilentConstruction[] r0 = (net.bytebuddy.implementation.auxiliary.TypeProxy.SilentConstruction[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.Implementation
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r3) {
                r2 = this;
                net.bytebuddy.implementation.auxiliary.TypeProxy$SilentConstruction$Appender r0 = new net.bytebuddy.implementation.auxiliary.TypeProxy$SilentConstruction$Appender
                net.bytebuddy.description.type.TypeDescription r3 = r3.getInstrumentedType()
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                r0 = this;
                return r1
        }
    }

    public TypeProxy(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.implementation.Implementation.Target r2, net.bytebuddy.implementation.auxiliary.TypeProxy.InvocationFactory r3, boolean r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.proxiedType = r1
            r0.implementationTarget = r2
            r0.invocationFactory = r3
            r0.ignoreFinalizer = r4
            r0.serializableProxy = r5
            return
    }

    public static /* synthetic */ net.bytebuddy.implementation.Implementation.Target access$200(net.bytebuddy.implementation.auxiliary.TypeProxy r0) {
            net.bytebuddy.implementation.Implementation$Target r0 = r0.implementationTarget
            return r0
    }

    public static /* synthetic */ net.bytebuddy.description.type.TypeDescription access$300(net.bytebuddy.implementation.auxiliary.TypeProxy r0) {
            net.bytebuddy.description.type.TypeDescription r0 = r0.proxiedType
            return r0
    }

    public static /* synthetic */ net.bytebuddy.implementation.auxiliary.TypeProxy.InvocationFactory access$400(net.bytebuddy.implementation.auxiliary.TypeProxy r0) {
            net.bytebuddy.implementation.auxiliary.TypeProxy$InvocationFactory r0 = r0.invocationFactory
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
            boolean r2 = r4.ignoreFinalizer
            net.bytebuddy.implementation.auxiliary.TypeProxy r5 = (net.bytebuddy.implementation.auxiliary.TypeProxy) r5
            boolean r3 = r5.ignoreFinalizer
            if (r2 == r3) goto L1c
            return r1
        L1c:
            boolean r2 = r4.serializableProxy
            boolean r3 = r5.serializableProxy
            if (r2 == r3) goto L23
            return r1
        L23:
            net.bytebuddy.description.type.TypeDescription r2 = r4.proxiedType
            net.bytebuddy.description.type.TypeDescription r3 = r5.proxiedType
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2e
            return r1
        L2e:
            net.bytebuddy.implementation.Implementation$Target r2 = r4.implementationTarget
            net.bytebuddy.implementation.Implementation$Target r3 = r5.implementationTarget
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L39
            return r1
        L39:
            net.bytebuddy.implementation.auxiliary.TypeProxy$InvocationFactory r2 = r4.invocationFactory
            net.bytebuddy.implementation.auxiliary.TypeProxy$InvocationFactory r5 = r5.invocationFactory
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L44
            return r1
        L44:
            return r0
    }

    @Override // net.bytebuddy.implementation.auxiliary.AuxiliaryType
    public java.lang.String getSuffix() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            net.bytebuddy.description.type.TypeDescription r1 = r3.proxiedType
            int r1 = r1.hashCode()
            java.lang.String r1 = net.bytebuddy.utility.RandomString.hashOf(r1)
            r0.append(r1)
            boolean r1 = r3.ignoreFinalizer
            java.lang.String r2 = "0"
            if (r1 == 0) goto L1b
            java.lang.String r1 = "I"
            goto L1c
        L1b:
            r1 = r2
        L1c:
            r0.append(r1)
            boolean r1 = r3.serializableProxy
            if (r1 == 0) goto L25
            java.lang.String r2 = "S"
        L25:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            net.bytebuddy.description.type.TypeDescription r1 = r2.proxiedType
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.implementation.Implementation$Target r1 = r2.implementationTarget
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.implementation.auxiliary.TypeProxy$InvocationFactory r1 = r2.invocationFactory
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.ignoreFinalizer
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.serializableProxy
            int r0 = r0 + r1
            return r0
    }

    @Override // net.bytebuddy.implementation.auxiliary.AuxiliaryType
    public net.bytebuddy.dynamic.DynamicType make(java.lang.String r4, net.bytebuddy.ClassFileVersion r5, net.bytebuddy.implementation.MethodAccessorFactory r6) {
            r3 = this;
            r0 = 1
            r1 = 0
            net.bytebuddy.ByteBuddy r2 = new net.bytebuddy.ByteBuddy
            r2.<init>(r5)
            net.bytebuddy.dynamic.scaffold.TypeValidation r5 = net.bytebuddy.dynamic.scaffold.TypeValidation.DISABLED
            net.bytebuddy.ByteBuddy r5 = r2.with(r5)
            boolean r2 = r3.ignoreFinalizer
            if (r2 == 0) goto L16
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isFinalizer()
            goto L1a
        L16:
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.none()
        L1a:
            net.bytebuddy.ByteBuddy r5 = r5.ignore(r2)
            net.bytebuddy.description.type.TypeDescription r2 = r3.proxiedType
            net.bytebuddy.dynamic.DynamicType$Builder r5 = r5.subclass(r2)
            net.bytebuddy.dynamic.DynamicType$Builder r4 = r5.name(r4)
            net.bytebuddy.description.modifier.ModifierContributor$ForType[] r5 = net.bytebuddy.implementation.auxiliary.AuxiliaryType.DEFAULT_TYPE_MODIFIER
            net.bytebuddy.dynamic.DynamicType$Builder r4 = r4.modifiers(r5)
            boolean r5 = r3.serializableProxy
            if (r5 == 0) goto L39
            java.lang.Class[] r5 = new java.lang.Class[r0]
            java.lang.Class<java.io.Serializable> r2 = java.io.Serializable.class
            r5[r1] = r2
            goto L3b
        L39:
            java.lang.Class[] r5 = new java.lang.Class[r1]
        L3b:
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition$Optional r4 = r4.implement(r5)
            net.bytebuddy.matcher.ElementMatcher$Junction r5 = net.bytebuddy.matcher.ElementMatchers.any()
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r4 = r4.method(r5)
            net.bytebuddy.implementation.auxiliary.TypeProxy$MethodCall r5 = new net.bytebuddy.implementation.auxiliary.TypeProxy$MethodCall
            r5.<init>(r3, r6)
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r4 = r4.intercept(r5)
            net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r5 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r0]
            net.bytebuddy.description.modifier.Ownership r6 = net.bytebuddy.description.modifier.Ownership.STATIC
            r5[r1] = r6
            java.lang.String r6 = "make"
            java.lang.Class<net.bytebuddy.dynamic.TargetType> r0 = net.bytebuddy.dynamic.TargetType.class
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r4 = r4.defineMethod(r6, r0, r5)
            net.bytebuddy.implementation.auxiliary.TypeProxy$SilentConstruction r5 = net.bytebuddy.implementation.auxiliary.TypeProxy.SilentConstruction.INSTANCE
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r4 = r4.intercept(r5)
            net.bytebuddy.dynamic.DynamicType$Unloaded r4 = r4.make()
            return r4
    }
}
