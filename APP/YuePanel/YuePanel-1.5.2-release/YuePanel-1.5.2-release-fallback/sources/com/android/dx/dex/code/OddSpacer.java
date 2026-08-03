package com.android.dx.dex.code;

/* JADX INFO: loaded from: classes.dex */
public final class OddSpacer extends com.android.dx.dex.code.VariableSizeInsn {
    public OddSpacer(com.android.dx.rop.code.SourcePosition r2) {
            r1 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            r1.<init>(r2, r0)
            return
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public java.lang.String argString() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public int codeSize() {
            r1 = this;
            int r0 = r1.getAddress()
            r0 = r0 & 1
            return r0
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public java.lang.String listingString0(boolean r1) {
            r0 = this;
            int r1 = r0.codeSize()
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r1 = "nop // spacer"
            return r1
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public com.android.dx.dex.code.DalvInsn withRegisters(com.android.dx.rop.code.RegisterSpecList r2) {
            r1 = this;
            com.android.dx.dex.code.OddSpacer r2 = new com.android.dx.dex.code.OddSpacer
            com.android.dx.rop.code.SourcePosition r0 = r1.getPosition()
            r2.<init>(r0)
            return r2
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public void writeTo(com.android.dx.util.AnnotatedOutput r2) {
            r1 = this;
            int r0 = r1.codeSize()
            if (r0 == 0) goto Le
            r0 = 0
            short r0 = com.android.dx.dex.code.InsnFormat.codeUnit(r0, r0)
            r2.writeShort(r0)
        Le:
            return
    }
}
