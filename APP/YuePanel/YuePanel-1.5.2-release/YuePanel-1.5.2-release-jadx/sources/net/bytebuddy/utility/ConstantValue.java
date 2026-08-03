package net.bytebuddy.utility;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.enumeration.EnumerationDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.constant.ClassConstant;
import net.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.utility.JavaConstant;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: loaded from: classes2.dex */
public interface ConstantValue {

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
            throw new IllegalArgumentException("Not a constant value: " + obj);
        }

        @MaybeNull
        public static ConstantValue wrapOrNull(Object obj) {
            if (obj instanceof ConstantValue) {
                return (ConstantValue) obj;
            }
            if (obj instanceof TypeDescription) {
                TypeDescription typeDescription = (TypeDescription) obj;
                return typeDescription.isPrimitive() ? new Simple(ClassConstant.m5380of(typeDescription), TypeDescription.ForLoadedType.m5238of(Class.class)) : JavaConstant.Simple.m5427of(typeDescription);
            }
            if (obj instanceof EnumerationDescription) {
                EnumerationDescription enumerationDescription = (EnumerationDescription) obj;
                return new Simple(FieldAccess.forEnumeration(enumerationDescription), enumerationDescription.getEnumerationType());
            }
            if (obj instanceof Boolean) {
                return new Simple(IntegerConstant.forValue(((Boolean) obj).booleanValue()), TypeDescription.ForLoadedType.m5238of(Boolean.TYPE));
            }
            if (obj instanceof Byte) {
                return new Simple(IntegerConstant.forValue(((Byte) obj).byteValue()), TypeDescription.ForLoadedType.m5238of(Byte.TYPE));
            }
            if (obj instanceof Short) {
                return new Simple(IntegerConstant.forValue(((Short) obj).shortValue()), TypeDescription.ForLoadedType.m5238of(Short.TYPE));
            }
            if (obj instanceof Character) {
                return new Simple(IntegerConstant.forValue(((Character) obj).charValue()), TypeDescription.ForLoadedType.m5238of(Character.TYPE));
            }
            if (obj instanceof Class) {
                Class cls = (Class) obj;
                return cls.isPrimitive() ? new Simple(ClassConstant.m5380of(TypeDescription.ForLoadedType.m5238of(cls)), TypeDescription.ForLoadedType.m5238of(Class.class)) : JavaConstant.Simple.m5427of(TypeDescription.ForLoadedType.m5238of(cls));
            }
            if (!(obj instanceof Enum)) {
                return JavaConstant.Simple.ofLoadedOrNull(obj);
            }
            Enum r2 = (Enum) obj;
            return new Simple(FieldAccess.forEnumeration(new EnumerationDescription.ForLoadedEnumeration(r2)), TypeDescription.ForLoadedType.m5238of(r2.getDeclaringClass()));
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
            return (((getClass().hashCode() * 31) + this.stackManipulation.hashCode()) * 31) + this.typeDescription.hashCode();
        }

        @Override // net.bytebuddy.utility.ConstantValue
        public StackManipulation toStackManipulation() {
            return this.stackManipulation;
        }
    }

    TypeDescription getTypeDescription();

    StackManipulation toStackManipulation();
}
