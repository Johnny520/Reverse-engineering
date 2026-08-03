package net.bytebuddy.dynamic.scaffold.inline;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class RebaseImplementationTarget extends net.bytebuddy.implementation.Implementation.Target.AbstractBase {
    private final java.util.Map<net.bytebuddy.description.method.MethodDescription.SignatureToken, net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution> rebaseableMethods;

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Factory implements net.bytebuddy.implementation.Implementation.Target.Factory {
        private final net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver methodRebaseResolver;

        public Factory(net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver r1) {
                r0 = this;
                r0.<init>()
                r0.methodRebaseResolver = r1
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
                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver r2 = r4.methodRebaseResolver
                net.bytebuddy.dynamic.scaffold.inline.RebaseImplementationTarget$Factory r5 = (net.bytebuddy.dynamic.scaffold.inline.RebaseImplementationTarget.Factory) r5
                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver r5 = r5.methodRebaseResolver
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
                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver r1 = r2.methodRebaseResolver
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.implementation.Implementation.Target.Factory
        public net.bytebuddy.implementation.Implementation.Target make(net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.dynamic.scaffold.MethodGraph.Linked r3, net.bytebuddy.ClassFileVersion r4) {
                r1 = this;
                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver r0 = r1.methodRebaseResolver
                net.bytebuddy.implementation.Implementation$Target r2 = net.bytebuddy.dynamic.scaffold.inline.RebaseImplementationTarget.of(r2, r3, r4, r0)
                return r2
        }
    }

    public static class RebasedMethodInvocation extends net.bytebuddy.implementation.Implementation.SpecialMethodInvocation.AbstractBase {
        private final net.bytebuddy.description.type.TypeDescription instrumentedType;
        private final net.bytebuddy.description.method.MethodDescription.InDefinedShape methodDescription;
        private final net.bytebuddy.description.type.TypeList prependedParameters;
        private final net.bytebuddy.implementation.bytecode.StackManipulation stackManipulation;

        public RebasedMethodInvocation(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.implementation.bytecode.StackManipulation r3, net.bytebuddy.description.type.TypeList r4) {
                r0 = this;
                r0.<init>()
                r0.methodDescription = r1
                r0.instrumentedType = r2
                r0.stackManipulation = r3
                r0.prependedParameters = r4
                return
        }

        public static net.bytebuddy.implementation.Implementation.SpecialMethodInvocation of(net.bytebuddy.description.method.MethodDescription.InDefinedShape r4, net.bytebuddy.description.type.TypeDescription r5, net.bytebuddy.description.type.TypeList r6) {
                boolean r0 = r4.isStatic()
                if (r0 == 0) goto Lb
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r0 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r4)
                goto L13
            Lb:
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r0 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r4)
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = r0.special(r5)
            L13:
                boolean r1 = r0.isValid()
                if (r1 == 0) goto L4a
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r6.size()
                int r2 = r2 + 1
                r1.<init>(r2)
                java.util.Iterator r2 = r6.iterator()
            L28:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L3c
                java.lang.Object r3 = r2.next()
                net.bytebuddy.description.type.TypeDescription r3 = (net.bytebuddy.description.type.TypeDescription) r3
                net.bytebuddy.implementation.bytecode.StackManipulation r3 = net.bytebuddy.implementation.bytecode.constant.DefaultValue.of(r3)
                r1.add(r3)
                goto L28
            L3c:
                r1.add(r0)
                net.bytebuddy.dynamic.scaffold.inline.RebaseImplementationTarget$RebasedMethodInvocation r0 = new net.bytebuddy.dynamic.scaffold.inline.RebaseImplementationTarget$RebasedMethodInvocation
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r2 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                r2.<init>(r1)
                r0.<init>(r4, r5, r2, r6)
                return r0
            L4a:
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation$Illegal r4 = net.bytebuddy.implementation.Implementation.SpecialMethodInvocation.Illegal.INSTANCE
                return r4
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.Implementation.Context r3) {
                r1 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = r1.stackManipulation
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = r0.apply(r2, r3)
                return r2
        }

        @Override // net.bytebuddy.implementation.Implementation.SpecialMethodInvocation
        public net.bytebuddy.description.method.MethodDescription getMethodDescription() {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.methodDescription
                return r0
        }

        @Override // net.bytebuddy.implementation.Implementation.SpecialMethodInvocation
        public net.bytebuddy.description.type.TypeDescription getTypeDescription() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.instrumentedType
                return r0
        }

        @Override // net.bytebuddy.implementation.Implementation.SpecialMethodInvocation
        public net.bytebuddy.utility.JavaConstant.MethodHandle toMethodHandle() {
                r2 = this;
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r2.methodDescription
                boolean r0 = r0.isStatic()
                if (r0 == 0) goto Lf
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r2.methodDescription
                net.bytebuddy.utility.JavaConstant$MethodHandle r0 = net.bytebuddy.utility.JavaConstant.MethodHandle.of(r0)
                goto L17
            Lf:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r2.methodDescription
                net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
                net.bytebuddy.utility.JavaConstant$MethodHandle r0 = net.bytebuddy.utility.JavaConstant.MethodHandle.ofSpecial(r0, r1)
            L17:
                return r0
        }

        @Override // net.bytebuddy.implementation.Implementation.SpecialMethodInvocation
        public net.bytebuddy.implementation.Implementation.SpecialMethodInvocation withCheckedCompatibilityTo(net.bytebuddy.description.method.MethodDescription.TypeToken r5) {
                r4 = this;
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r4.methodDescription
                net.bytebuddy.description.method.MethodDescription$TypeToken r0 = r0.asTypeToken()
                net.bytebuddy.description.method.MethodDescription$TypeToken r1 = new net.bytebuddy.description.method.MethodDescription$TypeToken
                net.bytebuddy.description.type.TypeDescription r2 = r5.getReturnType()
                java.util.List r5 = r5.getParameterTypes()
                net.bytebuddy.description.type.TypeList r3 = r4.prependedParameters
                java.util.List r5 = net.bytebuddy.utility.CompoundList.of(r5, r3)
                r1.<init>(r2, r5)
                boolean r5 = r0.equals(r1)
                if (r5 == 0) goto L20
                return r4
            L20:
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation$Illegal r5 = net.bytebuddy.implementation.Implementation.SpecialMethodInvocation.Illegal.INSTANCE
                return r5
        }
    }

    public RebaseImplementationTarget(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.dynamic.scaffold.MethodGraph.Linked r2, net.bytebuddy.implementation.Implementation.Target.AbstractBase.DefaultMethodInvocation r3, java.util.Map<net.bytebuddy.description.method.MethodDescription.SignatureToken, net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution> r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.rebaseableMethods = r4
            return
    }

    private net.bytebuddy.implementation.Implementation.SpecialMethodInvocation invokeSuper(net.bytebuddy.dynamic.scaffold.MethodGraph.Node r3) {
            r2 = this;
            net.bytebuddy.description.type.TypeDescription r0 = r2.instrumentedType
            net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getSuperClass()
            net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Sort r1 = r3.getSort()
            boolean r1 = r1.isResolved()
            if (r1 == 0) goto L1f
            if (r0 == 0) goto L1f
            net.bytebuddy.description.method.MethodDescription r3 = r3.getRepresentative()
            net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
            net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r3 = net.bytebuddy.implementation.Implementation.SpecialMethodInvocation.Simple.of(r3, r0)
            goto L21
        L1f:
            net.bytebuddy.implementation.Implementation$SpecialMethodInvocation$Illegal r3 = net.bytebuddy.implementation.Implementation.SpecialMethodInvocation.Illegal.INSTANCE
        L21:
            return r3
    }

    private net.bytebuddy.implementation.Implementation.SpecialMethodInvocation invokeSuper(net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution r3) {
            r2 = this;
            boolean r0 = r3.isRebased()
            if (r0 == 0) goto L15
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r3.getResolvedMethod()
            net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
            net.bytebuddy.description.type.TypeList r3 = r3.getAppendedParameters()
            net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r3 = net.bytebuddy.dynamic.scaffold.inline.RebaseImplementationTarget.RebasedMethodInvocation.of(r0, r1, r3)
            goto L1f
        L15:
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = r3.getResolvedMethod()
            net.bytebuddy.description.type.TypeDescription r0 = r2.instrumentedType
            net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r3 = net.bytebuddy.implementation.Implementation.SpecialMethodInvocation.Simple.of(r3, r0)
        L1f:
            return r3
    }

    public static net.bytebuddy.implementation.Implementation.Target of(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.dynamic.scaffold.MethodGraph.Linked r2, net.bytebuddy.ClassFileVersion r3, net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver r4) {
            net.bytebuddy.dynamic.scaffold.inline.RebaseImplementationTarget r0 = new net.bytebuddy.dynamic.scaffold.inline.RebaseImplementationTarget
            net.bytebuddy.implementation.Implementation$Target$AbstractBase$DefaultMethodInvocation r3 = net.bytebuddy.implementation.Implementation.Target.AbstractBase.DefaultMethodInvocation.of(r3)
            java.util.Map r4 = r4.asTokenMap()
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Override // net.bytebuddy.implementation.Implementation.Target.AbstractBase
    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
            r4 = this;
            boolean r0 = super.equals(r5)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = 1
            if (r4 != r5) goto Lc
            return r0
        Lc:
            if (r5 != 0) goto Lf
            return r1
        Lf:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L1a
            return r1
        L1a:
            java.util.Map<net.bytebuddy.description.method.MethodDescription$SignatureToken, net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution> r2 = r4.rebaseableMethods
            net.bytebuddy.dynamic.scaffold.inline.RebaseImplementationTarget r5 = (net.bytebuddy.dynamic.scaffold.inline.RebaseImplementationTarget) r5
            java.util.Map<net.bytebuddy.description.method.MethodDescription$SignatureToken, net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution> r5 = r5.rebaseableMethods
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L27
            return r1
        L27:
            return r0
    }

    @Override // net.bytebuddy.implementation.Implementation.Target
    public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getOriginType() {
            r1 = this;
            net.bytebuddy.description.type.TypeDescription r0 = r1.getOriginType()
            return r0
    }

    @Override // net.bytebuddy.implementation.Implementation.Target
    public net.bytebuddy.description.type.TypeDescription getOriginType() {
            r1 = this;
            net.bytebuddy.description.type.TypeDescription r0 = r1.instrumentedType
            return r0
    }

    @Override // net.bytebuddy.implementation.Implementation.Target.AbstractBase
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            java.util.Map<net.bytebuddy.description.method.MethodDescription$SignatureToken, net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution> r1 = r2.rebaseableMethods
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // net.bytebuddy.implementation.Implementation.Target
    public net.bytebuddy.implementation.Implementation.SpecialMethodInvocation invokeSuper(net.bytebuddy.description.method.MethodDescription.SignatureToken r2) {
            r1 = this;
            java.util.Map<net.bytebuddy.description.method.MethodDescription$SignatureToken, net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution> r0 = r1.rebaseableMethods
            java.lang.Object r0 = r0.get(r2)
            net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution r0 = (net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution) r0
            if (r0 != 0) goto L19
            net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r0 = r1.methodGraph
            net.bytebuddy.dynamic.scaffold.MethodGraph r0 = r0.getSuperClassGraph()
            net.bytebuddy.dynamic.scaffold.MethodGraph$Node r2 = r0.locate(r2)
            net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r2 = r1.invokeSuper(r2)
            goto L1d
        L19:
            net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r2 = r1.invokeSuper(r0)
        L1d:
            return r2
    }
}
