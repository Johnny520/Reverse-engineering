package com.android.dx.rop.code;

import bsh.C2633;
import com.android.dx.rop.cst.Constant;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class CstInsn extends Insn {
    private final Constant cst;

    public CstInsn(Rop rop, SourcePosition sourcePosition, RegisterSpec registerSpec, RegisterSpecList registerSpecList, Constant constant) {
        super(rop, sourcePosition, registerSpec, registerSpecList);
        if (constant != null) {
            this.cst = constant;
        } else {
            C2633.m5343("cst == null");
            throw null;
        }
    }

    @Override // com.android.dx.rop.code.Insn
    public boolean contentEquals(Insn insn) {
        return super.contentEquals(insn) && this.cst.equals(((CstInsn) insn).getConstant());
    }

    public Constant getConstant() {
        return this.cst;
    }

    @Override // com.android.dx.rop.code.Insn
    public String getInlineString() {
        return this.cst.toHuman();
    }
}
