package net.bytebuddy.implementation.bind.annotation;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface FieldGetterHandle {

    public enum Binder extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.FieldGetterHandle.Binder> implements net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<net.bytebuddy.implementation.bind.annotation.FieldGetterHandle> {
        private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.FieldGetterHandle.Binder[] $VALUES = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape DECLARING_TYPE = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape FIELD_NAME = null;
        public static final net.bytebuddy.implementation.bind.annotation.FieldGetterHandle.Binder INSTANCE = null;
        private final net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<net.bytebuddy.implementation.bind.annotation.FieldGetterHandle> delegate;

        public static class Delegate extends net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder.ForFieldBinding<net.bytebuddy.implementation.bind.annotation.FieldGetterHandle> {
            public Delegate() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder.ForFieldBinding
            public net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> bind(net.bytebuddy.description.field.FieldDescription r8, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.FieldGetterHandle> r9, net.bytebuddy.description.method.MethodDescription r10, net.bytebuddy.description.method.ParameterDescription r11, net.bytebuddy.implementation.Implementation.Target r12, net.bytebuddy.implementation.bytecode.assign.Assigner r13) {
                    r7 = this;
                    r9 = 0
                    r10 = 1
                    net.bytebuddy.description.type.TypeDescription$Generic r12 = r11.getType()
                    net.bytebuddy.description.type.TypeDescription r12 = r12.asErasure()
                    net.bytebuddy.utility.JavaType r13 = net.bytebuddy.utility.JavaType.METHOD_HANDLE
                    net.bytebuddy.description.type.TypeDescription r0 = r13.getTypeStub()
                    boolean r12 = r12.isAssignableFrom(r0)
                    if (r12 == 0) goto L82
                    boolean r11 = r8.isStatic()
                    if (r11 == 0) goto L30
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r9 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                    net.bytebuddy.description.ByteCodeElement$TypeDependant r8 = r8.asDefined()
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r8 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r8
                    net.bytebuddy.utility.JavaConstant$MethodHandle r8 = net.bytebuddy.utility.JavaConstant.MethodHandle.ofGetter(r8)
                    net.bytebuddy.implementation.bytecode.StackManipulation r8 = r8.toStackManipulation()
                    r9.<init>(r8)
                    return r9
                L30:
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r11 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r12 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.description.ByteCodeElement$TypeDependant r8 = r8.asDefined()
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r8 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r8
                    net.bytebuddy.utility.JavaConstant$MethodHandle r8 = net.bytebuddy.utility.JavaConstant.MethodHandle.ofGetter(r8)
                    net.bytebuddy.implementation.bytecode.StackManipulation r8 = r8.toStackManipulation()
                    net.bytebuddy.implementation.bytecode.StackManipulation r0 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                    net.bytebuddy.description.method.MethodDescription$Latent r1 = new net.bytebuddy.description.method.MethodDescription$Latent
                    net.bytebuddy.description.type.TypeDescription r2 = r13.getTypeStub()
                    net.bytebuddy.description.method.MethodDescription$Token r3 = new net.bytebuddy.description.method.MethodDescription$Token
                    net.bytebuddy.description.type.TypeDescription r13 = r13.getTypeStub()
                    net.bytebuddy.description.type.TypeDescription$Generic r13 = r13.asGenericType()
                    net.bytebuddy.description.type.TypeList$Generic$Explicit r4 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
                    java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
                    net.bytebuddy.description.type.TypeDescription$Generic r5 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r5)
                    net.bytebuddy.description.type.TypeDefinition[] r6 = new net.bytebuddy.description.type.TypeDefinition[r10]
                    r6[r9] = r5
                    r4.<init>(r6)
                    java.lang.String r5 = "bindTo"
                    r3.<init>(r5, r10, r13, r4)
                    r1.<init>(r2, r3)
                    net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r13 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r1)
                    r1 = 3
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r1 = new net.bytebuddy.implementation.bytecode.StackManipulation[r1]
                    r1[r9] = r8
                    r1[r10] = r0
                    r8 = 2
                    r1[r8] = r13
                    r12.<init>(r1)
                    r11.<init>(r12)
                    return r11
                L82:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r9 = new java.lang.StringBuilder
                    r9.<init>()
                    java.lang.String r10 = "Cannot assign method handle to "
                    r9.append(r10)
                    r9.append(r11)
                    java.lang.String r9 = r9.toString()
                    r8.<init>(r9)
                    throw r8
            }

            @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder.ForFieldBinding
            public net.bytebuddy.description.type.TypeDescription declaringType(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.FieldGetterHandle> r2) {
                    r1 = this;
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.bind.annotation.FieldGetterHandle.Binder.access$100()
                    net.bytebuddy.description.annotation.AnnotationValue r2 = r2.getValue(r0)
                    java.lang.Class<net.bytebuddy.description.type.TypeDescription> r0 = net.bytebuddy.description.type.TypeDescription.class
                    java.lang.Object r2 = r2.resolve(r0)
                    net.bytebuddy.description.type.TypeDescription r2 = (net.bytebuddy.description.type.TypeDescription) r2
                    return r2
            }

            @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder.ForFieldBinding
            public java.lang.String fieldName(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.FieldGetterHandle> r2) {
                    r1 = this;
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.bind.annotation.FieldGetterHandle.Binder.access$000()
                    net.bytebuddy.description.annotation.AnnotationValue r2 = r2.getValue(r0)
                    java.lang.Class<java.lang.String> r0 = java.lang.String.class
                    java.lang.Object r2 = r2.resolve(r0)
                    java.lang.String r2 = (java.lang.String) r2
                    return r2
            }

            @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
            public java.lang.Class<net.bytebuddy.implementation.bind.annotation.FieldGetterHandle> getHandledType() {
                    r1 = this;
                    java.lang.Class<net.bytebuddy.implementation.bind.annotation.FieldGetterHandle> r0 = net.bytebuddy.implementation.bind.annotation.FieldGetterHandle.class
                    return r0
            }
        }

        static {
                net.bytebuddy.implementation.bind.annotation.FieldGetterHandle$Binder r0 = new net.bytebuddy.implementation.bind.annotation.FieldGetterHandle$Binder
                net.bytebuddy.implementation.bind.annotation.FieldGetterHandle$Binder$Delegate r1 = new net.bytebuddy.implementation.bind.annotation.FieldGetterHandle$Binder$Delegate
                r1.<init>()
                java.lang.String r2 = "INSTANCE"
                r3 = 0
                r0.<init>(r2, r3, r1)
                net.bytebuddy.implementation.bind.annotation.FieldGetterHandle.Binder.INSTANCE = r0
                net.bytebuddy.implementation.bind.annotation.FieldGetterHandle$Binder[] r0 = new net.bytebuddy.implementation.bind.annotation.FieldGetterHandle.Binder[]{r0}
                net.bytebuddy.implementation.bind.annotation.FieldGetterHandle.Binder.$VALUES = r0
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.FieldGetterHandle> r0 = net.bytebuddy.implementation.bind.annotation.FieldGetterHandle.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                java.lang.String r1 = "declaringType"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                java.lang.Object r1 = r1.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                net.bytebuddy.implementation.bind.annotation.FieldGetterHandle.Binder.DECLARING_TYPE = r1
                java.lang.String r1 = "value"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                net.bytebuddy.implementation.bind.annotation.FieldGetterHandle.Binder.FIELD_NAME = r0
                return
        }

        Binder(java.lang.String r1, int r2, net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.delegate = r3
                return
        }

        public static /* synthetic */ net.bytebuddy.description.method.MethodDescription.InDefinedShape access$000() {
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.bind.annotation.FieldGetterHandle.Binder.FIELD_NAME
                return r0
        }

        public static /* synthetic */ net.bytebuddy.description.method.MethodDescription.InDefinedShape access$100() {
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.bind.annotation.FieldGetterHandle.Binder.DECLARING_TYPE
                return r0
        }

        public static net.bytebuddy.implementation.bind.annotation.FieldGetterHandle.Binder valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.FieldGetterHandle$Binder> r0 = net.bytebuddy.implementation.bind.annotation.FieldGetterHandle.Binder.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bind.annotation.FieldGetterHandle$Binder r1 = (net.bytebuddy.implementation.bind.annotation.FieldGetterHandle.Binder) r1
                return r1
        }

        public static net.bytebuddy.implementation.bind.annotation.FieldGetterHandle.Binder[] values() {
                net.bytebuddy.implementation.bind.annotation.FieldGetterHandle$Binder[] r0 = net.bytebuddy.implementation.bind.annotation.FieldGetterHandle.Binder.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bind.annotation.FieldGetterHandle$Binder[] r0 = (net.bytebuddy.implementation.bind.annotation.FieldGetterHandle.Binder[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> bind(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.FieldGetterHandle> r8, net.bytebuddy.description.method.MethodDescription r9, net.bytebuddy.description.method.ParameterDescription r10, net.bytebuddy.implementation.Implementation.Target r11, net.bytebuddy.implementation.bytecode.assign.Assigner r12, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r13) {
                r7 = this;
                net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<net.bytebuddy.implementation.bind.annotation.FieldGetterHandle> r0 = r7.delegate
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = r12
                r6 = r13
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding r8 = r0.bind(r1, r2, r3, r4, r5, r6)
                return r8
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public java.lang.Class<net.bytebuddy.implementation.bind.annotation.FieldGetterHandle> getHandledType() {
                r1 = this;
                net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<net.bytebuddy.implementation.bind.annotation.FieldGetterHandle> r0 = r1.delegate
                java.lang.Class r0 = r0.getHandledType()
                return r0
        }
    }

    java.lang.Class<?> declaringType() default void.class;

    java.lang.String value() default "";
}
