package com.android.dx.ssa;

/* JADX INFO: loaded from: classes.dex */
public class DeadCodeRemover {
    private final int regCount;
    private final com.android.dx.ssa.SsaMethod ssaMeth;
    private final java.util.ArrayList<com.android.dx.ssa.SsaInsn>[] useList;
    private final java.util.BitSet worklist;

    public static class NoSideEffectVisitor implements com.android.dx.ssa.SsaInsn.Visitor {
        java.util.BitSet noSideEffectRegs;

        public NoSideEffectVisitor(java.util.BitSet r1) {
                r0 = this;
                r0.<init>()
                r0.noSideEffectRegs = r1
                return
        }

        @Override // com.android.dx.ssa.SsaInsn.Visitor
        public void visitMoveInsn(com.android.dx.ssa.NormalSsaInsn r2) {
                r1 = this;
                boolean r0 = com.android.dx.ssa.DeadCodeRemover.access$000(r2)
                if (r0 != 0) goto L13
                java.util.BitSet r0 = r1.noSideEffectRegs
                com.android.dx.rop.code.RegisterSpec r2 = r2.getResult()
                int r2 = r2.getReg()
                r0.set(r2)
            L13:
                return
        }

        @Override // com.android.dx.ssa.SsaInsn.Visitor
        public void visitNonMoveInsn(com.android.dx.ssa.NormalSsaInsn r2) {
                r1 = this;
                com.android.dx.rop.code.RegisterSpec r0 = r2.getResult()
                boolean r2 = com.android.dx.ssa.DeadCodeRemover.access$000(r2)
                if (r2 != 0) goto L15
                if (r0 == 0) goto L15
                java.util.BitSet r2 = r1.noSideEffectRegs
                int r0 = r0.getReg()
                r2.set(r0)
            L15:
                return
        }

        @Override // com.android.dx.ssa.SsaInsn.Visitor
        public void visitPhiInsn(com.android.dx.ssa.PhiInsn r2) {
                r1 = this;
                boolean r0 = com.android.dx.ssa.DeadCodeRemover.access$000(r2)
                if (r0 != 0) goto L13
                java.util.BitSet r0 = r1.noSideEffectRegs
                com.android.dx.rop.code.RegisterSpec r2 = r2.getResult()
                int r2 = r2.getReg()
                r0.set(r2)
            L13:
                return
        }
    }

    private DeadCodeRemover(com.android.dx.ssa.SsaMethod r3) {
            r2 = this;
            r2.<init>()
            r2.ssaMeth = r3
            int r0 = r3.getRegCount()
            r2.regCount = r0
            java.util.BitSet r1 = new java.util.BitSet
            r1.<init>(r0)
            r2.worklist = r1
            java.util.ArrayList[] r3 = r3.getUseListCopy()
            r2.useList = r3
            return
    }

    public static /* synthetic */ boolean access$000(com.android.dx.ssa.SsaInsn r0) {
            boolean r0 = hasSideEffect(r0)
            return r0
    }

    private static boolean hasSideEffect(com.android.dx.ssa.SsaInsn r0) {
            if (r0 != 0) goto L4
            r0 = 1
            return r0
        L4:
            boolean r0 = r0.hasSideEffect()
            return r0
    }

    private boolean isCircularNoSideEffect(int r5, java.util.BitSet r6) {
            r4 = this;
            r0 = 1
            if (r6 == 0) goto La
            boolean r1 = r6.get(r5)
            if (r1 == 0) goto La
            return r0
        La:
            java.util.ArrayList<com.android.dx.ssa.SsaInsn>[] r1 = r4.useList
            r1 = r1[r5]
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L26
            java.lang.Object r2 = r1.next()
            com.android.dx.ssa.SsaInsn r2 = (com.android.dx.ssa.SsaInsn) r2
            boolean r2 = hasSideEffect(r2)
            if (r2 == 0) goto L12
            return r3
        L26:
            if (r6 != 0) goto L2f
            java.util.BitSet r6 = new java.util.BitSet
            int r1 = r4.regCount
            r6.<init>(r1)
        L2f:
            r6.set(r5)
            java.util.ArrayList<com.android.dx.ssa.SsaInsn>[] r1 = r4.useList
            r5 = r1[r5]
            java.util.Iterator r5 = r5.iterator()
        L3a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r5.next()
            com.android.dx.ssa.SsaInsn r1 = (com.android.dx.ssa.SsaInsn) r1
            com.android.dx.rop.code.RegisterSpec r1 = r1.getResult()
            if (r1 == 0) goto L56
            int r1 = r1.getReg()
            boolean r1 = r4.isCircularNoSideEffect(r1, r6)
            if (r1 != 0) goto L3a
        L56:
            return r3
        L57:
            return r0
    }

    public static void process(com.android.dx.ssa.SsaMethod r1) {
            com.android.dx.ssa.DeadCodeRemover r0 = new com.android.dx.ssa.DeadCodeRemover
            r0.<init>(r1)
            r0.run()
            return
    }

    private void pruneDeadInstructions() {
            r13 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.android.dx.ssa.SsaMethod r1 = r13.ssaMeth
            java.util.BitSet r1 = r1.computeReachability()
            com.android.dx.ssa.SsaMethod r2 = r13.ssaMeth
            java.util.ArrayList r2 = r2.getBlocks()
            r3 = 0
            r4 = r3
        L13:
            int r4 = r1.nextClearBit(r4)
            int r5 = r2.size()
            if (r4 >= r5) goto L88
            java.lang.Object r5 = r2.get(r4)
            com.android.dx.ssa.SsaBasicBlock r5 = (com.android.dx.ssa.SsaBasicBlock) r5
            int r4 = r4 + 1
            r6 = r3
        L26:
            java.util.ArrayList r7 = r5.getInsns()
            int r7 = r7.size()
            if (r6 >= r7) goto L13
            java.util.ArrayList r7 = r5.getInsns()
            java.lang.Object r7 = r7.get(r6)
            com.android.dx.ssa.SsaInsn r7 = (com.android.dx.ssa.SsaInsn) r7
            com.android.dx.rop.code.RegisterSpecList r8 = r7.getSources()
            int r9 = r8.size()
            if (r9 == 0) goto L47
            r0.add(r7)
        L47:
            r10 = r3
        L48:
            if (r10 >= r9) goto L5c
            com.android.dx.rop.code.RegisterSpec r11 = r8.get(r10)
            java.util.ArrayList<com.android.dx.ssa.SsaInsn>[] r12 = r13.useList
            int r11 = r11.getReg()
            r11 = r12[r11]
            r11.remove(r7)
            int r10 = r10 + 1
            goto L48
        L5c:
            com.android.dx.rop.code.RegisterSpec r7 = r7.getResult()
            if (r7 != 0) goto L63
            goto L85
        L63:
            java.util.ArrayList<com.android.dx.ssa.SsaInsn>[] r8 = r13.useList
            int r9 = r7.getReg()
            r8 = r8[r9]
            java.util.Iterator r8 = r8.iterator()
        L6f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L85
            java.lang.Object r9 = r8.next()
            com.android.dx.ssa.SsaInsn r9 = (com.android.dx.ssa.SsaInsn) r9
            boolean r10 = r9 instanceof com.android.dx.ssa.PhiInsn
            if (r10 == 0) goto L6f
            com.android.dx.ssa.PhiInsn r9 = (com.android.dx.ssa.PhiInsn) r9
            r9.removePhiRegister(r7)
            goto L6f
        L85:
            int r6 = r6 + 1
            goto L26
        L88:
            com.android.dx.ssa.SsaMethod r1 = r13.ssaMeth
            r1.deleteInsns(r0)
            return
    }

    private void run() {
            r8 = this;
            r8.pruneDeadInstructions()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.android.dx.ssa.SsaMethod r1 = r8.ssaMeth
            com.android.dx.ssa.DeadCodeRemover$NoSideEffectVisitor r2 = new com.android.dx.ssa.DeadCodeRemover$NoSideEffectVisitor
            java.util.BitSet r3 = r8.worklist
            r2.<init>(r3)
            r1.forEachInsn(r2)
        L14:
            java.util.BitSet r1 = r8.worklist
            r2 = 0
            int r1 = r1.nextSetBit(r2)
            if (r1 < 0) goto L79
            java.util.BitSet r3 = r8.worklist
            r3.clear(r1)
            java.util.ArrayList<com.android.dx.ssa.SsaInsn>[] r3 = r8.useList
            r3 = r3[r1]
            int r3 = r3.size()
            if (r3 == 0) goto L33
            r3 = 0
            boolean r3 = r8.isCircularNoSideEffect(r1, r3)
            if (r3 == 0) goto L14
        L33:
            com.android.dx.ssa.SsaMethod r3 = r8.ssaMeth
            com.android.dx.ssa.SsaInsn r1 = r3.getDefinitionForRegister(r1)
            boolean r3 = r0.contains(r1)
            if (r3 == 0) goto L40
            goto L14
        L40:
            com.android.dx.rop.code.RegisterSpecList r3 = r1.getSources()
            int r4 = r3.size()
        L48:
            if (r2 >= r4) goto L75
            com.android.dx.rop.code.RegisterSpec r5 = r3.get(r2)
            java.util.ArrayList<com.android.dx.ssa.SsaInsn>[] r6 = r8.useList
            int r7 = r5.getReg()
            r6 = r6[r7]
            r6.remove(r1)
            com.android.dx.ssa.SsaMethod r6 = r8.ssaMeth
            int r7 = r5.getReg()
            com.android.dx.ssa.SsaInsn r6 = r6.getDefinitionForRegister(r7)
            boolean r6 = hasSideEffect(r6)
            if (r6 != 0) goto L72
            java.util.BitSet r6 = r8.worklist
            int r5 = r5.getReg()
            r6.set(r5)
        L72:
            int r2 = r2 + 1
            goto L48
        L75:
            r0.add(r1)
            goto L14
        L79:
            com.android.dx.ssa.SsaMethod r1 = r8.ssaMeth
            r1.deleteInsns(r0)
            return
    }
}
