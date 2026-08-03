package com.android.p001dx.dex.code;

import com.android.p001dx.rop.code.BasicBlock;
import com.android.p001dx.rop.code.BasicBlockList;
import com.android.p001dx.rop.code.RopMethod;
import com.android.p001dx.rop.code.SourcePosition;

/* JADX INFO: loaded from: classes.dex */
public final class BlockAddresses {
    private final CodeAddress[] ends;
    private final CodeAddress[] lasts;
    private final CodeAddress[] starts;

    public BlockAddresses(RopMethod ropMethod) {
        int maxLabel = ropMethod.getBlocks().getMaxLabel();
        this.starts = new CodeAddress[maxLabel];
        this.lasts = new CodeAddress[maxLabel];
        this.ends = new CodeAddress[maxLabel];
        setupArrays(ropMethod);
    }

    private void setupArrays(RopMethod ropMethod) {
        BasicBlockList blocks = ropMethod.getBlocks();
        int size = blocks.size();
        for (int i = 0; i < size; i++) {
            BasicBlock basicBlock = blocks.get(i);
            int label = basicBlock.getLabel();
            this.starts[label] = new CodeAddress(basicBlock.getInsns().get(0).getPosition());
            SourcePosition position = basicBlock.getLastInsn().getPosition();
            this.lasts[label] = new CodeAddress(position);
            this.ends[label] = new CodeAddress(position);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CodeAddress getEnd(BasicBlock basicBlock) {
        return this.ends[basicBlock.getLabel()];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CodeAddress getLast(BasicBlock basicBlock) {
        return this.lasts[basicBlock.getLabel()];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CodeAddress getStart(BasicBlock basicBlock) {
        return this.starts[basicBlock.getLabel()];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public CodeAddress getEnd(int i) {
        return this.ends[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public CodeAddress getLast(int i) {
        return this.lasts[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public CodeAddress getStart(int i) {
        return this.starts[i];
    }
}
