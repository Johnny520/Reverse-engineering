package com.android.p002dx.p005io.instructions;

import bsh.C3466;
import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ShortArrayCodeInput extends BaseCodeCursor implements CodeInput {
    private final short[] array;

    public ShortArrayCodeInput(short[] sArr) {
        if (sArr != null) {
            this.array = sArr;
        } else {
            C3466.m5903("array == null");
            throw null;
        }
    }

    @Override // com.android.p002dx.p005io.instructions.CodeInput
    public boolean hasMore() {
        return cursor() < this.array.length;
    }

    @Override // com.android.p002dx.p005io.instructions.CodeInput
    public int read() throws EOFException {
        try {
            short s = this.array[cursor()];
            advance(1);
            return 65535 & s;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new EOFException();
        }
    }

    @Override // com.android.p002dx.p005io.instructions.CodeInput
    public int readInt() throws EOFException {
        return (read() << 16) | read();
    }

    @Override // com.android.p002dx.p005io.instructions.CodeInput
    public long readLong() {
        return ((long) read()) | (((long) read()) << 16) | (((long) read()) << 32) | (((long) read()) << 48);
    }
}
