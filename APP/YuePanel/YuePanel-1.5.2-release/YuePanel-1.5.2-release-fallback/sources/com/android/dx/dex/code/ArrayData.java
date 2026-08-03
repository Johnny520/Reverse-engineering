package com.android.dx.dex.code;

/* JADX INFO: loaded from: classes.dex */
public final class ArrayData extends com.android.dx.dex.code.VariableSizeInsn {
    private final com.android.dx.rop.cst.Constant arrayType;
    private final int elemWidth;
    private final int initLength;
    private final com.android.dx.dex.code.CodeAddress user;
    private final java.util.ArrayList<com.android.dx.rop.cst.Constant> values;

    public ArrayData(com.android.dx.rop.code.SourcePosition r2, com.android.dx.dex.code.CodeAddress r3, java.util.ArrayList<com.android.dx.rop.cst.Constant> r4, com.android.dx.rop.cst.Constant r5) {
            r1 = this;
            com.android.dx.rop.code.RegisterSpecList r0 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            r1.<init>(r2, r0)
            if (r3 == 0) goto L68
            if (r4 == 0) goto L60
            int r2 = r4.size()
            if (r2 <= 0) goto L58
            r1.arrayType = r5
            com.android.dx.rop.cst.CstType r2 = com.android.dx.rop.cst.CstType.BYTE_ARRAY
            if (r5 == r2) goto L4a
            com.android.dx.rop.cst.CstType r2 = com.android.dx.rop.cst.CstType.BOOLEAN_ARRAY
            if (r5 != r2) goto L1a
            goto L4a
        L1a:
            com.android.dx.rop.cst.CstType r2 = com.android.dx.rop.cst.CstType.SHORT_ARRAY
            if (r5 == r2) goto L46
            com.android.dx.rop.cst.CstType r2 = com.android.dx.rop.cst.CstType.CHAR_ARRAY
            if (r5 != r2) goto L23
            goto L46
        L23:
            com.android.dx.rop.cst.CstType r2 = com.android.dx.rop.cst.CstType.INT_ARRAY
            if (r5 == r2) goto L42
            com.android.dx.rop.cst.CstType r2 = com.android.dx.rop.cst.CstType.FLOAT_ARRAY
            if (r5 != r2) goto L2c
            goto L42
        L2c:
            com.android.dx.rop.cst.CstType r2 = com.android.dx.rop.cst.CstType.LONG_ARRAY
            if (r5 == r2) goto L3d
            com.android.dx.rop.cst.CstType r2 = com.android.dx.rop.cst.CstType.DOUBLE_ARRAY
            if (r5 != r2) goto L35
            goto L3d
        L35:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Unexpected constant type"
            r2.<init>(r3)
            throw r2
        L3d:
            r2 = 8
            r1.elemWidth = r2
            goto L4d
        L42:
            r2 = 4
            r1.elemWidth = r2
            goto L4d
        L46:
            r2 = 2
            r1.elemWidth = r2
            goto L4d
        L4a:
            r2 = 1
            r1.elemWidth = r2
        L4d:
            r1.user = r3
            r1.values = r4
            int r2 = r4.size()
            r1.initLength = r2
            return
        L58:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Illegal number of init values"
            r2.<init>(r3)
            throw r2
        L60:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "values == null"
            r2.<init>(r3)
            throw r2
        L68:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "user == null"
            r2.<init>(r3)
            throw r2
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public java.lang.String argString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            java.util.ArrayList<com.android.dx.rop.cst.Constant> r1 = r4.values
            int r1 = r1.size()
            r2 = 0
        Le:
            if (r2 >= r1) goto L2f
            java.lang.String r3 = "\n    "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = ": "
            r0.append(r3)
            java.util.ArrayList<com.android.dx.rop.cst.Constant> r3 = r4.values
            java.lang.Object r3 = r3.get(r2)
            com.android.dx.rop.cst.Constant r3 = (com.android.dx.rop.cst.Constant) r3
            java.lang.String r3 = r3.toHuman()
            r0.append(r3)
            int r2 = r2 + 1
            goto Le
        L2f:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public int codeSize() {
            r2 = this;
            int r0 = r2.initLength
            int r1 = r2.elemWidth
            int r0 = r0 * r1
            int r0 = r0 + 1
            int r0 = r0 / 2
            int r0 = r0 + 4
            return r0
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public java.lang.String listingString0(boolean r4) {
            r3 = this;
            com.android.dx.dex.code.CodeAddress r4 = r3.user
            int r4 = r4.getAddress()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            java.util.ArrayList<com.android.dx.rop.cst.Constant> r1 = r3.values
            int r1 = r1.size()
            java.lang.String r2 = "fill-array-data-payload // for fill-array-data @ "
            r0.append(r2)
            java.lang.String r4 = com.android.dx.util.Hex.u2(r4)
            r0.append(r4)
            r4 = 0
        L20:
            if (r4 >= r1) goto L41
            java.lang.String r2 = "\n  "
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = ": "
            r0.append(r2)
            java.util.ArrayList<com.android.dx.rop.cst.Constant> r2 = r3.values
            java.lang.Object r2 = r2.get(r4)
            com.android.dx.rop.cst.Constant r2 = (com.android.dx.rop.cst.Constant) r2
            java.lang.String r2 = r2.toHuman()
            r0.append(r2)
            int r4 = r4 + 1
            goto L20
        L41:
            java.lang.String r4 = r0.toString()
            return r4
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public com.android.dx.dex.code.DalvInsn withRegisters(com.android.dx.rop.code.RegisterSpecList r5) {
            r4 = this;
            com.android.dx.dex.code.ArrayData r5 = new com.android.dx.dex.code.ArrayData
            com.android.dx.rop.code.SourcePosition r0 = r4.getPosition()
            com.android.dx.dex.code.CodeAddress r1 = r4.user
            java.util.ArrayList<com.android.dx.rop.cst.Constant> r2 = r4.values
            com.android.dx.rop.cst.Constant r3 = r4.arrayType
            r5.<init>(r0, r1, r2, r3)
            return r5
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public void writeTo(com.android.dx.util.AnnotatedOutput r8) {
            r7 = this;
            java.util.ArrayList<com.android.dx.rop.cst.Constant> r0 = r7.values
            int r0 = r0.size()
            r1 = 768(0x300, float:1.076E-42)
            r8.writeShort(r1)
            int r1 = r7.elemWidth
            r8.writeShort(r1)
            int r1 = r7.initLength
            r8.writeInt(r1)
            int r1 = r7.elemWidth
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == r4) goto L6c
            if (r1 == r2) goto L54
            r5 = 4
            if (r1 == r5) goto L3d
            r5 = 8
            if (r1 == r5) goto L26
            goto L84
        L26:
            r1 = r3
        L27:
            if (r1 >= r0) goto L84
            java.util.ArrayList<com.android.dx.rop.cst.Constant> r5 = r7.values
            java.lang.Object r5 = r5.get(r1)
            com.android.dx.rop.cst.Constant r5 = (com.android.dx.rop.cst.Constant) r5
            com.android.dx.rop.cst.CstLiteral64 r5 = (com.android.dx.rop.cst.CstLiteral64) r5
            long r5 = r5.getLongBits()
            r8.writeLong(r5)
            int r1 = r1 + 1
            goto L27
        L3d:
            r1 = r3
        L3e:
            if (r1 >= r0) goto L84
            java.util.ArrayList<com.android.dx.rop.cst.Constant> r5 = r7.values
            java.lang.Object r5 = r5.get(r1)
            com.android.dx.rop.cst.Constant r5 = (com.android.dx.rop.cst.Constant) r5
            com.android.dx.rop.cst.CstLiteral32 r5 = (com.android.dx.rop.cst.CstLiteral32) r5
            int r5 = r5.getIntBits()
            r8.writeInt(r5)
            int r1 = r1 + 1
            goto L3e
        L54:
            r1 = r3
        L55:
            if (r1 >= r0) goto L84
            java.util.ArrayList<com.android.dx.rop.cst.Constant> r5 = r7.values
            java.lang.Object r5 = r5.get(r1)
            com.android.dx.rop.cst.Constant r5 = (com.android.dx.rop.cst.Constant) r5
            com.android.dx.rop.cst.CstLiteral32 r5 = (com.android.dx.rop.cst.CstLiteral32) r5
            int r5 = r5.getIntBits()
            short r5 = (short) r5
            r8.writeShort(r5)
            int r1 = r1 + 1
            goto L55
        L6c:
            r1 = r3
        L6d:
            if (r1 >= r0) goto L84
            java.util.ArrayList<com.android.dx.rop.cst.Constant> r5 = r7.values
            java.lang.Object r5 = r5.get(r1)
            com.android.dx.rop.cst.Constant r5 = (com.android.dx.rop.cst.Constant) r5
            com.android.dx.rop.cst.CstLiteral32 r5 = (com.android.dx.rop.cst.CstLiteral32) r5
            int r5 = r5.getIntBits()
            byte r5 = (byte) r5
            r8.writeByte(r5)
            int r1 = r1 + 1
            goto L6d
        L84:
            int r1 = r7.elemWidth
            if (r1 != r4) goto L8e
            int r0 = r0 % r2
            if (r0 == 0) goto L8e
            r8.writeByte(r3)
        L8e:
            return
    }
}
