package com.android.p002dx.ssa.back;

import com.android.p002dx.rop.code.CstInsn;
import com.android.p002dx.rop.cst.CstInteger;
import com.android.p002dx.ssa.BasicRegisterMapper;
import com.android.p002dx.ssa.NormalSsaInsn;
import com.android.p002dx.ssa.RegisterMapper;
import com.android.p002dx.ssa.SsaMethod;
import com.android.p002dx.util.BitIntSet;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class FirstFitAllocator extends RegisterAllocator {
    private static final boolean PRESLOT_PARAMS = true;
    private final BitSet mapped;

    public FirstFitAllocator(SsaMethod ssaMethod, InterferenceGraph interferenceGraph) {
        super(ssaMethod, interferenceGraph);
        this.mapped = new BitSet(ssaMethod.getRegCount());
    }

    private int paramNumberFromMoveParam(NormalSsaInsn normalSsaInsn) {
        return ((CstInteger) ((CstInsn) normalSsaInsn.getOriginalRopInsn()).getConstant()).getValue();
    }

    @Override // com.android.p002dx.ssa.back.RegisterAllocator
    public RegisterMapper allocateRegisters() {
        int iParamNumberFromMoveParam;
        boolean z;
        BitSet bitSet;
        int regCount = this.ssaMeth.getRegCount();
        BasicRegisterMapper basicRegisterMapper = new BasicRegisterMapper(regCount);
        int paramWidth = this.ssaMeth.getParamWidth();
        for (int i = 0; i < regCount; i++) {
            if (!this.mapped.get(i)) {
                int categoryForSsaReg = getCategoryForSsaReg(i);
                BitIntSet bitIntSet = new BitIntSet(regCount);
                this.interference.mergeInterferenceSet(i, bitIntSet);
                if (isDefinitionMoveParam(i)) {
                    iParamNumberFromMoveParam = paramNumberFromMoveParam((NormalSsaInsn) this.ssaMeth.getDefinitionForRegister(i));
                    basicRegisterMapper.addMapping(i, iParamNumberFromMoveParam, categoryForSsaReg);
                    z = true;
                } else {
                    basicRegisterMapper.addMapping(i, paramWidth, categoryForSsaReg);
                    iParamNumberFromMoveParam = paramWidth;
                    z = false;
                }
                int i2 = i + 1;
                while (true) {
                    bitSet = this.mapped;
                    if (i2 >= regCount) {
                        break;
                    }
                    if (!bitSet.get(i2) && !isDefinitionMoveParam(i2) && !bitIntSet.has(i2) && (!z || categoryForSsaReg >= getCategoryForSsaReg(i2))) {
                        this.interference.mergeInterferenceSet(i2, bitIntSet);
                        categoryForSsaReg = Math.max(categoryForSsaReg, getCategoryForSsaReg(i2));
                        basicRegisterMapper.addMapping(i2, iParamNumberFromMoveParam, categoryForSsaReg);
                        this.mapped.set(i2);
                    }
                    i2++;
                }
                bitSet.set(i);
                if (!z) {
                    paramWidth += categoryForSsaReg;
                }
            }
        }
        return basicRegisterMapper;
    }

    @Override // com.android.p002dx.ssa.back.RegisterAllocator
    public boolean wantsParamsMovedHigh() {
        return true;
    }
}
