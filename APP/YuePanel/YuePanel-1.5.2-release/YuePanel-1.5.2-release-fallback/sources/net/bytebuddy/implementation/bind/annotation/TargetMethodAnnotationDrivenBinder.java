package net.bytebuddy.implementation.bind.annotation;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class TargetMethodAnnotationDrivenBinder implements net.bytebuddy.implementation.bind.MethodDelegationBinder {
    private final net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.DelegationProcessor delegationProcessor;

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class DelegationProcessor {
        private final java.util.Map<? extends net.bytebuddy.description.type.TypeDescription, ? extends net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<?>> parameterBinders;

        public interface Handler {

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Bound<T extends java.lang.annotation.Annotation> implements net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.DelegationProcessor.Handler {
                private final net.bytebuddy.description.annotation.AnnotationDescription.Loadable<T> annotation;
                private final net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<T> parameterBinder;
                private final net.bytebuddy.description.method.ParameterDescription target;
                private final net.bytebuddy.implementation.bytecode.assign.Assigner.Typing typing;

                public Bound(net.bytebuddy.description.method.ParameterDescription r1, net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<T> r2, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<T> r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4) {
                        r0 = this;
                        r0.<init>()
                        r0.target = r1
                        r0.parameterBinder = r2
                        r0.annotation = r3
                        r0.typing = r4
                        return
                }

                public static net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.DelegationProcessor.Handler of(net.bytebuddy.description.method.ParameterDescription r2, net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<?> r3, net.bytebuddy.description.annotation.AnnotationDescription r4, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r5) {
                        net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$DelegationProcessor$Handler$Bound r0 = new net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$DelegationProcessor$Handler$Bound
                        java.lang.Class r1 = r3.getHandledType()
                        net.bytebuddy.description.annotation.AnnotationDescription$Loadable r4 = r4.prepare(r1)
                        r0.<init>(r2, r3, r4, r5)
                        return r0
                }

                @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.DelegationProcessor.Handler
                public net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> bind(net.bytebuddy.description.method.MethodDescription r8, net.bytebuddy.implementation.Implementation.Target r9, net.bytebuddy.implementation.bytecode.assign.Assigner r10) {
                        r7 = this;
                        net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<T extends java.lang.annotation.Annotation> r0 = r7.parameterBinder
                        net.bytebuddy.description.annotation.AnnotationDescription$Loadable<T extends java.lang.annotation.Annotation> r1 = r7.annotation
                        net.bytebuddy.description.method.ParameterDescription r3 = r7.target
                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r6 = r7.typing
                        r2 = r8
                        r4 = r9
                        r5 = r10
                        net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding r8 = r0.bind(r1, r2, r3, r4, r5, r6)
                        return r8
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
                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r2 = r4.typing
                        net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$DelegationProcessor$Handler$Bound r5 = (net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.DelegationProcessor.Handler.Bound) r5
                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r5.typing
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        net.bytebuddy.description.method.ParameterDescription r2 = r4.target
                        net.bytebuddy.description.method.ParameterDescription r3 = r5.target
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L2b
                        return r1
                    L2b:
                        net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<T extends java.lang.annotation.Annotation> r2 = r4.parameterBinder
                        net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<T extends java.lang.annotation.Annotation> r3 = r5.parameterBinder
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L36
                        return r1
                    L36:
                        net.bytebuddy.description.annotation.AnnotationDescription$Loadable<T extends java.lang.annotation.Annotation> r2 = r4.annotation
                        net.bytebuddy.description.annotation.AnnotationDescription$Loadable<T extends java.lang.annotation.Annotation> r5 = r5.annotation
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L41
                        return r1
                    L41:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.description.method.ParameterDescription r1 = r2.target
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<T extends java.lang.annotation.Annotation> r1 = r2.parameterBinder
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.description.annotation.AnnotationDescription$Loadable<T extends java.lang.annotation.Annotation> r1 = r2.annotation
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = r2.typing
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.DelegationProcessor.Handler
                public boolean isBound() {
                        r1 = this;
                        r0 = 1
                        return r0
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Unbound implements net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.DelegationProcessor.Handler {
                private final net.bytebuddy.description.method.ParameterDescription target;
                private final net.bytebuddy.implementation.bytecode.assign.Assigner.Typing typing;

                public static class DefaultArgument implements net.bytebuddy.implementation.bind.annotation.Argument {
                    private static final java.lang.String BINDING_MECHANIC = "bindingMechanic";
                    private static final java.lang.String VALUE = "value";
                    private final int parameterIndex;

                    public DefaultArgument(int r1) {
                            r0 = this;
                            r0.<init>()
                            r0.parameterIndex = r1
                            return
                    }

                    @Override // java.lang.annotation.Annotation
                    public java.lang.Class<net.bytebuddy.implementation.bind.annotation.Argument> annotationType() {
                            r1 = this;
                            java.lang.Class<net.bytebuddy.implementation.bind.annotation.Argument> r0 = net.bytebuddy.implementation.bind.annotation.Argument.class
                            return r0
                    }

                    @Override // net.bytebuddy.implementation.bind.annotation.Argument
                    public net.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic bindingMechanic() {
                            r1 = this;
                            net.bytebuddy.implementation.bind.annotation.Argument$BindingMechanic r0 = net.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic.UNIQUE
                            return r0
                    }

                    @Override // java.lang.annotation.Annotation
                    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r2) {
                            r1 = this;
                            if (r1 == r2) goto L13
                            boolean r0 = r2 instanceof net.bytebuddy.implementation.bind.annotation.Argument
                            if (r0 == 0) goto L11
                            int r0 = r1.parameterIndex
                            net.bytebuddy.implementation.bind.annotation.Argument r2 = (net.bytebuddy.implementation.bind.annotation.Argument) r2
                            int r2 = r2.value()
                            if (r0 != r2) goto L11
                            goto L13
                        L11:
                            r2 = 0
                            goto L14
                        L13:
                            r2 = 1
                        L14:
                            return r2
                    }

                    @Override // java.lang.annotation.Annotation
                    public int hashCode() {
                            r3 = this;
                            net.bytebuddy.implementation.bind.annotation.Argument$BindingMechanic r0 = net.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic.UNIQUE
                            int r0 = r0.hashCode()
                            r1 = 1957906263(0x74b34757, float:1.1363136E32)
                            r0 = r0 ^ r1
                            r1 = 1335633679(0x4f9c270f, float:5.239611E9)
                            int r2 = r3.parameterIndex
                            r1 = r1 ^ r2
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // java.lang.annotation.Annotation
                    public java.lang.String toString() {
                            r2 = this;
                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                            r0.<init>()
                            java.lang.String r1 = "@"
                            r0.append(r1)
                            java.lang.Class<net.bytebuddy.implementation.bind.annotation.Argument> r1 = net.bytebuddy.implementation.bind.annotation.Argument.class
                            java.lang.String r1 = r1.getName()
                            r0.append(r1)
                            java.lang.String r1 = "(bindingMechanic="
                            r0.append(r1)
                            net.bytebuddy.implementation.bind.annotation.Argument$BindingMechanic r1 = net.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic.UNIQUE
                            r0.append(r1)
                            java.lang.String r1 = ", value="
                            r0.append(r1)
                            int r1 = r2.parameterIndex
                            r0.append(r1)
                            java.lang.String r1 = ")"
                            r0.append(r1)
                            java.lang.String r0 = r0.toString()
                            return r0
                    }

                    @Override // net.bytebuddy.implementation.bind.annotation.Argument
                    public int value() {
                            r1 = this;
                            int r0 = r1.parameterIndex
                            return r0
                    }
                }

                public Unbound(net.bytebuddy.description.method.ParameterDescription r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2) {
                        r0 = this;
                        r0.<init>()
                        r0.target = r1
                        r0.typing = r2
                        return
                }

                @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.DelegationProcessor.Handler
                public net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> bind(net.bytebuddy.description.method.MethodDescription r8, net.bytebuddy.implementation.Implementation.Target r9, net.bytebuddy.implementation.bytecode.assign.Assigner r10) {
                        r7 = this;
                        net.bytebuddy.implementation.bind.annotation.Argument$Binder r0 = net.bytebuddy.implementation.bind.annotation.Argument.Binder.INSTANCE
                        net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$DelegationProcessor$Handler$Unbound$DefaultArgument r1 = new net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$DelegationProcessor$Handler$Unbound$DefaultArgument
                        net.bytebuddy.description.method.ParameterDescription r2 = r7.target
                        int r2 = r2.getIndex()
                        r1.<init>(r2)
                        net.bytebuddy.description.annotation.AnnotationDescription$Loadable r1 = net.bytebuddy.description.annotation.AnnotationDescription.ForLoadedAnnotation.of(r1)
                        net.bytebuddy.description.method.ParameterDescription r3 = r7.target
                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r6 = r7.typing
                        r2 = r8
                        r4 = r9
                        r5 = r10
                        net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding r8 = r0.bind(r1, r2, r3, r4, r5, r6)
                        return r8
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
                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r2 = r4.typing
                        net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$DelegationProcessor$Handler$Unbound r5 = (net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.DelegationProcessor.Handler.Unbound) r5
                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r5.typing
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        net.bytebuddy.description.method.ParameterDescription r2 = r4.target
                        net.bytebuddy.description.method.ParameterDescription r5 = r5.target
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L2b
                        return r1
                    L2b:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.description.method.ParameterDescription r1 = r2.target
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = r2.typing
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.DelegationProcessor.Handler
                public boolean isBound() {
                        r1 = this;
                        r0 = 0
                        return r0
                }
            }

            net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> bind(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.implementation.Implementation.Target r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3);

            boolean isBound();
        }

        public DelegationProcessor(java.util.Map<? extends net.bytebuddy.description.type.TypeDescription, ? extends net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<?>> r1) {
                r0 = this;
                r0.<init>()
                r0.parameterBinders = r1
                return
        }

        public static net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.DelegationProcessor of(java.util.List<? extends net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<?>> r3) {
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.util.Iterator r3 = r3.iterator()
            L9:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L3f
                java.lang.Object r1 = r3.next()
                net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder r1 = (net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder) r1
                java.lang.Class r2 = r1.getHandledType()
                net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r2)
                java.lang.Object r2 = r0.put(r2, r1)
                if (r2 != 0) goto L24
                goto L9
            L24:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Attempt to bind two handlers to "
                r0.append(r2)
                java.lang.Class r1 = r1.getHandledType()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
            L3f:
                net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$DelegationProcessor r3 = new net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$DelegationProcessor
                r3.<init>(r0)
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
                java.util.Map<? extends net.bytebuddy.description.type.TypeDescription, ? extends net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r2 = r4.parameterBinders
                net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$DelegationProcessor r5 = (net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.DelegationProcessor) r5
                java.util.Map<? extends net.bytebuddy.description.type.TypeDescription, ? extends net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r5 = r5.parameterBinders
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
                java.util.Map<? extends net.bytebuddy.description.type.TypeDescription, ? extends net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r1 = r2.parameterBinders
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        public net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.DelegationProcessor.Handler prepare(net.bytebuddy.description.method.ParameterDescription r7) {
                r6 = this;
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r0 = net.bytebuddy.implementation.bind.annotation.RuntimeType.Verifier.check(r7)
                net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$DelegationProcessor$Handler$Unbound r1 = new net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$DelegationProcessor$Handler$Unbound
                r1.<init>(r7, r0)
                net.bytebuddy.description.annotation.AnnotationList r2 = r7.getDeclaredAnnotations()
                java.util.Iterator r2 = r2.iterator()
            L11:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L41
                java.lang.Object r3 = r2.next()
                net.bytebuddy.description.annotation.AnnotationDescription r3 = (net.bytebuddy.description.annotation.AnnotationDescription) r3
                java.util.Map<? extends net.bytebuddy.description.type.TypeDescription, ? extends net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder<?>> r4 = r6.parameterBinders
                net.bytebuddy.description.type.TypeDescription r5 = r3.getAnnotationType()
                java.lang.Object r4 = r4.get(r5)
                net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder r4 = (net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder) r4
                if (r4 == 0) goto L3a
                boolean r5 = r1.isBound()
                if (r5 != 0) goto L32
                goto L3a
            L32:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "Ambiguous binding for parameter annotated with two handled annotation types"
                r7.<init>(r0)
                throw r7
            L3a:
                if (r4 == 0) goto L11
                net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$DelegationProcessor$Handler r1 = net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.DelegationProcessor.Handler.Bound.of(r7, r4, r3, r0)
                goto L11
            L41:
                return r1
        }
    }

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Safe initialization is implied.", value = {"IC_SUPERCLASS_USES_SUBCLASS_DURING_INITIALIZATION"})
    public interface ParameterBinder<T extends java.lang.annotation.Annotation> {
        public static final java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<?>> DEFAULTS = null;

        public static abstract class ForFieldBinding<S extends java.lang.annotation.Annotation> implements net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<S> {
            protected static final java.lang.String BEAN_PROPERTY = "";

            public ForFieldBinding() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
            public net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> bind(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<S> r9, net.bytebuddy.description.method.MethodDescription r10, net.bytebuddy.description.method.ParameterDescription r11, net.bytebuddy.implementation.Implementation.Target r12, net.bytebuddy.implementation.bytecode.assign.Assigner r13, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r14) {
                    r8 = this;
                    net.bytebuddy.description.type.TypeDescription r14 = r8.declaringType(r9)
                    java.lang.Class r0 = java.lang.Void.TYPE
                    boolean r14 = r14.represents(r0)
                    if (r14 != 0) goto L48
                    net.bytebuddy.description.type.TypeDescription r14 = r8.declaringType(r9)
                    boolean r14 = r14.isPrimitive()
                    if (r14 != 0) goto L31
                    net.bytebuddy.description.type.TypeDescription r14 = r8.declaringType(r9)
                    boolean r14 = r14.isArray()
                    if (r14 != 0) goto L31
                    net.bytebuddy.description.type.TypeDescription r14 = r12.getInstrumentedType()
                    net.bytebuddy.description.type.TypeDescription r1 = r8.declaringType(r9)
                    boolean r14 = r14.isAssignableTo(r1)
                    if (r14 != 0) goto L48
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal r9 = net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE
                    return r9
                L31:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r11 = new java.lang.StringBuilder
                    r11.<init>()
                    java.lang.String r12 = "A primitive type or array type cannot declare a field: "
                    r11.append(r12)
                    r11.append(r10)
                    java.lang.String r10 = r11.toString()
                    r9.<init>(r10)
                    throw r9
                L48:
                    net.bytebuddy.description.type.TypeDescription r14 = r8.declaringType(r9)
                    boolean r14 = r14.represents(r0)
                    if (r14 == 0) goto L5c
                    net.bytebuddy.dynamic.scaffold.FieldLocator$ForClassHierarchy r14 = new net.bytebuddy.dynamic.scaffold.FieldLocator$ForClassHierarchy
                    net.bytebuddy.description.type.TypeDescription r0 = r12.getInstrumentedType()
                    r14.<init>(r0)
                    goto L69
                L5c:
                    net.bytebuddy.dynamic.scaffold.FieldLocator$ForExactType r14 = new net.bytebuddy.dynamic.scaffold.FieldLocator$ForExactType
                    net.bytebuddy.description.type.TypeDescription r0 = r8.declaringType(r9)
                    net.bytebuddy.description.type.TypeDescription r1 = r12.getInstrumentedType()
                    r14.<init>(r0, r1)
                L69:
                    java.lang.String r0 = r8.fieldName(r9)
                    java.lang.String r1 = ""
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L7a
                    net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution r14 = net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution.Simple.ofBeanAccessor(r14, r10)
                    goto L82
                L7a:
                    java.lang.String r0 = r8.fieldName(r9)
                    net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution r14 = r14.locate(r0)
                L82:
                    boolean r0 = r14.isResolved()
                    if (r0 == 0) goto La7
                    boolean r0 = r10.isStatic()
                    if (r0 == 0) goto L98
                    net.bytebuddy.description.field.FieldDescription r0 = r14.getField()
                    boolean r0 = r0.isStatic()
                    if (r0 == 0) goto La7
                L98:
                    net.bytebuddy.description.field.FieldDescription r2 = r14.getField()
                    r1 = r8
                    r3 = r9
                    r4 = r10
                    r5 = r11
                    r6 = r12
                    r7 = r13
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding r9 = r1.bind(r2, r3, r4, r5, r6, r7)
                    goto La9
                La7:
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal r9 = net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE
                La9:
                    return r9
            }

            public abstract net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> bind(net.bytebuddy.description.field.FieldDescription r1, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<S> r2, net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.description.method.ParameterDescription r4, net.bytebuddy.implementation.Implementation.Target r5, net.bytebuddy.implementation.bytecode.assign.Assigner r6);

            public abstract net.bytebuddy.description.type.TypeDescription declaringType(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<S> r1);

            public abstract java.lang.String fieldName(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<S> r1);
        }

        public static abstract class ForFixedValue<S extends java.lang.annotation.Annotation> implements net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<S> {

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class OfConstant<U extends java.lang.annotation.Annotation> extends net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder.ForFixedValue<U> {
                private final java.lang.Class<U> type;

                @net.bytebuddy.utility.nullability.MaybeNull
                @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                private final java.lang.Object value;

                public OfConstant(java.lang.Class<U> r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r2) {
                        r0 = this;
                        r0.<init>()
                        r0.type = r1
                        r0.value = r2
                        return
                }

                public static <V extends java.lang.annotation.Annotation> net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<V> of(java.lang.Class<V> r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r2) {
                        net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder$ForFixedValue$OfConstant r0 = new net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder$ForFixedValue$OfConstant
                        r0.<init>(r1, r2)
                        return r0
                }

                @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder.ForFixedValue
                @net.bytebuddy.utility.nullability.MaybeNull
                public java.lang.Object bind(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<U> r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.description.method.ParameterDescription r3) {
                        r0 = this;
                        java.lang.Object r1 = r0.value
                        return r1
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
                        java.lang.Class<U extends java.lang.annotation.Annotation> r2 = r4.type
                        net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder$ForFixedValue$OfConstant r5 = (net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder.ForFixedValue.OfConstant) r5
                        java.lang.Class<U extends java.lang.annotation.Annotation> r3 = r5.type
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        java.lang.Object r2 = r4.value
                        java.lang.Object r5 = r5.value
                        if (r5 == 0) goto L2f
                        if (r2 == 0) goto L31
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L32
                        return r1
                    L2f:
                        if (r2 == 0) goto L32
                    L31:
                        return r1
                    L32:
                        return r0
                }

                @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
                public java.lang.Class<U> getHandledType() {
                        r1 = this;
                        java.lang.Class<U extends java.lang.annotation.Annotation> r0 = r1.type
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        java.lang.Class<U extends java.lang.annotation.Annotation> r1 = r2.type
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.lang.Object r1 = r2.value
                        if (r1 == 0) goto L1c
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                    L1c:
                        return r0
                }
            }

            public ForFixedValue() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @net.bytebuddy.utility.nullability.MaybeNull
            public abstract java.lang.Object bind(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<S> r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.description.method.ParameterDescription r3);

            @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
            public net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> bind(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<S> r2, net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.description.method.ParameterDescription r4, net.bytebuddy.implementation.Implementation.Target r5, net.bytebuddy.implementation.bytecode.assign.Assigner r6, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r7) {
                    r1 = this;
                    java.lang.Object r2 = r1.bind(r2, r3, r4)
                    if (r2 != 0) goto L14
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r2 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r4.getType()
                    net.bytebuddy.implementation.bytecode.StackManipulation r3 = net.bytebuddy.implementation.bytecode.constant.DefaultValue.of(r3)
                    r2.<init>(r3)
                    return r2
                L14:
                    net.bytebuddy.utility.ConstantValue r2 = net.bytebuddy.utility.ConstantValue.Simple.wrap(r2)
                    net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r3 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r5 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.implementation.bytecode.StackManipulation r0 = r2.toStackManipulation()
                    net.bytebuddy.description.type.TypeDescription r2 = r2.getTypeDescription()
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.asGenericType()
                    net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.getType()
                    net.bytebuddy.implementation.bytecode.StackManipulation r2 = r6.assign(r2, r4, r7)
                    r4 = 2
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r4 = new net.bytebuddy.implementation.bytecode.StackManipulation[r4]
                    r6 = 0
                    r4[r6] = r0
                    r6 = 1
                    r4[r6] = r2
                    r5.<init>(r4)
                    r3.<init>(r5)
                    return r3
            }
        }

        static {
                r0 = 19
                net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$ParameterBinder[] r0 = new net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder[r0]
                net.bytebuddy.implementation.bind.annotation.Argument$Binder r1 = net.bytebuddy.implementation.bind.annotation.Argument.Binder.INSTANCE
                r2 = 0
                r0[r2] = r1
                net.bytebuddy.implementation.bind.annotation.AllArguments$Binder r1 = net.bytebuddy.implementation.bind.annotation.AllArguments.Binder.INSTANCE
                r2 = 1
                r0[r2] = r1
                net.bytebuddy.implementation.bind.annotation.Origin$Binder r1 = net.bytebuddy.implementation.bind.annotation.Origin.Binder.INSTANCE
                r2 = 2
                r0[r2] = r1
                net.bytebuddy.implementation.bind.annotation.This$Binder r1 = net.bytebuddy.implementation.bind.annotation.This.Binder.INSTANCE
                r2 = 3
                r0[r2] = r1
                net.bytebuddy.implementation.bind.annotation.Super$Binder r1 = net.bytebuddy.implementation.bind.annotation.Super.Binder.INSTANCE
                r2 = 4
                r0[r2] = r1
                net.bytebuddy.implementation.bind.annotation.Default$Binder r1 = net.bytebuddy.implementation.bind.annotation.Default.Binder.INSTANCE
                r2 = 5
                r0[r2] = r1
                net.bytebuddy.implementation.bind.annotation.SuperCall$Binder r1 = net.bytebuddy.implementation.bind.annotation.SuperCall.Binder.INSTANCE
                r2 = 6
                r0[r2] = r1
                net.bytebuddy.implementation.bind.annotation.SuperCallHandle$Binder r1 = net.bytebuddy.implementation.bind.annotation.SuperCallHandle.Binder.INSTANCE
                r2 = 7
                r0[r2] = r1
                net.bytebuddy.implementation.bind.annotation.DefaultCall$Binder r1 = net.bytebuddy.implementation.bind.annotation.DefaultCall.Binder.INSTANCE
                r2 = 8
                r0[r2] = r1
                net.bytebuddy.implementation.bind.annotation.DefaultCallHandle$Binder r1 = net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder.INSTANCE
                r2 = 9
                r0[r2] = r1
                net.bytebuddy.implementation.bind.annotation.SuperMethod$Binder r1 = net.bytebuddy.implementation.bind.annotation.SuperMethod.Binder.INSTANCE
                r2 = 10
                r0[r2] = r1
                net.bytebuddy.implementation.bind.annotation.SuperMethodHandle$Binder r1 = net.bytebuddy.implementation.bind.annotation.SuperMethodHandle.Binder.INSTANCE
                r2 = 11
                r0[r2] = r1
                net.bytebuddy.implementation.bind.annotation.DefaultMethod$Binder r1 = net.bytebuddy.implementation.bind.annotation.DefaultMethod.Binder.INSTANCE
                r2 = 12
                r0[r2] = r1
                net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle$Binder r1 = net.bytebuddy.implementation.bind.annotation.DefaultMethodHandle.Binder.INSTANCE
                r2 = 13
                r0[r2] = r1
                net.bytebuddy.implementation.bind.annotation.FieldValue$Binder r1 = net.bytebuddy.implementation.bind.annotation.FieldValue.Binder.INSTANCE
                r2 = 14
                r0[r2] = r1
                net.bytebuddy.implementation.bind.annotation.FieldGetterHandle$Binder r1 = net.bytebuddy.implementation.bind.annotation.FieldGetterHandle.Binder.INSTANCE
                r2 = 15
                r0[r2] = r1
                net.bytebuddy.implementation.bind.annotation.FieldSetterHandle$Binder r1 = net.bytebuddy.implementation.bind.annotation.FieldSetterHandle.Binder.INSTANCE
                r2 = 16
                r0[r2] = r1
                net.bytebuddy.implementation.bind.annotation.StubValue$Binder r1 = net.bytebuddy.implementation.bind.annotation.StubValue.Binder.INSTANCE
                r2 = 17
                r0[r2] = r1
                net.bytebuddy.implementation.bind.annotation.Empty$Binder r1 = net.bytebuddy.implementation.bind.annotation.Empty.Binder.INSTANCE
                r2 = 18
                r0[r2] = r1
                java.util.List r0 = java.util.Arrays.asList(r0)
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder.DEFAULTS = r0
                return
        }

        net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> bind(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<T> r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.description.method.ParameterDescription r3, net.bytebuddy.implementation.Implementation.Target r4, net.bytebuddy.implementation.bytecode.assign.Assigner r5, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r6);

        java.lang.Class<T> getHandledType();
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Record implements net.bytebuddy.implementation.bind.MethodDelegationBinder.Record {
        private final net.bytebuddy.description.method.MethodDescription candidate;
        private final java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.DelegationProcessor.Handler> handlers;
        private final net.bytebuddy.implementation.bytecode.assign.Assigner.Typing typing;

        public Record(net.bytebuddy.description.method.MethodDescription r1, java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.DelegationProcessor.Handler> r2, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3) {
                r0 = this;
                r0.<init>()
                r0.candidate = r1
                r0.handlers = r2
                r0.typing = r3
                return
        }

        @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.Record
        public net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding bind(net.bytebuddy.implementation.Implementation.Target r4, net.bytebuddy.description.method.MethodDescription r5, net.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler r6, net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker r7, net.bytebuddy.implementation.bytecode.assign.Assigner r8) {
                r3 = this;
                net.bytebuddy.description.method.MethodDescription r0 = r3.candidate
                net.bytebuddy.description.type.TypeDescription r1 = r4.getInstrumentedType()
                boolean r0 = r0.isAccessibleTo(r1)
                if (r0 != 0) goto Lf
                net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding$Illegal r4 = net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding.Illegal.INSTANCE
                return r4
            Lf:
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r0 = r3.typing
                net.bytebuddy.description.method.MethodDescription r1 = r3.candidate
                net.bytebuddy.implementation.bytecode.StackManipulation r6 = r6.resolve(r8, r0, r5, r1)
                boolean r0 = r6.isValid()
                if (r0 != 0) goto L20
                net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding$Illegal r4 = net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding.Illegal.INSTANCE
                return r4
            L20:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding$Builder r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding$Builder
                net.bytebuddy.description.method.MethodDescription r1 = r3.candidate
                r0.<init>(r7, r1)
                java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$DelegationProcessor$Handler> r7 = r3.handlers
                java.util.Iterator r7 = r7.iterator()
            L2d:
                boolean r1 = r7.hasNext()
                if (r1 == 0) goto L4c
                java.lang.Object r1 = r7.next()
                net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$DelegationProcessor$Handler r1 = (net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.DelegationProcessor.Handler) r1
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding r1 = r1.bind(r5, r4, r8)
                boolean r2 = r1.isValid()
                if (r2 == 0) goto L49
                boolean r1 = r0.append(r1)
                if (r1 != 0) goto L2d
            L49:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding$Illegal r4 = net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding.Illegal.INSTANCE
                return r4
            L4c:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$MethodBinding r4 = r0.build(r6)
                return r4
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
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r2 = r4.typing
                net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$Record r5 = (net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.Record) r5
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r5.typing
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                net.bytebuddy.description.method.MethodDescription r2 = r4.candidate
                net.bytebuddy.description.method.MethodDescription r3 = r5.candidate
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L2b
                return r1
            L2b:
                java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$DelegationProcessor$Handler> r2 = r4.handlers
                java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$DelegationProcessor$Handler> r5 = r5.handlers
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L36
                return r1
            L36:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.description.method.MethodDescription r1 = r2.candidate
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$DelegationProcessor$Handler> r1 = r2.handlers
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = r2.typing
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription r0 = r1.candidate
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public TargetMethodAnnotationDrivenBinder(net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.DelegationProcessor r1) {
            r0 = this;
            r0.<init>()
            r0.delegationProcessor = r1
            return
    }

    public static net.bytebuddy.implementation.bind.MethodDelegationBinder of(java.util.List<? extends net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<?>> r1) {
            net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder r0 = new net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder
            net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$DelegationProcessor r1 = net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.DelegationProcessor.of(r1)
            r0.<init>(r1)
            return r0
    }

    @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder
    public net.bytebuddy.implementation.bind.MethodDelegationBinder.Record compile(net.bytebuddy.description.method.MethodDescription r5) {
            r4 = this;
            boolean r0 = net.bytebuddy.implementation.bind.annotation.IgnoreForBinding.Verifier.check(r5)
            if (r0 == 0) goto L9
            net.bytebuddy.implementation.bind.MethodDelegationBinder$Record$Illegal r5 = net.bytebuddy.implementation.bind.MethodDelegationBinder.Record.Illegal.INSTANCE
            return r5
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            net.bytebuddy.description.method.ParameterList r1 = r5.getParameters()
            int r1 = r1.size()
            r0.<init>(r1)
            net.bytebuddy.description.method.ParameterList r1 = r5.getParameters()
            java.util.Iterator r1 = r1.iterator()
        L1e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            net.bytebuddy.description.method.ParameterDescription r2 = (net.bytebuddy.description.method.ParameterDescription) r2
            net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$DelegationProcessor r3 = r4.delegationProcessor
            net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$DelegationProcessor$Handler r2 = r3.prepare(r2)
            r0.add(r2)
            goto L1e
        L34:
            net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$Record r1 = new net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$Record
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r2 = net.bytebuddy.implementation.bind.annotation.RuntimeType.Verifier.check(r5)
            r1.<init>(r5, r0, r2)
            return r1
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
            net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$DelegationProcessor r2 = r4.delegationProcessor
            net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder r5 = (net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder) r5
            net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$DelegationProcessor r5 = r5.delegationProcessor
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
            net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder$DelegationProcessor r1 = r2.delegationProcessor
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }
}
