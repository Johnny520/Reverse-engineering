package net.bytebuddy.implementation.bind.annotation;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface Super {

    /* JADX INFO: renamed from: net.bytebuddy.implementation.bind.annotation.Super$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public enum Binder extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.Super.Binder> implements net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<net.bytebuddy.implementation.bind.annotation.Super> {
        private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.Super.Binder[] $VALUES = null;
        public static final net.bytebuddy.implementation.bind.annotation.Super.Binder INSTANCE = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape PROXY_TYPE = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape STRATEGY = null;

        public interface TypeLocator {

            public enum ForInstrumentedType extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator.ForInstrumentedType> implements net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator {
                private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator.ForInstrumentedType[] $VALUES = null;
                public static final net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator.ForInstrumentedType INSTANCE = null;

                static {
                        net.bytebuddy.implementation.bind.annotation.Super$Binder$TypeLocator$ForInstrumentedType r0 = new net.bytebuddy.implementation.bind.annotation.Super$Binder$TypeLocator$ForInstrumentedType
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator.ForInstrumentedType.INSTANCE = r0
                        net.bytebuddy.implementation.bind.annotation.Super$Binder$TypeLocator$ForInstrumentedType[] r0 = new net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator.ForInstrumentedType[]{r0}
                        net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator.ForInstrumentedType.$VALUES = r0
                        return
                }

                ForInstrumentedType(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator.ForInstrumentedType valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.bind.annotation.Super$Binder$TypeLocator$ForInstrumentedType> r0 = net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator.ForInstrumentedType.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.bind.annotation.Super$Binder$TypeLocator$ForInstrumentedType r1 = (net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator.ForInstrumentedType) r1
                        return r1
                }

                public static net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator.ForInstrumentedType[] values() {
                        net.bytebuddy.implementation.bind.annotation.Super$Binder$TypeLocator$ForInstrumentedType[] r0 = net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator.ForInstrumentedType.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.bind.annotation.Super$Binder$TypeLocator$ForInstrumentedType[] r0 = (net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator.ForInstrumentedType[]) r0
                        return r0
                }

                @Override // net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator
                public net.bytebuddy.description.type.TypeDescription resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.type.TypeDescription.Generic r2) {
                        r0 = this;
                        return r1
                }
            }

            public enum ForParameterType extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator.ForParameterType> implements net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator {
                private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator.ForParameterType[] $VALUES = null;
                public static final net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator.ForParameterType INSTANCE = null;

                static {
                        net.bytebuddy.implementation.bind.annotation.Super$Binder$TypeLocator$ForParameterType r0 = new net.bytebuddy.implementation.bind.annotation.Super$Binder$TypeLocator$ForParameterType
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator.ForParameterType.INSTANCE = r0
                        net.bytebuddy.implementation.bind.annotation.Super$Binder$TypeLocator$ForParameterType[] r0 = new net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator.ForParameterType[]{r0}
                        net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator.ForParameterType.$VALUES = r0
                        return
                }

                ForParameterType(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator.ForParameterType valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.bind.annotation.Super$Binder$TypeLocator$ForParameterType> r0 = net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator.ForParameterType.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.bind.annotation.Super$Binder$TypeLocator$ForParameterType r1 = (net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator.ForParameterType) r1
                        return r1
                }

                public static net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator.ForParameterType[] values() {
                        net.bytebuddy.implementation.bind.annotation.Super$Binder$TypeLocator$ForParameterType[] r0 = net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator.ForParameterType.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.bind.annotation.Super$Binder$TypeLocator$ForParameterType[] r0 = (net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator.ForParameterType[]) r0
                        return r0
                }

                @Override // net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator
                public net.bytebuddy.description.type.TypeDescription resolve(net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.description.type.TypeDescription.Generic r3) {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r3 = r3.asErasure()
                        boolean r0 = r3.equals(r2)
                        if (r0 == 0) goto Lb
                        goto Lc
                    Lb:
                        r2 = r3
                    Lc:
                        return r2
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForType implements net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator {
                private final net.bytebuddy.description.type.TypeDescription typeDescription;

                public ForType(net.bytebuddy.description.type.TypeDescription r1) {
                        r0 = this;
                        r0.<init>()
                        r0.typeDescription = r1
                        return
                }

                public static net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator of(net.bytebuddy.description.type.TypeDescription r3) {
                        java.lang.Class r0 = java.lang.Void.TYPE
                        boolean r0 = r3.represents(r0)
                        if (r0 == 0) goto Lb
                        net.bytebuddy.implementation.bind.annotation.Super$Binder$TypeLocator$ForParameterType r3 = net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator.ForParameterType.INSTANCE
                        return r3
                    Lb:
                        java.lang.Class<net.bytebuddy.dynamic.TargetType> r0 = net.bytebuddy.dynamic.TargetType.class
                        boolean r0 = r3.represents(r0)
                        if (r0 == 0) goto L16
                        net.bytebuddy.implementation.bind.annotation.Super$Binder$TypeLocator$ForInstrumentedType r3 = net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator.ForInstrumentedType.INSTANCE
                        return r3
                    L16:
                        boolean r0 = r3.isPrimitive()
                        if (r0 != 0) goto L28
                        boolean r0 = r3.isArray()
                        if (r0 != 0) goto L28
                        net.bytebuddy.implementation.bind.annotation.Super$Binder$TypeLocator$ForType r0 = new net.bytebuddy.implementation.bind.annotation.Super$Binder$TypeLocator$ForType
                        r0.<init>(r3)
                        return r0
                    L28:
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
                        net.bytebuddy.implementation.bind.annotation.Super$Binder$TypeLocator$ForType r5 = (net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator.ForType) r5
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

                @Override // net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator
                public net.bytebuddy.description.type.TypeDescription resolve(net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.type.TypeDescription.Generic r4) {
                        r2 = this;
                        net.bytebuddy.description.type.TypeDescription r3 = r2.typeDescription
                        net.bytebuddy.description.type.TypeDescription r0 = r4.asErasure()
                        boolean r3 = r3.isAssignableTo(r0)
                        if (r3 == 0) goto Lf
                        net.bytebuddy.description.type.TypeDescription r3 = r2.typeDescription
                        return r3
                    Lf:
                        java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "Impossible to assign "
                        r0.append(r1)
                        net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                        r0.append(r1)
                        java.lang.String r1 = " to parameter of type "
                        r0.append(r1)
                        r0.append(r4)
                        java.lang.String r4 = r0.toString()
                        r3.<init>(r4)
                        throw r3
                }
            }

            net.bytebuddy.description.type.TypeDescription resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.type.TypeDescription.Generic r2);
        }

        static {
                net.bytebuddy.implementation.bind.annotation.Super$Binder r0 = new net.bytebuddy.implementation.bind.annotation.Super$Binder
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.bind.annotation.Super.Binder.INSTANCE = r0
                net.bytebuddy.implementation.bind.annotation.Super$Binder[] r0 = new net.bytebuddy.implementation.bind.annotation.Super.Binder[]{r0}
                net.bytebuddy.implementation.bind.annotation.Super.Binder.$VALUES = r0
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.Super> r0 = net.bytebuddy.implementation.bind.annotation.Super.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                java.lang.String r1 = "strategy"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                java.lang.Object r1 = r1.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                net.bytebuddy.implementation.bind.annotation.Super.Binder.STRATEGY = r1
                java.lang.String r1 = "proxyType"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                net.bytebuddy.implementation.bind.annotation.Super.Binder.PROXY_TYPE = r0
                return
        }

        Binder(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.bind.annotation.Super.Binder valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.Super$Binder> r0 = net.bytebuddy.implementation.bind.annotation.Super.Binder.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bind.annotation.Super$Binder r1 = (net.bytebuddy.implementation.bind.annotation.Super.Binder) r1
                return r1
        }

        public static net.bytebuddy.implementation.bind.annotation.Super.Binder[] values() {
                net.bytebuddy.implementation.bind.annotation.Super$Binder[] r0 = net.bytebuddy.implementation.bind.annotation.Super.Binder.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bind.annotation.Super$Binder[] r0 = (net.bytebuddy.implementation.bind.annotation.Super.Binder[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> bind(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.Super> r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.description.method.ParameterDescription r3, net.bytebuddy.implementation.Implementation.Target r4, net.bytebuddy.implementation.bytecode.assign.Assigner r5, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r6) {
                r0 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r5 = r3.getType()
                boolean r5 = r5.isPrimitive()
                if (r5 != 0) goto L83
                net.bytebuddy.description.type.TypeDescription$Generic r5 = r3.getType()
                boolean r5 = r5.isArray()
                if (r5 != 0) goto L83
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r5 = net.bytebuddy.implementation.bind.annotation.Super.Binder.PROXY_TYPE
                net.bytebuddy.description.annotation.AnnotationValue r5 = r1.getValue(r5)
                java.lang.Class<net.bytebuddy.description.type.TypeDescription> r6 = net.bytebuddy.description.type.TypeDescription.class
                java.lang.Object r5 = r5.resolve(r6)
                net.bytebuddy.description.type.TypeDescription r5 = (net.bytebuddy.description.type.TypeDescription) r5
                net.bytebuddy.implementation.bind.annotation.Super$Binder$TypeLocator r5 = net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator.ForType.of(r5)
                net.bytebuddy.description.type.TypeDescription r6 = r4.getInstrumentedType()
                net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getType()
                net.bytebuddy.description.type.TypeDescription r3 = r5.resolve(r6, r3)
                boolean r5 = r3.isFinal()
                if (r5 != 0) goto L6c
                boolean r2 = r2.isStatic()
                if (r2 != 0) goto L69
                net.bytebuddy.description.type.TypeDescription r2 = r4.getInstrumentedType()
                boolean r2 = r2.isAssignableTo(r3)
                if (r2 != 0) goto L49
                goto L69
            L49:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r2 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r5 = net.bytebuddy.implementation.bind.annotation.Super.Binder.STRATEGY
                net.bytebuddy.description.annotation.AnnotationValue r5 = r1.getValue(r5)
                java.lang.Class<net.bytebuddy.description.enumeration.EnumerationDescription> r6 = net.bytebuddy.description.enumeration.EnumerationDescription.class
                java.lang.Object r5 = r5.resolve(r6)
                net.bytebuddy.description.enumeration.EnumerationDescription r5 = (net.bytebuddy.description.enumeration.EnumerationDescription) r5
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.Super$Instantiation> r6 = net.bytebuddy.implementation.bind.annotation.Super.Instantiation.class
                java.lang.Enum r5 = r5.load(r6)
                net.bytebuddy.implementation.bind.annotation.Super$Instantiation r5 = (net.bytebuddy.implementation.bind.annotation.Super.Instantiation) r5
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = r5.proxyFor(r3, r4, r1)
                r2.<init>(r1)
                return r2
            L69:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal r1 = net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE
                return r1
            L6c:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "Cannot extend final type as @Super proxy: "
                r2.append(r4)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L83:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r3)
                java.lang.String r3 = " uses the @Super annotation on an invalid type"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public java.lang.Class<net.bytebuddy.implementation.bind.annotation.Super> getHandledType() {
                r1 = this;
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.Super> r0 = net.bytebuddy.implementation.bind.annotation.Super.class
                return r0
        }
    }

    public enum Instantiation extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.Super.Instantiation> {
        private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.Super.Instantiation[] $VALUES = null;
        public static final net.bytebuddy.implementation.bind.annotation.Super.Instantiation CONSTRUCTOR = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape CONSTRUCTOR_PARAMETERS = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape IGNORE_FINALIZER = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape SERIALIZABLE_PROXY = null;
        public static final net.bytebuddy.implementation.bind.annotation.Super.Instantiation UNSAFE = null;



        static {
                net.bytebuddy.implementation.bind.annotation.Super$Instantiation$1 r0 = new net.bytebuddy.implementation.bind.annotation.Super$Instantiation$1
                java.lang.String r1 = "CONSTRUCTOR"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.bind.annotation.Super.Instantiation.CONSTRUCTOR = r0
                net.bytebuddy.implementation.bind.annotation.Super$Instantiation$2 r1 = new net.bytebuddy.implementation.bind.annotation.Super$Instantiation$2
                java.lang.String r3 = "UNSAFE"
                r4 = 1
                r1.<init>(r3, r4)
                net.bytebuddy.implementation.bind.annotation.Super.Instantiation.UNSAFE = r1
                r3 = 2
                net.bytebuddy.implementation.bind.annotation.Super$Instantiation[] r3 = new net.bytebuddy.implementation.bind.annotation.Super.Instantiation[r3]
                r3[r2] = r0
                r3[r4] = r1
                net.bytebuddy.implementation.bind.annotation.Super.Instantiation.$VALUES = r3
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.Super> r0 = net.bytebuddy.implementation.bind.annotation.Super.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                java.lang.String r1 = "ignoreFinalizer"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                java.lang.Object r1 = r1.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                net.bytebuddy.implementation.bind.annotation.Super.Instantiation.IGNORE_FINALIZER = r1
                java.lang.String r1 = "serializableProxy"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                java.lang.Object r1 = r1.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                net.bytebuddy.implementation.bind.annotation.Super.Instantiation.SERIALIZABLE_PROXY = r1
                java.lang.String r1 = "constructorParameters"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                net.bytebuddy.implementation.bind.annotation.Super.Instantiation.CONSTRUCTOR_PARAMETERS = r0
                return
        }

        Instantiation(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ Instantiation(java.lang.String r1, int r2, net.bytebuddy.implementation.bind.annotation.Super.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static /* synthetic */ net.bytebuddy.description.method.MethodDescription.InDefinedShape access$100() {
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.bind.annotation.Super.Instantiation.CONSTRUCTOR_PARAMETERS
                return r0
        }

        public static /* synthetic */ net.bytebuddy.description.method.MethodDescription.InDefinedShape access$200() {
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.bind.annotation.Super.Instantiation.IGNORE_FINALIZER
                return r0
        }

        public static /* synthetic */ net.bytebuddy.description.method.MethodDescription.InDefinedShape access$300() {
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.bind.annotation.Super.Instantiation.SERIALIZABLE_PROXY
                return r0
        }

        public static net.bytebuddy.implementation.bind.annotation.Super.Instantiation valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.Super$Instantiation> r0 = net.bytebuddy.implementation.bind.annotation.Super.Instantiation.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bind.annotation.Super$Instantiation r1 = (net.bytebuddy.implementation.bind.annotation.Super.Instantiation) r1
                return r1
        }

        public static net.bytebuddy.implementation.bind.annotation.Super.Instantiation[] values() {
                net.bytebuddy.implementation.bind.annotation.Super$Instantiation[] r0 = net.bytebuddy.implementation.bind.annotation.Super.Instantiation.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bind.annotation.Super$Instantiation[] r0 = (net.bytebuddy.implementation.bind.annotation.Super.Instantiation[]) r0
                return r0
        }

        public abstract net.bytebuddy.implementation.bytecode.StackManipulation proxyFor(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.implementation.Implementation.Target r2, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.Super> r3);
    }

    java.lang.Class<?>[] constructorParameters() default {};

    boolean ignoreFinalizer() default true;

    java.lang.Class<?> proxyType() default void.class;

    boolean serializableProxy() default false;

    net.bytebuddy.implementation.bind.annotation.Super.Instantiation strategy() default net.bytebuddy.implementation.bind.annotation.Super.Instantiation.CONSTRUCTOR;
}
