package com.android.dx.io.instructions;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
