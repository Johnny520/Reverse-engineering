package com.android.p001dx.p004io.instructions;

import com.android.p001dx.p004io.IndexType;

/* JADX INFO: loaded from: classes.dex */
public final class TwoRegisterDecodedInstruction extends DecodedInstruction {

    /* JADX INFO: renamed from: a */
    private final int f4034a;

    /* JADX INFO: renamed from: b */
    private final int f4035b;

    public TwoRegisterDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, long j, int i4, int i5) {
        super(instructionCodec, i, i2, indexType, i3, j);
        this.f4034a = i4;
        this.f4035b = i5;
    }

    @Override // com.android.p001dx.p004io.instructions.DecodedInstruction
    public int getA() {
        return this.f4034a;
    }

    @Override // com.android.p001dx.p004io.instructions.DecodedInstruction
    public int getB() {
        return this.f4035b;
    }

    @Override // com.android.p001dx.p004io.instructions.DecodedInstruction
    public int getRegisterCount() {
        return 2;
    }

    @Override // com.android.p001dx.p004io.instructions.DecodedInstruction
    public DecodedInstruction withIndex(int i) {
        return new TwoRegisterDecodedInstruction(getFormat(), getOpcode(), i, getIndexType(), getTarget(), getLiteral(), this.f4034a, this.f4035b);
    }
}
