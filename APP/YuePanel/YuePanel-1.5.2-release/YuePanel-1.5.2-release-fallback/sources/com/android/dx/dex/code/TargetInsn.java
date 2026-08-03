package com.android.dx.dex.code;

/* JADX INFO: loaded from: classes.dex */
public final class TargetInsn extends com.android.dx.dex.code.FixedSizeInsn {
    private com.android.dx.dex.code.CodeAddress target;

    public TargetInsn(com.android.dx.dex.code.Dop r1, com.android.dx.rop.code.SourcePosition r2, com.android.dx.rop.code.RegisterSpecList r3, com.android.dx.dex.code.CodeAddress r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            if (r4 == 0) goto L8
            r0.target = r4
            return
        L8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "target == null"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public java.lang.String argString() {
            r1 = this;
            com.android.dx.dex.code.CodeAddress r0 = r1.target
            if (r0 != 0) goto L7
            java.lang.String r0 = "????"
            return r0
        L7:
            java.lang.String r0 = r0.identifierString()
            return r0
    }

    public com.android.dx.dex.code.CodeAddress getTarget() {
            r1 = this;
            com.android.dx.dex.code.CodeAddress r0 = r1.target
            return r0
    }

    public int getTargetAddress() {
            r1 = this;
            com.android.dx.dex.code.CodeAddress r0 = r1.target
            int r0 = r0.getAddress()
            return r0
    }

    public int getTargetOffset() {
            r2 = this;
            com.android.dx.dex.code.CodeAddress r0 = r2.target
            int r0 = r0.getAddress()
            int r1 = r2.getAddress()
            int r0 = r0 - r1
            return r0
    }

    public boolean hasTargetOffset() {
            r1 = this;
            boolean r0 = r1.hasAddress()
            if (r0 == 0) goto L10
            com.android.dx.dex.code.CodeAddress r0 = r1.target
            boolean r0 = r0.hasAddress()
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public com.android.dx.dex.code.TargetInsn withNewTargetAndReversed(com.android.dx.dex.code.CodeAddress r5) {
            r4 = this;
            com.android.dx.dex.code.Dop r0 = r4.getOpcode()
            com.android.dx.dex.code.Dop r0 = r0.getOppositeTest()
            com.android.dx.dex.code.TargetInsn r1 = new com.android.dx.dex.code.TargetInsn
            com.android.dx.rop.code.SourcePosition r2 = r4.getPosition()
            com.android.dx.rop.code.RegisterSpecList r3 = r4.getRegisters()
            r1.<init>(r0, r2, r3, r5)
            return r1
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public com.android.dx.dex.code.DalvInsn withOpcode(com.android.dx.dex.code.Dop r5) {
            r4 = this;
            com.android.dx.dex.code.TargetInsn r0 = new com.android.dx.dex.code.TargetInsn
            com.android.dx.rop.code.SourcePosition r1 = r4.getPosition()
            com.android.dx.rop.code.RegisterSpecList r2 = r4.getRegisters()
            com.android.dx.dex.code.CodeAddress r3 = r4.target
            r0.<init>(r5, r1, r2, r3)
            return r0
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public com.android.dx.dex.code.DalvInsn withRegisters(com.android.dx.rop.code.RegisterSpecList r5) {
            r4 = this;
            com.android.dx.dex.code.TargetInsn r0 = new com.android.dx.dex.code.TargetInsn
            com.android.dx.dex.code.Dop r1 = r4.getOpcode()
            com.android.dx.rop.code.SourcePosition r2 = r4.getPosition()
            com.android.dx.dex.code.CodeAddress r3 = r4.target
            r0.<init>(r1, r2, r5, r3)
            return r0
    }
}
