package com.android.dx.io.instructions;

import bsh.C2632;
import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ShortArrayCodeInput extends BaseCodeCursor implements CodeInput {
    private final short[] array;

    public ShortArrayCodeInput(short[] sArr) {
        if (sArr != null) {
            this.array = sArr;
        } else {
            C2632.m5298("array == null");
            throw null;
        }
    }

    @Override // com.android.dx.io.instructions.CodeInput
    public boolean hasMore() {
        return cursor() < this.array.length;
    }

    @Override // com.android.dx.io.instructions.CodeInput
    public int read() throws EOFException {
        try {
            short s = this.array[cursor()];
            advance(1);
            return 65535 & s;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new EOFException();
        }
    }

    @Override // com.android.dx.io.instructions.CodeInput
    public int readInt() throws EOFException {
        return (read() << 16) | read();
    }

    @Override // com.android.dx.io.instructions.CodeInput
    public long readLong() {
        return ((long) read()) | (((long) read()) << 16) | (((long) read()) << 32) | (((long) read()) << 48);
    }
}
