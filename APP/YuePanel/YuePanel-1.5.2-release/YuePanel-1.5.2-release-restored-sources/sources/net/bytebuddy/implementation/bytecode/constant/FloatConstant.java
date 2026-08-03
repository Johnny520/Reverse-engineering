package net.bytebuddy.implementation.bytecode.constant;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.StackSize;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: loaded from: classes2.dex */
public enum FloatConstant implements StackManipulation {
    ZERO(11),
    ONE(12),
    TWO(13);

    private static final StackManipulation.Size SIZE = StackSize.SINGLE.toIncreasingSize();
    private final int opcode;

    @HashCodeAndEqualsPlugin.Enhance
    public static class ConstantPool extends StackManipulation.AbstractBase {
        private final float value;

        public ConstantPool(float f) {
            this.value = f;
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            methodVisitor.visitLdcInsn(Float.valueOf(this.value));
            return FloatConstant.SIZE;
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && Float.compare(this.value, ((ConstantPool) obj).value) == 0;
        }

        public int hashCode() {
            return (getClass().hashCode() * 31) + Float.floatToIntBits(this.value);
        }
    }

    FloatConstant(int i) {
        this.opcode = i;
    }

    public static StackManipulation forValue(float f) {
        return f == 0.0f ? ZERO : f == 1.0f ? ONE : f == 2.0f ? TWO : new ConstantPool(f);
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
        methodVisitor.visitInsn(this.opcode);
        return SIZE;
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
        return true;
    }
}
