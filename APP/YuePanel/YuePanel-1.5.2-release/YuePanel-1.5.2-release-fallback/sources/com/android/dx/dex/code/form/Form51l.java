package com.android.dx.dex.code.form;

/* JADX INFO: loaded from: classes.dex */
public final class Form51l extends com.android.dx.dex.code.InsnFormat {
    public static final com.android.dx.dex.code.InsnFormat THE_ONE = null;

    static {
            com.android.dx.dex.code.form.Form51l r0 = new com.android.dx.dex.code.form.Form51l
            r0.<init>()
            com.android.dx.dex.code.form.Form51l.THE_ONE = r0
            return
    }

    private Form51l() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public int codeSize() {
            r1 = this;
            r0 = 5
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
            com.android.dx.dex.code.CstInsn r4 = (com.android.dx.dex.code.CstInsn) r4
            com.android.dx.rop.cst.Constant r4 = r4.getConstant()
            com.android.dx.rop.cst.CstLiteralBits r4 = (com.android.dx.rop.cst.CstLiteralBits) r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            com.android.dx.rop.code.RegisterSpec r0 = r0.get(r2)
            java.lang.String r0 = r0.regString()
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            java.lang.String r4 = com.android.dx.dex.code.InsnFormat.literalBitsString(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public java.lang.String insnCommentString(com.android.dx.dex.code.DalvInsn r1, boolean r2) {
            r0 = this;
            com.android.dx.dex.code.CstInsn r1 = (com.android.dx.dex.code.CstInsn) r1
            com.android.dx.rop.cst.Constant r1 = r1.getConstant()
            com.android.dx.rop.cst.CstLiteralBits r1 = (com.android.dx.rop.cst.CstLiteralBits) r1
            r2 = 64
            java.lang.String r1 = com.android.dx.dex.code.InsnFormat.literalBitsComment(r1, r2)
            return r1
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public boolean isCompatible(com.android.dx.dex.code.DalvInsn r5) {
            r4 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r5.getRegisters()
            boolean r1 = r5 instanceof com.android.dx.dex.code.CstInsn
            r2 = 0
            if (r1 == 0) goto L28
            int r1 = r0.size()
            r3 = 1
            if (r1 != r3) goto L28
            com.android.dx.rop.code.RegisterSpec r0 = r0.get(r2)
            int r0 = r0.getReg()
            boolean r0 = com.android.dx.dex.code.InsnFormat.unsignedFitsInByte(r0)
            if (r0 != 0) goto L1f
            goto L28
        L1f:
            com.android.dx.dex.code.CstInsn r5 = (com.android.dx.dex.code.CstInsn) r5
            com.android.dx.rop.cst.Constant r5 = r5.getConstant()
            boolean r5 = r5 instanceof com.android.dx.rop.cst.CstLiteral64
            return r5
        L28:
            return r2
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public void writeTo(com.android.dx.util.AnnotatedOutput r5, com.android.dx.dex.code.DalvInsn r6) {
            r4 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r6.getRegisters()
            r1 = r6
            com.android.dx.dex.code.CstInsn r1 = (com.android.dx.dex.code.CstInsn) r1
            com.android.dx.rop.cst.Constant r1 = r1.getConstant()
            com.android.dx.rop.cst.CstLiteral64 r1 = (com.android.dx.rop.cst.CstLiteral64) r1
            long r1 = r1.getLongBits()
            r3 = 0
            com.android.dx.rop.code.RegisterSpec r0 = r0.get(r3)
            int r0 = r0.getReg()
            short r6 = com.android.dx.dex.code.InsnFormat.opcodeUnit(r6, r0)
            com.android.dx.dex.code.InsnFormat.write(r5, r6, r1)
            return
    }
}
