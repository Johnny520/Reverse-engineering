package com.android.p002dx.p005io.instructions;

import com.android.p002dx.p005io.IndexType;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class OneRegisterDecodedInstruction extends DecodedInstruction {

    /* JADX INFO: renamed from: a */
    private final int f42a;

    public OneRegisterDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, long j, int i4) {
        super(instructionCodec, i, i2, indexType, i3, j);
        this.f42a = i4;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public int getA() {
        return this.f42a;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public int getRegisterCount() {
        return 1;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public DecodedInstruction withIndex(int i) {
        return new OneRegisterDecodedInstruction(getFormat(), getOpcode(), i, getIndexType(), getTarget(), getLiteral(), this.f42a);
    }
}
