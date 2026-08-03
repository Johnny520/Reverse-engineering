package net.bytebuddy.dynamic.scaffold.subclass;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class SubclassImplementationTarget extends net.bytebuddy.implementation.Implementation.Target.AbstractBase {
    protected final net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.OriginTypeResolver originTypeResolver;

    /* JADX INFO: renamed from: net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public enum Factory extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.Factory> implements net.bytebuddy.implementation.Implementation.Target.Factory {
        private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.Factory[] $VALUES = null;
        public static final net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.Factory LEVEL_TYPE = null;
        public static final net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.Factory SUPER_CLASS = null;
        private final net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.OriginTypeResolver originTypeResolver;

        static {
                net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$Factory r0 = new net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$Factory
                r1 = 0
                net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$OriginTypeResolver r2 = net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.OriginTypeResolver.SUPER_CLASS
                java.lang.String r3 = "SUPER_CLASS"
                r0.<init>(r3, r1, r2)
                net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.Factory.SUPER_CLASS = r0
                net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$Factory r1 = new net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$Factory
                r2 = 1
                net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$OriginTypeResolver r3 = net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.OriginTypeResolver.LEVEL_TYPE
                java.lang.String r4 = "LEVEL_TYPE"
                r1.<init>(r4, r2, r3)
                net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.Factory.LEVEL_TYPE = r1
                net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$Factory[] r0 = new net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.Factory[]{r0, r1}
                net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.Factory.$VALUES = r0
                return
        }

        Factory(java.lang.String r1, int r2, net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.OriginTypeResolver r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.originTypeResolver = r3
                return
        }

        public static net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.Factory valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$Factory> r0 = net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.Factory.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$Factory r1 = (net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.Factory) r1
                return r1
        }

        public static net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.Factory[] values() {
                net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$Factory[] r0 = net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.Factory.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$Factory[] r0 = (net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.Factory[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.Implementation.Target.Factory
        public net.bytebuddy.implementation.Implementation.Target make(net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.dynamic.scaffold.MethodGraph.Linked r4, net.bytebuddy.ClassFileVersion r5) {
                r2 = this;
                net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget r0 = new net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget
                net.bytebuddy.implementation.Implementation$Target$AbstractBase$DefaultMethodInvocation r5 = net.bytebuddy.implementation.Implementation.Target.AbstractBase.DefaultMethodInvocation.of(r5)
                net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$OriginTypeResolver r1 = r2.originTypeResolver
                r0.<init>(r3, r4, r5, r1)
                return r0
        }
    }

    public enum OriginTypeResolver extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.OriginTypeResolver> {
        private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.OriginTypeResolver[] $VALUES = null;
        public static final net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.OriginTypeResolver LEVEL_TYPE = null;
        public static final net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.OriginTypeResolver SUPER_CLASS = null;



        static {
                net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$OriginTypeResolver$1 r0 = new net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$OriginTypeResolver$1
                java.lang.String r1 = "SUPER_CLASS"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.OriginTypeResolver.SUPER_CLASS = r0
                net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$OriginTypeResolver$2 r1 = new net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$OriginTypeResolver$2
                java.lang.String r3 = "LEVEL_TYPE"
                r4 = 1
                r1.<init>(r3, r4)
                net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.OriginTypeResolver.LEVEL_TYPE = r1
                r3 = 2
                net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$OriginTypeResolver[] r3 = new net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.OriginTypeResolver[r3]
                r3[r2] = r0
                r3[r4] = r1
                net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.OriginTypeResolver.$VALUES = r3
                return
        }

        OriginTypeResolver(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ OriginTypeResolver(java.lang.String r1, int r2, net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.OriginTypeResolver valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$OriginTypeResolver> r0 = net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.OriginTypeResolver.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$OriginTypeResolver r1 = (net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.OriginTypeResolver) r1
                return r1
        }

        public static net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.OriginTypeResolver[] values() {
                net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$OriginTypeResolver[] r0 = net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.OriginTypeResolver.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$OriginTypeResolver[] r0 = (net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.OriginTypeResolver[]) r0
                return r0
        }

        public abstract net.bytebuddy.description.type.TypeDefinition identify(net.bytebuddy.description.type.TypeDescription r1);
    }

    public SubclassImplementationTarget(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.dynamic.scaffold.MethodGraph.Linked r2, net.bytebuddy.implementation.Implementation.Target.AbstractBase.DefaultMethodInvocation r3, net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.OriginTypeResolver r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.originTypeResolver = r4
            return
    }

    private net.bytebuddy.implementation.Implementation.SpecialMethodInvocation invokeConstructor(net.bytebuddy.description.method.MethodDescription.SignatureToken r4) {
            r3 = this;
            net.bytebuddy.description.type.TypeDescription r0 = r3.instrumentedType
            net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getSuperClass()
            if (r0 != 0) goto Le
            net.bytebuddy.description.method.MethodList$Empty r4 = new net.bytebuddy.description.method.MethodList$Empty
            r4.<init>()
            goto L26
        Le:
            net.bytebuddy.description.method.MethodList r1 = r0.getDeclaredMethods()
            net.bytebuddy.matcher.ElementMatcher$Junction r4 = net.bytebuddy.matcher.ElementMatchers.hasSignature(r4)
            net.bytebuddy.description.type.TypeDescription r2 = r3.instrumentedType
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isVisibleTo(r2)
            net.bytebuddy.matcher.ElementMatcher$Junction r4 = r4.and(r2)
            net.bytebuddy.matcher.FilterableList r4 = r1.filter(r4)
            net.bytebuddy.description.method.MethodList r4 = (net.bytebuddy.description.method.MethodList) r4
        L26:
            int r1 = r4.size()
            r2 = 1
            if (r1 != r2) goto L3c
            java.lang.Object r4 = r4.getOnly()
            net.bytebuddy.description.method.MethodDescription r4 = (net.bytebuddy.description.method.MethodDescription) r4
            net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
            net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r4 = net.bytebuddy.implementation.Implementation.SpecialMethodInvocation.Simple.of(r4, r0)
            goto L3e
        L3c:
            net.bytebuddy.implementation.Implementation$SpecialMethodInvocation$Illegal r4 = net.bytebuddy.implementation.Implementation.SpecialMethodInvocation.Illegal.INSTANCE
        L3e:
            return r4
    }

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming super class for given instance.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
    private net.bytebuddy.implementation.Implementation.SpecialMethodInvocation invokeMethod(net.bytebuddy.description.method.MethodDescription.SignatureToken r2) {
            r1 = this;
            net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r0 = r1.methodGraph
            net.bytebuddy.dynamic.scaffold.MethodGraph r0 = r0.getSuperClassGraph()
            net.bytebuddy.dynamic.scaffold.MethodGraph$Node r2 = r0.locate(r2)
            net.bytebuddy.dynamic.scaffold.MethodGraph$Node$Sort r0 = r2.getSort()
            boolean r0 = r0.isUnique()
            if (r0 == 0) goto L27
            net.bytebuddy.description.method.MethodDescription r2 = r2.getRepresentative()
            net.bytebuddy.description.type.TypeDescription r0 = r1.instrumentedType
            net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getSuperClass()
            net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
            net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r2 = net.bytebuddy.implementation.Implementation.SpecialMethodInvocation.Simple.of(r2, r0)
            goto L29
        L27:
            net.bytebuddy.implementation.Implementation$SpecialMethodInvocation$Illegal r2 = net.bytebuddy.implementation.Implementation.SpecialMethodInvocation.Illegal.INSTANCE
        L29:
            return r2
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
            net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$OriginTypeResolver r2 = r4.originTypeResolver
            net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget r5 = (net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget) r5
            net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$OriginTypeResolver r5 = r5.originTypeResolver
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L27
            return r1
        L27:
            return r0
    }

    @Override // net.bytebuddy.implementation.Implementation.Target
    public net.bytebuddy.description.type.TypeDefinition getOriginType() {
            r2 = this;
            net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$OriginTypeResolver r0 = r2.originTypeResolver
            net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
            net.bytebuddy.description.type.TypeDefinition r0 = r0.identify(r1)
            return r0
    }

    @Override // net.bytebuddy.implementation.Implementation.Target.AbstractBase
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$OriginTypeResolver r1 = r2.originTypeResolver
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // net.bytebuddy.implementation.Implementation.Target
    public net.bytebuddy.implementation.Implementation.SpecialMethodInvocation invokeSuper(net.bytebuddy.description.method.MethodDescription.SignatureToken r3) {
            r2 = this;
            java.lang.String r0 = r3.getName()
            java.lang.String r1 = "<init>"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L11
            net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r3 = r2.invokeConstructor(r3)
            goto L15
        L11:
            net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r3 = r2.invokeMethod(r3)
        L15:
            return r3
    }
}
