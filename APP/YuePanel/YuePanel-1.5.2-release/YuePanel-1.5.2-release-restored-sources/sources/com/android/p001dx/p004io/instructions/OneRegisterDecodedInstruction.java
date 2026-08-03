package com.android.p001dx.p004io.instructions;

import com.android.p001dx.p004io.IndexType;

/* JADX INFO: loaded from: classes.dex */
public final class OneRegisterDecodedInstruction extends DecodedInstruction {

    /* JADX INFO: renamed from: a */
    private final int f4029a;

    public OneRegisterDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, long j, int i4) {
        super(instructionCodec, i, i2, indexType, i3, j);
        this.f4029a = i4;
    }

    @Override // com.android.p001dx.p004io.instructions.DecodedInstruction
    public int getA() {
        return this.f4029a;
    }

    @Override // com.android.p001dx.p004io.instructions.DecodedInstruction
    public int getRegisterCount() {
        return 1;
    }

    @Override // com.android.p001dx.p004io.instructions.DecodedInstruction
    public DecodedInstruction withIndex(int i) {
        return new OneRegisterDecodedInstruction(getFormat(), getOpcode(), i, getIndexType(), getTarget(), getLiteral(), this.f4029a);
    }
}
