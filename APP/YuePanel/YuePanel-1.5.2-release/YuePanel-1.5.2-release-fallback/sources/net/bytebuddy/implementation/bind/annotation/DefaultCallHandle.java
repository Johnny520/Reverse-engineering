package net.bytebuddy.implementation.bind.annotation;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface DefaultCallHandle {

    public enum Binder extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder> implements net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<net.bytebuddy.implementation.bind.annotation.DefaultCallHandle> {
        private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder[] $VALUES = null;
        public static final net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder INSTANCE = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape NULL_IF_IMPOSSIBLE = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape TARGET_TYPE = null;

        public interface DefaultMethodLocator {

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Explicit implements net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder.DefaultMethodLocator {
                private final net.bytebuddy.description.type.TypeDescription typeDescription;

                public Explicit(net.bytebuddy.description.type.TypeDescription r1) {
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
                        net.bytebuddy.implementation.bind.annotation.DefaultCallHandle$Binder$DefaultMethodLocator$Explicit r5 = (net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder.DefaultMethodLocator.Explicit) r5
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

                @Override // net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder.DefaultMethodLocator
                public net.bytebuddy.implementation.Implementation.SpecialMethodInvocation resolve(net.bytebuddy.implementation.Implementation.Target r2, net.bytebuddy.description.method.MethodDescription r3) {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                        boolean r0 = r0.isInterface()
                        if (r0 == 0) goto L13
                        net.bytebuddy.description.method.MethodDescription$SignatureToken r3 = r3.asSignatureToken()
                        net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                        net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r2 = r2.invokeDefault(r3, r0)
                        return r2
                    L13:
                        java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        r0.append(r3)
                        java.lang.String r3 = " method carries default method call parameter on non-interface type"
                        r0.append(r3)
                        java.lang.String r3 = r0.toString()
                        r2.<init>(r3)
                        throw r2
                }
            }

            public enum Implicit extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder.DefaultMethodLocator.Implicit> implements net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder.DefaultMethodLocator {
                private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder.DefaultMethodLocator.Implicit[] $VALUES = null;
                public static final net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder.DefaultMethodLocator.Implicit INSTANCE = null;

                static {
                        net.bytebuddy.implementation.bind.annotation.DefaultCallHandle$Binder$DefaultMethodLocator$Implicit r0 = new net.bytebuddy.implementation.bind.annotation.DefaultCallHandle$Binder$DefaultMethodLocator$Implicit
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder.DefaultMethodLocator.Implicit.INSTANCE = r0
                        net.bytebuddy.implementation.bind.annotation.DefaultCallHandle$Binder$DefaultMethodLocator$Implicit[] r0 = new net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder.DefaultMethodLocator.Implicit[]{r0}
                        net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder.DefaultMethodLocator.Implicit.$VALUES = r0
                        return
                }

                Implicit(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder.DefaultMethodLocator.Implicit valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.bind.annotation.DefaultCallHandle$Binder$DefaultMethodLocator$Implicit> r0 = net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder.DefaultMethodLocator.Implicit.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.bind.annotation.DefaultCallHandle$Binder$DefaultMethodLocator$Implicit r1 = (net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder.DefaultMethodLocator.Implicit) r1
                        return r1
                }

                public static net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder.DefaultMethodLocator.Implicit[] values() {
                        net.bytebuddy.implementation.bind.annotation.DefaultCallHandle$Binder$DefaultMethodLocator$Implicit[] r0 = net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder.DefaultMethodLocator.Implicit.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.bind.annotation.DefaultCallHandle$Binder$DefaultMethodLocator$Implicit[] r0 = (net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder.DefaultMethodLocator.Implicit[]) r0
                        return r0
                }

                @Override // net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder.DefaultMethodLocator
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
                net.bytebuddy.implementation.bind.annotation.DefaultCallHandle$Binder r0 = new net.bytebuddy.implementation.bind.annotation.DefaultCallHandle$Binder
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder.INSTANCE = r0
                net.bytebuddy.implementation.bind.annotation.DefaultCallHandle$Binder[] r0 = new net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder[]{r0}
                net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder.$VALUES = r0
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.DefaultCallHandle> r0 = net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                java.lang.String r1 = "targetType"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                java.lang.Object r1 = r1.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder.TARGET_TYPE = r1
                java.lang.String r1 = "nullIfImpossible"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder.NULL_IF_IMPOSSIBLE = r0
                return
        }

        Binder(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.DefaultCallHandle$Binder> r0 = net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bind.annotation.DefaultCallHandle$Binder r1 = (net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder) r1
                return r1
        }

        public static net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder[] values() {
                net.bytebuddy.implementation.bind.annotation.DefaultCallHandle$Binder[] r0 = net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bind.annotation.DefaultCallHandle$Binder[] r0 = (net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> bind(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.DefaultCallHandle> r15, net.bytebuddy.description.method.MethodDescription r16, net.bytebuddy.description.method.ParameterDescription r17, net.bytebuddy.implementation.Implementation.Target r18, net.bytebuddy.implementation.bytecode.assign.Assigner r19, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r20) {
                r14 = this;
                r0 = r15
                r1 = 2
                r2 = 3
                r3 = 0
                r4 = 1
                net.bytebuddy.description.type.TypeDescription$Generic r5 = r17.getType()
                net.bytebuddy.description.type.TypeDescription r5 = r5.asErasure()
                net.bytebuddy.utility.JavaType r6 = net.bytebuddy.utility.JavaType.METHOD_HANDLE
                net.bytebuddy.description.type.TypeDescription r7 = r6.getTypeStub()
                boolean r5 = r5.isAssignableFrom(r7)
                if (r5 == 0) goto L1b2
                boolean r5 = r16.isConstructor()
                java.lang.Class<java.lang.Boolean> r7 = java.lang.Boolean.class
                if (r5 == 0) goto L3e
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder.NULL_IF_IMPOSSIBLE
                net.bytebuddy.description.annotation.AnnotationValue r0 = r15.getValue(r1)
                java.lang.Object r0 = r0.resolve(r7)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L3b
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                net.bytebuddy.implementation.bytecode.constant.NullConstant r1 = net.bytebuddy.implementation.bytecode.constant.NullConstant.INSTANCE
                r0.<init>(r1)
                goto L3d
            L3b:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE
            L3d:
                return r0
            L3e:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r5 = net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder.TARGET_TYPE
                net.bytebuddy.description.annotation.AnnotationValue r5 = r15.getValue(r5)
                java.lang.Class<net.bytebuddy.description.type.TypeDescription> r8 = net.bytebuddy.description.type.TypeDescription.class
                java.lang.Object r5 = r5.resolve(r8)
                net.bytebuddy.description.type.TypeDescription r5 = (net.bytebuddy.description.type.TypeDescription) r5
                java.lang.Class r8 = java.lang.Void.TYPE
                boolean r8 = r5.represents(r8)
                if (r8 == 0) goto L5b
                net.bytebuddy.implementation.bind.annotation.DefaultCallHandle$Binder$DefaultMethodLocator$Implicit r5 = net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder.DefaultMethodLocator.Implicit.INSTANCE
                r8 = r16
                r9 = r18
                goto L65
            L5b:
                net.bytebuddy.implementation.bind.annotation.DefaultCallHandle$Binder$DefaultMethodLocator$Explicit r8 = new net.bytebuddy.implementation.bind.annotation.DefaultCallHandle$Binder$DefaultMethodLocator$Explicit
                r8.<init>(r5)
                r9 = r18
                r5 = r8
                r8 = r16
            L65:
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r5 = r5.resolve(r9, r8)
                net.bytebuddy.description.method.MethodDescription$TypeToken r9 = r16.asTypeToken()
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r5 = r5.withCheckedCompatibilityTo(r9)
                boolean r9 = r5.isValid()
                if (r9 == 0) goto L195
                java.util.ArrayList r0 = new java.util.ArrayList
                net.bytebuddy.description.method.ParameterList r7 = r16.getParameters()
                int r7 = r7.size()
                int r7 = r7 * r2
                int r7 = r7 + r2
                r0.<init>(r7)
                net.bytebuddy.utility.JavaConstant$MethodHandle r5 = r5.toMethodHandle()
                net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.toStackManipulation()
                r0.add(r5)
                net.bytebuddy.implementation.bytecode.StackManipulation r5 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                r0.add(r5)
                net.bytebuddy.description.method.MethodDescription$Latent r5 = new net.bytebuddy.description.method.MethodDescription$Latent
                net.bytebuddy.description.type.TypeDescription r7 = r6.getTypeStub()
                net.bytebuddy.description.method.MethodDescription$Token r9 = new net.bytebuddy.description.method.MethodDescription$Token
                net.bytebuddy.description.type.TypeDescription r6 = r6.getTypeStub()
                net.bytebuddy.description.type.TypeDescription$Generic r6 = r6.asGenericType()
                net.bytebuddy.description.type.TypeList$Generic$Explicit r10 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
                java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
                net.bytebuddy.description.type.TypeDescription$Generic r12 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r11)
                net.bytebuddy.description.type.TypeDefinition[] r13 = new net.bytebuddy.description.type.TypeDefinition[r4]
                r13[r3] = r12
                r10.<init>(r13)
                java.lang.String r12 = "bindTo"
                r9.<init>(r12, r4, r6, r10)
                r5.<init>(r7, r9)
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r5 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r5)
                r0.add(r5)
                net.bytebuddy.description.method.ParameterList r5 = r16.getParameters()
                boolean r5 = r5.isEmpty()
                if (r5 != 0) goto L18f
                java.util.ArrayList r5 = new java.util.ArrayList
                net.bytebuddy.description.method.ParameterList r6 = r16.getParameters()
                int r6 = r6.size()
                r5.<init>(r6)
                net.bytebuddy.description.method.ParameterList r6 = r16.getParameters()
                java.util.Iterator r6 = r6.iterator()
            Le5:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L133
                java.lang.Object r7 = r6.next()
                net.bytebuddy.description.method.ParameterDescription r7 = (net.bytebuddy.description.method.ParameterDescription) r7
                net.bytebuddy.description.type.TypeDescription$Generic r8 = r7.getType()
                boolean r8 = r8.isPrimitive()
                if (r8 == 0) goto L127
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r8 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.bytecode.StackManipulation r9 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.load(r7)
                net.bytebuddy.description.type.TypeDescription$Generic r10 = r7.getType()
                net.bytebuddy.description.type.TypeDescription$Generic r7 = r7.getType()
                net.bytebuddy.description.type.TypeDescription r7 = r7.asErasure()
                net.bytebuddy.description.type.TypeDescription r7 = r7.asBoxed()
                net.bytebuddy.description.type.TypeDescription$Generic r7 = r7.asGenericType()
                r12 = r19
                r13 = r20
                net.bytebuddy.implementation.bytecode.StackManipulation r7 = r12.assign(r10, r7, r13)
                net.bytebuddy.implementation.bytecode.StackManipulation[] r10 = new net.bytebuddy.implementation.bytecode.StackManipulation[r1]
                r10[r3] = r9
                r10[r4] = r7
                r8.<init>(r10)
                goto L12f
            L127:
                r12 = r19
                r13 = r20
                net.bytebuddy.implementation.bytecode.StackManipulation r8 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.load(r7)
            L12f:
                r5.add(r8)
                goto Le5
            L133:
                net.bytebuddy.implementation.bytecode.StackManipulation r6 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.forValue(r3)
                r0.add(r6)
                net.bytebuddy.description.type.TypeDescription r6 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r11)
                net.bytebuddy.description.type.TypeDescription$Generic r6 = r6.asGenericType()
                net.bytebuddy.implementation.bytecode.collection.ArrayFactory r6 = net.bytebuddy.implementation.bytecode.collection.ArrayFactory.forType(r6)
                net.bytebuddy.implementation.bytecode.StackManipulation r5 = r6.withValues(r5)
                r0.add(r5)
                net.bytebuddy.description.method.MethodDescription$Latent r5 = new net.bytebuddy.description.method.MethodDescription$Latent
                net.bytebuddy.utility.JavaType r6 = net.bytebuddy.utility.JavaType.METHOD_HANDLES
                net.bytebuddy.description.type.TypeDescription r6 = r6.getTypeStub()
                net.bytebuddy.description.method.MethodDescription$Token r7 = new net.bytebuddy.description.method.MethodDescription$Token
                net.bytebuddy.utility.JavaType r8 = net.bytebuddy.utility.JavaType.METHOD_HANDLE
                net.bytebuddy.description.type.TypeDescription r9 = r8.getTypeStub()
                net.bytebuddy.description.type.TypeDescription$Generic r9 = r9.asGenericType()
                net.bytebuddy.description.type.TypeList$Generic$Explicit r10 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
                net.bytebuddy.description.type.TypeDescription r8 = r8.getTypeStub()
                java.lang.Class r11 = java.lang.Integer.TYPE
                net.bytebuddy.description.type.TypeDescription$Generic r11 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r11)
                java.lang.Class<java.lang.Object[]> r12 = java.lang.Object[].class
                net.bytebuddy.description.type.TypeDescription$Generic r12 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r12)
                net.bytebuddy.description.type.TypeDefinition[] r2 = new net.bytebuddy.description.type.TypeDefinition[r2]
                r2[r3] = r8
                r2[r4] = r11
                r2[r1] = r12
                r10.<init>(r2)
                java.lang.String r1 = "insertArguments"
                r2 = 9
                r7.<init>(r1, r2, r9, r10)
                r5.<init>(r6, r7)
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r1 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r5)
                r0.add(r1)
            L18f:
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r1 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                r1.<init>(r0)
                goto L1a9
            L195:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.Binder.NULL_IF_IMPOSSIBLE
                net.bytebuddy.description.annotation.AnnotationValue r0 = r15.getValue(r1)
                java.lang.Object r0 = r0.resolve(r7)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L1af
                net.bytebuddy.implementation.bytecode.constant.NullConstant r1 = net.bytebuddy.implementation.bytecode.constant.NullConstant.INSTANCE
            L1a9:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                r0.<init>(r1)
                return r0
            L1af:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE
                return r0
            L1b2:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Cannot assign MethodHandle type to "
                r1.append(r2)
                r2 = r17
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public java.lang.Class<net.bytebuddy.implementation.bind.annotation.DefaultCallHandle> getHandledType() {
                r1 = this;
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.DefaultCallHandle> r0 = net.bytebuddy.implementation.bind.annotation.DefaultCallHandle.class
                return r0
        }
    }

    boolean nullIfImpossible() default false;

    java.lang.Class<?> targetType() default void.class;
}
