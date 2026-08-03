package com.android.dx.ssa.back;

/* JADX INFO: loaded from: classes.dex */
public class SsaToRop {
    private static final boolean DEBUG = false;
    private final com.android.dx.ssa.back.InterferenceGraph interference;
    private final boolean minimizeRegisters;
    private final com.android.dx.ssa.SsaMethod ssaMeth;



    public static class PhiVisitor implements com.android.dx.ssa.PhiInsn.Visitor {
        private final java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> blocks;

        public PhiVisitor(java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r1) {
                r0 = this;
                r0.<init>()
                r0.blocks = r1
                return
        }

        @Override // com.android.dx.ssa.PhiInsn.Visitor
        public void visitPhiInsn(com.android.dx.ssa.PhiInsn r8) {
                r7 = this;
                com.android.dx.rop.code.RegisterSpecList r0 = r8.getSources()
                com.android.dx.rop.code.RegisterSpec r1 = r8.getResult()
                int r2 = r0.size()
                r3 = 0
            Ld:
                if (r3 >= r2) goto L25
                com.android.dx.rop.code.RegisterSpec r4 = r0.get(r3)
                java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r5 = r7.blocks
                int r6 = r8.predBlockIndexForSourcesIndex(r3)
                java.lang.Object r5 = r5.get(r6)
                com.android.dx.ssa.SsaBasicBlock r5 = (com.android.dx.ssa.SsaBasicBlock) r5
                r5.addMoveToEnd(r1, r4)
                int r3 = r3 + 1
                goto Ld
            L25:
                return
        }
    }

    private SsaToRop(com.android.dx.ssa.SsaMethod r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.minimizeRegisters = r2
            r0.ssaMeth = r1
            com.android.dx.ssa.back.InterferenceGraph r1 = com.android.dx.ssa.back.LivenessAnalyzer.constructInterferenceGraph(r1)
            r0.interference = r1
            return
    }

    public static /* synthetic */ com.android.dx.ssa.SsaMethod access$000(com.android.dx.ssa.back.SsaToRop r0) {
            com.android.dx.ssa.SsaMethod r0 = r0.ssaMeth
            return r0
    }

    private com.android.dx.rop.code.RopMethod convert() {
            r4 = this;
            com.android.dx.ssa.back.FirstFitLocalCombiningAllocator r0 = new com.android.dx.ssa.back.FirstFitLocalCombiningAllocator
            com.android.dx.ssa.SsaMethod r1 = r4.ssaMeth
            com.android.dx.ssa.back.InterferenceGraph r2 = r4.interference
            boolean r3 = r4.minimizeRegisters
            r0.<init>(r1, r2, r3)
            com.android.dx.ssa.RegisterMapper r1 = r0.allocateRegisters()
            com.android.dx.ssa.SsaMethod r2 = r4.ssaMeth
            r2.setBackMode()
            com.android.dx.ssa.SsaMethod r2 = r4.ssaMeth
            r2.mapRegisters(r1)
            r4.removePhiFunctions()
            boolean r0 = r0.wantsParamsMovedHigh()
            if (r0 == 0) goto L25
            r4.moveParametersToHighRegisters()
        L25:
            r4.removeEmptyGotos()
            com.android.dx.rop.code.RopMethod r0 = new com.android.dx.rop.code.RopMethod
            com.android.dx.rop.code.BasicBlockList r1 = r4.convertBasicBlocks()
            com.android.dx.ssa.SsaMethod r2 = r4.ssaMeth
            int r3 = r2.getEntryBlockIndex()
            int r2 = r2.blockIndexToRopLabel(r3)
            r0.<init>(r1, r2)
            com.android.dx.ssa.back.IdenticalBlockCombiner r1 = new com.android.dx.ssa.back.IdenticalBlockCombiner
            r1.<init>(r0)
            com.android.dx.rop.code.RopMethod r0 = r1.process()
            return r0
    }

    private com.android.dx.rop.code.BasicBlock convertBasicBlock(com.android.dx.ssa.SsaBasicBlock r5) {
            r4 = this;
            com.android.dx.util.IntList r0 = r5.getRopLabelSuccessorList()
            int r1 = r5.getPrimarySuccessorRopLabel()
            com.android.dx.ssa.SsaMethod r2 = r4.ssaMeth
            com.android.dx.ssa.SsaBasicBlock r2 = r2.getExitBlock()
            r3 = -1
            if (r2 != 0) goto L13
            r2 = r3
            goto L17
        L13:
            int r2 = r2.getRopLabel()
        L17:
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L4a
            int r0 = r0.size()
            r1 = 1
            if (r0 > r1) goto L2b
            com.android.dx.util.IntList r0 = com.android.dx.util.IntList.EMPTY
            r4.verifyValidExitPredecessor(r5)
            r1 = r3
            goto L4a
        L2b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exit predecessor must have no other successors"
            r1.append(r2)
            int r5 = r5.getRopLabel()
            java.lang.String r5 = com.android.dx.util.Hex.u2(r5)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L4a:
            r0.setImmutable()
            com.android.dx.rop.code.BasicBlock r2 = new com.android.dx.rop.code.BasicBlock
            int r3 = r5.getRopLabel()
            java.util.ArrayList r5 = r5.getInsns()
            com.android.dx.rop.code.InsnList r5 = r4.convertInsns(r5)
            r2.<init>(r3, r5, r0, r1)
            return r2
    }

    private com.android.dx.rop.code.BasicBlockList convertBasicBlocks() {
            r7 = this;
            com.android.dx.ssa.SsaMethod r0 = r7.ssaMeth
            java.util.ArrayList r0 = r0.getBlocks()
            com.android.dx.ssa.SsaMethod r1 = r7.ssaMeth
            com.android.dx.ssa.SsaBasicBlock r1 = r1.getExitBlock()
            com.android.dx.ssa.SsaMethod r2 = r7.ssaMeth
            java.util.BitSet r2 = r2.computeReachability()
            int r3 = r2.cardinality()
            if (r1 == 0) goto L24
            int r4 = r1.getIndex()
            boolean r4 = r2.get(r4)
            if (r4 == 0) goto L24
            int r3 = r3 + (-1)
        L24:
            com.android.dx.rop.code.BasicBlockList r4 = new com.android.dx.rop.code.BasicBlockList
            r4.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
        L2e:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L51
            java.lang.Object r5 = r0.next()
            com.android.dx.ssa.SsaBasicBlock r5 = (com.android.dx.ssa.SsaBasicBlock) r5
            int r6 = r5.getIndex()
            boolean r6 = r2.get(r6)
            if (r6 == 0) goto L2e
            if (r5 == r1) goto L2e
            int r6 = r3 + 1
            com.android.dx.rop.code.BasicBlock r5 = r7.convertBasicBlock(r5)
            r4.set(r3, r5)
            r3 = r6
            goto L2e
        L51:
            if (r1 == 0) goto L66
            java.util.ArrayList r0 = r1.getInsns()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5e
            goto L66
        L5e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Exit block must have no insns when leaving SSA form"
            r0.<init>(r1)
            throw r0
        L66:
            return r4
    }

    private com.android.dx.rop.code.InsnList convertInsns(java.util.ArrayList<com.android.dx.ssa.SsaInsn> r5) {
            r4 = this;
            int r0 = r5.size()
            com.android.dx.rop.code.InsnList r1 = new com.android.dx.rop.code.InsnList
            r1.<init>(r0)
            r2 = 0
        La:
            if (r2 >= r0) goto L1c
            java.lang.Object r3 = r5.get(r2)
            com.android.dx.ssa.SsaInsn r3 = (com.android.dx.ssa.SsaInsn) r3
            com.android.dx.rop.code.Insn r3 = r3.toRopInsn()
            r1.set(r2, r3)
            int r2 = r2 + 1
            goto La
        L1c:
            r1.setImmutable()
            return r1
    }

    public static com.android.dx.rop.code.RopMethod convertToRopMethod(com.android.dx.ssa.SsaMethod r1, boolean r2) {
            com.android.dx.ssa.back.SsaToRop r0 = new com.android.dx.ssa.back.SsaToRop
            r0.<init>(r1, r2)
            com.android.dx.rop.code.RopMethod r1 = r0.convert()
            return r1
    }

    private void moveParametersToHighRegisters() {
            r6 = this;
            com.android.dx.ssa.SsaMethod r0 = r6.ssaMeth
            int r0 = r0.getParamWidth()
            com.android.dx.ssa.BasicRegisterMapper r1 = new com.android.dx.ssa.BasicRegisterMapper
            com.android.dx.ssa.SsaMethod r2 = r6.ssaMeth
            int r2 = r2.getRegCount()
            r1.<init>(r2)
            com.android.dx.ssa.SsaMethod r2 = r6.ssaMeth
            int r2 = r2.getRegCount()
            r3 = 0
        L18:
            if (r3 >= r2) goto L2c
            r4 = 1
            if (r3 >= r0) goto L24
            int r5 = r2 - r0
            int r5 = r5 + r3
            r1.addMapping(r3, r5, r4)
            goto L29
        L24:
            int r5 = r3 - r0
            r1.addMapping(r3, r5, r4)
        L29:
            int r3 = r3 + 1
            goto L18
        L2c:
            com.android.dx.ssa.SsaMethod r0 = r6.ssaMeth
            r0.mapRegisters(r1)
            return
    }

    private void removeEmptyGotos() {
            r3 = this;
            com.android.dx.ssa.SsaMethod r0 = r3.ssaMeth
            java.util.ArrayList r0 = r0.getBlocks()
            com.android.dx.ssa.SsaMethod r1 = r3.ssaMeth
            com.android.dx.ssa.back.SsaToRop$1 r2 = new com.android.dx.ssa.back.SsaToRop$1
            r2.<init>(r3, r0)
            r0 = 0
            r1.forEachBlockDepthFirst(r0, r2)
            return
    }

    private void removePhiFunctions() {
            r4 = this;
            com.android.dx.ssa.SsaMethod r0 = r4.ssaMeth
            java.util.ArrayList r0 = r0.getBlocks()
            java.util.Iterator r1 = r0.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r1.next()
            com.android.dx.ssa.SsaBasicBlock r2 = (com.android.dx.ssa.SsaBasicBlock) r2
            com.android.dx.ssa.back.SsaToRop$PhiVisitor r3 = new com.android.dx.ssa.back.SsaToRop$PhiVisitor
            r3.<init>(r0)
            r2.forEachPhiInsn(r3)
            r2.removeAllPhiInsns()
            goto La
        L22:
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            com.android.dx.ssa.SsaBasicBlock r1 = (com.android.dx.ssa.SsaBasicBlock) r1
            r1.scheduleMovesFromPhis()
            goto L26
        L36:
            return
    }

    private void verifyValidExitPredecessor(com.android.dx.ssa.SsaBasicBlock r3) {
            r2 = this;
            java.util.ArrayList r3 = r3.getInsns()
            int r0 = r3.size()
            int r0 = r0 + (-1)
            java.lang.Object r3 = r3.get(r0)
            com.android.dx.ssa.SsaInsn r3 = (com.android.dx.ssa.SsaInsn) r3
            com.android.dx.rop.code.Rop r3 = r3.getOpcode()
            int r0 = r3.getBranchingness()
            r1 = 2
            if (r0 == r1) goto L28
            com.android.dx.rop.code.Rop r0 = com.android.dx.rop.code.Rops.THROW
            if (r3 != r0) goto L20
            goto L28
        L20:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "Exit predecessor must end in valid exit statement."
            r3.<init>(r0)
            throw r3
        L28:
            return
    }

    public int[] getRegistersByFrequency() {
            r5 = this;
            com.android.dx.ssa.SsaMethod r0 = r5.ssaMeth
            int r0 = r0.getRegCount()
            java.lang.Integer[] r1 = new java.lang.Integer[r0]
            r2 = 0
            r3 = r2
        La:
            if (r3 >= r0) goto L15
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r1[r3] = r4
            int r3 = r3 + 1
            goto La
        L15:
            com.android.dx.ssa.back.SsaToRop$2 r3 = new com.android.dx.ssa.back.SsaToRop$2
            r3.<init>(r5)
            java.util.Arrays.sort(r1, r3)
            int[] r3 = new int[r0]
        L1f:
            if (r2 >= r0) goto L2c
            r4 = r1[r2]
            int r4 = r4.intValue()
            r3[r2] = r4
            int r2 = r2 + 1
            goto L1f
        L2c:
            return r3
    }
}
