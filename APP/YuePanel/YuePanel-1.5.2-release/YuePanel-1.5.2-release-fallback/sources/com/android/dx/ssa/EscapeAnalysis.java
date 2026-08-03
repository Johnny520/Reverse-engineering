package com.android.dx.ssa;

/* JADX INFO: loaded from: classes.dex */
public class EscapeAnalysis {
    private final java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis.EscapeSet> latticeValues;
    private final int regCount;
    private final com.android.dx.ssa.SsaMethod ssaMeth;



    public static class EscapeSet {
        java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis.EscapeSet> childSets;
        com.android.dx.ssa.EscapeAnalysis.EscapeState escape;
        java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis.EscapeSet> parentSets;
        java.util.BitSet regSet;
        boolean replaceableArray;

        public EscapeSet(int r2, int r3, com.android.dx.ssa.EscapeAnalysis.EscapeState r4) {
                r1 = this;
                r1.<init>()
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>(r3)
                r1.regSet = r0
                r0.set(r2)
                r1.escape = r4
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r1.childSets = r2
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r1.parentSets = r2
                r2 = 0
                r1.replaceableArray = r2
                return
        }
    }

    public enum EscapeState extends java.lang.Enum<com.android.dx.ssa.EscapeAnalysis.EscapeState> {
        private static final /* synthetic */ com.android.dx.ssa.EscapeAnalysis.EscapeState[] $VALUES = null;
        public static final com.android.dx.ssa.EscapeAnalysis.EscapeState GLOBAL = null;
        public static final com.android.dx.ssa.EscapeAnalysis.EscapeState INTER = null;
        public static final com.android.dx.ssa.EscapeAnalysis.EscapeState METHOD = null;
        public static final com.android.dx.ssa.EscapeAnalysis.EscapeState NONE = null;
        public static final com.android.dx.ssa.EscapeAnalysis.EscapeState TOP = null;

        static {
                com.android.dx.ssa.EscapeAnalysis$EscapeState r0 = new com.android.dx.ssa.EscapeAnalysis$EscapeState
                java.lang.String r1 = "TOP"
                r2 = 0
                r0.<init>(r1, r2)
                com.android.dx.ssa.EscapeAnalysis.EscapeState.TOP = r0
                com.android.dx.ssa.EscapeAnalysis$EscapeState r1 = new com.android.dx.ssa.EscapeAnalysis$EscapeState
                java.lang.String r2 = "NONE"
                r3 = 1
                r1.<init>(r2, r3)
                com.android.dx.ssa.EscapeAnalysis.EscapeState.NONE = r1
                com.android.dx.ssa.EscapeAnalysis$EscapeState r2 = new com.android.dx.ssa.EscapeAnalysis$EscapeState
                java.lang.String r3 = "METHOD"
                r4 = 2
                r2.<init>(r3, r4)
                com.android.dx.ssa.EscapeAnalysis.EscapeState.METHOD = r2
                com.android.dx.ssa.EscapeAnalysis$EscapeState r3 = new com.android.dx.ssa.EscapeAnalysis$EscapeState
                java.lang.String r4 = "INTER"
                r5 = 3
                r3.<init>(r4, r5)
                com.android.dx.ssa.EscapeAnalysis.EscapeState.INTER = r3
                com.android.dx.ssa.EscapeAnalysis$EscapeState r4 = new com.android.dx.ssa.EscapeAnalysis$EscapeState
                java.lang.String r5 = "GLOBAL"
                r6 = 4
                r4.<init>(r5, r6)
                com.android.dx.ssa.EscapeAnalysis.EscapeState.GLOBAL = r4
                com.android.dx.ssa.EscapeAnalysis$EscapeState[] r0 = new com.android.dx.ssa.EscapeAnalysis.EscapeState[]{r0, r1, r2, r3, r4}
                com.android.dx.ssa.EscapeAnalysis.EscapeState.$VALUES = r0
                return
        }

        EscapeState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.android.dx.ssa.EscapeAnalysis.EscapeState valueOf(java.lang.String r1) {
                java.lang.Class<com.android.dx.ssa.EscapeAnalysis$EscapeState> r0 = com.android.dx.ssa.EscapeAnalysis.EscapeState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.android.dx.ssa.EscapeAnalysis$EscapeState r1 = (com.android.dx.ssa.EscapeAnalysis.EscapeState) r1
                return r1
        }

        public static com.android.dx.ssa.EscapeAnalysis.EscapeState[] values() {
                com.android.dx.ssa.EscapeAnalysis$EscapeState[] r0 = com.android.dx.ssa.EscapeAnalysis.EscapeState.$VALUES
                java.lang.Object r0 = r0.clone()
                com.android.dx.ssa.EscapeAnalysis$EscapeState[] r0 = (com.android.dx.ssa.EscapeAnalysis.EscapeState[]) r0
                return r0
        }
    }

    private EscapeAnalysis(com.android.dx.ssa.SsaMethod r1) {
            r0 = this;
            r0.<init>()
            r0.ssaMeth = r1
            int r1 = r1.getRegCount()
            r0.regCount = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.latticeValues = r1
            return
    }

    public static /* synthetic */ com.android.dx.ssa.SsaMethod access$000(com.android.dx.ssa.EscapeAnalysis r0) {
            com.android.dx.ssa.SsaMethod r0 = r0.ssaMeth
            return r0
    }

    public static /* synthetic */ void access$100(com.android.dx.ssa.EscapeAnalysis r0, com.android.dx.ssa.SsaInsn r1) {
            r0.processInsn(r1)
            return
    }

    private void addEdge(com.android.dx.ssa.EscapeAnalysis.EscapeSet r2, com.android.dx.ssa.EscapeAnalysis.EscapeSet r3) {
            r1 = this;
            java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis$EscapeSet> r0 = r3.parentSets
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto Ld
            java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis$EscapeSet> r0 = r3.parentSets
            r0.add(r2)
        Ld:
            java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis$EscapeSet> r0 = r2.childSets
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L1a
            java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis$EscapeSet> r2 = r2.childSets
            r2.add(r3)
        L1a:
            return
    }

    private int findSetIndex(com.android.dx.rop.code.RegisterSpec r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis$EscapeSet> r1 = r3.latticeValues
            int r1 = r1.size()
            if (r0 >= r1) goto L21
            java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis$EscapeSet> r1 = r3.latticeValues
            java.lang.Object r1 = r1.get(r0)
            com.android.dx.ssa.EscapeAnalysis$EscapeSet r1 = (com.android.dx.ssa.EscapeAnalysis.EscapeSet) r1
            java.util.BitSet r1 = r1.regSet
            int r2 = r4.getReg()
            boolean r1 = r1.get(r2)
            if (r1 == 0) goto L1e
            return r0
        L1e:
            int r0 = r0 + 1
            goto L1
        L21:
            return r0
    }

    private com.android.dx.ssa.SsaInsn getInsnForMove(com.android.dx.ssa.SsaInsn r2) {
            r1 = this;
            com.android.dx.ssa.SsaBasicBlock r2 = r2.getBlock()
            java.util.BitSet r2 = r2.getPredecessors()
            r0 = 0
            int r2 = r2.nextSetBit(r0)
            com.android.dx.ssa.SsaMethod r0 = r1.ssaMeth
            java.util.ArrayList r0 = r0.getBlocks()
            java.lang.Object r2 = r0.get(r2)
            com.android.dx.ssa.SsaBasicBlock r2 = (com.android.dx.ssa.SsaBasicBlock) r2
            java.util.ArrayList r2 = r2.getInsns()
            int r0 = r2.size()
            int r0 = r0 + (-1)
            java.lang.Object r2 = r2.get(r0)
            com.android.dx.ssa.SsaInsn r2 = (com.android.dx.ssa.SsaInsn) r2
            return r2
    }

    private com.android.dx.ssa.SsaInsn getMoveForInsn(com.android.dx.ssa.SsaInsn r3) {
            r2 = this;
            com.android.dx.ssa.SsaBasicBlock r3 = r3.getBlock()
            java.util.BitSet r3 = r3.getSuccessors()
            r0 = 0
            int r3 = r3.nextSetBit(r0)
            com.android.dx.ssa.SsaMethod r1 = r2.ssaMeth
            java.util.ArrayList r1 = r1.getBlocks()
            java.lang.Object r3 = r1.get(r3)
            com.android.dx.ssa.SsaBasicBlock r3 = (com.android.dx.ssa.SsaBasicBlock) r3
            java.util.ArrayList r3 = r3.getInsns()
            java.lang.Object r3 = r3.get(r0)
            com.android.dx.ssa.SsaInsn r3 = (com.android.dx.ssa.SsaInsn) r3
            return r3
    }

    private void insertExceptionThrow(com.android.dx.ssa.SsaInsn r14, com.android.dx.rop.code.RegisterSpec r15, java.util.HashSet<com.android.dx.ssa.SsaInsn> r16) {
            r13 = this;
            r6 = r13
            r7 = r16
            com.android.dx.rop.cst.CstType r8 = new com.android.dx.rop.cst.CstType
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.code.Exceptions.TYPE_ArrayIndexOutOfBoundsException
            r8.<init>(r0)
            com.android.dx.rop.code.RegisterSpecList r9 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            r3 = 0
            r4 = 40
            r0 = r13
            r1 = r14
            r2 = r9
            r5 = r8
            r0.insertThrowingInsnBefore(r1, r2, r3, r4, r5)
            com.android.dx.ssa.SsaBasicBlock r0 = r14.getBlock()
            com.android.dx.ssa.SsaBasicBlock r1 = r0.getPrimarySuccessor()
            com.android.dx.ssa.SsaBasicBlock r10 = r0.insertNewSuccessor(r1)
            java.util.ArrayList r0 = r10.getInsns()
            r11 = 0
            java.lang.Object r0 = r0.get(r11)
            r1 = r0
            com.android.dx.ssa.SsaInsn r1 = (com.android.dx.ssa.SsaInsn) r1
            com.android.dx.ssa.SsaMethod r0 = r6.ssaMeth
            int r0 = r0.makeNewSsaReg()
            com.android.dx.rop.code.RegisterSpec r12 = com.android.dx.rop.code.RegisterSpec.make(r0, r8)
            r4 = 56
            r5 = 0
            r0 = r13
            r3 = r12
            r0.insertPlainInsnBefore(r1, r2, r3, r4, r5)
            com.android.dx.ssa.SsaBasicBlock r0 = r10.getPrimarySuccessor()
            com.android.dx.ssa.SsaBasicBlock r9 = r10.insertNewSuccessor(r0)
            java.util.ArrayList r0 = r9.getInsns()
            java.lang.Object r0 = r0.get(r11)
            r10 = r0
            com.android.dx.ssa.SsaInsn r10 = (com.android.dx.ssa.SsaInsn) r10
            com.android.dx.rop.cst.CstNat r0 = new com.android.dx.rop.cst.CstNat
            com.android.dx.rop.cst.CstString r1 = new com.android.dx.rop.cst.CstString
            java.lang.String r2 = "<init>"
            r1.<init>(r2)
            com.android.dx.rop.cst.CstString r2 = new com.android.dx.rop.cst.CstString
            java.lang.String r3 = "(I)V"
            r2.<init>(r3)
            r0.<init>(r1, r2)
            com.android.dx.rop.cst.CstMethodRef r5 = new com.android.dx.rop.cst.CstMethodRef
            r5.<init>(r8, r0)
            r0 = r15
            com.android.dx.rop.code.RegisterSpecList r2 = com.android.dx.rop.code.RegisterSpecList.make(r12, r15)
            r3 = 0
            r4 = 52
            r0 = r13
            r1 = r10
            r0.insertThrowingInsnBefore(r1, r2, r3, r4, r5)
            r7.add(r10)
            com.android.dx.ssa.SsaBasicBlock r0 = r9.getPrimarySuccessor()
            com.android.dx.ssa.SsaBasicBlock r8 = r9.insertNewSuccessor(r0)
            java.util.ArrayList r0 = r8.getInsns()
            java.lang.Object r0 = r0.get(r11)
            r9 = r0
            com.android.dx.ssa.SsaInsn r9 = (com.android.dx.ssa.SsaInsn) r9
            com.android.dx.rop.code.RegisterSpecList r2 = com.android.dx.rop.code.RegisterSpecList.make(r12)
            r4 = 35
            r5 = 0
            r0 = r13
            r1 = r9
            r0.insertThrowingInsnBefore(r1, r2, r3, r4, r5)
            int r0 = r8.getPrimarySuccessorIndex()
            com.android.dx.ssa.SsaMethod r1 = r6.ssaMeth
            com.android.dx.ssa.SsaBasicBlock r1 = r1.getExitBlock()
            int r1 = r1.getIndex()
            r8.replaceSuccessor(r0, r1)
            r7.add(r9)
            return
    }

    private void insertPlainInsnBefore(com.android.dx.ssa.SsaInsn r8, com.android.dx.rop.code.RegisterSpecList r9, com.android.dx.rop.code.RegisterSpec r10, int r11, com.android.dx.rop.cst.Constant r12) {
            r7 = this;
            com.android.dx.rop.code.Insn r0 = r8.getOriginalRopInsn()
            r1 = 56
            if (r11 != r1) goto L12
            com.android.dx.rop.type.Type r11 = r10.getType()
            com.android.dx.rop.code.Rop r11 = com.android.dx.rop.code.Rops.opMoveResultPseudo(r11)
        L10:
            r2 = r11
            goto L17
        L12:
            com.android.dx.rop.code.Rop r11 = com.android.dx.rop.code.Rops.ropFor(r11, r10, r9, r12)
            goto L10
        L17:
            if (r12 != 0) goto L23
            com.android.dx.rop.code.PlainInsn r11 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.SourcePosition r12 = r0.getPosition()
            r11.<init>(r2, r12, r10, r9)
            goto L30
        L23:
            com.android.dx.rop.code.PlainCstInsn r11 = new com.android.dx.rop.code.PlainCstInsn
            com.android.dx.rop.code.SourcePosition r3 = r0.getPosition()
            r1 = r11
            r4 = r10
            r5 = r9
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
        L30:
            com.android.dx.ssa.NormalSsaInsn r9 = new com.android.dx.ssa.NormalSsaInsn
            com.android.dx.ssa.SsaBasicBlock r10 = r8.getBlock()
            r9.<init>(r11, r10)
            com.android.dx.ssa.SsaBasicBlock r10 = r8.getBlock()
            java.util.ArrayList r10 = r10.getInsns()
            int r8 = r10.lastIndexOf(r8)
            r10.add(r8, r9)
            com.android.dx.ssa.SsaMethod r8 = r7.ssaMeth
            r8.onInsnAdded(r9)
            return
    }

    private void insertThrowingInsnBefore(com.android.dx.ssa.SsaInsn r8, com.android.dx.rop.code.RegisterSpecList r9, com.android.dx.rop.code.RegisterSpec r10, int r11, com.android.dx.rop.cst.Constant r12) {
            r7 = this;
            com.android.dx.rop.code.Insn r0 = r8.getOriginalRopInsn()
            com.android.dx.rop.code.Rop r2 = com.android.dx.rop.code.Rops.ropFor(r11, r10, r9, r12)
            if (r12 != 0) goto L16
            com.android.dx.rop.code.ThrowingInsn r10 = new com.android.dx.rop.code.ThrowingInsn
            com.android.dx.rop.code.SourcePosition r11 = r0.getPosition()
            com.android.dx.rop.type.StdTypeList r12 = com.android.dx.rop.type.StdTypeList.EMPTY
            r10.<init>(r2, r11, r9, r12)
            goto L24
        L16:
            com.android.dx.rop.code.ThrowingCstInsn r10 = new com.android.dx.rop.code.ThrowingCstInsn
            com.android.dx.rop.code.SourcePosition r3 = r0.getPosition()
            com.android.dx.rop.type.StdTypeList r5 = com.android.dx.rop.type.StdTypeList.EMPTY
            r1 = r10
            r4 = r9
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
        L24:
            com.android.dx.ssa.NormalSsaInsn r9 = new com.android.dx.ssa.NormalSsaInsn
            com.android.dx.ssa.SsaBasicBlock r11 = r8.getBlock()
            r9.<init>(r10, r11)
            com.android.dx.ssa.SsaBasicBlock r10 = r8.getBlock()
            java.util.ArrayList r10 = r10.getInsns()
            int r8 = r10.lastIndexOf(r8)
            r10.add(r8, r9)
            com.android.dx.ssa.SsaMethod r8 = r7.ssaMeth
            r8.onInsnAdded(r9)
            return
    }

    private void movePropagate() {
            r7 = this;
            r0 = 0
            r1 = r0
        L2:
            com.android.dx.ssa.SsaMethod r2 = r7.ssaMeth
            int r2 = r2.getRegCount()
            if (r1 >= r2) goto L69
            com.android.dx.ssa.SsaMethod r2 = r7.ssaMeth
            com.android.dx.ssa.SsaInsn r2 = r2.getDefinitionForRegister(r1)
            if (r2 == 0) goto L66
            com.android.dx.rop.code.Rop r3 = r2.getOpcode()
            if (r3 == 0) goto L66
            com.android.dx.rop.code.Rop r3 = r2.getOpcode()
            int r3 = r3.getOpcode()
            r4 = 2
            if (r3 == r4) goto L24
            goto L66
        L24:
            com.android.dx.ssa.SsaMethod r3 = r7.ssaMeth
            java.util.ArrayList[] r3 = r3.getUseListCopy()
            com.android.dx.rop.code.RegisterSpecList r4 = r2.getSources()
            com.android.dx.rop.code.RegisterSpec r4 = r4.get(r0)
            com.android.dx.rop.code.RegisterSpec r2 = r2.getResult()
            int r5 = r4.getReg()
            int r6 = r7.regCount
            if (r5 >= r6) goto L47
            int r5 = r2.getReg()
            int r6 = r7.regCount
            if (r5 >= r6) goto L47
            goto L66
        L47:
            com.android.dx.ssa.EscapeAnalysis$1 r5 = new com.android.dx.ssa.EscapeAnalysis$1
            r5.<init>(r7, r2, r4)
            int r2 = r2.getReg()
            r2 = r3[r2]
            java.util.Iterator r2 = r2.iterator()
        L56:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L66
            java.lang.Object r3 = r2.next()
            com.android.dx.ssa.SsaInsn r3 = (com.android.dx.ssa.SsaInsn) r3
            r3.mapSourceRegisters(r5)
            goto L56
        L66:
            int r1 = r1 + 1
            goto L2
        L69:
            return
    }

    public static void process(com.android.dx.ssa.SsaMethod r1) {
            com.android.dx.ssa.EscapeAnalysis r0 = new com.android.dx.ssa.EscapeAnalysis
            r0.<init>(r1)
            r0.run()
            return
    }

    private void processInsn(com.android.dx.ssa.SsaInsn r5) {
            r4 = this;
            com.android.dx.rop.code.Rop r0 = r5.getOpcode()
            int r0 = r0.getOpcode()
            com.android.dx.rop.code.RegisterSpec r1 = r5.getResult()
            r2 = 56
            r3 = 9
            if (r0 != r2) goto L24
            com.android.dx.rop.type.TypeBearer r2 = r1.getTypeBearer()
            int r2 = r2.getBasicType()
            if (r2 != r3) goto L24
            com.android.dx.ssa.EscapeAnalysis$EscapeSet r5 = r4.processMoveResultPseudoInsn(r5)
            r4.processRegister(r1, r5)
            goto L6a
        L24:
            r5 = 3
            if (r0 != r5) goto L47
            com.android.dx.rop.type.TypeBearer r5 = r1.getTypeBearer()
            int r5 = r5.getBasicType()
            if (r5 != r3) goto L47
            com.android.dx.ssa.EscapeAnalysis$EscapeSet r5 = new com.android.dx.ssa.EscapeAnalysis$EscapeSet
            int r0 = r1.getReg()
            int r2 = r4.regCount
            com.android.dx.ssa.EscapeAnalysis$EscapeState r3 = com.android.dx.ssa.EscapeAnalysis.EscapeState.NONE
            r5.<init>(r0, r2, r3)
            java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis$EscapeSet> r0 = r4.latticeValues
            r0.add(r5)
            r4.processRegister(r1, r5)
            goto L6a
        L47:
            r5 = 55
            if (r0 != r5) goto L6a
            com.android.dx.rop.type.TypeBearer r5 = r1.getTypeBearer()
            int r5 = r5.getBasicType()
            if (r5 != r3) goto L6a
            com.android.dx.ssa.EscapeAnalysis$EscapeSet r5 = new com.android.dx.ssa.EscapeAnalysis$EscapeSet
            int r0 = r1.getReg()
            int r2 = r4.regCount
            com.android.dx.ssa.EscapeAnalysis$EscapeState r3 = com.android.dx.ssa.EscapeAnalysis.EscapeState.NONE
            r5.<init>(r0, r2, r3)
            java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis$EscapeSet> r0 = r4.latticeValues
            r0.add(r5)
            r4.processRegister(r1, r5)
        L6a:
            return
    }

    private com.android.dx.ssa.EscapeAnalysis.EscapeSet processMoveResultPseudoInsn(com.android.dx.ssa.SsaInsn r5) {
            r4 = this;
            com.android.dx.rop.code.RegisterSpec r0 = r5.getResult()
            com.android.dx.ssa.SsaInsn r5 = r4.getInsnForMove(r5)
            com.android.dx.rop.code.Rop r1 = r5.getOpcode()
            int r1 = r1.getOpcode()
            r2 = 5
            if (r1 == r2) goto Laf
            r2 = 38
            r3 = 0
            if (r1 == r2) goto L65
            r2 = 45
            if (r1 == r2) goto L65
            r2 = 46
            if (r1 == r2) goto L57
            switch(r1) {
                case 40: goto Laf;
                case 41: goto L25;
                case 42: goto L25;
                case 43: goto L65;
                default: goto L23;
            }
        L23:
            r5 = 0
            return r5
        L25:
            com.android.dx.rop.code.RegisterSpecList r5 = r5.getSources()
            com.android.dx.rop.code.RegisterSpec r5 = r5.get(r3)
            com.android.dx.rop.type.TypeBearer r5 = r5.getTypeBearer()
            boolean r5 = r5.isConstant()
            if (r5 == 0) goto L49
            com.android.dx.ssa.EscapeAnalysis$EscapeSet r5 = new com.android.dx.ssa.EscapeAnalysis$EscapeSet
            int r0 = r0.getReg()
            int r1 = r4.regCount
            com.android.dx.ssa.EscapeAnalysis$EscapeState r2 = com.android.dx.ssa.EscapeAnalysis.EscapeState.NONE
            r5.<init>(r0, r1, r2)
            r0 = 1
            r5.replaceableArray = r0
            goto Lbc
        L49:
            com.android.dx.ssa.EscapeAnalysis$EscapeSet r5 = new com.android.dx.ssa.EscapeAnalysis$EscapeSet
            int r0 = r0.getReg()
            int r1 = r4.regCount
            com.android.dx.ssa.EscapeAnalysis$EscapeState r2 = com.android.dx.ssa.EscapeAnalysis.EscapeState.GLOBAL
            r5.<init>(r0, r1, r2)
            goto Lbc
        L57:
            com.android.dx.ssa.EscapeAnalysis$EscapeSet r5 = new com.android.dx.ssa.EscapeAnalysis$EscapeSet
            int r0 = r0.getReg()
            int r1 = r4.regCount
            com.android.dx.ssa.EscapeAnalysis$EscapeState r2 = com.android.dx.ssa.EscapeAnalysis.EscapeState.GLOBAL
            r5.<init>(r0, r1, r2)
            goto Lbc
        L65:
            com.android.dx.rop.code.RegisterSpecList r5 = r5.getSources()
            com.android.dx.rop.code.RegisterSpec r5 = r5.get(r3)
            int r1 = r4.findSetIndex(r5)
            java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis$EscapeSet> r2 = r4.latticeValues
            int r2 = r2.size()
            if (r1 == r2) goto L8b
            java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis$EscapeSet> r5 = r4.latticeValues
            java.lang.Object r5 = r5.get(r1)
            com.android.dx.ssa.EscapeAnalysis$EscapeSet r5 = (com.android.dx.ssa.EscapeAnalysis.EscapeSet) r5
            java.util.BitSet r1 = r5.regSet
            int r0 = r0.getReg()
            r1.set(r0)
            return r5
        L8b:
            com.android.dx.rop.type.Type r5 = r5.getType()
            com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.KNOWN_NULL
            if (r5 != r1) goto La1
            com.android.dx.ssa.EscapeAnalysis$EscapeSet r5 = new com.android.dx.ssa.EscapeAnalysis$EscapeSet
            int r0 = r0.getReg()
            int r1 = r4.regCount
            com.android.dx.ssa.EscapeAnalysis$EscapeState r2 = com.android.dx.ssa.EscapeAnalysis.EscapeState.NONE
            r5.<init>(r0, r1, r2)
            goto Lbc
        La1:
            com.android.dx.ssa.EscapeAnalysis$EscapeSet r5 = new com.android.dx.ssa.EscapeAnalysis$EscapeSet
            int r0 = r0.getReg()
            int r1 = r4.regCount
            com.android.dx.ssa.EscapeAnalysis$EscapeState r2 = com.android.dx.ssa.EscapeAnalysis.EscapeState.GLOBAL
            r5.<init>(r0, r1, r2)
            goto Lbc
        Laf:
            com.android.dx.ssa.EscapeAnalysis$EscapeSet r5 = new com.android.dx.ssa.EscapeAnalysis$EscapeSet
            int r0 = r0.getReg()
            int r1 = r4.regCount
            com.android.dx.ssa.EscapeAnalysis$EscapeState r2 = com.android.dx.ssa.EscapeAnalysis.EscapeState.NONE
            r5.<init>(r0, r1, r2)
        Lbc:
            java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis$EscapeSet> r0 = r4.latticeValues
            r0.add(r5)
            return r5
    }

    private void processPhiUse(com.android.dx.ssa.SsaInsn r3, com.android.dx.ssa.EscapeAnalysis.EscapeSet r4, java.util.ArrayList<com.android.dx.rop.code.RegisterSpec> r5) {
            r2 = this;
            com.android.dx.rop.code.RegisterSpec r0 = r3.getResult()
            int r0 = r2.findSetIndex(r0)
            java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis$EscapeSet> r1 = r2.latticeValues
            int r1 = r1.size()
            if (r0 == r1) goto L3b
            java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis$EscapeSet> r3 = r2.latticeValues
            java.lang.Object r3 = r3.get(r0)
            com.android.dx.ssa.EscapeAnalysis$EscapeSet r3 = (com.android.dx.ssa.EscapeAnalysis.EscapeSet) r3
            if (r3 == r4) goto L4f
            r5 = 0
            r4.replaceableArray = r5
            java.util.BitSet r5 = r4.regSet
            java.util.BitSet r1 = r3.regSet
            r5.or(r1)
            com.android.dx.ssa.EscapeAnalysis$EscapeState r5 = r4.escape
            com.android.dx.ssa.EscapeAnalysis$EscapeState r1 = r3.escape
            int r5 = r5.compareTo(r1)
            if (r5 >= 0) goto L32
            com.android.dx.ssa.EscapeAnalysis$EscapeState r5 = r3.escape
            r4.escape = r5
        L32:
            r2.replaceNode(r4, r3)
            java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis$EscapeSet> r3 = r2.latticeValues
            r3.remove(r0)
            goto L4f
        L3b:
            java.util.BitSet r4 = r4.regSet
            com.android.dx.rop.code.RegisterSpec r0 = r3.getResult()
            int r0 = r0.getReg()
            r4.set(r0)
            com.android.dx.rop.code.RegisterSpec r3 = r3.getResult()
            r5.add(r3)
        L4f:
            return
    }

    private void processRegister(com.android.dx.rop.code.RegisterSpec r5, com.android.dx.ssa.EscapeAnalysis.EscapeSet r6) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r5)
        L8:
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L42
            int r5 = r0.size()
            int r5 = r5 + (-1)
            java.lang.Object r5 = r0.remove(r5)
            com.android.dx.rop.code.RegisterSpec r5 = (com.android.dx.rop.code.RegisterSpec) r5
            com.android.dx.ssa.SsaMethod r1 = r4.ssaMeth
            int r2 = r5.getReg()
            java.util.List r1 = r1.getUseListForRegister(r2)
            java.util.Iterator r1 = r1.iterator()
        L28:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8
            java.lang.Object r2 = r1.next()
            com.android.dx.ssa.SsaInsn r2 = (com.android.dx.ssa.SsaInsn) r2
            com.android.dx.rop.code.Rop r3 = r2.getOpcode()
            if (r3 != 0) goto L3e
            r4.processPhiUse(r2, r6, r0)
            goto L28
        L3e:
            r4.processUse(r5, r2, r6, r0)
            goto L28
        L42:
            return
    }

    private void processUse(com.android.dx.rop.code.RegisterSpec r5, com.android.dx.ssa.SsaInsn r6, com.android.dx.ssa.EscapeAnalysis.EscapeSet r7, java.util.ArrayList<com.android.dx.rop.code.RegisterSpec> r8) {
            r4 = this;
            com.android.dx.rop.code.Rop r0 = r6.getOpcode()
            int r0 = r0.getOpcode()
            r1 = 2
            if (r0 == r1) goto Lec
            r8 = 33
            if (r0 == r8) goto Le7
            r8 = 35
            if (r0 == r8) goto Le7
            r8 = 43
            if (r0 == r8) goto Lda
            r8 = 7
            if (r0 == r8) goto Lda
            r8 = 8
            if (r0 == r8) goto Lda
            r8 = 38
            r2 = 1
            r3 = 0
            if (r0 == r8) goto Lc5
            r8 = 39
            if (r0 == r8) goto L33
            switch(r0) {
                case 47: goto L47;
                case 48: goto L2d;
                case 49: goto Le7;
                case 50: goto Le7;
                case 51: goto Le7;
                case 52: goto Le7;
                case 53: goto Le7;
                default: goto L2b;
            }
        L2b:
            goto L100
        L2d:
            com.android.dx.ssa.EscapeAnalysis$EscapeState r5 = com.android.dx.ssa.EscapeAnalysis.EscapeState.GLOBAL
            r7.escape = r5
            goto L100
        L33:
            com.android.dx.rop.code.RegisterSpecList r8 = r6.getSources()
            com.android.dx.rop.code.RegisterSpec r8 = r8.get(r1)
            com.android.dx.rop.type.TypeBearer r8 = r8.getTypeBearer()
            boolean r8 = r8.isConstant()
            if (r8 != 0) goto L47
            r7.replaceableArray = r3
        L47:
            com.android.dx.rop.code.RegisterSpecList r8 = r6.getSources()
            com.android.dx.rop.code.RegisterSpec r8 = r8.get(r3)
            com.android.dx.rop.type.TypeBearer r8 = r8.getTypeBearer()
            int r8 = r8.getBasicType()
            r0 = 9
            if (r8 == r0) goto L5d
            goto L100
        L5d:
            r7.replaceableArray = r3
            com.android.dx.rop.code.RegisterSpecList r6 = r6.getSources()
            com.android.dx.rop.code.RegisterSpec r8 = r6.get(r3)
            int r8 = r8.getReg()
            int r5 = r5.getReg()
            if (r8 != r5) goto L9b
            com.android.dx.rop.code.RegisterSpec r5 = r6.get(r2)
            int r5 = r4.findSetIndex(r5)
            java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis$EscapeSet> r6 = r4.latticeValues
            int r6 = r6.size()
            if (r5 == r6) goto L100
            java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis$EscapeSet> r6 = r4.latticeValues
            java.lang.Object r5 = r6.get(r5)
            com.android.dx.ssa.EscapeAnalysis$EscapeSet r5 = (com.android.dx.ssa.EscapeAnalysis.EscapeSet) r5
            r4.addEdge(r5, r7)
            com.android.dx.ssa.EscapeAnalysis$EscapeState r6 = r7.escape
            com.android.dx.ssa.EscapeAnalysis$EscapeState r8 = r5.escape
            int r6 = r6.compareTo(r8)
            if (r6 >= 0) goto L100
            com.android.dx.ssa.EscapeAnalysis$EscapeState r5 = r5.escape
            r7.escape = r5
            goto L100
        L9b:
            com.android.dx.rop.code.RegisterSpec r5 = r6.get(r3)
            int r5 = r4.findSetIndex(r5)
            java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis$EscapeSet> r6 = r4.latticeValues
            int r6 = r6.size()
            if (r5 == r6) goto L100
            java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis$EscapeSet> r6 = r4.latticeValues
            java.lang.Object r5 = r6.get(r5)
            com.android.dx.ssa.EscapeAnalysis$EscapeSet r5 = (com.android.dx.ssa.EscapeAnalysis.EscapeSet) r5
            r4.addEdge(r7, r5)
            com.android.dx.ssa.EscapeAnalysis$EscapeState r6 = r5.escape
            com.android.dx.ssa.EscapeAnalysis$EscapeState r8 = r7.escape
            int r6 = r6.compareTo(r8)
            if (r6 >= 0) goto L100
            com.android.dx.ssa.EscapeAnalysis$EscapeState r6 = r7.escape
            r5.escape = r6
            goto L100
        Lc5:
            com.android.dx.rop.code.RegisterSpecList r5 = r6.getSources()
            com.android.dx.rop.code.RegisterSpec r5 = r5.get(r2)
            com.android.dx.rop.type.TypeBearer r5 = r5.getTypeBearer()
            boolean r5 = r5.isConstant()
            if (r5 != 0) goto L100
            r7.replaceableArray = r3
            goto L100
        Lda:
            com.android.dx.ssa.EscapeAnalysis$EscapeState r5 = r7.escape
            com.android.dx.ssa.EscapeAnalysis$EscapeState r6 = com.android.dx.ssa.EscapeAnalysis.EscapeState.METHOD
            int r5 = r5.compareTo(r6)
            if (r5 >= 0) goto L100
            r7.escape = r6
            goto L100
        Le7:
            com.android.dx.ssa.EscapeAnalysis$EscapeState r5 = com.android.dx.ssa.EscapeAnalysis.EscapeState.INTER
            r7.escape = r5
            goto L100
        Lec:
            java.util.BitSet r5 = r7.regSet
            com.android.dx.rop.code.RegisterSpec r7 = r6.getResult()
            int r7 = r7.getReg()
            r5.set(r7)
            com.android.dx.rop.code.RegisterSpec r5 = r6.getResult()
            r8.add(r5)
        L100:
            return
    }

    private void replaceDef(com.android.dx.ssa.SsaInsn r9, com.android.dx.ssa.SsaInsn r10, int r11, java.util.ArrayList<com.android.dx.rop.code.RegisterSpec> r12) {
            r8 = this;
            com.android.dx.rop.code.RegisterSpec r10 = r9.getResult()
            com.android.dx.rop.type.Type r10 = r10.getType()
            r0 = 0
        L9:
            if (r0 >= r11) goto L2e
            com.android.dx.rop.type.Type r1 = r10.getComponentType()
            com.android.dx.rop.cst.Constant r7 = com.android.dx.rop.cst.Zeroes.zeroFor(r1)
            r1 = r7
            com.android.dx.rop.cst.TypedConstant r1 = (com.android.dx.rop.cst.TypedConstant) r1
            com.android.dx.ssa.SsaMethod r2 = r8.ssaMeth
            int r2 = r2.makeNewSsaReg()
            com.android.dx.rop.code.RegisterSpec r5 = com.android.dx.rop.code.RegisterSpec.make(r2, r1)
            r12.add(r5)
            com.android.dx.rop.code.RegisterSpecList r4 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            r6 = 5
            r2 = r8
            r3 = r9
            r2.insertPlainInsnBefore(r3, r4, r5, r6, r7)
            int r0 = r0 + 1
            goto L9
        L2e:
            return
    }

    private void replaceNode(com.android.dx.ssa.EscapeAnalysis.EscapeSet r4, com.android.dx.ssa.EscapeAnalysis.EscapeSet r5) {
            r3 = this;
            java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis$EscapeSet> r0 = r5.parentSets
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            com.android.dx.ssa.EscapeAnalysis$EscapeSet r1 = (com.android.dx.ssa.EscapeAnalysis.EscapeSet) r1
            java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis$EscapeSet> r2 = r1.childSets
            r2.remove(r5)
            java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis$EscapeSet> r2 = r1.childSets
            r2.add(r4)
            java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis$EscapeSet> r2 = r4.parentSets
            r2.add(r1)
            goto L6
        L22:
            java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis$EscapeSet> r0 = r5.childSets
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r0.next()
            com.android.dx.ssa.EscapeAnalysis$EscapeSet r1 = (com.android.dx.ssa.EscapeAnalysis.EscapeSet) r1
            java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis$EscapeSet> r2 = r1.parentSets
            r2.remove(r5)
            java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis$EscapeSet> r2 = r1.parentSets
            r2.add(r4)
            java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis$EscapeSet> r2 = r4.childSets
            r2.add(r1)
            goto L28
        L44:
            return
    }

    private void replaceUse(com.android.dx.ssa.SsaInsn r11, com.android.dx.ssa.SsaInsn r12, java.util.ArrayList<com.android.dx.rop.code.RegisterSpec> r13, java.util.HashSet<com.android.dx.ssa.SsaInsn> r14) {
            r10 = this;
            int r0 = r13.size()
            com.android.dx.rop.code.Rop r1 = r11.getOpcode()
            int r1 = r1.getOpcode()
            r2 = 34
            r3 = 0
            if (r1 == r2) goto Leb
            r12 = 57
            if (r1 == r12) goto Lb5
            r12 = 38
            r2 = 2
            if (r1 == r12) goto L64
            r12 = 39
            if (r1 == r12) goto L20
            goto L10d
        L20:
            com.android.dx.rop.code.RegisterSpecList r12 = r11.getSources()
            com.android.dx.rop.code.RegisterSpec r1 = r12.get(r2)
            com.android.dx.rop.type.TypeBearer r1 = r1.getTypeBearer()
            com.android.dx.rop.cst.CstLiteralBits r1 = (com.android.dx.rop.cst.CstLiteralBits) r1
            int r1 = r1.getIntBits()
            if (r1 >= r0) goto L5b
            com.android.dx.rop.code.RegisterSpec r12 = r12.get(r3)
            java.lang.Object r14 = r13.get(r1)
            com.android.dx.rop.code.RegisterSpec r14 = (com.android.dx.rop.code.RegisterSpec) r14
            int r14 = r14.getReg()
            com.android.dx.rop.code.RegisterSpec r14 = r12.withReg(r14)
            com.android.dx.rop.code.RegisterSpecList r4 = com.android.dx.rop.code.RegisterSpecList.make(r12)
            r6 = 2
            r7 = 0
            r2 = r10
            r3 = r11
            r5 = r14
            r2.insertPlainInsnBefore(r3, r4, r5, r6, r7)
            com.android.dx.rop.code.RegisterSpec r11 = r14.withSimpleType()
            r13.set(r1, r11)
            goto L10d
        L5b:
            com.android.dx.rop.code.RegisterSpec r12 = r12.get(r2)
            r10.insertExceptionThrow(r11, r12, r14)
            goto L10d
        L64:
            com.android.dx.ssa.SsaInsn r12 = r10.getMoveForInsn(r11)
            com.android.dx.rop.code.RegisterSpecList r11 = r11.getSources()
            r1 = 1
            com.android.dx.rop.code.RegisterSpec r3 = r11.get(r1)
            com.android.dx.rop.type.TypeBearer r3 = r3.getTypeBearer()
            com.android.dx.rop.cst.CstLiteralBits r3 = (com.android.dx.rop.cst.CstLiteralBits) r3
            int r3 = r3.getIntBits()
            if (r3 >= r0) goto L9b
            java.lang.Object r11 = r13.get(r3)
            com.android.dx.rop.code.RegisterSpec r11 = (com.android.dx.rop.code.RegisterSpec) r11
            com.android.dx.rop.code.RegisterSpec r13 = r12.getResult()
            int r13 = r13.getReg()
            com.android.dx.rop.code.RegisterSpec r3 = r11.withReg(r13)
            com.android.dx.rop.code.RegisterSpecList r2 = com.android.dx.rop.code.RegisterSpecList.make(r11)
            r4 = 2
            r5 = 0
            r0 = r10
            r1 = r12
            r0.insertPlainInsnBefore(r1, r2, r3, r4, r5)
            goto Lb1
        L9b:
            com.android.dx.rop.code.RegisterSpec r11 = r11.get(r1)
            r10.insertExceptionThrow(r12, r11, r14)
            com.android.dx.ssa.SsaBasicBlock r11 = r12.getBlock()
            java.util.ArrayList r11 = r11.getInsns()
            java.lang.Object r11 = r11.get(r2)
            r14.add(r11)
        Lb1:
            r14.add(r12)
            goto L10d
        Lb5:
            com.android.dx.rop.code.Insn r12 = r11.getOriginalRopInsn()
            com.android.dx.rop.code.FillArrayDataInsn r12 = (com.android.dx.rop.code.FillArrayDataInsn) r12
            java.util.ArrayList r12 = r12.getInitValues()
        Lbf:
            if (r3 >= r0) goto L10d
            java.lang.Object r14 = r13.get(r3)
            com.android.dx.rop.code.RegisterSpec r14 = (com.android.dx.rop.code.RegisterSpec) r14
            int r14 = r14.getReg()
            java.lang.Object r1 = r12.get(r3)
            com.android.dx.rop.type.TypeBearer r1 = (com.android.dx.rop.type.TypeBearer) r1
            com.android.dx.rop.code.RegisterSpec r14 = com.android.dx.rop.code.RegisterSpec.make(r14, r1)
            com.android.dx.rop.code.RegisterSpecList r6 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            java.lang.Object r1 = r12.get(r3)
            r9 = r1
            com.android.dx.rop.cst.Constant r9 = (com.android.dx.rop.cst.Constant) r9
            r8 = 5
            r4 = r10
            r5 = r11
            r7 = r14
            r4.insertPlainInsnBefore(r5, r6, r7, r8, r9)
            r13.set(r3, r14)
            int r3 = r3 + 1
            goto Lbf
        Leb:
            com.android.dx.rop.code.RegisterSpecList r12 = r12.getSources()
            com.android.dx.rop.code.RegisterSpec r12 = r12.get(r3)
            com.android.dx.rop.type.TypeBearer r12 = r12.getTypeBearer()
            com.android.dx.ssa.SsaInsn r11 = r10.getMoveForInsn(r11)
            com.android.dx.rop.code.RegisterSpecList r2 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            com.android.dx.rop.code.RegisterSpec r3 = r11.getResult()
            r4 = 5
            r5 = r12
            com.android.dx.rop.cst.Constant r5 = (com.android.dx.rop.cst.Constant) r5
            r0 = r10
            r1 = r11
            r0.insertPlainInsnBefore(r1, r2, r3, r4, r5)
            r14.add(r11)
        L10d:
            return
    }

    private void run() {
            r6 = this;
            com.android.dx.ssa.SsaMethod r0 = r6.ssaMeth
            com.android.dx.ssa.EscapeAnalysis$2 r1 = new com.android.dx.ssa.EscapeAnalysis$2
            r1.<init>(r6)
            r0.forEachBlockDepthFirstDom(r1)
            java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis$EscapeSet> r0 = r6.latticeValues
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L43
            java.lang.Object r1 = r0.next()
            com.android.dx.ssa.EscapeAnalysis$EscapeSet r1 = (com.android.dx.ssa.EscapeAnalysis.EscapeSet) r1
            com.android.dx.ssa.EscapeAnalysis$EscapeState r2 = r1.escape
            com.android.dx.ssa.EscapeAnalysis$EscapeState r3 = com.android.dx.ssa.EscapeAnalysis.EscapeState.NONE
            if (r2 == r3) goto L10
            java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis$EscapeSet> r2 = r1.childSets
            java.util.Iterator r2 = r2.iterator()
        L28:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L10
            java.lang.Object r3 = r2.next()
            com.android.dx.ssa.EscapeAnalysis$EscapeSet r3 = (com.android.dx.ssa.EscapeAnalysis.EscapeSet) r3
            com.android.dx.ssa.EscapeAnalysis$EscapeState r4 = r1.escape
            com.android.dx.ssa.EscapeAnalysis$EscapeState r5 = r3.escape
            int r4 = r4.compareTo(r5)
            if (r4 <= 0) goto L28
            com.android.dx.ssa.EscapeAnalysis$EscapeState r4 = r1.escape
            r3.escape = r4
            goto L28
        L43:
            r6.scalarReplacement()
            return
    }

    private void scalarReplacement() {
            r7 = this;
            java.util.ArrayList<com.android.dx.ssa.EscapeAnalysis$EscapeSet> r0 = r7.latticeValues
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L85
            java.lang.Object r1 = r0.next()
            com.android.dx.ssa.EscapeAnalysis$EscapeSet r1 = (com.android.dx.ssa.EscapeAnalysis.EscapeSet) r1
            boolean r2 = r1.replaceableArray
            if (r2 == 0) goto L6
            com.android.dx.ssa.EscapeAnalysis$EscapeState r2 = r1.escape
            com.android.dx.ssa.EscapeAnalysis$EscapeState r3 = com.android.dx.ssa.EscapeAnalysis.EscapeState.NONE
            if (r2 == r3) goto L1d
            goto L6
        L1d:
            java.util.BitSet r1 = r1.regSet
            r2 = 0
            int r1 = r1.nextSetBit(r2)
            com.android.dx.ssa.SsaMethod r3 = r7.ssaMeth
            com.android.dx.ssa.SsaInsn r3 = r3.getDefinitionForRegister(r1)
            com.android.dx.ssa.SsaInsn r4 = r7.getInsnForMove(r3)
            com.android.dx.rop.code.RegisterSpecList r5 = r4.getSources()
            com.android.dx.rop.code.RegisterSpec r2 = r5.get(r2)
            com.android.dx.rop.type.TypeBearer r2 = r2.getTypeBearer()
            com.android.dx.rop.cst.CstLiteralBits r2 = (com.android.dx.rop.cst.CstLiteralBits) r2
            int r2 = r2.getIntBits()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r2)
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r7.replaceDef(r3, r4, r2, r5)
            r6.add(r4)
            r6.add(r3)
            com.android.dx.ssa.SsaMethod r2 = r7.ssaMeth
            java.util.List r1 = r2.getUseListForRegister(r1)
            java.util.Iterator r1 = r1.iterator()
        L5d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L70
            java.lang.Object r2 = r1.next()
            com.android.dx.ssa.SsaInsn r2 = (com.android.dx.ssa.SsaInsn) r2
            r7.replaceUse(r2, r4, r5, r6)
            r6.add(r2)
            goto L5d
        L70:
            com.android.dx.ssa.SsaMethod r1 = r7.ssaMeth
            r1.deleteInsns(r6)
            com.android.dx.ssa.SsaMethod r1 = r7.ssaMeth
            r1.onInsnsChanged()
            com.android.dx.ssa.SsaMethod r1 = r7.ssaMeth
            int r2 = r7.regCount
            com.android.dx.ssa.SsaConverter.updateSsaMethod(r1, r2)
            r7.movePropagate()
            goto L6
        L85:
            return
    }
}
