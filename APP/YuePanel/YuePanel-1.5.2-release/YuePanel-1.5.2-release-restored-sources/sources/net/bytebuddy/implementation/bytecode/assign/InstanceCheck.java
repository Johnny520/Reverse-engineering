package net.bytebuddy.implementation.bytecode.assign;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: loaded from: classes2.dex */
@HashCodeAndEqualsPlugin.Enhance
public class InstanceCheck extends StackManipulation.AbstractBase {
    private final TypeDescription typeDescription;

    public InstanceCheck(TypeDescription typeDescription) {
        this.typeDescription = typeDescription;
    }

    /* JADX INFO: renamed from: of */
    public static StackManipulation m5377of(TypeDescription typeDescription) {
        if (!typeDescription.isPrimitive()) {
            return new InstanceCheck(typeDescription);
        }
        throw new IllegalArgumentException("Cannot check an instance against a primitive type: " + typeDescription);
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
        return (getClass().hashCode() * 31) + this.typeDescription.hashCode();
    }
}
