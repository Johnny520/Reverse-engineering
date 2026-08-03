package com.android.dx.dex.code.form;

/* JADX INFO: loaded from: classes.dex */
public final class Form4rcc extends com.android.dx.dex.code.InsnFormat {
    public static final com.android.dx.dex.code.InsnFormat THE_ONE = null;

    static {
            com.android.dx.dex.code.form.Form4rcc r0 = new com.android.dx.dex.code.form.Form4rcc
            r0.<init>()
            com.android.dx.dex.code.form.Form4rcc.THE_ONE = r0
            return
    }

    private Form4rcc() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public int codeSize() {
            r1 = this;
            r0 = 4
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
    public boolean isCompatible(com.android.dx.dex.code.DalvInsn r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.android.dx.dex.code.MultiCstInsn
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.android.dx.dex.code.MultiCstInsn r5 = (com.android.dx.dex.code.MultiCstInsn) r5
            int r0 = r5.getIndex(r1)
            r2 = 1
            int r3 = r5.getIndex(r2)
            boolean r0 = com.android.dx.dex.code.InsnFormat.unsignedFitsInShort(r0)
            if (r0 == 0) goto L60
            boolean r0 = com.android.dx.dex.code.InsnFormat.unsignedFitsInShort(r3)
            if (r0 != 0) goto L1e
            goto L60
        L1e:
            com.android.dx.rop.cst.Constant r0 = r5.getConstant(r1)
            boolean r0 = r0 instanceof com.android.dx.rop.cst.CstMethodRef
            if (r0 != 0) goto L27
            return r1
        L27:
            com.android.dx.rop.cst.Constant r0 = r5.getConstant(r2)
            boolean r0 = r0 instanceof com.android.dx.rop.cst.CstProtoRef
            if (r0 != 0) goto L30
            return r1
        L30:
            com.android.dx.rop.code.RegisterSpecList r5 = r5.getRegisters()
            int r0 = r5.size()
            if (r0 != 0) goto L3b
            return r2
        L3b:
            int r3 = r5.getWordCount()
            boolean r3 = com.android.dx.dex.code.InsnFormat.unsignedFitsInByte(r3)
            if (r3 == 0) goto L60
            boolean r0 = com.android.dx.dex.code.InsnFormat.unsignedFitsInShort(r0)
            if (r0 == 0) goto L60
            com.android.dx.rop.code.RegisterSpec r0 = r5.get(r1)
            int r0 = r0.getReg()
            boolean r0 = com.android.dx.dex.code.InsnFormat.unsignedFitsInShort(r0)
            if (r0 == 0) goto L60
            boolean r5 = com.android.dx.dex.code.InsnFormat.isRegListSequential(r5)
            if (r5 == 0) goto L60
            r1 = r2
        L60:
            return r1
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public void writeTo(com.android.dx.util.AnnotatedOutput r6, com.android.dx.dex.code.DalvInsn r7) {
            r5 = this;
            r0 = r7
            com.android.dx.dex.code.MultiCstInsn r0 = (com.android.dx.dex.code.MultiCstInsn) r0
            r1 = 0
            int r2 = r0.getIndex(r1)
            short r2 = (short) r2
            r3 = 1
            int r0 = r0.getIndex(r3)
            short r0 = (short) r0
            com.android.dx.rop.code.RegisterSpecList r3 = r7.getRegisters()
            int r4 = r3.size()
            if (r4 <= 0) goto L22
            com.android.dx.rop.code.RegisterSpec r1 = r3.get(r1)
            int r1 = r1.getReg()
            short r1 = (short) r1
        L22:
            int r3 = r3.getWordCount()
            short r7 = com.android.dx.dex.code.InsnFormat.opcodeUnit(r7, r3)
            com.android.dx.dex.code.InsnFormat.write(r6, r7, r2, r1, r0)
            return
    }
}
