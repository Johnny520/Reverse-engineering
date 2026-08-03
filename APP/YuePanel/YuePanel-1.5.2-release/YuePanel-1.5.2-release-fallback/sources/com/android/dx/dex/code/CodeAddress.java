package com.android.dx.dex.code;

/* JADX INFO: loaded from: classes.dex */
public final class CodeAddress extends com.android.dx.dex.code.ZeroSizeInsn {
    private final boolean bindsClosely;

    public CodeAddress(com.android.dx.rop.code.SourcePosition r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public CodeAddress(com.android.dx.rop.code.SourcePosition r1, boolean r2) {
            r0 = this;
            r0.<init>(r1)
            r0.bindsClosely = r2
            return
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public java.lang.String argString() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean getBindsClosely() {
            r1 = this;
            boolean r0 = r1.bindsClosely
            return r0
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public java.lang.String listingString0(boolean r1) {
            r0 = this;
            java.lang.String r1 = "code-address"
            return r1
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public final com.android.dx.dex.code.DalvInsn withRegisters(com.android.dx.rop.code.RegisterSpecList r2) {
            r1 = this;
            com.android.dx.dex.code.CodeAddress r2 = new com.android.dx.dex.code.CodeAddress
            com.android.dx.rop.code.SourcePosition r0 = r1.getPosition()
            r2.<init>(r0)
            return r2
    }
}
