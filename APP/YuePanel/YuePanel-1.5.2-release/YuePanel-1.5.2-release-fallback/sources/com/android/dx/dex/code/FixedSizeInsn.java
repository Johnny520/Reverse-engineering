package com.android.dx.dex.code;

/* JADX INFO: loaded from: classes.dex */
public abstract class FixedSizeInsn extends com.android.dx.dex.code.DalvInsn {
    public FixedSizeInsn(com.android.dx.dex.code.Dop r1, com.android.dx.rop.code.SourcePosition r2, com.android.dx.rop.code.RegisterSpecList r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public final int codeSize() {
            r1 = this;
            com.android.dx.dex.code.Dop r0 = r1.getOpcode()
            com.android.dx.dex.code.InsnFormat r0 = r0.getFormat()
            int r0 = r0.codeSize()
            return r0
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public final java.lang.String listingString0(boolean r2) {
            r1 = this;
            com.android.dx.dex.code.Dop r0 = r1.getOpcode()
            com.android.dx.dex.code.InsnFormat r0 = r0.getFormat()
            java.lang.String r2 = r0.listingString(r1, r2)
            return r2
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public final com.android.dx.dex.code.DalvInsn withRegisterOffset(int r2) {
            r1 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r1.getRegisters()
            com.android.dx.rop.code.RegisterSpecList r2 = r0.withOffset(r2)
            com.android.dx.dex.code.DalvInsn r2 = r1.withRegisters(r2)
            return r2
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public final void writeTo(com.android.dx.util.AnnotatedOutput r2) {
            r1 = this;
            com.android.dx.dex.code.Dop r0 = r1.getOpcode()
            com.android.dx.dex.code.InsnFormat r0 = r0.getFormat()
            r0.writeTo(r2, r1)
            return
    }
}
