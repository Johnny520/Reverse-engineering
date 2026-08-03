package net.bytebuddy.implementation.bind.annotation;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Default {

    public enum Binder extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.Default.Binder> implements net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<net.bytebuddy.implementation.bind.annotation.Default> {
        private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.Default.Binder[] $VALUES = null;
        public static final net.bytebuddy.implementation.bind.annotation.Default.Binder INSTANCE = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape PROXY_TYPE = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape SERIALIZABLE_PROXY = null;

        public interface TypeLocator {

            public enum ForParameterType extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.Default.Binder.TypeLocator.ForParameterType> implements net.bytebuddy.implementation.bind.annotation.Default.Binder.TypeLocator {
                private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.Default.Binder.TypeLocator.ForParameterType[] $VALUES = null;
                public static final net.bytebuddy.implementation.bind.annotation.Default.Binder.TypeLocator.ForParameterType INSTANCE = null;

                static {
                        net.bytebuddy.implementation.bind.annotation.Default$Binder$TypeLocator$ForParameterType r0 = new net.bytebuddy.implementation.bind.annotation.Default$Binder$TypeLocator$ForParameterType
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.implementation.bind.annotation.Default.Binder.TypeLocator.ForParameterType.INSTANCE = r0
                        net.bytebuddy.implementation.bind.annotation.Default$Binder$TypeLocator$ForParameterType[] r0 = new net.bytebuddy.implementation.bind.annotation.Default.Binder.TypeLocator.ForParameterType[]{r0}
                        net.bytebuddy.implementation.bind.annotation.Default.Binder.TypeLocator.ForParameterType.$VALUES = r0
                        return
                }

                ForParameterType(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.implementation.bind.annotation.Default.Binder.TypeLocator.ForParameterType valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.bind.annotation.Default$Binder$TypeLocator$ForParameterType> r0 = net.bytebuddy.implementation.bind.annotation.Default.Binder.TypeLocator.ForParameterType.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.bind.annotation.Default$Binder$TypeLocator$ForParameterType r1 = (net.bytebuddy.implementation.bind.annotation.Default.Binder.TypeLocator.ForParameterType) r1
                        return r1
                }

                public static net.bytebuddy.implementation.bind.annotation.Default.Binder.TypeLocator.ForParameterType[] values() {
                        net.bytebuddy.implementation.bind.annotation.Default$Binder$TypeLocator$ForParameterType[] r0 = net.bytebuddy.implementation.bind.annotation.Default.Binder.TypeLocator.ForParameterType.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.bind.annotation.Default$Binder$TypeLocator$ForParameterType[] r0 = (net.bytebuddy.implementation.bind.annotation.Default.Binder.TypeLocator.ForParameterType[]) r0
                        return r0
                }

                @Override // net.bytebuddy.implementation.bind.annotation.Default.Binder.TypeLocator
                public net.bytebuddy.description.type.TypeDescription resolve(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                        return r1
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForType implements net.bytebuddy.implementation.bind.annotation.Default.Binder.TypeLocator {
                private final net.bytebuddy.description.type.TypeDescription typeDescription;

                public ForType(net.bytebuddy.description.type.TypeDescription r1) {
                        r0 = this;
                        r0.<init>()
                        r0.typeDescription = r1
                        return
                }

                public static net.bytebuddy.implementation.bind.annotation.Default.Binder.TypeLocator of(net.bytebuddy.description.type.TypeDescription r3) {
                        java.lang.Class r0 = java.lang.Void.TYPE
                        boolean r0 = r3.represents(r0)
                        if (r0 == 0) goto Lb
                        net.bytebuddy.implementation.bind.annotation.Default$Binder$TypeLocator$ForParameterType r3 = net.bytebuddy.implementation.bind.annotation.Default.Binder.TypeLocator.ForParameterType.INSTANCE
                        return r3
                    Lb:
                        boolean r0 = r3.isInterface()
                        if (r0 == 0) goto L17
                        net.bytebuddy.implementation.bind.annotation.Default$Binder$TypeLocator$ForType r0 = new net.bytebuddy.implementation.bind.annotation.Default$Binder$TypeLocator$ForType
                        r0.<init>(r3)
                        return r0
                    L17:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "Cannot assign proxy to "
                        r1.append(r2)
                        r1.append(r3)
                        java.lang.String r3 = r1.toString()
                        r0.<init>(r3)
                        throw r0
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
                        net.bytebuddy.implementation.bind.annotation.Default$Binder$TypeLocator$ForType r5 = (net.bytebuddy.implementation.bind.annotation.Default.Binder.TypeLocator.ForType) r5
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

                @Override // net.bytebuddy.implementation.bind.annotation.Default.Binder.TypeLocator
                public net.bytebuddy.description.type.TypeDescription resolve(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                        r3 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r3.typeDescription
                        net.bytebuddy.description.type.TypeDescription r1 = r4.asErasure()
                        boolean r0 = r0.isAssignableTo(r1)
                        if (r0 == 0) goto Lf
                        net.bytebuddy.description.type.TypeDescription r4 = r3.typeDescription
                        return r4
                    Lf:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "Impossible to assign "
                        r1.append(r2)
                        net.bytebuddy.description.type.TypeDescription r2 = r3.typeDescription
                        r1.append(r2)
                        java.lang.String r2 = " to parameter of type "
                        r1.append(r2)
                        r1.append(r4)
                        java.lang.String r4 = r1.toString()
                        r0.<init>(r4)
                        throw r0
                }
            }

            net.bytebuddy.description.type.TypeDescription resolve(net.bytebuddy.description.type.TypeDescription.Generic r1);
        }

        static {
                net.bytebuddy.implementation.bind.annotation.Default$Binder r0 = new net.bytebuddy.implementation.bind.annotation.Default$Binder
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.bind.annotation.Default.Binder.INSTANCE = r0
                net.bytebuddy.implementation.bind.annotation.Default$Binder[] r0 = new net.bytebuddy.implementation.bind.annotation.Default.Binder[]{r0}
                net.bytebuddy.implementation.bind.annotation.Default.Binder.$VALUES = r0
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.Default> r0 = net.bytebuddy.implementation.bind.annotation.Default.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                java.lang.String r1 = "serializableProxy"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                java.lang.Object r1 = r1.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                net.bytebuddy.implementation.bind.annotation.Default.Binder.SERIALIZABLE_PROXY = r1
                java.lang.String r1 = "proxyType"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                net.bytebuddy.implementation.bind.annotation.Default.Binder.PROXY_TYPE = r0
                return
        }

        Binder(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.bind.annotation.Default.Binder valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.Default$Binder> r0 = net.bytebuddy.implementation.bind.annotation.Default.Binder.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bind.annotation.Default$Binder r1 = (net.bytebuddy.implementation.bind.annotation.Default.Binder) r1
                return r1
        }

        public static net.bytebuddy.implementation.bind.annotation.Default.Binder[] values() {
                net.bytebuddy.implementation.bind.annotation.Default$Binder[] r0 = net.bytebuddy.implementation.bind.annotation.Default.Binder.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bind.annotation.Default$Binder[] r0 = (net.bytebuddy.implementation.bind.annotation.Default.Binder[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> bind(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.Default> r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.description.method.ParameterDescription r3, net.bytebuddy.implementation.Implementation.Target r4, net.bytebuddy.implementation.bytecode.assign.Assigner r5, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r6) {
                r0 = this;
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r5 = net.bytebuddy.implementation.bind.annotation.Default.Binder.PROXY_TYPE
                net.bytebuddy.description.annotation.AnnotationValue r5 = r1.getValue(r5)
                java.lang.Class<net.bytebuddy.description.type.TypeDescription> r6 = net.bytebuddy.description.type.TypeDescription.class
                java.lang.Object r5 = r5.resolve(r6)
                net.bytebuddy.description.type.TypeDescription r5 = (net.bytebuddy.description.type.TypeDescription) r5
                net.bytebuddy.implementation.bind.annotation.Default$Binder$TypeLocator r5 = net.bytebuddy.implementation.bind.annotation.Default.Binder.TypeLocator.ForType.of(r5)
                net.bytebuddy.description.type.TypeDescription$Generic r6 = r3.getType()
                net.bytebuddy.description.type.TypeDescription r5 = r5.resolve(r6)
                boolean r6 = r5.isInterface()
                if (r6 == 0) goto L59
                boolean r2 = r2.isStatic()
                if (r2 != 0) goto L56
                net.bytebuddy.description.type.TypeDescription r2 = r4.getInstrumentedType()
                net.bytebuddy.description.type.TypeList$Generic r2 = r2.getInterfaces()
                net.bytebuddy.description.type.TypeList r2 = r2.asErasures()
                boolean r2 = r2.contains(r5)
                if (r2 != 0) goto L39
                goto L56
            L39:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r2 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                net.bytebuddy.implementation.auxiliary.TypeProxy$ForDefaultMethod r3 = new net.bytebuddy.implementation.auxiliary.TypeProxy$ForDefaultMethod
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r6 = net.bytebuddy.implementation.bind.annotation.Default.Binder.SERIALIZABLE_PROXY
                net.bytebuddy.description.annotation.AnnotationValue r1 = r1.getValue(r6)
                java.lang.Class<java.lang.Boolean> r6 = java.lang.Boolean.class
                java.lang.Object r1 = r1.resolve(r6)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                r3.<init>(r5, r4, r1)
                r2.<init>(r3)
                return r2
            L56:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal r1 = net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE
                return r1
            L59:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r3)
                java.lang.String r3 = " uses the @Default annotation on an invalid type"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public java.lang.Class<net.bytebuddy.implementation.bind.annotation.Default> getHandledType() {
                r1 = this;
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.Default> r0 = net.bytebuddy.implementation.bind.annotation.Default.class
                return r0
        }
    }

    java.lang.Class<?> proxyType() default void.class;

    boolean serializableProxy() default false;
}
