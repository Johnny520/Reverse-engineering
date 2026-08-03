package com.android.dx.dex.code.form;

/* JADX INFO: loaded from: classes.dex */
public final class Form22b extends com.android.dx.dex.code.InsnFormat {
    public static final com.android.dx.dex.code.InsnFormat THE_ONE = null;

    static {
            com.android.dx.dex.code.form.Form22b r0 = new com.android.dx.dex.code.form.Form22b
            r0.<init>()
            com.android.dx.dex.code.form.Form22b.THE_ONE = r0
            return
    }

    private Form22b() {
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
            boolean r2 = com.android.dx.dex.code.InsnFormat.unsignedFitsInByte(r2)
            r0.set(r1, r2)
            r1 = 1
            com.android.dx.rop.code.RegisterSpec r4 = r4.get(r1)
            int r4 = r4.getReg()
            boolean r4 = com.android.dx.dex.code.InsnFormat.unsignedFitsInByte(r4)
            r0.set(r1, r4)
            return r0
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public java.lang.String insnArgString(com.android.dx.dex.code.DalvInsn r5) {
            r4 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r5.getRegisters()
            com.android.dx.dex.code.CstInsn r5 = (com.android.dx.dex.code.CstInsn) r5
            com.android.dx.rop.cst.Constant r5 = r5.getConstant()
            com.android.dx.rop.cst.CstLiteralBits r5 = (com.android.dx.rop.cst.CstLiteralBits) r5
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
            java.lang.String r5 = com.android.dx.dex.code.InsnFormat.literalBitsString(r5)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public java.lang.String insnCommentString(com.android.dx.dex.code.DalvInsn r1, boolean r2) {
            r0 = this;
            com.android.dx.dex.code.CstInsn r1 = (com.android.dx.dex.code.CstInsn) r1
            com.android.dx.rop.cst.Constant r1 = r1.getConstant()
            com.android.dx.rop.cst.CstLiteralBits r1 = (com.android.dx.rop.cst.CstLiteralBits) r1
            r2 = 8
            java.lang.String r1 = com.android.dx.dex.code.InsnFormat.literalBitsComment(r1, r2)
            return r1
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public boolean isCompatible(com.android.dx.dex.code.DalvInsn r5) {
            r4 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r5.getRegisters()
            boolean r1 = r5 instanceof com.android.dx.dex.code.CstInsn
            r2 = 0
            if (r1 == 0) goto L4c
            int r1 = r0.size()
            r3 = 2
            if (r1 != r3) goto L4c
            com.android.dx.rop.code.RegisterSpec r1 = r0.get(r2)
            int r1 = r1.getReg()
            boolean r1 = com.android.dx.dex.code.InsnFormat.unsignedFitsInByte(r1)
            if (r1 == 0) goto L4c
            r1 = 1
            com.android.dx.rop.code.RegisterSpec r0 = r0.get(r1)
            int r0 = r0.getReg()
            boolean r0 = com.android.dx.dex.code.InsnFormat.unsignedFitsInByte(r0)
            if (r0 != 0) goto L2e
            goto L4c
        L2e:
            com.android.dx.dex.code.CstInsn r5 = (com.android.dx.dex.code.CstInsn) r5
            com.android.dx.rop.cst.Constant r5 = r5.getConstant()
            boolean r0 = r5 instanceof com.android.dx.rop.cst.CstLiteralBits
            if (r0 != 0) goto L39
            return r2
        L39:
            com.android.dx.rop.cst.CstLiteralBits r5 = (com.android.dx.rop.cst.CstLiteralBits) r5
            boolean r0 = r5.fitsInInt()
            if (r0 == 0) goto L4c
            int r5 = r5.getIntBits()
            boolean r5 = com.android.dx.dex.code.InsnFormat.signedFitsInByte(r5)
            if (r5 == 0) goto L4c
            r2 = r1
        L4c:
            return r2
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public void writeTo(com.android.dx.util.AnnotatedOutput r4, com.android.dx.dex.code.DalvInsn r5) {
            r3 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r5.getRegisters()
            r1 = r5
            com.android.dx.dex.code.CstInsn r1 = (com.android.dx.dex.code.CstInsn) r1
            com.android.dx.rop.cst.Constant r1 = r1.getConstant()
            com.android.dx.rop.cst.CstLiteralBits r1 = (com.android.dx.rop.cst.CstLiteralBits) r1
            int r1 = r1.getIntBits()
            r2 = 0
            com.android.dx.rop.code.RegisterSpec r2 = r0.get(r2)
            int r2 = r2.getReg()
            short r5 = com.android.dx.dex.code.InsnFormat.opcodeUnit(r5, r2)
            r2 = 1
            com.android.dx.rop.code.RegisterSpec r0 = r0.get(r2)
            int r0 = r0.getReg()
            r1 = r1 & 255(0xff, float:3.57E-43)
            short r0 = com.android.dx.dex.code.InsnFormat.codeUnit(r0, r1)
            com.android.dx.dex.code.InsnFormat.write(r4, r5, r0)
            return
    }
}
