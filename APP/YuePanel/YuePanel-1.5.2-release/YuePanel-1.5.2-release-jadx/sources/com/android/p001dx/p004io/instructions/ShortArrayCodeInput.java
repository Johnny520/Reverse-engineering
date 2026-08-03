package com.android.p001dx.p004io.instructions;

import Yue.C8080;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class ShortArrayCodeInput extends BaseCodeCursor implements CodeInput {
    private final short[] array;

    public ShortArrayCodeInput(short[] sArr) {
        if (sArr == null) {
            throw new NullPointerException("array == null");
        }
        this.array = sArr;
    }

    @Override // com.android.p001dx.p004io.instructions.CodeInput
    public boolean hasMore() {
        return cursor() < this.array.length;
    }

    @Override // com.android.p001dx.p004io.instructions.CodeInput
    public int read() throws EOFException {
        try {
            short s = this.array[cursor()];
            advance(1);
            return s & C8080.f23970;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new EOFException();
        }
    }

    @Override // com.android.p001dx.p004io.instructions.CodeInput
    public int readInt() throws EOFException {
        return read() | (read() << 16);
    }

    @Override // com.android.p001dx.p004io.instructions.CodeInput
    public long readLong() throws EOFException {
        return ((long) read()) | (((long) read()) << 16) | (((long) read()) << 32) | (((long) read()) << 48);
    }
}
