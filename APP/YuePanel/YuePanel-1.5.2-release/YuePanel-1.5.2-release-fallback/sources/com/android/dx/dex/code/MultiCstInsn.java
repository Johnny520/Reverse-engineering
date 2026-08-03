package com.android.dx.dex.code;

/* JADX INFO: loaded from: classes.dex */
public final class MultiCstInsn extends com.android.dx.dex.code.FixedSizeInsn {
    private static final int NOT_SET = -1;
    private int classIndex;
    private final com.android.dx.rop.cst.Constant[] constants;
    private final int[] index;

    public MultiCstInsn(com.android.dx.dex.code.Dop r2, com.android.dx.rop.code.SourcePosition r3, com.android.dx.rop.code.RegisterSpecList r4, com.android.dx.rop.cst.Constant[] r5) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            if (r5 == 0) goto L27
            r1.constants = r5
            int r2 = r5.length
            int[] r2 = new int[r2]
            r1.index = r2
            r2 = 0
        Ld:
            int[] r3 = r1.index
            int r4 = r3.length
            r0 = -1
            if (r2 >= r4) goto L24
            r4 = r5[r2]
            if (r4 == 0) goto L1c
            r3[r2] = r0
            int r2 = r2 + 1
            goto Ld
        L1c:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "constants[i] == null"
            r2.<init>(r3)
            throw r2
        L24:
            r1.classIndex = r0
            return
        L27:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "constants == null"
            r2.<init>(r3)
            throw r2
    }

    private MultiCstInsn(com.android.dx.dex.code.Dop r1, com.android.dx.rop.code.SourcePosition r2, com.android.dx.rop.code.RegisterSpecList r3, com.android.dx.rop.cst.Constant[] r4, int[] r5, int r6) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.constants = r4
            r0.index = r5
            r0.classIndex = r6
            return
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public java.lang.String argString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            com.android.dx.rop.cst.Constant[] r2 = r3.constants
            int r2 = r2.length
            if (r1 >= r2) goto L24
            int r2 = r0.length()
            if (r2 <= 0) goto L16
            java.lang.String r2 = ", "
            r0.append(r2)
        L16:
            com.android.dx.rop.cst.Constant[] r2 = r3.constants
            r2 = r2[r1]
            java.lang.String r2 = r2.toHuman()
            r0.append(r2)
            int r1 = r1 + 1
            goto L6
        L24:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public java.lang.String cstComment() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            com.android.dx.rop.cst.Constant[] r2 = r4.constants
            int r2 = r2.length
            if (r1 >= r2) goto L45
            boolean r2 = r4.hasIndex(r1)
            if (r2 != 0) goto L14
            java.lang.String r0 = ""
            return r0
        L14:
            if (r1 <= 0) goto L1b
            java.lang.String r2 = ", "
            r0.append(r2)
        L1b:
            com.android.dx.rop.cst.Constant r2 = r4.getConstant(r1)
            java.lang.String r2 = r2.typeName()
            r0.append(r2)
            r2 = 64
            r0.append(r2)
            int r2 = r4.getIndex(r1)
            r3 = 65536(0x10000, float:9.1835E-41)
            if (r2 >= r3) goto L3b
            java.lang.String r2 = com.android.dx.util.Hex.u2(r2)
            r0.append(r2)
            goto L42
        L3b:
            java.lang.String r2 = com.android.dx.util.Hex.u4(r2)
            r0.append(r2)
        L42:
            int r1 = r1 + 1
            goto L6
        L45:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public java.lang.String cstString() {
            r1 = this;
            java.lang.String r0 = r1.argString()
            return r0
    }

    public int getClassIndex() {
            r2 = this;
            boolean r0 = r2.hasClassIndex()
            if (r0 == 0) goto L9
            int r0 = r2.classIndex
            return r0
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "class index not yet set"
            r0.<init>(r1)
            throw r0
    }

    public com.android.dx.rop.cst.Constant getConstant(int r2) {
            r1 = this;
            com.android.dx.rop.cst.Constant[] r0 = r1.constants
            r2 = r0[r2]
            return r2
    }

    public int getIndex(int r4) {
            r3 = this;
            boolean r0 = r3.hasIndex(r4)
            if (r0 == 0) goto Lb
            int[] r0 = r3.index
            r4 = r0[r4]
            return r4
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "index not yet set for constant "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " value = "
            r1.append(r2)
            com.android.dx.rop.cst.Constant[] r2 = r3.constants
            r4 = r2[r4]
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public int getNumberOfConstants() {
            r1 = this;
            com.android.dx.rop.cst.Constant[] r0 = r1.constants
            int r0 = r0.length
            return r0
    }

    public boolean hasClassIndex() {
            r2 = this;
            int r0 = r2.classIndex
            r1 = -1
            if (r0 == r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public boolean hasIndex(int r2) {
            r1 = this;
            int[] r0 = r1.index
            r2 = r0[r2]
            r0 = -1
            if (r2 == r0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            return r2
    }

    public void setClassIndex(int r2) {
            r1 = this;
            if (r2 < 0) goto L13
            boolean r0 = r1.hasClassIndex()
            if (r0 != 0) goto Lb
            r1.classIndex = r2
            return
        Lb:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "class index already set"
            r2.<init>(r0)
            throw r2
        L13:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "index < 0"
            r2.<init>(r0)
            throw r2
    }

    public void setIndex(int r2, int r3) {
            r1 = this;
            if (r3 < 0) goto L15
            boolean r0 = r1.hasIndex(r2)
            if (r0 != 0) goto Ld
            int[] r0 = r1.index
            r0[r2] = r3
            return
        Ld:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "index already set"
            r2.<init>(r3)
            throw r2
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "index < 0"
            r2.<init>(r3)
            throw r2
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public com.android.dx.dex.code.DalvInsn withOpcode(com.android.dx.dex.code.Dop r9) {
            r8 = this;
            com.android.dx.dex.code.MultiCstInsn r7 = new com.android.dx.dex.code.MultiCstInsn
            com.android.dx.rop.code.SourcePosition r2 = r8.getPosition()
            com.android.dx.rop.code.RegisterSpecList r3 = r8.getRegisters()
            com.android.dx.rop.cst.Constant[] r4 = r8.constants
            int[] r5 = r8.index
            int r6 = r8.classIndex
            r0 = r7
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public com.android.dx.dex.code.DalvInsn withRegisters(com.android.dx.rop.code.RegisterSpecList r9) {
            r8 = this;
            com.android.dx.dex.code.MultiCstInsn r7 = new com.android.dx.dex.code.MultiCstInsn
            com.android.dx.dex.code.Dop r1 = r8.getOpcode()
            com.android.dx.rop.code.SourcePosition r2 = r8.getPosition()
            com.android.dx.rop.cst.Constant[] r4 = r8.constants
            int[] r5 = r8.index
            int r6 = r8.classIndex
            r0 = r7
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }
}
