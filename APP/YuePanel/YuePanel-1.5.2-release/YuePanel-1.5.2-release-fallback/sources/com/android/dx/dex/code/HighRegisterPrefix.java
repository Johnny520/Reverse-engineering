package com.android.dx.dex.code;

/* JADX INFO: loaded from: classes.dex */
public final class HighRegisterPrefix extends com.android.dx.dex.code.VariableSizeInsn {
    private com.android.dx.dex.code.SimpleInsn[] insns;

    public HighRegisterPrefix(com.android.dx.rop.code.SourcePosition r1, com.android.dx.rop.code.RegisterSpecList r2) {
            r0 = this;
            r0.<init>(r1, r2)
            int r1 = r2.size()
            if (r1 == 0) goto Ld
            r1 = 0
            r0.insns = r1
            return
        Ld:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "registers.size() == 0"
            r1.<init>(r2)
            throw r1
    }

    private void calculateInsnsIfNecessary() {
            r7 = this;
            com.android.dx.dex.code.SimpleInsn[] r0 = r7.insns
            if (r0 == 0) goto L5
            return
        L5:
            com.android.dx.rop.code.RegisterSpecList r0 = r7.getRegisters()
            int r1 = r0.size()
            com.android.dx.dex.code.SimpleInsn[] r2 = new com.android.dx.dex.code.SimpleInsn[r1]
            r7.insns = r2
            r2 = 0
            r3 = r2
        L13:
            if (r2 >= r1) goto L29
            com.android.dx.rop.code.RegisterSpec r4 = r0.get(r2)
            com.android.dx.dex.code.SimpleInsn[] r5 = r7.insns
            com.android.dx.dex.code.SimpleInsn r6 = moveInsnFor(r4, r3)
            r5[r2] = r6
            int r4 = r4.getCategory()
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L13
        L29:
            return
    }

    private static com.android.dx.dex.code.SimpleInsn moveInsnFor(com.android.dx.rop.code.RegisterSpec r2, int r3) {
            com.android.dx.rop.code.SourcePosition r0 = com.android.dx.rop.code.SourcePosition.NO_INFO
            com.android.dx.rop.type.Type r1 = r2.getType()
            com.android.dx.rop.code.RegisterSpec r3 = com.android.dx.rop.code.RegisterSpec.make(r3, r1)
            com.android.dx.dex.code.SimpleInsn r2 = com.android.dx.dex.code.DalvInsn.makeMove(r0, r3, r2)
            return r2
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public java.lang.String argString() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public int codeSize() {
            r5 = this;
            r5.calculateInsnsIfNecessary()
            com.android.dx.dex.code.SimpleInsn[] r0 = r5.insns
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L8:
            if (r2 >= r1) goto L14
            r4 = r0[r2]
            int r4 = r4.codeSize()
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L8
        L14:
            return r3
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public java.lang.String listingString0(boolean r9) {
            r8 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = r8.getRegisters()
            int r1 = r0.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 100
            r2.<init>(r3)
            r3 = 0
            r4 = r3
        L11:
            if (r3 >= r1) goto L31
            com.android.dx.rop.code.RegisterSpec r5 = r0.get(r3)
            com.android.dx.dex.code.SimpleInsn r6 = moveInsnFor(r5, r4)
            if (r3 == 0) goto L22
            r7 = 10
            r2.append(r7)
        L22:
            java.lang.String r6 = r6.listingString0(r9)
            r2.append(r6)
            int r5 = r5.getCategory()
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L11
        L31:
            java.lang.String r9 = r2.toString()
            return r9
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public com.android.dx.dex.code.DalvInsn withRegisters(com.android.dx.rop.code.RegisterSpecList r3) {
            r2 = this;
            com.android.dx.dex.code.HighRegisterPrefix r0 = new com.android.dx.dex.code.HighRegisterPrefix
            com.android.dx.rop.code.SourcePosition r1 = r2.getPosition()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public void writeTo(com.android.dx.util.AnnotatedOutput r5) {
            r4 = this;
            r4.calculateInsnsIfNecessary()
            com.android.dx.dex.code.SimpleInsn[] r0 = r4.insns
            int r1 = r0.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L11
            r3 = r0[r2]
            r3.writeTo(r5)
            int r2 = r2 + 1
            goto L7
        L11:
            return
    }
}
