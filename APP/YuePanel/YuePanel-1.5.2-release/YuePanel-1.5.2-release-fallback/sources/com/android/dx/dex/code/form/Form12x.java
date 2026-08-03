package com.android.dx.dex.code.form;

/* JADX INFO: loaded from: classes.dex */
public final class Form12x extends com.android.dx.dex.code.InsnFormat {
    public static final com.android.dx.dex.code.InsnFormat THE_ONE = null;

    static {
            com.android.dx.dex.code.form.Form12x r0 = new com.android.dx.dex.code.form.Form12x
            r0.<init>()
            com.android.dx.dex.code.form.Form12x.THE_ONE = r0
            return
    }

    private Form12x() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public int codeSize() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public java.util.BitSet compatibleRegs(com.android.dx.dex.code.DalvInsn r9) {
            r8 = this;
            com.android.dx.rop.code.RegisterSpecList r9 = r9.getRegisters()
            java.util.BitSet r0 = new java.util.BitSet
            r1 = 2
            r0.<init>(r1)
            r2 = 0
            com.android.dx.rop.code.RegisterSpec r3 = r9.get(r2)
            int r3 = r3.getReg()
            r4 = 1
            com.android.dx.rop.code.RegisterSpec r5 = r9.get(r4)
            int r5 = r5.getReg()
            int r6 = r9.size()
            if (r6 == r1) goto L4e
            r7 = 3
            if (r6 != r7) goto L48
            if (r3 == r5) goto L2e
            r0.set(r2, r2)
            r0.set(r4, r2)
            goto L38
        L2e:
            boolean r3 = com.android.dx.dex.code.InsnFormat.unsignedFitsInNibble(r5)
            r0.set(r2, r3)
            r0.set(r4, r3)
        L38:
            com.android.dx.rop.code.RegisterSpec r9 = r9.get(r1)
            int r9 = r9.getReg()
            boolean r9 = com.android.dx.dex.code.InsnFormat.unsignedFitsInNibble(r9)
            r0.set(r1, r9)
            goto L5c
        L48:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L4e:
            boolean r9 = com.android.dx.dex.code.InsnFormat.unsignedFitsInNibble(r3)
            r0.set(r2, r9)
            boolean r9 = com.android.dx.dex.code.InsnFormat.unsignedFitsInNibble(r5)
            r0.set(r4, r9)
        L5c:
            return r0
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public java.lang.String insnArgString(com.android.dx.dex.code.DalvInsn r4) {
            r3 = this;
            com.android.dx.rop.code.RegisterSpecList r4 = r4.getRegisters()
            int r0 = r4.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r0 + (-2)
            com.android.dx.rop.code.RegisterSpec r2 = r4.get(r2)
            java.lang.String r2 = r2.regString()
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            int r0 = r0 + (-1)
            com.android.dx.rop.code.RegisterSpec r4 = r4.get(r0)
            java.lang.String r4 = r4.regString()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public java.lang.String insnCommentString(com.android.dx.dex.code.DalvInsn r1, boolean r2) {
            r0 = this;
            java.lang.String r1 = ""
            return r1
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public boolean isCompatible(com.android.dx.dex.code.DalvInsn r6) {
            r5 = this;
            boolean r0 = r6 instanceof com.android.dx.dex.code.SimpleInsn
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.android.dx.rop.code.RegisterSpecList r6 = r6.getRegisters()
            int r0 = r6.size()
            r2 = 2
            r3 = 1
            if (r0 == r2) goto L2d
            r4 = 3
            if (r0 == r4) goto L16
            return r1
        L16:
            com.android.dx.rop.code.RegisterSpec r0 = r6.get(r3)
            com.android.dx.rop.code.RegisterSpec r2 = r6.get(r2)
            int r4 = r0.getReg()
            com.android.dx.rop.code.RegisterSpec r6 = r6.get(r1)
            int r6 = r6.getReg()
            if (r4 == r6) goto L35
            return r1
        L2d:
            com.android.dx.rop.code.RegisterSpec r0 = r6.get(r1)
            com.android.dx.rop.code.RegisterSpec r2 = r6.get(r3)
        L35:
            int r6 = r0.getReg()
            boolean r6 = com.android.dx.dex.code.InsnFormat.unsignedFitsInNibble(r6)
            if (r6 == 0) goto L4a
            int r6 = r2.getReg()
            boolean r6 = com.android.dx.dex.code.InsnFormat.unsignedFitsInNibble(r6)
            if (r6 == 0) goto L4a
            r1 = r3
        L4a:
            return r1
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public void writeTo(com.android.dx.util.AnnotatedOutput r4, com.android.dx.dex.code.DalvInsn r5) {
            r3 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r5.getRegisters()
            int r1 = r0.size()
            int r2 = r1 + (-2)
            com.android.dx.rop.code.RegisterSpec r2 = r0.get(r2)
            int r2 = r2.getReg()
            int r1 = r1 + (-1)
            com.android.dx.rop.code.RegisterSpec r0 = r0.get(r1)
            int r0 = r0.getReg()
            int r0 = com.android.dx.dex.code.InsnFormat.makeByte(r2, r0)
            short r5 = com.android.dx.dex.code.InsnFormat.opcodeUnit(r5, r0)
            com.android.dx.dex.code.InsnFormat.write(r4, r5)
            return
    }
}
