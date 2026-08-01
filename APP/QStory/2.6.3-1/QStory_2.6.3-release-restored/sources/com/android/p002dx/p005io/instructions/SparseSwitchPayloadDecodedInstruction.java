package com.android.p002dx.p005io.instructions;

import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class SparseSwitchPayloadDecodedInstruction extends DecodedInstruction {
    private final int[] keys;
    private final int[] targets;

    public SparseSwitchPayloadDecodedInstruction(InstructionCodec instructionCodec, int i, int[] iArr, int[] iArr2) {
        super(instructionCodec, i, 0, null, 0, 0L);
        if (iArr.length != iArr2.length) {
            C6755.m11869("keys/targets length mismatch");
            throw null;
        }
        this.keys = iArr;
        this.targets = iArr2;
    }

    public int[] getKeys() {
        return this.keys;
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
