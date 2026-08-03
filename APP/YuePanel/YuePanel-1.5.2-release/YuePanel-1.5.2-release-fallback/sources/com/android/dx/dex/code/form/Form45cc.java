package com.android.dx.dex.code.form;

/* JADX INFO: loaded from: classes.dex */
public final class Form45cc extends com.android.dx.dex.code.InsnFormat {
    private static final int MAX_NUM_OPS = 5;
    public static final com.android.dx.dex.code.InsnFormat THE_ONE = null;

    static {
            com.android.dx.dex.code.form.Form45cc r0 = new com.android.dx.dex.code.form.Form45cc
            r0.<init>()
            com.android.dx.dex.code.form.Form45cc.THE_ONE = r0
            return
    }

    private Form45cc() {
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
            r0 = 4
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
    public boolean isCompatible(com.android.dx.dex.code.DalvInsn r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.android.dx.dex.code.MultiCstInsn
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.android.dx.dex.code.MultiCstInsn r5 = (com.android.dx.dex.code.MultiCstInsn) r5
            int r0 = r5.getNumberOfConstants()
            r2 = 2
            if (r0 == r2) goto L10
            return r1
        L10:
            int r0 = r5.getIndex(r1)
            r2 = 1
            int r3 = r5.getIndex(r2)
            boolean r0 = com.android.dx.dex.code.InsnFormat.unsignedFitsInShort(r0)
            if (r0 == 0) goto L43
            boolean r0 = com.android.dx.dex.code.InsnFormat.unsignedFitsInShort(r3)
            if (r0 != 0) goto L26
            goto L43
        L26:
            com.android.dx.rop.cst.Constant r0 = r5.getConstant(r1)
            boolean r0 = r0 instanceof com.android.dx.rop.cst.CstMethodRef
            if (r0 != 0) goto L2f
            return r1
        L2f:
            com.android.dx.rop.cst.Constant r0 = r5.getConstant(r2)
            boolean r0 = r0 instanceof com.android.dx.rop.cst.CstProtoRef
            if (r0 != 0) goto L38
            return r1
        L38:
            com.android.dx.rop.code.RegisterSpecList r5 = r5.getRegisters()
            int r5 = wordCount(r5)
            if (r5 < 0) goto L43
            r1 = r2
        L43:
            return r1
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public void writeTo(com.android.dx.util.AnnotatedOutput r11, com.android.dx.dex.code.DalvInsn r12) {
            r10 = this;
            r0 = r12
            com.android.dx.dex.code.MultiCstInsn r0 = (com.android.dx.dex.code.MultiCstInsn) r0
            r1 = 0
            int r2 = r0.getIndex(r1)
            short r2 = (short) r2
            r3 = 1
            int r0 = r0.getIndex(r3)
            short r0 = (short) r0
            com.android.dx.rop.code.RegisterSpecList r4 = r12.getRegisters()
            com.android.dx.rop.code.RegisterSpecList r4 = explicitize(r4)
            int r5 = r4.size()
            if (r5 <= 0) goto L26
            com.android.dx.rop.code.RegisterSpec r6 = r4.get(r1)
            int r6 = r6.getReg()
            goto L27
        L26:
            r6 = r1
        L27:
            if (r5 <= r3) goto L32
            com.android.dx.rop.code.RegisterSpec r3 = r4.get(r3)
            int r3 = r3.getReg()
            goto L33
        L32:
            r3 = r1
        L33:
            r7 = 2
            if (r5 <= r7) goto L3f
            com.android.dx.rop.code.RegisterSpec r7 = r4.get(r7)
            int r7 = r7.getReg()
            goto L40
        L3f:
            r7 = r1
        L40:
            r8 = 3
            if (r5 <= r8) goto L4c
            com.android.dx.rop.code.RegisterSpec r8 = r4.get(r8)
            int r8 = r8.getReg()
            goto L4d
        L4c:
            r8 = r1
        L4d:
            r9 = 4
            if (r5 <= r9) goto L58
            com.android.dx.rop.code.RegisterSpec r1 = r4.get(r9)
            int r1 = r1.getReg()
        L58:
            int r1 = com.android.dx.dex.code.InsnFormat.makeByte(r1, r5)
            short r12 = com.android.dx.dex.code.InsnFormat.opcodeUnit(r12, r1)
            short r1 = com.android.dx.dex.code.InsnFormat.codeUnit(r6, r3, r7, r8)
            com.android.dx.dex.code.InsnFormat.write(r11, r12, r2, r1, r0)
            return
    }
}
