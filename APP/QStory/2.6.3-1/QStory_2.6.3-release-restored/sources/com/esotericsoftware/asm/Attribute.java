package com.esotericsoftware.asm;

/* JADX INFO: loaded from: classes.dex */
public class Attribute {

    /* JADX INFO: renamed from: a */
    Attribute f105a;

    /* JADX INFO: renamed from: b */
    byte[] f106b;
    public final String type;

    public Attribute(String str) {
        this.type = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m39a(ClassWriter classWriter, byte[] bArr, int i, int i2, int i3, ByteVector byteVector) {
        while (this != null) {
            ByteVector byteVectorWrite = this.write(classWriter, bArr, i, i2, i3);
            byteVector.putShort(classWriter.newUTF8(this.type)).putInt(byteVectorWrite.f108b);
            byteVector.putByteArray(byteVectorWrite.f107a, 0, byteVectorWrite.f108b);
            this = this.f105a;
        }
    }

    public Label[] getLabels() {
        return null;
    }

    public boolean isCodeAttribute() {
        return false;
    }

    public boolean isUnknown() {
        return true;
    }

    public Attribute read(ClassReader classReader, int i, int i2, char[] cArr, int i3, Label[] labelArr) {
        Attribute attribute = new Attribute(this.type);
        byte[] bArr = new byte[i2];
        attribute.f106b = bArr;
        System.arraycopy(classReader.f110b, i, bArr, 0, i2);
        return attribute;
    }

    public ByteVector write(ClassWriter classWriter, byte[] bArr, int i, int i2, int i3) {
        ByteVector byteVector = new ByteVector();
        byte[] bArr2 = this.f106b;
        byteVector.f107a = bArr2;
        byteVector.f108b = bArr2.length;
        return byteVector;
    }

    /* JADX INFO: renamed from: a */
    public final int m38a(ClassWriter classWriter, byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        while (this != null) {
            classWriter.newUTF8(this.type);
            i4 += this.write(classWriter, bArr, i, i2, i3).f108b + 6;
            this = this.f105a;
        }
        return i4;
    }

    /* JADX INFO: renamed from: a */
    public final int m37a() {
        int i = 0;
        while (this != null) {
            i++;
            this = this.f105a;
        }
        return i;
    }
}
