package com.android.dx.io.instructions;

/* JADX INFO: loaded from: classes.dex */
public final class OneRegisterDecodedInstruction extends com.android.dx.io.instructions.DecodedInstruction {
    private final int a;

    public OneRegisterDecodedInstruction(com.android.dx.io.instructions.InstructionCodec r1, int r2, int r3, com.android.dx.io.IndexType r4, int r5, long r6, int r8) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0.a = r8
            return
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getA() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getRegisterCount() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public com.android.dx.io.instructions.DecodedInstruction withIndex(int r11) {
            r10 = this;
            com.android.dx.io.instructions.OneRegisterDecodedInstruction r9 = new com.android.dx.io.instructions.OneRegisterDecodedInstruction
            com.android.dx.io.instructions.InstructionCodec r1 = r10.getFormat()
            int r2 = r10.getOpcode()
            com.android.dx.io.IndexType r4 = r10.getIndexType()
            int r5 = r10.getTarget()
            long r6 = r10.getLiteral()
            int r8 = r10.a
            r0 = r9
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            return r9
    }
}
