package com.android.dx.io.instructions;

/* JADX INFO: loaded from: classes.dex */
public final class ZeroRegisterDecodedInstruction extends com.android.dx.io.instructions.DecodedInstruction {
    public ZeroRegisterDecodedInstruction(com.android.dx.io.instructions.InstructionCodec r1, int r2, int r3, com.android.dx.io.IndexType r4, int r5, long r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getRegisterCount() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public com.android.dx.io.instructions.DecodedInstruction withIndex(int r10) {
            r9 = this;
            com.android.dx.io.instructions.ZeroRegisterDecodedInstruction r8 = new com.android.dx.io.instructions.ZeroRegisterDecodedInstruction
            com.android.dx.io.instructions.InstructionCodec r1 = r9.getFormat()
            int r2 = r9.getOpcode()
            com.android.dx.io.IndexType r4 = r9.getIndexType()
            int r5 = r9.getTarget()
            long r6 = r9.getLiteral()
            r0 = r8
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r8
    }
}
