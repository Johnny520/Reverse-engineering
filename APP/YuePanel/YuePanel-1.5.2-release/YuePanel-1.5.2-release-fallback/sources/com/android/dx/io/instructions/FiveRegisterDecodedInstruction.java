package com.android.dx.io.instructions;

/* JADX INFO: loaded from: classes.dex */
public final class FiveRegisterDecodedInstruction extends com.android.dx.io.instructions.DecodedInstruction {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public FiveRegisterDecodedInstruction(com.android.dx.io.instructions.InstructionCodec r1, int r2, int r3, com.android.dx.io.IndexType r4, int r5, long r6, int r8, int r9, int r10, int r11, int r12) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0.a = r8
            r0.b = r9
            r0.c = r10
            r0.d = r11
            r0.e = r12
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
    public int getD() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getE() {
            r1 = this;
            int r0 = r1.e
            return r0
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getRegisterCount() {
            r1 = this;
            r0 = 5
            return r0
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public com.android.dx.io.instructions.DecodedInstruction withIndex(int r15) {
            r14 = this;
            com.android.dx.io.instructions.FiveRegisterDecodedInstruction r13 = new com.android.dx.io.instructions.FiveRegisterDecodedInstruction
            com.android.dx.io.instructions.InstructionCodec r1 = r14.getFormat()
            int r2 = r14.getOpcode()
            com.android.dx.io.IndexType r4 = r14.getIndexType()
            int r5 = r14.getTarget()
            long r6 = r14.getLiteral()
            int r8 = r14.a
            int r9 = r14.b
            int r10 = r14.c
            int r11 = r14.d
            int r12 = r14.e
            r0 = r13
            r3 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9, r10, r11, r12)
            return r13
    }
}
