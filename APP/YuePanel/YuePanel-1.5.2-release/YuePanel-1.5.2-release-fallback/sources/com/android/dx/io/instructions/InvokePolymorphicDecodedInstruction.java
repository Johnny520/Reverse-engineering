package com.android.dx.io.instructions;

/* JADX INFO: loaded from: classes.dex */
public class InvokePolymorphicDecodedInstruction extends com.android.dx.io.instructions.DecodedInstruction {
    private final int protoIndex;
    private final int[] registers;

    public InvokePolymorphicDecodedInstruction(com.android.dx.io.instructions.InstructionCodec r9, int r10, int r11, com.android.dx.io.IndexType r12, int r13, int[] r14) {
            r8 = this;
            r5 = 0
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            short r9 = (short) r13
            if (r13 != r9) goto L13
            r8.protoIndex = r13
            r8.registers = r14
            return
        L13:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "protoIndex doesn't fit in a short: "
            r10.append(r11)
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getC() {
            r3 = this;
            int[] r0 = r3.registers
            int r1 = r0.length
            r2 = 0
            if (r1 <= 0) goto L8
            r2 = r0[r2]
        L8:
            return r2
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getD() {
            r3 = this;
            int[] r0 = r3.registers
            int r1 = r0.length
            r2 = 1
            if (r1 <= r2) goto L9
            r0 = r0[r2]
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getE() {
            r3 = this;
            int[] r0 = r3.registers
            int r1 = r0.length
            r2 = 2
            if (r1 <= r2) goto L9
            r0 = r0[r2]
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public int getF() {
            r3 = this;
            int[] r0 = r3.registers
            int r1 = r0.length
            r2 = 3
            if (r1 <= r2) goto L9
            r0 = r0[r2]
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public int getG() {
            r3 = this;
            int[] r0 = r3.registers
            int r1 = r0.length
            r2 = 4
            if (r1 <= r2) goto L9
            r0 = r0[r2]
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public short getProtoIndex() {
            r1 = this;
            int r0 = r1.protoIndex
            short r0 = (short) r0
            return r0
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getRegisterCount() {
            r1 = this;
            int[] r0 = r1.registers
            int r0 = r0.length
            return r0
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public com.android.dx.io.instructions.DecodedInstruction withIndex(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "use withProtoIndex to update both the method and proto indices for invoke-polymorphic"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public com.android.dx.io.instructions.DecodedInstruction withProtoIndex(int r9, int r10) {
            r8 = this;
            com.android.dx.io.instructions.InvokePolymorphicDecodedInstruction r7 = new com.android.dx.io.instructions.InvokePolymorphicDecodedInstruction
            com.android.dx.io.instructions.InstructionCodec r1 = r8.getFormat()
            int r2 = r8.getOpcode()
            com.android.dx.io.IndexType r4 = r8.getIndexType()
            int[] r6 = r8.registers
            r0 = r7
            r3 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }
}
