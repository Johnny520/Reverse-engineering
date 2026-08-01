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
import net.bytebuddy.implementation.bind.ArgumentTypeResolver;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.matcher.ElementMatchers;
import p352.C9620;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Argument {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Binder implements TargetMethodAnnotationDrivenBinder.ParameterBinder<Argument> {
        INSTANCE;

        private static final MethodDescription.InDefinedShape BINDING_MECHANIC;
        private static final MethodDescription.InDefinedShape VALUE;

        static {
            MethodList<MethodDescription.InDefinedShape> declaredMethods = TypeDescription.ForLoadedType.m289of(Argument.class).getDeclaredMethods();
            VALUE = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("value")).getOnly();
            BINDING_MECHANIC = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("bindingMechanic")).getOnly();
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public MethodDelegationBinder.ParameterBinding<?> bind(AnnotationDescription.Loadable<Argument> loadable, MethodDescription methodDescription, ParameterDescription parameterDescription, Implementation.Target target, Assigner assigner, Assigner.Typing typing) {
            MethodDescription.InDefinedShape inDefinedShape = VALUE;
            if (((Integer) loadable.getValue(inDefinedShape).resolve(Integer.class)).intValue() >= 0) {
                return methodDescription.getParameters().size() <= ((Integer) loadable.getValue(inDefinedShape).resolve(Integer.class)).intValue() ? MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE : ((BindingMechanic) loadable.getValue(BINDING_MECHANIC).load(Argument.class.getClassLoader()).resolve(BindingMechanic.class)).makeBinding(((ParameterDescription) methodDescription.getParameters().get(((Integer) loadable.getValue(inDefinedShape).resolve(Integer.class)).intValue())).getType(), parameterDescription.getType(), ((Integer) loadable.getValue(inDefinedShape).resolve(Integer.class)).intValue(), assigner, typing, ((ParameterDescription) methodDescription.getParameters().get(((Integer) loadable.getValue(inDefinedShape).resolve(Integer.class)).intValue())).getOffset());
            }
            C9620.m15031(parameterDescription, "@Argument annotation on ", " specifies negative index");
            return null;
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public Class<Argument> getHandledType() {
            return Argument.class;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum BindingMechanic {
        UNIQUE { // from class: net.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic.1
            @Override // net.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic
            public MethodDelegationBinder.ParameterBinding<?> makeBinding(TypeDescription.Generic generic, TypeDescription.Generic generic2, int i, Assigner assigner, Assigner.Typing typing, int i2) {
                return MethodDelegationBinder.ParameterBinding.Unique.m424of(new StackManipulation.Compound(MethodVariableAccess.m449of(generic).loadFrom(i2), assigner.assign(generic, generic2, typing)), new ArgumentTypeResolver.ParameterIndexToken(i));
            }
        },
        ANONYMOUS { // from class: net.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic.2
            @Override // net.bytebuddy.implementation.bind.annotation.Argument.BindingMechanic
            public MethodDelegationBinder.ParameterBinding<?> makeBinding(TypeDescription.Generic generic, TypeDescription.Generic generic2, int i, Assigner assigner, Assigner.Typing typing, int i2) {
                return new MethodDelegationBinder.ParameterBinding.Anonymous(new StackManipulation.Compound(MethodVariableAccess.m449of(generic).loadFrom(i2), assigner.assign(generic, generic2, typing)));
            }
        };

        public abstract MethodDelegationBinder.ParameterBinding<?> makeBinding(TypeDescription.Generic generic, TypeDescription.Generic generic2, int i, Assigner assigner, Assigner.Typing typing, int i2);
    }

    BindingMechanic bindingMechanic() default BindingMechanic.UNIQUE;

    int value();
}
