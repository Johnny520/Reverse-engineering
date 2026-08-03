package com.android.dx.dex.code.form;

/* JADX INFO: loaded from: classes.dex */
public final class Form31c extends com.android.dx.dex.code.InsnFormat {
    public static final com.android.dx.dex.code.InsnFormat THE_ONE = null;

    static {
            com.android.dx.dex.code.form.Form31c r0 = new com.android.dx.dex.code.form.Form31c
            r0.<init>()
            com.android.dx.dex.code.form.Form31c.THE_ONE = r0
            return
    }

    private Form31c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public int codeSize() {
            r1 = this;
            r0 = 3
            return r0
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public java.util.BitSet compatibleRegs(com.android.dx.dex.code.DalvInsn r6) {
            r5 = this;
            com.android.dx.rop.code.RegisterSpecList r6 = r6.getRegisters()
            int r0 = r6.size()
            java.util.BitSet r1 = new java.util.BitSet
            r1.<init>(r0)
            r2 = 0
            com.android.dx.rop.code.RegisterSpec r3 = r6.get(r2)
            int r3 = r3.getReg()
            boolean r3 = com.android.dx.dex.code.InsnFormat.unsignedFitsInByte(r3)
            r4 = 1
            if (r0 != r4) goto L21
            r1.set(r2, r3)
            goto L39
        L21:
            com.android.dx.rop.code.RegisterSpec r0 = r6.get(r2)
            int r0 = r0.getReg()
            com.android.dx.rop.code.RegisterSpec r6 = r6.get(r4)
            int r6 = r6.getReg()
            if (r0 != r6) goto L39
            r1.set(r2, r3)
            r1.set(r4, r3)
        L39:
            return r1
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
            java.lang.String r4 = r4.cstString()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
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
    public boolean isCompatible(com.android.dx.dex.code.DalvInsn r6) {
            r5 = this;
            boolean r0 = r6 instanceof com.android.dx.dex.code.CstInsn
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.android.dx.rop.code.RegisterSpecList r0 = r6.getRegisters()
            int r2 = r0.size()
            r3 = 1
            if (r2 == r3) goto L28
            r4 = 2
            if (r2 == r4) goto L15
            return r1
        L15:
            com.android.dx.rop.code.RegisterSpec r2 = r0.get(r1)
            int r4 = r2.getReg()
            com.android.dx.rop.code.RegisterSpec r0 = r0.get(r3)
            int r0 = r0.getReg()
            if (r4 == r0) goto L2c
            return r1
        L28:
            com.android.dx.rop.code.RegisterSpec r2 = r0.get(r1)
        L2c:
            int r0 = r2.getReg()
            boolean r0 = com.android.dx.dex.code.InsnFormat.unsignedFitsInByte(r0)
            if (r0 != 0) goto L37
            return r1
        L37:
            com.android.dx.dex.code.CstInsn r6 = (com.android.dx.dex.code.CstInsn) r6
            com.android.dx.rop.cst.Constant r6 = r6.getConstant()
            boolean r0 = r6 instanceof com.android.dx.rop.cst.CstType
            if (r0 != 0) goto L49
            boolean r0 = r6 instanceof com.android.dx.rop.cst.CstFieldRef
            if (r0 != 0) goto L49
            boolean r6 = r6 instanceof com.android.dx.rop.cst.CstString
            if (r6 == 0) goto L4a
        L49:
            r1 = r3
        L4a:
            return r1
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public void writeTo(com.android.dx.util.AnnotatedOutput r4, com.android.dx.dex.code.DalvInsn r5) {
            r3 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r5.getRegisters()
            r1 = r5
            com.android.dx.dex.code.CstInsn r1 = (com.android.dx.dex.code.CstInsn) r1
            int r1 = r1.getIndex()
            r2 = 0
            com.android.dx.rop.code.RegisterSpec r0 = r0.get(r2)
            int r0 = r0.getReg()
            short r5 = com.android.dx.dex.code.InsnFormat.opcodeUnit(r5, r0)
            com.android.dx.dex.code.InsnFormat.write(r4, r5, r1)
            return
    }
}
