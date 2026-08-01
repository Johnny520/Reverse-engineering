package net.bytebuddy.implementation.bytecode.assign;

import io.ktor.util.C5043;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDefinition;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.StackSize;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class TypeCasting extends StackManipulation.AbstractBase {
    private final TypeDescription typeDescription;

    public TypeCasting(TypeDescription typeDescription) {
        this.typeDescription = typeDescription;
    }

    /* JADX INFO: renamed from: to */
    public static StackManipulation m440to(TypeDefinition typeDefinition) {
        if (!typeDefinition.isPrimitive()) {
            return new TypeCasting(typeDefinition.asErasure());
        }
        C5043.m9163(typeDefinition, "Cannot cast to primitive type: ");
        return null;
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
        methodVisitor.visitTypeInsn(192, this.typeDescription.getInternalName());
        return StackSize.ZERO.toIncreasingSize();
    }

    public boolean equals(@MaybeNull Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((TypeCasting) obj).typeDescription);
    }

    public int hashCode() {
        return this.typeDescription.hashCode() + (getClass().hashCode() * 31);
    }
}
