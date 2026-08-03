package net.bytebuddy.implementation;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class DefaultMethodCall implements net.bytebuddy.implementation.Implementation {
    private final java.util.List<net.bytebuddy.description.type.TypeDescription> prioritizedInterfaces;

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Appender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
        private final net.bytebuddy.implementation.Implementation.Target implementationTarget;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE)
        private final java.util.Set<net.bytebuddy.description.type.TypeDescription> nonPrioritizedInterfaces;
        private final java.util.List<net.bytebuddy.description.type.TypeDescription> prioritizedInterfaces;

        public Appender(net.bytebuddy.implementation.Implementation.Target r2, java.util.List<net.bytebuddy.description.type.TypeDescription> r3) {
                r1 = this;
                r1.<init>()
                r1.implementationTarget = r2
                r1.prioritizedInterfaces = r3
                java.util.HashSet r0 = new java.util.HashSet
                net.bytebuddy.description.type.TypeDescription r2 = r2.getInstrumentedType()
                net.bytebuddy.description.type.TypeList$Generic r2 = r2.getInterfaces()
                net.bytebuddy.description.type.TypeList r2 = r2.asErasures()
                r0.<init>(r2)
                r1.nonPrioritizedInterfaces = r0
                r0.removeAll(r3)
                return
        }

        private net.bytebuddy.implementation.bytecode.StackManipulation locateDefault(net.bytebuddy.description.method.MethodDescription r6) {
                r5 = this;
                net.bytebuddy.description.method.MethodDescription$SignatureToken r0 = r6.asSignatureToken()
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation$Illegal r1 = net.bytebuddy.implementation.Implementation.SpecialMethodInvocation.Illegal.INSTANCE
                java.util.List<net.bytebuddy.description.type.TypeDescription> r2 = r5.prioritizedInterfaces
                java.util.Iterator r2 = r2.iterator()
            Lc:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L2d
                java.lang.Object r1 = r2.next()
                net.bytebuddy.description.type.TypeDescription r1 = (net.bytebuddy.description.type.TypeDescription) r1
                net.bytebuddy.implementation.Implementation$Target r3 = r5.implementationTarget
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r1 = r3.invokeDefault(r0, r1)
                net.bytebuddy.description.method.MethodDescription$TypeToken r3 = r6.asTypeToken()
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r1 = r1.withCheckedCompatibilityTo(r3)
                boolean r3 = r1.isValid()
                if (r3 == 0) goto Lc
                return r1
            L2d:
                java.util.Set<net.bytebuddy.description.type.TypeDescription> r2 = r5.nonPrioritizedInterfaces
                java.util.Iterator r2 = r2.iterator()
            L33:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L86
                java.lang.Object r3 = r2.next()
                net.bytebuddy.description.type.TypeDescription r3 = (net.bytebuddy.description.type.TypeDescription) r3
                net.bytebuddy.implementation.Implementation$Target r4 = r5.implementationTarget
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r3 = r4.invokeDefault(r0, r3)
                net.bytebuddy.description.method.MethodDescription$TypeToken r4 = r6.asTypeToken()
                net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r3 = r3.withCheckedCompatibilityTo(r4)
                boolean r4 = r1.isValid()
                if (r4 == 0) goto L84
                boolean r4 = r3.isValid()
                if (r4 != 0) goto L5a
                goto L84
            L5a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r6)
                java.lang.String r6 = " has an ambiguous default method with "
                r2.append(r6)
                net.bytebuddy.description.method.MethodDescription r6 = r3.getMethodDescription()
                r2.append(r6)
                java.lang.String r6 = " and "
                r2.append(r6)
                net.bytebuddy.description.method.MethodDescription r6 = r1.getMethodDescription()
                r2.append(r6)
                java.lang.String r6 = r2.toString()
                r0.<init>(r6)
                throw r0
            L84:
                r1 = r3
                goto L33
            L86:
                return r1
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r7, net.bytebuddy.implementation.Implementation.Context r8, net.bytebuddy.description.method.MethodDescription r9) {
                r6 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = r6.locateDefault(r9)
                boolean r1 = r0.isValid()
                if (r1 == 0) goto L3d
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r1 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading r2 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.allArgumentsOf(r9)
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = r2.prependThisReference()
                net.bytebuddy.description.type.TypeDescription$Generic r3 = r9.getReturnType()
                net.bytebuddy.implementation.bytecode.StackManipulation r3 = net.bytebuddy.implementation.bytecode.member.MethodReturn.of(r3)
                r4 = 3
                net.bytebuddy.implementation.bytecode.StackManipulation[] r4 = new net.bytebuddy.implementation.bytecode.StackManipulation[r4]
                r5 = 0
                r4[r5] = r2
                r2 = 1
                r4[r2] = r0
                r0 = 2
                r4[r0] = r3
                r1.<init>(r4)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r7 = r1.apply(r7, r8)
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r8 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                int r7 = r7.getMaximalSize()
                int r9 = r9.getStackSize()
                r8.<init>(r7, r9)
                return r8
            L3d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "Cannot invoke default method on "
                r8.append(r0)
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                r7.<init>(r8)
                throw r7
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
                net.bytebuddy.implementation.Implementation$Target r2 = r4.implementationTarget
                net.bytebuddy.implementation.DefaultMethodCall$Appender r5 = (net.bytebuddy.implementation.DefaultMethodCall.Appender) r5
                net.bytebuddy.implementation.Implementation$Target r3 = r5.implementationTarget
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                java.util.List<net.bytebuddy.description.type.TypeDescription> r2 = r4.prioritizedInterfaces
                java.util.List<net.bytebuddy.description.type.TypeDescription> r5 = r5.prioritizedInterfaces
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
                net.bytebuddy.implementation.Implementation$Target r1 = r2.implementationTarget
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<net.bytebuddy.description.type.TypeDescription> r1 = r2.prioritizedInterfaces
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    public DefaultMethodCall(java.util.List<net.bytebuddy.description.type.TypeDescription> r1) {
            r0 = this;
            r0.<init>()
            r0.prioritizedInterfaces = r1
            return
    }

    private java.util.List<net.bytebuddy.description.type.TypeDescription> filterRelevant(net.bytebuddy.description.type.TypeDescription r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<net.bytebuddy.description.type.TypeDescription> r1 = r4.prioritizedInterfaces
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.HashSet r1 = new java.util.HashSet
            net.bytebuddy.description.type.TypeList$Generic r5 = r5.getInterfaces()
            net.bytebuddy.description.type.TypeList r5 = r5.asErasures()
            r1.<init>(r5)
            java.util.List<net.bytebuddy.description.type.TypeDescription> r5 = r4.prioritizedInterfaces
            java.util.Iterator r5 = r5.iterator()
        L1e:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r5.next()
            net.bytebuddy.description.type.TypeDescription r2 = (net.bytebuddy.description.type.TypeDescription) r2
            boolean r3 = r1.remove(r2)
            if (r3 == 0) goto L1e
            r0.add(r2)
            goto L1e
        L34:
            return r0
    }

    public static net.bytebuddy.implementation.Implementation prioritize(java.lang.Iterable<? extends java.lang.Class<?>> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r2.next()
            java.lang.Class r1 = (java.lang.Class) r1
            r0.add(r1)
            goto L9
        L19:
            net.bytebuddy.description.type.TypeList$ForLoadedTypes r2 = new net.bytebuddy.description.type.TypeList$ForLoadedTypes
            r2.<init>(r0)
            net.bytebuddy.implementation.Implementation r2 = prioritize(r2)
            return r2
    }

    public static net.bytebuddy.implementation.Implementation prioritize(java.util.Collection<? extends net.bytebuddy.description.type.TypeDescription> r2) {
            net.bytebuddy.implementation.DefaultMethodCall r0 = new net.bytebuddy.implementation.DefaultMethodCall
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static net.bytebuddy.implementation.Implementation prioritize(java.lang.Class<?>... r1) {
            net.bytebuddy.description.type.TypeList$ForLoadedTypes r0 = new net.bytebuddy.description.type.TypeList$ForLoadedTypes
            r0.<init>(r1)
            net.bytebuddy.implementation.Implementation r1 = prioritize(r0)
            return r1
    }

    public static net.bytebuddy.implementation.Implementation prioritize(net.bytebuddy.description.type.TypeDescription... r0) {
            java.util.List r0 = java.util.Arrays.asList(r0)
            net.bytebuddy.implementation.Implementation r0 = prioritize(r0)
            return r0
    }

    public static net.bytebuddy.implementation.Implementation unambiguousOnly() {
            net.bytebuddy.implementation.DefaultMethodCall r0 = new net.bytebuddy.implementation.DefaultMethodCall
            java.util.List r1 = java.util.Collections.emptyList()
            r0.<init>(r1)
            return r0
    }

    @Override // net.bytebuddy.implementation.Implementation
    public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r3) {
            r2 = this;
            net.bytebuddy.implementation.DefaultMethodCall$Appender r0 = new net.bytebuddy.implementation.DefaultMethodCall$Appender
            net.bytebuddy.description.type.TypeDescription r1 = r3.getInstrumentedType()
            java.util.List r1 = r2.filterRelevant(r1)
            r0.<init>(r3, r1)
            return r0
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
            java.util.List<net.bytebuddy.description.type.TypeDescription> r2 = r4.prioritizedInterfaces
            net.bytebuddy.implementation.DefaultMethodCall r5 = (net.bytebuddy.implementation.DefaultMethodCall) r5
            java.util.List<net.bytebuddy.description.type.TypeDescription> r5 = r5.prioritizedInterfaces
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
            java.util.List<net.bytebuddy.description.type.TypeDescription> r1 = r2.prioritizedInterfaces
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
            r0 = this;
            return r1
    }
}
