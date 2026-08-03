package com.android.dx.dex.code.form;

/* JADX INFO: loaded from: classes.dex */
public final class Form21h extends com.android.dx.dex.code.InsnFormat {
    public static final com.android.dx.dex.code.InsnFormat THE_ONE = null;

    static {
            com.android.dx.dex.code.form.Form21h r0 = new com.android.dx.dex.code.form.Form21h
            r0.<init>()
            com.android.dx.dex.code.form.Form21h.THE_ONE = r0
            return
    }

    private Form21h() {
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
    public java.lang.String insnCommentString(com.android.dx.dex.code.DalvInsn r2, boolean r3) {
            r1 = this;
            com.android.dx.rop.code.RegisterSpecList r3 = r2.getRegisters()
            com.android.dx.dex.code.CstInsn r2 = (com.android.dx.dex.code.CstInsn) r2
            com.android.dx.rop.cst.Constant r2 = r2.getConstant()
            com.android.dx.rop.cst.CstLiteralBits r2 = (com.android.dx.rop.cst.CstLiteralBits) r2
            r0 = 0
            com.android.dx.rop.code.RegisterSpec r3 = r3.get(r0)
            int r3 = r3.getCategory()
            r0 = 1
            if (r3 != r0) goto L1b
            r3 = 32
            goto L1d
        L1b:
            r3 = 64
        L1d:
            java.lang.String r2 = com.android.dx.dex.code.InsnFormat.literalBitsComment(r2, r3)
            return r2
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public boolean isCompatible(com.android.dx.dex.code.DalvInsn r7) {
            r6 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r7.getRegisters()
            boolean r1 = r7 instanceof com.android.dx.dex.code.CstInsn
            r2 = 0
            if (r1 == 0) goto L53
            int r1 = r0.size()
            r3 = 1
            if (r1 != r3) goto L53
            com.android.dx.rop.code.RegisterSpec r1 = r0.get(r2)
            int r1 = r1.getReg()
            boolean r1 = com.android.dx.dex.code.InsnFormat.unsignedFitsInByte(r1)
            if (r1 != 0) goto L1f
            goto L53
        L1f:
            com.android.dx.dex.code.CstInsn r7 = (com.android.dx.dex.code.CstInsn) r7
            com.android.dx.rop.cst.Constant r7 = r7.getConstant()
            boolean r1 = r7 instanceof com.android.dx.rop.cst.CstLiteralBits
            if (r1 != 0) goto L2a
            return r2
        L2a:
            com.android.dx.rop.cst.CstLiteralBits r7 = (com.android.dx.rop.cst.CstLiteralBits) r7
            com.android.dx.rop.code.RegisterSpec r0 = r0.get(r2)
            int r0 = r0.getCategory()
            if (r0 != r3) goto L42
            int r7 = r7.getIntBits()
            r0 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r0
            if (r7 != 0) goto L41
            r2 = r3
        L41:
            return r2
        L42:
            long r0 = r7.getLongBits()
            r4 = 281474976710655(0xffffffffffff, double:1.390671161566996E-309)
            long r0 = r0 & r4
            r4 = 0
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 != 0) goto L53
            r2 = r3
        L53:
            return r2
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public void writeTo(com.android.dx.util.AnnotatedOutput r6, com.android.dx.dex.code.DalvInsn r7) {
            r5 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r7.getRegisters()
            r1 = r7
            com.android.dx.dex.code.CstInsn r1 = (com.android.dx.dex.code.CstInsn) r1
            com.android.dx.rop.cst.Constant r1 = r1.getConstant()
            com.android.dx.rop.cst.CstLiteralBits r1 = (com.android.dx.rop.cst.CstLiteralBits) r1
            r2 = 0
            com.android.dx.rop.code.RegisterSpec r3 = r0.get(r2)
            int r3 = r3.getCategory()
            r4 = 1
            if (r3 != r4) goto L21
            int r1 = r1.getIntBits()
            int r1 = r1 >>> 16
        L1f:
            short r1 = (short) r1
            goto L2a
        L21:
            long r3 = r1.getLongBits()
            r1 = 48
            long r3 = r3 >>> r1
            int r1 = (int) r3
            goto L1f
        L2a:
            com.android.dx.rop.code.RegisterSpec r0 = r0.get(r2)
            int r0 = r0.getReg()
            short r7 = com.android.dx.dex.code.InsnFormat.opcodeUnit(r7, r0)
            com.android.dx.dex.code.InsnFormat.write(r6, r7, r1)
            return
    }
}
