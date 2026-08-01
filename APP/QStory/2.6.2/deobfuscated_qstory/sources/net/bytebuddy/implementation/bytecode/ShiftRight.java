package net.bytebuddy.implementation.bytecode;

import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.jar.asm.MethodVisitor;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public enum ShiftRight implements StackManipulation {
    INTEGER(122, StackSize.SINGLE, Unsigned.INTEGER),
    LONG(123, StackSize.DOUBLE, Unsigned.LONG);

    private final int opcode;
    private final StackSize stackSize;
    private final StackManipulation unsigned;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum Unsigned implements StackManipulation {
        INTEGER(124, StackSize.SINGLE),
        LONG(125, StackSize.DOUBLE);

        private final int opcode;
        private final StackSize stackSize;

        Unsigned(int i, StackSize stackSize) {
            this.opcode = i;
            this.stackSize = stackSize;
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            methodVisitor.visitInsn(this.opcode);
            return this.stackSize.toDecreasingSize();
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return true;
        }
    }

    ShiftRight(int i, StackSize stackSize, StackManipulation stackManipulation) {
        this.opcode = i;
        this.stackSize = stackSize;
        this.unsigned = stackManipulation;
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
        methodVisitor.visitInsn(this.opcode);
        return this.stackSize.toDecreasingSize();
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
        return true;
    }

    public StackManipulation toUnsigned() {
        return this.unsigned;
    }
}
