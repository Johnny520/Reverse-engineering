package com.android.dx.rop.cst;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class CstLiteral64 extends CstLiteralBits {
    private final long bits;

    public CstLiteral64(long j) {
        this.bits = j;
    }

    @Override // com.android.dx.rop.cst.Constant
    public int compareTo0(Constant constant) {
        long j = ((CstLiteral64) constant).bits;
        long j2 = this.bits;
        if (j2 < j) {
            return -1;
        }
        return j2 > j ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        return obj != null && getClass() == obj.getClass() && this.bits == ((CstLiteral64) obj).bits;
    }

    @Override // com.android.dx.rop.cst.CstLiteralBits
    public final boolean fitsInInt() {
        long j = this.bits;
        return ((long) ((int) j)) == j;
    }

    @Override // com.android.dx.rop.cst.CstLiteralBits
    public final int getIntBits() {
        return (int) this.bits;
    }

    @Override // com.android.dx.rop.cst.CstLiteralBits
    public final long getLongBits() {
        return this.bits;
    }

    public final int hashCode() {
        long j = this.bits;
        return ((int) j) ^ ((int) (j >> 32));
    }

    @Override // com.android.dx.rop.cst.Constant
    public final boolean isCategory2() {
        return true;
    }
}
