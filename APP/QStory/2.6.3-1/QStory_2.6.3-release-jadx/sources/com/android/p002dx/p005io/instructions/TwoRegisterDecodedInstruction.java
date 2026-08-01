package com.android.p002dx.p005io.instructions;

import com.android.p002dx.p005io.IndexType;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class TwoRegisterDecodedInstruction extends DecodedInstruction {

    /* JADX INFO: renamed from: a */
    private final int f47a;

    /* JADX INFO: renamed from: b */
    private final int f48b;

    public TwoRegisterDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, long j, int i4, int i5) {
        super(instructionCodec, i, i2, indexType, i3, j);
        this.f47a = i4;
        this.f48b = i5;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public int getA() {
        return this.f47a;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public int getB() {
        return this.f48b;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public int getRegisterCount() {
        return 2;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public DecodedInstruction withIndex(int i) {
        return new TwoRegisterDecodedInstruction(getFormat(), getOpcode(), i, getIndexType(), getTarget(), getLiteral(), this.f47a, this.f48b);
    }
}
