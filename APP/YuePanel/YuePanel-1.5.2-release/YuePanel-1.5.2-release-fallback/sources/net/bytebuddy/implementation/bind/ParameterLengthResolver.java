package net.bytebuddy.implementation.bind;

/* JADX INFO: loaded from: classes2.dex */
public enum ParameterLengthResolver extends java.lang.Enum<net.bytebuddy.implementation.bind.ParameterLengthResolver> implements net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver {
    private static final /* synthetic */ net.bytebuddy.implementation.bind.ParameterLengthResolver[] $VALUES = null;
    public static final net.bytebuddy.implementation.bind.ParameterLengthResolver INSTANCE = null;

    static {
            net.bytebuddy.implementation.bind.ParameterLengthResolver r0 = new net.bytebuddy.implementation.bind.ParameterLengthResolver
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            net.bytebuddy.implementation.bind.ParameterLengthResolver.INSTANCE = r0
            net.bytebuddy.implementation.bind.ParameterLengthResolver[] r0 = new net.bytebuddy.implementation.bind.ParameterLengthResolver[]{r0}
            net.bytebuddy.implementation.bind.ParameterLengthResolver.$VALUES = r0
            return
    }

    ParameterLengthResolver(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static net.bytebuddy.implementation.bind.ParameterLengthResolver valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bind.ParameterLengthResolver> r0 = net.bytebuddy.implementation.bind.ParameterLengthResolver.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bind.ParameterLengthResolver r1 = (net.bytebuddy.implementation.bind.ParameterLengthResolver) r1
            return r1
    }

    public static net.bytebuddy.implementation.bind.ParameterLengthResolver[] values() {
            net.bytebuddy.implementation.bind.ParameterLengthResolver[] r0 = net.bytebuddy.implementation.bind.ParameterLengthResolver.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bind.ParameterLengthResolver[] r0 = (net.bytebuddy.implementation.bind.ParameterLengthResolver[]) r0
            return r0
    }

    @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver
    public net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution resolve(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding r2, net.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding r3) {
            r0 = this;
            net.bytebuddy.description.method.MethodDescription r1 = r2.getTarget()
            net.bytebuddy.description.method.ParameterList r1 = r1.getParameters()
            int r1 = r1.size()
            net.bytebuddy.description.method.MethodDescription r2 = r3.getTarget()
            net.bytebuddy.description.method.ParameterList r2 = r2.getParameters()
            int r2 = r2.size()
            if (r1 != r2) goto L1d
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r1 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.AMBIGUOUS
            return r1
        L1d:
            if (r1 >= r2) goto L22
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r1 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.RIGHT
            return r1
        L22:
            net.bytebuddy.implementation.bind.MethodDelegationBinder$AmbiguityResolver$Resolution r1 = net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver.Resolution.LEFT
            return r1
    }
}
