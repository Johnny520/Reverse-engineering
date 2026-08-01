package net.bytebuddy.implementation.bytecode;

import androidx.profileinstaller.AbstractC2442;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.utility.nullability.MaybeNull;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
        C5925.m11310(AbstractC2442.m4565(typeDescription, " is not instantiable"));
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
