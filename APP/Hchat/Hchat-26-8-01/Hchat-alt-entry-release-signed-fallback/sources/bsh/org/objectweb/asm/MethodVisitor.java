package bsh.org.objectweb.asm;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class MethodVisitor {
    private static final java.lang.String REQUIRES_ASM5 = "This feature requires ASM5";
    protected final int api;
    protected bsh.org.objectweb.asm.MethodVisitor mv;

    public MethodVisitor(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MethodVisitor(int r2, bsh.org.objectweb.asm.MethodVisitor r3) {
            r1 = this;
            r1.<init>()
            r0 = 393216(0x60000, float:5.51013E-40)
            if (r2 == r0) goto L15
            r0 = 327680(0x50000, float:4.59177E-40)
            if (r2 == r0) goto L15
            r0 = 262144(0x40000, float:3.67342E-40)
            if (r2 != r0) goto L10
            goto L15
        L10:
            j8.o.o()
            r2 = 0
            throw r2
        L15:
            r1.api = r2
            r1.mv = r3
            return
    }

    public void visitAnnotableParameterCount(int r2, boolean r3) {
            r1 = this;
            bsh.org.objectweb.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitAnnotableParameterCount(r2, r3)
        L7:
            return
    }

    public void visitAttribute(bsh.org.objectweb.asm.Attribute r2) {
            r1 = this;
            bsh.org.objectweb.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitAttribute(r2)
        L7:
            return
    }

    public void visitCode() {
            r1 = this;
            bsh.org.objectweb.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitCode()
        L7:
            return
    }

    public void visitEnd() {
            r1 = this;
            bsh.org.objectweb.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitEnd()
        L7:
            return
    }

    public void visitFieldInsn(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            bsh.org.objectweb.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitFieldInsn(r2, r3, r4, r5)
        L7:
            return
    }

    public void visitFrame(int r7, int r8, java.lang.Object[] r9, int r10, java.lang.Object[] r11) {
            r6 = this;
            bsh.org.objectweb.asm.MethodVisitor r0 = r6.mv
            if (r0 == 0) goto Lc
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.visitFrame(r1, r2, r3, r4, r5)
        Lc:
            return
    }

    public void visitIincInsn(int r2, int r3) {
            r1 = this;
            bsh.org.objectweb.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitIincInsn(r2, r3)
        L7:
            return
    }

    public void visitInsn(int r2) {
            r1 = this;
            bsh.org.objectweb.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitInsn(r2)
        L7:
            return
    }

    public void visitIntInsn(int r2, int r3) {
            r1 = this;
            bsh.org.objectweb.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitIntInsn(r2, r3)
        L7:
            return
    }

    public void visitInvokeDynamicInsn(java.lang.String r3, java.lang.String r4, bsh.org.objectweb.asm.Handle r5, java.lang.Object... r6) {
            r2 = this;
            int r0 = r2.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 < r1) goto Le
            bsh.org.objectweb.asm.MethodVisitor r0 = r2.mv
            if (r0 == 0) goto Ld
            r0.visitInvokeDynamicInsn(r3, r4, r5, r6)
        Ld:
            return
        Le:
            java.lang.String r3 = "This feature requires ASM5"
            j8.o.w(r3)
            return
    }

    public void visitJumpInsn(int r2, bsh.org.objectweb.asm.Label r3) {
            r1 = this;
            bsh.org.objectweb.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitJumpInsn(r2, r3)
        L7:
            return
    }

    public void visitLabel(bsh.org.objectweb.asm.Label r2) {
            r1 = this;
            bsh.org.objectweb.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitLabel(r2)
        L7:
            return
    }

    public void visitLdcInsn(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 >= r1) goto L20
            boolean r0 = r3 instanceof bsh.org.objectweb.asm.Handle
            if (r0 != 0) goto L1a
            boolean r0 = r3 instanceof bsh.org.objectweb.asm.Type
            if (r0 == 0) goto L20
            r0 = r3
            bsh.org.objectweb.asm.Type r0 = (bsh.org.objectweb.asm.Type) r0
            int r0 = r0.getSort()
            r1 = 11
            if (r0 == r1) goto L1a
            goto L20
        L1a:
            java.lang.String r3 = "This feature requires ASM5"
            j8.o.w(r3)
            return
        L20:
            bsh.org.objectweb.asm.MethodVisitor r0 = r2.mv
            if (r0 == 0) goto L27
            r0.visitLdcInsn(r3)
        L27:
            return
    }

    public void visitLineNumber(int r2, bsh.org.objectweb.asm.Label r3) {
            r1 = this;
            bsh.org.objectweb.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitLineNumber(r2, r3)
        L7:
            return
    }

    public void visitLocalVariable(java.lang.String r8, java.lang.String r9, java.lang.String r10, bsh.org.objectweb.asm.Label r11, bsh.org.objectweb.asm.Label r12, int r13) {
            r7 = this;
            bsh.org.objectweb.asm.MethodVisitor r0 = r7.mv
            if (r0 == 0) goto Ld
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.visitLocalVariable(r1, r2, r3, r4, r5, r6)
        Ld:
            return
    }

    public void visitLookupSwitchInsn(bsh.org.objectweb.asm.Label r2, int[] r3, bsh.org.objectweb.asm.Label[] r4) {
            r1 = this;
            bsh.org.objectweb.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitLookupSwitchInsn(r2, r3, r4)
        L7:
            return
    }

    public void visitMaxs(int r2, int r3) {
            r1 = this;
            bsh.org.objectweb.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitMaxs(r2, r3)
        L7:
            return
    }

    @java.lang.Deprecated
    public void visitMethodInsn(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            r7 = this;
            int r0 = r7.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 < r1) goto L18
            r0 = 185(0xb9, float:2.59E-43)
            if (r8 != r0) goto L12
            r0 = 1
        Lb:
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r0
            goto L14
        L12:
            r0 = 0
            goto Lb
        L14:
            r1.visitMethodInsn(r2, r3, r4, r5, r6)
            return
        L18:
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            bsh.org.objectweb.asm.MethodVisitor r8 = r1.mv
            if (r8 == 0) goto L24
            r8.visitMethodInsn(r2, r3, r4, r5)
        L24:
            return
    }

    public void visitMethodInsn(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11) {
            r6 = this;
            int r0 = r6.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 >= r1) goto L19
            r0 = 185(0xb9, float:2.59E-43)
            if (r7 != r0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r11 != r0) goto L13
            r6.visitMethodInsn(r7, r8, r9, r10)
            return
        L13:
            java.lang.String r7 = "INVOKESPECIAL/STATIC on interfaces requires ASM5"
            j8.o.t(r7)
            return
        L19:
            bsh.org.objectweb.asm.MethodVisitor r0 = r6.mv
            if (r0 == 0) goto L25
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
        L25:
            return
    }

    public void visitMultiANewArrayInsn(java.lang.String r2, int r3) {
            r1 = this;
            bsh.org.objectweb.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitMultiANewArrayInsn(r2, r3)
        L7:
            return
    }

    public void visitParameter(java.lang.String r3, int r4) {
            r2 = this;
            int r0 = r2.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 < r1) goto Le
            bsh.org.objectweb.asm.MethodVisitor r0 = r2.mv
            if (r0 == 0) goto Ld
            r0.visitParameter(r3, r4)
        Ld:
            return
        Le:
            java.lang.String r3 = "This feature requires ASM5"
            j8.o.w(r3)
            return
    }

    public void visitTableSwitchInsn(int r2, int r3, bsh.org.objectweb.asm.Label r4, bsh.org.objectweb.asm.Label... r5) {
            r1 = this;
            bsh.org.objectweb.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitTableSwitchInsn(r2, r3, r4, r5)
        L7:
            return
    }

    public void visitTryCatchBlock(bsh.org.objectweb.asm.Label r2, bsh.org.objectweb.asm.Label r3, bsh.org.objectweb.asm.Label r4, java.lang.String r5) {
            r1 = this;
            bsh.org.objectweb.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitTryCatchBlock(r2, r3, r4, r5)
        L7:
            return
    }

    public void visitTypeInsn(int r2, java.lang.String r3) {
            r1 = this;
            bsh.org.objectweb.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitTypeInsn(r2, r3)
        L7:
            return
    }

    public void visitVarInsn(int r2, int r3) {
            r1 = this;
            bsh.org.objectweb.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitVarInsn(r2, r3)
        L7:
            return
    }
}
