package com.android.p001dx.p004io.instructions;

import com.android.p001dx.p004io.IndexType;

/* JADX INFO: loaded from: classes.dex */
public final class FourRegisterDecodedInstruction extends DecodedInstruction {

    /* JADX INFO: renamed from: a */
    private final int f4024a;

    /* JADX INFO: renamed from: b */
    private final int f4025b;

    /* JADX INFO: renamed from: c */
    private final int f4026c;

    /* JADX INFO: renamed from: d */
    private final int f4027d;

    public FourRegisterDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, long j, int i4, int i5, int i6, int i7) {
        super(instructionCodec, i, i2, indexType, i3, j);
        this.f4024a = i4;
        this.f4025b = i5;
        this.f4026c = i6;
        this.f4027d = i7;
    }

    @Override // com.android.p001dx.p004io.instructions.DecodedInstruction
    public int getA() {
        return this.f4024a;
    }

    @Override // com.android.p001dx.p004io.instructions.DecodedInstruction
    public int getB() {
        return this.f4025b;
    }

    @Override // com.android.p001dx.p004io.instructions.DecodedInstruction
    public int getC() {
        return this.f4026c;
    }

    @Override // com.android.p001dx.p004io.instructions.DecodedInstruction
    public int getD() {
        return this.f4027d;
    }

    @Override // com.android.p001dx.p004io.instructions.DecodedInstruction
    public int getRegisterCount() {
        return 4;
    }

    @Override // com.android.p001dx.p004io.instructions.DecodedInstruction
    public DecodedInstruction withIndex(int i) {
        return new FourRegisterDecodedInstruction(getFormat(), getOpcode(), i, getIndexType(), getTarget(), getLiteral(), this.f4024a, this.f4025b, this.f4026c, this.f4027d);
    }
}
