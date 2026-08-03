package net.bytebuddy.implementation.bind.annotation;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface SuperMethod {

    public enum Binder extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.SuperMethod.Binder> implements net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<net.bytebuddy.implementation.bind.annotation.SuperMethod> {
        private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.SuperMethod.Binder[] $VALUES = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape CACHED = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape FALLBACK_TO_DEFAULT = null;
        public static final net.bytebuddy.implementation.bind.annotation.SuperMethod.Binder INSTANCE = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape NULL_IF_IMPOSSIBLE = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape PRIVILEGED = null;

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
                    net.bytebuddy.implementation.bind.annotation.SuperMethod$Binder$DelegationMethod r5 = (net.bytebuddy.implementation.bind.annotation.SuperMethod.Binder.DelegationMethod) r5
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

        static {
                net.bytebuddy.implementation.bind.annotation.SuperMethod$Binder r0 = new net.bytebuddy.implementation.bind.annotation.SuperMethod$Binder
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.bind.annotation.SuperMethod.Binder.INSTANCE = r0
                net.bytebuddy.implementation.bind.annotation.SuperMethod$Binder[] r0 = new net.bytebuddy.implementation.bind.annotation.SuperMethod.Binder[]{r0}
                net.bytebuddy.implementation.bind.annotation.SuperMethod.Binder.$VALUES = r0
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.SuperMethod> r0 = net.bytebuddy.implementation.bind.annotation.SuperMethod.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                java.lang.String r1 = "cached"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                java.lang.Object r1 = r1.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                net.bytebuddy.implementation.bind.annotation.SuperMethod.Binder.CACHED = r1
                java.lang.String r1 = "privileged"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                java.lang.Object r1 = r1.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                net.bytebuddy.implementation.bind.annotation.SuperMethod.Binder.PRIVILEGED = r1
                java.lang.String r1 = "fallbackToDefault"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                java.lang.Object r1 = r1.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                net.bytebuddy.implementation.bind.annotation.SuperMethod.Binder.FALLBACK_TO_DEFAULT = r1
                java.lang.String r1 = "nullIfImpossible"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                net.bytebuddy.implementation.bind.annotation.SuperMethod.Binder.NULL_IF_IMPOSSIBLE = r0
                return
        }

        Binder(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.bind.annotation.SuperMethod.Binder valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.SuperMethod$Binder> r0 = net.bytebuddy.implementation.bind.annotation.SuperMethod.Binder.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bind.annotation.SuperMethod$Binder r1 = (net.bytebuddy.implementation.bind.annotation.SuperMethod.Binder) r1
                return r1
        }

        public static net.bytebuddy.implementation.bind.annotation.SuperMethod.Binder[] values() {
                net.bytebuddy.implementation.bind.annotation.SuperMethod$Binder[] r0 = net.bytebuddy.implementation.bind.annotation.SuperMethod.Binder.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bind.annotation.SuperMethod$Binder[] r0 = (net.bytebuddy.implementation.bind.annotation.SuperMethod.Binder[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> bind(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.SuperMethod> r2, net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.description.method.ParameterDescription r4, net.bytebuddy.implementation.Implementation.Target r5, net.bytebuddy.implementation.bytecode.assign.Assigner r6, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r7) {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r6 = r4.getType()
                net.bytebuddy.description.type.TypeDescription r6 = r6.asErasure()
                java.lang.Class<java.lang.reflect.Method> r7 = java.lang.reflect.Method.class
                boolean r6 = r6.isAssignableFrom(r7)
                if (r6 == 0) goto Lae
                boolean r4 = r3.isMethod()
                java.lang.Class<java.lang.Boolean> r6 = java.lang.Boolean.class
                if (r4 == 0) goto L91
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = net.bytebuddy.implementation.bind.annotation.SuperMethod.Binder.FALLBACK_TO_DEFAULT
                net.bytebuddy.description.annotation.AnnotationValue r4 = r2.getValue(r4)
                java.lang.Object r4 = r4.resolve(r6)
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 == 0) goto L33
                net.bytebuddy.description.method.MethodDescription$SignatureToken r4 = r3.asSignatureToken()
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r4 = r5.invokeDominant(r4)
                goto L3b
            L33:
                net.bytebuddy.description.method.MethodDescription$SignatureToken r4 = r3.asSignatureToken()
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r4 = r5.invokeSuper(r4)
            L3b:
                net.bytebuddy.description.method.MethodDescription$TypeToken r3 = r3.asTypeToken()
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r3 = r4.withCheckedCompatibilityTo(r3)
                boolean r4 = r3.isValid()
                if (r4 == 0) goto L74
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r4 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                net.bytebuddy.implementation.bind.annotation.SuperMethod$Binder$DelegationMethod r5 = new net.bytebuddy.implementation.bind.annotation.SuperMethod$Binder$DelegationMethod
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r7 = net.bytebuddy.implementation.bind.annotation.SuperMethod.Binder.CACHED
                net.bytebuddy.description.annotation.AnnotationValue r7 = r2.getValue(r7)
                java.lang.Object r7 = r7.resolve(r6)
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.bind.annotation.SuperMethod.Binder.PRIVILEGED
                net.bytebuddy.description.annotation.AnnotationValue r2 = r2.getValue(r0)
                java.lang.Object r2 = r2.resolve(r6)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                r5.<init>(r3, r7, r2)
                r4.<init>(r5)
                return r4
            L74:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = net.bytebuddy.implementation.bind.annotation.SuperMethod.Binder.NULL_IF_IMPOSSIBLE
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
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = net.bytebuddy.implementation.bind.annotation.SuperMethod.Binder.NULL_IF_IMPOSSIBLE
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
        public java.lang.Class<net.bytebuddy.implementation.bind.annotation.SuperMethod> getHandledType() {
                r1 = this;
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.SuperMethod> r0 = net.bytebuddy.implementation.bind.annotation.SuperMethod.class
                return r0
        }
    }

    boolean cached() default true;

    boolean fallbackToDefault() default true;

    boolean nullIfImpossible() default false;

    boolean privileged() default false;
}
