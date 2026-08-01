package net.bytebuddy.utility;

import androidx.activity.AbstractC0053;
import androidx.profileinstaller.AbstractC2442;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.enumeration.EnumerationDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.constant.ClassConstant;
import net.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import net.bytebuddy.implementation.bytecode.member.FieldAccess;
import net.bytebuddy.utility.JavaConstant;
import net.bytebuddy.utility.nullability.MaybeNull;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public interface ConstantValue {

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
            C5919.m11249(AbstractC0053.m153(obj, "Not a constant value: "));
            return null;
        }

        @MaybeNull
        public static ConstantValue wrapOrNull(Object obj) {
            if (obj instanceof ConstantValue) {
                return (ConstantValue) obj;
            }
            if (obj instanceof TypeDescription) {
                TypeDescription typeDescription = (TypeDescription) obj;
                return typeDescription.isPrimitive() ? new Simple(ClassConstant.of(typeDescription), TypeDescription.ForLoadedType.of(Class.class)) : JavaConstant.Simple.of(typeDescription);
            }
            if (obj instanceof EnumerationDescription) {
                EnumerationDescription enumerationDescription = (EnumerationDescription) obj;
                return new Simple(FieldAccess.forEnumeration(enumerationDescription), enumerationDescription.getEnumerationType());
            }
            if (obj instanceof Boolean) {
                return new Simple(IntegerConstant.forValue(((Boolean) obj).booleanValue()), TypeDescription.ForLoadedType.of(Boolean.TYPE));
            }
            if (obj instanceof Byte) {
                return new Simple(IntegerConstant.forValue(((Byte) obj).byteValue()), TypeDescription.ForLoadedType.of(Byte.TYPE));
            }
            if (obj instanceof Short) {
                return new Simple(IntegerConstant.forValue(((Short) obj).shortValue()), TypeDescription.ForLoadedType.of(Short.TYPE));
            }
            if (obj instanceof Character) {
                return new Simple(IntegerConstant.forValue(((Character) obj).charValue()), TypeDescription.ForLoadedType.of(Character.TYPE));
            }
            if (obj instanceof Class) {
                Class cls = (Class) obj;
                return cls.isPrimitive() ? new Simple(ClassConstant.of(TypeDescription.ForLoadedType.of(cls)), TypeDescription.ForLoadedType.of(Class.class)) : JavaConstant.Simple.of(TypeDescription.ForLoadedType.of(cls));
            }
            if (!(obj instanceof Enum)) {
                return JavaConstant.Simple.ofLoadedOrNull(obj);
            }
            Enum r2 = (Enum) obj;
            return new Simple(FieldAccess.forEnumeration(new EnumerationDescription.ForLoadedEnumeration(r2)), TypeDescription.ForLoadedType.of(r2.getDeclaringClass()));
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
            return this.typeDescription.hashCode() + AbstractC2442.m4578(this.stackManipulation, getClass().hashCode() * 31, 31);
        }

        @Override // net.bytebuddy.utility.ConstantValue
        public StackManipulation toStackManipulation() {
            return this.stackManipulation;
        }
    }

    TypeDescription getTypeDescription();

    StackManipulation toStackManipulation();
}
