package net.bytebuddy.jar.asm;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ClassVisitor {
    protected final int api;
    protected net.bytebuddy.jar.asm.ClassVisitor cv;

    public ClassVisitor(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ClassVisitor(int r3, net.bytebuddy.jar.asm.ClassVisitor r4) {
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
            r2.cv = r4
            return
    }

    public net.bytebuddy.jar.asm.ClassVisitor getDelegate() {
            r1 = this;
            net.bytebuddy.jar.asm.ClassVisitor r0 = r1.cv
            return r0
    }

    public void visit(int r8, int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String[] r13) {
            r7 = this;
            int r0 = r7.api
            r1 = 524288(0x80000, float:7.34684E-40)
            if (r0 >= r1) goto L14
            r0 = 65536(0x10000, float:9.1835E-41)
            r0 = r0 & r9
            if (r0 != 0) goto Lc
            goto L14
        Lc:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.String r9 = "Records requires ASM8"
            r8.<init>(r9)
            throw r8
        L14:
            net.bytebuddy.jar.asm.ClassVisitor r0 = r7.cv
            if (r0 == 0) goto L21
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.visit(r1, r2, r3, r4, r5, r6)
        L21:
            return
    }

    public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotation(java.lang.String r2, boolean r3) {
            r1 = this;
            net.bytebuddy.jar.asm.ClassVisitor r0 = r1.cv
            if (r0 == 0) goto L9
            net.bytebuddy.jar.asm.AnnotationVisitor r2 = r0.visitAnnotation(r2, r3)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public void visitAttribute(net.bytebuddy.jar.asm.Attribute r2) {
            r1 = this;
            net.bytebuddy.jar.asm.ClassVisitor r0 = r1.cv
            if (r0 == 0) goto L7
            r0.visitAttribute(r2)
        L7:
            return
    }

    public void visitEnd() {
            r1 = this;
            net.bytebuddy.jar.asm.ClassVisitor r0 = r1.cv
            if (r0 == 0) goto L7
            r0.visitEnd()
        L7:
            return
    }

    public net.bytebuddy.jar.asm.FieldVisitor visitField(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.Object r11) {
            r6 = this;
            net.bytebuddy.jar.asm.ClassVisitor r0 = r6.cv
            if (r0 == 0) goto Le
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            net.bytebuddy.jar.asm.FieldVisitor r7 = r0.visitField(r1, r2, r3, r4, r5)
            return r7
        Le:
            r7 = 0
            return r7
    }

    public void visitInnerClass(java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5) {
            r1 = this;
            net.bytebuddy.jar.asm.ClassVisitor r0 = r1.cv
            if (r0 == 0) goto L7
            r0.visitInnerClass(r2, r3, r4, r5)
        L7:
            return
    }

    public net.bytebuddy.jar.asm.MethodVisitor visitMethod(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String[] r11) {
            r6 = this;
            net.bytebuddy.jar.asm.ClassVisitor r0 = r6.cv
            if (r0 == 0) goto Le
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            net.bytebuddy.jar.asm.MethodVisitor r7 = r0.visitMethod(r1, r2, r3, r4, r5)
            return r7
        Le:
            r7 = 0
            return r7
    }

    public net.bytebuddy.jar.asm.ModuleVisitor visitModule(java.lang.String r3, int r4, java.lang.String r5) {
            r2 = this;
            int r0 = r2.api
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 < r1) goto L11
            net.bytebuddy.jar.asm.ClassVisitor r0 = r2.cv
            if (r0 == 0) goto Lf
            net.bytebuddy.jar.asm.ModuleVisitor r3 = r0.visitModule(r3, r4, r5)
            return r3
        Lf:
            r3 = 0
            return r3
        L11:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r4 = "Module requires ASM6"
            r3.<init>(r4)
            throw r3
    }

    public void visitNestHost(java.lang.String r3) {
            r2 = this;
            int r0 = r2.api
            r1 = 458752(0x70000, float:6.42848E-40)
            if (r0 < r1) goto Le
            net.bytebuddy.jar.asm.ClassVisitor r0 = r2.cv
            if (r0 == 0) goto Ld
            r0.visitNestHost(r3)
        Ld:
            return
        Le:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "NestHost requires ASM7"
            r3.<init>(r0)
            throw r3
    }

    public void visitNestMember(java.lang.String r3) {
            r2 = this;
            int r0 = r2.api
            r1 = 458752(0x70000, float:6.42848E-40)
            if (r0 < r1) goto Le
            net.bytebuddy.jar.asm.ClassVisitor r0 = r2.cv
            if (r0 == 0) goto Ld
            r0.visitNestMember(r3)
        Ld:
            return
        Le:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "NestMember requires ASM7"
            r3.<init>(r0)
            throw r3
    }

    public void visitOuterClass(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            net.bytebuddy.jar.asm.ClassVisitor r0 = r1.cv
            if (r0 == 0) goto L7
            r0.visitOuterClass(r2, r3, r4)
        L7:
            return
    }

    public void visitPermittedSubclass(java.lang.String r3) {
            r2 = this;
            int r0 = r2.api
            r1 = 589824(0x90000, float:8.2652E-40)
            if (r0 < r1) goto Le
            net.bytebuddy.jar.asm.ClassVisitor r0 = r2.cv
            if (r0 == 0) goto Ld
            r0.visitPermittedSubclass(r3)
        Ld:
            return
        Le:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "PermittedSubclasses requires ASM9"
            r3.<init>(r0)
            throw r3
    }

    public net.bytebuddy.jar.asm.RecordComponentVisitor visitRecordComponent(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            int r0 = r2.api
            r1 = 524288(0x80000, float:7.34684E-40)
            if (r0 < r1) goto L11
            net.bytebuddy.jar.asm.ClassVisitor r0 = r2.cv
            if (r0 == 0) goto Lf
            net.bytebuddy.jar.asm.RecordComponentVisitor r3 = r0.visitRecordComponent(r3, r4, r5)
            return r3
        Lf:
            r3 = 0
            return r3
        L11:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r4 = "Record requires ASM8"
            r3.<init>(r4)
            throw r3
    }

    public void visitSource(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            net.bytebuddy.jar.asm.ClassVisitor r0 = r1.cv
            if (r0 == 0) goto L7
            r0.visitSource(r2, r3)
        L7:
            return
    }

    public net.bytebuddy.jar.asm.AnnotationVisitor visitTypeAnnotation(int r3, net.bytebuddy.jar.asm.TypePath r4, java.lang.String r5, boolean r6) {
            r2 = this;
            int r0 = r2.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 < r1) goto L11
            net.bytebuddy.jar.asm.ClassVisitor r0 = r2.cv
            if (r0 == 0) goto Lf
            net.bytebuddy.jar.asm.AnnotationVisitor r3 = r0.visitTypeAnnotation(r3, r4, r5, r6)
            return r3
        Lf:
            r3 = 0
            return r3
        L11:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r4 = "TypeAnnotation requires ASM5"
            r3.<init>(r4)
            throw r3
    }
}
