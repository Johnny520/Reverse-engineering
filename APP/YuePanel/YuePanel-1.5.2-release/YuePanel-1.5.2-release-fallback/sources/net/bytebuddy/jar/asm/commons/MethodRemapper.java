package net.bytebuddy.jar.asm.commons;

/* JADX INFO: loaded from: classes2.dex */
public class MethodRemapper extends net.bytebuddy.jar.asm.MethodVisitor {
    protected final net.bytebuddy.jar.asm.commons.Remapper remapper;

    public MethodRemapper(int r1, net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.jar.asm.commons.Remapper r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.remapper = r3
            return
    }

    public MethodRemapper(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.jar.asm.commons.Remapper r3) {
            r1 = this;
            r0 = 589824(0x90000, float:8.2652E-40)
            r1.<init>(r0, r2, r3)
            return
    }

    private java.lang.Object[] remapFrameTypes(int r6, java.lang.Object[] r7) {
            r5 = this;
            if (r7 != 0) goto L3
            return r7
        L3:
            r0 = 0
            r1 = 0
            r2 = r0
        L6:
            if (r2 >= r6) goto L24
            r3 = r7[r2]
            boolean r3 = r3 instanceof java.lang.String
            if (r3 == 0) goto L21
            if (r1 != 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.System.arraycopy(r7, r0, r1, r0, r6)
        L15:
            net.bytebuddy.jar.asm.commons.Remapper r3 = r5.remapper
            r4 = r7[r2]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r3 = r3.mapType(r4)
            r1[r2] = r3
        L21:
            int r2 = r2 + 1
            goto L6
        L24:
            if (r1 != 0) goto L27
            goto L28
        L27:
            r7 = r1
        L28:
            return r7
    }

    public net.bytebuddy.jar.asm.AnnotationVisitor createAnnotationRemapper(java.lang.String r4, net.bytebuddy.jar.asm.AnnotationVisitor r5) {
            r3 = this;
            net.bytebuddy.jar.asm.commons.AnnotationRemapper r0 = new net.bytebuddy.jar.asm.commons.AnnotationRemapper
            int r1 = r3.api
            net.bytebuddy.jar.asm.commons.Remapper r2 = r3.remapper
            r0.<init>(r1, r4, r5, r2)
            net.bytebuddy.jar.asm.AnnotationVisitor r4 = r3.createAnnotationRemapper(r5)
            net.bytebuddy.jar.asm.AnnotationVisitor r4 = r0.orDeprecatedValue(r4)
            return r4
    }

    @java.lang.Deprecated
    public net.bytebuddy.jar.asm.AnnotationVisitor createAnnotationRemapper(net.bytebuddy.jar.asm.AnnotationVisitor r5) {
            r4 = this;
            net.bytebuddy.jar.asm.commons.AnnotationRemapper r0 = new net.bytebuddy.jar.asm.commons.AnnotationRemapper
            int r1 = r4.api
            r2 = 0
            net.bytebuddy.jar.asm.commons.Remapper r3 = r4.remapper
            r0.<init>(r1, r2, r5, r3)
            return r0
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotation(java.lang.String r2, boolean r3) {
            r1 = this;
            net.bytebuddy.jar.asm.commons.Remapper r0 = r1.remapper
            java.lang.String r0 = r0.mapDesc(r2)
            net.bytebuddy.jar.asm.AnnotationVisitor r3 = super.visitAnnotation(r0, r3)
            if (r3 != 0) goto Ld
            goto L11
        Ld:
            net.bytebuddy.jar.asm.AnnotationVisitor r3 = r1.createAnnotationRemapper(r2, r3)
        L11:
            return r3
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotationDefault() {
            r2 = this;
            net.bytebuddy.jar.asm.AnnotationVisitor r0 = super.visitAnnotationDefault()
            if (r0 != 0) goto L7
            goto Lc
        L7:
            r1 = 0
            net.bytebuddy.jar.asm.AnnotationVisitor r0 = r2.createAnnotationRemapper(r1, r0)
        Lc:
            return r0
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitFieldInsn(int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r2 = this;
            net.bytebuddy.jar.asm.commons.Remapper r0 = r2.remapper
            java.lang.String r0 = r0.mapType(r4)
            net.bytebuddy.jar.asm.commons.Remapper r1 = r2.remapper
            java.lang.String r4 = r1.mapFieldName(r4, r5, r6)
            net.bytebuddy.jar.asm.commons.Remapper r5 = r2.remapper
            java.lang.String r5 = r5.mapDesc(r6)
            super.visitFieldInsn(r3, r0, r4, r5)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitFrame(int r7, int r8, java.lang.Object[] r9, int r10, java.lang.Object[] r11) {
            r6 = this;
            java.lang.Object[] r3 = r6.remapFrameTypes(r8, r9)
            java.lang.Object[] r5 = r6.remapFrameTypes(r10, r11)
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            super.visitFrame(r1, r2, r3, r4, r5)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public net.bytebuddy.jar.asm.AnnotationVisitor visitInsnAnnotation(int r2, net.bytebuddy.jar.asm.TypePath r3, java.lang.String r4, boolean r5) {
            r1 = this;
            net.bytebuddy.jar.asm.commons.Remapper r0 = r1.remapper
            java.lang.String r0 = r0.mapDesc(r4)
            net.bytebuddy.jar.asm.AnnotationVisitor r2 = super.visitInsnAnnotation(r2, r3, r0, r5)
            if (r2 != 0) goto Ld
            goto L11
        Ld:
            net.bytebuddy.jar.asm.AnnotationVisitor r2 = r1.createAnnotationRemapper(r4, r2)
        L11:
            return r2
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitInvokeDynamicInsn(java.lang.String r5, java.lang.String r6, net.bytebuddy.jar.asm.Handle r7, java.lang.Object... r8) {
            r4 = this;
            int r0 = r8.length
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
        L4:
            int r2 = r8.length
            if (r1 >= r2) goto L14
            net.bytebuddy.jar.asm.commons.Remapper r2 = r4.remapper
            r3 = r8[r1]
            java.lang.Object r2 = r2.mapValue(r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L14:
            net.bytebuddy.jar.asm.commons.Remapper r8 = r4.remapper
            java.lang.String r5 = r8.mapInvokeDynamicMethodName(r5, r6)
            net.bytebuddy.jar.asm.commons.Remapper r8 = r4.remapper
            java.lang.String r6 = r8.mapMethodDesc(r6)
            net.bytebuddy.jar.asm.commons.Remapper r8 = r4.remapper
            java.lang.Object r7 = r8.mapValue(r7)
            net.bytebuddy.jar.asm.Handle r7 = (net.bytebuddy.jar.asm.Handle) r7
            super.visitInvokeDynamicInsn(r5, r6, r7, r0)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitLdcInsn(java.lang.Object r2) {
            r1 = this;
            net.bytebuddy.jar.asm.commons.Remapper r0 = r1.remapper
            java.lang.Object r2 = r0.mapValue(r2)
            super.visitLdcInsn(r2)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitLocalVariable(java.lang.String r9, java.lang.String r10, java.lang.String r11, net.bytebuddy.jar.asm.Label r12, net.bytebuddy.jar.asm.Label r13, int r14) {
            r8 = this;
            net.bytebuddy.jar.asm.commons.Remapper r0 = r8.remapper
            java.lang.String r3 = r0.mapDesc(r10)
            net.bytebuddy.jar.asm.commons.Remapper r10 = r8.remapper
            r0 = 1
            java.lang.String r4 = r10.mapSignature(r11, r0)
            r1 = r8
            r2 = r9
            r5 = r12
            r6 = r13
            r7 = r14
            super.visitLocalVariable(r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public net.bytebuddy.jar.asm.AnnotationVisitor visitLocalVariableAnnotation(int r11, net.bytebuddy.jar.asm.TypePath r12, net.bytebuddy.jar.asm.Label[] r13, net.bytebuddy.jar.asm.Label[] r14, int[] r15, java.lang.String r16, boolean r17) {
            r10 = this;
            r8 = r10
            r9 = r16
            net.bytebuddy.jar.asm.commons.Remapper r0 = r8.remapper
            java.lang.String r6 = r0.mapDesc(r9)
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r7 = r17
            net.bytebuddy.jar.asm.AnnotationVisitor r0 = super.visitLocalVariableAnnotation(r1, r2, r3, r4, r5, r6, r7)
            if (r0 != 0) goto L18
            goto L1c
        L18:
            net.bytebuddy.jar.asm.AnnotationVisitor r0 = r10.createAnnotationRemapper(r9, r0)
        L1c:
            return r0
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitMethodInsn(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, boolean r12) {
            r7 = this;
            int r0 = r7.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 >= r1) goto Le
            r0 = r8 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto Le
            super.visitMethodInsn(r8, r9, r10, r11, r12)
            return
        Le:
            net.bytebuddy.jar.asm.commons.Remapper r0 = r7.remapper
            java.lang.String r3 = r0.mapType(r9)
            net.bytebuddy.jar.asm.commons.Remapper r0 = r7.remapper
            java.lang.String r4 = r0.mapMethodName(r9, r10, r11)
            net.bytebuddy.jar.asm.commons.Remapper r9 = r7.remapper
            java.lang.String r5 = r9.mapMethodDesc(r11)
            r1 = r7
            r2 = r8
            r6 = r12
            super.visitMethodInsn(r2, r3, r4, r5, r6)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitMultiANewArrayInsn(java.lang.String r2, int r3) {
            r1 = this;
            net.bytebuddy.jar.asm.commons.Remapper r0 = r1.remapper
            java.lang.String r2 = r0.mapDesc(r2)
            super.visitMultiANewArrayInsn(r2, r3)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public net.bytebuddy.jar.asm.AnnotationVisitor visitParameterAnnotation(int r2, java.lang.String r3, boolean r4) {
            r1 = this;
            net.bytebuddy.jar.asm.commons.Remapper r0 = r1.remapper
            java.lang.String r0 = r0.mapDesc(r3)
            net.bytebuddy.jar.asm.AnnotationVisitor r2 = super.visitParameterAnnotation(r2, r0, r4)
            if (r2 != 0) goto Ld
            goto L11
        Ld:
            net.bytebuddy.jar.asm.AnnotationVisitor r2 = r1.createAnnotationRemapper(r3, r2)
        L11:
            return r2
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public net.bytebuddy.jar.asm.AnnotationVisitor visitTryCatchAnnotation(int r2, net.bytebuddy.jar.asm.TypePath r3, java.lang.String r4, boolean r5) {
            r1 = this;
            net.bytebuddy.jar.asm.commons.Remapper r0 = r1.remapper
            java.lang.String r0 = r0.mapDesc(r4)
            net.bytebuddy.jar.asm.AnnotationVisitor r2 = super.visitTryCatchAnnotation(r2, r3, r0, r5)
            if (r2 != 0) goto Ld
            goto L11
        Ld:
            net.bytebuddy.jar.asm.AnnotationVisitor r2 = r1.createAnnotationRemapper(r4, r2)
        L11:
            return r2
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitTryCatchBlock(net.bytebuddy.jar.asm.Label r2, net.bytebuddy.jar.asm.Label r3, net.bytebuddy.jar.asm.Label r4, java.lang.String r5) {
            r1 = this;
            if (r5 != 0) goto L4
            r5 = 0
            goto La
        L4:
            net.bytebuddy.jar.asm.commons.Remapper r0 = r1.remapper
            java.lang.String r5 = r0.mapType(r5)
        La:
            super.visitTryCatchBlock(r2, r3, r4, r5)
            return
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public net.bytebuddy.jar.asm.AnnotationVisitor visitTypeAnnotation(int r2, net.bytebuddy.jar.asm.TypePath r3, java.lang.String r4, boolean r5) {
            r1 = this;
            net.bytebuddy.jar.asm.commons.Remapper r0 = r1.remapper
            java.lang.String r0 = r0.mapDesc(r4)
            net.bytebuddy.jar.asm.AnnotationVisitor r2 = super.visitTypeAnnotation(r2, r3, r0, r5)
            if (r2 != 0) goto Ld
            goto L11
        Ld:
            net.bytebuddy.jar.asm.AnnotationVisitor r2 = r1.createAnnotationRemapper(r4, r2)
        L11:
            return r2
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitTypeInsn(int r2, java.lang.String r3) {
            r1 = this;
            net.bytebuddy.jar.asm.commons.Remapper r0 = r1.remapper
            java.lang.String r3 = r0.mapType(r3)
            super.visitTypeInsn(r2, r3)
            return
    }
}
