package com.android.dx.rop.code;

import bsh.C2633;
import com.alibaba.fastjson2.C2942;
import com.android.dx.rop.code.Insn;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstString;
import com.android.dx.rop.type.Type;
import com.android.dx.rop.type.TypeList;
import p009.AbstractC6183;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ThrowingCstInsn extends CstInsn {
    private final TypeList catches;

    public ThrowingCstInsn(Rop rop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, TypeList typeList, Constant constant) {
        super(rop, sourcePosition, null, registerSpecList, constant);
        if (rop.getBranchingness() != 6) {
            C2942.m6392(rop.getBranchingness(), "opcode with invalid branchingness: ");
            throw null;
        }
        if (typeList != null) {
            this.catches = typeList;
        } else {
            C2633.m5343("catches == null");
            throw null;
        }
    }

    @Override // com.android.dx.rop.code.Insn
    public void accept(Insn.Visitor visitor) {
        visitor.visitThrowingCstInsn(this);
    }

    @Override // com.android.dx.rop.code.Insn
    public TypeList getCatches() {
        return this.catches;
    }

    @Override // com.android.dx.rop.code.CstInsn, com.android.dx.rop.code.Insn
    public String getInlineString() {
        Constant constant = getConstant();
        String human = constant.toHuman();
        if (constant instanceof CstString) {
            human = ((CstString) constant).toQuoted();
        }
        StringBuilder sbM11584 = AbstractC6183.m11584(human, " ");
        sbM11584.append(ThrowingInsn.toCatchString(this.catches));
        return sbM11584.toString();
    }

    @Override // com.android.dx.rop.code.Insn
    public Insn withAddedCatch(Type type) {
        return new ThrowingCstInsn(getOpcode(), getPosition(), getSources(), this.catches.withAddedType(type), getConstant());
    }

    @Override // com.android.dx.rop.code.Insn
    public Insn withNewRegisters(RegisterSpec registerSpec, RegisterSpecList registerSpecList) {
        return new ThrowingCstInsn(getOpcode(), getPosition(), registerSpecList, this.catches, getConstant());
    }

    @Override // com.android.dx.rop.code.Insn
    public Insn withRegisterOffset(int i) {
        return new ThrowingCstInsn(getOpcode(), getPosition(), getSources().withOffset(i), this.catches, getConstant());
    }
}
