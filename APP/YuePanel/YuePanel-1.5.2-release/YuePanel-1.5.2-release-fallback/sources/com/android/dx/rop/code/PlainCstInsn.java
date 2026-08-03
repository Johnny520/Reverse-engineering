package com.android.dx.rop.code;

/* JADX INFO: loaded from: classes.dex */
public final class PlainCstInsn extends com.android.dx.rop.code.CstInsn {
    public PlainCstInsn(com.android.dx.rop.code.Rop r1, com.android.dx.rop.code.SourcePosition r2, com.android.dx.rop.code.RegisterSpec r3, com.android.dx.rop.code.RegisterSpecList r4, com.android.dx.rop.cst.Constant r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            int r2 = r1.getBranchingness()
            r3 = 1
            if (r2 != r3) goto Lb
            return
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "opcode with invalid branchingness: "
            r3.append(r4)
            int r1 = r1.getBranchingness()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
    }

    @Override // com.android.dx.rop.code.Insn
    public void accept(com.android.dx.rop.code.Insn.Visitor r1) {
            r0 = this;
            r1.visitPlainCstInsn(r0)
            return
    }

    @Override // com.android.dx.rop.code.Insn
    public com.android.dx.rop.type.TypeList getCatches() {
            r1 = this;
            com.android.dx.rop.type.StdTypeList r0 = com.android.dx.rop.type.StdTypeList.EMPTY
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
    public com.android.dx.rop.code.Insn withNewRegisters(com.android.dx.rop.code.RegisterSpec r8, com.android.dx.rop.code.RegisterSpecList r9) {
            r7 = this;
            com.android.dx.rop.code.PlainCstInsn r6 = new com.android.dx.rop.code.PlainCstInsn
            com.android.dx.rop.code.Rop r1 = r7.getOpcode()
            com.android.dx.rop.code.SourcePosition r2 = r7.getPosition()
            com.android.dx.rop.cst.Constant r5 = r7.getConstant()
            r0 = r6
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // com.android.dx.rop.code.Insn
    public com.android.dx.rop.code.Insn withRegisterOffset(int r8) {
            r7 = this;
            com.android.dx.rop.code.PlainCstInsn r6 = new com.android.dx.rop.code.PlainCstInsn
            com.android.dx.rop.code.Rop r1 = r7.getOpcode()
            com.android.dx.rop.code.SourcePosition r2 = r7.getPosition()
            com.android.dx.rop.code.RegisterSpec r0 = r7.getResult()
            com.android.dx.rop.code.RegisterSpec r3 = r0.withOffset(r8)
            com.android.dx.rop.code.RegisterSpecList r0 = r7.getSources()
            com.android.dx.rop.code.RegisterSpecList r4 = r0.withOffset(r8)
            com.android.dx.rop.cst.Constant r5 = r7.getConstant()
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }
}
