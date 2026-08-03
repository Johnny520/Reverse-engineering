package com.android.dx.ssa;

/* JADX INFO: loaded from: classes.dex */
public class ConstCollector {
    private static final boolean COLLECT_ONE_LOCAL = false;
    private static final boolean COLLECT_STRINGS = false;
    private static final int MAX_COLLECTED_CONSTANTS = 5;
    private final com.android.dx.ssa.SsaMethod ssaMeth;



    private ConstCollector(com.android.dx.ssa.SsaMethod r1) {
            r0 = this;
            r0.<init>()
            r0.ssaMeth = r1
            return
    }

    public static /* synthetic */ com.android.dx.ssa.SsaMethod access$000(com.android.dx.ssa.ConstCollector r0) {
            com.android.dx.ssa.SsaMethod r0 = r0.ssaMeth
            return r0
    }

    private void fixLocalAssignment(com.android.dx.rop.code.RegisterSpec r7, com.android.dx.rop.code.RegisterSpec r8) {
            r6 = this;
            com.android.dx.ssa.SsaMethod r0 = r6.ssaMeth
            int r7 = r7.getReg()
            java.util.List r7 = r0.getUseListForRegister(r7)
            java.util.Iterator r7 = r7.iterator()
        Le:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r0 = r7.next()
            com.android.dx.ssa.SsaInsn r0 = (com.android.dx.ssa.SsaInsn) r0
            com.android.dx.rop.code.RegisterSpec r1 = r0.getLocalAssignment()
            if (r1 != 0) goto L21
            goto Le
        L21:
            com.android.dx.rop.code.RegisterSpec r2 = r0.getResult()
            if (r2 != 0) goto L28
            goto Le
        L28:
            com.android.dx.rop.code.LocalItem r1 = r1.getLocalItem()
            r2 = 0
            r0.setResultLocal(r2)
            com.android.dx.rop.code.RegisterSpec r8 = r8.withLocalItem(r1)
            com.android.dx.rop.code.PlainInsn r1 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.Rop r3 = com.android.dx.rop.code.Rops.opMarkLocal(r8)
            com.android.dx.rop.code.SourcePosition r4 = com.android.dx.rop.code.SourcePosition.NO_INFO
            com.android.dx.rop.code.RegisterSpecList r5 = com.android.dx.rop.code.RegisterSpecList.make(r8)
            r1.<init>(r3, r4, r2, r5)
            com.android.dx.ssa.SsaBasicBlock r2 = r0.getBlock()
            com.android.dx.ssa.SsaInsn r1 = com.android.dx.ssa.SsaInsn.makeFromRop(r1, r2)
            com.android.dx.ssa.SsaBasicBlock r2 = r0.getBlock()
            java.util.ArrayList r2 = r2.getInsns()
            int r0 = r2.indexOf(r0)
            int r0 = r0 + 1
            r2.add(r0, r1)
            goto Le
        L5d:
            return
    }

    private java.util.ArrayList<com.android.dx.rop.cst.TypedConstant> getConstsSortedByCountUse() {
            r10 = this;
            com.android.dx.ssa.SsaMethod r0 = r10.ssaMeth
            int r0 = r0.getRegCount()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r2 = 0
            r3 = r2
        L12:
            r4 = 1
            if (r3 >= r0) goto L9b
            com.android.dx.ssa.SsaMethod r5 = r10.ssaMeth
            com.android.dx.ssa.SsaInsn r5 = r5.getDefinitionForRegister(r3)
            if (r5 == 0) goto L97
            com.android.dx.rop.code.Rop r6 = r5.getOpcode()
            if (r6 != 0) goto L25
            goto L97
        L25:
            com.android.dx.rop.code.RegisterSpec r6 = r5.getResult()
            com.android.dx.rop.type.TypeBearer r7 = r6.getTypeBearer()
            boolean r8 = r7.isConstant()
            if (r8 != 0) goto L34
            goto L97
        L34:
            com.android.dx.rop.cst.TypedConstant r7 = (com.android.dx.rop.cst.TypedConstant) r7
            com.android.dx.rop.code.Rop r8 = r5.getOpcode()
            int r8 = r8.getOpcode()
            r9 = 56
            if (r8 != r9) goto L69
            com.android.dx.ssa.SsaBasicBlock r5 = r5.getBlock()
            java.util.BitSet r5 = r5.getPredecessors()
            int r5 = r5.nextSetBit(r2)
            com.android.dx.ssa.SsaMethod r8 = r10.ssaMeth
            java.util.ArrayList r8 = r8.getBlocks()
            java.lang.Object r5 = r8.get(r5)
            com.android.dx.ssa.SsaBasicBlock r5 = (com.android.dx.ssa.SsaBasicBlock) r5
            java.util.ArrayList r5 = r5.getInsns()
            int r8 = r5.size()
            int r8 = r8 - r4
            java.lang.Object r5 = r5.get(r8)
            com.android.dx.ssa.SsaInsn r5 = (com.android.dx.ssa.SsaInsn) r5
        L69:
            boolean r5 = r5.canThrow()
            if (r5 == 0) goto L72
            boolean r4 = r7 instanceof com.android.dx.rop.cst.CstString
            goto L97
        L72:
            com.android.dx.ssa.SsaMethod r5 = r10.ssaMeth
            boolean r5 = r5.isRegALocal(r6)
            if (r5 == 0) goto L7b
            goto L97
        L7b:
            java.lang.Object r5 = r1.get(r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 != 0) goto L8b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.put(r7, r4)
            goto L97
        L8b:
            int r5 = r5.intValue()
            int r5 = r5 + r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r1.put(r7, r4)
        L97:
            int r3 = r3 + 1
            goto L12
        L9b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r2 = r1.entrySet()
            java.util.Iterator r2 = r2.iterator()
        La8:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lc8
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r5 = r3.getValue()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 <= r4) goto La8
            java.lang.Object r3 = r3.getKey()
            r0.add(r3)
            goto La8
        Lc8:
            com.android.dx.ssa.ConstCollector$1 r2 = new com.android.dx.ssa.ConstCollector$1
            r2.<init>(r10, r1)
            java.util.Collections.sort(r0, r2)
            return r0
    }

    public static void process(com.android.dx.ssa.SsaMethod r1) {
            com.android.dx.ssa.ConstCollector r0 = new com.android.dx.ssa.ConstCollector
            r0.<init>(r1)
            r0.run()
            return
    }

    private void run() {
            r20 = this;
            r0 = r20
            com.android.dx.ssa.SsaMethod r1 = r0.ssaMeth
            int r1 = r1.getRegCount()
            java.util.ArrayList r2 = r20.getConstsSortedByCountUse()
            int r3 = r2.size()
            r4 = 5
            int r3 = java.lang.Math.min(r3, r4)
            com.android.dx.ssa.SsaMethod r4 = r0.ssaMeth
            com.android.dx.ssa.SsaBasicBlock r4 = r4.getEntryBlock()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>(r3)
            r6 = 0
        L21:
            if (r6 >= r3) goto La9
            java.lang.Object r7 = r2.get(r6)
            com.android.dx.rop.cst.TypedConstant r7 = (com.android.dx.rop.cst.TypedConstant) r7
            com.android.dx.ssa.SsaMethod r8 = r0.ssaMeth
            int r8 = r8.makeNewSsaReg()
            com.android.dx.rop.code.RegisterSpec r14 = com.android.dx.rop.code.RegisterSpec.make(r8, r7)
            com.android.dx.rop.code.Rop r9 = com.android.dx.rop.code.Rops.opConst(r7)
            int r8 = r9.getBranchingness()
            r10 = 1
            if (r8 != r10) goto L58
            com.android.dx.rop.code.PlainCstInsn r15 = new com.android.dx.rop.code.PlainCstInsn
            com.android.dx.rop.code.Rop r9 = com.android.dx.rop.code.Rops.opConst(r7)
            com.android.dx.rop.code.SourcePosition r10 = com.android.dx.rop.code.SourcePosition.NO_INFO
            com.android.dx.rop.code.RegisterSpecList r12 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            r8 = r15
            r11 = r14
            r13 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            r4.addInsnToHead(r15)
            r18 = r2
            r19 = r3
            r16 = r4
            goto L9c
        L58:
            com.android.dx.ssa.SsaMethod r8 = r0.ssaMeth
            com.android.dx.ssa.SsaBasicBlock r8 = r8.getEntryBlock()
            com.android.dx.ssa.SsaBasicBlock r15 = r8.getPrimarySuccessor()
            com.android.dx.ssa.SsaBasicBlock r13 = r8.insertNewSuccessor(r15)
            com.android.dx.rop.code.ThrowingCstInsn r12 = new com.android.dx.rop.code.ThrowingCstInsn
            com.android.dx.rop.code.SourcePosition r11 = com.android.dx.rop.code.SourcePosition.NO_INFO
            com.android.dx.rop.code.RegisterSpecList r10 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            com.android.dx.rop.type.StdTypeList r16 = com.android.dx.rop.type.StdTypeList.EMPTY
            r8 = r12
            r17 = r10
            r10 = r11
            r18 = r2
            r2 = r11
            r11 = r17
            r19 = r3
            r3 = r12
            r12 = r16
            r16 = r4
            r4 = r13
            r13 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            r4.replaceLastInsn(r3)
            com.android.dx.ssa.SsaBasicBlock r3 = r4.insertNewSuccessor(r15)
            com.android.dx.rop.code.PlainInsn r4 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.type.TypeBearer r8 = r14.getTypeBearer()
            com.android.dx.rop.code.Rop r8 = com.android.dx.rop.code.Rops.opMoveResultPseudo(r8)
            r9 = r17
            r4.<init>(r8, r2, r14, r9)
            r3.addInsnToHead(r4)
        L9c:
            r5.put(r7, r14)
            int r6 = r6 + 1
            r4 = r16
            r2 = r18
            r3 = r19
            goto L21
        La9:
            r0.updateConstUses(r5, r1)
            return
    }

    private void updateConstUses(java.util.HashMap<com.android.dx.rop.cst.TypedConstant, com.android.dx.rop.code.RegisterSpec> r8, int r9) {
            r7 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.android.dx.ssa.SsaMethod r0 = r7.ssaMeth
            java.util.ArrayList[] r0 = r0.getUseListCopy()
            r1 = 0
        Lc:
            if (r1 >= r9) goto L76
            com.android.dx.ssa.SsaMethod r2 = r7.ssaMeth
            com.android.dx.ssa.SsaInsn r2 = r2.getDefinitionForRegister(r1)
            if (r2 != 0) goto L17
            goto L73
        L17:
            com.android.dx.rop.code.RegisterSpec r3 = r2.getResult()
            com.android.dx.rop.code.RegisterSpec r2 = r2.getResult()
            com.android.dx.rop.type.TypeBearer r2 = r2.getTypeBearer()
            boolean r4 = r2.isConstant()
            if (r4 != 0) goto L2a
            goto L73
        L2a:
            com.android.dx.rop.cst.TypedConstant r2 = (com.android.dx.rop.cst.TypedConstant) r2
            java.lang.Object r2 = r8.get(r2)
            com.android.dx.rop.code.RegisterSpec r2 = (com.android.dx.rop.code.RegisterSpec) r2
            if (r2 != 0) goto L35
            goto L73
        L35:
            com.android.dx.ssa.SsaMethod r4 = r7.ssaMeth
            boolean r4 = r4.isRegALocal(r3)
            if (r4 == 0) goto L3e
            goto L73
        L3e:
            com.android.dx.ssa.ConstCollector$2 r4 = new com.android.dx.ssa.ConstCollector$2
            r4.<init>(r7, r3, r2)
            int r2 = r3.getReg()
            r2 = r0[r2]
            java.util.Iterator r2 = r2.iterator()
        L4d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L73
            java.lang.Object r3 = r2.next()
            com.android.dx.ssa.SsaInsn r3 = (com.android.dx.ssa.SsaInsn) r3
            boolean r5 = r3.canThrow()
            if (r5 == 0) goto L6f
            com.android.dx.ssa.SsaBasicBlock r5 = r3.getBlock()
            java.util.BitSet r5 = r5.getSuccessors()
            int r5 = r5.cardinality()
            r6 = 1
            if (r5 <= r6) goto L6f
            goto L4d
        L6f:
            r3.mapSourceRegisters(r4)
            goto L4d
        L73:
            int r1 = r1 + 1
            goto Lc
        L76:
            return
    }
}
