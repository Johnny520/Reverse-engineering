package net.bytebuddy.implementation.bytecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.utility.nullability.MaybeNull;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public interface ByteCodeAppender {

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @HashCodeAndEqualsPlugin.Enhance
    public static class Size {
        public static final Size ZERO = new Size(0, 0);
        private final int localVariableSize;
        private final int operandStackSize;

        public Size(int i, int i2) {
            this.operandStackSize = i;
            this.localVariableSize = i2;
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Size size = (Size) obj;
            return this.operandStackSize == size.operandStackSize && this.localVariableSize == size.localVariableSize;
        }

        public int getLocalVariableSize() {
            return this.localVariableSize;
        }

        public int getOperandStackSize() {
            return this.operandStackSize;
        }

        public int hashCode() {
            return (((getClass().hashCode() * 31) + this.operandStackSize) * 31) + this.localVariableSize;
        }

        public Size merge(Size size) {
            return new Size(Math.max(this.operandStackSize, size.operandStackSize), Math.max(this.localVariableSize, size.localVariableSize));
        }
    }

    Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription);

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @HashCodeAndEqualsPlugin.Enhance
    public static class Simple implements ByteCodeAppender {
        private final StackManipulation stackManipulation;

        public Simple(List<? extends StackManipulation> list) {
            this.stackManipulation = new StackManipulation.Compound(list);
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
            return new Size(this.stackManipulation.apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.stackManipulation.equals(((Simple) obj).stackManipulation);
        }

        public int hashCode() {
            return this.stackManipulation.hashCode() + (getClass().hashCode() * 31);
        }

        public Simple(StackManipulation... stackManipulationArr) {
            this((List<? extends StackManipulation>) Arrays.asList(stackManipulationArr));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @HashCodeAndEqualsPlugin.Enhance
    public static class Compound implements ByteCodeAppender {
        private final List<ByteCodeAppender> byteCodeAppenders;

        public Compound(List<? extends ByteCodeAppender> list) {
            this.byteCodeAppenders = new ArrayList();
            for (ByteCodeAppender byteCodeAppender : list) {
                boolean z = byteCodeAppender instanceof Compound;
                List<ByteCodeAppender> list2 = this.byteCodeAppenders;
                if (z) {
                    list2.addAll(((Compound) byteCodeAppender).byteCodeAppenders);
                } else {
                    list2.add(byteCodeAppender);
                }
            }
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
            Size size = new Size(0, methodDescription.getStackSize());
            Iterator<ByteCodeAppender> it = this.byteCodeAppenders.iterator();
            while (it.hasNext()) {
                size = size.merge(it.next().apply(methodVisitor, context, methodDescription));
            }
            return size;
        }

        public boolean equals(@MaybeNull Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.byteCodeAppenders.equals(((Compound) obj).byteCodeAppenders);
        }

        public int hashCode() {
            return this.byteCodeAppenders.hashCode() + (getClass().hashCode() * 31);
        }

        public Compound(ByteCodeAppender... byteCodeAppenderArr) {
            this((List<? extends ByteCodeAppender>) Arrays.asList(byteCodeAppenderArr));
        }
    }
}
