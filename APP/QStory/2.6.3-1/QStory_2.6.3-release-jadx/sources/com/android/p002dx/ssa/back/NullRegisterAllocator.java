package com.android.p002dx.ssa.back;

import com.android.p002dx.ssa.BasicRegisterMapper;
import com.android.p002dx.ssa.RegisterMapper;
import com.android.p002dx.ssa.SsaMethod;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class NullRegisterAllocator extends RegisterAllocator {
    public NullRegisterAllocator(SsaMethod ssaMethod, InterferenceGraph interferenceGraph) {
        super(ssaMethod, interferenceGraph);
    }

    @Override // com.android.p002dx.ssa.back.RegisterAllocator
    public RegisterMapper allocateRegisters() {
        int regCount = this.ssaMeth.getRegCount();
        BasicRegisterMapper basicRegisterMapper = new BasicRegisterMapper(regCount);
        for (int i = 0; i < regCount; i++) {
            basicRegisterMapper.addMapping(i, i * 2, 2);
        }
        return basicRegisterMapper;
    }

    @Override // com.android.p002dx.ssa.back.RegisterAllocator
    public boolean wantsParamsMovedHigh() {
        return false;
    }
}
