package com.android.dx.rop.code;

import bsh.C2632;
import com.android.dx.rop.cst.Constant;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class CstInsn extends Insn {
    private final Constant cst;

    public CstInsn(Rop rop, SourcePosition sourcePosition, RegisterSpec registerSpec, RegisterSpecList registerSpecList, Constant constant) {
        super(rop, sourcePosition, registerSpec, registerSpecList);
        if (constant != null) {
            this.cst = constant;
        } else {
            C2632.m5298("cst == null");
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
