package com.android.dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public final class CstKnownNull extends com.android.dx.rop.cst.CstLiteralBits {
    public static final com.android.dx.rop.cst.CstKnownNull THE_ONE = null;

    static {
            com.android.dx.rop.cst.CstKnownNull r0 = new com.android.dx.rop.cst.CstKnownNull
            r0.<init>()
            com.android.dx.rop.cst.CstKnownNull.THE_ONE = r0
            return
    }

    private CstKnownNull() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.android.dx.rop.cst.Constant
    public int compareTo0(com.android.dx.rop.cst.Constant r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = r1 instanceof com.android.dx.rop.cst.CstKnownNull
            return r1
    }

    @Override // com.android.dx.rop.cst.CstLiteralBits
    public boolean fitsInInt() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.android.dx.rop.cst.CstLiteralBits
    public int getIntBits() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.android.dx.rop.cst.CstLiteralBits
    public long getLongBits() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public com.android.dx.rop.type.Type getType() {
            r1 = this;
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.KNOWN_NULL
            return r0
    }

    public int hashCode() {
            r1 = this;
            r0 = 1147565434(0x4466757a, float:921.8356)
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public boolean isCategory2() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.android.dx.util.ToHuman
    public java.lang.String toHuman() {
            r1 = this;
            java.lang.String r0 = "null"
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "known-null"
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public java.lang.String typeName() {
            r1 = this;
            java.lang.String r0 = "known-null"
            return r0
    }
}
