package com.android.dx.dex.code;

/* JADX INFO: loaded from: classes.dex */
public final class SimpleInsn extends com.android.dx.dex.code.FixedSizeInsn {
    public SimpleInsn(com.android.dx.dex.code.Dop r1, com.android.dx.rop.code.SourcePosition r2, com.android.dx.rop.code.RegisterSpecList r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public java.lang.String argString() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public com.android.dx.dex.code.DalvInsn withOpcode(com.android.dx.dex.code.Dop r4) {
            r3 = this;
            com.android.dx.dex.code.SimpleInsn r0 = new com.android.dx.dex.code.SimpleInsn
            com.android.dx.rop.code.SourcePosition r1 = r3.getPosition()
            com.android.dx.rop.code.RegisterSpecList r2 = r3.getRegisters()
            r0.<init>(r4, r1, r2)
            return r0
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public com.android.dx.dex.code.DalvInsn withRegisters(com.android.dx.rop.code.RegisterSpecList r4) {
            r3 = this;
            com.android.dx.dex.code.SimpleInsn r0 = new com.android.dx.dex.code.SimpleInsn
            com.android.dx.dex.code.Dop r1 = r3.getOpcode()
            com.android.dx.rop.code.SourcePosition r2 = r3.getPosition()
            r0.<init>(r1, r2, r4)
            return r0
    }
}
