package com.android.dx.dex.code;

/* JADX INFO: loaded from: classes.dex */
public final class LocalStart extends com.android.dx.dex.code.ZeroSizeInsn {
    private final com.android.dx.rop.code.RegisterSpec local;

    public LocalStart(com.android.dx.rop.code.SourcePosition r1, com.android.dx.rop.code.RegisterSpec r2) {
            r0 = this;
            r0.<init>(r1)
            if (r2 == 0) goto L8
            r0.local = r2
            return
        L8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "local == null"
            r1.<init>(r2)
            throw r1
    }

    public static java.lang.String localString(com.android.dx.rop.code.RegisterSpec r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.regString()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            com.android.dx.rop.code.LocalItem r1 = r2.getLocalItem()
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            com.android.dx.rop.type.TypeBearer r2 = r2.getTypeBearer()
            java.lang.String r2 = r2.toHuman()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public java.lang.String argString() {
            r1 = this;
            com.android.dx.rop.code.RegisterSpec r0 = r1.local
            java.lang.String r0 = r0.toString()
            return r0
    }

    public com.android.dx.rop.code.RegisterSpec getLocal() {
            r1 = this;
            com.android.dx.rop.code.RegisterSpec r0 = r1.local
            return r0
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public java.lang.String listingString0(boolean r2) {
            r1 = this;
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "local-start "
            r2.append(r0)
            com.android.dx.rop.code.RegisterSpec r0 = r1.local
            java.lang.String r0 = localString(r0)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public com.android.dx.dex.code.DalvInsn withMapper(com.android.dx.ssa.RegisterMapper r4) {
            r3 = this;
            com.android.dx.dex.code.LocalStart r0 = new com.android.dx.dex.code.LocalStart
            com.android.dx.rop.code.SourcePosition r1 = r3.getPosition()
            com.android.dx.rop.code.RegisterSpec r2 = r3.local
            com.android.dx.rop.code.RegisterSpec r4 = r4.map(r2)
            r0.<init>(r1, r4)
            return r0
    }

    @Override // com.android.dx.dex.code.ZeroSizeInsn, com.android.dx.dex.code.DalvInsn
    public com.android.dx.dex.code.DalvInsn withRegisterOffset(int r4) {
            r3 = this;
            com.android.dx.dex.code.LocalStart r0 = new com.android.dx.dex.code.LocalStart
            com.android.dx.rop.code.SourcePosition r1 = r3.getPosition()
            com.android.dx.rop.code.RegisterSpec r2 = r3.local
            com.android.dx.rop.code.RegisterSpec r4 = r2.withOffset(r4)
            r0.<init>(r1, r4)
            return r0
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public com.android.dx.dex.code.DalvInsn withRegisters(com.android.dx.rop.code.RegisterSpecList r3) {
            r2 = this;
            com.android.dx.dex.code.LocalStart r3 = new com.android.dx.dex.code.LocalStart
            com.android.dx.rop.code.SourcePosition r0 = r2.getPosition()
            com.android.dx.rop.code.RegisterSpec r1 = r2.local
            r3.<init>(r0, r1)
            return r3
    }
}
