package com.android.dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public final class CstChar extends com.android.dx.rop.cst.CstLiteral32 {
    public static final com.android.dx.rop.cst.CstChar VALUE_0 = null;

    static {
            r0 = 0
            com.android.dx.rop.cst.CstChar r0 = make(r0)
            com.android.dx.rop.cst.CstChar.VALUE_0 = r0
            return
    }

    private CstChar(char r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static com.android.dx.rop.cst.CstChar make(char r1) {
            com.android.dx.rop.cst.CstChar r0 = new com.android.dx.rop.cst.CstChar
            r0.<init>(r1)
            return r0
    }

    public static com.android.dx.rop.cst.CstChar make(int r3) {
            char r0 = (char) r3
            if (r0 != r3) goto L8
            com.android.dx.rop.cst.CstChar r3 = make(r0)
            return r3
        L8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "bogus char value: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public com.android.dx.rop.type.Type getType() {
            r1 = this;
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.CHAR
            return r0
    }

    public char getValue() {
            r1 = this;
            int r0 = r1.getIntBits()
            char r0 = (char) r0
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
            java.lang.String r2 = "char{0x"
            r1.append(r2)
            java.lang.String r2 = com.android.dx.util.Hex.u2(r0)
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
            java.lang.String r0 = "char"
            return r0
    }
}
