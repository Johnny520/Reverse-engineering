package net.bytebuddy.implementation.bind;

import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public enum ParameterLengthResolver implements MethodDelegationBinder.AmbiguityResolver {
    INSTANCE;

    @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver
    public MethodDelegationBinder.AmbiguityResolver.Resolution resolve(MethodDescription methodDescription, MethodDelegationBinder.MethodBinding methodBinding, MethodDelegationBinder.MethodBinding methodBinding2) {
        int size = methodBinding.getTarget().getParameters().size();
        int size2 = methodBinding2.getTarget().getParameters().size();
        return size == size2 ? MethodDelegationBinder.AmbiguityResolver.Resolution.AMBIGUOUS : size < size2 ? MethodDelegationBinder.AmbiguityResolver.Resolution.RIGHT : MethodDelegationBinder.AmbiguityResolver.Resolution.LEFT;
    }
}
