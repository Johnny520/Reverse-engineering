package com.android.dx.ssa.back;

/* JADX INFO: loaded from: classes.dex */
public class LivenessAnalyzer {
    private com.android.dx.ssa.SsaBasicBlock blockN;
    private final com.android.dx.ssa.back.InterferenceGraph interference;
    private final java.util.BitSet liveOutBlocks;
    private com.android.dx.ssa.back.LivenessAnalyzer.NextFunction nextFunction;
    private final int regV;
    private final com.android.dx.ssa.SsaMethod ssaMeth;
    private int statementIndex;
    private final java.util.BitSet visitedBlocks;

    /* JADX INFO: renamed from: com.android.dx.ssa.back.LivenessAnalyzer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$android$dx$ssa$back$LivenessAnalyzer$NextFunction = null;

        static {
                com.android.dx.ssa.back.LivenessAnalyzer$NextFunction[] r0 = com.android.dx.ssa.back.LivenessAnalyzer.NextFunction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.android.dx.ssa.back.LivenessAnalyzer.AnonymousClass1.$SwitchMap$com$android$dx$ssa$back$LivenessAnalyzer$NextFunction = r0
                com.android.dx.ssa.back.LivenessAnalyzer$NextFunction r1 = com.android.dx.ssa.back.LivenessAnalyzer.NextFunction.LIVE_IN_AT_STATEMENT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.android.dx.ssa.back.LivenessAnalyzer.AnonymousClass1.$SwitchMap$com$android$dx$ssa$back$LivenessAnalyzer$NextFunction     // Catch: java.lang.NoSuchFieldError -> L1d
                com.android.dx.ssa.back.LivenessAnalyzer$NextFunction r1 = com.android.dx.ssa.back.LivenessAnalyzer.NextFunction.LIVE_OUT_AT_STATEMENT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.android.dx.ssa.back.LivenessAnalyzer.AnonymousClass1.$SwitchMap$com$android$dx$ssa$back$LivenessAnalyzer$NextFunction     // Catch: java.lang.NoSuchFieldError -> L28
                com.android.dx.ssa.back.LivenessAnalyzer$NextFunction r1 = com.android.dx.ssa.back.LivenessAnalyzer.NextFunction.LIVE_OUT_AT_BLOCK     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    public enum NextFunction extends java.lang.Enum<com.android.dx.ssa.back.LivenessAnalyzer.NextFunction> {
        private static final /* synthetic */ com.android.dx.ssa.back.LivenessAnalyzer.NextFunction[] $VALUES = null;
        public static final com.android.dx.ssa.back.LivenessAnalyzer.NextFunction DONE = null;
        public static final com.android.dx.ssa.back.LivenessAnalyzer.NextFunction LIVE_IN_AT_STATEMENT = null;
        public static final com.android.dx.ssa.back.LivenessAnalyzer.NextFunction LIVE_OUT_AT_BLOCK = null;
        public static final com.android.dx.ssa.back.LivenessAnalyzer.NextFunction LIVE_OUT_AT_STATEMENT = null;

        static {
                com.android.dx.ssa.back.LivenessAnalyzer$NextFunction r0 = new com.android.dx.ssa.back.LivenessAnalyzer$NextFunction
                java.lang.String r1 = "LIVE_IN_AT_STATEMENT"
                r2 = 0
                r0.<init>(r1, r2)
                com.android.dx.ssa.back.LivenessAnalyzer.NextFunction.LIVE_IN_AT_STATEMENT = r0
                com.android.dx.ssa.back.LivenessAnalyzer$NextFunction r1 = new com.android.dx.ssa.back.LivenessAnalyzer$NextFunction
                java.lang.String r2 = "LIVE_OUT_AT_STATEMENT"
                r3 = 1
                r1.<init>(r2, r3)
                com.android.dx.ssa.back.LivenessAnalyzer.NextFunction.LIVE_OUT_AT_STATEMENT = r1
                com.android.dx.ssa.back.LivenessAnalyzer$NextFunction r2 = new com.android.dx.ssa.back.LivenessAnalyzer$NextFunction
                java.lang.String r3 = "LIVE_OUT_AT_BLOCK"
                r4 = 2
                r2.<init>(r3, r4)
                com.android.dx.ssa.back.LivenessAnalyzer.NextFunction.LIVE_OUT_AT_BLOCK = r2
                com.android.dx.ssa.back.LivenessAnalyzer$NextFunction r3 = new com.android.dx.ssa.back.LivenessAnalyzer$NextFunction
                java.lang.String r4 = "DONE"
                r5 = 3
                r3.<init>(r4, r5)
                com.android.dx.ssa.back.LivenessAnalyzer.NextFunction.DONE = r3
                com.android.dx.ssa.back.LivenessAnalyzer$NextFunction[] r0 = new com.android.dx.ssa.back.LivenessAnalyzer.NextFunction[]{r0, r1, r2, r3}
                com.android.dx.ssa.back.LivenessAnalyzer.NextFunction.$VALUES = r0
                return
        }

        NextFunction(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.android.dx.ssa.back.LivenessAnalyzer.NextFunction valueOf(java.lang.String r1) {
                java.lang.Class<com.android.dx.ssa.back.LivenessAnalyzer$NextFunction> r0 = com.android.dx.ssa.back.LivenessAnalyzer.NextFunction.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.android.dx.ssa.back.LivenessAnalyzer$NextFunction r1 = (com.android.dx.ssa.back.LivenessAnalyzer.NextFunction) r1
                return r1
        }

        public static com.android.dx.ssa.back.LivenessAnalyzer.NextFunction[] values() {
                com.android.dx.ssa.back.LivenessAnalyzer$NextFunction[] r0 = com.android.dx.ssa.back.LivenessAnalyzer.NextFunction.$VALUES
                java.lang.Object r0 = r0.clone()
                com.android.dx.ssa.back.LivenessAnalyzer$NextFunction[] r0 = (com.android.dx.ssa.back.LivenessAnalyzer.NextFunction[]) r0
                return r0
        }
    }

    private LivenessAnalyzer(com.android.dx.ssa.SsaMethod r2, int r3, com.android.dx.ssa.back.InterferenceGraph r4) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = r2.getBlocks()
            int r0 = r0.size()
            r1.ssaMeth = r2
            r1.regV = r3
            java.util.BitSet r2 = new java.util.BitSet
            r2.<init>(r0)
            r1.visitedBlocks = r2
            java.util.BitSet r2 = new java.util.BitSet
            r2.<init>(r0)
            r1.liveOutBlocks = r2
            r1.interference = r4
            return
    }

    private static void coInterferePhiRegisters(com.android.dx.ssa.back.InterferenceGraph r2, com.android.dx.rop.code.RegisterSpec r3, com.android.dx.rop.code.RegisterSpecList r4) {
            int r3 = r3.getReg()
            r0 = 0
        L5:
            int r1 = r4.size()
            if (r0 >= r1) goto L19
            com.android.dx.rop.code.RegisterSpec r1 = r4.get(r0)
            int r1 = r1.getReg()
            r2.add(r3, r1)
            int r0 = r0 + 1
            goto L5
        L19:
            return
    }

    private static void coInterferePhis(com.android.dx.ssa.SsaMethod r9, com.android.dx.ssa.back.InterferenceGraph r10) {
            java.util.ArrayList r9 = r9.getBlocks()
            java.util.Iterator r9 = r9.iterator()
        L8:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r0 = r9.next()
            com.android.dx.ssa.SsaBasicBlock r0 = (com.android.dx.ssa.SsaBasicBlock) r0
            java.util.List r0 = r0.getPhiInsns()
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L1e:
            if (r3 >= r1) goto L8
            r4 = r2
        L21:
            if (r4 >= r1) goto L5e
            if (r3 != r4) goto L26
            goto L5b
        L26:
            java.lang.Object r5 = r0.get(r3)
            com.android.dx.ssa.SsaInsn r5 = (com.android.dx.ssa.SsaInsn) r5
            java.lang.Object r6 = r0.get(r4)
            com.android.dx.ssa.SsaInsn r6 = (com.android.dx.ssa.SsaInsn) r6
            com.android.dx.rop.code.RegisterSpec r7 = r5.getResult()
            com.android.dx.rop.code.RegisterSpecList r8 = r6.getSources()
            coInterferePhiRegisters(r10, r7, r8)
            com.android.dx.rop.code.RegisterSpec r7 = r6.getResult()
            com.android.dx.rop.code.RegisterSpecList r8 = r5.getSources()
            coInterferePhiRegisters(r10, r7, r8)
            com.android.dx.rop.code.RegisterSpec r5 = r5.getResult()
            int r5 = r5.getReg()
            com.android.dx.rop.code.RegisterSpec r6 = r6.getResult()
            int r6 = r6.getReg()
            r10.add(r5, r6)
        L5b:
            int r4 = r4 + 1
            goto L21
        L5e:
            int r3 = r3 + 1
            goto L1e
        L61:
            return
    }

    public static com.android.dx.ssa.back.InterferenceGraph constructInterferenceGraph(com.android.dx.ssa.SsaMethod r4) {
            int r0 = r4.getRegCount()
            com.android.dx.ssa.back.InterferenceGraph r1 = new com.android.dx.ssa.back.InterferenceGraph
            r1.<init>(r0)
            r2 = 0
        La:
            if (r2 >= r0) goto L17
            com.android.dx.ssa.back.LivenessAnalyzer r3 = new com.android.dx.ssa.back.LivenessAnalyzer
            r3.<init>(r4, r2, r1)
            r3.run()
            int r2 = r2 + 1
            goto La
        L17:
            coInterferePhis(r4, r1)
            return r1
    }

    private void handleTailRecursion() {
            r3 = this;
        L0:
            com.android.dx.ssa.back.LivenessAnalyzer$NextFunction r0 = r3.nextFunction
            com.android.dx.ssa.back.LivenessAnalyzer$NextFunction r1 = com.android.dx.ssa.back.LivenessAnalyzer.NextFunction.DONE
            if (r0 == r1) goto L2a
            int[] r2 = com.android.dx.ssa.back.LivenessAnalyzer.AnonymousClass1.$SwitchMap$com$android$dx$ssa$back$LivenessAnalyzer$NextFunction
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r2 = 1
            if (r0 == r2) goto L24
            r2 = 2
            if (r0 == r2) goto L1e
            r2 = 3
            if (r0 == r2) goto L18
            goto L0
        L18:
            r3.nextFunction = r1
            r3.liveOutAtBlock()
            goto L0
        L1e:
            r3.nextFunction = r1
            r3.liveOutAtStatement()
            goto L0
        L24:
            r3.nextFunction = r1
            r3.liveInAtStatement()
            goto L0
        L2a:
            return
    }

    private void liveInAtStatement() {
            r2 = this;
            int r0 = r2.statementIndex
            if (r0 != 0) goto L17
            com.android.dx.ssa.SsaBasicBlock r0 = r2.blockN
            int r1 = r2.regV
            r0.addLiveIn(r1)
            com.android.dx.ssa.SsaBasicBlock r0 = r2.blockN
            java.util.BitSet r0 = r0.getPredecessors()
            java.util.BitSet r1 = r2.liveOutBlocks
            r1.or(r0)
            goto L1f
        L17:
            int r0 = r0 + (-1)
            r2.statementIndex = r0
            com.android.dx.ssa.back.LivenessAnalyzer$NextFunction r0 = com.android.dx.ssa.back.LivenessAnalyzer.NextFunction.LIVE_OUT_AT_STATEMENT
            r2.nextFunction = r0
        L1f:
            return
    }

    private void liveOutAtBlock() {
            r2 = this;
            java.util.BitSet r0 = r2.visitedBlocks
            com.android.dx.ssa.SsaBasicBlock r1 = r2.blockN
            int r1 = r1.getIndex()
            boolean r0 = r0.get(r1)
            if (r0 != 0) goto L32
            java.util.BitSet r0 = r2.visitedBlocks
            com.android.dx.ssa.SsaBasicBlock r1 = r2.blockN
            int r1 = r1.getIndex()
            r0.set(r1)
            com.android.dx.ssa.SsaBasicBlock r0 = r2.blockN
            int r1 = r2.regV
            r0.addLiveOut(r1)
            com.android.dx.ssa.SsaBasicBlock r0 = r2.blockN
            java.util.ArrayList r0 = r0.getInsns()
            int r0 = r0.size()
            int r0 = r0 + (-1)
            r2.statementIndex = r0
            com.android.dx.ssa.back.LivenessAnalyzer$NextFunction r0 = com.android.dx.ssa.back.LivenessAnalyzer.NextFunction.LIVE_OUT_AT_STATEMENT
            r2.nextFunction = r0
        L32:
            return
    }

    private void liveOutAtStatement() {
            r3 = this;
            com.android.dx.ssa.SsaBasicBlock r0 = r3.blockN
            java.util.ArrayList r0 = r0.getInsns()
            int r1 = r3.statementIndex
            java.lang.Object r0 = r0.get(r1)
            com.android.dx.ssa.SsaInsn r0 = (com.android.dx.ssa.SsaInsn) r0
            com.android.dx.rop.code.RegisterSpec r1 = r0.getResult()
            int r2 = r3.regV
            boolean r0 = r0.isResultReg(r2)
            if (r0 != 0) goto L2b
            if (r1 == 0) goto L27
            com.android.dx.ssa.back.InterferenceGraph r0 = r3.interference
            int r2 = r3.regV
            int r1 = r1.getReg()
            r0.add(r2, r1)
        L27:
            com.android.dx.ssa.back.LivenessAnalyzer$NextFunction r0 = com.android.dx.ssa.back.LivenessAnalyzer.NextFunction.LIVE_IN_AT_STATEMENT
            r3.nextFunction = r0
        L2b:
            return
    }

    public void run() {
            r4 = this;
            com.android.dx.ssa.SsaMethod r0 = r4.ssaMeth
            int r1 = r4.regV
            java.util.List r0 = r0.getUseListForRegister(r1)
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r0.next()
            com.android.dx.ssa.SsaInsn r1 = (com.android.dx.ssa.SsaInsn) r1
            com.android.dx.ssa.back.LivenessAnalyzer$NextFunction r2 = com.android.dx.ssa.back.LivenessAnalyzer.NextFunction.DONE
            r4.nextFunction = r2
            boolean r2 = r1 instanceof com.android.dx.ssa.PhiInsn
            if (r2 == 0) goto L44
            com.android.dx.ssa.PhiInsn r1 = (com.android.dx.ssa.PhiInsn) r1
            int r2 = r4.regV
            com.android.dx.ssa.SsaMethod r3 = r4.ssaMeth
            java.util.List r1 = r1.predBlocksForReg(r2, r3)
            java.util.Iterator r1 = r1.iterator()
        L2e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc
            java.lang.Object r2 = r1.next()
            com.android.dx.ssa.SsaBasicBlock r2 = (com.android.dx.ssa.SsaBasicBlock) r2
            r4.blockN = r2
            com.android.dx.ssa.back.LivenessAnalyzer$NextFunction r2 = com.android.dx.ssa.back.LivenessAnalyzer.NextFunction.LIVE_OUT_AT_BLOCK
            r4.nextFunction = r2
            r4.handleTailRecursion()
            goto L2e
        L44:
            com.android.dx.ssa.SsaBasicBlock r2 = r1.getBlock()
            r4.blockN = r2
            java.util.ArrayList r2 = r2.getInsns()
            int r1 = r2.indexOf(r1)
            r4.statementIndex = r1
            if (r1 < 0) goto L5e
            com.android.dx.ssa.back.LivenessAnalyzer$NextFunction r1 = com.android.dx.ssa.back.LivenessAnalyzer.NextFunction.LIVE_IN_AT_STATEMENT
            r4.nextFunction = r1
            r4.handleTailRecursion()
            goto Lc
        L5e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "insn not found in it's own block"
            r0.<init>(r1)
            throw r0
        L66:
            java.util.BitSet r0 = r4.liveOutBlocks
            r1 = 0
            int r0 = r0.nextSetBit(r1)
            if (r0 < 0) goto L8a
            com.android.dx.ssa.SsaMethod r1 = r4.ssaMeth
            java.util.ArrayList r1 = r1.getBlocks()
            java.lang.Object r1 = r1.get(r0)
            com.android.dx.ssa.SsaBasicBlock r1 = (com.android.dx.ssa.SsaBasicBlock) r1
            r4.blockN = r1
            java.util.BitSet r1 = r4.liveOutBlocks
            r1.clear(r0)
            com.android.dx.ssa.back.LivenessAnalyzer$NextFunction r0 = com.android.dx.ssa.back.LivenessAnalyzer.NextFunction.LIVE_OUT_AT_BLOCK
            r4.nextFunction = r0
            r4.handleTailRecursion()
            goto L66
        L8a:
            return
    }
}
