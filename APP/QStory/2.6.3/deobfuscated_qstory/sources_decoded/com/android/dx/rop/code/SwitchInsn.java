package com.android.dx.rop.code;

import bsh.C2633;
import com.android.dx.rop.code.Insn;
import com.android.dx.rop.type.StdTypeList;
import com.android.dx.rop.type.Type;
import com.android.dx.rop.type.TypeList;
import com.android.dx.util.IntList;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class SwitchInsn extends Insn {
    private final IntList cases;

    public SwitchInsn(Rop rop, SourcePosition sourcePosition, RegisterSpec registerSpec, RegisterSpecList registerSpecList, IntList intList) {
        super(rop, sourcePosition, registerSpec, registerSpecList);
        if (rop.getBranchingness() != 5) {
            C5925.m11310("bogus branchingness");
            throw null;
        }
        if (intList != null) {
            this.cases = intList;
        } else {
            C2633.m5343("cases == null");
            throw null;
        }
    }

    @Override // com.android.dx.rop.code.Insn
    public void accept(Insn.Visitor visitor) {
        visitor.visitSwitchInsn(this);
    }

    @Override // com.android.dx.rop.code.Insn
    public boolean contentEquals(Insn insn) {
        return false;
    }

    public IntList getCases() {
        return this.cases;
    }

    @Override // com.android.dx.rop.code.Insn
    public TypeList getCatches() {
        return StdTypeList.EMPTY;
    }

    @Override // com.android.dx.rop.code.Insn
    public String getInlineString() {
        return this.cases.toString();
    }

    @Override // com.android.dx.rop.code.Insn
    public Insn withAddedCatch(Type type) {
        throw new UnsupportedOperationException("unsupported");
    }

    @Override // com.android.dx.rop.code.Insn
    public Insn withNewRegisters(RegisterSpec registerSpec, RegisterSpecList registerSpecList) {
        return new SwitchInsn(getOpcode(), getPosition(), registerSpec, registerSpecList, this.cases);
    }

    @Override // com.android.dx.rop.code.Insn
    public Insn withRegisterOffset(int i) {
        return new SwitchInsn(getOpcode(), getPosition(), getResult().withOffset(i), getSources().withOffset(i), this.cases);
    }
}
