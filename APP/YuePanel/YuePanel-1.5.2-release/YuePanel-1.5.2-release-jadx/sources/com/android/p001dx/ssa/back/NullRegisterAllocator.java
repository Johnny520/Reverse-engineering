package com.android.p001dx.ssa.back;

import com.android.p001dx.ssa.BasicRegisterMapper;
import com.android.p001dx.ssa.RegisterMapper;
import com.android.p001dx.ssa.SsaMethod;

/* JADX INFO: loaded from: classes.dex */
public class NullRegisterAllocator extends RegisterAllocator {
    public NullRegisterAllocator(SsaMethod ssaMethod, InterferenceGraph interferenceGraph) {
        super(ssaMethod, interferenceGraph);
    }

    @Override // com.android.p001dx.ssa.back.RegisterAllocator
    public RegisterMapper allocateRegisters() {
        int regCount = this.ssaMeth.getRegCount();
        BasicRegisterMapper basicRegisterMapper = new BasicRegisterMapper(regCount);
        for (int i = 0; i < regCount; i++) {
            basicRegisterMapper.addMapping(i, i * 2, 2);
        }
        return basicRegisterMapper;
    }

    @Override // com.android.p001dx.ssa.back.RegisterAllocator
    public boolean wantsParamsMovedHigh() {
        return false;
    }
}
