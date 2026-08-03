package net.bytebuddy.jar.asm;

/* JADX INFO: loaded from: classes2.dex */
final class FieldWriter extends net.bytebuddy.jar.asm.FieldVisitor {
    private final int accessFlags;
    private int constantValueIndex;
    private final int descriptorIndex;
    private net.bytebuddy.jar.asm.Attribute firstAttribute;
    private net.bytebuddy.jar.asm.AnnotationWriter lastRuntimeInvisibleAnnotation;
    private net.bytebuddy.jar.asm.AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
    private net.bytebuddy.jar.asm.AnnotationWriter lastRuntimeVisibleAnnotation;
    private net.bytebuddy.jar.asm.AnnotationWriter lastRuntimeVisibleTypeAnnotation;
    private final int nameIndex;
    private int signatureIndex;
    private final net.bytebuddy.jar.asm.SymbolTable symbolTable;

    public FieldWriter(net.bytebuddy.jar.asm.SymbolTable r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.Object r7) {
            r1 = this;
            r0 = 589824(0x90000, float:8.2652E-40)
            r1.<init>(r0)
            r1.symbolTable = r2
            r1.accessFlags = r3
            int r3 = r2.addConstantUtf8(r4)
            r1.nameIndex = r3
            int r3 = r2.addConstantUtf8(r5)
            r1.descriptorIndex = r3
            if (r6 == 0) goto L1d
            int r3 = r2.addConstantUtf8(r6)
            r1.signatureIndex = r3
        L1d:
            if (r7 == 0) goto L27
            net.bytebuddy.jar.asm.Symbol r2 = r2.addConstant(r7)
            int r2 = r2.index
            r1.constantValueIndex = r2
        L27:
            return
    }

    public final void collectAttributePrototypes(net.bytebuddy.jar.asm.Attribute.Set r2) {
            r1 = this;
            net.bytebuddy.jar.asm.Attribute r0 = r1.firstAttribute
            r2.addAttributes(r0)
            return
    }

    public int computeFieldInfoSize() {
            r5 = this;
            int r0 = r5.constantValueIndex
            if (r0 == 0) goto Le
            net.bytebuddy.jar.asm.SymbolTable r0 = r5.symbolTable
            java.lang.String r1 = "ConstantValue"
            r0.addConstantUtf8(r1)
            r0 = 16
            goto L10
        Le:
            r0 = 8
        L10:
            net.bytebuddy.jar.asm.SymbolTable r1 = r5.symbolTable
            int r2 = r5.accessFlags
            int r3 = r5.signatureIndex
            int r1 = net.bytebuddy.jar.asm.Attribute.computeAttributesSize(r1, r2, r3)
            int r0 = r0 + r1
            net.bytebuddy.jar.asm.AnnotationWriter r1 = r5.lastRuntimeVisibleAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r2 = r5.lastRuntimeInvisibleAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r3 = r5.lastRuntimeVisibleTypeAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r4 = r5.lastRuntimeInvisibleTypeAnnotation
            int r1 = net.bytebuddy.jar.asm.AnnotationWriter.computeAnnotationsSize(r1, r2, r3, r4)
            int r0 = r0 + r1
            net.bytebuddy.jar.asm.Attribute r1 = r5.firstAttribute
            if (r1 == 0) goto L33
            net.bytebuddy.jar.asm.SymbolTable r2 = r5.symbolTable
            int r1 = r1.computeAttributesSize(r2)
            int r0 = r0 + r1
        L33:
            return r0
    }

    public void putFieldInfo(net.bytebuddy.jar.asm.ByteVector r10) {
            r9 = this;
            net.bytebuddy.jar.asm.SymbolTable r0 = r9.symbolTable
            int r0 = r0.getMajorVersion()
            r1 = 49
            r2 = 0
            r3 = 1
            if (r0 >= r1) goto Le
            r0 = r3
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 == 0) goto L14
            r1 = 4096(0x1000, float:5.74E-42)
            goto L15
        L14:
            r1 = r2
        L15:
            int r4 = r9.accessFlags
            int r1 = ~r1
            r1 = r1 & r4
            net.bytebuddy.jar.asm.ByteVector r1 = r10.putShort(r1)
            int r4 = r9.nameIndex
            net.bytebuddy.jar.asm.ByteVector r1 = r1.putShort(r4)
            int r4 = r9.descriptorIndex
            r1.putShort(r4)
            int r1 = r9.constantValueIndex
            if (r1 == 0) goto L2d
            r2 = r3
        L2d:
            int r1 = r9.accessFlags
            r3 = r1 & 4096(0x1000, float:5.74E-42)
            if (r3 == 0) goto L37
            if (r0 == 0) goto L37
            int r2 = r2 + 1
        L37:
            int r0 = r9.signatureIndex
            if (r0 == 0) goto L3d
            int r2 = r2 + 1
        L3d:
            r0 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L44
            int r2 = r2 + 1
        L44:
            net.bytebuddy.jar.asm.AnnotationWriter r0 = r9.lastRuntimeVisibleAnnotation
            if (r0 == 0) goto L4a
            int r2 = r2 + 1
        L4a:
            net.bytebuddy.jar.asm.AnnotationWriter r0 = r9.lastRuntimeInvisibleAnnotation
            if (r0 == 0) goto L50
            int r2 = r2 + 1
        L50:
            net.bytebuddy.jar.asm.AnnotationWriter r0 = r9.lastRuntimeVisibleTypeAnnotation
            if (r0 == 0) goto L56
            int r2 = r2 + 1
        L56:
            net.bytebuddy.jar.asm.AnnotationWriter r0 = r9.lastRuntimeInvisibleTypeAnnotation
            if (r0 == 0) goto L5c
            int r2 = r2 + 1
        L5c:
            net.bytebuddy.jar.asm.Attribute r0 = r9.firstAttribute
            if (r0 == 0) goto L65
            int r0 = r0.getAttributeCount()
            int r2 = r2 + r0
        L65:
            r10.putShort(r2)
            int r0 = r9.constantValueIndex
            if (r0 == 0) goto L82
            net.bytebuddy.jar.asm.SymbolTable r0 = r9.symbolTable
            java.lang.String r1 = "ConstantValue"
            int r0 = r0.addConstantUtf8(r1)
            net.bytebuddy.jar.asm.ByteVector r0 = r10.putShort(r0)
            r1 = 2
            net.bytebuddy.jar.asm.ByteVector r0 = r0.putInt(r1)
            int r1 = r9.constantValueIndex
            r0.putShort(r1)
        L82:
            net.bytebuddy.jar.asm.SymbolTable r0 = r9.symbolTable
            int r1 = r9.accessFlags
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
            if (r0 == 0) goto La2
            net.bytebuddy.jar.asm.SymbolTable r1 = r9.symbolTable
            r0.putAttributes(r1, r10)
        La2:
            return
    }

    @Override // net.bytebuddy.jar.asm.FieldVisitor
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

    @Override // net.bytebuddy.jar.asm.FieldVisitor
    public void visitAttribute(net.bytebuddy.jar.asm.Attribute r2) {
            r1 = this;
            net.bytebuddy.jar.asm.Attribute r0 = r1.firstAttribute
            r2.nextAttribute = r0
            r1.firstAttribute = r2
            return
    }

    @Override // net.bytebuddy.jar.asm.FieldVisitor
    public void visitEnd() {
            r0 = this;
            return
    }

    @Override // net.bytebuddy.jar.asm.FieldVisitor
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
