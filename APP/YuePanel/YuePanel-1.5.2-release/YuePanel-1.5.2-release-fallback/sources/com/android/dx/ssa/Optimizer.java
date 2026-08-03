package com.android.dx.ssa;

/* JADX INFO: loaded from: classes.dex */
public class Optimizer {
    private static com.android.dx.rop.code.TranslationAdvice advice = null;
    private static boolean preserveLocals = true;

    public enum OptionalStep extends java.lang.Enum<com.android.dx.ssa.Optimizer.OptionalStep> {
        private static final /* synthetic */ com.android.dx.ssa.Optimizer.OptionalStep[] $VALUES = null;
        public static final com.android.dx.ssa.Optimizer.OptionalStep CONST_COLLECTOR = null;
        public static final com.android.dx.ssa.Optimizer.OptionalStep ESCAPE_ANALYSIS = null;
        public static final com.android.dx.ssa.Optimizer.OptionalStep LITERAL_UPGRADE = null;
        public static final com.android.dx.ssa.Optimizer.OptionalStep MOVE_PARAM_COMBINER = null;
        public static final com.android.dx.ssa.Optimizer.OptionalStep SCCP = null;

        static {
                com.android.dx.ssa.Optimizer$OptionalStep r0 = new com.android.dx.ssa.Optimizer$OptionalStep
                java.lang.String r1 = "MOVE_PARAM_COMBINER"
                r2 = 0
                r0.<init>(r1, r2)
                com.android.dx.ssa.Optimizer.OptionalStep.MOVE_PARAM_COMBINER = r0
                com.android.dx.ssa.Optimizer$OptionalStep r1 = new com.android.dx.ssa.Optimizer$OptionalStep
                java.lang.String r2 = "SCCP"
                r3 = 1
                r1.<init>(r2, r3)
                com.android.dx.ssa.Optimizer.OptionalStep.SCCP = r1
                com.android.dx.ssa.Optimizer$OptionalStep r2 = new com.android.dx.ssa.Optimizer$OptionalStep
                java.lang.String r3 = "LITERAL_UPGRADE"
                r4 = 2
                r2.<init>(r3, r4)
                com.android.dx.ssa.Optimizer.OptionalStep.LITERAL_UPGRADE = r2
                com.android.dx.ssa.Optimizer$OptionalStep r3 = new com.android.dx.ssa.Optimizer$OptionalStep
                java.lang.String r4 = "CONST_COLLECTOR"
                r5 = 3
                r3.<init>(r4, r5)
                com.android.dx.ssa.Optimizer.OptionalStep.CONST_COLLECTOR = r3
                com.android.dx.ssa.Optimizer$OptionalStep r4 = new com.android.dx.ssa.Optimizer$OptionalStep
                java.lang.String r5 = "ESCAPE_ANALYSIS"
                r6 = 4
                r4.<init>(r5, r6)
                com.android.dx.ssa.Optimizer.OptionalStep.ESCAPE_ANALYSIS = r4
                com.android.dx.ssa.Optimizer$OptionalStep[] r0 = new com.android.dx.ssa.Optimizer.OptionalStep[]{r0, r1, r2, r3, r4}
                com.android.dx.ssa.Optimizer.OptionalStep.$VALUES = r0
                return
        }

        OptionalStep(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.android.dx.ssa.Optimizer.OptionalStep valueOf(java.lang.String r1) {
                java.lang.Class<com.android.dx.ssa.Optimizer$OptionalStep> r0 = com.android.dx.ssa.Optimizer.OptionalStep.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.android.dx.ssa.Optimizer$OptionalStep r1 = (com.android.dx.ssa.Optimizer.OptionalStep) r1
                return r1
        }

        public static com.android.dx.ssa.Optimizer.OptionalStep[] values() {
                com.android.dx.ssa.Optimizer$OptionalStep[] r0 = com.android.dx.ssa.Optimizer.OptionalStep.$VALUES
                java.lang.Object r0 = r0.clone()
                com.android.dx.ssa.Optimizer$OptionalStep[] r0 = (com.android.dx.ssa.Optimizer.OptionalStep[]) r0
                return r0
        }
    }

    static {
            return
    }

    public Optimizer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.android.dx.ssa.SsaMethod debugDeadCodeRemover(com.android.dx.rop.code.RopMethod r0, int r1, boolean r2, boolean r3, com.android.dx.rop.code.TranslationAdvice r4) {
            com.android.dx.ssa.Optimizer.preserveLocals = r3
            com.android.dx.ssa.Optimizer.advice = r4
            com.android.dx.ssa.SsaMethod r0 = com.android.dx.ssa.SsaConverter.convertToSsaMethod(r0, r1, r2)
            com.android.dx.ssa.DeadCodeRemover.process(r0)
            return r0
    }

    public static com.android.dx.ssa.SsaMethod debugEdgeSplit(com.android.dx.rop.code.RopMethod r0, int r1, boolean r2, boolean r3, com.android.dx.rop.code.TranslationAdvice r4) {
            com.android.dx.ssa.Optimizer.preserveLocals = r3
            com.android.dx.ssa.Optimizer.advice = r4
            com.android.dx.ssa.SsaMethod r0 = com.android.dx.ssa.SsaConverter.testEdgeSplit(r0, r1, r2)
            return r0
    }

    public static com.android.dx.ssa.SsaMethod debugNoRegisterAllocation(com.android.dx.rop.code.RopMethod r0, int r1, boolean r2, boolean r3, com.android.dx.rop.code.TranslationAdvice r4, java.util.EnumSet<com.android.dx.ssa.Optimizer.OptionalStep> r5) {
            com.android.dx.ssa.Optimizer.preserveLocals = r3
            com.android.dx.ssa.Optimizer.advice = r4
            com.android.dx.ssa.SsaMethod r0 = com.android.dx.ssa.SsaConverter.convertToSsaMethod(r0, r1, r2)
            runSsaFormSteps(r0, r5)
            com.android.dx.ssa.back.LivenessAnalyzer.constructInterferenceGraph(r0)
            return r0
    }

    public static com.android.dx.ssa.SsaMethod debugPhiPlacement(com.android.dx.rop.code.RopMethod r0, int r1, boolean r2, boolean r3, com.android.dx.rop.code.TranslationAdvice r4) {
            com.android.dx.ssa.Optimizer.preserveLocals = r3
            com.android.dx.ssa.Optimizer.advice = r4
            com.android.dx.ssa.SsaMethod r0 = com.android.dx.ssa.SsaConverter.testPhiPlacement(r0, r1, r2)
            return r0
    }

    public static com.android.dx.ssa.SsaMethod debugRenaming(com.android.dx.rop.code.RopMethod r0, int r1, boolean r2, boolean r3, com.android.dx.rop.code.TranslationAdvice r4) {
            com.android.dx.ssa.Optimizer.preserveLocals = r3
            com.android.dx.ssa.Optimizer.advice = r4
            com.android.dx.ssa.SsaMethod r0 = com.android.dx.ssa.SsaConverter.convertToSsaMethod(r0, r1, r2)
            return r0
    }

    public static com.android.dx.rop.code.TranslationAdvice getAdvice() {
            com.android.dx.rop.code.TranslationAdvice r0 = com.android.dx.ssa.Optimizer.advice
            return r0
    }

    public static boolean getPreserveLocals() {
            boolean r0 = com.android.dx.ssa.Optimizer.preserveLocals
            return r0
    }

    public static com.android.dx.rop.code.RopMethod optimize(com.android.dx.rop.code.RopMethod r7, int r8, boolean r9, boolean r10, com.android.dx.rop.code.TranslationAdvice r11) {
            java.lang.Class<com.android.dx.ssa.Optimizer$OptionalStep> r0 = com.android.dx.ssa.Optimizer.OptionalStep.class
            java.util.EnumSet r6 = java.util.EnumSet.allOf(r0)
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            com.android.dx.rop.code.RopMethod r7 = optimize(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static com.android.dx.rop.code.RopMethod optimize(com.android.dx.rop.code.RopMethod r1, int r2, boolean r3, boolean r4, com.android.dx.rop.code.TranslationAdvice r5, java.util.EnumSet<com.android.dx.ssa.Optimizer.OptionalStep> r6) {
            com.android.dx.ssa.Optimizer.preserveLocals = r4
            com.android.dx.ssa.Optimizer.advice = r5
            com.android.dx.ssa.SsaMethod r4 = com.android.dx.ssa.SsaConverter.convertToSsaMethod(r1, r2, r3)
            runSsaFormSteps(r4, r6)
            r5 = 0
            com.android.dx.rop.code.RopMethod r4 = com.android.dx.ssa.back.SsaToRop.convertToRopMethod(r4, r5)
            com.android.dx.rop.code.BasicBlockList r5 = r4.getBlocks()
            int r5 = r5.getRegCount()
            com.android.dx.rop.code.TranslationAdvice r0 = com.android.dx.ssa.Optimizer.advice
            int r0 = r0.getMaxOptimalRegisterCount()
            if (r5 <= r0) goto L24
            com.android.dx.rop.code.RopMethod r4 = optimizeMinimizeRegisters(r1, r2, r3, r6)
        L24:
            return r4
    }

    private static com.android.dx.rop.code.RopMethod optimizeMinimizeRegisters(com.android.dx.rop.code.RopMethod r0, int r1, boolean r2, java.util.EnumSet<com.android.dx.ssa.Optimizer.OptionalStep> r3) {
            com.android.dx.ssa.SsaMethod r0 = com.android.dx.ssa.SsaConverter.convertToSsaMethod(r0, r1, r2)
            java.util.EnumSet r1 = r3.clone()
            com.android.dx.ssa.Optimizer$OptionalStep r2 = com.android.dx.ssa.Optimizer.OptionalStep.CONST_COLLECTOR
            r1.remove(r2)
            runSsaFormSteps(r0, r1)
            r1 = 1
            com.android.dx.rop.code.RopMethod r0 = com.android.dx.ssa.back.SsaToRop.convertToRopMethod(r0, r1)
            return r0
    }

    private static void runSsaFormSteps(com.android.dx.ssa.SsaMethod r3, java.util.EnumSet<com.android.dx.ssa.Optimizer.OptionalStep> r4) {
            com.android.dx.ssa.Optimizer$OptionalStep r0 = com.android.dx.ssa.Optimizer.OptionalStep.MOVE_PARAM_COMBINER
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto Lb
            com.android.dx.ssa.MoveParamCombiner.process(r3)
        Lb:
            com.android.dx.ssa.Optimizer$OptionalStep r0 = com.android.dx.ssa.Optimizer.OptionalStep.SCCP
            boolean r0 = r4.contains(r0)
            r1 = 0
            if (r0 == 0) goto L1c
            com.android.dx.ssa.SCCP.process(r3)
            com.android.dx.ssa.DeadCodeRemover.process(r3)
            r0 = r1
            goto L1d
        L1c:
            r0 = 1
        L1d:
            com.android.dx.ssa.Optimizer$OptionalStep r2 = com.android.dx.ssa.Optimizer.OptionalStep.LITERAL_UPGRADE
            boolean r2 = r4.contains(r2)
            if (r2 == 0) goto L2c
            com.android.dx.ssa.LiteralOpUpgrader.process(r3)
            com.android.dx.ssa.DeadCodeRemover.process(r3)
            r0 = r1
        L2c:
            com.android.dx.ssa.Optimizer$OptionalStep r2 = com.android.dx.ssa.Optimizer.OptionalStep.ESCAPE_ANALYSIS
            r4.remove(r2)
            boolean r2 = r4.contains(r2)
            if (r2 == 0) goto L3e
            com.android.dx.ssa.EscapeAnalysis.process(r3)
            com.android.dx.ssa.DeadCodeRemover.process(r3)
            r0 = r1
        L3e:
            com.android.dx.ssa.Optimizer$OptionalStep r2 = com.android.dx.ssa.Optimizer.OptionalStep.CONST_COLLECTOR
            boolean r4 = r4.contains(r2)
            if (r4 == 0) goto L4d
            com.android.dx.ssa.ConstCollector.process(r3)
            com.android.dx.ssa.DeadCodeRemover.process(r3)
            goto L4e
        L4d:
            r1 = r0
        L4e:
            if (r1 == 0) goto L53
            com.android.dx.ssa.DeadCodeRemover.process(r3)
        L53:
            com.android.dx.ssa.PhiTypeResolver.process(r3)
            return
    }
}
