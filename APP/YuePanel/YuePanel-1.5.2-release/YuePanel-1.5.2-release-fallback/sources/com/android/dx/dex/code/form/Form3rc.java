package com.android.dx.dex.code.form;

/* JADX INFO: loaded from: classes.dex */
public final class Form3rc extends com.android.dx.dex.code.InsnFormat {
    public static final com.android.dx.dex.code.InsnFormat THE_ONE = null;

    static {
            com.android.dx.dex.code.form.Form3rc r0 = new com.android.dx.dex.code.form.Form3rc
            r0.<init>()
            com.android.dx.dex.code.form.Form3rc.THE_ONE = r0
            return
    }

    private Form3rc() {
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
    public java.lang.String insnArgString(com.android.dx.dex.code.DalvInsn r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.android.dx.rop.code.RegisterSpecList r1 = r3.getRegisters()
            java.lang.String r1 = com.android.dx.dex.code.InsnFormat.regRangeString(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.String r3 = r3.cstString()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
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
    public boolean isCompatible(com.android.dx.dex.code.DalvInsn r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.android.dx.dex.code.CstInsn
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.android.dx.dex.code.CstInsn r4 = (com.android.dx.dex.code.CstInsn) r4
            int r0 = r4.getIndex()
            com.android.dx.rop.cst.Constant r2 = r4.getConstant()
            boolean r0 = com.android.dx.dex.code.InsnFormat.unsignedFitsInShort(r0)
            if (r0 != 0) goto L17
            return r1
        L17:
            boolean r0 = r2 instanceof com.android.dx.rop.cst.CstMethodRef
            if (r0 != 0) goto L24
            boolean r0 = r2 instanceof com.android.dx.rop.cst.CstType
            if (r0 != 0) goto L24
            boolean r0 = r2 instanceof com.android.dx.rop.cst.CstCallSiteRef
            if (r0 != 0) goto L24
            return r1
        L24:
            com.android.dx.rop.code.RegisterSpecList r4 = r4.getRegisters()
            r4.size()
            int r0 = r4.size()
            if (r0 == 0) goto L4f
            boolean r0 = com.android.dx.dex.code.InsnFormat.isRegListSequential(r4)
            if (r0 == 0) goto L50
            com.android.dx.rop.code.RegisterSpec r0 = r4.get(r1)
            int r0 = r0.getReg()
            boolean r0 = com.android.dx.dex.code.InsnFormat.unsignedFitsInShort(r0)
            if (r0 == 0) goto L50
            int r4 = r4.getWordCount()
            boolean r4 = com.android.dx.dex.code.InsnFormat.unsignedFitsInByte(r4)
            if (r4 == 0) goto L50
        L4f:
            r1 = 1
        L50:
            return r1
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public void writeTo(com.android.dx.util.AnnotatedOutput r5, com.android.dx.dex.code.DalvInsn r6) {
            r4 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r6.getRegisters()
            r1 = r6
            com.android.dx.dex.code.CstInsn r1 = (com.android.dx.dex.code.CstInsn) r1
            int r1 = r1.getIndex()
            int r2 = r0.size()
            r3 = 0
            if (r2 != 0) goto L13
            goto L1b
        L13:
            com.android.dx.rop.code.RegisterSpec r2 = r0.get(r3)
            int r3 = r2.getReg()
        L1b:
            int r0 = r0.getWordCount()
            short r6 = com.android.dx.dex.code.InsnFormat.opcodeUnit(r6, r0)
            short r0 = (short) r1
            short r1 = (short) r3
            com.android.dx.dex.code.InsnFormat.write(r5, r6, r0, r1)
            return
    }
}
