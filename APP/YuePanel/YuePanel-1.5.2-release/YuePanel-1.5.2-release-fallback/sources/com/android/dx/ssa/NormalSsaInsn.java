package com.android.dx.ssa;

/* JADX INFO: loaded from: classes.dex */
public final class NormalSsaInsn extends com.android.dx.ssa.SsaInsn implements java.lang.Cloneable {
    private com.android.dx.rop.code.Insn insn;

    public NormalSsaInsn(com.android.dx.rop.code.Insn r2, com.android.dx.ssa.SsaBasicBlock r3) {
            r1 = this;
            com.android.dx.rop.code.RegisterSpec r0 = r2.getResult()
            r1.<init>(r0, r3)
            r1.insn = r2
            return
    }

    @Override // com.android.dx.ssa.SsaInsn
    public void accept(com.android.dx.ssa.SsaInsn.Visitor r2) {
            r1 = this;
            boolean r0 = r1.isNormalMoveInsn()
            if (r0 == 0) goto La
            r2.visitMoveInsn(r1)
            goto Ld
        La:
            r2.visitNonMoveInsn(r1)
        Ld:
            return
    }

    @Override // com.android.dx.ssa.SsaInsn
    public boolean canThrow() {
            r1 = this;
            com.android.dx.rop.code.Insn r0 = r1.insn
            boolean r0 = r0.canThrow()
            return r0
    }

    public final void changeOneSource(int r6, com.android.dx.rop.code.RegisterSpec r7) {
            r5 = this;
            com.android.dx.rop.code.Insn r0 = r5.insn
            com.android.dx.rop.code.RegisterSpecList r0 = r0.getSources()
            int r1 = r0.size()
            com.android.dx.rop.code.RegisterSpecList r2 = new com.android.dx.rop.code.RegisterSpecList
            r2.<init>(r1)
            r3 = 0
        L10:
            if (r3 >= r1) goto L20
            if (r3 != r6) goto L16
            r4 = r7
            goto L1a
        L16:
            com.android.dx.rop.code.RegisterSpec r4 = r0.get(r3)
        L1a:
            r2.set(r3, r4)
            int r3 = r3 + 1
            goto L10
        L20:
            r2.setImmutable()
            com.android.dx.rop.code.RegisterSpec r6 = r0.get(r6)
            int r0 = r6.getReg()
            int r1 = r7.getReg()
            if (r0 == r1) goto L3c
            com.android.dx.ssa.SsaBasicBlock r0 = r5.getBlock()
            com.android.dx.ssa.SsaMethod r0 = r0.getParent()
            r0.onSourceChanged(r5, r6, r7)
        L3c:
            com.android.dx.rop.code.Insn r6 = r5.insn
            com.android.dx.rop.code.RegisterSpec r7 = r5.getResult()
            com.android.dx.rop.code.Insn r6 = r6.withNewRegisters(r7, r2)
            r5.insn = r6
            return
    }

    @Override // com.android.dx.ssa.SsaInsn
    public com.android.dx.ssa.NormalSsaInsn clone() {
            r1 = this;
            com.android.dx.ssa.SsaInsn r0 = super.clone()
            com.android.dx.ssa.NormalSsaInsn r0 = (com.android.dx.ssa.NormalSsaInsn) r0
            return r0
    }

    @Override // com.android.dx.ssa.SsaInsn
    public /* bridge */ /* synthetic */ com.android.dx.ssa.SsaInsn clone() {
            r1 = this;
            com.android.dx.ssa.NormalSsaInsn r0 = r1.clone()
            return r0
    }

    @Override // com.android.dx.ssa.SsaInsn
    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object mo30397clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.android.dx.ssa.NormalSsaInsn r0 = r1.clone()
            return r0
    }

    @Override // com.android.dx.ssa.SsaInsn
    public com.android.dx.rop.code.RegisterSpec getLocalAssignment() {
            r3 = this;
            com.android.dx.rop.code.Insn r0 = r3.insn
            com.android.dx.rop.code.Rop r0 = r0.getOpcode()
            int r0 = r0.getOpcode()
            r1 = 54
            if (r0 != r1) goto L1a
            com.android.dx.rop.code.Insn r0 = r3.insn
            com.android.dx.rop.code.RegisterSpecList r0 = r0.getSources()
            r1 = 0
            com.android.dx.rop.code.RegisterSpec r0 = r0.get(r1)
            goto L1e
        L1a:
            com.android.dx.rop.code.RegisterSpec r0 = r3.getResult()
        L1e:
            r1 = 0
            if (r0 != 0) goto L22
            return r1
        L22:
            com.android.dx.rop.code.LocalItem r2 = r0.getLocalItem()
            if (r2 != 0) goto L29
            return r1
        L29:
            return r0
    }

    @Override // com.android.dx.ssa.SsaInsn
    public com.android.dx.rop.code.Rop getOpcode() {
            r1 = this;
            com.android.dx.rop.code.Insn r0 = r1.insn
            com.android.dx.rop.code.Rop r0 = r0.getOpcode()
            return r0
    }

    @Override // com.android.dx.ssa.SsaInsn
    public com.android.dx.rop.code.Insn getOriginalRopInsn() {
            r1 = this;
            com.android.dx.rop.code.Insn r0 = r1.insn
            return r0
    }

    @Override // com.android.dx.ssa.SsaInsn
    public com.android.dx.rop.code.RegisterSpecList getSources() {
            r1 = this;
            com.android.dx.rop.code.Insn r0 = r1.insn
            com.android.dx.rop.code.RegisterSpecList r0 = r0.getSources()
            return r0
    }

    @Override // com.android.dx.ssa.SsaInsn
    public boolean hasSideEffect() {
            r4 = this;
            com.android.dx.rop.code.Rop r0 = r4.getOpcode()
            int r1 = r0.getBranchingness()
            r2 = 1
            if (r1 == r2) goto Lc
            return r2
        Lc:
            boolean r1 = com.android.dx.ssa.Optimizer.getPreserveLocals()
            if (r1 == 0) goto L1a
            com.android.dx.rop.code.RegisterSpec r1 = r4.getLocalAssignment()
            if (r1 == 0) goto L1a
            r1 = r2
            goto L1b
        L1a:
            r1 = 0
        L1b:
            int r0 = r0.getOpcode()
            r3 = 2
            if (r0 == r3) goto L2a
            r3 = 5
            if (r0 == r3) goto L2a
            r3 = 55
            if (r0 == r3) goto L2a
            return r2
        L2a:
            return r1
    }

    @Override // com.android.dx.ssa.SsaInsn
    public boolean isMoveException() {
            r2 = this;
            com.android.dx.rop.code.Insn r0 = r2.insn
            com.android.dx.rop.code.Rop r0 = r0.getOpcode()
            int r0 = r0.getOpcode()
            r1 = 4
            if (r0 != r1) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    @Override // com.android.dx.ssa.SsaInsn
    public boolean isNormalMoveInsn() {
            r2 = this;
            com.android.dx.rop.code.Insn r0 = r2.insn
            com.android.dx.rop.code.Rop r0 = r0.getOpcode()
            int r0 = r0.getOpcode()
            r1 = 2
            if (r0 != r1) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    @Override // com.android.dx.ssa.SsaInsn
    public boolean isPhiOrMove() {
            r1 = this;
            boolean r0 = r1.isNormalMoveInsn()
            return r0
    }

    @Override // com.android.dx.ssa.SsaInsn
    public final void mapSourceRegisters(com.android.dx.ssa.RegisterMapper r4) {
            r3 = this;
            com.android.dx.rop.code.Insn r0 = r3.insn
            com.android.dx.rop.code.RegisterSpecList r0 = r0.getSources()
            com.android.dx.rop.code.RegisterSpecList r4 = r4.map(r0)
            if (r4 == r0) goto L23
            com.android.dx.rop.code.Insn r1 = r3.insn
            com.android.dx.rop.code.RegisterSpec r2 = r3.getResult()
            com.android.dx.rop.code.Insn r4 = r1.withNewRegisters(r2, r4)
            r3.insn = r4
            com.android.dx.ssa.SsaBasicBlock r4 = r3.getBlock()
            com.android.dx.ssa.SsaMethod r4 = r4.getParent()
            r4.onSourcesChanged(r3, r0)
        L23:
            return
    }

    public final void setNewSources(com.android.dx.rop.code.RegisterSpecList r3) {
            r2 = this;
            com.android.dx.rop.code.Insn r0 = r2.insn
            com.android.dx.rop.code.RegisterSpecList r0 = r0.getSources()
            int r0 = r0.size()
            int r1 = r3.size()
            if (r0 != r1) goto L1d
            com.android.dx.rop.code.Insn r0 = r2.insn
            com.android.dx.rop.code.RegisterSpec r1 = r2.getResult()
            com.android.dx.rop.code.Insn r3 = r0.withNewRegisters(r1, r3)
            r2.insn = r3
            return
        L1d:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "Sources counts don't match"
            r3.<init>(r0)
            throw r3
    }

    @Override // com.android.dx.util.ToHuman
    public java.lang.String toHuman() {
            r1 = this;
            com.android.dx.rop.code.Insn r0 = r1.toRopInsn()
            java.lang.String r0 = r0.toHuman()
            return r0
    }

    @Override // com.android.dx.ssa.SsaInsn
    public com.android.dx.rop.code.Insn toRopInsn() {
            r3 = this;
            com.android.dx.rop.code.Insn r0 = r3.insn
            com.android.dx.rop.code.RegisterSpec r1 = r3.getResult()
            com.android.dx.rop.code.Insn r2 = r3.insn
            com.android.dx.rop.code.RegisterSpecList r2 = r2.getSources()
            com.android.dx.rop.code.Insn r0 = r0.withNewRegisters(r1, r2)
            return r0
    }

    public void upgradeToLiteral() {
            r2 = this;
            com.android.dx.rop.code.Insn r0 = r2.insn
            com.android.dx.rop.code.RegisterSpecList r0 = r0.getSources()
            com.android.dx.rop.code.Insn r1 = r2.insn
            com.android.dx.rop.code.Insn r1 = r1.withSourceLiteral()
            r2.insn = r1
            com.android.dx.ssa.SsaBasicBlock r1 = r2.getBlock()
            com.android.dx.ssa.SsaMethod r1 = r1.getParent()
            r1.onSourcesChanged(r2, r0)
            return
    }
}
