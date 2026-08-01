package net.bytebuddy.implementation.bytecode;

import androidx.profileinstaller.AbstractC2442;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.utility.nullability.MaybeNull;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class TypeCreation extends StackManipulation.AbstractBase {
    private final TypeDescription typeDescription;

    public TypeCreation(TypeDescription typeDescription) {
        this.typeDescription = typeDescription;
    }

    public static StackManipulation of(TypeDescription typeDescription) {
        if (!typeDescription.isArray() && !typeDescription.isPrimitive() && !typeDescription.isAbstract()) {
            return new TypeCreation(typeDescription);
        }
        C5919.m11249(AbstractC2442.m4554(typeDescription, " is not instantiable"));
        return null;
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
        methodVisitor.visitTypeInsn(187, this.typeDescription.getInternalName());
        return new StackManipulation.Size(1, 1);
    }

    public boolean equals(@MaybeNull Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((TypeCreation) obj).typeDescription);
    }

    public int hashCode() {
        return this.typeDescription.hashCode() + (getClass().hashCode() * 31);
    }
}
