package com.android.dx.io.instructions;

/* JADX INFO: loaded from: classes.dex */
public final class FillArrayDataPayloadDecodedInstruction extends com.android.dx.io.instructions.DecodedInstruction {
    private final java.lang.Object data;
    private final int elementWidth;
    private final int size;

    private FillArrayDataPayloadDecodedInstruction(com.android.dx.io.instructions.InstructionCodec r9, int r10, java.lang.Object r11, int r12, int r13) {
            r8 = this;
            r5 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.data = r11
            r8.size = r12
            r8.elementWidth = r13
            return
    }

    public FillArrayDataPayloadDecodedInstruction(com.android.dx.io.instructions.InstructionCodec r7, int r8, byte[] r9) {
            r6 = this;
            int r4 = r9.length
            r5 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public FillArrayDataPayloadDecodedInstruction(com.android.dx.io.instructions.InstructionCodec r7, int r8, int[] r9) {
            r6 = this;
            int r4 = r9.length
            r5 = 4
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public FillArrayDataPayloadDecodedInstruction(com.android.dx.io.instructions.InstructionCodec r7, int r8, long[] r9) {
            r6 = this;
            int r4 = r9.length
            r5 = 8
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public FillArrayDataPayloadDecodedInstruction(com.android.dx.io.instructions.InstructionCodec r7, int r8, short[] r9) {
            r6 = this;
            int r4 = r9.length
            r5 = 2
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public java.lang.Object getData() {
            r1 = this;
            java.lang.Object r0 = r1.data
            return r0
    }

    public short getElementWidthUnit() {
            r1 = this;
            int r0 = r1.elementWidth
            short r0 = (short) r0
            return r0
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getRegisterCount() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int getSize() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public com.android.dx.io.instructions.DecodedInstruction withIndex(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "no index in instruction"
            r2.<init>(r0)
            throw r2
    }
}
