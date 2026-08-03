package com.android.dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public final class CstInteger extends com.android.dx.rop.cst.CstLiteral32 {
    public static final com.android.dx.rop.cst.CstInteger VALUE_0 = null;
    public static final com.android.dx.rop.cst.CstInteger VALUE_1 = null;
    public static final com.android.dx.rop.cst.CstInteger VALUE_2 = null;
    public static final com.android.dx.rop.cst.CstInteger VALUE_3 = null;
    public static final com.android.dx.rop.cst.CstInteger VALUE_4 = null;
    public static final com.android.dx.rop.cst.CstInteger VALUE_5 = null;
    public static final com.android.dx.rop.cst.CstInteger VALUE_M1 = null;
    private static final com.android.dx.rop.cst.CstInteger[] cache = null;

    static {
            r0 = 511(0x1ff, float:7.16E-43)
            com.android.dx.rop.cst.CstInteger[] r0 = new com.android.dx.rop.cst.CstInteger[r0]
            com.android.dx.rop.cst.CstInteger.cache = r0
            r0 = -1
            com.android.dx.rop.cst.CstInteger r0 = make(r0)
            com.android.dx.rop.cst.CstInteger.VALUE_M1 = r0
            r0 = 0
            com.android.dx.rop.cst.CstInteger r0 = make(r0)
            com.android.dx.rop.cst.CstInteger.VALUE_0 = r0
            r0 = 1
            com.android.dx.rop.cst.CstInteger r0 = make(r0)
            com.android.dx.rop.cst.CstInteger.VALUE_1 = r0
            r0 = 2
            com.android.dx.rop.cst.CstInteger r0 = make(r0)
            com.android.dx.rop.cst.CstInteger.VALUE_2 = r0
            r0 = 3
            com.android.dx.rop.cst.CstInteger r0 = make(r0)
            com.android.dx.rop.cst.CstInteger.VALUE_3 = r0
            r0 = 4
            com.android.dx.rop.cst.CstInteger r0 = make(r0)
            com.android.dx.rop.cst.CstInteger.VALUE_4 = r0
            r0 = 5
            com.android.dx.rop.cst.CstInteger r0 = make(r0)
            com.android.dx.rop.cst.CstInteger.VALUE_5 = r0
            return
    }

    private CstInteger(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static com.android.dx.rop.cst.CstInteger make(int r4) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r4
            com.android.dx.rop.cst.CstInteger[] r1 = com.android.dx.rop.cst.CstInteger.cache
            int r2 = r1.length
            int r0 = r0 % r2
            r2 = r1[r0]
            if (r2 == 0) goto L13
            int r3 = r2.getValue()
            if (r3 != r4) goto L13
            return r2
        L13:
            com.android.dx.rop.cst.CstInteger r2 = new com.android.dx.rop.cst.CstInteger
            r2.<init>(r4)
            r1[r0] = r2
            return r2
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public com.android.dx.rop.type.Type getType() {
            r1 = this;
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.INT
            return r0
    }

    public int getValue() {
            r1 = this;
            int r0 = r1.getIntBits()
            return r0
    }

    @Override // com.android.dx.util.ToHuman
    public java.lang.String toHuman() {
            r1 = this;
            int r0 = r1.getIntBits()
            java.lang.String r0 = java.lang.Integer.toString(r0)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.getIntBits()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "int{0x"
            r1.append(r2)
            java.lang.String r2 = com.android.dx.util.Hex.u4(r0)
            r1.append(r2)
            java.lang.String r2 = " / "
            r1.append(r2)
            r1.append(r0)
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public java.lang.String typeName() {
            r1 = this;
            java.lang.String r0 = "int"
            return r0
    }
}
