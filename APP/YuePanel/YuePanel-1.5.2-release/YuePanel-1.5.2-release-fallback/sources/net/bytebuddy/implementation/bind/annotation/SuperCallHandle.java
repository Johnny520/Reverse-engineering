package net.bytebuddy.implementation.bind.annotation;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface SuperCallHandle {

    public enum Binder extends java.lang.Enum<net.bytebuddy.implementation.bind.annotation.SuperCallHandle.Binder> implements net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder<net.bytebuddy.implementation.bind.annotation.SuperCallHandle> {
        private static final /* synthetic */ net.bytebuddy.implementation.bind.annotation.SuperCallHandle.Binder[] $VALUES = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape FALLBACK_TO_DEFAULT = null;
        public static final net.bytebuddy.implementation.bind.annotation.SuperCallHandle.Binder INSTANCE = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape NULL_IF_IMPOSSIBLE = null;

        static {
                net.bytebuddy.implementation.bind.annotation.SuperCallHandle$Binder r0 = new net.bytebuddy.implementation.bind.annotation.SuperCallHandle$Binder
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.bind.annotation.SuperCallHandle.Binder.INSTANCE = r0
                net.bytebuddy.implementation.bind.annotation.SuperCallHandle$Binder[] r0 = new net.bytebuddy.implementation.bind.annotation.SuperCallHandle.Binder[]{r0}
                net.bytebuddy.implementation.bind.annotation.SuperCallHandle.Binder.$VALUES = r0
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.SuperCallHandle> r0 = net.bytebuddy.implementation.bind.annotation.SuperCallHandle.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                java.lang.String r1 = "fallbackToDefault"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                java.lang.Object r1 = r1.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                net.bytebuddy.implementation.bind.annotation.SuperCallHandle.Binder.FALLBACK_TO_DEFAULT = r1
                java.lang.String r1 = "nullIfImpossible"
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                net.bytebuddy.implementation.bind.annotation.SuperCallHandle.Binder.NULL_IF_IMPOSSIBLE = r0
                return
        }

        Binder(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.bind.annotation.SuperCallHandle.Binder valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.SuperCallHandle$Binder> r0 = net.bytebuddy.implementation.bind.annotation.SuperCallHandle.Binder.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bind.annotation.SuperCallHandle$Binder r1 = (net.bytebuddy.implementation.bind.annotation.SuperCallHandle.Binder) r1
                return r1
        }

        public static net.bytebuddy.implementation.bind.annotation.SuperCallHandle.Binder[] values() {
                net.bytebuddy.implementation.bind.annotation.SuperCallHandle$Binder[] r0 = net.bytebuddy.implementation.bind.annotation.SuperCallHandle.Binder.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bind.annotation.SuperCallHandle$Binder[] r0 = (net.bytebuddy.implementation.bind.annotation.SuperCallHandle.Binder[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding<?> bind(net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.implementation.bind.annotation.SuperCallHandle> r15, net.bytebuddy.description.method.MethodDescription r16, net.bytebuddy.description.method.ParameterDescription r17, net.bytebuddy.implementation.Implementation.Target r18, net.bytebuddy.implementation.bytecode.assign.Assigner r19, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r20) {
                r14 = this;
                r0 = r15
                r1 = r18
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                net.bytebuddy.description.type.TypeDescription$Generic r6 = r17.getType()
                net.bytebuddy.description.type.TypeDescription r6 = r6.asErasure()
                net.bytebuddy.utility.JavaType r7 = net.bytebuddy.utility.JavaType.METHOD_HANDLE
                net.bytebuddy.description.type.TypeDescription r8 = r7.getTypeStub()
                boolean r6 = r6.isAssignableFrom(r8)
                if (r6 == 0) goto L1bc
                boolean r6 = r16.isConstructor()
                java.lang.Class<java.lang.Boolean> r8 = java.lang.Boolean.class
                if (r6 == 0) goto L40
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = net.bytebuddy.implementation.bind.annotation.SuperCallHandle.Binder.NULL_IF_IMPOSSIBLE
                net.bytebuddy.description.annotation.AnnotationValue r0 = r15.getValue(r1)
                java.lang.Object r0 = r0.resolve(r8)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L3d
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                net.bytebuddy.implementation.bytecode.constant.NullConstant r1 = net.bytebuddy.implementation.bytecode.constant.NullConstant.INSTANCE
                r0.<init>(r1)
                goto L3f
            L3d:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE
            L3f:
                return r0
            L40:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r6 = net.bytebuddy.implementation.bind.annotation.SuperCallHandle.Binder.FALLBACK_TO_DEFAULT
                net.bytebuddy.description.annotation.AnnotationValue r6 = r15.getValue(r6)
                java.lang.Object r6 = r6.resolve(r8)
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L5b
                net.bytebuddy.description.method.MethodDescription$SignatureToken r6 = r16.asSignatureToken()
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r1 = r1.invokeDominant(r6)
                goto L63
            L5b:
                net.bytebuddy.description.method.MethodDescription$SignatureToken r6 = r16.asSignatureToken()
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r1 = r1.invokeSuper(r6)
            L63:
                net.bytebuddy.description.method.MethodDescription$TypeToken r6 = r16.asTypeToken()
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r1 = r1.withCheckedCompatibilityTo(r6)
                boolean r6 = r1.isValid()
                if (r6 == 0) goto L19f
                java.util.ArrayList r0 = new java.util.ArrayList
                boolean r6 = r16.isStatic()
                if (r6 == 0) goto L7b
                r6 = r5
                goto L7c
            L7b:
                r6 = r3
            L7c:
                int r6 = r6 + r4
                net.bytebuddy.description.method.ParameterList r8 = r16.getParameters()
                int r8 = r8.size()
                int r8 = r8 * r2
                int r6 = r6 + r8
                r0.<init>(r6)
                net.bytebuddy.utility.JavaConstant$MethodHandle r1 = r1.toMethodHandle()
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.toStackManipulation()
                r0.add(r1)
                boolean r1 = r16.isStatic()
                java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
                if (r1 != 0) goto Ld0
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                r0.add(r1)
                net.bytebuddy.description.method.MethodDescription$Latent r1 = new net.bytebuddy.description.method.MethodDescription$Latent
                net.bytebuddy.description.type.TypeDescription r8 = r7.getTypeStub()
                net.bytebuddy.description.method.MethodDescription$Token r9 = new net.bytebuddy.description.method.MethodDescription$Token
                net.bytebuddy.description.type.TypeDescription r7 = r7.getTypeStub()
                net.bytebuddy.description.type.TypeDescription$Generic r7 = r7.asGenericType()
                net.bytebuddy.description.type.TypeList$Generic$Explicit r10 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
                net.bytebuddy.description.type.TypeDescription$Generic r11 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r6)
                net.bytebuddy.description.type.TypeDefinition[] r12 = new net.bytebuddy.description.type.TypeDefinition[r4]
                r12[r5] = r11
                r10.<init>(r12)
                java.lang.String r11 = "bindTo"
                r9.<init>(r11, r4, r7, r10)
                r1.<init>(r8, r9)
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r1 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r1)
                r0.add(r1)
            Ld0:
                net.bytebuddy.description.method.ParameterList r1 = r16.getParameters()
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L199
                java.util.ArrayList r1 = new java.util.ArrayList
                net.bytebuddy.description.method.ParameterList r7 = r16.getParameters()
                int r7 = r7.size()
                r1.<init>(r7)
                net.bytebuddy.description.method.ParameterList r7 = r16.getParameters()
                java.util.Iterator r7 = r7.iterator()
            Lef:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L13d
                java.lang.Object r8 = r7.next()
                net.bytebuddy.description.method.ParameterDescription r8 = (net.bytebuddy.description.method.ParameterDescription) r8
                net.bytebuddy.description.type.TypeDescription$Generic r9 = r8.getType()
                boolean r9 = r9.isPrimitive()
                if (r9 == 0) goto L131
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r9 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.bytecode.StackManipulation r10 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.load(r8)
                net.bytebuddy.description.type.TypeDescription$Generic r11 = r8.getType()
                net.bytebuddy.description.type.TypeDescription$Generic r8 = r8.getType()
                net.bytebuddy.description.type.TypeDescription r8 = r8.asErasure()
                net.bytebuddy.description.type.TypeDescription r8 = r8.asBoxed()
                net.bytebuddy.description.type.TypeDescription$Generic r8 = r8.asGenericType()
                r12 = r19
                r13 = r20
                net.bytebuddy.implementation.bytecode.StackManipulation r8 = r12.assign(r11, r8, r13)
                net.bytebuddy.implementation.bytecode.StackManipulation[] r11 = new net.bytebuddy.implementation.bytecode.StackManipulation[r3]
                r11[r5] = r10
                r11[r4] = r8
                r9.<init>(r11)
                goto L139
            L131:
                r12 = r19
                r13 = r20
                net.bytebuddy.implementation.bytecode.StackManipulation r9 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.load(r8)
            L139:
                r1.add(r9)
                goto Lef
            L13d:
                net.bytebuddy.implementation.bytecode.StackManipulation r7 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.forValue(r5)
                r0.add(r7)
                net.bytebuddy.description.type.TypeDescription r6 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
                net.bytebuddy.description.type.TypeDescription$Generic r6 = r6.asGenericType()
                net.bytebuddy.implementation.bytecode.collection.ArrayFactory r6 = net.bytebuddy.implementation.bytecode.collection.ArrayFactory.forType(r6)
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = r6.withValues(r1)
                r0.add(r1)
                net.bytebuddy.description.method.MethodDescription$Latent r1 = new net.bytebuddy.description.method.MethodDescription$Latent
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
                r2[r5] = r8
                r2[r4] = r11
                r2[r3] = r12
                r10.<init>(r2)
                java.lang.String r2 = "insertArguments"
                r3 = 9
                r7.<init>(r2, r3, r9, r10)
                r1.<init>(r6, r7)
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r1 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r1)
                r0.add(r1)
            L199:
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r1 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                r1.<init>(r0)
                goto L1b3
            L19f:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = net.bytebuddy.implementation.bind.annotation.SuperCallHandle.Binder.NULL_IF_IMPOSSIBLE
                net.bytebuddy.description.annotation.AnnotationValue r0 = r15.getValue(r1)
                java.lang.Object r0 = r0.resolve(r8)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L1b9
                net.bytebuddy.implementation.bytecode.constant.NullConstant r1 = net.bytebuddy.implementation.bytecode.constant.NullConstant.INSTANCE
            L1b3:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous r0 = new net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Anonymous
                r0.<init>(r1)
                return r0
            L1b9:
                net.bytebuddy.implementation.bind.MethodDelegationBinder$ParameterBinding$Illegal r0 = net.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE
                return r0
            L1bc:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "A method handle for a super method invocation cannot be assigned to "
                r1.append(r2)
                r2 = r17
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public java.lang.Class<net.bytebuddy.implementation.bind.annotation.SuperCallHandle> getHandledType() {
                r1 = this;
                java.lang.Class<net.bytebuddy.implementation.bind.annotation.SuperCallHandle> r0 = net.bytebuddy.implementation.bind.annotation.SuperCallHandle.class
                return r0
        }
    }

    boolean fallbackToDefault() default true;

    boolean nullIfImpossible() default false;
}
