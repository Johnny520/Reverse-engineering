package com.android.dx.ssa.back;

/* JADX INFO: loaded from: classes.dex */
public class FirstFitLocalCombiningAllocator extends com.android.dx.ssa.back.RegisterAllocator {
    private static final boolean DEBUG = false;
    private final java.util.ArrayList<com.android.dx.ssa.NormalSsaInsn> invokeRangeInsns;
    private final java.util.Map<com.android.dx.rop.code.LocalItem, java.util.ArrayList<com.android.dx.rop.code.RegisterSpec>> localVariables;
    private final com.android.dx.ssa.InterferenceRegisterMapper mapper;
    private final boolean minimizeRegisters;
    private final java.util.ArrayList<com.android.dx.ssa.NormalSsaInsn> moveResultPseudoInsns;
    private final int paramRangeEnd;
    private final java.util.ArrayList<com.android.dx.ssa.PhiInsn> phiInsns;
    private final java.util.BitSet reservedRopRegs;
    private final java.util.BitSet ssaRegsMapped;
    private final java.util.BitSet usedRopRegs;


    public enum Alignment extends java.lang.Enum<com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment> {
        private static final /* synthetic */ com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment[] $VALUES = null;
        public static final com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment EVEN = null;
        public static final com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment ODD = null;
        public static final com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment UNSPECIFIED = null;




        static {
                com.android.dx.ssa.back.FirstFitLocalCombiningAllocator$Alignment$1 r0 = new com.android.dx.ssa.back.FirstFitLocalCombiningAllocator$Alignment$1
                java.lang.String r1 = "EVEN"
                r2 = 0
                r0.<init>(r1, r2)
                com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment.EVEN = r0
                com.android.dx.ssa.back.FirstFitLocalCombiningAllocator$Alignment$2 r1 = new com.android.dx.ssa.back.FirstFitLocalCombiningAllocator$Alignment$2
                java.lang.String r3 = "ODD"
                r4 = 1
                r1.<init>(r3, r4)
                com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment.ODD = r1
                com.android.dx.ssa.back.FirstFitLocalCombiningAllocator$Alignment$3 r3 = new com.android.dx.ssa.back.FirstFitLocalCombiningAllocator$Alignment$3
                java.lang.String r5 = "UNSPECIFIED"
                r6 = 2
                r3.<init>(r5, r6)
                com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment.UNSPECIFIED = r3
                r5 = 3
                com.android.dx.ssa.back.FirstFitLocalCombiningAllocator$Alignment[] r5 = new com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment.$VALUES = r5
                return
        }

        Alignment(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ Alignment(java.lang.String r1, int r2, com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment valueOf(java.lang.String r1) {
                java.lang.Class<com.android.dx.ssa.back.FirstFitLocalCombiningAllocator$Alignment> r0 = com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.android.dx.ssa.back.FirstFitLocalCombiningAllocator$Alignment r1 = (com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment) r1
                return r1
        }

        public static com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment[] values() {
                com.android.dx.ssa.back.FirstFitLocalCombiningAllocator$Alignment[] r0 = com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment.$VALUES
                java.lang.Object r0 = r0.clone()
                com.android.dx.ssa.back.FirstFitLocalCombiningAllocator$Alignment[] r0 = (com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment[]) r0
                return r0
        }

        public abstract int nextClearBit(java.util.BitSet r1, int r2);
    }

    public static class Multiset {
        private final int[] count;
        private final int[] reg;
        private int size;

        public Multiset(int r2) {
                r1 = this;
                r1.<init>()
                int[] r0 = new int[r2]
                r1.reg = r0
                int[] r2 = new int[r2]
                r1.count = r2
                r2 = 0
                r1.size = r2
                return
        }

        public void add(int r4) {
                r3 = this;
                r0 = 0
            L1:
                int r1 = r3.size
                r2 = 1
                if (r0 >= r1) goto L17
                int[] r1 = r3.reg
                r1 = r1[r0]
                if (r1 != r4) goto L14
                int[] r4 = r3.count
                r1 = r4[r0]
                int r1 = r1 + r2
                r4[r0] = r1
                return
            L14:
                int r0 = r0 + 1
                goto L1
            L17:
                int[] r0 = r3.reg
                r0[r1] = r4
                int[] r4 = r3.count
                r4[r1] = r2
                int r1 = r1 + r2
                r3.size = r1
                return
        }

        public int getAndRemoveHighestCount() {
                r6 = this;
                r0 = -1
                r1 = 0
                r2 = r0
                r3 = r1
                r4 = r3
            L5:
                int r5 = r6.size
                if (r3 >= r5) goto L19
                int[] r5 = r6.count
                r5 = r5[r3]
                if (r4 >= r5) goto L16
                int[] r0 = r6.reg
                r0 = r0[r3]
                r2 = r0
                r0 = r3
                r4 = r5
            L16:
                int r3 = r3 + 1
                goto L5
            L19:
                int[] r3 = r6.count
                r3[r0] = r1
                return r2
        }

        public int getSize() {
                r1 = this;
                int r0 = r1.size
                return r0
        }
    }

    public FirstFitLocalCombiningAllocator(com.android.dx.ssa.SsaMethod r3, com.android.dx.ssa.back.InterferenceGraph r4, boolean r5) {
            r2 = this;
            r2.<init>(r3, r4)
            java.util.BitSet r0 = new java.util.BitSet
            int r1 = r3.getRegCount()
            r0.<init>(r1)
            r2.ssaRegsMapped = r0
            com.android.dx.ssa.InterferenceRegisterMapper r0 = new com.android.dx.ssa.InterferenceRegisterMapper
            int r1 = r3.getRegCount()
            r0.<init>(r4, r1)
            r2.mapper = r0
            r2.minimizeRegisters = r5
            int r3 = r3.getParamWidth()
            r2.paramRangeEnd = r3
            java.util.BitSet r4 = new java.util.BitSet
            int r5 = r3 * 2
            r4.<init>(r5)
            r2.reservedRopRegs = r4
            r5 = 0
            r4.set(r5, r3)
            java.util.BitSet r4 = new java.util.BitSet
            int r3 = r3 * 2
            r4.<init>(r3)
            r2.usedRopRegs = r4
            java.util.TreeMap r3 = new java.util.TreeMap
            r3.<init>()
            r2.localVariables = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.moveResultPseudoInsns = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.invokeRangeInsns = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.phiInsns = r3
            return
    }

    public static /* synthetic */ boolean access$100(int r0) {
            boolean r0 = isEven(r0)
            return r0
    }

    public static /* synthetic */ java.util.Map access$200(com.android.dx.ssa.back.FirstFitLocalCombiningAllocator r0) {
            java.util.Map<com.android.dx.rop.code.LocalItem, java.util.ArrayList<com.android.dx.rop.code.RegisterSpec>> r0 = r0.localVariables
            return r0
    }

    public static /* synthetic */ java.util.ArrayList access$300(com.android.dx.ssa.back.FirstFitLocalCombiningAllocator r0) {
            java.util.ArrayList<com.android.dx.ssa.NormalSsaInsn> r0 = r0.moveResultPseudoInsns
            return r0
    }

    public static /* synthetic */ java.util.ArrayList access$400(com.android.dx.ssa.back.FirstFitLocalCombiningAllocator r0) {
            java.util.ArrayList<com.android.dx.ssa.NormalSsaInsn> r0 = r0.invokeRangeInsns
            return r0
    }

    public static /* synthetic */ java.util.ArrayList access$500(com.android.dx.ssa.back.FirstFitLocalCombiningAllocator r0) {
            java.util.ArrayList<com.android.dx.ssa.PhiInsn> r0 = r0.phiInsns
            return r0
    }

    private void addMapping(com.android.dx.rop.code.RegisterSpec r4, int r5) {
            r3 = this;
            int r0 = r4.getReg()
            java.util.BitSet r1 = r3.ssaRegsMapped
            boolean r1 = r1.get(r0)
            if (r1 != 0) goto L2b
            boolean r1 = r3.canMapReg(r4, r5)
            if (r1 == 0) goto L2b
            int r1 = r4.getCategory()
            com.android.dx.ssa.InterferenceRegisterMapper r2 = r3.mapper
            int r4 = r4.getReg()
            r2.addMapping(r4, r5, r1)
            java.util.BitSet r4 = r3.ssaRegsMapped
            r4.set(r0)
            java.util.BitSet r4 = r3.usedRopRegs
            int r1 = r1 + r5
            r4.set(r5, r1)
            return
        L2b:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "attempt to add invalid register mapping"
            r4.<init>(r5)
            throw r4
    }

    private void adjustAndMapSourceRangeRange(com.android.dx.ssa.NormalSsaInsn r13) {
            r12 = this;
            int r0 = r12.findRangeAndAdjust(r13)
            com.android.dx.rop.code.RegisterSpecList r13 = r13.getSources()
            int r1 = r13.size()
            r2 = 0
            r3 = r2
        Le:
            if (r3 >= r1) goto L5e
            com.android.dx.rop.code.RegisterSpec r4 = r13.get(r3)
            int r5 = r4.getReg()
            int r6 = r4.getCategory()
            int r7 = r0 + r6
            java.util.BitSet r8 = r12.ssaRegsMapped
            boolean r8 = r8.get(r5)
            if (r8 == 0) goto L27
            goto L5a
        L27:
            com.android.dx.rop.code.LocalItem r5 = r12.getLocalItemForReg(r5)
            r12.addMapping(r4, r0)
            if (r5 == 0) goto L5a
            r12.markReserved(r0, r6)
            java.util.Map<com.android.dx.rop.code.LocalItem, java.util.ArrayList<com.android.dx.rop.code.RegisterSpec>> r4 = r12.localVariables
            java.lang.Object r4 = r4.get(r5)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r5 = r4.size()
            r8 = r2
        L40:
            if (r8 >= r5) goto L5a
            java.lang.Object r9 = r4.get(r8)
            com.android.dx.rop.code.RegisterSpec r9 = (com.android.dx.rop.code.RegisterSpec) r9
            int r10 = r9.getReg()
            r11 = -1
            int r10 = r13.indexOfRegister(r10)
            if (r11 == r10) goto L54
            goto L57
        L54:
            r12.tryMapReg(r9, r0, r6)
        L57:
            int r8 = r8 + 1
            goto L40
        L5a:
            int r3 = r3 + 1
            r0 = r7
            goto Le
        L5e:
            return
    }

    private void analyzeInstructions() {
            r2 = this;
            com.android.dx.ssa.SsaMethod r0 = r2.ssaMeth
            com.android.dx.ssa.back.FirstFitLocalCombiningAllocator$1 r1 = new com.android.dx.ssa.back.FirstFitLocalCombiningAllocator$1
            r1.<init>(r2)
            r0.forEachInsn(r1)
            return
    }

    private boolean canMapReg(com.android.dx.rop.code.RegisterSpec r2, int r3) {
            r1 = this;
            int r0 = r2.getCategory()
            boolean r0 = r1.spansParamRange(r3, r0)
            if (r0 != 0) goto L14
            com.android.dx.ssa.InterferenceRegisterMapper r0 = r1.mapper
            boolean r2 = r0.interferes(r2, r3)
            if (r2 != 0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            return r2
    }

    private boolean canMapRegs(java.util.ArrayList<com.android.dx.rop.code.RegisterSpec> r4, int r5) {
            r3 = this;
            java.util.Iterator r4 = r4.iterator()
        L4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r4.next()
            com.android.dx.rop.code.RegisterSpec r0 = (com.android.dx.rop.code.RegisterSpec) r0
            java.util.BitSet r1 = r3.ssaRegsMapped
            int r2 = r0.getReg()
            boolean r1 = r1.get(r2)
            if (r1 == 0) goto L1d
            goto L4
        L1d:
            boolean r0 = r3.canMapReg(r0, r5)
            if (r0 != 0) goto L4
            r4 = 0
            return r4
        L25:
            r4 = 1
            return r4
    }

    private int findAnyFittingRange(com.android.dx.ssa.NormalSsaInsn r9, int r10, int[] r11, java.util.BitSet r12) {
            r8 = this;
            com.android.dx.ssa.back.FirstFitLocalCombiningAllocator$Alignment r0 = com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment.UNSPECIFIED
            int r1 = r11.length
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
        L7:
            if (r2 >= r1) goto L21
            r6 = r11[r2]
            r7 = 2
            if (r6 != r7) goto L1c
            boolean r6 = isEven(r5)
            if (r6 == 0) goto L17
            int r4 = r4 + 1
            goto L19
        L17:
            int r3 = r3 + 1
        L19:
            int r5 = r5 + 2
            goto L1e
        L1c:
            int r5 = r5 + 1
        L1e:
            int r2 = r2 + 1
            goto L7
        L21:
            if (r3 <= r4) goto L31
            int r0 = r8.paramRangeEnd
            boolean r0 = isEven(r0)
            if (r0 == 0) goto L2e
            com.android.dx.ssa.back.FirstFitLocalCombiningAllocator$Alignment r0 = com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment.ODD
            goto L40
        L2e:
            com.android.dx.ssa.back.FirstFitLocalCombiningAllocator$Alignment r0 = com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment.EVEN
            goto L40
        L31:
            if (r4 <= 0) goto L40
            int r0 = r8.paramRangeEnd
            boolean r0 = isEven(r0)
            if (r0 == 0) goto L3e
            com.android.dx.ssa.back.FirstFitLocalCombiningAllocator$Alignment r0 = com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment.EVEN
            goto L40
        L3e:
            com.android.dx.ssa.back.FirstFitLocalCombiningAllocator$Alignment r0 = com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment.ODD
        L40:
            int r1 = r8.paramRangeEnd
        L42:
            int r1 = r8.findNextUnreservedRopReg(r1, r10, r0)
            int r2 = r8.fitPlanForRange(r1, r9, r11, r12)
            if (r2 < 0) goto L4d
            return r1
        L4d:
            int r1 = r1 + 1
            r12.clear()
            goto L42
    }

    private int findNextUnreservedRopReg(int r2, int r3) {
            r1 = this;
            com.android.dx.ssa.back.FirstFitLocalCombiningAllocator$Alignment r0 = r1.getAlignment(r3)
            int r2 = r1.findNextUnreservedRopReg(r2, r3, r0)
            return r2
    }

    private int findNextUnreservedRopReg(int r4, int r5, com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment r6) {
            r3 = this;
            java.util.BitSet r0 = r3.reservedRopRegs
            int r4 = r6.nextClearBit(r0, r4)
        L6:
            r0 = 1
        L7:
            if (r0 >= r5) goto L16
            java.util.BitSet r1 = r3.reservedRopRegs
            int r2 = r4 + r0
            boolean r1 = r1.get(r2)
            if (r1 != 0) goto L16
            int r0 = r0 + 1
            goto L7
        L16:
            if (r0 != r5) goto L19
            return r4
        L19:
            java.util.BitSet r1 = r3.reservedRopRegs
            int r4 = r4 + r0
            int r4 = r6.nextClearBit(r1, r4)
            goto L6
    }

    private int findRangeAndAdjust(com.android.dx.ssa.NormalSsaInsn r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            com.android.dx.rop.code.RegisterSpecList r2 = r18.getSources()
            int r3 = r2.size()
            int[] r4 = new int[r3]
            r6 = 0
            r7 = 0
        L10:
            if (r6 >= r3) goto L20
            com.android.dx.rop.code.RegisterSpec r8 = r2.get(r6)
            int r8 = r8.getCategory()
            r4[r6] = r8
            int r7 = r7 + r8
            int r6 = r6 + 1
            goto L10
        L20:
            r6 = -1
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 0
            r12 = r6
            r10 = 0
            r11 = 0
        L27:
            if (r10 >= r3) goto L6e
            com.android.dx.rop.code.RegisterSpec r13 = r2.get(r10)
            int r13 = r13.getReg()
            if (r10 == 0) goto L38
            int r14 = r10 + (-1)
            r14 = r4[r14]
            int r11 = r11 - r14
        L38:
            java.util.BitSet r14 = r0.ssaRegsMapped
            boolean r14 = r14.get(r13)
            if (r14 != 0) goto L41
            goto L6b
        L41:
            com.android.dx.ssa.InterferenceRegisterMapper r14 = r0.mapper
            int r13 = r14.oldToNew(r13)
            int r13 = r13 + r11
            if (r13 < 0) goto L6b
            boolean r14 = r0.spansParamRange(r13, r7)
            if (r14 == 0) goto L51
            goto L6b
        L51:
            java.util.BitSet r14 = new java.util.BitSet
            r14.<init>(r3)
            int r15 = r0.fitPlanForRange(r13, r1, r4, r14)
            if (r15 >= 0) goto L5d
            goto L6b
        L5d:
            int r16 = r14.cardinality()
            int r5 = r15 - r16
            if (r5 <= r8) goto L68
            r8 = r5
            r12 = r13
            r9 = r14
        L68:
            if (r15 != r7) goto L6b
            goto L6e
        L6b:
            int r10 = r10 + 1
            goto L27
        L6e:
            if (r12 != r6) goto L79
            java.util.BitSet r9 = new java.util.BitSet
            r9.<init>(r3)
            int r12 = r0.findAnyFittingRange(r1, r7, r4, r9)
        L79:
            r3 = 0
            int r3 = r9.nextSetBit(r3)
        L7e:
            if (r3 < 0) goto L92
            com.android.dx.rop.code.RegisterSpec r4 = r2.get(r3)
            com.android.dx.rop.code.RegisterSpec r4 = r0.insertMoveBefore(r1, r4)
            r1.changeOneSource(r3, r4)
            int r3 = r3 + 1
            int r3 = r9.nextSetBit(r3)
            goto L7e
        L92:
            return r12
    }

    private int findRopRegForLocal(int r5, int r6) {
            r4 = this;
            com.android.dx.ssa.back.FirstFitLocalCombiningAllocator$Alignment r0 = r4.getAlignment(r6)
            java.util.BitSet r1 = r4.usedRopRegs
            int r5 = r0.nextClearBit(r1, r5)
        La:
            r1 = 1
        Lb:
            if (r1 >= r6) goto L1a
            java.util.BitSet r2 = r4.usedRopRegs
            int r3 = r5 + r1
            boolean r2 = r2.get(r3)
            if (r2 != 0) goto L1a
            int r1 = r1 + 1
            goto Lb
        L1a:
            if (r1 != r6) goto L1d
            return r5
        L1d:
            java.util.BitSet r2 = r4.usedRopRegs
            int r5 = r5 + r1
            int r5 = r0.nextClearBit(r2, r5)
            goto La
    }

    private int fitPlanForRange(int r11, com.android.dx.ssa.NormalSsaInsn r12, int[] r13, java.util.BitSet r14) {
            r10 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r12.getSources()
            int r1 = r0.size()
            com.android.dx.ssa.SsaBasicBlock r12 = r12.getBlock()
            com.android.dx.util.IntSet r12 = r12.getLiveOutRegs()
            com.android.dx.rop.code.RegisterSpecList r12 = r10.ssaSetToSpecs(r12)
            java.util.BitSet r2 = new java.util.BitSet
            com.android.dx.ssa.SsaMethod r3 = r10.ssaMeth
            int r3 = r3.getRegCount()
            r2.<init>(r3)
            r3 = 0
            r4 = r3
        L21:
            if (r3 >= r1) goto L7d
            com.android.dx.rop.code.RegisterSpec r5 = r0.get(r3)
            int r6 = r5.getReg()
            r7 = r13[r3]
            if (r3 == 0) goto L34
            int r8 = r3 + (-1)
            r8 = r13[r8]
            int r11 = r11 + r8
        L34:
            java.util.BitSet r8 = r10.ssaRegsMapped
            boolean r8 = r8.get(r6)
            if (r8 == 0) goto L46
            com.android.dx.ssa.InterferenceRegisterMapper r8 = r10.mapper
            int r8 = r8.oldToNew(r6)
            if (r8 != r11) goto L46
        L44:
            int r4 = r4 + r7
            goto L77
        L46:
            boolean r8 = r10.rangeContainsReserved(r11, r7)
            r9 = -1
            if (r8 == 0) goto L4f
        L4d:
            r4 = r9
            goto L7d
        L4f:
            java.util.BitSet r8 = r10.ssaRegsMapped
            boolean r8 = r8.get(r6)
            if (r8 != 0) goto L64
            boolean r5 = r10.canMapReg(r5, r11)
            if (r5 == 0) goto L64
            boolean r5 = r2.get(r6)
            if (r5 != 0) goto L64
            goto L44
        L64:
            com.android.dx.ssa.InterferenceRegisterMapper r5 = r10.mapper
            boolean r5 = r5.areAnyPinned(r12, r11, r7)
            if (r5 != 0) goto L4d
            com.android.dx.ssa.InterferenceRegisterMapper r5 = r10.mapper
            boolean r5 = r5.areAnyPinned(r0, r11, r7)
            if (r5 != 0) goto L4d
            r14.set(r3)
        L77:
            r2.set(r6)
            int r3 = r3 + 1
            goto L21
        L7d:
            return r4
    }

    private com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment getAlignment(int r3) {
            r2 = this;
            com.android.dx.ssa.back.FirstFitLocalCombiningAllocator$Alignment r0 = com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment.UNSPECIFIED
            r1 = 2
            if (r3 != r1) goto L12
            int r3 = r2.paramRangeEnd
            boolean r3 = isEven(r3)
            if (r3 == 0) goto L10
            com.android.dx.ssa.back.FirstFitLocalCombiningAllocator$Alignment r0 = com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment.EVEN
            goto L12
        L10:
            com.android.dx.ssa.back.FirstFitLocalCombiningAllocator$Alignment r0 = com.android.dx.ssa.back.FirstFitLocalCombiningAllocator.Alignment.ODD
        L12:
            return r0
    }

    private com.android.dx.rop.code.LocalItem getLocalItemForReg(int r5) {
            r4 = this;
            java.util.Map<com.android.dx.rop.code.LocalItem, java.util.ArrayList<com.android.dx.rop.code.RegisterSpec>> r0 = r4.localVariables
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.util.Iterator r2 = r2.iterator()
        L20:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La
            java.lang.Object r3 = r2.next()
            com.android.dx.rop.code.RegisterSpec r3 = (com.android.dx.rop.code.RegisterSpec) r3
            int r3 = r3.getReg()
            if (r3 != r5) goto L20
            java.lang.Object r5 = r1.getKey()
            com.android.dx.rop.code.LocalItem r5 = (com.android.dx.rop.code.LocalItem) r5
            return r5
        L39:
            r5 = 0
            return r5
    }

    private int getParameterIndexForReg(int r4) {
            r3 = this;
            com.android.dx.ssa.SsaMethod r0 = r3.ssaMeth
            com.android.dx.ssa.SsaInsn r4 = r0.getDefinitionForRegister(r4)
            r0 = -1
            if (r4 != 0) goto La
            return r0
        La:
            com.android.dx.rop.code.Rop r1 = r4.getOpcode()
            if (r1 == 0) goto L28
            int r1 = r1.getOpcode()
            r2 = 3
            if (r1 != r2) goto L28
            com.android.dx.rop.code.Insn r4 = r4.getOriginalRopInsn()
            com.android.dx.rop.code.CstInsn r4 = (com.android.dx.rop.code.CstInsn) r4
            com.android.dx.rop.cst.Constant r4 = r4.getConstant()
            com.android.dx.rop.cst.CstInteger r4 = (com.android.dx.rop.cst.CstInteger) r4
            int r4 = r4.getValue()
            return r4
        L28:
            return r0
    }

    private void handleCheckCastResults() {
            r12 = this;
            java.util.ArrayList<com.android.dx.ssa.NormalSsaInsn> r0 = r12.moveResultPseudoInsns
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Leb
            java.lang.Object r1 = r0.next()
            com.android.dx.ssa.NormalSsaInsn r1 = (com.android.dx.ssa.NormalSsaInsn) r1
            com.android.dx.rop.code.RegisterSpec r2 = r1.getResult()
            int r3 = r2.getReg()
            com.android.dx.ssa.SsaBasicBlock r1 = r1.getBlock()
            java.util.BitSet r1 = r1.getPredecessors()
            int r4 = r1.cardinality()
            r5 = 1
            if (r4 == r5) goto L2a
            goto L6
        L2a:
            com.android.dx.ssa.SsaMethod r4 = r12.ssaMeth
            java.util.ArrayList r4 = r4.getBlocks()
            r6 = 0
            int r1 = r1.nextSetBit(r6)
            java.lang.Object r1 = r4.get(r1)
            com.android.dx.ssa.SsaBasicBlock r1 = (com.android.dx.ssa.SsaBasicBlock) r1
            java.util.ArrayList r1 = r1.getInsns()
            int r4 = r1.size()
            int r4 = r4 - r5
            java.lang.Object r1 = r1.get(r4)
            com.android.dx.ssa.SsaInsn r1 = (com.android.dx.ssa.SsaInsn) r1
            com.android.dx.rop.code.Rop r4 = r1.getOpcode()
            int r4 = r4.getOpcode()
            r7 = 43
            if (r4 == r7) goto L57
            goto L6
        L57:
            com.android.dx.rop.code.RegisterSpecList r4 = r1.getSources()
            com.android.dx.rop.code.RegisterSpec r4 = r4.get(r6)
            int r7 = r4.getReg()
            int r8 = r4.getCategory()
            java.util.BitSet r9 = r12.ssaRegsMapped
            boolean r9 = r9.get(r3)
            java.util.BitSet r10 = r12.ssaRegsMapped
            boolean r10 = r10.get(r7)
            r11 = r10 ^ 1
            r11 = r11 & r9
            if (r11 == 0) goto L82
            com.android.dx.ssa.InterferenceRegisterMapper r10 = r12.mapper
            int r10 = r10.oldToNew(r3)
            boolean r10 = r12.tryMapReg(r4, r10, r8)
        L82:
            r11 = r9 ^ 1
            r11 = r11 & r10
            if (r11 == 0) goto L91
            com.android.dx.ssa.InterferenceRegisterMapper r9 = r12.mapper
            int r9 = r9.oldToNew(r7)
            boolean r9 = r12.tryMapReg(r2, r9, r8)
        L91:
            if (r9 == 0) goto L95
            if (r10 != 0) goto Lb4
        L95:
            int r9 = r12.paramRangeEnd
            int r9 = r12.findNextUnreservedRopReg(r9, r8)
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 2
            r10.<init>(r11)
            r10.add(r2)
            r10.add(r4)
        La7:
            boolean r2 = r12.tryMapRegs(r10, r9, r8, r6)
            if (r2 != 0) goto Lb4
            int r9 = r9 + 1
            int r9 = r12.findNextUnreservedRopReg(r9, r8)
            goto La7
        Lb4:
            com.android.dx.rop.code.Insn r2 = r1.getOriginalRopInsn()
            com.android.dx.rop.type.TypeList r2 = r2.getCatches()
            int r2 = r2.size()
            if (r2 == 0) goto Lc3
            goto Lc4
        Lc3:
            r5 = r6
        Lc4:
            com.android.dx.ssa.InterferenceRegisterMapper r2 = r12.mapper
            int r2 = r2.oldToNew(r3)
            com.android.dx.ssa.InterferenceRegisterMapper r3 = r12.mapper
            int r3 = r3.oldToNew(r7)
            if (r2 == r3) goto L6
            if (r5 != 0) goto L6
            r3 = r1
            com.android.dx.ssa.NormalSsaInsn r3 = (com.android.dx.ssa.NormalSsaInsn) r3
            com.android.dx.rop.code.RegisterSpec r4 = r12.insertMoveBefore(r1, r4)
            r3.changeOneSource(r6, r4)
            com.android.dx.rop.code.RegisterSpecList r1 = r1.getSources()
            com.android.dx.rop.code.RegisterSpec r1 = r1.get(r6)
            r12.addMapping(r1, r2)
            goto L6
        Leb:
            return
    }

    private void handleInvokeRangeInsns() {
            r2 = this;
            java.util.ArrayList<com.android.dx.ssa.NormalSsaInsn> r0 = r2.invokeRangeInsns
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.android.dx.ssa.NormalSsaInsn r1 = (com.android.dx.ssa.NormalSsaInsn) r1
            r2.adjustAndMapSourceRangeRange(r1)
            goto L6
        L16:
            return
    }

    private void handleLocalAssociatedOther() {
            r12 = this;
            java.util.Map<com.android.dx.rop.code.LocalItem, java.util.ArrayList<com.android.dx.rop.code.RegisterSpec>> r0 = r12.localVariables
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L52
            java.lang.Object r1 = r0.next()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r12.paramRangeEnd
            r3 = 0
            r4 = r3
        L1a:
            int r5 = r1.size()
            r6 = 1
            r7 = r3
            r8 = r6
        L21:
            if (r7 >= r5) goto L3f
            java.lang.Object r9 = r1.get(r7)
            com.android.dx.rop.code.RegisterSpec r9 = (com.android.dx.rop.code.RegisterSpec) r9
            int r10 = r9.getCategory()
            java.util.BitSet r11 = r12.ssaRegsMapped
            int r9 = r9.getReg()
            boolean r9 = r11.get(r9)
            if (r9 != 0) goto L3c
            if (r10 <= r8) goto L3c
            r8 = r10
        L3c:
            int r7 = r7 + 1
            goto L21
        L3f:
            int r2 = r12.findRopRegForLocal(r2, r8)
            boolean r5 = r12.canMapRegs(r1, r2)
            if (r5 == 0) goto L4d
            boolean r4 = r12.tryMapRegs(r1, r2, r8, r6)
        L4d:
            int r2 = r2 + 1
            if (r4 == 0) goto L1a
            goto La
        L52:
            return
    }

    private void handleLocalAssociatedParams() {
            r7 = this;
            java.util.Map<com.android.dx.rop.code.LocalItem, java.util.ArrayList<com.android.dx.rop.code.RegisterSpec>> r0 = r7.localVariables
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r0.next()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            r3 = 0
            r4 = -1
            r5 = r3
        L1d:
            if (r5 >= r2) goto L3c
            java.lang.Object r4 = r1.get(r5)
            com.android.dx.rop.code.RegisterSpec r4 = (com.android.dx.rop.code.RegisterSpec) r4
            int r6 = r4.getReg()
            int r6 = r7.getParameterIndexForReg(r6)
            if (r6 < 0) goto L38
            int r3 = r4.getCategory()
            r7.addMapping(r4, r6)
            r4 = r6
            goto L3c
        L38:
            int r5 = r5 + 1
            r4 = r6
            goto L1d
        L3c:
            if (r4 >= 0) goto L3f
            goto La
        L3f:
            r2 = 1
            r7.tryMapRegs(r1, r4, r3, r2)
            goto La
        L44:
            return
    }

    private void handleNormalUnassociated() {
            r6 = this;
            com.android.dx.ssa.SsaMethod r0 = r6.ssaMeth
            int r0 = r0.getRegCount()
            r1 = 0
        L7:
            if (r1 >= r0) goto L36
            java.util.BitSet r2 = r6.ssaRegsMapped
            boolean r2 = r2.get(r1)
            if (r2 == 0) goto L12
            goto L33
        L12:
            com.android.dx.rop.code.RegisterSpec r2 = r6.getDefinitionSpecForSsaReg(r1)
            if (r2 != 0) goto L19
            goto L33
        L19:
            int r3 = r2.getCategory()
            int r4 = r6.paramRangeEnd
            int r4 = r6.findNextUnreservedRopReg(r4, r3)
        L23:
            boolean r5 = r6.canMapReg(r2, r4)
            if (r5 != 0) goto L30
            int r4 = r4 + 1
            int r4 = r6.findNextUnreservedRopReg(r4, r3)
            goto L23
        L30:
            r6.addMapping(r2, r4)
        L33:
            int r1 = r1 + 1
            goto L7
        L36:
            return
    }

    private void handlePhiInsns() {
            r2 = this;
            java.util.ArrayList<com.android.dx.ssa.PhiInsn> r0 = r2.phiInsns
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.android.dx.ssa.PhiInsn r1 = (com.android.dx.ssa.PhiInsn) r1
            r2.processPhiInsn(r1)
            goto L6
        L16:
            return
    }

    private void handleUnassociatedParameters() {
            r4 = this;
            com.android.dx.ssa.SsaMethod r0 = r4.ssaMeth
            int r0 = r0.getRegCount()
            r1 = 0
        L7:
            if (r1 >= r0) goto L22
            java.util.BitSet r2 = r4.ssaRegsMapped
            boolean r2 = r2.get(r1)
            if (r2 == 0) goto L12
            goto L1f
        L12:
            int r2 = r4.getParameterIndexForReg(r1)
            com.android.dx.rop.code.RegisterSpec r3 = r4.getDefinitionSpecForSsaReg(r1)
            if (r2 < 0) goto L1f
            r4.addMapping(r3, r2)
        L1f:
            int r1 = r1 + 1
            goto L7
        L22:
            return
    }

    private static boolean isEven(int r1) {
            r0 = 1
            r1 = r1 & r0
            if (r1 != 0) goto L5
            goto L6
        L5:
            r0 = 0
        L6:
            return r0
    }

    private boolean isThisPointerReg(int r1) {
            r0 = this;
            if (r1 != 0) goto Lc
            com.android.dx.ssa.SsaMethod r1 = r0.ssaMeth
            boolean r1 = r1.isStatic()
            if (r1 != 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    private void markReserved(int r3, int r4) {
            r2 = this;
            java.util.BitSet r0 = r2.reservedRopRegs
            int r4 = r4 + r3
            r1 = 1
            r0.set(r3, r4, r1)
            return
    }

    private void printLocalVars() {
            r7 = this;
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "Printing local vars"
            r0.println(r1)
            java.util.Map<com.android.dx.rop.code.LocalItem, java.util.ArrayList<com.android.dx.rop.code.RegisterSpec>> r0 = r7.localVariables
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 123(0x7b, float:1.72E-43)
            r2.append(r3)
            r3 = 32
            r2.append(r3)
            java.lang.Object r4 = r1.getValue()
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.Iterator r4 = r4.iterator()
        L36:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L52
            java.lang.Object r5 = r4.next()
            com.android.dx.rop.code.RegisterSpec r5 = (com.android.dx.rop.code.RegisterSpec) r5
            r6 = 118(0x76, float:1.65E-43)
            r2.append(r6)
            int r5 = r5.getReg()
            r2.append(r5)
            r2.append(r3)
            goto L36
        L52:
            r3 = 125(0x7d, float:1.75E-43)
            r2.append(r3)
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.Object r1 = r1.getKey()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "Local: %s Registers: %s\n"
            r3.printf(r2, r1)
            goto L11
        L67:
            return
    }

    private void processPhiInsn(com.android.dx.ssa.PhiInsn r10) {
            r9 = this;
            com.android.dx.rop.code.RegisterSpec r0 = r10.getResult()
            int r1 = r0.getReg()
            int r2 = r0.getCategory()
            com.android.dx.rop.code.RegisterSpecList r10 = r10.getSources()
            int r3 = r10.size()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            com.android.dx.ssa.back.FirstFitLocalCombiningAllocator$Multiset r5 = new com.android.dx.ssa.back.FirstFitLocalCombiningAllocator$Multiset
            int r6 = r3 + 1
            r5.<init>(r6)
            java.util.BitSet r6 = r9.ssaRegsMapped
            boolean r6 = r6.get(r1)
            if (r6 == 0) goto L32
            com.android.dx.ssa.InterferenceRegisterMapper r0 = r9.mapper
            int r0 = r0.oldToNew(r1)
            r5.add(r0)
            goto L35
        L32:
            r4.add(r0)
        L35:
            r0 = 0
            r1 = r0
        L37:
            if (r1 >= r3) goto L67
            com.android.dx.rop.code.RegisterSpec r6 = r10.get(r1)
            com.android.dx.ssa.SsaMethod r7 = r9.ssaMeth
            int r6 = r6.getReg()
            com.android.dx.ssa.SsaInsn r6 = r7.getDefinitionForRegister(r6)
            com.android.dx.rop.code.RegisterSpec r6 = r6.getResult()
            int r7 = r6.getReg()
            java.util.BitSet r8 = r9.ssaRegsMapped
            boolean r8 = r8.get(r7)
            if (r8 == 0) goto L61
            com.android.dx.ssa.InterferenceRegisterMapper r6 = r9.mapper
            int r6 = r6.oldToNew(r7)
            r5.add(r6)
            goto L64
        L61:
            r4.add(r6)
        L64:
            int r1 = r1 + 1
            goto L37
        L67:
            r10 = r0
        L68:
            int r1 = r5.getSize()
            if (r10 >= r1) goto L78
            int r1 = r5.getAndRemoveHighestCount()
            r9.tryMapRegs(r4, r1, r2, r0)
            int r10 = r10 + 1
            goto L68
        L78:
            int r10 = r9.paramRangeEnd
            int r10 = r9.findNextUnreservedRopReg(r10, r2)
        L7e:
            boolean r1 = r9.tryMapRegs(r4, r10, r2, r0)
            if (r1 != 0) goto L8b
            int r10 = r10 + 1
            int r10 = r9.findNextUnreservedRopReg(r10, r2)
            goto L7e
        L8b:
            return
    }

    private boolean rangeContainsReserved(int r3, int r4) {
            r2 = this;
            r0 = r3
        L1:
            int r1 = r3 + r4
            if (r0 >= r1) goto L12
            java.util.BitSet r1 = r2.reservedRopRegs
            boolean r1 = r1.get(r0)
            if (r1 == 0) goto Lf
            r3 = 1
            return r3
        Lf:
            int r0 = r0 + 1
            goto L1
        L12:
            r3 = 0
            return r3
    }

    private boolean spansParamRange(int r2, int r3) {
            r1 = this;
            int r0 = r1.paramRangeEnd
            if (r2 >= r0) goto L9
            int r2 = r2 + r3
            if (r2 <= r0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            return r2
    }

    private boolean tryMapReg(com.android.dx.rop.code.RegisterSpec r2, int r3, int r4) {
            r1 = this;
            int r0 = r2.getCategory()
            if (r0 > r4) goto L1d
            java.util.BitSet r4 = r1.ssaRegsMapped
            int r0 = r2.getReg()
            boolean r4 = r4.get(r0)
            if (r4 != 0) goto L1d
            boolean r4 = r1.canMapReg(r2, r3)
            if (r4 == 0) goto L1d
            r1.addMapping(r2, r3)
            r2 = 1
            return r2
        L1d:
            r2 = 0
            return r2
    }

    private boolean tryMapRegs(java.util.ArrayList<com.android.dx.rop.code.RegisterSpec> r7, int r8, int r9, boolean r10) {
            r6 = this;
            java.util.Iterator r7 = r7.iterator()
            r0 = 0
            r1 = r0
        L6:
            boolean r2 = r7.hasNext()
            r3 = 1
            if (r2 == 0) goto L38
            java.lang.Object r2 = r7.next()
            com.android.dx.rop.code.RegisterSpec r2 = (com.android.dx.rop.code.RegisterSpec) r2
            java.util.BitSet r4 = r6.ssaRegsMapped
            int r5 = r2.getReg()
            boolean r4 = r4.get(r5)
            if (r4 == 0) goto L20
            goto L6
        L20:
            boolean r4 = r6.tryMapReg(r2, r8, r9)
            if (r4 == 0) goto L2b
            if (r1 == 0) goto L29
            goto L2b
        L29:
            r1 = r0
            goto L2c
        L2b:
            r1 = r3
        L2c:
            if (r4 == 0) goto L6
            if (r10 == 0) goto L6
            int r2 = r2.getCategory()
            r6.markReserved(r8, r2)
            goto L6
        L38:
            r7 = r1 ^ 1
            return r7
    }

    @Override // com.android.dx.ssa.back.RegisterAllocator
    public com.android.dx.ssa.RegisterMapper allocateRegisters() {
            r1 = this;
            r1.analyzeInstructions()
            r1.handleLocalAssociatedParams()
            r1.handleUnassociatedParameters()
            r1.handleInvokeRangeInsns()
            r1.handleLocalAssociatedOther()
            r1.handleCheckCastResults()
            r1.handlePhiInsns()
            r1.handleNormalUnassociated()
            com.android.dx.ssa.InterferenceRegisterMapper r0 = r1.mapper
            return r0
    }

    public com.android.dx.rop.code.RegisterSpecList ssaSetToSpecs(com.android.dx.util.IntSet r5) {
            r4 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = new com.android.dx.rop.code.RegisterSpecList
            int r1 = r5.elements()
            r0.<init>(r1)
            com.android.dx.util.IntIterator r5 = r5.iterator()
            r1 = 0
        Le:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L23
            int r2 = r1 + 1
            int r3 = r5.next()
            com.android.dx.rop.code.RegisterSpec r3 = r4.getDefinitionSpecForSsaReg(r3)
            r0.set(r1, r3)
            r1 = r2
            goto Le
        L23:
            return r0
    }

    @Override // com.android.dx.ssa.back.RegisterAllocator
    public boolean wantsParamsMovedHigh() {
            r1 = this;
            r0 = 1
            return r0
    }
}
