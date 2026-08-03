package com.android.dx.ssa;

/* JADX INFO: loaded from: classes.dex */
public abstract class SsaInsn implements com.android.dx.util.ToHuman, java.lang.Cloneable {
    private final com.android.dx.ssa.SsaBasicBlock block;
    private com.android.dx.rop.code.RegisterSpec result;

    public interface Visitor {
        void visitMoveInsn(com.android.dx.ssa.NormalSsaInsn r1);

        void visitNonMoveInsn(com.android.dx.ssa.NormalSsaInsn r1);

        void visitPhiInsn(com.android.dx.ssa.PhiInsn r1);
    }

    public SsaInsn(com.android.dx.rop.code.RegisterSpec r1, com.android.dx.ssa.SsaBasicBlock r2) {
            r0 = this;
            r0.<init>()
            if (r2 == 0) goto La
            r0.block = r2
            r0.result = r1
            return
        La:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "block == null"
            r1.<init>(r2)
            throw r1
    }

    public static com.android.dx.ssa.SsaInsn makeFromRop(com.android.dx.rop.code.Insn r1, com.android.dx.ssa.SsaBasicBlock r2) {
            com.android.dx.ssa.NormalSsaInsn r0 = new com.android.dx.ssa.NormalSsaInsn
            r0.<init>(r1, r2)
            return r0
    }

    public abstract void accept(com.android.dx.ssa.SsaInsn.Visitor r1);

    public abstract boolean canThrow();

    public void changeResultReg(int r2) {
            r1 = this;
            com.android.dx.rop.code.RegisterSpec r0 = r1.result
            if (r0 == 0) goto La
            com.android.dx.rop.code.RegisterSpec r2 = r0.withReg(r2)
            r1.result = r2
        La:
            return
    }

    public com.android.dx.ssa.SsaInsn clone() {
            r3 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L7
            com.android.dx.ssa.SsaInsn r0 = (com.android.dx.ssa.SsaInsn) r0     // Catch: java.lang.CloneNotSupportedException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2, r0)
            throw r1
    }

    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo30397clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.android.dx.ssa.SsaInsn r0 = r1.clone()
            return r0
    }

    public com.android.dx.ssa.SsaBasicBlock getBlock() {
            r1 = this;
            com.android.dx.ssa.SsaBasicBlock r0 = r1.block
            return r0
    }

    public com.android.dx.rop.code.RegisterSpec getLocalAssignment() {
            r1 = this;
            com.android.dx.rop.code.RegisterSpec r0 = r1.result
            if (r0 == 0) goto Ld
            com.android.dx.rop.code.LocalItem r0 = r0.getLocalItem()
            if (r0 == 0) goto Ld
            com.android.dx.rop.code.RegisterSpec r0 = r1.result
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public abstract com.android.dx.rop.code.Rop getOpcode();

    public abstract com.android.dx.rop.code.Insn getOriginalRopInsn();

    public com.android.dx.rop.code.RegisterSpec getResult() {
            r1 = this;
            com.android.dx.rop.code.RegisterSpec r0 = r1.result
            return r0
    }

    public abstract com.android.dx.rop.code.RegisterSpecList getSources();

    public abstract boolean hasSideEffect();

    public boolean isMoveException() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isNormalMoveInsn() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract boolean isPhiOrMove();

    public boolean isRegASource(int r2) {
            r1 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r1.getSources()
            com.android.dx.rop.code.RegisterSpec r2 = r0.specForRegister(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    public boolean isResultReg(int r2) {
            r1 = this;
            com.android.dx.rop.code.RegisterSpec r0 = r1.result
            if (r0 == 0) goto Lc
            int r0 = r0.getReg()
            if (r0 != r2) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    public final void mapRegisters(com.android.dx.ssa.RegisterMapper r3) {
            r2 = this;
            com.android.dx.rop.code.RegisterSpec r0 = r2.result
            com.android.dx.rop.code.RegisterSpec r1 = r3.map(r0)
            r2.result = r1
            com.android.dx.ssa.SsaBasicBlock r1 = r2.block
            com.android.dx.ssa.SsaMethod r1 = r1.getParent()
            r1.updateOneDefinition(r2, r0)
            r2.mapSourceRegisters(r3)
            return
    }

    public abstract void mapSourceRegisters(com.android.dx.ssa.RegisterMapper r1);

    public void setResult(com.android.dx.rop.code.RegisterSpec r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.result = r2
            return
        L5:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "result == null"
            r2.<init>(r0)
            throw r2
    }

    public final void setResultLocal(com.android.dx.rop.code.LocalItem r3) {
            r2 = this;
            com.android.dx.rop.code.RegisterSpec r0 = r2.result
            com.android.dx.rop.code.LocalItem r0 = r0.getLocalItem()
            if (r3 == r0) goto L28
            if (r3 == 0) goto L16
            com.android.dx.rop.code.RegisterSpec r0 = r2.result
            com.android.dx.rop.code.LocalItem r0 = r0.getLocalItem()
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L28
        L16:
            com.android.dx.rop.code.RegisterSpec r0 = r2.result
            int r0 = r0.getReg()
            com.android.dx.rop.code.RegisterSpec r1 = r2.result
            com.android.dx.rop.type.Type r1 = r1.getType()
            com.android.dx.rop.code.RegisterSpec r3 = com.android.dx.rop.code.RegisterSpec.makeLocalOptional(r0, r1, r3)
            r2.result = r3
        L28:
            return
    }

    public abstract com.android.dx.rop.code.Insn toRopInsn();
}
