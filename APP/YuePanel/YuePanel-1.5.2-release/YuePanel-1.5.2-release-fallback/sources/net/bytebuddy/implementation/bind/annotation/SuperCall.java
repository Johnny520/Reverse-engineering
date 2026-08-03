package net.bytebuddy.implementation.bind.annotation;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface SuperCall {

    public enum Binder extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.SuperCall.Binder> implements net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<net.bytebuddy.implementation.bind.annotation.SuperCall> {
        private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.SuperCall.Binder[] $VALUES = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape FALLBACK_TO_DEFAULT = null;
        public static final net.bytebuddy.implementation.bind.annotation.SuperCall.Binder INSTANCE = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape NULL_IF_IMPOSSIBLE = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape SERIALIZABLE_PROXY = null;

        static {
                net.bytebuddy.implementation.bind.annotation.SuperCall$Binder r0 = new net.bytebuddy.implementation.bind.annotation.SuperCall$Binder
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.bind.annotation.SuperCall.Binder.INSTANCE = r0
                net.bytebuddy.implementation.bind.annotation.SuperCall$Binder[] r0 = new net.bytebuddy.implementation.bind.annotation.SuperCall.Binder[]{r0}
                net.bytebuddy.implementation.bind.annotation.SuperCall.Binder.$VALUES = r0
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.SuperCall> r0 = net.bytebuddy.implementation.bind.annotation.SuperCall.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                java.lang.String r1 = "serializableProxy"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                java.lang.Object r1 = r1.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                net.bytebuddy.implementation.bind.annotation.SuperCall.Binder.SERIALIZABLE_PROXY = r1
                java.lang.String r1 = "fallbackToDefault"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                java.lang.Object r1 = r1.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                net.bytebuddy.implementation.bind.annotation.SuperCall.Binder.FALLBACK_TO_DEFAULT = r1
                java.lang.String r1 = "nullIfImpossible"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                net.bytebuddy.implementation.bind.annotation.SuperCall.Binder.NULL_IF_IMPOSSIBLE = r0
                return
        }

        Binder(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.bind.annotation.SuperCall.Binder valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.SuperCall$Binder> r0 = net.bytebuddy.implementation.bind.annotation.SuperCall.Binder.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bind.annotation.SuperCall$Binder r1 = (net.bytebuddy.implementation.bind.annotation.SuperCall.Binder) r1
                return r1
        }

        public static net.bytebuddy.implementation.bind.annotation.SuperCall.Binder[] values() {
                net.bytebuddy.implementation.bind.annotation.SuperCall$Binder[] r0 = net.bytebuddy.implementation.bind.annotation.SuperCall.Binder.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bind.annotation.SuperCall$Binder[] r0 = (net.bytebuddy.implementation.bind.annotation.SuperCall.Binder[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> bind(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.SuperCall> r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.description.method.ParameterDescription r3, net.bytebuddy.implementation.Implementation.Target r4, net.bytebuddy.implementation.bytecode.assign.Assigner r5, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r6) {
                r0 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r5 = r3.getType()
                net.bytebuddy.description.type.TypeDescription r5 = r5.asErasure()
                java.lang.Class<java.lang.Runnable> r6 = java.lang.Runnable.class
                boolean r6 = r5.represents(r6)
                if (r6 != 0) goto L38
                java.lang.Class<java.util.concurrent.Callable> r6 = java.util.concurrent.Callable.class
                boolean r6 = r5.represents(r6)
                if (r6 != 0) goto L38
                java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
                boolean r5 = r5.represents(r6)
                if (r5 == 0) goto L21
                goto L38
            L21:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "A super method call proxy can only be assigned to Runnable or Callable types: "
                r2.append(r4)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L38:
                boolean r3 = r2.isConstructor()
                java.lang.Class<java.lang.Boolean> r5 = java.lang.Boolean.class
                if (r3 == 0) goto L5d
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = net.bytebuddy.implementation.bind.annotation.SuperCall.Binder.NULL_IF_IMPOSSIBLE
                net.bytebuddy.description.annotation.AnnotationValue r1 = r1.getValue(r2)
                java.lang.Object r1 = r1.resolve(r5)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L5a
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r1 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                net.bytebuddy.implementation.bytecode.constant.NullConstant r2 = net.bytebuddy.implementation.bytecode.constant.NullConstant.INSTANCE
                r1.<init>(r2)
                goto L5c
            L5a:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal r1 = net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE
            L5c:
                return r1
            L5d:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = net.bytebuddy.implementation.bind.annotation.SuperCall.Binder.FALLBACK_TO_DEFAULT
                net.bytebuddy.description.annotation.AnnotationValue r3 = r1.getValue(r3)
                java.lang.Object r3 = r3.resolve(r5)
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                if (r3 == 0) goto L78
                net.bytebuddy.description.method.MethodDescription$SignatureToken r3 = r2.asSignatureToken()
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r3 = r4.invokeDominant(r3)
                goto L80
            L78:
                net.bytebuddy.description.method.MethodDescription$SignatureToken r3 = r2.asSignatureToken()
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r3 = r4.invokeSuper(r3)
            L80:
                net.bytebuddy.description.method.MethodDescription$TypeToken r2 = r2.asTypeToken()
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r2 = r3.withCheckedCompatibilityTo(r2)
                boolean r3 = r2.isValid()
                if (r3 == 0) goto La4
                net.bytebuddy.implementation.auxiliary.MethodCallProxy$AssignableSignatureCall r3 = new net.bytebuddy.implementation.auxiliary.MethodCallProxy$AssignableSignatureCall
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = net.bytebuddy.implementation.bind.annotation.SuperCall.Binder.SERIALIZABLE_PROXY
                net.bytebuddy.description.annotation.AnnotationValue r1 = r1.getValue(r4)
                java.lang.Object r1 = r1.resolve(r5)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                r3.<init>(r2, r1)
                goto Lb8
            La4:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = net.bytebuddy.implementation.bind.annotation.SuperCall.Binder.NULL_IF_IMPOSSIBLE
                net.bytebuddy.description.annotation.AnnotationValue r1 = r1.getValue(r2)
                java.lang.Object r1 = r1.resolve(r5)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto Lbe
                net.bytebuddy.implementation.bytecode.constant.NullConstant r3 = net.bytebuddy.implementation.bytecode.constant.NullConstant.INSTANCE
            Lb8:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r1 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                r1.<init>(r3)
                return r1
            Lbe:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal r1 = net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE
                return r1
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public java.lang.Class<net.bytebuddy.implementation.bind.annotation.SuperCall> getHandledType() {
                r1 = this;
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.SuperCall> r0 = net.bytebuddy.implementation.bind.annotation.SuperCall.class
                return r0
        }
    }

    boolean fallbackToDefault() default true;

    boolean nullIfImpossible() default false;

    boolean serializableProxy() default false;
}
