package net.bytebuddy.jar.asm.commons;

/* JADX INFO: loaded from: classes2.dex */
public class ClassRemapper extends net.bytebuddy.jar.asm.ClassVisitor {
    protected java.lang.String className;
    protected final net.bytebuddy.jar.asm.commons.Remapper remapper;

    public ClassRemapper(int r1, net.bytebuddy.jar.asm.ClassVisitor r2, net.bytebuddy.jar.asm.commons.Remapper r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.remapper = r3
            return
    }

    public ClassRemapper(net.bytebuddy.jar.asm.ClassVisitor r2, net.bytebuddy.jar.asm.commons.Remapper r3) {
            r1 = this;
            r0 = 589824(0x90000, float:8.2652E-40)
            r1.<init>(r0, r2, r3)
            return
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

    public net.bytebuddy.jar.asm.FieldVisitor createFieldRemapper(net.bytebuddy.jar.asm.FieldVisitor r4) {
            r3 = this;
            net.bytebuddy.jar.asm.commons.FieldRemapper r0 = new net.bytebuddy.jar.asm.commons.FieldRemapper
            int r1 = r3.api
            net.bytebuddy.jar.asm.commons.Remapper r2 = r3.remapper
            r0.<init>(r1, r4, r2)
            return r0
    }

    public net.bytebuddy.jar.asm.MethodVisitor createMethodRemapper(net.bytebuddy.jar.asm.MethodVisitor r4) {
            r3 = this;
            net.bytebuddy.jar.asm.commons.MethodRemapper r0 = new net.bytebuddy.jar.asm.commons.MethodRemapper
            int r1 = r3.api
            net.bytebuddy.jar.asm.commons.Remapper r2 = r3.remapper
            r0.<init>(r1, r4, r2)
            return r0
    }

    public net.bytebuddy.jar.asm.ModuleVisitor createModuleRemapper(net.bytebuddy.jar.asm.ModuleVisitor r4) {
            r3 = this;
            net.bytebuddy.jar.asm.commons.ModuleRemapper r0 = new net.bytebuddy.jar.asm.commons.ModuleRemapper
            int r1 = r3.api
            net.bytebuddy.jar.asm.commons.Remapper r2 = r3.remapper
            r0.<init>(r1, r4, r2)
            return r0
    }

    public net.bytebuddy.jar.asm.RecordComponentVisitor createRecordComponentRemapper(net.bytebuddy.jar.asm.RecordComponentVisitor r4) {
            r3 = this;
            net.bytebuddy.jar.asm.commons.RecordComponentRemapper r0 = new net.bytebuddy.jar.asm.commons.RecordComponentRemapper
            int r1 = r3.api
            net.bytebuddy.jar.asm.commons.Remapper r2 = r3.remapper
            r0.<init>(r1, r4, r2)
            return r0
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public void visit(int r9, int r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String[] r14) {
            r8 = this;
            r8.className = r11
            net.bytebuddy.jar.asm.commons.Remapper r0 = r8.remapper
            java.lang.String r4 = r0.mapType(r11)
            net.bytebuddy.jar.asm.commons.Remapper r11 = r8.remapper
            r0 = 0
            java.lang.String r5 = r11.mapSignature(r12, r0)
            net.bytebuddy.jar.asm.commons.Remapper r11 = r8.remapper
            java.lang.String r6 = r11.mapType(r13)
            if (r14 != 0) goto L1a
            r11 = 0
        L18:
            r7 = r11
            goto L21
        L1a:
            net.bytebuddy.jar.asm.commons.Remapper r11 = r8.remapper
            java.lang.String[] r11 = r11.mapTypes(r14)
            goto L18
        L21:
            r1 = r8
            r2 = r9
            r3 = r10
            super.visit(r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotation(java.lang.String r2, boolean r3) {
            r1 = this;
            net.bytebuddy.jar.asm.commons.Remapper r0 = r1.remapper
            java.lang.String r0 = r0.mapDesc(r2)
            net.bytebuddy.jar.asm.AnnotationVisitor r3 = super.visitAnnotation(r0, r3)
            if (r3 != 0) goto Le
            r2 = 0
            goto L12
        Le:
            net.bytebuddy.jar.asm.AnnotationVisitor r2 = r1.createAnnotationRemapper(r2, r3)
        L12:
            return r2
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public void visitAttribute(net.bytebuddy.jar.asm.Attribute r5) {
            r4 = this;
            boolean r0 = r5 instanceof net.bytebuddy.jar.asm.commons.ModuleHashesAttribute
            if (r0 == 0) goto L22
            r0 = r5
            net.bytebuddy.jar.asm.commons.ModuleHashesAttribute r0 = (net.bytebuddy.jar.asm.commons.ModuleHashesAttribute) r0
            java.util.List<java.lang.String> r0 = r0.modules
            r1 = 0
        La:
            int r2 = r0.size()
            if (r1 >= r2) goto L22
            net.bytebuddy.jar.asm.commons.Remapper r2 = r4.remapper
            java.lang.Object r3 = r0.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r2 = r2.mapModuleName(r3)
            r0.set(r1, r2)
            int r1 = r1 + 1
            goto La
        L22:
            super.visitAttribute(r5)
            return
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public net.bytebuddy.jar.asm.FieldVisitor visitField(int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Object r13) {
            r8 = this;
            net.bytebuddy.jar.asm.commons.Remapper r0 = r8.remapper
            java.lang.String r1 = r8.className
            java.lang.String r4 = r0.mapFieldName(r1, r10, r11)
            net.bytebuddy.jar.asm.commons.Remapper r10 = r8.remapper
            java.lang.String r5 = r10.mapDesc(r11)
            net.bytebuddy.jar.asm.commons.Remapper r10 = r8.remapper
            r11 = 1
            java.lang.String r6 = r10.mapSignature(r12, r11)
            r10 = 0
            if (r13 != 0) goto L1a
            r7 = r10
            goto L21
        L1a:
            net.bytebuddy.jar.asm.commons.Remapper r11 = r8.remapper
            java.lang.Object r11 = r11.mapValue(r13)
            r7 = r11
        L21:
            r2 = r8
            r3 = r9
            net.bytebuddy.jar.asm.FieldVisitor r9 = super.visitField(r3, r4, r5, r6, r7)
            if (r9 != 0) goto L2a
            goto L2e
        L2a:
            net.bytebuddy.jar.asm.FieldVisitor r10 = r8.createFieldRemapper(r9)
        L2e:
            return r10
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public void visitInnerClass(java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7) {
            r3 = this;
            net.bytebuddy.jar.asm.commons.Remapper r0 = r3.remapper
            java.lang.String r0 = r0.mapType(r4)
            r1 = 0
            if (r5 != 0) goto Lb
            r2 = r1
            goto L11
        Lb:
            net.bytebuddy.jar.asm.commons.Remapper r2 = r3.remapper
            java.lang.String r2 = r2.mapType(r5)
        L11:
            if (r6 != 0) goto L14
            goto L1a
        L14:
            net.bytebuddy.jar.asm.commons.Remapper r1 = r3.remapper
            java.lang.String r1 = r1.mapInnerClassName(r4, r5, r6)
        L1a:
            super.visitInnerClass(r0, r2, r1, r7)
            return
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public net.bytebuddy.jar.asm.MethodVisitor visitMethod(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String[] r12) {
            r7 = this;
            net.bytebuddy.jar.asm.commons.Remapper r0 = r7.remapper
            java.lang.String r4 = r0.mapMethodDesc(r10)
            net.bytebuddy.jar.asm.commons.Remapper r0 = r7.remapper
            java.lang.String r1 = r7.className
            java.lang.String r3 = r0.mapMethodName(r1, r9, r10)
            net.bytebuddy.jar.asm.commons.Remapper r9 = r7.remapper
            r10 = 0
            java.lang.String r5 = r9.mapSignature(r11, r10)
            r9 = 0
            if (r12 != 0) goto L1a
            r6 = r9
            goto L21
        L1a:
            net.bytebuddy.jar.asm.commons.Remapper r10 = r7.remapper
            java.lang.String[] r10 = r10.mapTypes(r12)
            r6 = r10
        L21:
            r1 = r7
            r2 = r8
            net.bytebuddy.jar.asm.MethodVisitor r8 = super.visitMethod(r2, r3, r4, r5, r6)
            if (r8 != 0) goto L2a
            goto L2e
        L2a:
            net.bytebuddy.jar.asm.MethodVisitor r9 = r7.createMethodRemapper(r8)
        L2e:
            return r9
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public net.bytebuddy.jar.asm.ModuleVisitor visitModule(java.lang.String r2, int r3, java.lang.String r4) {
            r1 = this;
            net.bytebuddy.jar.asm.commons.Remapper r0 = r1.remapper
            java.lang.String r2 = r0.mapModuleName(r2)
            net.bytebuddy.jar.asm.ModuleVisitor r2 = super.visitModule(r2, r3, r4)
            if (r2 != 0) goto Le
            r2 = 0
            goto L12
        Le:
            net.bytebuddy.jar.asm.ModuleVisitor r2 = r1.createModuleRemapper(r2)
        L12:
            return r2
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public void visitNestHost(java.lang.String r2) {
            r1 = this;
            net.bytebuddy.jar.asm.commons.Remapper r0 = r1.remapper
            java.lang.String r2 = r0.mapType(r2)
            super.visitNestHost(r2)
            return
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public void visitNestMember(java.lang.String r2) {
            r1 = this;
            net.bytebuddy.jar.asm.commons.Remapper r0 = r1.remapper
            java.lang.String r2 = r0.mapType(r2)
            super.visitNestMember(r2)
            return
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public void visitOuterClass(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            net.bytebuddy.jar.asm.commons.Remapper r0 = r3.remapper
            java.lang.String r0 = r0.mapType(r4)
            r1 = 0
            if (r5 != 0) goto Lb
            r4 = r1
            goto L11
        Lb:
            net.bytebuddy.jar.asm.commons.Remapper r2 = r3.remapper
            java.lang.String r4 = r2.mapMethodName(r4, r5, r6)
        L11:
            if (r6 != 0) goto L14
            goto L1a
        L14:
            net.bytebuddy.jar.asm.commons.Remapper r5 = r3.remapper
            java.lang.String r1 = r5.mapMethodDesc(r6)
        L1a:
            super.visitOuterClass(r0, r4, r1)
            return
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public void visitPermittedSubclass(java.lang.String r2) {
            r1 = this;
            net.bytebuddy.jar.asm.commons.Remapper r0 = r1.remapper
            java.lang.String r2 = r0.mapType(r2)
            super.visitPermittedSubclass(r2)
            return
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public net.bytebuddy.jar.asm.RecordComponentVisitor visitRecordComponent(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            net.bytebuddy.jar.asm.commons.Remapper r0 = r2.remapper
            java.lang.String r1 = r2.className
            java.lang.String r3 = r0.mapRecordComponentName(r1, r3, r4)
            net.bytebuddy.jar.asm.commons.Remapper r0 = r2.remapper
            java.lang.String r4 = r0.mapDesc(r4)
            net.bytebuddy.jar.asm.commons.Remapper r0 = r2.remapper
            r1 = 1
            java.lang.String r5 = r0.mapSignature(r5, r1)
            net.bytebuddy.jar.asm.RecordComponentVisitor r3 = super.visitRecordComponent(r3, r4, r5)
            if (r3 != 0) goto L1d
            r3 = 0
            goto L21
        L1d:
            net.bytebuddy.jar.asm.RecordComponentVisitor r3 = r2.createRecordComponentRemapper(r3)
        L21:
            return r3
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public net.bytebuddy.jar.asm.AnnotationVisitor visitTypeAnnotation(int r2, net.bytebuddy.jar.asm.TypePath r3, java.lang.String r4, boolean r5) {
            r1 = this;
            net.bytebuddy.jar.asm.commons.Remapper r0 = r1.remapper
            java.lang.String r0 = r0.mapDesc(r4)
            net.bytebuddy.jar.asm.AnnotationVisitor r2 = super.visitTypeAnnotation(r2, r3, r0, r5)
            if (r2 != 0) goto Le
            r2 = 0
            goto L12
        Le:
            net.bytebuddy.jar.asm.AnnotationVisitor r2 = r1.createAnnotationRemapper(r4, r2)
        L12:
            return r2
    }
}
