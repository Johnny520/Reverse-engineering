package com.android.p002dx.p005io.instructions;

import com.android.p002dx.p005io.IndexType;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class InvokePolymorphicDecodedInstruction extends DecodedInstruction {
    private final int protoIndex;
    private final int[] registers;

    public InvokePolymorphicDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, IndexType indexType, int i3, int[] iArr) {
        super(instructionCodec, i, i2, indexType, 0, 0L);
        if (i3 != ((short) i3)) {
            C6755.m11869(AbstractC7012.m12147(i3, "protoIndex doesn't fit in a short: "));
            throw null;
        }
        this.protoIndex = i3;
        this.registers = iArr;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public int getC() {
        int[] iArr = this.registers;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return 0;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public int getD() {
        int[] iArr = this.registers;
        if (iArr.length > 1) {
            return iArr[1];
        }
        return 0;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public int getE() {
        int[] iArr = this.registers;
        if (iArr.length > 2) {
            return iArr[2];
        }
        return 0;
    }

    public int getF() {
        int[] iArr = this.registers;
        if (iArr.length > 3) {
            return iArr[3];
        }
        return 0;
    }

    public int getG() {
        int[] iArr = this.registers;
        if (iArr.length > 4) {
            return iArr[4];
        }
        return 0;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public short getProtoIndex() {
        return (short) this.protoIndex;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public int getRegisterCount() {
        return this.registers.length;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public DecodedInstruction withIndex(int i) {
        throw new UnsupportedOperationException("use withProtoIndex to update both the method and proto indices for invoke-polymorphic");
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public DecodedInstruction withProtoIndex(int i, int i2) {
        return new InvokePolymorphicDecodedInstruction(getFormat(), getOpcode(), i, getIndexType(), i2, this.registers);
    }
}
