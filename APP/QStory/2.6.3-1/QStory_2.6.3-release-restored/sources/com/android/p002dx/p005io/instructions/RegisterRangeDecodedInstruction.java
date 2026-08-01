package com.android.p002dx.p005io.instructions;

import com.android.p002dx.p005io.IndexType;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RegisterRangeDecodedInstruction extends DecodedInstruction {

    /* JADX INFO: renamed from: a */
    private final int f43a;
    private final int registerCount;

    public RegisterRangeDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, long j, int i4, int i5) {
        super(instructionCodec, i, i2, indexType, i3, j);
        this.f43a = i4;
        this.registerCount = i5;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public int getA() {
        return this.f43a;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public int getRegisterCount() {
        return this.registerCount;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public DecodedInstruction withIndex(int i) {
        return new RegisterRangeDecodedInstruction(getFormat(), getOpcode(), i, getIndexType(), getTarget(), getLiteral(), this.f43a, this.registerCount);
    }
}
