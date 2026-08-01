package net.bytebuddy.implementation.bytecode.assign;

import androidx.profileinstaller.AbstractC3275;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.utility.nullability.MaybeNull;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class InstanceCheck extends StackManipulation.AbstractBase {
    private final TypeDescription typeDescription;

    public InstanceCheck(TypeDescription typeDescription) {
        this.typeDescription = typeDescription;
    }

    /* JADX INFO: renamed from: of */
    public static StackManipulation m439of(TypeDescription typeDescription) {
        if (!typeDescription.isPrimitive()) {
            return new InstanceCheck(typeDescription);
        }
        C6755.m11869(AbstractC3275.m5132("Cannot check an instance against a primitive type: ", typeDescription));
        return null;
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
        methodVisitor.visitTypeInsn(193, this.typeDescription.getInternalName());
        return StackManipulation.Size.ZERO;
    }

    public boolean equals(@MaybeNull Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((InstanceCheck) obj).typeDescription);
    }

    public int hashCode() {
        return this.typeDescription.hashCode() + (getClass().hashCode() * 31);
    }
}
