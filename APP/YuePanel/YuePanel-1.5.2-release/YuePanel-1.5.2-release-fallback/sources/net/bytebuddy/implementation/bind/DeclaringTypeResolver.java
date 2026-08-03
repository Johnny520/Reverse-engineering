package net.bytebuddy.implementation.bind;

/* JADX INFO: loaded from: classes2.dex */
public enum DeclaringTypeResolver extends java.lang.Enum<net.bytebuddy.implementation.bind.DeclaringTypeResolver> implements net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver {
    private static final /* synthetic */ net.bytebuddy.implementation.bind.DeclaringTypeResolver[] $VALUES = null;
    public static final net.bytebuddy.implementation.bind.DeclaringTypeResolver INSTANCE = null;

    static {
            net.bytebuddy.implementation.bind.DeclaringTypeResolver r0 = new net.bytebuddy.implementation.bind.DeclaringTypeResolver
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            net.bytebuddy.implementation.bind.DeclaringTypeResolver.INSTANCE = r0
            net.bytebuddy.implementation.bind.DeclaringTypeResolver[] r0 = new net.bytebuddy.implementation.bind.DeclaringTypeResolver[]{r0}
            net.bytebuddy.implementation.bind.DeclaringTypeResolver.$VALUES = r0
            return
    }

    DeclaringTypeResolver(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static net.bytebuddy.implementation.bind.DeclaringTypeResolver valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bind.DeclaringTypeResolver> r0 = net.bytebuddy.implementation.bind.DeclaringTypeResolver.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bind.DeclaringTypeResolver r1 = (net.bytebuddy.implementation.bind.DeclaringTypeResolver) r1
            return r1
    }

    public static net.bytebuddy.implementation.bind.DeclaringTypeResolver[] values() {
            net.bytebuddy.implementation.bind.DeclaringTypeResolver[] r0 = net.bytebuddy.implementation.bind.DeclaringTypeResolver.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bind.DeclaringTypeResolver[] r0 = (net.bytebuddy.implementation.bind.DeclaringTypeResolver[]) r0
            return r0
    }

    @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver
    public net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution resolve(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding r2, net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding r3) {
            r0 = this;
            net.bytebuddy.description.method.MethodDescription r1 = r2.getTarget()
            net.bytebuddy.description.type.TypeDefinition r1 = r1.getDeclaringType()
            net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
            net.bytebuddy.description.method.MethodDescription r2 = r3.getTarget()
            net.bytebuddy.description.type.TypeDefinition r2 = r2.getDeclaringType()
            net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
            boolean r3 = r1.equals(r2)
            if (r3 == 0) goto L21
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r1 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.AMBIGUOUS
            return r1
        L21:
            boolean r3 = r1.isAssignableFrom(r2)
            if (r3 == 0) goto L2a
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r1 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.RIGHT
            return r1
        L2a:
            boolean r1 = r1.isAssignableTo(r2)
            if (r1 == 0) goto L33
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r1 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.LEFT
            return r1
        L33:
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r1 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.AMBIGUOUS
            return r1
    }
}
