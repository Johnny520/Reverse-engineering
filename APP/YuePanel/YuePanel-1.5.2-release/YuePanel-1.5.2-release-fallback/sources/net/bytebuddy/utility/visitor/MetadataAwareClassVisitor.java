package net.bytebuddy.utility.visitor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MetadataAwareClassVisitor extends net.bytebuddy.jar.asm.ClassVisitor {
    private boolean triggerAttributes;
    private boolean triggerNestHost;
    private boolean triggerOuterClass;

    public MetadataAwareClassVisitor(int r1, net.bytebuddy.jar.asm.ClassVisitor r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 1
            r0.triggerNestHost = r1
            r0.triggerOuterClass = r1
            r0.triggerAttributes = r1
            return
    }

    private void considerTriggerAfterAttributes() {
            r1 = this;
            boolean r0 = r1.triggerAttributes
            if (r0 == 0) goto La
            r0 = 0
            r1.triggerAttributes = r0
            r1.onAfterAttributes()
        La:
            return
    }

    private void considerTriggerNestHost() {
            r1 = this;
            boolean r0 = r1.triggerNestHost
            if (r0 == 0) goto La
            r0 = 0
            r1.triggerNestHost = r0
            r1.onNestHost()
        La:
            return
    }

    private void considerTriggerOuterClass() {
            r1 = this;
            boolean r0 = r1.triggerOuterClass
            if (r0 == 0) goto La
            r0 = 0
            r1.triggerOuterClass = r0
            r1.onOuterType()
        La:
            return
    }

    public void onAfterAttributes() {
            r0 = this;
            return
    }

    public void onNestHost() {
            r0 = this;
            return
    }

    public void onOuterType() {
            r0 = this;
            return
    }

    @net.bytebuddy.utility.nullability.MaybeNull
    public net.bytebuddy.jar.asm.AnnotationVisitor onVisitAnnotation(java.lang.String r1, boolean r2) {
            r0 = this;
            net.bytebuddy.jar.asm.AnnotationVisitor r1 = super.visitAnnotation(r1, r2)
            return r1
    }

    public void onVisitAttribute(net.bytebuddy.jar.asm.Attribute r1) {
            r0 = this;
            super.visitAttribute(r1)
            return
    }

    public void onVisitEnd() {
            r0 = this;
            super.visitEnd()
            return
    }

    @net.bytebuddy.utility.nullability.MaybeNull
    public net.bytebuddy.jar.asm.FieldVisitor onVisitField(int r1, java.lang.String r2, java.lang.String r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r4, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
            r0 = this;
            net.bytebuddy.jar.asm.FieldVisitor r1 = super.visitField(r1, r2, r3, r4, r5)
            return r1
    }

    public void onVisitInnerClass(java.lang.String r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r3, int r4) {
            r0 = this;
            super.visitInnerClass(r1, r2, r3, r4)
            return
    }

    @net.bytebuddy.utility.nullability.MaybeNull
    public net.bytebuddy.jar.asm.MethodVisitor onVisitMethod(int r1, java.lang.String r2, java.lang.String r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r4, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String[] r5) {
            r0 = this;
            net.bytebuddy.jar.asm.MethodVisitor r1 = super.visitMethod(r1, r2, r3, r4, r5)
            return r1
    }

    public void onVisitNestHost(java.lang.String r1) {
            r0 = this;
            super.visitNestHost(r1)
            return
    }

    public void onVisitNestMember(java.lang.String r1) {
            r0 = this;
            super.visitNestMember(r1)
            return
    }

    public void onVisitOuterClass(java.lang.String r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r3) {
            r0 = this;
            super.visitOuterClass(r1, r2, r3)
            return
    }

    public void onVisitPermittedSubclass(java.lang.String r1) {
            r0 = this;
            super.visitPermittedSubclass(r1)
            return
    }

    @net.bytebuddy.utility.nullability.MaybeNull
    public net.bytebuddy.jar.asm.RecordComponentVisitor onVisitRecordComponent(java.lang.String r1, java.lang.String r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r3) {
            r0 = this;
            net.bytebuddy.jar.asm.RecordComponentVisitor r1 = super.visitRecordComponent(r1, r2, r3)
            return r1
    }

    @net.bytebuddy.utility.nullability.MaybeNull
    public net.bytebuddy.jar.asm.AnnotationVisitor onVisitTypeAnnotation(int r1, net.bytebuddy.jar.asm.TypePath r2, java.lang.String r3, boolean r4) {
            r0 = this;
            net.bytebuddy.jar.asm.AnnotationVisitor r1 = super.visitTypeAnnotation(r1, r2, r3, r4)
            return r1
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    @net.bytebuddy.utility.nullability.MaybeNull
    public final net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotation(java.lang.String r1, boolean r2) {
            r0 = this;
            r0.considerTriggerNestHost()
            r0.considerTriggerOuterClass()
            net.bytebuddy.jar.asm.AnnotationVisitor r1 = r0.onVisitAnnotation(r1, r2)
            return r1
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public final void visitAttribute(net.bytebuddy.jar.asm.Attribute r1) {
            r0 = this;
            r0.considerTriggerNestHost()
            r0.considerTriggerOuterClass()
            r0.onVisitAttribute(r1)
            return
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public final void visitEnd() {
            r0 = this;
            r0.considerTriggerNestHost()
            r0.considerTriggerOuterClass()
            r0.considerTriggerAfterAttributes()
            r0.onVisitEnd()
            return
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    @net.bytebuddy.utility.nullability.MaybeNull
    public final net.bytebuddy.jar.asm.FieldVisitor visitField(int r1, java.lang.String r2, java.lang.String r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r4, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
            r0 = this;
            r0.considerTriggerNestHost()
            r0.considerTriggerOuterClass()
            r0.considerTriggerAfterAttributes()
            net.bytebuddy.jar.asm.FieldVisitor r1 = r0.onVisitField(r1, r2, r3, r4, r5)
            return r1
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public final void visitInnerClass(java.lang.String r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r3, int r4) {
            r0 = this;
            r0.considerTriggerNestHost()
            r0.considerTriggerOuterClass()
            r0.considerTriggerAfterAttributes()
            r0.onVisitInnerClass(r1, r2, r3, r4)
            return
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    @net.bytebuddy.utility.nullability.MaybeNull
    public final net.bytebuddy.jar.asm.MethodVisitor visitMethod(int r1, java.lang.String r2, java.lang.String r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r4, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String[] r5) {
            r0 = this;
            r0.considerTriggerNestHost()
            r0.considerTriggerOuterClass()
            r0.considerTriggerAfterAttributes()
            net.bytebuddy.jar.asm.MethodVisitor r1 = r0.onVisitMethod(r1, r2, r3, r4, r5)
            return r1
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public final void visitNestHost(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.triggerNestHost = r0
            r1.onVisitNestHost(r2)
            return
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public final void visitNestMember(java.lang.String r1) {
            r0 = this;
            r0.considerTriggerNestHost()
            r0.considerTriggerOuterClass()
            r0.considerTriggerAfterAttributes()
            r0.onVisitNestMember(r1)
            return
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public final void visitOuterClass(java.lang.String r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r4) {
            r1 = this;
            r1.considerTriggerNestHost()
            r0 = 0
            r1.triggerOuterClass = r0
            r1.onVisitOuterClass(r2, r3, r4)
            return
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public final void visitPermittedSubclass(java.lang.String r1) {
            r0 = this;
            r0.considerTriggerNestHost()
            r0.considerTriggerOuterClass()
            r0.considerTriggerAfterAttributes()
            r0.onVisitPermittedSubclass(r1)
            return
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    @net.bytebuddy.utility.nullability.MaybeNull
    public net.bytebuddy.jar.asm.RecordComponentVisitor visitRecordComponent(java.lang.String r1, java.lang.String r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r3) {
            r0 = this;
            r0.considerTriggerNestHost()
            r0.considerTriggerOuterClass()
            r0.considerTriggerAfterAttributes()
            net.bytebuddy.jar.asm.RecordComponentVisitor r1 = r0.onVisitRecordComponent(r1, r2, r3)
            return r1
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    @net.bytebuddy.utility.nullability.MaybeNull
    public final net.bytebuddy.jar.asm.AnnotationVisitor visitTypeAnnotation(int r1, net.bytebuddy.jar.asm.TypePath r2, java.lang.String r3, boolean r4) {
            r0 = this;
            r0.considerTriggerNestHost()
            r0.considerTriggerOuterClass()
            net.bytebuddy.jar.asm.AnnotationVisitor r1 = r0.onVisitTypeAnnotation(r1, r2, r3, r4)
            return r1
    }
}
