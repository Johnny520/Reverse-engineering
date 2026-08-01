package com.android.dx.rop.code;

import androidx.profileinstaller.AbstractC2442;
import bsh.C2632;
import com.android.dx.util.IntList;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RopMethod {
    private final BasicBlockList blocks;
    private IntList exitPredecessors;
    private final int firstLabel;
    private IntList[] predecessors;

    public RopMethod(BasicBlockList basicBlockList, int i) {
        if (basicBlockList == null) {
            C2632.m5298("blocks == null");
            throw null;
        }
        if (i < 0) {
            C5919.m11249("firstLabel < 0");
            throw null;
        }
        this.blocks = basicBlockList;
        this.firstLabel = i;
        this.predecessors = null;
        this.exitPredecessors = null;
    }

    private void calcPredecessors() {
        int maxLabel = this.blocks.getMaxLabel();
        IntList[] intListArr = new IntList[maxLabel];
        IntList intList = new IntList(10);
        int size = this.blocks.size();
        for (int i = 0; i < size; i++) {
            BasicBlock basicBlock = this.blocks.get(i);
            int label = basicBlock.getLabel();
            IntList successors = basicBlock.getSuccessors();
            int size2 = successors.size();
            if (size2 == 0) {
                intList.add(label);
            } else {
                for (int i2 = 0; i2 < size2; i2++) {
                    int i3 = successors.get(i2);
                    IntList intList2 = intListArr[i3];
                    if (intList2 == null) {
                        intList2 = new IntList(10);
                        intListArr[i3] = intList2;
                    }
                    intList2.add(label);
                }
            }
        }
        for (int i4 = 0; i4 < maxLabel; i4++) {
            IntList intList3 = intListArr[i4];
            if (intList3 != null) {
                intList3.sort();
                intList3.setImmutable();
            }
        }
        intList.sort();
        intList.setImmutable();
        int i5 = this.firstLabel;
        if (intListArr[i5] == null) {
            intListArr[i5] = IntList.EMPTY;
        }
        this.predecessors = intListArr;
        this.exitPredecessors = intList;
    }

    public BasicBlockList getBlocks() {
        return this.blocks;
    }

    public IntList getExitPredecessors() {
        if (this.exitPredecessors == null) {
            calcPredecessors();
        }
        return this.exitPredecessors;
    }

    public int getFirstLabel() {
        return this.firstLabel;
    }

    public IntList labelToPredecessors(int i) {
        if (this.exitPredecessors == null) {
            calcPredecessors();
        }
        IntList intList = this.predecessors[i];
        if (intList != null) {
            return intList;
        }
        C2632.m5294(AbstractC2442.m4550(new StringBuilder("no such block: "), i));
        return null;
    }

    public RopMethod withRegisterOffset(int i) {
        RopMethod ropMethod = new RopMethod(this.blocks.withRegisterOffset(i), this.firstLabel);
        IntList intList = this.exitPredecessors;
        if (intList != null) {
            ropMethod.exitPredecessors = intList;
            ropMethod.predecessors = this.predecessors;
        }
        return ropMethod;
    }
}
