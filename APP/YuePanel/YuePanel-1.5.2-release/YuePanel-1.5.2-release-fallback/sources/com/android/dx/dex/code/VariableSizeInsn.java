package com.android.dx.dex.code;

/* JADX INFO: loaded from: classes.dex */
public abstract class VariableSizeInsn extends com.android.dx.dex.code.DalvInsn {
    public VariableSizeInsn(com.android.dx.rop.code.SourcePosition r2, com.android.dx.rop.code.RegisterSpecList r3) {
            r1 = this;
            com.android.dx.dex.code.Dop r0 = com.android.dx.dex.code.Dops.SPECIAL_FORMAT
            r1.<init>(r0, r2, r3)
            return
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public final com.android.dx.dex.code.DalvInsn withOpcode(com.android.dx.dex.code.Dop r2) {
            r1 = this;
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "unsupported"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public final com.android.dx.dex.code.DalvInsn withRegisterOffset(int r2) {
            r1 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r1.getRegisters()
            com.android.dx.rop.code.RegisterSpecList r2 = r0.withOffset(r2)
            com.android.dx.dex.code.DalvInsn r2 = r1.withRegisters(r2)
            return r2
    }
}
