package com.android.dx.dex.cf;

/* JADX INFO: loaded from: classes.dex */
public final class CodeStatistics {
    private static final boolean DEBUG = false;
    public int dexRunningDeltaInsns;
    public int dexRunningDeltaRegisters;
    public int dexRunningTotalInsns;
    public int runningDeltaInsns;
    public int runningDeltaRegisters;
    public int runningOriginalBytes;
    public int runningTotalInsns;

    public CodeStatistics() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.runningDeltaRegisters = r0
            r1.runningDeltaInsns = r0
            r1.runningTotalInsns = r0
            r1.dexRunningDeltaRegisters = r0
            r1.dexRunningDeltaInsns = r0
            r1.dexRunningTotalInsns = r0
            r1.runningOriginalBytes = r0
            return
    }

    public void dumpStatistics(java.io.PrintStream r8) {
            r7 = this;
            int r0 = r7.runningDeltaInsns
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r7.runningTotalInsns
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r7.runningDeltaInsns
            float r3 = (float) r2
            int r4 = r7.runningTotalInsns
            int r2 = java.lang.Math.abs(r2)
            int r4 = r4 + r2
            float r2 = (float) r4
            float r3 = r3 / r2
            double r2 = (double) r3
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 * r4
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            int r3 = r7.runningDeltaRegisters
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3}
            java.lang.String r1 = "Optimizer Delta Rop Insns: %d total: %d (%.2f%%) Delta Registers: %d\n"
            r8.printf(r1, r0)
            int r0 = r7.dexRunningDeltaInsns
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r7.dexRunningTotalInsns
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r7.dexRunningDeltaInsns
            float r3 = (float) r2
            int r6 = r7.dexRunningTotalInsns
            int r2 = java.lang.Math.abs(r2)
            int r6 = r6 + r2
            float r2 = (float) r6
            float r3 = r3 / r2
            double r2 = (double) r3
            double r2 = r2 * r4
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            int r3 = r7.dexRunningDeltaRegisters
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3}
            java.lang.String r1 = "Optimizer Delta Dex Insns: Insns: %d total: %d (%.2f%%) Delta Registers: %d\n"
            r8.printf(r1, r0)
            int r0 = r7.runningOriginalBytes
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Original bytecode byte count: %d\n"
            r8.printf(r1, r0)
            return
    }

    public void updateDexStatistics(com.android.dx.dex.code.DalvCode r4, com.android.dx.dex.code.DalvCode r5) {
            r3 = this;
            int r0 = r3.dexRunningDeltaInsns
            com.android.dx.dex.code.DalvInsnList r1 = r5.getInsns()
            int r1 = r1.codeSize()
            com.android.dx.dex.code.DalvInsnList r2 = r4.getInsns()
            int r2 = r2.codeSize()
            int r1 = r1 - r2
            int r0 = r0 + r1
            r3.dexRunningDeltaInsns = r0
            int r0 = r3.dexRunningDeltaRegisters
            com.android.dx.dex.code.DalvInsnList r1 = r5.getInsns()
            int r1 = r1.getRegistersSize()
            com.android.dx.dex.code.DalvInsnList r4 = r4.getInsns()
            int r4 = r4.getRegistersSize()
            int r1 = r1 - r4
            int r0 = r0 + r1
            r3.dexRunningDeltaRegisters = r0
            int r4 = r3.dexRunningTotalInsns
            com.android.dx.dex.code.DalvInsnList r5 = r5.getInsns()
            int r5 = r5.codeSize()
            int r4 = r4 + r5
            r3.dexRunningTotalInsns = r4
            return
    }

    public void updateOriginalByteCount(int r2) {
            r1 = this;
            int r0 = r1.runningOriginalBytes
            int r0 = r0 + r2
            r1.runningOriginalBytes = r0
            return
    }

    public void updateRopStatistics(com.android.dx.rop.code.RopMethod r4, com.android.dx.rop.code.RopMethod r5) {
            r3 = this;
            com.android.dx.rop.code.BasicBlockList r0 = r4.getBlocks()
            int r0 = r0.getEffectiveInstructionCount()
            com.android.dx.rop.code.BasicBlockList r4 = r4.getBlocks()
            int r4 = r4.getRegCount()
            com.android.dx.rop.code.BasicBlockList r1 = r5.getBlocks()
            int r1 = r1.getEffectiveInstructionCount()
            int r2 = r3.runningDeltaInsns
            int r0 = r1 - r0
            int r2 = r2 + r0
            r3.runningDeltaInsns = r2
            int r0 = r3.runningDeltaRegisters
            com.android.dx.rop.code.BasicBlockList r5 = r5.getBlocks()
            int r5 = r5.getRegCount()
            int r5 = r5 - r4
            int r0 = r0 + r5
            r3.runningDeltaRegisters = r0
            int r4 = r3.runningTotalInsns
            int r4 = r4 + r1
            r3.runningTotalInsns = r4
            return
    }
}
