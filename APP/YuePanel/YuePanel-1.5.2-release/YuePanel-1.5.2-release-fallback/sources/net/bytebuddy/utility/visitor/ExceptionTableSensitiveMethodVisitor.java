package net.bytebuddy.utility.visitor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ExceptionTableSensitiveMethodVisitor extends net.bytebuddy.jar.asm.MethodVisitor {
    private boolean trigger;

    public ExceptionTableSensitiveMethodVisitor(int r1, net.bytebuddy.jar.asm.MethodVisitor r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 1
            r0.trigger = r1
            return
    }

    private void considerEndOfExceptionTable() {
            r1 = this;
            boolean r0 = r1.trigger
            if (r0 == 0) goto La
            r0 = 0
            r1.trigger = r0
            r1.onAfterExceptionTable()
        La:
            return
    }

    public abstract void onAfterExceptionTable();

    public void onVisitFieldInsn(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            super.visitFieldInsn(r1, r2, r3, r4)
            return
    }

    public void onVisitFrame(int r1, int r2, java.lang.Object[] r3, int r4, java.lang.Object[] r5) {
            r0 = this;
            super.visitFrame(r1, r2, r3, r4, r5)
            return
    }

    public void onVisitIincInsn(int r1, int r2) {
            r0 = this;
            super.visitIincInsn(r1, r2)
            return
    }

    public void onVisitInsn(int r1) {
            r0 = this;
            super.visitInsn(r1)
            return
    }

    public void onVisitIntInsn(int r1, int r2) {
            r0 = this;
            super.visitIntInsn(r1, r2)
            return
    }

    public void onVisitInvokeDynamicInsn(java.lang.String r1, java.lang.String r2, net.bytebuddy.jar.asm.Handle r3, java.lang.Object... r4) {
            r0 = this;
            super.visitInvokeDynamicInsn(r1, r2, r3, r4)
            return
    }

    public void onVisitJumpInsn(int r1, net.bytebuddy.jar.asm.Label r2) {
            r0 = this;
            super.visitJumpInsn(r1, r2)
            return
    }

    public void onVisitLabel(net.bytebuddy.jar.asm.Label r1) {
            r0 = this;
            super.visitLabel(r1)
            return
    }

    public void onVisitLdcInsn(java.lang.Object r1) {
            r0 = this;
            super.visitLdcInsn(r1)
            return
    }

    public void onVisitLookupSwitchInsn(net.bytebuddy.jar.asm.Label r1, int[] r2, net.bytebuddy.jar.asm.Label[] r3) {
            r0 = this;
            super.visitLookupSwitchInsn(r1, r2, r3)
            return
    }

    @java.lang.Deprecated
    public void onVisitMethodInsn(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            super.visitMethodInsn(r1, r2, r3, r4)
            return
    }

    public void onVisitMethodInsn(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r0 = this;
            super.visitMethodInsn(r1, r2, r3, r4, r5)
            return
    }

    public void onVisitMultiANewArrayInsn(java.lang.String r1, int r2) {
            r0 = this;
            super.visitMultiANewArrayInsn(r1, r2)
            return
    }

    public void onVisitTableSwitchInsn(int r1, int r2, net.bytebuddy.jar.asm.Label r3, net.bytebuddy.jar.asm.Label... r4) {
            r0 = this;
            super.visitTableSwitchInsn(r1, r2, r3, r4)
            return
    }

    public void onVisitTypeInsn(int r1, java.lang.String r2) {
            r0 = this;
            super.visitTypeInsn(r1, r2)
            return
    }

    public void onVisitVarInsn(int r1, int r2) {
            r0 = this;
            super.visitVarInsn(r1, r2)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public final void visitFieldInsn(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.considerEndOfExceptionTable()
            r0.onVisitFieldInsn(r1, r2, r3, r4)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public final void visitFrame(int r1, int r2, java.lang.Object[] r3, int r4, java.lang.Object[] r5) {
            r0 = this;
            r0.considerEndOfExceptionTable()
            r0.onVisitFrame(r1, r2, r3, r4, r5)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public final void visitIincInsn(int r1, int r2) {
            r0 = this;
            r0.considerEndOfExceptionTable()
            r0.onVisitIincInsn(r1, r2)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public final void visitInsn(int r1) {
            r0 = this;
            r0.considerEndOfExceptionTable()
            r0.onVisitInsn(r1)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public final void visitIntInsn(int r1, int r2) {
            r0 = this;
            r0.considerEndOfExceptionTable()
            r0.onVisitIntInsn(r1, r2)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public final void visitInvokeDynamicInsn(java.lang.String r1, java.lang.String r2, net.bytebuddy.jar.asm.Handle r3, java.lang.Object... r4) {
            r0 = this;
            r0.considerEndOfExceptionTable()
            r0.onVisitInvokeDynamicInsn(r1, r2, r3, r4)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public final void visitJumpInsn(int r1, net.bytebuddy.jar.asm.Label r2) {
            r0 = this;
            r0.considerEndOfExceptionTable()
            r0.onVisitJumpInsn(r1, r2)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public final void visitLabel(net.bytebuddy.jar.asm.Label r1) {
            r0 = this;
            r0.considerEndOfExceptionTable()
            r0.onVisitLabel(r1)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public final void visitLdcInsn(java.lang.Object r1) {
            r0 = this;
            r0.considerEndOfExceptionTable()
            r0.onVisitLdcInsn(r1)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public final void visitLookupSwitchInsn(net.bytebuddy.jar.asm.Label r1, int[] r2, net.bytebuddy.jar.asm.Label[] r3) {
            r0 = this;
            r0.considerEndOfExceptionTable()
            r0.onVisitLookupSwitchInsn(r1, r2, r3)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public final void visitMethodInsn(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.considerEndOfExceptionTable()
            r0.onVisitMethodInsn(r1, r2, r3, r4)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public final void visitMethodInsn(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r0.considerEndOfExceptionTable()
            r0.onVisitMethodInsn(r1, r2, r3, r4, r5)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public final void visitMultiANewArrayInsn(java.lang.String r1, int r2) {
            r0 = this;
            r0.considerEndOfExceptionTable()
            r0.onVisitMultiANewArrayInsn(r1, r2)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public final void visitTableSwitchInsn(int r1, int r2, net.bytebuddy.jar.asm.Label r3, net.bytebuddy.jar.asm.Label... r4) {
            r0 = this;
            r0.considerEndOfExceptionTable()
            r0.onVisitTableSwitchInsn(r1, r2, r3, r4)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public final void visitTypeInsn(int r1, java.lang.String r2) {
            r0 = this;
            r0.considerEndOfExceptionTable()
            r0.onVisitTypeInsn(r1, r2)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public final void visitVarInsn(int r1, int r2) {
            r0 = this;
            r0.considerEndOfExceptionTable()
            r0.onVisitVarInsn(r1, r2)
            return
    }
}
