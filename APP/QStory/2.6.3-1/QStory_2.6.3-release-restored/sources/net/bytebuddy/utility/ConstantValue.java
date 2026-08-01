package net.bytebuddy.utility;

import androidx.activity.AbstractC0900;
import androidx.profileinstaller.AbstractC3275;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.enumeration.EnumerationDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.constant.ClassConstant;
import net.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.utility.JavaConstant;
import net.bytebuddy.utility.nullability.MaybeNull;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public interface ConstantValue {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @HashCodeAndEqualsPlugin.Enhance
    public static class Simple implements ConstantValue {
        private final StackManipulation stackManipulation;
        private final TypeDescription typeDescription;

        public Simple(StackManipulation stackManipulation, TypeDescription typeDescription) {
            this.stackManipulation = stackManipulation;
            this.typeDescription = typeDescription;
        }

        public static ConstantValue wrap(Object obj) {
            ConstantValue constantValueWrapOrNull = wrapOrNull(obj);
            if (constantValueWrapOrNull != null) {
                return constantValueWrapOrNull;
            }
            C6755.m11869(AbstractC0900.m713(obj, "Not a constant value: "));
            return null;
        }

        @MaybeNull
        public static ConstantValue wrapOrNull(Object obj) {
            if (obj instanceof ConstantValue) {
                return (ConstantValue) obj;
            }
            if (obj instanceof TypeDescription) {
                TypeDescription typeDescription = (TypeDescription) obj;
                return typeDescription.isPrimitive() ? new Simple(ClassConstant.m442of(typeDescription), TypeDescription.ForLoadedType.m289of(Class.class)) : JavaConstant.Simple.m490of(typeDescription);
            }
            if (obj instanceof EnumerationDescription) {
                EnumerationDescription enumerationDescription = (EnumerationDescription) obj;
                return new Simple(FieldAccess.forEnumeration(enumerationDescription), enumerationDescription.getEnumerationType());
            }
            if (obj instanceof Boolean) {
                return new Simple(IntegerConstant.forValue(((Boolean) obj).booleanValue()), TypeDescription.ForLoadedType.m289of(Boolean.TYPE));
            }
            if (obj instanceof Byte) {
                return new Simple(IntegerConstant.forValue(((Byte) obj).byteValue()), TypeDescription.ForLoadedType.m289of(Byte.TYPE));
            }
            if (obj instanceof Short) {
                return new Simple(IntegerConstant.forValue(((Short) obj).shortValue()), TypeDescription.ForLoadedType.m289of(Short.TYPE));
            }
            if (obj instanceof Character) {
                return new Simple(IntegerConstant.forValue(((Character) obj).charValue()), TypeDescription.ForLoadedType.m289of(Character.TYPE));
            }
            if (obj instanceof Class) {
                Class cls = (Class) obj;
                return cls.isPrimitive() ? new Simple(ClassConstant.m442of(TypeDescription.ForLoadedType.m289of(cls)), TypeDescription.ForLoadedType.m289of(Class.class)) : JavaConstant.Simple.m490of(TypeDescription.ForLoadedType.m289of(cls));
            }
            if (!(obj instanceof Enum)) {
                return JavaConstant.Simple.ofLoadedOrNull(obj);
            }
            Enum r2 = (Enum) obj;
            return new Simple(FieldAccess.forEnumeration(new EnumerationDescription.ForLoadedEnumeration(r2)), TypeDescription.ForLoadedType.m289of(r2.getDeclaringClass()));
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Simple simple = (Simple) obj;
            return this.stackManipulation.equals(simple.stackManipulation) && this.typeDescription.equals(simple.typeDescription);
        }

        @Override // net.bytebuddy.utility.ConstantValue
        public TypeDescription getTypeDescription() {
            return this.typeDescription;
        }

        public int hashCode() {
            return this.typeDescription.hashCode() + AbstractC3275.m5148(this.stackManipulation, getClass().hashCode() * 31, 31);
        }

        @Override // net.bytebuddy.utility.ConstantValue
        public StackManipulation toStackManipulation() {
            return this.stackManipulation;
        }
    }

    TypeDescription getTypeDescription();

    StackManipulation toStackManipulation();
}
