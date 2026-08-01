package com.android.dx.ssa.back;

import com.android.dx.rop.code.PlainInsn;
import com.android.dx.rop.code.RegisterSpec;
import com.android.dx.rop.code.RegisterSpecList;
import com.android.dx.rop.code.Rops;
import com.android.dx.rop.code.SourcePosition;
import com.android.dx.ssa.NormalSsaInsn;
import com.android.dx.ssa.RegisterMapper;
import com.android.dx.ssa.SsaBasicBlock;
import com.android.dx.ssa.SsaInsn;
import com.android.dx.ssa.SsaMethod;
import com.android.dx.util.IntIterator;
import java.util.ArrayList;
import p144.C7547;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class RegisterAllocator {
    protected final InterferenceGraph interference;
    protected final SsaMethod ssaMeth;

    public RegisterAllocator(SsaMethod ssaMethod, InterferenceGraph interferenceGraph) {
        this.ssaMeth = ssaMethod;
        this.interference = interferenceGraph;
    }

    public abstract RegisterMapper allocateRegisters();

    public final int getCategoryForSsaReg(int i) {
        SsaInsn definitionForRegister = this.ssaMeth.getDefinitionForRegister(i);
        if (definitionForRegister == null) {
            return 1;
        }
        return definitionForRegister.getResult().getCategory();
    }

    public final RegisterSpec getDefinitionSpecForSsaReg(int i) {
        SsaInsn definitionForRegister = this.ssaMeth.getDefinitionForRegister(i);
        if (definitionForRegister == null) {
            return null;
        }
        return definitionForRegister.getResult();
    }

    public final RegisterSpec insertMoveBefore(SsaInsn ssaInsn, RegisterSpec registerSpec) {
        SsaBasicBlock block = ssaInsn.getBlock();
        ArrayList<SsaInsn> insns = block.getInsns();
        int iIndexOf = insns.indexOf(ssaInsn);
        if (iIndexOf < 0) {
            C5925.m11310("specified insn is not in this block");
            return null;
        }
        if (iIndexOf != insns.size() - 1) {
            C7547.m12764(ssaInsn.toHuman(), "Adding move here not supported:");
            return null;
        }
        RegisterSpec registerSpecMake = RegisterSpec.make(this.ssaMeth.makeNewSsaReg(), registerSpec.getTypeBearer());
        insns.add(iIndexOf, SsaInsn.makeFromRop(new PlainInsn(Rops.opMove(registerSpecMake.getType()), SourcePosition.NO_INFO, registerSpecMake, RegisterSpecList.make(registerSpec)), block));
        int reg = registerSpecMake.getReg();
        IntIterator it = block.getLiveOutRegs().iterator();
        while (it.hasNext()) {
            this.interference.add(reg, it.next());
        }
        RegisterSpecList sources = ssaInsn.getSources();
        int size = sources.size();
        for (int i = 0; i < size; i++) {
            this.interference.add(reg, sources.get(i).getReg());
        }
        this.ssaMeth.onInsnsChanged();
        return registerSpecMake;
    }

    public boolean isDefinitionMoveParam(int i) {
        SsaInsn definitionForRegister = this.ssaMeth.getDefinitionForRegister(i);
        return (definitionForRegister instanceof NormalSsaInsn) && ((NormalSsaInsn) definitionForRegister).getOpcode().getOpcode() == 3;
    }

    public abstract boolean wantsParamsMovedHigh();
}
