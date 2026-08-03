package com.android.dx.ssa;

/* JADX INFO: loaded from: classes.dex */
public final class SsaBasicBlock {
    public static final java.util.Comparator<com.android.dx.ssa.SsaBasicBlock> LABEL_COMPARATOR = null;
    private final java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> domChildren;
    private final int index;
    private final java.util.ArrayList<com.android.dx.ssa.SsaInsn> insns;
    private com.android.dx.util.IntSet liveIn;
    private com.android.dx.util.IntSet liveOut;
    private int movesFromPhisAtBeginning;
    private int movesFromPhisAtEnd;
    private final com.android.dx.ssa.SsaMethod parent;
    private java.util.BitSet predecessors;
    private int primarySuccessor;
    private final int ropLabel;
    private com.android.dx.util.IntList successorList;
    private java.util.BitSet successors;

    public static final class LabelComparator implements java.util.Comparator<com.android.dx.ssa.SsaBasicBlock> {
        public LabelComparator() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(com.android.dx.ssa.SsaBasicBlock r1, com.android.dx.ssa.SsaBasicBlock r2) {
                r0 = this;
                int r1 = com.android.dx.ssa.SsaBasicBlock.access$000(r1)
                int r2 = com.android.dx.ssa.SsaBasicBlock.access$000(r2)
                if (r1 >= r2) goto Lc
                r1 = -1
                return r1
            Lc:
                if (r1 <= r2) goto L10
                r1 = 1
                return r1
            L10:
                r1 = 0
                return r1
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(com.android.dx.ssa.SsaBasicBlock r1, com.android.dx.ssa.SsaBasicBlock r2) {
                r0 = this;
                com.android.dx.ssa.SsaBasicBlock r1 = (com.android.dx.ssa.SsaBasicBlock) r1
                com.android.dx.ssa.SsaBasicBlock r2 = (com.android.dx.ssa.SsaBasicBlock) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }
    }

    public interface Visitor {
        void visitBlock(com.android.dx.ssa.SsaBasicBlock r1, com.android.dx.ssa.SsaBasicBlock r2);
    }

    static {
            com.android.dx.ssa.SsaBasicBlock$LabelComparator r0 = new com.android.dx.ssa.SsaBasicBlock$LabelComparator
            r0.<init>()
            com.android.dx.ssa.SsaBasicBlock.LABEL_COMPARATOR = r0
            return
    }

    public SsaBasicBlock(int r2, int r3, com.android.dx.ssa.SsaMethod r4) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.primarySuccessor = r0
            r0 = 0
            r1.movesFromPhisAtEnd = r0
            r1.movesFromPhisAtBeginning = r0
            r1.parent = r4
            r1.index = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.insns = r2
            r1.ropLabel = r3
            java.util.BitSet r2 = new java.util.BitSet
            java.util.ArrayList r3 = r4.getBlocks()
            int r3 = r3.size()
            r2.<init>(r3)
            r1.predecessors = r2
            java.util.BitSet r2 = new java.util.BitSet
            java.util.ArrayList r3 = r4.getBlocks()
            int r3 = r3.size()
            r2.<init>(r3)
            r1.successors = r2
            com.android.dx.util.IntList r2 = new com.android.dx.util.IntList
            r2.<init>()
            r1.successorList = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.domChildren = r2
            return
    }

    public static /* synthetic */ int access$000(com.android.dx.ssa.SsaBasicBlock r0) {
            int r0 = r0.ropLabel
            return r0
    }

    private static boolean checkRegUsed(java.util.BitSet r3, com.android.dx.rop.code.RegisterSpec r4) {
            int r0 = r4.getReg()
            int r4 = r4.getCategory()
            boolean r1 = r3.get(r0)
            r2 = 1
            if (r1 != 0) goto L1b
            r1 = 2
            if (r4 != r1) goto L1a
            int r0 = r0 + r2
            boolean r3 = r3.get(r0)
            if (r3 == 0) goto L1a
            goto L1b
        L1a:
            r2 = 0
        L1b:
            return r2
    }

    private int getCountPhiInsns() {
            r3 = this;
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r0 = r3.insns
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L19
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r2 = r3.insns
            java.lang.Object r2 = r2.get(r1)
            com.android.dx.ssa.SsaInsn r2 = (com.android.dx.ssa.SsaInsn) r2
            boolean r2 = r2 instanceof com.android.dx.ssa.PhiInsn
            if (r2 != 0) goto L16
            goto L19
        L16:
            int r1 = r1 + 1
            goto L7
        L19:
            return r1
    }

    public static com.android.dx.ssa.SsaBasicBlock newFromRop(com.android.dx.rop.code.RopMethod r7, int r8, com.android.dx.ssa.SsaMethod r9) {
            com.android.dx.rop.code.BasicBlockList r0 = r7.getBlocks()
            com.android.dx.rop.code.BasicBlock r1 = r0.get(r8)
            com.android.dx.ssa.SsaBasicBlock r2 = new com.android.dx.ssa.SsaBasicBlock
            int r3 = r1.getLabel()
            r2.<init>(r8, r3, r9)
            com.android.dx.rop.code.InsnList r8 = r1.getInsns()
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r9 = r2.insns
            int r3 = r8.size()
            r9.ensureCapacity(r3)
            int r9 = r8.size()
            r3 = 0
        L23:
            if (r3 >= r9) goto L36
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r4 = r2.insns
            com.android.dx.ssa.NormalSsaInsn r5 = new com.android.dx.ssa.NormalSsaInsn
            com.android.dx.rop.code.Insn r6 = r8.get(r3)
            r5.<init>(r6, r2)
            r4.add(r5)
            int r3 = r3 + 1
            goto L23
        L36:
            int r8 = r1.getLabel()
            com.android.dx.util.IntList r7 = r7.labelToPredecessors(r8)
            java.util.BitSet r7 = com.android.dx.ssa.SsaMethod.bitSetFromLabelList(r0, r7)
            r2.predecessors = r7
            com.android.dx.util.IntList r7 = r1.getSuccessors()
            java.util.BitSet r7 = com.android.dx.ssa.SsaMethod.bitSetFromLabelList(r0, r7)
            r2.successors = r7
            com.android.dx.util.IntList r7 = r1.getSuccessors()
            com.android.dx.util.IntList r7 = com.android.dx.ssa.SsaMethod.indexListFromLabelList(r0, r7)
            r2.successorList = r7
            int r7 = r7.size()
            if (r7 == 0) goto L6c
            int r7 = r1.getPrimarySuccessor()
            if (r7 >= 0) goto L66
            r7 = -1
            goto L6a
        L66:
            int r7 = r0.indexOfLabel(r7)
        L6a:
            r2.primarySuccessor = r7
        L6c:
            return r2
    }

    private void scheduleUseBeforeAssigned(java.util.List<com.android.dx.ssa.SsaInsn> r12) {
            r11 = this;
            java.util.BitSet r0 = new java.util.BitSet
            com.android.dx.ssa.SsaMethod r1 = r11.parent
            int r1 = r1.getRegCount()
            r0.<init>(r1)
            java.util.BitSet r1 = new java.util.BitSet
            com.android.dx.ssa.SsaMethod r2 = r11.parent
            int r2 = r2.getRegCount()
            r1.<init>(r2)
            int r2 = r12.size()
            r3 = 0
            r4 = r3
        L1c:
            if (r4 >= r2) goto Le1
            r5 = r4
        L1f:
            if (r5 >= r2) goto L42
            java.lang.Object r6 = r12.get(r5)
            com.android.dx.ssa.SsaInsn r6 = (com.android.dx.ssa.SsaInsn) r6
            com.android.dx.rop.code.RegisterSpecList r6 = r6.getSources()
            com.android.dx.rop.code.RegisterSpec r6 = r6.get(r3)
            setRegsUsed(r0, r6)
            java.lang.Object r6 = r12.get(r5)
            com.android.dx.ssa.SsaInsn r6 = (com.android.dx.ssa.SsaInsn) r6
            com.android.dx.rop.code.RegisterSpec r6 = r6.getResult()
            setRegsUsed(r1, r6)
            int r5 = r5 + 1
            goto L1f
        L42:
            r5 = r4
            r6 = r5
        L44:
            if (r5 >= r2) goto L5f
            java.lang.Object r7 = r12.get(r5)
            com.android.dx.ssa.SsaInsn r7 = (com.android.dx.ssa.SsaInsn) r7
            com.android.dx.rop.code.RegisterSpec r7 = r7.getResult()
            boolean r7 = checkRegUsed(r0, r7)
            if (r7 != 0) goto L5c
            int r7 = r6 + 1
            java.util.Collections.swap(r12, r5, r6)
            r6 = r7
        L5c:
            int r5 = r5 + 1
            goto L44
        L5f:
            if (r4 != r6) goto Ld8
            r4 = r6
        L62:
            if (r4 >= r2) goto L89
            java.lang.Object r5 = r12.get(r4)
            com.android.dx.ssa.SsaInsn r5 = (com.android.dx.ssa.SsaInsn) r5
            com.android.dx.rop.code.RegisterSpec r7 = r5.getResult()
            boolean r7 = checkRegUsed(r0, r7)
            if (r7 == 0) goto L86
            com.android.dx.rop.code.RegisterSpecList r7 = r5.getSources()
            com.android.dx.rop.code.RegisterSpec r7 = r7.get(r3)
            boolean r7 = checkRegUsed(r1, r7)
            if (r7 == 0) goto L86
            java.util.Collections.swap(r12, r6, r4)
            goto L8a
        L86:
            int r4 = r4 + 1
            goto L62
        L89:
            r5 = 0
        L8a:
            com.android.dx.rop.code.RegisterSpec r2 = r5.getResult()
            com.android.dx.ssa.SsaMethod r4 = r11.parent
            int r7 = r2.getCategory()
            int r4 = r4.borrowSpareRegister(r7)
            com.android.dx.rop.code.RegisterSpec r4 = r2.withReg(r4)
            com.android.dx.ssa.NormalSsaInsn r7 = new com.android.dx.ssa.NormalSsaInsn
            com.android.dx.rop.code.PlainInsn r8 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.type.Type r9 = r2.getType()
            com.android.dx.rop.code.Rop r9 = com.android.dx.rop.code.Rops.opMove(r9)
            com.android.dx.rop.code.SourcePosition r10 = com.android.dx.rop.code.SourcePosition.NO_INFO
            com.android.dx.rop.code.RegisterSpecList r5 = r5.getSources()
            r8.<init>(r9, r10, r4, r5)
            r7.<init>(r8, r11)
            int r5 = r6 + 1
            r12.add(r6, r7)
            com.android.dx.rop.code.RegisterSpecList r4 = com.android.dx.rop.code.RegisterSpecList.make(r4)
            com.android.dx.ssa.NormalSsaInsn r6 = new com.android.dx.ssa.NormalSsaInsn
            com.android.dx.rop.code.PlainInsn r7 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.type.Type r8 = r2.getType()
            com.android.dx.rop.code.Rop r8 = com.android.dx.rop.code.Rops.opMove(r8)
            r7.<init>(r8, r10, r2, r4)
            r6.<init>(r7, r11)
            r12.set(r5, r6)
            int r2 = r12.size()
            r4 = r5
            goto Ld9
        Ld8:
            r4 = r6
        Ld9:
            r0.clear()
            r1.clear()
            goto L1c
        Le1:
            return
    }

    private static void setRegsUsed(java.util.BitSet r2, com.android.dx.rop.code.RegisterSpec r3) {
            int r0 = r3.getReg()
            r2.set(r0)
            int r0 = r3.getCategory()
            r1 = 1
            if (r0 <= r1) goto L16
            int r3 = r3.getReg()
            int r3 = r3 + r1
            r2.set(r3)
        L16:
            return
    }

    public void addDomChild(com.android.dx.ssa.SsaBasicBlock r2) {
            r1 = this;
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r0 = r1.domChildren
            r0.add(r2)
            return
    }

    public void addInsnToHead(com.android.dx.rop.code.Insn r3) {
            r2 = this;
            com.android.dx.ssa.SsaInsn r3 = com.android.dx.ssa.SsaInsn.makeFromRop(r3, r2)
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r0 = r2.insns
            int r1 = r2.getCountPhiInsns()
            r0.add(r1, r3)
            com.android.dx.ssa.SsaMethod r0 = r2.parent
            r0.onInsnAdded(r3)
            return
    }

    public void addLiveIn(int r2) {
            r1 = this;
            com.android.dx.util.IntSet r0 = r1.liveIn
            if (r0 != 0) goto L10
            com.android.dx.ssa.SsaMethod r0 = r1.parent
            int r0 = r0.getRegCount()
            com.android.dx.util.IntSet r0 = com.android.dx.ssa.SetFactory.makeLivenessSet(r0)
            r1.liveIn = r0
        L10:
            com.android.dx.util.IntSet r0 = r1.liveIn
            r0.add(r2)
            return
    }

    public void addLiveOut(int r2) {
            r1 = this;
            com.android.dx.util.IntSet r0 = r1.liveOut
            if (r0 != 0) goto L10
            com.android.dx.ssa.SsaMethod r0 = r1.parent
            int r0 = r0.getRegCount()
            com.android.dx.util.IntSet r0 = com.android.dx.ssa.SetFactory.makeLivenessSet(r0)
            r1.liveOut = r0
        L10:
            com.android.dx.util.IntSet r0 = r1.liveOut
            r0.add(r2)
            return
    }

    public void addMoveToBeginning(com.android.dx.rop.code.RegisterSpec r5, com.android.dx.rop.code.RegisterSpec r6) {
            r4 = this;
            int r0 = r5.getReg()
            int r1 = r6.getReg()
            if (r0 != r1) goto Lb
            return
        Lb:
            com.android.dx.rop.code.RegisterSpecList r6 = com.android.dx.rop.code.RegisterSpecList.make(r6)
            com.android.dx.ssa.NormalSsaInsn r0 = new com.android.dx.ssa.NormalSsaInsn
            com.android.dx.rop.code.PlainInsn r1 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.type.Type r2 = r5.getType()
            com.android.dx.rop.code.Rop r2 = com.android.dx.rop.code.Rops.opMove(r2)
            com.android.dx.rop.code.SourcePosition r3 = com.android.dx.rop.code.SourcePosition.NO_INFO
            r1.<init>(r2, r3, r5, r6)
            r0.<init>(r1, r4)
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r5 = r4.insns
            int r6 = r4.getCountPhiInsns()
            r5.add(r6, r0)
            int r5 = r4.movesFromPhisAtBeginning
            int r5 = r5 + 1
            r4.movesFromPhisAtBeginning = r5
            return
    }

    public void addMoveToEnd(com.android.dx.rop.code.RegisterSpec r6, com.android.dx.rop.code.RegisterSpec r7) {
            r5 = this;
            java.util.BitSet r0 = r5.successors
            int r0 = r0.cardinality()
            r1 = 1
            if (r0 > r1) goto L7c
            int r0 = r6.getReg()
            int r2 = r7.getReg()
            if (r0 != r2) goto L14
            return
        L14:
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r0 = r5.insns
            int r2 = r0.size()
            int r2 = r2 - r1
            java.lang.Object r0 = r0.get(r2)
            com.android.dx.ssa.NormalSsaInsn r0 = (com.android.dx.ssa.NormalSsaInsn) r0
            com.android.dx.rop.code.RegisterSpec r2 = r0.getResult()
            if (r2 != 0) goto L5a
            com.android.dx.rop.code.RegisterSpecList r0 = r0.getSources()
            int r0 = r0.size()
            if (r0 <= 0) goto L32
            goto L5a
        L32:
            com.android.dx.rop.code.RegisterSpecList r7 = com.android.dx.rop.code.RegisterSpecList.make(r7)
            com.android.dx.ssa.NormalSsaInsn r0 = new com.android.dx.ssa.NormalSsaInsn
            com.android.dx.rop.code.PlainInsn r2 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.type.Type r3 = r6.getType()
            com.android.dx.rop.code.Rop r3 = com.android.dx.rop.code.Rops.opMove(r3)
            com.android.dx.rop.code.SourcePosition r4 = com.android.dx.rop.code.SourcePosition.NO_INFO
            r2.<init>(r3, r4, r6, r7)
            r0.<init>(r2, r5)
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r6 = r5.insns
            int r7 = r6.size()
            int r7 = r7 - r1
            r6.add(r7, r0)
            int r6 = r5.movesFromPhisAtEnd
            int r6 = r6 + r1
            r5.movesFromPhisAtEnd = r6
            goto L7b
        L5a:
            java.util.BitSet r0 = r5.successors
            r1 = 0
            int r0 = r0.nextSetBit(r1)
        L61:
            if (r0 < 0) goto L7b
            com.android.dx.ssa.SsaMethod r1 = r5.parent
            java.util.ArrayList r1 = r1.getBlocks()
            java.lang.Object r1 = r1.get(r0)
            com.android.dx.ssa.SsaBasicBlock r1 = (com.android.dx.ssa.SsaBasicBlock) r1
            r1.addMoveToBeginning(r6, r7)
            java.util.BitSet r1 = r5.successors
            int r0 = r0 + 1
            int r0 = r1.nextSetBit(r0)
            goto L61
        L7b:
            return
        L7c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Inserting a move to a block with multiple successors"
            r6.<init>(r7)
            throw r6
    }

    public void addPhiInsnForReg(int r3) {
            r2 = this;
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r0 = r2.insns
            com.android.dx.ssa.PhiInsn r1 = new com.android.dx.ssa.PhiInsn
            r1.<init>(r3, r2)
            r3 = 0
            r0.add(r3, r1)
            return
    }

    public void addPhiInsnForReg(com.android.dx.rop.code.RegisterSpec r3) {
            r2 = this;
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r0 = r2.insns
            com.android.dx.ssa.PhiInsn r1 = new com.android.dx.ssa.PhiInsn
            r1.<init>(r3, r2)
            r3 = 0
            r0.add(r3, r1)
            return
    }

    public void exitBlockFixup(com.android.dx.ssa.SsaBasicBlock r3) {
            r2 = this;
            if (r2 != r3) goto L3
            return
        L3:
            com.android.dx.util.IntList r0 = r2.successorList
            int r0 = r0.size()
            if (r0 != 0) goto L24
            java.util.BitSet r0 = r2.successors
            int r1 = r3.index
            r0.set(r1)
            com.android.dx.util.IntList r0 = r2.successorList
            int r1 = r3.index
            r0.add(r1)
            int r0 = r3.index
            r2.primarySuccessor = r0
            java.util.BitSet r3 = r3.predecessors
            int r0 = r2.index
            r3.set(r0)
        L24:
            return
    }

    public void forEachInsn(com.android.dx.ssa.SsaInsn.Visitor r4) {
            r3 = this;
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r0 = r3.insns
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L17
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r2 = r3.insns
            java.lang.Object r2 = r2.get(r1)
            com.android.dx.ssa.SsaInsn r2 = (com.android.dx.ssa.SsaInsn) r2
            r2.accept(r4)
            int r1 = r1 + 1
            goto L7
        L17:
            return
    }

    public void forEachPhiInsn(com.android.dx.ssa.PhiInsn.Visitor r5) {
            r4 = this;
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r0 = r4.insns
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L1d
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r2 = r4.insns
            java.lang.Object r2 = r2.get(r1)
            com.android.dx.ssa.SsaInsn r2 = (com.android.dx.ssa.SsaInsn) r2
            boolean r3 = r2 instanceof com.android.dx.ssa.PhiInsn
            if (r3 == 0) goto L1d
            com.android.dx.ssa.PhiInsn r2 = (com.android.dx.ssa.PhiInsn) r2
            r5.visitPhiInsn(r2)
            int r1 = r1 + 1
            goto L7
        L1d:
            return
    }

    public java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> getDomChildren() {
            r1 = this;
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r0 = r1.domChildren
            return r0
    }

    public int getIndex() {
            r1 = this;
            int r0 = r1.index
            return r0
    }

    public java.util.ArrayList<com.android.dx.ssa.SsaInsn> getInsns() {
            r1 = this;
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r0 = r1.insns
            return r0
    }

    public com.android.dx.util.IntSet getLiveInRegs() {
            r1 = this;
            com.android.dx.util.IntSet r0 = r1.liveIn
            if (r0 != 0) goto L10
            com.android.dx.ssa.SsaMethod r0 = r1.parent
            int r0 = r0.getRegCount()
            com.android.dx.util.IntSet r0 = com.android.dx.ssa.SetFactory.makeLivenessSet(r0)
            r1.liveIn = r0
        L10:
            com.android.dx.util.IntSet r0 = r1.liveIn
            return r0
    }

    public com.android.dx.util.IntSet getLiveOutRegs() {
            r1 = this;
            com.android.dx.util.IntSet r0 = r1.liveOut
            if (r0 != 0) goto L10
            com.android.dx.ssa.SsaMethod r0 = r1.parent
            int r0 = r0.getRegCount()
            com.android.dx.util.IntSet r0 = com.android.dx.ssa.SetFactory.makeLivenessSet(r0)
            r1.liveOut = r0
        L10:
            com.android.dx.util.IntSet r0 = r1.liveOut
            return r0
    }

    public com.android.dx.ssa.SsaMethod getParent() {
            r1 = this;
            com.android.dx.ssa.SsaMethod r0 = r1.parent
            return r0
    }

    public java.util.List<com.android.dx.ssa.SsaInsn> getPhiInsns() {
            r3 = this;
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r0 = r3.insns
            r1 = 0
            int r2 = r3.getCountPhiInsns()
            java.util.List r0 = r0.subList(r1, r2)
            return r0
    }

    public java.util.BitSet getPredecessors() {
            r1 = this;
            java.util.BitSet r0 = r1.predecessors
            return r0
    }

    public com.android.dx.ssa.SsaBasicBlock getPrimarySuccessor() {
            r2 = this;
            int r0 = r2.primarySuccessor
            if (r0 >= 0) goto L6
            r0 = 0
            return r0
        L6:
            com.android.dx.ssa.SsaMethod r0 = r2.parent
            java.util.ArrayList r0 = r0.getBlocks()
            int r1 = r2.primarySuccessor
            java.lang.Object r0 = r0.get(r1)
            com.android.dx.ssa.SsaBasicBlock r0 = (com.android.dx.ssa.SsaBasicBlock) r0
            return r0
    }

    public int getPrimarySuccessorIndex() {
            r1 = this;
            int r0 = r1.primarySuccessor
            return r0
    }

    public int getPrimarySuccessorRopLabel() {
            r2 = this;
            com.android.dx.ssa.SsaMethod r0 = r2.parent
            int r1 = r2.primarySuccessor
            int r0 = r0.blockIndexToRopLabel(r1)
            return r0
    }

    public int getRopLabel() {
            r1 = this;
            int r0 = r1.ropLabel
            return r0
    }

    public java.lang.String getRopLabelString() {
            r1 = this;
            int r0 = r1.ropLabel
            java.lang.String r0 = com.android.dx.util.Hex.u2(r0)
            return r0
    }

    public com.android.dx.util.IntList getRopLabelSuccessorList() {
            r5 = this;
            com.android.dx.util.IntList r0 = new com.android.dx.util.IntList
            com.android.dx.util.IntList r1 = r5.successorList
            int r1 = r1.size()
            r0.<init>(r1)
            com.android.dx.util.IntList r1 = r5.successorList
            int r1 = r1.size()
            r2 = 0
        L12:
            if (r2 >= r1) goto L26
            com.android.dx.ssa.SsaMethod r3 = r5.parent
            com.android.dx.util.IntList r4 = r5.successorList
            int r4 = r4.get(r2)
            int r3 = r3.blockIndexToRopLabel(r4)
            r0.add(r3)
            int r2 = r2 + 1
            goto L12
        L26:
            return r0
    }

    public com.android.dx.util.IntList getSuccessorList() {
            r1 = this;
            com.android.dx.util.IntList r0 = r1.successorList
            return r0
    }

    public java.util.BitSet getSuccessors() {
            r1 = this;
            java.util.BitSet r0 = r1.successors
            return r0
    }

    public com.android.dx.ssa.SsaBasicBlock insertNewPredecessor() {
            r5 = this;
            com.android.dx.ssa.SsaMethod r0 = r5.parent
            com.android.dx.ssa.SsaBasicBlock r0 = r0.makeNewGotoBlock()
            java.util.BitSet r1 = r5.predecessors
            r0.predecessors = r1
            java.util.BitSet r1 = r0.successors
            int r2 = r5.index
            r1.set(r2)
            com.android.dx.util.IntList r1 = r0.successorList
            int r2 = r5.index
            r1.add(r2)
            int r1 = r5.index
            r0.primarySuccessor = r1
            java.util.BitSet r1 = new java.util.BitSet
            com.android.dx.ssa.SsaMethod r2 = r5.parent
            java.util.ArrayList r2 = r2.getBlocks()
            int r2 = r2.size()
            r1.<init>(r2)
            r5.predecessors = r1
            int r2 = r0.index
            r1.set(r2)
            java.util.BitSet r1 = r0.predecessors
            r2 = 0
            int r1 = r1.nextSetBit(r2)
        L39:
            if (r1 < 0) goto L57
            com.android.dx.ssa.SsaMethod r2 = r5.parent
            java.util.ArrayList r2 = r2.getBlocks()
            java.lang.Object r2 = r2.get(r1)
            com.android.dx.ssa.SsaBasicBlock r2 = (com.android.dx.ssa.SsaBasicBlock) r2
            int r3 = r5.index
            int r4 = r0.index
            r2.replaceSuccessor(r3, r4)
            java.util.BitSet r2 = r0.predecessors
            int r1 = r1 + 1
            int r1 = r2.nextSetBit(r1)
            goto L39
        L57:
            return r0
    }

    public com.android.dx.ssa.SsaBasicBlock insertNewSuccessor(com.android.dx.ssa.SsaBasicBlock r5) {
            r4 = this;
            com.android.dx.ssa.SsaMethod r0 = r4.parent
            com.android.dx.ssa.SsaBasicBlock r0 = r0.makeNewGotoBlock()
            java.util.BitSet r1 = r4.successors
            int r2 = r5.index
            boolean r1 = r1.get(r2)
            if (r1 == 0) goto L74
            java.util.BitSet r1 = r0.predecessors
            int r2 = r4.index
            r1.set(r2)
            java.util.BitSet r1 = r0.successors
            int r2 = r5.index
            r1.set(r2)
            com.android.dx.util.IntList r1 = r0.successorList
            int r2 = r5.index
            r1.add(r2)
            int r1 = r5.index
            r0.primarySuccessor = r1
            com.android.dx.util.IntList r1 = r4.successorList
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L31:
            if (r1 < 0) goto L47
            com.android.dx.util.IntList r2 = r4.successorList
            int r2 = r2.get(r1)
            int r3 = r5.index
            if (r2 != r3) goto L44
            com.android.dx.util.IntList r2 = r4.successorList
            int r3 = r0.index
            r2.set(r1, r3)
        L44:
            int r1 = r1 + (-1)
            goto L31
        L47:
            int r1 = r4.primarySuccessor
            int r2 = r5.index
            if (r1 != r2) goto L51
            int r1 = r0.index
            r4.primarySuccessor = r1
        L51:
            java.util.BitSet r1 = r4.successors
            r1.clear(r2)
            java.util.BitSet r1 = r4.successors
            int r2 = r0.index
            r1.set(r2)
            java.util.BitSet r1 = r5.predecessors
            int r2 = r0.index
            r1.set(r2)
            java.util.BitSet r1 = r5.predecessors
            int r2 = r4.index
            java.util.BitSet r3 = r4.successors
            int r5 = r5.index
            boolean r5 = r3.get(r5)
            r1.set(r2, r5)
            return r0
        L74:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Block "
            r1.append(r2)
            java.lang.String r5 = r5.getRopLabelString()
            r1.append(r5)
            java.lang.String r5 = " not successor of "
            r1.append(r5)
            java.lang.String r5 = r4.getRopLabelString()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    public boolean isExitBlock() {
            r2 = this;
            int r0 = r2.index
            com.android.dx.ssa.SsaMethod r1 = r2.parent
            int r1 = r1.getExitBlockIndex()
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public void removeAllPhiInsns() {
            r3 = this;
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r0 = r3.insns
            r1 = 0
            int r2 = r3.getCountPhiInsns()
            java.util.List r0 = r0.subList(r1, r2)
            r0.clear()
            return
    }

    public void removeSuccessor(int r4) {
            r3 = this;
            com.android.dx.util.IntList r0 = r3.successorList
            int r0 = r0.size()
            int r0 = r0 + (-1)
            r1 = 0
        L9:
            if (r0 < 0) goto L20
            com.android.dx.util.IntList r2 = r3.successorList
            int r2 = r2.get(r0)
            if (r2 != r4) goto L15
            r1 = r0
            goto L1d
        L15:
            com.android.dx.util.IntList r2 = r3.successorList
            int r2 = r2.get(r0)
            r3.primarySuccessor = r2
        L1d:
            int r0 = r0 + (-1)
            goto L9
        L20:
            com.android.dx.util.IntList r0 = r3.successorList
            r0.removeIndex(r1)
            java.util.BitSet r0 = r3.successors
            r0.clear(r4)
            com.android.dx.ssa.SsaMethod r0 = r3.parent
            java.util.ArrayList r0 = r0.getBlocks()
            java.lang.Object r4 = r0.get(r4)
            com.android.dx.ssa.SsaBasicBlock r4 = (com.android.dx.ssa.SsaBasicBlock) r4
            java.util.BitSet r4 = r4.predecessors
            int r0 = r3.index
            r4.clear(r0)
            return
    }

    public void replaceLastInsn(com.android.dx.rop.code.Insn r5) {
            r4 = this;
            com.android.dx.rop.code.Rop r0 = r5.getOpcode()
            int r0 = r0.getBranchingness()
            r1 = 1
            if (r0 == r1) goto L31
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r0 = r4.insns
            int r2 = r0.size()
            int r2 = r2 - r1
            java.lang.Object r0 = r0.get(r2)
            com.android.dx.ssa.SsaInsn r0 = (com.android.dx.ssa.SsaInsn) r0
            com.android.dx.ssa.SsaInsn r5 = com.android.dx.ssa.SsaInsn.makeFromRop(r5, r4)
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r2 = r4.insns
            int r3 = r2.size()
            int r3 = r3 - r1
            r2.set(r3, r5)
            com.android.dx.ssa.SsaMethod r1 = r4.parent
            r1.onInsnRemoved(r0)
            com.android.dx.ssa.SsaMethod r0 = r4.parent
            r0.onInsnAdded(r5)
            return
        L31:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "last insn must branch"
            r5.<init>(r0)
            throw r5
    }

    public void replaceSuccessor(int r3, int r4) {
            r2 = this;
            if (r3 != r4) goto L3
            return
        L3:
            java.util.BitSet r0 = r2.successors
            r0.set(r4)
            int r0 = r2.primarySuccessor
            if (r0 != r3) goto Le
            r2.primarySuccessor = r4
        Le:
            com.android.dx.util.IntList r0 = r2.successorList
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L16:
            if (r0 < 0) goto L28
            com.android.dx.util.IntList r1 = r2.successorList
            int r1 = r1.get(r0)
            if (r1 != r3) goto L25
            com.android.dx.util.IntList r1 = r2.successorList
            r1.set(r0, r4)
        L25:
            int r0 = r0 + (-1)
            goto L16
        L28:
            java.util.BitSet r0 = r2.successors
            r0.clear(r3)
            com.android.dx.ssa.SsaMethod r0 = r2.parent
            java.util.ArrayList r0 = r0.getBlocks()
            java.lang.Object r4 = r0.get(r4)
            com.android.dx.ssa.SsaBasicBlock r4 = (com.android.dx.ssa.SsaBasicBlock) r4
            java.util.BitSet r4 = r4.predecessors
            int r0 = r2.index
            r4.set(r0)
            com.android.dx.ssa.SsaMethod r4 = r2.parent
            java.util.ArrayList r4 = r4.getBlocks()
            java.lang.Object r3 = r4.get(r3)
            com.android.dx.ssa.SsaBasicBlock r3 = (com.android.dx.ssa.SsaBasicBlock) r3
            java.util.BitSet r3 = r3.predecessors
            int r4 = r2.index
            r3.clear(r4)
            return
    }

    public void scheduleMovesFromPhis() {
            r4 = this;
            int r0 = r4.movesFromPhisAtBeginning
            r1 = 1
            if (r0 <= r1) goto L28
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r2 = r4.insns
            r3 = 0
            java.util.List r0 = r2.subList(r3, r0)
            r4.scheduleUseBeforeAssigned(r0)
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r0 = r4.insns
            int r2 = r4.movesFromPhisAtBeginning
            java.lang.Object r0 = r0.get(r2)
            com.android.dx.ssa.SsaInsn r0 = (com.android.dx.ssa.SsaInsn) r0
            boolean r0 = r0.isMoveException()
            if (r0 != 0) goto L20
            goto L28
        L20:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unexpected: moves from phis before move-exception"
            r0.<init>(r1)
            throw r0
        L28:
            int r0 = r4.movesFromPhisAtEnd
            if (r0 <= r1) goto L44
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r0 = r4.insns
            int r2 = r0.size()
            int r3 = r4.movesFromPhisAtEnd
            int r2 = r2 - r3
            int r2 = r2 - r1
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r3 = r4.insns
            int r3 = r3.size()
            int r3 = r3 - r1
            java.util.List r0 = r0.subList(r2, r3)
            r4.scheduleUseBeforeAssigned(r0)
        L44:
            com.android.dx.ssa.SsaMethod r0 = r4.parent
            r0.returnSpareRegisters()
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{"
            r0.append(r1)
            int r1 = r2.index
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            int r1 = r2.ropLabel
            java.lang.String r1 = com.android.dx.util.Hex.u2(r1)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
