package com.android.dx.ssa;

/* JADX INFO: loaded from: classes.dex */
public class SsaConverter {
    public static final boolean DEBUG = false;

    public SsaConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.android.dx.ssa.SsaMethod convertToSsaMethod(com.android.dx.rop.code.RopMethod r0, int r1, boolean r2) {
            com.android.dx.ssa.SsaMethod r0 = com.android.dx.ssa.SsaMethod.newFromRopMethod(r0, r1, r2)
            edgeSplit(r0)
            com.android.dx.ssa.LocalVariableInfo r1 = com.android.dx.ssa.LocalVariableExtractor.extract(r0)
            r2 = 0
            placePhiFunctions(r0, r1, r2)
            com.android.dx.ssa.SsaRenamer r1 = new com.android.dx.ssa.SsaRenamer
            r1.<init>(r0)
            r1.run()
            r0.makeExitBlock()
            return r0
    }

    private static void edgeSplit(com.android.dx.ssa.SsaMethod r0) {
            edgeSplitPredecessors(r0)
            edgeSplitMoveExceptionsAndResults(r0)
            edgeSplitSuccessors(r0)
            return
    }

    private static void edgeSplitMoveExceptionsAndResults(com.android.dx.ssa.SsaMethod r8) {
            java.util.ArrayList r8 = r8.getBlocks()
            int r0 = r8.size()
            r1 = 1
            int r0 = r0 - r1
        La:
            if (r0 < 0) goto L73
            java.lang.Object r2 = r8.get(r0)
            com.android.dx.ssa.SsaBasicBlock r2 = (com.android.dx.ssa.SsaBasicBlock) r2
            boolean r3 = r2.isExitBlock()
            if (r3 != 0) goto L70
            java.util.BitSet r3 = r2.getPredecessors()
            int r3 = r3.cardinality()
            if (r3 <= r1) goto L70
            java.util.ArrayList r3 = r2.getInsns()
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            com.android.dx.ssa.SsaInsn r3 = (com.android.dx.ssa.SsaInsn) r3
            boolean r3 = r3.isMoveException()
            if (r3 == 0) goto L70
            java.util.BitSet r3 = r2.getPredecessors()
            java.lang.Object r3 = r3.clone()
            java.util.BitSet r3 = (java.util.BitSet) r3
            int r5 = r3.nextSetBit(r4)
        L41:
            if (r5 < 0) goto L69
            java.lang.Object r6 = r8.get(r5)
            com.android.dx.ssa.SsaBasicBlock r6 = (com.android.dx.ssa.SsaBasicBlock) r6
            com.android.dx.ssa.SsaBasicBlock r6 = r6.insertNewSuccessor(r2)
            java.util.ArrayList r6 = r6.getInsns()
            java.util.ArrayList r7 = r2.getInsns()
            java.lang.Object r7 = r7.get(r4)
            com.android.dx.ssa.SsaInsn r7 = (com.android.dx.ssa.SsaInsn) r7
            com.android.dx.ssa.SsaInsn r7 = r7.clone()
            r6.add(r4, r7)
            int r5 = r5 + 1
            int r5 = r3.nextSetBit(r5)
            goto L41
        L69:
            java.util.ArrayList r2 = r2.getInsns()
            r2.remove(r4)
        L70:
            int r0 = r0 + (-1)
            goto La
        L73:
            return
    }

    private static void edgeSplitPredecessors(com.android.dx.ssa.SsaMethod r3) {
            java.util.ArrayList r3 = r3.getBlocks()
            int r0 = r3.size()
            int r0 = r0 + (-1)
        La:
            if (r0 < 0) goto L1e
            java.lang.Object r1 = r3.get(r0)
            com.android.dx.ssa.SsaBasicBlock r1 = (com.android.dx.ssa.SsaBasicBlock) r1
            boolean r2 = nodeNeedsUniquePredecessor(r1)
            if (r2 == 0) goto L1b
            r1.insertNewPredecessor()
        L1b:
            int r0 = r0 + (-1)
            goto La
        L1e:
            return
    }

    private static void edgeSplitSuccessors(com.android.dx.ssa.SsaMethod r6) {
            java.util.ArrayList r6 = r6.getBlocks()
            int r0 = r6.size()
            int r0 = r0 + (-1)
        La:
            if (r0 < 0) goto L3c
            java.lang.Object r1 = r6.get(r0)
            com.android.dx.ssa.SsaBasicBlock r1 = (com.android.dx.ssa.SsaBasicBlock) r1
            java.util.BitSet r2 = r1.getSuccessors()
            java.lang.Object r2 = r2.clone()
            java.util.BitSet r2 = (java.util.BitSet) r2
            r3 = 0
            int r3 = r2.nextSetBit(r3)
        L21:
            if (r3 < 0) goto L39
            java.lang.Object r4 = r6.get(r3)
            com.android.dx.ssa.SsaBasicBlock r4 = (com.android.dx.ssa.SsaBasicBlock) r4
            boolean r5 = needsNewSuccessor(r1, r4)
            if (r5 == 0) goto L32
            r1.insertNewSuccessor(r4)
        L32:
            int r3 = r3 + 1
            int r3 = r2.nextSetBit(r3)
            goto L21
        L39:
            int r0 = r0 + (-1)
            goto La
        L3c:
            return
    }

    private static boolean needsNewSuccessor(com.android.dx.ssa.SsaBasicBlock r3, com.android.dx.ssa.SsaBasicBlock r4) {
            java.util.ArrayList r0 = r3.getInsns()
            int r1 = r0.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            com.android.dx.ssa.SsaInsn r0 = (com.android.dx.ssa.SsaInsn) r0
            java.util.BitSet r3 = r3.getSuccessors()
            int r3 = r3.cardinality()
            if (r3 <= r2) goto L25
            java.util.BitSet r3 = r4.getPredecessors()
            int r3 = r3.cardinality()
            if (r3 <= r2) goto L25
            return r2
        L25:
            com.android.dx.rop.code.RegisterSpec r3 = r0.getResult()
            if (r3 != 0) goto L35
            com.android.dx.rop.code.RegisterSpecList r3 = r0.getSources()
            int r3 = r3.size()
            if (r3 <= 0) goto L40
        L35:
            java.util.BitSet r3 = r4.getPredecessors()
            int r3 = r3.cardinality()
            if (r3 <= r2) goto L40
            goto L41
        L40:
            r2 = 0
        L41:
            return r2
    }

    private static boolean nodeNeedsUniquePredecessor(com.android.dx.ssa.SsaBasicBlock r2) {
            java.util.BitSet r0 = r2.getPredecessors()
            int r0 = r0.cardinality()
            java.util.BitSet r2 = r2.getSuccessors()
            int r2 = r2.cardinality()
            r1 = 1
            if (r0 <= r1) goto L16
            if (r2 <= r1) goto L16
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
    }

    private static void placePhiFunctions(com.android.dx.ssa.SsaMethod r11, com.android.dx.ssa.LocalVariableInfo r12, int r13) {
            java.util.ArrayList r0 = r11.getBlocks()
            int r1 = r0.size()
            int r2 = r11.getRegCount()
            int r2 = r2 - r13
            com.android.dx.ssa.DomFront r3 = new com.android.dx.ssa.DomFront
            r3.<init>(r11)
            com.android.dx.ssa.DomFront$DomInfo[] r11 = r3.run()
            java.util.BitSet[] r3 = new java.util.BitSet[r2]
            java.util.BitSet[] r4 = new java.util.BitSet[r2]
            r5 = 0
            r6 = r5
        L1c:
            if (r6 >= r2) goto L2f
            java.util.BitSet r7 = new java.util.BitSet
            r7.<init>(r1)
            r3[r6] = r7
            java.util.BitSet r7 = new java.util.BitSet
            r7.<init>(r1)
            r4[r6] = r7
            int r6 = r6 + 1
            goto L1c
        L2f:
            int r1 = r0.size()
            r6 = r5
        L34:
            if (r6 >= r1) goto L6b
            java.lang.Object r7 = r0.get(r6)
            com.android.dx.ssa.SsaBasicBlock r7 = (com.android.dx.ssa.SsaBasicBlock) r7
            java.util.ArrayList r7 = r7.getInsns()
            java.util.Iterator r7 = r7.iterator()
        L44:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L68
            java.lang.Object r8 = r7.next()
            com.android.dx.ssa.SsaInsn r8 = (com.android.dx.ssa.SsaInsn) r8
            com.android.dx.rop.code.RegisterSpec r8 = r8.getResult()
            if (r8 == 0) goto L44
            int r9 = r8.getReg()
            int r9 = r9 - r13
            if (r9 < 0) goto L44
            int r8 = r8.getReg()
            int r8 = r8 - r13
            r8 = r3[r8]
            r8.set(r6)
            goto L44
        L68:
            int r6 = r6 + 1
            goto L34
        L6b:
            r1 = r5
        L6c:
            if (r1 >= r2) goto Lcc
            r6 = r3[r1]
            java.lang.Object r6 = r6.clone()
            java.util.BitSet r6 = (java.util.BitSet) r6
        L76:
            int r7 = r6.nextSetBit(r5)
            if (r7 < 0) goto Lc9
            r6.clear(r7)
            r7 = r11[r7]
            com.android.dx.util.IntSet r7 = r7.dominanceFrontiers
            com.android.dx.util.IntIterator r7 = r7.iterator()
        L87:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L76
            int r8 = r7.next()
            r9 = r4[r1]
            boolean r9 = r9.get(r8)
            if (r9 != 0) goto L87
            r9 = r4[r1]
            r9.set(r8)
            int r9 = r1 + r13
            com.android.dx.rop.code.RegisterSpecSet r10 = r12.getStarts(r8)
            com.android.dx.rop.code.RegisterSpec r10 = r10.get(r9)
            if (r10 != 0) goto Lb4
            java.lang.Object r10 = r0.get(r8)
            com.android.dx.ssa.SsaBasicBlock r10 = (com.android.dx.ssa.SsaBasicBlock) r10
            r10.addPhiInsnForReg(r9)
            goto Lbd
        Lb4:
            java.lang.Object r9 = r0.get(r8)
            com.android.dx.ssa.SsaBasicBlock r9 = (com.android.dx.ssa.SsaBasicBlock) r9
            r9.addPhiInsnForReg(r10)
        Lbd:
            r9 = r3[r1]
            boolean r9 = r9.get(r8)
            if (r9 != 0) goto L87
            r6.set(r8)
            goto L87
        Lc9:
            int r1 = r1 + 1
            goto L6c
        Lcc:
            return
    }

    public static com.android.dx.ssa.SsaMethod testEdgeSplit(com.android.dx.rop.code.RopMethod r0, int r1, boolean r2) {
            com.android.dx.ssa.SsaMethod r0 = com.android.dx.ssa.SsaMethod.newFromRopMethod(r0, r1, r2)
            edgeSplit(r0)
            return r0
    }

    public static com.android.dx.ssa.SsaMethod testPhiPlacement(com.android.dx.rop.code.RopMethod r0, int r1, boolean r2) {
            com.android.dx.ssa.SsaMethod r0 = com.android.dx.ssa.SsaMethod.newFromRopMethod(r0, r1, r2)
            edgeSplit(r0)
            com.android.dx.ssa.LocalVariableInfo r1 = com.android.dx.ssa.LocalVariableExtractor.extract(r0)
            r2 = 0
            placePhiFunctions(r0, r1, r2)
            return r0
    }

    public static void updateSsaMethod(com.android.dx.ssa.SsaMethod r1, int r2) {
            com.android.dx.ssa.LocalVariableInfo r0 = com.android.dx.ssa.LocalVariableExtractor.extract(r1)
            placePhiFunctions(r1, r0, r2)
            com.android.dx.ssa.SsaRenamer r0 = new com.android.dx.ssa.SsaRenamer
            r0.<init>(r1, r2)
            r0.run()
            return
    }
}
