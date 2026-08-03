package com.android.dx.ssa.back;

/* JADX INFO: loaded from: classes.dex */
public class FirstFitAllocator extends com.android.dx.ssa.back.RegisterAllocator {
    private static final boolean PRESLOT_PARAMS = true;
    private final java.util.BitSet mapped;

    public FirstFitAllocator(com.android.dx.ssa.SsaMethod r1, com.android.dx.ssa.back.InterferenceGraph r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.util.BitSet r2 = new java.util.BitSet
            int r1 = r1.getRegCount()
            r2.<init>(r1)
            r0.mapped = r2
            return
    }

    private int paramNumberFromMoveParam(com.android.dx.ssa.NormalSsaInsn r1) {
            r0 = this;
            com.android.dx.rop.code.Insn r1 = r1.getOriginalRopInsn()
            com.android.dx.rop.code.CstInsn r1 = (com.android.dx.rop.code.CstInsn) r1
            com.android.dx.rop.cst.Constant r1 = r1.getConstant()
            com.android.dx.rop.cst.CstInteger r1 = (com.android.dx.rop.cst.CstInteger) r1
            int r1 = r1.getValue()
            return r1
    }

    @Override // com.android.dx.ssa.back.RegisterAllocator
    public com.android.dx.ssa.RegisterMapper allocateRegisters() {
            r11 = this;
            com.android.dx.ssa.SsaMethod r0 = r11.ssaMeth
            int r0 = r0.getRegCount()
            com.android.dx.ssa.BasicRegisterMapper r1 = new com.android.dx.ssa.BasicRegisterMapper
            r1.<init>(r0)
            com.android.dx.ssa.SsaMethod r2 = r11.ssaMeth
            int r2 = r2.getParamWidth()
            r3 = 0
            r4 = r3
        L13:
            if (r4 >= r0) goto L8d
            java.util.BitSet r5 = r11.mapped
            boolean r5 = r5.get(r4)
            if (r5 == 0) goto L1f
            goto L8a
        L1f:
            int r5 = r11.getCategoryForSsaReg(r4)
            com.android.dx.util.BitIntSet r6 = new com.android.dx.util.BitIntSet
            r6.<init>(r0)
            com.android.dx.ssa.back.InterferenceGraph r7 = r11.interference
            r7.mergeInterferenceSet(r4, r6)
            boolean r7 = r11.isDefinitionMoveParam(r4)
            if (r7 == 0) goto L44
            com.android.dx.ssa.SsaMethod r7 = r11.ssaMeth
            com.android.dx.ssa.SsaInsn r7 = r7.getDefinitionForRegister(r4)
            com.android.dx.ssa.NormalSsaInsn r7 = (com.android.dx.ssa.NormalSsaInsn) r7
            int r7 = r11.paramNumberFromMoveParam(r7)
            r1.addMapping(r4, r7, r5)
            r8 = 1
            goto L49
        L44:
            r1.addMapping(r4, r2, r5)
            r7 = r2
            r8 = r3
        L49:
            int r9 = r4 + 1
        L4b:
            if (r9 >= r0) goto L82
            java.util.BitSet r10 = r11.mapped
            boolean r10 = r10.get(r9)
            if (r10 != 0) goto L7f
            boolean r10 = r11.isDefinitionMoveParam(r9)
            if (r10 == 0) goto L5c
            goto L7f
        L5c:
            boolean r10 = r6.has(r9)
            if (r10 != 0) goto L7f
            if (r8 == 0) goto L6a
            int r10 = r11.getCategoryForSsaReg(r9)
            if (r5 < r10) goto L7f
        L6a:
            com.android.dx.ssa.back.InterferenceGraph r10 = r11.interference
            r10.mergeInterferenceSet(r9, r6)
            int r10 = r11.getCategoryForSsaReg(r9)
            int r5 = java.lang.Math.max(r5, r10)
            r1.addMapping(r9, r7, r5)
            java.util.BitSet r10 = r11.mapped
            r10.set(r9)
        L7f:
            int r9 = r9 + 1
            goto L4b
        L82:
            java.util.BitSet r6 = r11.mapped
            r6.set(r4)
            if (r8 != 0) goto L8a
            int r2 = r2 + r5
        L8a:
            int r4 = r4 + 1
            goto L13
        L8d:
            return r1
    }

    @Override // com.android.dx.ssa.back.RegisterAllocator
    public boolean wantsParamsMovedHigh() {
            r1 = this;
            r0 = 1
            return r0
    }
}
