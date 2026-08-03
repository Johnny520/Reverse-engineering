package com.android.dx.dex.code.form;

/* JADX INFO: loaded from: classes.dex */
public final class Form22t extends com.android.dx.dex.code.InsnFormat {
    public static final com.android.dx.dex.code.InsnFormat THE_ONE = null;

    static {
            com.android.dx.dex.code.form.Form22t r0 = new com.android.dx.dex.code.form.Form22t
            r0.<init>()
            com.android.dx.dex.code.form.Form22t.THE_ONE = r0
            return
    }

    private Form22t() {
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
    public java.util.BitSet compatibleRegs(com.android.dx.dex.code.DalvInsn r4) {
            r3 = this;
            com.android.dx.rop.code.RegisterSpecList r4 = r4.getRegisters()
            java.util.BitSet r0 = new java.util.BitSet
            r1 = 2
            r0.<init>(r1)
            r1 = 0
            com.android.dx.rop.code.RegisterSpec r2 = r4.get(r1)
            int r2 = r2.getReg()
            boolean r2 = com.android.dx.dex.code.InsnFormat.unsignedFitsInNibble(r2)
            r0.set(r1, r2)
            r1 = 1
            com.android.dx.rop.code.RegisterSpec r4 = r4.get(r1)
            int r4 = r4.getReg()
            boolean r4 = com.android.dx.dex.code.InsnFormat.unsignedFitsInNibble(r4)
            r0.set(r1, r4)
            return r0
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public java.lang.String insnArgString(com.android.dx.dex.code.DalvInsn r5) {
            r4 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r5.getRegisters()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            com.android.dx.rop.code.RegisterSpec r2 = r0.get(r2)
            java.lang.String r2 = r2.regString()
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            r3 = 1
            com.android.dx.rop.code.RegisterSpec r0 = r0.get(r3)
            java.lang.String r0 = r0.regString()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r5 = com.android.dx.dex.code.InsnFormat.branchString(r5)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
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
            if (r1 == 0) goto L3b
            int r1 = r0.size()
            r3 = 2
            if (r1 != r3) goto L3b
            com.android.dx.rop.code.RegisterSpec r1 = r0.get(r2)
            int r1 = r1.getReg()
            boolean r1 = com.android.dx.dex.code.InsnFormat.unsignedFitsInNibble(r1)
            if (r1 == 0) goto L3b
            r1 = 1
            com.android.dx.rop.code.RegisterSpec r0 = r0.get(r1)
            int r0 = r0.getReg()
            boolean r0 = com.android.dx.dex.code.InsnFormat.unsignedFitsInNibble(r0)
            if (r0 != 0) goto L2e
            goto L3b
        L2e:
            com.android.dx.dex.code.TargetInsn r5 = (com.android.dx.dex.code.TargetInsn) r5
            boolean r0 = r5.hasTargetOffset()
            if (r0 == 0) goto L3a
            boolean r1 = r4.branchFits(r5)
        L3a:
            return r1
        L3b:
            return r2
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public void writeTo(com.android.dx.util.AnnotatedOutput r5, com.android.dx.dex.code.DalvInsn r6) {
            r4 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r6.getRegisters()
            r1 = r6
            com.android.dx.dex.code.TargetInsn r1 = (com.android.dx.dex.code.TargetInsn) r1
            int r1 = r1.getTargetOffset()
            r2 = 0
            com.android.dx.rop.code.RegisterSpec r2 = r0.get(r2)
            int r2 = r2.getReg()
            r3 = 1
            com.android.dx.rop.code.RegisterSpec r0 = r0.get(r3)
            int r0 = r0.getReg()
            int r0 = com.android.dx.dex.code.InsnFormat.makeByte(r2, r0)
            short r6 = com.android.dx.dex.code.InsnFormat.opcodeUnit(r6, r0)
            short r0 = (short) r1
            com.android.dx.dex.code.InsnFormat.write(r5, r6, r0)
            return
    }
}
