package net.bytebuddy.implementation.bind;

/* JADX INFO: loaded from: classes2.dex */
public enum MethodNameEqualityResolver extends java.lang.Enum<net.bytebuddy.implementation.bind.MethodNameEqualityResolver> implements net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver {
    private static final /* synthetic */ net.bytebuddy.implementation.bind.MethodNameEqualityResolver[] $VALUES = null;
    public static final net.bytebuddy.implementation.bind.MethodNameEqualityResolver INSTANCE = null;

    static {
            net.bytebuddy.implementation.bind.MethodNameEqualityResolver r0 = new net.bytebuddy.implementation.bind.MethodNameEqualityResolver
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            net.bytebuddy.implementation.bind.MethodNameEqualityResolver.INSTANCE = r0
            net.bytebuddy.implementation.bind.MethodNameEqualityResolver[] r0 = new net.bytebuddy.implementation.bind.MethodNameEqualityResolver[]{r0}
            net.bytebuddy.implementation.bind.MethodNameEqualityResolver.$VALUES = r0
            return
    }

    MethodNameEqualityResolver(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static net.bytebuddy.implementation.bind.MethodNameEqualityResolver valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bind.MethodNameEqualityResolver> r0 = net.bytebuddy.implementation.bind.MethodNameEqualityResolver.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bind.MethodNameEqualityResolver r1 = (net.bytebuddy.implementation.bind.MethodNameEqualityResolver) r1
            return r1
    }

    public static net.bytebuddy.implementation.bind.MethodNameEqualityResolver[] values() {
            net.bytebuddy.implementation.bind.MethodNameEqualityResolver[] r0 = net.bytebuddy.implementation.bind.MethodNameEqualityResolver.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bind.MethodNameEqualityResolver[] r0 = (net.bytebuddy.implementation.bind.MethodNameEqualityResolver[]) r0
            return r0
    }

    @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver
    public net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution resolve(net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding r3, net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding r4) {
            r1 = this;
            net.bytebuddy.description.method.MethodDescription r3 = r3.getTarget()
            java.lang.String r3 = r3.getName()
            java.lang.String r0 = r2.getName()
            boolean r3 = r3.equals(r0)
            net.bytebuddy.description.method.MethodDescription r4 = r4.getTarget()
            java.lang.String r4 = r4.getName()
            java.lang.String r2 = r2.getName()
            boolean r2 = r4.equals(r2)
            r2 = r2 ^ r3
            if (r2 == 0) goto L2b
            if (r3 == 0) goto L28
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r2 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.LEFT
            goto L2a
        L28:
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r2 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.RIGHT
        L2a:
            return r2
        L2b:
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r2 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.AMBIGUOUS
            return r2
    }
}
