package com.alibaba.fastjson2.internal.asm;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class FieldWriter {
    private final int accessFlags;
    private final int descriptorIndex;

    /* JADX INFO: renamed from: fv */
    FieldWriter f4558fv;
    private final int nameIndex;

    public FieldWriter(SymbolTable symbolTable, int i10, String str, String str2) {
        this.accessFlags = i10;
        this.nameIndex = symbolTable.addConstantUtf8(str);
        this.descriptorIndex = symbolTable.addConstantUtf8(str2);
    }

    public void putFieldInfo(ByteVector byteVector) {
        byteVector.putShort(this.accessFlags).putShort(this.nameIndex).putShort(this.descriptorIndex);
        byteVector.putShort(0);
    }
}
