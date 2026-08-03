package com.android.dx.dex.code.form;

/* JADX INFO: loaded from: classes.dex */
public final class Form21t extends com.android.dx.dex.code.InsnFormat {
    public static final com.android.dx.dex.code.InsnFormat THE_ONE = null;

    static {
            com.android.dx.dex.code.form.Form21t r0 = new com.android.dx.dex.code.form.Form21t
            r0.<init>()
            com.android.dx.dex.code.form.Form21t.THE_ONE = r0
            return
    }

    private Form21t() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public boolean branchFits(com.android.dx.dex.code.TargetInsn r1) {
            r0 = this;
            int r1 = r1.getTargetOffset()
            if (r1 == 0) goto Le
            boolean r1 = com.android.dx.dex.code.InsnFormat.signedFitsInShort(r1)
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public int codeSize() {
            r1 = this;
            r0 = 2
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
    public java.lang.String insnArgString(com.android.dx.dex.code.DalvInsn r4) {
            r3 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r4.getRegisters()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            com.android.dx.rop.code.RegisterSpec r0 = r0.get(r2)
            java.lang.String r0 = r0.regString()
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            java.lang.String r4 = com.android.dx.dex.code.InsnFormat.branchString(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public java.lang.String insnCommentString(com.android.dx.dex.code.DalvInsn r1, boolean r2) {
            r0 = this;
            java.lang.String r1 = com.android.dx.dex.code.InsnFormat.branchComment(r1)
            return r1
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public boolean isCompatible(com.android.dx.dex.code.DalvInsn r5) {
            r4 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r5.getRegisters()
            boolean r1 = r5 instanceof com.android.dx.dex.code.TargetInsn
            r2 = 0
            if (r1 == 0) goto L2c
            int r1 = r0.size()
            r3 = 1
            if (r1 != r3) goto L2c
            com.android.dx.rop.code.RegisterSpec r0 = r0.get(r2)
            int r0 = r0.getReg()
            boolean r0 = com.android.dx.dex.code.InsnFormat.unsignedFitsInByte(r0)
            if (r0 != 0) goto L1f
            goto L2c
        L1f:
            com.android.dx.dex.code.TargetInsn r5 = (com.android.dx.dex.code.TargetInsn) r5
            boolean r0 = r5.hasTargetOffset()
            if (r0 == 0) goto L2b
            boolean r3 = r4.branchFits(r5)
        L2b:
            return r3
        L2c:
            return r2
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public void writeTo(com.android.dx.util.AnnotatedOutput r4, com.android.dx.dex.code.DalvInsn r5) {
            r3 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r5.getRegisters()
            r1 = r5
            com.android.dx.dex.code.TargetInsn r1 = (com.android.dx.dex.code.TargetInsn) r1
            int r1 = r1.getTargetOffset()
            r2 = 0
            com.android.dx.rop.code.RegisterSpec r0 = r0.get(r2)
            int r0 = r0.getReg()
            short r5 = com.android.dx.dex.code.InsnFormat.opcodeUnit(r5, r0)
            short r0 = (short) r1
            com.android.dx.dex.code.InsnFormat.write(r4, r5, r0)
            return
    }
}
