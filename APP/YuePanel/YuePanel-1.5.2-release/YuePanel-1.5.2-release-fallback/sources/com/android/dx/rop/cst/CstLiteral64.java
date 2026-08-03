package com.android.dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public abstract class CstLiteral64 extends com.android.dx.rop.cst.CstLiteralBits {
    private final long bits;

    public CstLiteral64(long r1) {
            r0 = this;
            r0.<init>()
            r0.bits = r1
            return
    }

    @Override // com.android.dx.rop.cst.Constant
    public int compareTo0(com.android.dx.rop.cst.Constant r5) {
            r4 = this;
            com.android.dx.rop.cst.CstLiteral64 r5 = (com.android.dx.rop.cst.CstLiteral64) r5
            long r0 = r5.bits
            long r2 = r4.bits
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 >= 0) goto Lc
            r5 = -1
            return r5
        Lc:
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 <= 0) goto L12
            r5 = 1
            return r5
        L12:
            r5 = 0
            return r5
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r5 == 0) goto L18
            java.lang.Class r0 = r4.getClass()
            java.lang.Class r1 = r5.getClass()
            if (r0 != r1) goto L18
            long r0 = r4.bits
            com.android.dx.rop.cst.CstLiteral64 r5 = (com.android.dx.rop.cst.CstLiteral64) r5
            long r2 = r5.bits
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L18
            r5 = 1
            goto L19
        L18:
            r5 = 0
        L19:
            return r5
    }

    @Override // com.android.dx.rop.cst.CstLiteralBits
    public final boolean fitsInInt() {
            r4 = this;
            long r0 = r4.bits
            int r2 = (int) r0
            long r2 = (long) r2
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // com.android.dx.rop.cst.CstLiteralBits
    public final int getIntBits() {
            r2 = this;
            long r0 = r2.bits
            int r0 = (int) r0
            return r0
    }

    @Override // com.android.dx.rop.cst.CstLiteralBits
    public final long getLongBits() {
            r2 = this;
            long r0 = r2.bits
            return r0
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.bits
            int r2 = (int) r0
            r3 = 32
            long r0 = r0 >> r3
            int r0 = (int) r0
            r0 = r0 ^ r2
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public final boolean isCategory2() {
            r1 = this;
            r0 = 1
            return r0
    }
}
