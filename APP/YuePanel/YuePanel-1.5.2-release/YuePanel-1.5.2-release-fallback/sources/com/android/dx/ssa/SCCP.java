package com.android.dx.ssa;

/* JADX INFO: loaded from: classes.dex */
public class SCCP {
    private static final int CONSTANT = 1;
    private static final int TOP = 0;
    private static final int VARYING = 2;
    private final java.util.ArrayList<com.android.dx.ssa.SsaInsn> branchWorklist;
    private final java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> cfgPhiWorklist;
    private final java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> cfgWorklist;
    private final java.util.BitSet executableBlocks;
    private final com.android.dx.rop.cst.Constant[] latticeConstants;
    private final int[] latticeValues;
    private final int regCount;
    private final com.android.dx.ssa.SsaMethod ssaMeth;
    private final java.util.ArrayList<com.android.dx.ssa.SsaInsn> ssaWorklist;
    private final java.util.ArrayList<com.android.dx.ssa.SsaInsn> varyingWorklist;

    private SCCP(com.android.dx.ssa.SsaMethod r4) {
            r3 = this;
            r3.<init>()
            r3.ssaMeth = r4
            int r0 = r4.getRegCount()
            r3.regCount = r0
            int[] r1 = new int[r0]
            r3.latticeValues = r1
            com.android.dx.rop.cst.Constant[] r0 = new com.android.dx.rop.cst.Constant[r0]
            r3.latticeConstants = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.cfgWorklist = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.cfgPhiWorklist = r0
            java.util.BitSet r0 = new java.util.BitSet
            java.util.ArrayList r4 = r4.getBlocks()
            int r4 = r4.size()
            r0.<init>(r4)
            r3.executableBlocks = r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.ssaWorklist = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.varyingWorklist = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.branchWorklist = r4
            r4 = 0
            r0 = r4
        L47:
            int r1 = r3.regCount
            if (r0 >= r1) goto L57
            int[] r1 = r3.latticeValues
            r1[r0] = r4
            com.android.dx.rop.cst.Constant[] r1 = r3.latticeConstants
            r2 = 0
            r1[r0] = r2
            int r0 = r0 + 1
            goto L47
        L57:
            return
    }

    private void addBlockToWorklist(com.android.dx.ssa.SsaBasicBlock r3) {
            r2 = this;
            java.util.BitSet r0 = r2.executableBlocks
            int r1 = r3.getIndex()
            boolean r0 = r0.get(r1)
            if (r0 != 0) goto L1b
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r0 = r2.cfgWorklist
            r0.add(r3)
            java.util.BitSet r0 = r2.executableBlocks
            int r3 = r3.getIndex()
            r0.set(r3)
            goto L20
        L1b:
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r0 = r2.cfgPhiWorklist
            r0.add(r3)
        L20:
            return
    }

    private void addUsersToWorklist(int r2, int r3) {
            r1 = this;
            r0 = 2
            if (r3 != r0) goto L1f
            com.android.dx.ssa.SsaMethod r3 = r1.ssaMeth
            java.util.List r2 = r3.getUseListForRegister(r2)
            java.util.Iterator r2 = r2.iterator()
        Ld:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3b
            java.lang.Object r3 = r2.next()
            com.android.dx.ssa.SsaInsn r3 = (com.android.dx.ssa.SsaInsn) r3
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r0 = r1.varyingWorklist
            r0.add(r3)
            goto Ld
        L1f:
            com.android.dx.ssa.SsaMethod r3 = r1.ssaMeth
            java.util.List r2 = r3.getUseListForRegister(r2)
            java.util.Iterator r2 = r2.iterator()
        L29:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3b
            java.lang.Object r3 = r2.next()
            com.android.dx.ssa.SsaInsn r3 = (com.android.dx.ssa.SsaInsn) r3
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r0 = r1.ssaWorklist
            r0.add(r3)
            goto L29
        L3b:
            return
    }

    private static java.lang.String latticeValName(int r1) {
            if (r1 == 0) goto L11
            r0 = 1
            if (r1 == r0) goto Le
            r0 = 2
            if (r1 == r0) goto Lb
            java.lang.String r1 = "UNKNOWN"
            return r1
        Lb:
            java.lang.String r1 = "VARYING"
            return r1
        Le:
            java.lang.String r1 = "CONSTANT"
            return r1
        L11:
            java.lang.String r1 = "TOP"
            return r1
    }

    public static void process(com.android.dx.ssa.SsaMethod r1) {
            com.android.dx.ssa.SCCP r0 = new com.android.dx.ssa.SCCP
            r0.<init>(r1)
            r0.run()
            return
    }

    private void replaceBranches() {
            r9 = this;
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r0 = r9.branchWorklist
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L56
            java.lang.Object r1 = r0.next()
            com.android.dx.ssa.SsaInsn r1 = (com.android.dx.ssa.SsaInsn) r1
            com.android.dx.ssa.SsaBasicBlock r2 = r1.getBlock()
            com.android.dx.util.IntList r3 = r2.getSuccessorList()
            int r3 = r3.size()
            r4 = -1
            r5 = 0
            r6 = r4
        L21:
            if (r5 >= r3) goto L37
            com.android.dx.util.IntList r7 = r2.getSuccessorList()
            int r7 = r7.get(r5)
            java.util.BitSet r8 = r9.executableBlocks
            boolean r8 = r8.get(r7)
            if (r8 != 0) goto L34
            r6 = r7
        L34:
            int r5 = r5 + 1
            goto L21
        L37:
            r5 = 2
            if (r3 != r5) goto L6
            if (r6 != r4) goto L3d
            goto L6
        L3d:
            com.android.dx.rop.code.Insn r1 = r1.getOriginalRopInsn()
            com.android.dx.rop.code.PlainInsn r3 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.Rop r4 = com.android.dx.rop.code.Rops.GOTO
            com.android.dx.rop.code.SourcePosition r1 = r1.getPosition()
            r5 = 0
            com.android.dx.rop.code.RegisterSpecList r7 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            r3.<init>(r4, r1, r5, r7)
            r2.replaceLastInsn(r3)
            r2.removeSuccessor(r6)
            goto L6
        L56:
            return
    }

    private void replaceConstants() {
            r6 = this;
            r0 = 0
        L1:
            int r1 = r6.regCount
            if (r0 >= r1) goto L79
            int[] r1 = r6.latticeValues
            r1 = r1[r0]
            r2 = 1
            if (r1 == r2) goto Ld
            goto L76
        Ld:
            com.android.dx.rop.cst.Constant[] r1 = r6.latticeConstants
            r1 = r1[r0]
            boolean r1 = r1 instanceof com.android.dx.rop.cst.TypedConstant
            if (r1 != 0) goto L16
            goto L76
        L16:
            com.android.dx.ssa.SsaMethod r1 = r6.ssaMeth
            com.android.dx.ssa.SsaInsn r1 = r1.getDefinitionForRegister(r0)
            com.android.dx.rop.code.RegisterSpec r2 = r1.getResult()
            com.android.dx.rop.type.TypeBearer r2 = r2.getTypeBearer()
            boolean r2 = r2.isConstant()
            if (r2 == 0) goto L2b
            goto L76
        L2b:
            com.android.dx.rop.code.RegisterSpec r2 = r1.getResult()
            com.android.dx.rop.cst.Constant[] r3 = r6.latticeConstants
            r3 = r3[r0]
            com.android.dx.rop.cst.TypedConstant r3 = (com.android.dx.rop.cst.TypedConstant) r3
            com.android.dx.rop.code.RegisterSpec r2 = r2.withType(r3)
            r1.setResult(r2)
            com.android.dx.ssa.SsaMethod r1 = r6.ssaMeth
            java.util.List r1 = r1.getUseListForRegister(r0)
            java.util.Iterator r1 = r1.iterator()
        L46:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L76
            java.lang.Object r2 = r1.next()
            com.android.dx.ssa.SsaInsn r2 = (com.android.dx.ssa.SsaInsn) r2
            boolean r3 = r2.isPhiOrMove()
            if (r3 == 0) goto L59
            goto L46
        L59:
            r3 = r2
            com.android.dx.ssa.NormalSsaInsn r3 = (com.android.dx.ssa.NormalSsaInsn) r3
            com.android.dx.rop.code.RegisterSpecList r2 = r2.getSources()
            int r4 = r2.indexOfRegister(r0)
            com.android.dx.rop.code.RegisterSpec r2 = r2.get(r4)
            com.android.dx.rop.cst.Constant[] r5 = r6.latticeConstants
            r5 = r5[r0]
            com.android.dx.rop.cst.TypedConstant r5 = (com.android.dx.rop.cst.TypedConstant) r5
            com.android.dx.rop.code.RegisterSpec r2 = r2.withType(r5)
            r3.changeOneSource(r4, r2)
            goto L46
        L76:
            int r0 = r0 + 1
            goto L1
        L79:
            return
    }

    private void run() {
            r3 = this;
            com.android.dx.ssa.SsaMethod r0 = r3.ssaMeth
            com.android.dx.ssa.SsaBasicBlock r0 = r0.getEntryBlock()
            r3.addBlockToWorklist(r0)
        L9:
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r0 = r3.cfgWorklist
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L31
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r0 = r3.cfgPhiWorklist
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L31
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r0 = r3.ssaWorklist
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L31
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r0 = r3.varyingWorklist
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2a
            goto L31
        L2a:
            r3.replaceConstants()
            r3.replaceBranches()
            return
        L31:
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r0 = r3.cfgWorklist
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4d
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r0 = r3.cfgWorklist
            int r0 = r0.size()
            int r0 = r0 + (-1)
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r1 = r3.cfgWorklist
            java.lang.Object r0 = r1.remove(r0)
            com.android.dx.ssa.SsaBasicBlock r0 = (com.android.dx.ssa.SsaBasicBlock) r0
            r3.simulateBlock(r0)
            goto L31
        L4d:
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r0 = r3.cfgPhiWorklist
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L69
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r0 = r3.cfgPhiWorklist
            int r0 = r0.size()
            int r0 = r0 + (-1)
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r1 = r3.cfgPhiWorklist
            java.lang.Object r0 = r1.remove(r0)
            com.android.dx.ssa.SsaBasicBlock r0 = (com.android.dx.ssa.SsaBasicBlock) r0
            r3.simulatePhiBlock(r0)
            goto L4d
        L69:
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r0 = r3.varyingWorklist
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La0
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r0 = r3.varyingWorklist
            int r0 = r0.size()
            int r0 = r0 + (-1)
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r1 = r3.varyingWorklist
            java.lang.Object r0 = r1.remove(r0)
            com.android.dx.ssa.SsaInsn r0 = (com.android.dx.ssa.SsaInsn) r0
            java.util.BitSet r1 = r3.executableBlocks
            com.android.dx.ssa.SsaBasicBlock r2 = r0.getBlock()
            int r2 = r2.getIndex()
            boolean r1 = r1.get(r2)
            if (r1 != 0) goto L92
            goto L69
        L92:
            boolean r1 = r0 instanceof com.android.dx.ssa.PhiInsn
            if (r1 == 0) goto L9c
            com.android.dx.ssa.PhiInsn r0 = (com.android.dx.ssa.PhiInsn) r0
            r3.simulatePhi(r0)
            goto L69
        L9c:
            r3.simulateStmt(r0)
            goto L69
        La0:
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r0 = r3.ssaWorklist
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L9
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r0 = r3.ssaWorklist
            int r0 = r0.size()
            int r0 = r0 + (-1)
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r1 = r3.ssaWorklist
            java.lang.Object r0 = r1.remove(r0)
            com.android.dx.ssa.SsaInsn r0 = (com.android.dx.ssa.SsaInsn) r0
            java.util.BitSet r1 = r3.executableBlocks
            com.android.dx.ssa.SsaBasicBlock r2 = r0.getBlock()
            int r2 = r2.getIndex()
            boolean r1 = r1.get(r2)
            if (r1 != 0) goto Lc9
            goto La0
        Lc9:
            boolean r1 = r0 instanceof com.android.dx.ssa.PhiInsn
            if (r1 == 0) goto Ld3
            com.android.dx.ssa.PhiInsn r0 = (com.android.dx.ssa.PhiInsn) r0
            r3.simulatePhi(r0)
            goto La0
        Ld3:
            r3.simulateStmt(r0)
            goto La0
    }

    private boolean setLatticeValueTo(int r4, int r5, com.android.dx.rop.cst.Constant r6) {
            r3 = this;
            r0 = 0
            r1 = 1
            if (r5 == r1) goto Le
            int[] r6 = r3.latticeValues
            r2 = r6[r4]
            if (r2 == r5) goto Ld
            r6[r4] = r5
            return r1
        Ld:
            return r0
        Le:
            int[] r2 = r3.latticeValues
            r2 = r2[r4]
            if (r2 != r5) goto L20
            com.android.dx.rop.cst.Constant[] r2 = r3.latticeConstants
            r2 = r2[r4]
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L1f
            goto L20
        L1f:
            return r0
        L20:
            int[] r0 = r3.latticeValues
            r0[r4] = r5
            com.android.dx.rop.cst.Constant[] r5 = r3.latticeConstants
            r5[r4] = r6
            return r1
    }

    private void simulateBlock(com.android.dx.ssa.SsaBasicBlock r3) {
            r2 = this;
            java.util.ArrayList r3 = r3.getInsns()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r3.next()
            com.android.dx.ssa.SsaInsn r0 = (com.android.dx.ssa.SsaInsn) r0
            boolean r1 = r0 instanceof com.android.dx.ssa.PhiInsn
            if (r1 == 0) goto L1e
            com.android.dx.ssa.PhiInsn r0 = (com.android.dx.ssa.PhiInsn) r0
            r2.simulatePhi(r0)
            goto L8
        L1e:
            r2.simulateStmt(r0)
            goto L8
        L22:
            return
    }

    private void simulateBranch(com.android.dx.ssa.SsaInsn r10) {
            r9 = this;
            com.android.dx.rop.code.Rop r0 = r10.getOpcode()
            com.android.dx.rop.code.RegisterSpecList r1 = r10.getSources()
            int r2 = r0.getBranchingness()
            r3 = 4
            r4 = 1
            r5 = 0
            if (r2 != r3) goto Lc7
            com.android.dx.rop.code.RegisterSpec r2 = r1.get(r5)
            int r3 = r2.getReg()
            com.android.dx.ssa.SsaMethod r6 = r9.ssaMeth
            boolean r2 = r6.isRegALocal(r2)
            r6 = 0
            if (r2 != 0) goto L2d
            int[] r2 = r9.latticeValues
            r2 = r2[r3]
            if (r2 != r4) goto L2d
            com.android.dx.rop.cst.Constant[] r2 = r9.latticeConstants
            r2 = r2[r3]
            goto L2e
        L2d:
            r2 = r6
        L2e:
            int r3 = r1.size()
            r7 = 2
            if (r3 != r7) goto L4f
            com.android.dx.rop.code.RegisterSpec r3 = r1.get(r4)
            int r7 = r3.getReg()
            com.android.dx.ssa.SsaMethod r8 = r9.ssaMeth
            boolean r3 = r8.isRegALocal(r3)
            if (r3 != 0) goto L4f
            int[] r3 = r9.latticeValues
            r3 = r3[r7]
            if (r3 != r4) goto L4f
            com.android.dx.rop.cst.Constant[] r3 = r9.latticeConstants
            r6 = r3[r7]
        L4f:
            java.lang.String r3 = "Unexpected op"
            r7 = 6
            if (r2 == 0) goto L8e
            int r1 = r1.size()
            if (r1 != r4) goto L8e
            r1 = r2
            com.android.dx.rop.cst.TypedConstant r1 = (com.android.dx.rop.cst.TypedConstant) r1
            int r1 = r1.getBasicType()
            if (r1 == r7) goto L65
            goto Lc7
        L65:
            com.android.dx.rop.cst.CstInteger r2 = (com.android.dx.rop.cst.CstInteger) r2
            int r1 = r2.getValue()
            int r0 = r0.getOpcode()
            switch(r0) {
                case 7: goto L8b;
                case 8: goto L88;
                case 9: goto L85;
                case 10: goto L82;
                case 11: goto L7f;
                case 12: goto L78;
                default: goto L72;
            }
        L72:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            r10.<init>(r3)
            throw r10
        L78:
            if (r1 <= 0) goto L7c
        L7a:
            r0 = r4
            goto L7d
        L7c:
            r0 = r5
        L7d:
            r1 = r4
            goto Lc9
        L7f:
            if (r1 > 0) goto L7c
            goto L7a
        L82:
            if (r1 < 0) goto L7c
            goto L7a
        L85:
            if (r1 >= 0) goto L7c
            goto L7a
        L88:
            if (r1 == 0) goto L7c
            goto L7a
        L8b:
            if (r1 != 0) goto L7c
            goto L7a
        L8e:
            if (r2 == 0) goto Lc7
            if (r6 == 0) goto Lc7
            r1 = r2
            com.android.dx.rop.cst.TypedConstant r1 = (com.android.dx.rop.cst.TypedConstant) r1
            int r1 = r1.getBasicType()
            if (r1 == r7) goto L9c
            goto Lc7
        L9c:
            com.android.dx.rop.cst.CstInteger r2 = (com.android.dx.rop.cst.CstInteger) r2
            int r1 = r2.getValue()
            com.android.dx.rop.cst.CstInteger r6 = (com.android.dx.rop.cst.CstInteger) r6
            int r2 = r6.getValue()
            int r0 = r0.getOpcode()
            switch(r0) {
                case 7: goto Lc4;
                case 8: goto Lc1;
                case 9: goto Lbe;
                case 10: goto Lbb;
                case 11: goto Lb8;
                case 12: goto Lb5;
                default: goto Laf;
            }
        Laf:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            r10.<init>(r3)
            throw r10
        Lb5:
            if (r1 <= r2) goto L7c
            goto L7a
        Lb8:
            if (r1 > r2) goto L7c
            goto L7a
        Lbb:
            if (r1 < r2) goto L7c
            goto L7a
        Lbe:
            if (r1 >= r2) goto L7c
            goto L7a
        Lc1:
            if (r1 == r2) goto L7c
            goto L7a
        Lc4:
            if (r1 != r2) goto L7c
            goto L7a
        Lc7:
            r0 = r5
            r1 = r0
        Lc9:
            com.android.dx.ssa.SsaBasicBlock r2 = r10.getBlock()
            if (r1 == 0) goto Lf7
            if (r0 == 0) goto Lda
            com.android.dx.util.IntList r0 = r2.getSuccessorList()
            int r0 = r0.get(r4)
            goto Le2
        Lda:
            com.android.dx.util.IntList r0 = r2.getSuccessorList()
            int r0 = r0.get(r5)
        Le2:
            com.android.dx.ssa.SsaMethod r1 = r9.ssaMeth
            java.util.ArrayList r1 = r1.getBlocks()
            java.lang.Object r0 = r1.get(r0)
            com.android.dx.ssa.SsaBasicBlock r0 = (com.android.dx.ssa.SsaBasicBlock) r0
            r9.addBlockToWorklist(r0)
            java.util.ArrayList<com.android.dx.ssa.SsaInsn> r0 = r9.branchWorklist
            r0.add(r10)
            goto L11b
        Lf7:
            com.android.dx.util.IntList r10 = r2.getSuccessorList()
            int r10 = r10.size()
            if (r5 >= r10) goto L11b
            com.android.dx.util.IntList r10 = r2.getSuccessorList()
            int r10 = r10.get(r5)
            com.android.dx.ssa.SsaMethod r0 = r9.ssaMeth
            java.util.ArrayList r0 = r0.getBlocks()
            java.lang.Object r10 = r0.get(r10)
            com.android.dx.ssa.SsaBasicBlock r10 = (com.android.dx.ssa.SsaBasicBlock) r10
            r9.addBlockToWorklist(r10)
            int r5 = r5 + 1
            goto Lf7
        L11b:
            return
    }

    private com.android.dx.rop.cst.Constant simulateMath(com.android.dx.ssa.SsaInsn r8, int r9) {
            r7 = this;
            com.android.dx.rop.code.Insn r0 = r8.getOriginalRopInsn()
            com.android.dx.rop.code.Rop r1 = r8.getOpcode()
            int r1 = r1.getOpcode()
            com.android.dx.rop.code.RegisterSpecList r8 = r8.getSources()
            r2 = 0
            com.android.dx.rop.code.RegisterSpec r3 = r8.get(r2)
            int r3 = r3.getReg()
            int[] r4 = r7.latticeValues
            r4 = r4[r3]
            r5 = 0
            r6 = 1
            if (r4 == r6) goto L23
            r3 = r5
            goto L27
        L23:
            com.android.dx.rop.cst.Constant[] r4 = r7.latticeConstants
            r3 = r4[r3]
        L27:
            int r4 = r8.size()
            if (r4 != r6) goto L34
            com.android.dx.rop.code.CstInsn r0 = (com.android.dx.rop.code.CstInsn) r0
            com.android.dx.rop.cst.Constant r0 = r0.getConstant()
            goto L48
        L34:
            com.android.dx.rop.code.RegisterSpec r0 = r8.get(r6)
            int r0 = r0.getReg()
            int[] r4 = r7.latticeValues
            r4 = r4[r0]
            if (r4 == r6) goto L44
            r0 = r5
            goto L48
        L44:
            com.android.dx.rop.cst.Constant[] r4 = r7.latticeConstants
            r0 = r4[r0]
        L48:
            if (r3 == 0) goto L9d
            if (r0 != 0) goto L4d
            goto L9d
        L4d:
            r4 = 6
            if (r9 == r4) goto L51
            return r5
        L51:
            com.android.dx.rop.cst.CstInteger r3 = (com.android.dx.rop.cst.CstInteger) r3
            int r9 = r3.getValue()
            com.android.dx.rop.cst.CstInteger r0 = (com.android.dx.rop.cst.CstInteger) r0
            int r0 = r0.getValue()
            switch(r1) {
                case 14: goto L94;
                case 15: goto L89;
                case 16: goto L87;
                case 17: goto L82;
                case 18: goto L7a;
                case 19: goto L60;
                case 20: goto L77;
                case 21: goto L74;
                case 22: goto L71;
                case 23: goto L6e;
                case 24: goto L6b;
                case 25: goto L68;
                default: goto L60;
            }
        L60:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r9 = "Unexpected op"
            r8.<init>(r9)
            throw r8
        L68:
            int r8 = r9 >>> r0
            goto L96
        L6b:
            int r8 = r9 >> r0
            goto L96
        L6e:
            int r8 = r9 << r0
            goto L96
        L71:
            r8 = r9 ^ r0
            goto L96
        L74:
            r8 = r9 | r0
            goto L96
        L77:
            r8 = r9 & r0
            goto L96
        L7a:
            if (r0 != 0) goto L7f
        L7c:
            r8 = r2
            r2 = r6
            goto L96
        L7f:
            int r9 = r9 % r0
        L80:
            r8 = r9
            goto L96
        L82:
            if (r0 != 0) goto L85
            goto L7c
        L85:
            int r9 = r9 / r0
            goto L80
        L87:
            int r9 = r9 * r0
            goto L80
        L89:
            int r8 = r8.size()
            if (r8 != r6) goto L92
            int r0 = r0 - r9
            r8 = r0
            goto L96
        L92:
            int r9 = r9 - r0
            goto L80
        L94:
            int r9 = r9 + r0
            goto L80
        L96:
            if (r2 == 0) goto L99
            goto L9d
        L99:
            com.android.dx.rop.cst.CstInteger r5 = com.android.dx.rop.cst.CstInteger.make(r8)
        L9d:
            return r5
    }

    private void simulatePhi(com.android.dx.ssa.PhiInsn r12) {
            r11 = this;
            com.android.dx.rop.code.RegisterSpec r0 = r12.getResult()
            int r0 = r0.getReg()
            int[] r1 = r11.latticeValues
            r1 = r1[r0]
            r2 = 2
            if (r1 != r2) goto L10
            return
        L10:
            com.android.dx.rop.code.RegisterSpecList r1 = r12.getSources()
            int r3 = r1.size()
            r4 = 0
            r5 = 0
            r6 = r5
            r5 = r4
        L1c:
            if (r4 >= r3) goto L53
            int r7 = r12.predBlockIndexForSourcesIndex(r4)
            com.android.dx.rop.code.RegisterSpec r8 = r1.get(r4)
            int r8 = r8.getReg()
            int[] r9 = r11.latticeValues
            r9 = r9[r8]
            java.util.BitSet r10 = r11.executableBlocks
            boolean r7 = r10.get(r7)
            if (r7 != 0) goto L37
            goto L4e
        L37:
            r7 = 1
            if (r9 != r7) goto L51
            if (r6 != 0) goto L43
            com.android.dx.rop.cst.Constant[] r5 = r11.latticeConstants
            r5 = r5[r8]
            r6 = r5
            r5 = r7
            goto L4e
        L43:
            com.android.dx.rop.cst.Constant[] r7 = r11.latticeConstants
            r7 = r7[r8]
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L4e
            goto L54
        L4e:
            int r4 = r4 + 1
            goto L1c
        L51:
            r2 = r9
            goto L54
        L53:
            r2 = r5
        L54:
            boolean r12 = r11.setLatticeValueTo(r0, r2, r6)
            if (r12 == 0) goto L5d
            r11.addUsersToWorklist(r0, r2)
        L5d:
            return
    }

    private void simulatePhiBlock(com.android.dx.ssa.SsaBasicBlock r3) {
            r2 = this;
            java.util.ArrayList r3 = r3.getInsns()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r3.next()
            com.android.dx.ssa.SsaInsn r0 = (com.android.dx.ssa.SsaInsn) r0
            boolean r1 = r0 instanceof com.android.dx.ssa.PhiInsn
            if (r1 == 0) goto L1e
            com.android.dx.ssa.PhiInsn r0 = (com.android.dx.ssa.PhiInsn) r0
            r2.simulatePhi(r0)
            goto L8
        L1e:
            return
    }

    private void simulateStmt(com.android.dx.ssa.SsaInsn r8) {
            r7 = this;
            com.android.dx.rop.code.Insn r0 = r8.getOriginalRopInsn()
            com.android.dx.rop.code.Rop r1 = r0.getOpcode()
            int r1 = r1.getBranchingness()
            r2 = 1
            if (r1 != r2) goto L19
            com.android.dx.rop.code.Rop r1 = r0.getOpcode()
            boolean r1 = r1.isCallLike()
            if (r1 == 0) goto L1c
        L19:
            r7.simulateBranch(r8)
        L1c:
            com.android.dx.rop.code.Rop r1 = r8.getOpcode()
            int r1 = r1.getOpcode()
            com.android.dx.rop.code.RegisterSpec r3 = r8.getResult()
            r4 = 0
            if (r3 != 0) goto L4b
            r3 = 17
            if (r1 == r3) goto L35
            r3 = 18
            if (r1 != r3) goto L34
            goto L35
        L34:
            return
        L35:
            com.android.dx.ssa.SsaBasicBlock r3 = r8.getBlock()
            com.android.dx.ssa.SsaBasicBlock r3 = r3.getPrimarySuccessor()
            java.util.ArrayList r3 = r3.getInsns()
            java.lang.Object r3 = r3.get(r4)
            com.android.dx.ssa.SsaInsn r3 = (com.android.dx.ssa.SsaInsn) r3
            com.android.dx.rop.code.RegisterSpec r3 = r3.getResult()
        L4b:
            int r5 = r3.getReg()
            r6 = 2
            if (r1 == r6) goto L81
            r4 = 5
            if (r1 == r4) goto L7a
            r0 = 56
            if (r1 == r0) goto L6d
            switch(r1) {
                case 14: goto L60;
                case 15: goto L60;
                case 16: goto L60;
                case 17: goto L60;
                case 18: goto L60;
                default: goto L5c;
            }
        L5c:
            switch(r1) {
                case 20: goto L60;
                case 21: goto L60;
                case 22: goto L60;
                case 23: goto L60;
                case 24: goto L60;
                case 25: goto L60;
                default: goto L5f;
            }
        L5f:
            goto La0
        L60:
            int r0 = r3.getBasicType()
            com.android.dx.rop.cst.Constant r8 = r7.simulateMath(r8, r0)
            if (r8 == 0) goto L6b
            goto La2
        L6b:
            r2 = r6
            goto La2
        L6d:
            int[] r8 = r7.latticeValues
            r8 = r8[r5]
            if (r8 != r2) goto La0
            com.android.dx.rop.cst.Constant[] r0 = r7.latticeConstants
            r0 = r0[r5]
            r2 = r8
            r8 = r0
            goto La2
        L7a:
            com.android.dx.rop.code.CstInsn r0 = (com.android.dx.rop.code.CstInsn) r0
            com.android.dx.rop.cst.Constant r8 = r0.getConstant()
            goto La2
        L81:
            com.android.dx.rop.code.RegisterSpecList r0 = r8.getSources()
            int r0 = r0.size()
            if (r0 != r2) goto La0
            com.android.dx.rop.code.RegisterSpecList r8 = r8.getSources()
            com.android.dx.rop.code.RegisterSpec r8 = r8.get(r4)
            int r8 = r8.getReg()
            int[] r0 = r7.latticeValues
            r2 = r0[r8]
            com.android.dx.rop.cst.Constant[] r0 = r7.latticeConstants
            r8 = r0[r8]
            goto La2
        La0:
            r8 = 0
            goto L6b
        La2:
            boolean r8 = r7.setLatticeValueTo(r5, r2, r8)
            if (r8 == 0) goto Lab
            r7.addUsersToWorklist(r5, r2)
        Lab:
            return
    }
}
