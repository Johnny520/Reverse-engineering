package net.bytebuddy.implementation.bind.annotation;

import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import java.io.Serializable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collection;
import java.util.Collections;
import lin.xposed.hook.javaplugin.C5553;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.field.FieldDescription;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.method.MethodList;
import net.bytebuddy.description.method.ParameterDescription;
import net.bytebuddy.description.modifier.ModifierContributor;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.dynamic.scaffold.TypeValidation;
import net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.MethodAccessorFactory;
import net.bytebuddy.implementation.auxiliary.AuxiliaryType;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender;
import net.bytebuddy.implementation.bytecode.Duplication;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.TypeCreation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.collection.ArrayAccess;
import net.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.implementation.bytecode.member.MethodReturn;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.matcher.ElementMatchers;
import net.bytebuddy.utility.RandomString;
import net.bytebuddy.utility.nullability.MaybeNull;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Morph {
    boolean defaultMethod() default false;

    Class<?> defaultTarget() default void.class;

    boolean serializableProxy() default false;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @HashCodeAndEqualsPlugin.Enhance
    public static class Binder implements TargetMethodAnnotationDrivenBinder.ParameterBinder<Morph> {
        private static final MethodDescription.InDefinedShape DEFAULT_METHOD;
        private static final MethodDescription.InDefinedShape DEFAULT_TARGET;
        private static final MethodDescription.InDefinedShape SERIALIZABLE_PROXY;
        private final MethodDescription forwardingMethod;

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        public interface DefaultMethodLocator {

            /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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

                @Override // net.bytebuddy.implementation.bind.annotation.Morph.Binder.DefaultMethodLocator
                public Implementation.SpecialMethodInvocation resolve(Implementation.Target target, MethodDescription methodDescription) {
                    if (this.typeDescription.isInterface()) {
                        return target.invokeDefault(methodDescription.asSignatureToken(), this.typeDescription).withCheckedCompatibilityTo(methodDescription.asTypeToken());
                    }
                    C5553.m10822(methodDescription, " method carries default method call parameter on non-interface type");
                    return null;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
            public enum Implicit implements DefaultMethodLocator {
                INSTANCE;

                @Override // net.bytebuddy.implementation.bind.annotation.Morph.Binder.DefaultMethodLocator
                public Implementation.SpecialMethodInvocation resolve(Implementation.Target target, MethodDescription methodDescription) {
                    return target.invokeDefault(methodDescription.asSignatureToken()).withCheckedCompatibilityTo(methodDescription.asTypeToken());
                }
            }

            Implementation.SpecialMethodInvocation resolve(Implementation.Target target, MethodDescription methodDescription);
        }

        static {
            MethodList<MethodDescription.InDefinedShape> declaredMethods = TypeDescription.ForLoadedType.of(Morph.class).getDeclaredMethods();
            SERIALIZABLE_PROXY = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("serializableProxy")).getOnly();
            DEFAULT_METHOD = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("defaultMethod")).getOnly();
            DEFAULT_TARGET = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("defaultTarget")).getOnly();
        }

        public Binder(MethodDescription methodDescription) {
            this.forwardingMethod = methodDescription;
        }

        public static TargetMethodAnnotationDrivenBinder.ParameterBinder<Morph> install(TypeDescription typeDescription) {
            return new Binder(onlyMethod(typeDescription));
        }

        private static MethodDescription onlyMethod(TypeDescription typeDescription) {
            if (!typeDescription.isInterface()) {
                C5919.m11249(AbstractC2442.m4554(typeDescription, " is not an interface"));
                return null;
            }
            if (!typeDescription.getInterfaces().isEmpty()) {
                C5919.m11249(AbstractC2442.m4554(typeDescription, " must not extend other interfaces"));
                return null;
            }
            if (!typeDescription.isPublic()) {
                C5919.m11249(AbstractC2442.m4554(typeDescription, " is mot public"));
                return null;
            }
            MethodList methodListFilter = typeDescription.getDeclaredMethods().filter(ElementMatchers.isAbstract());
            if (methodListFilter.size() != 1) {
                C5919.m11249(AbstractC2442.m4554(typeDescription, " must declare exactly one abstract method"));
                return null;
            }
            MethodDescription methodDescription = (MethodDescription) methodListFilter.getOnly();
            if (!methodDescription.getReturnType().asErasure().represents(Object.class)) {
                C0276.m837(methodDescription, " does not return an Object-type");
                return null;
            }
            if (methodDescription.getParameters().size() == 1 && ((ParameterDescription) methodDescription.getParameters().get(0)).getType().asErasure().represents(Object[].class)) {
                return methodDescription;
            }
            C0276.m837(methodDescription, " does not take a single argument of type Object[]");
            return null;
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public MethodDelegationBinder.ParameterBinding<?> bind(AnnotationDescription.Loadable<Morph> loadable, MethodDescription methodDescription, ParameterDescription parameterDescription, Implementation.Target target, Assigner assigner, Assigner.Typing typing) {
            Implementation.SpecialMethodInvocation specialMethodInvocationResolve;
            if (!parameterDescription.getType().asErasure().equals(this.forwardingMethod.getDeclaringType())) {
                StringBuilder sb = new StringBuilder("Illegal use of @Morph for ");
                sb.append(parameterDescription);
                C5553.m10824(sb, " which was installed for ", this.forwardingMethod.getDeclaringType());
                return null;
            }
            TypeDescription typeDescription = (TypeDescription) loadable.getValue(DEFAULT_TARGET).resolve(TypeDescription.class);
            Class cls = Void.TYPE;
            if (!typeDescription.represents(cls) || ((Boolean) loadable.getValue(DEFAULT_METHOD).resolve(Boolean.class)).booleanValue()) {
                specialMethodInvocationResolve = (typeDescription.represents(cls) ? DefaultMethodLocator.Implicit.INSTANCE : new DefaultMethodLocator.Explicit(typeDescription)).resolve(target, methodDescription);
            } else {
                specialMethodInvocationResolve = target.invokeDominant(methodDescription.asSignatureToken()).withCheckedCompatibilityTo(methodDescription.asTypeToken());
            }
            Implementation.SpecialMethodInvocation specialMethodInvocation = specialMethodInvocationResolve;
            return specialMethodInvocation.isValid() ? new MethodDelegationBinder.ParameterBinding.Anonymous(new RedirectionProxy(this.forwardingMethod.getDeclaringType().asErasure(), target.getInstrumentedType(), specialMethodInvocation, assigner, ((Boolean) loadable.getValue(SERIALIZABLE_PROXY).resolve(Boolean.class)).booleanValue())) : MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE;
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.forwardingMethod.equals(((Binder) obj).forwardingMethod);
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public Class<Morph> getHandledType() {
            return Morph.class;
        }

        public int hashCode() {
            return this.forwardingMethod.hashCode() + (getClass().hashCode() * 31);
        }

        public static TargetMethodAnnotationDrivenBinder.ParameterBinder<Morph> install(Class<?> cls) {
            return install(TypeDescription.ForLoadedType.of(cls));
        }

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class RedirectionProxy extends StackManipulation.AbstractBase implements AuxiliaryType {
            protected static final String FIELD_NAME = "target";
            private final Assigner assigner;
            private final TypeDescription instrumentedType;
            private final TypeDescription morphingType;
            private final boolean serializableProxy;
            private final Implementation.SpecialMethodInvocation specialMethodInvocation;

            /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
            @HashCodeAndEqualsPlugin.Enhance
            public static class InstanceFieldConstructor implements Implementation {
                private final TypeDescription instrumentedType;

                /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
                @HashCodeAndEqualsPlugin.Enhance
                public static class Appender implements ByteCodeAppender {
                    private final FieldDescription fieldDescription;

                    public Appender(Implementation.Target target) {
                        this.fieldDescription = (FieldDescription) target.getInstrumentedType().getDeclaredFields().filter(ElementMatchers.named("target")).getOnly();
                    }

                    @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
                    public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
                        return new ByteCodeAppender.Size(new StackManipulation.Compound(MethodVariableAccess.loadThis(), MethodInvocation.invoke(StaticFieldConstructor.INSTANCE.objectTypeDefaultConstructor), MethodVariableAccess.allArgumentsOf(methodDescription).prependThisReference(), FieldAccess.forField(this.fieldDescription).write(), MethodReturn.VOID).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.fieldDescription.equals(((Appender) obj).fieldDescription);
                    }

                    public int hashCode() {
                        return this.fieldDescription.hashCode() + (getClass().hashCode() * 31);
                    }
                }

                public InstanceFieldConstructor(TypeDescription typeDescription) {
                    this.instrumentedType = typeDescription;
                }

                @Override // net.bytebuddy.implementation.Implementation
                public ByteCodeAppender appender(Implementation.Target target) {
                    return new Appender(target);
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.instrumentedType.equals(((InstanceFieldConstructor) obj).instrumentedType);
                }

                public int hashCode() {
                    return this.instrumentedType.hashCode() + (getClass().hashCode() * 31);
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType.withField(new FieldDescription.Token("target", 18, this.instrumentedType.asGenericType()));
                }
            }

            public RedirectionProxy(TypeDescription typeDescription, TypeDescription typeDescription2, Implementation.SpecialMethodInvocation specialMethodInvocation, Assigner assigner, boolean z) {
                this.morphingType = typeDescription;
                this.instrumentedType = typeDescription2;
                this.specialMethodInvocation = specialMethodInvocation;
                this.assigner = assigner;
                this.serializableProxy = z;
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                TypeDescription typeDescriptionRegister = context.register(this);
                return new StackManipulation.Compound(TypeCreation.of(typeDescriptionRegister), Duplication.SINGLE, this.specialMethodInvocation.getMethodDescription().isStatic() ? StackManipulation.Trivial.INSTANCE : MethodVariableAccess.loadThis(), MethodInvocation.invoke((MethodDescription.InDefinedShape) typeDescriptionRegister.getDeclaredMethods().filter(ElementMatchers.isConstructor()).getOnly())).apply(methodVisitor, context);
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                RedirectionProxy redirectionProxy = (RedirectionProxy) obj;
                return this.serializableProxy == redirectionProxy.serializableProxy && this.morphingType.equals(redirectionProxy.morphingType) && this.instrumentedType.equals(redirectionProxy.instrumentedType) && this.specialMethodInvocation.equals(redirectionProxy.specialMethodInvocation) && this.assigner.equals(redirectionProxy.assigner);
            }

            @Override // net.bytebuddy.implementation.auxiliary.AuxiliaryType
            public String getSuffix() {
                StringBuilder sb = new StringBuilder();
                sb.append(RandomString.hashOf(this.morphingType.hashCode()));
                sb.append(this.serializableProxy ? "S" : "0");
                return sb.toString();
            }

            public int hashCode() {
                return AbstractC2442.m4579(this.assigner, (this.specialMethodInvocation.hashCode() + AbstractC2442.m4574(this.instrumentedType, AbstractC2442.m4574(this.morphingType, getClass().hashCode() * 31, 31), 31)) * 31, 31) + (this.serializableProxy ? 1 : 0);
            }

            @Override // net.bytebuddy.implementation.auxiliary.AuxiliaryType
            public DynamicType make(String str, ClassFileVersion classFileVersion, MethodAccessorFactory methodAccessorFactory) {
                return new ByteBuddy(classFileVersion).with(TypeValidation.DISABLED).subclass(this.morphingType, ConstructorStrategy.Default.NO_CONSTRUCTORS).name(str).modifiers(AuxiliaryType.DEFAULT_TYPE_MODIFIER).implement(this.serializableProxy ? new Class[]{Serializable.class} : new Class[0]).defineConstructor(new ModifierContributor.ForMethod[0]).withParameters((Collection<? extends TypeDefinition>) (this.specialMethodInvocation.getMethodDescription().isStatic() ? Collections.EMPTY_LIST : Collections.singletonList(this.instrumentedType))).intercept(this.specialMethodInvocation.getMethodDescription().isStatic() ? StaticFieldConstructor.INSTANCE : new InstanceFieldConstructor(this.instrumentedType)).method(ElementMatchers.isAbstract().and(ElementMatchers.isDeclaredBy(this.morphingType))).intercept(new MethodCall(methodAccessorFactory.registerAccessorFor(this.specialMethodInvocation, MethodAccessorFactory.AccessType.DEFAULT), this.assigner)).make();
            }

            /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
            @HashCodeAndEqualsPlugin.Enhance
            public static class MethodCall implements Implementation {
                private final MethodDescription accessorMethod;
                private final Assigner assigner;

                /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
                @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                public class Appender implements ByteCodeAppender {
                    private final TypeDescription typeDescription;

                    public Appender(Implementation.Target target) {
                        this.typeDescription = target.getInstrumentedType();
                    }

                    @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
                    public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
                        StackManipulation compound;
                        char c = 1;
                        StackManipulation stackManipulationLoadFrom = MethodVariableAccess.REFERENCE.loadFrom(1);
                        StackManipulation[] stackManipulationArr = new StackManipulation[MethodCall.this.accessorMethod.getParameters().size()];
                        int i = 0;
                        for (TypeDescription.Generic generic : MethodCall.this.accessorMethod.getParameters().asTypeList()) {
                            StackManipulation stackManipulationForValue = IntegerConstant.forValue(i);
                            StackManipulation stackManipulationLoad = ArrayAccess.REFERENCE.load();
                            char c2 = c;
                            StackManipulation stackManipulationAssign = MethodCall.this.assigner.assign(TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(Object.class), generic, Assigner.Typing.DYNAMIC);
                            StackManipulation[] stackManipulationArr2 = new StackManipulation[4];
                            stackManipulationArr2[0] = stackManipulationLoadFrom;
                            stackManipulationArr2[c2] = stackManipulationForValue;
                            stackManipulationArr2[2] = stackManipulationLoad;
                            stackManipulationArr2[3] = stackManipulationAssign;
                            stackManipulationArr[i] = new StackManipulation.Compound(stackManipulationArr2);
                            i++;
                            c = c2;
                        }
                        char c3 = c;
                        if (MethodCall.this.accessorMethod.isStatic()) {
                            compound = StackManipulation.Trivial.INSTANCE;
                        } else {
                            StackManipulation stackManipulationLoadThis = MethodVariableAccess.loadThis();
                            StackManipulation stackManipulation = FieldAccess.forField((FieldDescription.InDefinedShape) this.typeDescription.getDeclaredFields().filter(ElementMatchers.named("target")).getOnly()).read();
                            StackManipulation[] stackManipulationArr3 = new StackManipulation[2];
                            stackManipulationArr3[0] = stackManipulationLoadThis;
                            stackManipulationArr3[c3] = stackManipulation;
                            compound = new StackManipulation.Compound(stackManipulationArr3);
                        }
                        StackManipulation.Compound compound2 = new StackManipulation.Compound(stackManipulationArr);
                        MethodInvocation.WithImplicitInvocationTargetType withImplicitInvocationTargetTypeInvoke = MethodInvocation.invoke(MethodCall.this.accessorMethod);
                        StackManipulation stackManipulationAssign2 = MethodCall.this.assigner.assign(MethodCall.this.accessorMethod.getReturnType(), methodDescription.getReturnType(), Assigner.Typing.DYNAMIC);
                        StackManipulation[] stackManipulationArr4 = new StackManipulation[5];
                        stackManipulationArr4[0] = compound;
                        stackManipulationArr4[c3] = compound2;
                        stackManipulationArr4[2] = withImplicitInvocationTargetTypeInvoke;
                        stackManipulationArr4[3] = stackManipulationAssign2;
                        stackManipulationArr4[4] = MethodReturn.REFERENCE;
                        return new ByteCodeAppender.Size(new StackManipulation.Compound(stackManipulationArr4).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        Appender appender = (Appender) obj;
                        return this.typeDescription.equals(appender.typeDescription) && MethodCall.this.equals(MethodCall.this);
                    }

                    public int hashCode() {
                        return MethodCall.this.hashCode() + AbstractC2442.m4574(this.typeDescription, getClass().hashCode() * 31, 31);
                    }
                }

                public MethodCall(MethodDescription methodDescription, Assigner assigner) {
                    this.accessorMethod = methodDescription;
                    this.assigner = assigner;
                }

                @Override // net.bytebuddy.implementation.Implementation
                public ByteCodeAppender appender(Implementation.Target target) {
                    return new Appender(target);
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    MethodCall methodCall = (MethodCall) obj;
                    return this.accessorMethod.equals(methodCall.accessorMethod) && this.assigner.equals(methodCall.assigner);
                }

                public int hashCode() {
                    return this.assigner.hashCode() + AbstractC2442.m4557(this.accessorMethod, getClass().hashCode() * 31, 31);
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
            public enum StaticFieldConstructor implements Implementation {
                INSTANCE;

                private final MethodDescription objectTypeDefaultConstructor = (MethodDescription) TypeDescription.ForLoadedType.of(Object.class).getDeclaredMethods().filter(ElementMatchers.isConstructor()).getOnly();

                StaticFieldConstructor() {
                }

                @Override // net.bytebuddy.implementation.Implementation
                public ByteCodeAppender appender(Implementation.Target target) {
                    return new ByteCodeAppender.Simple(MethodVariableAccess.loadThis(), MethodInvocation.invoke(this.objectTypeDefaultConstructor), MethodReturn.VOID);
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }
        }
    }
}
