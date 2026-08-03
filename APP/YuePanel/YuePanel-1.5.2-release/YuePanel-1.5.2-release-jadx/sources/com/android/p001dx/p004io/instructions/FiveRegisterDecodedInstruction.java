package com.android.p001dx.p004io.instructions;

import com.android.p001dx.p004io.IndexType;

/* JADX INFO: loaded from: classes.dex */
public final class FiveRegisterDecodedInstruction extends DecodedInstruction {

    /* JADX INFO: renamed from: a */
    private final int f4019a;

    /* JADX INFO: renamed from: b */
    private final int f4020b;

    /* JADX INFO: renamed from: c */
    private final int f4021c;

    /* JADX INFO: renamed from: d */
    private final int f4022d;

    /* JADX INFO: renamed from: e */
    private final int f4023e;

    public FiveRegisterDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, long j, int i4, int i5, int i6, int i7, int i8) {
        super(instructionCodec, i, i2, indexType, i3, j);
        this.f4019a = i4;
        this.f4020b = i5;
        this.f4021c = i6;
        this.f4022d = i7;
        this.f4023e = i8;
    }

    @Override // com.android.p001dx.p004io.instructions.DecodedInstruction
    public int getA() {
        return this.f4019a;
    }

    @Override // com.android.p001dx.p004io.instructions.DecodedInstruction
    public int getB() {
        return this.f4020b;
    }

    @Override // com.android.p001dx.p004io.instructions.DecodedInstruction
    public int getC() {
        return this.f4021c;
    }

    @Override // com.android.p001dx.p004io.instructions.DecodedInstruction
    public int getD() {
        return this.f4022d;
    }

    @Override // com.android.p001dx.p004io.instructions.DecodedInstruction
    public int getE() {
        return this.f4023e;
    }

    @Override // com.android.p001dx.p004io.instructions.DecodedInstruction
    public int getRegisterCount() {
        return 5;
    }

    @Override // com.android.p001dx.p004io.instructions.DecodedInstruction
    public DecodedInstruction withIndex(int i) {
        return new FiveRegisterDecodedInstruction(getFormat(), getOpcode(), i, getIndexType(), getTarget(), getLiteral(), this.f4019a, this.f4020b, this.f4021c, this.f4022d, this.f4023e);
    }
}
