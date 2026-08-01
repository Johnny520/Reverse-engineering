package net.bytebuddy.implementation.bind.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.Callable;
import lin.xposed.hook.javaplugin.C6385;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.method.MethodList;
import net.bytebuddy.description.method.ParameterDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.auxiliary.MethodCallProxy;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.constant.NullConstant;
import net.bytebuddy.matcher.ElementMatchers;
import net.bytebuddy.utility.nullability.MaybeNull;
import p160.C8376;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface DefaultCall {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Binder implements TargetMethodAnnotationDrivenBinder.ParameterBinder<DefaultCall> {
        INSTANCE;

        private static final MethodDescription.InDefinedShape NULL_IF_IMPOSSIBLE;
        private static final MethodDescription.InDefinedShape SERIALIZABLE_PROXY;
        private static final MethodDescription.InDefinedShape TARGET_TYPE;

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public interface DefaultMethodLocator {

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @HashCodeAndEqualsPlugin.Enhance
            public static class Explicit implements DefaultMethodLocator {
                private final TypeDescription typeDescription;

                public Explicit(TypeDescription typeDescription) {
                    this.typeDescription = typeDescription;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((Explicit) obj).typeDescription);
                }

                public int hashCode() {
                    return this.typeDescription.hashCode() + (getClass().hashCode() * 31);
                }

                @Override // net.bytebuddy.implementation.bind.annotation.DefaultCall.Binder.DefaultMethodLocator
                public Implementation.SpecialMethodInvocation resolve(Implementation.Target target, MethodDescription methodDescription) {
                    if (this.typeDescription.isInterface()) {
                        return target.invokeDefault(methodDescription.asSignatureToken(), this.typeDescription);
                    }
                    C6385.m11438(methodDescription, " method carries default method call parameter on non-interface type");
                    return null;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            public enum Implicit implements DefaultMethodLocator {
                INSTANCE;

                @Override // net.bytebuddy.implementation.bind.annotation.DefaultCall.Binder.DefaultMethodLocator
                public Implementation.SpecialMethodInvocation resolve(Implementation.Target target, MethodDescription methodDescription) {
                    return target.invokeDefault(methodDescription.asSignatureToken());
                }
            }

            Implementation.SpecialMethodInvocation resolve(Implementation.Target target, MethodDescription methodDescription);
        }

        static {
            MethodList<MethodDescription.InDefinedShape> declaredMethods = TypeDescription.ForLoadedType.m289of(DefaultCall.class).getDeclaredMethods();
            TARGET_TYPE = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("targetType")).getOnly();
            SERIALIZABLE_PROXY = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("serializableProxy")).getOnly();
            NULL_IF_IMPOSSIBLE = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("nullIfImpossible")).getOnly();
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public MethodDelegationBinder.ParameterBinding<?> bind(AnnotationDescription.Loadable<DefaultCall> loadable, MethodDescription methodDescription, ParameterDescription parameterDescription, Implementation.Target target, Assigner assigner, Assigner.Typing typing) {
            StackManipulation assignableSignatureCall;
            TypeDescription typeDescriptionAsErasure = parameterDescription.getType().asErasure();
            if (!typeDescriptionAsErasure.represents(Runnable.class) && !typeDescriptionAsErasure.represents(Callable.class) && !typeDescriptionAsErasure.represents(Object.class)) {
                C8376.m13333(parameterDescription, "A default method call proxy can only be assigned to Runnable or Callable types: ");
                return null;
            }
            if (methodDescription.isConstructor()) {
                return ((Boolean) loadable.getValue(NULL_IF_IMPOSSIBLE).resolve(Boolean.class)).booleanValue() ? new MethodDelegationBinder.ParameterBinding.Anonymous(NullConstant.INSTANCE) : MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE;
            }
            TypeDescription typeDescription = (TypeDescription) loadable.getValue(TARGET_TYPE).resolve(TypeDescription.class);
            Implementation.SpecialMethodInvocation specialMethodInvocationWithCheckedCompatibilityTo = (typeDescription.represents(Void.TYPE) ? DefaultMethodLocator.Implicit.INSTANCE : new DefaultMethodLocator.Explicit(typeDescription)).resolve(target, methodDescription).withCheckedCompatibilityTo(methodDescription.asTypeToken());
            if (specialMethodInvocationWithCheckedCompatibilityTo.isValid()) {
                assignableSignatureCall = new MethodCallProxy.AssignableSignatureCall(specialMethodInvocationWithCheckedCompatibilityTo, ((Boolean) loadable.getValue(SERIALIZABLE_PROXY).resolve(Boolean.class)).booleanValue());
            } else {
                if (!((Boolean) loadable.getValue(NULL_IF_IMPOSSIBLE).resolve(Boolean.class)).booleanValue()) {
                    return MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE;
                }
                assignableSignatureCall = NullConstant.INSTANCE;
            }
            return new MethodDelegationBinder.ParameterBinding.Anonymous(assignableSignatureCall);
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public Class<DefaultCall> getHandledType() {
            return DefaultCall.class;
        }
    }

    boolean nullIfImpossible() default false;

    boolean serializableProxy() default false;

    Class<?> targetType() default void.class;
}
