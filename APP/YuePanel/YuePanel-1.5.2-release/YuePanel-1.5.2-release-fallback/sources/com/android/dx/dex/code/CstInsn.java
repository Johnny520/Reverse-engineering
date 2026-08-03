package com.android.dx.dex.code;

/* JADX INFO: loaded from: classes.dex */
public final class CstInsn extends com.android.dx.dex.code.FixedSizeInsn {
    private int classIndex;
    private final com.android.dx.rop.cst.Constant constant;
    private int index;

    public CstInsn(com.android.dx.dex.code.Dop r1, com.android.dx.rop.code.SourcePosition r2, com.android.dx.rop.code.RegisterSpecList r3, com.android.dx.rop.cst.Constant r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            if (r4 == 0) goto Ld
            r0.constant = r4
            r1 = -1
            r0.index = r1
            r0.classIndex = r1
            return
        Ld:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "constant == null"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public java.lang.String argString() {
            r1 = this;
            com.android.dx.rop.cst.Constant r0 = r1.constant
            java.lang.String r0 = r0.toHuman()
            return r0
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public java.lang.String cstComment() {
            r3 = this;
            boolean r0 = r3.hasIndex()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            return r0
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 20
            r0.<init>(r1)
            com.android.dx.rop.cst.Constant r1 = r3.getConstant()
            java.lang.String r1 = r1.typeName()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            int r1 = r3.index
            r2 = 65536(0x10000, float:9.1835E-41)
            if (r1 >= r2) goto L2e
            java.lang.String r1 = com.android.dx.util.Hex.u2(r1)
            r0.append(r1)
            goto L35
        L2e:
            java.lang.String r1 = com.android.dx.util.Hex.u4(r1)
            r0.append(r1)
        L35:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public java.lang.String cstString() {
            r2 = this;
            com.android.dx.rop.cst.Constant r0 = r2.constant
            boolean r1 = r0 instanceof com.android.dx.rop.cst.CstString
            if (r1 == 0) goto Ld
            com.android.dx.rop.cst.CstString r0 = (com.android.dx.rop.cst.CstString) r0
            java.lang.String r0 = r0.toQuoted()
            return r0
        Ld:
            java.lang.String r0 = r0.toHuman()
            return r0
    }

    public int getClassIndex() {
            r2 = this;
            int r0 = r2.classIndex
            if (r0 < 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "class index not yet set"
            r0.<init>(r1)
            throw r0
    }

    public com.android.dx.rop.cst.Constant getConstant() {
            r1 = this;
            com.android.dx.rop.cst.Constant r0 = r1.constant
            return r0
    }

    public int getIndex() {
            r3 = this;
            int r0 = r3.index
            if (r0 < 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "index not yet set for "
            r1.append(r2)
            com.android.dx.rop.cst.Constant r2 = r3.constant
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public boolean hasClassIndex() {
            r1 = this;
            int r0 = r1.classIndex
            if (r0 < 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean hasIndex() {
            r1 = this;
            int r0 = r1.index
            if (r0 < 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public void setClassIndex(int r2) {
            r1 = this;
            if (r2 < 0) goto L11
            int r0 = r1.classIndex
            if (r0 >= 0) goto L9
            r1.classIndex = r2
            return
        L9:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "class index already set"
            r2.<init>(r0)
            throw r2
        L11:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "index < 0"
            r2.<init>(r0)
            throw r2
    }

    public void setIndex(int r2) {
            r1 = this;
            if (r2 < 0) goto L11
            int r0 = r1.index
            if (r0 >= 0) goto L9
            r1.index = r2
            return
        L9:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "index already set"
            r2.<init>(r0)
            throw r2
        L11:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "index < 0"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public com.android.dx.dex.code.DalvInsn withOpcode(com.android.dx.dex.code.Dop r5) {
            r4 = this;
            com.android.dx.dex.code.CstInsn r0 = new com.android.dx.dex.code.CstInsn
            com.android.dx.rop.code.SourcePosition r1 = r4.getPosition()
            com.android.dx.rop.code.RegisterSpecList r2 = r4.getRegisters()
            com.android.dx.rop.cst.Constant r3 = r4.constant
            r0.<init>(r5, r1, r2, r3)
            int r5 = r4.index
            if (r5 < 0) goto L16
            r0.setIndex(r5)
        L16:
            int r5 = r4.classIndex
            if (r5 < 0) goto L1d
            r0.setClassIndex(r5)
        L1d:
            return r0
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public com.android.dx.dex.code.DalvInsn withRegisters(com.android.dx.rop.code.RegisterSpecList r5) {
            r4 = this;
            com.android.dx.dex.code.CstInsn r0 = new com.android.dx.dex.code.CstInsn
            com.android.dx.dex.code.Dop r1 = r4.getOpcode()
            com.android.dx.rop.code.SourcePosition r2 = r4.getPosition()
            com.android.dx.rop.cst.Constant r3 = r4.constant
            r0.<init>(r1, r2, r5, r3)
            int r5 = r4.index
            if (r5 < 0) goto L16
            r0.setIndex(r5)
        L16:
            int r5 = r4.classIndex
            if (r5 < 0) goto L1d
            r0.setClassIndex(r5)
        L1d:
            return r0
    }
}
