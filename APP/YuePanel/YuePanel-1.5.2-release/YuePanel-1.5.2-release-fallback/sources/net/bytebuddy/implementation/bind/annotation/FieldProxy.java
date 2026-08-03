package net.bytebuddy.implementation.bind.annotation;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface FieldProxy {

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Binder extends net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder.ForFieldBinding<net.bytebuddy.implementation.bind.annotation.FieldProxy> {
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape DECLARING_TYPE = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape FIELD_NAME = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape SERIALIZABLE_PROXY = null;
        private final net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver.Factory fieldResolverFactory;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
        public static class AccessorProxy extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase implements net.bytebuddy.implementation.auxiliary.AuxiliaryType {
            protected static final java.lang.String FIELD_NAME = "instance";
            private final net.bytebuddy.implementation.bytecode.assign.Assigner assigner;
            private final net.bytebuddy.description.field.FieldDescription fieldDescription;
            private final net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver fieldResolver;
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;
            private final boolean serializableProxy;

            public AccessorProxy(net.bytebuddy.description.field.FieldDescription r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver r3, net.bytebuddy.implementation.bytecode.assign.Assigner r4, boolean r5) {
                    r0 = this;
                    r0.<init>()
                    r0.fieldDescription = r1
                    r0.instrumentedType = r2
                    r0.fieldResolver = r3
                    r0.assigner = r4
                    r0.serializableProxy = r5
                    return
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r7, net.bytebuddy.implementation.Implementation.Context r8) {
                    r6 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r8.register(r6)
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r1 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.TypeCreation.of(r0)
                    net.bytebuddy.description.field.FieldDescription r3 = r6.fieldDescription
                    boolean r3 = r3.isStatic()
                    if (r3 == 0) goto L15
                    net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r3 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                    goto L19
                L15:
                    net.bytebuddy.implementation.bytecode.StackManipulation r3 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                L19:
                    net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                    net.bytebuddy.matcher.ElementMatcher$Junction r4 = net.bytebuddy.matcher.ElementMatchers.isConstructor()
                    net.bytebuddy.matcher.FilterableList r0 = r0.filter(r4)
                    net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                    java.lang.Object r0 = r0.getOnly()
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                    net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r0 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r0)
                    r4 = 4
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r4 = new net.bytebuddy.implementation.bytecode.StackManipulation[r4]
                    r5 = 0
                    r4[r5] = r2
                    net.bytebuddy.implementation.bytecode.Duplication r2 = net.bytebuddy.implementation.bytecode.Duplication.SINGLE
                    r5 = 1
                    r4[r5] = r2
                    r2 = 2
                    r4[r2] = r3
                    r2 = 3
                    r4[r2] = r0
                    r1.<init>(r4)
                    net.bytebuddy.implementation.bytecode.StackManipulation$Size r7 = r1.apply(r7, r8)
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
                    boolean r2 = r4.serializableProxy
                    net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$AccessorProxy r5 = (net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.AccessorProxy) r5
                    boolean r3 = r5.serializableProxy
                    if (r2 == r3) goto L1c
                    return r1
                L1c:
                    net.bytebuddy.description.field.FieldDescription r2 = r4.fieldDescription
                    net.bytebuddy.description.field.FieldDescription r3 = r5.fieldDescription
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L27
                    return r1
                L27:
                    net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                    net.bytebuddy.description.type.TypeDescription r3 = r5.instrumentedType
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L32
                    return r1
                L32:
                    net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver r2 = r4.fieldResolver
                    net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver r3 = r5.fieldResolver
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L3d
                    return r1
                L3d:
                    net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r4.assigner
                    net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r5.assigner
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L48
                    return r1
                L48:
                    return r0
            }

            @Override // net.bytebuddy.implementation.auxiliary.AuxiliaryType
            public java.lang.String getSuffix() {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
                    int r1 = r1.hashCode()
                    java.lang.String r1 = net.bytebuddy.utility.RandomString.hashOf(r1)
                    r0.append(r1)
                    boolean r1 = r2.serializableProxy
                    if (r1 == 0) goto L19
                    java.lang.String r1 = "S"
                    goto L1b
                L19:
                    java.lang.String r1 = "0"
                L1b:
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver r1 = r2.fieldResolver
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.bytecode.assign.Assigner r1 = r2.assigner
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    boolean r1 = r2.serializableProxy
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.auxiliary.AuxiliaryType
            public net.bytebuddy.dynamic.DynamicType make(java.lang.String r4, net.bytebuddy.ClassFileVersion r5, net.bytebuddy.implementation.MethodAccessorFactory r6) {
                    r3 = this;
                    net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver r0 = r3.fieldResolver
                    net.bytebuddy.ByteBuddy r1 = new net.bytebuddy.ByteBuddy
                    r1.<init>(r5)
                    net.bytebuddy.dynamic.scaffold.TypeValidation r5 = net.bytebuddy.dynamic.scaffold.TypeValidation.DISABLED
                    net.bytebuddy.ByteBuddy r5 = r1.with(r5)
                    net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver r1 = r3.fieldResolver
                    net.bytebuddy.description.type.TypeDescription r1 = r1.getProxyType()
                    net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default r2 = net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.NO_CONSTRUCTORS
                    net.bytebuddy.dynamic.DynamicType$Builder r5 = r5.subclass(r1, r2)
                    net.bytebuddy.dynamic.DynamicType$Builder r4 = r5.name(r4)
                    net.bytebuddy.description.modifier.ModifierContributor$ForType[] r5 = net.bytebuddy.implementation.auxiliary.AuxiliaryType.DEFAULT_TYPE_MODIFIER
                    net.bytebuddy.dynamic.DynamicType$Builder r4 = r4.modifiers(r5)
                    boolean r5 = r3.serializableProxy
                    r1 = 0
                    if (r5 == 0) goto L30
                    r5 = 1
                    java.lang.Class[] r5 = new java.lang.Class[r5]
                    java.lang.Class<java.io.Serializable> r2 = java.io.Serializable.class
                    r5[r1] = r2
                    goto L32
                L30:
                    java.lang.Class[] r5 = new java.lang.Class[r1]
                L32:
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition$Optional r4 = r4.implement(r5)
                    net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r5 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r1]
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r4 = r4.defineConstructor(r5)
                    net.bytebuddy.description.field.FieldDescription r5 = r3.fieldDescription
                    boolean r5 = r5.isStatic()
                    if (r5 == 0) goto L49
                    java.util.List r5 = java.util.Collections.emptyList()
                    goto L4f
                L49:
                    net.bytebuddy.description.type.TypeDescription r5 = r3.instrumentedType
                    java.util.List r5 = java.util.Collections.singletonList(r5)
                L4f:
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r4 = r4.withParameters(r5)
                    net.bytebuddy.description.field.FieldDescription r5 = r3.fieldDescription
                    boolean r5 = r5.isStatic()
                    if (r5 == 0) goto L5e
                    net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$StaticFieldConstructor r5 = net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.StaticFieldConstructor.INSTANCE
                    goto L65
                L5e:
                    net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$InstanceFieldConstructor r5 = new net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$InstanceFieldConstructor
                    net.bytebuddy.description.type.TypeDescription r1 = r3.instrumentedType
                    r5.<init>(r1)
                L65:
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r4 = r4.intercept(r5)
                    net.bytebuddy.description.field.FieldDescription r5 = r3.fieldDescription
                    net.bytebuddy.implementation.bytecode.assign.Assigner r1 = r3.assigner
                    net.bytebuddy.dynamic.DynamicType$Builder r4 = r0.apply(r4, r5, r1, r6)
                    net.bytebuddy.dynamic.DynamicType$Unloaded r4 = r4.make()
                    return r4
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class FieldGetter implements net.bytebuddy.implementation.Implementation {
            private final net.bytebuddy.implementation.bytecode.assign.Assigner assigner;
            private final net.bytebuddy.description.field.FieldDescription fieldDescription;
            private final net.bytebuddy.implementation.MethodAccessorFactory methodAccessorFactory;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
            public class Appender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
                final /* synthetic */ net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldGetter this$0;
                private final net.bytebuddy.description.type.TypeDescription typeDescription;

                public Appender(net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldGetter r1, net.bytebuddy.implementation.Implementation.Target r2) {
                        r0 = this;
                        r0.this$0 = r1
                        r0.<init>()
                        net.bytebuddy.description.type.TypeDescription r1 = r2.getInstrumentedType()
                        r0.typeDescription = r1
                        return
                }

                @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
                public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r11, net.bytebuddy.implementation.Implementation.Context r12, net.bytebuddy.description.method.MethodDescription r13) {
                        r10 = this;
                        r0 = 1
                        r1 = 0
                        r2 = 2
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldGetter r3 = r10.this$0
                        net.bytebuddy.implementation.MethodAccessorFactory r3 = net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldGetter.access$200(r3)
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldGetter r4 = r10.this$0
                        net.bytebuddy.description.field.FieldDescription r4 = net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldGetter.access$100(r4)
                        net.bytebuddy.implementation.MethodAccessorFactory$AccessType r5 = net.bytebuddy.implementation.MethodAccessorFactory.AccessType.DEFAULT
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = r3.registerGetterFor(r4, r5)
                        net.bytebuddy.implementation.bytecode.StackManipulation$Compound r4 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldGetter r5 = r10.this$0
                        net.bytebuddy.description.field.FieldDescription r5 = net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldGetter.access$100(r5)
                        boolean r5 = r5.isStatic()
                        if (r5 == 0) goto L26
                        net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r5 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                        goto L55
                    L26:
                        net.bytebuddy.implementation.bytecode.StackManipulation$Compound r5 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                        net.bytebuddy.implementation.bytecode.StackManipulation r6 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                        net.bytebuddy.description.type.TypeDescription r7 = r10.typeDescription
                        net.bytebuddy.description.field.FieldList r7 = r7.getDeclaredFields()
                        java.lang.String r8 = "instance"
                        net.bytebuddy.matcher.ElementMatcher$Junction r8 = net.bytebuddy.matcher.ElementMatchers.named(r8)
                        net.bytebuddy.matcher.FilterableList r7 = r7.filter(r8)
                        net.bytebuddy.description.field.FieldList r7 = (net.bytebuddy.description.field.FieldList) r7
                        java.lang.Object r7 = r7.getOnly()
                        net.bytebuddy.description.field.FieldDescription$InDefinedShape r7 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r7
                        net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r7 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r7)
                        net.bytebuddy.implementation.bytecode.StackManipulation r7 = r7.read()
                        net.bytebuddy.implementation.bytecode.StackManipulation[] r8 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                        r8[r1] = r6
                        r8[r0] = r7
                        r5.<init>(r8)
                    L55:
                        net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r6 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r3)
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldGetter r7 = r10.this$0
                        net.bytebuddy.implementation.bytecode.assign.Assigner r7 = net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldGetter.access$300(r7)
                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getReturnType()
                        net.bytebuddy.description.type.TypeDescription$Generic r8 = r13.getReturnType()
                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r9 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.DYNAMIC
                        net.bytebuddy.implementation.bytecode.StackManipulation r3 = r7.assign(r3, r8, r9)
                        net.bytebuddy.description.type.TypeDescription$Generic r7 = r13.getReturnType()
                        net.bytebuddy.description.type.TypeDescription r7 = r7.asErasure()
                        net.bytebuddy.implementation.bytecode.StackManipulation r7 = net.bytebuddy.implementation.bytecode.member.MethodReturn.of(r7)
                        r8 = 4
                        net.bytebuddy.implementation.bytecode.StackManipulation[] r8 = new net.bytebuddy.implementation.bytecode.StackManipulation[r8]
                        r8[r1] = r5
                        r8[r0] = r6
                        r8[r2] = r3
                        r0 = 3
                        r8[r0] = r7
                        r4.<init>(r8)
                        net.bytebuddy.implementation.bytecode.StackManipulation$Size r11 = r4.apply(r11, r12)
                        net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r12 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                        int r11 = r11.getMaximalSize()
                        int r13 = r13.getStackSize()
                        r12.<init>(r11, r13)
                        return r12
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
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldGetter$Appender r5 = (net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldGetter.Appender) r5
                        net.bytebuddy.description.type.TypeDescription r3 = r5.typeDescription
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldGetter r2 = r4.this$0
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldGetter r5 = r5.this$0
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
                        net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldGetter r1 = r2.this$0
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }
            }

            public FieldGetter(net.bytebuddy.description.field.FieldDescription r1, net.bytebuddy.implementation.bytecode.assign.Assigner r2, net.bytebuddy.implementation.MethodAccessorFactory r3) {
                    r0 = this;
                    r0.<init>()
                    r0.fieldDescription = r1
                    r0.assigner = r2
                    r0.methodAccessorFactory = r3
                    return
            }

            public static /* synthetic */ net.bytebuddy.description.field.FieldDescription access$100(net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldGetter r0) {
                    net.bytebuddy.description.field.FieldDescription r0 = r0.fieldDescription
                    return r0
            }

            public static /* synthetic */ net.bytebuddy.implementation.MethodAccessorFactory access$200(net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldGetter r0) {
                    net.bytebuddy.implementation.MethodAccessorFactory r0 = r0.methodAccessorFactory
                    return r0
            }

            public static /* synthetic */ net.bytebuddy.implementation.bytecode.assign.Assigner access$300(net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldGetter r0) {
                    net.bytebuddy.implementation.bytecode.assign.Assigner r0 = r0.assigner
                    return r0
            }

            @Override // net.bytebuddy.implementation.Implementation
            public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r2) {
                    r1 = this;
                    net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldGetter$Appender r0 = new net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldGetter$Appender
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
                    net.bytebuddy.description.field.FieldDescription r2 = r4.fieldDescription
                    net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldGetter r5 = (net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldGetter) r5
                    net.bytebuddy.description.field.FieldDescription r3 = r5.fieldDescription
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r4.assigner
                    net.bytebuddy.implementation.bytecode.assign.Assigner r3 = r5.assigner
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L2b
                    return r1
                L2b:
                    net.bytebuddy.implementation.MethodAccessorFactory r2 = r4.methodAccessorFactory
                    net.bytebuddy.implementation.MethodAccessorFactory r5 = r5.methodAccessorFactory
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
                    net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.bytecode.assign.Assigner r1 = r2.assigner
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.MethodAccessorFactory r1 = r2.methodAccessorFactory
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                    r0 = this;
                    return r1
            }
        }

        public interface FieldResolver {

            public interface Factory {

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class Duplex implements net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver.Factory {
                    private final net.bytebuddy.description.method.MethodDescription.InDefinedShape getterMethod;
                    private final net.bytebuddy.description.type.TypeDescription proxyType;
                    private final net.bytebuddy.description.method.MethodDescription.InDefinedShape setterMethod;

                    public Duplex(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription.InDefinedShape r2, net.bytebuddy.description.method.MethodDescription.InDefinedShape r3) {
                            r0 = this;
                            r0.<init>()
                            r0.proxyType = r1
                            r0.getterMethod = r2
                            r0.setterMethod = r3
                            return
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
                            net.bytebuddy.description.type.TypeDescription r2 = r4.proxyType
                            net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver$Factory$Duplex r5 = (net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver.Factory.Duplex) r5
                            net.bytebuddy.description.type.TypeDescription r3 = r5.proxyType
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r4.getterMethod
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = r5.getterMethod
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L2b
                            return r1
                        L2b:
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r4.setterMethod
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r5 = r5.setterMethod
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
                            net.bytebuddy.description.type.TypeDescription r1 = r2.proxyType
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.getterMethod
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.setterMethod
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver.Factory
                    public net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver resolve(net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.field.FieldDescription r4) {
                            r2 = this;
                            net.bytebuddy.description.type.TypeDescription r4 = r2.proxyType
                            boolean r3 = r3.equals(r4)
                            if (r3 == 0) goto L14
                            net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver$ForGetterSetterPair r3 = new net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver$ForGetterSetterPair
                            net.bytebuddy.description.type.TypeDescription r4 = r2.proxyType
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r2.getterMethod
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.setterMethod
                            r3.<init>(r4, r0, r1)
                            return r3
                        L14:
                            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                            java.lang.String r4 = "Cannot use @FieldProxy on a non-installed type"
                            r3.<init>(r4)
                            throw r3
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class Simplex implements net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver.Factory {
                    private final net.bytebuddy.description.method.MethodDescription.InDefinedShape getterMethod;
                    private final net.bytebuddy.description.method.MethodDescription.InDefinedShape setterMethod;

                    public Simplex(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.method.MethodDescription.InDefinedShape r2) {
                            r0 = this;
                            r0.<init>()
                            r0.getterMethod = r1
                            r0.setterMethod = r2
                            return
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
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r4.getterMethod
                            net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver$Factory$Simplex r5 = (net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver.Factory.Simplex) r5
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = r5.getterMethod
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r4.setterMethod
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r5 = r5.setterMethod
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
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.getterMethod
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.setterMethod
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver.Factory
                    public net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver resolve(net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.description.field.FieldDescription r3) {
                            r1 = this;
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.getterMethod
                            net.bytebuddy.description.type.TypeDescription r0 = r0.getDeclaringType()
                            boolean r0 = r2.equals(r0)
                            if (r0 == 0) goto L14
                            net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver$ForGetter r2 = new net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver$ForGetter
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = r1.getterMethod
                            r2.<init>(r3)
                            return r2
                        L14:
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.setterMethod
                            net.bytebuddy.description.type.TypeDescription r0 = r0.getDeclaringType()
                            boolean r2 = r2.equals(r0)
                            if (r2 == 0) goto L31
                            boolean r2 = r3.isFinal()
                            if (r2 == 0) goto L29
                            net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver$Unresolved r2 = net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver.Unresolved.INSTANCE
                            goto L30
                        L29:
                            net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver$ForSetter r2 = new net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver$ForSetter
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = r1.setterMethod
                            r2.<init>(r3)
                        L30:
                            return r2
                        L31:
                            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                            java.lang.String r3 = "Cannot use @FieldProxy on a non-installed type"
                            r2.<init>(r3)
                            throw r2
                    }
                }

                net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.field.FieldDescription r2);
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForGetter implements net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver {
                private final net.bytebuddy.description.method.MethodDescription.InDefinedShape getterMethod;

                public ForGetter(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1) {
                        r0 = this;
                        r0.<init>()
                        r0.getterMethod = r1
                        return
                }

                @Override // net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver
                public net.bytebuddy.dynamic.DynamicType.Builder<?> apply(net.bytebuddy.dynamic.DynamicType.Builder<?> r2, net.bytebuddy.description.field.FieldDescription r3, net.bytebuddy.implementation.bytecode.assign.Assigner r4, net.bytebuddy.implementation.MethodAccessorFactory r5) {
                        r1 = this;
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.getterMethod
                        net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.is(r0)
                        net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.definedMethod(r0)
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r2 = r2.method(r0)
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldGetter r0 = new net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldGetter
                        r0.<init>(r3, r4, r5)
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r2 = r2.intercept(r0)
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
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r4.getterMethod
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver$ForGetter r5 = (net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver.ForGetter) r5
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r5 = r5.getterMethod
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L20
                        return r1
                    L20:
                        return r0
                }

                @Override // net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver
                public net.bytebuddy.description.type.TypeDescription getProxyType() {
                        r1 = this;
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.getterMethod
                        net.bytebuddy.description.type.TypeDescription r0 = r0.getDeclaringType()
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.getterMethod
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver
                public boolean isResolved() {
                        r1 = this;
                        r0 = 1
                        return r0
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForGetterSetterPair implements net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver {
                private final net.bytebuddy.description.method.MethodDescription.InDefinedShape getterMethod;
                private final net.bytebuddy.description.type.TypeDescription proxyType;
                private final net.bytebuddy.description.method.MethodDescription.InDefinedShape setterMethod;

                public ForGetterSetterPair(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription.InDefinedShape r2, net.bytebuddy.description.method.MethodDescription.InDefinedShape r3) {
                        r0 = this;
                        r0.<init>()
                        r0.proxyType = r1
                        r0.getterMethod = r2
                        r0.setterMethod = r3
                        return
                }

                @Override // net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver
                public net.bytebuddy.dynamic.DynamicType.Builder<?> apply(net.bytebuddy.dynamic.DynamicType.Builder<?> r2, net.bytebuddy.description.field.FieldDescription r3, net.bytebuddy.implementation.bytecode.assign.Assigner r4, net.bytebuddy.implementation.MethodAccessorFactory r5) {
                        r1 = this;
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.getterMethod
                        net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.is(r0)
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r2 = r2.method(r0)
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldGetter r0 = new net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldGetter
                        r0.<init>(r3, r4, r5)
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r2 = r2.intercept(r0)
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.setterMethod
                        net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.is(r0)
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r2 = r2.method(r0)
                        boolean r0 = r3.isFinal()
                        if (r0 == 0) goto L3b
                        java.lang.StringBuilder r4 = new java.lang.StringBuilder
                        r4.<init>()
                        java.lang.String r5 = "Cannot set final field "
                        r4.append(r5)
                        r4.append(r3)
                        java.lang.String r3 = r4.toString()
                        java.lang.Class<java.lang.UnsupportedOperationException> r4 = java.lang.UnsupportedOperationException.class
                        net.bytebuddy.implementation.Implementation r3 = net.bytebuddy.implementation.ExceptionMethod.throwing(r4, r3)
                        goto L41
                    L3b:
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldSetter r0 = new net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldSetter
                        r0.<init>(r3, r4, r5)
                        r3 = r0
                    L41:
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r2 = r2.intercept(r3)
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
                        net.bytebuddy.description.type.TypeDescription r2 = r4.proxyType
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver$ForGetterSetterPair r5 = (net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver.ForGetterSetterPair) r5
                        net.bytebuddy.description.type.TypeDescription r3 = r5.proxyType
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r4.getterMethod
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = r5.getterMethod
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L2b
                        return r1
                    L2b:
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r4.setterMethod
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r5 = r5.setterMethod
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L36
                        return r1
                    L36:
                        return r0
                }

                @Override // net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver
                public net.bytebuddy.description.type.TypeDescription getProxyType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.proxyType
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.description.type.TypeDescription r1 = r2.proxyType
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.getterMethod
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.setterMethod
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver
                public boolean isResolved() {
                        r1 = this;
                        r0 = 1
                        return r0
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForSetter implements net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver {
                private final net.bytebuddy.description.method.MethodDescription.InDefinedShape setterMethod;

                public ForSetter(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1) {
                        r0 = this;
                        r0.<init>()
                        r0.setterMethod = r1
                        return
                }

                @Override // net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver
                public net.bytebuddy.dynamic.DynamicType.Builder<?> apply(net.bytebuddy.dynamic.DynamicType.Builder<?> r2, net.bytebuddy.description.field.FieldDescription r3, net.bytebuddy.implementation.bytecode.assign.Assigner r4, net.bytebuddy.implementation.MethodAccessorFactory r5) {
                        r1 = this;
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.setterMethod
                        net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.is(r0)
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r2 = r2.method(r0)
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldSetter r0 = new net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldSetter
                        r0.<init>(r3, r4, r5)
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r2 = r2.intercept(r0)
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
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r4.setterMethod
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver$ForSetter r5 = (net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver.ForSetter) r5
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r5 = r5.setterMethod
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L20
                        return r1
                    L20:
                        return r0
                }

                @Override // net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver
                public net.bytebuddy.description.type.TypeDescription getProxyType() {
                        r1 = this;
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.setterMethod
                        net.bytebuddy.description.type.TypeDescription r0 = r0.getDeclaringType()
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.setterMethod
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver
                public boolean isResolved() {
                        r1 = this;
                        r0 = 1
                        return r0
                }
            }

            public enum Unresolved extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver.Unresolved> implements net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver {
                private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver.Unresolved[] $VALUES = null;
                public static final net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver.Unresolved INSTANCE = null;

                static {
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver$Unresolved r0 = new net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver$Unresolved
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver.Unresolved.INSTANCE = r0
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver$Unresolved[] r0 = new net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver.Unresolved[]{r0}
                        net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver.Unresolved.$VALUES = r0
                        return
                }

                Unresolved(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver.Unresolved valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver$Unresolved> r0 = net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver.Unresolved.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver$Unresolved r1 = (net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver.Unresolved) r1
                        return r1
                }

                public static net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver.Unresolved[] values() {
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver$Unresolved[] r0 = net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver.Unresolved.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver$Unresolved[] r0 = (net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver.Unresolved[]) r0
                        return r0
                }

                @Override // net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver
                public net.bytebuddy.dynamic.DynamicType.Builder<?> apply(net.bytebuddy.dynamic.DynamicType.Builder<?> r1, net.bytebuddy.description.field.FieldDescription r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.implementation.MethodAccessorFactory r4) {
                        r0 = this;
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r2 = "Cannot apply unresolved field resolver"
                        r1.<init>(r2)
                        throw r1
                }

                @Override // net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver
                public net.bytebuddy.description.type.TypeDescription getProxyType() {
                        r2 = this;
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.String r1 = "Cannot read type for unresolved field resolver"
                        r0.<init>(r1)
                        throw r0
                }

                @Override // net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver
                public boolean isResolved() {
                        r1 = this;
                        r0 = 0
                        return r0
                }
            }

            net.bytebuddy.dynamic.DynamicType.Builder<?> apply(net.bytebuddy.dynamic.DynamicType.Builder<?> r1, net.bytebuddy.description.field.FieldDescription r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.implementation.MethodAccessorFactory r4);

            net.bytebuddy.description.type.TypeDescription getProxyType();

            boolean isResolved();
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class FieldSetter implements net.bytebuddy.implementation.Implementation {
            private final net.bytebuddy.implementation.bytecode.assign.Assigner assigner;
            private final net.bytebuddy.description.field.FieldDescription fieldDescription;
            private final net.bytebuddy.implementation.MethodAccessorFactory methodAccessorFactory;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
            public class Appender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
                final /* synthetic */ net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldSetter this$0;
                private final net.bytebuddy.description.type.TypeDescription typeDescription;

                public Appender(net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldSetter r1, net.bytebuddy.implementation.Implementation.Target r2) {
                        r0 = this;
                        r0.this$0 = r1
                        r0.<init>()
                        net.bytebuddy.description.type.TypeDescription r1 = r2.getInstrumentedType()
                        r0.typeDescription = r1
                        return
                }

                @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
                public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r12, net.bytebuddy.implementation.Implementation.Context r13, net.bytebuddy.description.method.MethodDescription r14) {
                        r11 = this;
                        r0 = 2
                        r1 = 1
                        net.bytebuddy.description.method.ParameterList r2 = r14.getParameters()
                        r3 = 0
                        java.lang.Object r2 = r2.get(r3)
                        net.bytebuddy.description.method.ParameterDescription r2 = (net.bytebuddy.description.method.ParameterDescription) r2
                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.getType()
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldSetter r4 = r11.this$0
                        net.bytebuddy.implementation.MethodAccessorFactory r4 = net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldSetter.access$500(r4)
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldSetter r5 = r11.this$0
                        net.bytebuddy.description.field.FieldDescription r5 = net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldSetter.access$400(r5)
                        net.bytebuddy.implementation.MethodAccessorFactory$AccessType r6 = net.bytebuddy.implementation.MethodAccessorFactory.AccessType.DEFAULT
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = r4.registerSetterFor(r5, r6)
                        net.bytebuddy.implementation.bytecode.StackManipulation$Compound r5 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldSetter r6 = r11.this$0
                        net.bytebuddy.description.field.FieldDescription r6 = net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldSetter.access$400(r6)
                        boolean r6 = r6.isStatic()
                        if (r6 == 0) goto L34
                        net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r6 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                        goto L63
                    L34:
                        net.bytebuddy.implementation.bytecode.StackManipulation$Compound r6 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                        net.bytebuddy.implementation.bytecode.StackManipulation r7 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                        net.bytebuddy.description.type.TypeDescription r8 = r11.typeDescription
                        net.bytebuddy.description.field.FieldList r8 = r8.getDeclaredFields()
                        java.lang.String r9 = "instance"
                        net.bytebuddy.matcher.ElementMatcher$Junction r9 = net.bytebuddy.matcher.ElementMatchers.named(r9)
                        net.bytebuddy.matcher.FilterableList r8 = r8.filter(r9)
                        net.bytebuddy.description.field.FieldList r8 = (net.bytebuddy.description.field.FieldList) r8
                        java.lang.Object r8 = r8.getOnly()
                        net.bytebuddy.description.field.FieldDescription$InDefinedShape r8 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r8
                        net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r8 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r8)
                        net.bytebuddy.implementation.bytecode.StackManipulation r8 = r8.read()
                        net.bytebuddy.implementation.bytecode.StackManipulation[] r9 = new net.bytebuddy.implementation.bytecode.StackManipulation[r0]
                        r9[r3] = r7
                        r9[r1] = r8
                        r6.<init>(r9)
                    L63:
                        net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r7 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.of(r2)
                        net.bytebuddy.implementation.bytecode.StackManipulation r7 = r7.loadFrom(r1)
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldSetter r8 = r11.this$0
                        net.bytebuddy.implementation.bytecode.assign.Assigner r8 = net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldSetter.access$600(r8)
                        net.bytebuddy.description.method.ParameterList r9 = r4.getParameters()
                        java.lang.Object r9 = r9.get(r3)
                        net.bytebuddy.description.method.ParameterDescription r9 = (net.bytebuddy.description.method.ParameterDescription) r9
                        net.bytebuddy.description.type.TypeDescription$Generic r9 = r9.getType()
                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r10 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.DYNAMIC
                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = r8.assign(r2, r9, r10)
                        net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r4 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r4)
                        r8 = 5
                        net.bytebuddy.implementation.bytecode.StackManipulation[] r8 = new net.bytebuddy.implementation.bytecode.StackManipulation[r8]
                        r8[r3] = r6
                        r8[r1] = r7
                        r8[r0] = r2
                        r0 = 3
                        r8[r0] = r4
                        net.bytebuddy.implementation.bytecode.member.MethodReturn r0 = net.bytebuddy.implementation.bytecode.member.MethodReturn.VOID
                        r1 = 4
                        r8[r1] = r0
                        r5.<init>(r8)
                        net.bytebuddy.implementation.bytecode.StackManipulation$Size r12 = r5.apply(r12, r13)
                        net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r13 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                        int r12 = r12.getMaximalSize()
                        int r14 = r14.getStackSize()
                        r13.<init>(r12, r14)
                        return r13
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
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldSetter$Appender r5 = (net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldSetter.Appender) r5
                        net.bytebuddy.description.type.TypeDescription r3 = r5.typeDescription
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldSetter r2 = r4.this$0
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldSetter r5 = r5.this$0
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
                        net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldSetter r1 = r2.this$0
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }
            }

            public FieldSetter(net.bytebuddy.description.field.FieldDescription r1, net.bytebuddy.implementation.bytecode.assign.Assigner r2, net.bytebuddy.implementation.MethodAccessorFactory r3) {
                    r0 = this;
                    r0.<init>()
                    r0.fieldDescription = r1
                    r0.assigner = r2
                    r0.methodAccessorFactory = r3
                    return
            }

            public static /* synthetic */ net.bytebuddy.description.field.FieldDescription access$400(net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldSetter r0) {
                    net.bytebuddy.description.field.FieldDescription r0 = r0.fieldDescription
                    return r0
            }

            public static /* synthetic */ net.bytebuddy.implementation.MethodAccessorFactory access$500(net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldSetter r0) {
                    net.bytebuddy.implementation.MethodAccessorFactory r0 = r0.methodAccessorFactory
                    return r0
            }

            public static /* synthetic */ net.bytebuddy.implementation.bytecode.assign.Assigner access$600(net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldSetter r0) {
                    net.bytebuddy.implementation.bytecode.assign.Assigner r0 = r0.assigner
                    return r0
            }

            @Override // net.bytebuddy.implementation.Implementation
            public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r2) {
                    r1 = this;
                    net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldSetter$Appender r0 = new net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldSetter$Appender
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
                    net.bytebuddy.description.field.FieldDescription r2 = r4.fieldDescription
                    net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldSetter r5 = (net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldSetter) r5
                    net.bytebuddy.description.field.FieldDescription r3 = r5.fieldDescription
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r4.assigner
                    net.bytebuddy.implementation.bytecode.assign.Assigner r3 = r5.assigner
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L2b
                    return r1
                L2b:
                    net.bytebuddy.implementation.MethodAccessorFactory r2 = r4.methodAccessorFactory
                    net.bytebuddy.implementation.MethodAccessorFactory r5 = r5.methodAccessorFactory
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
                    net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.bytecode.assign.Assigner r1 = r2.assigner
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.MethodAccessorFactory r1 = r2.methodAccessorFactory
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                    r0 = this;
                    return r1
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class InstanceFieldConstructor implements net.bytebuddy.implementation.Implementation {
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Appender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
                private final net.bytebuddy.description.field.FieldDescription fieldDescription;

                public Appender(net.bytebuddy.implementation.Implementation.Target r2) {
                        r1 = this;
                        r1.<init>()
                        net.bytebuddy.description.type.TypeDescription r2 = r2.getInstrumentedType()
                        net.bytebuddy.description.field.FieldList r2 = r2.getDeclaredFields()
                        java.lang.String r0 = "instance"
                        net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.named(r0)
                        net.bytebuddy.matcher.FilterableList r2 = r2.filter(r0)
                        net.bytebuddy.description.field.FieldList r2 = (net.bytebuddy.description.field.FieldList) r2
                        java.lang.Object r2 = r2.getOnly()
                        net.bytebuddy.description.field.FieldDescription r2 = (net.bytebuddy.description.field.FieldDescription) r2
                        r1.fieldDescription = r2
                        return
                }

                @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
                public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r8, net.bytebuddy.implementation.Implementation.Context r9, net.bytebuddy.description.method.MethodDescription r10) {
                        r7 = this;
                        net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                        net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$StaticFieldConstructor r2 = net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.StaticFieldConstructor.INSTANCE
                        net.bytebuddy.description.method.MethodDescription r2 = net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.StaticFieldConstructor.access$000(r2)
                        net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r2 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r2)
                        net.bytebuddy.description.ByteCodeElement$TypeDependant r3 = r10.asDefined()
                        net.bytebuddy.description.method.MethodDescription r3 = (net.bytebuddy.description.method.MethodDescription) r3
                        net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading r3 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.allArgumentsOf(r3)
                        net.bytebuddy.implementation.bytecode.StackManipulation r3 = r3.prependThisReference()
                        net.bytebuddy.description.field.FieldDescription r4 = r7.fieldDescription
                        net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r4 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r4)
                        net.bytebuddy.implementation.bytecode.StackManipulation r4 = r4.write()
                        r5 = 5
                        net.bytebuddy.implementation.bytecode.StackManipulation[] r5 = new net.bytebuddy.implementation.bytecode.StackManipulation[r5]
                        r6 = 0
                        r5[r6] = r1
                        r1 = 1
                        r5[r1] = r2
                        r1 = 2
                        r5[r1] = r3
                        r1 = 3
                        r5[r1] = r4
                        net.bytebuddy.implementation.bytecode.member.MethodReturn r1 = net.bytebuddy.implementation.bytecode.member.MethodReturn.VOID
                        r2 = 4
                        r5[r2] = r1
                        r0.<init>(r5)
                        net.bytebuddy.implementation.bytecode.StackManipulation$Size r8 = r0.apply(r8, r9)
                        net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r9 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                        int r8 = r8.getMaximalSize()
                        int r10 = r10.getStackSize()
                        r9.<init>(r8, r10)
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
                        net.bytebuddy.description.field.FieldDescription r2 = r4.fieldDescription
                        net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$InstanceFieldConstructor$Appender r5 = (net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.InstanceFieldConstructor.Appender) r5
                        net.bytebuddy.description.field.FieldDescription r5 = r5.fieldDescription
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
                        net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }
            }

            public InstanceFieldConstructor(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    r0.<init>()
                    r0.instrumentedType = r1
                    return
            }

            @Override // net.bytebuddy.implementation.Implementation
            public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r2) {
                    r1 = this;
                    net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$InstanceFieldConstructor$Appender r0 = new net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$InstanceFieldConstructor$Appender
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
                    net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                    net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$InstanceFieldConstructor r5 = (net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.InstanceFieldConstructor) r5
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

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r5) {
                    r4 = this;
                    net.bytebuddy.description.field.FieldDescription$Token r0 = new net.bytebuddy.description.field.FieldDescription$Token
                    net.bytebuddy.description.type.TypeDescription r1 = r4.instrumentedType
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.asGenericType()
                    java.lang.String r2 = "instance"
                    r3 = 18
                    r0.<init>(r2, r3, r1)
                    net.bytebuddy.dynamic.scaffold.InstrumentedType r5 = r5.withField(r0)
                    return r5
            }
        }

        public enum StaticFieldConstructor extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.StaticFieldConstructor> implements net.bytebuddy.implementation.Implementation {
            private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.StaticFieldConstructor[] $VALUES = null;
            public static final net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.StaticFieldConstructor INSTANCE = null;
            private final net.bytebuddy.description.method.MethodDescription objectTypeDefaultConstructor;

            static {
                    net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$StaticFieldConstructor r0 = new net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$StaticFieldConstructor
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.StaticFieldConstructor.INSTANCE = r0
                    net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$StaticFieldConstructor[] r0 = new net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.StaticFieldConstructor[]{r0}
                    net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.StaticFieldConstructor.$VALUES = r0
                    return
            }

            StaticFieldConstructor(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                    net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                    net.bytebuddy.description.method.MethodList r1 = r1.getDeclaredMethods()
                    net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isConstructor()
                    net.bytebuddy.matcher.FilterableList r1 = r1.filter(r2)
                    net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                    java.lang.Object r1 = r1.getOnly()
                    net.bytebuddy.description.method.MethodDescription r1 = (net.bytebuddy.description.method.MethodDescription) r1
                    r0.objectTypeDefaultConstructor = r1
                    return
            }

            public static /* synthetic */ net.bytebuddy.description.method.MethodDescription access$000(net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.StaticFieldConstructor r0) {
                    net.bytebuddy.description.method.MethodDescription r0 = r0.objectTypeDefaultConstructor
                    return r0
            }

            public static net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.StaticFieldConstructor valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$StaticFieldConstructor> r0 = net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.StaticFieldConstructor.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$StaticFieldConstructor r1 = (net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.StaticFieldConstructor) r1
                    return r1
            }

            public static net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.StaticFieldConstructor[] values() {
                    net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$StaticFieldConstructor[] r0 = net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.StaticFieldConstructor.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$StaticFieldConstructor[] r0 = (net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.StaticFieldConstructor[]) r0
                    return r0
            }

            @Override // net.bytebuddy.implementation.Implementation
            public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r5) {
                    r4 = this;
                    net.bytebuddy.implementation.bytecode.ByteCodeAppender$Simple r5 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Simple
                    net.bytebuddy.implementation.bytecode.StackManipulation r0 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                    net.bytebuddy.description.method.MethodDescription r1 = r4.objectTypeDefaultConstructor
                    net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r1 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r1)
                    r2 = 3
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                    r3 = 0
                    r2[r3] = r0
                    r0 = 1
                    r2[r0] = r1
                    net.bytebuddy.implementation.bytecode.member.MethodReturn r0 = net.bytebuddy.implementation.bytecode.member.MethodReturn.VOID
                    r1 = 2
                    r2[r1] = r0
                    r5.<init>(r2)
                    return r5
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                    r0 = this;
                    return r1
            }
        }

        static {
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.FieldProxy> r0 = net.bytebuddy.implementation.bind.annotation.FieldProxy.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                java.lang.String r1 = "declaringType"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                java.lang.Object r1 = r1.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.DECLARING_TYPE = r1
                java.lang.String r1 = "value"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                java.lang.Object r1 = r1.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FIELD_NAME = r1
                java.lang.String r1 = "serializableProxy"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.SERIALIZABLE_PROXY = r0
                return
        }

        public Binder(net.bytebuddy.description.method.MethodDescription.InDefinedShape r2, net.bytebuddy.description.method.MethodDescription.InDefinedShape r3) {
                r1 = this;
                net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver$Factory$Simplex r0 = new net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver$Factory$Simplex
                r0.<init>(r2, r3)
                r1.<init>(r0)
                return
        }

        public Binder(net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.description.method.MethodDescription.InDefinedShape r3, net.bytebuddy.description.method.MethodDescription.InDefinedShape r4) {
                r1 = this;
                net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver$Factory$Duplex r0 = new net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver$Factory$Duplex
                r0.<init>(r2, r3, r4)
                r1.<init>(r0)
                return
        }

        public Binder(net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FieldResolver.Factory r1) {
                r0 = this;
                r0.<init>()
                r0.fieldResolverFactory = r1
                return
        }

        public static net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<net.bytebuddy.implementation.bind.annotation.FieldProxy> install(java.lang.Class<?> r0) {
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder r0 = install(r0)
                return r0
        }

        public static net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<net.bytebuddy.implementation.bind.annotation.FieldProxy> install(java.lang.Class<?> r0, java.lang.Class<?> r1) {
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder r0 = install(r0, r1)
                return r0
        }

        public static net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<net.bytebuddy.implementation.bind.annotation.FieldProxy> install(net.bytebuddy.description.type.TypeDescription r5) {
                boolean r0 = r5.isInterface()
                if (r0 == 0) goto Ld3
                net.bytebuddy.description.type.TypeList$Generic r0 = r5.getInterfaces()
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto Lbc
                boolean r0 = r5.isPublic()
                if (r0 == 0) goto La5
                net.bytebuddy.description.method.MethodList r0 = r5.getDeclaredMethods()
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.isAbstract()
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                int r1 = r0.size()
                r2 = 2
                if (r1 != r2) goto L8e
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isGetter(r1)
                net.bytebuddy.matcher.FilterableList r2 = r0.filter(r2)
                net.bytebuddy.description.method.MethodList r2 = (net.bytebuddy.description.method.MethodList) r2
                int r3 = r2.size()
                r4 = 1
                if (r3 != r4) goto L77
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.isSetter(r1)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                int r1 = r0.size()
                if (r1 != r4) goto L60
                net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder r1 = new net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder
                java.lang.Object r2 = r2.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r2
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                r1.<init>(r5, r2, r0)
                return r1
            L60:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r5)
                java.lang.String r5 = " does not declare a setter with an Object type"
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
            L77:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r5)
                java.lang.String r5 = " does not declare a getter with an Object type"
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
            L8e:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r5)
                java.lang.String r5 = " does not declare exactly two non-abstract methods"
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
            La5:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r5)
                java.lang.String r5 = " is not public"
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
            Lbc:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r5)
                java.lang.String r5 = " must not extend other interfaces"
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
            Ld3:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r5)
                java.lang.String r5 = " is not an interface"
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
        }

        public static net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<net.bytebuddy.implementation.bind.annotation.FieldProxy> install(net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.type.TypeDescription r4) {
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = onlyMethod(r3)
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.getReturnType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                boolean r0 = r0.represents(r1)
                if (r0 == 0) goto La1
                net.bytebuddy.description.method.ParameterList r0 = r3.getParameters()
                int r0 = r0.size()
                if (r0 != 0) goto L8a
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = onlyMethod(r4)
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r4.getReturnType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                java.lang.Class r2 = java.lang.Void.TYPE
                boolean r0 = r0.represents(r2)
                if (r0 == 0) goto L73
                net.bytebuddy.description.method.ParameterList r0 = r4.getParameters()
                int r0 = r0.size()
                r2 = 1
                if (r0 != r2) goto L5c
                net.bytebuddy.description.method.ParameterList r0 = r4.getParameters()
                r2 = 0
                java.lang.Object r0 = r0.get(r2)
                net.bytebuddy.description.method.ParameterDescription$InDefinedShape r0 = (net.bytebuddy.description.method.ParameterDescription.InDefinedShape) r0
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                boolean r0 = r0.represents(r1)
                if (r0 == 0) goto L5c
                net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder r0 = new net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder
                r0.<init>(r3, r4)
                return r0
            L5c:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r4)
                java.lang.String r4 = " must declare a single Object-typed parameters"
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r3.<init>(r4)
                throw r3
            L73:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r4)
                java.lang.String r4 = " must return void"
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r3.<init>(r4)
                throw r3
            L8a:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r3 = " must not declare parameters"
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r4.<init>(r3)
                throw r4
            La1:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r3 = " must take a single Object-typed parameter"
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r4.<init>(r3)
                throw r4
        }

        private static net.bytebuddy.description.method.MethodDescription.InDefinedShape onlyMethod(net.bytebuddy.description.type.TypeDescription r3) {
                boolean r0 = r3.isInterface()
                if (r0 == 0) goto L77
                net.bytebuddy.description.type.TypeList$Generic r0 = r3.getInterfaces()
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L60
                boolean r0 = r3.isPublic()
                if (r0 == 0) goto L49
                net.bytebuddy.description.method.MethodList r0 = r3.getDeclaredMethods()
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.isAbstract()
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                int r1 = r0.size()
                r2 = 1
                if (r1 != r2) goto L32
                java.lang.Object r3 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r3
                return r3
            L32:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " must declare exactly one abstract method"
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
            L49:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " is not public"
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
            L60:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " must not extend other interfaces"
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
            L77:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " is not an interface"
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder.ForFieldBinding
        public net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> bind(net.bytebuddy.description.field.FieldDescription r7, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.FieldProxy> r8, net.bytebuddy.description.method.MethodDescription r9, net.bytebuddy.description.method.ParameterDescription r10, net.bytebuddy.implementation.Implementation.Target r11, net.bytebuddy.implementation.bytecode.assign.Assigner r12) {
                r6 = this;
                net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver$Factory r9 = r6.fieldResolverFactory
                net.bytebuddy.description.type.TypeDescription$Generic r10 = r10.getType()
                net.bytebuddy.description.type.TypeDescription r10 = r10.asErasure()
                net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver r3 = r9.resolve(r10, r7)
                boolean r9 = r3.isResolved()
                if (r9 == 0) goto L38
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r9 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$AccessorProxy r10 = new net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$AccessorProxy
                net.bytebuddy.description.type.TypeDescription r2 = r11.getInstrumentedType()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r11 = net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.SERIALIZABLE_PROXY
                net.bytebuddy.description.annotation.AnnotationValue r8 = r8.getValue(r11)
                java.lang.Class<java.lang.Boolean> r11 = java.lang.Boolean.class
                java.lang.Object r8 = r8.resolve(r11)
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r5 = r8.booleanValue()
                r0 = r10
                r1 = r7
                r4 = r12
                r0.<init>(r1, r2, r3, r4, r5)
                r9.<init>(r10)
                return r9
            L38:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal r7 = net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE
                return r7
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder.ForFieldBinding
        public net.bytebuddy.description.type.TypeDescription declaringType(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.FieldProxy> r2) {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.DECLARING_TYPE
                net.bytebuddy.description.annotation.AnnotationValue r2 = r2.getValue(r0)
                java.lang.Class<net.bytebuddy.description.type.TypeDescription> r0 = net.bytebuddy.description.type.TypeDescription.class
                java.lang.Object r2 = r2.resolve(r0)
                net.bytebuddy.description.type.TypeDescription r2 = (net.bytebuddy.description.type.TypeDescription) r2
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
                net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver$Factory r2 = r4.fieldResolverFactory
                net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder r5 = (net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder) r5
                net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver$Factory r5 = r5.fieldResolverFactory
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L20
                return r1
            L20:
                return r0
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder.ForFieldBinding
        public java.lang.String fieldName(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.FieldProxy> r2) {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.bind.annotation.FieldProxy.Binder.FIELD_NAME
                net.bytebuddy.description.annotation.AnnotationValue r2 = r2.getValue(r0)
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                java.lang.Object r2 = r2.resolve(r0)
                java.lang.String r2 = (java.lang.String) r2
                return r2
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public java.lang.Class<net.bytebuddy.implementation.bind.annotation.FieldProxy> getHandledType() {
                r1 = this;
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.FieldProxy> r0 = net.bytebuddy.implementation.bind.annotation.FieldProxy.class
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.implementation.bind.annotation.FieldProxy$Binder$FieldResolver$Factory r1 = r2.fieldResolverFactory
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    java.lang.Class<?> declaringType() default void.class;

    boolean serializableProxy() default false;

    java.lang.String value() default "";
}
