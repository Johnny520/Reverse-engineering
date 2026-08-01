package com.android.p002dx.rop.code;

import bsh.C3466;
import com.alibaba.fastjson2.C3775;
import com.android.p002dx.rop.code.Insn;
import com.android.p002dx.rop.cst.Constant;
import com.android.p002dx.rop.cst.CstString;
import com.android.p002dx.rop.type.Type;
import com.android.p002dx.rop.type.TypeList;
import p025.AbstractC7012;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ThrowingCstInsn extends CstInsn {
    private final TypeList catches;

    public ThrowingCstInsn(Rop rop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, TypeList typeList, Constant constant) {
        super(rop, sourcePosition, null, registerSpecList, constant);
        if (rop.getBranchingness() != 6) {
            C3775.m6952(rop.getBranchingness(), "opcode with invalid branchingness: ");
            throw null;
        }
        if (typeList != null) {
            this.catches = typeList;
        } else {
            C3466.m5903("catches == null");
            throw null;
        }
    }

    @Override // com.android.p002dx.rop.code.Insn
    public void accept(Insn.Visitor visitor) {
        visitor.visitThrowingCstInsn(this);
    }

    @Override // com.android.p002dx.rop.code.Insn
    public TypeList getCatches() {
        return this.catches;
    }

    @Override // com.android.p002dx.rop.code.CstInsn, com.android.p002dx.rop.code.Insn
    public String getInlineString() {
        Constant constant = getConstant();
        String human = constant.toHuman();
        if (constant instanceof CstString) {
            human = ((CstString) constant).toQuoted();
        }
        StringBuilder sbM12143 = AbstractC7012.m12143(human, " ");
        sbM12143.append(ThrowingInsn.toCatchString(this.catches));
        return sbM12143.toString();
    }

    @Override // com.android.p002dx.rop.code.Insn
    public Insn withAddedCatch(Type type) {
        return new ThrowingCstInsn(getOpcode(), getPosition(), getSources(), this.catches.withAddedType(type), getConstant());
    }

    @Override // com.android.p002dx.rop.code.Insn
    public Insn withNewRegisters(RegisterSpec registerSpec, RegisterSpecList registerSpecList) {
        return new ThrowingCstInsn(getOpcode(), getPosition(), registerSpecList, this.catches, getConstant());
    }

    @Override // com.android.p002dx.rop.code.Insn
    public Insn withRegisterOffset(int i) {
        return new ThrowingCstInsn(getOpcode(), getPosition(), getSources().withOffset(i), this.catches, getConstant());
    }
}
