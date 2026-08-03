package com.android.dx.ssa.back;

/* JADX INFO: loaded from: classes.dex */
public class IdenticalBlockCombiner {
    private final com.android.dx.rop.code.BasicBlockList blocks;
    private final com.android.dx.rop.code.BasicBlockList newBlocks;
    private final com.android.dx.rop.code.RopMethod ropMethod;

    public IdenticalBlockCombiner(com.android.dx.rop.code.RopMethod r1) {
            r0 = this;
            r0.<init>()
            r0.ropMethod = r1
            com.android.dx.rop.code.BasicBlockList r1 = r1.getBlocks()
            r0.blocks = r1
            com.android.dx.rop.code.BasicBlockList r1 = r1.getMutableCopy()
            r0.newBlocks = r1
            return
    }

    private void combineBlocks(int r10, com.android.dx.util.IntList r11) {
            r9 = this;
            int r0 = r11.size()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L36
            int r3 = r11.get(r2)
            com.android.dx.rop.code.BasicBlockList r4 = r9.blocks
            com.android.dx.rop.code.BasicBlock r4 = r4.labelToBlock(r3)
            com.android.dx.rop.code.RopMethod r5 = r9.ropMethod
            int r4 = r4.getLabel()
            com.android.dx.util.IntList r4 = r5.labelToPredecessors(r4)
            int r5 = r4.size()
            r6 = r1
        L21:
            if (r6 >= r5) goto L33
            com.android.dx.rop.code.BasicBlockList r7 = r9.newBlocks
            int r8 = r4.get(r6)
            com.android.dx.rop.code.BasicBlock r7 = r7.labelToBlock(r8)
            r9.replaceSucc(r7, r3, r10)
            int r6 = r6 + 1
            goto L21
        L33:
            int r2 = r2 + 1
            goto L6
        L36:
            return
    }

    private static boolean compareInsns(com.android.dx.rop.code.BasicBlock r0, com.android.dx.rop.code.BasicBlock r1) {
            com.android.dx.rop.code.InsnList r0 = r0.getInsns()
            com.android.dx.rop.code.InsnList r1 = r1.getInsns()
            boolean r0 = r0.contentEquals(r1)
            return r0
    }

    private void replaceSucc(com.android.dx.rop.code.BasicBlock r4, int r5, int r6) {
            r3 = this;
            com.android.dx.util.IntList r0 = r4.getSuccessors()
            com.android.dx.util.IntList r0 = r0.mutableCopy()
            int r1 = r0.indexOf(r5)
            r0.set(r1, r6)
            int r1 = r4.getPrimarySuccessor()
            if (r1 != r5) goto L16
            goto L17
        L16:
            r6 = r1
        L17:
            r0.setImmutable()
            com.android.dx.rop.code.BasicBlock r5 = new com.android.dx.rop.code.BasicBlock
            int r1 = r4.getLabel()
            com.android.dx.rop.code.InsnList r2 = r4.getInsns()
            r5.<init>(r1, r2, r0, r6)
            com.android.dx.rop.code.BasicBlockList r6 = r3.newBlocks
            int r4 = r4.getLabel()
            int r4 = r6.indexOfLabel(r4)
            r6.set(r4, r5)
            return
    }

    public com.android.dx.rop.code.RopMethod process() {
            r15 = this;
            com.android.dx.rop.code.BasicBlockList r0 = r15.blocks
            int r0 = r0.size()
            java.util.BitSet r1 = new java.util.BitSet
            com.android.dx.rop.code.BasicBlockList r2 = r15.blocks
            int r2 = r2.getMaxLabel()
            r1.<init>(r2)
            r2 = 0
            r3 = r2
        L13:
            r4 = 1
            if (r3 >= r0) goto L9a
            com.android.dx.rop.code.BasicBlockList r5 = r15.blocks
            com.android.dx.rop.code.BasicBlock r5 = r5.get(r3)
            int r6 = r5.getLabel()
            boolean r6 = r1.get(r6)
            if (r6 == 0) goto L28
            goto L96
        L28:
            com.android.dx.rop.code.RopMethod r6 = r15.ropMethod
            int r5 = r5.getLabel()
            com.android.dx.util.IntList r5 = r6.labelToPredecessors(r5)
            int r6 = r5.size()
            r7 = r2
        L37:
            if (r7 >= r6) goto L96
            int r8 = r5.get(r7)
            com.android.dx.rop.code.BasicBlockList r9 = r15.blocks
            com.android.dx.rop.code.BasicBlock r9 = r9.labelToBlock(r8)
            boolean r10 = r1.get(r8)
            if (r10 != 0) goto L93
            com.android.dx.util.IntList r10 = r9.getSuccessors()
            int r10 = r10.size()
            if (r10 > r4) goto L93
            com.android.dx.rop.code.Insn r10 = r9.getFirstInsn()
            com.android.dx.rop.code.Rop r10 = r10.getOpcode()
            int r10 = r10.getOpcode()
            r11 = 55
            if (r10 != r11) goto L64
            goto L93
        L64:
            com.android.dx.util.IntList r10 = new com.android.dx.util.IntList
            r10.<init>()
            int r11 = r7 + 1
        L6b:
            if (r11 >= r6) goto L90
            int r12 = r5.get(r11)
            com.android.dx.rop.code.BasicBlockList r13 = r15.blocks
            com.android.dx.rop.code.BasicBlock r13 = r13.labelToBlock(r12)
            com.android.dx.util.IntList r14 = r13.getSuccessors()
            int r14 = r14.size()
            if (r14 != r4) goto L8d
            boolean r13 = compareInsns(r9, r13)
            if (r13 == 0) goto L8d
            r10.add(r12)
            r1.set(r12)
        L8d:
            int r11 = r11 + 1
            goto L6b
        L90:
            r15.combineBlocks(r8, r10)
        L93:
            int r7 = r7 + 1
            goto L37
        L96:
            int r3 = r3 + 1
            goto L13
        L9a:
            int r0 = r0 - r4
        L9b:
            if (r0 < 0) goto Lb6
            com.android.dx.rop.code.BasicBlockList r2 = r15.newBlocks
            com.android.dx.rop.code.BasicBlock r2 = r2.get(r0)
            int r2 = r2.getLabel()
            boolean r2 = r1.get(r2)
            if (r2 == 0) goto Lb3
            com.android.dx.rop.code.BasicBlockList r2 = r15.newBlocks
            r3 = 0
            r2.set(r0, r3)
        Lb3:
            int r0 = r0 + (-1)
            goto L9b
        Lb6:
            com.android.dx.rop.code.BasicBlockList r0 = r15.newBlocks
            r0.shrinkToFit()
            com.android.dx.rop.code.BasicBlockList r0 = r15.newBlocks
            r0.setImmutable()
            com.android.dx.rop.code.RopMethod r0 = new com.android.dx.rop.code.RopMethod
            com.android.dx.rop.code.BasicBlockList r1 = r15.newBlocks
            com.android.dx.rop.code.RopMethod r2 = r15.ropMethod
            int r2 = r2.getFirstLabel()
            r0.<init>(r1, r2)
            return r0
    }
}
