package com.android.dx.io.instructions;

/* JADX INFO: loaded from: classes.dex */
public final class TwoRegisterDecodedInstruction extends com.android.dx.io.instructions.DecodedInstruction {
    private final int a;
    private final int b;

    public TwoRegisterDecodedInstruction(com.android.dx.io.instructions.InstructionCodec r1, int r2, int r3, com.android.dx.io.IndexType r4, int r5, long r6, int r8, int r9) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0.a = r8
            r0.b = r9
            return
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getA() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getB() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getRegisterCount() {
            r1 = this;
            r0 = 2
            return r0
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public com.android.dx.io.instructions.DecodedInstruction withIndex(int r12) {
            r11 = this;
            com.android.dx.io.instructions.TwoRegisterDecodedInstruction r10 = new com.android.dx.io.instructions.TwoRegisterDecodedInstruction
            com.android.dx.io.instructions.InstructionCodec r1 = r11.getFormat()
            int r2 = r11.getOpcode()
            com.android.dx.io.IndexType r4 = r11.getIndexType()
            int r5 = r11.getTarget()
            long r6 = r11.getLiteral()
            int r8 = r11.a
            int r9 = r11.b
            r0 = r10
            r3 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9)
            return r10
    }
}
