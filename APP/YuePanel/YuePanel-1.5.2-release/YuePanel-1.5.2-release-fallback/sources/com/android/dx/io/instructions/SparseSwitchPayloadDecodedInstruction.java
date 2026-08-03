package com.android.dx.io.instructions;

/* JADX INFO: loaded from: classes.dex */
public final class SparseSwitchPayloadDecodedInstruction extends com.android.dx.io.instructions.DecodedInstruction {
    private final int[] keys;
    private final int[] targets;

    public SparseSwitchPayloadDecodedInstruction(com.android.dx.io.instructions.InstructionCodec r9, int r10, int[] r11, int[] r12) {
            r8 = this;
            r5 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            int r9 = r11.length
            int r10 = r12.length
            if (r9 != r10) goto L14
            r8.keys = r11
            r8.targets = r12
            return
        L14:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "keys/targets length mismatch"
            r9.<init>(r10)
            throw r9
    }

    public int[] getKeys() {
            r1 = this;
            int[] r0 = r1.keys
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
