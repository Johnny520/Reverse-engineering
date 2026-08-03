package com.android.dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public final class CstLong extends com.android.dx.rop.cst.CstLiteral64 {
    public static final com.android.dx.rop.cst.CstLong VALUE_0 = null;
    public static final com.android.dx.rop.cst.CstLong VALUE_1 = null;

    static {
            r0 = 0
            com.android.dx.rop.cst.CstLong r0 = make(r0)
            com.android.dx.rop.cst.CstLong.VALUE_0 = r0
            r0 = 1
            com.android.dx.rop.cst.CstLong r0 = make(r0)
            com.android.dx.rop.cst.CstLong.VALUE_1 = r0
            return
    }

    private CstLong(long r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static com.android.dx.rop.cst.CstLong make(long r1) {
            com.android.dx.rop.cst.CstLong r0 = new com.android.dx.rop.cst.CstLong
            r0.<init>(r1)
            return r0
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public com.android.dx.rop.type.Type getType() {
            r1 = this;
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.LONG
            return r0
    }

    public long getValue() {
            r2 = this;
            long r0 = r2.getLongBits()
            return r0
    }

    @Override // com.android.dx.util.ToHuman
    public java.lang.String toHuman() {
            r2 = this;
            long r0 = r2.getLongBits()
            java.lang.String r0 = java.lang.Long.toString(r0)
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            long r0 = r4.getLongBits()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "long{0x"
            r2.append(r3)
            java.lang.String r3 = com.android.dx.util.Hex.u8(r0)
            r2.append(r3)
            java.lang.String r3 = " / "
            r2.append(r3)
            r2.append(r0)
            r0 = 125(0x7d, float:1.75E-43)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public java.lang.String typeName() {
            r1 = this;
            java.lang.String r0 = "long"
            return r0
    }
}
