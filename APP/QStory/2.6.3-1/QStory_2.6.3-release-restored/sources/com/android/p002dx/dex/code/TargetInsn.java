package com.android.p002dx.dex.code;

import bsh.C3466;
import com.android.p002dx.rop.code.RegisterSpecList;
import com.android.p002dx.rop.code.SourcePosition;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class TargetInsn extends FixedSizeInsn {
    private CodeAddress target;

    public TargetInsn(Dop dop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, CodeAddress codeAddress) {
        super(dop, sourcePosition, registerSpecList);
        if (codeAddress != null) {
            this.target = codeAddress;
        } else {
            C3466.m5903("target == null");
            throw null;
        }
    }

    @Override // com.android.p002dx.dex.code.DalvInsn
    public String argString() {
        CodeAddress codeAddress = this.target;
        return codeAddress == null ? "????" : codeAddress.identifierString();
    }

    public CodeAddress getTarget() {
        return this.target;
    }

    public int getTargetAddress() {
        return this.target.getAddress();
    }

    public int getTargetOffset() {
        return this.target.getAddress() - getAddress();
    }

    public boolean hasTargetOffset() {
        return hasAddress() && this.target.hasAddress();
    }

    public TargetInsn withNewTargetAndReversed(CodeAddress codeAddress) {
        return new TargetInsn(getOpcode().getOppositeTest(), getPosition(), getRegisters(), codeAddress);
    }

    @Override // com.android.p002dx.dex.code.DalvInsn
    public DalvInsn withOpcode(Dop dop) {
        return new TargetInsn(dop, getPosition(), getRegisters(), this.target);
    }

    @Override // com.android.p002dx.dex.code.DalvInsn
    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new TargetInsn(getOpcode(), getPosition(), registerSpecList, this.target);
    }
}
