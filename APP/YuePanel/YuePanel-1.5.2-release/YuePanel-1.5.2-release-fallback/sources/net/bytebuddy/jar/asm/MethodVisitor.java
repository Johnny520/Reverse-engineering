package net.bytebuddy.jar.asm;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MethodVisitor {
    private static final java.lang.String REQUIRES_ASM5 = "This feature requires ASM5";
    protected final int api;
    protected net.bytebuddy.jar.asm.MethodVisitor mv;

    public MethodVisitor(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MethodVisitor(int r3, net.bytebuddy.jar.asm.MethodVisitor r4) {
            r2 = this;
            r2.<init>()
            r0 = 589824(0x90000, float:8.2652E-40)
            r1 = 17432576(0x10a0000, float:2.5346597E-38)
            if (r3 == r0) goto L37
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r3 == r0) goto L37
            r0 = 458752(0x70000, float:6.42848E-40)
            if (r3 == r0) goto L37
            r0 = 393216(0x60000, float:5.51013E-40)
            if (r3 == r0) goto L37
            r0 = 327680(0x50000, float:4.59177E-40)
            if (r3 == r0) goto L37
            r0 = 262144(0x40000, float:3.67342E-40)
            if (r3 == r0) goto L37
            if (r3 != r1) goto L20
            goto L37
        L20:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported api "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L37:
            if (r3 != r1) goto L3c
            net.bytebuddy.jar.asm.Constants.checkAsmExperimental(r2)
        L3c:
            r2.api = r3
            r2.mv = r4
            return
    }

    public net.bytebuddy.jar.asm.MethodVisitor getDelegate() {
            r1 = this;
            net.bytebuddy.jar.asm.MethodVisitor r0 = r1.mv
            return r0
    }

    public void visitAnnotableParameterCount(int r2, boolean r3) {
            r1 = this;
            net.bytebuddy.jar.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitAnnotableParameterCount(r2, r3)
        L7:
            return
    }

    public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotation(java.lang.String r2, boolean r3) {
            r1 = this;
            net.bytebuddy.jar.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L9
            net.bytebuddy.jar.asm.AnnotationVisitor r2 = r0.visitAnnotation(r2, r3)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotationDefault() {
            r1 = this;
            net.bytebuddy.jar.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L9
            net.bytebuddy.jar.asm.AnnotationVisitor r0 = r0.visitAnnotationDefault()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public void visitAttribute(net.bytebuddy.jar.asm.Attribute r2) {
            r1 = this;
            net.bytebuddy.jar.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitAttribute(r2)
        L7:
            return
    }

    public void visitCode() {
            r1 = this;
            net.bytebuddy.jar.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitCode()
        L7:
            return
    }

    public void visitEnd() {
            r1 = this;
            net.bytebuddy.jar.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitEnd()
        L7:
            return
    }

    public void visitFieldInsn(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            net.bytebuddy.jar.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitFieldInsn(r2, r3, r4, r5)
        L7:
            return
    }

    public void visitFrame(int r7, int r8, java.lang.Object[] r9, int r10, java.lang.Object[] r11) {
            r6 = this;
            net.bytebuddy.jar.asm.MethodVisitor r0 = r6.mv
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
            net.bytebuddy.jar.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitIincInsn(r2, r3)
        L7:
            return
    }

    public void visitInsn(int r2) {
            r1 = this;
            net.bytebuddy.jar.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitInsn(r2)
        L7:
            return
    }

    public net.bytebuddy.jar.asm.AnnotationVisitor visitInsnAnnotation(int r3, net.bytebuddy.jar.asm.TypePath r4, java.lang.String r5, boolean r6) {
            r2 = this;
            int r0 = r2.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 < r1) goto L11
            net.bytebuddy.jar.asm.MethodVisitor r0 = r2.mv
            if (r0 == 0) goto Lf
            net.bytebuddy.jar.asm.AnnotationVisitor r3 = r0.visitInsnAnnotation(r3, r4, r5, r6)
            return r3
        Lf:
            r3 = 0
            return r3
        L11:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r4 = "This feature requires ASM5"
            r3.<init>(r4)
            throw r3
    }

    public void visitIntInsn(int r2, int r3) {
            r1 = this;
            net.bytebuddy.jar.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitIntInsn(r2, r3)
        L7:
            return
    }

    public void visitInvokeDynamicInsn(java.lang.String r3, java.lang.String r4, net.bytebuddy.jar.asm.Handle r5, java.lang.Object... r6) {
            r2 = this;
            int r0 = r2.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 < r1) goto Le
            net.bytebuddy.jar.asm.MethodVisitor r0 = r2.mv
            if (r0 == 0) goto Ld
            r0.visitInvokeDynamicInsn(r3, r4, r5, r6)
        Ld:
            return
        Le:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r4 = "This feature requires ASM5"
            r3.<init>(r4)
            throw r3
    }

    public void visitJumpInsn(int r2, net.bytebuddy.jar.asm.Label r3) {
            r1 = this;
            net.bytebuddy.jar.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitJumpInsn(r2, r3)
        L7:
            return
    }

    public void visitLabel(net.bytebuddy.jar.asm.Label r2) {
            r1 = this;
            net.bytebuddy.jar.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitLabel(r2)
        L7:
            return
    }

    public void visitLdcInsn(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 >= r1) goto L22
            boolean r0 = r3 instanceof net.bytebuddy.jar.asm.Handle
            if (r0 != 0) goto L1a
            boolean r0 = r3 instanceof net.bytebuddy.jar.asm.Type
            if (r0 == 0) goto L22
            r0 = r3
            net.bytebuddy.jar.asm.Type r0 = (net.bytebuddy.jar.asm.Type) r0
            int r0 = r0.getSort()
            r1 = 11
            if (r0 == r1) goto L1a
            goto L22
        L1a:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This feature requires ASM5"
            r3.<init>(r0)
            throw r3
        L22:
            int r0 = r2.api
            r1 = 458752(0x70000, float:6.42848E-40)
            if (r0 >= r1) goto L35
            boolean r0 = r3 instanceof net.bytebuddy.jar.asm.ConstantDynamic
            if (r0 != 0) goto L2d
            goto L35
        L2d:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This feature requires ASM7"
            r3.<init>(r0)
            throw r3
        L35:
            net.bytebuddy.jar.asm.MethodVisitor r0 = r2.mv
            if (r0 == 0) goto L3c
            r0.visitLdcInsn(r3)
        L3c:
            return
    }

    public void visitLineNumber(int r2, net.bytebuddy.jar.asm.Label r3) {
            r1 = this;
            net.bytebuddy.jar.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitLineNumber(r2, r3)
        L7:
            return
    }

    public void visitLocalVariable(java.lang.String r8, java.lang.String r9, java.lang.String r10, net.bytebuddy.jar.asm.Label r11, net.bytebuddy.jar.asm.Label r12, int r13) {
            r7 = this;
            net.bytebuddy.jar.asm.MethodVisitor r0 = r7.mv
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

    public net.bytebuddy.jar.asm.AnnotationVisitor visitLocalVariableAnnotation(int r12, net.bytebuddy.jar.asm.TypePath r13, net.bytebuddy.jar.asm.Label[] r14, net.bytebuddy.jar.asm.Label[] r15, int[] r16, java.lang.String r17, boolean r18) {
            r11 = this;
            r0 = r11
            int r1 = r0.api
            r2 = 327680(0x50000, float:4.59177E-40)
            if (r1 < r2) goto L1c
            net.bytebuddy.jar.asm.MethodVisitor r3 = r0.mv
            if (r3 == 0) goto L1a
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            net.bytebuddy.jar.asm.AnnotationVisitor r1 = r3.visitLocalVariableAnnotation(r4, r5, r6, r7, r8, r9, r10)
            return r1
        L1a:
            r1 = 0
            return r1
        L1c:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "This feature requires ASM5"
            r1.<init>(r2)
            throw r1
    }

    public void visitLookupSwitchInsn(net.bytebuddy.jar.asm.Label r2, int[] r3, net.bytebuddy.jar.asm.Label[] r4) {
            r1 = this;
            net.bytebuddy.jar.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitLookupSwitchInsn(r2, r3, r4)
        L7:
            return
    }

    public void visitMaxs(int r2, int r3) {
            r1 = this;
            net.bytebuddy.jar.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitMaxs(r2, r3)
        L7:
            return
    }

    @java.lang.Deprecated
    public void visitMethodInsn(int r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
            r9 = this;
            int r0 = r9.api
            r1 = 327680(0x50000, float:4.59177E-40)
            r2 = 0
            if (r0 >= r1) goto La
            r0 = 256(0x100, float:3.59E-43)
            goto Lb
        La:
            r0 = r2
        Lb:
            r4 = r10 | r0
            r0 = 185(0xb9, float:2.59E-43)
            if (r10 != r0) goto L12
            r2 = 1
        L12:
            r8 = r2
            r3 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            r3.visitMethodInsn(r4, r5, r6, r7, r8)
            return
    }

    public void visitMethodInsn(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11) {
            r6 = this;
            int r0 = r6.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 >= r1) goto L1f
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L1f
            r0 = 185(0xb9, float:2.59E-43)
            if (r7 != r0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            if (r11 != r0) goto L17
            r6.visitMethodInsn(r7, r8, r9, r10)
            return
        L17:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.String r8 = "INVOKESPECIAL/STATIC on interfaces requires ASM5"
            r7.<init>(r8)
            throw r7
        L1f:
            net.bytebuddy.jar.asm.MethodVisitor r0 = r6.mv
            if (r0 == 0) goto L2c
            r1 = r7 & (-257(0xfffffffffffffeff, float:NaN))
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
        L2c:
            return
    }

    public void visitMultiANewArrayInsn(java.lang.String r2, int r3) {
            r1 = this;
            net.bytebuddy.jar.asm.MethodVisitor r0 = r1.mv
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
            net.bytebuddy.jar.asm.MethodVisitor r0 = r2.mv
            if (r0 == 0) goto Ld
            r0.visitParameter(r3, r4)
        Ld:
            return
        Le:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r4 = "This feature requires ASM5"
            r3.<init>(r4)
            throw r3
    }

    public net.bytebuddy.jar.asm.AnnotationVisitor visitParameterAnnotation(int r2, java.lang.String r3, boolean r4) {
            r1 = this;
            net.bytebuddy.jar.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L9
            net.bytebuddy.jar.asm.AnnotationVisitor r2 = r0.visitParameterAnnotation(r2, r3, r4)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public void visitTableSwitchInsn(int r2, int r3, net.bytebuddy.jar.asm.Label r4, net.bytebuddy.jar.asm.Label... r5) {
            r1 = this;
            net.bytebuddy.jar.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitTableSwitchInsn(r2, r3, r4, r5)
        L7:
            return
    }

    public net.bytebuddy.jar.asm.AnnotationVisitor visitTryCatchAnnotation(int r3, net.bytebuddy.jar.asm.TypePath r4, java.lang.String r5, boolean r6) {
            r2 = this;
            int r0 = r2.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 < r1) goto L11
            net.bytebuddy.jar.asm.MethodVisitor r0 = r2.mv
            if (r0 == 0) goto Lf
            net.bytebuddy.jar.asm.AnnotationVisitor r3 = r0.visitTryCatchAnnotation(r3, r4, r5, r6)
            return r3
        Lf:
            r3 = 0
            return r3
        L11:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r4 = "This feature requires ASM5"
            r3.<init>(r4)
            throw r3
    }

    public void visitTryCatchBlock(net.bytebuddy.jar.asm.Label r2, net.bytebuddy.jar.asm.Label r3, net.bytebuddy.jar.asm.Label r4, java.lang.String r5) {
            r1 = this;
            net.bytebuddy.jar.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitTryCatchBlock(r2, r3, r4, r5)
        L7:
            return
    }

    public net.bytebuddy.jar.asm.AnnotationVisitor visitTypeAnnotation(int r3, net.bytebuddy.jar.asm.TypePath r4, java.lang.String r5, boolean r6) {
            r2 = this;
            int r0 = r2.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 < r1) goto L11
            net.bytebuddy.jar.asm.MethodVisitor r0 = r2.mv
            if (r0 == 0) goto Lf
            net.bytebuddy.jar.asm.AnnotationVisitor r3 = r0.visitTypeAnnotation(r3, r4, r5, r6)
            return r3
        Lf:
            r3 = 0
            return r3
        L11:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r4 = "This feature requires ASM5"
            r3.<init>(r4)
            throw r3
    }

    public void visitTypeInsn(int r2, java.lang.String r3) {
            r1 = this;
            net.bytebuddy.jar.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitTypeInsn(r2, r3)
        L7:
            return
    }

    public void visitVarInsn(int r2, int r3) {
            r1 = this;
            net.bytebuddy.jar.asm.MethodVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitVarInsn(r2, r3)
        L7:
            return
    }
}
