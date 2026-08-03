package net.bytebuddy.implementation.bytecode.constant;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.StackSize;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: loaded from: classes2.dex */
public enum LongConstant implements StackManipulation {
    ZERO(9),
    ONE(10);

    private static final StackManipulation.Size SIZE = StackSize.DOUBLE.toIncreasingSize();
    private final int opcode;

    @HashCodeAndEqualsPlugin.Enhance
    public static class ConstantPool extends StackManipulation.AbstractBase {
        private final long value;

        public ConstantPool(long j) {
            this.value = j;
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            methodVisitor.visitLdcInsn(Long.valueOf(this.value));
            return LongConstant.SIZE;
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.value == ((ConstantPool) obj).value;
        }

        public int hashCode() {
            int iHashCode = getClass().hashCode() * 31;
            long j = this.value;
            return iHashCode + ((int) (j ^ (j >>> 32)));
        }
    }

    LongConstant(int i) {
        this.opcode = i;
    }

    public static StackManipulation forValue(long j) {
        return j == 0 ? ZERO : j == 1 ? ONE : new ConstantPool(j);
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
