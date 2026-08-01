package com.android.dx.io.instructions;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface CodeOutput extends CodeCursor {
    void write(short s);

    void write(short s, short s2);

    void write(short s, short s2, short s3);

    void write(short s, short s2, short s3, short s4);

    void write(short s, short s2, short s3, short s4, short s5);

    void write(byte[] bArr);

    void write(int[] iArr);

    void write(long[] jArr);

    void write(short[] sArr);

    void writeInt(int i);

    void writeLong(long j);
}
