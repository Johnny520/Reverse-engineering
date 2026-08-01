package com.android.p002dx.p005io.instructions;

import com.android.p002dx.p005io.IndexType;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class FourRegisterDecodedInstruction extends DecodedInstruction {

    /* JADX INFO: renamed from: a */
    private final int f37a;

    /* JADX INFO: renamed from: b */
    private final int f38b;

    /* JADX INFO: renamed from: c */
    private final int f39c;

    /* JADX INFO: renamed from: d */
    private final int f40d;

    public FourRegisterDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, long j, int i4, int i5, int i6, int i7) {
        super(instructionCodec, i, i2, indexType, i3, j);
        this.f37a = i4;
        this.f38b = i5;
        this.f39c = i6;
        this.f40d = i7;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public int getA() {
        return this.f37a;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public int getB() {
        return this.f38b;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public int getC() {
        return this.f39c;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public int getD() {
        return this.f40d;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public int getRegisterCount() {
        return 4;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public DecodedInstruction withIndex(int i) {
        return new FourRegisterDecodedInstruction(getFormat(), getOpcode(), i, getIndexType(), getTarget(), getLiteral(), this.f37a, this.f38b, this.f39c, this.f40d);
    }
}
