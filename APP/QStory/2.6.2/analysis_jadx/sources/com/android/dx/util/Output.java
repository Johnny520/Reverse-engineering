package com.android.dx.util;

import p284.InterfaceC8384;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface Output extends InterfaceC8384 {
    void alignTo(int i);

    void assertCursor(int i);

    int getCursor();

    void write(ByteArray byteArray);

    void write(byte[] bArr);

    void write(byte[] bArr, int i, int i2);

    @Override // p284.InterfaceC8384
    void writeByte(int i);

    void writeInt(int i);

    void writeLong(long j);

    void writeShort(int i);

    int writeSleb128(int i);

    int writeUleb128(int i);

    void writeZeroes(int i);
}
