package net.bytebuddy.implementation;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import androidx.profileinstaller.AbstractC3275;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import lin.xposed.hook.javaplugin.C6385;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.field.FieldDescription;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.method.ParameterDescription;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.scaffold.FieldLocator;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.assign.Assigner;
import net.bytebuddy.implementation.bytecode.constant.ClassConstant;
import net.bytebuddy.implementation.bytecode.constant.DefaultValue;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.implementation.bytecode.member.MethodReturn;
import net.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.matcher.ElementMatchers;
import net.bytebuddy.utility.ConstantValue;
import net.bytebuddy.utility.JavaConstant;
import net.bytebuddy.utility.RandomString;
import net.bytebuddy.utility.nullability.AlwaysNull;
import net.bytebuddy.utility.nullability.MaybeNull;
import p025.AbstractC7012;
import p160.C8376;
import p352.C9620;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public abstract class FieldAccessor implements Implementation {
    protected final Assigner assigner;
    protected final FieldLocation fieldLocation;
    protected final Assigner.Typing typing;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface AssignerConfigurable extends PropertyConfigurable {
        PropertyConfigurable withAssigner(Assigner assigner, Assigner.Typing typing);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface FieldNameExtractor {

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum ForBeanProperty implements FieldNameExtractor {
            INSTANCE { // from class: net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor.ForBeanProperty.1
                @Override // net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor.ForBeanProperty
                public char resolve(char c) {
                    return Character.toLowerCase(c);
                }
            },
            CAPITALIZED { // from class: net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor.ForBeanProperty.2
                @Override // net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor.ForBeanProperty
                public char resolve(char c) {
                    return Character.toUpperCase(c);
                }
            };

            public abstract char resolve(char c);

            @Override // net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor
            public String resolve(MethodDescription methodDescription) {
                int i;
                String internalName = methodDescription.getInternalName();
                if (internalName.startsWith("get") || internalName.startsWith("set")) {
                    i = 3;
                } else {
                    if (!internalName.startsWith("is")) {
                        C1123.m1398(methodDescription, " does not follow Java bean naming conventions");
                        return null;
                    }
                    i = 2;
                }
                String strSubstring = internalName.substring(i);
                if (strSubstring.length() == 0) {
                    C1123.m1398(methodDescription, " does not specify a bean name");
                    return null;
                }
                return resolve(strSubstring.charAt(0)) + strSubstring.substring(1);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class ForFixedValue implements FieldNameExtractor {
            private final String name;

            public ForFixedValue(String str) {
                this.name = str;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.name.equals(((ForFixedValue) obj).name);
            }

            public int hashCode() {
                return this.name.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.FieldNameExtractor
            public String resolve(MethodDescription methodDescription) {
                return this.name;
            }
        }

        String resolve(MethodDescription methodDescription);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface OwnerTypeLocatable extends AssignerConfigurable {
        /* JADX INFO: renamed from: in */
        AssignerConfigurable mo364in(Class<?> cls);

        /* JADX INFO: renamed from: in */
        AssignerConfigurable mo365in(TypeDescription typeDescription);

        /* JADX INFO: renamed from: in */
        AssignerConfigurable mo366in(FieldLocator.Factory factory);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface PropertyConfigurable extends Implementation {
        Implementation.Composable setsArgumentAt(int i);

        Implementation.Composable setsDefaultValue();

        Implementation.Composable setsFieldValueOf(String str);

        Implementation.Composable setsFieldValueOf(Field field);

        Implementation.Composable setsFieldValueOf(FieldDescription fieldDescription);

        Implementation.Composable setsFieldValueOf(FieldNameExtractor fieldNameExtractor);

        Implementation.Composable setsReference(Object obj);

        Implementation.Composable setsReference(Object obj, String str);

        Implementation.Composable setsValue(Object obj);

        Implementation.Composable setsValue(TypeDescription typeDescription);

        Implementation.Composable setsValue(StackManipulation stackManipulation, Type type);

        Implementation.Composable setsValue(StackManipulation stackManipulation, TypeDescription.Generic generic);

        Implementation.Composable setsValue(ConstantValue constantValue);

        Implementation.Composable setsValue(JavaConstant javaConstant);
    }

    public FieldAccessor(FieldLocation fieldLocation, Assigner assigner, Assigner.Typing typing) {
        this.fieldLocation = fieldLocation;
        this.assigner = assigner;
        this.typing = typing;
    }

    /* JADX INFO: renamed from: of */
    public static OwnerTypeLocatable m361of(List<? extends FieldNameExtractor> list) {
        return new ForImplicitProperty(new FieldLocation.Relative(list));
    }

    public static OwnerTypeLocatable ofBeanProperty() {
        return m363of(FieldNameExtractor.ForBeanProperty.INSTANCE, FieldNameExtractor.ForBeanProperty.CAPITALIZED);
    }

    public static OwnerTypeLocatable ofField(String str) {
        return m362of(new FieldNameExtractor.ForFixedValue(str));
    }

    public boolean equals(@MaybeNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FieldAccessor fieldAccessor = (FieldAccessor) obj;
        return this.typing.equals(fieldAccessor.typing) && this.fieldLocation.equals(fieldAccessor.fieldLocation) && this.assigner.equals(fieldAccessor.assigner);
    }

    public int hashCode() {
        return this.typing.hashCode() + AbstractC3275.m5149(this.assigner, (this.fieldLocation.hashCode() + (getClass().hashCode() * 31)) * 31, 31);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @HashCodeAndEqualsPlugin.Enhance
    public static abstract class ForSetter<T> extends FieldAccessor implements Implementation.Composable {
        private final TerminationHandler terminationHandler;

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
        public class Appender implements ByteCodeAppender {
            private final FieldLocation.Prepared fieldLocation;

            @MaybeNull
            @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
            private final T initialized;
            private final TypeDescription instrumentedType;

            public Appender(TypeDescription typeDescription, @MaybeNull T t, FieldLocation.Prepared prepared) {
                this.instrumentedType = typeDescription;
                this.initialized = t;
                this.fieldLocation = prepared;
            }

            @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
            public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
                FieldDescription fieldDescriptionResolve = this.fieldLocation.resolve(methodDescription);
                if (!fieldDescriptionResolve.isStatic() && methodDescription.isStatic()) {
                    C6385.m11446("Cannot set instance field ", fieldDescriptionResolve, " from ", methodDescription);
                    return null;
                }
                if (fieldDescriptionResolve.isFinal() && methodDescription.isMethod()) {
                    C6385.m11446("Cannot set final field ", fieldDescriptionResolve, " from ", methodDescription);
                    return null;
                }
                StackManipulation stackManipulationResolve = ForSetter.this.resolve(this.initialized, fieldDescriptionResolve, this.instrumentedType, methodDescription);
                if (stackManipulationResolve.isValid()) {
                    return new ByteCodeAppender.Size(new StackManipulation.Compound(methodDescription.isStatic() ? StackManipulation.Trivial.INSTANCE : MethodVariableAccess.loadThis(), stackManipulationResolve, FieldAccess.forField(fieldDescriptionResolve).write(), ForSetter.this.terminationHandler.resolve(methodDescription)).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
                }
                C8376.m13333(fieldDescriptionResolve, "Set value cannot be assigned to ");
                return null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
            
                if (r2 != null) goto L21;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Appender appender = (Appender) obj;
                if (!this.instrumentedType.equals(appender.instrumentedType)) {
                    return false;
                }
                T t = this.initialized;
                T t2 = appender.initialized;
                if (t2 != null) {
                    if (t == null || !t.equals(t2)) {
                        return false;
                    }
                    return this.fieldLocation.equals(appender.fieldLocation) && ForSetter.this.equals(ForSetter.this);
                }
            }

            public int hashCode() {
                int iM5144 = AbstractC3275.m5144(this.instrumentedType, getClass().hashCode() * 31, 31);
                T t = this.initialized;
                if (t != null) {
                    iM5144 += t.hashCode();
                }
                int iHashCode = this.fieldLocation.hashCode();
                return ForSetter.this.hashCode() + ((iHashCode + (iM5144 * 31)) * 31);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum TerminationHandler {
            RETURNING { // from class: net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler.1
                @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler
                public StackManipulation resolve(MethodDescription methodDescription) {
                    if (methodDescription.getReturnType().represents(Void.TYPE)) {
                        return MethodReturn.VOID;
                    }
                    C6755.m11870(AbstractC3275.m5133("Cannot implement setter with return value for ", methodDescription));
                    return null;
                }
            },
            NON_OPERATIONAL { // from class: net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler.2
                @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter.TerminationHandler
                public StackManipulation resolve(MethodDescription methodDescription) {
                    return StackManipulation.Trivial.INSTANCE;
                }
            };

            public abstract StackManipulation resolve(MethodDescription methodDescription);
        }

        public ForSetter(FieldLocation fieldLocation, Assigner assigner, Assigner.Typing typing, TerminationHandler terminationHandler) {
            super(fieldLocation, assigner, typing);
            this.terminationHandler = terminationHandler;
        }

        @Override // net.bytebuddy.implementation.Implementation
        public ByteCodeAppender appender(Implementation.Target target) {
            return new Appender(target.getInstrumentedType(), initialize(target.getInstrumentedType()), this.fieldLocation.prepare(target.getInstrumentedType()));
        }

        @Override // net.bytebuddy.implementation.FieldAccessor
        public boolean equals(@MaybeNull Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.terminationHandler.equals(((ForSetter) obj).terminationHandler);
        }

        @Override // net.bytebuddy.implementation.FieldAccessor
        public int hashCode() {
            return this.terminationHandler.hashCode() + (super.hashCode() * 31);
        }

        @MaybeNull
        public abstract T initialize(TypeDescription typeDescription);

        public abstract StackManipulation resolve(@MaybeNull T t, FieldDescription fieldDescription, TypeDescription typeDescription, MethodDescription methodDescription);

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class OfConstantValue extends ForSetter<Void> {
            private final StackManipulation stackManipulation;
            private final TypeDescription.Generic typeDescription;

            public OfConstantValue(FieldLocation fieldLocation, Assigner assigner, Assigner.Typing typing, TerminationHandler terminationHandler, TypeDescription.Generic generic, StackManipulation stackManipulation) {
                super(fieldLocation, assigner, typing, terminationHandler);
                this.typeDescription = generic;
                this.stackManipulation = stackManipulation;
            }

            @Override // net.bytebuddy.implementation.Implementation.Composable
            public Implementation andThen(Implementation implementation) {
                return new Implementation.Compound(new OfConstantValue(this.fieldLocation, this.assigner, this.typing, TerminationHandler.NON_OPERATIONAL, this.typeDescription, this.stackManipulation), implementation);
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter, net.bytebuddy.implementation.FieldAccessor
            public boolean equals(@MaybeNull Object obj) {
                if (!super.equals(obj)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                OfConstantValue ofConstantValue = (OfConstantValue) obj;
                return this.typeDescription.equals(ofConstantValue.typeDescription) && this.stackManipulation.equals(ofConstantValue.stackManipulation);
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter, net.bytebuddy.implementation.FieldAccessor
            public int hashCode() {
                return this.stackManipulation.hashCode() + AbstractC3275.m5145(this.typeDescription, super.hashCode() * 31, 31);
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            public StackManipulation resolve(@MaybeNull Void r2, FieldDescription fieldDescription, TypeDescription typeDescription, MethodDescription methodDescription) {
                return new StackManipulation.Compound(this.stackManipulation, this.assigner.assign(this.typeDescription, fieldDescription.getType(), this.typing));
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            @AlwaysNull
            public Void initialize(TypeDescription typeDescription) {
                return null;
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public InstrumentedType prepare(InstrumentedType instrumentedType) {
                return instrumentedType;
            }

            @Override // net.bytebuddy.implementation.Implementation.Composable
            public Implementation.Composable andThen(Implementation.Composable composable) {
                return new Implementation.Compound.Composable(new OfConstantValue(this.fieldLocation, this.assigner, this.typing, TerminationHandler.NON_OPERATIONAL, this.typeDescription, this.stackManipulation), composable);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public static class OfDefaultValue extends ForSetter<Void> {
            public OfDefaultValue(FieldLocation fieldLocation, Assigner assigner, Assigner.Typing typing, TerminationHandler terminationHandler) {
                super(fieldLocation, assigner, typing, terminationHandler);
            }

            @Override // net.bytebuddy.implementation.Implementation.Composable
            public Implementation andThen(Implementation implementation) {
                return new Implementation.Compound(new OfDefaultValue(this.fieldLocation, this.assigner, this.typing, TerminationHandler.NON_OPERATIONAL), implementation);
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            public StackManipulation resolve(@MaybeNull Void r1, FieldDescription fieldDescription, TypeDescription typeDescription, MethodDescription methodDescription) {
                return DefaultValue.m443of(fieldDescription.getType());
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            @AlwaysNull
            public Void initialize(TypeDescription typeDescription) {
                return null;
            }

            @Override // net.bytebuddy.implementation.Implementation.Composable
            public Implementation.Composable andThen(Implementation.Composable composable) {
                return new Implementation.Compound.Composable(new OfDefaultValue(this.fieldLocation, this.assigner, this.typing, TerminationHandler.NON_OPERATIONAL), composable);
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public InstrumentedType prepare(InstrumentedType instrumentedType) {
                return instrumentedType;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class OfParameterValue extends ForSetter<Void> {
            private final int index;

            public OfParameterValue(FieldLocation fieldLocation, Assigner assigner, Assigner.Typing typing, TerminationHandler terminationHandler, int i) {
                super(fieldLocation, assigner, typing, terminationHandler);
                this.index = i;
            }

            @Override // net.bytebuddy.implementation.Implementation.Composable
            public Implementation andThen(Implementation implementation) {
                return new Implementation.Compound(new OfParameterValue(this.fieldLocation, this.assigner, this.typing, TerminationHandler.NON_OPERATIONAL, this.index), implementation);
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter, net.bytebuddy.implementation.FieldAccessor
            public boolean equals(@MaybeNull Object obj) {
                if (!super.equals(obj)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.index == ((OfParameterValue) obj).index;
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter, net.bytebuddy.implementation.FieldAccessor
            public int hashCode() {
                return (super.hashCode() * 31) + this.index;
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            public StackManipulation resolve(@MaybeNull Void r3, FieldDescription fieldDescription, TypeDescription typeDescription, MethodDescription methodDescription) {
                if (methodDescription.getParameters().size() > this.index) {
                    return new StackManipulation.Compound(MethodVariableAccess.load((ParameterDescription) methodDescription.getParameters().get(this.index)), this.assigner.assign(((ParameterDescription) methodDescription.getParameters().get(this.index)).getType(), fieldDescription.getType(), this.typing));
                }
                StringBuilder sb = new StringBuilder();
                sb.append(methodDescription);
                C6385.m11445(sb, " does not define a parameter with index ", this.index);
                return null;
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            @AlwaysNull
            public Void initialize(TypeDescription typeDescription) {
                return null;
            }

            @Override // net.bytebuddy.implementation.Implementation.Composable
            public Implementation.Composable andThen(Implementation.Composable composable) {
                return new Implementation.Compound.Composable(new OfParameterValue(this.fieldLocation, this.assigner, this.typing, TerminationHandler.NON_OPERATIONAL, this.index), composable);
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public InstrumentedType prepare(InstrumentedType instrumentedType) {
                return instrumentedType;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class OfFieldValue extends ForSetter<FieldLocation.Prepared> {
            private final FieldLocation target;

            public OfFieldValue(FieldLocation fieldLocation, Assigner assigner, Assigner.Typing typing, TerminationHandler terminationHandler, FieldLocation fieldLocation2) {
                super(fieldLocation, assigner, typing, terminationHandler);
                this.target = fieldLocation2;
            }

            @Override // net.bytebuddy.implementation.Implementation.Composable
            public Implementation andThen(Implementation implementation) {
                return new Implementation.Compound(new OfFieldValue(this.fieldLocation, this.assigner, this.typing, TerminationHandler.NON_OPERATIONAL, this.target), implementation);
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter, net.bytebuddy.implementation.FieldAccessor
            public boolean equals(@MaybeNull Object obj) {
                if (!super.equals(obj)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.target.equals(((OfFieldValue) obj).target);
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter, net.bytebuddy.implementation.FieldAccessor
            public int hashCode() {
                return this.target.hashCode() + (super.hashCode() * 31);
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            public FieldLocation.Prepared initialize(TypeDescription typeDescription) {
                return this.target.prepare(typeDescription);
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            public StackManipulation resolve(@MaybeNull FieldLocation.Prepared prepared, FieldDescription fieldDescription, TypeDescription typeDescription, MethodDescription methodDescription) {
                FieldDescription fieldDescriptionResolve = prepared.resolve(methodDescription);
                if (fieldDescriptionResolve.isStatic() || !methodDescription.isStatic()) {
                    return new StackManipulation.Compound(fieldDescriptionResolve.isStatic() ? StackManipulation.Trivial.INSTANCE : MethodVariableAccess.loadThis(), FieldAccess.forField(fieldDescriptionResolve).read(), this.assigner.assign(fieldDescriptionResolve.getType(), fieldDescription.getType(), this.typing));
                }
                C6385.m11446("Cannot set instance field ", fieldDescription, " from ", methodDescription);
                return null;
            }

            @Override // net.bytebuddy.implementation.Implementation.Composable
            public Implementation.Composable andThen(Implementation.Composable composable) {
                return new Implementation.Compound.Composable(new OfFieldValue(this.fieldLocation, this.assigner, this.typing, TerminationHandler.NON_OPERATIONAL, this.target), composable);
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public InstrumentedType prepare(InstrumentedType instrumentedType) {
                return instrumentedType;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class OfReferenceValue extends ForSetter<FieldDescription.InDefinedShape> {
            protected static final String PREFIX = "fixedFieldValue";
            private final String name;
            private final Object value;

            public OfReferenceValue(FieldLocation fieldLocation, Assigner assigner, Assigner.Typing typing, TerminationHandler terminationHandler, Object obj, String str) {
                super(fieldLocation, assigner, typing, terminationHandler);
                this.value = obj;
                this.name = str;
            }

            @Override // net.bytebuddy.implementation.Implementation.Composable
            public Implementation andThen(Implementation implementation) {
                return new Implementation.Compound(new OfReferenceValue(this.fieldLocation, this.assigner, this.typing, TerminationHandler.NON_OPERATIONAL, this.value, this.name), implementation);
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter, net.bytebuddy.implementation.FieldAccessor
            public boolean equals(@MaybeNull Object obj) {
                if (!super.equals(obj)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                OfReferenceValue ofReferenceValue = (OfReferenceValue) obj;
                return this.name.equals(ofReferenceValue.name) && this.value.equals(ofReferenceValue.value);
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter, net.bytebuddy.implementation.FieldAccessor
            public int hashCode() {
                return this.name.hashCode() + ((this.value.hashCode() + (super.hashCode() * 31)) * 31);
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            public FieldDescription.InDefinedShape initialize(TypeDescription typeDescription) {
                return (FieldDescription.InDefinedShape) typeDescription.getDeclaredFields().filter(ElementMatchers.named(this.name)).getOnly();
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public InstrumentedType prepare(InstrumentedType instrumentedType) {
                return instrumentedType.withAuxiliaryField(new FieldDescription.Token(this.name, 4105, TypeDescription.ForLoadedType.m289of(this.value.getClass()).asGenericType()), this.value);
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.ForSetter
            public StackManipulation resolve(@MaybeNull FieldDescription.InDefinedShape inDefinedShape, FieldDescription fieldDescription, TypeDescription typeDescription, MethodDescription methodDescription) {
                if (!fieldDescription.isFinal() || !methodDescription.isMethod()) {
                    return new StackManipulation.Compound(FieldAccess.forField(inDefinedShape).read(), this.assigner.assign(TypeDescription.ForLoadedType.m289of(this.value.getClass()).asGenericType(), fieldDescription.getType(), this.typing));
                }
                C6385.m11433("Cannot set final field ", fieldDescription, " from ", methodDescription);
                return null;
            }

            @Override // net.bytebuddy.implementation.Implementation.Composable
            public Implementation.Composable andThen(Implementation.Composable composable) {
                return new Implementation.Compound.Composable(new OfReferenceValue(this.fieldLocation, this.assigner, this.typing, TerminationHandler.NON_OPERATIONAL, this.value, this.name), composable);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface FieldLocation {

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class Absolute implements FieldLocation, Prepared {
            private final FieldDescription fieldDescription;

            public Absolute(FieldDescription fieldDescription) {
                this.fieldDescription = fieldDescription;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.fieldDescription.equals(((Absolute) obj).fieldDescription);
            }

            public int hashCode() {
                return this.fieldDescription.hashCode() + (getClass().hashCode() * 31);
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.FieldLocation
            public Prepared prepare(TypeDescription typeDescription) {
                if (!this.fieldDescription.isStatic() && !typeDescription.isAssignableTo(this.fieldDescription.getDeclaringType().asErasure())) {
                    C6385.m11425(this.fieldDescription, " is not declared by ", typeDescription);
                    return null;
                }
                if (this.fieldDescription.isAccessibleTo(typeDescription)) {
                    return this;
                }
                C1123.m1407("Cannot access ", this.fieldDescription, " from ", typeDescription);
                return null;
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.FieldLocation.Prepared
            public FieldDescription resolve(MethodDescription methodDescription) {
                return this.fieldDescription;
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.FieldLocation
            public FieldLocation with(FieldLocator.Factory factory) {
                throw new IllegalStateException("Cannot specify a field locator factory for an absolute field location");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public interface Prepared {
            FieldDescription resolve(MethodDescription methodDescription);
        }

        Prepared prepare(TypeDescription typeDescription);

        FieldLocation with(FieldLocator.Factory factory);

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance
        public static class Relative implements FieldLocation {
            private final FieldLocator.Factory fieldLocatorFactory;
            private final List<? extends FieldNameExtractor> fieldNameExtractors;

            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @HashCodeAndEqualsPlugin.Enhance
            public static class Prepared implements Prepared {
                private final FieldLocator fieldLocator;
                private final List<? extends FieldNameExtractor> fieldNameExtractors;

                public Prepared(List<? extends FieldNameExtractor> list, FieldLocator fieldLocator) {
                    this.fieldNameExtractors = list;
                    this.fieldLocator = fieldLocator;
                }

                public boolean equals(@MaybeNull Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Prepared prepared = (Prepared) obj;
                    return this.fieldNameExtractors.equals(prepared.fieldNameExtractors) && this.fieldLocator.equals(prepared.fieldLocator);
                }

                public int hashCode() {
                    return this.fieldLocator.hashCode() + AbstractC0900.m720(this.fieldNameExtractors, getClass().hashCode() * 31, 31);
                }

                @Override // net.bytebuddy.implementation.FieldAccessor.FieldLocation.Prepared
                public FieldDescription resolve(MethodDescription methodDescription) {
                    FieldLocator.Resolution resolutionLocate = FieldLocator.Resolution.Illegal.INSTANCE;
                    Iterator<? extends FieldNameExtractor> it = this.fieldNameExtractors.iterator();
                    while (it.hasNext() && !resolutionLocate.isResolved()) {
                        resolutionLocate = this.fieldLocator.locate(it.next().resolve(methodDescription));
                    }
                    if (resolutionLocate.isResolved()) {
                        return resolutionLocate.getField();
                    }
                    StringBuilder sb = new StringBuilder("Cannot resolve field for ");
                    sb.append(methodDescription);
                    C6385.m11440(sb, " using ", this.fieldLocator);
                    return null;
                }
            }

            private Relative(List<? extends FieldNameExtractor> list, FieldLocator.Factory factory) {
                this.fieldNameExtractors = list;
                this.fieldLocatorFactory = factory;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Relative relative = (Relative) obj;
                return this.fieldNameExtractors.equals(relative.fieldNameExtractors) && this.fieldLocatorFactory.equals(relative.fieldLocatorFactory);
            }

            public int hashCode() {
                return this.fieldLocatorFactory.hashCode() + AbstractC0900.m720(this.fieldNameExtractors, getClass().hashCode() * 31, 31);
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.FieldLocation
            public Prepared prepare(TypeDescription typeDescription) {
                return new Prepared(this.fieldNameExtractors, this.fieldLocatorFactory.make(typeDescription));
            }

            @Override // net.bytebuddy.implementation.FieldAccessor.FieldLocation
            public FieldLocation with(FieldLocator.Factory factory) {
                return new Relative(this.fieldNameExtractors, factory);
            }

            public Relative(List<? extends FieldNameExtractor> list) {
                this(list, FieldLocator.ForClassHierarchy.Factory.INSTANCE);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class ForImplicitProperty extends FieldAccessor implements OwnerTypeLocatable {

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
        public class Appender implements ByteCodeAppender {
            private final FieldLocation.Prepared fieldLocation;

            public Appender(FieldLocation.Prepared prepared) {
                this.fieldLocation = prepared;
            }

            @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
            public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
                StackManipulation.Compound compound;
                if (!methodDescription.isMethod()) {
                    C1123.m1398(methodDescription, " does not describe a field getter or setter");
                    return null;
                }
                FieldDescription fieldDescriptionResolve = this.fieldLocation.resolve(methodDescription);
                if (!fieldDescriptionResolve.isStatic() && methodDescription.isStatic()) {
                    C6385.m11446("Cannot set instance field ", fieldDescriptionResolve, " from ", methodDescription);
                    return null;
                }
                StackManipulation stackManipulationLoadThis = fieldDescriptionResolve.isStatic() ? StackManipulation.Trivial.INSTANCE : MethodVariableAccess.loadThis();
                TypeDescription.Generic returnType = methodDescription.getReturnType();
                Class cls = Void.TYPE;
                if (!returnType.represents(cls)) {
                    compound = new StackManipulation.Compound(stackManipulationLoadThis, FieldAccess.forField(fieldDescriptionResolve).read(), ForImplicitProperty.this.assigner.assign(fieldDescriptionResolve.getType(), methodDescription.getReturnType(), ForImplicitProperty.this.typing), MethodReturn.m448of(methodDescription.getReturnType()));
                } else {
                    if (!methodDescription.getReturnType().represents(cls) || methodDescription.getParameters().size() != 1) {
                        C9620.m15031(methodDescription, "Method ", " is no bean accessor");
                        return null;
                    }
                    if (fieldDescriptionResolve.isFinal() && methodDescription.isMethod()) {
                        C6385.m11446("Cannot set final field ", fieldDescriptionResolve, " from ", methodDescription);
                        return null;
                    }
                    compound = new StackManipulation.Compound(stackManipulationLoadThis, MethodVariableAccess.load((ParameterDescription) methodDescription.getParameters().get(0)), ForImplicitProperty.this.assigner.assign(((ParameterDescription) methodDescription.getParameters().get(0)).getType(), fieldDescriptionResolve.getType(), ForImplicitProperty.this.typing), FieldAccess.forField(fieldDescriptionResolve).write(), MethodReturn.VOID);
                }
                if (compound.isValid()) {
                    return new ByteCodeAppender.Size(compound.apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
                }
                C6385.m11446("Cannot set or get value of ", methodDescription, " using ", fieldDescriptionResolve);
                return null;
            }

            public boolean equals(@MaybeNull Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Appender appender = (Appender) obj;
                return this.fieldLocation.equals(appender.fieldLocation) && ForImplicitProperty.this.equals(ForImplicitProperty.this);
            }

            public int hashCode() {
                return ForImplicitProperty.this.hashCode() + ((this.fieldLocation.hashCode() + (getClass().hashCode() * 31)) * 31);
            }
        }

        public ForImplicitProperty(FieldLocation fieldLocation) {
            this(fieldLocation, Assigner.DEFAULT, Assigner.Typing.STATIC);
        }

        @Override // net.bytebuddy.implementation.Implementation
        public ByteCodeAppender appender(Implementation.Target target) {
            return new Appender(this.fieldLocation.prepare(target.getInstrumentedType()));
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.OwnerTypeLocatable
        /* JADX INFO: renamed from: in */
        public AssignerConfigurable mo366in(FieldLocator.Factory factory) {
            return new ForImplicitProperty(this.fieldLocation.with(factory), this.assigner, this.typing);
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable
        public Implementation.Composable setsArgumentAt(int i) {
            if (i >= 0) {
                return new ForSetter.OfParameterValue(this.fieldLocation, this.assigner, this.typing, ForSetter.TerminationHandler.RETURNING, i);
            }
            C6755.m11869(AbstractC7012.m12147(i, "A parameter index cannot be negative: "));
            return null;
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable
        public Implementation.Composable setsDefaultValue() {
            return new ForSetter.OfDefaultValue(this.fieldLocation, this.assigner, this.typing, ForSetter.TerminationHandler.RETURNING);
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable
        public Implementation.Composable setsFieldValueOf(FieldNameExtractor fieldNameExtractor) {
            return new ForSetter.OfFieldValue(this.fieldLocation, this.assigner, this.typing, ForSetter.TerminationHandler.RETURNING, new FieldLocation.Relative(Collections.singletonList(fieldNameExtractor)));
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable
        public Implementation.Composable setsReference(Object obj) {
            return setsReference(obj, "fixedFieldValue$" + RandomString.hashOf(obj));
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable
        public Implementation.Composable setsValue(@MaybeNull Object obj) {
            if (obj == null) {
                return setsDefaultValue();
            }
            ConstantValue constantValueWrapOrNull = ConstantValue.Simple.wrapOrNull(obj);
            return constantValueWrapOrNull == null ? setsReference(obj) : setsValue(constantValueWrapOrNull.toStackManipulation(), constantValueWrapOrNull.getTypeDescription().asGenericType());
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.AssignerConfigurable
        public PropertyConfigurable withAssigner(Assigner assigner, Assigner.Typing typing) {
            return new ForImplicitProperty(this.fieldLocation, assigner, typing);
        }

        private ForImplicitProperty(FieldLocation fieldLocation, Assigner assigner, Assigner.Typing typing) {
            super(fieldLocation, assigner, typing);
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.OwnerTypeLocatable
        /* JADX INFO: renamed from: in */
        public AssignerConfigurable mo365in(TypeDescription typeDescription) {
            return mo366in(new FieldLocator.ForExactType.Factory(typeDescription));
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.OwnerTypeLocatable
        /* JADX INFO: renamed from: in */
        public AssignerConfigurable mo364in(Class<?> cls) {
            return mo365in(TypeDescription.ForLoadedType.m289of(cls));
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable
        public Implementation.Composable setsFieldValueOf(FieldDescription fieldDescription) {
            return new ForSetter.OfFieldValue(this.fieldLocation, this.assigner, this.typing, ForSetter.TerminationHandler.RETURNING, new FieldLocation.Absolute(fieldDescription));
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable
        public Implementation.Composable setsReference(Object obj, String str) {
            return new ForSetter.OfReferenceValue(this.fieldLocation, this.assigner, this.typing, ForSetter.TerminationHandler.RETURNING, obj, str);
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable
        public Implementation.Composable setsFieldValueOf(String str) {
            return setsFieldValueOf(new FieldNameExtractor.ForFixedValue(str));
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable
        public Implementation.Composable setsFieldValueOf(Field field) {
            return setsFieldValueOf(new FieldDescription.ForLoadedField(field));
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public InstrumentedType prepare(InstrumentedType instrumentedType) {
            return instrumentedType;
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable
        public Implementation.Composable setsValue(TypeDescription typeDescription) {
            return setsValue(ClassConstant.m442of(typeDescription), Class.class);
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable
        public Implementation.Composable setsValue(ConstantValue constantValue) {
            return setsValue(constantValue.toStackManipulation(), constantValue.getTypeDescription().asGenericType());
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable
        public Implementation.Composable setsValue(JavaConstant javaConstant) {
            return setsValue((ConstantValue) javaConstant);
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable
        public Implementation.Composable setsValue(StackManipulation stackManipulation, Type type) {
            return setsValue(stackManipulation, TypeDefinition.Sort.describe(type));
        }

        @Override // net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable
        public Implementation.Composable setsValue(StackManipulation stackManipulation, TypeDescription.Generic generic) {
            return new ForSetter.OfConstantValue(this.fieldLocation, this.assigner, this.typing, ForSetter.TerminationHandler.RETURNING, generic, stackManipulation);
        }
    }

    /* JADX INFO: renamed from: of */
    public static OwnerTypeLocatable m363of(FieldNameExtractor... fieldNameExtractorArr) {
        return m361of((List<? extends FieldNameExtractor>) Arrays.asList(fieldNameExtractorArr));
    }

    /* JADX INFO: renamed from: of */
    public static OwnerTypeLocatable m362of(FieldNameExtractor fieldNameExtractor) {
        return m361of((List<? extends FieldNameExtractor>) Collections.singletonList(fieldNameExtractor));
    }

    /* JADX INFO: renamed from: of */
    public static AssignerConfigurable m359of(Field field) {
        return m360of(new FieldDescription.ForLoadedField(field));
    }

    /* JADX INFO: renamed from: of */
    public static AssignerConfigurable m360of(FieldDescription fieldDescription) {
        return new ForImplicitProperty(new FieldLocation.Absolute(fieldDescription));
    }
}
