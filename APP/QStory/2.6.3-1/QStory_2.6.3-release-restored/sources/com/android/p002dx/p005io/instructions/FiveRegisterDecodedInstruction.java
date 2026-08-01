package com.android.p002dx.p005io.instructions;

import com.android.p002dx.p005io.IndexType;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class FiveRegisterDecodedInstruction extends DecodedInstruction {

    /* JADX INFO: renamed from: a */
    private final int f32a;

    /* JADX INFO: renamed from: b */
    private final int f33b;

    /* JADX INFO: renamed from: c */
    private final int f34c;

    /* JADX INFO: renamed from: d */
    private final int f35d;

    /* JADX INFO: renamed from: e */
    private final int f36e;

    public FiveRegisterDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, long j, int i4, int i5, int i6, int i7, int i8) {
        super(instructionCodec, i, i2, indexType, i3, j);
        this.f32a = i4;
        this.f33b = i5;
        this.f34c = i6;
        this.f35d = i7;
        this.f36e = i8;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public int getA() {
        return this.f32a;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public int getB() {
        return this.f33b;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public int getC() {
        return this.f34c;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public int getD() {
        return this.f35d;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public int getE() {
        return this.f36e;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public int getRegisterCount() {
        return 5;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public DecodedInstruction withIndex(int i) {
        return new FiveRegisterDecodedInstruction(getFormat(), getOpcode(), i, getIndexType(), getTarget(), getLiteral(), this.f32a, this.f33b, this.f34c, this.f35d, this.f36e);
    }
}
