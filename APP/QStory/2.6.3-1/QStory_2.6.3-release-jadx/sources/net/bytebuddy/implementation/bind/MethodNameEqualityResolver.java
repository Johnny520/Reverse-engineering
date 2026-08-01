package net.bytebuddy.implementation.bind;

import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public enum MethodNameEqualityResolver implements MethodDelegationBinder.AmbiguityResolver {
    INSTANCE;

    @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver
    public MethodDelegationBinder.AmbiguityResolver.Resolution resolve(MethodDescription methodDescription, MethodDelegationBinder.MethodBinding methodBinding, MethodDelegationBinder.MethodBinding methodBinding2) {
        boolean zEquals = methodBinding.getTarget().getName().equals(methodDescription.getName());
        return methodBinding2.getTarget().getName().equals(methodDescription.getName()) ^ zEquals ? zEquals ? MethodDelegationBinder.AmbiguityResolver.Resolution.LEFT : MethodDelegationBinder.AmbiguityResolver.Resolution.RIGHT : MethodDelegationBinder.AmbiguityResolver.Resolution.AMBIGUOUS;
    }
}
