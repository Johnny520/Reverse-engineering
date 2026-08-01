package net.bytebuddy.utility.visitor;

import net.bytebuddy.jar.asm.Label;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.utility.OpenedClassReader;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class LineNumberPrependingMethodVisitor extends ExceptionTableSensitiveMethodVisitor {
    private boolean prependLineNumber;
    private final Label startOfMethod;

    public LineNumberPrependingMethodVisitor(MethodVisitor methodVisitor) {
        super(OpenedClassReader.ASM_API, methodVisitor);
        this.startOfMethod = new Label();
        this.prependLineNumber = true;
    }

    @Override // net.bytebuddy.utility.visitor.ExceptionTableSensitiveMethodVisitor
    public void onAfterExceptionTable() {
        visitLabel(this.startOfMethod);
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitLineNumber(int i, Label label) {
        if (this.prependLineNumber) {
            label = this.startOfMethod;
            this.prependLineNumber = false;
        }
        super.visitLineNumber(i, label);
    }
}
