package com.android.dx.dex.code.form;

/* JADX INFO: loaded from: classes.dex */
public final class Form11x extends com.android.dx.dex.code.InsnFormat {
    public static final com.android.dx.dex.code.InsnFormat THE_ONE = null;

    static {
            com.android.dx.dex.code.form.Form11x r0 = new com.android.dx.dex.code.form.Form11x
            r0.<init>()
            com.android.dx.dex.code.form.Form11x.THE_ONE = r0
            return
    }

    private Form11x() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public int codeSize() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public java.util.BitSet compatibleRegs(com.android.dx.dex.code.DalvInsn r3) {
            r2 = this;
            com.android.dx.rop.code.RegisterSpecList r3 = r3.getRegisters()
            java.util.BitSet r0 = new java.util.BitSet
            r1 = 1
            r0.<init>(r1)
            r1 = 0
            com.android.dx.rop.code.RegisterSpec r3 = r3.get(r1)
            int r3 = r3.getReg()
            boolean r3 = com.android.dx.dex.code.InsnFormat.unsignedFitsInByte(r3)
            r0.set(r1, r3)
            return r0
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public java.lang.String insnArgString(com.android.dx.dex.code.DalvInsn r2) {
            r1 = this;
            com.android.dx.rop.code.RegisterSpecList r2 = r2.getRegisters()
            r0 = 0
            com.android.dx.rop.code.RegisterSpec r2 = r2.get(r0)
            java.lang.String r2 = r2.regString()
            return r2
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public java.lang.String insnCommentString(com.android.dx.dex.code.DalvInsn r1, boolean r2) {
            r0 = this;
            java.lang.String r1 = ""
            return r1
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public boolean isCompatible(com.android.dx.dex.code.DalvInsn r4) {
            r3 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r4.getRegisters()
            boolean r4 = r4 instanceof com.android.dx.dex.code.SimpleInsn
            r1 = 0
            if (r4 == 0) goto L1f
            int r4 = r0.size()
            r2 = 1
            if (r4 != r2) goto L1f
            com.android.dx.rop.code.RegisterSpec r4 = r0.get(r1)
            int r4 = r4.getReg()
            boolean r4 = com.android.dx.dex.code.InsnFormat.unsignedFitsInByte(r4)
            if (r4 == 0) goto L1f
            r1 = r2
        L1f:
            return r1
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public void writeTo(com.android.dx.util.AnnotatedOutput r3, com.android.dx.dex.code.DalvInsn r4) {
            r2 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r4.getRegisters()
            r1 = 0
            com.android.dx.rop.code.RegisterSpec r0 = r0.get(r1)
            int r0 = r0.getReg()
            short r4 = com.android.dx.dex.code.InsnFormat.opcodeUnit(r4, r0)
            com.android.dx.dex.code.InsnFormat.write(r3, r4)
            return
    }
}
