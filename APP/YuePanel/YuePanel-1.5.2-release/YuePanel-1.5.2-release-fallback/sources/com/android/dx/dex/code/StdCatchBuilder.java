package com.android.dx.dex.code;

/* JADX INFO: loaded from: classes.dex */
public final class StdCatchBuilder implements com.android.dx.dex.code.CatchBuilder {
    private static final int MAX_CATCH_RANGE = 65535;
    private final com.android.dx.dex.code.BlockAddresses addresses;
    private final com.android.dx.rop.code.RopMethod method;
    private final int[] order;

    public StdCatchBuilder(com.android.dx.rop.code.RopMethod r1, int[] r2, com.android.dx.dex.code.BlockAddresses r3) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L20
            if (r2 == 0) goto L18
            if (r3 == 0) goto L10
            r0.method = r1
            r0.order = r2
            r0.addresses = r3
            return
        L10:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "addresses == null"
            r1.<init>(r2)
            throw r1
        L18:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "order == null"
            r1.<init>(r2)
            throw r1
        L20:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "method == null"
            r1.<init>(r2)
            throw r1
    }

    public static com.android.dx.dex.code.CatchTable build(com.android.dx.rop.code.RopMethod r10, int[] r11, com.android.dx.dex.code.BlockAddresses r12) {
            int r0 = r11.length
            com.android.dx.rop.code.BasicBlockList r10 = r10.getBlocks()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            com.android.dx.dex.code.CatchHandlerList r2 = com.android.dx.dex.code.CatchHandlerList.EMPTY
            r3 = 0
            r4 = 0
            r5 = r3
            r6 = r4
        L10:
            if (r6 >= r0) goto L4b
            r7 = r11[r6]
            com.android.dx.rop.code.BasicBlock r7 = r10.labelToBlock(r7)
            boolean r8 = r7.canThrow()
            if (r8 != 0) goto L1f
            goto L48
        L1f:
            com.android.dx.dex.code.CatchHandlerList r8 = handlersFor(r7, r12)
            int r9 = r2.size()
            if (r9 != 0) goto L2a
            goto L45
        L2a:
            boolean r9 = r2.equals(r8)
            if (r9 == 0) goto L38
            boolean r9 = rangeIsValid(r3, r7, r12)
            if (r9 == 0) goto L38
            r5 = r7
            goto L48
        L38:
            int r9 = r2.size()
            if (r9 == 0) goto L45
            com.android.dx.dex.code.CatchTable$Entry r2 = makeEntry(r3, r5, r2, r12)
            r1.add(r2)
        L45:
            r3 = r7
            r5 = r3
            r2 = r8
        L48:
            int r6 = r6 + 1
            goto L10
        L4b:
            int r10 = r2.size()
            if (r10 == 0) goto L58
            com.android.dx.dex.code.CatchTable$Entry r10 = makeEntry(r3, r5, r2, r12)
            r1.add(r10)
        L58:
            int r10 = r1.size()
            if (r10 != 0) goto L61
            com.android.dx.dex.code.CatchTable r10 = com.android.dx.dex.code.CatchTable.EMPTY
            return r10
        L61:
            com.android.dx.dex.code.CatchTable r11 = new com.android.dx.dex.code.CatchTable
            r11.<init>(r10)
        L66:
            if (r4 >= r10) goto L74
            java.lang.Object r12 = r1.get(r4)
            com.android.dx.dex.code.CatchTable$Entry r12 = (com.android.dx.dex.code.CatchTable.Entry) r12
            r11.set(r4, r12)
            int r4 = r4 + 1
            goto L66
        L74:
            r11.setImmutable()
            return r11
    }

    private static com.android.dx.dex.code.CatchHandlerList handlersFor(com.android.dx.rop.code.BasicBlock r6, com.android.dx.dex.code.BlockAddresses r7) {
            com.android.dx.util.IntList r0 = r6.getSuccessors()
            int r1 = r0.size()
            int r2 = r6.getPrimarySuccessor()
            com.android.dx.rop.code.Insn r6 = r6.getLastInsn()
            com.android.dx.rop.type.TypeList r6 = r6.getCatches()
            int r3 = r6.size()
            if (r3 != 0) goto L1d
            com.android.dx.dex.code.CatchHandlerList r6 = com.android.dx.dex.code.CatchHandlerList.EMPTY
            return r6
        L1d:
            r4 = -1
            if (r2 != r4) goto L22
            if (r1 != r3) goto L2f
        L22:
            if (r2 == r4) goto L37
            int r4 = r3 + 1
            if (r1 != r4) goto L2f
            int r1 = r0.get(r3)
            if (r2 != r1) goto L2f
            goto L37
        L2f:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = "shouldn't happen: weird successors list"
            r6.<init>(r7)
            throw r6
        L37:
            r1 = 0
            r2 = r1
        L39:
            if (r2 >= r3) goto L4d
            com.android.dx.rop.type.Type r4 = r6.getType(r2)
            com.android.dx.rop.type.Type r5 = com.android.dx.rop.type.Type.OBJECT
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L4a
            int r3 = r2 + 1
            goto L4d
        L4a:
            int r2 = r2 + 1
            goto L39
        L4d:
            com.android.dx.dex.code.CatchHandlerList r2 = new com.android.dx.dex.code.CatchHandlerList
            r2.<init>(r3)
        L52:
            if (r1 >= r3) goto L6f
            com.android.dx.rop.cst.CstType r4 = new com.android.dx.rop.cst.CstType
            com.android.dx.rop.type.Type r5 = r6.getType(r1)
            r4.<init>(r5)
            int r5 = r0.get(r1)
            com.android.dx.dex.code.CodeAddress r5 = r7.getStart(r5)
            int r5 = r5.getAddress()
            r2.set(r1, r4, r5)
            int r1 = r1 + 1
            goto L52
        L6f:
            r2.setImmutable()
            return r2
    }

    private static com.android.dx.dex.code.CatchTable.Entry makeEntry(com.android.dx.rop.code.BasicBlock r0, com.android.dx.rop.code.BasicBlock r1, com.android.dx.dex.code.CatchHandlerList r2, com.android.dx.dex.code.BlockAddresses r3) {
            com.android.dx.dex.code.CodeAddress r0 = r3.getLast(r0)
            com.android.dx.dex.code.CodeAddress r1 = r3.getEnd(r1)
            com.android.dx.dex.code.CatchTable$Entry r3 = new com.android.dx.dex.code.CatchTable$Entry
            int r0 = r0.getAddress()
            int r1 = r1.getAddress()
            r3.<init>(r0, r1, r2)
            return r3
    }

    private static boolean rangeIsValid(com.android.dx.rop.code.BasicBlock r0, com.android.dx.rop.code.BasicBlock r1, com.android.dx.dex.code.BlockAddresses r2) {
            if (r0 == 0) goto L26
            if (r1 == 0) goto L1e
            com.android.dx.dex.code.CodeAddress r0 = r2.getLast(r0)
            int r0 = r0.getAddress()
            com.android.dx.dex.code.CodeAddress r1 = r2.getEnd(r1)
            int r1 = r1.getAddress()
            int r1 = r1 - r0
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 > r0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
        L1e:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "end == null"
            r0.<init>(r1)
            throw r0
        L26:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "start == null"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.android.dx.dex.code.CatchBuilder
    public com.android.dx.dex.code.CatchTable build() {
            r3 = this;
            com.android.dx.rop.code.RopMethod r0 = r3.method
            int[] r1 = r3.order
            com.android.dx.dex.code.BlockAddresses r2 = r3.addresses
            com.android.dx.dex.code.CatchTable r0 = build(r0, r1, r2)
            return r0
    }

    @Override // com.android.dx.dex.code.CatchBuilder
    public java.util.HashSet<com.android.dx.rop.type.Type> getCatchTypes() {
            r9 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 20
            r0.<init>(r1)
            com.android.dx.rop.code.RopMethod r1 = r9.method
            com.android.dx.rop.code.BasicBlockList r1 = r1.getBlocks()
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        L13:
            if (r4 >= r2) goto L35
            com.android.dx.rop.code.BasicBlock r5 = r1.get(r4)
            com.android.dx.rop.code.Insn r5 = r5.getLastInsn()
            com.android.dx.rop.type.TypeList r5 = r5.getCatches()
            int r6 = r5.size()
            r7 = r3
        L26:
            if (r7 >= r6) goto L32
            com.android.dx.rop.type.Type r8 = r5.getType(r7)
            r0.add(r8)
            int r7 = r7 + 1
            goto L26
        L32:
            int r4 = r4 + 1
            goto L13
        L35:
            return r0
    }

    @Override // com.android.dx.dex.code.CatchBuilder
    public boolean hasAnyCatches() {
            r5 = this;
            com.android.dx.rop.code.RopMethod r0 = r5.method
            com.android.dx.rop.code.BasicBlockList r0 = r0.getBlocks()
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L25
            com.android.dx.rop.code.BasicBlock r4 = r0.get(r3)
            com.android.dx.rop.code.Insn r4 = r4.getLastInsn()
            com.android.dx.rop.type.TypeList r4 = r4.getCatches()
            int r4 = r4.size()
            if (r4 == 0) goto L22
            r0 = 1
            return r0
        L22:
            int r3 = r3 + 1
            goto Lc
        L25:
            return r2
    }
}
