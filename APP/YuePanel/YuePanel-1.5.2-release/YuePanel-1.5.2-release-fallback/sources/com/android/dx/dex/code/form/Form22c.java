package com.android.dx.dex.code.form;

/* JADX INFO: loaded from: classes.dex */
public final class Form22c extends com.android.dx.dex.code.InsnFormat {
    public static final com.android.dx.dex.code.InsnFormat THE_ONE = null;

    static {
            com.android.dx.dex.code.form.Form22c r0 = new com.android.dx.dex.code.form.Form22c
            r0.<init>()
            com.android.dx.dex.code.form.Form22c.THE_ONE = r0
            return
    }

    private Form22c() {
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
            java.lang.String r5 = r5.cstString()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public java.lang.String insnCommentString(com.android.dx.dex.code.DalvInsn r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L7
            java.lang.String r1 = r1.cstComment()
            return r1
        L7:
            java.lang.String r1 = ""
            return r1
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public boolean isCompatible(com.android.dx.dex.code.DalvInsn r5) {
            r4 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r5.getRegisters()
            boolean r1 = r5 instanceof com.android.dx.dex.code.CstInsn
            r2 = 0
            if (r1 == 0) goto L48
            int r1 = r0.size()
            r3 = 2
            if (r1 != r3) goto L48
            com.android.dx.rop.code.RegisterSpec r1 = r0.get(r2)
            int r1 = r1.getReg()
            boolean r1 = com.android.dx.dex.code.InsnFormat.unsignedFitsInNibble(r1)
            if (r1 == 0) goto L48
            r1 = 1
            com.android.dx.rop.code.RegisterSpec r0 = r0.get(r1)
            int r0 = r0.getReg()
            boolean r0 = com.android.dx.dex.code.InsnFormat.unsignedFitsInNibble(r0)
            if (r0 != 0) goto L2e
            goto L48
        L2e:
            com.android.dx.dex.code.CstInsn r5 = (com.android.dx.dex.code.CstInsn) r5
            int r0 = r5.getIndex()
            boolean r0 = com.android.dx.dex.code.InsnFormat.unsignedFitsInShort(r0)
            if (r0 != 0) goto L3b
            return r2
        L3b:
            com.android.dx.rop.cst.Constant r5 = r5.getConstant()
            boolean r0 = r5 instanceof com.android.dx.rop.cst.CstType
            if (r0 != 0) goto L47
            boolean r5 = r5 instanceof com.android.dx.rop.cst.CstFieldRef
            if (r5 == 0) goto L48
        L47:
            r2 = r1
        L48:
            return r2
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public void writeTo(com.android.dx.util.AnnotatedOutput r5, com.android.dx.dex.code.DalvInsn r6) {
            r4 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r6.getRegisters()
            r1 = r6
            com.android.dx.dex.code.CstInsn r1 = (com.android.dx.dex.code.CstInsn) r1
            int r1 = r1.getIndex()
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
