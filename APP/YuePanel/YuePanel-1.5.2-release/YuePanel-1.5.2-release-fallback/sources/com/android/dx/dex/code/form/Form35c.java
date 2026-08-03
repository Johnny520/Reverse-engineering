package com.android.dx.dex.code.form;

/* JADX INFO: loaded from: classes.dex */
public final class Form35c extends com.android.dx.dex.code.InsnFormat {
    private static final int MAX_NUM_OPS = 5;
    public static final com.android.dx.dex.code.InsnFormat THE_ONE = null;

    static {
            com.android.dx.dex.code.form.Form35c r0 = new com.android.dx.dex.code.form.Form35c
            r0.<init>()
            com.android.dx.dex.code.form.Form35c.THE_ONE = r0
            return
    }

    private Form35c() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.android.dx.rop.code.RegisterSpecList explicitize(com.android.dx.rop.code.RegisterSpecList r7) {
            int r0 = wordCount(r7)
            int r1 = r7.size()
            if (r0 != r1) goto Lb
            return r7
        Lb:
            com.android.dx.rop.code.RegisterSpecList r2 = new com.android.dx.rop.code.RegisterSpecList
            r2.<init>(r0)
            r0 = 0
            r3 = r0
        L12:
            if (r0 >= r1) goto L3b
            com.android.dx.rop.code.RegisterSpec r4 = r7.get(r0)
            r2.set(r3, r4)
            int r5 = r4.getCategory()
            r6 = 2
            if (r5 != r6) goto L36
            int r5 = r3 + 1
            int r4 = r4.getReg()
            int r4 = r4 + 1
            com.android.dx.rop.type.Type r6 = com.android.dx.rop.type.Type.VOID
            com.android.dx.rop.code.RegisterSpec r4 = com.android.dx.rop.code.RegisterSpec.make(r4, r6)
            r2.set(r5, r4)
            int r3 = r3 + 2
            goto L38
        L36:
            int r3 = r3 + 1
        L38:
            int r0 = r0 + 1
            goto L12
        L3b:
            r2.setImmutable()
            return r2
    }

    private static int wordCount(com.android.dx.rop.code.RegisterSpecList r7) {
            int r0 = r7.size()
            r1 = -1
            r2 = 5
            if (r0 <= r2) goto L9
            return r1
        L9:
            r3 = 0
            r4 = r3
        Lb:
            if (r3 >= r0) goto L2b
            com.android.dx.rop.code.RegisterSpec r5 = r7.get(r3)
            int r6 = r5.getCategory()
            int r4 = r4 + r6
            int r6 = r5.getReg()
            int r5 = r5.getCategory()
            int r6 = r6 + r5
            int r6 = r6 + (-1)
            boolean r5 = com.android.dx.dex.code.InsnFormat.unsignedFitsInNibble(r6)
            if (r5 != 0) goto L28
            return r1
        L28:
            int r3 = r3 + 1
            goto Lb
        L2b:
            if (r4 > r2) goto L2e
            r1 = r4
        L2e:
            return r1
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
        Le:
            if (r2 >= r0) goto L29
            com.android.dx.rop.code.RegisterSpec r3 = r6.get(r2)
            int r4 = r3.getReg()
            int r3 = r3.getCategory()
            int r4 = r4 + r3
            int r4 = r4 + (-1)
            boolean r3 = com.android.dx.dex.code.InsnFormat.unsignedFitsInNibble(r4)
            r1.set(r2, r3)
            int r2 = r2 + 1
            goto Le
        L29:
            return r1
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public java.lang.String insnArgString(com.android.dx.dex.code.DalvInsn r3) {
            r2 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r3.getRegisters()
            com.android.dx.rop.code.RegisterSpecList r0 = explicitize(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = com.android.dx.dex.code.InsnFormat.regListString(r0)
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            java.lang.String r3 = r3.cstString()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
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
            boolean r0 = com.android.dx.dex.code.InsnFormat.unsignedFitsInShort(r0)
            if (r0 != 0) goto L13
            return r1
        L13:
            com.android.dx.rop.cst.Constant r0 = r4.getConstant()
            boolean r2 = r0 instanceof com.android.dx.rop.cst.CstMethodRef
            if (r2 != 0) goto L24
            boolean r2 = r0 instanceof com.android.dx.rop.cst.CstType
            if (r2 != 0) goto L24
            boolean r0 = r0 instanceof com.android.dx.rop.cst.CstCallSiteRef
            if (r0 != 0) goto L24
            return r1
        L24:
            com.android.dx.rop.code.RegisterSpecList r4 = r4.getRegisters()
            int r4 = wordCount(r4)
            if (r4 < 0) goto L2f
            r1 = 1
        L2f:
            return r1
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public void writeTo(com.android.dx.util.AnnotatedOutput r10, com.android.dx.dex.code.DalvInsn r11) {
            r9 = this;
            r0 = r11
            com.android.dx.dex.code.CstInsn r0 = (com.android.dx.dex.code.CstInsn) r0
            int r0 = r0.getIndex()
            com.android.dx.rop.code.RegisterSpecList r1 = r11.getRegisters()
            com.android.dx.rop.code.RegisterSpecList r1 = explicitize(r1)
            int r2 = r1.size()
            r3 = 0
            if (r2 <= 0) goto L1f
            com.android.dx.rop.code.RegisterSpec r4 = r1.get(r3)
            int r4 = r4.getReg()
            goto L20
        L1f:
            r4 = r3
        L20:
            r5 = 1
            if (r2 <= r5) goto L2c
            com.android.dx.rop.code.RegisterSpec r5 = r1.get(r5)
            int r5 = r5.getReg()
            goto L2d
        L2c:
            r5 = r3
        L2d:
            r6 = 2
            if (r2 <= r6) goto L39
            com.android.dx.rop.code.RegisterSpec r6 = r1.get(r6)
            int r6 = r6.getReg()
            goto L3a
        L39:
            r6 = r3
        L3a:
            r7 = 3
            if (r2 <= r7) goto L46
            com.android.dx.rop.code.RegisterSpec r7 = r1.get(r7)
            int r7 = r7.getReg()
            goto L47
        L46:
            r7 = r3
        L47:
            r8 = 4
            if (r2 <= r8) goto L52
            com.android.dx.rop.code.RegisterSpec r1 = r1.get(r8)
            int r3 = r1.getReg()
        L52:
            int r1 = com.android.dx.dex.code.InsnFormat.makeByte(r3, r2)
            short r11 = com.android.dx.dex.code.InsnFormat.opcodeUnit(r11, r1)
            short r0 = (short) r0
            short r1 = com.android.dx.dex.code.InsnFormat.codeUnit(r4, r5, r6, r7)
            com.android.dx.dex.code.InsnFormat.write(r10, r11, r0, r1)
            return
    }
}
