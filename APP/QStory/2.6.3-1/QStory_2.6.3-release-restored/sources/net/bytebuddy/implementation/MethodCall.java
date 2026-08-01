package net.bytebuddy.implementation;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import androidx.profileinstaller.AbstractC3275;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import lin.xposed.hook.javaplugin.C6385;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.enumeration.EnumerationDescription;
import net.bytebuddy.description.field.FieldDescription;
import net.bytebuddy.description.field.FieldList;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.method.ParameterDescription;
import net.bytebuddy.description.method.ParameterList;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.scaffold.FieldLocator;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.dynamic.scaffold.MethodGraph;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender;
import net.bytebuddy.implementation.bytecode.Duplication;
import net.bytebuddy.implementation.bytecode.Removal;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.TypeCreation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.collection.ArrayAccess;
import net.bytebuddy.implementation.bytecode.collection.ArrayFactory;
import net.bytebuddy.implementation.bytecode.constant.ClassConstant;
import net.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import net.bytebuddy.implementation.bytecode.constant.NullConstant;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.implementation.bytecode.member.MethodReturn;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.matcher.ElementMatchers;
import net.bytebuddy.utility.CompoundList;
import net.bytebuddy.utility.ConstantValue;
import net.bytebuddy.utility.JavaConstant;
import net.bytebuddy.utility.RandomString;
import net.bytebuddy.utility.nullability.MaybeNull;
import p025.AbstractC7012;
import p160.C8376;
import p352.C9620;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class MethodCall implements Implementation.Composable {
    protected final List<ArgumentLoader.Factory> argumentLoaders;
    protected final Assigner assigner;
    protected final MethodInvoker.Factory methodInvoker;
    protected final MethodLocator.Factory methodLocator;
    protected final TargetHandler.Factory targetHandler;
    protected final TerminationHandler.Factory terminationHandler;
    protected final Assigner.Typing typing;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
    public class Appender implements ByteCodeAppender {
        private final List<ArgumentLoader.ArgumentProvider> argumentProviders;
        private final Implementation.Target implementationTarget;
        private final MethodInvoker methodInvoker;
        private final MethodLocator methodLocator;
        private final TargetHandler targetHandler;
        private final TerminationHandler terminationHandler;

        public Appender(Implementation.Target target, TerminationHandler terminationHandler) {
            this.implementationTarget = target;
            this.methodLocator = MethodCall.this.methodLocator.make(target.getInstrumentedType());
            this.argumentProviders = new ArrayList(MethodCall.this.argumentLoaders.size());
            Iterator<ArgumentLoader.Factory> it = MethodCall.this.argumentLoaders.iterator();
            while (it.hasNext()) {
                this.argumentProviders.add(it.next().make(target));
            }
            this.methodInvoker = MethodCall.this.methodInvoker.make(target.getInstrumentedType());
            this.targetHandler = MethodCall.this.targetHandler.make(target);
            this.terminationHandler = terminationHandler;
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
            TargetHandler.Resolved resolvedResolve = this.targetHandler.resolve(methodDescription);
            return new ByteCodeAppender.Size(new StackManipulation.Compound(this.terminationHandler.prepare(), toStackManipulation(methodDescription, toInvokedMethod(methodDescription, resolvedResolve), resolvedResolve)).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Appender appender = (Appender) obj;
            return this.implementationTarget.equals(appender.implementationTarget) && this.methodLocator.equals(appender.methodLocator) && this.argumentProviders.equals(appender.argumentProviders) && this.methodInvoker.equals(appender.methodInvoker) && this.targetHandler.equals(appender.targetHandler) && this.terminationHandler.equals(appender.terminationHandler) && MethodCall.this.equals(MethodCall.this);
        }

        public int hashCode() {
            return MethodCall.this.hashCode() + ((this.terminationHandler.hashCode() + ((this.targetHandler.hashCode() + ((this.methodInvoker.hashCode() + AbstractC0900.m720(this.argumentProviders, (this.methodLocator.hashCode() + ((this.implementationTarget.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31);
        }

        public MethodDescription toInvokedMethod(MethodDescription methodDescription, TargetHandler.Resolved resolved) {
            return this.methodLocator.resolve(resolved.getTypeDescription(), methodDescription);
        }

        public StackManipulation toStackManipulation(MethodDescription methodDescription, MethodDescription methodDescription2, TargetHandler.Resolved resolved) {
            ArrayList<ArgumentLoader> arrayList = new ArrayList();
            Iterator<ArgumentLoader.ArgumentProvider> it = this.argumentProviders.iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().resolve(methodDescription, methodDescription2));
            }
            ParameterList<?> parameters = methodDescription2.getParameters();
            if (parameters.size() != arrayList.size()) {
                StringBuilder sb = new StringBuilder();
                sb.append(methodDescription2);
                C6385.m11436(sb, " does not accept ", arrayList.size(), " arguments");
                return null;
            }
            Iterator<?> it2 = parameters.iterator();
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (ArgumentLoader argumentLoader : arrayList) {
                ParameterDescription parameterDescription = (ParameterDescription) it2.next();
                MethodCall methodCall = MethodCall.this;
                arrayList2.add(argumentLoader.toStackManipulation(parameterDescription, methodCall.assigner, methodCall.typing));
            }
            MethodCall methodCall2 = MethodCall.this;
            StackManipulation stackManipulation = resolved.toStackManipulation(methodDescription2, methodCall2.assigner, methodCall2.typing);
            StackManipulation.Compound compound = new StackManipulation.Compound(arrayList2);
            StackManipulation stackManipulation2 = this.methodInvoker.toStackManipulation(methodDescription2, this.implementationTarget);
            TerminationHandler terminationHandler = this.terminationHandler;
            MethodCall methodCall3 = MethodCall.this;
            return new StackManipulation.Compound(stackManipulation, compound, stackManipulation2, terminationHandler.toStackManipulation(methodDescription2, methodDescription, methodCall3.assigner, methodCall3.typing));
        }
    }

    public MethodCall(MethodLocator.Factory factory, TargetHandler.Factory factory2, List<ArgumentLoader.Factory> list, MethodInvoker.Factory factory3, TerminationHandler.Factory factory4, Assigner assigner, Assigner.Typing typing) {
        this.methodLocator = factory;
        this.targetHandler = factory2;
        this.argumentLoaders = list;
        this.methodInvoker = factory3;
        this.terminationHandler = factory4;
        this.assigner = assigner;
        this.typing = typing;
    }

    public static Implementation.Composable call(Callable<?> callable) {
        try {
            return invoke(Callable.class.getMethod("call", null)).m382on(callable, (Class<? super Callable<?>>) Callable.class).withAssigner(Assigner.DEFAULT, Assigner.Typing.DYNAMIC);
        } catch (NoSuchMethodException e) {
            C9620.m15032("Could not locate Callable::call method", e);
            return null;
        }
    }

    public static MethodCall construct(MethodDescription methodDescription) {
        if (methodDescription.isConstructor()) {
            return new MethodCall(new MethodLocator.ForExplicitMethod(methodDescription), TargetHandler.ForConstructingInvocation.Factory.INSTANCE, Collections.EMPTY_LIST, MethodInvoker.ForContextualInvocation.Factory.INSTANCE, TerminationHandler.Simple.RETURNING, Assigner.DEFAULT, Assigner.Typing.STATIC);
        }
        C6755.m11869(AbstractC3275.m5133("Not a constructor: ", methodDescription));
        return null;
    }

    public static WithoutSpecifiedTarget invoke(Method method) {
        return invoke(new MethodDescription.ForLoadedMethod(method));
    }

    public static WithoutSpecifiedTarget invokeSelf() {
        return new WithoutSpecifiedTarget(MethodLocator.ForInstrumentedMethod.INSTANCE);
    }

    public static MethodCall invokeSuper() {
        return invokeSelf().onSuper();
    }

    public static Implementation.Composable run(Runnable runnable) {
        try {
            return invoke(Runnable.class.getMethod("run", null)).m382on(runnable, (Class<? super Runnable>) Runnable.class).withAssigner(Assigner.DEFAULT, Assigner.Typing.DYNAMIC);
        } catch (NoSuchMethodException e) {
            C9620.m15032("Could not locate Runnable::run method", e);
            return null;
        }
    }

    @Override // net.bytebuddy.implementation.Implementation.Composable
    public Implementation andThen(Implementation implementation) {
        return new Implementation.Compound(new MethodCall(this.methodLocator, this.targetHandler, this.argumentLoaders, this.methodInvoker, TerminationHandler.Simple.DROPPING, this.assigner, this.typing), implementation);
    }

    @Override // net.bytebuddy.implementation.Implementation
    public ByteCodeAppender appender(Implementation.Target target) {
        return new Appender(target, this.terminationHandler.make(target.getInstrumentedType()));
    }

    public boolean equals(@MaybeNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MethodCall methodCall = (MethodCall) obj;
        return this.typing.equals(methodCall.typing) && this.methodLocator.equals(methodCall.methodLocator) && this.targetHandler.equals(methodCall.targetHandler) && this.argumentLoaders.equals(methodCall.argumentLoaders) && this.methodInvoker.equals(methodCall.methodInvoker) && this.terminationHandler.equals(methodCall.terminationHandler) && this.assigner.equals(methodCall.assigner);
    }

    public int hashCode() {
        return this.typing.hashCode() + AbstractC3275.m5149(this.assigner, (this.terminationHandler.hashCode() + ((this.methodInvoker.hashCode() + AbstractC0900.m720(this.argumentLoaders, (this.targetHandler.hashCode() + ((this.methodLocator.hashCode() + (getClass().hashCode() * 31)) * 31)) * 31, 31)) * 31)) * 31, 31);
    }

    @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public InstrumentedType prepare(InstrumentedType instrumentedType) {
        Iterator<ArgumentLoader.Factory> it = this.argumentLoaders.iterator();
        while (it.hasNext()) {
            instrumentedType = it.next().prepare(instrumentedType);
        }
        return this.targetHandler.prepare(instrumentedType);
    }

    public FieldSetting setsField(FieldDescription fieldDescription) {
        return new FieldSetting(new MethodCall(this.methodLocator, this.targetHandler, this.argumentLoaders, this.methodInvoker, new TerminationHandler.FieldSetting.Explicit(fieldDescription), this.assigner, this.typing));
    }

    public MethodCall with(EnumerationDescription... enumerationDescriptionArr) {
        ArrayList arrayList = new ArrayList(enumerationDescriptionArr.length);
        for (EnumerationDescription enumerationDescription : enumerationDescriptionArr) {
            arrayList.add(new ArgumentLoader.ForStackManipulation(FieldAccess.forEnumeration(enumerationDescription), enumerationDescription.getEnumerationType()));
        }
        return with(arrayList);
    }

    public MethodCall withAllArguments() {
        return with(ArgumentLoader.ForMethodParameter.OfInstrumentedMethod.INSTANCE);
    }

    public MethodCall withArgument(int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            if (i < 0) {
                C6755.m11869(AbstractC7012.m12147(i, "Negative index: "));
                return null;
            }
            arrayList.add(new ArgumentLoader.ForMethodParameter.Factory(i));
        }
        return with(arrayList);
    }

    public MethodCall withArgumentArray() {
        return with(ArgumentLoader.ForMethodParameterArray.ForInstrumentedMethod.INSTANCE);
    }

    public MethodCall withArgumentArrayElements(int i, int i2, int i3) {
        if (i < 0) {
            C6755.m11869(AbstractC7012.m12147(i, "A parameter index cannot be negative: "));
            return null;
        }
        if (i2 < 0) {
            C6755.m11869(AbstractC7012.m12147(i2, "An array index cannot be negative: "));
            return null;
        }
        if (i3 == 0) {
            return this;
        }
        if (i3 < 0) {
            C6755.m11869(AbstractC7012.m12147(i3, "Size cannot be negative: "));
            return null;
        }
        ArrayList arrayList = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            arrayList.add(new ArgumentLoader.ForMethodParameterArrayElement.OfParameter(i, i2 + i4));
        }
        return with(arrayList);
    }

    public Implementation.Composable withAssigner(Assigner assigner, Assigner.Typing typing) {
        return new MethodCall(this.methodLocator, this.targetHandler, this.argumentLoaders, this.methodInvoker, this.terminationHandler, assigner, typing);
    }

    public MethodCall withField(FieldLocator.Factory factory, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new ArgumentLoader.ForField.Factory(str, factory));
        }
        return with(arrayList);
    }

    public MethodCall withMethodCall(MethodCall methodCall) {
        return with(new ArgumentLoader.ForMethodCall.Factory(methodCall));
    }

    public MethodCall withOwnType() {
        return with(ArgumentLoader.ForInstrumentedType.Factory.INSTANCE);
    }

    public MethodCall withReference(Object... objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            arrayList.add(obj == null ? ArgumentLoader.ForNullConstant.INSTANCE : new ArgumentLoader.ForInstance.Factory(obj));
        }
        return with(arrayList);
    }

    public MethodCall withThis() {
        return with(ArgumentLoader.ForThisReference.Factory.INSTANCE);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface ArgumentLoader {

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public interface ArgumentProvider {
            List<ArgumentLoader> resolve(MethodDescription methodDescription, MethodDescription methodDescription2);
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public interface Factory extends InstrumentedType.Prepareable {
            ArgumentProvider make(Implementation.Target target);
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class ForInstance implements ArgumentLoader, ArgumentProvider {
            private final FieldDescription fieldDescription;

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @HashCodeAndEqualsPlugin.Enhance
            public static class Factory implements Factory {
                private static final String FIELD_PREFIX = "methodCall";

                @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE)
                private final String name;
                private final Object value;

                public Factory(Object obj) {
                    this.value = obj;
                    this.name = "methodCall$" + RandomString.hashOf(obj);
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.value.equals(((Factory) obj).value);
                }

                public int hashCode() {
                    return this.value.hashCode() + (getClass().hashCode() * 31);
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public ArgumentProvider make(Implementation.Target target) {
                    return new ForInstance((FieldDescription) target.getInstrumentedType().getDeclaredFields().filter(ElementMatchers.named(this.name)).getOnly());
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType.withAuxiliaryField(new FieldDescription.Token(this.name, 4105, TypeDescription.Generic.OfNonGenericType.ForLoadedType.m296of(this.value.getClass())), this.value);
                }
            }

            public ForInstance(FieldDescription fieldDescription) {
                this.fieldDescription = fieldDescription;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.fieldDescription.equals(((ForInstance) obj).fieldDescription);
            }

            public int hashCode() {
                return this.fieldDescription.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider
            public List<ArgumentLoader> resolve(MethodDescription methodDescription, MethodDescription methodDescription2) {
                return Collections.singletonList(this);
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            public StackManipulation toStackManipulation(ParameterDescription parameterDescription, Assigner assigner, Assigner.Typing typing) {
                StackManipulation.Compound compound = new StackManipulation.Compound(FieldAccess.forField(this.fieldDescription).read(), assigner.assign(this.fieldDescription.getType(), parameterDescription.getType(), typing));
                if (compound.isValid()) {
                    return compound;
                }
                C1123.m1407("Cannot assign ", this.fieldDescription.getType(), " to ", parameterDescription);
                return null;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class ForMethodCall implements ArgumentLoader {
            private final Appender appender;
            private final MethodDescription instrumentedMethod;
            private final MethodDescription methodDescription;
            private final TargetHandler.Resolved targetHandler;

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @HashCodeAndEqualsPlugin.Enhance
            public static class ArgumentProvider implements ArgumentProvider {
                private final Appender appender;

                public ArgumentProvider(Appender appender) {
                    this.appender = appender;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.appender.equals(((ArgumentProvider) obj).appender);
                }

                public int hashCode() {
                    return this.appender.hashCode() + (getClass().hashCode() * 31);
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider
                public List<ArgumentLoader> resolve(MethodDescription methodDescription, MethodDescription methodDescription2) {
                    TargetHandler.Resolved resolvedResolve = this.appender.targetHandler.resolve(methodDescription);
                    Appender appender = this.appender;
                    return Collections.singletonList(new ForMethodCall(appender, appender.toInvokedMethod(methodDescription, resolvedResolve), methodDescription, resolvedResolve));
                }
            }

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @HashCodeAndEqualsPlugin.Enhance
            public static class Factory implements Factory {
                private final MethodCall methodCall;

                public Factory(MethodCall methodCall) {
                    this.methodCall = methodCall;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.methodCall.equals(((Factory) obj).methodCall);
                }

                public int hashCode() {
                    return this.methodCall.hashCode() + (getClass().hashCode() * 31);
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public ArgumentProvider make(Implementation.Target target) {
                    MethodCall methodCall = this.methodCall;
                    methodCall.getClass();
                    return new ArgumentProvider(methodCall.new Appender(target, TerminationHandler.Simple.IGNORING));
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return this.methodCall.prepare(instrumentedType);
                }
            }

            public ForMethodCall(Appender appender, MethodDescription methodDescription, MethodDescription methodDescription2, TargetHandler.Resolved resolved) {
                this.appender = appender;
                this.methodDescription = methodDescription;
                this.instrumentedMethod = methodDescription2;
                this.targetHandler = resolved;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForMethodCall forMethodCall = (ForMethodCall) obj;
                return this.appender.equals(forMethodCall.appender) && this.methodDescription.equals(forMethodCall.methodDescription) && this.instrumentedMethod.equals(forMethodCall.instrumentedMethod) && this.targetHandler.equals(forMethodCall.targetHandler);
            }

            public int hashCode() {
                return this.targetHandler.hashCode() + AbstractC3275.m5127(this.instrumentedMethod, AbstractC3275.m5127(this.methodDescription, (this.appender.hashCode() + (getClass().hashCode() * 31)) * 31, 31), 31);
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            public StackManipulation toStackManipulation(ParameterDescription parameterDescription, Assigner assigner, Assigner.Typing typing) {
                StackManipulation stackManipulation = this.appender.toStackManipulation(this.instrumentedMethod, this.methodDescription, this.targetHandler);
                boolean zIsConstructor = this.methodDescription.isConstructor();
                MethodDescription methodDescription = this.methodDescription;
                StackManipulation.Compound compound = new StackManipulation.Compound(stackManipulation, assigner.assign(zIsConstructor ? methodDescription.getDeclaringType().asGenericType() : methodDescription.getReturnType(), parameterDescription.getType(), typing));
                if (compound.isValid()) {
                    return compound;
                }
                C1123.m1407("Cannot assign return type of ", this.methodDescription, " to ", parameterDescription);
                return null;
            }
        }

        StackManipulation toStackManipulation(ParameterDescription parameterDescription, Assigner assigner, Assigner.Typing typing);

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class ForStackManipulation implements ArgumentLoader, ArgumentProvider, Factory {
            private final StackManipulation stackManipulation;
            private final TypeDefinition typeDefinition;

            public ForStackManipulation(StackManipulation stackManipulation, Type type) {
                this(stackManipulation, TypeDefinition.Sort.describe(type));
            }

            /* JADX INFO: renamed from: of */
            public static Factory m380of(@MaybeNull Object obj) {
                if (obj == null) {
                    return ForNullConstant.INSTANCE;
                }
                ConstantValue constantValueWrapOrNull = ConstantValue.Simple.wrapOrNull(obj);
                return constantValueWrapOrNull == null ? new ForInstance.Factory(obj) : new ForStackManipulation(constantValueWrapOrNull.toStackManipulation(), constantValueWrapOrNull.getTypeDescription());
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForStackManipulation forStackManipulation = (ForStackManipulation) obj;
                return this.stackManipulation.equals(forStackManipulation.stackManipulation) && this.typeDefinition.equals(forStackManipulation.typeDefinition);
            }

            public int hashCode() {
                return this.typeDefinition.hashCode() + AbstractC3275.m5148(this.stackManipulation, getClass().hashCode() * 31, 31);
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider
            public List<ArgumentLoader> resolve(MethodDescription methodDescription, MethodDescription methodDescription2) {
                return Collections.singletonList(this);
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            public StackManipulation toStackManipulation(ParameterDescription parameterDescription, Assigner assigner, Assigner.Typing typing) {
                StackManipulation stackManipulationAssign = assigner.assign(this.typeDefinition.asGenericType(), parameterDescription.getType(), typing);
                if (stackManipulationAssign.isValid()) {
                    return new StackManipulation.Compound(this.stackManipulation, stackManipulationAssign);
                }
                StringBuilder sb = new StringBuilder("Cannot assign ");
                sb.append(parameterDescription);
                C6385.m11440(sb, " to ", this.typeDefinition);
                return null;
            }

            public ForStackManipulation(StackManipulation stackManipulation, TypeDefinition typeDefinition) {
                this.stackManipulation = stackManipulation;
                this.typeDefinition = typeDefinition;
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
            public ArgumentProvider make(Implementation.Target target) {
                return this;
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public InstrumentedType prepare(InstrumentedType instrumentedType) {
                return instrumentedType;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class ForField implements ArgumentLoader {
            private final FieldDescription fieldDescription;
            private final MethodDescription instrumentedMethod;

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @HashCodeAndEqualsPlugin.Enhance
            public static class ArgumentProvider implements ArgumentProvider {
                private final FieldDescription fieldDescription;

                public ArgumentProvider(FieldDescription fieldDescription) {
                    this.fieldDescription = fieldDescription;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.fieldDescription.equals(((ArgumentProvider) obj).fieldDescription);
                }

                public int hashCode() {
                    return this.fieldDescription.hashCode() + (getClass().hashCode() * 31);
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider
                public List<ArgumentLoader> resolve(MethodDescription methodDescription, MethodDescription methodDescription2) {
                    return Collections.singletonList(new ForField(this.fieldDescription, methodDescription));
                }
            }

            public ForField(FieldDescription fieldDescription, MethodDescription methodDescription) {
                this.fieldDescription = fieldDescription;
                this.instrumentedMethod = methodDescription;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForField forField = (ForField) obj;
                return this.fieldDescription.equals(forField.fieldDescription) && this.instrumentedMethod.equals(forField.instrumentedMethod);
            }

            public int hashCode() {
                return this.instrumentedMethod.hashCode() + ((this.fieldDescription.hashCode() + (getClass().hashCode() * 31)) * 31);
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            public StackManipulation toStackManipulation(ParameterDescription parameterDescription, Assigner assigner, Assigner.Typing typing) {
                if (!this.fieldDescription.isStatic() && this.instrumentedMethod.isStatic()) {
                    StringBuilder sb = new StringBuilder("Cannot access non-static ");
                    sb.append(this.fieldDescription);
                    C6385.m11440(sb, " from ", this.instrumentedMethod);
                    return null;
                }
                StackManipulation.Compound compound = new StackManipulation.Compound(this.fieldDescription.isStatic() ? StackManipulation.Trivial.INSTANCE : MethodVariableAccess.loadThis(), FieldAccess.forField(this.fieldDescription).read(), assigner.assign(this.fieldDescription.getType(), parameterDescription.getType(), typing));
                if (compound.isValid()) {
                    return compound;
                }
                C1123.m1407("Cannot assign ", this.fieldDescription, " to ", parameterDescription);
                return null;
            }

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @HashCodeAndEqualsPlugin.Enhance
            public static class Factory implements Factory {
                private final FieldLocator.Factory fieldLocatorFactory;
                private final String name;

                public Factory(String str, FieldLocator.Factory factory) {
                    this.name = str;
                    this.fieldLocatorFactory = factory;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Factory factory = (Factory) obj;
                    return this.name.equals(factory.name) && this.fieldLocatorFactory.equals(factory.fieldLocatorFactory);
                }

                public int hashCode() {
                    return this.fieldLocatorFactory.hashCode() + AbstractC7012.m12131(getClass().hashCode() * 31, 31, this.name);
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public ArgumentProvider make(Implementation.Target target) {
                    FieldLocator.Resolution resolutionLocate = this.fieldLocatorFactory.make(target.getInstrumentedType()).locate(this.name);
                    if (resolutionLocate.isResolved()) {
                        return new ArgumentProvider(resolutionLocate.getField());
                    }
                    C1123.m1407("Could not locate field '", this.name, "' on ", target.getInstrumentedType());
                    return null;
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class ForInstrumentedType implements ArgumentLoader, ArgumentProvider {
            private final TypeDescription instrumentedType;

            public ForInstrumentedType(TypeDescription typeDescription) {
                this.instrumentedType = typeDescription;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.instrumentedType.equals(((ForInstrumentedType) obj).instrumentedType);
            }

            public int hashCode() {
                return this.instrumentedType.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider
            public List<ArgumentLoader> resolve(MethodDescription methodDescription, MethodDescription methodDescription2) {
                return Collections.singletonList(this);
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            public StackManipulation toStackManipulation(ParameterDescription parameterDescription, Assigner assigner, Assigner.Typing typing) {
                StackManipulation.Compound compound = new StackManipulation.Compound(ClassConstant.m442of(this.instrumentedType), assigner.assign(TypeDescription.Generic.OfNonGenericType.ForLoadedType.m296of(Class.class), parameterDescription.getType(), typing));
                if (compound.isValid()) {
                    return compound;
                }
                C8376.m13333(parameterDescription, "Cannot assign Class value to ");
                return null;
            }

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            public enum Factory implements Factory {
                INSTANCE;

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public ArgumentProvider make(Implementation.Target target) {
                    return new ForInstrumentedType(target.getInstrumentedType());
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class ForMethodParameter implements ArgumentLoader {
            private final int index;
            private final MethodDescription instrumentedMethod;

            public ForMethodParameter(int i, MethodDescription methodDescription) {
                this.index = i;
                this.instrumentedMethod = methodDescription;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForMethodParameter forMethodParameter = (ForMethodParameter) obj;
                return this.index == forMethodParameter.index && this.instrumentedMethod.equals(forMethodParameter.instrumentedMethod);
            }

            public int hashCode() {
                return this.instrumentedMethod.hashCode() + (((getClass().hashCode() * 31) + this.index) * 31);
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            public StackManipulation toStackManipulation(ParameterDescription parameterDescription, Assigner assigner, Assigner.Typing typing) {
                ParameterDescription parameterDescription2 = (ParameterDescription) this.instrumentedMethod.getParameters().get(this.index);
                StackManipulation.Compound compound = new StackManipulation.Compound(MethodVariableAccess.load(parameterDescription2), assigner.assign(parameterDescription2.getType(), parameterDescription.getType(), typing));
                if (compound.isValid()) {
                    return compound;
                }
                StringBuilder sb = new StringBuilder("Cannot assign ");
                sb.append(parameterDescription2);
                sb.append(" to ");
                sb.append(parameterDescription);
                C6385.m11440(sb, " for ", this.instrumentedMethod);
                return null;
            }

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @HashCodeAndEqualsPlugin.Enhance
            public static class Factory implements Factory, ArgumentProvider {
                private final int index;

                public Factory(int i) {
                    this.index = i;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.index == ((Factory) obj).index;
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.index;
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider
                public List<ArgumentLoader> resolve(MethodDescription methodDescription, MethodDescription methodDescription2) {
                    if (this.index < methodDescription.getParameters().size()) {
                        return Collections.singletonList(new ForMethodParameter(this.index, methodDescription));
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(methodDescription);
                    C6385.m11437(sb, " does not have a parameter with index ", this.index, methodDescription.getParameters().size());
                    return null;
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public ArgumentProvider make(Implementation.Target target) {
                    return this;
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            public enum OfInstrumentedMethod implements Factory, ArgumentProvider {
                INSTANCE;

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider
                public List<ArgumentLoader> resolve(MethodDescription methodDescription, MethodDescription methodDescription2) {
                    ArrayList arrayList = new ArrayList(methodDescription.getParameters().size());
                    Iterator<?> it = methodDescription.getParameters().iterator();
                    while (it.hasNext()) {
                        arrayList.add(new ForMethodParameter(((ParameterDescription) it.next()).getIndex(), methodDescription));
                    }
                    return arrayList;
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public ArgumentProvider make(Implementation.Target target) {
                    return this;
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class ForMethodParameterArray implements ArgumentLoader {
            private final ParameterList<?> parameters;

            public ForMethodParameterArray(ParameterList<?> parameterList) {
                this.parameters = parameterList;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.parameters.equals(((ForMethodParameterArray) obj).parameters);
            }

            public int hashCode() {
                return this.parameters.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            public StackManipulation toStackManipulation(ParameterDescription parameterDescription, Assigner assigner, Assigner.Typing typing) {
                TypeDescription.Generic componentType;
                if (parameterDescription.getType().represents(Object.class)) {
                    componentType = TypeDescription.Generic.OfNonGenericType.ForLoadedType.m296of(Object.class);
                } else {
                    if (!parameterDescription.getType().isArray()) {
                        C8376.m13333(parameterDescription, "Cannot set method parameter array for non-array type: ");
                        return null;
                    }
                    componentType = parameterDescription.getType().getComponentType();
                }
                ArrayList arrayList = new ArrayList(this.parameters.size());
                Iterator<?> it = this.parameters.iterator();
                while (it.hasNext()) {
                    ParameterDescription parameterDescription2 = (ParameterDescription) it.next();
                    StackManipulation.Compound compound = new StackManipulation.Compound(MethodVariableAccess.load(parameterDescription2), assigner.assign(parameterDescription2.getType(), componentType, typing));
                    if (!compound.isValid()) {
                        C6385.m11446("Cannot assign ", parameterDescription2, " to ", componentType);
                        return null;
                    }
                    arrayList.add(compound);
                }
                return new StackManipulation.Compound(ArrayFactory.forType(componentType).withValues(arrayList));
            }

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            public enum ForInstrumentedMethod implements Factory, ArgumentProvider {
                INSTANCE;

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider
                public List<ArgumentLoader> resolve(MethodDescription methodDescription, MethodDescription methodDescription2) {
                    return Collections.singletonList(new ForMethodParameterArray(methodDescription.getParameters()));
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public ArgumentProvider make(Implementation.Target target) {
                    return this;
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class ForMethodParameterArrayElement implements ArgumentLoader {
            private final int index;
            private final ParameterDescription parameterDescription;

            public ForMethodParameterArrayElement(ParameterDescription parameterDescription, int i) {
                this.parameterDescription = parameterDescription;
                this.index = i;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForMethodParameterArrayElement forMethodParameterArrayElement = (ForMethodParameterArrayElement) obj;
                return this.index == forMethodParameterArrayElement.index && this.parameterDescription.equals(forMethodParameterArrayElement.parameterDescription);
            }

            public int hashCode() {
                return ((this.parameterDescription.hashCode() + (getClass().hashCode() * 31)) * 31) + this.index;
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            public StackManipulation toStackManipulation(ParameterDescription parameterDescription, Assigner assigner, Assigner.Typing typing) {
                StackManipulation.Compound compound = new StackManipulation.Compound(MethodVariableAccess.load(this.parameterDescription), IntegerConstant.forValue(this.index), ArrayAccess.m441of(this.parameterDescription.getType().getComponentType()).load(), assigner.assign(this.parameterDescription.getType().getComponentType(), parameterDescription.getType(), typing));
                if (compound.isValid()) {
                    return compound;
                }
                C1123.m1407("Cannot assign ", this.parameterDescription.getType().getComponentType(), " to ", parameterDescription);
                return null;
            }

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @HashCodeAndEqualsPlugin.Enhance
            public static class OfInvokedMethod implements Factory, ArgumentProvider {
                private final int index;

                public OfInvokedMethod(int i) {
                    this.index = i;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.index == ((OfInvokedMethod) obj).index;
                }

                public int hashCode() {
                    return (getClass().hashCode() * 31) + this.index;
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider
                public List<ArgumentLoader> resolve(MethodDescription methodDescription, MethodDescription methodDescription2) {
                    if (methodDescription.getParameters().size() <= this.index) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(methodDescription);
                        C6385.m11437(sb, " does not declare a parameter with index ", this.index, methodDescription.getParameters().size());
                        return null;
                    }
                    if (!((ParameterDescription) methodDescription.getParameters().get(this.index)).getType().isArray()) {
                        StringBuilder sb2 = new StringBuilder("Cannot access an item from non-array parameter ");
                        sb2.append(methodDescription.getParameters().get(this.index));
                        C6385.m11445(sb2, " at index ", this.index);
                        return null;
                    }
                    ArrayList arrayList = new ArrayList(methodDescription2.getParameters().size());
                    for (int i = 0; i < methodDescription2.getParameters().size(); i++) {
                        arrayList.add(new ForMethodParameterArrayElement((ParameterDescription) methodDescription.getParameters().get(this.index), i));
                    }
                    return arrayList;
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public ArgumentProvider make(Implementation.Target target) {
                    return this;
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @HashCodeAndEqualsPlugin.Enhance
            public static class OfParameter implements Factory, ArgumentProvider {
                private final int arrayIndex;
                private final int index;

                public OfParameter(int i, int i2) {
                    this.index = i;
                    this.arrayIndex = i2;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    OfParameter ofParameter = (OfParameter) obj;
                    return this.index == ofParameter.index && this.arrayIndex == ofParameter.arrayIndex;
                }

                public int hashCode() {
                    return (((getClass().hashCode() * 31) + this.index) * 31) + this.arrayIndex;
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider
                public List<ArgumentLoader> resolve(MethodDescription methodDescription, MethodDescription methodDescription2) {
                    if (methodDescription.getParameters().size() <= this.index) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(methodDescription);
                        C6385.m11437(sb, " does not declare a parameter with index ", this.index, methodDescription.getParameters().size());
                        return null;
                    }
                    if (((ParameterDescription) methodDescription.getParameters().get(this.index)).getType().isArray()) {
                        return Collections.singletonList(new ForMethodParameterArrayElement((ParameterDescription) methodDescription.getParameters().get(this.index), this.arrayIndex));
                    }
                    StringBuilder sb2 = new StringBuilder("Cannot access an item from non-array parameter ");
                    sb2.append(methodDescription.getParameters().get(this.index));
                    C6385.m11445(sb2, " at index ", this.index);
                    return null;
                }

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public ArgumentProvider make(Implementation.Target target) {
                    return this;
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class ForThisReference implements ArgumentLoader, ArgumentProvider {
            private final TypeDescription instrumentedType;

            public ForThisReference(TypeDescription typeDescription) {
                this.instrumentedType = typeDescription;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.instrumentedType.equals(((ForThisReference) obj).instrumentedType);
            }

            public int hashCode() {
                return this.instrumentedType.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider
            public List<ArgumentLoader> resolve(MethodDescription methodDescription, MethodDescription methodDescription2) {
                if (!methodDescription.isStatic()) {
                    return Collections.singletonList(this);
                }
                C6385.m11438(methodDescription, " is static and cannot supply an invoker instance");
                return null;
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            public StackManipulation toStackManipulation(ParameterDescription parameterDescription, Assigner assigner, Assigner.Typing typing) {
                StackManipulation.Compound compound = new StackManipulation.Compound(MethodVariableAccess.loadThis(), assigner.assign(this.instrumentedType.asGenericType(), parameterDescription.getType(), typing));
                if (compound.isValid()) {
                    return compound;
                }
                C1123.m1407("Cannot assign ", this.instrumentedType, " to ", parameterDescription);
                return null;
            }

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            public enum Factory implements Factory {
                INSTANCE;

                @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public ArgumentProvider make(Implementation.Target target) {
                    return new ForThisReference(target.getInstrumentedType());
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum ForNullConstant implements ArgumentLoader, ArgumentProvider, Factory {
            INSTANCE;

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.ArgumentProvider
            public List<ArgumentLoader> resolve(MethodDescription methodDescription, MethodDescription methodDescription2) {
                return Collections.singletonList(this);
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader
            public StackManipulation toStackManipulation(ParameterDescription parameterDescription, Assigner assigner, Assigner.Typing typing) {
                if (!parameterDescription.getType().isPrimitive()) {
                    return NullConstant.INSTANCE;
                }
                C8376.m13333(parameterDescription, "Cannot assign null to ");
                return null;
            }

            @Override // net.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
            public ArgumentProvider make(Implementation.Target target) {
                return this;
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public InstrumentedType prepare(InstrumentedType instrumentedType) {
                return instrumentedType;
            }
        }
    }

    public static WithoutSpecifiedTarget invoke(Constructor<?> constructor) {
        return invoke(new MethodDescription.ForLoadedConstructor(constructor));
    }

    public static WithoutSpecifiedTarget invoke(MethodDescription methodDescription) {
        return invoke(new MethodLocator.ForExplicitMethod(methodDescription));
    }

    public static WithoutSpecifiedTarget invoke(ElementMatcher<? super MethodDescription> elementMatcher) {
        return invoke(elementMatcher, MethodGraph.Compiler.DEFAULT);
    }

    public static WithoutSpecifiedTarget invoke(ElementMatcher<? super MethodDescription> elementMatcher, MethodGraph.Compiler compiler) {
        return invoke(new MethodLocator.ForElementMatcher.Factory(elementMatcher, compiler));
    }

    public static WithoutSpecifiedTarget invoke(MethodLocator.Factory factory) {
        return new WithoutSpecifiedTarget(factory);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @HashCodeAndEqualsPlugin.Enhance
    public static class FieldSetting implements Implementation.Composable {
        private final MethodCall methodCall;

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum Appender implements ByteCodeAppender {
            INSTANCE;

            @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
            public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
                if (methodDescription.getReturnType().represents(Void.TYPE)) {
                    return new ByteCodeAppender.Size(MethodReturn.VOID.apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
                }
                C6385.m11442(methodDescription, "Instrumented method ", " does not return void for field setting method call");
                return null;
            }
        }

        public FieldSetting(MethodCall methodCall) {
            this.methodCall = methodCall;
        }

        @Override // net.bytebuddy.implementation.Implementation.Composable
        public Implementation andThen(Implementation implementation) {
            return new Implementation.Compound(this.methodCall, implementation);
        }

        @Override // net.bytebuddy.implementation.Implementation
        public ByteCodeAppender appender(Implementation.Target target) {
            return new ByteCodeAppender.Compound(this.methodCall.appender(target), Appender.INSTANCE);
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.methodCall.equals(((FieldSetting) obj).methodCall);
        }

        public int hashCode() {
            return this.methodCall.hashCode() + (getClass().hashCode() * 31);
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public InstrumentedType prepare(InstrumentedType instrumentedType) {
            return this.methodCall.prepare(instrumentedType);
        }

        public Implementation.Composable withAssigner(Assigner assigner, Assigner.Typing typing) {
            return new FieldSetting((MethodCall) this.methodCall.withAssigner(assigner, typing));
        }

        @Override // net.bytebuddy.implementation.Implementation.Composable
        public Implementation.Composable andThen(Implementation.Composable composable) {
            return new Implementation.Compound.Composable(this.methodCall, composable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface MethodInvoker {

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public interface Factory {
            MethodInvoker make(TypeDescription typeDescription);
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class ForContextualInvocation implements MethodInvoker {
            private final TypeDescription instrumentedType;

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            public enum Factory implements Factory {
                INSTANCE;

                @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker.Factory
                public MethodInvoker make(TypeDescription typeDescription) {
                    return new ForContextualInvocation(typeDescription);
                }
            }

            public ForContextualInvocation(TypeDescription typeDescription) {
                this.instrumentedType = typeDescription;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.instrumentedType.equals(((ForContextualInvocation) obj).instrumentedType);
            }

            public int hashCode() {
                return this.instrumentedType.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker
            public StackManipulation toStackManipulation(MethodDescription methodDescription, Implementation.Target target) {
                if (!methodDescription.isVirtual() || methodDescription.isInvokableOn(this.instrumentedType)) {
                    return methodDescription.isVirtual() ? MethodInvocation.invoke(methodDescription).virtual(this.instrumentedType) : MethodInvocation.invoke(methodDescription);
                }
                StringBuilder sb = new StringBuilder("Cannot invoke ");
                sb.append(methodDescription);
                C6385.m11440(sb, " on ", this.instrumentedType);
                return null;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class ForDefaultMethodInvocation implements MethodInvoker {
            private final TypeDescription instrumentedType;

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            public enum Factory implements Factory {
                INSTANCE;

                @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker.Factory
                public MethodInvoker make(TypeDescription typeDescription) {
                    return new ForDefaultMethodInvocation(typeDescription);
                }
            }

            public ForDefaultMethodInvocation(TypeDescription typeDescription) {
                this.instrumentedType = typeDescription;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.instrumentedType.equals(((ForDefaultMethodInvocation) obj).instrumentedType);
            }

            public int hashCode() {
                return this.instrumentedType.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker
            public StackManipulation toStackManipulation(MethodDescription methodDescription, Implementation.Target target) {
                if (!methodDescription.isInvokableOn(this.instrumentedType)) {
                    StringBuilder sb = new StringBuilder("Cannot invoke ");
                    sb.append(methodDescription);
                    C6385.m11440(sb, " as default method of ", this.instrumentedType);
                    return null;
                }
                Implementation.SpecialMethodInvocation specialMethodInvocationWithCheckedCompatibilityTo = target.invokeDefault(methodDescription.asSignatureToken(), methodDescription.getDeclaringType().asErasure()).withCheckedCompatibilityTo(methodDescription.asTypeToken());
                if (specialMethodInvocationWithCheckedCompatibilityTo.isValid()) {
                    return specialMethodInvocationWithCheckedCompatibilityTo;
                }
                StringBuilder sb2 = new StringBuilder("Cannot invoke ");
                sb2.append(methodDescription);
                C6385.m11440(sb2, " on ", this.instrumentedType);
                return null;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class ForSuperMethodInvocation implements MethodInvoker {
            private final TypeDescription instrumentedType;

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            public enum Factory implements Factory {
                INSTANCE;

                @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker.Factory
                public MethodInvoker make(TypeDescription typeDescription) {
                    if (typeDescription.getSuperClass() != null) {
                        return new ForSuperMethodInvocation(typeDescription);
                    }
                    C6755.m11870(AbstractC3275.m5132("Cannot invoke super method for ", typeDescription));
                    return null;
                }
            }

            public ForSuperMethodInvocation(TypeDescription typeDescription) {
                this.instrumentedType = typeDescription;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.instrumentedType.equals(((ForSuperMethodInvocation) obj).instrumentedType);
            }

            public int hashCode() {
                return this.instrumentedType.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker
            public StackManipulation toStackManipulation(MethodDescription methodDescription, Implementation.Target target) {
                if (!methodDescription.isInvokableOn(target.getOriginType().asErasure())) {
                    StringBuilder sb = new StringBuilder("Cannot invoke ");
                    sb.append(methodDescription);
                    C6385.m11440(sb, " as super method of ", this.instrumentedType);
                    return null;
                }
                Implementation.SpecialMethodInvocation specialMethodInvocationWithCheckedCompatibilityTo = target.invokeDominant(methodDescription.asSignatureToken()).withCheckedCompatibilityTo(methodDescription.asTypeToken());
                if (specialMethodInvocationWithCheckedCompatibilityTo.isValid()) {
                    return specialMethodInvocationWithCheckedCompatibilityTo;
                }
                C6385.m11442(methodDescription, "Cannot invoke ", " as a super method");
                return null;
            }
        }

        StackManipulation toStackManipulation(MethodDescription methodDescription, Implementation.Target target);

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class ForVirtualInvocation implements MethodInvoker {
            private final TypeDescription typeDescription;

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @HashCodeAndEqualsPlugin.Enhance
            public static class Factory implements Factory {
                private final TypeDescription typeDescription;

                public Factory(TypeDescription typeDescription) {
                    this.typeDescription = typeDescription;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((Factory) obj).typeDescription);
                }

                public int hashCode() {
                    return this.typeDescription.hashCode() + (getClass().hashCode() * 31);
                }

                @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker.Factory
                public MethodInvoker make(TypeDescription typeDescription) {
                    boolean zIsAccessibleTo = this.typeDescription.asErasure().isAccessibleTo(typeDescription);
                    TypeDescription typeDescription2 = this.typeDescription;
                    if (zIsAccessibleTo) {
                        return new ForVirtualInvocation(typeDescription2);
                    }
                    C6385.m11432(typeDescription2, " is not accessible to ", typeDescription);
                    return null;
                }
            }

            public ForVirtualInvocation(TypeDescription typeDescription) {
                this.typeDescription = typeDescription;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((ForVirtualInvocation) obj).typeDescription);
            }

            public int hashCode() {
                return this.typeDescription.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker
            public StackManipulation toStackManipulation(MethodDescription methodDescription, Implementation.Target target) {
                if (methodDescription.isInvokableOn(this.typeDescription)) {
                    return MethodInvocation.invoke(methodDescription).virtual(this.typeDescription);
                }
                StringBuilder sb = new StringBuilder("Cannot invoke ");
                sb.append(methodDescription);
                C6385.m11440(sb, " on ", this.typeDescription);
                return null;
            }

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            public enum WithImplicitType implements MethodInvoker, Factory {
                INSTANCE;

                @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker
                public StackManipulation toStackManipulation(MethodDescription methodDescription, Implementation.Target target) {
                    if (methodDescription.isAccessibleTo(target.getInstrumentedType()) && methodDescription.isVirtual()) {
                        return MethodInvocation.invoke(methodDescription);
                    }
                    C6385.m11442(methodDescription, "Cannot invoke ", " virtually");
                    return null;
                }

                @Override // net.bytebuddy.implementation.MethodCall.MethodInvoker.Factory
                public MethodInvoker make(TypeDescription typeDescription) {
                    return this;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface TargetHandler {

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public interface Factory extends InstrumentedType.Prepareable {
            TargetHandler make(Implementation.Target target);
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class ForMethodCall implements TargetHandler {
            private final Appender appender;

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @HashCodeAndEqualsPlugin.Enhance
            public static class Factory implements Factory {
                private final MethodCall methodCall;

                public Factory(MethodCall methodCall) {
                    this.methodCall = methodCall;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.methodCall.equals(((Factory) obj).methodCall);
                }

                public int hashCode() {
                    return this.methodCall.hashCode() + (getClass().hashCode() * 31);
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Factory
                public TargetHandler make(Implementation.Target target) {
                    MethodCall methodCall = this.methodCall;
                    methodCall.getClass();
                    return new ForMethodCall(methodCall.new Appender(target, TerminationHandler.Simple.IGNORING));
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return this.methodCall.prepare(instrumentedType);
                }
            }

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @HashCodeAndEqualsPlugin.Enhance
            public static class Resolved implements Resolved {
                private final Appender appender;
                private final MethodDescription instrumentedMethod;
                private final MethodDescription methodDescription;
                private final Resolved targetHandler;

                public Resolved(Appender appender, MethodDescription methodDescription, MethodDescription methodDescription2, Resolved resolved) {
                    this.appender = appender;
                    this.methodDescription = methodDescription;
                    this.instrumentedMethod = methodDescription2;
                    this.targetHandler = resolved;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Resolved resolved = (Resolved) obj;
                    return this.appender.equals(resolved.appender) && this.methodDescription.equals(resolved.methodDescription) && this.instrumentedMethod.equals(resolved.instrumentedMethod) && this.targetHandler.equals(resolved.targetHandler);
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved
                public TypeDescription getTypeDescription() {
                    boolean zIsConstructor = this.methodDescription.isConstructor();
                    MethodDescription methodDescription = this.methodDescription;
                    return zIsConstructor ? methodDescription.getDeclaringType().asErasure() : methodDescription.getReturnType().asErasure();
                }

                public int hashCode() {
                    return this.targetHandler.hashCode() + AbstractC3275.m5127(this.instrumentedMethod, AbstractC3275.m5127(this.methodDescription, (this.appender.hashCode() + (getClass().hashCode() * 31)) * 31, 31), 31);
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved
                public StackManipulation toStackManipulation(MethodDescription methodDescription, Assigner assigner, Assigner.Typing typing) {
                    boolean zIsConstructor = this.methodDescription.isConstructor();
                    MethodDescription methodDescription2 = this.methodDescription;
                    StackManipulation stackManipulationAssign = assigner.assign(zIsConstructor ? methodDescription2.getDeclaringType().asGenericType() : methodDescription2.getReturnType(), methodDescription.getDeclaringType().asGenericType(), typing);
                    if (stackManipulationAssign.isValid()) {
                        return new StackManipulation.Compound(this.appender.toStackManipulation(this.instrumentedMethod, this.methodDescription, this.targetHandler), stackManipulationAssign);
                    }
                    StringBuilder sb = new StringBuilder("Cannot invoke ");
                    sb.append(methodDescription);
                    sb.append(" on ");
                    boolean zIsConstructor2 = this.methodDescription.isConstructor();
                    MethodDescription methodDescription3 = this.methodDescription;
                    sb.append(zIsConstructor2 ? methodDescription3.getDeclaringType() : methodDescription3.getReturnType());
                    throw new IllegalStateException(sb.toString());
                }
            }

            public ForMethodCall(Appender appender) {
                this.appender = appender;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.appender.equals(((ForMethodCall) obj).appender);
            }

            public int hashCode() {
                return this.appender.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler
            public Resolved resolve(MethodDescription methodDescription) {
                Resolved resolvedResolve = this.appender.targetHandler.resolve(methodDescription);
                Appender appender = this.appender;
                return new Resolved(appender, appender.toInvokedMethod(methodDescription, resolvedResolve), methodDescription, resolvedResolve);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public interface Resolved {
            TypeDescription getTypeDescription();

            StackManipulation toStackManipulation(MethodDescription methodDescription, Assigner assigner, Assigner.Typing typing);
        }

        Resolved resolve(MethodDescription methodDescription);

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class ForConstructingInvocation implements TargetHandler, Resolved {
            private final TypeDescription instrumentedType;

            public ForConstructingInvocation(TypeDescription typeDescription) {
                this.instrumentedType = typeDescription;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.instrumentedType.equals(((ForConstructingInvocation) obj).instrumentedType);
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved
            public TypeDescription getTypeDescription() {
                return this.instrumentedType;
            }

            public int hashCode() {
                return this.instrumentedType.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved
            public StackManipulation toStackManipulation(MethodDescription methodDescription, Assigner assigner, Assigner.Typing typing) {
                return new StackManipulation.Compound(TypeCreation.m437of(methodDescription.getDeclaringType().asErasure()), Duplication.SINGLE);
            }

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            public enum Factory implements Factory {
                INSTANCE;

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Factory
                public TargetHandler make(Implementation.Target target) {
                    return new ForConstructingInvocation(target.getInstrumentedType());
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler
            public Resolved resolve(MethodDescription methodDescription) {
                return this;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class ForField implements TargetHandler, Resolved {
            private final FieldDescription fieldDescription;

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            public interface Location {

                /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
                @HashCodeAndEqualsPlugin.Enhance
                public static class ForExplicitField implements Location {
                    private final FieldDescription fieldDescription;

                    public ForExplicitField(FieldDescription fieldDescription) {
                        this.fieldDescription = fieldDescription;
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.fieldDescription.equals(((ForExplicitField) obj).fieldDescription);
                    }

                    public int hashCode() {
                        return this.fieldDescription.hashCode() + (getClass().hashCode() * 31);
                    }

                    @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.ForField.Location
                    public FieldDescription resolve(TypeDescription typeDescription) {
                        return this.fieldDescription;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
                @HashCodeAndEqualsPlugin.Enhance
                public static class ForImplicitField implements Location {
                    private final FieldLocator.Factory fieldLocatorFactory;
                    private final String name;

                    public ForImplicitField(String str, FieldLocator.Factory factory) {
                        this.name = str;
                        this.fieldLocatorFactory = factory;
                    }

                    public boolean equals(@MaybeNull Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        ForImplicitField forImplicitField = (ForImplicitField) obj;
                        return this.name.equals(forImplicitField.name) && this.fieldLocatorFactory.equals(forImplicitField.fieldLocatorFactory);
                    }

                    public int hashCode() {
                        return this.fieldLocatorFactory.hashCode() + AbstractC7012.m12131(getClass().hashCode() * 31, 31, this.name);
                    }

                    @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.ForField.Location
                    public FieldDescription resolve(TypeDescription typeDescription) {
                        FieldLocator.Resolution resolutionLocate = this.fieldLocatorFactory.make(typeDescription).locate(this.name);
                        if (resolutionLocate.isResolved()) {
                            return resolutionLocate.getField();
                        }
                        C1123.m1407("Could not locate field name ", this.name, " on ", typeDescription);
                        return null;
                    }
                }

                FieldDescription resolve(TypeDescription typeDescription);
            }

            public ForField(FieldDescription fieldDescription) {
                this.fieldDescription = fieldDescription;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.fieldDescription.equals(((ForField) obj).fieldDescription);
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved
            public TypeDescription getTypeDescription() {
                return this.fieldDescription.getType().asErasure();
            }

            public int hashCode() {
                return this.fieldDescription.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved
            public StackManipulation toStackManipulation(MethodDescription methodDescription, Assigner assigner, Assigner.Typing typing) {
                if (!methodDescription.isMethod() || !methodDescription.isVirtual() || !methodDescription.isVisibleTo(this.fieldDescription.getType().asErasure())) {
                    StringBuilder sb = new StringBuilder("Cannot invoke ");
                    sb.append(methodDescription);
                    C6385.m11440(sb, " on ", this.fieldDescription);
                    return null;
                }
                StackManipulation stackManipulationAssign = assigner.assign(this.fieldDescription.getType(), methodDescription.getDeclaringType().asGenericType(), typing);
                if (stackManipulationAssign.isValid()) {
                    return new StackManipulation.Compound((methodDescription.isStatic() || this.fieldDescription.isStatic()) ? StackManipulation.Trivial.INSTANCE : MethodVariableAccess.loadThis(), FieldAccess.forField(this.fieldDescription).read(), stackManipulationAssign);
                }
                StringBuilder sb2 = new StringBuilder("Cannot invoke ");
                sb2.append(methodDescription);
                C6385.m11440(sb2, " on ", this.fieldDescription);
                return null;
            }

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @HashCodeAndEqualsPlugin.Enhance
            public static class Factory implements Factory {
                private final Location location;

                public Factory(Location location) {
                    this.location = location;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.location.equals(((Factory) obj).location);
                }

                public int hashCode() {
                    return this.location.hashCode() + (getClass().hashCode() * 31);
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Factory
                public TargetHandler make(Implementation.Target target) {
                    FieldDescription fieldDescriptionResolve = this.location.resolve(target.getInstrumentedType());
                    if (fieldDescriptionResolve.isStatic() || target.getInstrumentedType().isAssignableTo(fieldDescriptionResolve.getDeclaringType().asErasure())) {
                        return new ForField(fieldDescriptionResolve);
                    }
                    StringBuilder sb = new StringBuilder("Cannot access ");
                    sb.append(fieldDescriptionResolve);
                    C6385.m11440(sb, " from ", target.getInstrumentedType());
                    return null;
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler
            public Resolved resolve(MethodDescription methodDescription) {
                return this;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class ForSelfOrStaticInvocation implements TargetHandler {
            private final TypeDescription instrumentedType;

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @HashCodeAndEqualsPlugin.Enhance
            public static class Resolved implements Resolved {
                private final MethodDescription instrumentedMethod;
                private final TypeDescription instrumentedType;

                public Resolved(TypeDescription typeDescription, MethodDescription methodDescription) {
                    this.instrumentedType = typeDescription;
                    this.instrumentedMethod = methodDescription;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Resolved resolved = (Resolved) obj;
                    return this.instrumentedType.equals(resolved.instrumentedType) && this.instrumentedMethod.equals(resolved.instrumentedMethod);
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved
                public TypeDescription getTypeDescription() {
                    return this.instrumentedType;
                }

                public int hashCode() {
                    return this.instrumentedMethod.hashCode() + AbstractC3275.m5144(this.instrumentedType, getClass().hashCode() * 31, 31);
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved
                public StackManipulation toStackManipulation(MethodDescription methodDescription, Assigner assigner, Assigner.Typing typing) {
                    if (this.instrumentedMethod.isStatic() && !methodDescription.isStatic() && !methodDescription.isConstructor()) {
                        StringBuilder sb = new StringBuilder("Cannot invoke ");
                        sb.append(methodDescription);
                        C6385.m11440(sb, " from ", this.instrumentedMethod);
                        return null;
                    }
                    if (!methodDescription.isConstructor() || (this.instrumentedMethod.isConstructor() && (this.instrumentedType.equals(methodDescription.getDeclaringType().asErasure()) || (this.instrumentedType.getSuperClass() != null && this.instrumentedType.getSuperClass().asErasure().equals(methodDescription.getDeclaringType().asErasure()))))) {
                        StackManipulation[] stackManipulationArr = new StackManipulation[2];
                        stackManipulationArr[0] = methodDescription.isStatic() ? StackManipulation.Trivial.INSTANCE : MethodVariableAccess.loadThis();
                        stackManipulationArr[1] = methodDescription.isConstructor() ? Duplication.SINGLE : StackManipulation.Trivial.INSTANCE;
                        return new StackManipulation.Compound(stackManipulationArr);
                    }
                    StringBuilder sb2 = new StringBuilder("Cannot invoke ");
                    sb2.append(methodDescription);
                    sb2.append(" from ");
                    sb2.append(this.instrumentedMethod);
                    C6385.m11440(sb2, " in ", this.instrumentedType);
                    return null;
                }
            }

            public ForSelfOrStaticInvocation(TypeDescription typeDescription) {
                this.instrumentedType = typeDescription;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.instrumentedType.equals(((ForSelfOrStaticInvocation) obj).instrumentedType);
            }

            public int hashCode() {
                return this.instrumentedType.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler
            public Resolved resolve(MethodDescription methodDescription) {
                return new Resolved(this.instrumentedType, methodDescription);
            }

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            public enum Factory implements Factory {
                INSTANCE;

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Factory
                public TargetHandler make(Implementation.Target target) {
                    return new ForSelfOrStaticInvocation(target.getInstrumentedType());
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class ForMethodParameter implements TargetHandler, Factory {
            private final int index;

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @HashCodeAndEqualsPlugin.Enhance
            public static class Resolved implements Resolved {
                private final ParameterDescription parameterDescription;

                public Resolved(ParameterDescription parameterDescription) {
                    this.parameterDescription = parameterDescription;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.parameterDescription.equals(((Resolved) obj).parameterDescription);
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved
                public TypeDescription getTypeDescription() {
                    return this.parameterDescription.getType().asErasure();
                }

                public int hashCode() {
                    return this.parameterDescription.hashCode() + (getClass().hashCode() * 31);
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved
                public StackManipulation toStackManipulation(MethodDescription methodDescription, Assigner assigner, Assigner.Typing typing) {
                    StackManipulation stackManipulationAssign = assigner.assign(this.parameterDescription.getType(), methodDescription.getDeclaringType().asGenericType(), typing);
                    if (stackManipulationAssign.isValid()) {
                        return new StackManipulation.Compound(MethodVariableAccess.load(this.parameterDescription), stackManipulationAssign);
                    }
                    StringBuilder sb = new StringBuilder("Cannot invoke ");
                    sb.append(methodDescription);
                    C6385.m11440(sb, " on ", this.parameterDescription.getType());
                    return null;
                }
            }

            public ForMethodParameter(int i) {
                this.index = i;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.index == ((ForMethodParameter) obj).index;
            }

            public int hashCode() {
                return (getClass().hashCode() * 31) + this.index;
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler
            public Resolved resolve(MethodDescription methodDescription) {
                if (this.index < methodDescription.getParameters().size()) {
                    return new Resolved((ParameterDescription) methodDescription.getParameters().get(this.index));
                }
                StringBuilder sb = new StringBuilder();
                sb.append(methodDescription);
                int i = this.index;
                sb.append(" does not have a parameter with index ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Factory
            public TargetHandler make(Implementation.Target target) {
                return this;
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public InstrumentedType prepare(InstrumentedType instrumentedType) {
                return instrumentedType;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class ForValue implements TargetHandler, Resolved {
            private final FieldDescription.InDefinedShape fieldDescription;

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @HashCodeAndEqualsPlugin.Enhance
            public static class Factory implements Factory {
                private static final String FIELD_PREFIX = "invocationTarget";
                private final TypeDescription.Generic fieldType;

                @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE)
                private final String name;
                private final Object target;

                public Factory(Object obj, TypeDescription.Generic generic) {
                    this.target = obj;
                    this.fieldType = generic;
                    this.name = "invocationTarget$" + RandomString.hashOf(obj);
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Factory factory = (Factory) obj;
                    return this.target.equals(factory.target) && this.fieldType.equals(factory.fieldType);
                }

                public int hashCode() {
                    return this.fieldType.hashCode() + ((this.target.hashCode() + (getClass().hashCode() * 31)) * 31);
                }

                @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Factory
                public TargetHandler make(Implementation.Target target) {
                    return new ForValue((FieldDescription.InDefinedShape) target.getInstrumentedType().getDeclaredFields().filter(ElementMatchers.named(this.name)).getOnly());
                }

                @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType.withAuxiliaryField(new FieldDescription.Token(this.name, 4169, this.fieldType), this.target);
                }
            }

            public ForValue(FieldDescription.InDefinedShape inDefinedShape) {
                this.fieldDescription = inDefinedShape;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.fieldDescription.equals(((ForValue) obj).fieldDescription);
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved
            public TypeDescription getTypeDescription() {
                return this.fieldDescription.getType().asErasure();
            }

            public int hashCode() {
                return this.fieldDescription.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved
            public StackManipulation toStackManipulation(MethodDescription methodDescription, Assigner assigner, Assigner.Typing typing) {
                StackManipulation stackManipulationAssign = assigner.assign(this.fieldDescription.getType(), methodDescription.getDeclaringType().asGenericType(), typing);
                if (stackManipulationAssign.isValid()) {
                    return new StackManipulation.Compound(FieldAccess.forField(this.fieldDescription).read(), stackManipulationAssign);
                }
                StringBuilder sb = new StringBuilder("Cannot invoke ");
                sb.append(methodDescription);
                C6385.m11440(sb, " on ", this.fieldDescription);
                return null;
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler
            public Resolved resolve(MethodDescription methodDescription) {
                return this;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class Simple implements TargetHandler, Factory, Resolved {
            private final StackManipulation stackManipulation;
            private final TypeDescription typeDescription;

            public Simple(TypeDescription typeDescription, StackManipulation stackManipulation) {
                this.typeDescription = typeDescription;
                this.stackManipulation = stackManipulation;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Simple simple = (Simple) obj;
                return this.typeDescription.equals(simple.typeDescription) && this.stackManipulation.equals(simple.stackManipulation);
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved
            public TypeDescription getTypeDescription() {
                return this.typeDescription;
            }

            public int hashCode() {
                return this.stackManipulation.hashCode() + AbstractC3275.m5144(this.typeDescription, getClass().hashCode() * 31, 31);
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Resolved
            public StackManipulation toStackManipulation(MethodDescription methodDescription, Assigner assigner, Assigner.Typing typing) {
                return this.stackManipulation;
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler.Factory
            public TargetHandler make(Implementation.Target target) {
                return this;
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public InstrumentedType prepare(InstrumentedType instrumentedType) {
                return instrumentedType;
            }

            @Override // net.bytebuddy.implementation.MethodCall.TargetHandler
            public Resolved resolve(MethodDescription methodDescription) {
                return this;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class WithoutSpecifiedTarget extends MethodCall {
        public WithoutSpecifiedTarget(MethodLocator.Factory factory) {
            super(factory, TargetHandler.ForSelfOrStaticInvocation.Factory.INSTANCE, Collections.EMPTY_LIST, MethodInvoker.ForContextualInvocation.Factory.INSTANCE, TerminationHandler.Simple.RETURNING, Assigner.DEFAULT, Assigner.Typing.STATIC);
        }

        /* JADX INFO: renamed from: on */
        public <T> MethodCall m382on(T t, Class<? super T> cls) {
            return new MethodCall(this.methodLocator, new TargetHandler.ForValue.Factory(t, TypeDescription.Generic.OfNonGenericType.ForLoadedType.m296of(cls)), this.argumentLoaders, new MethodInvoker.ForVirtualInvocation.Factory(TypeDescription.ForLoadedType.m289of(cls)), this.terminationHandler, this.assigner, this.typing);
        }

        public MethodCall onArgument(int i) {
            if (i >= 0) {
                return new MethodCall(this.methodLocator, new TargetHandler.ForMethodParameter(i), this.argumentLoaders, MethodInvoker.ForVirtualInvocation.WithImplicitType.INSTANCE, this.terminationHandler, this.assigner, this.typing);
            }
            C6755.m11869(AbstractC7012.m12147(i, "An argument index cannot be negative: "));
            return null;
        }

        public MethodCall onDefault() {
            return new MethodCall(this.methodLocator, TargetHandler.ForSelfOrStaticInvocation.Factory.INSTANCE, this.argumentLoaders, MethodInvoker.ForDefaultMethodInvocation.Factory.INSTANCE, this.terminationHandler, this.assigner, this.typing);
        }

        public MethodCall onField(String str, FieldLocator.Factory factory) {
            return new MethodCall(this.methodLocator, new TargetHandler.ForField.Factory(new TargetHandler.ForField.Location.ForImplicitField(str, factory)), this.argumentLoaders, MethodInvoker.ForVirtualInvocation.WithImplicitType.INSTANCE, this.terminationHandler, this.assigner, this.typing);
        }

        public MethodCall onMethodCall(MethodCall methodCall) {
            return new MethodCall(this.methodLocator, new TargetHandler.ForMethodCall.Factory(methodCall), this.argumentLoaders, MethodInvoker.ForVirtualInvocation.WithImplicitType.INSTANCE, this.terminationHandler, this.assigner, this.typing);
        }

        public MethodCall onSuper() {
            return new MethodCall(this.methodLocator, TargetHandler.ForSelfOrStaticInvocation.Factory.INSTANCE, this.argumentLoaders, MethodInvoker.ForSuperMethodInvocation.Factory.INSTANCE, this.terminationHandler, this.assigner, this.typing);
        }

        public MethodCall onField(String str) {
            return onField(str, FieldLocator.ForClassHierarchy.Factory.INSTANCE);
        }

        public MethodCall onField(Field field) {
            return onField(new FieldDescription.ForLoadedField(field));
        }

        public MethodCall onField(FieldDescription fieldDescription) {
            return new MethodCall(this.methodLocator, new TargetHandler.ForField.Factory(new TargetHandler.ForField.Location.ForExplicitField(fieldDescription)), this.argumentLoaders, MethodInvoker.ForVirtualInvocation.WithImplicitType.INSTANCE, this.terminationHandler, this.assigner, this.typing);
        }

        /* JADX INFO: renamed from: on */
        public MethodCall m381on(Object obj) {
            return m382on(obj, (Class<? super Object>) obj.getClass());
        }

        /* JADX INFO: renamed from: on */
        public MethodCall m383on(StackManipulation stackManipulation, Class<?> cls) {
            return m384on(stackManipulation, TypeDescription.ForLoadedType.m289of(cls));
        }

        /* JADX INFO: renamed from: on */
        public MethodCall m384on(StackManipulation stackManipulation, TypeDescription typeDescription) {
            return new MethodCall(this.methodLocator, new TargetHandler.Simple(typeDescription, stackManipulation), this.argumentLoaders, new MethodInvoker.ForVirtualInvocation.Factory(typeDescription), this.terminationHandler, this.assigner, this.typing);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface MethodLocator {

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public interface Factory {
            MethodLocator make(TypeDescription typeDescription);
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class ForElementMatcher implements MethodLocator {
            private final TypeDescription instrumentedType;
            private final ElementMatcher<? super MethodDescription> matcher;
            private final MethodGraph.Compiler methodGraphCompiler;

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @HashCodeAndEqualsPlugin.Enhance
            public static class Factory implements Factory {
                private final ElementMatcher<? super MethodDescription> matcher;
                private final MethodGraph.Compiler methodGraphCompiler;

                public Factory(ElementMatcher<? super MethodDescription> elementMatcher, MethodGraph.Compiler compiler) {
                    this.matcher = elementMatcher;
                    this.methodGraphCompiler = compiler;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Factory factory = (Factory) obj;
                    return this.matcher.equals(factory.matcher) && this.methodGraphCompiler.equals(factory.methodGraphCompiler);
                }

                public int hashCode() {
                    return this.methodGraphCompiler.hashCode() + AbstractC3275.m5146(this.matcher, getClass().hashCode() * 31, 31);
                }

                @Override // net.bytebuddy.implementation.MethodCall.MethodLocator.Factory
                public MethodLocator make(TypeDescription typeDescription) {
                    return new ForElementMatcher(typeDescription, this.matcher, this.methodGraphCompiler);
                }
            }

            public ForElementMatcher(TypeDescription typeDescription, ElementMatcher<? super MethodDescription> elementMatcher, MethodGraph.Compiler compiler) {
                this.instrumentedType = typeDescription;
                this.matcher = elementMatcher;
                this.methodGraphCompiler = compiler;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForElementMatcher forElementMatcher = (ForElementMatcher) obj;
                return this.instrumentedType.equals(forElementMatcher.instrumentedType) && this.matcher.equals(forElementMatcher.matcher) && this.methodGraphCompiler.equals(forElementMatcher.methodGraphCompiler);
            }

            public int hashCode() {
                return this.methodGraphCompiler.hashCode() + AbstractC3275.m5146(this.matcher, AbstractC3275.m5144(this.instrumentedType, getClass().hashCode() * 31, 31), 31);
            }

            @Override // net.bytebuddy.implementation.MethodCall.MethodLocator
            public MethodDescription resolve(TypeDescription typeDescription, MethodDescription methodDescription) {
                TypeDescription.Generic superClass = this.instrumentedType.getSuperClass();
                List listM478of = CompoundList.m478of(superClass == null ? Collections.EMPTY_LIST : superClass.getDeclaredMethods().filter(ElementMatchers.isConstructor().and(this.matcher)), this.instrumentedType.getDeclaredMethods().filter(ElementMatchers.not(ElementMatchers.isVirtual()).and(this.matcher)), this.methodGraphCompiler.compile((TypeDefinition) typeDescription, this.instrumentedType).listNodes().asMethodList().filter(this.matcher));
                if (listM478of.size() == 1) {
                    return (MethodDescription) listM478of.get(0);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.instrumentedType);
                sb.append(" does not define exactly one virtual method or constructor for ");
                sb.append(this.matcher);
                int size = listM478of.size();
                sb.append(" but contained ");
                sb.append(size);
                sb.append(" candidates: ");
                sb.append(listM478of);
                throw new IllegalStateException(sb.toString());
            }
        }

        MethodDescription resolve(TypeDescription typeDescription, MethodDescription methodDescription);

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class ForExplicitMethod implements MethodLocator, Factory {
            private final MethodDescription methodDescription;

            public ForExplicitMethod(MethodDescription methodDescription) {
                this.methodDescription = methodDescription;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.methodDescription.equals(((ForExplicitMethod) obj).methodDescription);
            }

            public int hashCode() {
                return this.methodDescription.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.implementation.MethodCall.MethodLocator
            public MethodDescription resolve(TypeDescription typeDescription, MethodDescription methodDescription) {
                return this.methodDescription;
            }

            @Override // net.bytebuddy.implementation.MethodCall.MethodLocator.Factory
            public MethodLocator make(TypeDescription typeDescription) {
                return this;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum ForInstrumentedMethod implements MethodLocator, Factory {
            INSTANCE;

            @Override // net.bytebuddy.implementation.MethodCall.MethodLocator.Factory
            public MethodLocator make(TypeDescription typeDescription) {
                return this;
            }

            @Override // net.bytebuddy.implementation.MethodCall.MethodLocator
            public MethodDescription resolve(TypeDescription typeDescription, MethodDescription methodDescription) {
                return methodDescription;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface TerminationHandler {

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public interface Factory {
            TerminationHandler make(TypeDescription typeDescription);
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class FieldSetting implements TerminationHandler {
            private final FieldDescription fieldDescription;

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @HashCodeAndEqualsPlugin.Enhance
            public static class Explicit implements Factory {
                private final FieldDescription fieldDescription;

                public Explicit(FieldDescription fieldDescription) {
                    this.fieldDescription = fieldDescription;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.fieldDescription.equals(((Explicit) obj).fieldDescription);
                }

                public int hashCode() {
                    return this.fieldDescription.hashCode() + (getClass().hashCode() * 31);
                }

                @Override // net.bytebuddy.implementation.MethodCall.TerminationHandler.Factory
                public TerminationHandler make(TypeDescription typeDescription) {
                    if (!this.fieldDescription.isStatic() && !typeDescription.isAssignableTo(this.fieldDescription.getDeclaringType().asErasure())) {
                        C1123.m1407("Cannot set ", this.fieldDescription, " from ", typeDescription);
                        return null;
                    }
                    boolean zIsVisibleTo = this.fieldDescription.isVisibleTo(typeDescription);
                    FieldDescription fieldDescription = this.fieldDescription;
                    if (zIsVisibleTo) {
                        return new FieldSetting(fieldDescription);
                    }
                    C6385.m11446("Cannot access ", fieldDescription, " from ", typeDescription);
                    return null;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @HashCodeAndEqualsPlugin.Enhance
            public static class Implicit implements Factory {
                private final ElementMatcher<? super FieldDescription> matcher;

                public Implicit(ElementMatcher<? super FieldDescription> elementMatcher) {
                    this.matcher = elementMatcher;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.matcher.equals(((Implicit) obj).matcher);
                }

                public int hashCode() {
                    return this.matcher.hashCode() + (getClass().hashCode() * 31);
                }

                @Override // net.bytebuddy.implementation.MethodCall.TerminationHandler.Factory
                public TerminationHandler make(TypeDescription typeDescription) {
                    TypeDefinition superClass = typeDescription;
                    do {
                        FieldList fieldListFilter = superClass.getDeclaredFields().filter(ElementMatchers.isVisibleTo(typeDescription).and(this.matcher));
                        if (fieldListFilter.size() == 1) {
                            return new FieldSetting((FieldDescription) fieldListFilter.getOnly());
                        }
                        if (fieldListFilter.size() == 2) {
                            C6385.m11425(this.matcher, " is ambiguous and resolved: ", fieldListFilter);
                            return null;
                        }
                        superClass = superClass.getSuperClass();
                    } while (superClass != null);
                    C6385.m11425(this.matcher, " does not locate any accessible fields for ", typeDescription);
                    return null;
                }
            }

            public FieldSetting(FieldDescription fieldDescription) {
                this.fieldDescription = fieldDescription;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.fieldDescription.equals(((FieldSetting) obj).fieldDescription);
            }

            public int hashCode() {
                return this.fieldDescription.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.implementation.MethodCall.TerminationHandler
            public StackManipulation prepare() {
                return this.fieldDescription.isStatic() ? StackManipulation.Trivial.INSTANCE : MethodVariableAccess.loadThis();
            }

            @Override // net.bytebuddy.implementation.MethodCall.TerminationHandler
            public StackManipulation toStackManipulation(MethodDescription methodDescription, MethodDescription methodDescription2, Assigner assigner, Assigner.Typing typing) {
                StackManipulation stackManipulationAssign = assigner.assign(methodDescription.isConstructor() ? methodDescription.getDeclaringType().asGenericType() : methodDescription.getReturnType(), this.fieldDescription.getType(), typing);
                if (stackManipulationAssign.isValid()) {
                    return new StackManipulation.Compound(stackManipulationAssign, FieldAccess.forField(this.fieldDescription).write());
                }
                StringBuilder sb = new StringBuilder("Cannot assign result of ");
                sb.append(methodDescription);
                C6385.m11440(sb, " to ", this.fieldDescription);
                return null;
            }
        }

        StackManipulation prepare();

        StackManipulation toStackManipulation(MethodDescription methodDescription, MethodDescription methodDescription2, Assigner assigner, Assigner.Typing typing);

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum Simple implements TerminationHandler, Factory {
            RETURNING { // from class: net.bytebuddy.implementation.MethodCall.TerminationHandler.Simple.1
                @Override // net.bytebuddy.implementation.MethodCall.TerminationHandler
                public StackManipulation toStackManipulation(MethodDescription methodDescription, MethodDescription methodDescription2, Assigner assigner, Assigner.Typing typing) {
                    StackManipulation stackManipulationAssign = assigner.assign(methodDescription.isConstructor() ? methodDescription.getDeclaringType().asGenericType() : methodDescription.getReturnType(), methodDescription2.getReturnType(), typing);
                    if (stackManipulationAssign.isValid()) {
                        return new StackManipulation.Compound(stackManipulationAssign, MethodReturn.m448of(methodDescription2.getReturnType()));
                    }
                    C1123.m1407("Cannot return ", methodDescription.getReturnType(), " from ", methodDescription2);
                    return null;
                }
            },
            DROPPING { // from class: net.bytebuddy.implementation.MethodCall.TerminationHandler.Simple.2
                @Override // net.bytebuddy.implementation.MethodCall.TerminationHandler
                public StackManipulation toStackManipulation(MethodDescription methodDescription, MethodDescription methodDescription2, Assigner assigner, Assigner.Typing typing) {
                    return Removal.m432of(methodDescription.isConstructor() ? methodDescription.getDeclaringType() : methodDescription.getReturnType());
                }
            },
            IGNORING { // from class: net.bytebuddy.implementation.MethodCall.TerminationHandler.Simple.3
                @Override // net.bytebuddy.implementation.MethodCall.TerminationHandler
                public StackManipulation toStackManipulation(MethodDescription methodDescription, MethodDescription methodDescription2, Assigner assigner, Assigner.Typing typing) {
                    return StackManipulation.Trivial.INSTANCE;
                }
            };

            @Override // net.bytebuddy.implementation.MethodCall.TerminationHandler
            public StackManipulation prepare() {
                return StackManipulation.Trivial.INSTANCE;
            }

            @Override // net.bytebuddy.implementation.MethodCall.TerminationHandler.Factory
            public TerminationHandler make(TypeDescription typeDescription) {
                return this;
            }
        }
    }

    public FieldSetting setsField(Field field) {
        return setsField(new FieldDescription.ForLoadedField(field));
    }

    public MethodCall withField(String... strArr) {
        return withField(FieldLocator.ForClassHierarchy.Factory.INSTANCE, strArr);
    }

    public FieldSetting setsField(ElementMatcher<? super FieldDescription> elementMatcher) {
        return new FieldSetting(new MethodCall(this.methodLocator, this.targetHandler, this.argumentLoaders, this.methodInvoker, new TerminationHandler.FieldSetting.Implicit(elementMatcher), this.assigner, this.typing));
    }

    @Override // net.bytebuddy.implementation.Implementation.Composable
    public Implementation.Composable andThen(Implementation.Composable composable) {
        return new Implementation.Compound.Composable(new MethodCall(this.methodLocator, this.targetHandler, this.argumentLoaders, this.methodInvoker, TerminationHandler.Simple.DROPPING, this.assigner, this.typing), composable);
    }

    public MethodCall with(TypeDescription... typeDescriptionArr) {
        ArrayList arrayList = new ArrayList(typeDescriptionArr.length);
        for (TypeDescription typeDescription : typeDescriptionArr) {
            arrayList.add(new ArgumentLoader.ForStackManipulation(ClassConstant.m442of(typeDescription), Class.class));
        }
        return with(arrayList);
    }

    public static MethodCall construct(Constructor<?> constructor) {
        return construct(new MethodDescription.ForLoadedConstructor(constructor));
    }

    public MethodCall with(Object... objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(ArgumentLoader.ForStackManipulation.m380of(obj));
        }
        return with(arrayList);
    }

    public MethodCall with(ConstantValue... constantValueArr) {
        ArrayList arrayList = new ArrayList(constantValueArr.length);
        for (ConstantValue constantValue : constantValueArr) {
            arrayList.add(new ArgumentLoader.ForStackManipulation(constantValue.toStackManipulation(), constantValue.getTypeDescription()));
        }
        return with(arrayList);
    }

    public MethodCall with(JavaConstant... javaConstantArr) {
        return with((ConstantValue[]) javaConstantArr);
    }

    public MethodCall with(StackManipulation stackManipulation, Type type) {
        return with(stackManipulation, TypeDefinition.Sort.describe(type));
    }

    public MethodCall with(StackManipulation stackManipulation, TypeDefinition typeDefinition) {
        return with(new ArgumentLoader.ForStackManipulation(stackManipulation, typeDefinition));
    }

    public MethodCall with(ArgumentLoader.Factory... factoryArr) {
        return with(Arrays.asList(factoryArr));
    }

    public MethodCall with(List<? extends ArgumentLoader.Factory> list) {
        return new MethodCall(this.methodLocator, this.targetHandler, CompoundList.m477of((List) this.argumentLoaders, (List) list), this.methodInvoker, this.terminationHandler, this.assigner, this.typing);
    }

    public MethodCall withArgumentArrayElements(int i, int i2) {
        return withArgumentArrayElements(i, 0, i2);
    }

    public MethodCall withArgumentArrayElements(int i) {
        if (i >= 0) {
            return with(new ArgumentLoader.ForMethodParameterArrayElement.OfInvokedMethod(i));
        }
        C6755.m11869(AbstractC7012.m12147(i, "A parameter index cannot be negative: "));
        return null;
    }
}
