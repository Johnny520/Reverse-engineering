package net.bytebuddy.jar.asm;

/* JADX INFO: loaded from: classes2.dex */
final class RecordComponentWriter extends net.bytebuddy.jar.asm.RecordComponentVisitor {
    private final int descriptorIndex;
    private net.bytebuddy.jar.asm.Attribute firstAttribute;
    private net.bytebuddy.jar.asm.AnnotationWriter lastRuntimeInvisibleAnnotation;
    private net.bytebuddy.jar.asm.AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
    private net.bytebuddy.jar.asm.AnnotationWriter lastRuntimeVisibleAnnotation;
    private net.bytebuddy.jar.asm.AnnotationWriter lastRuntimeVisibleTypeAnnotation;
    private final int nameIndex;
    private int signatureIndex;
    private final net.bytebuddy.jar.asm.SymbolTable symbolTable;

    public RecordComponentWriter(net.bytebuddy.jar.asm.SymbolTable r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r1 = this;
            r0 = 589824(0x90000, float:8.2652E-40)
            r1.<init>(r0)
            r1.symbolTable = r2
            int r3 = r2.addConstantUtf8(r3)
            r1.nameIndex = r3
            int r3 = r2.addConstantUtf8(r4)
            r1.descriptorIndex = r3
            if (r5 == 0) goto L1b
            int r2 = r2.addConstantUtf8(r5)
            r1.signatureIndex = r2
        L1b:
            return
    }

    public final void collectAttributePrototypes(net.bytebuddy.jar.asm.Attribute.Set r2) {
            r1 = this;
            net.bytebuddy.jar.asm.Attribute r0 = r1.firstAttribute
            r2.addAttributes(r0)
            return
    }

    public int computeRecordComponentInfoSize() {
            r5 = this;
            net.bytebuddy.jar.asm.SymbolTable r0 = r5.symbolTable
            r1 = 0
            int r2 = r5.signatureIndex
            int r0 = net.bytebuddy.jar.asm.Attribute.computeAttributesSize(r0, r1, r2)
            int r0 = r0 + 6
            net.bytebuddy.jar.asm.AnnotationWriter r1 = r5.lastRuntimeVisibleAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r2 = r5.lastRuntimeInvisibleAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r3 = r5.lastRuntimeVisibleTypeAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r4 = r5.lastRuntimeInvisibleTypeAnnotation
            int r1 = net.bytebuddy.jar.asm.AnnotationWriter.computeAnnotationsSize(r1, r2, r3, r4)
            int r0 = r0 + r1
            net.bytebuddy.jar.asm.Attribute r1 = r5.firstAttribute
            if (r1 == 0) goto L23
            net.bytebuddy.jar.asm.SymbolTable r2 = r5.symbolTable
            int r1 = r1.computeAttributesSize(r2)
            int r0 = r0 + r1
        L23:
            return r0
    }

    public void putRecordComponentInfo(net.bytebuddy.jar.asm.ByteVector r10) {
            r9 = this;
            int r0 = r9.nameIndex
            net.bytebuddy.jar.asm.ByteVector r0 = r10.putShort(r0)
            int r1 = r9.descriptorIndex
            r0.putShort(r1)
            int r0 = r9.signatureIndex
            r1 = 0
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = r1
        L13:
            net.bytebuddy.jar.asm.AnnotationWriter r2 = r9.lastRuntimeVisibleAnnotation
            if (r2 == 0) goto L19
            int r0 = r0 + 1
        L19:
            net.bytebuddy.jar.asm.AnnotationWriter r2 = r9.lastRuntimeInvisibleAnnotation
            if (r2 == 0) goto L1f
            int r0 = r0 + 1
        L1f:
            net.bytebuddy.jar.asm.AnnotationWriter r2 = r9.lastRuntimeVisibleTypeAnnotation
            if (r2 == 0) goto L25
            int r0 = r0 + 1
        L25:
            net.bytebuddy.jar.asm.AnnotationWriter r2 = r9.lastRuntimeInvisibleTypeAnnotation
            if (r2 == 0) goto L2b
            int r0 = r0 + 1
        L2b:
            net.bytebuddy.jar.asm.Attribute r2 = r9.firstAttribute
            if (r2 == 0) goto L34
            int r2 = r2.getAttributeCount()
            int r0 = r0 + r2
        L34:
            r10.putShort(r0)
            net.bytebuddy.jar.asm.SymbolTable r0 = r9.symbolTable
            int r2 = r9.signatureIndex
            net.bytebuddy.jar.asm.Attribute.putAttributes(r0, r1, r2, r10)
            net.bytebuddy.jar.asm.SymbolTable r3 = r9.symbolTable
            net.bytebuddy.jar.asm.AnnotationWriter r4 = r9.lastRuntimeVisibleAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r5 = r9.lastRuntimeInvisibleAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r6 = r9.lastRuntimeVisibleTypeAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r7 = r9.lastRuntimeInvisibleTypeAnnotation
            r8 = r10
            net.bytebuddy.jar.asm.AnnotationWriter.putAnnotations(r3, r4, r5, r6, r7, r8)
            net.bytebuddy.jar.asm.Attribute r0 = r9.firstAttribute
            if (r0 == 0) goto L55
            net.bytebuddy.jar.asm.SymbolTable r1 = r9.symbolTable
            r0.putAttributes(r1, r10)
        L55:
            return
    }

    @Override // net.bytebuddy.jar.asm.RecordComponentVisitor
    public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotation(java.lang.String r2, boolean r3) {
            r1 = this;
            if (r3 == 0) goto Ld
            net.bytebuddy.jar.asm.SymbolTable r3 = r1.symbolTable
            net.bytebuddy.jar.asm.AnnotationWriter r0 = r1.lastRuntimeVisibleAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r2 = net.bytebuddy.jar.asm.AnnotationWriter.create(r3, r2, r0)
            r1.lastRuntimeVisibleAnnotation = r2
            return r2
        Ld:
            net.bytebuddy.jar.asm.SymbolTable r3 = r1.symbolTable
            net.bytebuddy.jar.asm.AnnotationWriter r0 = r1.lastRuntimeInvisibleAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r2 = net.bytebuddy.jar.asm.AnnotationWriter.create(r3, r2, r0)
            r1.lastRuntimeInvisibleAnnotation = r2
            return r2
    }

    @Override // net.bytebuddy.jar.asm.RecordComponentVisitor
    public void visitAttribute(net.bytebuddy.jar.asm.Attribute r2) {
            r1 = this;
            net.bytebuddy.jar.asm.Attribute r0 = r1.firstAttribute
            r2.nextAttribute = r0
            r1.firstAttribute = r2
            return
    }

    @Override // net.bytebuddy.jar.asm.RecordComponentVisitor
    public void visitEnd() {
            r0 = this;
            return
    }

    @Override // net.bytebuddy.jar.asm.RecordComponentVisitor
    public net.bytebuddy.jar.asm.AnnotationVisitor visitTypeAnnotation(int r2, net.bytebuddy.jar.asm.TypePath r3, java.lang.String r4, boolean r5) {
            r1 = this;
            if (r5 == 0) goto Ld
            net.bytebuddy.jar.asm.SymbolTable r5 = r1.symbolTable
            net.bytebuddy.jar.asm.AnnotationWriter r0 = r1.lastRuntimeVisibleTypeAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r2 = net.bytebuddy.jar.asm.AnnotationWriter.create(r5, r2, r3, r4, r0)
            r1.lastRuntimeVisibleTypeAnnotation = r2
            return r2
        Ld:
            net.bytebuddy.jar.asm.SymbolTable r5 = r1.symbolTable
            net.bytebuddy.jar.asm.AnnotationWriter r0 = r1.lastRuntimeInvisibleTypeAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r2 = net.bytebuddy.jar.asm.AnnotationWriter.create(r5, r2, r3, r4, r0)
            r1.lastRuntimeInvisibleTypeAnnotation = r2
            return r2
    }
}
