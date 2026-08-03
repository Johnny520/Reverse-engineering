package net.bytebuddy.implementation.bind.annotation;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Argument {

    /* JADX INFO: renamed from: net.bytebuddy.implementation.bind.annotation.Argument$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public enum Binder extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.Argument.Binder> implements net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<net.bytebuddy.implementation.bind.annotation.Argument> {
        private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.Argument.Binder[] $VALUES = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape BINDING_MECHANIC = null;
        public static final net.bytebuddy.implementation.bind.annotation.Argument.Binder INSTANCE = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape VALUE = null;

        static {
                net.bytebuddy.implementation.bind.annotation.Argument$Binder r0 = new net.bytebuddy.implementation.bind.annotation.Argument$Binder
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.bind.annotation.Argument.Binder.INSTANCE = r0
                net.bytebuddy.implementation.bind.annotation.Argument$Binder[] r0 = new net.bytebuddy.implementation.bind.annotation.Argument.Binder[]{r0}
                net.bytebuddy.implementation.bind.annotation.Argument.Binder.$VALUES = r0
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.Argument> r0 = net.bytebuddy.implementation.bind.annotation.Argument.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                java.lang.String r1 = "value"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                java.lang.Object r1 = r1.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                net.bytebuddy.implementation.bind.annotation.Argument.Binder.VALUE = r1
                java.lang.String r1 = "bindingMechanic"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                net.bytebuddy.implementation.bind.annotation.Argument.Binder.BINDING_MECHANIC = r0
                return
        }

        Binder(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.bind.annotation.Argument.Binder valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.Argument$Binder> r0 = net.bytebuddy.implementation.bind.annotation.Argument.Binder.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bind.annotation.Argument$Binder r1 = (net.bytebuddy.implementation.bind.annotation.Argument.Binder) r1
                return r1
        }

        public static net.bytebuddy.implementation.bind.annotation.Argument.Binder[] values() {
                net.bytebuddy.implementation.bind.annotation.Argument$Binder[] r0 = net.bytebuddy.implementation.bind.annotation.Argument.Binder.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bind.annotation.Argument$Binder[] r0 = (net.bytebuddy.implementation.bind.annotation.Argument.Binder[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> bind(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.Argument> r10, net.bytebuddy.description.method.MethodDescription r11, net.bytebuddy.description.method.ParameterDescription r12, net.bytebuddy.implementation.Implementation.Target r13, net.bytebuddy.implementation.bytecode.assign.Assigner r14, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r15) {
                r9 = this;
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r13 = net.bytebuddy.implementation.bind.annotation.Argument.Binder.VALUE
                net.bytebuddy.description.annotation.AnnotationValue r0 = r10.getValue(r13)
                java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
                java.lang.Object r0 = r0.resolve(r1)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                if (r0 < 0) goto L99
                net.bytebuddy.description.method.ParameterList r0 = r11.getParameters()
                int r0 = r0.size()
                net.bytebuddy.description.annotation.AnnotationValue r2 = r10.getValue(r13)
                java.lang.Object r2 = r2.resolve(r1)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                if (r0 > r2) goto L2f
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal r10 = net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE
                return r10
            L2f:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.bind.annotation.Argument.Binder.BINDING_MECHANIC
                net.bytebuddy.description.annotation.AnnotationValue r0 = r10.getValue(r0)
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.Argument> r2 = net.bytebuddy.implementation.bind.annotation.Argument.class
                java.lang.ClassLoader r2 = r2.getClassLoader()
                net.bytebuddy.description.annotation.AnnotationValue$Loaded r0 = r0.load(r2)
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.Argument$BindingMechanic> r2 = net.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic.class
                java.lang.Object r0 = r0.resolve(r2)
                r2 = r0
                net.bytebuddy.implementation.bind.annotation.Argument$BindingMechanic r2 = (net.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic) r2
                net.bytebuddy.description.method.ParameterList r0 = r11.getParameters()
                net.bytebuddy.description.annotation.AnnotationValue r3 = r10.getValue(r13)
                java.lang.Object r3 = r3.resolve(r1)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                java.lang.Object r0 = r0.get(r3)
                net.bytebuddy.description.method.ParameterDescription r0 = (net.bytebuddy.description.method.ParameterDescription) r0
                net.bytebuddy.description.type.TypeDescription$Generic r3 = r0.getType()
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r12.getType()
                net.bytebuddy.description.annotation.AnnotationValue r12 = r10.getValue(r13)
                java.lang.Object r12 = r12.resolve(r1)
                java.lang.Integer r12 = (java.lang.Integer) r12
                int r5 = r12.intValue()
                net.bytebuddy.description.method.ParameterList r11 = r11.getParameters()
                net.bytebuddy.description.annotation.AnnotationValue r10 = r10.getValue(r13)
                java.lang.Object r10 = r10.resolve(r1)
                java.lang.Integer r10 = (java.lang.Integer) r10
                int r10 = r10.intValue()
                java.lang.Object r10 = r11.get(r10)
                net.bytebuddy.description.method.ParameterDescription r10 = (net.bytebuddy.description.method.ParameterDescription) r10
                int r8 = r10.getOffset()
                r6 = r14
                r7 = r15
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding r10 = r2.makeBinding(r3, r4, r5, r6, r7, r8)
                return r10
            L99:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r13 = "@Argument annotation on "
                r11.append(r13)
                r11.append(r12)
                java.lang.String r12 = " specifies negative index"
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                r10.<init>(r11)
                throw r10
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public java.lang.Class<net.bytebuddy.implementation.bind.annotation.Argument> getHandledType() {
                r1 = this;
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.Argument> r0 = net.bytebuddy.implementation.bind.annotation.Argument.class
                return r0
        }
    }

    public enum BindingMechanic extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic> {
        private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic[] $VALUES = null;
        public static final net.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic ANONYMOUS = null;
        public static final net.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic UNIQUE = null;



        static {
                net.bytebuddy.implementation.bind.annotation.Argument$BindingMechanic$1 r0 = new net.bytebuddy.implementation.bind.annotation.Argument$BindingMechanic$1
                java.lang.String r1 = "UNIQUE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic.UNIQUE = r0
                net.bytebuddy.implementation.bind.annotation.Argument$BindingMechanic$2 r1 = new net.bytebuddy.implementation.bind.annotation.Argument$BindingMechanic$2
                java.lang.String r3 = "ANONYMOUS"
                r4 = 1
                r1.<init>(r3, r4)
                net.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic.ANONYMOUS = r1
                r3 = 2
                net.bytebuddy.implementation.bind.annotation.Argument$BindingMechanic[] r3 = new net.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic[r3]
                r3[r2] = r0
                r3[r4] = r1
                net.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic.$VALUES = r3
                return
        }

        BindingMechanic(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ BindingMechanic(java.lang.String r1, int r2, net.bytebuddy.implementation.bind.annotation.Argument.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.Argument$BindingMechanic> r0 = net.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bind.annotation.Argument$BindingMechanic r1 = (net.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic) r1
                return r1
        }

        public static net.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic[] values() {
                net.bytebuddy.implementation.bind.annotation.Argument$BindingMechanic[] r0 = net.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bind.annotation.Argument$BindingMechanic[] r0 = (net.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic[]) r0
                return r0
        }

        public abstract net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> makeBinding(net.bytebuddy.description.type.TypeDescription.Generic r1, net.bytebuddy.description.type.TypeDescription.Generic r2, int r3, net.bytebuddy.implementation.bytecode.assign.Assigner r4, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r5, int r6);
    }

    net.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic bindingMechanic() default net.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic.UNIQUE;

    int value();
}
