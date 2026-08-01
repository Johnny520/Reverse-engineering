package com.android.dx.rop.code;

import bsh.C2632;
import com.alibaba.fastjson2.C2941;
import com.android.dx.rop.code.Insn;
import com.android.dx.rop.type.Type;
import com.android.dx.rop.type.TypeList;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ThrowingInsn extends Insn {
    private final TypeList catches;

    public ThrowingInsn(Rop rop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, TypeList typeList) {
        super(rop, sourcePosition, null, registerSpecList);
        if (rop.getBranchingness() != 6) {
            C2941.m6334(rop.getBranchingness(), "opcode with invalid branchingness: ");
            throw null;
        }
        if (typeList != null) {
            this.catches = typeList;
        } else {
            C2632.m5298("catches == null");
            throw null;
        }
    }

    public static String toCatchString(TypeList typeList) {
        StringBuilder sb = new StringBuilder(100);
        sb.append("catch");
        int size = typeList.size();
        for (int i = 0; i < size; i++) {
            sb.append(" ");
            sb.append(typeList.getType(i).toHuman());
        }
        return sb.toString();
    }

    @Override // com.android.dx.rop.code.Insn
    public void accept(Insn.Visitor visitor) {
        visitor.visitThrowingInsn(this);
    }

    @Override // com.android.dx.rop.code.Insn
    public TypeList getCatches() {
        return this.catches;
    }

    @Override // com.android.dx.rop.code.Insn
    public String getInlineString() {
        return toCatchString(this.catches);
    }

    @Override // com.android.dx.rop.code.Insn
    public Insn withAddedCatch(Type type) {
        return new ThrowingInsn(getOpcode(), getPosition(), getSources(), this.catches.withAddedType(type));
    }

    @Override // com.android.dx.rop.code.Insn
    public Insn withNewRegisters(RegisterSpec registerSpec, RegisterSpecList registerSpecList) {
        return new ThrowingInsn(getOpcode(), getPosition(), registerSpecList, this.catches);
    }

    @Override // com.android.dx.rop.code.Insn
    public Insn withRegisterOffset(int i) {
        return new ThrowingInsn(getOpcode(), getPosition(), getSources().withOffset(i), this.catches);
    }
}
