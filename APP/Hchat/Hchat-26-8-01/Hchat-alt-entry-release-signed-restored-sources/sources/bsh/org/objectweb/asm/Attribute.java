package bsh.org.objectweb.asm;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class Attribute {
    private byte[] content;
    Attribute nextAttribute;
    public final String type;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Set {
        private static final int SIZE_INCREMENT = 6;
        private Attribute[] data = new Attribute[6];
        private int size;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private void add(Attribute attribute) {
            int i9 = this.size;
            Attribute[] attributeArr = this.data;
            if (i9 >= attributeArr.length) {
                Attribute[] attributeArr2 = new Attribute[attributeArr.length + 6];
                System.arraycopy(attributeArr, 0, attributeArr2, 0, i9);
                this.data = attributeArr2;
            }
            Attribute[] attributeArr3 = this.data;
            int i10 = this.size;
            this.size = i10 + 1;
            attributeArr3[i10] = attribute;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private boolean contains(Attribute attribute) {
            for (int i9 = 0; i9 < this.size; i9++) {
                if (this.data[i9].type.equals(attribute.type)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void addAttributes(Attribute attribute) {
            while (attribute != null) {
                if (!contains(attribute)) {
                    add(attribute);
                }
                attribute = attribute.nextAttribute;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Attribute[] toArray() {
            int i9 = this.size;
            Attribute[] attributeArr = new Attribute[i9];
            System.arraycopy(this.data, 0, attributeArr, 0, i9);
            return attributeArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Attribute(String str) {
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int computeAttributesSize(SymbolTable symbolTable, byte[] bArr, int i9, int i10, int i11) {
        ClassWriter classWriter = symbolTable.classWriter;
        int i12 = 0;
        Attribute attribute = this;
        while (attribute != null) {
            symbolTable.addConstantUtf8(attribute.type);
            byte[] bArr2 = bArr;
            i12 += attribute.write(classWriter, bArr2, i9, i10, i11).length + 6;
            attribute = attribute.nextAttribute;
            bArr = bArr2;
        }
        return i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getAttributeCount() {
        int i9 = 0;
        for (Attribute attribute = this; attribute != null; attribute = attribute.nextAttribute) {
            i9++;
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Label[] getLabels() {
        return new Label[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isCodeAttribute() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isUnknown() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void putAttributes(SymbolTable symbolTable, byte[] bArr, int i9, int i10, int i11, ByteVector byteVector) {
        ClassWriter classWriter = symbolTable.classWriter;
        Attribute attribute = this;
        while (attribute != null) {
            byte[] bArr2 = bArr;
            int i12 = i9;
            int i13 = i10;
            ByteVector byteVectorWrite = attribute.write(classWriter, bArr2, i12, i13, i11);
            byteVector.putShort(symbolTable.addConstantUtf8(attribute.type)).putInt(byteVectorWrite.length);
            byteVector.putByteArray(byteVectorWrite.data, 0, byteVectorWrite.length);
            attribute = attribute.nextAttribute;
            bArr = bArr2;
            i9 = i12;
            i10 = i13;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ByteVector write(ClassWriter classWriter, byte[] bArr, int i9, int i10, int i11) {
        return new ByteVector(this.content);
    }

    public final int computeAttributesSize(SymbolTable symbolTable) {
        return computeAttributesSize(symbolTable, null, 0, -1, -1);
    }

    public final void putAttributes(SymbolTable symbolTable, ByteVector byteVector) {
        putAttributes(symbolTable, null, 0, -1, -1, byteVector);
    }
}
