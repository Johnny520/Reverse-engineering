package com.android.dx.rop.code;

import com.alibaba.fastjson2.C2942;
import com.android.dx.rop.code.Insn;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.type.StdTypeList;
import com.android.dx.rop.type.Type;
import com.android.dx.rop.type.TypeList;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class PlainCstInsn extends CstInsn {
    public PlainCstInsn(Rop rop, SourcePosition sourcePosition, RegisterSpec registerSpec, RegisterSpecList registerSpecList, Constant constant) {
        super(rop, sourcePosition, registerSpec, registerSpecList, constant);
        if (rop.getBranchingness() == 1) {
            return;
        }
        C2942.m6392(rop.getBranchingness(), "opcode with invalid branchingness: ");
        throw null;
    }

    @Override // com.android.dx.rop.code.Insn
    public void accept(Insn.Visitor visitor) {
        visitor.visitPlainCstInsn(this);
    }

    @Override // com.android.dx.rop.code.Insn
    public TypeList getCatches() {
        return StdTypeList.EMPTY;
    }

    @Override // com.android.dx.rop.code.Insn
    public Insn withAddedCatch(Type type) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // com.android.dx.rop.code.Insn
    public Insn withNewRegisters(RegisterSpec registerSpec, RegisterSpecList registerSpecList) {
        return new PlainCstInsn(getOpcode(), getPosition(), registerSpec, registerSpecList, getConstant());
    }

    @Override // com.android.dx.rop.code.Insn
    public Insn withRegisterOffset(int i) {
        return new PlainCstInsn(getOpcode(), getPosition(), getResult().withOffset(i), getSources().withOffset(i), getConstant());
    }
}
