package com.android.dx.io.instructions;

/* JADX INFO: loaded from: classes.dex */
public final class ShortArrayCodeOutput extends com.android.dx.io.instructions.BaseCodeCursor implements com.android.dx.io.instructions.CodeOutput {
    private final short[] array;

    public ShortArrayCodeOutput(int r2) {
            r1 = this;
            r1.<init>()
            if (r2 < 0) goto La
            short[] r2 = new short[r2]
            r1.array = r2
            return
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "maxSize < 0"
            r2.<init>(r0)
            throw r2
    }

    public short[] getArray() {
            r4 = this;
            int r0 = r4.cursor()
            short[] r1 = r4.array
            int r2 = r1.length
            if (r0 != r2) goto La
            return r1
        La:
            short[] r2 = new short[r0]
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r2, r3, r0)
            return r2
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void write(short r3) {
            r2 = this;
            short[] r0 = r2.array
            int r1 = r2.cursor()
            r0[r1] = r3
            r3 = 1
            r2.advance(r3)
            return
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void write(short r1, short r2) {
            r0 = this;
            r0.write(r1)
            r0.write(r2)
            return
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void write(short r1, short r2, short r3) {
            r0 = this;
            r0.write(r1)
            r0.write(r2)
            r0.write(r3)
            return
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void write(short r1, short r2, short r3, short r4) {
            r0 = this;
            r0.write(r1)
            r0.write(r2)
            r0.write(r3)
            r0.write(r4)
            return
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void write(short r1, short r2, short r3, short r4, short r5) {
            r0 = this;
            r0.write(r1)
            r0.write(r2)
            r0.write(r3)
            r0.write(r4)
            r0.write(r5)
            return
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void write(byte[] r8) {
            r7 = this;
            int r0 = r8.length
            r1 = 0
            r2 = 1
            r3 = r1
            r5 = r3
            r4 = r2
        L6:
            if (r3 >= r0) goto L1d
            r6 = r8[r3]
            if (r4 == 0) goto L11
            r4 = r6 & 255(0xff, float:3.57E-43)
            r5 = r4
            r4 = r1
            goto L1a
        L11:
            int r4 = r6 << 8
            r4 = r4 | r5
            short r5 = (short) r4
            r7.write(r5)
            r5 = r4
            r4 = r2
        L1a:
            int r3 = r3 + 1
            goto L6
        L1d:
            if (r4 != 0) goto L23
            short r8 = (short) r5
            r7.write(r8)
        L23:
            return
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void write(int[] r4) {
            r3 = this;
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Lc
            r2 = r4[r1]
            r3.writeInt(r2)
            int r1 = r1 + 1
            goto L2
        Lc:
            return
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void write(long[] r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Lc
            r2 = r5[r1]
            r4.writeLong(r2)
            int r1 = r1 + 1
            goto L2
        Lc:
            return
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void write(short[] r4) {
            r3 = this;
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Lc
            short r2 = r4[r1]
            r3.write(r2)
            int r1 = r1 + 1
            goto L2
        Lc:
            return
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void writeInt(int r2) {
            r1 = this;
            short r0 = (short) r2
            r1.write(r0)
            int r2 = r2 >> 16
            short r2 = (short) r2
            r1.write(r2)
            return
    }

    @Override // com.android.dx.io.instructions.CodeOutput
    public void writeLong(long r3) {
            r2 = this;
            int r0 = (int) r3
            short r0 = (short) r0
            r2.write(r0)
            r0 = 16
            long r0 = r3 >> r0
            int r0 = (int) r0
            short r0 = (short) r0
            r2.write(r0)
            r0 = 32
            long r0 = r3 >> r0
            int r0 = (int) r0
            short r0 = (short) r0
            r2.write(r0)
            r0 = 48
            long r3 = r3 >> r0
            int r3 = (int) r3
            short r3 = (short) r3
            r2.write(r3)
            return
    }
}
