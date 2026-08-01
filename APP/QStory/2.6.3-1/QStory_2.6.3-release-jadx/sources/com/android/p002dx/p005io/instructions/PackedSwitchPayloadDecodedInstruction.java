package com.android.p002dx.p005io.instructions;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class PackedSwitchPayloadDecodedInstruction extends DecodedInstruction {
    private final int firstKey;
    private final int[] targets;

    public PackedSwitchPayloadDecodedInstruction(InstructionCodec instructionCodec, int i, int i2, int[] iArr) {
        super(instructionCodec, i, 0, null, 0, 0L);
        this.firstKey = i2;
        this.targets = iArr;
    }

    public int getFirstKey() {
        return this.firstKey;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public int getRegisterCount() {
        return 0;
    }

    public int[] getTargets() {
        return this.targets;
    }

    @Override // com.android.p002dx.p005io.instructions.DecodedInstruction
    public DecodedInstruction withIndex(int i) {
        throw new UnsupportedOperationException("no index in instruction");
    }
}
