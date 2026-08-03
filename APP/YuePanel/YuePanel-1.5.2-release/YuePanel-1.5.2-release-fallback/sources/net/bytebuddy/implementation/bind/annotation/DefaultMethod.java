package net.bytebuddy.implementation.bind.annotation;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface DefaultMethod {

    public enum Binder extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder> implements net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<net.bytebuddy.implementation.bind.annotation.DefaultMethod> {
        private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder[] $VALUES = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape CACHED = null;
        public static final net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder INSTANCE = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape NULL_IF_IMPOSSIBLE = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape PRIVILEGED = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape TARGET_TYPE = null;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class DelegationMethod implements net.bytebuddy.implementation.bytecode.StackManipulation {
            private final boolean cached;
            private final boolean privileged;
            private final net.bytebuddy.implementation.Implementation.SpecialMethodInvocation specialMethodInvocation;

            public DelegationMethod(net.bytebuddy.implementation.Implementation.SpecialMethodInvocation r1, boolean r2, boolean r3) {
                    r0 = this;
                    r0.<init>()
                    r0.specialMethodInvocation = r1
                    r0.cached = r2
                    r0.privileged = r3
                    return
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r3, net.bytebuddy.implementation.Implementation.Context r4) {
                    r2 = this;
                    boolean r0 = r2.privileged
                    if (r0 == 0) goto L11
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r0 = r2.specialMethodInvocation
                    net.bytebuddy.implementation.MethodAccessorFactory$AccessType r1 = net.bytebuddy.implementation.MethodAccessorFactory.AccessType.PUBLIC
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r4.registerAccessorFor(r0, r1)
                    net.bytebuddy.implementation.bytecode.constant.MethodConstant$CanCache r0 = net.bytebuddy.implementation.bytecode.constant.MethodConstant.ofPrivileged(r0)
                    goto L1d
                L11:
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r0 = r2.specialMethodInvocation
                    net.bytebuddy.implementation.MethodAccessorFactory$AccessType r1 = net.bytebuddy.implementation.MethodAccessorFactory.AccessType.PUBLIC
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r4.registerAccessorFor(r0, r1)
                    net.bytebuddy.implementation.bytecode.constant.MethodConstant$CanCache r0 = net.bytebuddy.implementation.bytecode.constant.MethodConstant.of(r0)
                L1d:
                    boolean r1 = r2.cached
                    if (r1 == 0) goto L33
                    java.lang.Class<java.lang.reflect.Method> r1 = java.lang.reflect.Method.class
                    net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r0 = r4.cache(r0, r1)
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r0 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r0)
                    net.bytebuddy.implementation.bytecode.StackManipulation r0 = r0.read()
                L33:
                    net.bytebuddy.implementation.bytecode.StackManipulation$Size r3 = r0.apply(r3, r4)
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
                    boolean r2 = r4.cached
                    net.bytebuddy.implementation.bind.annotation.DefaultMethod$Binder$DelegationMethod r5 = (net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.DelegationMethod) r5
                    boolean r3 = r5.cached
                    if (r2 == r3) goto L1c
                    return r1
                L1c:
                    boolean r2 = r4.privileged
                    boolean r3 = r5.privileged
                    if (r2 == r3) goto L23
                    return r1
                L23:
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r2 = r4.specialMethodInvocation
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r5 = r5.specialMethodInvocation
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L2e
                    return r1
                L2e:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r1 = r2.specialMethodInvocation
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    boolean r1 = r2.cached
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    boolean r1 = r2.privileged
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

        public interface MethodLocator {

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForExplicitType implements net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.MethodLocator {
                private final net.bytebuddy.description.type.TypeDescription typeDescription;

                public ForExplicitType(net.bytebuddy.description.type.TypeDescription r1) {
                        r0 = this;
                        r0.<init>()
                        r0.typeDescription = r1
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
                        net.bytebuddy.description.type.TypeDescription r2 = r4.typeDescription
                        net.bytebuddy.implementation.bind.annotation.DefaultMethod$Binder$MethodLocator$ForExplicitType r5 = (net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.MethodLocator.ForExplicitType) r5
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

                @Override // net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.MethodLocator
                public net.bytebuddy.implementation.Implementation.SpecialMethodInvocation resolve(net.bytebuddy.implementation.Implementation.Target r3, net.bytebuddy.description.method.MethodDescription r4) {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r2.typeDescription
                        boolean r0 = r0.isInterface()
                        if (r0 == 0) goto L1b
                        net.bytebuddy.description.method.MethodDescription$SignatureToken r4 = r4.asSignatureToken()
                        net.bytebuddy.description.type.TypeDescription r0 = r2.typeDescription
                        net.bytebuddy.description.type.TypeDescription r1 = r3.getInstrumentedType()
                        net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.dynamic.TargetType.resolve(r0, r1)
                        net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r3 = r3.invokeDefault(r4, r0)
                        return r3
                    L1b:
                        java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        r0.append(r4)
                        java.lang.String r4 = " method carries default method call parameter on non-interface type"
                        r0.append(r4)
                        java.lang.String r4 = r0.toString()
                        r3.<init>(r4)
                        throw r3
                }
            }

            public enum ForImplicitType extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.MethodLocator.ForImplicitType> implements net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.MethodLocator {
                private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.MethodLocator.ForImplicitType[] $VALUES = null;
                public static final net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.MethodLocator.ForImplicitType INSTANCE = null;

                static {
                        net.bytebuddy.implementation.bind.annotation.DefaultMethod$Binder$MethodLocator$ForImplicitType r0 = new net.bytebuddy.implementation.bind.annotation.DefaultMethod$Binder$MethodLocator$ForImplicitType
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.MethodLocator.ForImplicitType.INSTANCE = r0
                        net.bytebuddy.implementation.bind.annotation.DefaultMethod$Binder$MethodLocator$ForImplicitType[] r0 = new net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.MethodLocator.ForImplicitType[]{r0}
                        net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.MethodLocator.ForImplicitType.$VALUES = r0
                        return
                }

                ForImplicitType(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.MethodLocator.ForImplicitType valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.bind.annotation.DefaultMethod$Binder$MethodLocator$ForImplicitType> r0 = net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.MethodLocator.ForImplicitType.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.bind.annotation.DefaultMethod$Binder$MethodLocator$ForImplicitType r1 = (net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.MethodLocator.ForImplicitType) r1
                        return r1
                }

                public static net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.MethodLocator.ForImplicitType[] values() {
                        net.bytebuddy.implementation.bind.annotation.DefaultMethod$Binder$MethodLocator$ForImplicitType[] r0 = net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.MethodLocator.ForImplicitType.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.bind.annotation.DefaultMethod$Binder$MethodLocator$ForImplicitType[] r0 = (net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.MethodLocator.ForImplicitType[]) r0
                        return r0
                }

                @Override // net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.MethodLocator
                public net.bytebuddy.implementation.Implementation.SpecialMethodInvocation resolve(net.bytebuddy.implementation.Implementation.Target r1, net.bytebuddy.description.method.MethodDescription r2) {
                        r0 = this;
                        net.bytebuddy.description.method.MethodDescription$SignatureToken r2 = r2.asSignatureToken()
                        net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r1 = r1.invokeDefault(r2)
                        return r1
                }
            }

            net.bytebuddy.implementation.Implementation.SpecialMethodInvocation resolve(net.bytebuddy.implementation.Implementation.Target r1, net.bytebuddy.description.method.MethodDescription r2);
        }

        static {
                net.bytebuddy.implementation.bind.annotation.DefaultMethod$Binder r0 = new net.bytebuddy.implementation.bind.annotation.DefaultMethod$Binder
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.INSTANCE = r0
                net.bytebuddy.implementation.bind.annotation.DefaultMethod$Binder[] r0 = new net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder[]{r0}
                net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.$VALUES = r0
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.DefaultMethod> r0 = net.bytebuddy.implementation.bind.annotation.DefaultMethod.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                java.lang.String r1 = "cached"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                java.lang.Object r1 = r1.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.CACHED = r1
                java.lang.String r1 = "privileged"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                java.lang.Object r1 = r1.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.PRIVILEGED = r1
                java.lang.String r1 = "targetType"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                java.lang.Object r1 = r1.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.TARGET_TYPE = r1
                java.lang.String r1 = "nullIfImpossible"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.NULL_IF_IMPOSSIBLE = r0
                return
        }

        Binder(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.DefaultMethod$Binder> r0 = net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bind.annotation.DefaultMethod$Binder r1 = (net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder) r1
                return r1
        }

        public static net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder[] values() {
                net.bytebuddy.implementation.bind.annotation.DefaultMethod$Binder[] r0 = net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bind.annotation.DefaultMethod$Binder[] r0 = (net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> bind(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.DefaultMethod> r2, net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.description.method.ParameterDescription r4, net.bytebuddy.implementation.Implementation.Target r5, net.bytebuddy.implementation.bytecode.assign.Assigner r6, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r7) {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r6 = r4.getType()
                net.bytebuddy.description.type.TypeDescription r6 = r6.asErasure()
                java.lang.Class<java.lang.reflect.Method> r7 = java.lang.reflect.Method.class
                boolean r6 = r6.isAssignableFrom(r7)
                if (r6 == 0) goto Lae
                boolean r4 = r3.isMethod()
                java.lang.Class<java.lang.Boolean> r6 = java.lang.Boolean.class
                if (r4 == 0) goto L91
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.TARGET_TYPE
                net.bytebuddy.description.annotation.AnnotationValue r4 = r2.getValue(r4)
                java.lang.Class<net.bytebuddy.description.type.TypeDescription> r7 = net.bytebuddy.description.type.TypeDescription.class
                java.lang.Object r4 = r4.resolve(r7)
                net.bytebuddy.description.type.TypeDescription r4 = (net.bytebuddy.description.type.TypeDescription) r4
                java.lang.Class r7 = java.lang.Void.TYPE
                boolean r7 = r4.represents(r7)
                if (r7 == 0) goto L31
                net.bytebuddy.implementation.bind.annotation.DefaultMethod$Binder$MethodLocator$ForImplicitType r4 = net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.MethodLocator.ForImplicitType.INSTANCE
                goto L37
            L31:
                net.bytebuddy.implementation.bind.annotation.DefaultMethod$Binder$MethodLocator$ForExplicitType r7 = new net.bytebuddy.implementation.bind.annotation.DefaultMethod$Binder$MethodLocator$ForExplicitType
                r7.<init>(r4)
                r4 = r7
            L37:
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r4 = r4.resolve(r5, r3)
                net.bytebuddy.description.method.MethodDescription$TypeToken r3 = r3.asTypeToken()
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r3 = r4.withCheckedCompatibilityTo(r3)
                boolean r4 = r3.isValid()
                if (r4 == 0) goto L74
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r4 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                net.bytebuddy.implementation.bind.annotation.DefaultMethod$Binder$DelegationMethod r5 = new net.bytebuddy.implementation.bind.annotation.DefaultMethod$Binder$DelegationMethod
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r7 = net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.CACHED
                net.bytebuddy.description.annotation.AnnotationValue r7 = r2.getValue(r7)
                java.lang.Object r7 = r7.resolve(r6)
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.PRIVILEGED
                net.bytebuddy.description.annotation.AnnotationValue r2 = r2.getValue(r0)
                java.lang.Object r2 = r2.resolve(r6)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                r5.<init>(r3, r7, r2)
                r4.<init>(r5)
                return r4
            L74:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.NULL_IF_IMPOSSIBLE
                net.bytebuddy.description.annotation.AnnotationValue r2 = r2.getValue(r3)
                java.lang.Object r2 = r2.resolve(r6)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L8e
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r2 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                net.bytebuddy.implementation.bytecode.constant.NullConstant r3 = net.bytebuddy.implementation.bytecode.constant.NullConstant.INSTANCE
                r2.<init>(r3)
                return r2
            L8e:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal r2 = net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE
                return r2
            L91:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.NULL_IF_IMPOSSIBLE
                net.bytebuddy.description.annotation.AnnotationValue r2 = r2.getValue(r3)
                java.lang.Object r2 = r2.resolve(r6)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto Lab
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r2 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                net.bytebuddy.implementation.bytecode.constant.NullConstant r3 = net.bytebuddy.implementation.bytecode.constant.NullConstant.INSTANCE
                r2.<init>(r3)
                return r2
            Lab:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal r2 = net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE
                return r2
            Lae:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "Cannot assign Method type to "
                r3.append(r5)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public java.lang.Class<net.bytebuddy.implementation.bind.annotation.DefaultMethod> getHandledType() {
                r1 = this;
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.DefaultMethod> r0 = net.bytebuddy.implementation.bind.annotation.DefaultMethod.class
                return r0
        }
    }

    boolean cached() default true;

    boolean nullIfImpossible() default false;

    boolean privileged() default false;

    java.lang.Class<?> targetType() default void.class;
}
