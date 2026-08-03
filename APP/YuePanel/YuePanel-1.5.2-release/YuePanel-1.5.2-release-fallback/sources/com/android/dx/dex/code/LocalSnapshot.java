package com.android.dx.dex.code;

/* JADX INFO: loaded from: classes.dex */
public final class LocalSnapshot extends com.android.dx.dex.code.ZeroSizeInsn {
    private final com.android.dx.rop.code.RegisterSpecSet locals;

    public LocalSnapshot(com.android.dx.rop.code.SourcePosition r1, com.android.dx.rop.code.RegisterSpecSet r2) {
            r0 = this;
            r0.<init>(r1)
            if (r2 == 0) goto L8
            r0.locals = r2
            return
        L8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "locals == null"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public java.lang.String argString() {
            r1 = this;
            com.android.dx.rop.code.RegisterSpecSet r0 = r1.locals
            java.lang.String r0 = r0.toString()
            return r0
    }

    public com.android.dx.rop.code.RegisterSpecSet getLocals() {
            r1 = this;
            com.android.dx.rop.code.RegisterSpecSet r0 = r1.locals
            return r0
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public java.lang.String listingString0(boolean r5) {
            r4 = this;
            com.android.dx.rop.code.RegisterSpecSet r5 = r4.locals
            int r5 = r5.size()
            com.android.dx.rop.code.RegisterSpecSet r0 = r4.locals
            int r0 = r0.getMaxSize()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r5 = r5 * 40
            int r5 = r5 + 100
            r1.<init>(r5)
            java.lang.String r5 = "local-snapshot"
            r1.append(r5)
            r5 = 0
        L1b:
            if (r5 >= r0) goto L34
            com.android.dx.rop.code.RegisterSpecSet r2 = r4.locals
            com.android.dx.rop.code.RegisterSpec r2 = r2.get(r5)
            if (r2 == 0) goto L31
            java.lang.String r3 = "\n  "
            r1.append(r3)
            java.lang.String r2 = com.android.dx.dex.code.LocalStart.localString(r2)
            r1.append(r2)
        L31:
            int r5 = r5 + 1
            goto L1b
        L34:
            java.lang.String r5 = r1.toString()
            return r5
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public com.android.dx.dex.code.DalvInsn withMapper(com.android.dx.ssa.RegisterMapper r4) {
            r3 = this;
            com.android.dx.dex.code.LocalSnapshot r0 = new com.android.dx.dex.code.LocalSnapshot
            com.android.dx.rop.code.SourcePosition r1 = r3.getPosition()
            com.android.dx.rop.code.RegisterSpecSet r2 = r3.locals
            com.android.dx.rop.code.RegisterSpecSet r4 = r4.map(r2)
            r0.<init>(r1, r4)
            return r0
    }

    @Override // com.android.dx.dex.code.ZeroSizeInsn, com.android.dx.dex.code.DalvInsn
    public com.android.dx.dex.code.DalvInsn withRegisterOffset(int r4) {
            r3 = this;
            com.android.dx.dex.code.LocalSnapshot r0 = new com.android.dx.dex.code.LocalSnapshot
            com.android.dx.rop.code.SourcePosition r1 = r3.getPosition()
            com.android.dx.rop.code.RegisterSpecSet r2 = r3.locals
            com.android.dx.rop.code.RegisterSpecSet r4 = r2.withOffset(r4)
            r0.<init>(r1, r4)
            return r0
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public com.android.dx.dex.code.DalvInsn withRegisters(com.android.dx.rop.code.RegisterSpecList r3) {
            r2 = this;
            com.android.dx.dex.code.LocalSnapshot r3 = new com.android.dx.dex.code.LocalSnapshot
            com.android.dx.rop.code.SourcePosition r0 = r2.getPosition()
            com.android.dx.rop.code.RegisterSpecSet r1 = r2.locals
            r3.<init>(r0, r1)
            return r3
    }
}
