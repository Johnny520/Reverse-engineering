package com.android.dx.rop.code;

/* JADX INFO: loaded from: classes.dex */
public abstract class CstInsn extends com.android.dx.rop.code.Insn {
    private final com.android.dx.rop.cst.Constant cst;

    public CstInsn(com.android.dx.rop.code.Rop r1, com.android.dx.rop.code.SourcePosition r2, com.android.dx.rop.code.RegisterSpec r3, com.android.dx.rop.code.RegisterSpecList r4, com.android.dx.rop.cst.Constant r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            if (r5 == 0) goto L8
            r0.cst = r5
            return
        L8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "cst == null"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.android.dx.rop.code.Insn
    public boolean contentEquals(com.android.dx.rop.code.Insn r2) {
            r1 = this;
            boolean r0 = super.contentEquals(r2)
            if (r0 == 0) goto L16
            com.android.dx.rop.cst.Constant r0 = r1.cst
            com.android.dx.rop.code.CstInsn r2 = (com.android.dx.rop.code.CstInsn) r2
            com.android.dx.rop.cst.Constant r2 = r2.getConstant()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    public com.android.dx.rop.cst.Constant getConstant() {
            r1 = this;
            com.android.dx.rop.cst.Constant r0 = r1.cst
            return r0
    }

    @Override // com.android.dx.rop.code.Insn
    public java.lang.String getInlineString() {
            r1 = this;
            com.android.dx.rop.cst.Constant r0 = r1.cst
            java.lang.String r0 = r0.toHuman()
            return r0
    }
}
