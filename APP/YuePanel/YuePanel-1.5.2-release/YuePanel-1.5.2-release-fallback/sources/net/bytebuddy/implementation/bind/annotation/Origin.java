package net.bytebuddy.implementation.bind.annotation;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Origin {

    public enum Binder extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.Origin.Binder> implements net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<net.bytebuddy.implementation.bind.annotation.Origin> {
        private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.Origin.Binder[] $VALUES = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape CACHE = null;
        public static final net.bytebuddy.implementation.bind.annotation.Origin.Binder INSTANCE = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape PRIVILEGED = null;

        static {
                net.bytebuddy.implementation.bind.annotation.Origin$Binder r0 = new net.bytebuddy.implementation.bind.annotation.Origin$Binder
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.bind.annotation.Origin.Binder.INSTANCE = r0
                net.bytebuddy.implementation.bind.annotation.Origin$Binder[] r0 = new net.bytebuddy.implementation.bind.annotation.Origin.Binder[]{r0}
                net.bytebuddy.implementation.bind.annotation.Origin.Binder.$VALUES = r0
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.Origin> r0 = net.bytebuddy.implementation.bind.annotation.Origin.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                java.lang.String r1 = "cache"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                java.lang.Object r1 = r1.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                net.bytebuddy.implementation.bind.annotation.Origin.Binder.CACHE = r1
                java.lang.String r1 = "privileged"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                net.bytebuddy.implementation.bind.annotation.Origin.Binder.PRIVILEGED = r0
                return
        }

        Binder(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private static net.bytebuddy.implementation.bytecode.StackManipulation methodConstant(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.Origin> r2, net.bytebuddy.description.method.MethodDescription.InDefinedShape r3) {
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.bind.annotation.Origin.Binder.PRIVILEGED
                net.bytebuddy.description.annotation.AnnotationValue r0 = r2.getValue(r0)
                java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
                java.lang.Object r0 = r0.resolve(r1)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L19
                net.bytebuddy.implementation.bytecode.constant.MethodConstant$CanCache r3 = net.bytebuddy.implementation.bytecode.constant.MethodConstant.ofPrivileged(r3)
                goto L1d
            L19:
                net.bytebuddy.implementation.bytecode.constant.MethodConstant$CanCache r3 = net.bytebuddy.implementation.bytecode.constant.MethodConstant.of(r3)
            L1d:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.bind.annotation.Origin.Binder.CACHE
                net.bytebuddy.description.annotation.AnnotationValue r2 = r2.getValue(r0)
                java.lang.Object r2 = r2.resolve(r1)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L33
                net.bytebuddy.implementation.bytecode.StackManipulation r3 = r3.cached()
            L33:
                return r3
        }

        public static net.bytebuddy.implementation.bind.annotation.Origin.Binder valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.Origin$Binder> r0 = net.bytebuddy.implementation.bind.annotation.Origin.Binder.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bind.annotation.Origin$Binder r1 = (net.bytebuddy.implementation.bind.annotation.Origin.Binder) r1
                return r1
        }

        public static net.bytebuddy.implementation.bind.annotation.Origin.Binder[] values() {
                net.bytebuddy.implementation.bind.annotation.Origin$Binder[] r0 = net.bytebuddy.implementation.bind.annotation.Origin.Binder.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bind.annotation.Origin$Binder[] r0 = (net.bytebuddy.implementation.bind.annotation.Origin.Binder[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> bind(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.Origin> r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.description.method.ParameterDescription r3, net.bytebuddy.implementation.Implementation.Target r4, net.bytebuddy.implementation.bytecode.assign.Assigner r5, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r6) {
                r0 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r5 = r3.getType()
                net.bytebuddy.description.type.TypeDescription r5 = r5.asErasure()
                java.lang.Class<java.lang.Class> r6 = java.lang.Class.class
                boolean r6 = r5.represents(r6)
                if (r6 == 0) goto L22
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r1 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                net.bytebuddy.description.type.TypeDefinition r2 = r4.getOriginType()
                net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.of(r2)
                r1.<init>(r2)
                return r1
            L22:
                java.lang.Class<java.lang.reflect.Method> r4 = java.lang.reflect.Method.class
                boolean r4 = r5.represents(r4)
                if (r4 == 0) goto L43
                boolean r3 = r2.isMethod()
                if (r3 == 0) goto L40
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r3 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                net.bytebuddy.description.ByteCodeElement$TypeDependant r2 = r2.asDefined()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r2
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = methodConstant(r1, r2)
                r3.<init>(r1)
                goto L42
            L40:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal r3 = net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE
            L42:
                return r3
            L43:
                java.lang.Class<java.lang.reflect.Constructor> r4 = java.lang.reflect.Constructor.class
                boolean r4 = r5.represents(r4)
                if (r4 == 0) goto L64
                boolean r3 = r2.isConstructor()
                if (r3 == 0) goto L61
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r3 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                net.bytebuddy.description.ByteCodeElement$TypeDependant r2 = r2.asDefined()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r2
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = methodConstant(r1, r2)
                r3.<init>(r1)
                goto L63
            L61:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal r3 = net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE
            L63:
                return r3
            L64:
                net.bytebuddy.utility.JavaType r4 = net.bytebuddy.utility.JavaType.EXECUTABLE
                net.bytebuddy.description.type.TypeDescription r4 = r4.getTypeStub()
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L80
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r3 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                net.bytebuddy.description.ByteCodeElement$TypeDependant r2 = r2.asDefined()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r2
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = methodConstant(r1, r2)
                r3.<init>(r1)
                return r3
            L80:
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                boolean r1 = r5.represents(r1)
                if (r1 == 0) goto L97
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r1 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                net.bytebuddy.implementation.bytecode.constant.TextConstant r3 = new net.bytebuddy.implementation.bytecode.constant.TextConstant
                java.lang.String r2 = r2.toString()
                r3.<init>(r2)
                r1.<init>(r3)
                return r1
            L97:
                java.lang.Class r1 = java.lang.Integer.TYPE
                boolean r1 = r5.represents(r1)
                if (r1 == 0) goto Lad
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r1 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                int r2 = r2.getModifiers()
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.forValue(r2)
                r1.<init>(r2)
                return r1
            Lad:
                net.bytebuddy.utility.JavaType r1 = net.bytebuddy.utility.JavaType.METHOD_HANDLE
                net.bytebuddy.description.type.TypeDescription r1 = r1.getTypeStub()
                boolean r1 = r5.equals(r1)
                if (r1 == 0) goto Lcd
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r1 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                net.bytebuddy.description.ByteCodeElement$TypeDependant r2 = r2.asDefined()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r2
                net.bytebuddy.utility.JavaConstant$MethodHandle r2 = net.bytebuddy.utility.JavaConstant.MethodHandle.of(r2)
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = r2.toStackManipulation()
                r1.<init>(r2)
                return r1
            Lcd:
                net.bytebuddy.utility.JavaType r1 = net.bytebuddy.utility.JavaType.METHOD_TYPE
                net.bytebuddy.description.type.TypeDescription r1 = r1.getTypeStub()
                boolean r1 = r5.equals(r1)
                if (r1 == 0) goto Led
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r1 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                net.bytebuddy.description.ByteCodeElement$TypeDependant r2 = r2.asDefined()
                net.bytebuddy.description.method.MethodDescription r2 = (net.bytebuddy.description.method.MethodDescription) r2
                net.bytebuddy.utility.JavaConstant$MethodType r2 = net.bytebuddy.utility.JavaConstant.MethodType.of(r2)
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = r2.toStackManipulation()
                r1.<init>(r2)
                return r1
            Led:
                net.bytebuddy.utility.JavaType r1 = net.bytebuddy.utility.JavaType.METHOD_HANDLES_LOOKUP
                net.bytebuddy.description.type.TypeDescription r1 = r1.getTypeStub()
                boolean r1 = r5.equals(r1)
                if (r1 == 0) goto L103
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r1 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.lookup()
                r1.<init>(r2)
                return r1
            L103:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "The "
                r2.append(r4)
                r2.append(r3)
                java.lang.String r4 = " method's "
                r2.append(r4)
                int r3 = r3.getIndex()
                r2.append(r3)
                java.lang.String r3 = " parameter is annotated with a Origin annotation with an argument not representing a Class, Method, Constructor, String, int, MethodType or MethodHandle type"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public java.lang.Class<net.bytebuddy.implementation.bind.annotation.Origin> getHandledType() {
                r1 = this;
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.Origin> r0 = net.bytebuddy.implementation.bind.annotation.Origin.class
                return r0
        }
    }

    boolean cache() default true;

    boolean privileged() default false;
}
