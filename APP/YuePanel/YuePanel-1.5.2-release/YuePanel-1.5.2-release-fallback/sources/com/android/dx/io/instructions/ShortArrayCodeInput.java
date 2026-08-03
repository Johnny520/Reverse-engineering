package com.android.dx.io.instructions;

/* JADX INFO: loaded from: classes.dex */
public final class ShortArrayCodeInput extends com.android.dx.io.instructions.BaseCodeCursor implements com.android.dx.io.instructions.CodeInput {
    private final short[] array;

    public ShortArrayCodeInput(short[] r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.array = r2
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "array == null"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.android.dx.io.instructions.CodeInput
    public boolean hasMore() {
            r2 = this;
            int r0 = r2.cursor()
            short[] r1 = r2.array
            int r1 = r1.length
            if (r0 >= r1) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // com.android.dx.io.instructions.CodeInput
    public int read() throws java.io.EOFException {
            r2 = this;
            short[] r0 = r2.array     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L11
            int r1 = r2.cursor()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L11
            short r0 = r0[r1]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L11
            r1 = 1
            r2.advance(r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L11
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            return r0
        L11:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // com.android.dx.io.instructions.CodeInput
    public int readInt() throws java.io.EOFException {
            r2 = this;
            int r0 = r2.read()
            int r1 = r2.read()
            int r1 = r1 << 16
            r0 = r0 | r1
            return r0
    }

    @Override // com.android.dx.io.instructions.CodeInput
    public long readLong() throws java.io.EOFException {
            r9 = this;
            int r0 = r9.read()
            long r0 = (long) r0
            int r2 = r9.read()
            long r2 = (long) r2
            int r4 = r9.read()
            long r4 = (long) r4
            int r6 = r9.read()
            long r6 = (long) r6
            r8 = 16
            long r2 = r2 << r8
            long r0 = r0 | r2
            r2 = 32
            long r2 = r4 << r2
            long r0 = r0 | r2
            r2 = 48
            long r2 = r6 << r2
            long r0 = r0 | r2
            return r0
    }
}
