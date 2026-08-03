package com.android.dx.io.instructions;

/* JADX INFO: loaded from: classes.dex */
public interface CodeOutput extends com.android.dx.io.instructions.CodeCursor {
    void write(short r1);

    void write(short r1, short r2);

    void write(short r1, short r2, short r3);

    void write(short r1, short r2, short r3, short r4);

    void write(short r1, short r2, short r3, short r4, short r5);

    void write(byte[] r1);

    void write(int[] r1);

    void write(long[] r1);

    void write(short[] r1);

    void writeInt(int r1);

    void writeLong(long r1);
}
