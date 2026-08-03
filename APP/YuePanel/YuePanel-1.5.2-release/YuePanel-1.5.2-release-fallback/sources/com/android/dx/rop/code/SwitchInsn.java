package com.android.dx.rop.code;

/* JADX INFO: loaded from: classes.dex */
public final class SwitchInsn extends com.android.dx.rop.code.Insn {
    private final com.android.dx.util.IntList cases;

    public SwitchInsn(com.android.dx.rop.code.Rop r1, com.android.dx.rop.code.SourcePosition r2, com.android.dx.rop.code.RegisterSpec r3, com.android.dx.rop.code.RegisterSpecList r4, com.android.dx.util.IntList r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            int r1 = r1.getBranchingness()
            r2 = 5
            if (r1 != r2) goto L17
            if (r5 == 0) goto Lf
            r0.cases = r5
            return
        Lf:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "cases == null"
            r1.<init>(r2)
            throw r1
        L17:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "bogus branchingness"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.android.dx.rop.code.Insn
    public void accept(com.android.dx.rop.code.Insn.Visitor r1) {
            r0 = this;
            r1.visitSwitchInsn(r0)
            return
    }

    @Override // com.android.dx.rop.code.Insn
    public boolean contentEquals(com.android.dx.rop.code.Insn r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public com.android.dx.util.IntList getCases() {
            r1 = this;
            com.android.dx.util.IntList r0 = r1.cases
            return r0
    }

    @Override // com.android.dx.rop.code.Insn
    public com.android.dx.rop.type.TypeList getCatches() {
            r1 = this;
            com.android.dx.rop.type.StdTypeList r0 = com.android.dx.rop.type.StdTypeList.EMPTY
            return r0
    }

    @Override // com.android.dx.rop.code.Insn
    public java.lang.String getInlineString() {
            r1 = this;
            com.android.dx.util.IntList r0 = r1.cases
            java.lang.String r0 = r0.toString()
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
            com.android.dx.rop.code.SwitchInsn r6 = new com.android.dx.rop.code.SwitchInsn
            com.android.dx.rop.code.Rop r1 = r7.getOpcode()
            com.android.dx.rop.code.SourcePosition r2 = r7.getPosition()
            com.android.dx.util.IntList r5 = r7.cases
            r0 = r6
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // com.android.dx.rop.code.Insn
    public com.android.dx.rop.code.Insn withRegisterOffset(int r8) {
            r7 = this;
            com.android.dx.rop.code.SwitchInsn r6 = new com.android.dx.rop.code.SwitchInsn
            com.android.dx.rop.code.Rop r1 = r7.getOpcode()
            com.android.dx.rop.code.SourcePosition r2 = r7.getPosition()
            com.android.dx.rop.code.RegisterSpec r0 = r7.getResult()
            com.android.dx.rop.code.RegisterSpec r3 = r0.withOffset(r8)
            com.android.dx.rop.code.RegisterSpecList r0 = r7.getSources()
            com.android.dx.rop.code.RegisterSpecList r4 = r0.withOffset(r8)
            com.android.dx.util.IntList r5 = r7.cases
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }
}
