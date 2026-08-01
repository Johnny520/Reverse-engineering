package com.android.p002dx.ssa;

import bsh.C3466;
import com.android.p002dx.rop.code.Insn;
import com.android.p002dx.rop.code.RegisterSpec;
import com.android.p002dx.rop.code.RegisterSpecList;
import com.android.p002dx.rop.code.Rop;
import com.android.p002dx.ssa.SsaInsn;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class NormalSsaInsn extends SsaInsn implements Cloneable {
    private Insn insn;

    public NormalSsaInsn(Insn insn, SsaBasicBlock ssaBasicBlock) {
        super(insn.getResult(), ssaBasicBlock);
        this.insn = insn;
    }

    @Override // com.android.p002dx.ssa.SsaInsn
    public void accept(SsaInsn.Visitor visitor) {
        if (isNormalMoveInsn()) {
            visitor.visitMoveInsn(this);
        } else {
            visitor.visitNonMoveInsn(this);
        }
    }

    @Override // com.android.p002dx.ssa.SsaInsn
    public boolean canThrow() {
        return this.insn.canThrow();
    }

    public final void changeOneSource(int i, RegisterSpec registerSpec) {
        RegisterSpecList sources = this.insn.getSources();
        int size = sources.size();
        RegisterSpecList registerSpecList = new RegisterSpecList(size);
        int i2 = 0;
        while (i2 < size) {
            registerSpecList.set(i2, i2 == i ? registerSpec : sources.get(i2));
            i2++;
        }
        registerSpecList.setImmutable();
        RegisterSpec registerSpec2 = sources.get(i);
        if (registerSpec2.getReg() != registerSpec.getReg()) {
            getBlock().getParent().onSourceChanged(this, registerSpec2, registerSpec);
        }
        this.insn = this.insn.withNewRegisters(getResult(), registerSpecList);
    }

    @Override // com.android.p002dx.ssa.SsaInsn
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public NormalSsaInsn mo6985clone() {
        return (NormalSsaInsn) super.mo6985clone();
    }

    @Override // com.android.p002dx.ssa.SsaInsn
    public RegisterSpec getLocalAssignment() {
        RegisterSpec result = this.insn.getOpcode().getOpcode() == 54 ? this.insn.getSources().get(0) : getResult();
        if (result == null || result.getLocalItem() == null) {
            return null;
        }
        return result;
    }

    @Override // com.android.p002dx.ssa.SsaInsn
    public Rop getOpcode() {
        return this.insn.getOpcode();
    }

    @Override // com.android.p002dx.ssa.SsaInsn
    public Insn getOriginalRopInsn() {
        return this.insn;
    }

    @Override // com.android.p002dx.ssa.SsaInsn
    public RegisterSpecList getSources() {
        return this.insn.getSources();
    }

    @Override // com.android.p002dx.ssa.SsaInsn
    public boolean hasSideEffect() {
        Rop opcode = getOpcode();
        if (opcode.getBranchingness() != 1) {
            return true;
        }
        boolean z = Optimizer.getPreserveLocals() && getLocalAssignment() != null;
        int opcode2 = opcode.getOpcode();
        if (opcode2 == 2 || opcode2 == 5 || opcode2 == 55) {
            return z;
        }
        return true;
    }

    @Override // com.android.p002dx.ssa.SsaInsn
    public boolean isMoveException() {
        return this.insn.getOpcode().getOpcode() == 4;
    }

    @Override // com.android.p002dx.ssa.SsaInsn
    public boolean isNormalMoveInsn() {
        return this.insn.getOpcode().getOpcode() == 2;
    }

    @Override // com.android.p002dx.ssa.SsaInsn
    public boolean isPhiOrMove() {
        return isNormalMoveInsn();
    }

    @Override // com.android.p002dx.ssa.SsaInsn
    public final void mapSourceRegisters(RegisterMapper registerMapper) {
        RegisterSpecList sources = this.insn.getSources();
        RegisterSpecList map = registerMapper.map(sources);
        if (map != sources) {
            this.insn = this.insn.withNewRegisters(getResult(), map);
            getBlock().getParent().onSourcesChanged(this, sources);
        }
    }

    public final void setNewSources(RegisterSpecList registerSpecList) {
        if (this.insn.getSources().size() == registerSpecList.size()) {
            this.insn = this.insn.withNewRegisters(getResult(), registerSpecList);
        } else {
            C3466.m5899("Sources counts don't match");
        }
    }

    @Override // com.android.p002dx.util.ToHuman
    public String toHuman() {
        return toRopInsn().toHuman();
    }

    @Override // com.android.p002dx.ssa.SsaInsn
    public Insn toRopInsn() {
        return this.insn.withNewRegisters(getResult(), this.insn.getSources());
    }

    public void upgradeToLiteral() {
        RegisterSpecList sources = this.insn.getSources();
        this.insn = this.insn.withSourceLiteral();
        getBlock().getParent().onSourcesChanged(this, sources);
    }
}
