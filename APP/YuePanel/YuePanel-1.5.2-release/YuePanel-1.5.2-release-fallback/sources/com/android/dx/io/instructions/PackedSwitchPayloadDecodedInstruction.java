package com.android.dx.io.instructions;

/* JADX INFO: loaded from: classes.dex */
public final class PackedSwitchPayloadDecodedInstruction extends com.android.dx.io.instructions.DecodedInstruction {
    private final int firstKey;
    private final int[] targets;

    public PackedSwitchPayloadDecodedInstruction(com.android.dx.io.instructions.InstructionCodec r9, int r10, int r11, int[] r12) {
            r8 = this;
            r5 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.firstKey = r11
            r8.targets = r12
            return
    }

    public int getFirstKey() {
            r1 = this;
            int r0 = r1.firstKey
            return r0
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getRegisterCount() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int[] getTargets() {
            r1 = this;
            int[] r0 = r1.targets
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
