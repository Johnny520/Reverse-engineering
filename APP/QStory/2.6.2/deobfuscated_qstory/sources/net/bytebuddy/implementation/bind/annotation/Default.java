package net.bytebuddy.implementation.bind.annotation;

import androidx.profileinstaller.AbstractC2442;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import lin.xposed.hook.javaplugin.C5553;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.method.MethodList;
import net.bytebuddy.description.method.ParameterDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.matcher.ElementMatchers;
import net.bytebuddy.utility.nullability.MaybeNull;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Default {

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum Binder implements TargetMethodAnnotationDrivenBinder.ParameterBinder<Default> {
        INSTANCE;

        private static final MethodDescription.InDefinedShape PROXY_TYPE;
        private static final MethodDescription.InDefinedShape SERIALIZABLE_PROXY;

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        public interface TypeLocator {

            /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
            public enum ForParameterType implements TypeLocator {
                INSTANCE;

                @Override // net.bytebuddy.implementation.bind.annotation.Default.Binder.TypeLocator
                public TypeDescription resolve(TypeDescription.Generic generic) {
                    return generic.asErasure();
                }
            }

            /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
            @HashCodeAndEqualsPlugin.Enhance
            public static class ForType implements TypeLocator {
                private final TypeDescription typeDescription;

                public ForType(TypeDescription typeDescription) {
                    this.typeDescription = typeDescription;
                }

                public static TypeLocator of(TypeDescription typeDescription) {
                    if (typeDescription.represents(Void.TYPE)) {
                        return ForParameterType.INSTANCE;
                    }
                    if (typeDescription.isInterface()) {
                        return new ForType(typeDescription);
                    }
                    C5919.m11250(AbstractC2442.m4566("Cannot assign proxy to ", typeDescription));
                    return null;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((ForType) obj).typeDescription);
                }

                public int hashCode() {
                    return this.typeDescription.hashCode() + (getClass().hashCode() * 31);
                }

                @Override // net.bytebuddy.implementation.bind.annotation.Default.Binder.TypeLocator
                public TypeDescription resolve(TypeDescription.Generic generic) {
                    boolean zIsAssignableTo = this.typeDescription.isAssignableTo(generic.asErasure());
                    TypeDescription typeDescription = this.typeDescription;
                    if (zIsAssignableTo) {
                        return typeDescription;
                    }
                    C5553.m10830("Impossible to assign ", typeDescription, " to parameter of type ", generic);
                    return null;
                }
            }

            TypeDescription resolve(TypeDescription.Generic generic);
        }

        static {
            MethodList<MethodDescription.InDefinedShape> declaredMethods = TypeDescription.ForLoadedType.of(Default.class).getDeclaredMethods();
            SERIALIZABLE_PROXY = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("serializableProxy")).getOnly();
            PROXY_TYPE = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("proxyType")).getOnly();
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public MethodDelegationBinder.ParameterBinding<?> bind(AnnotationDescription.Loadable<Default> loadable, MethodDescription methodDescription, ParameterDescription parameterDescription, Implementation.Target target, Assigner assigner, Assigner.Typing typing) {
            TypeDescription typeDescriptionResolve = TypeLocator.ForType.of((TypeDescription) loadable.getValue(PROXY_TYPE).resolve(TypeDescription.class)).resolve(parameterDescription.getType());
            if (typeDescriptionResolve.isInterface()) {
                return (methodDescription.isStatic() || !target.getInstrumentedType().getInterfaces().asErasures().contains(typeDescriptionResolve)) ? MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE : new MethodDelegationBinder.ParameterBinding.Anonymous(new TypeProxy.ForDefaultMethod(typeDescriptionResolve, target, ((Boolean) loadable.getValue(SERIALIZABLE_PROXY).resolve(Boolean.class)).booleanValue()));
            }
            C5553.m10822(parameterDescription, " uses the @Default annotation on an invalid type");
            return null;
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public Class<Default> getHandledType() {
            return Default.class;
        }
    }

    Class<?> proxyType() default void.class;

    boolean serializableProxy() default false;
}
