package com.android.p002dx.p005io.instructions;

import com.android.p002dx.p005io.IndexType;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class InvokePolymorphicRangeDecodedInstruction extends DecodedInstruction {

    /* JADX INFO: renamed from: c */
    private final int f41c;
    private final int protoIndex;
    private final int registerCount;

    public InvokePolymorphicRangeDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, int i4, int i5) {
        super(instructionCodec, i, i2, indexType, 0, 0L);
        if (i5 != ((short) i5)) {
            C6755.m11869(AbstractC7012.m12147(i5, "protoIndex doesn't fit in a short: "));
            throw null;
        }
        this.f41c = i3;
        this.registerCount = i4;
        this.protoIndex = i5;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public int getC() {
        return this.f41c;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public short getProtoIndex() {
        return (short) this.protoIndex;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public int getRegisterCount() {
        return this.registerCount;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public DecodedInstruction withIndex(int i) {
        throw new UnsupportedOperationException("use withProtoIndex to update both the method and proto indices for invoke-polymorphic/range");
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public DecodedInstruction withProtoIndex(int i, int i2) {
        return new InvokePolymorphicRangeDecodedInstruction(getFormat(), getOpcode(), i, getIndexType(), this.f41c, this.registerCount, i2);
    }
}
