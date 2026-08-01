package net.bytebuddy.implementation.bind.annotation;

import androidx.profileinstaller.AbstractC2442;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.method.MethodList;
import net.bytebuddy.description.method.ParameterDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.collection.ArrayFactory;
import net.bytebuddy.implementation.bytecode.constant.NullConstant;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.matcher.ElementMatchers;
import net.bytebuddy.utility.CompoundList;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface AllArguments {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Assignment {
        STRICT(true),
        SLACK(false);

        private final boolean strict;

        Assignment(boolean z) {
            this.strict = z;
        }

        public boolean isStrict() {
            return this.strict;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum Binder implements TargetMethodAnnotationDrivenBinder.ParameterBinder<AllArguments> {
        INSTANCE;

        private static final MethodDescription.InDefinedShape INCLUDE_SELF;
        private static final MethodDescription.InDefinedShape NULL_IF_EMPTY;
        private static final MethodDescription.InDefinedShape VALUE;

        static {
            MethodList<MethodDescription.InDefinedShape> declaredMethods = TypeDescription.ForLoadedType.of(AllArguments.class).getDeclaredMethods();
            VALUE = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("value")).getOnly();
            INCLUDE_SELF = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("includeSelf")).getOnly();
            NULL_IF_EMPTY = (MethodDescription.InDefinedShape) declaredMethods.filter(ElementMatchers.named("nullIfEmpty")).getOnly();
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public MethodDelegationBinder.ParameterBinding<?> bind(AnnotationDescription.Loadable<AllArguments> loadable, MethodDescription methodDescription, ParameterDescription parameterDescription, Implementation.Target target, Assigner assigner, Assigner.Typing typing) {
            TypeDescription.Generic componentType;
            if (parameterDescription.getType().represents(Object.class)) {
                componentType = TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(Object.class);
            } else {
                if (!parameterDescription.getType().isArray()) {
                    C5925.m11311(AbstractC2442.m4573("Expected an array type for all argument annotation on ", methodDescription));
                    return null;
                }
                componentType = parameterDescription.getType().getComponentType();
            }
            int i = (methodDescription.isStatic() || !((Boolean) loadable.getValue(INCLUDE_SELF).resolve(Boolean.class)).booleanValue()) ? 0 : 1;
            if (i == 0 && methodDescription.getParameters().isEmpty() && ((Boolean) loadable.getValue(NULL_IF_EMPTY).resolve(Boolean.class)).booleanValue()) {
                return new MethodDelegationBinder.ParameterBinding.Anonymous(NullConstant.INSTANCE);
            }
            ArrayList arrayList = new ArrayList(methodDescription.getParameters().size() + i);
            int size = (methodDescription.isStatic() || i != 0) ? 0 : 1;
            for (TypeDescription.Generic generic : i != 0 ? CompoundList.of(target.getInstrumentedType().asGenericType(), methodDescription.getParameters().asTypeList()) : methodDescription.getParameters().asTypeList()) {
                StackManipulation.Compound compound = new StackManipulation.Compound(MethodVariableAccess.of(generic).loadFrom(size), assigner.assign(generic, componentType, typing));
                if (compound.isValid()) {
                    arrayList.add(compound);
                } else if (((Assignment) loadable.getValue(VALUE).load(AllArguments.class.getClassLoader()).resolve(Assignment.class)).isStrict()) {
                    return MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE;
                }
                size += generic.getStackSize().getSize();
            }
            return new MethodDelegationBinder.ParameterBinding.Anonymous(ArrayFactory.forType(componentType).withValues(arrayList));
        }

        @Override // net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
        public Class<AllArguments> getHandledType() {
            return AllArguments.class;
        }
    }

    boolean includeSelf() default false;

    boolean nullIfEmpty() default false;

    Assignment value() default Assignment.STRICT;
}
