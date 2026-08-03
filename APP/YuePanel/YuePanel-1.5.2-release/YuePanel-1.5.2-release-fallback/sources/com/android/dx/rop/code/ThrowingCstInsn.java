package com.android.dx.rop.code;

/* JADX INFO: loaded from: classes.dex */
public final class ThrowingCstInsn extends com.android.dx.rop.code.CstInsn {
    private final com.android.dx.rop.type.TypeList catches;

    public ThrowingCstInsn(com.android.dx.rop.code.Rop r7, com.android.dx.rop.code.SourcePosition r8, com.android.dx.rop.code.RegisterSpecList r9, com.android.dx.rop.type.TypeList r10, com.android.dx.rop.cst.Constant r11) {
            r6 = this;
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            int r8 = r7.getBranchingness()
            r9 = 6
            if (r8 != r9) goto L1d
            if (r10 == 0) goto L15
            r6.catches = r10
            return
        L15:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "catches == null"
            r7.<init>(r8)
            throw r7
        L1d:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "opcode with invalid branchingness: "
            r9.append(r10)
            int r7 = r7.getBranchingness()
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r8.<init>(r7)
            throw r8
    }

    @Override // com.android.dx.rop.code.Insn
    public void accept(com.android.dx.rop.code.Insn.Visitor r1) {
            r0 = this;
            r1.visitThrowingCstInsn(r0)
            return
    }

    @Override // com.android.dx.rop.code.Insn
    public com.android.dx.rop.type.TypeList getCatches() {
            r1 = this;
            com.android.dx.rop.type.TypeList r0 = r1.catches
            return r0
    }

    @Override // com.android.dx.rop.code.CstInsn, com.android.dx.rop.code.Insn
    public java.lang.String getInlineString() {
            r3 = this;
            com.android.dx.rop.cst.Constant r0 = r3.getConstant()
            java.lang.String r1 = r0.toHuman()
            boolean r2 = r0 instanceof com.android.dx.rop.cst.CstString
            if (r2 == 0) goto L12
            com.android.dx.rop.cst.CstString r0 = (com.android.dx.rop.cst.CstString) r0
            java.lang.String r1 = r0.toQuoted()
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            com.android.dx.rop.type.TypeList r1 = r3.catches
            java.lang.String r1 = com.android.dx.rop.code.ThrowingInsn.toCatchString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.android.dx.rop.code.Insn
    public com.android.dx.rop.code.Insn withAddedCatch(com.android.dx.rop.type.Type r8) {
            r7 = this;
            com.android.dx.rop.code.ThrowingCstInsn r6 = new com.android.dx.rop.code.ThrowingCstInsn
            com.android.dx.rop.code.Rop r1 = r7.getOpcode()
            com.android.dx.rop.code.SourcePosition r2 = r7.getPosition()
            com.android.dx.rop.code.RegisterSpecList r3 = r7.getSources()
            com.android.dx.rop.type.TypeList r0 = r7.catches
            com.android.dx.rop.type.TypeList r4 = r0.withAddedType(r8)
            com.android.dx.rop.cst.Constant r5 = r7.getConstant()
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // com.android.dx.rop.code.Insn
    public com.android.dx.rop.code.Insn withNewRegisters(com.android.dx.rop.code.RegisterSpec r7, com.android.dx.rop.code.RegisterSpecList r8) {
            r6 = this;
            com.android.dx.rop.code.ThrowingCstInsn r7 = new com.android.dx.rop.code.ThrowingCstInsn
            com.android.dx.rop.code.Rop r1 = r6.getOpcode()
            com.android.dx.rop.code.SourcePosition r2 = r6.getPosition()
            com.android.dx.rop.type.TypeList r4 = r6.catches
            com.android.dx.rop.cst.Constant r5 = r6.getConstant()
            r0 = r7
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // com.android.dx.rop.code.Insn
    public com.android.dx.rop.code.Insn withRegisterOffset(int r8) {
            r7 = this;
            com.android.dx.rop.code.ThrowingCstInsn r6 = new com.android.dx.rop.code.ThrowingCstInsn
            com.android.dx.rop.code.Rop r1 = r7.getOpcode()
            com.android.dx.rop.code.SourcePosition r2 = r7.getPosition()
            com.android.dx.rop.code.RegisterSpecList r0 = r7.getSources()
            com.android.dx.rop.code.RegisterSpecList r3 = r0.withOffset(r8)
            com.android.dx.rop.type.TypeList r4 = r7.catches
            com.android.dx.rop.cst.Constant r5 = r7.getConstant()
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }
}
