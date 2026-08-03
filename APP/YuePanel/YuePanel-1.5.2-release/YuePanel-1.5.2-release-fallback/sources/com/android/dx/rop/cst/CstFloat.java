package com.android.dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public final class CstFloat extends com.android.dx.rop.cst.CstLiteral32 {
    public static final com.android.dx.rop.cst.CstFloat VALUE_0 = null;
    public static final com.android.dx.rop.cst.CstFloat VALUE_1 = null;
    public static final com.android.dx.rop.cst.CstFloat VALUE_2 = null;

    static {
            r0 = 0
            int r0 = java.lang.Float.floatToIntBits(r0)
            com.android.dx.rop.cst.CstFloat r0 = make(r0)
            com.android.dx.rop.cst.CstFloat.VALUE_0 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = java.lang.Float.floatToIntBits(r0)
            com.android.dx.rop.cst.CstFloat r0 = make(r0)
            com.android.dx.rop.cst.CstFloat.VALUE_1 = r0
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = java.lang.Float.floatToIntBits(r0)
            com.android.dx.rop.cst.CstFloat r0 = make(r0)
            com.android.dx.rop.cst.CstFloat.VALUE_2 = r0
            return
    }

    private CstFloat(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static com.android.dx.rop.cst.CstFloat make(int r1) {
            com.android.dx.rop.cst.CstFloat r0 = new com.android.dx.rop.cst.CstFloat
            r0.<init>(r1)
            return r0
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public com.android.dx.rop.type.Type getType() {
            r1 = this;
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.FLOAT
            return r0
    }

    public float getValue() {
            r1 = this;
            int r0 = r1.getIntBits()
            float r0 = java.lang.Float.intBitsToFloat(r0)
            return r0
    }

    @Override // com.android.dx.util.ToHuman
    public java.lang.String toHuman() {
            r1 = this;
            int r0 = r1.getIntBits()
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = java.lang.Float.toString(r0)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.getIntBits()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "float{0x"
            r1.append(r2)
            java.lang.String r2 = com.android.dx.util.Hex.u4(r0)
            r1.append(r2)
            java.lang.String r2 = " / "
            r1.append(r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r1.append(r0)
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public java.lang.String typeName() {
            r1 = this;
            java.lang.String r0 = "float"
            return r0
    }
}
