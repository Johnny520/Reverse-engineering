package com.android.dx.dex.cf;

/* JADX INFO: loaded from: classes.dex */
public class OptimizerOptions {
    private java.util.HashSet<java.lang.String> dontOptimizeList;
    private java.util.HashSet<java.lang.String> optimizeList;
    private boolean optimizeListsLoaded;

    public OptimizerOptions() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.util.HashSet<java.lang.String> loadStringsFromFile(java.lang.String r4) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.io.IOException -> L19
            r1.<init>(r4)     // Catch: java.io.IOException -> L19
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.io.IOException -> L19
            r2.<init>(r1)     // Catch: java.io.IOException -> L19
        Lf:
            java.lang.String r3 = r2.readLine()     // Catch: java.io.IOException -> L19
            if (r3 == 0) goto L1b
            r0.add(r3)     // Catch: java.io.IOException -> L19
            goto Lf
        L19:
            r0 = move-exception
            goto L1f
        L1b:
            r1.close()     // Catch: java.io.IOException -> L19
            return r0
        L1f:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error with optimize list: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r0)
            throw r1
    }

    public void compareOptimizerStep(com.android.dx.rop.code.RopMethod r8, int r9, boolean r10, com.android.dx.dex.cf.CfOptions r11, com.android.dx.rop.code.TranslationAdvice r12, com.android.dx.rop.code.RopMethod r13) {
            r7 = this;
            java.lang.Class<com.android.dx.ssa.Optimizer$OptionalStep> r0 = com.android.dx.ssa.Optimizer.OptionalStep.class
            java.util.EnumSet r6 = java.util.EnumSet.allOf(r0)
            com.android.dx.ssa.Optimizer$OptionalStep r0 = com.android.dx.ssa.Optimizer.OptionalStep.CONST_COLLECTOR
            r6.remove(r0)
            boolean r4 = r11.localInfo
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            com.android.dx.rop.code.RopMethod r8 = com.android.dx.ssa.Optimizer.optimize(r1, r2, r3, r4, r5, r6)
            com.android.dx.rop.code.BasicBlockList r9 = r13.getBlocks()
            int r9 = r9.getEffectiveInstructionCount()
            com.android.dx.rop.code.BasicBlockList r10 = r8.getBlocks()
            int r10 = r10.getEffectiveInstructionCount()
            java.io.PrintStream r11 = java.lang.System.err
            com.android.dx.rop.code.BasicBlockList r12 = r13.getBlocks()
            int r12 = r12.getRegCount()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            com.android.dx.rop.code.BasicBlockList r12 = r8.getBlocks()
            int r12 = r12.getRegCount()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            com.android.dx.rop.code.BasicBlockList r12 = r8.getBlocks()
            int r12 = r12.getRegCount()
            com.android.dx.rop.code.BasicBlockList r13 = r13.getBlocks()
            int r13 = r13.getRegCount()
            int r12 = r12 - r13
            float r12 = (float) r12
            com.android.dx.rop.code.BasicBlockList r8 = r8.getBlocks()
            int r8 = r8.getRegCount()
            float r8 = (float) r8
            float r12 = r12 / r8
            double r12 = (double) r12
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r12 = r12 * r2
            java.lang.Double r8 = java.lang.Double.valueOf(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            int r9 = r10 - r9
            float r9 = (float) r9
            float r10 = (float) r10
            float r9 = r9 / r10
            double r9 = (double) r9
            double r9 = r9 * r2
            java.lang.Double r5 = java.lang.Double.valueOf(r9)
            r2 = r8
            r3 = r12
            java.lang.Object[] r8 = new java.lang.Object[]{r0, r1, r2, r3, r4, r5}
            java.lang.String r9 = "optimize step regs:(%d/%d/%.2f%%) insns:(%d/%d/%.2f%%)\n"
            r11.printf(r9, r8)
            return
    }

    public void loadOptimizeLists(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r1.optimizeListsLoaded
            if (r0 == 0) goto L5
            return
        L5:
            if (r2 == 0) goto L12
            if (r3 != 0) goto La
            goto L12
        La:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "optimize and don't optimize lists  are mutually exclusive."
            r2.<init>(r3)
            throw r2
        L12:
            if (r2 == 0) goto L1a
            java.util.HashSet r2 = loadStringsFromFile(r2)
            r1.optimizeList = r2
        L1a:
            if (r3 == 0) goto L22
            java.util.HashSet r2 = loadStringsFromFile(r3)
            r1.dontOptimizeList = r2
        L22:
            r2 = 1
            r1.optimizeListsLoaded = r2
            return
    }

    public boolean shouldOptimize(java.lang.String r3) {
            r2 = this;
            java.util.HashSet<java.lang.String> r0 = r2.optimizeList
            if (r0 == 0) goto L9
            boolean r3 = r0.contains(r3)
            return r3
        L9:
            java.util.HashSet<java.lang.String> r0 = r2.dontOptimizeList
            r1 = 1
            if (r0 == 0) goto L14
            boolean r3 = r0.contains(r3)
            r3 = r3 ^ r1
            return r3
        L14:
            return r1
    }
}
