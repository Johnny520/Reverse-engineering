package bsh.org.objectweb.asm;

import bsh.org.objectweb.asm.Attribute;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriter extends FieldVisitor {
    private final int accessFlags;
    private int constantValueIndex;
    private final int descriptorIndex;
    private Attribute firstAttribute;
    private final int nameIndex;
    private int signatureIndex;
    private final SymbolTable symbolTable;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriter(SymbolTable symbolTable, int i9, String str, String str2, String str3, Object obj) {
        super(Opcodes.ASM6);
        this.symbolTable = symbolTable;
        this.accessFlags = i9;
        this.nameIndex = symbolTable.addConstantUtf8(str);
        this.descriptorIndex = symbolTable.addConstantUtf8(str2);
        if (str3 != null) {
            this.signatureIndex = symbolTable.addConstantUtf8(str3);
        }
        if (obj != null) {
            this.constantValueIndex = symbolTable.addConstant(obj).index;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void collectAttributePrototypes(Attribute.Set set) {
        set.addAttributes(this.firstAttribute);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int computeFieldInfoSize() {
        int i9;
        if (this.constantValueIndex != 0) {
            this.symbolTable.addConstantUtf8("ConstantValue");
            i9 = 16;
        } else {
            i9 = 8;
        }
        if ((this.accessFlags & 4096) != 0 && this.symbolTable.getMajorVersion() < 49) {
            this.symbolTable.addConstantUtf8("Synthetic");
            i9 += 6;
        }
        if (this.signatureIndex != 0) {
            this.symbolTable.addConstantUtf8("Signature");
            i9 += 8;
        }
        if ((this.accessFlags & Opcodes.ACC_DEPRECATED) != 0) {
            this.symbolTable.addConstantUtf8("Deprecated");
            i9 += 6;
        }
        Attribute attribute = this.firstAttribute;
        return attribute != null ? attribute.computeAttributesSize(this.symbolTable) + i9 : i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void putFieldInfo(ByteVector byteVector) {
        boolean z9 = this.symbolTable.getMajorVersion() < 49;
        byteVector.putShort((~(z9 ? 4096 : 0)) & this.accessFlags).putShort(this.nameIndex).putShort(this.descriptorIndex);
        int attributeCount = this.constantValueIndex == 0 ? 0 : 1;
        int i9 = this.accessFlags;
        if ((i9 & 4096) != 0 && z9) {
            attributeCount++;
        }
        if (this.signatureIndex != 0) {
            attributeCount++;
        }
        if ((i9 & Opcodes.ACC_DEPRECATED) != 0) {
            attributeCount++;
        }
        Attribute attribute = this.firstAttribute;
        if (attribute != null) {
            attributeCount += attribute.getAttributeCount();
        }
        byteVector.putShort(attributeCount);
        if (this.constantValueIndex != 0) {
            byteVector.putShort(this.symbolTable.addConstantUtf8("ConstantValue")).putInt(2).putShort(this.constantValueIndex);
        }
        if ((4096 & this.accessFlags) != 0 && z9) {
            byteVector.putShort(this.symbolTable.addConstantUtf8("Synthetic")).putInt(0);
        }
        if (this.signatureIndex != 0) {
            byteVector.putShort(this.symbolTable.addConstantUtf8("Signature")).putInt(2).putShort(this.signatureIndex);
        }
        if ((this.accessFlags & Opcodes.ACC_DEPRECATED) != 0) {
            byteVector.putShort(this.symbolTable.addConstantUtf8("Deprecated")).putInt(0);
        }
        Attribute attribute2 = this.firstAttribute;
        if (attribute2 != null) {
            attribute2.putAttributes(this.symbolTable, byteVector);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.FieldVisitor
    public void visitAttribute(Attribute attribute) {
        attribute.nextAttribute = this.firstAttribute;
        this.firstAttribute = attribute;
    }

    @Override // bsh.org.objectweb.asm.FieldVisitor
    public void visitEnd() {
    }
}
