package com.android.dx.rop.code;

/* JADX INFO: loaded from: classes.dex */
public final class FillArrayDataInsn extends com.android.dx.rop.code.Insn {
    private final com.android.dx.rop.cst.Constant arrayType;
    private final java.util.ArrayList<com.android.dx.rop.cst.Constant> initValues;

    public FillArrayDataInsn(com.android.dx.rop.code.Rop r2, com.android.dx.rop.code.SourcePosition r3, com.android.dx.rop.code.RegisterSpecList r4, java.util.ArrayList<com.android.dx.rop.cst.Constant> r5, com.android.dx.rop.cst.Constant r6) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r4)
            int r3 = r2.getBranchingness()
            r4 = 1
            if (r3 != r4) goto L10
            r1.initValues = r5
            r1.arrayType = r6
            return
        L10:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "opcode with invalid branchingness: "
            r4.append(r5)
            int r2 = r2.getBranchingness()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
    }

    @Override // com.android.dx.rop.code.Insn
    public void accept(com.android.dx.rop.code.Insn.Visitor r1) {
            r0 = this;
            r1.visitFillArrayDataInsn(r0)
            return
    }

    @Override // com.android.dx.rop.code.Insn
    public com.android.dx.rop.type.TypeList getCatches() {
            r1 = this;
            com.android.dx.rop.type.StdTypeList r0 = com.android.dx.rop.type.StdTypeList.EMPTY
            return r0
    }

    public com.android.dx.rop.cst.Constant getConstant() {
            r1 = this;
            com.android.dx.rop.cst.Constant r0 = r1.arrayType
            return r0
    }

    public java.util.ArrayList<com.android.dx.rop.cst.Constant> getInitValues() {
            r1 = this;
            java.util.ArrayList<com.android.dx.rop.cst.Constant> r0 = r1.initValues
            return r0
    }

    @Override // com.android.dx.rop.code.Insn
    public com.android.dx.rop.code.Insn withAddedCatch(com.android.dx.rop.type.Type r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "unsupported"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.android.dx.rop.code.Insn
    public com.android.dx.rop.code.Insn withNewRegisters(com.android.dx.rop.code.RegisterSpec r7, com.android.dx.rop.code.RegisterSpecList r8) {
            r6 = this;
            com.android.dx.rop.code.FillArrayDataInsn r7 = new com.android.dx.rop.code.FillArrayDataInsn
            com.android.dx.rop.code.Rop r1 = r6.getOpcode()
            com.android.dx.rop.code.SourcePosition r2 = r6.getPosition()
            java.util.ArrayList<com.android.dx.rop.cst.Constant> r4 = r6.initValues
            com.android.dx.rop.cst.Constant r5 = r6.arrayType
            r0 = r7
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // com.android.dx.rop.code.Insn
    public com.android.dx.rop.code.Insn withRegisterOffset(int r8) {
            r7 = this;
            com.android.dx.rop.code.FillArrayDataInsn r6 = new com.android.dx.rop.code.FillArrayDataInsn
            com.android.dx.rop.code.Rop r1 = r7.getOpcode()
            com.android.dx.rop.code.SourcePosition r2 = r7.getPosition()
            com.android.dx.rop.code.RegisterSpecList r0 = r7.getSources()
            com.android.dx.rop.code.RegisterSpecList r3 = r0.withOffset(r8)
            java.util.ArrayList<com.android.dx.rop.cst.Constant> r4 = r7.initValues
            com.android.dx.rop.cst.Constant r5 = r7.arrayType
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }
}
