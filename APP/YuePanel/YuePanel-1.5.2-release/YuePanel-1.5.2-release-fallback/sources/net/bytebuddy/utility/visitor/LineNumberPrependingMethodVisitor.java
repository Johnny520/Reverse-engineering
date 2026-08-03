package net.bytebuddy.utility.visitor;

/* JADX INFO: loaded from: classes2.dex */
public class LineNumberPrependingMethodVisitor extends net.bytebuddy.utility.visitor.ExceptionTableSensitiveMethodVisitor {
    private boolean prependLineNumber;
    private final net.bytebuddy.jar.asm.Label startOfMethod;

    public LineNumberPrependingMethodVisitor(net.bytebuddy.jar.asm.MethodVisitor r2) {
            r1 = this;
            int r0 = net.bytebuddy.utility.OpenedClassReader.ASM_API
            r1.<init>(r0, r2)
            net.bytebuddy.jar.asm.Label r2 = new net.bytebuddy.jar.asm.Label
            r2.<init>()
            r1.startOfMethod = r2
            r2 = 1
            r1.prependLineNumber = r2
            return
    }

    @Override // net.bytebuddy.utility.visitor.ExceptionTableSensitiveMethodVisitor
    public void onAfterExceptionTable() {
            r1 = this;
            net.bytebuddy.jar.asm.Label r0 = r1.startOfMethod
            super.visitLabel(r0)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitLineNumber(int r2, net.bytebuddy.jar.asm.Label r3) {
            r1 = this;
            boolean r0 = r1.prependLineNumber
            if (r0 == 0) goto L9
            net.bytebuddy.jar.asm.Label r3 = r1.startOfMethod
            r0 = 0
            r1.prependLineNumber = r0
        L9:
            super.visitLineNumber(r2, r3)
            return
    }
}
