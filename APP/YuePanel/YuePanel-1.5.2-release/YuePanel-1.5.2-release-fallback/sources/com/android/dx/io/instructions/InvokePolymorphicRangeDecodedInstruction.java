package com.android.dx.io.instructions;

/* JADX INFO: loaded from: classes.dex */
public class InvokePolymorphicRangeDecodedInstruction extends com.android.dx.io.instructions.DecodedInstruction {
    private final int c;
    private final int protoIndex;
    private final int registerCount;

    public InvokePolymorphicRangeDecodedInstruction(com.android.dx.io.instructions.InstructionCodec r9, int r10, int r11, com.android.dx.io.IndexType r12, int r13, int r14, int r15) {
            r8 = this;
            r5 = 0
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            short r9 = (short) r15
            if (r15 != r9) goto L15
            r8.c = r13
            r8.registerCount = r14
            r8.protoIndex = r15
            return
        L15:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "protoIndex doesn't fit in a short: "
            r10.append(r11)
            r10.append(r15)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getC() {
            r1 = this;
            int r0 = r1.c
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
            int r0 = r1.registerCount
            return r0
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public com.android.dx.io.instructions.DecodedInstruction withIndex(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "use withProtoIndex to update both the method and proto indices for invoke-polymorphic/range"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public com.android.dx.io.instructions.DecodedInstruction withProtoIndex(int r10, int r11) {
            r9 = this;
            com.android.dx.io.instructions.InvokePolymorphicRangeDecodedInstruction r8 = new com.android.dx.io.instructions.InvokePolymorphicRangeDecodedInstruction
            com.android.dx.io.instructions.InstructionCodec r1 = r9.getFormat()
            int r2 = r9.getOpcode()
            com.android.dx.io.IndexType r4 = r9.getIndexType()
            int r5 = r9.c
            int r6 = r9.registerCount
            r0 = r8
            r3 = r10
            r7 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }
}
