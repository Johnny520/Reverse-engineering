package com.android.p002dx.p005io.instructions;

import com.android.p002dx.p005io.IndexType;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreeRegisterDecodedInstruction extends DecodedInstruction {

    /* JADX INFO: renamed from: a */
    private final int f44a;

    /* JADX INFO: renamed from: b */
    private final int f45b;

    /* JADX INFO: renamed from: c */
    private final int f46c;

    public ThreeRegisterDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, long j, int i4, int i5, int i6) {
        super(instructionCodec, i, i2, indexType, i3, j);
        this.f44a = i4;
        this.f45b = i5;
        this.f46c = i6;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public int getA() {
        return this.f44a;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public int getB() {
        return this.f45b;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public int getC() {
        return this.f46c;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public int getRegisterCount() {
        return 3;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public DecodedInstruction withIndex(int i) {
        return new ThreeRegisterDecodedInstruction(getFormat(), getOpcode(), i, getIndexType(), getTarget(), getLiteral(), this.f44a, this.f45b, this.f46c);
    }
}
