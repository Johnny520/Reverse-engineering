package com.android.dx.rop.code;

import bsh.C2632;
import com.android.dx.rop.code.Insn;
import com.android.dx.rop.type.StdTypeList;
import com.android.dx.rop.type.Type;
import com.android.dx.rop.type.TypeList;
import com.android.dx.util.IntList;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class SwitchInsn extends Insn {
    private final IntList cases;

    public SwitchInsn(Rop rop, SourcePosition sourcePosition, RegisterSpec registerSpec, RegisterSpecList registerSpecList, IntList intList) {
        super(rop, sourcePosition, registerSpec, registerSpecList);
        if (rop.getBranchingness() != 5) {
            C5919.m11249("bogus branchingness");
            throw null;
        }
        if (intList != null) {
            this.cases = intList;
        } else {
            C2632.m5298("cases == null");
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
