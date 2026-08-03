package com.android.dx.ssa;

/* JADX INFO: loaded from: classes.dex */
public final class SsaMethod {
    private boolean backMode;
    private java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> blocks;
    private int borrowedSpareRegisters;
    private com.android.dx.ssa.SsaInsn[] definitionList;
    private int entryBlockIndex;
    private int exitBlockIndex;
    private final boolean isStatic;
    private int maxLabel;
    private final int paramWidth;
    private int registerCount;
    private int spareRegisterBase;
    private java.util.List<com.android.dx.ssa.SsaInsn>[] unmodifiableUseList;
    private java.util.ArrayList<com.android.dx.ssa.SsaInsn>[] useList;



    private SsaMethod(com.android.dx.rop.code.RopMethod r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.paramWidth = r2
            r0.isStatic = r3
            r2 = 0
            r0.backMode = r2
            com.android.dx.rop.code.BasicBlockList r2 = r1.getBlocks()
            int r2 = r2.getMaxLabel()
            r0.maxLabel = r2
            com.android.dx.rop.code.BasicBlockList r1 = r1.getBlocks()
            int r1 = r1.getRegCount()
            r0.registerCount = r1
            r0.spareRegisterBase = r1
            return
    }

    public static /* synthetic */ com.android.dx.ssa.SsaInsn[] access$000(com.android.dx.ssa.SsaMethod r0) {
            com.android.dx.ssa.SsaInsn[] r0 = r0.definitionList
            return r0
    }

    public static /* synthetic */ java.util.ArrayList[] access$100(com.android.dx.ssa.SsaMethod r0) {
            java.util.ArrayList<com.android.dx.ssa.SsaInsn>[] r0 = r0.useList
            return r0
    }

    public static java.util.BitSet bitSetFromLabelList(com.android.dx.rop.code.BasicBlockList r4, com.android.dx.util.IntList r5) {
            java.util.BitSet r0 = new java.util.BitSet
            int r1 = r4.size()
            r0.<init>(r1)
            int r1 = r5.size()
            r2 = 0
        Le:
            if (r2 >= r1) goto L1e
            int r3 = r5.get(r2)
            int r3 = r4.indexOfLabel(r3)
            r0.set(r3)
            int r2 = r2 + 1
            goto Le
        L1e:
            return r0
    }

    private void buildUseList() {
            r4 = this;
            boolean r0 = r4.backMode
            if (r0 != 0) goto L3e
            int r0 = r4.registerCount
            java.util.ArrayList[] r0 = new java.util.ArrayList[r0]
            r4.useList = r0
            r0 = 0
            r1 = r0
        Lc:
            int r2 = r4.registerCount
            if (r1 >= r2) goto L1c
            java.util.ArrayList<com.android.dx.ssa.SsaInsn>[] r2 = r4.useList
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2[r1] = r3
            int r1 = r1 + 1
            goto Lc
        L1c:
            com.android.dx.ssa.SsaMethod$2 r1 = new com.android.dx.ssa.SsaMethod$2
            r1.<init>(r4)
            r4.forEachInsn(r1)
            int r1 = r4.registerCount
            java.util.List[] r1 = new java.util.List[r1]
            r4.unmodifiableUseList = r1
        L2a:
            int r1 = r4.registerCount
            if (r0 >= r1) goto L3d
            java.util.List<com.android.dx.ssa.SsaInsn>[] r1 = r4.unmodifiableUseList
            java.util.ArrayList<com.android.dx.ssa.SsaInsn>[] r2 = r4.useList
            r2 = r2[r0]
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1[r0] = r2
            int r0 = r0 + 1
            goto L2a
        L3d:
            return
        L3e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "No use list in back mode"
            r0.<init>(r1)
            throw r0
    }

    private void convertRopToSsaBlocks(com.android.dx.rop.code.RopMethod r5) {
            r4 = this;
            com.android.dx.rop.code.BasicBlockList r0 = r5.getBlocks()
            int r0 = r0.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0 + 2
            r1.<init>(r2)
            r4.blocks = r1
            r1 = 0
        L12:
            if (r1 >= r0) goto L20
            com.android.dx.ssa.SsaBasicBlock r2 = com.android.dx.ssa.SsaBasicBlock.newFromRop(r5, r1, r4)
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r3 = r4.blocks
            r3.add(r2)
            int r1 = r1 + 1
            goto L12
        L20:
            com.android.dx.rop.code.BasicBlockList r0 = r5.getBlocks()
            int r5 = r5.getFirstLabel()
            int r5 = r0.indexOfLabel(r5)
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r0 = r4.blocks
            java.lang.Object r5 = r0.get(r5)
            com.android.dx.ssa.SsaBasicBlock r5 = (com.android.dx.ssa.SsaBasicBlock) r5
            com.android.dx.ssa.SsaBasicBlock r5 = r5.insertNewPredecessor()
            int r5 = r5.getIndex()
            r4.entryBlockIndex = r5
            r5 = -1
            r4.exitBlockIndex = r5
            return
    }

    private static com.android.dx.ssa.SsaInsn getGoto(com.android.dx.ssa.SsaBasicBlock r6) {
            com.android.dx.ssa.NormalSsaInsn r0 = new com.android.dx.ssa.NormalSsaInsn
            com.android.dx.rop.code.PlainInsn r1 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.Rop r2 = com.android.dx.rop.code.Rops.GOTO
            com.android.dx.rop.code.SourcePosition r3 = com.android.dx.rop.code.SourcePosition.NO_INFO
            r4 = 0
            com.android.dx.rop.code.RegisterSpecList r5 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            r1.<init>(r2, r3, r4, r5)
            r0.<init>(r1, r6)
            return r0
    }

    public static com.android.dx.util.IntList indexListFromLabelList(com.android.dx.rop.code.BasicBlockList r4, com.android.dx.util.IntList r5) {
            com.android.dx.util.IntList r0 = new com.android.dx.util.IntList
            int r1 = r5.size()
            r0.<init>(r1)
            int r1 = r5.size()
            r2 = 0
        Le:
            if (r2 >= r1) goto L1e
            int r3 = r5.get(r2)
            int r3 = r4.indexOfLabel(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto Le
        L1e:
            return r0
    }

    public static com.android.dx.ssa.SsaMethod newFromRopMethod(com.android.dx.rop.code.RopMethod r1, int r2, boolean r3) {
            com.android.dx.ssa.SsaMethod r0 = new com.android.dx.ssa.SsaMethod
            r0.<init>(r1, r2, r3)
            r0.convertRopToSsaBlocks(r1)
            return r0
    }

    private void removeFromUseList(com.android.dx.ssa.SsaInsn r5, com.android.dx.rop.code.RegisterSpecList r6) {
            r4 = this;
            if (r6 != 0) goto L3
            return
        L3:
            int r0 = r6.size()
            r1 = 0
        L8:
            if (r1 >= r0) goto L27
            java.util.ArrayList<com.android.dx.ssa.SsaInsn>[] r2 = r4.useList
            com.android.dx.rop.code.RegisterSpec r3 = r6.get(r1)
            int r3 = r3.getReg()
            r2 = r2[r3]
            boolean r2 = r2.remove(r5)
            if (r2 == 0) goto L1f
            int r1 = r1 + 1
            goto L8
        L1f:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = "use not found"
            r5.<init>(r6)
            throw r5
        L27:
            return
    }

    public int blockIndexToRopLabel(int r2) {
            r1 = this;
            if (r2 >= 0) goto L4
            r2 = -1
            return r2
        L4:
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r0 = r1.blocks
            java.lang.Object r2 = r0.get(r2)
            com.android.dx.ssa.SsaBasicBlock r2 = (com.android.dx.ssa.SsaBasicBlock) r2
            int r2 = r2.getRopLabel()
            return r2
    }

    public int borrowSpareRegister(int r3) {
            r2 = this;
            int r0 = r2.spareRegisterBase
            int r1 = r2.borrowedSpareRegisters
            int r0 = r0 + r1
            int r1 = r1 + r3
            r2.borrowedSpareRegisters = r1
            int r1 = r2.registerCount
            int r3 = r3 + r0
            int r3 = java.lang.Math.max(r1, r3)
            r2.registerCount = r3
            return r0
    }

    public java.util.BitSet computeReachability() {
            r4 = this;
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r0 = r4.blocks
            int r0 = r0.size()
            java.util.BitSet r1 = new java.util.BitSet
            r1.<init>(r0)
            java.util.BitSet r2 = new java.util.BitSet
            r2.<init>(r0)
            com.android.dx.ssa.SsaBasicBlock r0 = r4.getEntryBlock()
            int r0 = r0.getIndex()
            r1.set(r0)
        L1b:
            r0 = 0
            int r0 = r1.nextSetBit(r0)
            r3 = -1
            if (r0 == r3) goto L39
            r2.set(r0)
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r3 = r4.blocks
            java.lang.Object r0 = r3.get(r0)
            com.android.dx.ssa.SsaBasicBlock r0 = (com.android.dx.ssa.SsaBasicBlock) r0
            java.util.BitSet r0 = r0.getSuccessors()
            r1.or(r0)
            r1.andNot(r2)
            goto L1b
        L39:
            return r2
    }

    public void deleteInsns(java.util.Set<com.android.dx.ssa.SsaInsn> r8) {
            r7 = this;
            java.util.Iterator r8 = r8.iterator()
        L4:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r0 = r8.next()
            com.android.dx.ssa.SsaInsn r0 = (com.android.dx.ssa.SsaInsn) r0
            com.android.dx.ssa.SsaBasicBlock r1 = r0.getBlock()
            java.util.ArrayList r2 = r1.getInsns()
            int r3 = r2.size()
            r4 = 1
            int r3 = r3 - r4
        L1e:
            if (r3 < 0) goto L32
            java.lang.Object r5 = r2.get(r3)
            com.android.dx.ssa.SsaInsn r5 = (com.android.dx.ssa.SsaInsn) r5
            if (r0 != r5) goto L2f
            r7.onInsnRemoved(r5)
            r2.remove(r3)
            goto L32
        L2f:
            int r3 = r3 + (-1)
            goto L1e
        L32:
            int r0 = r2.size()
            r3 = 0
            if (r0 != 0) goto L3b
            r5 = r3
            goto L43
        L3b:
            int r5 = r0 + (-1)
            java.lang.Object r5 = r2.get(r5)
            com.android.dx.ssa.SsaInsn r5 = (com.android.dx.ssa.SsaInsn) r5
        L43:
            com.android.dx.ssa.SsaBasicBlock r6 = r7.getExitBlock()
            if (r1 == r6) goto L4
            if (r0 == 0) goto L5f
            com.android.dx.rop.code.Insn r0 = r5.getOriginalRopInsn()
            if (r0 == 0) goto L5f
            com.android.dx.rop.code.Insn r0 = r5.getOriginalRopInsn()
            com.android.dx.rop.code.Rop r0 = r0.getOpcode()
            int r0 = r0.getBranchingness()
            if (r0 != r4) goto L4
        L5f:
            com.android.dx.rop.code.PlainInsn r0 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.Rop r4 = com.android.dx.rop.code.Rops.GOTO
            com.android.dx.rop.code.SourcePosition r5 = com.android.dx.rop.code.SourcePosition.NO_INFO
            com.android.dx.rop.code.RegisterSpecList r6 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            r0.<init>(r4, r5, r3, r6)
            com.android.dx.ssa.SsaInsn r0 = com.android.dx.ssa.SsaInsn.makeFromRop(r0, r1)
            r2.add(r0)
            java.util.BitSet r0 = r1.getSuccessors()
            r2 = 0
            int r2 = r0.nextSetBit(r2)
        L7a:
            if (r2 < 0) goto L4
            int r3 = r1.getPrimarySuccessorIndex()
            if (r2 == r3) goto L85
            r1.removeSuccessor(r2)
        L85:
            int r2 = r2 + 1
            int r2 = r0.nextSetBit(r2)
            goto L7a
        L8c:
            return
    }

    public void forEachBlockDepthFirst(boolean r8, com.android.dx.ssa.SsaBasicBlock.Visitor r9) {
            r7 = this;
            java.util.BitSet r0 = new java.util.BitSet
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r1 = r7.blocks
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.Stack r1 = new java.util.Stack
            r1.<init>()
            if (r8 == 0) goto L17
            com.android.dx.ssa.SsaBasicBlock r2 = r7.getExitBlock()
            goto L1b
        L17:
            com.android.dx.ssa.SsaBasicBlock r2 = r7.getEntryBlock()
        L1b:
            if (r2 != 0) goto L1e
            return
        L1e:
            r3 = 0
            r1.add(r3)
            r1.add(r2)
        L25:
            int r2 = r1.size()
            if (r2 <= 0) goto L71
            java.lang.Object r2 = r1.pop()
            com.android.dx.ssa.SsaBasicBlock r2 = (com.android.dx.ssa.SsaBasicBlock) r2
            java.lang.Object r3 = r1.pop()
            com.android.dx.ssa.SsaBasicBlock r3 = (com.android.dx.ssa.SsaBasicBlock) r3
            int r4 = r2.getIndex()
            boolean r4 = r0.get(r4)
            if (r4 != 0) goto L25
            if (r8 == 0) goto L48
            java.util.BitSet r4 = r2.getPredecessors()
            goto L4c
        L48:
            java.util.BitSet r4 = r2.getSuccessors()
        L4c:
            r5 = 0
            int r5 = r4.nextSetBit(r5)
        L51:
            if (r5 < 0) goto L66
            r1.add(r2)
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r6 = r7.blocks
            java.lang.Object r6 = r6.get(r5)
            r1.add(r6)
            int r5 = r5 + 1
            int r5 = r4.nextSetBit(r5)
            goto L51
        L66:
            int r4 = r2.getIndex()
            r0.set(r4)
            r9.visitBlock(r2, r3)
            goto L25
        L71:
            return
    }

    public void forEachBlockDepthFirstDom(com.android.dx.ssa.SsaBasicBlock.Visitor r7) {
            r6 = this;
            java.util.BitSet r0 = new java.util.BitSet
            java.util.ArrayList r1 = r6.getBlocks()
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.Stack r1 = new java.util.Stack
            r1.<init>()
            com.android.dx.ssa.SsaBasicBlock r2 = r6.getEntryBlock()
            r1.add(r2)
        L19:
            int r2 = r1.size()
            if (r2 <= 0) goto L53
            java.lang.Object r2 = r1.pop()
            com.android.dx.ssa.SsaBasicBlock r2 = (com.android.dx.ssa.SsaBasicBlock) r2
            java.util.ArrayList r3 = r2.getDomChildren()
            int r4 = r2.getIndex()
            boolean r4 = r0.get(r4)
            if (r4 != 0) goto L19
            int r4 = r3.size()
            int r4 = r4 + (-1)
        L39:
            if (r4 < 0) goto L47
            java.lang.Object r5 = r3.get(r4)
            com.android.dx.ssa.SsaBasicBlock r5 = (com.android.dx.ssa.SsaBasicBlock) r5
            r1.add(r5)
            int r4 = r4 + (-1)
            goto L39
        L47:
            int r3 = r2.getIndex()
            r0.set(r3)
            r3 = 0
            r7.visitBlock(r2, r3)
            goto L19
        L53:
            return
    }

    public void forEachInsn(com.android.dx.ssa.SsaInsn.Visitor r3) {
            r2 = this;
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r0 = r2.blocks
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.android.dx.ssa.SsaBasicBlock r1 = (com.android.dx.ssa.SsaBasicBlock) r1
            r1.forEachInsn(r3)
            goto L6
        L16:
            return
    }

    public void forEachPhiInsn(com.android.dx.ssa.PhiInsn.Visitor r3) {
            r2 = this;
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r0 = r2.blocks
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.android.dx.ssa.SsaBasicBlock r1 = (com.android.dx.ssa.SsaBasicBlock) r1
            r1.forEachPhiInsn(r3)
            goto L6
        L16:
            return
    }

    public java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> getBlocks() {
            r1 = this;
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r0 = r1.blocks
            return r0
    }

    public com.android.dx.ssa.SsaInsn getDefinitionForRegister(int r2) {
            r1 = this;
            boolean r0 = r1.backMode
            if (r0 != 0) goto L20
            com.android.dx.ssa.SsaInsn[] r0 = r1.definitionList
            if (r0 == 0) goto Lb
            r2 = r0[r2]
            return r2
        Lb:
            int r0 = r1.getRegCount()
            com.android.dx.ssa.SsaInsn[] r0 = new com.android.dx.ssa.SsaInsn[r0]
            r1.definitionList = r0
            com.android.dx.ssa.SsaMethod$1 r0 = new com.android.dx.ssa.SsaMethod$1
            r0.<init>(r1)
            r1.forEachInsn(r0)
            com.android.dx.ssa.SsaInsn[] r0 = r1.definitionList
            r2 = r0[r2]
            return r2
        L20:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "No def list in back mode"
            r2.<init>(r0)
            throw r2
    }

    public com.android.dx.ssa.SsaBasicBlock getEntryBlock() {
            r2 = this;
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r0 = r2.blocks
            int r1 = r2.entryBlockIndex
            java.lang.Object r0 = r0.get(r1)
            com.android.dx.ssa.SsaBasicBlock r0 = (com.android.dx.ssa.SsaBasicBlock) r0
            return r0
    }

    public int getEntryBlockIndex() {
            r1 = this;
            int r0 = r1.entryBlockIndex
            return r0
    }

    public com.android.dx.ssa.SsaBasicBlock getExitBlock() {
            r2 = this;
            int r0 = r2.exitBlockIndex
            if (r0 >= 0) goto L6
            r0 = 0
            goto Le
        L6:
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r1 = r2.blocks
            java.lang.Object r0 = r1.get(r0)
            com.android.dx.ssa.SsaBasicBlock r0 = (com.android.dx.ssa.SsaBasicBlock) r0
        Le:
            return r0
    }

    public int getExitBlockIndex() {
            r1 = this;
            int r0 = r1.exitBlockIndex
            return r0
    }

    public int getParamWidth() {
            r1 = this;
            int r0 = r1.paramWidth
            return r0
    }

    public int getRegCount() {
            r1 = this;
            int r0 = r1.registerCount
            return r0
    }

    public java.util.ArrayList<com.android.dx.ssa.SsaInsn>[] getUseListCopy() {
            r4 = this;
            java.util.ArrayList<com.android.dx.ssa.SsaInsn>[] r0 = r4.useList
            if (r0 != 0) goto L7
            r4.buildUseList()
        L7:
            int r0 = r4.registerCount
            java.util.ArrayList[] r0 = new java.util.ArrayList[r0]
            r1 = 0
        Lc:
            int r2 = r4.registerCount
            if (r1 >= r2) goto L1e
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.ArrayList<com.android.dx.ssa.SsaInsn>[] r3 = r4.useList
            r3 = r3[r1]
            r2.<init>(r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto Lc
        L1e:
            return r0
    }

    public java.util.List<com.android.dx.ssa.SsaInsn> getUseListForRegister(int r2) {
            r1 = this;
            java.util.List<com.android.dx.ssa.SsaInsn>[] r0 = r1.unmodifiableUseList
            if (r0 != 0) goto L7
            r1.buildUseList()
        L7:
            java.util.List<com.android.dx.ssa.SsaInsn>[] r0 = r1.unmodifiableUseList
            r2 = r0[r2]
            return r2
    }

    public boolean isRegALocal(com.android.dx.rop.code.RegisterSpec r5) {
            r4 = this;
            int r0 = r5.getReg()
            com.android.dx.ssa.SsaInsn r0 = r4.getDefinitionForRegister(r0)
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            com.android.dx.rop.code.RegisterSpec r0 = r0.getLocalAssignment()
            r2 = 1
            if (r0 == 0) goto L14
            return r2
        L14:
            int r5 = r5.getReg()
            java.util.List r5 = r4.getUseListForRegister(r5)
            java.util.Iterator r5 = r5.iterator()
        L20:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r0 = r5.next()
            com.android.dx.ssa.SsaInsn r0 = (com.android.dx.ssa.SsaInsn) r0
            com.android.dx.rop.code.Insn r0 = r0.getOriginalRopInsn()
            if (r0 == 0) goto L20
            com.android.dx.rop.code.Rop r0 = r0.getOpcode()
            int r0 = r0.getOpcode()
            r3 = 54
            if (r0 != r3) goto L20
            return r2
        L3f:
            return r1
    }

    public boolean isStatic() {
            r1 = this;
            boolean r0 = r1.isStatic
            return r0
    }

    public void makeExitBlock() {
            r4 = this;
            int r0 = r4.exitBlockIndex
            if (r0 >= 0) goto L4f
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r0 = r4.blocks
            int r0 = r0.size()
            r4.exitBlockIndex = r0
            com.android.dx.ssa.SsaBasicBlock r0 = new com.android.dx.ssa.SsaBasicBlock
            int r1 = r4.exitBlockIndex
            int r2 = r4.maxLabel
            int r3 = r2 + 1
            r4.maxLabel = r3
            r0.<init>(r1, r2, r4)
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r1 = r4.blocks
            r1.add(r0)
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r1 = r4.blocks
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            com.android.dx.ssa.SsaBasicBlock r2 = (com.android.dx.ssa.SsaBasicBlock) r2
            r2.exitBlockFixup(r0)
            goto L24
        L34:
            java.util.BitSet r0 = r0.getPredecessors()
            int r0 = r0.cardinality()
            if (r0 != 0) goto L4e
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r0 = r4.blocks
            int r1 = r4.exitBlockIndex
            r0.remove(r1)
            r0 = -1
            r4.exitBlockIndex = r0
            int r0 = r4.maxLabel
            int r0 = r0 + (-1)
            r4.maxLabel = r0
        L4e:
            return
        L4f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "must be called at most once"
            r0.<init>(r1)
            throw r0
    }

    public com.android.dx.ssa.SsaBasicBlock makeNewGotoBlock() {
            r4 = this;
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r0 = r4.blocks
            int r0 = r0.size()
            com.android.dx.ssa.SsaBasicBlock r1 = new com.android.dx.ssa.SsaBasicBlock
            int r2 = r4.maxLabel
            int r3 = r2 + 1
            r4.maxLabel = r3
            r1.<init>(r0, r2, r4)
            java.util.ArrayList r0 = r1.getInsns()
            com.android.dx.ssa.SsaInsn r2 = getGoto(r1)
            r0.add(r2)
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r0 = r4.blocks
            r0.add(r1)
            return r1
    }

    public int makeNewSsaReg() {
            r2 = this;
            int r0 = r2.registerCount
            int r1 = r0 + 1
            r2.registerCount = r1
            r2.spareRegisterBase = r1
            r2.onInsnsChanged()
            return r0
    }

    public void mapRegisters(com.android.dx.ssa.RegisterMapper r4) {
            r3 = this;
            java.util.ArrayList r0 = r3.getBlocks()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            com.android.dx.ssa.SsaBasicBlock r1 = (com.android.dx.ssa.SsaBasicBlock) r1
            java.util.ArrayList r1 = r1.getInsns()
            java.util.Iterator r1 = r1.iterator()
        L1c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8
            java.lang.Object r2 = r1.next()
            com.android.dx.ssa.SsaInsn r2 = (com.android.dx.ssa.SsaInsn) r2
            r2.mapRegisters(r4)
            goto L1c
        L2c:
            int r4 = r4.getNewRegisterCount()
            r3.registerCount = r4
            r3.spareRegisterBase = r4
            return
    }

    public void onInsnAdded(com.android.dx.ssa.SsaInsn r2) {
            r1 = this;
            r0 = 0
            r1.onSourcesChanged(r2, r0)
            r1.updateOneDefinition(r2, r0)
            return
    }

    public void onInsnRemoved(com.android.dx.ssa.SsaInsn r3) {
            r2 = this;
            java.util.ArrayList<com.android.dx.ssa.SsaInsn>[] r0 = r2.useList
            if (r0 == 0) goto Lb
            com.android.dx.rop.code.RegisterSpecList r0 = r3.getSources()
            r2.removeFromUseList(r3, r0)
        Lb:
            com.android.dx.rop.code.RegisterSpec r3 = r3.getResult()
            com.android.dx.ssa.SsaInsn[] r0 = r2.definitionList
            if (r0 == 0) goto L1c
            if (r3 == 0) goto L1c
            int r3 = r3.getReg()
            r1 = 0
            r0[r3] = r1
        L1c:
            return
    }

    public void onInsnsChanged() {
            r1 = this;
            r0 = 0
            r1.definitionList = r0
            r1.useList = r0
            r1.unmodifiableUseList = r0
            return
    }

    public void onSourceChanged(com.android.dx.ssa.SsaInsn r2, com.android.dx.rop.code.RegisterSpec r3, com.android.dx.rop.code.RegisterSpec r4) {
            r1 = this;
            java.util.ArrayList<com.android.dx.ssa.SsaInsn>[] r0 = r1.useList
            if (r0 != 0) goto L5
            return
        L5:
            if (r3 == 0) goto L12
            int r3 = r3.getReg()
            java.util.ArrayList<com.android.dx.ssa.SsaInsn>[] r0 = r1.useList
            r3 = r0[r3]
            r3.remove(r2)
        L12:
            int r3 = r4.getReg()
            java.util.ArrayList<com.android.dx.ssa.SsaInsn>[] r4 = r1.useList
            int r0 = r4.length
            if (r0 > r3) goto L1f
            r2 = 0
            r1.useList = r2
            return
        L1f:
            r3 = r4[r3]
            r3.add(r2)
            return
    }

    public void onSourcesChanged(com.android.dx.ssa.SsaInsn r5, com.android.dx.rop.code.RegisterSpecList r6) {
            r4 = this;
            java.util.ArrayList<com.android.dx.ssa.SsaInsn>[] r0 = r4.useList
            if (r0 != 0) goto L5
            return
        L5:
            if (r6 == 0) goto La
            r4.removeFromUseList(r5, r6)
        La:
            com.android.dx.rop.code.RegisterSpecList r6 = r5.getSources()
            int r0 = r6.size()
            r1 = 0
        L13:
            if (r1 >= r0) goto L27
            com.android.dx.rop.code.RegisterSpec r2 = r6.get(r1)
            int r2 = r2.getReg()
            java.util.ArrayList<com.android.dx.ssa.SsaInsn>[] r3 = r4.useList
            r2 = r3[r2]
            r2.add(r5)
            int r1 = r1 + 1
            goto L13
        L27:
            return
    }

    public void returnSpareRegisters() {
            r1 = this;
            r0 = 0
            r1.borrowedSpareRegisters = r0
            return
    }

    public void setBackMode() {
            r1 = this;
            r0 = 1
            r1.backMode = r0
            r0 = 0
            r1.useList = r0
            r1.definitionList = r0
            return
    }

    public void setNewRegCount(int r1) {
            r0 = this;
            r0.registerCount = r1
            r0.spareRegisterBase = r1
            r0.onInsnsChanged()
            return
    }

    public void updateOneDefinition(com.android.dx.ssa.SsaInsn r3, com.android.dx.rop.code.RegisterSpec r4) {
            r2 = this;
            com.android.dx.ssa.SsaInsn[] r0 = r2.definitionList
            if (r0 != 0) goto L5
            return
        L5:
            if (r4 == 0) goto L10
            int r4 = r4.getReg()
            com.android.dx.ssa.SsaInsn[] r0 = r2.definitionList
            r1 = 0
            r0[r4] = r1
        L10:
            com.android.dx.rop.code.RegisterSpec r4 = r3.getResult()
            if (r4 == 0) goto L2f
            int r0 = r4.getReg()
            com.android.dx.ssa.SsaInsn[] r1 = r2.definitionList
            r0 = r1[r0]
            if (r0 != 0) goto L27
            int r4 = r4.getReg()
            r1[r4] = r3
            goto L2f
        L27:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r4 = "Duplicate add of insn"
            r3.<init>(r4)
            throw r3
        L2f:
            return
    }
}
