package net.bytebuddy.implementation.bind.annotation;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface FieldValue {

    public enum Binder extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.FieldValue.Binder> implements net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<net.bytebuddy.implementation.bind.annotation.FieldValue> {
        private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.FieldValue.Binder[] $VALUES = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape DECLARING_TYPE = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape FIELD_NAME = null;
        public static final net.bytebuddy.implementation.bind.annotation.FieldValue.Binder INSTANCE = null;
        private final net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<net.bytebuddy.implementation.bind.annotation.FieldValue> delegate;

        public static class Delegate extends net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder.ForFieldBinding<net.bytebuddy.implementation.bind.annotation.FieldValue> {
            public Delegate() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder.ForFieldBinding
            public net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> bind(net.bytebuddy.description.field.FieldDescription r2, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.FieldValue> r3, net.bytebuddy.description.method.MethodDescription r4, net.bytebuddy.description.method.ParameterDescription r5, net.bytebuddy.implementation.Implementation.Target r6, net.bytebuddy.implementation.bytecode.assign.Assigner r7) {
                    r1 = this;
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r3 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    boolean r4 = r2.isStatic()
                    if (r4 == 0) goto Lb
                    net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r4 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                    goto Lf
                Lb:
                    net.bytebuddy.implementation.bytecode.StackManipulation r4 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                Lf:
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r6 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r2)
                    net.bytebuddy.implementation.bytecode.StackManipulation r6 = r6.read()
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.getType()
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r5.getType()
                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r5 = net.bytebuddy.implementation.bind.annotation.RuntimeType.Verifier.check(r5)
                    net.bytebuddy.implementation.bytecode.StackManipulation r2 = r7.assign(r2, r0, r5)
                    r5 = 3
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r5 = new net.bytebuddy.implementation.bytecode.StackManipulation[r5]
                    r7 = 0
                    r5[r7] = r4
                    r4 = 1
                    r5[r4] = r6
                    r4 = 2
                    r5[r4] = r2
                    r3.<init>(r5)
                    boolean r2 = r3.isValid()
                    if (r2 == 0) goto L42
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r2 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                    r2.<init>(r3)
                    goto L44
                L42:
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal r2 = net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE
                L44:
                    return r2
            }

            @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder.ForFieldBinding
            public net.bytebuddy.description.type.TypeDescription declaringType(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.FieldValue> r2) {
                    r1 = this;
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.bind.annotation.FieldValue.Binder.access$100()
                    net.bytebuddy.description.annotation.AnnotationValue r2 = r2.getValue(r0)
                    java.lang.Class<net.bytebuddy.description.type.TypeDescription> r0 = net.bytebuddy.description.type.TypeDescription.class
                    java.lang.Object r2 = r2.resolve(r0)
                    net.bytebuddy.description.type.TypeDescription r2 = (net.bytebuddy.description.type.TypeDescription) r2
                    return r2
            }

            @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder.ForFieldBinding
            public java.lang.String fieldName(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.FieldValue> r2) {
                    r1 = this;
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.bind.annotation.FieldValue.Binder.access$000()
                    net.bytebuddy.description.annotation.AnnotationValue r2 = r2.getValue(r0)
                    java.lang.Class<java.lang.String> r0 = java.lang.String.class
                    java.lang.Object r2 = r2.resolve(r0)
                    java.lang.String r2 = (java.lang.String) r2
                    return r2
            }

            @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
            public java.lang.Class<net.bytebuddy.implementation.bind.annotation.FieldValue> getHandledType() {
                    r1 = this;
                    java.lang.Class<net.bytebuddy.implementation.bind.annotation.FieldValue> r0 = net.bytebuddy.implementation.bind.annotation.FieldValue.class
                    return r0
            }
        }

        static {
                net.bytebuddy.implementation.bind.annotation.FieldValue$Binder r0 = new net.bytebuddy.implementation.bind.annotation.FieldValue$Binder
                net.bytebuddy.implementation.bind.annotation.FieldValue$Binder$Delegate r1 = new net.bytebuddy.implementation.bind.annotation.FieldValue$Binder$Delegate
                r1.<init>()
                java.lang.String r2 = "INSTANCE"
                r3 = 0
                r0.<init>(r2, r3, r1)
                net.bytebuddy.implementation.bind.annotation.FieldValue.Binder.INSTANCE = r0
                net.bytebuddy.implementation.bind.annotation.FieldValue$Binder[] r0 = new net.bytebuddy.implementation.bind.annotation.FieldValue.Binder[]{r0}
                net.bytebuddy.implementation.bind.annotation.FieldValue.Binder.$VALUES = r0
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.FieldValue> r0 = net.bytebuddy.implementation.bind.annotation.FieldValue.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                java.lang.String r1 = "declaringType"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                java.lang.Object r1 = r1.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                net.bytebuddy.implementation.bind.annotation.FieldValue.Binder.DECLARING_TYPE = r1
                java.lang.String r1 = "value"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                net.bytebuddy.implementation.bind.annotation.FieldValue.Binder.FIELD_NAME = r0
                return
        }

        Binder(java.lang.String r1, int r2, net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.delegate = r3
                return
        }

        public static /* synthetic */ net.bytebuddy.description.method.MethodDescription.InDefinedShape access$000() {
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.bind.annotation.FieldValue.Binder.FIELD_NAME
                return r0
        }

        public static /* synthetic */ net.bytebuddy.description.method.MethodDescription.InDefinedShape access$100() {
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.bind.annotation.FieldValue.Binder.DECLARING_TYPE
                return r0
        }

        public static net.bytebuddy.implementation.bind.annotation.FieldValue.Binder valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.FieldValue$Binder> r0 = net.bytebuddy.implementation.bind.annotation.FieldValue.Binder.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bind.annotation.FieldValue$Binder r1 = (net.bytebuddy.implementation.bind.annotation.FieldValue.Binder) r1
                return r1
        }

        public static net.bytebuddy.implementation.bind.annotation.FieldValue.Binder[] values() {
                net.bytebuddy.implementation.bind.annotation.FieldValue$Binder[] r0 = net.bytebuddy.implementation.bind.annotation.FieldValue.Binder.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bind.annotation.FieldValue$Binder[] r0 = (net.bytebuddy.implementation.bind.annotation.FieldValue.Binder[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> bind(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.FieldValue> r8, net.bytebuddy.description.method.MethodDescription r9, net.bytebuddy.description.method.ParameterDescription r10, net.bytebuddy.implementation.Implementation.Target r11, net.bytebuddy.implementation.bytecode.assign.Assigner r12, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r13) {
                r7 = this;
                net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<net.bytebuddy.implementation.bind.annotation.FieldValue> r0 = r7.delegate
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
        public java.lang.Class<net.bytebuddy.implementation.bind.annotation.FieldValue> getHandledType() {
                r1 = this;
                net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<net.bytebuddy.implementation.bind.annotation.FieldValue> r0 = r1.delegate
                java.lang.Class r0 = r0.getHandledType()
                return r0
        }
    }

    java.lang.Class<?> declaringType() default void.class;

    java.lang.String value() default "";
}
