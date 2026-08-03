package com.android.dx.ssa.back;

/* JADX INFO: loaded from: classes.dex */
public class NullRegisterAllocator extends com.android.dx.ssa.back.RegisterAllocator {
    public NullRegisterAllocator(com.android.dx.ssa.SsaMethod r1, com.android.dx.ssa.back.InterferenceGraph r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.android.dx.ssa.back.RegisterAllocator
    public com.android.dx.ssa.RegisterMapper allocateRegisters() {
            r5 = this;
            com.android.dx.ssa.SsaMethod r0 = r5.ssaMeth
            int r0 = r0.getRegCount()
            com.android.dx.ssa.BasicRegisterMapper r1 = new com.android.dx.ssa.BasicRegisterMapper
            r1.<init>(r0)
            r2 = 0
        Lc:
            if (r2 >= r0) goto L17
            int r3 = r2 * 2
            r4 = 2
            r1.addMapping(r2, r3, r4)
            int r2 = r2 + 1
            goto Lc
        L17:
            return r1
    }

    @Override // com.android.dx.ssa.back.RegisterAllocator
    public boolean wantsParamsMovedHigh() {
            r1 = this;
            r0 = 0
            return r0
    }
}
