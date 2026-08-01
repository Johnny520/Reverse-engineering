package com.android.dx.io.instructions;

import com.android.dx.io.IndexType;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class OneRegisterDecodedInstruction extends DecodedInstruction {
    private final int a;

    public OneRegisterDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, long j, int i4) {
        super(instructionCodec, i, i2, indexType, i3, j);
        this.a = i4;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getA() {
        return this.a;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public int getRegisterCount() {
        return 1;
    }

    @Override // com.android.dx.io.instructions.DecodedInstruction
    public DecodedInstruction withIndex(int i) {
        return new OneRegisterDecodedInstruction(getFormat(), getOpcode(), i, getIndexType(), getTarget(), getLiteral(), this.a);
    }
}
