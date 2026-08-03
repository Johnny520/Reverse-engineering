package bsh.org.objectweb.asm;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriter extends bsh.org.objectweb.asm.FieldVisitor {
    private final int accessFlags;
    private int constantValueIndex;
    private final int descriptorIndex;
    private bsh.org.objectweb.asm.Attribute firstAttribute;
    private final int nameIndex;
    private int signatureIndex;
    private final bsh.org.objectweb.asm.SymbolTable symbolTable;

    public FieldWriter(bsh.org.objectweb.asm.SymbolTable r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.Object r7) {
            r1 = this;
            r0 = 393216(0x60000, float:5.51013E-40)
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
            bsh.org.objectweb.asm.Symbol r2 = r2.addConstant(r7)
            int r2 = r2.index
            r1.constantValueIndex = r2
        L27:
            return
    }

    public final void collectAttributePrototypes(bsh.org.objectweb.asm.Attribute.Set r2) {
            r1 = this;
            bsh.org.objectweb.asm.Attribute r0 = r1.firstAttribute
            r2.addAttributes(r0)
            return
    }

    public int computeFieldInfoSize() {
            r3 = this;
            int r0 = r3.constantValueIndex
            if (r0 == 0) goto Le
            bsh.org.objectweb.asm.SymbolTable r0 = r3.symbolTable
            java.lang.String r1 = "ConstantValue"
            r0.addConstantUtf8(r1)
            r0 = 16
            goto L10
        Le:
            r0 = 8
        L10:
            int r1 = r3.accessFlags
            r1 = r1 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L29
            bsh.org.objectweb.asm.SymbolTable r1 = r3.symbolTable
            int r1 = r1.getMajorVersion()
            r2 = 49
            if (r1 >= r2) goto L29
            bsh.org.objectweb.asm.SymbolTable r1 = r3.symbolTable
            java.lang.String r2 = "Synthetic"
            r1.addConstantUtf8(r2)
            int r0 = r0 + 6
        L29:
            int r1 = r3.signatureIndex
            if (r1 == 0) goto L36
            bsh.org.objectweb.asm.SymbolTable r1 = r3.symbolTable
            java.lang.String r2 = "Signature"
            r1.addConstantUtf8(r2)
            int r0 = r0 + 8
        L36:
            int r1 = r3.accessFlags
            r2 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r2
            if (r1 == 0) goto L46
            bsh.org.objectweb.asm.SymbolTable r1 = r3.symbolTable
            java.lang.String r2 = "Deprecated"
            r1.addConstantUtf8(r2)
            int r0 = r0 + 6
        L46:
            bsh.org.objectweb.asm.Attribute r1 = r3.firstAttribute
            if (r1 == 0) goto L52
            bsh.org.objectweb.asm.SymbolTable r2 = r3.symbolTable
            int r1 = r1.computeAttributesSize(r2)
            int r1 = r1 + r0
            return r1
        L52:
            return r0
    }

    public void putFieldInfo(bsh.org.objectweb.asm.ByteVector r8) {
            r7 = this;
            bsh.org.objectweb.asm.SymbolTable r0 = r7.symbolTable
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
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L15
            r4 = r1
            goto L16
        L15:
            r4 = r2
        L16:
            int r5 = r7.accessFlags
            int r4 = ~r4
            r4 = r4 & r5
            bsh.org.objectweb.asm.ByteVector r4 = r8.putShort(r4)
            int r5 = r7.nameIndex
            bsh.org.objectweb.asm.ByteVector r4 = r4.putShort(r5)
            int r5 = r7.descriptorIndex
            r4.putShort(r5)
            int r4 = r7.constantValueIndex
            if (r4 == 0) goto L2e
            goto L2f
        L2e:
            r3 = r2
        L2f:
            int r4 = r7.accessFlags
            r5 = r4 & 4096(0x1000, float:5.74E-42)
            if (r5 == 0) goto L39
            if (r0 == 0) goto L39
            int r3 = r3 + 1
        L39:
            int r5 = r7.signatureIndex
            if (r5 == 0) goto L3f
            int r3 = r3 + 1
        L3f:
            r5 = 131072(0x20000, float:1.83671E-40)
            r4 = r4 & r5
            if (r4 == 0) goto L46
            int r3 = r3 + 1
        L46:
            bsh.org.objectweb.asm.Attribute r4 = r7.firstAttribute
            if (r4 == 0) goto L4f
            int r4 = r4.getAttributeCount()
            int r3 = r3 + r4
        L4f:
            r8.putShort(r3)
            int r3 = r7.constantValueIndex
            r4 = 2
            if (r3 == 0) goto L6c
            bsh.org.objectweb.asm.SymbolTable r3 = r7.symbolTable
            java.lang.String r6 = "ConstantValue"
            int r3 = r3.addConstantUtf8(r6)
            bsh.org.objectweb.asm.ByteVector r3 = r8.putShort(r3)
            bsh.org.objectweb.asm.ByteVector r3 = r3.putInt(r4)
            int r6 = r7.constantValueIndex
            r3.putShort(r6)
        L6c:
            int r3 = r7.accessFlags
            r1 = r1 & r3
            if (r1 == 0) goto L82
            if (r0 == 0) goto L82
            bsh.org.objectweb.asm.SymbolTable r0 = r7.symbolTable
            java.lang.String r1 = "Synthetic"
            int r0 = r0.addConstantUtf8(r1)
            bsh.org.objectweb.asm.ByteVector r0 = r8.putShort(r0)
            r0.putInt(r2)
        L82:
            int r0 = r7.signatureIndex
            if (r0 == 0) goto L9b
            bsh.org.objectweb.asm.SymbolTable r0 = r7.symbolTable
            java.lang.String r1 = "Signature"
            int r0 = r0.addConstantUtf8(r1)
            bsh.org.objectweb.asm.ByteVector r0 = r8.putShort(r0)
            bsh.org.objectweb.asm.ByteVector r0 = r0.putInt(r4)
            int r1 = r7.signatureIndex
            r0.putShort(r1)
        L9b:
            int r0 = r7.accessFlags
            r0 = r0 & r5
            if (r0 == 0) goto Laf
            bsh.org.objectweb.asm.SymbolTable r0 = r7.symbolTable
            java.lang.String r1 = "Deprecated"
            int r0 = r0.addConstantUtf8(r1)
            bsh.org.objectweb.asm.ByteVector r0 = r8.putShort(r0)
            r0.putInt(r2)
        Laf:
            bsh.org.objectweb.asm.Attribute r0 = r7.firstAttribute
            if (r0 == 0) goto Lb8
            bsh.org.objectweb.asm.SymbolTable r1 = r7.symbolTable
            r0.putAttributes(r1, r8)
        Lb8:
            return
    }

    @Override // bsh.org.objectweb.asm.FieldVisitor
    public void visitAttribute(bsh.org.objectweb.asm.Attribute r2) {
            r1 = this;
            bsh.org.objectweb.asm.Attribute r0 = r1.firstAttribute
            r2.nextAttribute = r0
            r1.firstAttribute = r2
            return
    }

    @Override // bsh.org.objectweb.asm.FieldVisitor
    public void visitEnd() {
            r0 = this;
            return
    }
}
