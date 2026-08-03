package com.android.dx.dex.code.form;

/* JADX INFO: loaded from: classes.dex */
public final class Form23x extends com.android.dx.dex.code.InsnFormat {
    public static final com.android.dx.dex.code.InsnFormat THE_ONE = null;

    static {
            com.android.dx.dex.code.form.Form23x r0 = new com.android.dx.dex.code.form.Form23x
            r0.<init>()
            com.android.dx.dex.code.form.Form23x.THE_ONE = r0
            return
    }

    private Form23x() {
            r0 = this;
            r0.<init>()
            return
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
            r1 = 3
            r0.<init>(r1)
            r1 = 0
            com.android.dx.rop.code.RegisterSpec r2 = r4.get(r1)
            int r2 = r2.getReg()
            boolean r2 = com.android.dx.dex.code.InsnFormat.unsignedFitsInByte(r2)
            r0.set(r1, r2)
            r1 = 1
            com.android.dx.rop.code.RegisterSpec r2 = r4.get(r1)
            int r2 = r2.getReg()
            boolean r2 = com.android.dx.dex.code.InsnFormat.unsignedFitsInByte(r2)
            r0.set(r1, r2)
            r1 = 2
            com.android.dx.rop.code.RegisterSpec r4 = r4.get(r1)
            int r4 = r4.getReg()
            boolean r4 = com.android.dx.dex.code.InsnFormat.unsignedFitsInByte(r4)
            r0.set(r1, r4)
            return r0
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public java.lang.String insnArgString(com.android.dx.dex.code.DalvInsn r4) {
            r3 = this;
            com.android.dx.rop.code.RegisterSpecList r4 = r4.getRegisters()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            com.android.dx.rop.code.RegisterSpec r1 = r4.get(r1)
            java.lang.String r1 = r1.regString()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            r2 = 1
            com.android.dx.rop.code.RegisterSpec r2 = r4.get(r2)
            java.lang.String r2 = r2.regString()
            r0.append(r2)
            r0.append(r1)
            r1 = 2
            com.android.dx.rop.code.RegisterSpec r4 = r4.get(r1)
            java.lang.String r4 = r4.regString()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
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
            if (r4 == 0) goto L3d
            int r4 = r0.size()
            r2 = 3
            if (r4 != r2) goto L3d
            com.android.dx.rop.code.RegisterSpec r4 = r0.get(r1)
            int r4 = r4.getReg()
            boolean r4 = com.android.dx.dex.code.InsnFormat.unsignedFitsInByte(r4)
            if (r4 == 0) goto L3d
            r4 = 1
            com.android.dx.rop.code.RegisterSpec r2 = r0.get(r4)
            int r2 = r2.getReg()
            boolean r2 = com.android.dx.dex.code.InsnFormat.unsignedFitsInByte(r2)
            if (r2 == 0) goto L3d
            r2 = 2
            com.android.dx.rop.code.RegisterSpec r0 = r0.get(r2)
            int r0 = r0.getReg()
            boolean r0 = com.android.dx.dex.code.InsnFormat.unsignedFitsInByte(r0)
            if (r0 == 0) goto L3d
            r1 = r4
        L3d:
            return r1
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public void writeTo(com.android.dx.util.AnnotatedOutput r4, com.android.dx.dex.code.DalvInsn r5) {
            r3 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r5.getRegisters()
            r1 = 0
            com.android.dx.rop.code.RegisterSpec r1 = r0.get(r1)
            int r1 = r1.getReg()
            short r5 = com.android.dx.dex.code.InsnFormat.opcodeUnit(r5, r1)
            r1 = 1
            com.android.dx.rop.code.RegisterSpec r1 = r0.get(r1)
            int r1 = r1.getReg()
            r2 = 2
            com.android.dx.rop.code.RegisterSpec r0 = r0.get(r2)
            int r0 = r0.getReg()
            short r0 = com.android.dx.dex.code.InsnFormat.codeUnit(r1, r0)
            com.android.dx.dex.code.InsnFormat.write(r4, r5, r0)
            return
    }
}
