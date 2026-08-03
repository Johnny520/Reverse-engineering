package com.android.dx.io.instructions;

/* JADX INFO: loaded from: classes.dex */
public final class ThreeRegisterDecodedInstruction extends com.android.dx.io.instructions.DecodedInstruction {
    private final int a;
    private final int b;
    private final int c;

    public ThreeRegisterDecodedInstruction(com.android.dx.io.instructions.InstructionCodec r1, int r2, int r3, com.android.dx.io.IndexType r4, int r5, long r6, int r8, int r9, int r10) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0.a = r8
            r0.b = r9
            r0.c = r10
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
    public int getC() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getRegisterCount() {
            r1 = this;
            r0 = 3
            return r0
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public com.android.dx.io.instructions.DecodedInstruction withIndex(int r13) {
            r12 = this;
            com.android.dx.io.instructions.ThreeRegisterDecodedInstruction r11 = new com.android.dx.io.instructions.ThreeRegisterDecodedInstruction
            com.android.dx.io.instructions.InstructionCodec r1 = r12.getFormat()
            int r2 = r12.getOpcode()
            com.android.dx.io.IndexType r4 = r12.getIndexType()
            int r5 = r12.getTarget()
            long r6 = r12.getLiteral()
            int r8 = r12.a
            int r9 = r12.b
            int r10 = r12.c
            r0 = r11
            r3 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9, r10)
            return r11
    }
}
