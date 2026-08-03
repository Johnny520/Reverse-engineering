package com.android.dx.rop.code;

/* JADX INFO: loaded from: classes.dex */
public final class PlainInsn extends com.android.dx.rop.code.Insn {
    public PlainInsn(com.android.dx.rop.code.Rop r1, com.android.dx.rop.code.SourcePosition r2, com.android.dx.rop.code.RegisterSpec r3, com.android.dx.rop.code.RegisterSpec r4) {
            r0 = this;
            com.android.dx.rop.code.RegisterSpecList r4 = com.android.dx.rop.code.RegisterSpecList.make(r4)
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public PlainInsn(com.android.dx.rop.code.Rop r1, com.android.dx.rop.code.SourcePosition r2, com.android.dx.rop.code.RegisterSpec r3, com.android.dx.rop.code.RegisterSpecList r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            int r2 = r1.getBranchingness()
            r4 = 5
            if (r2 == r4) goto L20
            r4 = 6
            if (r2 == r4) goto L20
            if (r3 == 0) goto L1f
            int r1 = r1.getBranchingness()
            r2 = 1
            if (r1 != r2) goto L17
            goto L1f
        L17:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "can't mix branchingness with result"
            r1.<init>(r2)
            throw r1
        L1f:
            return
        L20:
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
            r1.visitPlainInsn(r0)
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
    public com.android.dx.rop.code.Insn withNewRegisters(com.android.dx.rop.code.RegisterSpec r4, com.android.dx.rop.code.RegisterSpecList r5) {
            r3 = this;
            com.android.dx.rop.code.PlainInsn r0 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.Rop r1 = r3.getOpcode()
            com.android.dx.rop.code.SourcePosition r2 = r3.getPosition()
            r0.<init>(r1, r2, r4, r5)
            return r0
    }

    @Override // com.android.dx.rop.code.Insn
    public com.android.dx.rop.code.Insn withRegisterOffset(int r6) {
            r5 = this;
            com.android.dx.rop.code.PlainInsn r0 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.Rop r1 = r5.getOpcode()
            com.android.dx.rop.code.SourcePosition r2 = r5.getPosition()
            com.android.dx.rop.code.RegisterSpec r3 = r5.getResult()
            com.android.dx.rop.code.RegisterSpec r3 = r3.withOffset(r6)
            com.android.dx.rop.code.RegisterSpecList r4 = r5.getSources()
            com.android.dx.rop.code.RegisterSpecList r6 = r4.withOffset(r6)
            r0.<init>(r1, r2, r3, r6)
            return r0
    }

    @Override // com.android.dx.rop.code.Insn
    public com.android.dx.rop.code.Insn withSourceLiteral() {
            r9 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r9.getSources()
            int r1 = r0.size()
            if (r1 != 0) goto Lb
            return r9
        Lb:
            int r2 = r1 + (-1)
            com.android.dx.rop.code.RegisterSpec r2 = r0.get(r2)
            com.android.dx.rop.type.TypeBearer r2 = r2.getTypeBearer()
            boolean r3 = r2.isConstant()
            if (r3 != 0) goto L54
            r2 = 0
            com.android.dx.rop.code.RegisterSpec r2 = r0.get(r2)
            com.android.dx.rop.type.TypeBearer r2 = r2.getTypeBearer()
            r3 = 2
            if (r1 != r3) goto L53
            boolean r1 = r2.isConstant()
            if (r1 == 0) goto L53
            r8 = r2
            com.android.dx.rop.cst.Constant r8 = (com.android.dx.rop.cst.Constant) r8
            com.android.dx.rop.code.RegisterSpecList r7 = r0.withoutFirst()
            com.android.dx.rop.code.Rop r0 = r9.getOpcode()
            int r0 = r0.getOpcode()
            com.android.dx.rop.code.RegisterSpec r1 = r9.getResult()
            com.android.dx.rop.code.Rop r4 = com.android.dx.rop.code.Rops.ropFor(r0, r1, r7, r8)
            com.android.dx.rop.code.PlainCstInsn r0 = new com.android.dx.rop.code.PlainCstInsn
            com.android.dx.rop.code.SourcePosition r5 = r9.getPosition()
            com.android.dx.rop.code.RegisterSpec r6 = r9.getResult()
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r0
        L53:
            return r9
        L54:
            com.android.dx.rop.cst.Constant r2 = (com.android.dx.rop.cst.Constant) r2
            com.android.dx.rop.code.RegisterSpecList r7 = r0.withoutLast()
            com.android.dx.rop.code.Rop r0 = r9.getOpcode()     // Catch: java.lang.IllegalArgumentException -> L8f
            int r0 = r0.getOpcode()     // Catch: java.lang.IllegalArgumentException -> L8f
            r1 = 15
            if (r0 != r1) goto L77
            boolean r1 = r2 instanceof com.android.dx.rop.cst.CstInteger     // Catch: java.lang.IllegalArgumentException -> L8f
            if (r1 == 0) goto L77
            com.android.dx.rop.cst.CstInteger r2 = (com.android.dx.rop.cst.CstInteger) r2     // Catch: java.lang.IllegalArgumentException -> L8f
            int r0 = r2.getValue()     // Catch: java.lang.IllegalArgumentException -> L8f
            int r0 = -r0
            com.android.dx.rop.cst.CstInteger r2 = com.android.dx.rop.cst.CstInteger.make(r0)     // Catch: java.lang.IllegalArgumentException -> L8f
            r0 = 14
        L77:
            r8 = r2
            com.android.dx.rop.code.RegisterSpec r1 = r9.getResult()     // Catch: java.lang.IllegalArgumentException -> L8f
            com.android.dx.rop.code.Rop r4 = com.android.dx.rop.code.Rops.ropFor(r0, r1, r7, r8)     // Catch: java.lang.IllegalArgumentException -> L8f
            com.android.dx.rop.code.PlainCstInsn r0 = new com.android.dx.rop.code.PlainCstInsn
            com.android.dx.rop.code.SourcePosition r5 = r9.getPosition()
            com.android.dx.rop.code.RegisterSpec r6 = r9.getResult()
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r0
        L8f:
            return r9
    }
}
