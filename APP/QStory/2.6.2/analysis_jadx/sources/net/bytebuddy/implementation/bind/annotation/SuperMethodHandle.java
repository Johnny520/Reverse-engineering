package net.bytebuddy.implementation.bind.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.method.MethodList;
import net.bytebuddy.description.method.ParameterDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.constant.NullConstant;
import net.bytebuddy.matcher.ElementMatchers;
import net.bytebuddy.utility.JavaType;
import p144.C7546;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface SuperMethodHandle {

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum Binder implements TargetMethodAnnotationDrivenBinder.ParameterBinder<SuperMethodHandle> {
        INSTANCE;

        private static final MethodDescription.InDefinedShape FALLBACK_TO_DEFAULT;
        private static final MethodDescription.InDefinedShape NULL_IF_IMPOSSIBLE;

        static {
            MethodList<MethodDescription.InDefinedShape> declaredMethods = TypeDescription.ForLoadedType.of(SuperMethodHandle.class).getDeclaredMethods();
            FALLBACK_TO_DEFAULT = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("fallbackToDefault")).getOnly();
            NULL_IF_IMPOSSIBLE = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("nullIfImpossible")).getOnly();
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public MethodDelegationBinder.ParameterBinding<?> bind(AnnotationDescription.Loadable<SuperMethodHandle> loadable, MethodDescription methodDescription, ParameterDescription parameterDescription, Implementation.Target target, Assigner assigner, Assigner.Typing typing) {
            if (!parameterDescription.getType().asErasure().isAssignableFrom(JavaType.METHOD_HANDLE.getTypeStub())) {
                C7546.m12745(parameterDescription, "Cannot assign MethodHandle type to ");
                return null;
            }
            if (!methodDescription.isMethod()) {
                return ((Boolean) loadable.getValue(NULL_IF_IMPOSSIBLE).resolve(Boolean.class)).booleanValue() ? new MethodDelegationBinder.ParameterBinding.Anonymous(NullConstant.INSTANCE) : MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE;
            }
            Implementation.SpecialMethodInvocation specialMethodInvocationWithCheckedCompatibilityTo = (((Boolean) loadable.getValue(FALLBACK_TO_DEFAULT).resolve(Boolean.class)).booleanValue() ? target.invokeDominant(methodDescription.asSignatureToken()) : target.invokeSuper(methodDescription.asSignatureToken())).withCheckedCompatibilityTo(methodDescription.asTypeToken());
            return specialMethodInvocationWithCheckedCompatibilityTo.isValid() ? new MethodDelegationBinder.ParameterBinding.Anonymous(specialMethodInvocationWithCheckedCompatibilityTo.toMethodHandle().toStackManipulation()) : ((Boolean) loadable.getValue(NULL_IF_IMPOSSIBLE).resolve(Boolean.class)).booleanValue() ? new MethodDelegationBinder.ParameterBinding.Anonymous(NullConstant.INSTANCE) : MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE;
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public Class<SuperMethodHandle> getHandledType() {
            return SuperMethodHandle.class;
        }
    }

    boolean fallbackToDefault() default true;

    boolean nullIfImpossible() default false;
}
