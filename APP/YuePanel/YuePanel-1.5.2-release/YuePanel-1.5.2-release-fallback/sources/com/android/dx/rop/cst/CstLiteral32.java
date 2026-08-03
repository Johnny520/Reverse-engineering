package com.android.dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public abstract class CstLiteral32 extends com.android.dx.rop.cst.CstLiteralBits {
    private final int bits;

    public CstLiteral32(int r1) {
            r0 = this;
            r0.<init>()
            r0.bits = r1
            return
    }

    @Override // com.android.dx.rop.cst.Constant
    public int compareTo0(com.android.dx.rop.cst.Constant r2) {
            r1 = this;
            com.android.dx.rop.cst.CstLiteral32 r2 = (com.android.dx.rop.cst.CstLiteral32) r2
            int r2 = r2.bits
            int r0 = r1.bits
            if (r0 >= r2) goto La
            r2 = -1
            return r2
        La:
            if (r0 <= r2) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 == 0) goto L16
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            if (r0 != r1) goto L16
            int r0 = r2.bits
            com.android.dx.rop.cst.CstLiteral32 r3 = (com.android.dx.rop.cst.CstLiteral32) r3
            int r3 = r3.bits
            if (r0 != r3) goto L16
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            return r3
    }

    @Override // com.android.dx.rop.cst.CstLiteralBits
    public final boolean fitsInInt() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.android.dx.rop.cst.CstLiteralBits
    public final int getIntBits() {
            r1 = this;
            int r0 = r1.bits
            return r0
    }

    @Override // com.android.dx.rop.cst.CstLiteralBits
    public final long getLongBits() {
            r2 = this;
            int r0 = r2.bits
            long r0 = (long) r0
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.bits
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public final boolean isCategory2() {
            r1 = this;
            r0 = 0
            return r0
    }
}
