package com.android.p002dx.util;

import p300.InterfaceC9214;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface Output extends InterfaceC9214 {
    void alignTo(int i);

    void assertCursor(int i);

    int getCursor();

    void write(ByteArray byteArray);

    void write(byte[] bArr);

    void write(byte[] bArr, int i, int i2);

    @Override // p300.InterfaceC9214
    void writeByte(int i);

    void writeInt(int i);

    void writeLong(long j);

    void writeShort(int i);

    int writeSleb128(int i);

    int writeUleb128(int i);

    void writeZeroes(int i);
}
