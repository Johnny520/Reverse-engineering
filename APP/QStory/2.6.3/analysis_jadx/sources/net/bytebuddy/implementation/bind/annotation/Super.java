package net.bytebuddy.implementation.bind.annotation;

import androidx.profileinstaller.AbstractC2442;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import lin.xposed.hook.javaplugin.C5554;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.enumeration.EnumerationDescription;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.method.MethodList;
import net.bytebuddy.description.method.ParameterDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.TargetType;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.matcher.ElementMatchers;
import net.bytebuddy.utility.nullability.MaybeNull;
import p336.C8791;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Super {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface ConstructorResolver {

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static class Default implements ConstructorResolver {
            @Override // net.bytebuddy.implementation.bind.annotation.Super.ConstructorResolver
            public MethodDescription.InDefinedShape resolve(TypeDescription typeDescription, List<TypeDescription> list) {
                if (typeDescription.isInterface()) {
                    return (MethodDescription.InDefinedShape) TypeDescription.ForLoadedType.of(Object.class).getDeclaredMethods().filter(ElementMatchers.isConstructor()).getOnly();
                }
                MethodList methodListFilter = typeDescription.getDeclaredMethods().filter(ElementMatchers.isConstructor().and(ElementMatchers.not(ElementMatchers.isPrivate())).and(ElementMatchers.takesArguments(list)));
                if (methodListFilter.size() == 1) {
                    return (MethodDescription.InDefinedShape) methodListFilter.getOnly();
                }
                C5554.m10887("Did not discover exactly one constructor on ", typeDescription, " with parameters ", list);
                return null;
            }
        }

        MethodDescription.InDefinedShape resolve(TypeDescription typeDescription, List<TypeDescription> list);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Instantiation {
        CONSTRUCTOR { // from class: net.bytebuddy.implementation.bind.annotation.Super.Instantiation.1
            @Override // net.bytebuddy.implementation.bind.annotation.Super.Instantiation
            public StackManipulation proxyFor(TypeDescription typeDescription, Implementation.Target target, AnnotationDescription.Loadable<Super> loadable) {
                try {
                    return new TypeProxy.ForSuperMethodByConstructor(typeDescription, ((ConstructorResolver) ((Class) loadable.getValue(Instantiation.CONSTRUCTOR_RESOLVER).load(ConstructorResolver.class.getClassLoader()).resolve(Class.class)).getConstructor(null).newInstance(null)).resolve(typeDescription, Arrays.asList((Object[]) loadable.getValue(Instantiation.CONSTRUCTOR_PARAMETERS).resolve(TypeDescription[].class))), target, ((Boolean) loadable.getValue(Instantiation.IGNORE_FINALIZER).resolve(Boolean.class)).booleanValue(), ((Boolean) loadable.getValue(Instantiation.SERIALIZABLE_PROXY).resolve(Boolean.class)).booleanValue());
                } catch (NoSuchMethodException e) {
                    C5554.m10885("No default constructor specified by ", ((TypeDescription) loadable.getValue(Instantiation.CONSTRUCTOR_RESOLVER).resolve(TypeDescription.class)).getName(), e);
                    return null;
                } catch (InvocationTargetException e2) {
                    C8791.m14473("Failed to resolve constructor specified by " + loadable, e2.getTargetException());
                    return null;
                } catch (Exception e3) {
                    C5554.m10875("Failed to resolve constructor specified by ", loadable, e3);
                    return null;
                }
            }
        },
        UNSAFE { // from class: net.bytebuddy.implementation.bind.annotation.Super.Instantiation.2
            @Override // net.bytebuddy.implementation.bind.annotation.Super.Instantiation
            public StackManipulation proxyFor(TypeDescription typeDescription, Implementation.Target target, AnnotationDescription.Loadable<Super> loadable) {
                return new TypeProxy.ForSuperMethodByReflectionFactory(typeDescription, target, ((Boolean) loadable.getValue(Instantiation.IGNORE_FINALIZER).resolve(Boolean.class)).booleanValue(), ((Boolean) loadable.getValue(Instantiation.SERIALIZABLE_PROXY).resolve(Boolean.class)).booleanValue());
            }
        };

        private static final MethodDescription.InDefinedShape CONSTRUCTOR_PARAMETERS;
        private static final MethodDescription.InDefinedShape CONSTRUCTOR_RESOLVER;
        private static final MethodDescription.InDefinedShape IGNORE_FINALIZER;
        private static final MethodDescription.InDefinedShape SERIALIZABLE_PROXY;

        static {
            MethodList<MethodDescription.InDefinedShape> declaredMethods = TypeDescription.ForLoadedType.of(Super.class).getDeclaredMethods();
            IGNORE_FINALIZER = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("ignoreFinalizer")).getOnly();
            SERIALIZABLE_PROXY = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("serializableProxy")).getOnly();
            CONSTRUCTOR_PARAMETERS = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("constructorParameters")).getOnly();
            CONSTRUCTOR_RESOLVER = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("constructorResolver")).getOnly();
        }

        public abstract StackManipulation proxyFor(TypeDescription typeDescription, Implementation.Target target, AnnotationDescription.Loadable<Super> loadable);
    }

    Class<?>[] constructorParameters() default {};

    Class<? extends ConstructorResolver> constructorResolver() default ConstructorResolver.Default.class;

    boolean ignoreFinalizer() default true;

    Class<?> proxyType() default void.class;

    boolean serializableProxy() default false;

    Instantiation strategy() default Instantiation.CONSTRUCTOR;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Binder implements TargetMethodAnnotationDrivenBinder.ParameterBinder<Super> {
        INSTANCE;

        private static final MethodDescription.InDefinedShape PROXY_TYPE;
        private static final MethodDescription.InDefinedShape STRATEGY;

        static {
            MethodList<MethodDescription.InDefinedShape> declaredMethods = TypeDescription.ForLoadedType.of(Super.class).getDeclaredMethods();
            STRATEGY = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("strategy")).getOnly();
            PROXY_TYPE = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("proxyType")).getOnly();
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public MethodDelegationBinder.ParameterBinding<?> bind(AnnotationDescription.Loadable<Super> loadable, MethodDescription methodDescription, ParameterDescription parameterDescription, Implementation.Target target, Assigner assigner, Assigner.Typing typing) {
            if (parameterDescription.getType().isPrimitive() || parameterDescription.getType().isArray()) {
                C5554.m10879(parameterDescription, " uses the @Super annotation on an invalid type");
                return null;
            }
            TypeDescription typeDescriptionResolve = TypeLocator.ForType.of((TypeDescription) loadable.getValue(PROXY_TYPE).resolve(TypeDescription.class)).resolve(target.getInstrumentedType(), parameterDescription.getType());
            if (!typeDescriptionResolve.isFinal()) {
                return (methodDescription.isStatic() || !target.getInstrumentedType().isAssignableTo(typeDescriptionResolve)) ? MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE : new MethodDelegationBinder.ParameterBinding.Anonymous(((Instantiation) ((EnumerationDescription) loadable.getValue(STRATEGY).resolve(EnumerationDescription.class)).load(Instantiation.class)).proxyFor(typeDescriptionResolve, target, loadable));
            }
            C5925.m11311(AbstractC2442.m4572("Cannot extend final type as @Super proxy: ", typeDescriptionResolve));
            return null;
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public Class<Super> getHandledType() {
            return Super.class;
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public interface TypeLocator {

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            public enum ForParameterType implements TypeLocator {
                INSTANCE;

                @Override // net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator
                public TypeDescription resolve(TypeDescription typeDescription, TypeDescription.Generic generic) {
                    TypeDescription typeDescriptionAsErasure = generic.asErasure();
                    return typeDescriptionAsErasure.equals(typeDescription) ? typeDescription : typeDescriptionAsErasure;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
                    if (typeDescription.represents(TargetType.class)) {
                        return ForInstrumentedType.INSTANCE;
                    }
                    if (!typeDescription.isPrimitive() && !typeDescription.isArray()) {
                        return new ForType(typeDescription);
                    }
                    C5925.m11311(AbstractC2442.m4572("Cannot assign proxy to ", typeDescription));
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

                @Override // net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator
                public TypeDescription resolve(TypeDescription typeDescription, TypeDescription.Generic generic) {
                    boolean zIsAssignableTo = this.typeDescription.isAssignableTo(generic.asErasure());
                    TypeDescription typeDescription2 = this.typeDescription;
                    if (zIsAssignableTo) {
                        return typeDescription2;
                    }
                    C5554.m10887("Impossible to assign ", typeDescription2, " to parameter of type ", generic);
                    return null;
                }
            }

            TypeDescription resolve(TypeDescription typeDescription, TypeDescription.Generic generic);

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            public enum ForInstrumentedType implements TypeLocator {
                INSTANCE;

                @Override // net.bytebuddy.implementation.bind.annotation.Super.Binder.TypeLocator
                public TypeDescription resolve(TypeDescription typeDescription, TypeDescription.Generic generic) {
                    return typeDescription;
                }
            }
        }
    }
}
