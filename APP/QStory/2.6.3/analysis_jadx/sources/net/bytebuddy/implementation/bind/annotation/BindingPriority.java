package net.bytebuddy.implementation.bind.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import net.bytebuddy.matcher.ElementMatchers;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface BindingPriority {
    public static final int DEFAULT = 1;

    int value();

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Resolver implements MethodDelegationBinder.AmbiguityResolver {
        INSTANCE;

        private static final MethodDescription.InDefinedShape VALUE = (MethodDescription.InDefinedShape) TypeDescription.ForLoadedType.of(BindingPriority.class).getDeclaredMethods().filter(ElementMatchers.named("value")).getOnly();

        @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver
        public MethodDelegationBinder.AmbiguityResolver.Resolution resolve(MethodDescription methodDescription, MethodDelegationBinder.MethodBinding methodBinding, MethodDelegationBinder.MethodBinding methodBinding2) {
            int iResolve = resolve(methodBinding.getTarget().getDeclaredAnnotations().ofType(BindingPriority.class));
            int iResolve2 = resolve(methodBinding2.getTarget().getDeclaredAnnotations().ofType(BindingPriority.class));
            return iResolve == iResolve2 ? MethodDelegationBinder.AmbiguityResolver.Resolution.AMBIGUOUS : iResolve < iResolve2 ? MethodDelegationBinder.AmbiguityResolver.Resolution.RIGHT : MethodDelegationBinder.AmbiguityResolver.Resolution.LEFT;
        }

        private static int resolve(@MaybeNull AnnotationDescription.Loadable<BindingPriority> loadable) {
            if (loadable == null) {
                return 1;
            }
            return ((Integer) loadable.getValue(VALUE).resolve(Integer.class)).intValue();
        }
    }
}
