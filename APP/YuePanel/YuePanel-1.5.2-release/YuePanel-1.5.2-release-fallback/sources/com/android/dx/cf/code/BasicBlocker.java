package com.android.dx.cf.code;

/* JADX INFO: loaded from: classes.dex */
public final class BasicBlocker implements com.android.dx.cf.code.BytecodeArray.Visitor {
    private final int[] blockSet;
    private final com.android.dx.cf.code.ByteCatchList[] catchLists;
    private final int[] liveSet;
    private final com.android.dx.cf.code.ConcreteMethod method;
    private int previousOffset;
    private final com.android.dx.util.IntList[] targetLists;
    private final int[] workSet;

    private BasicBlocker(com.android.dx.cf.code.ConcreteMethod r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L2f
            r1.method = r2
            com.android.dx.cf.code.BytecodeArray r2 = r2.getCode()
            int r2 = r2.size()
            int r2 = r2 + 1
            int[] r0 = com.android.dx.util.Bits.makeBitSet(r2)
            r1.workSet = r0
            int[] r0 = com.android.dx.util.Bits.makeBitSet(r2)
            r1.liveSet = r0
            int[] r0 = com.android.dx.util.Bits.makeBitSet(r2)
            r1.blockSet = r0
            com.android.dx.util.IntList[] r0 = new com.android.dx.util.IntList[r2]
            r1.targetLists = r0
            com.android.dx.cf.code.ByteCatchList[] r2 = new com.android.dx.cf.code.ByteCatchList[r2]
            r1.catchLists = r2
            r2 = -1
            r1.previousOffset = r2
            return
        L2f:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "method == null"
            r2.<init>(r0)
            throw r2
    }

    private void addWorkIfNecessary(int r2, boolean r3) {
            r1 = this;
            int[] r0 = r1.liveSet
            boolean r0 = com.android.dx.util.Bits.get(r0, r2)
            if (r0 != 0) goto Ld
            int[] r0 = r1.workSet
            com.android.dx.util.Bits.set(r0, r2)
        Ld:
            if (r3 == 0) goto L14
            int[] r3 = r1.blockSet
            com.android.dx.util.Bits.set(r3, r2)
        L14:
            return
    }

    private void doit() {
            r9 = this;
            com.android.dx.cf.code.ConcreteMethod r0 = r9.method
            com.android.dx.cf.code.BytecodeArray r0 = r0.getCode()
            com.android.dx.cf.code.ConcreteMethod r1 = r9.method
            com.android.dx.cf.code.ByteCatchList r1 = r1.getCatches()
            int r2 = r1.size()
            int[] r3 = r9.workSet
            r4 = 0
            com.android.dx.util.Bits.set(r3, r4)
            int[] r3 = r9.blockSet
            com.android.dx.util.Bits.set(r3, r4)
        L1b:
            int[] r3 = r9.workSet
            boolean r3 = com.android.dx.util.Bits.isEmpty(r3)
            if (r3 != 0) goto L5d
            int[] r3 = r9.workSet     // Catch: java.lang.IllegalArgumentException -> L54
            r0.processWorkSet(r3, r9)     // Catch: java.lang.IllegalArgumentException -> L54
            r3 = r4
        L29:
            if (r3 >= r2) goto L1b
            com.android.dx.cf.code.ByteCatchList$Item r5 = r1.get(r3)
            int r6 = r5.getStartPc()
            int r7 = r5.getEndPc()
            int[] r8 = r9.liveSet
            boolean r8 = com.android.dx.util.Bits.anyInRange(r8, r6, r7)
            if (r8 == 0) goto L51
            int[] r8 = r9.blockSet
            com.android.dx.util.Bits.set(r8, r6)
            int[] r6 = r9.blockSet
            com.android.dx.util.Bits.set(r6, r7)
            int r5 = r5.getHandlerPc()
            r6 = 1
            r9.addWorkIfNecessary(r5, r6)
        L51:
            int r3 = r3 + 1
            goto L29
        L54:
            r0 = move-exception
            com.android.dx.cf.code.SimException r1 = new com.android.dx.cf.code.SimException
            java.lang.String r2 = "flow of control falls off end of method"
            r1.<init>(r2, r0)
            throw r1
        L5d:
            return
    }

    private com.android.dx.cf.code.ByteBlockList getBlockList() {
            r11 = this;
            com.android.dx.cf.code.ConcreteMethod r0 = r11.method
            com.android.dx.cf.code.BytecodeArray r0 = r0.getCode()
            int r0 = r0.size()
            com.android.dx.cf.code.ByteBlock[] r0 = new com.android.dx.cf.code.ByteBlock[r0]
            r1 = 0
            r4 = r1
            r8 = r4
        Lf:
            int[] r2 = r11.blockSet
            int r3 = r4 + 1
            int r9 = com.android.dx.util.Bits.findFirst(r2, r3)
            if (r9 >= 0) goto L29
            com.android.dx.cf.code.ByteBlockList r2 = new com.android.dx.cf.code.ByteBlockList
            r2.<init>(r8)
        L1e:
            if (r1 >= r8) goto L28
            r3 = r0[r1]
            r2.set(r1, r3)
            int r1 = r1 + 1
            goto L1e
        L28:
            return r2
        L29:
            int[] r2 = r11.liveSet
            boolean r2 = com.android.dx.util.Bits.get(r2, r4)
            if (r2 == 0) goto L62
            int r2 = r9 + (-1)
            r3 = 0
        L34:
            if (r2 < r4) goto L40
            com.android.dx.util.IntList[] r3 = r11.targetLists
            r3 = r3[r2]
            if (r3 == 0) goto L3d
            goto L41
        L3d:
            int r2 = r2 + (-1)
            goto L34
        L40:
            r2 = -1
        L41:
            if (r3 != 0) goto L4c
            com.android.dx.util.IntList r2 = com.android.dx.util.IntList.makeImmutable(r9)
            com.android.dx.cf.code.ByteCatchList r3 = com.android.dx.cf.code.ByteCatchList.EMPTY
            r6 = r2
            r7 = r3
            goto L56
        L4c:
            com.android.dx.cf.code.ByteCatchList[] r5 = r11.catchLists
            r2 = r5[r2]
            if (r2 != 0) goto L54
            com.android.dx.cf.code.ByteCatchList r2 = com.android.dx.cf.code.ByteCatchList.EMPTY
        L54:
            r7 = r2
            r6 = r3
        L56:
            com.android.dx.cf.code.ByteBlock r10 = new com.android.dx.cf.code.ByteBlock
            r2 = r10
            r3 = r4
            r5 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r0[r8] = r10
            int r8 = r8 + 1
        L62:
            r4 = r9
            goto Lf
    }

    public static com.android.dx.cf.code.ByteBlockList identifyBlocks(com.android.dx.cf.code.ConcreteMethod r1) {
            com.android.dx.cf.code.BasicBlocker r0 = new com.android.dx.cf.code.BasicBlocker
            r0.<init>(r1)
            r0.doit()
            com.android.dx.cf.code.ByteBlockList r1 = r0.getBlockList()
            return r1
    }

    private void visitCommon(int r2, int r3, boolean r4) {
            r1 = this;
            int[] r0 = r1.liveSet
            com.android.dx.util.Bits.set(r0, r2)
            if (r4 == 0) goto Ld
            int r2 = r2 + r3
            r3 = 0
            r1.addWorkIfNecessary(r2, r3)
            goto L13
        Ld:
            int[] r4 = r1.blockSet
            int r2 = r2 + r3
            com.android.dx.util.Bits.set(r4, r2)
        L13:
            return
    }

    private void visitThrowing(int r3, int r4, boolean r5) {
            r2 = this;
            int r4 = r4 + r3
            if (r5 == 0) goto L7
            r0 = 1
            r2.addWorkIfNecessary(r4, r0)
        L7:
            com.android.dx.cf.code.ConcreteMethod r0 = r2.method
            com.android.dx.cf.code.ByteCatchList r0 = r0.getCatches()
            com.android.dx.cf.code.ByteCatchList r0 = r0.listFor(r3)
            com.android.dx.cf.code.ByteCatchList[] r1 = r2.catchLists
            r1[r3] = r0
            com.android.dx.util.IntList[] r1 = r2.targetLists
            if (r5 == 0) goto L1a
            goto L1b
        L1a:
            r4 = -1
        L1b:
            com.android.dx.util.IntList r4 = r0.toTargetList(r4)
            r1[r3] = r4
            return
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public int getPreviousOffset() {
            r1 = this;
            int r0 = r1.previousOffset
            return r0
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void setPreviousOffset(int r1) {
            r0 = this;
            r0.previousOffset = r1
            return
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void visitBranch(int r3, int r4, int r5, int r6) {
            r2 = this;
            r0 = 167(0xa7, float:2.34E-43)
            r1 = 1
            if (r3 == r0) goto L1e
            r0 = 168(0xa8, float:2.35E-43)
            if (r3 == r0) goto La
            goto Ld
        La:
            r2.addWorkIfNecessary(r4, r1)
        Ld:
            int r3 = r4 + r5
            r2.visitCommon(r4, r5, r1)
            r2.addWorkIfNecessary(r3, r1)
            com.android.dx.util.IntList[] r5 = r2.targetLists
            com.android.dx.util.IntList r3 = com.android.dx.util.IntList.makeImmutable(r3, r6)
            r5[r4] = r3
            goto L2a
        L1e:
            r3 = 0
            r2.visitCommon(r4, r5, r3)
            com.android.dx.util.IntList[] r3 = r2.targetLists
            com.android.dx.util.IntList r5 = com.android.dx.util.IntList.makeImmutable(r6)
            r3[r4] = r5
        L2a:
            r2.addWorkIfNecessary(r6, r1)
            return
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void visitConstant(int r1, int r2, int r3, com.android.dx.rop.cst.Constant r4, int r5) {
            r0 = this;
            r1 = 1
            r0.visitCommon(r2, r3, r1)
            boolean r5 = r4 instanceof com.android.dx.rop.cst.CstMemberRef
            if (r5 != 0) goto L1c
            boolean r5 = r4 instanceof com.android.dx.rop.cst.CstType
            if (r5 != 0) goto L1c
            boolean r5 = r4 instanceof com.android.dx.rop.cst.CstString
            if (r5 != 0) goto L1c
            boolean r5 = r4 instanceof com.android.dx.rop.cst.CstInvokeDynamic
            if (r5 != 0) goto L1c
            boolean r5 = r4 instanceof com.android.dx.rop.cst.CstMethodHandle
            if (r5 != 0) goto L1c
            boolean r4 = r4 instanceof com.android.dx.rop.cst.CstProtoRef
            if (r4 == 0) goto L1f
        L1c:
            r0.visitThrowing(r2, r3, r1)
        L1f:
            return
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void visitInvalid(int r1, int r2, int r3) {
            r0 = this;
            r1 = 1
            r0.visitCommon(r2, r3, r1)
            return
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void visitLocal(int r1, int r2, int r3, int r4, com.android.dx.rop.type.Type r5, int r6) {
            r0 = this;
            r4 = 169(0xa9, float:2.37E-43)
            if (r1 != r4) goto Lf
            r1 = 0
            r0.visitCommon(r2, r3, r1)
            com.android.dx.util.IntList[] r1 = r0.targetLists
            com.android.dx.util.IntList r3 = com.android.dx.util.IntList.EMPTY
            r1[r2] = r3
            goto L13
        Lf:
            r1 = 1
            r0.visitCommon(r2, r3, r1)
        L13:
            return
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void visitNewarray(int r1, int r2, com.android.dx.rop.cst.CstType r3, java.util.ArrayList<com.android.dx.rop.cst.Constant> r4) {
            r0 = this;
            r3 = 1
            r0.visitCommon(r1, r2, r3)
            r0.visitThrowing(r1, r2, r3)
            return
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void visitNoArgs(int r3, int r4, int r5, com.android.dx.rop.type.Type r6) {
            r2 = this;
            r0 = 108(0x6c, float:1.51E-43)
            r1 = 1
            if (r3 == r0) goto L44
            r0 = 112(0x70, float:1.57E-43)
            if (r3 == r0) goto L44
            r6 = 172(0xac, float:2.41E-43)
            r0 = 0
            if (r3 == r6) goto L3a
            r6 = 177(0xb1, float:2.48E-43)
            if (r3 == r6) goto L3a
            r6 = 190(0xbe, float:2.66E-43)
            if (r3 == r6) goto L33
            r6 = 191(0xbf, float:2.68E-43)
            if (r3 == r6) goto L2c
            r6 = 194(0xc2, float:2.72E-43)
            if (r3 == r6) goto L33
            r6 = 195(0xc3, float:2.73E-43)
            if (r3 == r6) goto L33
            switch(r3) {
                case 46: goto L33;
                case 47: goto L33;
                case 48: goto L33;
                case 49: goto L33;
                case 50: goto L33;
                case 51: goto L33;
                case 52: goto L33;
                case 53: goto L33;
                default: goto L25;
            }
        L25:
            switch(r3) {
                case 79: goto L33;
                case 80: goto L33;
                case 81: goto L33;
                case 82: goto L33;
                case 83: goto L33;
                case 84: goto L33;
                case 85: goto L33;
                case 86: goto L33;
                default: goto L28;
            }
        L28:
            r2.visitCommon(r4, r5, r1)
            goto L52
        L2c:
            r2.visitCommon(r4, r5, r0)
            r2.visitThrowing(r4, r5, r0)
            goto L52
        L33:
            r2.visitCommon(r4, r5, r1)
            r2.visitThrowing(r4, r5, r1)
            goto L52
        L3a:
            r2.visitCommon(r4, r5, r0)
            com.android.dx.util.IntList[] r3 = r2.targetLists
            com.android.dx.util.IntList r5 = com.android.dx.util.IntList.EMPTY
            r3[r4] = r5
            goto L52
        L44:
            r2.visitCommon(r4, r5, r1)
            com.android.dx.rop.type.Type r3 = com.android.dx.rop.type.Type.INT
            if (r6 == r3) goto L4f
            com.android.dx.rop.type.Type r3 = com.android.dx.rop.type.Type.LONG
            if (r6 != r3) goto L52
        L4f:
            r2.visitThrowing(r4, r5, r1)
        L52:
            return
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void visitSwitch(int r2, int r3, int r4, com.android.dx.cf.code.SwitchList r5, int r6) {
            r1 = this;
            r2 = 0
            r1.visitCommon(r3, r4, r2)
            int r4 = r5.getDefaultTarget()
            r6 = 1
            r1.addWorkIfNecessary(r4, r6)
            int r4 = r5.size()
        L10:
            if (r2 >= r4) goto L1c
            int r0 = r5.getTarget(r2)
            r1.addWorkIfNecessary(r0, r6)
            int r2 = r2 + 1
            goto L10
        L1c:
            com.android.dx.util.IntList[] r2 = r1.targetLists
            com.android.dx.util.IntList r4 = r5.getTargets()
            r2[r3] = r4
            return
    }
}
