package net.bytebuddy.implementation.bind.annotation;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface DefaultMethodHandle {

    public enum Binder extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder> implements net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle> {
        private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder[] $VALUES = null;
        public static final net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder INSTANCE = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape NULL_IF_IMPOSSIBLE = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape TARGET_TYPE = null;

        public interface MethodLocator {

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForExplicitType implements net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder.MethodLocator {
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
                        net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle$Binder$MethodLocator$ForExplicitType r5 = (net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder.MethodLocator.ForExplicitType) r5
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

                @Override // net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder.MethodLocator
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

            public enum ForImplicitType extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder.MethodLocator.ForImplicitType> implements net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder.MethodLocator {
                private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder.MethodLocator.ForImplicitType[] $VALUES = null;
                public static final net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder.MethodLocator.ForImplicitType INSTANCE = null;

                static {
                        net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle$Binder$MethodLocator$ForImplicitType r0 = new net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle$Binder$MethodLocator$ForImplicitType
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder.MethodLocator.ForImplicitType.INSTANCE = r0
                        net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle$Binder$MethodLocator$ForImplicitType[] r0 = new net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder.MethodLocator.ForImplicitType[]{r0}
                        net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder.MethodLocator.ForImplicitType.$VALUES = r0
                        return
                }

                ForImplicitType(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder.MethodLocator.ForImplicitType valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle$Binder$MethodLocator$ForImplicitType> r0 = net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder.MethodLocator.ForImplicitType.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle$Binder$MethodLocator$ForImplicitType r1 = (net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder.MethodLocator.ForImplicitType) r1
                        return r1
                }

                public static net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder.MethodLocator.ForImplicitType[] values() {
                        net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle$Binder$MethodLocator$ForImplicitType[] r0 = net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder.MethodLocator.ForImplicitType.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle$Binder$MethodLocator$ForImplicitType[] r0 = (net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder.MethodLocator.ForImplicitType[]) r0
                        return r0
                }

                @Override // net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder.MethodLocator
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
                net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle$Binder r0 = new net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle$Binder
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder.INSTANCE = r0
                net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle$Binder[] r0 = new net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder[]{r0}
                net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder.$VALUES = r0
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle> r0 = net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                java.lang.String r1 = "targetType"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                java.lang.Object r1 = r1.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder.TARGET_TYPE = r1
                java.lang.String r1 = "nullIfImpossible"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder.NULL_IF_IMPOSSIBLE = r0
                return
        }

        Binder(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle$Binder> r0 = net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle$Binder r1 = (net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder) r1
                return r1
        }

        public static net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder[] values() {
                net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle$Binder[] r0 = net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle$Binder[] r0 = (net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> bind(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle> r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.description.method.ParameterDescription r3, net.bytebuddy.implementation.Implementation.Target r4, net.bytebuddy.implementation.bytecode.assign.Assigner r5, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r6) {
                r0 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r5 = r3.getType()
                net.bytebuddy.description.type.TypeDescription r5 = r5.asErasure()
                net.bytebuddy.utility.JavaType r6 = net.bytebuddy.utility.JavaType.METHOD_HANDLE
                net.bytebuddy.description.type.TypeDescription r6 = r6.getTypeStub()
                boolean r5 = r5.isAssignableFrom(r6)
                if (r5 == 0) goto L95
                boolean r3 = r2.isMethod()
                java.lang.Class<java.lang.Boolean> r5 = java.lang.Boolean.class
                if (r3 == 0) goto L78
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder.TARGET_TYPE
                net.bytebuddy.description.annotation.AnnotationValue r3 = r1.getValue(r3)
                java.lang.Class<net.bytebuddy.description.type.TypeDescription> r6 = net.bytebuddy.description.type.TypeDescription.class
                java.lang.Object r3 = r3.resolve(r6)
                net.bytebuddy.description.type.TypeDescription r3 = (net.bytebuddy.description.type.TypeDescription) r3
                java.lang.Class r6 = java.lang.Void.TYPE
                boolean r6 = r3.represents(r6)
                if (r6 == 0) goto L35
                net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle$Binder$MethodLocator$ForImplicitType r3 = net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder.MethodLocator.ForImplicitType.INSTANCE
                goto L3b
            L35:
                net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle$Binder$MethodLocator$ForExplicitType r6 = new net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle$Binder$MethodLocator$ForExplicitType
                r6.<init>(r3)
                r3 = r6
            L3b:
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r3 = r3.resolve(r4, r2)
                net.bytebuddy.description.method.MethodDescription$TypeToken r2 = r2.asTypeToken()
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r2 = r3.withCheckedCompatibilityTo(r2)
                boolean r3 = r2.isValid()
                if (r3 == 0) goto L5b
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r1 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                net.bytebuddy.utility.JavaConstant$MethodHandle r2 = r2.toMethodHandle()
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = r2.toStackManipulation()
                r1.<init>(r2)
                return r1
            L5b:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder.NULL_IF_IMPOSSIBLE
                net.bytebuddy.description.annotation.AnnotationValue r1 = r1.getValue(r2)
                java.lang.Object r1 = r1.resolve(r5)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L75
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r1 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                net.bytebuddy.implementation.bytecode.constant.NullConstant r2 = net.bytebuddy.implementation.bytecode.constant.NullConstant.INSTANCE
                r1.<init>(r2)
                return r1
            L75:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal r1 = net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE
                return r1
            L78:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder.NULL_IF_IMPOSSIBLE
                net.bytebuddy.description.annotation.AnnotationValue r1 = r1.getValue(r2)
                java.lang.Object r1 = r1.resolve(r5)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L92
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r1 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                net.bytebuddy.implementation.bytecode.constant.NullConstant r2 = net.bytebuddy.implementation.bytecode.constant.NullConstant.INSTANCE
                r1.<init>(r2)
                return r1
            L92:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal r1 = net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE
                return r1
            L95:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "Cannot assign MethodHandle type to "
                r2.append(r4)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public java.lang.Class<net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle> getHandledType() {
                r1 = this;
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle> r0 = net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.class
                return r0
        }
    }

    boolean nullIfImpossible() default false;

    java.lang.Class<?> targetType() default void.class;
}
