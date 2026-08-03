package com.android.dx.rop.code;

/* JADX INFO: loaded from: classes.dex */
public final class ThrowingInsn extends com.android.dx.rop.code.Insn {
    private final com.android.dx.rop.type.TypeList catches;

    public ThrowingInsn(com.android.dx.rop.code.Rop r2, com.android.dx.rop.code.SourcePosition r3, com.android.dx.rop.code.RegisterSpecList r4, com.android.dx.rop.type.TypeList r5) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r4)
            int r3 = r2.getBranchingness()
            r4 = 6
            if (r3 != r4) goto L18
            if (r5 == 0) goto L10
            r1.catches = r5
            return
        L10:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "catches == null"
            r2.<init>(r3)
            throw r2
        L18:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "opcode with invalid branchingness: "
            r4.append(r5)
            int r2 = r2.getBranchingness()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
    }

    public static java.lang.String toCatchString(com.android.dx.rop.type.TypeList r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            java.lang.String r1 = "catch"
            r0.append(r1)
            int r1 = r4.size()
            r2 = 0
        L11:
            if (r2 >= r1) goto L26
            java.lang.String r3 = " "
            r0.append(r3)
            com.android.dx.rop.type.Type r3 = r4.getType(r2)
            java.lang.String r3 = r3.toHuman()
            r0.append(r3)
            int r2 = r2 + 1
            goto L11
        L26:
            java.lang.String r4 = r0.toString()
            return r4
    }

    @Override // com.android.dx.rop.code.Insn
    public void accept(com.android.dx.rop.code.Insn.Visitor r1) {
            r0 = this;
            r1.visitThrowingInsn(r0)
            return
    }

    @Override // com.android.dx.rop.code.Insn
    public com.android.dx.rop.type.TypeList getCatches() {
            r1 = this;
            com.android.dx.rop.type.TypeList r0 = r1.catches
            return r0
    }

    @Override // com.android.dx.rop.code.Insn
    public java.lang.String getInlineString() {
            r1 = this;
            com.android.dx.rop.type.TypeList r0 = r1.catches
            java.lang.String r0 = toCatchString(r0)
            return r0
    }

    @Override // com.android.dx.rop.code.Insn
    public com.android.dx.rop.code.Insn withAddedCatch(com.android.dx.rop.type.Type r6) {
            r5 = this;
            com.android.dx.rop.code.ThrowingInsn r0 = new com.android.dx.rop.code.ThrowingInsn
            com.android.dx.rop.code.Rop r1 = r5.getOpcode()
            com.android.dx.rop.code.SourcePosition r2 = r5.getPosition()
            com.android.dx.rop.code.RegisterSpecList r3 = r5.getSources()
            com.android.dx.rop.type.TypeList r4 = r5.catches
            com.android.dx.rop.type.TypeList r6 = r4.withAddedType(r6)
            r0.<init>(r1, r2, r3, r6)
            return r0
    }

    @Override // com.android.dx.rop.code.Insn
    public com.android.dx.rop.code.Insn withNewRegisters(com.android.dx.rop.code.RegisterSpec r4, com.android.dx.rop.code.RegisterSpecList r5) {
            r3 = this;
            com.android.dx.rop.code.ThrowingInsn r4 = new com.android.dx.rop.code.ThrowingInsn
            com.android.dx.rop.code.Rop r0 = r3.getOpcode()
            com.android.dx.rop.code.SourcePosition r1 = r3.getPosition()
            com.android.dx.rop.type.TypeList r2 = r3.catches
            r4.<init>(r0, r1, r5, r2)
            return r4
    }

    @Override // com.android.dx.rop.code.Insn
    public com.android.dx.rop.code.Insn withRegisterOffset(int r5) {
            r4 = this;
            com.android.dx.rop.code.ThrowingInsn r0 = new com.android.dx.rop.code.ThrowingInsn
            com.android.dx.rop.code.Rop r1 = r4.getOpcode()
            com.android.dx.rop.code.SourcePosition r2 = r4.getPosition()
            com.android.dx.rop.code.RegisterSpecList r3 = r4.getSources()
            com.android.dx.rop.code.RegisterSpecList r5 = r3.withOffset(r5)
            com.android.dx.rop.type.TypeList r3 = r4.catches
            r0.<init>(r1, r2, r5, r3)
            return r0
    }
}
